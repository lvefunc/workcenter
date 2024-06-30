/**
 */
package com.lvefunc.workcenter.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.lvefunc.workcenter.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = com.lvefunc.workcenter.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.lvefunc.workcenter.model.impl.WorkcenterImpl <em>Workcenter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lvefunc.workcenter.model.impl.WorkcenterImpl
	 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getWorkcenter()
	 * @generated
	 */
	int WORKCENTER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKCENTER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKCENTER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Material Warehouse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKCENTER__MATERIAL_WAREHOUSE = 2;

	/**
	 * The feature id for the '<em><b>Product Warehouse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKCENTER__PRODUCT_WAREHOUSE = 3;

	/**
	 * The feature id for the '<em><b>Product Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKCENTER__PRODUCT_SPECIFICATIONS = 4;

	/**
	 * The number of structural features of the '<em>Workcenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKCENTER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Workcenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKCENTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lvefunc.workcenter.model.Warehouse <em>Warehouse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lvefunc.workcenter.model.Warehouse
	 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getWarehouse()
	 * @generated
	 */
	int WAREHOUSE = 4;

	/**
	 * The number of structural features of the '<em>Warehouse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Warehouse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAREHOUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lvefunc.workcenter.model.impl.MaterialWarehouseImpl <em>Material Warehouse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lvefunc.workcenter.model.impl.MaterialWarehouseImpl
	 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getMaterialWarehouse()
	 * @generated
	 */
	int MATERIAL_WAREHOUSE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_WAREHOUSE__ID = WAREHOUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_WAREHOUSE__NAME = WAREHOUSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Material Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_WAREHOUSE__MATERIAL_STORAGE = WAREHOUSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Material Warehouse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_WAREHOUSE_FEATURE_COUNT = WAREHOUSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Material Warehouse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_WAREHOUSE_OPERATION_COUNT = WAREHOUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lvefunc.workcenter.model.Storage <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lvefunc.workcenter.model.Storage
	 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 5;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lvefunc.workcenter.model.impl.MaterialStorageImpl <em>Material Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lvefunc.workcenter.model.impl.MaterialStorageImpl
	 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getMaterialStorage()
	 * @generated
	 */
	int MATERIAL_STORAGE = 2;

	/**
	 * The feature id for the '<em><b>Material Storage Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_STORAGE__MATERIAL_STORAGE_ENTRIES = STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Material Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_STORAGE_FEATURE_COUNT = STORAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Material Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_STORAGE_OPERATION_COUNT = STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lvefunc.workcenter.model.impl.MaterialImpl <em>Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lvefunc.workcenter.model.impl.MaterialImpl
	 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getMaterial()
	 * @generated
	 */
	int MATERIAL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lvefunc.workcenter.model.impl.ProductWarehouseImpl <em>Product Warehouse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lvefunc.workcenter.model.impl.ProductWarehouseImpl
	 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getProductWarehouse()
	 * @generated
	 */
	int PRODUCT_WAREHOUSE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_WAREHOUSE__ID = WAREHOUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_WAREHOUSE__NAME = WAREHOUSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_WAREHOUSE__PRODUCT_STORAGE = WAREHOUSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Warehouse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_WAREHOUSE_FEATURE_COUNT = WAREHOUSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Warehouse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_WAREHOUSE_OPERATION_COUNT = WAREHOUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lvefunc.workcenter.model.impl.ProductStorageImpl <em>Product Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lvefunc.workcenter.model.impl.ProductStorageImpl
	 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getProductStorage()
	 * @generated
	 */
	int PRODUCT_STORAGE = 7;

	/**
	 * The feature id for the '<em><b>Product Storage Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORAGE__PRODUCT_STORAGE_ENTRIES = STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORAGE_FEATURE_COUNT = STORAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORAGE_OPERATION_COUNT = STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lvefunc.workcenter.model.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lvefunc.workcenter.model.impl.ProductImpl
	 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lvefunc.workcenter.model.impl.ProductSpecificationImpl <em>Product Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lvefunc.workcenter.model.impl.ProductSpecificationImpl
	 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getProductSpecification()
	 * @generated
	 */
	int PRODUCT_SPECIFICATION = 9;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFICATION__PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFICATION__MATERIAL = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFICATION__AMOUNT = 2;

	/**
	 * The number of structural features of the '<em>Product Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Product Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lvefunc.workcenter.model.StorageEntry <em>Storage Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lvefunc.workcenter.model.StorageEntry
	 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getStorageEntry()
	 * @generated
	 */
	int STORAGE_ENTRY = 11;

	/**
	 * The number of structural features of the '<em>Storage Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ENTRY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Storage Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.lvefunc.workcenter.model.impl.MaterialStorageEntryImpl <em>Material Storage Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lvefunc.workcenter.model.impl.MaterialStorageEntryImpl
	 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getMaterialStorageEntry()
	 * @generated
	 */
	int MATERIAL_STORAGE_ENTRY = 10;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_STORAGE_ENTRY__AMOUNT = STORAGE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_STORAGE_ENTRY__MATERIAL = STORAGE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Material Storage Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_STORAGE_ENTRY_FEATURE_COUNT = STORAGE_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Material Storage Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_STORAGE_ENTRY_OPERATION_COUNT = STORAGE_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.lvefunc.workcenter.model.impl.ProductStorageEntryImpl <em>Product Storage Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.lvefunc.workcenter.model.impl.ProductStorageEntryImpl
	 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getProductStorageEntry()
	 * @generated
	 */
	int PRODUCT_STORAGE_ENTRY = 12;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORAGE_ENTRY__AMOUNT = STORAGE_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORAGE_ENTRY__PRODUCT = STORAGE_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product Storage Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORAGE_ENTRY_FEATURE_COUNT = STORAGE_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Product Storage Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORAGE_ENTRY_OPERATION_COUNT = STORAGE_ENTRY_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.lvefunc.workcenter.model.Workcenter <em>Workcenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workcenter</em>'.
	 * @see com.lvefunc.workcenter.model.Workcenter
	 * @generated
	 */
	EClass getWorkcenter();

	/**
	 * Returns the meta object for the attribute '{@link com.lvefunc.workcenter.model.Workcenter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.lvefunc.workcenter.model.Workcenter#getId()
	 * @see #getWorkcenter()
	 * @generated
	 */
	EAttribute getWorkcenter_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.lvefunc.workcenter.model.Workcenter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.lvefunc.workcenter.model.Workcenter#getName()
	 * @see #getWorkcenter()
	 * @generated
	 */
	EAttribute getWorkcenter_Name();

	/**
	 * Returns the meta object for the reference '{@link com.lvefunc.workcenter.model.Workcenter#getMaterialWarehouse <em>Material Warehouse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Material Warehouse</em>'.
	 * @see com.lvefunc.workcenter.model.Workcenter#getMaterialWarehouse()
	 * @see #getWorkcenter()
	 * @generated
	 */
	EReference getWorkcenter_MaterialWarehouse();

	/**
	 * Returns the meta object for the reference '{@link com.lvefunc.workcenter.model.Workcenter#getProductWarehouse <em>Product Warehouse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Warehouse</em>'.
	 * @see com.lvefunc.workcenter.model.Workcenter#getProductWarehouse()
	 * @see #getWorkcenter()
	 * @generated
	 */
	EReference getWorkcenter_ProductWarehouse();

	/**
	 * Returns the meta object for the reference list '{@link com.lvefunc.workcenter.model.Workcenter#getProductSpecifications <em>Product Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Specifications</em>'.
	 * @see com.lvefunc.workcenter.model.Workcenter#getProductSpecifications()
	 * @see #getWorkcenter()
	 * @generated
	 */
	EReference getWorkcenter_ProductSpecifications();

	/**
	 * Returns the meta object for class '{@link com.lvefunc.workcenter.model.MaterialWarehouse <em>Material Warehouse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material Warehouse</em>'.
	 * @see com.lvefunc.workcenter.model.MaterialWarehouse
	 * @generated
	 */
	EClass getMaterialWarehouse();

	/**
	 * Returns the meta object for the attribute '{@link com.lvefunc.workcenter.model.MaterialWarehouse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.lvefunc.workcenter.model.MaterialWarehouse#getId()
	 * @see #getMaterialWarehouse()
	 * @generated
	 */
	EAttribute getMaterialWarehouse_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.lvefunc.workcenter.model.MaterialWarehouse#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.lvefunc.workcenter.model.MaterialWarehouse#getName()
	 * @see #getMaterialWarehouse()
	 * @generated
	 */
	EAttribute getMaterialWarehouse_Name();

	/**
	 * Returns the meta object for the reference '{@link com.lvefunc.workcenter.model.MaterialWarehouse#getMaterialStorage <em>Material Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Material Storage</em>'.
	 * @see com.lvefunc.workcenter.model.MaterialWarehouse#getMaterialStorage()
	 * @see #getMaterialWarehouse()
	 * @generated
	 */
	EReference getMaterialWarehouse_MaterialStorage();

	/**
	 * Returns the meta object for class '{@link com.lvefunc.workcenter.model.MaterialStorage <em>Material Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material Storage</em>'.
	 * @see com.lvefunc.workcenter.model.MaterialStorage
	 * @generated
	 */
	EClass getMaterialStorage();

	/**
	 * Returns the meta object for the reference list '{@link com.lvefunc.workcenter.model.MaterialStorage#getMaterialStorageEntries <em>Material Storage Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Material Storage Entries</em>'.
	 * @see com.lvefunc.workcenter.model.MaterialStorage#getMaterialStorageEntries()
	 * @see #getMaterialStorage()
	 * @generated
	 */
	EReference getMaterialStorage_MaterialStorageEntries();

	/**
	 * Returns the meta object for class '{@link com.lvefunc.workcenter.model.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material</em>'.
	 * @see com.lvefunc.workcenter.model.Material
	 * @generated
	 */
	EClass getMaterial();

	/**
	 * Returns the meta object for the attribute '{@link com.lvefunc.workcenter.model.Material#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.lvefunc.workcenter.model.Material#getId()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.lvefunc.workcenter.model.Material#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.lvefunc.workcenter.model.Material#getName()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_Name();

	/**
	 * Returns the meta object for class '{@link com.lvefunc.workcenter.model.Warehouse <em>Warehouse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warehouse</em>'.
	 * @see com.lvefunc.workcenter.model.Warehouse
	 * @generated
	 */
	EClass getWarehouse();

	/**
	 * Returns the meta object for class '{@link com.lvefunc.workcenter.model.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see com.lvefunc.workcenter.model.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for class '{@link com.lvefunc.workcenter.model.ProductWarehouse <em>Product Warehouse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Warehouse</em>'.
	 * @see com.lvefunc.workcenter.model.ProductWarehouse
	 * @generated
	 */
	EClass getProductWarehouse();

	/**
	 * Returns the meta object for the attribute '{@link com.lvefunc.workcenter.model.ProductWarehouse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.lvefunc.workcenter.model.ProductWarehouse#getId()
	 * @see #getProductWarehouse()
	 * @generated
	 */
	EAttribute getProductWarehouse_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.lvefunc.workcenter.model.ProductWarehouse#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.lvefunc.workcenter.model.ProductWarehouse#getName()
	 * @see #getProductWarehouse()
	 * @generated
	 */
	EAttribute getProductWarehouse_Name();

	/**
	 * Returns the meta object for the reference '{@link com.lvefunc.workcenter.model.ProductWarehouse#getProductStorage <em>Product Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Storage</em>'.
	 * @see com.lvefunc.workcenter.model.ProductWarehouse#getProductStorage()
	 * @see #getProductWarehouse()
	 * @generated
	 */
	EReference getProductWarehouse_ProductStorage();

	/**
	 * Returns the meta object for class '{@link com.lvefunc.workcenter.model.ProductStorage <em>Product Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Storage</em>'.
	 * @see com.lvefunc.workcenter.model.ProductStorage
	 * @generated
	 */
	EClass getProductStorage();

	/**
	 * Returns the meta object for the reference list '{@link com.lvefunc.workcenter.model.ProductStorage#getProductStorageEntries <em>Product Storage Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Storage Entries</em>'.
	 * @see com.lvefunc.workcenter.model.ProductStorage#getProductStorageEntries()
	 * @see #getProductStorage()
	 * @generated
	 */
	EReference getProductStorage_ProductStorageEntries();

	/**
	 * Returns the meta object for class '{@link com.lvefunc.workcenter.model.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see com.lvefunc.workcenter.model.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link com.lvefunc.workcenter.model.Product#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.lvefunc.workcenter.model.Product#getId()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.lvefunc.workcenter.model.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.lvefunc.workcenter.model.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for class '{@link com.lvefunc.workcenter.model.ProductSpecification <em>Product Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Specification</em>'.
	 * @see com.lvefunc.workcenter.model.ProductSpecification
	 * @generated
	 */
	EClass getProductSpecification();

	/**
	 * Returns the meta object for the reference '{@link com.lvefunc.workcenter.model.ProductSpecification#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see com.lvefunc.workcenter.model.ProductSpecification#getProduct()
	 * @see #getProductSpecification()
	 * @generated
	 */
	EReference getProductSpecification_Product();

	/**
	 * Returns the meta object for the reference '{@link com.lvefunc.workcenter.model.ProductSpecification#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Material</em>'.
	 * @see com.lvefunc.workcenter.model.ProductSpecification#getMaterial()
	 * @see #getProductSpecification()
	 * @generated
	 */
	EReference getProductSpecification_Material();

	/**
	 * Returns the meta object for the attribute '{@link com.lvefunc.workcenter.model.ProductSpecification#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see com.lvefunc.workcenter.model.ProductSpecification#getAmount()
	 * @see #getProductSpecification()
	 * @generated
	 */
	EAttribute getProductSpecification_Amount();

	/**
	 * Returns the meta object for class '{@link com.lvefunc.workcenter.model.MaterialStorageEntry <em>Material Storage Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material Storage Entry</em>'.
	 * @see com.lvefunc.workcenter.model.MaterialStorageEntry
	 * @generated
	 */
	EClass getMaterialStorageEntry();

	/**
	 * Returns the meta object for the attribute '{@link com.lvefunc.workcenter.model.MaterialStorageEntry#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see com.lvefunc.workcenter.model.MaterialStorageEntry#getAmount()
	 * @see #getMaterialStorageEntry()
	 * @generated
	 */
	EAttribute getMaterialStorageEntry_Amount();

	/**
	 * Returns the meta object for the reference '{@link com.lvefunc.workcenter.model.MaterialStorageEntry#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Material</em>'.
	 * @see com.lvefunc.workcenter.model.MaterialStorageEntry#getMaterial()
	 * @see #getMaterialStorageEntry()
	 * @generated
	 */
	EReference getMaterialStorageEntry_Material();

	/**
	 * Returns the meta object for class '{@link com.lvefunc.workcenter.model.StorageEntry <em>Storage Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Entry</em>'.
	 * @see com.lvefunc.workcenter.model.StorageEntry
	 * @generated
	 */
	EClass getStorageEntry();

	/**
	 * Returns the meta object for class '{@link com.lvefunc.workcenter.model.ProductStorageEntry <em>Product Storage Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Storage Entry</em>'.
	 * @see com.lvefunc.workcenter.model.ProductStorageEntry
	 * @generated
	 */
	EClass getProductStorageEntry();

	/**
	 * Returns the meta object for the attribute '{@link com.lvefunc.workcenter.model.ProductStorageEntry#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see com.lvefunc.workcenter.model.ProductStorageEntry#getAmount()
	 * @see #getProductStorageEntry()
	 * @generated
	 */
	EAttribute getProductStorageEntry_Amount();

	/**
	 * Returns the meta object for the reference '{@link com.lvefunc.workcenter.model.ProductStorageEntry#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see com.lvefunc.workcenter.model.ProductStorageEntry#getProduct()
	 * @see #getProductStorageEntry()
	 * @generated
	 */
	EReference getProductStorageEntry_Product();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.lvefunc.workcenter.model.impl.WorkcenterImpl <em>Workcenter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lvefunc.workcenter.model.impl.WorkcenterImpl
		 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getWorkcenter()
		 * @generated
		 */
		EClass WORKCENTER = eINSTANCE.getWorkcenter();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKCENTER__ID = eINSTANCE.getWorkcenter_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKCENTER__NAME = eINSTANCE.getWorkcenter_Name();

		/**
		 * The meta object literal for the '<em><b>Material Warehouse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKCENTER__MATERIAL_WAREHOUSE = eINSTANCE.getWorkcenter_MaterialWarehouse();

		/**
		 * The meta object literal for the '<em><b>Product Warehouse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKCENTER__PRODUCT_WAREHOUSE = eINSTANCE.getWorkcenter_ProductWarehouse();

		/**
		 * The meta object literal for the '<em><b>Product Specifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKCENTER__PRODUCT_SPECIFICATIONS = eINSTANCE.getWorkcenter_ProductSpecifications();

		/**
		 * The meta object literal for the '{@link com.lvefunc.workcenter.model.impl.MaterialWarehouseImpl <em>Material Warehouse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lvefunc.workcenter.model.impl.MaterialWarehouseImpl
		 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getMaterialWarehouse()
		 * @generated
		 */
		EClass MATERIAL_WAREHOUSE = eINSTANCE.getMaterialWarehouse();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_WAREHOUSE__ID = eINSTANCE.getMaterialWarehouse_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_WAREHOUSE__NAME = eINSTANCE.getMaterialWarehouse_Name();

		/**
		 * The meta object literal for the '<em><b>Material Storage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_WAREHOUSE__MATERIAL_STORAGE = eINSTANCE.getMaterialWarehouse_MaterialStorage();

		/**
		 * The meta object literal for the '{@link com.lvefunc.workcenter.model.impl.MaterialStorageImpl <em>Material Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lvefunc.workcenter.model.impl.MaterialStorageImpl
		 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getMaterialStorage()
		 * @generated
		 */
		EClass MATERIAL_STORAGE = eINSTANCE.getMaterialStorage();

		/**
		 * The meta object literal for the '<em><b>Material Storage Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_STORAGE__MATERIAL_STORAGE_ENTRIES = eINSTANCE.getMaterialStorage_MaterialStorageEntries();

		/**
		 * The meta object literal for the '{@link com.lvefunc.workcenter.model.impl.MaterialImpl <em>Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lvefunc.workcenter.model.impl.MaterialImpl
		 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getMaterial()
		 * @generated
		 */
		EClass MATERIAL = eINSTANCE.getMaterial();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL__ID = eINSTANCE.getMaterial_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL__NAME = eINSTANCE.getMaterial_Name();

		/**
		 * The meta object literal for the '{@link com.lvefunc.workcenter.model.Warehouse <em>Warehouse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lvefunc.workcenter.model.Warehouse
		 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getWarehouse()
		 * @generated
		 */
		EClass WAREHOUSE = eINSTANCE.getWarehouse();

		/**
		 * The meta object literal for the '{@link com.lvefunc.workcenter.model.Storage <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lvefunc.workcenter.model.Storage
		 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '{@link com.lvefunc.workcenter.model.impl.ProductWarehouseImpl <em>Product Warehouse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lvefunc.workcenter.model.impl.ProductWarehouseImpl
		 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getProductWarehouse()
		 * @generated
		 */
		EClass PRODUCT_WAREHOUSE = eINSTANCE.getProductWarehouse();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_WAREHOUSE__ID = eINSTANCE.getProductWarehouse_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_WAREHOUSE__NAME = eINSTANCE.getProductWarehouse_Name();

		/**
		 * The meta object literal for the '<em><b>Product Storage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_WAREHOUSE__PRODUCT_STORAGE = eINSTANCE.getProductWarehouse_ProductStorage();

		/**
		 * The meta object literal for the '{@link com.lvefunc.workcenter.model.impl.ProductStorageImpl <em>Product Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lvefunc.workcenter.model.impl.ProductStorageImpl
		 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getProductStorage()
		 * @generated
		 */
		EClass PRODUCT_STORAGE = eINSTANCE.getProductStorage();

		/**
		 * The meta object literal for the '<em><b>Product Storage Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORAGE__PRODUCT_STORAGE_ENTRIES = eINSTANCE.getProductStorage_ProductStorageEntries();

		/**
		 * The meta object literal for the '{@link com.lvefunc.workcenter.model.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lvefunc.workcenter.model.impl.ProductImpl
		 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__ID = eINSTANCE.getProduct_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '{@link com.lvefunc.workcenter.model.impl.ProductSpecificationImpl <em>Product Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lvefunc.workcenter.model.impl.ProductSpecificationImpl
		 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getProductSpecification()
		 * @generated
		 */
		EClass PRODUCT_SPECIFICATION = eINSTANCE.getProductSpecification();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPECIFICATION__PRODUCT = eINSTANCE.getProductSpecification_Product();

		/**
		 * The meta object literal for the '<em><b>Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SPECIFICATION__MATERIAL = eINSTANCE.getProductSpecification_Material();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SPECIFICATION__AMOUNT = eINSTANCE.getProductSpecification_Amount();

		/**
		 * The meta object literal for the '{@link com.lvefunc.workcenter.model.impl.MaterialStorageEntryImpl <em>Material Storage Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lvefunc.workcenter.model.impl.MaterialStorageEntryImpl
		 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getMaterialStorageEntry()
		 * @generated
		 */
		EClass MATERIAL_STORAGE_ENTRY = eINSTANCE.getMaterialStorageEntry();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_STORAGE_ENTRY__AMOUNT = eINSTANCE.getMaterialStorageEntry_Amount();

		/**
		 * The meta object literal for the '<em><b>Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_STORAGE_ENTRY__MATERIAL = eINSTANCE.getMaterialStorageEntry_Material();

		/**
		 * The meta object literal for the '{@link com.lvefunc.workcenter.model.StorageEntry <em>Storage Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lvefunc.workcenter.model.StorageEntry
		 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getStorageEntry()
		 * @generated
		 */
		EClass STORAGE_ENTRY = eINSTANCE.getStorageEntry();

		/**
		 * The meta object literal for the '{@link com.lvefunc.workcenter.model.impl.ProductStorageEntryImpl <em>Product Storage Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.lvefunc.workcenter.model.impl.ProductStorageEntryImpl
		 * @see com.lvefunc.workcenter.model.impl.ModelPackageImpl#getProductStorageEntry()
		 * @generated
		 */
		EClass PRODUCT_STORAGE_ENTRY = eINSTANCE.getProductStorageEntry();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORAGE_ENTRY__AMOUNT = eINSTANCE.getProductStorageEntry_Amount();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORAGE_ENTRY__PRODUCT = eINSTANCE.getProductStorageEntry_Product();

	}

} //ModelPackage
