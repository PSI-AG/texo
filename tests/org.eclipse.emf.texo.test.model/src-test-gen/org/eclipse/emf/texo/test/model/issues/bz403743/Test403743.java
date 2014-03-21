package org.eclipse.emf.texo.test.model.issues.bz403743;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Test403743</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "bz403743_Test403743")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Test403743 extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<Test403743> children = new ArrayList<Test403743>();

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
   * Sets the '{@link Test403743#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Test403743#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>children</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>children</b></em>' feature
   * @generated
   */
  public List<Test403743> getChildren() {
    return children;
  }

  /**
   * Adds to the <em>children</em> feature.
   * 
   * @param childrenValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToChildren(Test403743 childrenValue) {
    if (!children.contains(childrenValue)) {
      boolean result = children.add(childrenValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>children</em> feature.
   * 
   * @param childrenValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromChildren(Test403743 childrenValue) {
    if (children.contains(childrenValue)) {
      boolean result = children.remove(childrenValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>children</em> feature.
   * 
   * @generated
   */
  public void clearChildren() {
    while (!children.isEmpty()) {
      removeFromChildren(children.iterator().next());
    }
  }

  /**
   * Sets the '{@link Test403743#getChildren() <em>children</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newChildren
   *          the new value of the '{@link Test403743#getChildren() children}' feature.
   * @generated
   */
  public void setChildren(List<Test403743> newChildren) {
    children = newChildren;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Test403743 " + " [name: " + getName() + "]";
  }
}
