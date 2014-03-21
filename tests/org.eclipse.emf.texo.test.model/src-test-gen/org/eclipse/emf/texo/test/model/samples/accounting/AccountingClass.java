package org.eclipse.emf.texo.test.model.samples.accounting;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Accounting</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "accounting_Accounting")
@Table(name = "accounting_Accounting")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class AccountingClass extends Identifiable implements Serializable {
  /**
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Column(name = "name")
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn(name = "accounting_Accounting_accountGroup_ind")
  @JoinColumns({ @JoinColumn(name = "accounting_Accounting_accountGroup") })
  private List<AccountGroup> accountGroup = new ArrayList<AccountGroup>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn(name = "accounting_Accounting_vat_ind")
  @JoinColumns({ @JoinColumn(name = "accounting_Accounting_vat") })
  private List<Vat> vat = new ArrayList<Vat>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "accounting_Accounting_vatAccount") })
  private BalanceAccount vatAccount = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL })
  @JoinColumns({ @JoinColumn(name = "accounting_Accounting_report") })
  private Report report = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn(name = "accounting_Accounting_journalGroup_ind")
  @JoinColumns({ @JoinColumn(name = "accounting_Accounting_journalGroup") })
  private List<JournalGroup> journalGroup = new ArrayList<JournalGroup>();

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link AccountingClass#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link AccountingClass#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>accountGroup</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>accountGroup</b></em>' feature
   * @generated
   */
  public List<AccountGroup> getAccountGroup() {
    return accountGroup;
  }

  /**
   * Adds to the <em>accountGroup</em> feature.
   * 
   * @param accountGroupValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToAccountGroup(AccountGroup accountGroupValue) {
    if (!accountGroup.contains(accountGroupValue)) {
      boolean result = accountGroup.add(accountGroupValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>accountGroup</em> feature.
   * 
   * @param accountGroupValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromAccountGroup(AccountGroup accountGroupValue) {
    if (accountGroup.contains(accountGroupValue)) {
      boolean result = accountGroup.remove(accountGroupValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>accountGroup</em> feature.
   * 
   * @generated
   */
  public void clearAccountGroup() {
    while (!accountGroup.isEmpty()) {
      removeFromAccountGroup(accountGroup.iterator().next());
    }
  }

  /**
   * Sets the '{@link AccountingClass#getAccountGroup() <em>accountGroup</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAccountGroup
   *          the new value of the '{@link AccountingClass#getAccountGroup() accountGroup}' feature.
   * @generated
   */
  public void setAccountGroup(List<AccountGroup> newAccountGroup) {
    accountGroup = newAccountGroup;
  }

  /**
   * Returns the value of '<em><b>vat</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>vat</b></em>' feature
   * @generated
   */
  public List<Vat> getVat() {
    return vat;
  }

  /**
   * Adds to the <em>vat</em> feature.
   * 
   * @param vatValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToVat(Vat vatValue) {
    if (!vat.contains(vatValue)) {
      boolean result = vat.add(vatValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>vat</em> feature.
   * 
   * @param vatValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromVat(Vat vatValue) {
    if (vat.contains(vatValue)) {
      boolean result = vat.remove(vatValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>vat</em> feature.
   * 
   * @generated
   */
  public void clearVat() {
    while (!vat.isEmpty()) {
      removeFromVat(vat.iterator().next());
    }
  }

  /**
   * Sets the '{@link AccountingClass#getVat() <em>vat</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newVat
   *          the new value of the '{@link AccountingClass#getVat() vat}' feature.
   * @generated
   */
  public void setVat(List<Vat> newVat) {
    vat = newVat;
  }

  /**
   * Returns the value of '<em><b>vatAccount</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>vatAccount</b></em>' feature
   * @generated
   */
  public BalanceAccount getVatAccount() {
    return vatAccount;
  }

  /**
   * Sets the '{@link AccountingClass#getVatAccount() <em>vatAccount</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newVatAccount
   *          the new value of the '{@link AccountingClass#getVatAccount() vatAccount}' feature.
   * @generated
   */
  public void setVatAccount(BalanceAccount newVatAccount) {
    vatAccount = newVatAccount;
  }

  /**
   * Returns the value of '<em><b>report</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>report</b></em>' feature
   * @generated
   */
  public Report getReport() {
    return report;
  }

  /**
   * Sets the '{@link AccountingClass#getReport() <em>report</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newReport
   *          the new value of the '{@link AccountingClass#getReport() report}' feature.
   * @generated
   */
  public void setReport(Report newReport) {
    report = newReport;
  }

  /**
   * Returns the value of '<em><b>journalGroup</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>journalGroup</b></em>' feature
   * @generated
   */
  public List<JournalGroup> getJournalGroup() {
    return journalGroup;
  }

  /**
   * Adds to the <em>journalGroup</em> feature.
   * 
   * @param journalGroupValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToJournalGroup(JournalGroup journalGroupValue) {
    if (!journalGroup.contains(journalGroupValue)) {
      boolean result = journalGroup.add(journalGroupValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>journalGroup</em> feature.
   * 
   * @param journalGroupValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromJournalGroup(JournalGroup journalGroupValue) {
    if (journalGroup.contains(journalGroupValue)) {
      boolean result = journalGroup.remove(journalGroupValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>journalGroup</em> feature.
   * 
   * @generated
   */
  public void clearJournalGroup() {
    while (!journalGroup.isEmpty()) {
      removeFromJournalGroup(journalGroup.iterator().next());
    }
  }

  /**
   * Sets the '{@link AccountingClass#getJournalGroup() <em>journalGroup</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newJournalGroup
   *          the new value of the '{@link AccountingClass#getJournalGroup() journalGroup}' feature.
   * @generated
   */
  public void setJournalGroup(List<JournalGroup> newJournalGroup) {
    journalGroup = newJournalGroup;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Accounting " + " [name: " + getName() + "]";
  }
}
