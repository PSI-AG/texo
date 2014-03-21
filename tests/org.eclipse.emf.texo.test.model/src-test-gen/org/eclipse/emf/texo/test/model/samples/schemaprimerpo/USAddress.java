package org.eclipse.emf.texo.test.model.samples.schemaprimerpo;

import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>USAddress</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "schemaprimerpo_USAddress")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class USAddress extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String street = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String city = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String state = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Column(precision = 15, scale = 7)
  private BigDecimal zip = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String country = "US";

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link USAddress#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link USAddress#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>street</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>street</b></em>' feature
   * @generated
   */
  public String getStreet() {
    return street;
  }

  /**
   * Sets the '{@link USAddress#getStreet() <em>street</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStreet
   *          the new value of the '{@link USAddress#getStreet() street}' feature.
   * @generated
   */
  public void setStreet(String newStreet) {
    street = newStreet;
  }

  /**
   * Returns the value of '<em><b>city</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>city</b></em>' feature
   * @generated
   */
  public String getCity() {
    return city;
  }

  /**
   * Sets the '{@link USAddress#getCity() <em>city</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCity
   *          the new value of the '{@link USAddress#getCity() city}' feature.
   * @generated
   */
  public void setCity(String newCity) {
    city = newCity;
  }

  /**
   * Returns the value of '<em><b>state</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>state</b></em>' feature
   * @generated
   */
  public String getState() {
    return state;
  }

  /**
   * Sets the '{@link USAddress#getState() <em>state</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newState
   *          the new value of the '{@link USAddress#getState() state}' feature.
   * @generated
   */
  public void setState(String newState) {
    state = newState;
  }

  /**
   * Returns the value of '<em><b>zip</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>zip</b></em>' feature
   * @generated
   */
  public BigDecimal getZip() {
    return zip;
  }

  /**
   * Sets the '{@link USAddress#getZip() <em>zip</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newZip
   *          the new value of the '{@link USAddress#getZip() zip}' feature.
   * @generated
   */
  public void setZip(BigDecimal newZip) {
    zip = newZip;
  }

  /**
   * Returns the value of '<em><b>country</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>country</b></em>' feature
   * @generated
   */
  public String getCountry() {
    return country;
  }

  /**
   * Sets the '{@link USAddress#getCountry() <em>country</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCountry
   *          the new value of the '{@link USAddress#getCountry() country}' feature.
   * @generated
   */
  public void setCountry(String newCountry) {
    country = newCountry;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "USAddress " + " [name: " + getName() + "]" + " [street: " + getStreet() + "]" + " [city: " + getCity()
        + "]" + " [state: " + getState() + "]" + " [zip: " + getZip() + "]" + " [country: " + getCountry() + "]";
  }
}
