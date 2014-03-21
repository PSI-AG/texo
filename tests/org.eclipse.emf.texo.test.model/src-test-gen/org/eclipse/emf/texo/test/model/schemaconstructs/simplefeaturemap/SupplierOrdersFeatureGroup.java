package org.eclipse.emf.texo.test.model.schemaconstructs.simplefeaturemap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation for the Feature Group '<em><b>Supplier.orders</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "simplefeaturemap_Supplier_orders")
public class SupplierOrdersFeatureGroup extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Is used to identify which feature is set in this feature group.
   * 
   * @generated
   */
  public static enum Feature {
    PREFERREDORDERS, STANDARDORDERS, HARDCOPYORDERREFERENCE, HARDCOPYORDERNUMBER
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Returns only the values from the feature group which have the feature
   * equal to the parameter.
   * 
   * @param featureGroup
   *          the featureGroup List to filter
   * @param filterByFeature
   *          filters by this enum
   * @return a list with instances corresponding to the feature kind
   * @see Collections#unmodifiableList(List)
   * @generated
   */
  @SuppressWarnings("unchecked")
  public static <T> List<T> createUnmodifiableValueList(List<SupplierOrdersFeatureGroup> featureGroup,
      Feature filterByFeature) {
    final List<Object> result = new ArrayList<Object>();
    for (final SupplierOrdersFeatureGroup group : featureGroup) {
      if (group.getFeature() == filterByFeature) {
        result.add(group.getValue());
      }
    }
    return (List<T>) Collections.unmodifiableList(result);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Returns a single value from the feature group which has the feature
   * equal to the parameter. The first found value is returned. If no value can be found then null is returned.
   * 
   * @param featureGroup
   *          the featureGroup List to filter
   * @param filterByFeature
   *          filters by this enum
   * @return an instance corresponding to the feature kind or null if not found.
   * @generated
   */
  @SuppressWarnings("unchecked")
  public static <T> T getSingleFeatureMapValue(List<SupplierOrdersFeatureGroup> featureGroup, Feature filterByFeature) {
    for (final SupplierOrdersFeatureGroup group : featureGroup) {
      if (group.getFeature() == filterByFeature) {
        return (T) group.getValue();
      }
    }
    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Sets a single value in a feature group, if there is already a value
   * set in the feature for the feature in question then it is replaced by the new value.
   * 
   * @param featureGroup
   *          the featureGroup List to find the value
   * @param feature
   *          sets this feature
   * @param value
   *          the value to set
   * @generated
   */
  public static void setSingleFeatureMapValue(List<SupplierOrdersFeatureGroup> featureGroup, Feature feature,
      Object value) {
    for (final SupplierOrdersFeatureGroup group : featureGroup) {
      if (group.getFeature() == feature) {
        group.setValue(feature, value);
        return;
      }
    }
    final SupplierOrdersFeatureGroup entry = new SupplierOrdersFeatureGroup();
    entry.setValue(feature, value);
    featureGroup.add(entry);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Creates a list of group instances set with the passed feature and
   * values.
   * 
   * @param feature
   *          the feature to set
   * @param values
   *          the values to set as value of each group instance in the result.
   * @return a list with instances of this class, set with the Feature and values
   * @generated
   */
  public static List<SupplierOrdersFeatureGroup> createFeatureGroupList(Feature feature, List<?> values) {
    final List<SupplierOrdersFeatureGroup> result = new ArrayList<SupplierOrdersFeatureGroup>();
    for (Object value : values) {
      final SupplierOrdersFeatureGroup group = new SupplierOrdersFeatureGroup();
      group.setValue(feature, value);
      result.add(group);
    }
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic
  @Enumerated(EnumType.STRING)
  private Feature feature = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private PurchaseOrder preferredOrders;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private PurchaseOrder standardOrders;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String hardCopyOrderReference;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private Long hardCopyOrderNumber;

  /**
   * @param feature
   *          the EStructuralFeature of this feature map entry
   * @generated
   */
  public void setFeature(Feature feature) {
    this.feature = feature;
  }

  /**
   * @return feature the EStructuralFeature of this feature map entry
   * @generated
   */
  public Feature getFeature() {
    return feature;
  }

  /**
   * Returns the value of '<em><b>preferredOrders</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>preferredOrders</b></em>' feature
   * @generated
   */
  public PurchaseOrder getPreferredOrders() {
    return preferredOrders;
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
  public void setPreferredOrders(PurchaseOrder newPreferredOrders) {
    preferredOrders = newPreferredOrders;
    setFeature(Feature.PREFERREDORDERS);
  }

  /**
   * Returns the value of '<em><b>standardOrders</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>standardOrders</b></em>' feature
   * @generated
   */
  public PurchaseOrder getStandardOrders() {
    return standardOrders;
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
  public void setStandardOrders(PurchaseOrder newStandardOrders) {
    standardOrders = newStandardOrders;
    setFeature(Feature.STANDARDORDERS);
  }

  /**
   * Returns the value of '<em><b>hardCopyOrderReference</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>hardCopyOrderReference</b></em>' feature
   * @generated
   */
  public String getHardCopyOrderReference() {
    return hardCopyOrderReference;
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
  public void setHardCopyOrderReference(String newHardCopyOrderReference) {
    hardCopyOrderReference = newHardCopyOrderReference;
    setFeature(Feature.HARDCOPYORDERREFERENCE);
  }

  /**
   * Returns the value of '<em><b>hardCopyOrderNumber</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>hardCopyOrderNumber</b></em>' feature
   * @generated
   */
  public Long getHardCopyOrderNumber() {
    return hardCopyOrderNumber;
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
  public void setHardCopyOrderNumber(Long newHardCopyOrderNumber) {
    hardCopyOrderNumber = newHardCopyOrderNumber;
    setFeature(Feature.HARDCOPYORDERNUMBER);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of this feature map entry. The type of the returned value is based on the feature.
   * @see #getFeature()
   * @generated
   */
  public Object getValue() {
    switch (getFeature()) {
    case PREFERREDORDERS:
      return getPreferredOrders();
    case STANDARDORDERS:
      return getStandardOrders();
    case HARDCOPYORDERREFERENCE:
      return getHardCopyOrderReference();
    case HARDCOPYORDERNUMBER:
      return getHardCopyOrderNumber();
    default:
      throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param feature
   *          the feature to set
   * @param value
   *          the value to set in this instance
   * @see #getFeature()
   * @generated
   */
  public void setValue(Feature feature, Object value) {
    switch (feature) {
    case PREFERREDORDERS:
      setPreferredOrders((PurchaseOrder) value);
      break;
    case STANDARDORDERS:
      setStandardOrders((PurchaseOrder) value);
      break;
    case HARDCOPYORDERREFERENCE:
      setHardCopyOrderReference((String) value);
      break;
    case HARDCOPYORDERNUMBER:
      setHardCopyOrderNumber((Long) value);
      break;
    default:
      throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
    }
  }
}
