package org.eclipse.emf.texo.test.model.samples.types;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.OrderColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ManyTypes</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "types_ManyTypes")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ManyTypes extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<String> string = new ArrayList<String>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<Integer> integerObject = new ArrayList<Integer>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @CollectionTable()
  private Set<Long> long_ = new HashSet<Long>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @CollectionTable()
  private Set<Double> doubleObject = new HashSet<Double>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<Float> floatObject = new ArrayList<Float>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Transient()
  private Set<Class<?>> clazz = new HashSet<Class<?>>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<Character> charObject = new ArrayList<Character>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<Byte> byteObject = new ArrayList<Byte>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @Lob()
  @CollectionTable()
  private List<byte[]> byteArray = new ArrayList<byte[]>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @Column(precision = 15, scale = 7)
  @CollectionTable()
  private List<BigDecimal> bigDecimal = new ArrayList<BigDecimal>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @CollectionTable()
  private Set<BigInteger> bigInteger = new HashSet<BigInteger>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @Enumerated(EnumType.STRING)
  @CollectionTable()
  private List<TestEnum> enum_ = new ArrayList<TestEnum>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @Temporal(TemporalType.DATE)
  @CollectionTable()
  private Set<Date> date = new HashSet<Date>();

  /**
   * Returns the value of '<em><b>string</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>string</b></em>' feature
   * @generated
   */
  public List<String> getString() {
    return string;
  }

  /**
   * Sets the '{@link ManyTypes#getString() <em>string</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newString
   *          the new value of the '{@link ManyTypes#getString() string}' feature.
   * @generated
   */
  public void setString(List<String> newString) {
    string = newString;
  }

  /**
   * Returns the value of '<em><b>integerObject</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>integerObject</b></em>' feature
   * @generated
   */
  public List<Integer> getIntegerObject() {
    return integerObject;
  }

  /**
   * Sets the '{@link ManyTypes#getIntegerObject() <em>integerObject</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newIntegerObject
   *          the new value of the '{@link ManyTypes#getIntegerObject() integerObject}' feature.
   * @generated
   */
  public void setIntegerObject(List<Integer> newIntegerObject) {
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
  public Set<Long> getLong_() {
    return long_;
  }

  /**
   * Sets the '{@link ManyTypes#getLong_() <em>long</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLong_
   *          the new value of the '{@link ManyTypes#getLong_() long}' feature.
   * @generated
   */
  public void setLong_(Set<Long> newLong_) {
    long_ = newLong_;
  }

  /**
   * Returns the value of '<em><b>doubleObject</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>doubleObject</b></em>' feature
   * @generated
   */
  public Set<Double> getDoubleObject() {
    return doubleObject;
  }

  /**
   * Sets the '{@link ManyTypes#getDoubleObject() <em>doubleObject</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDoubleObject
   *          the new value of the '{@link ManyTypes#getDoubleObject() doubleObject}' feature.
   * @generated
   */
  public void setDoubleObject(Set<Double> newDoubleObject) {
    doubleObject = newDoubleObject;
  }

  /**
   * Returns the value of '<em><b>floatObject</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>floatObject</b></em>' feature
   * @generated
   */
  public List<Float> getFloatObject() {
    return floatObject;
  }

  /**
   * Sets the '{@link ManyTypes#getFloatObject() <em>floatObject</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFloatObject
   *          the new value of the '{@link ManyTypes#getFloatObject() floatObject}' feature.
   * @generated
   */
  public void setFloatObject(List<Float> newFloatObject) {
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
  public Set<Class<?>> getClazz() {
    return clazz;
  }

  /**
   * Sets the '{@link ManyTypes#getClazz() <em>clazz</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newClazz
   *          the new value of the '{@link ManyTypes#getClazz() clazz}' feature.
   * @generated
   */
  public void setClazz(Set<Class<?>> newClazz) {
    clazz = newClazz;
  }

  /**
   * Returns the value of '<em><b>charObject</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>charObject</b></em>' feature
   * @generated
   */
  public List<Character> getCharObject() {
    return charObject;
  }

  /**
   * Sets the '{@link ManyTypes#getCharObject() <em>charObject</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCharObject
   *          the new value of the '{@link ManyTypes#getCharObject() charObject}' feature.
   * @generated
   */
  public void setCharObject(List<Character> newCharObject) {
    charObject = newCharObject;
  }

  /**
   * Returns the value of '<em><b>byteObject</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>byteObject</b></em>' feature
   * @generated
   */
  public List<Byte> getByteObject() {
    return byteObject;
  }

  /**
   * Sets the '{@link ManyTypes#getByteObject() <em>byteObject</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newByteObject
   *          the new value of the '{@link ManyTypes#getByteObject() byteObject}' feature.
   * @generated
   */
  public void setByteObject(List<Byte> newByteObject) {
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
  public List<byte[]> getByteArray() {
    return byteArray;
  }

  /**
   * Sets the '{@link ManyTypes#getByteArray() <em>byteArray</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newByteArray
   *          the new value of the '{@link ManyTypes#getByteArray() byteArray}' feature.
   * @generated
   */
  public void setByteArray(List<byte[]> newByteArray) {
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
  public List<BigDecimal> getBigDecimal() {
    return bigDecimal;
  }

  /**
   * Sets the '{@link ManyTypes#getBigDecimal() <em>bigDecimal</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBigDecimal
   *          the new value of the '{@link ManyTypes#getBigDecimal() bigDecimal}' feature.
   * @generated
   */
  public void setBigDecimal(List<BigDecimal> newBigDecimal) {
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
  public Set<BigInteger> getBigInteger() {
    return bigInteger;
  }

  /**
   * Sets the '{@link ManyTypes#getBigInteger() <em>bigInteger</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBigInteger
   *          the new value of the '{@link ManyTypes#getBigInteger() bigInteger}' feature.
   * @generated
   */
  public void setBigInteger(Set<BigInteger> newBigInteger) {
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
  public List<TestEnum> getEnum_() {
    return enum_;
  }

  /**
   * Sets the '{@link ManyTypes#getEnum_() <em>enum</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEnum_
   *          the new value of the '{@link ManyTypes#getEnum_() enum}' feature.
   * @generated
   */
  public void setEnum_(List<TestEnum> newEnum_) {
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
  public Set<Date> getDate() {
    return date;
  }

  /**
   * Sets the '{@link ManyTypes#getDate() <em>date</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDate
   *          the new value of the '{@link ManyTypes#getDate() date}' feature.
   * @generated
   */
  public void setDate(Set<Date> newDate) {
    date = newDate;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ManyTypes ";
  }
}
