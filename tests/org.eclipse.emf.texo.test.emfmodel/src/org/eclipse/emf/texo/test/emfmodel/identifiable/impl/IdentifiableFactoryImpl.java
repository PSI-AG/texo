/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.test.emfmodel.identifiable.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.texo.test.emfmodel.identifiable.IdentifiableFactory;
import org.eclipse.emf.texo.test.emfmodel.identifiable.IdentifiablePackage;
import org.eclipse.emf.texo.test.emfmodel.identifiable.NotIdentifiable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentifiableFactoryImpl extends EFactoryImpl implements IdentifiableFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static IdentifiableFactory init() {
    try {
      IdentifiableFactory theIdentifiableFactory = (IdentifiableFactory)EPackage.Registry.INSTANCE.getEFactory(IdentifiablePackage.eNS_URI);
      if (theIdentifiableFactory != null) {
        return theIdentifiableFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IdentifiableFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public IdentifiableFactoryImpl() {
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
      case IdentifiablePackage.NOT_IDENTIFIABLE: return createNotIdentifiable();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotIdentifiable createNotIdentifiable() {
    NotIdentifiableImpl notIdentifiable = new NotIdentifiableImpl();
    return notIdentifiable;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public IdentifiablePackage getIdentifiablePackage() {
    return (IdentifiablePackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static IdentifiablePackage getPackage() {
    return IdentifiablePackage.eINSTANCE;
  }

} //IdentifiableFactoryImpl
