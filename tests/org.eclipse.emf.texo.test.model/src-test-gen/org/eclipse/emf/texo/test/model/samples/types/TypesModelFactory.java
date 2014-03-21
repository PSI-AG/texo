package org.eclipse.emf.texo.test.model.samples.types;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Set;
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
 * The <b>{@link ModelFactory}</b> for the types of this model: types. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TypesModelFactory implements ModelFactory {

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
    case TypesModelPackage.MANYTYPES_CLASSIFIER_ID:
      return createManyTypes();
    case TypesModelPackage.SINGLETYPES_CLASSIFIER_ID:
      return createSingleTypes();
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
    case TypesModelPackage.MANYTYPES_CLASSIFIER_ID:
      modelObject = new ManyTypesModelObject();
      break;
    case TypesModelPackage.SINGLETYPES_CLASSIFIER_ID:
      modelObject = new SingleTypesModelObject();
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
   * @return an instance of the model object representing the EClass SingleTypes
   * @generated
   */
  public SingleTypes createSingleTypes() {
    return new SingleTypes();
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
    case TypesModelPackage.TESTENUM_CLASSIFIER_ID:
      return createTestEnumFromString(value);
    case TypesModelPackage.STRINGARRAY_CLASSIFIER_ID:
      return createStringArrayFromString(value);
    case TypesModelPackage.LONGARRAY_CLASSIFIER_ID:
      return createLongArrayFromString(value);
    case TypesModelPackage.TESTNEXTENUM_CLASSIFIER_ID:
      return createTestNextEnumFromString(value);
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
    case TypesModelPackage.TESTENUM_CLASSIFIER_ID:
      return convertTestEnumToString((TestEnum) value);
    case TypesModelPackage.STRINGARRAY_CLASSIFIER_ID:
      return convertStringArrayToString((String[]) value);
    case TypesModelPackage.LONGARRAY_CLASSIFIER_ID:
      return convertLongArrayToString((long[]) value);
    case TypesModelPackage.TESTNEXTENUM_CLASSIFIER_ID:
      return convertTestNextEnumToString((TestNextEnum) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ManyTypes
   * @generated
   */
  public ManyTypes createManyTypes() {
    return new ManyTypes();
  }

  /**
   * Converts the EDataType: TestEnum to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertTestEnumToString(TestEnum value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: TestEnum from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public TestEnum createTestEnumFromString(String value) {
    if (value == null) {
      return null;
    }
    return TestEnum.get(value);
  }

  /**
   * Converts the EDataType: LongArray to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generatedNOT
   */
  public String convertLongArrayToString(final long[] value) {
    if (value == null) {
      return null;
    }
    final StringBuilder sb = new StringBuilder();
    for (final long longValue : value) {
      if (sb.length() > 0) {
        sb.append(",");
      }
      sb.append(longValue + "");
    }
    return sb.toString();
  }

  /**
   * Creates an instance of the EDataType: LongArray from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generatedNOT
   */
  public long[] createLongArrayFromString(final String value) {
    if (value == null) {
      return null;
    }
    TypesModelPackage.INSTANCE.getLongArrayEDataType();
    final String[] values = value.split(",");
    final long[] result = new long[values.length];
    for (int i = 0; i < values.length; i++) {
      result[i] = Long.parseLong(values[i]);
    }
    return result;
  }

  /**
   * Converts the EDataType: StringArray to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generatedNOT
   */
  public String convertStringArrayToString(final String[] value) {
    if (value == null) {
      return null;
    }
    final StringBuilder sb = new StringBuilder();
    for (final String strValue : value) {
      if (sb.length() > 0) {
        sb.append("::");
      }
      sb.append(strValue);
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
  public String[] createStringArrayFromString(final String value) {
    if (value == null) {
      return null;
    }
    return value.split("::");
  }

  /**
   * Converts the EDataType: TestNextEnum to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertTestNextEnumToString(TestNextEnum value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: TestNextEnum from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public TestNextEnum createTestNextEnumFromString(String value) {
    if (value == null) {
      return null;
    }
    return TestNextEnum.get(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ManyTypes</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ManyTypesModelObject<E extends ManyTypes> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return TypesModelPackage.INSTANCE.getManyTypesEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return TypesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case TypesModelPackage.MANYTYPES_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case TypesModelPackage.MANYTYPES_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case TypesModelPackage.MANYTYPES_STRING_FEATURE_ID:
        return getTarget().getString();
      case TypesModelPackage.MANYTYPES_INTEGEROBJECT_FEATURE_ID:
        return getTarget().getIntegerObject();
      case TypesModelPackage.MANYTYPES_LONG__FEATURE_ID:
        return getTarget().getLong_();
      case TypesModelPackage.MANYTYPES_DOUBLEOBJECT_FEATURE_ID:
        return getTarget().getDoubleObject();
      case TypesModelPackage.MANYTYPES_FLOATOBJECT_FEATURE_ID:
        return getTarget().getFloatObject();
      case TypesModelPackage.MANYTYPES_CLAZZ_FEATURE_ID:
        return getTarget().getClazz();
      case TypesModelPackage.MANYTYPES_CHAROBJECT_FEATURE_ID:
        return getTarget().getCharObject();
      case TypesModelPackage.MANYTYPES_BYTEOBJECT_FEATURE_ID:
        return getTarget().getByteObject();
      case TypesModelPackage.MANYTYPES_BYTEARRAY_FEATURE_ID:
        return getTarget().getByteArray();
      case TypesModelPackage.MANYTYPES_BIGDECIMAL_FEATURE_ID:
        return getTarget().getBigDecimal();
      case TypesModelPackage.MANYTYPES_BIGINTEGER_FEATURE_ID:
        return getTarget().getBigInteger();
      case TypesModelPackage.MANYTYPES_ENUM__FEATURE_ID:
        return getTarget().getEnum_();
      case TypesModelPackage.MANYTYPES_DATE_FEATURE_ID:
        return getTarget().getDate();
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
      case TypesModelPackage.MANYTYPES_STRING_FEATURE_ID:
        getTarget().setString((List<String>) value);
        return;
      case TypesModelPackage.MANYTYPES_INTEGEROBJECT_FEATURE_ID:
        getTarget().setIntegerObject((List<Integer>) value);
        return;
      case TypesModelPackage.MANYTYPES_LONG__FEATURE_ID:
        getTarget().setLong_((Set<Long>) value);
        return;
      case TypesModelPackage.MANYTYPES_DOUBLEOBJECT_FEATURE_ID:
        getTarget().setDoubleObject((Set<Double>) value);
        return;
      case TypesModelPackage.MANYTYPES_FLOATOBJECT_FEATURE_ID:
        getTarget().setFloatObject((List<Float>) value);
        return;
      case TypesModelPackage.MANYTYPES_CLAZZ_FEATURE_ID:
        getTarget().setClazz((Set<Class<?>>) value);
        return;
      case TypesModelPackage.MANYTYPES_CHAROBJECT_FEATURE_ID:
        getTarget().setCharObject((List<Character>) value);
        return;
      case TypesModelPackage.MANYTYPES_BYTEOBJECT_FEATURE_ID:
        getTarget().setByteObject((List<Byte>) value);
        return;
      case TypesModelPackage.MANYTYPES_BYTEARRAY_FEATURE_ID:
        getTarget().setByteArray((List<byte[]>) value);
        return;
      case TypesModelPackage.MANYTYPES_BIGDECIMAL_FEATURE_ID:
        getTarget().setBigDecimal((List<BigDecimal>) value);
        return;
      case TypesModelPackage.MANYTYPES_BIGINTEGER_FEATURE_ID:
        getTarget().setBigInteger((Set<BigInteger>) value);
        return;
      case TypesModelPackage.MANYTYPES_ENUM__FEATURE_ID:
        getTarget().setEnum_((List<TestEnum>) value);
        return;
      case TypesModelPackage.MANYTYPES_DATE_FEATURE_ID:
        getTarget().setDate((Set<Date>) value);
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

      case TypesModelPackage.MANYTYPES_STRING_FEATURE_ID:
        return getTarget().getString().add((String) value);

      case TypesModelPackage.MANYTYPES_INTEGEROBJECT_FEATURE_ID:
        return getTarget().getIntegerObject().add((Integer) value);

      case TypesModelPackage.MANYTYPES_LONG__FEATURE_ID:
        return getTarget().getLong_().add((Long) value);

      case TypesModelPackage.MANYTYPES_DOUBLEOBJECT_FEATURE_ID:
        return getTarget().getDoubleObject().add((Double) value);

      case TypesModelPackage.MANYTYPES_FLOATOBJECT_FEATURE_ID:
        return getTarget().getFloatObject().add((Float) value);

      case TypesModelPackage.MANYTYPES_CLAZZ_FEATURE_ID:
        return getTarget().getClazz().add((Class<?>) value);

      case TypesModelPackage.MANYTYPES_CHAROBJECT_FEATURE_ID:
        return getTarget().getCharObject().add((Character) value);

      case TypesModelPackage.MANYTYPES_BYTEOBJECT_FEATURE_ID:
        return getTarget().getByteObject().add((Byte) value);

      case TypesModelPackage.MANYTYPES_BYTEARRAY_FEATURE_ID:
        return getTarget().getByteArray().add((byte[]) value);

      case TypesModelPackage.MANYTYPES_BIGDECIMAL_FEATURE_ID:
        return getTarget().getBigDecimal().add((BigDecimal) value);

      case TypesModelPackage.MANYTYPES_BIGINTEGER_FEATURE_ID:
        return getTarget().getBigInteger().add((BigInteger) value);

      case TypesModelPackage.MANYTYPES_ENUM__FEATURE_ID:
        return getTarget().getEnum_().add((TestEnum) value);

      case TypesModelPackage.MANYTYPES_DATE_FEATURE_ID:
        return getTarget().getDate().add((Date) value);
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

      case TypesModelPackage.MANYTYPES_STRING_FEATURE_ID:
        return getTarget().getString().remove(value);

      case TypesModelPackage.MANYTYPES_INTEGEROBJECT_FEATURE_ID:
        return getTarget().getIntegerObject().remove(value);

      case TypesModelPackage.MANYTYPES_LONG__FEATURE_ID:
        return getTarget().getLong_().remove(value);

      case TypesModelPackage.MANYTYPES_DOUBLEOBJECT_FEATURE_ID:
        return getTarget().getDoubleObject().remove(value);

      case TypesModelPackage.MANYTYPES_FLOATOBJECT_FEATURE_ID:
        return getTarget().getFloatObject().remove(value);

      case TypesModelPackage.MANYTYPES_CLAZZ_FEATURE_ID:
        return getTarget().getClazz().remove(value);

      case TypesModelPackage.MANYTYPES_CHAROBJECT_FEATURE_ID:
        return getTarget().getCharObject().remove(value);

      case TypesModelPackage.MANYTYPES_BYTEOBJECT_FEATURE_ID:
        return getTarget().getByteObject().remove(value);

      case TypesModelPackage.MANYTYPES_BYTEARRAY_FEATURE_ID:
        return getTarget().getByteArray().remove(value);

      case TypesModelPackage.MANYTYPES_BIGDECIMAL_FEATURE_ID:
        return getTarget().getBigDecimal().remove(value);

      case TypesModelPackage.MANYTYPES_BIGINTEGER_FEATURE_ID:
        return getTarget().getBigInteger().remove(value);

      case TypesModelPackage.MANYTYPES_ENUM__FEATURE_ID:
        return getTarget().getEnum_().remove(value);

      case TypesModelPackage.MANYTYPES_DATE_FEATURE_ID:
        return getTarget().getDate().remove(value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SingleTypes</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SingleTypesModelObject<E extends SingleTypes> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return TypesModelPackage.INSTANCE.getSingleTypesEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return TypesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case TypesModelPackage.SINGLETYPES_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case TypesModelPackage.SINGLETYPES_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case TypesModelPackage.SINGLETYPES_STRING_FEATURE_ID:
        return getTarget().getString();
      case TypesModelPackage.SINGLETYPES_INTEGER_FEATURE_ID:
        return getTarget().getInteger();
      case TypesModelPackage.SINGLETYPES_INTEGEROBJECT_FEATURE_ID:
        return getTarget().getIntegerObject();
      case TypesModelPackage.SINGLETYPES_LONG__FEATURE_ID:
        return getTarget().getLong_();
      case TypesModelPackage.SINGLETYPES_LONGOBJECT_FEATURE_ID:
        return getTarget().getLongObject();
      case TypesModelPackage.SINGLETYPES_DOUBLE__FEATURE_ID:
        return getTarget().getDouble_();
      case TypesModelPackage.SINGLETYPES_DOUBLEOBJECT_FEATURE_ID:
        return getTarget().getDoubleObject();
      case TypesModelPackage.SINGLETYPES_FLOAT__FEATURE_ID:
        return getTarget().getFloat_();
      case TypesModelPackage.SINGLETYPES_FLOATOBJECT_FEATURE_ID:
        return getTarget().getFloatObject();
      case TypesModelPackage.SINGLETYPES_CLAZZ_FEATURE_ID:
        return getTarget().getClazz();
      case TypesModelPackage.SINGLETYPES_CHAR__FEATURE_ID:
        return getTarget().getChar_();
      case TypesModelPackage.SINGLETYPES_CHAROBJECT_FEATURE_ID:
        return getTarget().getCharObject();
      case TypesModelPackage.SINGLETYPES_BYTE__FEATURE_ID:
        return getTarget().getByte_();
      case TypesModelPackage.SINGLETYPES_BYTEOBJECT_FEATURE_ID:
        return getTarget().getByteObject();
      case TypesModelPackage.SINGLETYPES_BYTEARRAY_FEATURE_ID:
        return getTarget().getByteArray();
      case TypesModelPackage.SINGLETYPES_BIGDECIMAL_FEATURE_ID:
        return getTarget().getBigDecimal();
      case TypesModelPackage.SINGLETYPES_BIGINTEGER_FEATURE_ID:
        return getTarget().getBigInteger();
      case TypesModelPackage.SINGLETYPES_ENUM__FEATURE_ID:
        return getTarget().getEnum_();
      case TypesModelPackage.SINGLETYPES_DATE_FEATURE_ID:
        return getTarget().getDate();
      case TypesModelPackage.SINGLETYPES_STRINGARRAY_FEATURE_ID:
        return getTarget().getStringArray();
      case TypesModelPackage.SINGLETYPES_LONGARRAY_FEATURE_ID:
        return getTarget().getLongArray();
      case TypesModelPackage.SINGLETYPES_NEXTENUM_FEATURE_ID:
        return getTarget().getNextEnum();
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
      case TypesModelPackage.SINGLETYPES_STRING_FEATURE_ID:
        getTarget().setString((String) value);
        return;
      case TypesModelPackage.SINGLETYPES_INTEGER_FEATURE_ID:
        getTarget().setInteger((Integer) value);
        return;
      case TypesModelPackage.SINGLETYPES_INTEGEROBJECT_FEATURE_ID:
        getTarget().setIntegerObject((Integer) value);
        return;
      case TypesModelPackage.SINGLETYPES_LONG__FEATURE_ID:
        getTarget().setLong_((Long) value);
        return;
      case TypesModelPackage.SINGLETYPES_LONGOBJECT_FEATURE_ID:
        getTarget().setLongObject((Long) value);
        return;
      case TypesModelPackage.SINGLETYPES_DOUBLE__FEATURE_ID:
        getTarget().setDouble_((Double) value);
        return;
      case TypesModelPackage.SINGLETYPES_DOUBLEOBJECT_FEATURE_ID:
        getTarget().setDoubleObject((Double) value);
        return;
      case TypesModelPackage.SINGLETYPES_FLOAT__FEATURE_ID:
        getTarget().setFloat_((Float) value);
        return;
      case TypesModelPackage.SINGLETYPES_FLOATOBJECT_FEATURE_ID:
        getTarget().setFloatObject((Float) value);
        return;
      case TypesModelPackage.SINGLETYPES_CLAZZ_FEATURE_ID:
        getTarget().setClazz((Class<?>) value);
        return;
      case TypesModelPackage.SINGLETYPES_CHAR__FEATURE_ID:
        getTarget().setChar_((Character) value);
        return;
      case TypesModelPackage.SINGLETYPES_CHAROBJECT_FEATURE_ID:
        getTarget().setCharObject((Character) value);
        return;
      case TypesModelPackage.SINGLETYPES_BYTE__FEATURE_ID:
        getTarget().setByte_((Byte) value);
        return;
      case TypesModelPackage.SINGLETYPES_BYTEOBJECT_FEATURE_ID:
        getTarget().setByteObject((Byte) value);
        return;
      case TypesModelPackage.SINGLETYPES_BYTEARRAY_FEATURE_ID:
        getTarget().setByteArray((byte[]) value);
        return;
      case TypesModelPackage.SINGLETYPES_BIGDECIMAL_FEATURE_ID:
        getTarget().setBigDecimal((BigDecimal) value);
        return;
      case TypesModelPackage.SINGLETYPES_BIGINTEGER_FEATURE_ID:
        getTarget().setBigInteger((BigInteger) value);
        return;
      case TypesModelPackage.SINGLETYPES_ENUM__FEATURE_ID:
        getTarget().setEnum_((TestEnum) value);
        return;
      case TypesModelPackage.SINGLETYPES_DATE_FEATURE_ID:
        getTarget().setDate((Date) value);
        return;
      case TypesModelPackage.SINGLETYPES_STRINGARRAY_FEATURE_ID:
        getTarget().setStringArray((String[]) value);
        return;
      case TypesModelPackage.SINGLETYPES_LONGARRAY_FEATURE_ID:
        getTarget().setLongArray((long[]) value);
        return;
      case TypesModelPackage.SINGLETYPES_NEXTENUM_FEATURE_ID:
        getTarget().setNextEnum((TestNextEnum) value);
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
