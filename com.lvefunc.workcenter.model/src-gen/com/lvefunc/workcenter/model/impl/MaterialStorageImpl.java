/**
 */
package com.lvefunc.workcenter.model.impl;

import com.lvefunc.workcenter.model.Material;
import com.lvefunc.workcenter.model.MaterialStorage;
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
 *   <li>{@link com.lvefunc.workcenter.model.impl.MaterialStorageImpl#getMaterials <em>Materials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialStorageImpl extends MinimalEObjectImpl.Container implements MaterialStorage {
	/**
	 * The cached value of the '{@link #getMaterials() <em>Materials</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterials()
	 * @generated
	 * @ordered
	 */
	protected EList<Material> materials;

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
	public EList<Material> getMaterials() {
		if (materials == null) {
			materials = new EObjectResolvingEList<Material>(Material.class, this,
					ModelPackage.MATERIAL_STORAGE__MATERIALS);
		}
		return materials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.MATERIAL_STORAGE__MATERIALS:
			return getMaterials();
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
		case ModelPackage.MATERIAL_STORAGE__MATERIALS:
			getMaterials().clear();
			getMaterials().addAll((Collection<? extends Material>) newValue);
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
		case ModelPackage.MATERIAL_STORAGE__MATERIALS:
			getMaterials().clear();
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
		case ModelPackage.MATERIAL_STORAGE__MATERIALS:
			return materials != null && !materials.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MaterialStorageImpl
