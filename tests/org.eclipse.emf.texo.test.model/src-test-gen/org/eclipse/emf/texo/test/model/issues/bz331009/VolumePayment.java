package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>VolumePayment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> Платеж за объем <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_VolumePayment")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class VolumePayment extends PaymentItem {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "volume", nullable = true, precision = 15, scale = 7)
  private BigDecimal volume = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> единицы объема <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @JoinColumns({ @JoinColumn(name = "m_VolumePayment_unit", nullable = true) })
  private Units unit = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Цена за единицу <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "price", nullable = true, precision = 15, scale = 7)
  private BigDecimal price = null;

  /**
   * Returns the value of '<em><b>volume</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>volume</b></em>' feature
   * @generated
   */
  public BigDecimal getVolume() {
    return volume;
  }

  /**
   * Sets the '{@link VolumePayment#getVolume() <em>volume</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newVolume
   *          the new value of the '{@link VolumePayment#getVolume() volume}' feature.
   * @generated
   */
  public void setVolume(BigDecimal newVolume) {
    volume = newVolume;
  }

  /**
   * Returns the value of '<em><b>unit</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> единицы объема <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>unit</b></em>' feature
   * @generated
   */
  public Units getUnit() {
    return unit;
  }

  /**
   * Sets the '{@link VolumePayment#getUnit() <em>unit</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> единицы объема <!-- end-model-doc -->
   * 
   * @param newUnit
   *          the new value of the '{@link VolumePayment#getUnit() unit}' feature.
   * @generated
   */
  public void setUnit(Units newUnit) {
    unit = newUnit;
  }

  /**
   * Returns the value of '<em><b>price</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Цена за единицу <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>price</b></em>' feature
   * @generated
   */
  public BigDecimal getPrice() {
    return price;
  }

  /**
   * Sets the '{@link VolumePayment#getPrice() <em>price</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Цена за единицу <!-- end-model-doc -->
   * 
   * @param newPrice
   *          the new value of the '{@link VolumePayment#getPrice() price}' feature.
   * @generated
   */
  public void setPrice(BigDecimal newPrice) {
    price = newPrice;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "VolumePayment " + " [volume: " + getVolume() + "]" + " [price: " + getPrice() + "]";
  }
}
