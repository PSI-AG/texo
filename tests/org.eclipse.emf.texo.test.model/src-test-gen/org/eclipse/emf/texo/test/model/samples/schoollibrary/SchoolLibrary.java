package org.eclipse.emf.texo.test.model.samples.schoollibrary;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.samples.library.Library;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>SchoolLibrary</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "schoollibrary_SchoolLibrary")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class SchoolLibrary extends Library {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String location = null;

  /**
   * Returns the value of '<em><b>location</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>location</b></em>' feature
   * @generated
   */
  public String getLocation() {
    return location;
  }

  /**
   * Sets the '{@link SchoolLibrary#getLocation() <em>location</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLocation
   *          the new value of the '{@link SchoolLibrary#getLocation() location}' feature.
   * @generated
   */
  public void setLocation(String newLocation) {
    location = newLocation;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SchoolLibrary " + " [location: " + getLocation() + "]";
  }
}
