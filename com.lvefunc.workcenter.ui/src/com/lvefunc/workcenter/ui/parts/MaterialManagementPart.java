package com.lvefunc.workcenter.ui.parts;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import org.eclipse.swt.widgets.Table;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import com.lvefunc.workcenter.ui.service.WorkcenterService;

public class MaterialManagementPart {
	private Table mStorageTable;
	
	@Inject
	@Optional
	@PostConstruct
	public void postConstruct(Composite parent, WorkcenterService wService, @Named("applicationContext") IEclipseContext context) {
		parent.setLayout(new GridLayout(10, true));
		
		mStorageTable = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		mStorageTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 10, 9));
		mStorageTable.setHeaderVisible(true);
		mStorageTable.setLinesVisible(true);
		
		context.set("mStorageTable", this.mStorageTable);
		context.processWaiting();
		
		var mColumn = new TableColumn(this.mStorageTable, SWT.CENTER);
		mColumn.setWidth(200);
		mColumn.setText("Material");

		var numColumn = new TableColumn(this.mStorageTable, SWT.CENTER);
		numColumn.setWidth(200);
		numColumn.setText("Amount");
		
		var createButton = new Button(parent, SWT.NONE);
		createButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		createButton.setText("Create");

		var editButton = new Button(parent, SWT.NONE);
		editButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		editButton.setText("Edit");

		var deleteButton = new Button(parent, SWT.NONE);
		deleteButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		deleteButton.setText("Delete");
		
		createButton.addListener(SWT.Selection, event -> {
			var dialog = new EditDialog(new Shell(), "Create a material");
			dialog.open();
			
			if (!dialog.isOkPressed())
				return;
			
			var mService = wService.getMaterialService();
			var mStorageService = wService.getMaterialStorageService();
			
			mStorageService.add(mService.create(dialog.getName()), dialog.getAmount());
		});
		
		editButton.addListener(SWT.Selection, event -> {
			TableItem[] selection = mStorageTable.getSelection();
			
			if (selection.length == 0)
				return;
			
			TableItem selected = selection[0];
			String name = selected.getText(0);
			int amount = Integer.valueOf(selected.getText(1));
			
			var dialog = new EditDialog(new Shell(), "Edit selected material", name, amount);
			dialog.open();
			
			if (!dialog.isOkPressed())
				return;
			
			var mService = wService.getMaterialService();
			var mStorageService = wService.getMaterialStorageService();
			
			var material = mService.get(name).orElseThrow(IllegalArgumentException::new);
			
			material.setName(dialog.getName());
			mStorageService.update(material, dialog.getAmount());
		});
		
		deleteButton.addListener(SWT.Selection, event -> {
			TableItem[] selection = mStorageTable.getSelection();
			
			if (selection.length == 0)
				return;
			
			TableItem selected = selection[0];
			String name = selected.getText(0);
			
			var mService = wService.getMaterialService();
			var mStorageService = wService.getMaterialStorageService();
			
			var material = mService.get(name).orElseThrow(IllegalArgumentException::new);
			var index = mService.indexOf(material);
			
			mStorageService.remove(material);
			mService.remove(index);
		});
	}

	public static class EditDialog extends Dialog {
		private static final String DEFAULT_NAME = "";
		private static final int DEFAULT_AMOUNT = 0;
		
		private String header;
		
		private Text nameText;
		private Text amountText;
		
		private String name = DEFAULT_NAME;
		private int amount = DEFAULT_AMOUNT;
		private boolean okPressed;

		public EditDialog(Shell parent, String header) {
			super(parent);
			this.header = header;
		}

		public EditDialog(Shell parent, String header, String name, int amount) {
			this(parent, header);
			this.name = name;
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

			var nameLabel = new Label(composite, SWT.NONE);
			nameLabel.setText("Name");

			nameText = new Text(composite, SWT.BORDER);
			nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			nameText.setText(name);

			var amountLabel = new Label(composite, SWT.NONE);
			amountLabel.setText("Amount");

			amountText = new Text(composite, SWT.SINGLE | SWT.BORDER);
			amountText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			amountText.addListener(SWT.KeyDown, event -> event.doit = Character.isISOControl(event.character) || Character.isDigit(event.character));
			amountText.setText(String.valueOf(amount));

			return composite;
		}

		@Override
		protected void okPressed() {
			this.name = nameText.getText();
			this.amount = Integer.valueOf(amountText.getText());
			this.okPressed = !okPressed;
			super.okPressed();
		}

		public String getName() { return this.name; }
		public int getAmount() { return this.amount; }
		public boolean isOkPressed() { return this.okPressed; }
	}
}
