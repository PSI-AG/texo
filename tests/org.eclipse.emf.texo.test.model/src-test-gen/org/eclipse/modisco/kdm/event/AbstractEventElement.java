package org.eclipse.modisco.kdm.event;

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
 * A representation of the model object '<em><b>AbstractEventElement</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "event_AbstractEventElement")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class AbstractEventElement extends KDMEntity {

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
  private Set<AbstractEventRelationship> eventRelation = new HashSet<AbstractEventRelationship>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<ActionElement> abstraction = new ArrayList<ActionElement>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Set<AbstractCodeElement> implementation = new HashSet<AbstractCodeElement>();

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
   * Sets the '{@link AbstractEventElement#getSource() <em>source</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSource
   *          the new value of the '{@link AbstractEventElement#getSource() source}' feature.
   * @generated
   */
  public void setSource(Set<SourceRef> newSource) {
    source = newSource;
  }

  /**
   * Returns the value of '<em><b>eventRelation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>eventRelation</b></em>' feature
   * @generated
   */
  public Set<AbstractEventRelationship> getEventRelation() {
    return eventRelation;
  }

  /**
   * Adds to the <em>eventRelation</em> feature.
   * 
   * @param eventRelationValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToEventRelation(AbstractEventRelationship eventRelationValue) {
    if (!eventRelation.contains(eventRelationValue)) {
      boolean result = eventRelation.add(eventRelationValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>eventRelation</em> feature.
   * 
   * @param eventRelationValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromEventRelation(AbstractEventRelationship eventRelationValue) {
    if (eventRelation.contains(eventRelationValue)) {
      boolean result = eventRelation.remove(eventRelationValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>eventRelation</em> feature.
   * 
   * @generated
   */
  public void clearEventRelation() {
    while (!eventRelation.isEmpty()) {
      removeFromEventRelation(eventRelation.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractEventElement#getEventRelation() <em>eventRelation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEventRelation
   *          the new value of the '{@link AbstractEventElement#getEventRelation() eventRelation}' feature.
   * @generated
   */
  public void setEventRelation(Set<AbstractEventRelationship> newEventRelation) {
    eventRelation = newEventRelation;
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
   * Sets the '{@link AbstractEventElement#getAbstraction() <em>abstraction</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAbstraction
   *          the new value of the '{@link AbstractEventElement#getAbstraction() abstraction}' feature.
   * @generated
   */
  public void setAbstraction(List<ActionElement> newAbstraction) {
    abstraction = newAbstraction;
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
   * Sets the '{@link AbstractEventElement#getImplementation() <em>implementation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newImplementation
   *          the new value of the '{@link AbstractEventElement#getImplementation() implementation}' feature.
   * @generated
   */
  public void setImplementation(Set<AbstractCodeElement> newImplementation) {
    implementation = newImplementation;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractEventElement ";
  }
}
