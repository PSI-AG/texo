package org.eclipse.emf.texo.test.model.samples.accounting;

import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Report</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Report extends Identifiable {

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
	private ReportGroup debitReportGroup = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private ReportGroup creditReportGroup = null;

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
	 * Sets the '{@link Report#getName() <em>name</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Report#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>debitReportGroup</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>debitReportGroup</b></em>' feature
	 * @generated
	 */
	public ReportGroup getDebitReportGroup() {
		return debitReportGroup;
	}

	/**
	 * Sets the '{@link Report#getDebitReportGroup() <em>debitReportGroup</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Report#getDebitReportGroup()
	 *            debitReportGroup}' feature.
	 * @generated
	 */
	public void setDebitReportGroup(ReportGroup newDebitReportGroup) {
		debitReportGroup = newDebitReportGroup;
	}

	/**
	 * Returns the value of '<em><b>creditReportGroup</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>creditReportGroup</b></em>' feature
	 * @generated
	 */
	public ReportGroup getCreditReportGroup() {
		return creditReportGroup;
	}

	/**
	 * Sets the '{@link Report#getCreditReportGroup()
	 * <em>creditReportGroup</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Report#getCreditReportGroup()
	 *            creditReportGroup}' feature.
	 * @generated
	 */
	public void setCreditReportGroup(ReportGroup newCreditReportGroup) {
		creditReportGroup = newCreditReportGroup;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Report " + " [name: " + getName() + "]";
	}
}
