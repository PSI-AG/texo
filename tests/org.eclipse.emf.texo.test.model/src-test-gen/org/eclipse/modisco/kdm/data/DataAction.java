package org.eclipse.modisco.kdm.data;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.action.ActionElement;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>DataAction</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "data_DataAction")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class DataAction extends AbstractDataElement {

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
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Set<ActionElement> implementation = new HashSet<ActionElement>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<DataEvent> dataElement = new HashSet<DataEvent>();

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
   * Sets the '{@link DataAction#getKind() <em>kind</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newKind
   *          the new value of the '{@link DataAction#getKind() kind}' feature.
   * @generated
   */
  public void setKind(String newKind) {
    kind = newKind;
  }

  /**
   * Returns the value of '<em><b>implementation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>implementation</b></em>' feature
   * @generated
   */
  public Set<ActionElement> getImplementation() {
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
  public boolean addToImplementation(ActionElement implementationValue) {
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
  public boolean removeFromImplementation(ActionElement implementationValue) {
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
   * Sets the '{@link DataAction#getImplementation() <em>implementation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newImplementation
   *          the new value of the '{@link DataAction#getImplementation() implementation}' feature.
   * @generated
   */
  public void setImplementation(Set<ActionElement> newImplementation) {
    implementation = newImplementation;
  }

  /**
   * Returns the value of '<em><b>dataElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>dataElement</b></em>' feature
   * @generated
   */
  public Set<DataEvent> getDataElement() {
    return dataElement;
  }

  /**
   * Adds to the <em>dataElement</em> feature.
   * 
   * @param dataElementValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToDataElement(DataEvent dataElementValue) {
    if (!dataElement.contains(dataElementValue)) {
      boolean result = dataElement.add(dataElementValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>dataElement</em> feature.
   * 
   * @param dataElementValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromDataElement(DataEvent dataElementValue) {
    if (dataElement.contains(dataElementValue)) {
      boolean result = dataElement.remove(dataElementValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>dataElement</em> feature.
   * 
   * @generated
   */
  public void clearDataElement() {
    while (!dataElement.isEmpty()) {
      removeFromDataElement(dataElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link DataAction#getDataElement() <em>dataElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDataElement
   *          the new value of the '{@link DataAction#getDataElement() dataElement}' feature.
   * @generated
   */
  public void setDataElement(Set<DataEvent> newDataElement) {
    dataElement = newDataElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "DataAction " + " [kind: " + getKind() + "]";
  }
}
