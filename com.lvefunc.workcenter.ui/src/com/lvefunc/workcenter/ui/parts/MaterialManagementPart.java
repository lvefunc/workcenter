package com.lvefunc.workcenter.ui.parts;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;

import org.eclipse.swt.widgets.Table;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import com.lvefunc.workcenter.model.Material;
import com.lvefunc.workcenter.ui.controller.Controller;

public class MaterialManagementPart {
	private Table table;

	@Inject
	@Optional
	@PostConstruct
	public void postConstruct(Composite parent, Controller controller) {
		parent.setLayout(new GridLayout(10, false));

		table = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 10, 10));
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableColumn materialColumn = new TableColumn(table, SWT.CENTER);
		materialColumn.setWidth(300);
		materialColumn.setText("Material");

		TableColumn amountColumn = new TableColumn(table, SWT.CENTER);
		amountColumn.setWidth(100);
		amountColumn.setText("Amount");

		Button createButton = new Button(parent, SWT.NONE);
		createButton.setText("Create");

		Button editButton = new Button(parent, SWT.NONE);
		editButton.setText("Edit");

		Button deleteButton = new Button(parent, SWT.NONE);
		deleteButton.setText("Delete");

		createButton.addListener(SWT.Selection, event -> {			
			EditMaterialDialog editMaterialDialog = new EditMaterialDialog(new Shell(), "Create new material in storage");
			editMaterialDialog.open();

			Material material = controller.getMaterialsController().create(editMaterialDialog.getName());
			controller.getMaterialsStorageController().add(material, editMaterialDialog.getAmount(), table);
		});
		
		editButton.addListener(SWT.Selection, event -> {
			TableItem[] selection = table.getSelection();
			
			if (selection.length == 0)
				return;
			
			TableItem selected = selection[0];
			String name = selected.getText(0);
			int amount = Integer.valueOf(selected.getText(1));
			
			EditMaterialDialog editMaterialDialog = new EditMaterialDialog(new Shell(), "Edit material in storage", name, amount);
			editMaterialDialog.open();

			Material material = controller.getMaterialsController().get(name);
			material.setName(editMaterialDialog.getName());
			controller.getMaterialsStorageController().update(material, editMaterialDialog.getAmount(), table);
		});
		
		deleteButton.addListener(SWT.Selection, event -> {
			TableItem[] selection = table.getSelection();
			
			if (selection.length == 0)
				return;
			
			TableItem selected = selection[0];
			String name = selected.getText(0);

			Material material = controller.getMaterialsController().get(name);
			int index = controller.getMaterialsController().indexOf(material);
			controller.getMaterialsStorageController().remove(material, table);
			controller.getMaterialsController().remove(index);
		});
	}

	public static class EditMaterialDialog extends Dialog {
		private String header;
		private Text nameField;
		private Text amountField;
		private String name = "";
		private int amount = 0;

		public EditMaterialDialog(Shell parent, String header) {
			super(parent);
			this.header = header;
		}
		
		public EditMaterialDialog(Shell parent, String header, String name, int amount) {
			super(parent);
			this.header = header;
			this.name = name;
			this.amount = amount;
		}

		protected void configureShell(Shell shell) {
			super.configureShell(shell);
			shell.setText(header);
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite composite = (Composite) super.createDialogArea(parent);

			GridLayout layout = (GridLayout) composite.getLayout();
			layout.numColumns = 2;
			layout.makeColumnsEqualWidth = true;

			Label nameLabel = new Label(composite, SWT.RIGHT);
			nameLabel.setText("Name");

			nameField = new Text(composite, SWT.SINGLE | SWT.BORDER);
			nameField.setText(name);

			Label amountLabel = new Label(composite, SWT.RIGHT);
			amountLabel.setText("Amount");

			amountField = new Text(composite, SWT.SINGLE | SWT.BORDER);
			amountField.addListener(SWT.KeyDown, event -> event.doit = Character.isDigit(event.character));
			amountField.setText(String.valueOf(amount));

			GridData data = new GridData(SWT.FILL, SWT.FILL, true, false);
			nameField.setLayoutData(data);

			return composite;
		}

		@Override
		protected void okPressed() {
			this.name = nameField.getText();
			this.amount = Integer.valueOf(amountField.getText());
			super.okPressed();
		}

		@Override
		protected void cancelPressed() {
			super.cancelPressed();
		}

		public String getName() {
			return name;
		}

		public int getAmount() {
			return amount;
		}
	}
}
