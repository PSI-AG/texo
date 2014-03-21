package org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup.dao.ADao;
import org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup.dao.CTypeDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup.dao.ElementDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>nestedgroup</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class NestedgroupModelPackage extends ModelPackage {

  /**
   * Is set when the package has been initialized.
   * 
   * @generated
   */
  private static boolean isInitialized = false;

  /**
   * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/schemaconstructs/nestedgroup";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final NestedgroupModelFactory MODELFACTORY = new NestedgroupModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int A_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int A_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int A_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int A_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int A_GROUP_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int A_B_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int A_C_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CTYPE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CTYPE_CNAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CTYPE_CVALUE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELEMENT_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELEMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELEMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELEMENT_MIXED_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELEMENT_NAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELEMENT_TRUE__FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELEMENT_C_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELEMENT_RECURSIVE_FEATURE_ID = 6;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final NestedgroupModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static NestedgroupModelPackage initialize() {

    if (isInitialized) {
      return (NestedgroupModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final NestedgroupModelPackage modelPackage = new NestedgroupModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(A.class, modelPackage.getAEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CType.class, modelPackage.getCTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Element.class, modelPackage.getElementEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(A.class, ADao.class);
    DaoRegistry.getInstance().registerDao(CType.class, CTypeDao.class);
    DaoRegistry.getInstance().registerDao(Element.class, ElementDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link NestedgroupModelFactory} instance.
   * @generated
   */
  @Override
  public NestedgroupModelFactory getModelFactory() {
    return MODELFACTORY;
  }

  /**
   * Returns the nsUri of the {@link EPackage} managed by this Package instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return the nsUri of the EPackage
   * @generated
   */
  @Override
  public String getNsURI() {
    return NS_URI;
  }

  /**
   * Returns the name of the ecore file containing the ecore model of the {@link EPackage} managed here. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the name of the ecore file
   * @generated
   */
  @Override
  public String getEcoreFileName() {
    return "nestedgroup.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>A</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>A</b></em>'
   * @generated
   */
  public EClass getAEClass() {
    return (EClass) getEPackage().getEClassifiers().get(A_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>A.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>A.name</b></em>'.
   * @generated
   */
  public EAttribute getA_Name() {
    return (EAttribute) getAEClass().getEAllStructuralFeatures().get(A_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>A.group</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>A.group</b></em>'.
   * @generated
   */
  public EAttribute getA_Group() {
    return (EAttribute) getAEClass().getEAllStructuralFeatures().get(A_GROUP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>A.b</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>A.b</b></em>'.
   * @generated
   */
  public EAttribute getA_B() {
    return (EAttribute) getAEClass().getEAllStructuralFeatures().get(A_B_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>A.c</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>A.c</b></em>'.
   * @generated
   */
  public EReference getA_C() {
    return (EReference) getAEClass().getEAllStructuralFeatures().get(A_C_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CType</b></em>'
   * @generated
   */
  public EClass getCTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CType.cname</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CType.cname</b></em>'.
   * @generated
   */
  public EAttribute getCType_Cname() {
    return (EAttribute) getCTypeEClass().getEAllStructuralFeatures().get(CTYPE_CNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CType.cvalue</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CType.cvalue</b></em>'.
   * @generated
   */
  public EAttribute getCType_Cvalue() {
    return (EAttribute) getCTypeEClass().getEAllStructuralFeatures().get(CTYPE_CVALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Element</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Element</b></em>'
   * @generated
   */
  public EClass getElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Element.mixed</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Element.mixed</b></em>'.
   * @generated
   */
  public EAttribute getElement_Mixed() {
    return (EAttribute) getElementEClass().getEAllStructuralFeatures().get(ELEMENT_MIXED_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Element.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Element.name</b></em>'.
   * @generated
   */
  public EAttribute getElement_Name() {
    return (EAttribute) getElementEClass().getEAllStructuralFeatures().get(ELEMENT_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Element.true</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Element.true</b></em>'.
   * @generated
   */
  public EAttribute getElement_True_() {
    return (EAttribute) getElementEClass().getEAllStructuralFeatures().get(ELEMENT_TRUE__FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Element.c</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Element.c</b></em>'.
   * @generated
   */
  public EReference getElement_C() {
    return (EReference) getElementEClass().getEAllStructuralFeatures().get(ELEMENT_C_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Element.recursive</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Element.recursive</b></em>'.
   * @generated
   */
  public EReference getElement_Recursive() {
    return (EReference) getElementEClass().getEAllStructuralFeatures().get(ELEMENT_RECURSIVE_FEATURE_ID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClassifier
   *          the {@link EClassifier}
   * @return the class implementing a specific {@link EClass}.
   * @generated
   */
  @Override
  public Class<?> getEClassifierClass(EClassifier eClassifier) {
    switch (eClassifier.getClassifierID()) {
    case A_CLASSIFIER_ID:
      return A.class;
    case CTYPE_CLASSIFIER_ID:
      return CType.class;
    case ELEMENT_CLASSIFIER_ID:
      return Element.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
