/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.test.emfmodel.schoollibrary;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.test.emfmodel.schoollibrary.SchoollibraryPackage
 * @generated
 */
public interface SchoollibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchoollibraryFactory eINSTANCE = org.eclipse.emf.texo.test.emfmodel.schoollibrary.impl.SchoollibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>School Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>School Book</em>'.
	 * @generated
	 */
	SchoolBook createSchoolBook();

	/**
	 * Returns a new object of class '<em>School Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>School Library</em>'.
	 * @generated
	 */
	SchoolLibrary createSchoolLibrary();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchoollibraryPackage getSchoollibraryPackage();

} //SchoollibraryFactory
