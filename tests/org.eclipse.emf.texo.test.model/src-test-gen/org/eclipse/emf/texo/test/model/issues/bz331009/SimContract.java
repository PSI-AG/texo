package org.eclipse.emf.texo.test.model.issues.bz331009;

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
 * A representation of the model object '<em><b>SimContract</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> Информация о контракте с оператором сотовой связи <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_SimContract")
@Table(name = "m_SimContract")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class SimContract extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер контракта <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "contractNumber")
  private String contractNumber = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Название <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "name")
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Описание <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "descritpion")
  private String descritpion = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Платежная информация по договору <!--
   * end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_SimContract_paymentInfo") })
  private PaymentInfo paymentInfo = null;

  /**
   * Returns the value of '<em><b>contractNumber</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер контракта <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>contractNumber</b></em>' feature
   * @generated
   */
  public String getContractNumber() {
    return contractNumber;
  }

  /**
   * Sets the '{@link SimContract#getContractNumber() <em>contractNumber</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер контракта <!-- end-model-doc -->
   * 
   * @param newContractNumber
   *          the new value of the '{@link SimContract#getContractNumber() contractNumber}' feature.
   * @generated
   */
  public void setContractNumber(String newContractNumber) {
    contractNumber = newContractNumber;
  }

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Название <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link SimContract#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Название <!-- end-model-doc -->
   * 
   * @param newName
   *          the new value of the '{@link SimContract#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>descritpion</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Описание <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>descritpion</b></em>' feature
   * @generated
   */
  public String getDescritpion() {
    return descritpion;
  }

  /**
   * Sets the '{@link SimContract#getDescritpion() <em>descritpion</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Описание <!-- end-model-doc -->
   * 
   * @param newDescritpion
   *          the new value of the '{@link SimContract#getDescritpion() descritpion}' feature.
   * @generated
   */
  public void setDescritpion(String newDescritpion) {
    descritpion = newDescritpion;
  }

  /**
   * Returns the value of '<em><b>paymentInfo</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Платежная информация по договору <!--
   * end-model-doc -->
   * 
   * @return the value of '<em><b>paymentInfo</b></em>' feature
   * @generated
   */
  public PaymentInfo getPaymentInfo() {
    return paymentInfo;
  }

  /**
   * Sets the '{@link SimContract#getPaymentInfo() <em>paymentInfo</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Платежная информация по договору <!--
   * end-model-doc -->
   * 
   * @param newPaymentInfo
   *          the new value of the '{@link SimContract#getPaymentInfo() paymentInfo}' feature.
   * @generated
   */
  public void setPaymentInfo(PaymentInfo newPaymentInfo) {
    paymentInfo = newPaymentInfo;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SimContract " + " [contractNumber: " + getContractNumber() + "]" + " [name: " + getName() + "]"
        + " [descritpion: " + getDescritpion() + "]";
  }
}
