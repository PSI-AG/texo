package org.eclipse.modisco.kdm.conceptual;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ConceptualRole</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "conceptual_ConceptualRole")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ConceptualRole extends AbstractConceptualElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private AbstractConceptualElement conceptualElement = null;

  /**
   * Returns the value of '<em><b>conceptualElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>conceptualElement</b></em>' feature
   * @generated
   */
  public AbstractConceptualElement getConceptualElement() {
    return conceptualElement;
  }

  /**
   * Sets the '{@link ConceptualRole#getConceptualElement() <em>conceptualElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newConceptualElement
   *          the new value of the '{@link ConceptualRole#getConceptualElement() conceptualElement}' feature.
   * @generated
   */
  public void setConceptualElement(AbstractConceptualElement newConceptualElement) {
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
    return "ConceptualRole ";
  }
}
