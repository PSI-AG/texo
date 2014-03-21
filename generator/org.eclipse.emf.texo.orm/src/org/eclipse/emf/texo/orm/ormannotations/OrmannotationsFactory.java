/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmannotationsFactory.java,v 1.6 2011/09/23 21:00:39 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage
 * @generated
 */
public class OrmannotationsFactory extends EFactoryImpl {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final OrmannotationsFactory eINSTANCE = init();

  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static OrmannotationsFactory init() {
    try {
      OrmannotationsFactory theOrmannotationsFactory = (OrmannotationsFactory)EPackage.Registry.INSTANCE.getEFactory(OrmannotationsPackage.eNS_URI);
      if (theOrmannotationsFactory != null) {
        return theOrmannotationsFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OrmannotationsFactory();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrmannotationsFactory() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case OrmannotationsPackage.EPACKAGE_ORM_ANNOTATION: return createEPackageORMAnnotation();
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION: return createEClassORMAnnotation();
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION: return createEAttributeORMAnnotation();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION: return createEReferenceORMAnnotation();
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION: return createEEnumORMAnnotation();
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION: return createEDataTypeORMAnnotation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EPackageORMAnnotation createEPackageORMAnnotation() {
    EPackageORMAnnotation ePackageORMAnnotation = new EPackageORMAnnotation();
    return ePackageORMAnnotation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClassORMAnnotation createEClassORMAnnotation() {
    EClassORMAnnotation eClassORMAnnotation = new EClassORMAnnotation();
    return eClassORMAnnotation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttributeORMAnnotation createEAttributeORMAnnotation() {
    EAttributeORMAnnotation eAttributeORMAnnotation = new EAttributeORMAnnotation();
    return eAttributeORMAnnotation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReferenceORMAnnotation createEReferenceORMAnnotation() {
    EReferenceORMAnnotation eReferenceORMAnnotation = new EReferenceORMAnnotation();
    return eReferenceORMAnnotation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnumORMAnnotation createEEnumORMAnnotation() {
    EEnumORMAnnotation eEnumORMAnnotation = new EEnumORMAnnotation();
    return eEnumORMAnnotation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataTypeORMAnnotation createEDataTypeORMAnnotation() {
    EDataTypeORMAnnotation eDataTypeORMAnnotation = new EDataTypeORMAnnotation();
    return eDataTypeORMAnnotation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public OrmannotationsPackage getOrmannotationsPackage() {
    return (OrmannotationsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OrmannotationsPackage getPackage() {
    return OrmannotationsPackage.eINSTANCE;
  }

} // OrmannotationsFactory
