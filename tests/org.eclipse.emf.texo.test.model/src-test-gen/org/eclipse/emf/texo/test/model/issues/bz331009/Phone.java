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
 * A representation of the model object '<em><b>Phone</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> Телефон <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_Phone")
@Table(name = "m_Phone")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Phone extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер телефона <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "T_number")
  private String number = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Пояснение <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "description")
  private String description = null;

  /**
   * Returns the value of '<em><b>number</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер телефона <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>number</b></em>' feature
   * @generated
   */
  public String getNumber() {
    return number;
  }

  /**
   * Sets the '{@link Phone#getNumber() <em>number</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер телефона <!-- end-model-doc -->
   * 
   * @param newNumber
   *          the new value of the '{@link Phone#getNumber() number}' feature.
   * @generated
   */
  public void setNumber(String newNumber) {
    number = newNumber;
  }

  /**
   * Returns the value of '<em><b>description</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Пояснение <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>description</b></em>' feature
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the '{@link Phone#getDescription() <em>description</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Пояснение <!-- end-model-doc -->
   * 
   * @param newDescription
   *          the new value of the '{@link Phone#getDescription() description}' feature.
   * @generated
   */
  public void setDescription(String newDescription) {
    description = newDescription;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Phone " + " [number: " + getNumber() + "]" + " [description: " + getDescription() + "]";
  }
}
