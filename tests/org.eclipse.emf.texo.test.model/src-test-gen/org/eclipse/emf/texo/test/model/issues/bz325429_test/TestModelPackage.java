package org.eclipse.emf.texo.test.model.issues.bz325429_test;

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
import org.eclipse.emf.texo.test.model.issues.bz325429_test.dao.AddressDao;
import org.eclipse.emf.texo.test.model.issues.bz325429_test.dao.ContactDao;
import org.eclipse.emf.texo.test.model.issues.bz325429_test.dao.PersonDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>test</b></em>'. It contains initialization code and access to the Factory to
 * instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TestModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz325429";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final TestModelFactory MODELFACTORY = new TestModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTACTTYPE_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_CLASSIFIER_ID = 0;

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
  public static final int PERSON_FIRSTNAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_LASTNAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_ADDRESS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_CONTACTS_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_STREET_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_CITY_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTACT_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTACT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTACT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTACT_VALUE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTACT_TYPE_FEATURE_ID = 3;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final TestModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static TestModelPackage initialize() {

    if (isInitialized) {
      return (TestModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final TestModelPackage modelPackage = new TestModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Person.class, modelPackage.getPersonEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Address.class, modelPackage.getAddressEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Contact.class, modelPackage.getContactEClass(), modelPackage);

    ModelResolver.getInstance().registerClassModelMapping(ContactType.class, modelPackage.getContactTypeEEnum(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(Person.class, PersonDao.class);
    DaoRegistry.getInstance().registerDao(Address.class, AddressDao.class);
    DaoRegistry.getInstance().registerDao(Contact.class, ContactDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link TestModelFactory} instance.
   * @generated
   */
  @Override
  public TestModelFactory getModelFactory() {
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
    return "test.ecore";
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
   * Returns the {@link EStructuralFeature} '<em><b>Person.firstname</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Person.firstname</b></em>'.
   * @generated
   */
  public EAttribute getPerson_Firstname() {
    return (EAttribute) getPersonEClass().getEAllStructuralFeatures().get(PERSON_FIRSTNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Person.lastname</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Person.lastname</b></em>'.
   * @generated
   */
  public EAttribute getPerson_Lastname() {
    return (EAttribute) getPersonEClass().getEAllStructuralFeatures().get(PERSON_LASTNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Person.address</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Person.address</b></em>'.
   * @generated
   */
  public EReference getPerson_Address() {
    return (EReference) getPersonEClass().getEAllStructuralFeatures().get(PERSON_ADDRESS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Person.contacts</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Person.contacts</b></em>'.
   * @generated
   */
  public EReference getPerson_Contacts() {
    return (EReference) getPersonEClass().getEAllStructuralFeatures().get(PERSON_CONTACTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Address</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Address</b></em>'
   * @generated
   */
  public EClass getAddressEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ADDRESS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Address.street</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Address.street</b></em>'.
   * @generated
   */
  public EAttribute getAddress_Street() {
    return (EAttribute) getAddressEClass().getEAllStructuralFeatures().get(ADDRESS_STREET_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Address.city</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Address.city</b></em>'.
   * @generated
   */
  public EAttribute getAddress_City() {
    return (EAttribute) getAddressEClass().getEAllStructuralFeatures().get(ADDRESS_CITY_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Contact</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Contact</b></em>'
   * @generated
   */
  public EClass getContactEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONTACT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Contact.value</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Contact.value</b></em>'.
   * @generated
   */
  public EAttribute getContact_Value() {
    return (EAttribute) getContactEClass().getEAllStructuralFeatures().get(CONTACT_VALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Contact.type</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Contact.type</b></em>'.
   * @generated
   */
  public EAttribute getContact_Type() {
    return (EAttribute) getContactEClass().getEAllStructuralFeatures().get(CONTACT_TYPE_FEATURE_ID);
  }

  /**
   * Returns the EEnum '<em><b>ContactType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>ContactType</b></em>'
   * @generated
   */
  public EEnum getContactTypeEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(CONTACTTYPE_CLASSIFIER_ID);
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
    case PERSON_CLASSIFIER_ID:
      return Person.class;
    case ADDRESS_CLASSIFIER_ID:
      return Address.class;
    case CONTACT_CLASSIFIER_ID:
      return Contact.class;
    case CONTACTTYPE_CLASSIFIER_ID:
      return ContactType.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
