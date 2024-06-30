package com.lvefunc.workcenter.ui.controller.item;

import java.util.Collection;

public interface IItemController<T> {
	T create(String name);
	T update(int id, String name);
	void remove(int id);
	int indexOf(T t);
	T get(String name);
	Collection<T> getAll();
}
