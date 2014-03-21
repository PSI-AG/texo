package org.eclipse.emf.texo.test.model.samples.accounting;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>AccountGroup</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class AccountGroup extends Identifiable {

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
	private List<Account> account = new ArrayList<Account>();

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
	 * Sets the '{@link AccountGroup#getName() <em>name</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link AccountGroup#getName() name}'
	 *            feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>account</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>account</b></em>' feature
	 * @generated
	 */
	public List<Account> getAccount() {
		return account;
	}

	/**
	 * Adds to the <em>account</em> feature.
	 * 
	 * @generated
	 */
	public void addToAccount(Account accountValue) {
		if (!account.contains(accountValue)) {
			account.add(accountValue);
		}
	}

	/**
	 * Removes from the <em>account</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromAccount(Account accountValue) {
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
	 * Sets the '{@link AccountGroup#getAccount() <em>account</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link AccountGroup#getAccount() account}'
	 *            feature.
	 * @generated
	 */
	public void setAccount(List<Account> newAccount) {
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
		return "AccountGroup " + " [name: " + getName() + "]";
	}
}
