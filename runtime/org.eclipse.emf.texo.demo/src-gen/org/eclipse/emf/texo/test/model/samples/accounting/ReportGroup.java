package org.eclipse.emf.texo.test.model.samples.accounting;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>ReportGroup</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ReportGroup extends Identifiable {

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
	private List<ReportGroup> reportGroup = new ArrayList<ReportGroup>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<BalanceAccount> account = new ArrayList<BalanceAccount>();

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
	 * Sets the '{@link ReportGroup#getName() <em>name</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link ReportGroup#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>reportGroup</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>reportGroup</b></em>' feature
	 * @generated
	 */
	public List<ReportGroup> getReportGroup() {
		return reportGroup;
	}

	/**
	 * Adds to the <em>reportGroup</em> feature.
	 * 
	 * @generated
	 */
	public void addToReportGroup(ReportGroup reportGroupValue) {
		if (!reportGroup.contains(reportGroupValue)) {
			reportGroup.add(reportGroupValue);
		}
	}

	/**
	 * Removes from the <em>reportGroup</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromReportGroup(ReportGroup reportGroupValue) {
		if (reportGroup.contains(reportGroupValue)) {
			reportGroup.remove(reportGroupValue);
		}
	}

	/**
	 * Clears the <em>reportGroup</em> feature.
	 * 
	 * @generated
	 */
	public void clearReportGroup() {
		while (!reportGroup.isEmpty()) {
			removeFromReportGroup(reportGroup.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ReportGroup#getReportGroup() <em>reportGroup</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link ReportGroup#getReportGroup()
	 *            reportGroup}' feature.
	 * @generated
	 */
	public void setReportGroup(List<ReportGroup> newReportGroup) {
		reportGroup = newReportGroup;
	}

	/**
	 * Returns the value of '<em><b>account</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>account</b></em>' feature
	 * @generated
	 */
	public List<BalanceAccount> getAccount() {
		return account;
	}

	/**
	 * Adds to the <em>account</em> feature.
	 * 
	 * @generated
	 */
	public void addToAccount(BalanceAccount accountValue) {
		if (!account.contains(accountValue)) {
			account.add(accountValue);
		}
	}

	/**
	 * Removes from the <em>account</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromAccount(BalanceAccount accountValue) {
		if (account.contains(accountValue)) {
			account.remove(accountValue);
		}
	}

	/**
	 * Clears the <em>account</em> feature.
	 * 
	 * @generated
	 */
	public void clearAccount() {
		while (!account.isEmpty()) {
			removeFromAccount(account.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ReportGroup#getAccount() <em>account</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link ReportGroup#getAccount() account}'
	 *            feature.
	 * @generated
	 */
	public void setAccount(List<BalanceAccount> newAccount) {
		account = newAccount;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "ReportGroup " + " [name: " + getName() + "]";
	}
}
