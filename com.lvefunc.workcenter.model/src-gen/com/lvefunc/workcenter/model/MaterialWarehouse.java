/**
 */
package com.lvefunc.workcenter.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material Warehouse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lvefunc.workcenter.model.MaterialWarehouse#getId <em>Id</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.MaterialWarehouse#getName <em>Name</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.MaterialWarehouse#getMaterialStorage <em>Material Storage</em>}</li>
 * </ul>
 *
 * @see com.lvefunc.workcenter.model.ModelPackage#getMaterialWarehouse()
 * @model
 * @generated
 */
public interface MaterialWarehouse extends Warehouse {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see com.lvefunc.workcenter.model.ModelPackage#getMaterialWarehouse_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link com.lvefunc.workcenter.model.MaterialWarehouse#getId <em>Id</em>}' attribute.
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
	 * @see com.lvefunc.workcenter.model.ModelPackage#getMaterialWarehouse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.lvefunc.workcenter.model.MaterialWarehouse#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Material Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Storage</em>' reference.
	 * @see #setMaterialStorage(MaterialStorage)
	 * @see com.lvefunc.workcenter.model.ModelPackage#getMaterialWarehouse_MaterialStorage()
	 * @model required="true"
	 * @generated
	 */
	MaterialStorage getMaterialStorage();

	/**
	 * Sets the value of the '{@link com.lvefunc.workcenter.model.MaterialWarehouse#getMaterialStorage <em>Material Storage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Storage</em>' reference.
	 * @see #getMaterialStorage()
	 * @generated
	 */
	void setMaterialStorage(MaterialStorage value);

} // MaterialWarehouse
