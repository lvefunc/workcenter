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
 *   <li>{@link com.lvefunc.workcenter.model.MaterialStorage#getMaterials <em>Materials</em>}</li>
 * </ul>
 *
 * @see com.lvefunc.workcenter.model.ModelPackage#getMaterialStorage()
 * @model
 * @generated
 */
public interface MaterialStorage extends Storage {
	/**
	 * Returns the value of the '<em><b>Materials</b></em>' reference list.
	 * The list contents are of type {@link com.lvefunc.workcenter.model.Material}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materials</em>' reference list.
	 * @see com.lvefunc.workcenter.model.ModelPackage#getMaterialStorage_Materials()
	 * @model
	 * @generated
	 */
	EList<Material> getMaterials();

} // MaterialStorage
