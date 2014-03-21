package org.eclipse.emf.texo.test.model.samples.accounting;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>JournalGroup</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class JournalGroup extends Identifiable {

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
	private List<JournalGroup> journalGroups = new ArrayList<JournalGroup>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<JournalStatement> journalStatements = new ArrayList<JournalStatement>();

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
	 * Sets the '{@link JournalGroup#getName() <em>name</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link JournalGroup#getName() name}'
	 *            feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>journalGroups</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>journalGroups</b></em>' feature
	 * @generated
	 */
	public List<JournalGroup> getJournalGroups() {
		return journalGroups;
	}

	/**
	 * Adds to the <em>journalGroups</em> feature.
	 * 
	 * @generated
	 */
	public void addToJournalGroups(JournalGroup journalGroupsValue) {
		if (!journalGroups.contains(journalGroupsValue)) {
			journalGroups.add(journalGroupsValue);
		}
	}

	/**
	 * Removes from the <em>journalGroups</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromJournalGroups(JournalGroup journalGroupsValue) {
		if (journalGroups.contains(journalGroupsValue)) {
			journalGroups.remove(journalGroupsValue);
		}
	}

	/**
	 * Clears the <em>journalGroups</em> feature.
	 * 
	 * @generated
	 */
	public void clearJournalGroups() {
		while (!journalGroups.isEmpty()) {
			removeFromJournalGroups(journalGroups.iterator().next());
		}
	}

	/**
	 * Sets the '{@link JournalGroup#getJournalGroups() <em>journalGroups</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link JournalGroup#getJournalGroups()
	 *            journalGroups}' feature.
	 * @generated
	 */
	public void setJournalGroups(List<JournalGroup> newJournalGroups) {
		journalGroups = newJournalGroups;
	}

	/**
	 * Returns the value of '<em><b>journalStatements</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>journalStatements</b></em>' feature
	 * @generated
	 */
	public List<JournalStatement> getJournalStatements() {
		return journalStatements;
	}

	/**
	 * Adds to the <em>journalStatements</em> feature.
	 * 
	 * @generated
	 */
	public void addToJournalStatements(JournalStatement journalStatementsValue) {
		if (!journalStatements.contains(journalStatementsValue)) {
			journalStatements.add(journalStatementsValue);
		}
	}

	/**
	 * Removes from the <em>journalStatements</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromJournalStatements(
			JournalStatement journalStatementsValue) {
		if (journalStatements.contains(journalStatementsValue)) {
			journalStatements.remove(journalStatementsValue);
		}
	}

	/**
	 * Clears the <em>journalStatements</em> feature.
	 * 
	 * @generated
	 */
	public void clearJournalStatements() {
		while (!journalStatements.isEmpty()) {
			removeFromJournalStatements(journalStatements.iterator().next());
		}
	}

	/**
	 * Sets the '{@link JournalGroup#getJournalStatements()
	 * <em>journalStatements</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link JournalGroup#getJournalStatements()
	 *            journalStatements}' feature.
	 * @generated
	 */
	public void setJournalStatements(List<JournalStatement> newJournalStatements) {
		journalStatements = newJournalStatements;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "JournalGroup " + " [name: " + getName() + "]";
	}
}
