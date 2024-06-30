/**
 */
package com.lvefunc.workcenter.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lvefunc.workcenter.model.ProductStorage#getProductStorageEntries <em>Product Storage Entries</em>}</li>
 * </ul>
 *
 * @see com.lvefunc.workcenter.model.ModelPackage#getProductStorage()
 * @model
 * @generated
 */
public interface ProductStorage extends Storage {
	/**
	 * Returns the value of the '<em><b>Product Storage Entries</b></em>' reference list.
	 * The list contents are of type {@link com.lvefunc.workcenter.model.ProductStorageEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Storage Entries</em>' reference list.
	 * @see com.lvefunc.workcenter.model.ModelPackage#getProductStorage_ProductStorageEntries()
	 * @model
	 * @generated
	 */
	EList<ProductStorageEntry> getProductStorageEntries();

} // ProductStorage
