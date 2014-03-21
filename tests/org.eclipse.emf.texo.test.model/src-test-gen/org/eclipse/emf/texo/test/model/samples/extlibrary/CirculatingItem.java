package org.eclipse.emf.texo.test.model.samples.extlibrary;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>CirculatingItem</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "extlib_CirculatingItem")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class CirculatingItem extends Item implements Lendable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int copies = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, mappedBy = "borrowed")
  private Set<Borrower> borrowers = new HashSet<Borrower>();

  /**
   * Returns the value of '<em><b>copies</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>copies</b></em>' feature
   * @generated
   */
  public int getCopies() {
    return copies;
  }

  /**
   * Sets the '{@link CirculatingItem#getCopies() <em>copies</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCopies
   *          the new value of the '{@link CirculatingItem#getCopies() copies}' feature.
   * @generated
   */
  public void setCopies(int newCopies) {
    copies = newCopies;
  }

  /**
   * Returns the value of '<em><b>borrowers</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>borrowers</b></em>' feature
   * @generated
   */
  public Set<Borrower> getBorrowers() {
    return borrowers;
  }

  /**
   * Adds to the <em>borrowers</em> feature.
   * 
   * @param borrowersValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToBorrowers(Borrower borrowersValue) {
    if (!borrowers.contains(borrowersValue)) {
      boolean result = borrowers.add(borrowersValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>borrowers</em> feature.
   * 
   * @param borrowersValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromBorrowers(Borrower borrowersValue) {
    if (borrowers.contains(borrowersValue)) {
      boolean result = borrowers.remove(borrowersValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>borrowers</em> feature.
   * 
   * @generated
   */
  public void clearBorrowers() {
    while (!borrowers.isEmpty()) {
      removeFromBorrowers(borrowers.iterator().next());
    }
  }

  /**
   * Sets the '{@link CirculatingItem#getBorrowers() <em>borrowers</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBorrowers
   *          the new value of the '{@link CirculatingItem#getBorrowers() borrowers}' feature.
   * @generated
   */
  public void setBorrowers(Set<Borrower> newBorrowers) {
    borrowers = newBorrowers;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "CirculatingItem " + " [copies: " + getCopies() + "]";
  }
}
