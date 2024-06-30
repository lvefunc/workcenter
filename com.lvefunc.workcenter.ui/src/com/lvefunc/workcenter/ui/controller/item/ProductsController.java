package com.lvefunc.workcenter.ui.controller.item;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import com.lvefunc.workcenter.model.ModelFactory;
import com.lvefunc.workcenter.model.Product;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class ProductsController implements IItemController<Product> {
	@Inject
	@Named("products")
	private Map<Integer, Product> products;

	@Override
	public Product create(String name) {
		Product product = ModelFactory.eINSTANCE.createProduct();
		product.setName(name);
		
		products.put(product.getId(), product);
		
		return product;
	}

	@Override
	public Product update(int id, String name) {
		Product product = products.get(id);
		product.setName(name);
		
		return product;
	}

	@Override
	public void remove(int id) {
		products.remove(id);
	}

	@Override
	public int indexOf(Product product) {
		Optional<Map.Entry<Integer, Product>> optional = products.entrySet().stream()
			.filter(e -> e.getValue().equals(product))
			.findFirst();
		
		if (optional.isEmpty())
			return -1;
		else
			return optional.get().getKey();
	}
	
	@Override
	public Product get(String name) {
		Optional<Product> optional = products.values().stream()
				.filter(m -> m.getName().equals(name))
				.findFirst();

		if (!optional.isEmpty())
			return optional.get();
		throw new IllegalArgumentException();
	}
	
	@Override
	public Collection<Product> getAll() {
		return products.values();
	}
}
