package org.eclipse.emf.texo.test.model.samples.accounting;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>JournalStatement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "accounting_JournalStatement")
@Table(name = "accounting_JournalStatement")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class JournalStatement extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Column(name = "description")
  private String description = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Column(name = "T_date")
  @Temporal(TemporalType.DATE)
  private Date date = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Column(name = "amount")
  private float amount = 0.0f;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  @JoinColumns({ @JoinColumn(name = "accounting_JournalStatement_debitAccount") })
  private Account debitAccount = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  @JoinColumns({ @JoinColumn(name = "accounting_JournalStatement_creditAccount") })
  private Account creditAccount = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "accounting_JournalStatement_vat") })
  private Vat vat = null;

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
   * Sets the '{@link JournalStatement#getDescription() <em>description</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDescription
   *          the new value of the '{@link JournalStatement#getDescription() description}' feature.
   * @generated
   */
  public void setDescription(String newDescription) {
    description = newDescription;
  }

  /**
   * Returns the value of '<em><b>date</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>date</b></em>' feature
   * @generated
   */
  public Date getDate() {
    return date;
  }

  /**
   * Sets the '{@link JournalStatement#getDate() <em>date</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDate
   *          the new value of the '{@link JournalStatement#getDate() date}' feature.
   * @generated
   */
  public void setDate(Date newDate) {
    date = newDate;
  }

  /**
   * Returns the value of '<em><b>amount</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>amount</b></em>' feature
   * @generated
   */
  public float getAmount() {
    return amount;
  }

  /**
   * Sets the '{@link JournalStatement#getAmount() <em>amount</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAmount
   *          the new value of the '{@link JournalStatement#getAmount() amount}' feature.
   * @generated
   */
  public void setAmount(float newAmount) {
    amount = newAmount;
  }

  /**
   * Returns the value of '<em><b>debitAccount</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>debitAccount</b></em>' feature
   * @generated
   */
  public Account getDebitAccount() {
    return debitAccount;
  }

  /**
   * Sets the '{@link JournalStatement#getDebitAccount() <em>debitAccount</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDebitAccount
   *          the new value of the '{@link JournalStatement#getDebitAccount() debitAccount}' feature.
   * @generated
   */
  public void setDebitAccount(Account newDebitAccount) {
    debitAccount = newDebitAccount;
  }

  /**
   * Returns the value of '<em><b>creditAccount</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>creditAccount</b></em>' feature
   * @generated
   */
  public Account getCreditAccount() {
    return creditAccount;
  }

  /**
   * Sets the '{@link JournalStatement#getCreditAccount() <em>creditAccount</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCreditAccount
   *          the new value of the '{@link JournalStatement#getCreditAccount() creditAccount}' feature.
   * @generated
   */
  public void setCreditAccount(Account newCreditAccount) {
    creditAccount = newCreditAccount;
  }

  /**
   * Returns the value of '<em><b>vat</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>vat</b></em>' feature
   * @generated
   */
  public Vat getVat() {
    return vat;
  }

  /**
   * Sets the '{@link JournalStatement#getVat() <em>vat</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newVat
   *          the new value of the '{@link JournalStatement#getVat() vat}' feature.
   * @generated
   */
  public void setVat(Vat newVat) {
    vat = newVat;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "JournalStatement " + " [description: " + getDescription() + "]" + " [date: " + getDate() + "]"
        + " [amount: " + getAmount() + "]";
  }
}
