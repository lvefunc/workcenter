/**
 */
package com.lvefunc.workcenter.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.lvefunc.workcenter.model.MaterialStorage#getMaterialStorageEntries <em>Material Storage Entries</em>}</li>
 * </ul>
 *
 * @see com.lvefunc.workcenter.model.ModelPackage#getMaterialStorage()
 * @model
 * @generated
 */
public interface MaterialStorage extends Storage {
	/**
	 * Returns the value of the '<em><b>Material Storage Entries</b></em>' reference list.
	 * The list contents are of type {@link com.lvefunc.workcenter.model.MaterialStorageEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Storage Entries</em>' reference list.
	 * @see com.lvefunc.workcenter.model.ModelPackage#getMaterialStorage_MaterialStorageEntries()
	 * @model
	 * @generated
	 */
	EList<MaterialStorageEntry> getMaterialStorageEntries();

} // MaterialStorage
