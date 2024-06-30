package com.lvefunc.workcenter.ui.parts;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import com.lvefunc.workcenter.ui.controller.Controller;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;

public class ProductManagementPart {
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

		TableColumn productColumn = new TableColumn(table, SWT.CENTER);
		productColumn.setWidth(300);
		productColumn.setText("Product");

		TableColumn amountColumn = new TableColumn(table, SWT.CENTER);
		amountColumn.setWidth(100);
		amountColumn.setText("Amount");
	}
}
