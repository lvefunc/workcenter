package com.lvefunc.workcenter.ui.controller.storage;

import java.util.Collection;

import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

import com.lvefunc.workcenter.model.Storage;

public interface IStorageController<T extends Storage, U> {
	Collection<TableItem> add(U item, int amount, Table parent);
	Collection<TableItem> update(U item, int amount, Table parent);
	Collection<TableItem> remove(U item, Table parent);
	Collection<TableItem> getAll(Table parent);
}