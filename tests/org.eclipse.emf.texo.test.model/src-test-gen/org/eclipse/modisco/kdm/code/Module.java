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
 * A representation of the model object '<em><b>Module</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "code_Module")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Module extends CodeItem {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<AbstractCodeElement> codeElement = new ArrayList<AbstractCodeElement>();

  /**
   * Returns the value of '<em><b>codeElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>codeElement</b></em>' feature
   * @generated
   */
  public List<AbstractCodeElement> getCodeElement() {
    return codeElement;
  }

  /**
   * Adds to the <em>codeElement</em> feature.
   * 
   * @param codeElementValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToCodeElement(AbstractCodeElement codeElementValue) {
    if (!codeElement.contains(codeElementValue)) {
      boolean result = codeElement.add(codeElementValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>codeElement</em> feature.
   * 
   * @param codeElementValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromCodeElement(AbstractCodeElement codeElementValue) {
    if (codeElement.contains(codeElementValue)) {
      boolean result = codeElement.remove(codeElementValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>codeElement</em> feature.
   * 
   * @generated
   */
  public void clearCodeElement() {
    while (!codeElement.isEmpty()) {
      removeFromCodeElement(codeElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link Module#getCodeElement() <em>codeElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCodeElement
   *          the new value of the '{@link Module#getCodeElement() codeElement}' feature.
   * @generated
   */
  public void setCodeElement(List<AbstractCodeElement> newCodeElement) {
    codeElement = newCodeElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Module ";
  }
}
