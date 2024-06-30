/**
 */
package com.lvefunc.workcenter.model.impl;

import com.lvefunc.workcenter.model.MaterialWarehouse;
import com.lvefunc.workcenter.model.ModelPackage;
import com.lvefunc.workcenter.model.ProductSpecification;
import com.lvefunc.workcenter.model.ProductWarehouse;
import com.lvefunc.workcenter.model.Workcenter;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workcenter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.lvefunc.workcenter.model.impl.WorkcenterImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.impl.WorkcenterImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.impl.WorkcenterImpl#getMaterialWarehouse <em>Material Warehouse</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.impl.WorkcenterImpl#getProductWarehouse <em>Product Warehouse</em>}</li>
 *   <li>{@link com.lvefunc.workcenter.model.impl.WorkcenterImpl#getProductSpecifications <em>Product Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkcenterImpl extends MinimalEObjectImpl.Container implements Workcenter {
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
	 * The cached value of the '{@link #getMaterialWarehouse() <em>Material Warehouse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialWarehouse()
	 * @generated
	 * @ordered
	 */
	protected MaterialWarehouse materialWarehouse;

	/**
	 * The cached value of the '{@link #getProductWarehouse() <em>Product Warehouse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductWarehouse()
	 * @generated
	 * @ordered
	 */
	protected ProductWarehouse productWarehouse;

	/**
	 * The cached value of the '{@link #getProductSpecifications() <em>Product Specifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductSpecification> productSpecifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkcenterImpl() {
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
		return ModelPackage.Literals.WORKCENTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WORKCENTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialWarehouse getMaterialWarehouse() {
		if (materialWarehouse != null && materialWarehouse.eIsProxy()) {
			InternalEObject oldMaterialWarehouse = (InternalEObject) materialWarehouse;
			materialWarehouse = (MaterialWarehouse) eResolveProxy(oldMaterialWarehouse);
			if (materialWarehouse != oldMaterialWarehouse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.WORKCENTER__MATERIAL_WAREHOUSE, oldMaterialWarehouse, materialWarehouse));
			}
		}
		return materialWarehouse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialWarehouse basicGetMaterialWarehouse() {
		return materialWarehouse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaterialWarehouse(MaterialWarehouse newMaterialWarehouse) {
		MaterialWarehouse oldMaterialWarehouse = materialWarehouse;
		materialWarehouse = newMaterialWarehouse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WORKCENTER__MATERIAL_WAREHOUSE,
					oldMaterialWarehouse, materialWarehouse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductWarehouse getProductWarehouse() {
		if (productWarehouse != null && productWarehouse.eIsProxy()) {
			InternalEObject oldProductWarehouse = (InternalEObject) productWarehouse;
			productWarehouse = (ProductWarehouse) eResolveProxy(oldProductWarehouse);
			if (productWarehouse != oldProductWarehouse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelPackage.WORKCENTER__PRODUCT_WAREHOUSE, oldProductWarehouse, productWarehouse));
			}
		}
		return productWarehouse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductWarehouse basicGetProductWarehouse() {
		return productWarehouse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductWarehouse(ProductWarehouse newProductWarehouse) {
		ProductWarehouse oldProductWarehouse = productWarehouse;
		productWarehouse = newProductWarehouse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WORKCENTER__PRODUCT_WAREHOUSE,
					oldProductWarehouse, productWarehouse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductSpecification> getProductSpecifications() {
		if (productSpecifications == null) {
			productSpecifications = new EObjectResolvingEList<ProductSpecification>(ProductSpecification.class, this,
					ModelPackage.WORKCENTER__PRODUCT_SPECIFICATIONS);
		}
		return productSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.WORKCENTER__ID:
			return getId();
		case ModelPackage.WORKCENTER__NAME:
			return getName();
		case ModelPackage.WORKCENTER__MATERIAL_WAREHOUSE:
			if (resolve)
				return getMaterialWarehouse();
			return basicGetMaterialWarehouse();
		case ModelPackage.WORKCENTER__PRODUCT_WAREHOUSE:
			if (resolve)
				return getProductWarehouse();
			return basicGetProductWarehouse();
		case ModelPackage.WORKCENTER__PRODUCT_SPECIFICATIONS:
			return getProductSpecifications();
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
		case ModelPackage.WORKCENTER__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.WORKCENTER__MATERIAL_WAREHOUSE:
			setMaterialWarehouse((MaterialWarehouse) newValue);
			return;
		case ModelPackage.WORKCENTER__PRODUCT_WAREHOUSE:
			setProductWarehouse((ProductWarehouse) newValue);
			return;
		case ModelPackage.WORKCENTER__PRODUCT_SPECIFICATIONS:
			getProductSpecifications().clear();
			getProductSpecifications().addAll((Collection<? extends ProductSpecification>) newValue);
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
		case ModelPackage.WORKCENTER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.WORKCENTER__MATERIAL_WAREHOUSE:
			setMaterialWarehouse((MaterialWarehouse) null);
			return;
		case ModelPackage.WORKCENTER__PRODUCT_WAREHOUSE:
			setProductWarehouse((ProductWarehouse) null);
			return;
		case ModelPackage.WORKCENTER__PRODUCT_SPECIFICATIONS:
			getProductSpecifications().clear();
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
		case ModelPackage.WORKCENTER__ID:
			return id != ID_EDEFAULT;
		case ModelPackage.WORKCENTER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.WORKCENTER__MATERIAL_WAREHOUSE:
			return materialWarehouse != null;
		case ModelPackage.WORKCENTER__PRODUCT_WAREHOUSE:
			return productWarehouse != null;
		case ModelPackage.WORKCENTER__PRODUCT_SPECIFICATIONS:
			return productSpecifications != null && !productSpecifications.isEmpty();
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

} //WorkcenterImpl
