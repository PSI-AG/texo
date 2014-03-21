package org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs;

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
 * A representation of the model object '<em><b>NameList</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "ecoreattrs_NameList")
@Table(name = "ecoreattrs_NameList")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class NameList extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Column(name = "firstName")
  private String firstName = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Column(name = "middleName")
  private String middleName = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Column(name = "lastName")
  private String lastName = null;

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
   * Sets the '{@link NameList#getFirstName() <em>firstName</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFirstName
   *          the new value of the '{@link NameList#getFirstName() firstName}' feature.
   * @generated
   */
  public void setFirstName(String newFirstName) {
    firstName = newFirstName;
  }

  /**
   * Returns the value of '<em><b>middleName</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>middleName</b></em>' feature
   * @generated
   */
  public String getMiddleName() {
    return middleName;
  }

  /**
   * Sets the '{@link NameList#getMiddleName() <em>middleName</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMiddleName
   *          the new value of the '{@link NameList#getMiddleName() middleName}' feature.
   * @generated
   */
  public void setMiddleName(String newMiddleName) {
    middleName = newMiddleName;
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
   * Sets the '{@link NameList#getLastName() <em>lastName</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLastName
   *          the new value of the '{@link NameList#getLastName() lastName}' feature.
   * @generated
   */
  public void setLastName(String newLastName) {
    lastName = newLastName;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "NameList " + " [firstName: " + getFirstName() + "]" + " [middleName: " + getMiddleName() + "]"
        + " [lastName: " + getLastName() + "]";
  }
}
