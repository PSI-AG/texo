package org.eclipse.emf.texo.test.model.samples.extlibrary;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>VideoCassette</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "extlib_VideoCassette")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class VideoCassette extends AudioVisualItem {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  private List<Person> cast = new ArrayList<Person>();

  /**
   * Returns the value of '<em><b>cast</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>cast</b></em>' feature
   * @generated
   */
  public List<Person> getCast() {
    return cast;
  }

  /**
   * Adds to the <em>cast</em> feature.
   * 
   * @param castValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToCast(Person castValue) {
    if (!cast.contains(castValue)) {
      boolean result = cast.add(castValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>cast</em> feature.
   * 
   * @param castValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromCast(Person castValue) {
    if (cast.contains(castValue)) {
      boolean result = cast.remove(castValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>cast</em> feature.
   * 
   * @generated
   */
  public void clearCast() {
    while (!cast.isEmpty()) {
      removeFromCast(cast.iterator().next());
    }
  }

  /**
   * Sets the '{@link VideoCassette#getCast() <em>cast</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCast
   *          the new value of the '{@link VideoCassette#getCast() cast}' feature.
   * @generated
   */
  public void setCast(List<Person> newCast) {
    cast = newCast;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "VideoCassette ";
  }
}
