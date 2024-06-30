/**
 */
package com.lvefunc.workcenter.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material Storage Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lvefunc.workcenter.model.MaterialStorageEntry#getAmount <em>Amount</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.MaterialStorageEntry#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @see com.lvefunc.workcenter.model.ModelPackage#getMaterialStorageEntry()
 * @model
 * @generated
 */
public interface MaterialStorageEntry extends StorageEntry {

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(int)
	 * @see com.lvefunc.workcenter.model.ModelPackage#getMaterialStorageEntry_Amount()
	 * @model
	 * @generated
	 */
	int getAmount();

	/**
	 * Sets the value of the '{@link com.lvefunc.workcenter.model.MaterialStorageEntry#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(int value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' reference.
	 * @see #setMaterial(Material)
	 * @see com.lvefunc.workcenter.model.ModelPackage#getMaterialStorageEntry_Material()
	 * @model required="true"
	 * @generated
	 */
	Material getMaterial();

	/**
	 * Sets the value of the '{@link com.lvefunc.workcenter.model.MaterialStorageEntry#getMaterial <em>Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(Material value);
} // MaterialStorageEntry
