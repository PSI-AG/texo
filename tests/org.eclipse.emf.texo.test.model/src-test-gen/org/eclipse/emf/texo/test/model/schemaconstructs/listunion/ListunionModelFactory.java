package org.eclipse.emf.texo.test.model.schemaconstructs.listunion;

import java.math.BigInteger;
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
 * The <b>{@link ModelFactory}</b> for the types of this model:
 * org.eclipse.emf.texo.test.model.schemaconstructs.listunion. It contains code to create instances {@link ModelObject}
 * wrappers and instances for EClasses and convert objects back and forth from their String (XML) representation. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ListunionModelFactory implements ModelFactory {

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
    case ListunionModelPackage.STATESBYCOUNTRY_CLASSIFIER_ID:
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
    case ListunionModelPackage.STATESBYCOUNTRY_CLASSIFIER_ID:
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
    case ListunionModelPackage.STATELIST_CLASSIFIER_ID:
      return createStateListFromString(value);
    case ListunionModelPackage.STATE_CLASSIFIER_ID:
      return createStateFromString(value);
    case ListunionModelPackage.SIXSTATESLIST_CLASSIFIER_ID:
      return createSixStatesListFromString(value);
    case ListunionModelPackage.ZIPUNIONTYPE_CLASSIFIER_ID:
      return createZipUnionTypeFromString(value);
    case ListunionModelPackage.ZIPUNIONSTYPE_CLASSIFIER_ID:
      return createZipUnionsTypeFromString(value);
    case ListunionModelPackage.SIMPLEUNIONTYPE_CLASSIFIER_ID:
      return createSimpleUnionTypeFromString(value);
    case ListunionModelPackage.SIMPLESTRINGUNIONTYPE_CLASSIFIER_ID:
      return createSimpleStringUnionTypeFromString(value);
    case ListunionModelPackage.SIMPLESTRINGUNIONTYPEMEMBER0_CLASSIFIER_ID:
      return createSimpleStringUnionTypeMember0FromString(value);
    case ListunionModelPackage.SIMPLESTRINGUNIONTYPEMEMBER1_CLASSIFIER_ID:
      return createSimpleStringUnionTypeMember1FromString(value);
    case ListunionModelPackage.SIMPLEUNIONTYPEMEMBER0_CLASSIFIER_ID:
      return createSimpleUnionTypeMember0FromString(value);
    case ListunionModelPackage.SIMPLEUNIONTYPEMEMBER1_CLASSIFIER_ID:
      return createSimpleUnionTypeMember1FromString(value);
    case ListunionModelPackage.SIMPLEUNIONTYPEMEMBER1OBJECT_CLASSIFIER_ID:
      return createSimpleUnionTypeMember1ObjectFromString(value);
    case ListunionModelPackage.STRINGLIST_CLASSIFIER_ID:
      return createStringListFromString(value);
    case ListunionModelPackage.ZIPCODE_CLASSIFIER_ID:
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
    case ListunionModelPackage.STATELIST_CLASSIFIER_ID:
      return convertStateListToString((List<String>) value);
    case ListunionModelPackage.STATE_CLASSIFIER_ID:
      return convertStateToString((String) value);
    case ListunionModelPackage.SIXSTATESLIST_CLASSIFIER_ID:
      return convertSixStatesListToString((List<String>) value);
    case ListunionModelPackage.ZIPUNIONTYPE_CLASSIFIER_ID:
      return convertZipUnionTypeToString((String) value);
    case ListunionModelPackage.ZIPUNIONSTYPE_CLASSIFIER_ID:
      return convertZipUnionsTypeToString((String) value);
    case ListunionModelPackage.SIMPLEUNIONTYPE_CLASSIFIER_ID:
      return convertSimpleUnionTypeToString(value);
    case ListunionModelPackage.SIMPLESTRINGUNIONTYPE_CLASSIFIER_ID:
      return convertSimpleStringUnionTypeToString((String) value);
    case ListunionModelPackage.SIMPLESTRINGUNIONTYPEMEMBER0_CLASSIFIER_ID:
      return convertSimpleStringUnionTypeMember0ToString((String) value);
    case ListunionModelPackage.SIMPLESTRINGUNIONTYPEMEMBER1_CLASSIFIER_ID:
      return convertSimpleStringUnionTypeMember1ToString((String) value);
    case ListunionModelPackage.SIMPLEUNIONTYPEMEMBER0_CLASSIFIER_ID:
      return convertSimpleUnionTypeMember0ToString((BigInteger) value);
    case ListunionModelPackage.SIMPLEUNIONTYPEMEMBER1_CLASSIFIER_ID:
      return convertSimpleUnionTypeMember1ToString((SimpleUnionTypeMember1) value);
    case ListunionModelPackage.SIMPLEUNIONTYPEMEMBER1OBJECT_CLASSIFIER_ID:
      return convertSimpleUnionTypeMember1ObjectToString((SimpleUnionTypeMember1) value);
    case ListunionModelPackage.STRINGLIST_CLASSIFIER_ID:
      return convertStringListToString((List<String>) value);
    case ListunionModelPackage.ZIPCODE_CLASSIFIER_ID:
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
   * Converts the EDataType: ZipUnionType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertZipUnionTypeToString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Creates an instance of the EDataType: ZipUnionType from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public String createZipUnionTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Converts the EDataType: ZipUnionsType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertZipUnionsTypeToString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Creates an instance of the EDataType: ZipUnionsType from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public String createZipUnionsTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Converts the EDataType: SimpleUnionType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generatedNOT
   */
  public String convertSimpleUnionTypeToString(Object value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: SimpleUnionType from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generatedNOT
   */
  public Object createSimpleUnionTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Converts the EDataType: SimpleStringUnionType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertSimpleStringUnionTypeToString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Creates an instance of the EDataType: SimpleStringUnionType from a String. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public String createSimpleStringUnionTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Converts the EDataType: SimpleStringUnionTypeMember0 to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertSimpleStringUnionTypeMember0ToString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Creates an instance of the EDataType: SimpleStringUnionTypeMember0 from a String. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public String createSimpleStringUnionTypeMember0FromString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Converts the EDataType: SimpleStringUnionTypeMember1 to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertSimpleStringUnionTypeMember1ToString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Creates an instance of the EDataType: SimpleStringUnionTypeMember1 from a String. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public String createSimpleStringUnionTypeMember1FromString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Converts the EDataType: SimpleUnionTypeMember0 to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertSimpleUnionTypeMember0ToString(BigInteger value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: SimpleUnionTypeMember0 from a String. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public BigInteger createSimpleUnionTypeMember0FromString(String value) {
    if (value == null) {
      return null;
    }
    return new BigInteger(value);
  }

  /**
   * Converts the EDataType: SimpleUnionTypeMember1 to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertSimpleUnionTypeMember1ToString(SimpleUnionTypeMember1 value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: SimpleUnionTypeMember1 from a String. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public SimpleUnionTypeMember1 createSimpleUnionTypeMember1FromString(String value) {
    if (value == null) {
      return null;
    }
    return SimpleUnionTypeMember1.get(value);
  }

  /**
   * Converts the EDataType: SimpleUnionTypeMember1Object to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertSimpleUnionTypeMember1ObjectToString(SimpleUnionTypeMember1 value) {
    if (value == null) {
      return null;
    }
    return convertSimpleUnionTypeMember1ToString(value);
  }

  /**
   * Creates an instance of the EDataType: SimpleUnionTypeMember1Object from a String. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public SimpleUnionTypeMember1 createSimpleUnionTypeMember1ObjectFromString(String value) {
    if (value == null) {
      return null;
    }
    return createSimpleUnionTypeMember1FromString(value);
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
      return ListunionModelPackage.INSTANCE.getStatesByCountryEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ListunionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ListunionModelPackage.STATESBYCOUNTRY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ListunionModelPackage.STATESBYCOUNTRY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ListunionModelPackage.STATESBYCOUNTRY_COUNTRY_FEATURE_ID:
        return getTarget().getCountry();
      case ListunionModelPackage.STATESBYCOUNTRY_ALLSTATES_FEATURE_ID:
        return getTarget().getAllStates();
      case ListunionModelPackage.STATESBYCOUNTRY_SIXIMPORTANTSTATES_FEATURE_ID:
        return getTarget().getSixImportantStates();
      case ListunionModelPackage.STATESBYCOUNTRY_ZIPUNION_FEATURE_ID:
        return getTarget().getZipUnion();
      case ListunionModelPackage.STATESBYCOUNTRY_ZIPUNIONS_FEATURE_ID:
        return getTarget().getZipUnions();
      case ListunionModelPackage.STATESBYCOUNTRY_SIMPLEUNION_FEATURE_ID:
        return getTarget().getSimpleUnion();
      case ListunionModelPackage.STATESBYCOUNTRY_SIMPLEUNIONS_FEATURE_ID:
        return getTarget().getSimpleUnions();
      case ListunionModelPackage.STATESBYCOUNTRY_SIMPLESTRINGUNION_FEATURE_ID:
        return getTarget().getSimpleStringUnion();
      case ListunionModelPackage.STATESBYCOUNTRY_SIMPLESTRINGUNIONS_FEATURE_ID:
        return getTarget().getSimpleStringUnions();
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
      case ListunionModelPackage.STATESBYCOUNTRY_COUNTRY_FEATURE_ID:
        getTarget().setCountry((String) value);
        return;
      case ListunionModelPackage.STATESBYCOUNTRY_ALLSTATES_FEATURE_ID:
        getTarget().setAllStates((List<String>) value);
        return;
      case ListunionModelPackage.STATESBYCOUNTRY_SIXIMPORTANTSTATES_FEATURE_ID:
        getTarget().setSixImportantStates((List<String>) value);
        return;
      case ListunionModelPackage.STATESBYCOUNTRY_ZIPUNION_FEATURE_ID:
        getTarget().setZipUnion((String) value);
        return;
      case ListunionModelPackage.STATESBYCOUNTRY_ZIPUNIONS_FEATURE_ID:
        getTarget().setZipUnions((List<String>) value);
        return;
      case ListunionModelPackage.STATESBYCOUNTRY_SIMPLEUNION_FEATURE_ID:
        getTarget().setSimpleUnion(value);
        return;
      case ListunionModelPackage.STATESBYCOUNTRY_SIMPLEUNIONS_FEATURE_ID:
        getTarget().setSimpleUnions((List<Object>) value);
        return;
      case ListunionModelPackage.STATESBYCOUNTRY_SIMPLESTRINGUNION_FEATURE_ID:
        getTarget().setSimpleStringUnion((String) value);
        return;
      case ListunionModelPackage.STATESBYCOUNTRY_SIMPLESTRINGUNIONS_FEATURE_ID:
        getTarget().setSimpleStringUnions((List<String>) value);
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

      case ListunionModelPackage.STATESBYCOUNTRY_ZIPUNIONS_FEATURE_ID:
        return getTarget().getZipUnions().add((String) value);

      case ListunionModelPackage.STATESBYCOUNTRY_SIMPLEUNIONS_FEATURE_ID:
        return getTarget().getSimpleUnions().add(value);

      case ListunionModelPackage.STATESBYCOUNTRY_SIMPLESTRINGUNIONS_FEATURE_ID:
        return getTarget().getSimpleStringUnions().add((String) value);
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

      case ListunionModelPackage.STATESBYCOUNTRY_ZIPUNIONS_FEATURE_ID:
        return getTarget().getZipUnions().remove(value);

      case ListunionModelPackage.STATESBYCOUNTRY_SIMPLEUNIONS_FEATURE_ID:
        return getTarget().getSimpleUnions().remove(value);

      case ListunionModelPackage.STATESBYCOUNTRY_SIMPLESTRINGUNIONS_FEATURE_ID:
        return getTarget().getSimpleStringUnions().remove(value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }
}