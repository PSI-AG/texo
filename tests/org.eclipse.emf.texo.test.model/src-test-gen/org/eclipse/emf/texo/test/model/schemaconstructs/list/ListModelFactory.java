package org.eclipse.emf.texo.test.model.schemaconstructs.list;

import java.util.ArrayList;
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

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: org.eclipse.emf.texo.test.model.schemaconstructs.list.
 * It contains code to create instances {@link ModelObject} wrappers and instances for EClasses and convert objects back
 * and forth from their String (XML) representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ListModelFactory implements ModelFactory {

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
    case ListModelPackage.STATESBYCOUNTRY_CLASSIFIER_ID:
      return createStatesByCountry();
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
    case ListModelPackage.STATESBYCOUNTRY_CLASSIFIER_ID:
      modelObject = new StatesByCountryModelObject();
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
   * @return an instance of the model object representing the EClass statesByCountry
   * @generated
   */
  public StatesByCountry createStatesByCountry() {
    return new StatesByCountry();
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
    case ListModelPackage.STATELIST_CLASSIFIER_ID:
      return createStateListFromString(value);
    case ListModelPackage.STATE_CLASSIFIER_ID:
      return createStateFromString(value);
    case ListModelPackage.SIXSTATESLIST_CLASSIFIER_ID:
      return createSixStatesListFromString(value);
    case ListModelPackage.STRINGLIST_CLASSIFIER_ID:
      return createStringListFromString(value);
    case ListModelPackage.ZIPCODE_CLASSIFIER_ID:
      return createZipCodeFromString(value);
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
  @SuppressWarnings("unchecked")
  public String convertToString(EDataType eDataType, Object value) {
    switch (eDataType.getClassifierID()) {
    case ListModelPackage.STATELIST_CLASSIFIER_ID:
      return convertStateListToString((List<String>) value);
    case ListModelPackage.STATE_CLASSIFIER_ID:
      return convertStateToString((String) value);
    case ListModelPackage.SIXSTATESLIST_CLASSIFIER_ID:
      return convertSixStatesListToString((List<String>) value);
    case ListModelPackage.STRINGLIST_CLASSIFIER_ID:
      return convertStringListToString((List<String>) value);
    case ListModelPackage.ZIPCODE_CLASSIFIER_ID:
      return convertZipCodeToString((String) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: StateList to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generatedNOT
   */
  public String convertStateListToString(List<String> value) {
    if (value == null) {
      return null;
    }
    final StringBuilder sb = new StringBuilder();
    for (String val : value) {
      if (sb.length() > 0) {
        sb.append(";");
      }
      sb.append(val);
    }
    return sb.toString();
  }

  /**
   * Creates an instance of the EDataType: StateList from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generatedNOT
   */
  public List<String> createStateListFromString(String value) {
    if (value == null) {
      return null;
    }
    final String[] values = value.split(";");
    final List<String> valueList = new ArrayList<String>();
    for (String val : values) {
      valueList.add(val);
    }
    return valueList;
  }

  /**
   * Converts the EDataType: State to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertStateToString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Creates an instance of the EDataType: State from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public String createStateFromString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Converts the EDataType: SixStatesList to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generatedNOT
   */
  public String convertSixStatesListToString(List<String> value) {
    if (value == null) {
      return null;
    }
    final StringBuilder sb = new StringBuilder();
    for (String val : value) {
      if (sb.length() > 0) {
        sb.append(";");
      }
      sb.append(val);
    }
    return sb.toString();
  }

  /**
   * Creates an instance of the EDataType: SixStatesList from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generatedNOT
   */
  public List<String> createSixStatesListFromString(String value) {
    if (value == null) {
      return null;
    }
    final String[] values = value.split(";");
    final List<String> valueList = new ArrayList<String>();
    for (String val : values) {
      valueList.add(val);
    }
    return valueList;
  }

  /**
   * Converts the EDataType: StringList to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generatedNOT
   */
  public String convertStringListToString(List<String> value) {
    if (value == null) {
      return null;
    }
    final StringBuilder sb = new StringBuilder();
    for (String val : value) {
      if (sb.length() > 0) {
        sb.append(";");
      }
      sb.append(val);
    }
    return sb.toString();
  }

  /**
   * Creates an instance of the EDataType: StringList from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generatedNOT
   */
  public List<String> createStringListFromString(String value) {
    if (value == null) {
      return null;
    }
    final String[] values = value.split(";");
    final List<String> valueList = new ArrayList<String>();
    for (String val : values) {
      valueList.add(val);
    }
    return valueList;
  }

  /**
   * Converts the EDataType: ZipCode to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertZipCodeToString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Creates an instance of the EDataType: ZipCode from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public String createZipCodeFromString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>statesByCountry</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class StatesByCountryModelObject<E extends StatesByCountry> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ListModelPackage.INSTANCE.getStatesByCountryEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ListModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ListModelPackage.STATESBYCOUNTRY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ListModelPackage.STATESBYCOUNTRY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ListModelPackage.STATESBYCOUNTRY_COUNTRY_FEATURE_ID:
        return getTarget().getCountry();
      case ListModelPackage.STATESBYCOUNTRY_INDEX_FEATURE_ID:
        return getTarget().getIndex();
      case ListModelPackage.STATESBYCOUNTRY_ALLSTATES_FEATURE_ID:
        return getTarget().getAllStates();
      case ListModelPackage.STATESBYCOUNTRY_SIXIMPORTANTSTATES_FEATURE_ID:
        return getTarget().getSixImportantStates();
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
      case ListModelPackage.STATESBYCOUNTRY_COUNTRY_FEATURE_ID:
        getTarget().setCountry((String) value);
        return;
      case ListModelPackage.STATESBYCOUNTRY_INDEX_FEATURE_ID:
        getTarget().setIndex((Integer) value);
        return;
      case ListModelPackage.STATESBYCOUNTRY_ALLSTATES_FEATURE_ID:
        getTarget().setAllStates((List<String>) value);
        return;
      case ListModelPackage.STATESBYCOUNTRY_SIXIMPORTANTSTATES_FEATURE_ID:
        getTarget().setSixImportantStates((List<String>) value);
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