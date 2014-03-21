package org.eclipse.emf.texo.test.model.samples.schoollibrary;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.schoollibrary.dao.AssetDao;
import org.eclipse.emf.texo.test.model.samples.schoollibrary.dao.SchoolBookDao;
import org.eclipse.emf.texo.test.model.samples.schoollibrary.dao.SchoolLibraryDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>schoollibrary</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SchoollibraryModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/schoollibrary";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final SchoollibraryModelFactory MODELFACTORY = new SchoollibraryModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ASSET_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ASSET_VALUE_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCHOOLBOOK_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCHOOLBOOK_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCHOOLBOOK_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCHOOLBOOK_TITLE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCHOOLBOOK_PAGES_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCHOOLBOOK_CATEGORY_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCHOOLBOOK_AUTHOR_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCHOOLBOOK_VALUE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCHOOLLIBRARY_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCHOOLLIBRARY_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCHOOLLIBRARY_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCHOOLLIBRARY_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCHOOLLIBRARY_WRITERS_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCHOOLLIBRARY_BOOKS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCHOOLLIBRARY_LOCATION_FEATURE_ID = 5;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final SchoollibraryModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static SchoollibraryModelPackage initialize() {

    if (isInitialized) {
      return (SchoollibraryModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final SchoollibraryModelPackage modelPackage = new SchoollibraryModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    LibraryModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Asset.class, modelPackage.getAssetEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SchoolBook.class, modelPackage.getSchoolBookEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SchoolLibrary.class, modelPackage.getSchoolLibraryEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(Asset.class, AssetDao.class);
    DaoRegistry.getInstance().registerDao(SchoolBook.class, SchoolBookDao.class);
    DaoRegistry.getInstance().registerDao(SchoolLibrary.class, SchoolLibraryDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link SchoollibraryModelFactory} instance.
   * @generated
   */
  @Override
  public SchoollibraryModelFactory getModelFactory() {
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
    return "schoollibrary.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>Asset</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Asset</b></em>'
   * @generated
   */
  public EClass getAssetEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ASSET_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Asset.value</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Asset.value</b></em>'.
   * @generated
   */
  public EAttribute getAsset_Value() {
    return (EAttribute) getAssetEClass().getEAllStructuralFeatures().get(ASSET_VALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SchoolBook</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SchoolBook</b></em>'
   * @generated
   */
  public EClass getSchoolBookEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SCHOOLBOOK_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SchoolBook.value</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SchoolBook.value</b></em>'.
   * @generated
   */
  public EAttribute getSchoolBook_Value() {
    return (EAttribute) getSchoolBookEClass().getEAllStructuralFeatures().get(SCHOOLBOOK_VALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SchoolLibrary</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SchoolLibrary</b></em>'
   * @generated
   */
  public EClass getSchoolLibraryEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SCHOOLLIBRARY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SchoolLibrary.location</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SchoolLibrary.location</b></em>'.
   * @generated
   */
  public EAttribute getSchoolLibrary_Location() {
    return (EAttribute) getSchoolLibraryEClass().getEAllStructuralFeatures().get(SCHOOLLIBRARY_LOCATION_FEATURE_ID);
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
    case ASSET_CLASSIFIER_ID:
      return Asset.class;
    case SCHOOLBOOK_CLASSIFIER_ID:
      return SchoolBook.class;
    case SCHOOLLIBRARY_CLASSIFIER_ID:
      return SchoolLibrary.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
