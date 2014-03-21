package org.eclipse.graphiti.mm;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>PropertyContainer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "mm_PropertyContainer")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class PropertyContainer extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<Property> properties = new HashSet<Property>();

  /**
   * Returns the value of '<em><b>properties</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>properties</b></em>' feature
   * @generated
   */
  public Set<Property> getProperties() {
    return properties;
  }

  /**
   * Adds to the <em>properties</em> feature.
   * 
   * @param propertiesValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToProperties(Property propertiesValue) {
    if (!properties.contains(propertiesValue)) {
      boolean result = properties.add(propertiesValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>properties</em> feature.
   * 
   * @param propertiesValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromProperties(Property propertiesValue) {
    if (properties.contains(propertiesValue)) {
      boolean result = properties.remove(propertiesValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>properties</em> feature.
   * 
   * @generated
   */
  public void clearProperties() {
    while (!properties.isEmpty()) {
      removeFromProperties(properties.iterator().next());
    }
  }

  /**
   * Sets the '{@link PropertyContainer#getProperties() <em>properties</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newProperties
   *          the new value of the '{@link PropertyContainer#getProperties() properties}' feature.
   * @generated
   */
  public void setProperties(Set<Property> newProperties) {
    properties = newProperties;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PropertyContainer ";
  }
}
