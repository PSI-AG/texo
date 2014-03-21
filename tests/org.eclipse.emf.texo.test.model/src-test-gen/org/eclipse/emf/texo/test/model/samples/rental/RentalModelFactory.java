package org.eclipse.emf.texo.test.model.samples.rental;

import java.util.Date;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: org.eclipse.emf.texo.test.model.samples.rental. It
 * contains code to create instances {@link ModelObject} wrappers and instances for EClasses and convert objects back
 * and forth from their String (XML) representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class RentalModelFactory implements ModelFactory {

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
    case RentalModelPackage.RENTALBICYCLE_CLASSIFIER_ID:
      return createRentalBicycle();
    case RentalModelPackage.RENTALCAR_CLASSIFIER_ID:
      return createRentalCar();
    case RentalModelPackage.RENTALBUSINESS_CLASSIFIER_ID:
      return createRentalBusiness();
    case RentalModelPackage.RENTALCARDRIVER_CLASSIFIER_ID:
      return createRentalCarDriver();
    case RentalModelPackage.RENTALCONTRACT_CLASSIFIER_ID:
      return createRentalContract();
    case RentalModelPackage.RENTALCONTRACTLINE_CLASSIFIER_ID:
      return createRentalContractLine();
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
    case RentalModelPackage.RENTALBICYCLE_CLASSIFIER_ID:
      modelObject = new RentalBicycleModelObject();
      break;
    case RentalModelPackage.RENTALUNIT_CLASSIFIER_ID:
      modelObject = new RentalUnitModelObject();
      break;
    case RentalModelPackage.RENTALCAR_CLASSIFIER_ID:
      modelObject = new RentalCarModelObject();
      break;
    case RentalModelPackage.RENTALBUSINESS_CLASSIFIER_ID:
      modelObject = new RentalBusinessModelObject();
      break;
    case RentalModelPackage.RENTALCARDRIVER_CLASSIFIER_ID:
      modelObject = new RentalCarDriverModelObject();
      break;
    case RentalModelPackage.RENTALCONTRACT_CLASSIFIER_ID:
      modelObject = new RentalContractModelObject();
      break;
    case RentalModelPackage.RENTALCONTRACTLINE_CLASSIFIER_ID:
      modelObject = new RentalContractLineModelObject();
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
   * @return an instance of the model object representing the EClass RentalBicycle
   * @generated
   */
  public RentalBicycle createRentalBicycle() {
    return new RentalBicycle();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RentalCar
   * @generated
   */
  public RentalCar createRentalCar() {
    return new RentalCar();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RentalBusiness
   * @generated
   */
  public RentalBusiness createRentalBusiness() {
    return new RentalBusiness();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RentalCarDriver
   * @generated
   */
  public RentalCarDriver createRentalCarDriver() {
    return new RentalCarDriver();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RentalContract
   * @generated
   */
  public RentalContract createRentalContract() {
    return new RentalContract();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RentalContractLine
   * @generated
   */
  public RentalContractLine createRentalContractLine() {
    return new RentalContractLine();
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
    case RentalModelPackage.RENTALBICYCLETYPE_CLASSIFIER_ID:
      return createRentalBicycleTypeFromString(value);
    case RentalModelPackage.RENTALCARSIZE_CLASSIFIER_ID:
      return createRentalCarSizeFromString(value);
    case RentalModelPackage.DATE_CLASSIFIER_ID:
      return createDateFromString(value);
    case RentalModelPackage.RENTALBICYCLETYPEOBJECT_CLASSIFIER_ID:
      return createRentalBicycleTypeObjectFromString(value);
    case RentalModelPackage.RENTALCARSIZEOBJECT_CLASSIFIER_ID:
      return createRentalCarSizeObjectFromString(value);
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
    case RentalModelPackage.RENTALBICYCLETYPE_CLASSIFIER_ID:
      return convertRentalBicycleTypeToString((RentalBicycleType) value);
    case RentalModelPackage.RENTALCARSIZE_CLASSIFIER_ID:
      return convertRentalCarSizeToString((RentalCarSize) value);
    case RentalModelPackage.DATE_CLASSIFIER_ID:
      return convertDateToString((Date) value);
    case RentalModelPackage.RENTALBICYCLETYPEOBJECT_CLASSIFIER_ID:
      return convertRentalBicycleTypeObjectToString((RentalBicycleType) value);
    case RentalModelPackage.RENTALCARSIZEOBJECT_CLASSIFIER_ID:
      return convertRentalCarSizeObjectToString((RentalCarSize) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: RentalBicycleType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertRentalBicycleTypeToString(RentalBicycleType value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: RentalBicycleType from a String. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public RentalBicycleType createRentalBicycleTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return RentalBicycleType.get(value);
  }

  /**
   * Converts the EDataType: RentalCarSize to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertRentalCarSizeToString(RentalCarSize value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: RentalCarSize from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public RentalCarSize createRentalCarSizeFromString(String value) {
    if (value == null) {
      return null;
    }
    return RentalCarSize.get(value);
  }

  /**
   * Converts the EDataType: Date to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertDateToString(Date value) {
    if (value == null) {
      return null;
    }
    return ModelUtils.convertToXML(value);
  }

  /**
   * Creates an instance of the EDataType: Date from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public Date createDateFromString(String value) {
    if (value == null) {
      return null;
    }
    return ModelUtils.createFromXML(value);
  }

  /**
   * Converts the EDataType: RentalBicycleTypeObject to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertRentalBicycleTypeObjectToString(RentalBicycleType value) {
    if (value == null) {
      return null;
    }
    return convertRentalBicycleTypeToString(value);
  }

  /**
   * Creates an instance of the EDataType: RentalBicycleTypeObject from a String. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public RentalBicycleType createRentalBicycleTypeObjectFromString(String value) {
    if (value == null) {
      return null;
    }
    return createRentalBicycleTypeFromString(value);
  }

  /**
   * Converts the EDataType: RentalCarSizeObject to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertRentalCarSizeObjectToString(RentalCarSize value) {
    if (value == null) {
      return null;
    }
    return convertRentalCarSizeToString(value);
  }

  /**
   * Creates an instance of the EDataType: RentalCarSizeObject from a String. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public RentalCarSize createRentalCarSizeObjectFromString(String value) {
    if (value == null) {
      return null;
    }
    return createRentalCarSizeFromString(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>RentalBicycle</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RentalBicycleModelObject<E extends RentalBicycle> extends RentalUnitModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return RentalModelPackage.INSTANCE.getRentalBicycleEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return RentalModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RentalModelPackage.RENTALBICYCLE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case RentalModelPackage.RENTALBICYCLE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case RentalModelPackage.RENTALBICYCLE_DESCRIPTION_FEATURE_ID:
        return getTarget().getDescription();
      case RentalModelPackage.RENTALBICYCLE_TYPE_FEATURE_ID:
        return getTarget().getType();
      case RentalModelPackage.RENTALBICYCLE_RENTALCAR_FEATURE_ID:
        return getTarget().getRentalCar();
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
      case RentalModelPackage.RENTALBICYCLE_TYPE_FEATURE_ID:
        getTarget().setType((RentalBicycleType) value);
        return;
      case RentalModelPackage.RENTALBICYCLE_RENTALCAR_FEATURE_ID:
        getTarget().setRentalCar((RentalCar) value);
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
   * The adapter/wrapper for the EClass '<em><b>RentalUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RentalUnitModelObject<E extends RentalUnit> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return RentalModelPackage.INSTANCE.getRentalUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return RentalModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RentalModelPackage.RENTALUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case RentalModelPackage.RENTALUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case RentalModelPackage.RENTALUNIT_DESCRIPTION_FEATURE_ID:
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
      case RentalModelPackage.RENTALUNIT_DESCRIPTION_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>RentalCar</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RentalCarModelObject<E extends RentalCar> extends RentalUnitModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return RentalModelPackage.INSTANCE.getRentalCarEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return RentalModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RentalModelPackage.RENTALCAR_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case RentalModelPackage.RENTALCAR_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case RentalModelPackage.RENTALCAR_DESCRIPTION_FEATURE_ID:
        return getTarget().getDescription();
      case RentalModelPackage.RENTALCAR_SIZE_FEATURE_ID:
        return getTarget().getSize();
      case RentalModelPackage.RENTALCAR_CURRENTDRIVER_FEATURE_ID:
        return getTarget().getCurrentDriver();
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
      case RentalModelPackage.RENTALCAR_SIZE_FEATURE_ID:
        getTarget().setSize((RentalCarSize) value);
        return;
      case RentalModelPackage.RENTALCAR_CURRENTDRIVER_FEATURE_ID:
        getTarget().setCurrentDriver((RentalCarDriver) value);
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
   * The adapter/wrapper for the EClass '<em><b>RentalBusiness</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RentalBusinessModelObject<E extends RentalBusiness> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return RentalModelPackage.INSTANCE.getRentalBusinessEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return RentalModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RentalModelPackage.RENTALBUSINESS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case RentalModelPackage.RENTALBUSINESS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case RentalModelPackage.RENTALBUSINESS_NAME_FEATURE_ID:
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
      case RentalModelPackage.RENTALBUSINESS_NAME_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>RentalCarDriver</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RentalCarDriverModelObject<E extends RentalCarDriver> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return RentalModelPackage.INSTANCE.getRentalCarDriverEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return RentalModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RentalModelPackage.RENTALCARDRIVER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case RentalModelPackage.RENTALCARDRIVER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case RentalModelPackage.RENTALCARDRIVER_NAME_FEATURE_ID:
        return getTarget().getName();
      case RentalModelPackage.RENTALCARDRIVER_CURRENTRENTALCAR_FEATURE_ID:
        return getTarget().getCurrentRentalCar();
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
      case RentalModelPackage.RENTALCARDRIVER_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case RentalModelPackage.RENTALCARDRIVER_CURRENTRENTALCAR_FEATURE_ID:
        getTarget().setCurrentRentalCar((RentalCar) value);
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
   * The adapter/wrapper for the EClass '<em><b>RentalContract</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RentalContractModelObject<E extends RentalContract> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return RentalModelPackage.INSTANCE.getRentalContractEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return RentalModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RentalModelPackage.RENTALCONTRACT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case RentalModelPackage.RENTALCONTRACT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case RentalModelPackage.RENTALCONTRACT_RENTTOBUSINESSPARTNER_FEATURE_ID:
        return getTarget().getRentToBusinessPartner();
      case RentalModelPackage.RENTALCONTRACT_STARTDATE_FEATURE_ID:
        return getTarget().getStartDate();
      case RentalModelPackage.RENTALCONTRACT_ENDDATE_FEATURE_ID:
        return getTarget().getEndDate();
      case RentalModelPackage.RENTALCONTRACT_COST_FEATURE_ID:
        return getTarget().getCost();
      case RentalModelPackage.RENTALCONTRACT_RENTALCONTRACTLINES_FEATURE_ID:
        return getTarget().getRentalContractLines();
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
      case RentalModelPackage.RENTALCONTRACT_RENTTOBUSINESSPARTNER_FEATURE_ID:
        getTarget().setRentToBusinessPartner((String) value);
        return;
      case RentalModelPackage.RENTALCONTRACT_STARTDATE_FEATURE_ID:
        getTarget().setStartDate((Date) value);
        return;
      case RentalModelPackage.RENTALCONTRACT_ENDDATE_FEATURE_ID:
        getTarget().setEndDate((Date) value);
        return;
      case RentalModelPackage.RENTALCONTRACT_COST_FEATURE_ID:
        getTarget().setCost((Float) value);
        return;
      case RentalModelPackage.RENTALCONTRACT_RENTALCONTRACTLINES_FEATURE_ID:
        getTarget().setRentalContractLines((List<RentalContractLine>) value);
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

      case RentalModelPackage.RENTALCONTRACT_RENTALCONTRACTLINES_FEATURE_ID:
        return getTarget().addToRentalContractLines((RentalContractLine) value);
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

      case RentalModelPackage.RENTALCONTRACT_RENTALCONTRACTLINES_FEATURE_ID:
        return getTarget().removeFromRentalContractLines((RentalContractLine) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>RentalContractLine</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RentalContractLineModelObject<E extends RentalContractLine> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return RentalModelPackage.INSTANCE.getRentalContractLineEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return RentalModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RentalModelPackage.RENTALCONTRACTLINE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case RentalModelPackage.RENTALCONTRACTLINE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case RentalModelPackage.RENTALCONTRACTLINE_RENTALCONTRACT_FEATURE_ID:
        return getTarget().getRentalContract();
      case RentalModelPackage.RENTALCONTRACTLINE_NUMBER_FEATURE_ID:
        return getTarget().getNumber();
      case RentalModelPackage.RENTALCONTRACTLINE_RENTALUNIT_FEATURE_ID:
        return getTarget().getRentalUnit();
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
      case RentalModelPackage.RENTALCONTRACTLINE_RENTALCONTRACT_FEATURE_ID:
        getTarget().setRentalContract((RentalContract) value);
        return;
      case RentalModelPackage.RENTALCONTRACTLINE_NUMBER_FEATURE_ID:
        getTarget().setNumber((Long) value);
        return;
      case RentalModelPackage.RENTALCONTRACTLINE_RENTALUNIT_FEATURE_ID:
        getTarget().setRentalUnit((RentalUnit) value);
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