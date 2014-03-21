package org.eclipse.emf.texo.test.model.samples.sunbooks;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: org.eclipse.emf.texo.test.model.samples.sunBooks. It
 * contains code to create instances {@link ModelObject} wrappers and instances for EClasses and convert objects back
 * and forth from their String (XML) representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SunBooksModelFactory implements ModelFactory {

  /**
   * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          creates a Object instance for this EClass
   * @return an object representing the eClass
   * @generated
   */
  public Object create(EClass eClass) {
    switch (eClass.getClassifierID()) {
    case SunBooksModelPackage.AUTHORSTYPE_CLASSIFIER_ID:
      return createAuthorsType();
    case SunBooksModelPackage.BOOKSTYPE_CLASSIFIER_ID:
      return createBooksType();
    case SunBooksModelPackage.BOOKTYPE_CLASSIFIER_ID:
      return createBookType();
    case SunBooksModelPackage.PROMOTIONTYPE_CLASSIFIER_ID:
      return createPromotionType();
    case SunBooksModelPackage.COLLECTIONTYPE_CLASSIFIER_ID:
      return createCollectionType();
    case SunBooksModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
      return createDocumentRoot();
    default:
      throw new IllegalArgumentException("The EClass '" + eClass.getName()
          + "' is not a valid EClass for this EPackage");
    }
  }

  /**
   * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          the EClass of the object
   * @param adaptee
   *          the object being wrapped/adapted
   * @return the wrapper {@link ModelObject}
   * @generated
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public ModelObject createModelObject(EClass eClass, Object adaptee) {
    ModelObject<Object> modelObject = null;
    switch (eClass.getClassifierID()) {
    case SunBooksModelPackage.AUTHORSTYPE_CLASSIFIER_ID:
      modelObject = new AuthorsTypeModelObject();
      break;
    case SunBooksModelPackage.BOOKSTYPE_CLASSIFIER_ID:
      modelObject = new BooksTypeModelObject();
      break;
    case SunBooksModelPackage.BOOKTYPE_CLASSIFIER_ID:
      modelObject = new BookTypeModelObject();
      break;
    case SunBooksModelPackage.PROMOTIONTYPE_CLASSIFIER_ID:
      modelObject = new PromotionTypeModelObject();
      break;
    case SunBooksModelPackage.COLLECTIONTYPE_CLASSIFIER_ID:
      modelObject = new CollectionTypeModelObject();
      break;
    case SunBooksModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
      modelObject = new DocumentRootModelObject();
      break;
    default:
      throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
    }
    modelObject.setTarget(adaptee);
    return modelObject;
  }

  /**
   * Creates a feature map entry instance for a certain EStructuralFeature.
   * 
   * @param eFeature
   *          the feature map feature
   * @return the pojo feature map entry
   * @generated
   */
  public Object createFeatureMapEntry(EStructuralFeature eFeature) {
    if (eFeature == SunBooksModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
      return new DocumentRootMixedFeatureGroup();
    }
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}. If the feature map entry is null then a
   * new one is created and <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eFeature
   *          the feature map feature of the object
   * @param adaptee
   *          the pojo feature map entry being wrapped/adapted
   * @return the wrapper {@link ModelFeatureMapEntry}
   * @generated
   */
  public ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature, Object adaptee) {
    if (eFeature == SunBooksModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
      final DocumentRootMixedFeatureGroupModelFeatureMapEntry<DocumentRootMixedFeatureGroup> entry = new DocumentRootMixedFeatureGroupModelFeatureMapEntry<DocumentRootMixedFeatureGroup>();
      entry.setTarget((DocumentRootMixedFeatureGroup) adaptee);
      return entry;
    }
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass AuthorsType
   * @generated
   */
  public AuthorsType createAuthorsType() {
    return new AuthorsType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BooksType
   * @generated
   */
  public BooksType createBooksType() {
    return new BooksType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BookType
   * @generated
   */
  public BookType createBookType() {
    return new BookType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PromotionType
   * @generated
   */
  public PromotionType createPromotionType() {
    return new PromotionType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CollectionType
   * @generated
   */
  public CollectionType createCollectionType() {
    return new CollectionType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DocumentRoot
   * @generated
   */
  public DocumentRoot createDocumentRoot() {
    return new DocumentRoot();
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if the value is null then null is returned.
   * @generated
   */
  public Object createFromString(EDataType eDataType, String value) {
    switch (eDataType.getClassifierID()) {
    case SunBooksModelPackage.BOOKCATEGORYTYPE1_CLASSIFIER_ID:
      return createBookCategoryType1FromString(value);
    case SunBooksModelPackage.BOOKCATEGORYTYPE_CLASSIFIER_ID:
      return createBookCategoryTypeFromString(value);
    case SunBooksModelPackage.BOOKCATEGORYTYPEOBJECT_CLASSIFIER_ID:
      return createBookCategoryTypeObjectFromString(value);
    case SunBooksModelPackage.BOOKCATEGORYTYPEOBJECT1_CLASSIFIER_ID:
      return createBookCategoryTypeObject1FromString(value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
    }
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if value == null then null is returned
   * @generated
   */
  public String convertToString(EDataType eDataType, Object value) {
    switch (eDataType.getClassifierID()) {
    case SunBooksModelPackage.BOOKCATEGORYTYPE1_CLASSIFIER_ID:
      return convertBookCategoryType1ToString((BookCategoryType1) value);
    case SunBooksModelPackage.BOOKCATEGORYTYPE_CLASSIFIER_ID:
      return convertBookCategoryTypeToString((BookCategoryType) value);
    case SunBooksModelPackage.BOOKCATEGORYTYPEOBJECT_CLASSIFIER_ID:
      return convertBookCategoryTypeObjectToString((BookCategoryType) value);
    case SunBooksModelPackage.BOOKCATEGORYTYPEOBJECT1_CLASSIFIER_ID:
      return convertBookCategoryTypeObject1ToString((BookCategoryType1) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: BookCategoryType1 to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertBookCategoryType1ToString(BookCategoryType1 value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: BookCategoryType1 from a String. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public BookCategoryType1 createBookCategoryType1FromString(String value) {
    if (value == null) {
      return null;
    }
    return BookCategoryType1.get(value);
  }

  /**
   * Converts the EDataType: BookCategoryType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertBookCategoryTypeToString(BookCategoryType value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: BookCategoryType from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public BookCategoryType createBookCategoryTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return BookCategoryType.get(value);
  }

  /**
   * Converts the EDataType: BookCategoryTypeObject to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertBookCategoryTypeObjectToString(BookCategoryType value) {
    if (value == null) {
      return null;
    }
    return convertBookCategoryTypeToString(value);
  }

  /**
   * Creates an instance of the EDataType: BookCategoryTypeObject from a String. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public BookCategoryType createBookCategoryTypeObjectFromString(String value) {
    if (value == null) {
      return null;
    }
    return createBookCategoryTypeFromString(value);
  }

  /**
   * Converts the EDataType: BookCategoryTypeObject1 to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertBookCategoryTypeObject1ToString(BookCategoryType1 value) {
    if (value == null) {
      return null;
    }
    return convertBookCategoryType1ToString(value);
  }

  /**
   * Creates an instance of the EDataType: BookCategoryTypeObject1 from a String. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public BookCategoryType1 createBookCategoryTypeObject1FromString(String value) {
    if (value == null) {
      return null;
    }
    return createBookCategoryType1FromString(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AuthorsType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AuthorsTypeModelObject<E extends AuthorsType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SunBooksModelPackage.INSTANCE.getAuthorsTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SunBooksModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SunBooksModelPackage.AUTHORSTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SunBooksModelPackage.AUTHORSTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SunBooksModelPackage.AUTHORSTYPE_AUTHORNAME_FEATURE_ID:
        return getTarget().getAuthorName();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SunBooksModelPackage.AUTHORSTYPE_AUTHORNAME_FEATURE_ID:
        getTarget().setAuthorName((List<String>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case SunBooksModelPackage.AUTHORSTYPE_AUTHORNAME_FEATURE_ID:
        return getTarget().getAuthorName().add((String) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case SunBooksModelPackage.AUTHORSTYPE_AUTHORNAME_FEATURE_ID:
        return getTarget().getAuthorName().remove(value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>BooksType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BooksTypeModelObject<E extends BooksType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SunBooksModelPackage.INSTANCE.getBooksTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SunBooksModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SunBooksModelPackage.BOOKSTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SunBooksModelPackage.BOOKSTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SunBooksModelPackage.BOOKSTYPE_BOOK_FEATURE_ID:
        return getTarget().getBook();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SunBooksModelPackage.BOOKSTYPE_BOOK_FEATURE_ID:
        getTarget().setBook((List<BookType>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case SunBooksModelPackage.BOOKSTYPE_BOOK_FEATURE_ID:
        return getTarget().addToBook((BookType) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case SunBooksModelPackage.BOOKSTYPE_BOOK_FEATURE_ID:
        return getTarget().removeFromBook((BookType) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>BookType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BookTypeModelObject<E extends BookType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SunBooksModelPackage.INSTANCE.getBookTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SunBooksModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SunBooksModelPackage.BOOKTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SunBooksModelPackage.BOOKTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SunBooksModelPackage.BOOKTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case SunBooksModelPackage.BOOKTYPE_ISBN_FEATURE_ID:
        return getTarget().getISBN();
      case SunBooksModelPackage.BOOKTYPE_PRICE_FEATURE_ID:
        return getTarget().getPrice();
      case SunBooksModelPackage.BOOKTYPE_AUTHORS_FEATURE_ID:
        return getTarget().getAuthors();
      case SunBooksModelPackage.BOOKTYPE_DESCRIPTION_FEATURE_ID:
        return getTarget().getDescription();
      case SunBooksModelPackage.BOOKTYPE_PROMOTION_FEATURE_ID:
        return getTarget().getPromotion();
      case SunBooksModelPackage.BOOKTYPE_PUBLICATIONDATE_FEATURE_ID:
        return getTarget().getPublicationDate();
      case SunBooksModelPackage.BOOKTYPE_BOOKCATEGORY_FEATURE_ID:
        return getTarget().getBookCategory();
      case SunBooksModelPackage.BOOKTYPE_ITEMID_FEATURE_ID:
        return getTarget().getItemId();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SunBooksModelPackage.BOOKTYPE_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case SunBooksModelPackage.BOOKTYPE_ISBN_FEATURE_ID:
        getTarget().setISBN((Long) value);
        return;
      case SunBooksModelPackage.BOOKTYPE_PRICE_FEATURE_ID:
        getTarget().setPrice((String) value);
        return;
      case SunBooksModelPackage.BOOKTYPE_AUTHORS_FEATURE_ID:
        getTarget().setAuthors((AuthorsType) value);
        return;
      case SunBooksModelPackage.BOOKTYPE_DESCRIPTION_FEATURE_ID:
        getTarget().setDescription((String) value);
        return;
      case SunBooksModelPackage.BOOKTYPE_PROMOTION_FEATURE_ID:
        getTarget().setPromotion((PromotionType) value);
        return;
      case SunBooksModelPackage.BOOKTYPE_PUBLICATIONDATE_FEATURE_ID:
        getTarget().setPublicationDate((Date) value);
        return;
      case SunBooksModelPackage.BOOKTYPE_BOOKCATEGORY_FEATURE_ID:
        getTarget().setBookCategory((BookCategoryType1) value);
        return;
      case SunBooksModelPackage.BOOKTYPE_ITEMID_FEATURE_ID:
        getTarget().setItemId((String) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>PromotionType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PromotionTypeModelObject<E extends PromotionType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SunBooksModelPackage.INSTANCE.getPromotionTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SunBooksModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SunBooksModelPackage.PROMOTIONTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SunBooksModelPackage.PROMOTIONTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SunBooksModelPackage.PROMOTIONTYPE_DISCOUNT_FEATURE_ID:
        return getTarget().getDiscount();
      case SunBooksModelPackage.PROMOTIONTYPE_NONE_FEATURE_ID:
        return getTarget().getNone();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SunBooksModelPackage.PROMOTIONTYPE_DISCOUNT_FEATURE_ID:
        getTarget().setDiscount((String) value);
        return;
      case SunBooksModelPackage.PROMOTIONTYPE_NONE_FEATURE_ID:
        getTarget().setNone((String) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CollectionType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CollectionTypeModelObject<E extends CollectionType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SunBooksModelPackage.INSTANCE.getCollectionTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SunBooksModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SunBooksModelPackage.COLLECTIONTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SunBooksModelPackage.COLLECTIONTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SunBooksModelPackage.COLLECTIONTYPE_BOOKS_FEATURE_ID:
        return getTarget().getBooks();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SunBooksModelPackage.COLLECTIONTYPE_BOOKS_FEATURE_ID:
        getTarget().setBooks((BooksType) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>DocumentRoot</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DocumentRootModelObject<E extends DocumentRoot> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SunBooksModelPackage.INSTANCE.getDocumentRootEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SunBooksModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SunBooksModelPackage.DOCUMENTROOT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SunBooksModelPackage.DOCUMENTROOT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SunBooksModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed();
      case SunBooksModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
        return getTarget().getXMLNSPrefixMap();
      case SunBooksModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
        return getTarget().getXSISchemaLocation();
      case SunBooksModelPackage.DOCUMENTROOT_COLLECTION_FEATURE_ID:
        return getTarget().getCollection();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SunBooksModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        getTarget().setMixed((List<DocumentRootMixedFeatureGroup>) value);
        return;
      case SunBooksModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
        getTarget().setXMLNSPrefixMap((Map<String, String>) value);
        return;
      case SunBooksModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
        getTarget().setXSISchemaLocation((Map<String, String>) value);
        return;
      case SunBooksModelPackage.DOCUMENTROOT_COLLECTION_FEATURE_ID:
        getTarget().setCollection((CollectionType) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case SunBooksModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed().add((DocumentRootMixedFeatureGroup) value);

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case SunBooksModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The wrapper/adapter for the Feature Group '<em><b>DocumentRoot.mixed</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class DocumentRootMixedFeatureGroupModelFeatureMapEntry<E extends DocumentRootMixedFeatureGroup>
      extends AbstractModelFeatureMapEntry<DocumentRootMixedFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case TEXT:
        return XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text();
      case CDATA:
        return XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA();
      case COMMENT:
        return XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment();
      case COLLECTION:
        return SunBooksModelPackage.INSTANCE.getDocumentRoot_Collection();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {
      if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text()) {
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.TEXT);
        return;
      } else if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA()) {
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.CDATA);
        return;
      } else if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment()) {
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.COMMENT);
        return;
      }

      final EClass eClass = SunBooksModelPackage.INSTANCE.getDocumentRootEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case SunBooksModelPackage.DOCUMENTROOT_COLLECTION_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.COLLECTION);
        return;
      default:
        throw new IllegalArgumentException("EStructuralFeature " + eStructuralFeature + " not supported here");
      }
    }

    /**
     * @generated
     */
    public Object getValue() {
      return getTarget().getValue();
    }

    /**
     * @generated
     */
    public void setValue(final Object value) {
      getTarget().setValue(getTarget().getFeature(), value);
    }
  }
}