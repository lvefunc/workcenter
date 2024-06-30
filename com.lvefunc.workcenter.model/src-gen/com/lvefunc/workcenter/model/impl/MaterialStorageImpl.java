/**
 */
package com.lvefunc.workcenter.model.impl;

import com.lvefunc.workcenter.model.MaterialStorage;
import com.lvefunc.workcenter.model.MaterialStorageEntry;
import com.lvefunc.workcenter.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.lvefunc.workcenter.model.impl.MaterialStorageImpl#getMaterialStorageEntries <em>Material Storage Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialStorageImpl extends MinimalEObjectImpl.Container implements MaterialStorage {
	/**
	 * The cached value of the '{@link #getMaterialStorageEntries() <em>Material Storage Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialStorageEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<MaterialStorageEntry> materialStorageEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialStorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MATERIAL_STORAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MaterialStorageEntry> getMaterialStorageEntries() {
		if (materialStorageEntries == null) {
			materialStorageEntries = new EObjectResolvingEList<MaterialStorageEntry>(MaterialStorageEntry.class, this,
					ModelPackage.MATERIAL_STORAGE__MATERIAL_STORAGE_ENTRIES);
		}
		return materialStorageEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.MATERIAL_STORAGE__MATERIAL_STORAGE_ENTRIES:
			return getMaterialStorageEntries();
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
		case ModelPackage.MATERIAL_STORAGE__MATERIAL_STORAGE_ENTRIES:
			getMaterialStorageEntries().clear();
			getMaterialStorageEntries().addAll((Collection<? extends MaterialStorageEntry>) newValue);
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
		case ModelPackage.MATERIAL_STORAGE__MATERIAL_STORAGE_ENTRIES:
			getMaterialStorageEntries().clear();
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
		case ModelPackage.MATERIAL_STORAGE__MATERIAL_STORAGE_ENTRIES:
			return materialStorageEntries != null && !materialStorageEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MaterialStorageImpl
