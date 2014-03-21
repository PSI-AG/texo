/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelcodegeneratorFactory.java,v 1.10 2011/09/23 11:03:00 mtaal Exp $
 */
package org.eclipse.emf.texo.modelgenerator.modelannotations;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage
 * @generated
 */
public class ModelcodegeneratorFactory extends EFactoryImpl {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static final ModelcodegeneratorFactory eINSTANCE = init();

  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static ModelcodegeneratorFactory init() {
    try {
      ModelcodegeneratorFactory theModelcodegeneratorFactory = (ModelcodegeneratorFactory)EPackage.Registry.INSTANCE.getEFactory(ModelcodegeneratorPackage.eNS_URI);
      if (theModelcodegeneratorFactory != null) {
        return theModelcodegeneratorFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ModelcodegeneratorFactory();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ModelcodegeneratorFactory() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case ModelcodegeneratorPackage.EPACKAGE_MODEL_GEN_ANNOTATION: return createEPackageModelGenAnnotation();
      case ModelcodegeneratorPackage.ECLASS_MODEL_GEN_ANNOTATION: return createEClassModelGenAnnotation();
      case ModelcodegeneratorPackage.EATTRIBUTE_MODEL_GEN_ANNOTATION: return createEAttributeModelGenAnnotation();
      case ModelcodegeneratorPackage.EREFERENCE_MODEL_GEN_ANNOTATION: return createEReferenceModelGenAnnotation();
      case ModelcodegeneratorPackage.EENUM_MODEL_GEN_ANNOTATION: return createEEnumModelGenAnnotation();
      case ModelcodegeneratorPackage.EDATA_TYPE_MODEL_GEN_ANNOTATION: return createEDataTypeModelGenAnnotation();
      case ModelcodegeneratorPackage.DAO_FINDER_DEFINITION: return createDaoFinderDefinition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EPackageModelGenAnnotation createEPackageModelGenAnnotation() {
    EPackageModelGenAnnotation ePackageModelGenAnnotation = new EPackageModelGenAnnotation();
    return ePackageModelGenAnnotation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClassModelGenAnnotation createEClassModelGenAnnotation() {
    EClassModelGenAnnotation eClassModelGenAnnotation = new EClassModelGenAnnotation();
    return eClassModelGenAnnotation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttributeModelGenAnnotation createEAttributeModelGenAnnotation() {
    EAttributeModelGenAnnotation eAttributeModelGenAnnotation = new EAttributeModelGenAnnotation();
    return eAttributeModelGenAnnotation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EReferenceModelGenAnnotation createEReferenceModelGenAnnotation() {
    EReferenceModelGenAnnotation eReferenceModelGenAnnotation = new EReferenceModelGenAnnotation();
    return eReferenceModelGenAnnotation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EEnumModelGenAnnotation createEEnumModelGenAnnotation() {
    EEnumModelGenAnnotation eEnumModelGenAnnotation = new EEnumModelGenAnnotation();
    return eEnumModelGenAnnotation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EDataTypeModelGenAnnotation createEDataTypeModelGenAnnotation() {
    EDataTypeModelGenAnnotation eDataTypeModelGenAnnotation = new EDataTypeModelGenAnnotation();
    return eDataTypeModelGenAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DaoFinderDefinition createDaoFinderDefinition() {
    DaoFinderDefinition daoFinderDefinition = new DaoFinderDefinition();
    return daoFinderDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ModelcodegeneratorPackage getModelcodegeneratorPackage() {
    return (ModelcodegeneratorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ModelcodegeneratorPackage getPackage() {
    return ModelcodegeneratorPackage.eINSTANCE;
  }

} // ModelcodegeneratorFactory
