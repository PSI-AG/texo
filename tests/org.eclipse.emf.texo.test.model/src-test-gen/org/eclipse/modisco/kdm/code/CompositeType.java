package org.eclipse.modisco.kdm.code;

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
 * A representation of the model object '<em><b>CompositeType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "code_CompositeType")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class CompositeType extends Datatype {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<ItemUnit> itemUnit = new ArrayList<ItemUnit>();

  /**
   * Returns the value of '<em><b>itemUnit</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>itemUnit</b></em>' feature
   * @generated
   */
  public List<ItemUnit> getItemUnit() {
    return itemUnit;
  }

  /**
   * Adds to the <em>itemUnit</em> feature.
   * 
   * @param itemUnitValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToItemUnit(ItemUnit itemUnitValue) {
    if (!itemUnit.contains(itemUnitValue)) {
      boolean result = itemUnit.add(itemUnitValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>itemUnit</em> feature.
   * 
   * @param itemUnitValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromItemUnit(ItemUnit itemUnitValue) {
    if (itemUnit.contains(itemUnitValue)) {
      boolean result = itemUnit.remove(itemUnitValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>itemUnit</em> feature.
   * 
   * @generated
   */
  public void clearItemUnit() {
    while (!itemUnit.isEmpty()) {
      removeFromItemUnit(itemUnit.iterator().next());
    }
  }

  /**
   * Sets the '{@link CompositeType#getItemUnit() <em>itemUnit</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newItemUnit
   *          the new value of the '{@link CompositeType#getItemUnit() itemUnit}' feature.
   * @generated
   */
  public void setItemUnit(List<ItemUnit> newItemUnit) {
    itemUnit = newItemUnit;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "CompositeType ";
  }
}
