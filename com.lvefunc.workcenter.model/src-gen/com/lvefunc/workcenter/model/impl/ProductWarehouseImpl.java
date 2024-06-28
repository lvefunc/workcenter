/**
 */
package com.lvefunc.workcenter.model.impl;

import com.lvefunc.workcenter.model.ModelPackage;
import com.lvefunc.workcenter.model.ProductStorage;
import com.lvefunc.workcenter.model.ProductWarehouse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Warehouse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.lvefunc.workcenter.model.impl.ProductWarehouseImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.impl.ProductWarehouseImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.impl.ProductWarehouseImpl#getProductStorage <em>Product Storage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductWarehouseImpl extends MinimalEObjectImpl.Container implements ProductWarehouse {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductStorage() <em>Product Storage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStorage()
	 * @generated
	 * @ordered
	 */
	protected ProductStorage productStorage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductWarehouseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PRODUCT_WAREHOUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCT_WAREHOUSE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCT_WAREHOUSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStorage getProductStorage() {
		if (productStorage != null && productStorage.eIsProxy()) {
			InternalEObject oldProductStorage = (InternalEObject) productStorage;
			productStorage = (ProductStorage) eResolveProxy(oldProductStorage);
			if (productStorage != oldProductStorage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.PRODUCT_WAREHOUSE__PRODUCT_STORAGE, oldProductStorage, productStorage));
			}
		}
		return productStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStorage basicGetProductStorage() {
		return productStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStorage(ProductStorage newProductStorage) {
		ProductStorage oldProductStorage = productStorage;
		productStorage = newProductStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCT_WAREHOUSE__PRODUCT_STORAGE,
					oldProductStorage, productStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.PRODUCT_WAREHOUSE__ID:
			return getId();
		case ModelPackage.PRODUCT_WAREHOUSE__NAME:
			return getName();
		case ModelPackage.PRODUCT_WAREHOUSE__PRODUCT_STORAGE:
			if (resolve)
				return getProductStorage();
			return basicGetProductStorage();
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
		case ModelPackage.PRODUCT_WAREHOUSE__ID:
			setId((Integer) newValue);
			return;
		case ModelPackage.PRODUCT_WAREHOUSE__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.PRODUCT_WAREHOUSE__PRODUCT_STORAGE:
			setProductStorage((ProductStorage) newValue);
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
		case ModelPackage.PRODUCT_WAREHOUSE__ID:
			setId(ID_EDEFAULT);
			return;
		case ModelPackage.PRODUCT_WAREHOUSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.PRODUCT_WAREHOUSE__PRODUCT_STORAGE:
			setProductStorage((ProductStorage) null);
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
		case ModelPackage.PRODUCT_WAREHOUSE__ID:
			return id != ID_EDEFAULT;
		case ModelPackage.PRODUCT_WAREHOUSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.PRODUCT_WAREHOUSE__PRODUCT_STORAGE:
			return productStorage != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProductWarehouseImpl
