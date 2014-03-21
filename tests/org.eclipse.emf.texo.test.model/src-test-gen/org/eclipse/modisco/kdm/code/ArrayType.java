package org.eclipse.modisco.kdm.code;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ArrayType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "code_ArrayType")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ArrayType extends DerivedType {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer size = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true)
  private IndexUnit indexUnit = null;

  /**
   * Returns the value of '<em><b>size</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>size</b></em>' feature
   * @generated
   */
  public Integer getSize() {
    return size;
  }

  /**
   * Sets the '{@link ArrayType#getSize() <em>size</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSize
   *          the new value of the '{@link ArrayType#getSize() size}' feature.
   * @generated
   */
  public void setSize(Integer newSize) {
    size = newSize;
  }

  /**
   * Returns the value of '<em><b>indexUnit</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>indexUnit</b></em>' feature
   * @generated
   */
  public IndexUnit getIndexUnit() {
    return indexUnit;
  }

  /**
   * Sets the '{@link ArrayType#getIndexUnit() <em>indexUnit</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newIndexUnit
   *          the new value of the '{@link ArrayType#getIndexUnit() indexUnit}' feature.
   * @generated
   */
  public void setIndexUnit(IndexUnit newIndexUnit) {
    indexUnit = newIndexUnit;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ArrayType " + " [size: " + getSize() + "]";
  }
}
