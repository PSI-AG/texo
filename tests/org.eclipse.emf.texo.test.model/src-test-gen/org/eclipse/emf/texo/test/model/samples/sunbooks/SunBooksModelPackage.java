package org.eclipse.emf.texo.test.model.samples.sunbooks;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.samples.sunbooks.dao.AuthorsTypeDao;
import org.eclipse.emf.texo.test.model.samples.sunbooks.dao.BookTypeDao;
import org.eclipse.emf.texo.test.model.samples.sunbooks.dao.BooksTypeDao;
import org.eclipse.emf.texo.test.model.samples.sunbooks.dao.CollectionTypeDao;
import org.eclipse.emf.texo.test.model.samples.sunbooks.dao.DocumentRootDao;
import org.eclipse.emf.texo.test.model.samples.sunbooks.dao.PromotionTypeDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>sunBooks</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SunBooksModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/sun_books";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final SunBooksModelFactory MODELFACTORY = new SunBooksModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKCATEGORYTYPE1_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKCATEGORYTYPE_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKCATEGORYTYPEOBJECT_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKCATEGORYTYPEOBJECT1_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUTHORSTYPE_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUTHORSTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUTHORSTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUTHORSTYPE_AUTHORNAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKSTYPE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKSTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKSTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKSTYPE_BOOK_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKTYPE_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKTYPE_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKTYPE_ISBN_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKTYPE_PRICE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKTYPE_AUTHORS_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKTYPE_DESCRIPTION_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKTYPE_PROMOTION_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKTYPE_PUBLICATIONDATE_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKTYPE_BOOKCATEGORY_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOKTYPE_ITEMID_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PROMOTIONTYPE_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PROMOTIONTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PROMOTIONTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PROMOTIONTYPE_DISCOUNT_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PROMOTIONTYPE_NONE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLLECTIONTYPE_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLLECTIONTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLLECTIONTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLLECTIONTYPE_BOOKS_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_MIXED_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_COLLECTION_FEATURE_ID = 5;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final SunBooksModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static SunBooksModelPackage initialize() {

    if (isInitialized) {
      return (SunBooksModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final SunBooksModelPackage modelPackage = new SunBooksModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(AuthorsType.class, modelPackage.getAuthorsTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BooksType.class, modelPackage.getBooksTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BookType.class, modelPackage.getBookTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PromotionType.class, modelPackage.getPromotionTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CollectionType.class, modelPackage.getCollectionTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DocumentRoot.class, modelPackage.getDocumentRootEClass(),
        modelPackage);

    ModelResolver.getInstance().registerClassModelMapping(BookCategoryType1.class,
        modelPackage.getBookCategoryType1EEnum(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BookCategoryType.class,
        modelPackage.getBookCategoryTypeEEnum(), modelPackage);

    DaoRegistry.getInstance().registerDao(AuthorsType.class, AuthorsTypeDao.class);
    DaoRegistry.getInstance().registerDao(BooksType.class, BooksTypeDao.class);
    DaoRegistry.getInstance().registerDao(BookType.class, BookTypeDao.class);
    DaoRegistry.getInstance().registerDao(PromotionType.class, PromotionTypeDao.class);
    DaoRegistry.getInstance().registerDao(CollectionType.class, CollectionTypeDao.class);
    DaoRegistry.getInstance().registerDao(DocumentRoot.class, DocumentRootDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link SunBooksModelFactory} instance.
   * @generated
   */
  @Override
  public SunBooksModelFactory getModelFactory() {
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
    return "sunBooks.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>AuthorsType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AuthorsType</b></em>'
   * @generated
   */
  public EClass getAuthorsTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(AUTHORSTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AuthorsType.authorName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AuthorsType.authorName</b></em>'.
   * @generated
   */
  public EAttribute getAuthorsType_AuthorName() {
    return (EAttribute) getAuthorsTypeEClass().getEAllStructuralFeatures().get(AUTHORSTYPE_AUTHORNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BooksType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BooksType</b></em>'
   * @generated
   */
  public EClass getBooksTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BOOKSTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BooksType.book</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BooksType.book</b></em>'.
   * @generated
   */
  public EReference getBooksType_Book() {
    return (EReference) getBooksTypeEClass().getEAllStructuralFeatures().get(BOOKSTYPE_BOOK_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BookType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BookType</b></em>'
   * @generated
   */
  public EClass getBookTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BOOKTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BookType.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BookType.name</b></em>'.
   * @generated
   */
  public EAttribute getBookType_Name() {
    return (EAttribute) getBookTypeEClass().getEAllStructuralFeatures().get(BOOKTYPE_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BookType.iSBN</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BookType.iSBN</b></em>'.
   * @generated
   */
  public EAttribute getBookType_ISBN() {
    return (EAttribute) getBookTypeEClass().getEAllStructuralFeatures().get(BOOKTYPE_ISBN_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BookType.price</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BookType.price</b></em>'.
   * @generated
   */
  public EAttribute getBookType_Price() {
    return (EAttribute) getBookTypeEClass().getEAllStructuralFeatures().get(BOOKTYPE_PRICE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BookType.authors</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BookType.authors</b></em>'.
   * @generated
   */
  public EReference getBookType_Authors() {
    return (EReference) getBookTypeEClass().getEAllStructuralFeatures().get(BOOKTYPE_AUTHORS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BookType.description</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BookType.description</b></em>'.
   * @generated
   */
  public EAttribute getBookType_Description() {
    return (EAttribute) getBookTypeEClass().getEAllStructuralFeatures().get(BOOKTYPE_DESCRIPTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BookType.promotion</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BookType.promotion</b></em>'.
   * @generated
   */
  public EReference getBookType_Promotion() {
    return (EReference) getBookTypeEClass().getEAllStructuralFeatures().get(BOOKTYPE_PROMOTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BookType.publicationDate</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BookType.publicationDate</b></em>'.
   * @generated
   */
  public EAttribute getBookType_PublicationDate() {
    return (EAttribute) getBookTypeEClass().getEAllStructuralFeatures().get(BOOKTYPE_PUBLICATIONDATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BookType.bookCategory</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BookType.bookCategory</b></em>'.
   * @generated
   */
  public EAttribute getBookType_BookCategory() {
    return (EAttribute) getBookTypeEClass().getEAllStructuralFeatures().get(BOOKTYPE_BOOKCATEGORY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BookType.itemId</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BookType.itemId</b></em>'.
   * @generated
   */
  public EAttribute getBookType_ItemId() {
    return (EAttribute) getBookTypeEClass().getEAllStructuralFeatures().get(BOOKTYPE_ITEMID_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PromotionType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PromotionType</b></em>'
   * @generated
   */
  public EClass getPromotionTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PROMOTIONTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PromotionType.discount</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PromotionType.discount</b></em>'.
   * @generated
   */
  public EAttribute getPromotionType_Discount() {
    return (EAttribute) getPromotionTypeEClass().getEAllStructuralFeatures().get(PROMOTIONTYPE_DISCOUNT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PromotionType.none</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PromotionType.none</b></em>'.
   * @generated
   */
  public EAttribute getPromotionType_None() {
    return (EAttribute) getPromotionTypeEClass().getEAllStructuralFeatures().get(PROMOTIONTYPE_NONE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CollectionType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CollectionType</b></em>'
   * @generated
   */
  public EClass getCollectionTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COLLECTIONTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CollectionType.books</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CollectionType.books</b></em>'.
   * @generated
   */
  public EReference getCollectionType_Books() {
    return (EReference) getCollectionTypeEClass().getEAllStructuralFeatures().get(COLLECTIONTYPE_BOOKS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DocumentRoot</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DocumentRoot</b></em>'
   * @generated
   */
  public EClass getDocumentRootEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DOCUMENTROOT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.mixed</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.mixed</b></em>'.
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed() {
    return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_MIXED_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.xMLNSPrefixMap</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.xMLNSPrefixMap</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.xSISchemaLocation</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.xSISchemaLocation</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(
        DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.collection</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.collection</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_Collection() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_COLLECTION_FEATURE_ID);
  }

  /**
   * Returns the EEnum '<em><b>BookCategoryType1</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>BookCategoryType1</b></em>'
   * @generated
   */
  public EEnum getBookCategoryType1EEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(BOOKCATEGORYTYPE1_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>BookCategoryType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>BookCategoryType</b></em>'
   * @generated
   */
  public EEnum getBookCategoryTypeEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(BOOKCATEGORYTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>BookCategoryTypeObject</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>BookCategoryTypeObject</b></em>'
   * @generated
   */
  public EDataType getBookCategoryTypeObjectEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(BOOKCATEGORYTYPEOBJECT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>BookCategoryTypeObject1</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>BookCategoryTypeObject1</b></em>'
   * @generated
   */
  public EDataType getBookCategoryTypeObject1EDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(BOOKCATEGORYTYPEOBJECT1_CLASSIFIER_ID);
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
    case AUTHORSTYPE_CLASSIFIER_ID:
      return AuthorsType.class;
    case BOOKSTYPE_CLASSIFIER_ID:
      return BooksType.class;
    case BOOKTYPE_CLASSIFIER_ID:
      return BookType.class;
    case PROMOTIONTYPE_CLASSIFIER_ID:
      return PromotionType.class;
    case COLLECTIONTYPE_CLASSIFIER_ID:
      return CollectionType.class;
    case DOCUMENTROOT_CLASSIFIER_ID:
      return DocumentRoot.class;
    case BOOKCATEGORYTYPE1_CLASSIFIER_ID:
      return BookCategoryType1.class;
    case BOOKCATEGORYTYPE_CLASSIFIER_ID:
      return BookCategoryType.class;
    case BOOKCATEGORYTYPEOBJECT_CLASSIFIER_ID:
      return BookCategoryType.class;
    case BOOKCATEGORYTYPEOBJECT1_CLASSIFIER_ID:
      return BookCategoryType1.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
