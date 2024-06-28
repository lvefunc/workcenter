/**
 */
package com.lvefunc.workcenter.model.impl;

import com.lvefunc.workcenter.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory) EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ModelPackage.WORKCENTER:
			return createWorkcenter();
		case ModelPackage.MATERIAL_WAREHOUSE:
			return createMaterialWarehouse();
		case ModelPackage.MATERIAL_STORAGE:
			return createMaterialStorage();
		case ModelPackage.MATERIAL:
			return createMaterial();
		case ModelPackage.PRODUCT_WAREHOUSE:
			return createProductWarehouse();
		case ModelPackage.PRODUCT_STORAGE:
			return createProductStorage();
		case ModelPackage.PRODUCT:
			return createProduct();
		case ModelPackage.PRODUCT_SPECIFICATION:
			return createProductSpecification();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workcenter createWorkcenter() {
		WorkcenterImpl workcenter = new WorkcenterImpl();
		return workcenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialWarehouse createMaterialWarehouse() {
		MaterialWarehouseImpl materialWarehouse = new MaterialWarehouseImpl();
		return materialWarehouse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialStorage createMaterialStorage() {
		MaterialStorageImpl materialStorage = new MaterialStorageImpl();
		return materialStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Material createMaterial() {
		MaterialImpl material = new MaterialImpl();
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductWarehouse createProductWarehouse() {
		ProductWarehouseImpl productWarehouse = new ProductWarehouseImpl();
		return productWarehouse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStorage createProductStorage() {
		ProductStorageImpl productStorage = new ProductStorageImpl();
		return productStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductSpecification createProductSpecification() {
		ProductSpecificationImpl productSpecification = new ProductSpecificationImpl();
		return productSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelPackage getModelPackage() {
		return (ModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
