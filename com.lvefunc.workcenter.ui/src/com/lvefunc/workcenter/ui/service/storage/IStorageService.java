package com.lvefunc.workcenter.ui.service.storage;

import java.util.Collection;

import org.eclipse.swt.widgets.TableItem;

import com.lvefunc.workcenter.model.Storage;

public interface IStorageService<T extends Storage, U> {
	int amount(U item);
	Collection<TableItem> add(U item, int amount);
	Collection<TableItem> subtract(U item, int amount);
	Collection<TableItem> update(U item, int amount);
	Collection<TableItem> remove(U item);
	Collection<TableItem> getAll();
}