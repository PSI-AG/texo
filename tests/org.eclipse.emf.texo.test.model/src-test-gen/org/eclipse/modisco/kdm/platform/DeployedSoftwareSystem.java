package org.eclipse.modisco.kdm.platform;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>DeployedSoftwareSystem</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "platform_DeployedSoftwareSystem")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class DeployedSoftwareSystem extends AbstractPlatformElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Set<DeployedComponent> groupedComponent = new HashSet<DeployedComponent>();

  /**
   * Returns the value of '<em><b>groupedComponent</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>groupedComponent</b></em>' feature
   * @generated
   */
  public Set<DeployedComponent> getGroupedComponent() {
    return groupedComponent;
  }

  /**
   * Adds to the <em>groupedComponent</em> feature.
   * 
   * @param groupedComponentValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToGroupedComponent(DeployedComponent groupedComponentValue) {
    if (!groupedComponent.contains(groupedComponentValue)) {
      boolean result = groupedComponent.add(groupedComponentValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>groupedComponent</em> feature.
   * 
   * @param groupedComponentValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromGroupedComponent(DeployedComponent groupedComponentValue) {
    if (groupedComponent.contains(groupedComponentValue)) {
      boolean result = groupedComponent.remove(groupedComponentValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>groupedComponent</em> feature.
   * 
   * @generated
   */
  public void clearGroupedComponent() {
    while (!groupedComponent.isEmpty()) {
      removeFromGroupedComponent(groupedComponent.iterator().next());
    }
  }

  /**
   * Sets the '{@link DeployedSoftwareSystem#getGroupedComponent() <em>groupedComponent</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGroupedComponent
   *          the new value of the '{@link DeployedSoftwareSystem#getGroupedComponent() groupedComponent}' feature.
   * @generated
   */
  public void setGroupedComponent(Set<DeployedComponent> newGroupedComponent) {
    groupedComponent = newGroupedComponent;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "DeployedSoftwareSystem ";
  }
}
