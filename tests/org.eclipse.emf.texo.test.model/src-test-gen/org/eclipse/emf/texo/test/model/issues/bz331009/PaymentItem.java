package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>PaymentItem</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> Информация о платеже <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_PaymentItem")
@Table(name = "m_PaymentItem")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class PaymentItem extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Сумма платежа <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "T_sum", precision = 15, scale = 7)
  private BigDecimal sum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "currency")
  @Enumerated(EnumType.STRING)
  private Currency currency = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Дата платежа <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "T_date")
  @Temporal(TemporalType.DATE)
  private Date date = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Описание <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "description")
  private String description = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Тип платежа <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "paymentType")
  @Enumerated(EnumType.STRING)
  private PaymentType paymentType = null;

  /**
   * Returns the value of '<em><b>sum</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Сумма платежа <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>sum</b></em>' feature
   * @generated
   */
  public BigDecimal getSum() {
    return sum;
  }

  /**
   * Sets the '{@link PaymentItem#getSum() <em>sum</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Сумма платежа <!-- end-model-doc -->
   * 
   * @param newSum
   *          the new value of the '{@link PaymentItem#getSum() sum}' feature.
   * @generated
   */
  public void setSum(BigDecimal newSum) {
    sum = newSum;
  }

  /**
   * Returns the value of '<em><b>currency</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>currency</b></em>' feature
   * @generated
   */
  public Currency getCurrency() {
    return currency;
  }

  /**
   * Sets the '{@link PaymentItem#getCurrency() <em>currency</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCurrency
   *          the new value of the '{@link PaymentItem#getCurrency() currency}' feature.
   * @generated
   */
  public void setCurrency(Currency newCurrency) {
    currency = newCurrency;
  }

  /**
   * Returns the value of '<em><b>date</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Дата платежа <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>date</b></em>' feature
   * @generated
   */
  public Date getDate() {
    return date;
  }

  /**
   * Sets the '{@link PaymentItem#getDate() <em>date</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Дата платежа <!-- end-model-doc -->
   * 
   * @param newDate
   *          the new value of the '{@link PaymentItem#getDate() date}' feature.
   * @generated
   */
  public void setDate(Date newDate) {
    date = newDate;
  }

  /**
   * Returns the value of '<em><b>description</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Описание <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>description</b></em>' feature
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the '{@link PaymentItem#getDescription() <em>description</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Описание <!-- end-model-doc -->
   * 
   * @param newDescription
   *          the new value of the '{@link PaymentItem#getDescription() description}' feature.
   * @generated
   */
  public void setDescription(String newDescription) {
    description = newDescription;
  }

  /**
   * Returns the value of '<em><b>paymentType</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Тип платежа <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>paymentType</b></em>' feature
   * @generated
   */
  public PaymentType getPaymentType() {
    return paymentType;
  }

  /**
   * Sets the '{@link PaymentItem#getPaymentType() <em>paymentType</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Тип платежа <!-- end-model-doc -->
   * 
   * @param newPaymentType
   *          the new value of the '{@link PaymentItem#getPaymentType() paymentType}' feature.
   * @generated
   */
  public void setPaymentType(PaymentType newPaymentType) {
    paymentType = newPaymentType;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PaymentItem " + " [sum: " + getSum() + "]" + " [currency: " + getCurrency() + "]" + " [date: " + getDate()
        + "]" + " [description: " + getDescription() + "]" + " [paymentType: " + getPaymentType() + "]";
  }
}
