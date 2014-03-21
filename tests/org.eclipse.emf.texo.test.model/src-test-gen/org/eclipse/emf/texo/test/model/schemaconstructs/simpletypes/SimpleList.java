package org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.OrderColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>SimpleList</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "simpletypes_SimpleList")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class SimpleList extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String code = "c1";

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<Boolean> boo = new ArrayList<Boolean>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<Byte> byt = new ArrayList<Byte>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<Double> doubl = new ArrayList<Double>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<Float> floa = new ArrayList<Float>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<Integer> inte = new ArrayList<Integer>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<Long> long_ = new ArrayList<Long>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<Short> shor = new ArrayList<Short>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @Enumerated(EnumType.STRING)
  @CollectionTable()
  private List<SimpleEnum> enu = new ArrayList<SimpleEnum>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @Temporal(TemporalType.DATE)
  @CollectionTable()
  private List<Date> dat = new ArrayList<Date>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<String> limitedstring = new ArrayList<String>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @OrderColumn()
  @CollectionTable()
  private List<String> stri = new ArrayList<String>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int[] intArray = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private double[] doubleArray = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String[] stringArray = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Lob()
  private byte[] byteArray = null;

  /**
   * Returns the value of '<em><b>code</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>code</b></em>' feature
   * @generated
   */
  public String getCode() {
    return code;
  }

  /**
   * Sets the '{@link SimpleList#getCode() <em>code</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCode
   *          the new value of the '{@link SimpleList#getCode() code}' feature.
   * @generated
   */
  public void setCode(String newCode) {
    code = newCode;
  }

  /**
   * Returns the value of '<em><b>boo</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>boo</b></em>' feature
   * @generated
   */
  public List<Boolean> getBoo() {
    return boo;
  }

  /**
   * Sets the '{@link SimpleList#getBoo() <em>boo</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBoo
   *          the new value of the '{@link SimpleList#getBoo() boo}' feature.
   * @generated
   */
  public void setBoo(List<Boolean> newBoo) {
    boo = newBoo;
  }

  /**
   * Returns the value of '<em><b>byt</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>byt</b></em>' feature
   * @generated
   */
  public List<Byte> getByt() {
    return byt;
  }

  /**
   * Sets the '{@link SimpleList#getByt() <em>byt</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newByt
   *          the new value of the '{@link SimpleList#getByt() byt}' feature.
   * @generated
   */
  public void setByt(List<Byte> newByt) {
    byt = newByt;
  }

  /**
   * Returns the value of '<em><b>doubl</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>doubl</b></em>' feature
   * @generated
   */
  public List<Double> getDoubl() {
    return doubl;
  }

  /**
   * Sets the '{@link SimpleList#getDoubl() <em>doubl</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDoubl
   *          the new value of the '{@link SimpleList#getDoubl() doubl}' feature.
   * @generated
   */
  public void setDoubl(List<Double> newDoubl) {
    doubl = newDoubl;
  }

  /**
   * Returns the value of '<em><b>floa</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>floa</b></em>' feature
   * @generated
   */
  public List<Float> getFloa() {
    return floa;
  }

  /**
   * Sets the '{@link SimpleList#getFloa() <em>floa</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFloa
   *          the new value of the '{@link SimpleList#getFloa() floa}' feature.
   * @generated
   */
  public void setFloa(List<Float> newFloa) {
    floa = newFloa;
  }

  /**
   * Returns the value of '<em><b>inte</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>inte</b></em>' feature
   * @generated
   */
  public List<Integer> getInte() {
    return inte;
  }

  /**
   * Sets the '{@link SimpleList#getInte() <em>inte</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newInte
   *          the new value of the '{@link SimpleList#getInte() inte}' feature.
   * @generated
   */
  public void setInte(List<Integer> newInte) {
    inte = newInte;
  }

  /**
   * Returns the value of '<em><b>long</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>long</b></em>' feature
   * @generated
   */
  public List<Long> getLong_() {
    return long_;
  }

  /**
   * Sets the '{@link SimpleList#getLong_() <em>long</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLong_
   *          the new value of the '{@link SimpleList#getLong_() long}' feature.
   * @generated
   */
  public void setLong_(List<Long> newLong_) {
    long_ = newLong_;
  }

  /**
   * Returns the value of '<em><b>shor</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>shor</b></em>' feature
   * @generated
   */
  public List<Short> getShor() {
    return shor;
  }

  /**
   * Sets the '{@link SimpleList#getShor() <em>shor</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newShor
   *          the new value of the '{@link SimpleList#getShor() shor}' feature.
   * @generated
   */
  public void setShor(List<Short> newShor) {
    shor = newShor;
  }

  /**
   * Returns the value of '<em><b>enu</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>enu</b></em>' feature
   * @generated
   */
  public List<SimpleEnum> getEnu() {
    return enu;
  }

  /**
   * Sets the '{@link SimpleList#getEnu() <em>enu</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEnu
   *          the new value of the '{@link SimpleList#getEnu() enu}' feature.
   * @generated
   */
  public void setEnu(List<SimpleEnum> newEnu) {
    enu = newEnu;
  }

  /**
   * Returns the value of '<em><b>dat</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>dat</b></em>' feature
   * @generated
   */
  public List<Date> getDat() {
    return dat;
  }

  /**
   * Sets the '{@link SimpleList#getDat() <em>dat</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDat
   *          the new value of the '{@link SimpleList#getDat() dat}' feature.
   * @generated
   */
  public void setDat(List<Date> newDat) {
    dat = newDat;
  }

  /**
   * Returns the value of '<em><b>limitedstring</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>limitedstring</b></em>' feature
   * @generated
   */
  public List<String> getLimitedstring() {
    return limitedstring;
  }

  /**
   * Sets the '{@link SimpleList#getLimitedstring() <em>limitedstring</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLimitedstring
   *          the new value of the '{@link SimpleList#getLimitedstring() limitedstring}' feature.
   * @generated
   */
  public void setLimitedstring(List<String> newLimitedstring) {
    limitedstring = newLimitedstring;
  }

  /**
   * Returns the value of '<em><b>stri</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>stri</b></em>' feature
   * @generated
   */
  public List<String> getStri() {
    return stri;
  }

  /**
   * Sets the '{@link SimpleList#getStri() <em>stri</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStri
   *          the new value of the '{@link SimpleList#getStri() stri}' feature.
   * @generated
   */
  public void setStri(List<String> newStri) {
    stri = newStri;
  }

  /**
   * Returns the value of '<em><b>intArray</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>intArray</b></em>' feature
   * @generated
   */
  public int[] getIntArray() {
    return intArray;
  }

  /**
   * Sets the '{@link SimpleList#getIntArray() <em>intArray</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newIntArray
   *          the new value of the '{@link SimpleList#getIntArray() intArray}' feature.
   * @generated
   */
  public void setIntArray(int[] newIntArray) {
    intArray = newIntArray;
  }

  /**
   * Returns the value of '<em><b>doubleArray</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>doubleArray</b></em>' feature
   * @generated
   */
  public double[] getDoubleArray() {
    return doubleArray;
  }

  /**
   * Sets the '{@link SimpleList#getDoubleArray() <em>doubleArray</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDoubleArray
   *          the new value of the '{@link SimpleList#getDoubleArray() doubleArray}' feature.
   * @generated
   */
  public void setDoubleArray(double[] newDoubleArray) {
    doubleArray = newDoubleArray;
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
   * Sets the '{@link SimpleList#getStringArray() <em>stringArray</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStringArray
   *          the new value of the '{@link SimpleList#getStringArray() stringArray}' feature.
   * @generated
   */
  public void setStringArray(String[] newStringArray) {
    stringArray = newStringArray;
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
   * Sets the '{@link SimpleList#getByteArray() <em>byteArray</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newByteArray
   *          the new value of the '{@link SimpleList#getByteArray() byteArray}' feature.
   * @generated
   */
  public void setByteArray(byte[] newByteArray) {
    byteArray = newByteArray;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SimpleList " + " [code: " + getCode() + "]" + " [intArray: " + getIntArray() + "]" + " [doubleArray: "
        + getDoubleArray() + "]" + " [stringArray: " + getStringArray() + "]" + " [byteArray: " + getByteArray() + "]";
  }
}
