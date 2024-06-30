/**
 */
package com.lvefunc.workcenter.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.lvefunc.workcenter.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = com.lvefunc.workcenter.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workcenter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workcenter</em>'.
	 * @generated
	 */
	Workcenter createWorkcenter();

	/**
	 * Returns a new object of class '<em>Material Warehouse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Material Warehouse</em>'.
	 * @generated
	 */
	MaterialWarehouse createMaterialWarehouse();

	/**
	 * Returns a new object of class '<em>Material Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Material Storage</em>'.
	 * @generated
	 */
	MaterialStorage createMaterialStorage();

	/**
	 * Returns a new object of class '<em>Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Material</em>'.
	 * @generated
	 */
	Material createMaterial();

	/**
	 * Returns a new object of class '<em>Product Warehouse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Warehouse</em>'.
	 * @generated
	 */
	ProductWarehouse createProductWarehouse();

	/**
	 * Returns a new object of class '<em>Product Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Storage</em>'.
	 * @generated
	 */
	ProductStorage createProductStorage();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Product Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Specification</em>'.
	 * @generated
	 */
	ProductSpecification createProductSpecification();

	/**
	 * Returns a new object of class '<em>Material Storage Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Material Storage Entry</em>'.
	 * @generated
	 */
	MaterialStorageEntry createMaterialStorageEntry();

	/**
	 * Returns a new object of class '<em>Product Storage Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Storage Entry</em>'.
	 * @generated
	 */
	ProductStorageEntry createProductStorageEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
