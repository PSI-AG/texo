package org.eclipse.modisco.kdm.data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.action.ActionElement;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.source.SourceRef;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AbstractDataElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "data_AbstractDataElement")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class AbstractDataElement extends KDMEntity {

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
  private Set<AbstractDataRelationship> dataRelation = new HashSet<AbstractDataRelationship>();

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
   * Sets the '{@link AbstractDataElement#getSource() <em>source</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSource
   *          the new value of the '{@link AbstractDataElement#getSource() source}' feature.
   * @generated
   */
  public void setSource(Set<SourceRef> newSource) {
    source = newSource;
  }

  /**
   * Returns the value of '<em><b>dataRelation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>dataRelation</b></em>' feature
   * @generated
   */
  public Set<AbstractDataRelationship> getDataRelation() {
    return dataRelation;
  }

  /**
   * Adds to the <em>dataRelation</em> feature.
   * 
   * @param dataRelationValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToDataRelation(AbstractDataRelationship dataRelationValue) {
    if (!dataRelation.contains(dataRelationValue)) {
      boolean result = dataRelation.add(dataRelationValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>dataRelation</em> feature.
   * 
   * @param dataRelationValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromDataRelation(AbstractDataRelationship dataRelationValue) {
    if (dataRelation.contains(dataRelationValue)) {
      boolean result = dataRelation.remove(dataRelationValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>dataRelation</em> feature.
   * 
   * @generated
   */
  public void clearDataRelation() {
    while (!dataRelation.isEmpty()) {
      removeFromDataRelation(dataRelation.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractDataElement#getDataRelation() <em>dataRelation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDataRelation
   *          the new value of the '{@link AbstractDataElement#getDataRelation() dataRelation}' feature.
   * @generated
   */
  public void setDataRelation(Set<AbstractDataRelationship> newDataRelation) {
    dataRelation = newDataRelation;
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
   * Sets the '{@link AbstractDataElement#getAbstraction() <em>abstraction</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAbstraction
   *          the new value of the '{@link AbstractDataElement#getAbstraction() abstraction}' feature.
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
    return "AbstractDataElement ";
  }
}
