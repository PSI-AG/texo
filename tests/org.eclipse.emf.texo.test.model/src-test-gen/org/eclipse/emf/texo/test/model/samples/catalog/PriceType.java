package org.eclipse.emf.texo.test.model.samples.catalog;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>PriceType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "catalog_PriceType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class PriceType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private double price = 0.0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private double quantityTo = 0.0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  private SupplierType supplier = null;

  /**
   * Returns the value of '<em><b>price</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>price</b></em>' feature
   * @generated
   */
  public double getPrice() {
    return price;
  }

  /**
   * Sets the '{@link PriceType#getPrice() <em>price</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPrice
   *          the new value of the '{@link PriceType#getPrice() price}' feature.
   * @generated
   */
  public void setPrice(double newPrice) {
    price = newPrice;
  }

  /**
   * Returns the value of '<em><b>quantityTo</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>quantityTo</b></em>' feature
   * @generated
   */
  public double getQuantityTo() {
    return quantityTo;
  }

  /**
   * Sets the '{@link PriceType#getQuantityTo() <em>quantityTo</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newQuantityTo
   *          the new value of the '{@link PriceType#getQuantityTo() quantityTo}' feature.
   * @generated
   */
  public void setQuantityTo(double newQuantityTo) {
    quantityTo = newQuantityTo;
  }

  /**
   * Returns the value of '<em><b>supplier</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>supplier</b></em>' feature
   * @generated
   */
  public SupplierType getSupplier() {
    return supplier;
  }

  /**
   * Sets the '{@link PriceType#getSupplier() <em>supplier</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSupplier
   *          the new value of the '{@link PriceType#getSupplier() supplier}' feature.
   * @generated
   */
  public void setSupplier(SupplierType newSupplier) {
    supplier = newSupplier;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PriceType " + " [price: " + getPrice() + "]" + " [quantityTo: " + getQuantityTo() + "]";
  }
}
