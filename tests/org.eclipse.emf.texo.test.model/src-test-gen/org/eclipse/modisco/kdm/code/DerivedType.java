package org.eclipse.modisco.kdm.code;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>DerivedType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "code_DerivedType")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class DerivedType extends Datatype {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true)
  private ItemUnit itemUnit = null;

  /**
   * Returns the value of '<em><b>itemUnit</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>itemUnit</b></em>' feature
   * @generated
   */
  public ItemUnit getItemUnit() {
    return itemUnit;
  }

  /**
   * Sets the '{@link DerivedType#getItemUnit() <em>itemUnit</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newItemUnit
   *          the new value of the '{@link DerivedType#getItemUnit() itemUnit}' feature.
   * @generated
   */
  public void setItemUnit(ItemUnit newItemUnit) {
    itemUnit = newItemUnit;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "DerivedType ";
  }
}
