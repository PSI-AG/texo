package org.eclipse.emf.texo.test.model.issues.bz325429_test;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Address</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "test_Address")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Address extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String street = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String city = null;

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
   * Sets the '{@link Address#getStreet() <em>street</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStreet
   *          the new value of the '{@link Address#getStreet() street}' feature.
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
   * Sets the '{@link Address#getCity() <em>city</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCity
   *          the new value of the '{@link Address#getCity() city}' feature.
   * @generated
   */
  public void setCity(String newCity) {
    city = newCity;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Address " + " [street: " + getStreet() + "]" + " [city: " + getCity() + "]";
  }
}
