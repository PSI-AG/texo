package org.eclipse.modisco.kdm.platform;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Machine</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "platform_Machine")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Machine extends AbstractPlatformElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<DeployedComponent> deployedComponent = new HashSet<DeployedComponent>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<DeployedResource> deployedResource = new HashSet<DeployedResource>();

  /**
   * Returns the value of '<em><b>deployedComponent</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>deployedComponent</b></em>' feature
   * @generated
   */
  public Set<DeployedComponent> getDeployedComponent() {
    return deployedComponent;
  }

  /**
   * Adds to the <em>deployedComponent</em> feature.
   * 
   * @param deployedComponentValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToDeployedComponent(DeployedComponent deployedComponentValue) {
    if (!deployedComponent.contains(deployedComponentValue)) {
      boolean result = deployedComponent.add(deployedComponentValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>deployedComponent</em> feature.
   * 
   * @param deployedComponentValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromDeployedComponent(DeployedComponent deployedComponentValue) {
    if (deployedComponent.contains(deployedComponentValue)) {
      boolean result = deployedComponent.remove(deployedComponentValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>deployedComponent</em> feature.
   * 
   * @generated
   */
  public void clearDeployedComponent() {
    while (!deployedComponent.isEmpty()) {
      removeFromDeployedComponent(deployedComponent.iterator().next());
    }
  }

  /**
   * Sets the '{@link Machine#getDeployedComponent() <em>deployedComponent</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDeployedComponent
   *          the new value of the '{@link Machine#getDeployedComponent() deployedComponent}' feature.
   * @generated
   */
  public void setDeployedComponent(Set<DeployedComponent> newDeployedComponent) {
    deployedComponent = newDeployedComponent;
  }

  /**
   * Returns the value of '<em><b>deployedResource</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>deployedResource</b></em>' feature
   * @generated
   */
  public Set<DeployedResource> getDeployedResource() {
    return deployedResource;
  }

  /**
   * Adds to the <em>deployedResource</em> feature.
   * 
   * @param deployedResourceValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToDeployedResource(DeployedResource deployedResourceValue) {
    if (!deployedResource.contains(deployedResourceValue)) {
      boolean result = deployedResource.add(deployedResourceValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>deployedResource</em> feature.
   * 
   * @param deployedResourceValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromDeployedResource(DeployedResource deployedResourceValue) {
    if (deployedResource.contains(deployedResourceValue)) {
      boolean result = deployedResource.remove(deployedResourceValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>deployedResource</em> feature.
   * 
   * @generated
   */
  public void clearDeployedResource() {
    while (!deployedResource.isEmpty()) {
      removeFromDeployedResource(deployedResource.iterator().next());
    }
  }

  /**
   * Sets the '{@link Machine#getDeployedResource() <em>deployedResource</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDeployedResource
   *          the new value of the '{@link Machine#getDeployedResource() deployedResource}' feature.
   * @generated
   */
  public void setDeployedResource(Set<DeployedResource> newDeployedResource) {
    deployedResource = newDeployedResource;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Machine ";
  }
}
