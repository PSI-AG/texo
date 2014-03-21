package org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation for the Feature Group '<em><b>RootType.myAbstractGroup</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "substitutionzvon_RootType_myAbstractGroup")
public class RootTypeMyAbstractGroupFeatureGroup extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Is used to identify which feature is set in this feature group.
   * 
   * @generated
   */
  public static enum Feature {
    MYABSTRACT
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
  public static <T> List<T> createUnmodifiableValueList(List<RootTypeMyAbstractGroupFeatureGroup> featureGroup,
      Feature filterByFeature) {
    final List<Object> result = new ArrayList<Object>();
    for (final RootTypeMyAbstractGroupFeatureGroup group : featureGroup) {
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
  public static <T> T getSingleFeatureMapValue(List<RootTypeMyAbstractGroupFeatureGroup> featureGroup,
      Feature filterByFeature) {
    for (final RootTypeMyAbstractGroupFeatureGroup group : featureGroup) {
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
  public static void setSingleFeatureMapValue(List<RootTypeMyAbstractGroupFeatureGroup> featureGroup, Feature feature,
      Object value) {
    for (final RootTypeMyAbstractGroupFeatureGroup group : featureGroup) {
      if (group.getFeature() == feature) {
        group.setValue(feature, value);
        return;
      }
    }
    final RootTypeMyAbstractGroupFeatureGroup entry = new RootTypeMyAbstractGroupFeatureGroup();
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
  public static List<RootTypeMyAbstractGroupFeatureGroup> createFeatureGroupList(Feature feature, List<?> values) {
    final List<RootTypeMyAbstractGroupFeatureGroup> result = new ArrayList<RootTypeMyAbstractGroupFeatureGroup>();
    for (Object value : values) {
      final RootTypeMyAbstractGroupFeatureGroup group = new RootTypeMyAbstractGroupFeatureGroup();
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
  @Access(AccessType.FIELD)
  private BigInteger myAbstract;

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
   * Returns the value of '<em><b>myAbstract</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>myAbstract</b></em>' feature
   * @generated
   */
  public BigInteger getMyAbstract() {
    return myAbstract;
  }

  /**
   * Sets the '{@link RootType#getMyAbstract() <em>myAbstract</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMyAbstract
   *          the new value of the '{@link RootType#getMyAbstract() myAbstract}' feature.
   * @generated
   */
  public void setMyAbstract(BigInteger newMyAbstract) {
    myAbstract = newMyAbstract;
    setFeature(Feature.MYABSTRACT);
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
    case MYABSTRACT:
      return getMyAbstract();
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
    case MYABSTRACT:
      setMyAbstract((BigInteger) value);
      break;
    default:
      throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
    }
  }
}
