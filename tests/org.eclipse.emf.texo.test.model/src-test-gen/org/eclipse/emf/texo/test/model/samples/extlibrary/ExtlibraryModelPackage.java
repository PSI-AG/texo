package org.eclipse.emf.texo.test.model.samples.extlibrary;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.samples.extlibrary.dao.AddressableDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.dao.AudioVisualItemDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.dao.BookDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.dao.BookOnTapeDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.dao.BorrowerDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.dao.CirculatingItemDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.dao.EmployeeDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.dao.ItemDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.dao.LendableDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.dao.LibraryDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.dao.PeriodicalDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.dao.PersonDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.dao.VideoCassetteDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.dao.WriterDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>extlibrary</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ExtlibraryModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/extlibrary";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final ExtlibraryModelFactory MODELFACTORY = new ExtlibraryModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKCATEGORY_CLASSIFIER_ID = 14;

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
  public static final int BOOK_PUBLICATIONDATE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOK_COPIES_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOK_BORROWERS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOK_TITLE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOK_PAGES_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOK_CATEGORY_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOK_AUTHOR_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_PUBLICATIONDATE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LENDABLE_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LENDABLE_COPIES_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LENDABLE_BORROWERS_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CIRCULATINGITEM_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CIRCULATINGITEM_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CIRCULATINGITEM_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CIRCULATINGITEM_PUBLICATIONDATE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CIRCULATINGITEM_COPIES_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CIRCULATINGITEM_BORROWERS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITER_CLASSIFIER_ID = 2;

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
  public static final int WRITER_FIRSTNAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITER_LASTNAME_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITER_ADDRESS_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITER_NAME_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITER_BOOKS_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSABLE_CLASSIFIER_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSABLE_ADDRESS_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_FIRSTNAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_LASTNAME_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_ADDRESS_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LIBRARY_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LIBRARY_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LIBRARY_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LIBRARY_NAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LIBRARY_WRITERS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LIBRARY_EMPLOYEES_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LIBRARY_BORROWERS_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LIBRARY_STOCK_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LIBRARY_BOOKS_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LIBRARY_BRANCHES_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LIBRARY_PARENTBRANCH_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LIBRARY_PEOPLE_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LIBRARY_ADDRESS_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMPLOYEE_CLASSIFIER_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMPLOYEE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMPLOYEE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMPLOYEE_FIRSTNAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMPLOYEE_LASTNAME_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMPLOYEE_ADDRESS_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EMPLOYEE_MANAGER_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BORROWER_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BORROWER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BORROWER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BORROWER_FIRSTNAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BORROWER_LASTNAME_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BORROWER_ADDRESS_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BORROWER_BORROWED_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERIODICAL_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERIODICAL_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERIODICAL_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERIODICAL_PUBLICATIONDATE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERIODICAL_TITLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERIODICAL_ISSUESPERYEAR_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIOVISUALITEM_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIOVISUALITEM_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIOVISUALITEM_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIOVISUALITEM_PUBLICATIONDATE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIOVISUALITEM_COPIES_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIOVISUALITEM_BORROWERS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIOVISUALITEM_TITLE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIOVISUALITEM_MINUTESLENGTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIOVISUALITEM_DAMAGED_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKONTAPE_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKONTAPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKONTAPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKONTAPE_PUBLICATIONDATE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKONTAPE_COPIES_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKONTAPE_BORROWERS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKONTAPE_TITLE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKONTAPE_MINUTESLENGTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKONTAPE_DAMAGED_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKONTAPE_READER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKONTAPE_AUTHOR_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEOCASSETTE_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEOCASSETTE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEOCASSETTE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEOCASSETTE_PUBLICATIONDATE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEOCASSETTE_COPIES_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEOCASSETTE_BORROWERS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEOCASSETTE_TITLE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEOCASSETTE_MINUTESLENGTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEOCASSETTE_DAMAGED_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VIDEOCASSETTE_CAST_FEATURE_ID = 8;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final ExtlibraryModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static ExtlibraryModelPackage initialize() {

    if (isInitialized) {
      return (ExtlibraryModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final ExtlibraryModelPackage modelPackage = new ExtlibraryModelPackage();

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
    ModelResolver.getInstance().registerClassModelMapping(Item.class, modelPackage.getItemEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Lendable.class, modelPackage.getLendableEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CirculatingItem.class,
        modelPackage.getCirculatingItemEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Writer.class, modelPackage.getWriterEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Addressable.class, modelPackage.getAddressableEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Person.class, modelPackage.getPersonEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Library.class, modelPackage.getLibraryEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Employee.class, modelPackage.getEmployeeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Borrower.class, modelPackage.getBorrowerEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Periodical.class, modelPackage.getPeriodicalEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AudioVisualItem.class,
        modelPackage.getAudioVisualItemEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BookOnTape.class, modelPackage.getBookOnTapeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(VideoCassette.class, modelPackage.getVideoCassetteEClass(),
        modelPackage);

    ModelResolver.getInstance().registerClassModelMapping(BookCategory.class, modelPackage.getBookCategoryEEnum(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(Book.class, BookDao.class);
    DaoRegistry.getInstance().registerDao(Item.class, ItemDao.class);
    DaoRegistry.getInstance().registerDao(Lendable.class, LendableDao.class);
    DaoRegistry.getInstance().registerDao(CirculatingItem.class, CirculatingItemDao.class);
    DaoRegistry.getInstance().registerDao(Writer.class, WriterDao.class);
    DaoRegistry.getInstance().registerDao(Addressable.class, AddressableDao.class);
    DaoRegistry.getInstance().registerDao(Person.class, PersonDao.class);
    DaoRegistry.getInstance().registerDao(Library.class, LibraryDao.class);
    DaoRegistry.getInstance().registerDao(Employee.class, EmployeeDao.class);
    DaoRegistry.getInstance().registerDao(Borrower.class, BorrowerDao.class);
    DaoRegistry.getInstance().registerDao(Periodical.class, PeriodicalDao.class);
    DaoRegistry.getInstance().registerDao(AudioVisualItem.class, AudioVisualItemDao.class);
    DaoRegistry.getInstance().registerDao(BookOnTape.class, BookOnTapeDao.class);
    DaoRegistry.getInstance().registerDao(VideoCassette.class, VideoCassetteDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link ExtlibraryModelFactory} instance.
   * @generated
   */
  @Override
  public ExtlibraryModelFactory getModelFactory() {
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
    return "extlibrary.ecore";
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
   * Returns the {@link EStructuralFeature} '<em><b>Book.pages</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Book.pages</b></em>'.
   * @generated
   */
  public EAttribute getBook_Pages() {
    return (EAttribute) getBookEClass().getEAllStructuralFeatures().get(BOOK_PAGES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Book.category</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Book.category</b></em>'.
   * @generated
   */
  public EAttribute getBook_Category() {
    return (EAttribute) getBookEClass().getEAllStructuralFeatures().get(BOOK_CATEGORY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Book.author</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Book.author</b></em>'.
   * @generated
   */
  public EReference getBook_Author() {
    return (EReference) getBookEClass().getEAllStructuralFeatures().get(BOOK_AUTHOR_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Item</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Item</b></em>'
   * @generated
   */
  public EClass getItemEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ITEM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Item.publicationDate</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Item.publicationDate</b></em>'.
   * @generated
   */
  public EAttribute getItem_PublicationDate() {
    return (EAttribute) getItemEClass().getEAllStructuralFeatures().get(ITEM_PUBLICATIONDATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Lendable</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Lendable</b></em>'
   * @generated
   */
  public EClass getLendableEClass() {
    return (EClass) getEPackage().getEClassifiers().get(LENDABLE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Lendable.copies</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Lendable.copies</b></em>'.
   * @generated
   */
  public EAttribute getLendable_Copies() {
    return (EAttribute) getLendableEClass().getEAllStructuralFeatures().get(LENDABLE_COPIES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Lendable.borrowers</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Lendable.borrowers</b></em>'.
   * @generated
   */
  public EReference getLendable_Borrowers() {
    return (EReference) getLendableEClass().getEAllStructuralFeatures().get(LENDABLE_BORROWERS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CirculatingItem</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CirculatingItem</b></em>'
   * @generated
   */
  public EClass getCirculatingItemEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CIRCULATINGITEM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CirculatingItem.copies</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CirculatingItem.copies</b></em>'.
   * @generated
   */
  public EAttribute getCirculatingItem_Copies() {
    return (EAttribute) getCirculatingItemEClass().getEAllStructuralFeatures().get(CIRCULATINGITEM_COPIES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CirculatingItem.borrowers</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CirculatingItem.borrowers</b></em>'.
   * @generated
   */
  public EReference getCirculatingItem_Borrowers() {
    return (EReference) getCirculatingItemEClass().getEAllStructuralFeatures()
        .get(CIRCULATINGITEM_BORROWERS_FEATURE_ID);
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
   * Returns the {@link EStructuralFeature} '<em><b>Writer.books</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Writer.books</b></em>'.
   * @generated
   */
  public EReference getWriter_Books() {
    return (EReference) getWriterEClass().getEAllStructuralFeatures().get(WRITER_BOOKS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Addressable</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Addressable</b></em>'
   * @generated
   */
  public EClass getAddressableEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ADDRESSABLE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Addressable.address</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Addressable.address</b></em>'.
   * @generated
   */
  public EAttribute getAddressable_Address() {
    return (EAttribute) getAddressableEClass().getEAllStructuralFeatures().get(ADDRESSABLE_ADDRESS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Person</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Person</b></em>'
   * @generated
   */
  public EClass getPersonEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PERSON_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Person.firstName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Person.firstName</b></em>'.
   * @generated
   */
  public EAttribute getPerson_FirstName() {
    return (EAttribute) getPersonEClass().getEAllStructuralFeatures().get(PERSON_FIRSTNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Person.lastName</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Person.lastName</b></em>'.
   * @generated
   */
  public EAttribute getPerson_LastName() {
    return (EAttribute) getPersonEClass().getEAllStructuralFeatures().get(PERSON_LASTNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Person.address</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Person.address</b></em>'.
   * @generated
   */
  public EAttribute getPerson_Address() {
    return (EAttribute) getPersonEClass().getEAllStructuralFeatures().get(PERSON_ADDRESS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Library</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Library</b></em>'
   * @generated
   */
  public EClass getLibraryEClass() {
    return (EClass) getEPackage().getEClassifiers().get(LIBRARY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Library.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Library.name</b></em>'.
   * @generated
   */
  public EAttribute getLibrary_Name() {
    return (EAttribute) getLibraryEClass().getEAllStructuralFeatures().get(LIBRARY_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Library.writers</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Library.writers</b></em>'.
   * @generated
   */
  public EReference getLibrary_Writers() {
    return (EReference) getLibraryEClass().getEAllStructuralFeatures().get(LIBRARY_WRITERS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Library.employees</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Library.employees</b></em>'.
   * @generated
   */
  public EReference getLibrary_Employees() {
    return (EReference) getLibraryEClass().getEAllStructuralFeatures().get(LIBRARY_EMPLOYEES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Library.borrowers</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Library.borrowers</b></em>'.
   * @generated
   */
  public EReference getLibrary_Borrowers() {
    return (EReference) getLibraryEClass().getEAllStructuralFeatures().get(LIBRARY_BORROWERS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Library.stock</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Library.stock</b></em>'.
   * @generated
   */
  public EReference getLibrary_Stock() {
    return (EReference) getLibraryEClass().getEAllStructuralFeatures().get(LIBRARY_STOCK_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Library.books</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Library.books</b></em>'.
   * @generated
   */
  public EReference getLibrary_Books() {
    return (EReference) getLibraryEClass().getEAllStructuralFeatures().get(LIBRARY_BOOKS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Library.branches</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Library.branches</b></em>'.
   * @generated
   */
  public EReference getLibrary_Branches() {
    return (EReference) getLibraryEClass().getEAllStructuralFeatures().get(LIBRARY_BRANCHES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Library.parentBranch</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Library.parentBranch</b></em>'.
   * @generated
   */
  public EReference getLibrary_ParentBranch() {
    return (EReference) getLibraryEClass().getEAllStructuralFeatures().get(LIBRARY_PARENTBRANCH_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Library.people</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Library.people</b></em>'.
   * @generated
   */
  public EAttribute getLibrary_People() {
    return (EAttribute) getLibraryEClass().getEAllStructuralFeatures().get(LIBRARY_PEOPLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Library.address</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Library.address</b></em>'.
   * @generated
   */
  public EAttribute getLibrary_Address() {
    return (EAttribute) getLibraryEClass().getEAllStructuralFeatures().get(LIBRARY_ADDRESS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Employee</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Employee</b></em>'
   * @generated
   */
  public EClass getEmployeeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EMPLOYEE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Employee.manager</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Employee.manager</b></em>'.
   * @generated
   */
  public EReference getEmployee_Manager() {
    return (EReference) getEmployeeEClass().getEAllStructuralFeatures().get(EMPLOYEE_MANAGER_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Borrower</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Borrower</b></em>'
   * @generated
   */
  public EClass getBorrowerEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BORROWER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Borrower.borrowed</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Borrower.borrowed</b></em>'.
   * @generated
   */
  public EReference getBorrower_Borrowed() {
    return (EReference) getBorrowerEClass().getEAllStructuralFeatures().get(BORROWER_BORROWED_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Periodical</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Periodical</b></em>'
   * @generated
   */
  public EClass getPeriodicalEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PERIODICAL_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Periodical.title</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Periodical.title</b></em>'.
   * @generated
   */
  public EAttribute getPeriodical_Title() {
    return (EAttribute) getPeriodicalEClass().getEAllStructuralFeatures().get(PERIODICAL_TITLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Periodical.issuesPerYear</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Periodical.issuesPerYear</b></em>'.
   * @generated
   */
  public EAttribute getPeriodical_IssuesPerYear() {
    return (EAttribute) getPeriodicalEClass().getEAllStructuralFeatures().get(PERIODICAL_ISSUESPERYEAR_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AudioVisualItem</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AudioVisualItem</b></em>'
   * @generated
   */
  public EClass getAudioVisualItemEClass() {
    return (EClass) getEPackage().getEClassifiers().get(AUDIOVISUALITEM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AudioVisualItem.title</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AudioVisualItem.title</b></em>'.
   * @generated
   */
  public EAttribute getAudioVisualItem_Title() {
    return (EAttribute) getAudioVisualItemEClass().getEAllStructuralFeatures().get(AUDIOVISUALITEM_TITLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AudioVisualItem.minutesLength</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AudioVisualItem.minutesLength</b></em>'.
   * @generated
   */
  public EAttribute getAudioVisualItem_MinutesLength() {
    return (EAttribute) getAudioVisualItemEClass().getEAllStructuralFeatures().get(
        AUDIOVISUALITEM_MINUTESLENGTH_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AudioVisualItem.damaged</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AudioVisualItem.damaged</b></em>'.
   * @generated
   */
  public EAttribute getAudioVisualItem_Damaged() {
    return (EAttribute) getAudioVisualItemEClass().getEAllStructuralFeatures().get(AUDIOVISUALITEM_DAMAGED_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BookOnTape</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BookOnTape</b></em>'
   * @generated
   */
  public EClass getBookOnTapeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BOOKONTAPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BookOnTape.reader</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BookOnTape.reader</b></em>'.
   * @generated
   */
  public EReference getBookOnTape_Reader() {
    return (EReference) getBookOnTapeEClass().getEAllStructuralFeatures().get(BOOKONTAPE_READER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BookOnTape.author</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BookOnTape.author</b></em>'.
   * @generated
   */
  public EReference getBookOnTape_Author() {
    return (EReference) getBookOnTapeEClass().getEAllStructuralFeatures().get(BOOKONTAPE_AUTHOR_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>VideoCassette</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>VideoCassette</b></em>'
   * @generated
   */
  public EClass getVideoCassetteEClass() {
    return (EClass) getEPackage().getEClassifiers().get(VIDEOCASSETTE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>VideoCassette.cast</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>VideoCassette.cast</b></em>'.
   * @generated
   */
  public EReference getVideoCassette_Cast() {
    return (EReference) getVideoCassetteEClass().getEAllStructuralFeatures().get(VIDEOCASSETTE_CAST_FEATURE_ID);
  }

  /**
   * Returns the EEnum '<em><b>BookCategory</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>BookCategory</b></em>'
   * @generated
   */
  public EEnum getBookCategoryEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(BOOKCATEGORY_CLASSIFIER_ID);
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
    case ITEM_CLASSIFIER_ID:
      return Item.class;
    case LENDABLE_CLASSIFIER_ID:
      return Lendable.class;
    case CIRCULATINGITEM_CLASSIFIER_ID:
      return CirculatingItem.class;
    case WRITER_CLASSIFIER_ID:
      return Writer.class;
    case ADDRESSABLE_CLASSIFIER_ID:
      return Addressable.class;
    case PERSON_CLASSIFIER_ID:
      return Person.class;
    case LIBRARY_CLASSIFIER_ID:
      return Library.class;
    case EMPLOYEE_CLASSIFIER_ID:
      return Employee.class;
    case BORROWER_CLASSIFIER_ID:
      return Borrower.class;
    case PERIODICAL_CLASSIFIER_ID:
      return Periodical.class;
    case AUDIOVISUALITEM_CLASSIFIER_ID:
      return AudioVisualItem.class;
    case BOOKONTAPE_CLASSIFIER_ID:
      return BookOnTape.class;
    case VIDEOCASSETTE_CLASSIFIER_ID:
      return VideoCassette.class;
    case BOOKCATEGORY_CLASSIFIER_ID:
      return BookCategory.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
