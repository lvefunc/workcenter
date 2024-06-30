/**
 */
package com.lvefunc.workcenter.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Storage Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lvefunc.workcenter.model.ProductStorageEntry#getAmount <em>Amount</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.ProductStorageEntry#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see com.lvefunc.workcenter.model.ModelPackage#getProductStorageEntry()
 * @model
 * @generated
 */
public interface ProductStorageEntry extends StorageEntry {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(int)
	 * @see com.lvefunc.workcenter.model.ModelPackage#getProductStorageEntry_Amount()
	 * @model
	 * @generated
	 */
	int getAmount();

	/**
	 * Sets the value of the '{@link com.lvefunc.workcenter.model.ProductStorageEntry#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(int value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see com.lvefunc.workcenter.model.ModelPackage#getProductStorageEntry_Product()
	 * @model required="true"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link com.lvefunc.workcenter.model.ProductStorageEntry#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

} // ProductStorageEntry
