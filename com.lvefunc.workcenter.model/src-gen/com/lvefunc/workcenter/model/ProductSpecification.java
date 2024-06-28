/**
 */
package com.lvefunc.workcenter.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lvefunc.workcenter.model.ProductSpecification#getProduct <em>Product</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.ProductSpecification#getMaterial <em>Material</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.ProductSpecification#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see com.lvefunc.workcenter.model.ModelPackage#getProductSpecification()
 * @model
 * @generated
 */
public interface ProductSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see com.lvefunc.workcenter.model.ModelPackage#getProductSpecification_Product()
	 * @model required="true"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link com.lvefunc.workcenter.model.ProductSpecification#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' reference.
	 * @see #setMaterial(Material)
	 * @see com.lvefunc.workcenter.model.ModelPackage#getProductSpecification_Material()
	 * @model required="true"
	 * @generated
	 */
	Material getMaterial();

	/**
	 * Sets the value of the '{@link com.lvefunc.workcenter.model.ProductSpecification#getMaterial <em>Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(Material value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(int)
	 * @see com.lvefunc.workcenter.model.ModelPackage#getProductSpecification_Amount()
	 * @model
	 * @generated
	 */
	int getAmount();

	/**
	 * Sets the value of the '{@link com.lvefunc.workcenter.model.ProductSpecification#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(int value);

} // ProductSpecification
