package org.eclipse.emf.texo.test.model.issues.bz331009;

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
 * A representation of the model object '<em><b>Car</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> ТС <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_Car")
@Table(name = "m_Car")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Car extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Модель <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_Car_model") })
  private CarModel model = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Свидетельство о регистрации <!--
   * end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_Car_regInfo") })
  private CarRegInfo regInfo = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> ПТС <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_Car_carPassport") })
  private CarPassport carPassport = null;

  /**
   * Returns the value of '<em><b>model</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Модель <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>model</b></em>' feature
   * @generated
   */
  public CarModel getModel() {
    return model;
  }

  /**
   * Sets the '{@link Car#getModel() <em>model</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Модель <!-- end-model-doc -->
   * 
   * @param newModel
   *          the new value of the '{@link Car#getModel() model}' feature.
   * @generated
   */
  public void setModel(CarModel newModel) {
    model = newModel;
  }

  /**
   * Returns the value of '<em><b>regInfo</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Свидетельство о регистрации <!--
   * end-model-doc -->
   * 
   * @return the value of '<em><b>regInfo</b></em>' feature
   * @generated
   */
  public CarRegInfo getRegInfo() {
    return regInfo;
  }

  /**
   * Sets the '{@link Car#getRegInfo() <em>regInfo</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Свидетельство о регистрации <!--
   * end-model-doc -->
   * 
   * @param newRegInfo
   *          the new value of the '{@link Car#getRegInfo() regInfo}' feature.
   * @generated
   */
  public void setRegInfo(CarRegInfo newRegInfo) {
    regInfo = newRegInfo;
  }

  /**
   * Returns the value of '<em><b>carPassport</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> ПТС <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>carPassport</b></em>' feature
   * @generated
   */
  public CarPassport getCarPassport() {
    return carPassport;
  }

  /**
   * Sets the '{@link Car#getCarPassport() <em>carPassport</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> ПТС <!-- end-model-doc -->
   * 
   * @param newCarPassport
   *          the new value of the '{@link Car#getCarPassport() carPassport}' feature.
   * @generated
   */
  public void setCarPassport(CarPassport newCarPassport) {
    carPassport = newCarPassport;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Car ";
  }
}
