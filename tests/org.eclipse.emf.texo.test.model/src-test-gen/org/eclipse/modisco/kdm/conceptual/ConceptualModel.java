package org.eclipse.modisco.kdm.conceptual;

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
 * A representation of the model object '<em><b>ConceptualModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "conceptual_ConceptualModel")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ConceptualModel extends KDMModel {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractConceptualElement> conceptualElement = new HashSet<AbstractConceptualElement>();

  /**
   * Returns the value of '<em><b>conceptualElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>conceptualElement</b></em>' feature
   * @generated
   */
  public Set<AbstractConceptualElement> getConceptualElement() {
    return conceptualElement;
  }

  /**
   * Adds to the <em>conceptualElement</em> feature.
   * 
   * @param conceptualElementValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToConceptualElement(AbstractConceptualElement conceptualElementValue) {
    if (!conceptualElement.contains(conceptualElementValue)) {
      boolean result = conceptualElement.add(conceptualElementValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>conceptualElement</em> feature.
   * 
   * @param conceptualElementValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromConceptualElement(AbstractConceptualElement conceptualElementValue) {
    if (conceptualElement.contains(conceptualElementValue)) {
      boolean result = conceptualElement.remove(conceptualElementValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>conceptualElement</em> feature.
   * 
   * @generated
   */
  public void clearConceptualElement() {
    while (!conceptualElement.isEmpty()) {
      removeFromConceptualElement(conceptualElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link ConceptualModel#getConceptualElement() <em>conceptualElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newConceptualElement
   *          the new value of the '{@link ConceptualModel#getConceptualElement() conceptualElement}' feature.
   * @generated
   */
  public void setConceptualElement(Set<AbstractConceptualElement> newConceptualElement) {
    conceptualElement = newConceptualElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ConceptualModel ";
  }
}
