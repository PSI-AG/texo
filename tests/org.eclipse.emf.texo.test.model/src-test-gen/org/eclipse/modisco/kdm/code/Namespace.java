package org.eclipse.modisco.kdm.code;

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
 * A representation of the model object '<em><b>Namespace</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "code_Namespace")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Namespace extends CodeItem {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Set<CodeItem> groupedCode = new HashSet<CodeItem>();

  /**
   * Returns the value of '<em><b>groupedCode</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>groupedCode</b></em>' feature
   * @generated
   */
  public Set<CodeItem> getGroupedCode() {
    return groupedCode;
  }

  /**
   * Adds to the <em>groupedCode</em> feature.
   * 
   * @param groupedCodeValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToGroupedCode(CodeItem groupedCodeValue) {
    if (!groupedCode.contains(groupedCodeValue)) {
      boolean result = groupedCode.add(groupedCodeValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>groupedCode</em> feature.
   * 
   * @param groupedCodeValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromGroupedCode(CodeItem groupedCodeValue) {
    if (groupedCode.contains(groupedCodeValue)) {
      boolean result = groupedCode.remove(groupedCodeValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>groupedCode</em> feature.
   * 
   * @generated
   */
  public void clearGroupedCode() {
    while (!groupedCode.isEmpty()) {
      removeFromGroupedCode(groupedCode.iterator().next());
    }
  }

  /**
   * Sets the '{@link Namespace#getGroupedCode() <em>groupedCode</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGroupedCode
   *          the new value of the '{@link Namespace#getGroupedCode() groupedCode}' feature.
   * @generated
   */
  public void setGroupedCode(Set<CodeItem> newGroupedCode) {
    groupedCode = newGroupedCode;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Namespace ";
  }
}
