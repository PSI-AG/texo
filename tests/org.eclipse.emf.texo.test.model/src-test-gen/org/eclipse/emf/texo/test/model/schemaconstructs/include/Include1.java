package org.eclipse.emf.texo.test.model.schemaconstructs.include;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Include1</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "include_Include1")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Include1 extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String code = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private Include2 include2 = null;

  /**
   * Returns the value of '<em><b>code</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>code</b></em>' feature
   * @generated
   */
  public String getCode() {
    return code;
  }

  /**
   * Sets the '{@link Include1#getCode() <em>code</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCode
   *          the new value of the '{@link Include1#getCode() code}' feature.
   * @generated
   */
  public void setCode(String newCode) {
    code = newCode;
  }

  /**
   * Returns the value of '<em><b>include2</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>include2</b></em>' feature
   * @generated
   */
  public Include2 getInclude2() {
    return include2;
  }

  /**
   * Sets the '{@link Include1#getInclude2() <em>include2</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newInclude2
   *          the new value of the '{@link Include1#getInclude2() include2}' feature.
   * @generated
   */
  public void setInclude2(Include2 newInclude2) {
    include2 = newInclude2;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Include1 " + " [code: " + getCode() + "]";
  }
}
