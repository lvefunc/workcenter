package com.lvefunc.workcenter.ui.service;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

import com.lvefunc.workcenter.model.Product;
import com.lvefunc.workcenter.model.Workcenter;
import com.lvefunc.workcenter.ui.service.item.MaterialService;
import com.lvefunc.workcenter.ui.service.item.ProductService;
import com.lvefunc.workcenter.ui.service.storage.MaterialStorageService;
import com.lvefunc.workcenter.ui.service.storage.ProductStorageService;

import jakarta.inject.Inject;

public class WorkcenterService {
	@Inject
	private Workcenter workcenter;
	@Inject
	private MaterialService mService;
	@Inject
	private ProductService pService;
	@Inject
	private MaterialStorageService mStorageService;
	@Inject
	private ProductStorageService pStorageService;
	@Inject
	private SpecificationService specificationService;

	public Workcenter getWorkcenter() {
		return workcenter;
	}

	public MaterialService getMaterialService() {
		return mService;
	}

	public ProductService getProductService() {
		return pService;
	}

	public MaterialStorageService getMaterialStorageService() {
		return mStorageService;
	}
	
	public ProductStorageService getProductStorageService() {
		return pStorageService;
	}
	
	public SpecificationService getSpecificationService() {
		return specificationService;
	}
	
	public void createProduct(Product product) {
		var pSpecs = specificationService.getAllBy(product);
		var enough = pSpecs.stream()
				.allMatch(pSpec -> mStorageService.amount(pSpec.getMaterial()) >= pSpec.getAmount());
		
		if (!enough) {
			var message = new MessageBox(new Shell(), SWT.OK);

			message.setText("Warning");
			message.setMessage("Insufficient materials in storage!");
			message.open();
			
			return;
		}
			
		pSpecs.forEach(pSpec -> mStorageService.subtract(pSpec.getMaterial(), pSpec.getAmount()));
		pStorageService.add(product, 1);
	}
}