package com.lvefunc.workcenter.ui.service.storage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import org.eclipse.e4.core.di.annotations.GroupUpdates;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

import com.lvefunc.workcenter.model.ModelFactory;
import com.lvefunc.workcenter.model.Product;
import com.lvefunc.workcenter.model.ProductStorage;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class ProductStorageService implements IStorageService<ProductStorage, Product> {
	@Inject
	private ProductStorage pStorage;
	private Table pStorageTable;

	@Inject
	@GroupUpdates
	public void update(@Optional @Named("pStorageTable") Table pStorageTable) {
		this.pStorageTable = pStorageTable;
	}
	
	@Override
	public int amount(Product item) {
		var optional = pStorage.getProductStorageEntries().stream()
				.filter(pStorageEntry -> pStorageEntry.getProduct().equals(item))
				.findFirst();
		return optional.isEmpty() ? 0 : optional.get().getAmount();
	}
	
	@Override
	public Collection<TableItem> add(Product item, int amount) {
		var optional = pStorage.getProductStorageEntries().stream()
				.filter(pStorageEntry -> pStorageEntry.getProduct().equals(item))
				.findFirst();
		var pStorageEntry = optional.isEmpty() ? ModelFactory.eINSTANCE.createProductStorageEntry() : optional.get();

		pStorageEntry.setProduct(item);
		pStorageEntry.setAmount(pStorageEntry.getAmount() + amount);
		
		if (optional.isEmpty())
			pStorage.getProductStorageEntries().add(pStorageEntry);

		return getAll();
	}

	@Override
	public Collection<TableItem> subtract(Product item, int amount) {
		var optional = pStorage.getProductStorageEntries().stream()
				.filter(pStorageEntry -> pStorageEntry.getProduct().equals(item))
				.findFirst();
		
		if (optional.isEmpty())
			throw new IllegalArgumentException();
		
		var pStorageEntry = optional.get();

		if (pStorageEntry.getAmount() < amount)
			throw new IllegalArgumentException();
		
		pStorageEntry.setProduct(item);
		pStorageEntry.setAmount(pStorageEntry.getAmount() - amount);

		return getAll();
	}
	
	@Override
	public Collection<TableItem> update(Product item, int amount) {
		var optional = pStorage.getProductStorageEntries().stream()
				.filter(pStorageEntry -> pStorageEntry.getProduct().equals(item))
				.findFirst();
		
		if (optional.isEmpty())
			throw new IllegalArgumentException();
		
		var pStorageEntry = optional.get();
		
		pStorageEntry.setProduct(item);
		pStorageEntry.setAmount(amount);

		return getAll();
	}

	@Override
	public Collection<TableItem> remove(Product item) {
		pStorage.getProductStorageEntries().removeIf(pStorageEntry -> pStorageEntry.getProduct().equals(item));
		
		return getAll();
	}

	@Override
	public Collection<TableItem> getAll() {
		if (Objects.isNull(this.pStorageTable))
			return new ArrayList<>();
		
		pStorageTable.removeAll();

		return pStorage.getProductStorageEntries().stream().map(pStorageEntry -> {
			TableItem item = new TableItem(pStorageTable, SWT.NONE);
			item.setText(new String[] { pStorageEntry.getProduct().getName(), String.valueOf(pStorageEntry.getAmount()) });

			return item;
		}).toList();
	}
}