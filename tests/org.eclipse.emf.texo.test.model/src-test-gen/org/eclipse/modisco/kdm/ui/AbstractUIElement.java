package org.eclipse.modisco.kdm.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.action.ActionElement;
import org.eclipse.modisco.kdm.code.AbstractCodeElement;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.source.SourceRef;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AbstractUIElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "ui_AbstractUIElement")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class AbstractUIElement extends KDMEntity {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<SourceRef> source = new HashSet<SourceRef>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractUIRelationship> uIRelation = new HashSet<AbstractUIRelationship>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Set<AbstractCodeElement> implementation = new HashSet<AbstractCodeElement>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<ActionElement> abstraction = new ArrayList<ActionElement>();

  /**
   * Returns the value of '<em><b>source</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>source</b></em>' feature
   * @generated
   */
  public Set<SourceRef> getSource() {
    return source;
  }

  /**
   * Adds to the <em>source</em> feature.
   * 
   * @param sourceValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToSource(SourceRef sourceValue) {
    if (!source.contains(sourceValue)) {
      boolean result = source.add(sourceValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>source</em> feature.
   * 
   * @param sourceValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromSource(SourceRef sourceValue) {
    if (source.contains(sourceValue)) {
      boolean result = source.remove(sourceValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>source</em> feature.
   * 
   * @generated
   */
  public void clearSource() {
    while (!source.isEmpty()) {
      removeFromSource(source.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractUIElement#getSource() <em>source</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSource
   *          the new value of the '{@link AbstractUIElement#getSource() source}' feature.
   * @generated
   */
  public void setSource(Set<SourceRef> newSource) {
    source = newSource;
  }

  /**
   * Returns the value of '<em><b>UIRelation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>UIRelation</b></em>' feature
   * @generated
   */
  public Set<AbstractUIRelationship> getUIRelation() {
    return uIRelation;
  }

  /**
   * Adds to the <em>UIRelation</em> feature.
   * 
   * @param uIRelationValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToUIRelation(AbstractUIRelationship uIRelationValue) {
    if (!uIRelation.contains(uIRelationValue)) {
      boolean result = uIRelation.add(uIRelationValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>UIRelation</em> feature.
   * 
   * @param uIRelationValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromUIRelation(AbstractUIRelationship uIRelationValue) {
    if (uIRelation.contains(uIRelationValue)) {
      boolean result = uIRelation.remove(uIRelationValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>UIRelation</em> feature.
   * 
   * @generated
   */
  public void clearUIRelation() {
    while (!uIRelation.isEmpty()) {
      removeFromUIRelation(uIRelation.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractUIElement#getUIRelation() <em>UIRelation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newUIRelation
   *          the new value of the '{@link AbstractUIElement#getUIRelation() UIRelation}' feature.
   * @generated
   */
  public void setUIRelation(Set<AbstractUIRelationship> newUIRelation) {
    uIRelation = newUIRelation;
  }

  /**
   * Returns the value of '<em><b>implementation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>implementation</b></em>' feature
   * @generated
   */
  public Set<AbstractCodeElement> getImplementation() {
    return implementation;
  }

  /**
   * Adds to the <em>implementation</em> feature.
   * 
   * @param implementationValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToImplementation(AbstractCodeElement implementationValue) {
    if (!implementation.contains(implementationValue)) {
      boolean result = implementation.add(implementationValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>implementation</em> feature.
   * 
   * @param implementationValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromImplementation(AbstractCodeElement implementationValue) {
    if (implementation.contains(implementationValue)) {
      boolean result = implementation.remove(implementationValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>implementation</em> feature.
   * 
   * @generated
   */
  public void clearImplementation() {
    while (!implementation.isEmpty()) {
      removeFromImplementation(implementation.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractUIElement#getImplementation() <em>implementation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newImplementation
   *          the new value of the '{@link AbstractUIElement#getImplementation() implementation}' feature.
   * @generated
   */
  public void setImplementation(Set<AbstractCodeElement> newImplementation) {
    implementation = newImplementation;
  }

  /**
   * Returns the value of '<em><b>abstraction</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>abstraction</b></em>' feature
   * @generated
   */
  public List<ActionElement> getAbstraction() {
    return abstraction;
  }

  /**
   * Adds to the <em>abstraction</em> feature.
   * 
   * @param abstractionValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToAbstraction(ActionElement abstractionValue) {
    if (!abstraction.contains(abstractionValue)) {
      boolean result = abstraction.add(abstractionValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>abstraction</em> feature.
   * 
   * @param abstractionValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromAbstraction(ActionElement abstractionValue) {
    if (abstraction.contains(abstractionValue)) {
      boolean result = abstraction.remove(abstractionValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>abstraction</em> feature.
   * 
   * @generated
   */
  public void clearAbstraction() {
    while (!abstraction.isEmpty()) {
      removeFromAbstraction(abstraction.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractUIElement#getAbstraction() <em>abstraction</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAbstraction
   *          the new value of the '{@link AbstractUIElement#getAbstraction() abstraction}' feature.
   * @generated
   */
  public void setAbstraction(List<ActionElement> newAbstraction) {
    abstraction = newAbstraction;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractUIElement ";
  }
}
