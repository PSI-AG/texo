package org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>SimpleTypeObject</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "simpletypes_SimpleTypeObject")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class SimpleTypeObject extends Identifiable {

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
  @Basic(optional = false)
  private Boolean boo = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private Byte byt = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private Double doubl = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private Float float_ = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private Integer inte = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private Long lon = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private Short shor = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private SimpleEnum enu = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Temporal(TemporalType.DATE)
  private Date dat = null;

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
   * Sets the '{@link SimpleTypeObject#getCode() <em>code</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCode
   *          the new value of the '{@link SimpleTypeObject#getCode() code}' feature.
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
  public Boolean getBoo() {
    return boo;
  }

  /**
   * Sets the '{@link SimpleTypeObject#getBoo() <em>boo</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBoo
   *          the new value of the '{@link SimpleTypeObject#getBoo() boo}' feature.
   * @generated
   */
  public void setBoo(Boolean newBoo) {
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
  public Byte getByt() {
    return byt;
  }

  /**
   * Sets the '{@link SimpleTypeObject#getByt() <em>byt</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newByt
   *          the new value of the '{@link SimpleTypeObject#getByt() byt}' feature.
   * @generated
   */
  public void setByt(Byte newByt) {
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
  public Double getDoubl() {
    return doubl;
  }

  /**
   * Sets the '{@link SimpleTypeObject#getDoubl() <em>doubl</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDoubl
   *          the new value of the '{@link SimpleTypeObject#getDoubl() doubl}' feature.
   * @generated
   */
  public void setDoubl(Double newDoubl) {
    doubl = newDoubl;
  }

  /**
   * Returns the value of '<em><b>float</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>float</b></em>' feature
   * @generated
   */
  public Float getFloat_() {
    return float_;
  }

  /**
   * Sets the '{@link SimpleTypeObject#getFloat_() <em>float</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFloat_
   *          the new value of the '{@link SimpleTypeObject#getFloat_() float}' feature.
   * @generated
   */
  public void setFloat_(Float newFloat_) {
    float_ = newFloat_;
  }

  /**
   * Returns the value of '<em><b>inte</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>inte</b></em>' feature
   * @generated
   */
  public Integer getInte() {
    return inte;
  }

  /**
   * Sets the '{@link SimpleTypeObject#getInte() <em>inte</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newInte
   *          the new value of the '{@link SimpleTypeObject#getInte() inte}' feature.
   * @generated
   */
  public void setInte(Integer newInte) {
    inte = newInte;
  }

  /**
   * Returns the value of '<em><b>lon</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>lon</b></em>' feature
   * @generated
   */
  public Long getLon() {
    return lon;
  }

  /**
   * Sets the '{@link SimpleTypeObject#getLon() <em>lon</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLon
   *          the new value of the '{@link SimpleTypeObject#getLon() lon}' feature.
   * @generated
   */
  public void setLon(Long newLon) {
    lon = newLon;
  }

  /**
   * Returns the value of '<em><b>shor</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>shor</b></em>' feature
   * @generated
   */
  public Short getShor() {
    return shor;
  }

  /**
   * Sets the '{@link SimpleTypeObject#getShor() <em>shor</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newShor
   *          the new value of the '{@link SimpleTypeObject#getShor() shor}' feature.
   * @generated
   */
  public void setShor(Short newShor) {
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
  public SimpleEnum getEnu() {
    return enu;
  }

  /**
   * Sets the '{@link SimpleTypeObject#getEnu() <em>enu</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEnu
   *          the new value of the '{@link SimpleTypeObject#getEnu() enu}' feature.
   * @generated
   */
  public void setEnu(SimpleEnum newEnu) {
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
  public Date getDat() {
    return dat;
  }

  /**
   * Sets the '{@link SimpleTypeObject#getDat() <em>dat</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDat
   *          the new value of the '{@link SimpleTypeObject#getDat() dat}' feature.
   * @generated
   */
  public void setDat(Date newDat) {
    dat = newDat;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SimpleTypeObject " + " [code: " + getCode() + "]" + " [boo: " + getBoo() + "]" + " [byt: " + getByt() + "]"
        + " [doubl: " + getDoubl() + "]" + " [float_: " + getFloat_() + "]" + " [inte: " + getInte() + "]" + " [lon: "
        + getLon() + "]" + " [shor: " + getShor() + "]" + " [enu: " + getEnu() + "]" + " [dat: " + getDat() + "]";
  }
}
