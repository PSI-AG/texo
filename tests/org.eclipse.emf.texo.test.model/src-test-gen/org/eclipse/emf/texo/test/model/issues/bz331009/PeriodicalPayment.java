package org.eclipse.emf.texo.test.model.issues.bz331009;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>PeriodicalPayment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * --> <!-- begin-model-doc --> Периодический платеж <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_PeriodicalPayment")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class PeriodicalPayment extends PaymentItem {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "periodicity", nullable = true)
  @Enumerated(EnumType.STRING)
  private Periodicity periodicity = null;

  /**
   * Returns the value of '<em><b>periodicity</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>periodicity</b></em>' feature
   * @generated
   */
  public Periodicity getPeriodicity() {
    return periodicity;
  }

  /**
   * Sets the '{@link PeriodicalPayment#getPeriodicity() <em>periodicity</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPeriodicity
   *          the new value of the '{@link PeriodicalPayment#getPeriodicity() periodicity}' feature.
   * @generated
   */
  public void setPeriodicity(Periodicity newPeriodicity) {
    periodicity = newPeriodicity;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PeriodicalPayment " + " [periodicity: " + getPeriodicity() + "]";
  }
}
