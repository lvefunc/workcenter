package com.lvefunc.workcenter.ui.parts;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import com.lvefunc.workcenter.ui.service.WorkcenterService;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.inject.Named;

public class ProductManagementPart {
	private Table pStorageTable;

	@Inject
	@Optional
	@PostConstruct
	public void postConstruct(Composite parent, WorkcenterService wService, @Named("applicationContext") IEclipseContext context) {
		parent.setLayout(new GridLayout(10, true));

		pStorageTable = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		pStorageTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 10, 5));
		pStorageTable.setHeaderVisible(true);
		pStorageTable.setLinesVisible(true);
		
		context.set("pStorageTable", pStorageTable);
		context.processWaiting();
		
		var pColumn = new TableColumn(pStorageTable, SWT.CENTER);
		pColumn.setWidth(200);
		pColumn.setText("Product");

		var numColumn = new TableColumn(pStorageTable, SWT.CENTER);
		numColumn.setWidth(200);
		numColumn.setText("Amount");
	}
}
