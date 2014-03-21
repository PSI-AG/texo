package org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation for the Feature Group '<em><b>Feature.aMap</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "ecoreattrs_Feature_aMap")
public class FeatureAMapFeatureGroup extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Is used to identify which feature is set in this feature group.
   * 
   * @generated
   */
  public static enum Feature {
    NAME, VALUE_
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
  public static <T> List<T> createUnmodifiableValueList(List<FeatureAMapFeatureGroup> featureGroup,
      Feature filterByFeature) {
    final List<Object> result = new ArrayList<Object>();
    for (final FeatureAMapFeatureGroup group : featureGroup) {
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
  public static <T> T getSingleFeatureMapValue(List<FeatureAMapFeatureGroup> featureGroup, Feature filterByFeature) {
    for (final FeatureAMapFeatureGroup group : featureGroup) {
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
  public static void setSingleFeatureMapValue(List<FeatureAMapFeatureGroup> featureGroup, Feature feature, Object value) {
    for (final FeatureAMapFeatureGroup group : featureGroup) {
      if (group.getFeature() == feature) {
        group.setValue(feature, value);
        return;
      }
    }
    final FeatureAMapFeatureGroup entry = new FeatureAMapFeatureGroup();
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
  public static List<FeatureAMapFeatureGroup> createFeatureGroupList(Feature feature, List<?> values) {
    final List<FeatureAMapFeatureGroup> result = new ArrayList<FeatureAMapFeatureGroup>();
    for (Object value : values) {
      final FeatureAMapFeatureGroup group = new FeatureAMapFeatureGroup();
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
  @Basic(optional = false)
  @Column(name = "name")
  private String name;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Column(name = "T_value")
  private Double value_;

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
   * Sets the '{@link Feature#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link Feature#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
    setFeature(Feature.NAME);
  }

  /**
   * Returns the value of '<em><b>value</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>value</b></em>' feature
   * @generated
   */
  public Double getValue_() {
    return value_;
  }

  /**
   * Sets the '{@link Feature#getValue_() <em>value</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newValue_
   *          the new value of the '{@link Feature#getValue_() value}' feature.
   * @generated
   */
  public void setValue_(Double newValue_) {
    value_ = newValue_;
    setFeature(Feature.VALUE_);
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
    case NAME:
      return getName();
    case VALUE_:
      return getValue_();
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
    case NAME:
      setName((String) value);
      break;
    case VALUE_:
      setValue_((Double) value);
      break;
    default:
      throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
    }
  }
}
