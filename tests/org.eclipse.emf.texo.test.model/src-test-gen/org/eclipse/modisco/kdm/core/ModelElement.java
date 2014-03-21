package org.eclipse.modisco.kdm.core;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.kdm.ExtendedValue;
import org.eclipse.modisco.kdm.kdm.Stereotype;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ModelElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> A model element is an element that represents some aspect of the existing system. In the
 * meta-model, a ModelElement is the base for all meta-elements of KDM. All other meta-elements are either direct or
 * indirect subclasses of ModelElement. ModelElement is an abstract meta-model element. A ModelElement can be extended
 * through the lightweight extension mechanism. <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "core_ModelElement")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class ModelElement extends Element {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of stereotype applied to current
   * element. <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Set<Stereotype> stereotype = new HashSet<Stereotype>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of tagged values determined by the
   * stereotype. <!-- end-model-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<ExtendedValue> taggedValue = new HashSet<ExtendedValue>();

  /**
   * Returns the value of '<em><b>stereotype</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of stereotype applied to current
   * element. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>stereotype</b></em>' feature
   * @generated
   */
  public Set<Stereotype> getStereotype() {
    return stereotype;
  }

  /**
   * Adds to the <em>stereotype</em> feature.
   * 
   * @param stereotypeValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToStereotype(Stereotype stereotypeValue) {
    if (!stereotype.contains(stereotypeValue)) {
      boolean result = stereotype.add(stereotypeValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>stereotype</em> feature.
   * 
   * @param stereotypeValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromStereotype(Stereotype stereotypeValue) {
    if (stereotype.contains(stereotypeValue)) {
      boolean result = stereotype.remove(stereotypeValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>stereotype</em> feature.
   * 
   * @generated
   */
  public void clearStereotype() {
    while (!stereotype.isEmpty()) {
      removeFromStereotype(stereotype.iterator().next());
    }
  }

  /**
   * Sets the '{@link ModelElement#getStereotype() <em>stereotype</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of stereotype applied to current
   * element. <!-- end-model-doc -->
   * 
   * @param newStereotype
   *          the new value of the '{@link ModelElement#getStereotype() stereotype}' feature.
   * @generated
   */
  public void setStereotype(Set<Stereotype> newStereotype) {
    stereotype = newStereotype;
  }

  /**
   * Returns the value of '<em><b>taggedValue</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of tagged values determined by the
   * stereotype. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>taggedValue</b></em>' feature
   * @generated
   */
  public Set<ExtendedValue> getTaggedValue() {
    return taggedValue;
  }

  /**
   * Adds to the <em>taggedValue</em> feature.
   * 
   * @param taggedValueValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToTaggedValue(ExtendedValue taggedValueValue) {
    if (!taggedValue.contains(taggedValueValue)) {
      boolean result = taggedValue.add(taggedValueValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>taggedValue</em> feature.
   * 
   * @param taggedValueValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromTaggedValue(ExtendedValue taggedValueValue) {
    if (taggedValue.contains(taggedValueValue)) {
      boolean result = taggedValue.remove(taggedValueValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>taggedValue</em> feature.
   * 
   * @generated
   */
  public void clearTaggedValue() {
    while (!taggedValue.isEmpty()) {
      removeFromTaggedValue(taggedValue.iterator().next());
    }
  }

  /**
   * Sets the '{@link ModelElement#getTaggedValue() <em>taggedValue</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of tagged values determined by the
   * stereotype. <!-- end-model-doc -->
   * 
   * @param newTaggedValue
   *          the new value of the '{@link ModelElement#getTaggedValue() taggedValue}' feature.
   * @generated
   */
  public void setTaggedValue(Set<ExtendedValue> newTaggedValue) {
    taggedValue = newTaggedValue;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ModelElement ";
  }
}
