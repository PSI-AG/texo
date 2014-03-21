package org.eclipse.emf.texo.test.model.samples.accounting;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Accounting</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
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
	private String name = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<AccountGroup> accountGroup = new ArrayList<AccountGroup>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Vat> vat = new ArrayList<Vat>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private BalanceAccount vatAccount = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Report report = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
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
	 * @param the
	 *            new value of the '{@link AccountingClass#getName() name}'
	 *            feature.
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
	 * @generated
	 */
	public void addToAccountGroup(AccountGroup accountGroupValue) {
		if (!accountGroup.contains(accountGroupValue)) {
			accountGroup.add(accountGroupValue);
		}
	}

	/**
	 * Removes from the <em>accountGroup</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromAccountGroup(AccountGroup accountGroupValue) {
		if (accountGroup.contains(accountGroupValue)) {
			accountGroup.remove(accountGroupValue);
		}
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
	 * Sets the '{@link AccountingClass#getAccountGroup() <em>accountGroup</em>}
	 * ' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link AccountingClass#getAccountGroup()
	 *            accountGroup}' feature.
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
	 * @generated
	 */
	public void addToVat(Vat vatValue) {
		if (!vat.contains(vatValue)) {
			vat.add(vatValue);
		}
	}

	/**
	 * Removes from the <em>vat</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromVat(Vat vatValue) {
		if (vat.contains(vatValue)) {
			vat.remove(vatValue);
		}
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
	 * @param the
	 *            new value of the '{@link AccountingClass#getVat() vat}'
	 *            feature.
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
	 * Sets the '{@link AccountingClass#getVatAccount() <em>vatAccount</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link AccountingClass#getVatAccount()
	 *            vatAccount}' feature.
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
	 * @param the
	 *            new value of the '{@link AccountingClass#getReport() report}'
	 *            feature.
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
	 * @generated
	 */
	public void addToJournalGroup(JournalGroup journalGroupValue) {
		if (!journalGroup.contains(journalGroupValue)) {
			journalGroup.add(journalGroupValue);
		}
	}

	/**
	 * Removes from the <em>journalGroup</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromJournalGroup(JournalGroup journalGroupValue) {
		if (journalGroup.contains(journalGroupValue)) {
			journalGroup.remove(journalGroupValue);
		}
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
	 * Sets the '{@link AccountingClass#getJournalGroup() <em>journalGroup</em>}
	 * ' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link AccountingClass#getJournalGroup()
	 *            journalGroup}' feature.
	 * @generated
	 */
	public void setJournalGroup(List<JournalGroup> newJournalGroup) {
		journalGroup = newJournalGroup;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Accounting " + " [name: " + getName() + "]";
	}
}
