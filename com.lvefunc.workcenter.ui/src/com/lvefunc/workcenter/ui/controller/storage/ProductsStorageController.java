package com.lvefunc.workcenter.ui.controller.storage;

import java.util.Collection;
import java.util.Optional;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

import com.lvefunc.workcenter.model.ModelFactory;
import com.lvefunc.workcenter.model.Product;
import com.lvefunc.workcenter.model.ProductStorage;
import com.lvefunc.workcenter.model.ProductStorageEntry;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class ProductsStorageController implements IStorageController<ProductStorage, Product> {
	@Inject()
	@Named("productStorage")
	private ProductStorage productStorage;

	@Override
	public Collection<TableItem> add(Product item, int amount, Table parent) {
		Optional<ProductStorageEntry> optional = productStorage.getProductStorageEntries().stream()
			.filter(pse -> pse.getProduct().equals(item))
			.findFirst();

		ProductStorageEntry pse = optional.isEmpty()
				? ModelFactory.eINSTANCE.createProductStorageEntry()
				: optional.get();
		pse.setProduct(item);
		pse.setAmount(pse.getAmount() + amount);

		productStorage.getProductStorageEntries().add(pse);

		return getAll(parent);
	}

	@Override
	public Collection<TableItem> update(Product item, int amount, Table parent) {
		Optional<ProductStorageEntry> optional = productStorage.getProductStorageEntries().stream()
			.filter(pse -> pse.getProduct().equals(item))
			.findFirst();

		ProductStorageEntry pse = optional.isEmpty()
				? ModelFactory.eINSTANCE.createProductStorageEntry()
				: optional.get();
		pse.setProduct(item);
		pse.setAmount(amount);

		productStorage.getProductStorageEntries().add(pse);

		return getAll(parent);
	}

	@Override
	public Collection<TableItem> remove(Product item, Table parent) {
		productStorage.getProductStorageEntries().removeIf(p -> p.getProduct().equals(item));

		return getAll(parent);
	}

	@Override
	public Collection<TableItem> getAll(Table parent) {
		parent.removeAll();
		
		return productStorage.getProductStorageEntries().stream().map(p -> {
			TableItem item = new TableItem(parent, SWT.NONE);
			item.setText(new String[] { p.getProduct().getName(), String.valueOf(p.getAmount()) });
			
			return item;
		}).toList();
	}
}