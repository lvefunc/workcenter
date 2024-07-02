package com.lvefunc.workcenter.ui.service.item;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.lvefunc.workcenter.model.ModelFactory;
import com.lvefunc.workcenter.model.Product;

public class ProductService implements IItemService<Product> {
	private Map<Integer, Product> products = new HashMap<>();

	@Override
	public Product create(String name) {
		var optional = get(name);
		
		if (!optional.isEmpty())
			return optional.get();

		var product = ModelFactory.eINSTANCE.createProduct();
		product.setName(name);

		products.put(product.getId(), product);

		return product;
	}

	@Override
	public Product update(int id, String name) {
		var optional = get(id);
		
		if (optional.isEmpty())
			throw new IllegalArgumentException();
		
		var product = optional.get();
		product.setName(name);

		return product;
	}

	@Override
	public void remove(int id) {
		products.remove(id);
	}

	@Override
	public Optional<Product> get(int id) {
		return Optional.ofNullable(products.get(id));
	}
	
	@Override
	public Optional<Product> get(String name) {
		return products.values().stream()
				.filter(product -> product.getName().equals(name))
				.findFirst();
	}

	@Override
	public Collection<Product> getAll() {
		return products.values();
	}
	
	@Override
	public int indexOf(Product product) {
		var optional = products.entrySet().stream()
				.filter(entry -> entry.getValue().equals(product))
				.findFirst();

		if (!optional.isEmpty())
			optional.get().getKey();
		return -1;
	}
}
