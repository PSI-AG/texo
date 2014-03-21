package org.eclipse.emf.texo.test.model.issues.instanceclassset;

import java.io.Serializable;
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
import org.eclipse.emf.texo.test.model.instanceclassset.NonEMF;
import org.eclipse.emf.texo.test.model.issues.instanceclassset.dao.MySerializableClassDao;
import org.eclipse.emf.texo.test.model.issues.instanceclassset.dao.NonEMFDao;
import org.eclipse.emf.texo.test.model.issues.instanceclassset.dao.SerializableDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>bz306546</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Bz306546ModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/instanceclassset";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz306546ModelFactory MODELFACTORY = new Bz306546ModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SERIALIZABLE_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MYSERIALIZABLECLASS_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MYSERIALIZABLECLASS_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MYSERIALIZABLECLASS_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MYSERIALIZABLECLASS_SOMETHINGINTERESTING_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MYSERIALIZABLECLASS_NONEMF_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MYSERIALIZABLECLASS_NONEMFS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NONEMF_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NONEMF_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NONEMF_DB_VERSION_FEATURE_ID = 1;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz306546ModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static Bz306546ModelPackage initialize() {

    if (isInitialized) {
      return (Bz306546ModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final Bz306546ModelPackage modelPackage = new Bz306546ModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Serializable.class, modelPackage.getSerializableEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(MySerializableClass.class,
        modelPackage.getMySerializableClassEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(NonEMF.class, modelPackage.getNonEMFEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(Serializable.class, SerializableDao.class);
    DaoRegistry.getInstance().registerDao(MySerializableClass.class, MySerializableClassDao.class);
    DaoRegistry.getInstance().registerDao(NonEMF.class, NonEMFDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link Bz306546ModelFactory} instance.
   * @generated
   */
  @Override
  public Bz306546ModelFactory getModelFactory() {
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
    return "bz306546.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>Serializable</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Serializable</b></em>'
   * @generated
   */
  public EClass getSerializableEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SERIALIZABLE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>MySerializableClass</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>MySerializableClass</b></em>'
   * @generated
   */
  public EClass getMySerializableClassEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MYSERIALIZABLECLASS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>MySerializableClass.somethingInteresting</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>MySerializableClass.somethingInteresting</b></em>'.
   * @generated
   */
  public EAttribute getMySerializableClass_SomethingInteresting() {
    return (EAttribute) getMySerializableClassEClass().getEAllStructuralFeatures().get(
        MYSERIALIZABLECLASS_SOMETHINGINTERESTING_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>MySerializableClass.nonEMF</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>MySerializableClass.nonEMF</b></em>'.
   * @generated
   */
  public EReference getMySerializableClass_NonEMF() {
    return (EReference) getMySerializableClassEClass().getEAllStructuralFeatures().get(
        MYSERIALIZABLECLASS_NONEMF_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>MySerializableClass.nonEMFs</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>MySerializableClass.nonEMFs</b></em>'.
   * @generated
   */
  public EReference getMySerializableClass_NonEMFs() {
    return (EReference) getMySerializableClassEClass().getEAllStructuralFeatures().get(
        MYSERIALIZABLECLASS_NONEMFS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>NonEMF</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>NonEMF</b></em>'
   * @generated
   */
  public EClass getNonEMFEClass() {
    return (EClass) getEPackage().getEClassifiers().get(NONEMF_CLASSIFIER_ID);
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
    case SERIALIZABLE_CLASSIFIER_ID:
      return Serializable.class;
    case MYSERIALIZABLECLASS_CLASSIFIER_ID:
      return MySerializableClass.class;
    case NONEMF_CLASSIFIER_ID:
      return NonEMF.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
