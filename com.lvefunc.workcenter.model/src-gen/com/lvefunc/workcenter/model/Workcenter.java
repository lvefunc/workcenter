/**
 */
package com.lvefunc.workcenter.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workcenter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lvefunc.workcenter.model.Workcenter#getId <em>Id</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.Workcenter#getName <em>Name</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.Workcenter#getMaterialWarehouse <em>Material Warehouse</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.Workcenter#getProductWarehouse <em>Product Warehouse</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.Workcenter#getProductSpecifications <em>Product Specifications</em>}</li>
 * </ul>
 *
 * @see com.lvefunc.workcenter.model.ModelPackage#getWorkcenter()
 * @model
 * @generated
 */
public interface Workcenter extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see com.lvefunc.workcenter.model.ModelPackage#getWorkcenter_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link com.lvefunc.workcenter.model.Workcenter#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.lvefunc.workcenter.model.ModelPackage#getWorkcenter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.lvefunc.workcenter.model.Workcenter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Material Warehouse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Warehouse</em>' reference.
	 * @see #setMaterialWarehouse(MaterialWarehouse)
	 * @see com.lvefunc.workcenter.model.ModelPackage#getWorkcenter_MaterialWarehouse()
	 * @model required="true"
	 * @generated
	 */
	MaterialWarehouse getMaterialWarehouse();

	/**
	 * Sets the value of the '{@link com.lvefunc.workcenter.model.Workcenter#getMaterialWarehouse <em>Material Warehouse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Warehouse</em>' reference.
	 * @see #getMaterialWarehouse()
	 * @generated
	 */
	void setMaterialWarehouse(MaterialWarehouse value);

	/**
	 * Returns the value of the '<em><b>Product Warehouse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Warehouse</em>' reference.
	 * @see #setProductWarehouse(ProductWarehouse)
	 * @see com.lvefunc.workcenter.model.ModelPackage#getWorkcenter_ProductWarehouse()
	 * @model required="true"
	 * @generated
	 */
	ProductWarehouse getProductWarehouse();

	/**
	 * Sets the value of the '{@link com.lvefunc.workcenter.model.Workcenter#getProductWarehouse <em>Product Warehouse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Warehouse</em>' reference.
	 * @see #getProductWarehouse()
	 * @generated
	 */
	void setProductWarehouse(ProductWarehouse value);

	/**
	 * Returns the value of the '<em><b>Product Specifications</b></em>' reference list.
	 * The list contents are of type {@link com.lvefunc.workcenter.model.ProductSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Specifications</em>' reference list.
	 * @see com.lvefunc.workcenter.model.ModelPackage#getWorkcenter_ProductSpecifications()
	 * @model
	 * @generated
	 */
	EList<ProductSpecification> getProductSpecifications();

} // Workcenter
