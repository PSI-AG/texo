package org.eclipse.emf.texo.test.model.issues.bz379815;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>VarInputType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "bz379815_VarInputType")
@Table(name = "DPL_bz379815_VarInputType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class VarInputType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL })
  @JoinColumns({ @JoinColumn(name = "test_condition") })
  private VarConditionType condition = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Column(name = "measure")
  private String measure = null;

  /**
   * Returns the value of '<em><b>condition</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>condition</b></em>' feature
   * @generated
   */
  public VarConditionType getCondition() {
    return condition;
  }

  /**
   * Sets the '{@link VarInputType#getCondition() <em>condition</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCondition
   *          the new value of the '{@link VarInputType#getCondition() condition}' feature.
   * @generated
   */
  public void setCondition(VarConditionType newCondition) {
    condition = newCondition;
  }

  /**
   * Returns the value of '<em><b>measure</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>measure</b></em>' feature
   * @generated
   */
  public String getMeasure() {
    return measure;
  }

  /**
   * Sets the '{@link VarInputType#getMeasure() <em>measure</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMeasure
   *          the new value of the '{@link VarInputType#getMeasure() measure}' feature.
   * @generated
   */
  public void setMeasure(String newMeasure) {
    measure = newMeasure;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "VarInputType " + " [measure: " + getMeasure() + "]";
  }
}
