package org.eclipse.emf.texo.test.model.samples.extlibrary;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.AbstractModelObject;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: extlibrary. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ExtlibraryModelFactory implements ModelFactory {

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
    case ExtlibraryModelPackage.BOOK_CLASSIFIER_ID:
      return createBook();
    case ExtlibraryModelPackage.WRITER_CLASSIFIER_ID:
      return createWriter();
    case ExtlibraryModelPackage.PERSON_CLASSIFIER_ID:
      return createPerson();
    case ExtlibraryModelPackage.LIBRARY_CLASSIFIER_ID:
      return createLibrary();
    case ExtlibraryModelPackage.EMPLOYEE_CLASSIFIER_ID:
      return createEmployee();
    case ExtlibraryModelPackage.BORROWER_CLASSIFIER_ID:
      return createBorrower();
    case ExtlibraryModelPackage.BOOKONTAPE_CLASSIFIER_ID:
      return createBookOnTape();
    case ExtlibraryModelPackage.VIDEOCASSETTE_CLASSIFIER_ID:
      return createVideoCassette();
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
    case ExtlibraryModelPackage.BOOK_CLASSIFIER_ID:
      modelObject = new BookModelObject();
      break;
    case ExtlibraryModelPackage.ITEM_CLASSIFIER_ID:
      modelObject = new ItemModelObject();
      break;
    case ExtlibraryModelPackage.LENDABLE_CLASSIFIER_ID:
      modelObject = new LendableModelObject();
      break;
    case ExtlibraryModelPackage.CIRCULATINGITEM_CLASSIFIER_ID:
      modelObject = new CirculatingItemModelObject();
      break;
    case ExtlibraryModelPackage.WRITER_CLASSIFIER_ID:
      modelObject = new WriterModelObject();
      break;
    case ExtlibraryModelPackage.ADDRESSABLE_CLASSIFIER_ID:
      modelObject = new AddressableModelObject();
      break;
    case ExtlibraryModelPackage.PERSON_CLASSIFIER_ID:
      modelObject = new PersonModelObject();
      break;
    case ExtlibraryModelPackage.LIBRARY_CLASSIFIER_ID:
      modelObject = new LibraryModelObject();
      break;
    case ExtlibraryModelPackage.EMPLOYEE_CLASSIFIER_ID:
      modelObject = new EmployeeModelObject();
      break;
    case ExtlibraryModelPackage.BORROWER_CLASSIFIER_ID:
      modelObject = new BorrowerModelObject();
      break;
    case ExtlibraryModelPackage.PERIODICAL_CLASSIFIER_ID:
      modelObject = new PeriodicalModelObject();
      break;
    case ExtlibraryModelPackage.AUDIOVISUALITEM_CLASSIFIER_ID:
      modelObject = new AudioVisualItemModelObject();
      break;
    case ExtlibraryModelPackage.BOOKONTAPE_CLASSIFIER_ID:
      modelObject = new BookOnTapeModelObject();
      break;
    case ExtlibraryModelPackage.VIDEOCASSETTE_CLASSIFIER_ID:
      modelObject = new VideoCassetteModelObject();
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
    if (eFeature == ExtlibraryModelPackage.INSTANCE.getLibrary_People()) {
      return new LibraryPeopleFeatureGroup();
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
    if (eFeature == ExtlibraryModelPackage.INSTANCE.getLibrary_People()) {
      final LibraryPeopleFeatureGroupModelFeatureMapEntry<LibraryPeopleFeatureGroup> entry = new LibraryPeopleFeatureGroupModelFeatureMapEntry<LibraryPeopleFeatureGroup>();
      entry.setTarget((LibraryPeopleFeatureGroup) adaptee);
      return entry;
    }
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Book
   * @generated
   */
  public Book createBook() {
    return new Book();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Writer
   * @generated
   */
  public Writer createWriter() {
    return new Writer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Person
   * @generated
   */
  public Person createPerson() {
    return new Person();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Library
   * @generated
   */
  public Library createLibrary() {
    return new Library();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Employee
   * @generated
   */
  public Employee createEmployee() {
    return new Employee();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Borrower
   * @generated
   */
  public Borrower createBorrower() {
    return new Borrower();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BookOnTape
   * @generated
   */
  public BookOnTape createBookOnTape() {
    return new BookOnTape();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass VideoCassette
   * @generated
   */
  public VideoCassette createVideoCassette() {
    return new VideoCassette();
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
    case ExtlibraryModelPackage.BOOKCATEGORY_CLASSIFIER_ID:
      return createBookCategoryFromString(value);
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
    case ExtlibraryModelPackage.BOOKCATEGORY_CLASSIFIER_ID:
      return convertBookCategoryToString((BookCategory) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: BookCategory to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertBookCategoryToString(BookCategory value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: BookCategory from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public BookCategory createBookCategoryFromString(String value) {
    if (value == null) {
      return null;
    }
    return BookCategory.get(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Book</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BookModelObject<E extends Book> extends CirculatingItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ExtlibraryModelPackage.INSTANCE.getBookEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ExtlibraryModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ExtlibraryModelPackage.BOOK_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ExtlibraryModelPackage.BOOK_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ExtlibraryModelPackage.BOOK_PUBLICATIONDATE_FEATURE_ID:
        return getTarget().getPublicationDate();
      case ExtlibraryModelPackage.BOOK_COPIES_FEATURE_ID:
        return getTarget().getCopies();
      case ExtlibraryModelPackage.BOOK_BORROWERS_FEATURE_ID:
        return getTarget().getBorrowers();
      case ExtlibraryModelPackage.BOOK_TITLE_FEATURE_ID:
        return getTarget().getTitle();
      case ExtlibraryModelPackage.BOOK_PAGES_FEATURE_ID:
        return getTarget().getPages();
      case ExtlibraryModelPackage.BOOK_CATEGORY_FEATURE_ID:
        return getTarget().getCategory();
      case ExtlibraryModelPackage.BOOK_AUTHOR_FEATURE_ID:
        return getTarget().getAuthor();
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
      case ExtlibraryModelPackage.BOOK_TITLE_FEATURE_ID:
        getTarget().setTitle((String) value);
        return;
      case ExtlibraryModelPackage.BOOK_PAGES_FEATURE_ID:
        getTarget().setPages((Integer) value);
        return;
      case ExtlibraryModelPackage.BOOK_CATEGORY_FEATURE_ID:
        getTarget().setCategory((BookCategory) value);
        return;
      case ExtlibraryModelPackage.BOOK_AUTHOR_FEATURE_ID:
        getTarget().setAuthor((Writer) value);
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
   * The adapter/wrapper for the EClass '<em><b>Item</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ItemModelObject<E extends Item> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ExtlibraryModelPackage.INSTANCE.getItemEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ExtlibraryModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ExtlibraryModelPackage.ITEM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ExtlibraryModelPackage.ITEM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ExtlibraryModelPackage.ITEM_PUBLICATIONDATE_FEATURE_ID:
        return getTarget().getPublicationDate();
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
      case ExtlibraryModelPackage.ITEM_PUBLICATIONDATE_FEATURE_ID:
        getTarget().setPublicationDate((Date) value);
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
   * The adapter/wrapper for the EClass '<em><b>Lendable</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class LendableModelObject<E extends Lendable> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return ExtlibraryModelPackage.INSTANCE.getLendableEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return ExtlibraryModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ExtlibraryModelPackage.LENDABLE_COPIES_FEATURE_ID:
        return getTarget().getCopies();
      case ExtlibraryModelPackage.LENDABLE_BORROWERS_FEATURE_ID:
        return getTarget().getBorrowers();
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
      case ExtlibraryModelPackage.LENDABLE_COPIES_FEATURE_ID:
        getTarget().setCopies((Integer) value);
        return;
      case ExtlibraryModelPackage.LENDABLE_BORROWERS_FEATURE_ID:
        getTarget().setBorrowers((Set<Borrower>) value);
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

      case ExtlibraryModelPackage.LENDABLE_BORROWERS_FEATURE_ID:
        return getTarget().addToBorrowers((Borrower) value);
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

      case ExtlibraryModelPackage.LENDABLE_BORROWERS_FEATURE_ID:
        return getTarget().removeFromBorrowers((Borrower) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CirculatingItem</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CirculatingItemModelObject<E extends CirculatingItem> extends ItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ExtlibraryModelPackage.INSTANCE.getCirculatingItemEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ExtlibraryModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ExtlibraryModelPackage.CIRCULATINGITEM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ExtlibraryModelPackage.CIRCULATINGITEM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ExtlibraryModelPackage.CIRCULATINGITEM_PUBLICATIONDATE_FEATURE_ID:
        return getTarget().getPublicationDate();
      case ExtlibraryModelPackage.CIRCULATINGITEM_COPIES_FEATURE_ID:
        return getTarget().getCopies();
      case ExtlibraryModelPackage.CIRCULATINGITEM_BORROWERS_FEATURE_ID:
        return getTarget().getBorrowers();
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
      case ExtlibraryModelPackage.CIRCULATINGITEM_COPIES_FEATURE_ID:
        getTarget().setCopies((Integer) value);
        return;
      case ExtlibraryModelPackage.CIRCULATINGITEM_BORROWERS_FEATURE_ID:
        getTarget().setBorrowers((Set<Borrower>) value);
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

      case ExtlibraryModelPackage.CIRCULATINGITEM_BORROWERS_FEATURE_ID:
        return getTarget().addToBorrowers((Borrower) value);
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

      case ExtlibraryModelPackage.CIRCULATINGITEM_BORROWERS_FEATURE_ID:
        return getTarget().removeFromBorrowers((Borrower) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Writer</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class WriterModelObject<E extends Writer> extends PersonModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ExtlibraryModelPackage.INSTANCE.getWriterEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ExtlibraryModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ExtlibraryModelPackage.WRITER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ExtlibraryModelPackage.WRITER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ExtlibraryModelPackage.WRITER_FIRSTNAME_FEATURE_ID:
        return getTarget().getFirstName();
      case ExtlibraryModelPackage.WRITER_LASTNAME_FEATURE_ID:
        return getTarget().getLastName();
      case ExtlibraryModelPackage.WRITER_ADDRESS_FEATURE_ID:
        return getTarget().getAddress();
      case ExtlibraryModelPackage.WRITER_NAME_FEATURE_ID:
        return getTarget().getName();
      case ExtlibraryModelPackage.WRITER_BOOKS_FEATURE_ID:
        return getTarget().getBooks();
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
      case ExtlibraryModelPackage.WRITER_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case ExtlibraryModelPackage.WRITER_BOOKS_FEATURE_ID:
        getTarget().setBooks((List<Book>) value);
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

      case ExtlibraryModelPackage.WRITER_BOOKS_FEATURE_ID:
        return getTarget().addToBooks((Book) value);
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

      case ExtlibraryModelPackage.WRITER_BOOKS_FEATURE_ID:
        return getTarget().removeFromBooks((Book) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Addressable</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AddressableModelObject<E extends Addressable> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return ExtlibraryModelPackage.INSTANCE.getAddressableEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return ExtlibraryModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ExtlibraryModelPackage.ADDRESSABLE_ADDRESS_FEATURE_ID:
        return getTarget().getAddress();
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
      case ExtlibraryModelPackage.ADDRESSABLE_ADDRESS_FEATURE_ID:
        getTarget().setAddress((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Person</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PersonModelObject<E extends Person> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ExtlibraryModelPackage.INSTANCE.getPersonEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ExtlibraryModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ExtlibraryModelPackage.PERSON_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ExtlibraryModelPackage.PERSON_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ExtlibraryModelPackage.PERSON_FIRSTNAME_FEATURE_ID:
        return getTarget().getFirstName();
      case ExtlibraryModelPackage.PERSON_LASTNAME_FEATURE_ID:
        return getTarget().getLastName();
      case ExtlibraryModelPackage.PERSON_ADDRESS_FEATURE_ID:
        return getTarget().getAddress();
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
      case ExtlibraryModelPackage.PERSON_FIRSTNAME_FEATURE_ID:
        getTarget().setFirstName((String) value);
        return;
      case ExtlibraryModelPackage.PERSON_LASTNAME_FEATURE_ID:
        getTarget().setLastName((String) value);
        return;
      case ExtlibraryModelPackage.PERSON_ADDRESS_FEATURE_ID:
        getTarget().setAddress((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Library</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class LibraryModelObject<E extends Library> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ExtlibraryModelPackage.INSTANCE.getLibraryEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ExtlibraryModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ExtlibraryModelPackage.LIBRARY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ExtlibraryModelPackage.LIBRARY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ExtlibraryModelPackage.LIBRARY_NAME_FEATURE_ID:
        return getTarget().getName();
      case ExtlibraryModelPackage.LIBRARY_WRITERS_FEATURE_ID:
        return getTarget().getWriters();
      case ExtlibraryModelPackage.LIBRARY_EMPLOYEES_FEATURE_ID:
        return getTarget().getEmployees();
      case ExtlibraryModelPackage.LIBRARY_BORROWERS_FEATURE_ID:
        return getTarget().getBorrowers();
      case ExtlibraryModelPackage.LIBRARY_STOCK_FEATURE_ID:
        return getTarget().getStock();
      case ExtlibraryModelPackage.LIBRARY_BOOKS_FEATURE_ID:
        return getTarget().getBooks();
      case ExtlibraryModelPackage.LIBRARY_BRANCHES_FEATURE_ID:
        return getTarget().getBranches();
      case ExtlibraryModelPackage.LIBRARY_PARENTBRANCH_FEATURE_ID:
        return getTarget().getParentBranch();
      case ExtlibraryModelPackage.LIBRARY_PEOPLE_FEATURE_ID:
        return getTarget().getPeople();
      case ExtlibraryModelPackage.LIBRARY_ADDRESS_FEATURE_ID:
        return getTarget().getAddress();
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
      case ExtlibraryModelPackage.LIBRARY_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case ExtlibraryModelPackage.LIBRARY_WRITERS_FEATURE_ID:
        getTarget().setWriters((List<Writer>) value);
        return;
      case ExtlibraryModelPackage.LIBRARY_EMPLOYEES_FEATURE_ID:
        getTarget().setEmployees((List<Employee>) value);
        return;
      case ExtlibraryModelPackage.LIBRARY_BORROWERS_FEATURE_ID:
        getTarget().setBorrowers((List<Borrower>) value);
        return;
      case ExtlibraryModelPackage.LIBRARY_STOCK_FEATURE_ID:
        getTarget().setStock((Set<Item>) value);
        return;
      case ExtlibraryModelPackage.LIBRARY_BOOKS_FEATURE_ID:
        getTarget().setBooks((Set<Book>) value);
        return;
      case ExtlibraryModelPackage.LIBRARY_BRANCHES_FEATURE_ID:
        getTarget().setBranches((List<Library>) value);
        return;
      case ExtlibraryModelPackage.LIBRARY_PARENTBRANCH_FEATURE_ID:
        getTarget().setParentBranch((Library) value);
        return;
      case ExtlibraryModelPackage.LIBRARY_PEOPLE_FEATURE_ID:
        getTarget().setPeople((List<LibraryPeopleFeatureGroup>) value);
        return;
      case ExtlibraryModelPackage.LIBRARY_ADDRESS_FEATURE_ID:
        getTarget().setAddress((String) value);
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

      case ExtlibraryModelPackage.LIBRARY_WRITERS_FEATURE_ID:
        return getTarget().getWriters().add((Writer) value);

      case ExtlibraryModelPackage.LIBRARY_EMPLOYEES_FEATURE_ID:
        return getTarget().getEmployees().add((Employee) value);

      case ExtlibraryModelPackage.LIBRARY_BORROWERS_FEATURE_ID:
        return getTarget().getBorrowers().add((Borrower) value);

      case ExtlibraryModelPackage.LIBRARY_STOCK_FEATURE_ID:
        return getTarget().addToStock((Item) value);

      case ExtlibraryModelPackage.LIBRARY_BOOKS_FEATURE_ID:
        return getTarget().addToBooks((Book) value);

      case ExtlibraryModelPackage.LIBRARY_BRANCHES_FEATURE_ID:
        return getTarget().addToBranches((Library) value);

      case ExtlibraryModelPackage.LIBRARY_PEOPLE_FEATURE_ID:
        return getTarget().getPeople().add((LibraryPeopleFeatureGroup) value);

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

      case ExtlibraryModelPackage.LIBRARY_WRITERS_FEATURE_ID:
        return getTarget().getWriters().remove(value);

      case ExtlibraryModelPackage.LIBRARY_EMPLOYEES_FEATURE_ID:
        return getTarget().getEmployees().remove(value);

      case ExtlibraryModelPackage.LIBRARY_BORROWERS_FEATURE_ID:
        return getTarget().getBorrowers().remove(value);

      case ExtlibraryModelPackage.LIBRARY_STOCK_FEATURE_ID:
        return getTarget().removeFromStock((Item) value);

      case ExtlibraryModelPackage.LIBRARY_BOOKS_FEATURE_ID:
        return getTarget().removeFromBooks((Book) value);

      case ExtlibraryModelPackage.LIBRARY_BRANCHES_FEATURE_ID:
        return getTarget().removeFromBranches((Library) value);

      case ExtlibraryModelPackage.LIBRARY_PEOPLE_FEATURE_ID:
        return getTarget().getPeople().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Employee</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EmployeeModelObject<E extends Employee> extends PersonModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ExtlibraryModelPackage.INSTANCE.getEmployeeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ExtlibraryModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ExtlibraryModelPackage.EMPLOYEE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ExtlibraryModelPackage.EMPLOYEE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ExtlibraryModelPackage.EMPLOYEE_FIRSTNAME_FEATURE_ID:
        return getTarget().getFirstName();
      case ExtlibraryModelPackage.EMPLOYEE_LASTNAME_FEATURE_ID:
        return getTarget().getLastName();
      case ExtlibraryModelPackage.EMPLOYEE_ADDRESS_FEATURE_ID:
        return getTarget().getAddress();
      case ExtlibraryModelPackage.EMPLOYEE_MANAGER_FEATURE_ID:
        return getTarget().getManager();
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
      case ExtlibraryModelPackage.EMPLOYEE_MANAGER_FEATURE_ID:
        getTarget().setManager((Employee) value);
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
   * The adapter/wrapper for the EClass '<em><b>Borrower</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BorrowerModelObject<E extends Borrower> extends PersonModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ExtlibraryModelPackage.INSTANCE.getBorrowerEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ExtlibraryModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ExtlibraryModelPackage.BORROWER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ExtlibraryModelPackage.BORROWER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ExtlibraryModelPackage.BORROWER_FIRSTNAME_FEATURE_ID:
        return getTarget().getFirstName();
      case ExtlibraryModelPackage.BORROWER_LASTNAME_FEATURE_ID:
        return getTarget().getLastName();
      case ExtlibraryModelPackage.BORROWER_ADDRESS_FEATURE_ID:
        return getTarget().getAddress();
      case ExtlibraryModelPackage.BORROWER_BORROWED_FEATURE_ID:
        return getTarget().getBorrowed();
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
      case ExtlibraryModelPackage.BORROWER_BORROWED_FEATURE_ID:
        getTarget().setBorrowed((List<Lendable>) value);
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

      case ExtlibraryModelPackage.BORROWER_BORROWED_FEATURE_ID:
        return getTarget().addToBorrowed((Lendable) value);
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

      case ExtlibraryModelPackage.BORROWER_BORROWED_FEATURE_ID:
        return getTarget().removeFromBorrowed((Lendable) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Periodical</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PeriodicalModelObject<E extends Periodical> extends ItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ExtlibraryModelPackage.INSTANCE.getPeriodicalEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ExtlibraryModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ExtlibraryModelPackage.PERIODICAL_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ExtlibraryModelPackage.PERIODICAL_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ExtlibraryModelPackage.PERIODICAL_PUBLICATIONDATE_FEATURE_ID:
        return getTarget().getPublicationDate();
      case ExtlibraryModelPackage.PERIODICAL_TITLE_FEATURE_ID:
        return getTarget().getTitle();
      case ExtlibraryModelPackage.PERIODICAL_ISSUESPERYEAR_FEATURE_ID:
        return getTarget().getIssuesPerYear();
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
      case ExtlibraryModelPackage.PERIODICAL_TITLE_FEATURE_ID:
        getTarget().setTitle((String) value);
        return;
      case ExtlibraryModelPackage.PERIODICAL_ISSUESPERYEAR_FEATURE_ID:
        getTarget().setIssuesPerYear((Integer) value);
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
   * The adapter/wrapper for the EClass '<em><b>AudioVisualItem</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AudioVisualItemModelObject<E extends AudioVisualItem> extends CirculatingItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ExtlibraryModelPackage.INSTANCE.getAudioVisualItemEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ExtlibraryModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ExtlibraryModelPackage.AUDIOVISUALITEM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ExtlibraryModelPackage.AUDIOVISUALITEM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ExtlibraryModelPackage.AUDIOVISUALITEM_PUBLICATIONDATE_FEATURE_ID:
        return getTarget().getPublicationDate();
      case ExtlibraryModelPackage.AUDIOVISUALITEM_COPIES_FEATURE_ID:
        return getTarget().getCopies();
      case ExtlibraryModelPackage.AUDIOVISUALITEM_BORROWERS_FEATURE_ID:
        return getTarget().getBorrowers();
      case ExtlibraryModelPackage.AUDIOVISUALITEM_TITLE_FEATURE_ID:
        return getTarget().getTitle();
      case ExtlibraryModelPackage.AUDIOVISUALITEM_MINUTESLENGTH_FEATURE_ID:
        return getTarget().getMinutesLength();
      case ExtlibraryModelPackage.AUDIOVISUALITEM_DAMAGED_FEATURE_ID:
        return getTarget().isDamaged();
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
      case ExtlibraryModelPackage.AUDIOVISUALITEM_TITLE_FEATURE_ID:
        getTarget().setTitle((String) value);
        return;
      case ExtlibraryModelPackage.AUDIOVISUALITEM_MINUTESLENGTH_FEATURE_ID:
        getTarget().setMinutesLength((Integer) value);
        return;
      case ExtlibraryModelPackage.AUDIOVISUALITEM_DAMAGED_FEATURE_ID:
        getTarget().setDamaged((Boolean) value);
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
   * The adapter/wrapper for the EClass '<em><b>BookOnTape</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BookOnTapeModelObject<E extends BookOnTape> extends AudioVisualItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ExtlibraryModelPackage.INSTANCE.getBookOnTapeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ExtlibraryModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ExtlibraryModelPackage.BOOKONTAPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ExtlibraryModelPackage.BOOKONTAPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ExtlibraryModelPackage.BOOKONTAPE_PUBLICATIONDATE_FEATURE_ID:
        return getTarget().getPublicationDate();
      case ExtlibraryModelPackage.BOOKONTAPE_COPIES_FEATURE_ID:
        return getTarget().getCopies();
      case ExtlibraryModelPackage.BOOKONTAPE_BORROWERS_FEATURE_ID:
        return getTarget().getBorrowers();
      case ExtlibraryModelPackage.BOOKONTAPE_TITLE_FEATURE_ID:
        return getTarget().getTitle();
      case ExtlibraryModelPackage.BOOKONTAPE_MINUTESLENGTH_FEATURE_ID:
        return getTarget().getMinutesLength();
      case ExtlibraryModelPackage.BOOKONTAPE_DAMAGED_FEATURE_ID:
        return getTarget().isDamaged();
      case ExtlibraryModelPackage.BOOKONTAPE_READER_FEATURE_ID:
        return getTarget().getReader();
      case ExtlibraryModelPackage.BOOKONTAPE_AUTHOR_FEATURE_ID:
        return getTarget().getAuthor();
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
      case ExtlibraryModelPackage.BOOKONTAPE_READER_FEATURE_ID:
        getTarget().setReader((Person) value);
        return;
      case ExtlibraryModelPackage.BOOKONTAPE_AUTHOR_FEATURE_ID:
        getTarget().setAuthor((Writer) value);
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
   * The adapter/wrapper for the EClass '<em><b>VideoCassette</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class VideoCassetteModelObject<E extends VideoCassette> extends AudioVisualItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ExtlibraryModelPackage.INSTANCE.getVideoCassetteEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ExtlibraryModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ExtlibraryModelPackage.VIDEOCASSETTE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ExtlibraryModelPackage.VIDEOCASSETTE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ExtlibraryModelPackage.VIDEOCASSETTE_PUBLICATIONDATE_FEATURE_ID:
        return getTarget().getPublicationDate();
      case ExtlibraryModelPackage.VIDEOCASSETTE_COPIES_FEATURE_ID:
        return getTarget().getCopies();
      case ExtlibraryModelPackage.VIDEOCASSETTE_BORROWERS_FEATURE_ID:
        return getTarget().getBorrowers();
      case ExtlibraryModelPackage.VIDEOCASSETTE_TITLE_FEATURE_ID:
        return getTarget().getTitle();
      case ExtlibraryModelPackage.VIDEOCASSETTE_MINUTESLENGTH_FEATURE_ID:
        return getTarget().getMinutesLength();
      case ExtlibraryModelPackage.VIDEOCASSETTE_DAMAGED_FEATURE_ID:
        return getTarget().isDamaged();
      case ExtlibraryModelPackage.VIDEOCASSETTE_CAST_FEATURE_ID:
        return getTarget().getCast();
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
      case ExtlibraryModelPackage.VIDEOCASSETTE_CAST_FEATURE_ID:
        getTarget().setCast((List<Person>) value);
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

      case ExtlibraryModelPackage.VIDEOCASSETTE_CAST_FEATURE_ID:
        return getTarget().addToCast((Person) value);
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

      case ExtlibraryModelPackage.VIDEOCASSETTE_CAST_FEATURE_ID:
        return getTarget().removeFromCast((Person) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The wrapper/adapter for the Feature Group '<em><b>Library.people</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class LibraryPeopleFeatureGroupModelFeatureMapEntry<E extends LibraryPeopleFeatureGroup> extends
      AbstractModelFeatureMapEntry<LibraryPeopleFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case WRITERS:
        return ExtlibraryModelPackage.INSTANCE.getLibrary_Writers();
      case EMPLOYEES:
        return ExtlibraryModelPackage.INSTANCE.getLibrary_Employees();
      case BORROWERS:
        return ExtlibraryModelPackage.INSTANCE.getLibrary_Borrowers();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = ExtlibraryModelPackage.INSTANCE.getLibraryEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case ExtlibraryModelPackage.LIBRARY_WRITERS_FEATURE_ID:
        getTarget().setFeature(LibraryPeopleFeatureGroup.Feature.WRITERS);
        return;
      case ExtlibraryModelPackage.LIBRARY_EMPLOYEES_FEATURE_ID:
        getTarget().setFeature(LibraryPeopleFeatureGroup.Feature.EMPLOYEES);
        return;
      case ExtlibraryModelPackage.LIBRARY_BORROWERS_FEATURE_ID:
        getTarget().setFeature(LibraryPeopleFeatureGroup.Feature.BORROWERS);
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