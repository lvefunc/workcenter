package com.lvefunc.workcenter.ui.service.storage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import org.eclipse.e4.core.di.annotations.GroupUpdates;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

import com.lvefunc.workcenter.model.Material;
import com.lvefunc.workcenter.model.MaterialStorage;
import com.lvefunc.workcenter.model.ModelFactory;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class MaterialStorageService implements IStorageService<MaterialStorage, Material> {
	@Inject
	private MaterialStorage mStorage;
	private Table mStorageTable;

	@Inject
	@GroupUpdates
	public void update(@Optional @Named("mStorageTable") Table mStorageTable) {
		this.mStorageTable = mStorageTable;
	}
	
	@Override
	public int amount(Material item) {
		var optional = mStorage.getMaterialStorageEntries().stream()
				.filter(mStorageEntry -> mStorageEntry.getMaterial().equals(item))
				.findFirst();
		return optional.isEmpty() ? 0 : optional.get().getAmount();
	}
	
	@Override
	public Collection<TableItem> add(Material item, int amount) {
		var optional = mStorage.getMaterialStorageEntries().stream()
				.filter(mStorageEntry -> mStorageEntry.getMaterial().equals(item))
				.findFirst();
		var mStorageEntry = optional.isEmpty() ? ModelFactory.eINSTANCE.createMaterialStorageEntry() : optional.get();

		mStorageEntry.setMaterial(item);
		mStorageEntry.setAmount(mStorageEntry.getAmount() + amount);
		
		if (optional.isEmpty())
			mStorage.getMaterialStorageEntries().add(mStorageEntry);

		return getAll();
	}
	
	@Override
	public Collection<TableItem> subtract(Material item, int amount) {
		var optional = mStorage.getMaterialStorageEntries().stream()
				.filter(mStorageEntry -> mStorageEntry.getMaterial().equals(item))
				.findFirst();
		
		if (optional.isEmpty())
			throw new IllegalArgumentException();
		
		var mStorageEntry = optional.get();

		if (mStorageEntry.getAmount() < amount)
			throw new IllegalArgumentException();
		
		mStorageEntry.setMaterial(item);
		mStorageEntry.setAmount(mStorageEntry.getAmount() - amount);

		return getAll();
	}

	@Override
	public Collection<TableItem> update(Material item, int amount) {
		var optional = mStorage.getMaterialStorageEntries().stream()
				.filter(mStorageEntry -> mStorageEntry.getMaterial().equals(item))
				.findFirst();
		
		if (optional.isEmpty())
			throw new IllegalArgumentException();
		
		var mStorageEntry = optional.get();
		
		mStorageEntry.setMaterial(item);
		mStorageEntry.setAmount(amount);

		return getAll();
	}

	@Override
	public Collection<TableItem> remove(Material item) {
		mStorage.getMaterialStorageEntries().removeIf(mStorageEntry -> mStorageEntry.getMaterial().equals(item));
		
		return getAll();
	}
	
	@Override
	public Collection<TableItem> getAll() {
		if (Objects.isNull(this.mStorageTable))
			return new ArrayList<>();
		
		mStorageTable.removeAll();

		return mStorage.getMaterialStorageEntries().stream().map(mStorageEntry -> {
			TableItem item = new TableItem(mStorageTable, SWT.NONE);
			item.setText(new String[] { mStorageEntry.getMaterial().getName(), String.valueOf(mStorageEntry.getAmount()) });

			return item;
		}).toList();
	}
}