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
 * A representation of the model object '<em><b>Service</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> Услуга <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_Service")
@Table(name = "m_Service")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Service extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Название <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "name")
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Активна ли <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "active")
  private boolean active = false;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Плата за подключение <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_Service_initialPayment") })
  private OneTimePayment initialPayment = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Абонентская плата <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_Service_periodicalPayment") })
  private PeriodicalPayment periodicalPayment = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Плата за объем <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_Service_volumePayment") })
  private VolumePayment volumePayment = null;

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
   * Sets the '{@link Service#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Название <!-- end-model-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Service#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>active</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Активна ли <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>active</b></em>' feature
   * @generated
   */
  public boolean isActive() {
    return active;
  }

  /**
   * Sets the '{@link Service#isActive() <em>active</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Активна ли <!-- end-model-doc -->
   * 
   * @param newActive
   *          the new value of the '{@link Service#isActive() active}' feature.
   * @generated
   */
  public void setActive(boolean newActive) {
    active = newActive;
  }

  /**
   * Returns the value of '<em><b>initialPayment</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Плата за подключение <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>initialPayment</b></em>' feature
   * @generated
   */
  public OneTimePayment getInitialPayment() {
    return initialPayment;
  }

  /**
   * Sets the '{@link Service#getInitialPayment() <em>initialPayment</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Плата за подключение <!-- end-model-doc -->
   * 
   * @param newInitialPayment
   *          the new value of the '{@link Service#getInitialPayment() initialPayment}' feature.
   * @generated
   */
  public void setInitialPayment(OneTimePayment newInitialPayment) {
    initialPayment = newInitialPayment;
  }

  /**
   * Returns the value of '<em><b>periodicalPayment</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Абонентская плата <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>periodicalPayment</b></em>' feature
   * @generated
   */
  public PeriodicalPayment getPeriodicalPayment() {
    return periodicalPayment;
  }

  /**
   * Sets the '{@link Service#getPeriodicalPayment() <em>periodicalPayment</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Абонентская плата <!-- end-model-doc -->
   * 
   * @param newPeriodicalPayment
   *          the new value of the '{@link Service#getPeriodicalPayment() periodicalPayment}' feature.
   * @generated
   */
  public void setPeriodicalPayment(PeriodicalPayment newPeriodicalPayment) {
    periodicalPayment = newPeriodicalPayment;
  }

  /**
   * Returns the value of '<em><b>volumePayment</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Плата за объем <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>volumePayment</b></em>' feature
   * @generated
   */
  public VolumePayment getVolumePayment() {
    return volumePayment;
  }

  /**
   * Sets the '{@link Service#getVolumePayment() <em>volumePayment</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Плата за объем <!-- end-model-doc -->
   * 
   * @param newVolumePayment
   *          the new value of the '{@link Service#getVolumePayment() volumePayment}' feature.
   * @generated
   */
  public void setVolumePayment(VolumePayment newVolumePayment) {
    volumePayment = newVolumePayment;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Service " + " [name: " + getName() + "]" + " [active: " + isActive() + "]";
  }
}
