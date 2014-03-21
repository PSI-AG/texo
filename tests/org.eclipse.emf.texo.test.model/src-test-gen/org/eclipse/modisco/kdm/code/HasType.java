package org.eclipse.modisco.kdm.code;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>HasType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "code_HasType")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class HasType extends AbstractCodeRelationship {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private Datatype to = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private CodeItem from = null;

  /**
   * Returns the value of '<em><b>to</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>to</b></em>' feature
   * @generated
   */
  public Datatype getTo() {
    return to;
  }

  /**
   * Sets the '{@link HasType#getTo() <em>to</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTo
   *          the new value of the '{@link HasType#getTo() to}' feature.
   * @generated
   */
  public void setTo(Datatype newTo) {
    to = newTo;
  }

  /**
   * Returns the value of '<em><b>from</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>from</b></em>' feature
   * @generated
   */
  public CodeItem getFrom() {
    return from;
  }

  /**
   * Sets the '{@link HasType#getFrom() <em>from</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFrom
   *          the new value of the '{@link HasType#getFrom() from}' feature.
   * @generated
   */
  public void setFrom(CodeItem newFrom) {
    from = newFrom;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "HasType ";
  }
}
