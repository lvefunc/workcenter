/**
 */
package com.lvefunc.workcenter.model.impl;

import com.lvefunc.workcenter.model.ModelPackage;
import com.lvefunc.workcenter.model.Product;
import com.lvefunc.workcenter.model.ProductStorage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.lvefunc.workcenter.model.impl.ProductStorageImpl#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductStorageImpl extends MinimalEObjectImpl.Container implements ProductStorage {
	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductStorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PRODUCT_STORAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectResolvingEList<Product>(Product.class, this, ModelPackage.PRODUCT_STORAGE__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.PRODUCT_STORAGE__PRODUCTS:
			return getProducts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.PRODUCT_STORAGE__PRODUCTS:
			getProducts().clear();
			getProducts().addAll((Collection<? extends Product>) newValue);
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
		case ModelPackage.PRODUCT_STORAGE__PRODUCTS:
			getProducts().clear();
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
		case ModelPackage.PRODUCT_STORAGE__PRODUCTS:
			return products != null && !products.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductStorageImpl
