package org.eclipse.emf.texo.test.model.samples.extlibrary;

import java.util.Set;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableInterface;

/**
 * A representation of the model object '<em><b>Lendable</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public interface Lendable extends IdentifiableInterface {
  /**
   * Returns the value of '<em><b>copies</em></b>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>copies</b></em>' feature
   * @generated
   */
  public int getCopies();

  /**
   * Sets the '{@link Lendable#getCopies() <em>copies</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCopies
   *          the new value of the '{@link Lendable#getCopies() <em>copies</em>}' feature.
   * @generated
   */
  public void setCopies(int newCopies);

  /**
   * Returns the value of '<em><b>borrowers</em></b>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>borrowers</b></em>' feature
   * @generated
   */
  public Set<Borrower> getBorrowers();

  /**
   * Adds to the <em>borrowers</em> feature.
   * 
   * @param value
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * 
   * @generated
   */
  public boolean addToBorrowers(Borrower value);

  /**
   * Removes from the <em>borrowers</em> feature.
   * 
   * @param value
   *          the value to remove
   * @return true if the value is removed from the collection (it was present in the collection), false otherwise
   * 
   * @generated
   */
  public boolean removeFromBorrowers(Borrower value);

  /**
   * Clears the <em>borrowers</em> feature.
   * 
   * @generated
   */
  public void clearBorrowers();

  /**
   * Sets the '{@link Lendable#getBorrowers() <em>borrowers</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBorrowers
   *          the new value of the '{@link Lendable#getBorrowers() <em>borrowers</em>}' feature.
   * @generated
   */
  public void setBorrowers(Set<Borrower> newBorrowers);

}
