package org.eclipse.emf.texo.test.model.issues.bz331009;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Address</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> Адрес <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_Address")
@Table(name = "m_Address")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Address extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Индекс <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "zipCode")
  private String zipCode = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Страна <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "country")
  private String country = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Область <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "region")
  private String region = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Город <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "city")
  private String city = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Улица <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "street")
  private String street = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Дом <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "building")
  private String building = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Квартира <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "flat")
  private String flat = null;

  /**
   * Returns the value of '<em><b>zipCode</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Индекс <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>zipCode</b></em>' feature
   * @generated
   */
  public String getZipCode() {
    return zipCode;
  }

  /**
   * Sets the '{@link Address#getZipCode() <em>zipCode</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Индекс <!-- end-model-doc -->
   * 
   * @param newZipCode
   *          the new value of the '{@link Address#getZipCode() zipCode}' feature.
   * @generated
   */
  public void setZipCode(String newZipCode) {
    zipCode = newZipCode;
  }

  /**
   * Returns the value of '<em><b>country</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Страна <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>country</b></em>' feature
   * @generated
   */
  public String getCountry() {
    return country;
  }

  /**
   * Sets the '{@link Address#getCountry() <em>country</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Страна <!-- end-model-doc -->
   * 
   * @param newCountry
   *          the new value of the '{@link Address#getCountry() country}' feature.
   * @generated
   */
  public void setCountry(String newCountry) {
    country = newCountry;
  }

  /**
   * Returns the value of '<em><b>region</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Область <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>region</b></em>' feature
   * @generated
   */
  public String getRegion() {
    return region;
  }

  /**
   * Sets the '{@link Address#getRegion() <em>region</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Область <!-- end-model-doc -->
   * 
   * @param newRegion
   *          the new value of the '{@link Address#getRegion() region}' feature.
   * @generated
   */
  public void setRegion(String newRegion) {
    region = newRegion;
  }

  /**
   * Returns the value of '<em><b>city</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Город <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>city</b></em>' feature
   * @generated
   */
  public String getCity() {
    return city;
  }

  /**
   * Sets the '{@link Address#getCity() <em>city</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Город <!-- end-model-doc -->
   * 
   * @param newCity
   *          the new value of the '{@link Address#getCity() city}' feature.
   * @generated
   */
  public void setCity(String newCity) {
    city = newCity;
  }

  /**
   * Returns the value of '<em><b>street</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Улица <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>street</b></em>' feature
   * @generated
   */
  public String getStreet() {
    return street;
  }

  /**
   * Sets the '{@link Address#getStreet() <em>street</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Улица <!-- end-model-doc -->
   * 
   * @param newStreet
   *          the new value of the '{@link Address#getStreet() street}' feature.
   * @generated
   */
  public void setStreet(String newStreet) {
    street = newStreet;
  }

  /**
   * Returns the value of '<em><b>building</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Дом <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>building</b></em>' feature
   * @generated
   */
  public String getBuilding() {
    return building;
  }

  /**
   * Sets the '{@link Address#getBuilding() <em>building</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Дом <!-- end-model-doc -->
   * 
   * @param newBuilding
   *          the new value of the '{@link Address#getBuilding() building}' feature.
   * @generated
   */
  public void setBuilding(String newBuilding) {
    building = newBuilding;
  }

  /**
   * Returns the value of '<em><b>flat</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Квартира <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>flat</b></em>' feature
   * @generated
   */
  public String getFlat() {
    return flat;
  }

  /**
   * Sets the '{@link Address#getFlat() <em>flat</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Квартира <!-- end-model-doc -->
   * 
   * @param newFlat
   *          the new value of the '{@link Address#getFlat() flat}' feature.
   * @generated
   */
  public void setFlat(String newFlat) {
    flat = newFlat;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Address " + " [zipCode: " + getZipCode() + "]" + " [country: " + getCountry() + "]" + " [region: "
        + getRegion() + "]" + " [city: " + getCity() + "]" + " [street: " + getStreet() + "]" + " [building: "
        + getBuilding() + "]" + " [flat: " + getFlat() + "]";
  }
}
