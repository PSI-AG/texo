/**
 */
package org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.BzWrongFeatureIdPackage
 * @generated
 */
public interface BzWrongFeatureIdFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	BzWrongFeatureIdFactory eINSTANCE = org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.BzWrongFeatureIdFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Concrete Class</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Concrete Class</em>'.
   * @generated
   */
	ConcreteClass createConcreteClass();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	BzWrongFeatureIdPackage getBzWrongFeatureIdPackage();

} //BzWrongFeatureIdFactory
