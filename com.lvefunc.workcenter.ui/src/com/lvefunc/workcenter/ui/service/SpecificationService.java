package com.lvefunc.workcenter.ui.service;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

import com.lvefunc.workcenter.model.Material;
import com.lvefunc.workcenter.model.ModelFactory;
import com.lvefunc.workcenter.model.Product;
import com.lvefunc.workcenter.model.ProductSpecification;
import com.lvefunc.workcenter.model.Workcenter;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class SpecificationService {
	@Inject
	private Workcenter workcenter;
	@Inject
	@Optional
	@Named("pTable")
	private Table pTable;
	@Inject
	@Optional
	@Named("sTable")
	private Table sTable;

	public ProductSpecification create(Material material, Product product, int amount) {
		var optional = workcenter.getProductSpecifications().stream()
				.filter(pSpec -> pSpec.getMaterial().equals(material) && pSpec.getProduct().equals(product))
				.findFirst();
		var pSpec = optional.isEmpty() ? ModelFactory.eINSTANCE.createProductSpecification() : optional.get();

		pSpec.setMaterial(material);
		pSpec.setProduct(product);
		pSpec.setAmount(pSpec.getAmount() + amount);

		if (optional.isEmpty())
			workcenter.getProductSpecifications().add(pSpec);
		
		update();
		setCurrent(product);
		
		return pSpec;
	}

	public ProductSpecification update(Material material, Product product, int amount) {
		var optional = workcenter.getProductSpecifications().stream()
				.filter(pSpec -> pSpec.getMaterial().equals(material) && pSpec.getProduct().equals(product))
				.findFirst();
		var pSpec = optional.isEmpty() ? ModelFactory.eINSTANCE.createProductSpecification() : optional.get();

		pSpec.setMaterial(material);
		pSpec.setProduct(product);
		pSpec.setAmount(amount);

		if (optional.isEmpty())
			workcenter.getProductSpecifications().add(pSpec);
		
		update();
		setCurrent(product);
		
		return pSpec;
	}

	public void remove(Material material, Product product, Table table) {
		workcenter.getProductSpecifications()
				.removeIf(pSpec -> pSpec.getMaterial().equals(material) && pSpec.getProduct().equals(product));
		update();
	}
	
	public Collection<ProductSpecification> getAllBy(Product product) {
		return getAll().stream()
				.filter(pSpec -> pSpec.getProduct().equals(product))
				.toList();
	}
	
	public Collection<ProductSpecification> getAll() {
		return workcenter.getProductSpecifications();
	}
	
	public void setCurrent(Product product) {
		if (Objects.isNull(this.sTable))
			return;
		
		sTable.removeAll();
		
		workcenter.getProductSpecifications().stream()
				.filter(pSpec -> pSpec.getProduct().equals(product))
				.forEach(pSpec -> {
					var item = new TableItem(sTable, SWT.NONE);
					item.setText(new String[] { pSpec.getMaterial().getName(), String.valueOf(pSpec.getAmount()) });
				});
	}

	private void update() {
		if (Objects.isNull(this.pTable))
			return;
		
		pTable.removeAll();

		workcenter.getProductSpecifications().stream()
				.map(pSpec -> pSpec.getProduct().getName())
				.collect(Collectors.toSet())
				.forEach(pName -> {
					var item = new TableItem(pTable, SWT.NONE);
					item.setText(new String[] { pName });
				});
	}
}
