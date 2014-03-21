package org.eclipse.emf.texo.test.model.issues.bz380279;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz380279.dao.BZ380279Dao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>bz380279</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Bz380279ModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz380279";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz380279ModelFactory MODELFACTORY = new Bz380279ModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BZ380279_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BZ380279_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BZ380279_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BZ380279_FIRSTNAME_FEATURE_ID = 2;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz380279ModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static Bz380279ModelPackage initialize() {

    if (isInitialized) {
      return (Bz380279ModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final Bz380279ModelPackage modelPackage = new Bz380279ModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(BZ380279.class, modelPackage.getBZ380279EClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(BZ380279.class, BZ380279Dao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link Bz380279ModelFactory} instance.
   * @generated
   */
  @Override
  public Bz380279ModelFactory getModelFactory() {
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
    return "bz380279.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>BZ380279</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BZ380279</b></em>'
   * @generated
   */
  public EClass getBZ380279EClass() {
    return (EClass) getEPackage().getEClassifiers().get(BZ380279_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BZ380279.firstName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BZ380279.firstName</b></em>'.
   * @generated
   */
  public EAttribute getBZ380279_FirstName() {
    return (EAttribute) getBZ380279EClass().getEAllStructuralFeatures().get(BZ380279_FIRSTNAME_FEATURE_ID);
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
    case BZ380279_CLASSIFIER_ID:
      return BZ380279.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
