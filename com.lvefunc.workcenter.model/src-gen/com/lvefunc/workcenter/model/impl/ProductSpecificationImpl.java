/**
 */
package com.lvefunc.workcenter.model.impl;

import com.lvefunc.workcenter.model.Material;
import com.lvefunc.workcenter.model.ModelPackage;
import com.lvefunc.workcenter.model.Product;
import com.lvefunc.workcenter.model.ProductSpecification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.lvefunc.workcenter.model.impl.ProductSpecificationImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.impl.ProductSpecificationImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.impl.ProductSpecificationImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductSpecificationImpl extends MinimalEObjectImpl.Container implements ProductSpecification {
	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Product product;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected Material material;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected int amount = AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PRODUCT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject) product;
			product = (Product) eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.PRODUCT_SPECIFICATION__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(Product newProduct) {
		Product oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCT_SPECIFICATION__PRODUCT,
					oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Material getMaterial() {
		if (material != null && material.eIsProxy()) {
			InternalEObject oldMaterial = (InternalEObject) material;
			material = (Material) eResolveProxy(oldMaterial);
			if (material != oldMaterial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.PRODUCT_SPECIFICATION__MATERIAL, oldMaterial, material));
			}
		}
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Material basicGetMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaterial(Material newMaterial) {
		Material oldMaterial = material;
		material = newMaterial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCT_SPECIFICATION__MATERIAL,
					oldMaterial, material));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(int newAmount) {
		int oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCT_SPECIFICATION__AMOUNT, oldAmount,
					amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.PRODUCT_SPECIFICATION__PRODUCT:
			if (resolve)
				return getProduct();
			return basicGetProduct();
		case ModelPackage.PRODUCT_SPECIFICATION__MATERIAL:
			if (resolve)
				return getMaterial();
			return basicGetMaterial();
		case ModelPackage.PRODUCT_SPECIFICATION__AMOUNT:
			return getAmount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.PRODUCT_SPECIFICATION__PRODUCT:
			setProduct((Product) newValue);
			return;
		case ModelPackage.PRODUCT_SPECIFICATION__MATERIAL:
			setMaterial((Material) newValue);
			return;
		case ModelPackage.PRODUCT_SPECIFICATION__AMOUNT:
			setAmount((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.PRODUCT_SPECIFICATION__PRODUCT:
			setProduct((Product) null);
			return;
		case ModelPackage.PRODUCT_SPECIFICATION__MATERIAL:
			setMaterial((Material) null);
			return;
		case ModelPackage.PRODUCT_SPECIFICATION__AMOUNT:
			setAmount(AMOUNT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelPackage.PRODUCT_SPECIFICATION__PRODUCT:
			return product != null;
		case ModelPackage.PRODUCT_SPECIFICATION__MATERIAL:
			return material != null;
		case ModelPackage.PRODUCT_SPECIFICATION__AMOUNT:
			return amount != AMOUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (amount: ");
		result.append(amount);
		result.append(')');
		return result.toString();
	}

} //ProductSpecificationImpl
