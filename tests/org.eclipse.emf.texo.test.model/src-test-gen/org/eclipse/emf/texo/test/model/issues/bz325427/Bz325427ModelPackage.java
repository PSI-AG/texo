package org.eclipse.emf.texo.test.model.issues.bz325427;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz325427.dao.EClassADao;
import org.eclipse.emf.texo.test.model.issues.bz325427.dao.EClassBDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>bz325427</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Bz325427ModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz325427";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz325427ModelFactory MODELFACTORY = new Bz325427ModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ENUMB_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ENUMA_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ECLASSB_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ECLASSB_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ECLASSB_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ECLASSB_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ECLASSA_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ECLASSA_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ECLASSA_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ECLASSA_NAME_FEATURE_ID = 2;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz325427ModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static Bz325427ModelPackage initialize() {

    if (isInitialized) {
      return (Bz325427ModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final Bz325427ModelPackage modelPackage = new Bz325427ModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(EClassB.class, modelPackage.getEClassBEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(EClassA.class, modelPackage.getEClassAEClass(), modelPackage);

    ModelResolver.getInstance().registerClassModelMapping(EnumB.class, modelPackage.getEnumBEEnum(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(EnumA.class, modelPackage.getEnumAEEnum(), modelPackage);

    DaoRegistry.getInstance().registerDao(EClassB.class, EClassBDao.class);
    DaoRegistry.getInstance().registerDao(EClassA.class, EClassADao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link Bz325427ModelFactory} instance.
   * @generated
   */
  @Override
  public Bz325427ModelFactory getModelFactory() {
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
    return "bz325427.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>EClassB</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>EClassB</b></em>'
   * @generated
   */
  public EClass getEClassBEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ECLASSB_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>EClassB.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>EClassB.name</b></em>'.
   * @generated
   */
  public EAttribute getEClassB_Name() {
    return (EAttribute) getEClassBEClass().getEAllStructuralFeatures().get(ECLASSB_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>EClassA</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>EClassA</b></em>'
   * @generated
   */
  public EClass getEClassAEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ECLASSA_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>EClassA.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>EClassA.name</b></em>'.
   * @generated
   */
  public EAttribute getEClassA_Name() {
    return (EAttribute) getEClassAEClass().getEAllStructuralFeatures().get(ECLASSA_NAME_FEATURE_ID);
  }

  /**
   * Returns the EEnum '<em><b>EnumB</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>EnumB</b></em>'
   * @generated
   */
  public EEnum getEnumBEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(ENUMB_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>EnumA</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>EnumA</b></em>'
   * @generated
   */
  public EEnum getEnumAEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(ENUMA_CLASSIFIER_ID);
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
    case ECLASSB_CLASSIFIER_ID:
      return EClassB.class;
    case ECLASSA_CLASSIFIER_ID:
      return EClassA.class;
    case ENUMB_CLASSIFIER_ID:
      return EnumB.class;
    case ENUMA_CLASSIFIER_ID:
      return EnumA.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
