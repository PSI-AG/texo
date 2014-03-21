package org.eclipse.emf.texo.test.model.samples.inventory;

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
import org.eclipse.emf.texo.test.model.samples.inventory.dao.PDeclarationDao;
import org.eclipse.emf.texo.test.model.samples.inventory.dao.PTypeDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>inv</b></em>'. It contains initialization code and access to the Factory to
 * instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class InvModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/inventory";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final InvModelFactory MODELFACTORY = new InvModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PTYPE_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PTYPE_ID_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PTYPE_NAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PTYPE_BASE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PTYPE_SUBTYPES_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PTYPE_SUBNOTYPES_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PTYPE_INFOREFERENCES_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PDECLARATION_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PDECLARATION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PDECLARATION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PDECLARATION_ID_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PDECLARATION_NAME_FEATURE_ID = 3;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final InvModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static InvModelPackage initialize() {

    if (isInitialized) {
      return (InvModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final InvModelPackage modelPackage = new InvModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(PType.class, modelPackage.getPTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PDeclaration.class, modelPackage.getPDeclarationEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(PType.class, PTypeDao.class);
    DaoRegistry.getInstance().registerDao(PDeclaration.class, PDeclarationDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link InvModelFactory} instance.
   * @generated
   */
  @Override
  public InvModelFactory getModelFactory() {
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
    return "inv.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>PType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PType</b></em>'
   * @generated
   */
  public EClass getPTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PType.id</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PType.id</b></em>'.
   * @generated
   */
  public EAttribute getPType_Id() {
    return (EAttribute) getPTypeEClass().getEAllStructuralFeatures().get(PTYPE_ID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PType.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PType.name</b></em>'.
   * @generated
   */
  public EAttribute getPType_Name() {
    return (EAttribute) getPTypeEClass().getEAllStructuralFeatures().get(PTYPE_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PType.base</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PType.base</b></em>'.
   * @generated
   */
  public EReference getPType_Base() {
    return (EReference) getPTypeEClass().getEAllStructuralFeatures().get(PTYPE_BASE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PType.subTypes</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PType.subTypes</b></em>'.
   * @generated
   */
  public EReference getPType_SubTypes() {
    return (EReference) getPTypeEClass().getEAllStructuralFeatures().get(PTYPE_SUBTYPES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PType.subNOTypes</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PType.subNOTypes</b></em>'.
   * @generated
   */
  public EReference getPType_SubNOTypes() {
    return (EReference) getPTypeEClass().getEAllStructuralFeatures().get(PTYPE_SUBNOTYPES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PType.infoReferences</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PType.infoReferences</b></em>'.
   * @generated
   */
  public EReference getPType_InfoReferences() {
    return (EReference) getPTypeEClass().getEAllStructuralFeatures().get(PTYPE_INFOREFERENCES_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PDeclaration</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PDeclaration</b></em>'
   * @generated
   */
  public EClass getPDeclarationEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PDECLARATION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PDeclaration.id</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PDeclaration.id</b></em>'.
   * @generated
   */
  public EAttribute getPDeclaration_Id() {
    return (EAttribute) getPDeclarationEClass().getEAllStructuralFeatures().get(PDECLARATION_ID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PDeclaration.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PDeclaration.name</b></em>'.
   * @generated
   */
  public EAttribute getPDeclaration_Name() {
    return (EAttribute) getPDeclarationEClass().getEAllStructuralFeatures().get(PDECLARATION_NAME_FEATURE_ID);
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
    case PTYPE_CLASSIFIER_ID:
      return PType.class;
    case PDECLARATION_CLASSIFIER_ID:
      return PDeclaration.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
