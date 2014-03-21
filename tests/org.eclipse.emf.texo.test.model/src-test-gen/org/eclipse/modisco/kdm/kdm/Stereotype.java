package org.eclipse.modisco.kdm.kdm;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.core.Element;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Stereotype</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "kdm_Stereotype")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Stereotype extends Element {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<TagDefinition> tag = new HashSet<TagDefinition>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String type = null;

  /**
   * Returns the value of '<em><b>tag</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>tag</b></em>' feature
   * @generated
   */
  public Set<TagDefinition> getTag() {
    return tag;
  }

  /**
   * Adds to the <em>tag</em> feature.
   * 
   * @param tagValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToTag(TagDefinition tagValue) {
    if (!tag.contains(tagValue)) {
      boolean result = tag.add(tagValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>tag</em> feature.
   * 
   * @param tagValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromTag(TagDefinition tagValue) {
    if (tag.contains(tagValue)) {
      boolean result = tag.remove(tagValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>tag</em> feature.
   * 
   * @generated
   */
  public void clearTag() {
    while (!tag.isEmpty()) {
      removeFromTag(tag.iterator().next());
    }
  }

  /**
   * Sets the '{@link Stereotype#getTag() <em>tag</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTag
   *          the new value of the '{@link Stereotype#getTag() tag}' feature.
   * @generated
   */
  public void setTag(Set<TagDefinition> newTag) {
    tag = newTag;
  }

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link Stereotype#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Stereotype#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>type</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>type</b></em>' feature
   * @generated
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the '{@link Stereotype#getType() <em>type</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newType
   *          the new value of the '{@link Stereotype#getType() type}' feature.
   * @generated
   */
  public void setType(String newType) {
    type = newType;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Stereotype " + " [name: " + getName() + "]" + " [type: " + getType() + "]";
  }
}
