package org.eclipse.emf.texo.test.model.samples.extlibrary;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Person</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "extlib_Person")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Person extends Identifiable implements Addressable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String firstName = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String lastName = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String address = null;

  /**
   * Returns the value of '<em><b>firstName</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>firstName</b></em>' feature
   * @generated
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets the '{@link Person#getFirstName() <em>firstName</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFirstName
   *          the new value of the '{@link Person#getFirstName() firstName}' feature.
   * @generated
   */
  public void setFirstName(String newFirstName) {
    firstName = newFirstName;
  }

  /**
   * Returns the value of '<em><b>lastName</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>lastName</b></em>' feature
   * @generated
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Sets the '{@link Person#getLastName() <em>lastName</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLastName
   *          the new value of the '{@link Person#getLastName() lastName}' feature.
   * @generated
   */
  public void setLastName(String newLastName) {
    lastName = newLastName;
  }

  /**
   * Returns the value of '<em><b>address</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>address</b></em>' feature
   * @generated
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the '{@link Person#getAddress() <em>address</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAddress
   *          the new value of the '{@link Person#getAddress() address}' feature.
   * @generated
   */
  public void setAddress(String newAddress) {
    address = newAddress;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Person " + " [firstName: " + getFirstName() + "]" + " [lastName: " + getLastName() + "]" + " [address: "
        + getAddress() + "]";
  }
}
