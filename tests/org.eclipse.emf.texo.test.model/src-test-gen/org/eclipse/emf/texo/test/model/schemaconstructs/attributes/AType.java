package org.eclipse.emf.texo.test.model.schemaconstructs.attributes;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "attributes_AType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class AType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Long b = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String c = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String id = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String d = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Convert("TexoTestObjectConverter")
  private Object myR = null;

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link AType#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link AType#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>b</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>b</b></em>' feature
   * @generated
   */
  public Long getB() {
    return b;
  }

  /**
   * Sets the '{@link AType#getB() <em>b</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newB
   *          the new value of the '{@link AType#getB() b}' feature.
   * @generated
   */
  public void setB(Long newB) {
    b = newB;
  }

  /**
   * Returns the value of '<em><b>c</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>c</b></em>' feature
   * @generated
   */
  public String getC() {
    return c;
  }

  /**
   * Sets the '{@link AType#getC() <em>c</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newC
   *          the new value of the '{@link AType#getC() c}' feature.
   * @generated
   */
  public void setC(String newC) {
    c = newC;
  }

  /**
   * Returns the value of '<em><b>id</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>id</b></em>' feature
   * @generated
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the '{@link AType#getId() <em>id</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newId
   *          the new value of the '{@link AType#getId() id}' feature.
   * @generated
   */
  public void setId(String newId) {
    id = newId;
  }

  /**
   * Returns the value of '<em><b>d</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>d</b></em>' feature
   * @generated
   */
  public String getD() {
    return d;
  }

  /**
   * Sets the '{@link AType#getD() <em>d</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newD
   *          the new value of the '{@link AType#getD() d}' feature.
   * @generated
   */
  public void setD(String newD) {
    d = newD;
  }

  /**
   * Returns the value of '<em><b>myR</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>myR</b></em>' feature
   * @generated
   */
  public Object getMyR() {
    return myR;
  }

  /**
   * Sets the '{@link AType#getMyR() <em>myR</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMyR
   *          the new value of the '{@link AType#getMyR() myR}' feature.
   * @generated
   */
  public void setMyR(Object newMyR) {
    myR = newMyR;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AType " + " [name: " + getName() + "]" + " [b: " + getB() + "]" + " [c: " + getC() + "]" + " [id: "
        + getId() + "]" + " [d: " + getD() + "]";
  }
}
