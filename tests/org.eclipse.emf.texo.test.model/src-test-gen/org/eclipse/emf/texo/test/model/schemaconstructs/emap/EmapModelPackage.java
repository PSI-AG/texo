package org.eclipse.emf.texo.test.model.schemaconstructs.emap;

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
import org.eclipse.emf.texo.test.model.schemaconstructs.emap.dao.BookDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.emap.dao.BookStoreDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.emap.dao.WriterDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>emap</b></em>'. It contains initialization code and access to the Factory to
 * instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EmapModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/schemaconstructs/emap";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final EmapModelFactory MODELFACTORY = new EmapModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOK_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOK_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOK_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOK_TITLE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOK_WRITERS_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRINGTOWRITERMAPENTRY_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRINGTOWRITERMAPENTRY_KEY_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRINGTOWRITERMAPENTRY_VALUE_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITER_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITER_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKSTORE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKSTORE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKSTORE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKSTORE_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKSTORE_WRITERSBYBOOK_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITERTOBOOKMAPENTRY_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITERTOBOOKMAPENTRY_KEY_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITERTOBOOKMAPENTRY_VALUE_FEATURE_ID = 1;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final EmapModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static EmapModelPackage initialize() {

    if (isInitialized) {
      return (EmapModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final EmapModelPackage modelPackage = new EmapModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Book.class, modelPackage.getBookEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Writer.class, modelPackage.getWriterEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BookStore.class, modelPackage.getBookStoreEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(Book.class, BookDao.class);
    DaoRegistry.getInstance().registerDao(Writer.class, WriterDao.class);
    DaoRegistry.getInstance().registerDao(BookStore.class, BookStoreDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link EmapModelFactory} instance.
   * @generated
   */
  @Override
  public EmapModelFactory getModelFactory() {
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
    return "emap.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>Book</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Book</b></em>'
   * @generated
   */
  public EClass getBookEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BOOK_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Book.title</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Book.title</b></em>'.
   * @generated
   */
  public EAttribute getBook_Title() {
    return (EAttribute) getBookEClass().getEAllStructuralFeatures().get(BOOK_TITLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Book.writers</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Book.writers</b></em>'.
   * @generated
   */
  public EReference getBook_Writers() {
    return (EReference) getBookEClass().getEAllStructuralFeatures().get(BOOK_WRITERS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>StringToWriterMapEntry</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>StringToWriterMapEntry</b></em>'
   * @generated
   */
  public EClass getStringToWriterMapEntryEClass() {
    return (EClass) getEPackage().getEClassifiers().get(STRINGTOWRITERMAPENTRY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>StringToWriterMapEntry.key</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>StringToWriterMapEntry.key</b></em>'.
   * @generated
   */
  public EAttribute getStringToWriterMapEntry_Key() {
    return (EAttribute) getStringToWriterMapEntryEClass().getEAllStructuralFeatures().get(
        STRINGTOWRITERMAPENTRY_KEY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>StringToWriterMapEntry.value</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>StringToWriterMapEntry.value</b></em>'.
   * @generated
   */
  public EReference getStringToWriterMapEntry_Value() {
    return (EReference) getStringToWriterMapEntryEClass().getEAllStructuralFeatures().get(
        STRINGTOWRITERMAPENTRY_VALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Writer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Writer</b></em>'
   * @generated
   */
  public EClass getWriterEClass() {
    return (EClass) getEPackage().getEClassifiers().get(WRITER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Writer.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Writer.name</b></em>'.
   * @generated
   */
  public EAttribute getWriter_Name() {
    return (EAttribute) getWriterEClass().getEAllStructuralFeatures().get(WRITER_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BookStore</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BookStore</b></em>'
   * @generated
   */
  public EClass getBookStoreEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BOOKSTORE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BookStore.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BookStore.name</b></em>'.
   * @generated
   */
  public EAttribute getBookStore_Name() {
    return (EAttribute) getBookStoreEClass().getEAllStructuralFeatures().get(BOOKSTORE_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BookStore.writersByBook</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BookStore.writersByBook</b></em>'.
   * @generated
   */
  public EReference getBookStore_WritersByBook() {
    return (EReference) getBookStoreEClass().getEAllStructuralFeatures().get(BOOKSTORE_WRITERSBYBOOK_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>WriterToBookMapEntry</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>WriterToBookMapEntry</b></em>'
   * @generated
   */
  public EClass getWriterToBookMapEntryEClass() {
    return (EClass) getEPackage().getEClassifiers().get(WRITERTOBOOKMAPENTRY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WriterToBookMapEntry.key</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WriterToBookMapEntry.key</b></em>'.
   * @generated
   */
  public EReference getWriterToBookMapEntry_Key() {
    return (EReference) getWriterToBookMapEntryEClass().getEAllStructuralFeatures().get(
        WRITERTOBOOKMAPENTRY_KEY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WriterToBookMapEntry.value</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WriterToBookMapEntry.value</b></em>'.
   * @generated
   */
  public EReference getWriterToBookMapEntry_Value() {
    return (EReference) getWriterToBookMapEntryEClass().getEAllStructuralFeatures().get(
        WRITERTOBOOKMAPENTRY_VALUE_FEATURE_ID);
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
    case BOOK_CLASSIFIER_ID:
      return Book.class;
    case WRITER_CLASSIFIER_ID:
      return Writer.class;
    case BOOKSTORE_CLASSIFIER_ID:
      return BookStore.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
