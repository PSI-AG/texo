package org.eclipse.emf.texo.test.model.issues.bz411874;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Lob;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>EClassA</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "bz411874_EClassA")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class EClassA extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Lob()
  private byte[] byteArray = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Lob()
  private byte[] base64 = null;

  /**
   * Returns the value of '<em><b>byteArray</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>byteArray</b></em>' feature
   * @generated
   */
  public byte[] getByteArray() {
    return byteArray;
  }

  /**
   * Sets the '{@link EClassA#getByteArray() <em>byteArray</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newByteArray
   *          the new value of the '{@link EClassA#getByteArray() byteArray}' feature.
   * @generated
   */
  public void setByteArray(byte[] newByteArray) {
    byteArray = newByteArray;
  }

  /**
   * Returns the value of '<em><b>base64</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>base64</b></em>' feature
   * @generated
   */
  public byte[] getBase64() {
    return base64;
  }

  /**
   * Sets the '{@link EClassA#getBase64() <em>base64</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBase64
   *          the new value of the '{@link EClassA#getBase64() base64}' feature.
   * @generated
   */
  public void setBase64(byte[] newBase64) {
    base64 = newBase64;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "EClassA " + " [byteArray: " + getByteArray() + "]" + " [base64: " + getBase64() + "]";
  }
}
