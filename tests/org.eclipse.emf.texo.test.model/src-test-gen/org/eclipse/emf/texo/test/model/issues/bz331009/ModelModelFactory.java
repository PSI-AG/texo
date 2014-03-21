package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.math.BigDecimal;
import java.util.Date;
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
 * The <b>{@link ModelFactory}</b> for the types of this model: model. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ModelModelFactory implements ModelFactory {

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
    case ModelModelPackage.SIMCARD_CLASSIFIER_ID:
      return createSimCard();
    case ModelModelPackage.SIMCONTRACT_CLASSIFIER_ID:
      return createSimContract();
    case ModelModelPackage.PAYMENTINFO_CLASSIFIER_ID:
      return createPaymentInfo();
    case ModelModelPackage.SIMCARDXSIMCONTRACT_CLASSIFIER_ID:
      return createSimCardXSimContract();
    case ModelModelPackage.SIMTARIFF_CLASSIFIER_ID:
      return createSimTariff();
    case ModelModelPackage.VOLUMEPAYMENT_CLASSIFIER_ID:
      return createVolumePayment();
    case ModelModelPackage.PERIODICALPAYMENT_CLASSIFIER_ID:
      return createPeriodicalPayment();
    case ModelModelPackage.ONETIMEPAYMENT_CLASSIFIER_ID:
      return createOneTimePayment();
    case ModelModelPackage.SERVICE_CLASSIFIER_ID:
      return createService();
    case ModelModelPackage.UNITS_CLASSIFIER_ID:
      return createUnits();
    case ModelModelPackage.PRICE_CLASSIFIER_ID:
      return createPrice();
    case ModelModelPackage.CARPRODUCER_CLASSIFIER_ID:
      return createCarProducer();
    case ModelModelPackage.CARMODEL_CLASSIFIER_ID:
      return createCarModel();
    case ModelModelPackage.CARREGINFO_CLASSIFIER_ID:
      return createCarRegInfo();
    case ModelModelPackage.PERSON_CLASSIFIER_ID:
      return createPerson();
    case ModelModelPackage.CAR_CLASSIFIER_ID:
      return createCar();
    case ModelModelPackage.CARPASSPORT_CLASSIFIER_ID:
      return createCarPassport();
    case ModelModelPackage.PHONE_CLASSIFIER_ID:
      return createPhone();
    case ModelModelPackage.ADDRESS_CLASSIFIER_ID:
      return createAddress();
    case ModelModelPackage.PASSPORT_CLASSIFIER_ID:
      return createPassport();
    case ModelModelPackage.DRIVINGLICENSE_CLASSIFIER_ID:
      return createDrivingLicense();
    case ModelModelPackage.CONTRACT_CLASSIFIER_ID:
      return createContract();
    case ModelModelPackage.SECRETQUESTION_CLASSIFIER_ID:
      return createSecretQuestion();
    case ModelModelPackage.CLIENTTARIFF_CLASSIFIER_ID:
      return createClientTariff();
    case ModelModelPackage.CONTRACTPACKAGE_CLASSIFIER_ID:
      return createContractPackage();
    case ModelModelPackage.USER_CLASSIFIER_ID:
      return createUser();
    case ModelModelPackage.USERGROUP_CLASSIFIER_ID:
      return createUserGroup();
    case ModelModelPackage.MESSAGE_CLASSIFIER_ID:
      return createMessage();
    case ModelModelPackage.EVENT_CLASSIFIER_ID:
      return createEvent();
    case ModelModelPackage.COORDINATES_CLASSIFIER_ID:
      return createCoordinates();
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
    case ModelModelPackage.SIMCARD_CLASSIFIER_ID:
      modelObject = new SimCardModelObject();
      break;
    case ModelModelPackage.SIMCONTRACT_CLASSIFIER_ID:
      modelObject = new SimContractModelObject();
      break;
    case ModelModelPackage.PAYMENTINFO_CLASSIFIER_ID:
      modelObject = new PaymentInfoModelObject();
      break;
    case ModelModelPackage.SIMCARDXSIMCONTRACT_CLASSIFIER_ID:
      modelObject = new SimCardXSimContractModelObject();
      break;
    case ModelModelPackage.SIMTARIFF_CLASSIFIER_ID:
      modelObject = new SimTariffModelObject();
      break;
    case ModelModelPackage.TARIFF_CLASSIFIER_ID:
      modelObject = new TariffModelObject();
      break;
    case ModelModelPackage.PAYMENTITEM_CLASSIFIER_ID:
      modelObject = new PaymentItemModelObject();
      break;
    case ModelModelPackage.VOLUMEPAYMENT_CLASSIFIER_ID:
      modelObject = new VolumePaymentModelObject();
      break;
    case ModelModelPackage.PERIODICALPAYMENT_CLASSIFIER_ID:
      modelObject = new PeriodicalPaymentModelObject();
      break;
    case ModelModelPackage.ONETIMEPAYMENT_CLASSIFIER_ID:
      modelObject = new OneTimePaymentModelObject();
      break;
    case ModelModelPackage.SERVICE_CLASSIFIER_ID:
      modelObject = new ServiceModelObject();
      break;
    case ModelModelPackage.UNITS_CLASSIFIER_ID:
      modelObject = new UnitsModelObject();
      break;
    case ModelModelPackage.PRICE_CLASSIFIER_ID:
      modelObject = new PriceModelObject();
      break;
    case ModelModelPackage.CARPRODUCER_CLASSIFIER_ID:
      modelObject = new CarProducerModelObject();
      break;
    case ModelModelPackage.CARMODEL_CLASSIFIER_ID:
      modelObject = new CarModelModelObject();
      break;
    case ModelModelPackage.CARREGINFO_CLASSIFIER_ID:
      modelObject = new CarRegInfoModelObject();
      break;
    case ModelModelPackage.DOCUMENT_CLASSIFIER_ID:
      modelObject = new DocumentModelObject();
      break;
    case ModelModelPackage.PERSON_CLASSIFIER_ID:
      modelObject = new PersonModelObject();
      break;
    case ModelModelPackage.CAR_CLASSIFIER_ID:
      modelObject = new CarModelObject();
      break;
    case ModelModelPackage.CARPASSPORT_CLASSIFIER_ID:
      modelObject = new CarPassportModelObject();
      break;
    case ModelModelPackage.PHONE_CLASSIFIER_ID:
      modelObject = new PhoneModelObject();
      break;
    case ModelModelPackage.ADDRESS_CLASSIFIER_ID:
      modelObject = new AddressModelObject();
      break;
    case ModelModelPackage.PASSPORT_CLASSIFIER_ID:
      modelObject = new PassportModelObject();
      break;
    case ModelModelPackage.DRIVINGLICENSE_CLASSIFIER_ID:
      modelObject = new DrivingLicenseModelObject();
      break;
    case ModelModelPackage.CONTRACT_CLASSIFIER_ID:
      modelObject = new ContractModelObject();
      break;
    case ModelModelPackage.SECRETQUESTION_CLASSIFIER_ID:
      modelObject = new SecretQuestionModelObject();
      break;
    case ModelModelPackage.CLIENTTARIFF_CLASSIFIER_ID:
      modelObject = new ClientTariffModelObject();
      break;
    case ModelModelPackage.CONTRACTPACKAGE_CLASSIFIER_ID:
      modelObject = new ContractPackageModelObject();
      break;
    case ModelModelPackage.USER_CLASSIFIER_ID:
      modelObject = new UserModelObject();
      break;
    case ModelModelPackage.USERGROUP_CLASSIFIER_ID:
      modelObject = new UserGroupModelObject();
      break;
    case ModelModelPackage.MESSAGE_CLASSIFIER_ID:
      modelObject = new MessageModelObject();
      break;
    case ModelModelPackage.EVENT_CLASSIFIER_ID:
      modelObject = new EventModelObject();
      break;
    case ModelModelPackage.COORDINATES_CLASSIFIER_ID:
      modelObject = new CoordinatesModelObject();
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
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SimCard
   * @generated
   */
  public SimCard createSimCard() {
    return new SimCard();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SimContract
   * @generated
   */
  public SimContract createSimContract() {
    return new SimContract();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PaymentInfo
   * @generated
   */
  public PaymentInfo createPaymentInfo() {
    return new PaymentInfo();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SimCardXSimContract
   * @generated
   */
  public SimCardXSimContract createSimCardXSimContract() {
    return new SimCardXSimContract();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SimTariff
   * @generated
   */
  public SimTariff createSimTariff() {
    return new SimTariff();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass VolumePayment
   * @generated
   */
  public VolumePayment createVolumePayment() {
    return new VolumePayment();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PeriodicalPayment
   * @generated
   */
  public PeriodicalPayment createPeriodicalPayment() {
    return new PeriodicalPayment();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass OneTimePayment
   * @generated
   */
  public OneTimePayment createOneTimePayment() {
    return new OneTimePayment();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Service
   * @generated
   */
  public Service createService() {
    return new Service();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Units
   * @generated
   */
  public Units createUnits() {
    return new Units();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Price
   * @generated
   */
  public Price createPrice() {
    return new Price();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CarProducer
   * @generated
   */
  public CarProducer createCarProducer() {
    return new CarProducer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CarModel
   * @generated
   */
  public CarModel createCarModel() {
    return new CarModel();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CarRegInfo
   * @generated
   */
  public CarRegInfo createCarRegInfo() {
    return new CarRegInfo();
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
   * @return an instance of the model object representing the EClass Car
   * @generated
   */
  public Car createCar() {
    return new Car();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CarPassport
   * @generated
   */
  public CarPassport createCarPassport() {
    return new CarPassport();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Phone
   * @generated
   */
  public Phone createPhone() {
    return new Phone();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Address
   * @generated
   */
  public Address createAddress() {
    return new Address();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Passport
   * @generated
   */
  public Passport createPassport() {
    return new Passport();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DrivingLicense
   * @generated
   */
  public DrivingLicense createDrivingLicense() {
    return new DrivingLicense();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Contract
   * @generated
   */
  public Contract createContract() {
    return new Contract();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SecretQuestion
   * @generated
   */
  public SecretQuestion createSecretQuestion() {
    return new SecretQuestion();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ClientTariff
   * @generated
   */
  public ClientTariff createClientTariff() {
    return new ClientTariff();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ContractPackage
   * @generated
   */
  public ContractPackage createContractPackage() {
    return new ContractPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass User
   * @generated
   */
  public User createUser() {
    return new User();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass UserGroup
   * @generated
   */
  public UserGroup createUserGroup() {
    return new UserGroup();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Message
   * @generated
   */
  public Message createMessage() {
    return new Message();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Event
   * @generated
   */
  public Event createEvent() {
    return new Event();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Coordinates
   * @generated
   */
  public Coordinates createCoordinates() {
    return new Coordinates();
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
    case ModelModelPackage.CURRENCY_CLASSIFIER_ID:
      return createCurrencyFromString(value);
    case ModelModelPackage.PAYMENTTYPE_CLASSIFIER_ID:
      return createPaymentTypeFromString(value);
    case ModelModelPackage.PERIODICITY_CLASSIFIER_ID:
      return createPeriodicityFromString(value);
    case ModelModelPackage.SECRETQUESTIONTYPE_CLASSIFIER_ID:
      return createSecretQuestionTypeFromString(value);
    case ModelModelPackage.MESSAGETYPE_CLASSIFIER_ID:
      return createMessageTypeFromString(value);
    case ModelModelPackage.EVENTTYPE_CLASSIFIER_ID:
      return createEventTypeFromString(value);
    case ModelModelPackage.PHONETYPE_CLASSIFIER_ID:
      return createPhoneTypeFromString(value);
    case ModelModelPackage.MESSAGEIOTYPES_CLASSIFIER_ID:
      return createMessageIOTypesFromString(value);
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
    case ModelModelPackage.CURRENCY_CLASSIFIER_ID:
      return convertCurrencyToString((Currency) value);
    case ModelModelPackage.PAYMENTTYPE_CLASSIFIER_ID:
      return convertPaymentTypeToString((PaymentType) value);
    case ModelModelPackage.PERIODICITY_CLASSIFIER_ID:
      return convertPeriodicityToString((Periodicity) value);
    case ModelModelPackage.SECRETQUESTIONTYPE_CLASSIFIER_ID:
      return convertSecretQuestionTypeToString((SecretQuestionType) value);
    case ModelModelPackage.MESSAGETYPE_CLASSIFIER_ID:
      return convertMessageTypeToString((MessageType) value);
    case ModelModelPackage.EVENTTYPE_CLASSIFIER_ID:
      return convertEventTypeToString((EventType) value);
    case ModelModelPackage.PHONETYPE_CLASSIFIER_ID:
      return convertPhoneTypeToString((PhoneType) value);
    case ModelModelPackage.MESSAGEIOTYPES_CLASSIFIER_ID:
      return convertMessageIOTypesToString((MessageIOTypes) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: Currency to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertCurrencyToString(Currency value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: Currency from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public Currency createCurrencyFromString(String value) {
    if (value == null) {
      return null;
    }
    return Currency.get(value);
  }

  /**
   * Converts the EDataType: PaymentType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertPaymentTypeToString(PaymentType value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: PaymentType from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public PaymentType createPaymentTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return PaymentType.get(value);
  }

  /**
   * Converts the EDataType: Periodicity to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertPeriodicityToString(Periodicity value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: Periodicity from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public Periodicity createPeriodicityFromString(String value) {
    if (value == null) {
      return null;
    }
    return Periodicity.get(value);
  }

  /**
   * Converts the EDataType: SecretQuestionType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertSecretQuestionTypeToString(SecretQuestionType value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: SecretQuestionType from a String. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public SecretQuestionType createSecretQuestionTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return SecretQuestionType.get(value);
  }

  /**
   * Converts the EDataType: MessageType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertMessageTypeToString(MessageType value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: MessageType from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public MessageType createMessageTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return MessageType.get(value);
  }

  /**
   * Converts the EDataType: EventType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertEventTypeToString(EventType value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: EventType from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public EventType createEventTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return EventType.get(value);
  }

  /**
   * Converts the EDataType: PhoneType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertPhoneTypeToString(PhoneType value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: PhoneType from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public PhoneType createPhoneTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return PhoneType.get(value);
  }

  /**
   * Converts the EDataType: MessageIOTypes to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertMessageIOTypesToString(MessageIOTypes value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: MessageIOTypes from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public MessageIOTypes createMessageIOTypesFromString(String value) {
    if (value == null) {
      return null;
    }
    return MessageIOTypes.get(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SimCard</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SimCardModelObject<E extends SimCard> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getSimCardEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.SIMCARD_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.SIMCARD_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.SIMCARD_PHONENUMBER_FEATURE_ID:
        return getTarget().getPhoneNumber();
      case ModelModelPackage.SIMCARD_NUMBER_FEATURE_ID:
        return getTarget().getNumber();
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
      case ModelModelPackage.SIMCARD_PHONENUMBER_FEATURE_ID:
        getTarget().setPhoneNumber((String) value);
        return;
      case ModelModelPackage.SIMCARD_NUMBER_FEATURE_ID:
        getTarget().setNumber((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>SimContract</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SimContractModelObject<E extends SimContract> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getSimContractEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.SIMCONTRACT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.SIMCONTRACT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.SIMCONTRACT_CONTRACTNUMBER_FEATURE_ID:
        return getTarget().getContractNumber();
      case ModelModelPackage.SIMCONTRACT_NAME_FEATURE_ID:
        return getTarget().getName();
      case ModelModelPackage.SIMCONTRACT_DESCRITPION_FEATURE_ID:
        return getTarget().getDescritpion();
      case ModelModelPackage.SIMCONTRACT_PAYMENTINFO_FEATURE_ID:
        return getTarget().getPaymentInfo();
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
      case ModelModelPackage.SIMCONTRACT_CONTRACTNUMBER_FEATURE_ID:
        getTarget().setContractNumber((String) value);
        return;
      case ModelModelPackage.SIMCONTRACT_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case ModelModelPackage.SIMCONTRACT_DESCRITPION_FEATURE_ID:
        getTarget().setDescritpion((String) value);
        return;
      case ModelModelPackage.SIMCONTRACT_PAYMENTINFO_FEATURE_ID:
        getTarget().setPaymentInfo((PaymentInfo) value);
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
   * The adapter/wrapper for the EClass '<em><b>PaymentInfo</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PaymentInfoModelObject<E extends PaymentInfo> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getPaymentInfoEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.PAYMENTINFO_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.PAYMENTINFO_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.PAYMENTINFO_TARIFF_FEATURE_ID:
        return getTarget().getTariff();
      case ModelModelPackage.PAYMENTINFO_FACTPAYMENTS_FEATURE_ID:
        return getTarget().getFactPayments();
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
      case ModelModelPackage.PAYMENTINFO_TARIFF_FEATURE_ID:
        getTarget().setTariff((Tariff) value);
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
   * The adapter/wrapper for the EClass '<em><b>SimCardXSimContract</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SimCardXSimContractModelObject<E extends SimCardXSimContract> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getSimCardXSimContractEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.SIMCARDXSIMCONTRACT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.SIMCARDXSIMCONTRACT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.SIMCARDXSIMCONTRACT_SIMCARD_FEATURE_ID:
        return getTarget().getSimCard();
      case ModelModelPackage.SIMCARDXSIMCONTRACT_SIMCONTRACT_FEATURE_ID:
        return getTarget().getSimContract();
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
      case ModelModelPackage.SIMCARDXSIMCONTRACT_SIMCARD_FEATURE_ID:
        getTarget().setSimCard((SimCard) value);
        return;
      case ModelModelPackage.SIMCARDXSIMCONTRACT_SIMCONTRACT_FEATURE_ID:
        getTarget().setSimContract((SimContract) value);
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
   * The adapter/wrapper for the EClass '<em><b>SimTariff</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SimTariffModelObject<E extends SimTariff> extends TariffModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getSimTariffEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.SIMTARIFF_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.SIMTARIFF_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.SIMTARIFF_NAME_FEATURE_ID:
        return getTarget().getName();
      case ModelModelPackage.SIMTARIFF_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case ModelModelPackage.SIMTARIFF_VOLUMEPAYMENTS_FEATURE_ID:
        return getTarget().getVolumePayments();
      case ModelModelPackage.SIMTARIFF_PERIODICALPAYMENTS_FEATURE_ID:
        return getTarget().getPeriodicalPayments();
      case ModelModelPackage.SIMTARIFF_INITIALPAYMENT_FEATURE_ID:
        return getTarget().getInitialPayment();
      case ModelModelPackage.SIMTARIFF_SERVICES_FEATURE_ID:
        return getTarget().getServices();
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
   * The adapter/wrapper for the EClass '<em><b>Tariff</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TariffModelObject<E extends Tariff> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getTariffEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.TARIFF_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.TARIFF_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.TARIFF_NAME_FEATURE_ID:
        return getTarget().getName();
      case ModelModelPackage.TARIFF_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case ModelModelPackage.TARIFF_VOLUMEPAYMENTS_FEATURE_ID:
        return getTarget().getVolumePayments();
      case ModelModelPackage.TARIFF_PERIODICALPAYMENTS_FEATURE_ID:
        return getTarget().getPeriodicalPayments();
      case ModelModelPackage.TARIFF_INITIALPAYMENT_FEATURE_ID:
        return getTarget().getInitialPayment();
      case ModelModelPackage.TARIFF_SERVICES_FEATURE_ID:
        return getTarget().getServices();
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
      case ModelModelPackage.TARIFF_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case ModelModelPackage.TARIFF_ACTIVE_FEATURE_ID:
        getTarget().setActive((Boolean) value);
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
   * The adapter/wrapper for the EClass '<em><b>PaymentItem</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PaymentItemModelObject<E extends PaymentItem> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getPaymentItemEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.PAYMENTITEM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.PAYMENTITEM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.PAYMENTITEM_SUM_FEATURE_ID:
        return getTarget().getSum();
      case ModelModelPackage.PAYMENTITEM_CURRENCY_FEATURE_ID:
        return getTarget().getCurrency();
      case ModelModelPackage.PAYMENTITEM_DATE_FEATURE_ID:
        return getTarget().getDate();
      case ModelModelPackage.PAYMENTITEM_DESCRIPTION_FEATURE_ID:
        return getTarget().getDescription();
      case ModelModelPackage.PAYMENTITEM_PAYMENTTYPE_FEATURE_ID:
        return getTarget().getPaymentType();
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
      case ModelModelPackage.PAYMENTITEM_SUM_FEATURE_ID:
        getTarget().setSum((BigDecimal) value);
        return;
      case ModelModelPackage.PAYMENTITEM_CURRENCY_FEATURE_ID:
        getTarget().setCurrency((Currency) value);
        return;
      case ModelModelPackage.PAYMENTITEM_DATE_FEATURE_ID:
        getTarget().setDate((Date) value);
        return;
      case ModelModelPackage.PAYMENTITEM_DESCRIPTION_FEATURE_ID:
        getTarget().setDescription((String) value);
        return;
      case ModelModelPackage.PAYMENTITEM_PAYMENTTYPE_FEATURE_ID:
        getTarget().setPaymentType((PaymentType) value);
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
   * The adapter/wrapper for the EClass '<em><b>VolumePayment</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class VolumePaymentModelObject<E extends VolumePayment> extends PaymentItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getVolumePaymentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.VOLUMEPAYMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.VOLUMEPAYMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.VOLUMEPAYMENT_SUM_FEATURE_ID:
        return getTarget().getSum();
      case ModelModelPackage.VOLUMEPAYMENT_CURRENCY_FEATURE_ID:
        return getTarget().getCurrency();
      case ModelModelPackage.VOLUMEPAYMENT_DATE_FEATURE_ID:
        return getTarget().getDate();
      case ModelModelPackage.VOLUMEPAYMENT_DESCRIPTION_FEATURE_ID:
        return getTarget().getDescription();
      case ModelModelPackage.VOLUMEPAYMENT_PAYMENTTYPE_FEATURE_ID:
        return getTarget().getPaymentType();
      case ModelModelPackage.VOLUMEPAYMENT_VOLUME_FEATURE_ID:
        return getTarget().getVolume();
      case ModelModelPackage.VOLUMEPAYMENT_UNIT_FEATURE_ID:
        return getTarget().getUnit();
      case ModelModelPackage.VOLUMEPAYMENT_PRICE_FEATURE_ID:
        return getTarget().getPrice();
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
      case ModelModelPackage.VOLUMEPAYMENT_VOLUME_FEATURE_ID:
        getTarget().setVolume((BigDecimal) value);
        return;
      case ModelModelPackage.VOLUMEPAYMENT_UNIT_FEATURE_ID:
        getTarget().setUnit((Units) value);
        return;
      case ModelModelPackage.VOLUMEPAYMENT_PRICE_FEATURE_ID:
        getTarget().setPrice((BigDecimal) value);
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
   * The adapter/wrapper for the EClass '<em><b>PeriodicalPayment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PeriodicalPaymentModelObject<E extends PeriodicalPayment> extends PaymentItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getPeriodicalPaymentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.PERIODICALPAYMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.PERIODICALPAYMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.PERIODICALPAYMENT_SUM_FEATURE_ID:
        return getTarget().getSum();
      case ModelModelPackage.PERIODICALPAYMENT_CURRENCY_FEATURE_ID:
        return getTarget().getCurrency();
      case ModelModelPackage.PERIODICALPAYMENT_DATE_FEATURE_ID:
        return getTarget().getDate();
      case ModelModelPackage.PERIODICALPAYMENT_DESCRIPTION_FEATURE_ID:
        return getTarget().getDescription();
      case ModelModelPackage.PERIODICALPAYMENT_PAYMENTTYPE_FEATURE_ID:
        return getTarget().getPaymentType();
      case ModelModelPackage.PERIODICALPAYMENT_PERIODICITY_FEATURE_ID:
        return getTarget().getPeriodicity();
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
      case ModelModelPackage.PERIODICALPAYMENT_PERIODICITY_FEATURE_ID:
        getTarget().setPeriodicity((Periodicity) value);
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
   * The adapter/wrapper for the EClass '<em><b>OneTimePayment</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class OneTimePaymentModelObject<E extends OneTimePayment> extends PaymentItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getOneTimePaymentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.ONETIMEPAYMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.ONETIMEPAYMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.ONETIMEPAYMENT_SUM_FEATURE_ID:
        return getTarget().getSum();
      case ModelModelPackage.ONETIMEPAYMENT_CURRENCY_FEATURE_ID:
        return getTarget().getCurrency();
      case ModelModelPackage.ONETIMEPAYMENT_DATE_FEATURE_ID:
        return getTarget().getDate();
      case ModelModelPackage.ONETIMEPAYMENT_DESCRIPTION_FEATURE_ID:
        return getTarget().getDescription();
      case ModelModelPackage.ONETIMEPAYMENT_PAYMENTTYPE_FEATURE_ID:
        return getTarget().getPaymentType();
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
   * The adapter/wrapper for the EClass '<em><b>Service</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ServiceModelObject<E extends Service> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getServiceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.SERVICE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.SERVICE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.SERVICE_NAME_FEATURE_ID:
        return getTarget().getName();
      case ModelModelPackage.SERVICE_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case ModelModelPackage.SERVICE_INITIALPAYMENT_FEATURE_ID:
        return getTarget().getInitialPayment();
      case ModelModelPackage.SERVICE_PERIODICALPAYMENT_FEATURE_ID:
        return getTarget().getPeriodicalPayment();
      case ModelModelPackage.SERVICE_VOLUMEPAYMENT_FEATURE_ID:
        return getTarget().getVolumePayment();
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
      case ModelModelPackage.SERVICE_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case ModelModelPackage.SERVICE_ACTIVE_FEATURE_ID:
        getTarget().setActive((Boolean) value);
        return;
      case ModelModelPackage.SERVICE_INITIALPAYMENT_FEATURE_ID:
        getTarget().setInitialPayment((OneTimePayment) value);
        return;
      case ModelModelPackage.SERVICE_PERIODICALPAYMENT_FEATURE_ID:
        getTarget().setPeriodicalPayment((PeriodicalPayment) value);
        return;
      case ModelModelPackage.SERVICE_VOLUMEPAYMENT_FEATURE_ID:
        getTarget().setVolumePayment((VolumePayment) value);
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
   * The adapter/wrapper for the EClass '<em><b>Units</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class UnitsModelObject<E extends Units> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getUnitsEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.UNITS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.UNITS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.UNITS_NAME_FEATURE_ID:
        return getTarget().getName();
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
      case ModelModelPackage.UNITS_NAME_FEATURE_ID:
        getTarget().setName((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Price</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PriceModelObject<E extends Price> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getPriceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.PRICE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.PRICE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
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
   * The adapter/wrapper for the EClass '<em><b>CarProducer</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CarProducerModelObject<E extends CarProducer> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getCarProducerEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.CARPRODUCER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.CARPRODUCER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.CARPRODUCER_NAME_FEATURE_ID:
        return getTarget().getName();
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
      case ModelModelPackage.CARPRODUCER_NAME_FEATURE_ID:
        getTarget().setName((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>CarModel</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CarModelModelObject<E extends CarModel> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getCarModelEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.CARMODEL_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.CARMODEL_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.CARMODEL_PRODUCER_FEATURE_ID:
        return getTarget().getProducer();
      case ModelModelPackage.CARMODEL_NAME_FEATURE_ID:
        return getTarget().getName();
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
      case ModelModelPackage.CARMODEL_PRODUCER_FEATURE_ID:
        getTarget().setProducer((CarProducer) value);
        return;
      case ModelModelPackage.CARMODEL_NAME_FEATURE_ID:
        getTarget().setName((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>CarRegInfo</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CarRegInfoModelObject<E extends CarRegInfo> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getCarRegInfoEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.CARREGINFO_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.CARREGINFO_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.CARREGINFO_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case ModelModelPackage.CARREGINFO_REGNUMBER_FEATURE_ID:
        return getTarget().getRegNumber();
      case ModelModelPackage.CARREGINFO_VIN_FEATURE_ID:
        return getTarget().getVin();
      case ModelModelPackage.CARREGINFO_RELEASEYEAR_FEATURE_ID:
        return getTarget().getReleaseYear();
      case ModelModelPackage.CARREGINFO_ENGINENUMBER_FEATURE_ID:
        return getTarget().getEngineNumber();
      case ModelModelPackage.CARREGINFO_CHASSISNUMBER_FEATURE_ID:
        return getTarget().getChassisNumber();
      case ModelModelPackage.CARREGINFO_BODYNUMBER_FEATURE_ID:
        return getTarget().getBodyNumber();
      case ModelModelPackage.CARREGINFO_COLOR_FEATURE_ID:
        return getTarget().getColor();
      case ModelModelPackage.CARREGINFO_SERIES_FEATURE_ID:
        return getTarget().getSeries();
      case ModelModelPackage.CARREGINFO_NUMBER_FEATURE_ID:
        return getTarget().getNumber();
      case ModelModelPackage.CARREGINFO_ISSUEDATE_FEATURE_ID:
        return getTarget().getIssueDate();
      case ModelModelPackage.CARREGINFO_ISSUED_FEATURE_ID:
        return getTarget().getIssued();
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
      case ModelModelPackage.CARREGINFO_OWNER_FEATURE_ID:
        getTarget().setOwner((Person) value);
        return;
      case ModelModelPackage.CARREGINFO_REGNUMBER_FEATURE_ID:
        getTarget().setRegNumber((String) value);
        return;
      case ModelModelPackage.CARREGINFO_VIN_FEATURE_ID:
        getTarget().setVin((String) value);
        return;
      case ModelModelPackage.CARREGINFO_RELEASEYEAR_FEATURE_ID:
        getTarget().setReleaseYear((Date) value);
        return;
      case ModelModelPackage.CARREGINFO_ENGINENUMBER_FEATURE_ID:
        getTarget().setEngineNumber((String) value);
        return;
      case ModelModelPackage.CARREGINFO_CHASSISNUMBER_FEATURE_ID:
        getTarget().setChassisNumber((String) value);
        return;
      case ModelModelPackage.CARREGINFO_BODYNUMBER_FEATURE_ID:
        getTarget().setBodyNumber((String) value);
        return;
      case ModelModelPackage.CARREGINFO_COLOR_FEATURE_ID:
        getTarget().setColor((String) value);
        return;
      case ModelModelPackage.CARREGINFO_SERIES_FEATURE_ID:
        getTarget().setSeries((String) value);
        return;
      case ModelModelPackage.CARREGINFO_NUMBER_FEATURE_ID:
        getTarget().setNumber((String) value);
        return;
      case ModelModelPackage.CARREGINFO_ISSUEDATE_FEATURE_ID:
        getTarget().setIssueDate((String) value);
        return;
      case ModelModelPackage.CARREGINFO_ISSUED_FEATURE_ID:
        getTarget().setIssued((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Document</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DocumentModelObject<E extends Document> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getDocumentEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.DOCUMENT_SERIES_FEATURE_ID:
        return getTarget().getSeries();
      case ModelModelPackage.DOCUMENT_NUMBER_FEATURE_ID:
        return getTarget().getNumber();
      case ModelModelPackage.DOCUMENT_ISSUEDATE_FEATURE_ID:
        return getTarget().getIssueDate();
      case ModelModelPackage.DOCUMENT_ISSUED_FEATURE_ID:
        return getTarget().getIssued();
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
      case ModelModelPackage.DOCUMENT_SERIES_FEATURE_ID:
        getTarget().setSeries((String) value);
        return;
      case ModelModelPackage.DOCUMENT_NUMBER_FEATURE_ID:
        getTarget().setNumber((String) value);
        return;
      case ModelModelPackage.DOCUMENT_ISSUEDATE_FEATURE_ID:
        getTarget().setIssueDate((String) value);
        return;
      case ModelModelPackage.DOCUMENT_ISSUED_FEATURE_ID:
        getTarget().setIssued((String) value);
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
      return ModelModelPackage.INSTANCE.getPersonEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.PERSON_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.PERSON_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.PERSON_SURNAME_FEATURE_ID:
        return getTarget().getSurname();
      case ModelModelPackage.PERSON_NAME_FEATURE_ID:
        return getTarget().getName();
      case ModelModelPackage.PERSON_PATRONIMIC_FEATURE_ID:
        return getTarget().getPatronimic();
      case ModelModelPackage.PERSON_BIRTHDAY_FEATURE_ID:
        return getTarget().getBirthday();
      case ModelModelPackage.PERSON_REGISTRATIONADDRESS_FEATURE_ID:
        return getTarget().getRegistrationAddress();
      case ModelModelPackage.PERSON_FACTADDRESS_FEATURE_ID:
        return getTarget().getFactAddress();
      case ModelModelPackage.PERSON_PASSPORT_FEATURE_ID:
        return getTarget().getPassport();
      case ModelModelPackage.PERSON_DRIVINGLICENSE_FEATURE_ID:
        return getTarget().getDrivingLicense();
      case ModelModelPackage.PERSON_PHONES_FEATURE_ID:
        return getTarget().getPhones();
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
      case ModelModelPackage.PERSON_SURNAME_FEATURE_ID:
        getTarget().setSurname((String) value);
        return;
      case ModelModelPackage.PERSON_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case ModelModelPackage.PERSON_PATRONIMIC_FEATURE_ID:
        getTarget().setPatronimic((String) value);
        return;
      case ModelModelPackage.PERSON_BIRTHDAY_FEATURE_ID:
        getTarget().setBirthday((Date) value);
        return;
      case ModelModelPackage.PERSON_REGISTRATIONADDRESS_FEATURE_ID:
        getTarget().setRegistrationAddress((Address) value);
        return;
      case ModelModelPackage.PERSON_FACTADDRESS_FEATURE_ID:
        getTarget().setFactAddress((Address) value);
        return;
      case ModelModelPackage.PERSON_PASSPORT_FEATURE_ID:
        getTarget().setPassport((Passport) value);
        return;
      case ModelModelPackage.PERSON_DRIVINGLICENSE_FEATURE_ID:
        getTarget().setDrivingLicense((DrivingLicense) value);
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
   * The adapter/wrapper for the EClass '<em><b>Car</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CarModelObject<E extends Car> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getCarEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.CAR_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.CAR_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.CAR_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case ModelModelPackage.CAR_REGINFO_FEATURE_ID:
        return getTarget().getRegInfo();
      case ModelModelPackage.CAR_CARPASSPORT_FEATURE_ID:
        return getTarget().getCarPassport();
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
      case ModelModelPackage.CAR_MODEL_FEATURE_ID:
        getTarget().setModel((CarModel) value);
        return;
      case ModelModelPackage.CAR_REGINFO_FEATURE_ID:
        getTarget().setRegInfo((CarRegInfo) value);
        return;
      case ModelModelPackage.CAR_CARPASSPORT_FEATURE_ID:
        getTarget().setCarPassport((CarPassport) value);
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
   * The adapter/wrapper for the EClass '<em><b>CarPassport</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CarPassportModelObject<E extends CarPassport> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getCarPassportEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.CARPASSPORT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.CARPASSPORT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.CARPASSPORT_SERIES_FEATURE_ID:
        return getTarget().getSeries();
      case ModelModelPackage.CARPASSPORT_NUMBER_FEATURE_ID:
        return getTarget().getNumber();
      case ModelModelPackage.CARPASSPORT_ISSUEDATE_FEATURE_ID:
        return getTarget().getIssueDate();
      case ModelModelPackage.CARPASSPORT_ISSUED_FEATURE_ID:
        return getTarget().getIssued();
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
      case ModelModelPackage.CARPASSPORT_SERIES_FEATURE_ID:
        getTarget().setSeries((String) value);
        return;
      case ModelModelPackage.CARPASSPORT_NUMBER_FEATURE_ID:
        getTarget().setNumber((String) value);
        return;
      case ModelModelPackage.CARPASSPORT_ISSUEDATE_FEATURE_ID:
        getTarget().setIssueDate((String) value);
        return;
      case ModelModelPackage.CARPASSPORT_ISSUED_FEATURE_ID:
        getTarget().setIssued((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Phone</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PhoneModelObject<E extends Phone> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getPhoneEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.PHONE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.PHONE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.PHONE_NUMBER_FEATURE_ID:
        return getTarget().getNumber();
      case ModelModelPackage.PHONE_DESCRIPTION_FEATURE_ID:
        return getTarget().getDescription();
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
      case ModelModelPackage.PHONE_NUMBER_FEATURE_ID:
        getTarget().setNumber((String) value);
        return;
      case ModelModelPackage.PHONE_DESCRIPTION_FEATURE_ID:
        getTarget().setDescription((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Address</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AddressModelObject<E extends Address> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getAddressEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.ADDRESS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.ADDRESS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.ADDRESS_ZIPCODE_FEATURE_ID:
        return getTarget().getZipCode();
      case ModelModelPackage.ADDRESS_COUNTRY_FEATURE_ID:
        return getTarget().getCountry();
      case ModelModelPackage.ADDRESS_REGION_FEATURE_ID:
        return getTarget().getRegion();
      case ModelModelPackage.ADDRESS_CITY_FEATURE_ID:
        return getTarget().getCity();
      case ModelModelPackage.ADDRESS_STREET_FEATURE_ID:
        return getTarget().getStreet();
      case ModelModelPackage.ADDRESS_BUILDING_FEATURE_ID:
        return getTarget().getBuilding();
      case ModelModelPackage.ADDRESS_FLAT_FEATURE_ID:
        return getTarget().getFlat();
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
      case ModelModelPackage.ADDRESS_ZIPCODE_FEATURE_ID:
        getTarget().setZipCode((String) value);
        return;
      case ModelModelPackage.ADDRESS_COUNTRY_FEATURE_ID:
        getTarget().setCountry((String) value);
        return;
      case ModelModelPackage.ADDRESS_REGION_FEATURE_ID:
        getTarget().setRegion((String) value);
        return;
      case ModelModelPackage.ADDRESS_CITY_FEATURE_ID:
        getTarget().setCity((String) value);
        return;
      case ModelModelPackage.ADDRESS_STREET_FEATURE_ID:
        getTarget().setStreet((String) value);
        return;
      case ModelModelPackage.ADDRESS_BUILDING_FEATURE_ID:
        getTarget().setBuilding((String) value);
        return;
      case ModelModelPackage.ADDRESS_FLAT_FEATURE_ID:
        getTarget().setFlat((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Passport</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PassportModelObject<E extends Passport> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getPassportEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.PASSPORT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.PASSPORT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.PASSPORT_SERIES_FEATURE_ID:
        return getTarget().getSeries();
      case ModelModelPackage.PASSPORT_NUMBER_FEATURE_ID:
        return getTarget().getNumber();
      case ModelModelPackage.PASSPORT_ISSUEDATE_FEATURE_ID:
        return getTarget().getIssueDate();
      case ModelModelPackage.PASSPORT_ISSUED_FEATURE_ID:
        return getTarget().getIssued();
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
      case ModelModelPackage.PASSPORT_SERIES_FEATURE_ID:
        getTarget().setSeries((String) value);
        return;
      case ModelModelPackage.PASSPORT_NUMBER_FEATURE_ID:
        getTarget().setNumber((String) value);
        return;
      case ModelModelPackage.PASSPORT_ISSUEDATE_FEATURE_ID:
        getTarget().setIssueDate((String) value);
        return;
      case ModelModelPackage.PASSPORT_ISSUED_FEATURE_ID:
        getTarget().setIssued((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>DrivingLicense</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DrivingLicenseModelObject<E extends DrivingLicense> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getDrivingLicenseEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.DRIVINGLICENSE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.DRIVINGLICENSE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.DRIVINGLICENSE_SERIES_FEATURE_ID:
        return getTarget().getSeries();
      case ModelModelPackage.DRIVINGLICENSE_NUMBER_FEATURE_ID:
        return getTarget().getNumber();
      case ModelModelPackage.DRIVINGLICENSE_ISSUEDATE_FEATURE_ID:
        return getTarget().getIssueDate();
      case ModelModelPackage.DRIVINGLICENSE_ISSUED_FEATURE_ID:
        return getTarget().getIssued();
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
      case ModelModelPackage.DRIVINGLICENSE_SERIES_FEATURE_ID:
        getTarget().setSeries((String) value);
        return;
      case ModelModelPackage.DRIVINGLICENSE_NUMBER_FEATURE_ID:
        getTarget().setNumber((String) value);
        return;
      case ModelModelPackage.DRIVINGLICENSE_ISSUEDATE_FEATURE_ID:
        getTarget().setIssueDate((String) value);
        return;
      case ModelModelPackage.DRIVINGLICENSE_ISSUED_FEATURE_ID:
        getTarget().setIssued((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Contract</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ContractModelObject<E extends Contract> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getContractEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.CONTRACT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.CONTRACT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.CONTRACT_SIGNDATE_FEATURE_ID:
        return getTarget().getSignDate();
      case ModelModelPackage.CONTRACT_SIMCARD_FEATURE_ID:
        return getTarget().getSimCard();
      case ModelModelPackage.CONTRACT_PAYMENTINFO_FEATURE_ID:
        return getTarget().getPaymentInfo();
      case ModelModelPackage.CONTRACT_CAR_FEATURE_ID:
        return getTarget().getCar();
      case ModelModelPackage.CONTRACT_SECRETQUESTIONS_FEATURE_ID:
        return getTarget().getSecretQuestions();
      case ModelModelPackage.CONTRACT_NUMBER_FEATURE_ID:
        return getTarget().getNumber();
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
      case ModelModelPackage.CONTRACT_SIGNDATE_FEATURE_ID:
        getTarget().setSignDate((Date) value);
        return;
      case ModelModelPackage.CONTRACT_SIMCARD_FEATURE_ID:
        getTarget().setSimCard((SimCard) value);
        return;
      case ModelModelPackage.CONTRACT_PAYMENTINFO_FEATURE_ID:
        getTarget().setPaymentInfo((PaymentInfo) value);
        return;
      case ModelModelPackage.CONTRACT_CAR_FEATURE_ID:
        getTarget().setCar((Car) value);
        return;
      case ModelModelPackage.CONTRACT_NUMBER_FEATURE_ID:
        getTarget().setNumber((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>SecretQuestion</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SecretQuestionModelObject<E extends SecretQuestion> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getSecretQuestionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.SECRETQUESTION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.SECRETQUESTION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.SECRETQUESTION_QUESTION_FEATURE_ID:
        return getTarget().getQuestion();
      case ModelModelPackage.SECRETQUESTION_CORRECTANSWER_FEATURE_ID:
        return getTarget().getCorrectAnswer();
      case ModelModelPackage.SECRETQUESTION_ALARMANSWER_FEATURE_ID:
        return getTarget().getAlarmAnswer();
      case ModelModelPackage.SECRETQUESTION_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case ModelModelPackage.SECRETQUESTION_TYPE_FEATURE_ID:
        return getTarget().getType();
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
      case ModelModelPackage.SECRETQUESTION_QUESTION_FEATURE_ID:
        getTarget().setQuestion((String) value);
        return;
      case ModelModelPackage.SECRETQUESTION_CORRECTANSWER_FEATURE_ID:
        getTarget().setCorrectAnswer((String) value);
        return;
      case ModelModelPackage.SECRETQUESTION_ALARMANSWER_FEATURE_ID:
        getTarget().setAlarmAnswer((String) value);
        return;
      case ModelModelPackage.SECRETQUESTION_ACTIVE_FEATURE_ID:
        getTarget().setActive((Boolean) value);
        return;
      case ModelModelPackage.SECRETQUESTION_TYPE_FEATURE_ID:
        getTarget().setType((SecretQuestionType) value);
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
   * The adapter/wrapper for the EClass '<em><b>ClientTariff</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ClientTariffModelObject<E extends ClientTariff> extends TariffModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getClientTariffEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.CLIENTTARIFF_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.CLIENTTARIFF_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.CLIENTTARIFF_NAME_FEATURE_ID:
        return getTarget().getName();
      case ModelModelPackage.CLIENTTARIFF_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case ModelModelPackage.CLIENTTARIFF_VOLUMEPAYMENTS_FEATURE_ID:
        return getTarget().getVolumePayments();
      case ModelModelPackage.CLIENTTARIFF_PERIODICALPAYMENTS_FEATURE_ID:
        return getTarget().getPeriodicalPayments();
      case ModelModelPackage.CLIENTTARIFF_INITIALPAYMENT_FEATURE_ID:
        return getTarget().getInitialPayment();
      case ModelModelPackage.CLIENTTARIFF_SERVICES_FEATURE_ID:
        return getTarget().getServices();
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
   * The adapter/wrapper for the EClass '<em><b>ContractPackage</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ContractPackageModelObject<E extends ContractPackage> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getContractPackageEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.CONTRACTPACKAGE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.CONTRACTPACKAGE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.CONTRACTPACKAGE_CLIENT_FEATURE_ID:
        return getTarget().getClient();
      case ModelModelPackage.CONTRACTPACKAGE_USER_FEATURE_ID:
        return getTarget().getUser();
      case ModelModelPackage.CONTRACTPACKAGE_CONTRACTS_FEATURE_ID:
        return getTarget().getContracts();
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
      case ModelModelPackage.CONTRACTPACKAGE_CLIENT_FEATURE_ID:
        getTarget().setClient((Person) value);
        return;
      case ModelModelPackage.CONTRACTPACKAGE_USER_FEATURE_ID:
        getTarget().setUser((User) value);
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
   * The adapter/wrapper for the EClass '<em><b>User</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class UserModelObject<E extends User> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getUserEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.USER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.USER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.USER_LOGIN_FEATURE_ID:
        return getTarget().getLogin();
      case ModelModelPackage.USER_PASSWORD_FEATURE_ID:
        return getTarget().getPassword();
      case ModelModelPackage.USER_GROUP_FEATURE_ID:
        return getTarget().getGroup();
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
      case ModelModelPackage.USER_LOGIN_FEATURE_ID:
        getTarget().setLogin((String) value);
        return;
      case ModelModelPackage.USER_PASSWORD_FEATURE_ID:
        getTarget().setPassword((String) value);
        return;
      case ModelModelPackage.USER_GROUP_FEATURE_ID:
        getTarget().setGroup((UserGroup) value);
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
   * The adapter/wrapper for the EClass '<em><b>UserGroup</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class UserGroupModelObject<E extends UserGroup> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getUserGroupEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.USERGROUP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.USERGROUP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
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
   * The adapter/wrapper for the EClass '<em><b>Message</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MessageModelObject<E extends Message> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getMessageEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.MESSAGE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.MESSAGE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.MESSAGE_TEXT_FEATURE_ID:
        return getTarget().getText();
      case ModelModelPackage.MESSAGE_TYPE_FEATURE_ID:
        return getTarget().getType();
      case ModelModelPackage.MESSAGE_FROM_FEATURE_ID:
        return getTarget().getFrom();
      case ModelModelPackage.MESSAGE_TO_FEATURE_ID:
        return getTarget().getTo();
      case ModelModelPackage.MESSAGE_DATETIME_FEATURE_ID:
        return getTarget().getDateTime();
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
      case ModelModelPackage.MESSAGE_TEXT_FEATURE_ID:
        getTarget().setText((String) value);
        return;
      case ModelModelPackage.MESSAGE_TYPE_FEATURE_ID:
        getTarget().setType((MessageType) value);
        return;
      case ModelModelPackage.MESSAGE_FROM_FEATURE_ID:
        getTarget().setFrom((SimCard) value);
        return;
      case ModelModelPackage.MESSAGE_TO_FEATURE_ID:
        getTarget().setTo((SimCard) value);
        return;
      case ModelModelPackage.MESSAGE_DATETIME_FEATURE_ID:
        getTarget().setDateTime((Date) value);
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
   * The adapter/wrapper for the EClass '<em><b>Event</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EventModelObject<E extends Event> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getEventEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.EVENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.EVENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.EVENT_EVENTTYPE_FEATURE_ID:
        return getTarget().getEventType();
      case ModelModelPackage.EVENT_MESSAGE_FEATURE_ID:
        return getTarget().getMessage();
      case ModelModelPackage.EVENT_COORDINATES_FEATURE_ID:
        return getTarget().getCoordinates();
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
      case ModelModelPackage.EVENT_EVENTTYPE_FEATURE_ID:
        getTarget().setEventType((EventType) value);
        return;
      case ModelModelPackage.EVENT_MESSAGE_FEATURE_ID:
        getTarget().setMessage((Message) value);
        return;
      case ModelModelPackage.EVENT_COORDINATES_FEATURE_ID:
        getTarget().setCoordinates((Coordinates) value);
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
   * The adapter/wrapper for the EClass '<em><b>Coordinates</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CoordinatesModelObject<E extends Coordinates> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ModelModelPackage.INSTANCE.getCoordinatesEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ModelModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ModelModelPackage.COORDINATES_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ModelModelPackage.COORDINATES_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ModelModelPackage.COORDINATES_X_FEATURE_ID:
        return getTarget().getX();
      case ModelModelPackage.COORDINATES_Y_FEATURE_ID:
        return getTarget().getY();
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
      case ModelModelPackage.COORDINATES_X_FEATURE_ID:
        getTarget().setX((BigDecimal) value);
        return;
      case ModelModelPackage.COORDINATES_Y_FEATURE_ID:
        getTarget().setY((BigDecimal) value);
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
}