package com.lvefunc.workcenter.ui.service.item;

import java.util.Collection;
import java.util.Optional;

public interface IItemService<T> {
	T create(String name);
	T update(int id, String name);
	void remove(int id);
	
	Optional<T> get(int id);
	Optional<T> get(String name);
	Collection<T> getAll();
	
	int indexOf(T t);
}