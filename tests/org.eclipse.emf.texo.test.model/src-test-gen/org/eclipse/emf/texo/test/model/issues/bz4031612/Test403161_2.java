package org.eclipse.emf.texo.test.model.issues.bz4031612;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.issues.bz4031611.Test403161_1;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Test403161_2</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "bz403161_2_Test403161_2")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Test403161_2 extends Test403161_1 {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String subName = null;

  /**
   * Returns the value of '<em><b>subName</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>subName</b></em>' feature
   * @generated
   */
  public String getSubName() {
    return subName;
  }

  /**
   * Sets the '{@link Test403161_2#getSubName() <em>subName</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSubName
   *          the new value of the '{@link Test403161_2#getSubName() subName}' feature.
   * @generated
   */
  public void setSubName(String newSubName) {
    subName = newSubName;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Test403161_2 " + " [subName: " + getSubName() + "]";
  }
}
