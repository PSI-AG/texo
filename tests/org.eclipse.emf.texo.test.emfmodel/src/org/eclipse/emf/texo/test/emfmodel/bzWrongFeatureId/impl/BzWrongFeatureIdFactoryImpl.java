/**
 */
package org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BzWrongFeatureIdFactoryImpl extends EFactoryImpl implements BzWrongFeatureIdFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static BzWrongFeatureIdFactory init() {
    try {
      BzWrongFeatureIdFactory theBzWrongFeatureIdFactory = (BzWrongFeatureIdFactory)EPackage.Registry.INSTANCE.getEFactory(BzWrongFeatureIdPackage.eNS_URI);
      if (theBzWrongFeatureIdFactory != null) {
        return theBzWrongFeatureIdFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BzWrongFeatureIdFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BzWrongFeatureIdFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case BzWrongFeatureIdPackage.CONCRETE_CLASS: return createConcreteClass();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ConcreteClass createConcreteClass() {
    ConcreteClassImpl concreteClass = new ConcreteClassImpl();
    return concreteClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BzWrongFeatureIdPackage getBzWrongFeatureIdPackage() {
    return (BzWrongFeatureIdPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static BzWrongFeatureIdPackage getPackage() {
    return BzWrongFeatureIdPackage.eINSTANCE;
  }

} //BzWrongFeatureIdFactoryImpl
