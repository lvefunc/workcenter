/**
 */
package com.lvefunc.workcenter.model.impl;

import com.lvefunc.workcenter.model.Material;
import com.lvefunc.workcenter.model.MaterialStorage;
import com.lvefunc.workcenter.model.MaterialWarehouse;
import com.lvefunc.workcenter.model.ModelFactory;
import com.lvefunc.workcenter.model.ModelPackage;
import com.lvefunc.workcenter.model.Product;
import com.lvefunc.workcenter.model.ProductSpecification;
import com.lvefunc.workcenter.model.ProductStorage;
import com.lvefunc.workcenter.model.ProductWarehouse;
import com.lvefunc.workcenter.model.Storage;
import com.lvefunc.workcenter.model.Warehouse;
import com.lvefunc.workcenter.model.Workcenter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workcenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialWarehouseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass warehouseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productWarehouseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productSpecificationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.lvefunc.workcenter.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited)
			return (ModelPackage) EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModelPackageImpl theModelPackage = registeredModelPackage instanceof ModelPackageImpl
				? (ModelPackageImpl) registeredModelPackage
				: new ModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkcenter() {
		return workcenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkcenter_Id() {
		return (EAttribute) workcenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkcenter_Name() {
		return (EAttribute) workcenterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkcenter_MaterialWarehouse() {
		return (EReference) workcenterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkcenter_ProductWarehouse() {
		return (EReference) workcenterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkcenter_ProductSpecifications() {
		return (EReference) workcenterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaterialWarehouse() {
		return materialWarehouseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaterialWarehouse_Id() {
		return (EAttribute) materialWarehouseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaterialWarehouse_Name() {
		return (EAttribute) materialWarehouseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMaterialWarehouse_MaterialStorage() {
		return (EReference) materialWarehouseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaterialStorage() {
		return materialStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMaterialStorage_Materials() {
		return (EReference) materialStorageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaterial() {
		return materialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaterial_Id() {
		return (EAttribute) materialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaterial_Name() {
		return (EAttribute) materialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWarehouse() {
		return warehouseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorage() {
		return storageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductWarehouse() {
		return productWarehouseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductWarehouse_Id() {
		return (EAttribute) productWarehouseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductWarehouse_Name() {
		return (EAttribute) productWarehouseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductWarehouse_ProductStorage() {
		return (EReference) productWarehouseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStorage() {
		return productStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductStorage_Products() {
		return (EReference) productStorageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Id() {
		return (EAttribute) productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Name() {
		return (EAttribute) productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductSpecification() {
		return productSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductSpecification_Product() {
		return (EReference) productSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductSpecification_Material() {
		return (EReference) productSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSpecification_Amount() {
		return (EAttribute) productSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelFactory getModelFactory() {
		return (ModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		workcenterEClass = createEClass(WORKCENTER);
		createEAttribute(workcenterEClass, WORKCENTER__ID);
		createEAttribute(workcenterEClass, WORKCENTER__NAME);
		createEReference(workcenterEClass, WORKCENTER__MATERIAL_WAREHOUSE);
		createEReference(workcenterEClass, WORKCENTER__PRODUCT_WAREHOUSE);
		createEReference(workcenterEClass, WORKCENTER__PRODUCT_SPECIFICATIONS);

		materialWarehouseEClass = createEClass(MATERIAL_WAREHOUSE);
		createEAttribute(materialWarehouseEClass, MATERIAL_WAREHOUSE__ID);
		createEAttribute(materialWarehouseEClass, MATERIAL_WAREHOUSE__NAME);
		createEReference(materialWarehouseEClass, MATERIAL_WAREHOUSE__MATERIAL_STORAGE);

		materialStorageEClass = createEClass(MATERIAL_STORAGE);
		createEReference(materialStorageEClass, MATERIAL_STORAGE__MATERIALS);

		materialEClass = createEClass(MATERIAL);
		createEAttribute(materialEClass, MATERIAL__ID);
		createEAttribute(materialEClass, MATERIAL__NAME);

		warehouseEClass = createEClass(WAREHOUSE);

		storageEClass = createEClass(STORAGE);

		productWarehouseEClass = createEClass(PRODUCT_WAREHOUSE);
		createEAttribute(productWarehouseEClass, PRODUCT_WAREHOUSE__ID);
		createEAttribute(productWarehouseEClass, PRODUCT_WAREHOUSE__NAME);
		createEReference(productWarehouseEClass, PRODUCT_WAREHOUSE__PRODUCT_STORAGE);

		productStorageEClass = createEClass(PRODUCT_STORAGE);
		createEReference(productStorageEClass, PRODUCT_STORAGE__PRODUCTS);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__ID);
		createEAttribute(productEClass, PRODUCT__NAME);

		productSpecificationEClass = createEClass(PRODUCT_SPECIFICATION);
		createEReference(productSpecificationEClass, PRODUCT_SPECIFICATION__PRODUCT);
		createEReference(productSpecificationEClass, PRODUCT_SPECIFICATION__MATERIAL);
		createEAttribute(productSpecificationEClass, PRODUCT_SPECIFICATION__AMOUNT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		materialWarehouseEClass.getESuperTypes().add(this.getWarehouse());
		materialStorageEClass.getESuperTypes().add(this.getStorage());
		productWarehouseEClass.getESuperTypes().add(this.getWarehouse());
		productStorageEClass.getESuperTypes().add(this.getStorage());

		// Initialize classes, features, and operations; add parameters
		initEClass(workcenterEClass, Workcenter.class, "Workcenter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkcenter_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Workcenter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkcenter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Workcenter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkcenter_MaterialWarehouse(), this.getMaterialWarehouse(), null, "materialWarehouse", null,
				1, 1, Workcenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkcenter_ProductWarehouse(), this.getProductWarehouse(), null, "productWarehouse", null, 1,
				1, Workcenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkcenter_ProductSpecifications(), this.getProductSpecification(), null,
				"productSpecifications", null, 0, -1, Workcenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(materialWarehouseEClass, MaterialWarehouse.class, "MaterialWarehouse", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaterialWarehouse_Id(), ecorePackage.getEInt(), "id", null, 0, 1, MaterialWarehouse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaterialWarehouse_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				MaterialWarehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMaterialWarehouse_MaterialStorage(), this.getMaterialStorage(), null, "materialStorage", null,
				1, 1, MaterialWarehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(materialStorageEClass, MaterialStorage.class, "MaterialStorage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaterialStorage_Materials(), this.getMaterial(), null, "materials", null, 0, -1,
				MaterialStorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(materialEClass, Material.class, "Material", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaterial_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Material.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaterial_Name(), ecorePackage.getEString(), "name", null, 0, 1, Material.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(warehouseEClass, Warehouse.class, "Warehouse", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(storageEClass, Storage.class, "Storage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productWarehouseEClass, ProductWarehouse.class, "ProductWarehouse", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductWarehouse_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ProductWarehouse.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductWarehouse_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ProductWarehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProductWarehouse_ProductStorage(), this.getProductStorage(), null, "productStorage", null, 1,
				1, ProductWarehouse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStorageEClass, ProductStorage.class, "ProductStorage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductStorage_Products(), this.getProduct(), null, "products", null, 0, -1,
				ProductStorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Product.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Name(), ecorePackage.getEString(), "name", null, 0, 1, Product.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productSpecificationEClass, ProductSpecification.class, "ProductSpecification", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductSpecification_Product(), this.getProduct(), null, "product", null, 1, 1,
				ProductSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductSpecification_Material(), this.getMaterial(), null, "material", null, 1, 1,
				ProductSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSpecification_Amount(), ecorePackage.getEInt(), "amount", null, 0, 1,
				ProductSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
