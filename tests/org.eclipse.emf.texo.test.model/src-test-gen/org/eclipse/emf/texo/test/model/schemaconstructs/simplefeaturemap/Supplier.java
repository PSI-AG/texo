package org.eclipse.emf.texo.test.model.schemaconstructs.simplefeaturemap;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Supplier</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "simplefeaturemap_Supplier")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Supplier extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = SupplierOrdersFeatureGroup.class)
  @JoinTable()
  private List<SupplierOrdersFeatureGroup> orders = new ArrayList<SupplierOrdersFeatureGroup>();

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link Supplier#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Supplier#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>orders</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>orders</b></em>' feature
   * @generated
   */
  public List<SupplierOrdersFeatureGroup> getOrders() {
    return orders;
  }

  /**
   * Sets the '{@link Supplier#getOrders() <em>orders</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newOrders
   *          the new value of the '{@link Supplier#getOrders() orders}' feature.
   * @generated
   */
  public void setOrders(List<SupplierOrdersFeatureGroup> newOrders) {
    orders = newOrders;
  }

  /**
   * Returns the value of '<em><b>preferredOrders</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>preferredOrders</b></em>' feature
   * @generated
   */
  public List<PurchaseOrder> getPreferredOrders() {
    return SupplierOrdersFeatureGroup.createUnmodifiableValueList(getOrders(),
        SupplierOrdersFeatureGroup.Feature.PREFERREDORDERS);
  }

  /**
   * Sets the '{@link Supplier#getPreferredOrders() <em>preferredOrders</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPreferredOrders
   *          the new value of the '{@link Supplier#getPreferredOrders() preferredOrders}' feature.
   * @generated
   */
  public void setPreferredOrders(List<PurchaseOrder> newPreferredOrders) {
    setOrders(SupplierOrdersFeatureGroup.createFeatureGroupList(SupplierOrdersFeatureGroup.Feature.PREFERREDORDERS,
        newPreferredOrders));
  }

  /**
   * Returns the value of '<em><b>standardOrders</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>standardOrders</b></em>' feature
   * @generated
   */
  public List<PurchaseOrder> getStandardOrders() {
    return SupplierOrdersFeatureGroup.createUnmodifiableValueList(getOrders(),
        SupplierOrdersFeatureGroup.Feature.STANDARDORDERS);
  }

  /**
   * Sets the '{@link Supplier#getStandardOrders() <em>standardOrders</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStandardOrders
   *          the new value of the '{@link Supplier#getStandardOrders() standardOrders}' feature.
   * @generated
   */
  public void setStandardOrders(List<PurchaseOrder> newStandardOrders) {
    setOrders(SupplierOrdersFeatureGroup.createFeatureGroupList(SupplierOrdersFeatureGroup.Feature.STANDARDORDERS,
        newStandardOrders));
  }

  /**
   * Returns the value of '<em><b>hardCopyOrderReference</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>hardCopyOrderReference</b></em>' feature
   * @generated
   */
  public List<String> getHardCopyOrderReference() {
    return SupplierOrdersFeatureGroup.createUnmodifiableValueList(getOrders(),
        SupplierOrdersFeatureGroup.Feature.HARDCOPYORDERREFERENCE);
  }

  /**
   * Sets the '{@link Supplier#getHardCopyOrderReference() <em>hardCopyOrderReference</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newHardCopyOrderReference
   *          the new value of the '{@link Supplier#getHardCopyOrderReference() hardCopyOrderReference}' feature.
   * @generated
   */
  public void setHardCopyOrderReference(List<String> newHardCopyOrderReference) {
    setOrders(SupplierOrdersFeatureGroup.createFeatureGroupList(
        SupplierOrdersFeatureGroup.Feature.HARDCOPYORDERREFERENCE, newHardCopyOrderReference));
  }

  /**
   * Returns the value of '<em><b>hardCopyOrderNumber</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>hardCopyOrderNumber</b></em>' feature
   * @generated
   */
  public List<Long> getHardCopyOrderNumber() {
    return SupplierOrdersFeatureGroup.createUnmodifiableValueList(getOrders(),
        SupplierOrdersFeatureGroup.Feature.HARDCOPYORDERNUMBER);
  }

  /**
   * Sets the '{@link Supplier#getHardCopyOrderNumber() <em>hardCopyOrderNumber</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newHardCopyOrderNumber
   *          the new value of the '{@link Supplier#getHardCopyOrderNumber() hardCopyOrderNumber}' feature.
   * @generated
   */
  public void setHardCopyOrderNumber(List<Long> newHardCopyOrderNumber) {
    setOrders(SupplierOrdersFeatureGroup.createFeatureGroupList(SupplierOrdersFeatureGroup.Feature.HARDCOPYORDERNUMBER,
        newHardCopyOrderNumber));
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Supplier " + " [name: " + getName() + "]";
  }
}
