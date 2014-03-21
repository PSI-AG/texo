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
 * A representation of the model object '<em><b>MethodUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "code_MethodUnit")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class MethodUnit extends ControlElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Enumerated(EnumType.STRING)
  private MethodKind kind = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Enumerated(EnumType.STRING)
  private ExportKind export = null;

  /**
   * Returns the value of '<em><b>kind</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>kind</b></em>' feature
   * @generated
   */
  public MethodKind getKind() {
    return kind;
  }

  /**
   * Sets the '{@link MethodUnit#getKind() <em>kind</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newKind
   *          the new value of the '{@link MethodUnit#getKind() kind}' feature.
   * @generated
   */
  public void setKind(MethodKind newKind) {
    kind = newKind;
  }

  /**
   * Returns the value of '<em><b>export</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>export</b></em>' feature
   * @generated
   */
  public ExportKind getExport() {
    return export;
  }

  /**
   * Sets the '{@link MethodUnit#getExport() <em>export</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newExport
   *          the new value of the '{@link MethodUnit#getExport() export}' feature.
   * @generated
   */
  public void setExport(ExportKind newExport) {
    export = newExport;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "MethodUnit " + " [kind: " + getKind() + "]" + " [export: " + getExport() + "]";
  }
}
