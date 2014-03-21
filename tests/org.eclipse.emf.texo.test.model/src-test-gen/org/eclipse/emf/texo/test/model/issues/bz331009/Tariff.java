package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Tariff</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> Информация о тарифе <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_Tariff")
@Table(name = "m_Tariff")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class Tariff extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Название <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "name")
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Активен ли <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "active")
  private boolean active = false;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Платежи за объем <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn(name = "m_Tariff_volumePayments_ind")
  @JoinTable(joinColumns = { @JoinColumn(name = "m_Tariff_volumePayments") }, inverseJoinColumns = { @JoinColumn(name = "volumePayments_m_VolumePayment") }, name = "m_Tariff_volumePayments")
  @Access(AccessType.FIELD)
  private List<VolumePayment> volumePayments = new ArrayList<VolumePayment>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Периодические платежи <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn(name = "m_Tariff_periodicalPayments_ind")
  @JoinTable(joinColumns = { @JoinColumn(name = "m_Tariff_periodicalPayments") }, inverseJoinColumns = { @JoinColumn(name = "periodicalPayments_m_PeriodicalPayment") }, name = "m_Tariff_periodicalPayments")
  @Access(AccessType.FIELD)
  private List<PeriodicalPayment> periodicalPayments = new ArrayList<PeriodicalPayment>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Первоначальные платежи <!-- end-model-doc
   * -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn(name = "m_Tariff_initialPayment_ind")
  @JoinTable(joinColumns = { @JoinColumn(name = "m_Tariff_initialPayment") }, inverseJoinColumns = { @JoinColumn(name = "initialPayment_m_OneTimePayment") }, name = "m_Tariff_initialPayment")
  @Access(AccessType.FIELD)
  private List<OneTimePayment> initialPayment = new ArrayList<OneTimePayment>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Услуги <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn(name = "m_Tariff_services_ind")
  @JoinTable(joinColumns = { @JoinColumn(name = "m_Tariff_services") }, inverseJoinColumns = { @JoinColumn(name = "services_m_Service") }, name = "m_Tariff_services")
  @Access(AccessType.FIELD)
  private List<Service> services = new ArrayList<Service>();

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
   * Sets the '{@link Tariff#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Название <!-- end-model-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Tariff#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>active</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Активен ли <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>active</b></em>' feature
   * @generated
   */
  public boolean isActive() {
    return active;
  }

  /**
   * Sets the '{@link Tariff#isActive() <em>active</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Активен ли <!-- end-model-doc -->
   * 
   * @param newActive
   *          the new value of the '{@link Tariff#isActive() active}' feature.
   * @generated
   */
  public void setActive(boolean newActive) {
    active = newActive;
  }

  /**
   * Returns the value of '<em><b>volumePayments</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Платежи за объем <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>volumePayments</b></em>' feature
   * @generated
   */
  public List<VolumePayment> getVolumePayments() {
    return volumePayments;
  }

  /**
   * Returns the value of '<em><b>periodicalPayments</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Периодические платежи <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>periodicalPayments</b></em>' feature
   * @generated
   */
  public List<PeriodicalPayment> getPeriodicalPayments() {
    return periodicalPayments;
  }

  /**
   * Returns the value of '<em><b>initialPayment</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Первоначальные платежи <!-- end-model-doc
   * -->
   * 
   * @return the value of '<em><b>initialPayment</b></em>' feature
   * @generated
   */
  public List<OneTimePayment> getInitialPayment() {
    return initialPayment;
  }

  /**
   * Returns the value of '<em><b>services</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Услуги <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>services</b></em>' feature
   * @generated
   */
  public List<Service> getServices() {
    return services;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Tariff " + " [name: " + getName() + "]" + " [active: " + isActive() + "]";
  }
}
