package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>CarRegInfo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> Свидетельство о регистрации <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_CarRegInfo")
@Table(name = "m_CarRegInfo")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class CarRegInfo extends Identifiable implements Document {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_CarRegInfo_owner") })
  private Person owner = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Регистрационный знак <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "regNumber")
  private String regNumber = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Идентификационный номер (VIN) <!--
   * end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "vin")
  private String vin = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Год выпуска <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "releaseYear")
  @Temporal(TemporalType.DATE)
  private Date releaseYear = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер двигателя <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "engineNumber")
  private String engineNumber = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер шасси <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "chassisNumber")
  private String chassisNumber = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер кузова <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "bodyNumber")
  private String bodyNumber = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Цвет <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "color")
  private String color = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Серия <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "series")
  private String series = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "T_number")
  private String number = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Дата выдачи <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "issueDate")
  private String issueDate = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Кем выдан <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "issued")
  private String issued = null;

  /**
   * Returns the value of '<em><b>owner</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>owner</b></em>' feature
   * @generated
   */
  public Person getOwner() {
    return owner;
  }

  /**
   * Sets the '{@link CarRegInfo#getOwner() <em>owner</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newOwner
   *          the new value of the '{@link CarRegInfo#getOwner() owner}' feature.
   * @generated
   */
  public void setOwner(Person newOwner) {
    owner = newOwner;
  }

  /**
   * Returns the value of '<em><b>regNumber</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Регистрационный знак <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>regNumber</b></em>' feature
   * @generated
   */
  public String getRegNumber() {
    return regNumber;
  }

  /**
   * Sets the '{@link CarRegInfo#getRegNumber() <em>regNumber</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Регистрационный знак <!-- end-model-doc -->
   * 
   * @param newRegNumber
   *          the new value of the '{@link CarRegInfo#getRegNumber() regNumber}' feature.
   * @generated
   */
  public void setRegNumber(String newRegNumber) {
    regNumber = newRegNumber;
  }

  /**
   * Returns the value of '<em><b>vin</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Идентификационный номер (VIN) <!--
   * end-model-doc -->
   * 
   * @return the value of '<em><b>vin</b></em>' feature
   * @generated
   */
  public String getVin() {
    return vin;
  }

  /**
   * Sets the '{@link CarRegInfo#getVin() <em>vin</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Идентификационный номер (VIN) <!--
   * end-model-doc -->
   * 
   * @param newVin
   *          the new value of the '{@link CarRegInfo#getVin() vin}' feature.
   * @generated
   */
  public void setVin(String newVin) {
    vin = newVin;
  }

  /**
   * Returns the value of '<em><b>releaseYear</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Год выпуска <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>releaseYear</b></em>' feature
   * @generated
   */
  public Date getReleaseYear() {
    return releaseYear;
  }

  /**
   * Sets the '{@link CarRegInfo#getReleaseYear() <em>releaseYear</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Год выпуска <!-- end-model-doc -->
   * 
   * @param newReleaseYear
   *          the new value of the '{@link CarRegInfo#getReleaseYear() releaseYear}' feature.
   * @generated
   */
  public void setReleaseYear(Date newReleaseYear) {
    releaseYear = newReleaseYear;
  }

  /**
   * Returns the value of '<em><b>engineNumber</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер двигателя <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>engineNumber</b></em>' feature
   * @generated
   */
  public String getEngineNumber() {
    return engineNumber;
  }

  /**
   * Sets the '{@link CarRegInfo#getEngineNumber() <em>engineNumber</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер двигателя <!-- end-model-doc -->
   * 
   * @param newEngineNumber
   *          the new value of the '{@link CarRegInfo#getEngineNumber() engineNumber}' feature.
   * @generated
   */
  public void setEngineNumber(String newEngineNumber) {
    engineNumber = newEngineNumber;
  }

  /**
   * Returns the value of '<em><b>chassisNumber</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер шасси <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>chassisNumber</b></em>' feature
   * @generated
   */
  public String getChassisNumber() {
    return chassisNumber;
  }

  /**
   * Sets the '{@link CarRegInfo#getChassisNumber() <em>chassisNumber</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер шасси <!-- end-model-doc -->
   * 
   * @param newChassisNumber
   *          the new value of the '{@link CarRegInfo#getChassisNumber() chassisNumber}' feature.
   * @generated
   */
  public void setChassisNumber(String newChassisNumber) {
    chassisNumber = newChassisNumber;
  }

  /**
   * Returns the value of '<em><b>bodyNumber</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер кузова <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>bodyNumber</b></em>' feature
   * @generated
   */
  public String getBodyNumber() {
    return bodyNumber;
  }

  /**
   * Sets the '{@link CarRegInfo#getBodyNumber() <em>bodyNumber</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер кузова <!-- end-model-doc -->
   * 
   * @param newBodyNumber
   *          the new value of the '{@link CarRegInfo#getBodyNumber() bodyNumber}' feature.
   * @generated
   */
  public void setBodyNumber(String newBodyNumber) {
    bodyNumber = newBodyNumber;
  }

  /**
   * Returns the value of '<em><b>color</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Цвет <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>color</b></em>' feature
   * @generated
   */
  public String getColor() {
    return color;
  }

  /**
   * Sets the '{@link CarRegInfo#getColor() <em>color</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Цвет <!-- end-model-doc -->
   * 
   * @param newColor
   *          the new value of the '{@link CarRegInfo#getColor() color}' feature.
   * @generated
   */
  public void setColor(String newColor) {
    color = newColor;
  }

  /**
   * Returns the value of '<em><b>series</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Серия <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>series</b></em>' feature
   * @generated
   */
  public String getSeries() {
    return series;
  }

  /**
   * Sets the '{@link CarRegInfo#getSeries() <em>series</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Серия <!-- end-model-doc -->
   * 
   * @param newSeries
   *          the new value of the '{@link CarRegInfo#getSeries() series}' feature.
   * @generated
   */
  public void setSeries(String newSeries) {
    series = newSeries;
  }

  /**
   * Returns the value of '<em><b>number</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>number</b></em>' feature
   * @generated
   */
  public String getNumber() {
    return number;
  }

  /**
   * Sets the '{@link CarRegInfo#getNumber() <em>number</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер <!-- end-model-doc -->
   * 
   * @param newNumber
   *          the new value of the '{@link CarRegInfo#getNumber() number}' feature.
   * @generated
   */
  public void setNumber(String newNumber) {
    number = newNumber;
  }

  /**
   * Returns the value of '<em><b>issueDate</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Дата выдачи <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>issueDate</b></em>' feature
   * @generated
   */
  public String getIssueDate() {
    return issueDate;
  }

  /**
   * Sets the '{@link CarRegInfo#getIssueDate() <em>issueDate</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Дата выдачи <!-- end-model-doc -->
   * 
   * @param newIssueDate
   *          the new value of the '{@link CarRegInfo#getIssueDate() issueDate}' feature.
   * @generated
   */
  public void setIssueDate(String newIssueDate) {
    issueDate = newIssueDate;
  }

  /**
   * Returns the value of '<em><b>issued</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Кем выдан <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>issued</b></em>' feature
   * @generated
   */
  public String getIssued() {
    return issued;
  }

  /**
   * Sets the '{@link CarRegInfo#getIssued() <em>issued</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Кем выдан <!-- end-model-doc -->
   * 
   * @param newIssued
   *          the new value of the '{@link CarRegInfo#getIssued() issued}' feature.
   * @generated
   */
  public void setIssued(String newIssued) {
    issued = newIssued;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "CarRegInfo " + " [regNumber: " + getRegNumber() + "]" + " [vin: " + getVin() + "]" + " [releaseYear: "
        + getReleaseYear() + "]" + " [engineNumber: " + getEngineNumber() + "]" + " [chassisNumber: "
        + getChassisNumber() + "]" + " [bodyNumber: " + getBodyNumber() + "]" + " [color: " + getColor() + "]"
        + " [series: " + getSeries() + "]" + " [number: " + getNumber() + "]" + " [issueDate: " + getIssueDate() + "]"
        + " [issued: " + getIssued() + "]";
  }
}
