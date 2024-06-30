package com.lvefunc.workcenter.ui.controller;

import com.lvefunc.workcenter.model.Workcenter;
import com.lvefunc.workcenter.ui.controller.item.MaterialsController;
import com.lvefunc.workcenter.ui.controller.item.ProductsController;
import com.lvefunc.workcenter.ui.controller.storage.MaterialsStorageController;
import com.lvefunc.workcenter.ui.controller.storage.ProductsStorageController;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class Controller {
	@Inject
	@Named("workcenter")
	private Workcenter workcenter;
	@Inject
	@Named("materialsController")
	private MaterialsController materialsController;
	@Inject
	@Named("productsController")
	private ProductsController productsController;
	@Inject
	@Named("materialsStorageController")
	private MaterialsStorageController materialsStorageController;
	@Inject
	@Named("productsStorageController")
	private ProductsStorageController productsStorageController;

	public Workcenter getWorkcenter() {
		return workcenter;
	}

	public MaterialsController getMaterialsController() {
		return materialsController;
	}

	public ProductsController getProductsController() {
		return productsController;
	}

	public MaterialsStorageController getMaterialsStorageController() {
		return materialsStorageController;
	}
	
	public ProductsStorageController getProductsStorageController() {
		return productsStorageController;
	}
}