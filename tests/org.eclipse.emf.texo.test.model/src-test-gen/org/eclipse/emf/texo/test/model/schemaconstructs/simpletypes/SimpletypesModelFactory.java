package org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes;

import java.math.BigDecimal;
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
 * The <b>{@link ModelFactory}</b> for the types of this model:
 * org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SimpletypesModelFactory implements ModelFactory {

  private static final String SEPARATOR = "::";

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
    case SimpletypesModelPackage.SIMPLELIST_CLASSIFIER_ID:
      return createSimpleList();
    case SimpletypesModelPackage.SIMPLETYPE_CLASSIFIER_ID:
      return createSimpleType();
    case SimpletypesModelPackage.SIMPLETYPEOBJECT_CLASSIFIER_ID:
      return createSimpleTypeObject();
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
    case SimpletypesModelPackage.SIMPLELIST_CLASSIFIER_ID:
      modelObject = new SimpleListModelObject();
      break;
    case SimpletypesModelPackage.SIMPLETYPE_CLASSIFIER_ID:
      modelObject = new SimpleTypeModelObject();
      break;
    case SimpletypesModelPackage.SIMPLETYPEOBJECT_CLASSIFIER_ID:
      modelObject = new SimpleTypeObjectModelObject();
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
   * @return an instance of the model object representing the EClass SimpleList
   * @generated
   */
  public SimpleList createSimpleList() {
    return new SimpleList();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SimpleType
   * @generated
   */
  public SimpleType createSimpleType() {
    return new SimpleType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SimpleTypeObject
   * @generated
   */
  public SimpleTypeObject createSimpleTypeObject() {
    return new SimpleTypeObject();
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
    case SimpletypesModelPackage.BYTE_CLASSIFIER_ID:
      return createByteFromString(value);
    case SimpletypesModelPackage.DOUBLE_CLASSIFIER_ID:
      return createDoubleFromString(value);
    case SimpletypesModelPackage.FLOAT_CLASSIFIER_ID:
      return createFloatFromString(value);
    case SimpletypesModelPackage.INT_CLASSIFIER_ID:
      return createIntFromString(value);
    case SimpletypesModelPackage.LONG_CLASSIFIER_ID:
      return createLongFromString(value);
    case SimpletypesModelPackage.SIMPLEENUM_CLASSIFIER_ID:
      return createSimpleEnumFromString(value);
    case SimpletypesModelPackage.DATE_CLASSIFIER_ID:
      return createDateFromString(value);
    case SimpletypesModelPackage.LIMITEDSTRING_CLASSIFIER_ID:
      return createLimitedStringFromString(value);
    case SimpletypesModelPackage.INTARRAY_CLASSIFIER_ID:
      return createIntArrayFromString(value);
    case SimpletypesModelPackage.DOUBLEARRAY_CLASSIFIER_ID:
      return createDoubleArrayFromString(value);
    case SimpletypesModelPackage.STRINGARRAY_CLASSIFIER_ID:
      return createStringArrayFromString(value);
    case SimpletypesModelPackage.BYTEARRAY_CLASSIFIER_ID:
      return createByteArrayFromString(value);
    case SimpletypesModelPackage.LIMITEDDECIMAL_CLASSIFIER_ID:
      return createLimitedDecimalFromString(value);
    case SimpletypesModelPackage.EXTRALIMITEDSTRING_CLASSIFIER_ID:
      return createExtraLimitedStringFromString(value);
    case SimpletypesModelPackage.SIMPLEENUMOBJECT_CLASSIFIER_ID:
      return createSimpleEnumObjectFromString(value);
    case SimpletypesModelPackage.BOOL_CLASSIFIER_ID:
      return createBoolFromString(value);
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
    case SimpletypesModelPackage.BYTE_CLASSIFIER_ID:
      return convertByteToString((Byte) value);
    case SimpletypesModelPackage.DOUBLE_CLASSIFIER_ID:
      return convertDoubleToString((Double) value);
    case SimpletypesModelPackage.FLOAT_CLASSIFIER_ID:
      return convertFloatToString((Float) value);
    case SimpletypesModelPackage.INT_CLASSIFIER_ID:
      return convertIntToString((Integer) value);
    case SimpletypesModelPackage.LONG_CLASSIFIER_ID:
      return convertLongToString((Long) value);
    case SimpletypesModelPackage.SIMPLEENUM_CLASSIFIER_ID:
      return convertSimpleEnumToString((SimpleEnum) value);
    case SimpletypesModelPackage.DATE_CLASSIFIER_ID:
      return convertDateToString((Date) value);
    case SimpletypesModelPackage.LIMITEDSTRING_CLASSIFIER_ID:
      return convertLimitedStringToString((String) value);
    case SimpletypesModelPackage.INTARRAY_CLASSIFIER_ID:
      return convertIntArrayToString((int[]) value);
    case SimpletypesModelPackage.DOUBLEARRAY_CLASSIFIER_ID:
      return convertDoubleArrayToString((double[]) value);
    case SimpletypesModelPackage.STRINGARRAY_CLASSIFIER_ID:
      return convertStringArrayToString((String[]) value);
    case SimpletypesModelPackage.BYTEARRAY_CLASSIFIER_ID:
      return convertByteArrayToString((byte[]) value);
    case SimpletypesModelPackage.LIMITEDDECIMAL_CLASSIFIER_ID:
      return convertLimitedDecimalToString((BigDecimal) value);
    case SimpletypesModelPackage.EXTRALIMITEDSTRING_CLASSIFIER_ID:
      return convertExtraLimitedStringToString((String) value);
    case SimpletypesModelPackage.SIMPLEENUMOBJECT_CLASSIFIER_ID:
      return convertSimpleEnumObjectToString((SimpleEnum) value);
    case SimpletypesModelPackage.BOOL_CLASSIFIER_ID:
      return convertBoolToString((Boolean) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: Bool to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertBoolToString(Boolean value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: Bool from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public Boolean createBoolFromString(String value) {
    if (value == null) {
      return null;
    }
    return new Boolean(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SimpleList</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SimpleListModelObject<E extends SimpleList> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SimpletypesModelPackage.INSTANCE.getSimpleListEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SimpletypesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SimpletypesModelPackage.SIMPLELIST_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SimpletypesModelPackage.SIMPLELIST_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SimpletypesModelPackage.SIMPLELIST_CODE_FEATURE_ID:
        return getTarget().getCode();
      case SimpletypesModelPackage.SIMPLELIST_BOO_FEATURE_ID:
        return getTarget().getBoo();
      case SimpletypesModelPackage.SIMPLELIST_BYT_FEATURE_ID:
        return getTarget().getByt();
      case SimpletypesModelPackage.SIMPLELIST_DOUBL_FEATURE_ID:
        return getTarget().getDoubl();
      case SimpletypesModelPackage.SIMPLELIST_FLOA_FEATURE_ID:
        return getTarget().getFloa();
      case SimpletypesModelPackage.SIMPLELIST_INTE_FEATURE_ID:
        return getTarget().getInte();
      case SimpletypesModelPackage.SIMPLELIST_LONG__FEATURE_ID:
        return getTarget().getLong_();
      case SimpletypesModelPackage.SIMPLELIST_SHOR_FEATURE_ID:
        return getTarget().getShor();
      case SimpletypesModelPackage.SIMPLELIST_ENU_FEATURE_ID:
        return getTarget().getEnu();
      case SimpletypesModelPackage.SIMPLELIST_DAT_FEATURE_ID:
        return getTarget().getDat();
      case SimpletypesModelPackage.SIMPLELIST_LIMITEDSTRING_FEATURE_ID:
        return getTarget().getLimitedstring();
      case SimpletypesModelPackage.SIMPLELIST_STRI_FEATURE_ID:
        return getTarget().getStri();
      case SimpletypesModelPackage.SIMPLELIST_INTARRAY_FEATURE_ID:
        return getTarget().getIntArray();
      case SimpletypesModelPackage.SIMPLELIST_DOUBLEARRAY_FEATURE_ID:
        return getTarget().getDoubleArray();
      case SimpletypesModelPackage.SIMPLELIST_STRINGARRAY_FEATURE_ID:
        return getTarget().getStringArray();
      case SimpletypesModelPackage.SIMPLELIST_BYTEARRAY_FEATURE_ID:
        return getTarget().getByteArray();
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
      case SimpletypesModelPackage.SIMPLELIST_CODE_FEATURE_ID:
        getTarget().setCode((String) value);
        return;
      case SimpletypesModelPackage.SIMPLELIST_BOO_FEATURE_ID:
        getTarget().setBoo((List<Boolean>) value);
        return;
      case SimpletypesModelPackage.SIMPLELIST_BYT_FEATURE_ID:
        getTarget().setByt((List<Byte>) value);
        return;
      case SimpletypesModelPackage.SIMPLELIST_DOUBL_FEATURE_ID:
        getTarget().setDoubl((List<Double>) value);
        return;
      case SimpletypesModelPackage.SIMPLELIST_FLOA_FEATURE_ID:
        getTarget().setFloa((List<Float>) value);
        return;
      case SimpletypesModelPackage.SIMPLELIST_INTE_FEATURE_ID:
        getTarget().setInte((List<Integer>) value);
        return;
      case SimpletypesModelPackage.SIMPLELIST_LONG__FEATURE_ID:
        getTarget().setLong_((List<Long>) value);
        return;
      case SimpletypesModelPackage.SIMPLELIST_SHOR_FEATURE_ID:
        getTarget().setShor((List<Short>) value);
        return;
      case SimpletypesModelPackage.SIMPLELIST_ENU_FEATURE_ID:
        getTarget().setEnu((List<SimpleEnum>) value);
        return;
      case SimpletypesModelPackage.SIMPLELIST_DAT_FEATURE_ID:
        getTarget().setDat((List<Date>) value);
        return;
      case SimpletypesModelPackage.SIMPLELIST_LIMITEDSTRING_FEATURE_ID:
        getTarget().setLimitedstring((List<String>) value);
        return;
      case SimpletypesModelPackage.SIMPLELIST_STRI_FEATURE_ID:
        getTarget().setStri((List<String>) value);
        return;
      case SimpletypesModelPackage.SIMPLELIST_INTARRAY_FEATURE_ID:
        getTarget().setIntArray((int[]) value);
        return;
      case SimpletypesModelPackage.SIMPLELIST_DOUBLEARRAY_FEATURE_ID:
        getTarget().setDoubleArray((double[]) value);
        return;
      case SimpletypesModelPackage.SIMPLELIST_STRINGARRAY_FEATURE_ID:
        getTarget().setStringArray((String[]) value);
        return;
      case SimpletypesModelPackage.SIMPLELIST_BYTEARRAY_FEATURE_ID:
        getTarget().setByteArray((byte[]) value);
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

      case SimpletypesModelPackage.SIMPLELIST_BOO_FEATURE_ID:
        return getTarget().getBoo().add((Boolean) value);

      case SimpletypesModelPackage.SIMPLELIST_BYT_FEATURE_ID:
        return getTarget().getByt().add((Byte) value);

      case SimpletypesModelPackage.SIMPLELIST_DOUBL_FEATURE_ID:
        return getTarget().getDoubl().add((Double) value);

      case SimpletypesModelPackage.SIMPLELIST_FLOA_FEATURE_ID:
        return getTarget().getFloa().add((Float) value);

      case SimpletypesModelPackage.SIMPLELIST_INTE_FEATURE_ID:
        return getTarget().getInte().add((Integer) value);

      case SimpletypesModelPackage.SIMPLELIST_LONG__FEATURE_ID:
        return getTarget().getLong_().add((Long) value);

      case SimpletypesModelPackage.SIMPLELIST_SHOR_FEATURE_ID:
        return getTarget().getShor().add((Short) value);

      case SimpletypesModelPackage.SIMPLELIST_ENU_FEATURE_ID:
        return getTarget().getEnu().add((SimpleEnum) value);

      case SimpletypesModelPackage.SIMPLELIST_DAT_FEATURE_ID:
        return getTarget().getDat().add((Date) value);

      case SimpletypesModelPackage.SIMPLELIST_LIMITEDSTRING_FEATURE_ID:
        return getTarget().getLimitedstring().add((String) value);

      case SimpletypesModelPackage.SIMPLELIST_STRI_FEATURE_ID:
        return getTarget().getStri().add((String) value);

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

      case SimpletypesModelPackage.SIMPLELIST_BOO_FEATURE_ID:
        return getTarget().getBoo().remove(value);

      case SimpletypesModelPackage.SIMPLELIST_BYT_FEATURE_ID:
        return getTarget().getByt().remove(value);

      case SimpletypesModelPackage.SIMPLELIST_DOUBL_FEATURE_ID:
        return getTarget().getDoubl().remove(value);

      case SimpletypesModelPackage.SIMPLELIST_FLOA_FEATURE_ID:
        return getTarget().getFloa().remove(value);

      case SimpletypesModelPackage.SIMPLELIST_INTE_FEATURE_ID:
        return getTarget().getInte().remove(value);

      case SimpletypesModelPackage.SIMPLELIST_LONG__FEATURE_ID:
        return getTarget().getLong_().remove(value);

      case SimpletypesModelPackage.SIMPLELIST_SHOR_FEATURE_ID:
        return getTarget().getShor().remove(value);

      case SimpletypesModelPackage.SIMPLELIST_ENU_FEATURE_ID:
        return getTarget().getEnu().remove(value);

      case SimpletypesModelPackage.SIMPLELIST_DAT_FEATURE_ID:
        return getTarget().getDat().remove(value);

      case SimpletypesModelPackage.SIMPLELIST_LIMITEDSTRING_FEATURE_ID:
        return getTarget().getLimitedstring().remove(value);

      case SimpletypesModelPackage.SIMPLELIST_STRI_FEATURE_ID:
        return getTarget().getStri().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SimpleType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SimpleTypeModelObject<E extends SimpleType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SimpletypesModelPackage.INSTANCE.getSimpleTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SimpletypesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SimpletypesModelPackage.SIMPLETYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SimpletypesModelPackage.SIMPLETYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SimpletypesModelPackage.SIMPLETYPE_CODE_FEATURE_ID:
        return getTarget().getCode();
      case SimpletypesModelPackage.SIMPLETYPE_BOO_FEATURE_ID:
        return getTarget().isBoo();
      case SimpletypesModelPackage.SIMPLETYPE_BYT_FEATURE_ID:
        return getTarget().getByt();
      case SimpletypesModelPackage.SIMPLETYPE_DOUBL_FEATURE_ID:
        return getTarget().getDoubl();
      case SimpletypesModelPackage.SIMPLETYPE_FLOAT__FEATURE_ID:
        return getTarget().getFloat_();
      case SimpletypesModelPackage.SIMPLETYPE_INTE_FEATURE_ID:
        return getTarget().getInte();
      case SimpletypesModelPackage.SIMPLETYPE_LON_FEATURE_ID:
        return getTarget().getLon();
      case SimpletypesModelPackage.SIMPLETYPE_SHOR_FEATURE_ID:
        return getTarget().getShor();
      case SimpletypesModelPackage.SIMPLETYPE_ENU_FEATURE_ID:
        return getTarget().getEnu();
      case SimpletypesModelPackage.SIMPLETYPE_DAT_FEATURE_ID:
        return getTarget().getDat();
      case SimpletypesModelPackage.SIMPLETYPE_LIMITEDSTRING_FEATURE_ID:
        return getTarget().getLimitedstring();
      case SimpletypesModelPackage.SIMPLETYPE_LIMITEDDECIMAL_FEATURE_ID:
        return getTarget().getLimitedDecimal();
      case SimpletypesModelPackage.SIMPLETYPE_EXTRALIMITEDSTRING_FEATURE_ID:
        return getTarget().getExtraLimitedString();
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
      case SimpletypesModelPackage.SIMPLETYPE_CODE_FEATURE_ID:
        getTarget().setCode((String) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPE_BOO_FEATURE_ID:
        getTarget().setBoo((Boolean) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPE_BYT_FEATURE_ID:
        getTarget().setByt((Byte) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPE_DOUBL_FEATURE_ID:
        getTarget().setDoubl((Double) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPE_FLOAT__FEATURE_ID:
        getTarget().setFloat_((Float) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPE_INTE_FEATURE_ID:
        getTarget().setInte((Integer) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPE_LON_FEATURE_ID:
        getTarget().setLon((Long) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPE_SHOR_FEATURE_ID:
        getTarget().setShor((Short) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPE_ENU_FEATURE_ID:
        getTarget().setEnu((SimpleEnum) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPE_DAT_FEATURE_ID:
        getTarget().setDat((Date) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPE_LIMITEDSTRING_FEATURE_ID:
        getTarget().setLimitedstring((String) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPE_LIMITEDDECIMAL_FEATURE_ID:
        getTarget().setLimitedDecimal((BigDecimal) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPE_EXTRALIMITEDSTRING_FEATURE_ID:
        getTarget().setExtraLimitedString((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>SimpleTypeObject</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param <E>
   * 
   * @generated
   */
  public static class SimpleTypeObjectModelObject<E extends SimpleTypeObject> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SimpletypesModelPackage.INSTANCE.getSimpleTypeObjectEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SimpletypesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_CODE_FEATURE_ID:
        return getTarget().getCode();
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_BOO_FEATURE_ID:
        return getTarget().getBoo();
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_BYT_FEATURE_ID:
        return getTarget().getByt();
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_DOUBL_FEATURE_ID:
        return getTarget().getDoubl();
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_FLOAT__FEATURE_ID:
        return getTarget().getFloat_();
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_INTE_FEATURE_ID:
        return getTarget().getInte();
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_LON_FEATURE_ID:
        return getTarget().getLon();
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_SHOR_FEATURE_ID:
        return getTarget().getShor();
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_ENU_FEATURE_ID:
        return getTarget().getEnu();
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_DAT_FEATURE_ID:
        return getTarget().getDat();
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
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_CODE_FEATURE_ID:
        getTarget().setCode((String) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_BOO_FEATURE_ID:
        getTarget().setBoo((Boolean) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_BYT_FEATURE_ID:
        getTarget().setByt((Byte) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_DOUBL_FEATURE_ID:
        getTarget().setDoubl((Double) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_FLOAT__FEATURE_ID:
        getTarget().setFloat_((Float) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_INTE_FEATURE_ID:
        getTarget().setInte((Integer) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_LON_FEATURE_ID:
        getTarget().setLon((Long) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_SHOR_FEATURE_ID:
        getTarget().setShor((Short) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_ENU_FEATURE_ID:
        getTarget().setEnu((SimpleEnum) value);
        return;
      case SimpletypesModelPackage.SIMPLETYPEOBJECT_DAT_FEATURE_ID:
        getTarget().setDat((Date) value);
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
   * Converts the EDataType: Byte to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertByteToString(Byte value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: Byte from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public Byte createByteFromString(String value) {
    if (value == null) {
      return null;
    }
    return new Byte(value);
  }

  /**
   * Converts the EDataType: ByteArray to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generatedNOT
   */
  public String convertByteArrayToString(byte[] value) {
    if (value == null) {
      return null;
    }
    final StringBuilder sb = new StringBuilder();
    for (byte b : value) {
      if (sb.length() > 0) {
        sb.append(SEPARATOR);
      }
      sb.append(Byte.toString(b));
    }
    return sb.toString();
  }

  /**
   * Creates an instance of the EDataType: ByteArray from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generatedNOT
   */
  public byte[] createByteArrayFromString(String value) {
    if (value == null) {
      return null;
    }
    final String[] values = value.split(SEPARATOR);
    final byte[] result = new byte[values.length];
    int i = 0;
    for (String strValue : values) {
      result[i++] = Byte.parseByte(strValue);
    }
    return result;
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
   * Converts the EDataType: Double to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertDoubleToString(Double value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: Double from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public Double createDoubleFromString(String value) {
    if (value == null) {
      return null;
    }
    return new Double(value);
  }

  /**
   * Converts the EDataType: DoubleArray to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generatedNOT
   */
  public String convertDoubleArrayToString(double[] value) {
    if (value == null) {
      return null;
    }
    final StringBuilder sb = new StringBuilder();
    for (double v : value) {
      if (sb.length() > 0) {
        sb.append(SEPARATOR);
      }
      sb.append(Double.toString(v));
    }
    return sb.toString();
  }

  /**
   * Creates an instance of the EDataType: DoubleArray from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generatedNOT
   */
  public double[] createDoubleArrayFromString(String value) {
    if (value == null) {
      return null;
    }
    final String[] values = value.split(SEPARATOR);
    final double[] result = new double[values.length];
    int i = 0;
    for (String strValue : values) {
      result[i++] = Double.parseDouble(strValue);
    }
    return result;
  }

  /**
   * Converts the EDataType: ExtraLimitedString to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertExtraLimitedStringToString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Creates an instance of the EDataType: ExtraLimitedString from a String. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public String createExtraLimitedStringFromString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Converts the EDataType: Float to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertFloatToString(Float value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: Float from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public Float createFloatFromString(String value) {
    if (value == null) {
      return null;
    }
    return new Float(value);
  }

  /**
   * Converts the EDataType: Int to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertIntToString(Integer value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: Int from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public Integer createIntFromString(String value) {
    if (value == null) {
      return null;
    }
    return new Integer(value);
  }

  /**
   * Converts the EDataType: IntArray to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generatedNOT
   */
  public String convertIntArrayToString(int[] value) {
    if (value == null) {
      return null;
    }
    final StringBuilder sb = new StringBuilder();
    for (int v : value) {
      if (sb.length() > 0) {
        sb.append(SEPARATOR);
      }
      sb.append(Integer.toString(v));
    }
    return sb.toString();
  }

  /**
   * Creates an instance of the EDataType: IntArray from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generatedNOT
   */
  public int[] createIntArrayFromString(String value) {
    if (value == null) {
      return null;
    }
    final String[] values = value.split(SEPARATOR);
    final int[] result = new int[values.length];
    int i = 0;
    for (String strValue : values) {
      result[i++] = Integer.parseInt(strValue);
    }
    return result;
  }

  /**
   * Converts the EDataType: LimitedDecimal to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertLimitedDecimalToString(BigDecimal value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: LimitedDecimal from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public BigDecimal createLimitedDecimalFromString(String value) {
    if (value == null) {
      return null;
    }
    return new BigDecimal(value);
  }

  /**
   * Converts the EDataType: LimitedString to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertLimitedStringToString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Creates an instance of the EDataType: LimitedString from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public String createLimitedStringFromString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Converts the EDataType: Long to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertLongToString(Long value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: Long from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public Long createLongFromString(String value) {
    if (value == null) {
      return null;
    }
    return new Long(value);
  }

  /**
   * Converts the EDataType: SimpleEnum to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertSimpleEnumToString(SimpleEnum value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: SimpleEnum from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public SimpleEnum createSimpleEnumFromString(String value) {
    if (value == null) {
      return null;
    }
    return SimpleEnum.get(value);
  }

  /**
   * Converts the EDataType: SimpleEnumObject to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertSimpleEnumObjectToString(SimpleEnum value) {
    if (value == null) {
      return null;
    }
    return convertSimpleEnumToString(value);
  }

  /**
   * Creates an instance of the EDataType: SimpleEnumObject from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public SimpleEnum createSimpleEnumObjectFromString(String value) {
    if (value == null) {
      return null;
    }
    return createSimpleEnumFromString(value);
  }

  /**
   * Converts the EDataType: StringArray to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generatedNOT
   */
  public String convertStringArrayToString(String[] value) {
    if (value == null) {
      return null;
    }
    final StringBuilder sb = new StringBuilder();
    for (String v : value) {
      if (sb.length() > 0) {
        sb.append(SEPARATOR);
      }
      sb.append(v);
    }
    return sb.toString();
  }

  /**
   * Creates an instance of the EDataType: StringArray from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generatedNOT
   */
  public String[] createStringArrayFromString(String value) {
    if (value == null) {
      return null;
    }
    final String[] values = value.split(SEPARATOR);
    final String[] result = new String[values.length];
    int i = 0;
    for (String strValue : values) {
      result[i++] = strValue;
    }
    return result;
  }

}