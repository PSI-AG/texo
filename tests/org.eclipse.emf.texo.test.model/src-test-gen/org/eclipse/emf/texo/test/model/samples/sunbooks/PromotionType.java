package org.eclipse.emf.texo.test.model.samples.sunbooks;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>PromotionType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "sunBooks_PromotionType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class PromotionType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String discount = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String none = null;

  /**
   * Returns the value of '<em><b>discount</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>discount</b></em>' feature
   * @generated
   */
  public String getDiscount() {
    return discount;
  }

  /**
   * Sets the '{@link PromotionType#getDiscount() <em>discount</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDiscount
   *          the new value of the '{@link PromotionType#getDiscount() discount}' feature.
   * @generated
   */
  public void setDiscount(String newDiscount) {
    discount = newDiscount;
  }

  /**
   * Returns the value of '<em><b>none</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>none</b></em>' feature
   * @generated
   */
  public String getNone() {
    return none;
  }

  /**
   * Sets the '{@link PromotionType#getNone() <em>none</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newNone
   *          the new value of the '{@link PromotionType#getNone() none}' feature.
   * @generated
   */
  public void setNone(String newNone) {
    none = newNone;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PromotionType " + " [discount: " + getDiscount() + "]" + " [none: " + getNone() + "]";
  }
}
