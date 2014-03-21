package org.eclipse.modisco.kdm.code;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>VariantTo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "code_VariantTo")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class VariantTo extends AbstractCodeRelationship {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private PreprocessorDirective to = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private PreprocessorDirective from = null;

  /**
   * Returns the value of '<em><b>to</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>to</b></em>' feature
   * @generated
   */
  public PreprocessorDirective getTo() {
    return to;
  }

  /**
   * Sets the '{@link VariantTo#getTo() <em>to</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTo
   *          the new value of the '{@link VariantTo#getTo() to}' feature.
   * @generated
   */
  public void setTo(PreprocessorDirective newTo) {
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
  public PreprocessorDirective getFrom() {
    return from;
  }

  /**
   * Sets the '{@link VariantTo#getFrom() <em>from</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFrom
   *          the new value of the '{@link VariantTo#getFrom() from}' feature.
   * @generated
   */
  public void setFrom(PreprocessorDirective newFrom) {
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
    return "VariantTo ";
  }
}
