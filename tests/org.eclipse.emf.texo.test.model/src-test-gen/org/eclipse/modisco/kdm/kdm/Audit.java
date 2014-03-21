package org.eclipse.modisco.kdm.kdm;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.core.Element;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Audit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "kdm_Audit")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Audit extends Element {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String description = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String author = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String date = null;

  /**
   * Returns the value of '<em><b>description</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>description</b></em>' feature
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the '{@link Audit#getDescription() <em>description</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDescription
   *          the new value of the '{@link Audit#getDescription() description}' feature.
   * @generated
   */
  public void setDescription(String newDescription) {
    description = newDescription;
  }

  /**
   * Returns the value of '<em><b>author</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>author</b></em>' feature
   * @generated
   */
  public String getAuthor() {
    return author;
  }

  /**
   * Sets the '{@link Audit#getAuthor() <em>author</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAuthor
   *          the new value of the '{@link Audit#getAuthor() author}' feature.
   * @generated
   */
  public void setAuthor(String newAuthor) {
    author = newAuthor;
  }

  /**
   * Returns the value of '<em><b>date</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>date</b></em>' feature
   * @generated
   */
  public String getDate() {
    return date;
  }

  /**
   * Sets the '{@link Audit#getDate() <em>date</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDate
   *          the new value of the '{@link Audit#getDate() date}' feature.
   * @generated
   */
  public void setDate(String newDate) {
    date = newDate;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Audit " + " [description: " + getDescription() + "]" + " [author: " + getAuthor() + "]" + " [date: "
        + getDate() + "]";
  }
}
