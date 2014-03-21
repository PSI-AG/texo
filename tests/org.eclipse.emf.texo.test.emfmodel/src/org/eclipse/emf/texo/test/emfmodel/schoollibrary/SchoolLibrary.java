/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.test.emfmodel.schoollibrary;

import org.eclipse.emf.texo.test.emfmodel.library.Library;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>School Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.test.emfmodel.schoollibrary.SchoolLibrary#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.test.emfmodel.schoollibrary.SchoollibraryPackage#getSchoolLibrary()
 * @model
 * @generated
 */
public interface SchoolLibrary extends Library {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.eclipse.emf.texo.test.emfmodel.schoollibrary.SchoollibraryPackage#getSchoolLibrary_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.test.emfmodel.schoollibrary.SchoolLibrary#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // SchoolLibrary
