package com.lvefunc.workcenter.ui.parts;

import java.util.Collection;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.lvefunc.workcenter.model.Material;
import com.lvefunc.workcenter.model.MaterialStorage;
import com.lvefunc.workcenter.model.MaterialWarehouse;
import com.lvefunc.workcenter.model.ModelFactory;
import com.lvefunc.workcenter.model.ProductStorage;
import com.lvefunc.workcenter.model.ProductWarehouse;
import com.lvefunc.workcenter.model.Workcenter;
import com.lvefunc.workcenter.ui.service.WorkcenterService;
import com.lvefunc.workcenter.ui.service.SpecificationService;
import com.lvefunc.workcenter.ui.service.item.MaterialService;
import com.lvefunc.workcenter.ui.service.item.ProductService;
import com.lvefunc.workcenter.ui.service.storage.MaterialStorageService;
import com.lvefunc.workcenter.ui.service.storage.ProductStorageService;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

public class WorkbenchPart {
	private IEclipseContext context;
	private WorkcenterService wService;
	private Table pTable;
	private Table sTable;
	
	@Inject
	public WorkbenchPart(@Named("applicationContext") IEclipseContext context) {
		this.context = context;
		
		Workcenter workcenter = ModelFactory.eINSTANCE.createWorkcenter();
		workcenter.setName("Workcenter");
		
		MaterialWarehouse materialWarehouse = ModelFactory.eINSTANCE.createMaterialWarehouse();
		ProductWarehouse productWarehouse = ModelFactory.eINSTANCE.createProductWarehouse();
		MaterialStorage materialStorage = ModelFactory.eINSTANCE.createMaterialStorage();
		ProductStorage productStorage = ModelFactory.eINSTANCE.createProductStorage();
		
		materialWarehouse.setMaterialStorage(materialStorage);
		productWarehouse.setProductStorage(productStorage);		
		workcenter.setMaterialWarehouse(materialWarehouse);
		workcenter.setProductWarehouse(productWarehouse);

		context.set(Workcenter.class, workcenter);
		context.set(MaterialStorage.class, materialStorage);
		context.set(ProductStorage.class, productStorage);
		
		MaterialService materialsController = ContextInjectionFactory.make(MaterialService.class, context);
		ProductService productsController = ContextInjectionFactory.make(ProductService.class, context);
		
		context.set(MaterialService.class, materialsController);
		context.set(ProductService.class, productsController);
		
		MaterialStorageService materialsStorageController = ContextInjectionFactory.make(MaterialStorageService.class, context);
		ProductStorageService productsStorageController = ContextInjectionFactory.make(ProductStorageService.class, context);
		
		context.set(MaterialStorageService.class, materialsStorageController);
		context.set(ProductStorageService.class, productsStorageController);
		
		SpecificationService specificationsController = ContextInjectionFactory.make(SpecificationService.class, context);
		
		context.set(SpecificationService.class, specificationsController);
		
		this.wService = ContextInjectionFactory.make(WorkcenterService.class, context);
		
		context.set(WorkcenterService.class, wService);
	}

	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new GridLayout(10, true));
		
		// Products table
		
		var pLabel = new Label(parent, SWT.NONE);
		pLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 10, 1));
		pLabel.setText("Products for creation");
		
		pTable = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		pTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 10, 5));
		pTable.setHeaderVisible(true);
		pTable.setLinesVisible(true);
		context.set("pTable", this.pTable);
		
		var pColumn = new TableColumn(this.pTable, SWT.CENTER);
		pColumn.setWidth(300);
		pColumn.setText("Product");
		
		// Buttons
		
		var pCreateButton = new Button(parent, SWT.NONE);
		pCreateButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
		pCreateButton.setText("Create a product");

		var sCreateButton = new Button(parent, SWT.NONE);
		sCreateButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
		sCreateButton.setText("Add to specification");
		
		// Specification table
		
		var sLabel = new Label(parent, SWT.NONE);
		sLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 10, 1));
		sLabel.setText("Product specification");
		
		sTable = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		sTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 10, 15));
		sTable.setHeaderVisible(true);
		sTable.setLinesVisible(true);
		context.set("sTable", this.sTable);
		
		var mColumn = new TableColumn(this.sTable, SWT.CENTER);
		mColumn.setWidth(200);
		mColumn.setText("Material");

		var numColumn = new TableColumn(this.sTable, SWT.CENTER);
		numColumn.setWidth(200);
		numColumn.setText("Amount");
		
		context.processWaiting();
		
		pTable.addListener(SWT.Selection, event -> {
			var pService = wService.getProductService();
			var sService = wService.getSpecificationService();
			
			TableItem item = (TableItem) event.item;
			String name = item.getText(0);
			
			var product = pService.get(name).orElseThrow(IllegalArgumentException::new);
			
			sService.setCurrent(product);
		});
		
		pCreateButton.addListener(SWT.Selection, event -> {
			var pService = wService.getProductService();
			
			TableItem[] selection = pTable.getSelection();
			
			if (selection.length == 0)
				return;
			
			TableItem selected = selection[0];
			String name = selected.getText(0);
			
			var product = pService.get(name).orElseThrow(IllegalArgumentException::new);
			
			wService.createProduct(product);
		});
		
		sCreateButton.addListener(SWT.Selection, event -> {
			var mService = wService.getMaterialService();
			var pService = wService.getProductService();
			var sService = wService.getSpecificationService();
			
			EditDialog dialog = new EditDialog(new Shell(), "Add to specification", mService.getAll());
			dialog.open();
			
			if (!dialog.isOkPressed())
				return;
			
			var material = mService.get(dialog.getMaterial());
			
			if (material.isEmpty()) {
				var message = new MessageBox(new Shell(), SWT.OK);

				message.setText("Warning");
				message.setMessage("Such material doesn't exist");
				message.open();

				return;
			}
			
			var product = pService.create(dialog.getProduct());
			var amount = dialog.getAmount();
			
			sService.create(material.get(), product, amount);
		});
	}

	public static class EditDialog extends Dialog {
		private static final String DEFAULT_PRODUCT = "";
		private static final String DEFAULT_MATERIAL = "";
		private static final int DEFAULT_AMOUNT = 0;
		
		private String header;
		private Collection<Material> materials;
		
		private Text productText;
		private Combo materialCombo;
		private Text amountText;

		private String product = DEFAULT_PRODUCT;
		private String material = DEFAULT_MATERIAL;
		private int amount = DEFAULT_AMOUNT;
		private boolean okPressed;
		
		public EditDialog(Shell parent, String header, Collection<Material> materials) {
			super(parent);
			this.header = header;
			this.materials = materials;
		}
		
		public EditDialog(Shell parent, String header, Collection<Material> materials, String product, String material, int amount) {
			this(parent, header, materials);
			this.product = product;
			this.material = material;
			this.amount = amount;
		}

		protected void configureShell(Shell shell) {
			super.configureShell(shell);
			shell.setText(header);
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			var composite = (Composite) super.createDialogArea(parent);
			composite.setLayout(new GridLayout(2, false));

			var productLabel = new Label(composite, SWT.NONE);
			productLabel.setText("Product");

			productText = new Text(composite, SWT.BORDER);
			productText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			productText.setText(product);

			var materialLabel = new Label(composite, SWT.NONE);
			materialLabel.setText("Material");
			
			materialCombo = new Combo(composite, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
			materialCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			materialCombo.setItems(this.materials.stream().map(Material::getName).toArray(String[]::new));
			materialCombo.select(0);
			
			var amountLabel = new Label(composite, SWT.NONE);
			amountLabel.setText("Amount");

			amountText = new Text(composite, SWT.SINGLE | SWT.BORDER);
			amountText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			amountText.addListener(SWT.KeyDown, event -> event.doit = Character.isDigit(event.character));
			amountText.setText(String.valueOf(amount));

			return composite;
		}

		@Override
		protected void okPressed() {
			this.product = productText.getText();
			this.material = materialCombo.getText();
			this.amount = Integer.valueOf(amountText.getText());
			this.okPressed = !okPressed;
			super.okPressed();
		}

		public String getProduct() { return product; }
		public String getMaterial() { return material; }
		public int getAmount() { return amount; }
		public boolean isOkPressed() { return this.okPressed; }
	}
}