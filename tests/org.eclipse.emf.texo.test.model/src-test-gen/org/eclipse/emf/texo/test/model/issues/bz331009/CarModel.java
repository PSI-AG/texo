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
 * A representation of the model object '<em><b>CarModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> Модель ТС <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_CarModel")
@Table(name = "m_CarModel")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class CarModel extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Марка ТС <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_CarModel_producer") })
  private CarProducer producer = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Название модели <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "name")
  private String name = null;

  /**
   * Returns the value of '<em><b>producer</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Марка ТС <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>producer</b></em>' feature
   * @generated
   */
  public CarProducer getProducer() {
    return producer;
  }

  /**
   * Sets the '{@link CarModel#getProducer() <em>producer</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Марка ТС <!-- end-model-doc -->
   * 
   * @param newProducer
   *          the new value of the '{@link CarModel#getProducer() producer}' feature.
   * @generated
   */
  public void setProducer(CarProducer newProducer) {
    producer = newProducer;
  }

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Название модели <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link CarModel#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Название модели <!-- end-model-doc -->
   * 
   * @param newName
   *          the new value of the '{@link CarModel#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "CarModel " + " [name: " + getName() + "]";
  }
}
