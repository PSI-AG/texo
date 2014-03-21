package org.eclipse.emf.texo.test.model.samples.types;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>SingleTypes</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "types_SingleTypes")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class SingleTypes extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String string = "test\"test";

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private int integer = 100;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer integerObject = new Integer(100);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private long long_ = 200;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Long longObject = new Long(100);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private double double_ = 100.0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Double doubleObject = new Double(100.0);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private float float_ = 0.0f;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Float floatObject = new Float(10.0f);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Transient()
  private Class clazz = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private char char_ = 'z';

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Character charObject = new Character('z');

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private byte byte_ = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Byte byteObject = new Byte((byte) 5);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Lob()
  private byte[] byteArray = new byte[] {};

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(precision = 15, scale = 7)
  private BigDecimal bigDecimal = new BigDecimal("5");

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private BigInteger bigInteger = new BigInteger("5");

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Enumerated(EnumType.STRING)
  private TestEnum enum_ = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Temporal(TemporalType.DATE)
  private Date date = (Date) EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), null);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  private String[] stringArray = (String[]) TypesModelPackage.MODELFACTORY.createFromString(
      TypesModelPackage.INSTANCE.getStringArrayEDataType(), "abc::def");

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private long[] longArray = (long[]) TypesModelPackage.MODELFACTORY.createFromString(
      TypesModelPackage.INSTANCE.getLongArrayEDataType(), null);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Enumerated(EnumType.STRING)
  private TestNextEnum nextEnum = TestNextEnum.ENUM2;

  /**
   * Returns the value of '<em><b>string</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>string</b></em>' feature
   * @generated
   */
  public String getString() {
    return string;
  }

  /**
   * Sets the '{@link SingleTypes#getString() <em>string</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newString
   *          the new value of the '{@link SingleTypes#getString() string}' feature.
   * @generated
   */
  public void setString(String newString) {
    string = newString;
  }

  /**
   * Returns the value of '<em><b>integer</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>integer</b></em>' feature
   * @generated
   */
  public int getInteger() {
    return integer;
  }

  /**
   * Sets the '{@link SingleTypes#getInteger() <em>integer</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newInteger
   *          the new value of the '{@link SingleTypes#getInteger() integer}' feature.
   * @generated
   */
  public void setInteger(int newInteger) {
    integer = newInteger;
  }

  /**
   * Returns the value of '<em><b>integerObject</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>integerObject</b></em>' feature
   * @generated
   */
  public Integer getIntegerObject() {
    return integerObject;
  }

  /**
   * Sets the '{@link SingleTypes#getIntegerObject() <em>integerObject</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newIntegerObject
   *          the new value of the '{@link SingleTypes#getIntegerObject() integerObject}' feature.
   * @generated
   */
  public void setIntegerObject(Integer newIntegerObject) {
    integerObject = newIntegerObject;
  }

  /**
   * Returns the value of '<em><b>long</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>long</b></em>' feature
   * @generated
   */
  public long getLong_() {
    return long_;
  }

  /**
   * Sets the '{@link SingleTypes#getLong_() <em>long</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLong_
   *          the new value of the '{@link SingleTypes#getLong_() long}' feature.
   * @generated
   */
  public void setLong_(long newLong_) {
    long_ = newLong_;
  }

  /**
   * Returns the value of '<em><b>longObject</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>longObject</b></em>' feature
   * @generated
   */
  public Long getLongObject() {
    return longObject;
  }

  /**
   * Sets the '{@link SingleTypes#getLongObject() <em>longObject</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLongObject
   *          the new value of the '{@link SingleTypes#getLongObject() longObject}' feature.
   * @generated
   */
  public void setLongObject(Long newLongObject) {
    longObject = newLongObject;
  }

  /**
   * Returns the value of '<em><b>double</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>double</b></em>' feature
   * @generated
   */
  public double getDouble_() {
    return double_;
  }

  /**
   * Sets the '{@link SingleTypes#getDouble_() <em>double</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDouble_
   *          the new value of the '{@link SingleTypes#getDouble_() double}' feature.
   * @generated
   */
  public void setDouble_(double newDouble_) {
    double_ = newDouble_;
  }

  /**
   * Returns the value of '<em><b>doubleObject</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>doubleObject</b></em>' feature
   * @generated
   */
  public Double getDoubleObject() {
    return doubleObject;
  }

  /**
   * Sets the '{@link SingleTypes#getDoubleObject() <em>doubleObject</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDoubleObject
   *          the new value of the '{@link SingleTypes#getDoubleObject() doubleObject}' feature.
   * @generated
   */
  public void setDoubleObject(Double newDoubleObject) {
    doubleObject = newDoubleObject;
  }

  /**
   * Returns the value of '<em><b>float</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>float</b></em>' feature
   * @generated
   */
  public float getFloat_() {
    return float_;
  }

  /**
   * Sets the '{@link SingleTypes#getFloat_() <em>float</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFloat_
   *          the new value of the '{@link SingleTypes#getFloat_() float}' feature.
   * @generated
   */
  public void setFloat_(float newFloat_) {
    float_ = newFloat_;
  }

  /**
   * Returns the value of '<em><b>floatObject</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>floatObject</b></em>' feature
   * @generated
   */
  public Float getFloatObject() {
    return floatObject;
  }

  /**
   * Sets the '{@link SingleTypes#getFloatObject() <em>floatObject</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFloatObject
   *          the new value of the '{@link SingleTypes#getFloatObject() floatObject}' feature.
   * @generated
   */
  public void setFloatObject(Float newFloatObject) {
    floatObject = newFloatObject;
  }

  /**
   * Returns the value of '<em><b>clazz</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>clazz</b></em>' feature
   * @generated
   */
  public Class getClazz() {
    return clazz;
  }

  /**
   * Sets the '{@link SingleTypes#getClazz() <em>clazz</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newClazz
   *          the new value of the '{@link SingleTypes#getClazz() clazz}' feature.
   * @generated
   */
  public void setClazz(Class newClazz) {
    clazz = newClazz;
  }

  /**
   * Returns the value of '<em><b>char</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>char</b></em>' feature
   * @generated
   */
  public char getChar_() {
    return char_;
  }

  /**
   * Sets the '{@link SingleTypes#getChar_() <em>char</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newChar_
   *          the new value of the '{@link SingleTypes#getChar_() char}' feature.
   * @generated
   */
  public void setChar_(char newChar_) {
    char_ = newChar_;
  }

  /**
   * Returns the value of '<em><b>charObject</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>charObject</b></em>' feature
   * @generated
   */
  public Character getCharObject() {
    return charObject;
  }

  /**
   * Sets the '{@link SingleTypes#getCharObject() <em>charObject</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCharObject
   *          the new value of the '{@link SingleTypes#getCharObject() charObject}' feature.
   * @generated
   */
  public void setCharObject(Character newCharObject) {
    charObject = newCharObject;
  }

  /**
   * Returns the value of '<em><b>byte</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>byte</b></em>' feature
   * @generated
   */
  public byte getByte_() {
    return byte_;
  }

  /**
   * Sets the '{@link SingleTypes#getByte_() <em>byte</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newByte_
   *          the new value of the '{@link SingleTypes#getByte_() byte}' feature.
   * @generated
   */
  public void setByte_(byte newByte_) {
    byte_ = newByte_;
  }

  /**
   * Returns the value of '<em><b>byteObject</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>byteObject</b></em>' feature
   * @generated
   */
  public Byte getByteObject() {
    return byteObject;
  }

  /**
   * Sets the '{@link SingleTypes#getByteObject() <em>byteObject</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newByteObject
   *          the new value of the '{@link SingleTypes#getByteObject() byteObject}' feature.
   * @generated
   */
  public void setByteObject(Byte newByteObject) {
    byteObject = newByteObject;
  }

  /**
   * Returns the value of '<em><b>byteArray</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>byteArray</b></em>' feature
   * @generated
   */
  public byte[] getByteArray() {
    return byteArray;
  }

  /**
   * Sets the '{@link SingleTypes#getByteArray() <em>byteArray</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newByteArray
   *          the new value of the '{@link SingleTypes#getByteArray() byteArray}' feature.
   * @generated
   */
  public void setByteArray(byte[] newByteArray) {
    byteArray = newByteArray;
  }

  /**
   * Returns the value of '<em><b>bigDecimal</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>bigDecimal</b></em>' feature
   * @generated
   */
  public BigDecimal getBigDecimal() {
    return bigDecimal;
  }

  /**
   * Sets the '{@link SingleTypes#getBigDecimal() <em>bigDecimal</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBigDecimal
   *          the new value of the '{@link SingleTypes#getBigDecimal() bigDecimal}' feature.
   * @generated
   */
  public void setBigDecimal(BigDecimal newBigDecimal) {
    bigDecimal = newBigDecimal;
  }

  /**
   * Returns the value of '<em><b>bigInteger</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>bigInteger</b></em>' feature
   * @generated
   */
  public BigInteger getBigInteger() {
    return bigInteger;
  }

  /**
   * Sets the '{@link SingleTypes#getBigInteger() <em>bigInteger</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBigInteger
   *          the new value of the '{@link SingleTypes#getBigInteger() bigInteger}' feature.
   * @generated
   */
  public void setBigInteger(BigInteger newBigInteger) {
    bigInteger = newBigInteger;
  }

  /**
   * Returns the value of '<em><b>enum</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>enum</b></em>' feature
   * @generated
   */
  public TestEnum getEnum_() {
    return enum_;
  }

  /**
   * Sets the '{@link SingleTypes#getEnum_() <em>enum</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEnum_
   *          the new value of the '{@link SingleTypes#getEnum_() enum}' feature.
   * @generated
   */
  public void setEnum_(TestEnum newEnum_) {
    enum_ = newEnum_;
  }

  /**
   * Returns the value of '<em><b>date</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>date</b></em>' feature
   * @generated
   */
  public Date getDate() {
    return date;
  }

  /**
   * Sets the '{@link SingleTypes#getDate() <em>date</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDate
   *          the new value of the '{@link SingleTypes#getDate() date}' feature.
   * @generated
   */
  public void setDate(Date newDate) {
    date = newDate;
  }

  /**
   * Returns the value of '<em><b>stringArray</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>stringArray</b></em>' feature
   * @generated
   */
  public String[] getStringArray() {
    return stringArray;
  }

  /**
   * Sets the '{@link SingleTypes#getStringArray() <em>stringArray</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStringArray
   *          the new value of the '{@link SingleTypes#getStringArray() stringArray}' feature.
   * @generated
   */
  public void setStringArray(String[] newStringArray) {
    stringArray = newStringArray;
  }

  /**
   * Returns the value of '<em><b>longArray</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>longArray</b></em>' feature
   * @generated
   */
  public long[] getLongArray() {
    return longArray;
  }

  /**
   * Sets the '{@link SingleTypes#getLongArray() <em>longArray</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLongArray
   *          the new value of the '{@link SingleTypes#getLongArray() longArray}' feature.
   * @generated
   */
  public void setLongArray(long[] newLongArray) {
    longArray = newLongArray;
  }

  /**
   * Returns the value of '<em><b>nextEnum</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>nextEnum</b></em>' feature
   * @generated
   */
  public TestNextEnum getNextEnum() {
    return nextEnum;
  }

  /**
   * Sets the '{@link SingleTypes#getNextEnum() <em>nextEnum</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newNextEnum
   *          the new value of the '{@link SingleTypes#getNextEnum() nextEnum}' feature.
   * @generated
   */
  public void setNextEnum(TestNextEnum newNextEnum) {
    nextEnum = newNextEnum;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SingleTypes " + " [string: " + getString() + "]" + " [integer: " + getInteger() + "]" + " [integerObject: "
        + getIntegerObject() + "]" + " [long_: " + getLong_() + "]" + " [longObject: " + getLongObject() + "]"
        + " [double_: " + getDouble_() + "]" + " [doubleObject: " + getDoubleObject() + "]" + " [float_: "
        + getFloat_() + "]" + " [floatObject: " + getFloatObject() + "]" + " [clazz: " + getClazz() + "]" + " [char_: "
        + getChar_() + "]" + " [charObject: " + getCharObject() + "]" + " [byte_: " + getByte_() + "]"
        + " [byteObject: " + getByteObject() + "]" + " [byteArray: " + getByteArray() + "]" + " [bigDecimal: "
        + getBigDecimal() + "]" + " [bigInteger: " + getBigInteger() + "]" + " [enum_: " + getEnum_() + "]"
        + " [date: " + getDate() + "]" + " [stringArray: " + getStringArray() + "]" + " [longArray: " + getLongArray()
        + "]" + " [nextEnum: " + getNextEnum() + "]";
  }
}
