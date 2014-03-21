package org.eclipse.modisco.kdm.code;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>RangeType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "code_RangeType")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class RangeType extends DerivedType {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer lower = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer upper = null;

  /**
   * Returns the value of '<em><b>lower</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>lower</b></em>' feature
   * @generated
   */
  public Integer getLower() {
    return lower;
  }

  /**
   * Sets the '{@link RangeType#getLower() <em>lower</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLower
   *          the new value of the '{@link RangeType#getLower() lower}' feature.
   * @generated
   */
  public void setLower(Integer newLower) {
    lower = newLower;
  }

  /**
   * Returns the value of '<em><b>upper</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>upper</b></em>' feature
   * @generated
   */
  public Integer getUpper() {
    return upper;
  }

  /**
   * Sets the '{@link RangeType#getUpper() <em>upper</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newUpper
   *          the new value of the '{@link RangeType#getUpper() upper}' feature.
   * @generated
   */
  public void setUpper(Integer newUpper) {
    upper = newUpper;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "RangeType " + " [lower: " + getLower() + "]" + " [upper: " + getUpper() + "]";
  }
}
