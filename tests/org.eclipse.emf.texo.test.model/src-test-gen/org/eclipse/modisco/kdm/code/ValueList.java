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
 * A representation of the model object '<em><b>ValueList</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "code_ValueList")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ValueList extends ValueElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<ValueElement> valueElement = new ArrayList<ValueElement>();

  /**
   * Returns the value of '<em><b>valueElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>valueElement</b></em>' feature
   * @generated
   */
  public List<ValueElement> getValueElement() {
    return valueElement;
  }

  /**
   * Adds to the <em>valueElement</em> feature.
   * 
   * @param valueElementValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToValueElement(ValueElement valueElementValue) {
    if (!valueElement.contains(valueElementValue)) {
      boolean result = valueElement.add(valueElementValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>valueElement</em> feature.
   * 
   * @param valueElementValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromValueElement(ValueElement valueElementValue) {
    if (valueElement.contains(valueElementValue)) {
      boolean result = valueElement.remove(valueElementValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>valueElement</em> feature.
   * 
   * @generated
   */
  public void clearValueElement() {
    while (!valueElement.isEmpty()) {
      removeFromValueElement(valueElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link ValueList#getValueElement() <em>valueElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newValueElement
   *          the new value of the '{@link ValueList#getValueElement() valueElement}' feature.
   * @generated
   */
  public void setValueElement(List<ValueElement> newValueElement) {
    valueElement = newValueElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ValueList ";
  }
}
