package org.eclipse.modisco.kdm.code;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ParameterUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "code_ParameterUnit")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ParameterUnit extends DataElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Enumerated(EnumType.STRING)
  private ParameterKind kind = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer pos = null;

  /**
   * Returns the value of '<em><b>kind</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>kind</b></em>' feature
   * @generated
   */
  public ParameterKind getKind() {
    return kind;
  }

  /**
   * Sets the '{@link ParameterUnit#getKind() <em>kind</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newKind
   *          the new value of the '{@link ParameterUnit#getKind() kind}' feature.
   * @generated
   */
  public void setKind(ParameterKind newKind) {
    kind = newKind;
  }

  /**
   * Returns the value of '<em><b>pos</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>pos</b></em>' feature
   * @generated
   */
  public Integer getPos() {
    return pos;
  }

  /**
   * Sets the '{@link ParameterUnit#getPos() <em>pos</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPos
   *          the new value of the '{@link ParameterUnit#getPos() pos}' feature.
   * @generated
   */
  public void setPos(Integer newPos) {
    pos = newPos;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ParameterUnit " + " [kind: " + getKind() + "]" + " [pos: " + getPos() + "]";
  }
}
