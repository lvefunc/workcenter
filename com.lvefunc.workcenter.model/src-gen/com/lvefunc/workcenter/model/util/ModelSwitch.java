/**
 */
package com.lvefunc.workcenter.model.util;

import com.lvefunc.workcenter.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.lvefunc.workcenter.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ModelPackage.WORKCENTER: {
			Workcenter workcenter = (Workcenter) theEObject;
			T result = caseWorkcenter(workcenter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.MATERIAL_WAREHOUSE: {
			MaterialWarehouse materialWarehouse = (MaterialWarehouse) theEObject;
			T result = caseMaterialWarehouse(materialWarehouse);
			if (result == null)
				result = caseWarehouse(materialWarehouse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.MATERIAL_STORAGE: {
			MaterialStorage materialStorage = (MaterialStorage) theEObject;
			T result = caseMaterialStorage(materialStorage);
			if (result == null)
				result = caseStorage(materialStorage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.MATERIAL: {
			Material material = (Material) theEObject;
			T result = caseMaterial(material);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.WAREHOUSE: {
			Warehouse warehouse = (Warehouse) theEObject;
			T result = caseWarehouse(warehouse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.STORAGE: {
			Storage storage = (Storage) theEObject;
			T result = caseStorage(storage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.PRODUCT_WAREHOUSE: {
			ProductWarehouse productWarehouse = (ProductWarehouse) theEObject;
			T result = caseProductWarehouse(productWarehouse);
			if (result == null)
				result = caseWarehouse(productWarehouse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.PRODUCT_STORAGE: {
			ProductStorage productStorage = (ProductStorage) theEObject;
			T result = caseProductStorage(productStorage);
			if (result == null)
				result = caseStorage(productStorage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.PRODUCT: {
			Product product = (Product) theEObject;
			T result = caseProduct(product);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.PRODUCT_SPECIFICATION: {
			ProductSpecification productSpecification = (ProductSpecification) theEObject;
			T result = caseProductSpecification(productSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.MATERIAL_STORAGE_ENTRY: {
			MaterialStorageEntry materialStorageEntry = (MaterialStorageEntry) theEObject;
			T result = caseMaterialStorageEntry(materialStorageEntry);
			if (result == null)
				result = caseStorageEntry(materialStorageEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.STORAGE_ENTRY: {
			StorageEntry storageEntry = (StorageEntry) theEObject;
			T result = caseStorageEntry(storageEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ModelPackage.PRODUCT_STORAGE_ENTRY: {
			ProductStorageEntry productStorageEntry = (ProductStorageEntry) theEObject;
			T result = caseProductStorageEntry(productStorageEntry);
			if (result == null)
				result = caseStorageEntry(productStorageEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workcenter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workcenter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkcenter(Workcenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material Warehouse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material Warehouse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialWarehouse(MaterialWarehouse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialStorage(MaterialStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterial(Material object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Warehouse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Warehouse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWarehouse(Warehouse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Warehouse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Warehouse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductWarehouse(ProductWarehouse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductStorage(ProductStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductSpecification(ProductSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material Storage Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material Storage Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialStorageEntry(MaterialStorageEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageEntry(StorageEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Storage Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Storage Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductStorageEntry(ProductStorageEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
