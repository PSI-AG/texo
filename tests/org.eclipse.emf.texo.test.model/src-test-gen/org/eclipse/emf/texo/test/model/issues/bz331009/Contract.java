package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Contract</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> Информация о договоре <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_Contract")
@Table(name = "m_Contract")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Contract extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Дата подписания <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "signDate")
  @Temporal(TemporalType.DATE)
  private Date signDate = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_Contract_simCard") })
  private SimCard simCard = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_Contract_paymentInfo") })
  private PaymentInfo paymentInfo = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> ТС <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_Contract_car") })
  private Car car = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Секретные вопросы <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn(name = "m_Contract_secretQuestions_ind")
  @JoinTable(joinColumns = { @JoinColumn(name = "m_Contract_secretQuestions") }, inverseJoinColumns = { @JoinColumn(name = "secretQuestions_m_SecretQuestion") }, name = "m_Contract_secretQuestions")
  @Access(AccessType.FIELD)
  private List<SecretQuestion> secretQuestions = new ArrayList<SecretQuestion>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер контракта <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "T_number")
  private String number = null;

  /**
   * Returns the value of '<em><b>signDate</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Дата подписания <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>signDate</b></em>' feature
   * @generated
   */
  public Date getSignDate() {
    return signDate;
  }

  /**
   * Sets the '{@link Contract#getSignDate() <em>signDate</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Дата подписания <!-- end-model-doc -->
   * 
   * @param newSignDate
   *          the new value of the '{@link Contract#getSignDate() signDate}' feature.
   * @generated
   */
  public void setSignDate(Date newSignDate) {
    signDate = newSignDate;
  }

  /**
   * Returns the value of '<em><b>simCard</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>simCard</b></em>' feature
   * @generated
   */
  public SimCard getSimCard() {
    return simCard;
  }

  /**
   * Sets the '{@link Contract#getSimCard() <em>simCard</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSimCard
   *          the new value of the '{@link Contract#getSimCard() simCard}' feature.
   * @generated
   */
  public void setSimCard(SimCard newSimCard) {
    simCard = newSimCard;
  }

  /**
   * Returns the value of '<em><b>paymentInfo</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>paymentInfo</b></em>' feature
   * @generated
   */
  public PaymentInfo getPaymentInfo() {
    return paymentInfo;
  }

  /**
   * Sets the '{@link Contract#getPaymentInfo() <em>paymentInfo</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPaymentInfo
   *          the new value of the '{@link Contract#getPaymentInfo() paymentInfo}' feature.
   * @generated
   */
  public void setPaymentInfo(PaymentInfo newPaymentInfo) {
    paymentInfo = newPaymentInfo;
  }

  /**
   * Returns the value of '<em><b>car</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> ТС <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>car</b></em>' feature
   * @generated
   */
  public Car getCar() {
    return car;
  }

  /**
   * Sets the '{@link Contract#getCar() <em>car</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> ТС <!-- end-model-doc -->
   * 
   * @param newCar
   *          the new value of the '{@link Contract#getCar() car}' feature.
   * @generated
   */
  public void setCar(Car newCar) {
    car = newCar;
  }

  /**
   * Returns the value of '<em><b>secretQuestions</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Секретные вопросы <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>secretQuestions</b></em>' feature
   * @generated
   */
  public List<SecretQuestion> getSecretQuestions() {
    return secretQuestions;
  }

  /**
   * Returns the value of '<em><b>number</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер контракта <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>number</b></em>' feature
   * @generated
   */
  public String getNumber() {
    return number;
  }

  /**
   * Sets the '{@link Contract#getNumber() <em>number</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Номер контракта <!-- end-model-doc -->
   * 
   * @param newNumber
   *          the new value of the '{@link Contract#getNumber() number}' feature.
   * @generated
   */
  public void setNumber(String newNumber) {
    number = newNumber;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Contract " + " [signDate: " + getSignDate() + "]" + " [number: " + getNumber() + "]";
  }
}
