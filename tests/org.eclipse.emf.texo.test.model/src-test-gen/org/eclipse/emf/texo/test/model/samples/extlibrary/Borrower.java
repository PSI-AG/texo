package org.eclipse.emf.texo.test.model.samples.extlibrary;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Borrower</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "extlib_Borrower")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Borrower extends Person {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  @JoinTable()
  private List<Lendable> borrowed = new ArrayList<Lendable>();

  /**
   * Returns the value of '<em><b>borrowed</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>borrowed</b></em>' feature
   * @generated
   */
  public List<Lendable> getBorrowed() {
    return borrowed;
  }

  /**
   * Adds to the <em>borrowed</em> feature.
   * 
   * @param borrowedValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToBorrowed(Lendable borrowedValue) {
    if (!borrowed.contains(borrowedValue)) {
      boolean result = borrowed.add(borrowedValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>borrowed</em> feature.
   * 
   * @param borrowedValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromBorrowed(Lendable borrowedValue) {
    if (borrowed.contains(borrowedValue)) {
      boolean result = borrowed.remove(borrowedValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>borrowed</em> feature.
   * 
   * @generated
   */
  public void clearBorrowed() {
    while (!borrowed.isEmpty()) {
      removeFromBorrowed(borrowed.iterator().next());
    }
  }

  /**
   * Sets the '{@link Borrower#getBorrowed() <em>borrowed</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBorrowed
   *          the new value of the '{@link Borrower#getBorrowed() borrowed}' feature.
   * @generated
   */
  public void setBorrowed(List<Lendable> newBorrowed) {
    borrowed = newBorrowed;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Borrower ";
  }
}
