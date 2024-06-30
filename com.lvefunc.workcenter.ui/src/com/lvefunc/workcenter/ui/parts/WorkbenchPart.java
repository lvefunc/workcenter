package com.lvefunc.workcenter.ui.parts;

import java.util.HashMap;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.widgets.Composite;

import com.lvefunc.workcenter.model.Material;
import com.lvefunc.workcenter.model.MaterialStorage;
import com.lvefunc.workcenter.model.MaterialWarehouse;
import com.lvefunc.workcenter.model.ModelFactory;
import com.lvefunc.workcenter.model.Product;
import com.lvefunc.workcenter.model.ProductStorage;
import com.lvefunc.workcenter.model.ProductWarehouse;
import com.lvefunc.workcenter.model.Workcenter;
import com.lvefunc.workcenter.ui.controller.Controller;
import com.lvefunc.workcenter.ui.controller.item.MaterialsController;
import com.lvefunc.workcenter.ui.controller.item.ProductsController;
import com.lvefunc.workcenter.ui.controller.storage.MaterialsStorageController;
import com.lvefunc.workcenter.ui.controller.storage.ProductsStorageController;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.TableColumn;

public class WorkbenchPart {
	private Table table;
	@Inject
	public WorkbenchPart(@Named("applicationContext") IEclipseContext context) {
		IEclipseContext localContext = EclipseContextFactory.create();
		
		// Workcenter object
		Workcenter workcenter = ModelFactory.eINSTANCE.createWorkcenter();
		workcenter.setName("Workcenter");
		
		MaterialWarehouse materialWarehouse = ModelFactory.eINSTANCE.createMaterialWarehouse();
		MaterialStorage materialStorage = ModelFactory.eINSTANCE.createMaterialStorage();
		
		materialWarehouse.setMaterialStorage(materialStorage);
		
		ProductWarehouse productWarehouse = ModelFactory.eINSTANCE.createProductWarehouse();
		ProductStorage productStorage = ModelFactory.eINSTANCE.createProductStorage();
		
		productWarehouse.setProductStorage(productStorage);
		
		workcenter.setMaterialWarehouse(materialWarehouse);
		workcenter.setProductWarehouse(productWarehouse);

		localContext.set("workcenter", workcenter);
		
		// Item controller objects
		localContext.set("materials", new HashMap<Integer, Material>());
		localContext.set("products", new HashMap<Integer, Product>());
		
		MaterialsController materialsController = ContextInjectionFactory.make(MaterialsController.class, localContext);
		ProductsController productsController = ContextInjectionFactory.make(ProductsController.class, localContext);
		
		localContext.set("materialsController", materialsController);
		localContext.set("productsController", productsController);

		// Storage objects
		localContext.set("materialStorage", materialStorage);
		localContext.set("productStorage", productStorage);

		MaterialsStorageController materialsStorageController = ContextInjectionFactory.make(MaterialsStorageController.class, localContext);
		ProductsStorageController productsStorageController = ContextInjectionFactory.make(ProductsStorageController.class, localContext);
		
		localContext.set("materialsStorageController", materialsStorageController);
		localContext.set("productsStorageController", productsStorageController);

		// Main controller object
		Controller controller = ContextInjectionFactory.make(Controller.class, localContext);
		
		context.set(Controller.class, controller);
	}

	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new GridLayout(9, false));

		table = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 10, 10));
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableColumn materialColumn = new TableColumn(table, SWT.CENTER);
		materialColumn.setWidth(300);
		materialColumn.setText("Material");

		Button createButton = new Button(parent, SWT.NONE);
		createButton.setText("Create");

		Button editButton = new Button(parent, SWT.NONE);
		editButton.setText("Edit");
	}
}