package com.lvefunc.workcenter.ui.controller.storage;

import java.util.Collection;
import java.util.Optional;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

import com.lvefunc.workcenter.model.Material;
import com.lvefunc.workcenter.model.MaterialStorage;
import com.lvefunc.workcenter.model.MaterialStorageEntry;
import com.lvefunc.workcenter.model.ModelFactory;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class MaterialsStorageController implements IStorageController<MaterialStorage, Material> {
	@Inject()
	@Named("materialStorage")
	private MaterialStorage materialStorage;

	@Override
	public Collection<TableItem> add(Material item, int amount, Table parent) {
		Optional<MaterialStorageEntry> optional = materialStorage.getMaterialStorageEntries().stream()
			.filter(mse -> mse.getMaterial().equals(item))
			.findFirst();

		MaterialStorageEntry mse = optional.isEmpty()
				? ModelFactory.eINSTANCE.createMaterialStorageEntry()
				: optional.get();
		mse.setMaterial(item);
		mse.setAmount(mse.getAmount() + amount);

		materialStorage.getMaterialStorageEntries().add(mse);

		return getAll(parent);
	}

	@Override
	public Collection<TableItem> update(Material item, int amount, Table parent) {
		Optional<MaterialStorageEntry> optional = materialStorage.getMaterialStorageEntries().stream()
			.filter(mse -> mse.getMaterial().equals(item))
			.findFirst();

		MaterialStorageEntry mse = optional.isEmpty()
				? ModelFactory.eINSTANCE.createMaterialStorageEntry()
				: optional.get();
		mse.setMaterial(item);
		mse.setAmount(amount);

		materialStorage.getMaterialStorageEntries().add(mse);

		return getAll(parent);
	}

	@Override
	public Collection<TableItem> remove(Material item, Table parent) {
		materialStorage.getMaterialStorageEntries().removeIf(m -> m.getMaterial().equals(item));

		return getAll(parent);
	}

	@Override
	public Collection<TableItem> getAll(Table parent) {
		parent.removeAll();
		
		return materialStorage.getMaterialStorageEntries().stream().map(m -> {
			TableItem item = new TableItem(parent, SWT.NONE);
			item.setText(new String[] { m.getMaterial().getName(), String.valueOf(m.getAmount()) });
			
			return item;
		}).toList();
	}
}