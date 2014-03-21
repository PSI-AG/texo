package org.eclipse.graphiti.mm.pictograms;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ContainerShape</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "pi_ContainerShape")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ContainerShape extends Shape {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<Shape> children = new ArrayList<Shape>();

  /**
   * Returns the value of '<em><b>children</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>children</b></em>' feature
   * @generated
   */
  public List<Shape> getChildren() {
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
  public boolean addToChildren(Shape childrenValue) {
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
  public boolean removeFromChildren(Shape childrenValue) {
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
   * Sets the '{@link ContainerShape#getChildren() <em>children</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newChildren
   *          the new value of the '{@link ContainerShape#getChildren() children}' feature.
   * @generated
   */
  public void setChildren(List<Shape> newChildren) {
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
    return "ContainerShape ";
  }
}
