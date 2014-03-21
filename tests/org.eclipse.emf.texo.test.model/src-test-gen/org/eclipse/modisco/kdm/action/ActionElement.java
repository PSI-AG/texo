package org.eclipse.modisco.kdm.action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.code.AbstractCodeElement;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ActionElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "action_ActionElement")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ActionElement extends AbstractCodeElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String kind = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractCodeElement> codeElement = new HashSet<AbstractCodeElement>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<AbstractActionRelationship> actionRelation = new ArrayList<AbstractActionRelationship>();

  /**
   * Returns the value of '<em><b>kind</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>kind</b></em>' feature
   * @generated
   */
  public String getKind() {
    return kind;
  }

  /**
   * Sets the '{@link ActionElement#getKind() <em>kind</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newKind
   *          the new value of the '{@link ActionElement#getKind() kind}' feature.
   * @generated
   */
  public void setKind(String newKind) {
    kind = newKind;
  }

  /**
   * Returns the value of '<em><b>codeElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>codeElement</b></em>' feature
   * @generated
   */
  public Set<AbstractCodeElement> getCodeElement() {
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
   * Sets the '{@link ActionElement#getCodeElement() <em>codeElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCodeElement
   *          the new value of the '{@link ActionElement#getCodeElement() codeElement}' feature.
   * @generated
   */
  public void setCodeElement(Set<AbstractCodeElement> newCodeElement) {
    codeElement = newCodeElement;
  }

  /**
   * Returns the value of '<em><b>actionRelation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>actionRelation</b></em>' feature
   * @generated
   */
  public List<AbstractActionRelationship> getActionRelation() {
    return actionRelation;
  }

  /**
   * Adds to the <em>actionRelation</em> feature.
   * 
   * @param actionRelationValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToActionRelation(AbstractActionRelationship actionRelationValue) {
    if (!actionRelation.contains(actionRelationValue)) {
      boolean result = actionRelation.add(actionRelationValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>actionRelation</em> feature.
   * 
   * @param actionRelationValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromActionRelation(AbstractActionRelationship actionRelationValue) {
    if (actionRelation.contains(actionRelationValue)) {
      boolean result = actionRelation.remove(actionRelationValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>actionRelation</em> feature.
   * 
   * @generated
   */
  public void clearActionRelation() {
    while (!actionRelation.isEmpty()) {
      removeFromActionRelation(actionRelation.iterator().next());
    }
  }

  /**
   * Sets the '{@link ActionElement#getActionRelation() <em>actionRelation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newActionRelation
   *          the new value of the '{@link ActionElement#getActionRelation() actionRelation}' feature.
   * @generated
   */
  public void setActionRelation(List<AbstractActionRelationship> newActionRelation) {
    actionRelation = newActionRelation;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ActionElement " + " [kind: " + getKind() + "]";
  }
}
