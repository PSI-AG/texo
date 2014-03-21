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
 * A representation of the model object '<em><b>SimCard</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> Информация о сим-карте <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_SimCard")
@Table(name = "m_SimCard")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class SimCard extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Телефонный номер сим-карты <!--
   * end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "phoneNumber")
  private String phoneNumber = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "T_number")
  private String number = null;

  /**
   * Returns the value of '<em><b>phoneNumber</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Телефонный номер сим-карты <!--
   * end-model-doc -->
   * 
   * @return the value of '<em><b>phoneNumber</b></em>' feature
   * @generated
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Sets the '{@link SimCard#getPhoneNumber() <em>phoneNumber</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Телефонный номер сим-карты <!--
   * end-model-doc -->
   * 
   * @param newPhoneNumber
   *          the new value of the '{@link SimCard#getPhoneNumber() phoneNumber}' feature.
   * @generated
   */
  public void setPhoneNumber(String newPhoneNumber) {
    phoneNumber = newPhoneNumber;
  }

  /**
   * Returns the value of '<em><b>number</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>number</b></em>' feature
   * @generated
   */
  public String getNumber() {
    return number;
  }

  /**
   * Sets the '{@link SimCard#getNumber() <em>number</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newNumber
   *          the new value of the '{@link SimCard#getNumber() number}' feature.
   * @generated
   */
  public void setNumber(String newNumber) {
    number = newNumber;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SimCard " + " [phoneNumber: " + getPhoneNumber() + "]" + " [number: " + getNumber() + "]";
  }
}
