package org.eclipse.emf.texo.test.model.samples.accounting;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AccountGroup</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "accounting_AccountGroup")
@Table(name = "accounting_AccountGroup")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class AccountGroup extends Identifiable {

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
  @OrderColumn(name = "accounting_AccountGroup_account_ind")
  @JoinColumns({ @JoinColumn(name = "accounting_AccountGroup_account") })
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
   * @param newName
   *          the new value of the '{@link AccountGroup#getName() name}' feature.
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
   * @param accountValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToAccount(Account accountValue) {
    if (!account.contains(accountValue)) {
      boolean result = account.add(accountValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>account</em> feature.
   * 
   * @param accountValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromAccount(Account accountValue) {
    if (account.contains(accountValue)) {
      boolean result = account.remove(accountValue);
      return result;
    }
    return false;
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
   * @param newAccount
   *          the new value of the '{@link AccountGroup#getAccount() account}' feature.
   * @generated
   */
  public void setAccount(List<Account> newAccount) {
    account = newAccount;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AccountGroup " + " [name: " + getName() + "]";
  }
}
