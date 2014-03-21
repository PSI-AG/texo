package org.eclipse.modisco.kdm.kdm;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.core.Element;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ExtensionFamily</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "kdm_ExtensionFamily")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ExtensionFamily extends Element {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<Stereotype> stereotype = new HashSet<Stereotype>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String name = null;

  /**
   * Returns the value of '<em><b>stereotype</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>stereotype</b></em>' feature
   * @generated
   */
  public Set<Stereotype> getStereotype() {
    return stereotype;
  }

  /**
   * Adds to the <em>stereotype</em> feature.
   * 
   * @param stereotypeValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToStereotype(Stereotype stereotypeValue) {
    if (!stereotype.contains(stereotypeValue)) {
      boolean result = stereotype.add(stereotypeValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>stereotype</em> feature.
   * 
   * @param stereotypeValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromStereotype(Stereotype stereotypeValue) {
    if (stereotype.contains(stereotypeValue)) {
      boolean result = stereotype.remove(stereotypeValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>stereotype</em> feature.
   * 
   * @generated
   */
  public void clearStereotype() {
    while (!stereotype.isEmpty()) {
      removeFromStereotype(stereotype.iterator().next());
    }
  }

  /**
   * Sets the '{@link ExtensionFamily#getStereotype() <em>stereotype</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStereotype
   *          the new value of the '{@link ExtensionFamily#getStereotype() stereotype}' feature.
   * @generated
   */
  public void setStereotype(Set<Stereotype> newStereotype) {
    stereotype = newStereotype;
  }

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
   * Sets the '{@link ExtensionFamily#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link ExtensionFamily#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ExtensionFamily " + " [name: " + getName() + "]";
  }
}
