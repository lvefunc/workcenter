/**
 */
package com.lvefunc.workcenter.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Warehouse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lvefunc.workcenter.model.ProductWarehouse#getId <em>Id</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.ProductWarehouse#getName <em>Name</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.ProductWarehouse#getProductStorage <em>Product Storage</em>}</li>
 * </ul>
 *
 * @see com.lvefunc.workcenter.model.ModelPackage#getProductWarehouse()
 * @model
 * @generated
 */
public interface ProductWarehouse extends Warehouse {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see com.lvefunc.workcenter.model.ModelPackage#getProductWarehouse_Id()
	 * @model id="true" changeable="false"
	 * @generated
	 */
	int getId();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.lvefunc.workcenter.model.ModelPackage#getProductWarehouse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.lvefunc.workcenter.model.ProductWarehouse#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Product Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Storage</em>' reference.
	 * @see #setProductStorage(ProductStorage)
	 * @see com.lvefunc.workcenter.model.ModelPackage#getProductWarehouse_ProductStorage()
	 * @model required="true"
	 * @generated
	 */
	ProductStorage getProductStorage();

	/**
	 * Sets the value of the '{@link com.lvefunc.workcenter.model.ProductWarehouse#getProductStorage <em>Product Storage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Storage</em>' reference.
	 * @see #getProductStorage()
	 * @generated
	 */
	void setProductStorage(ProductStorage value);

} // ProductWarehouse
