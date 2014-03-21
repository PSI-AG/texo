package org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>CType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "nestedgroup_CType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class CType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String cname = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private double cvalue = 0.0;

  /**
   * Returns the value of '<em><b>cname</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>cname</b></em>' feature
   * @generated
   */
  public String getCname() {
    return cname;
  }

  /**
   * Sets the '{@link CType#getCname() <em>cname</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCname
   *          the new value of the '{@link CType#getCname() cname}' feature.
   * @generated
   */
  public void setCname(String newCname) {
    cname = newCname;
  }

  /**
   * Returns the value of '<em><b>cvalue</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>cvalue</b></em>' feature
   * @generated
   */
  public double getCvalue() {
    return cvalue;
  }

  /**
   * Sets the '{@link CType#getCvalue() <em>cvalue</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCvalue
   *          the new value of the '{@link CType#getCvalue() cvalue}' feature.
   * @generated
   */
  public void setCvalue(double newCvalue) {
    cvalue = newCvalue;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "CType " + " [cname: " + getCname() + "]" + " [cvalue: " + getCvalue() + "]";
  }
}
