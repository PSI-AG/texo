package org.eclipse.modisco.kdm.data;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>DataContainer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "data_DataContainer")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class DataContainer extends DataResource {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<DataResource> dataElement = new HashSet<DataResource>();

  /**
   * Returns the value of '<em><b>dataElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>dataElement</b></em>' feature
   * @generated
   */
  public Set<DataResource> getDataElement() {
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
  public boolean addToDataElement(DataResource dataElementValue) {
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
  public boolean removeFromDataElement(DataResource dataElementValue) {
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
   * Sets the '{@link DataContainer#getDataElement() <em>dataElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDataElement
   *          the new value of the '{@link DataContainer#getDataElement() dataElement}' feature.
   * @generated
   */
  public void setDataElement(Set<DataResource> newDataElement) {
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
    return "DataContainer ";
  }
}
