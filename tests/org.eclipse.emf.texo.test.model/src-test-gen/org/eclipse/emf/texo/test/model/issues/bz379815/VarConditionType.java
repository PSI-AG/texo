package org.eclipse.emf.texo.test.model.issues.bz379815;

import javax.persistence.CascadeType;
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
 * A representation of the model object '<em><b>VarConditionType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "bz379815_VarConditionType")
@Table(name = "DPL_bz379815_VarConditionType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class VarConditionType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL })
  @JoinColumns({ @JoinColumn(name = "bz379815_VarConditionType_policyType") })
  private VarPolicyTypeType policyType = null;

  /**
   * Returns the value of '<em><b>policyType</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>policyType</b></em>' feature
   * @generated
   */
  public VarPolicyTypeType getPolicyType() {
    return policyType;
  }

  /**
   * Sets the '{@link VarConditionType#getPolicyType() <em>policyType</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPolicyType
   *          the new value of the '{@link VarConditionType#getPolicyType() policyType}' feature.
   * @generated
   */
  public void setPolicyType(VarPolicyTypeType newPolicyType) {
    policyType = newPolicyType;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "VarConditionType ";
  }
}
