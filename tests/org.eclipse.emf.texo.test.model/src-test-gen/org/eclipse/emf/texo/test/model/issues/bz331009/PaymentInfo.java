package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>PaymentInfo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> Платежная информация <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_PaymentInfo")
@Table(name = "m_PaymentInfo")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class PaymentInfo extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Тариф <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_PaymentInfo_tariff") })
  private Tariff tariff = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Фактические платежи <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn(name = "m_PaymentInfo_factPayments_ind")
  @JoinTable(joinColumns = { @JoinColumn(name = "m_PaymentInfo_factPayments") }, inverseJoinColumns = { @JoinColumn(name = "factPayments_m_PaymentItem") }, name = "m_PaymentInfo_factPayments")
  @Access(AccessType.FIELD)
  private List<PaymentItem> factPayments = new ArrayList<PaymentItem>();

  /**
   * Returns the value of '<em><b>tariff</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Тариф <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>tariff</b></em>' feature
   * @generated
   */
  public Tariff getTariff() {
    return tariff;
  }

  /**
   * Sets the '{@link PaymentInfo#getTariff() <em>tariff</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Тариф <!-- end-model-doc -->
   * 
   * @param newTariff
   *          the new value of the '{@link PaymentInfo#getTariff() tariff}' feature.
   * @generated
   */
  public void setTariff(Tariff newTariff) {
    tariff = newTariff;
  }

  /**
   * Returns the value of '<em><b>factPayments</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Фактические платежи <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>factPayments</b></em>' feature
   * @generated
   */
  public List<PaymentItem> getFactPayments() {
    return factPayments;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PaymentInfo ";
  }
}
