/**
 */
package com.lvefunc.workcenter.model.util;

import com.lvefunc.workcenter.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.lvefunc.workcenter.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch = new ModelSwitch<Adapter>() {
		@Override
		public Adapter caseWorkcenter(Workcenter object) {
			return createWorkcenterAdapter();
		}

		@Override
		public Adapter caseMaterialWarehouse(MaterialWarehouse object) {
			return createMaterialWarehouseAdapter();
		}

		@Override
		public Adapter caseMaterialStorage(MaterialStorage object) {
			return createMaterialStorageAdapter();
		}

		@Override
		public Adapter caseMaterial(Material object) {
			return createMaterialAdapter();
		}

		@Override
		public Adapter caseWarehouse(Warehouse object) {
			return createWarehouseAdapter();
		}

		@Override
		public Adapter caseStorage(Storage object) {
			return createStorageAdapter();
		}

		@Override
		public Adapter caseProductWarehouse(ProductWarehouse object) {
			return createProductWarehouseAdapter();
		}

		@Override
		public Adapter caseProductStorage(ProductStorage object) {
			return createProductStorageAdapter();
		}

		@Override
		public Adapter caseProduct(Product object) {
			return createProductAdapter();
		}

		@Override
		public Adapter caseProductSpecification(ProductSpecification object) {
			return createProductSpecificationAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lvefunc.workcenter.model.Workcenter <em>Workcenter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lvefunc.workcenter.model.Workcenter
	 * @generated
	 */
	public Adapter createWorkcenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lvefunc.workcenter.model.MaterialWarehouse <em>Material Warehouse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lvefunc.workcenter.model.MaterialWarehouse
	 * @generated
	 */
	public Adapter createMaterialWarehouseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lvefunc.workcenter.model.MaterialStorage <em>Material Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lvefunc.workcenter.model.MaterialStorage
	 * @generated
	 */
	public Adapter createMaterialStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lvefunc.workcenter.model.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lvefunc.workcenter.model.Material
	 * @generated
	 */
	public Adapter createMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lvefunc.workcenter.model.Warehouse <em>Warehouse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lvefunc.workcenter.model.Warehouse
	 * @generated
	 */
	public Adapter createWarehouseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lvefunc.workcenter.model.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lvefunc.workcenter.model.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lvefunc.workcenter.model.ProductWarehouse <em>Product Warehouse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lvefunc.workcenter.model.ProductWarehouse
	 * @generated
	 */
	public Adapter createProductWarehouseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lvefunc.workcenter.model.ProductStorage <em>Product Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lvefunc.workcenter.model.ProductStorage
	 * @generated
	 */
	public Adapter createProductStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lvefunc.workcenter.model.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lvefunc.workcenter.model.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.lvefunc.workcenter.model.ProductSpecification <em>Product Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.lvefunc.workcenter.model.ProductSpecification
	 * @generated
	 */
	public Adapter createProductSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
