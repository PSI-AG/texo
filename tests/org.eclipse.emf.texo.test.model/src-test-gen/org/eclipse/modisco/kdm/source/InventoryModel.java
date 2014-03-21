package org.eclipse.modisco.kdm.source;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.kdm.KDMModel;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>InventoryModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> The InventoryModel is a specific KDM model which corresponds to the physical (engineering)
 * view of the existing software system. InventoryModel is a container for the instances of InventoryItems.
 * InventoryModel corresponds to the inventory of the physical artifacts of the existing software system. <!--
 * end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "source_InventoryModel")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class InventoryModel extends KDMModel {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of inventory elements owned by the
   * inventory model. <!-- end-model-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractInventoryElement> inventoryElement = new HashSet<AbstractInventoryElement>();

  /**
   * Returns the value of '<em><b>inventoryElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of inventory elements owned by the
   * inventory model. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>inventoryElement</b></em>' feature
   * @generated
   */
  public Set<AbstractInventoryElement> getInventoryElement() {
    return inventoryElement;
  }

  /**
   * Adds to the <em>inventoryElement</em> feature.
   * 
   * @param inventoryElementValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToInventoryElement(AbstractInventoryElement inventoryElementValue) {
    if (!inventoryElement.contains(inventoryElementValue)) {
      boolean result = inventoryElement.add(inventoryElementValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>inventoryElement</em> feature.
   * 
   * @param inventoryElementValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromInventoryElement(AbstractInventoryElement inventoryElementValue) {
    if (inventoryElement.contains(inventoryElementValue)) {
      boolean result = inventoryElement.remove(inventoryElementValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>inventoryElement</em> feature.
   * 
   * @generated
   */
  public void clearInventoryElement() {
    while (!inventoryElement.isEmpty()) {
      removeFromInventoryElement(inventoryElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link InventoryModel#getInventoryElement() <em>inventoryElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of inventory elements owned by the
   * inventory model. <!-- end-model-doc -->
   * 
   * @param newInventoryElement
   *          the new value of the '{@link InventoryModel#getInventoryElement() inventoryElement}' feature.
   * @generated
   */
  public void setInventoryElement(Set<AbstractInventoryElement> newInventoryElement) {
    inventoryElement = newInventoryElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "InventoryModel ";
  }
}
