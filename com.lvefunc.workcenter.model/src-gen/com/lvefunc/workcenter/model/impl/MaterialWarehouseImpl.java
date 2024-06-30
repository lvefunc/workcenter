/**
 */
package com.lvefunc.workcenter.model.impl;

import com.lvefunc.workcenter.model.MaterialStorage;
import com.lvefunc.workcenter.model.MaterialWarehouse;
import com.lvefunc.workcenter.model.ModelPackage;

import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material Warehouse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.lvefunc.workcenter.model.impl.MaterialWarehouseImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.impl.MaterialWarehouseImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.impl.MaterialWarehouseImpl#getMaterialStorage <em>Material Storage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialWarehouseImpl extends MinimalEObjectImpl.Container implements MaterialWarehouse {
	private static AtomicInteger idCounter = new AtomicInteger();

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
	 * The cached value of the '{@link #getMaterialStorage() <em>Material Storage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialStorage()
	 * @generated
	 * @ordered
	 */
	protected MaterialStorage materialStorage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialWarehouseImpl() {
		super();
		this.id = idCounter.getAndIncrement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MATERIAL_WAREHOUSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MATERIAL_WAREHOUSE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialStorage getMaterialStorage() {
		if (materialStorage != null && materialStorage.eIsProxy()) {
			InternalEObject oldMaterialStorage = (InternalEObject) materialStorage;
			materialStorage = (MaterialStorage) eResolveProxy(oldMaterialStorage);
			if (materialStorage != oldMaterialStorage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.MATERIAL_WAREHOUSE__MATERIAL_STORAGE, oldMaterialStorage, materialStorage));
			}
		}
		return materialStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialStorage basicGetMaterialStorage() {
		return materialStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaterialStorage(MaterialStorage newMaterialStorage) {
		MaterialStorage oldMaterialStorage = materialStorage;
		materialStorage = newMaterialStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MATERIAL_WAREHOUSE__MATERIAL_STORAGE,
					oldMaterialStorage, materialStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.MATERIAL_WAREHOUSE__ID:
			return getId();
		case ModelPackage.MATERIAL_WAREHOUSE__NAME:
			return getName();
		case ModelPackage.MATERIAL_WAREHOUSE__MATERIAL_STORAGE:
			if (resolve)
				return getMaterialStorage();
			return basicGetMaterialStorage();
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
		case ModelPackage.MATERIAL_WAREHOUSE__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.MATERIAL_WAREHOUSE__MATERIAL_STORAGE:
			setMaterialStorage((MaterialStorage) newValue);
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
		case ModelPackage.MATERIAL_WAREHOUSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.MATERIAL_WAREHOUSE__MATERIAL_STORAGE:
			setMaterialStorage((MaterialStorage) null);
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
		case ModelPackage.MATERIAL_WAREHOUSE__ID:
			return id != ID_EDEFAULT;
		case ModelPackage.MATERIAL_WAREHOUSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.MATERIAL_WAREHOUSE__MATERIAL_STORAGE:
			return materialStorage != null;
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

} //MaterialWarehouseImpl
