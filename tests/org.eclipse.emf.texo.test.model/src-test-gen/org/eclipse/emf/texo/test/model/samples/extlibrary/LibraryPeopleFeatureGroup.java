package org.eclipse.emf.texo.test.model.samples.extlibrary;

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
 * A representation for the Feature Group '<em><b>Library.people</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "extlib_Library_people")
public class LibraryPeopleFeatureGroup extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Is used to identify which feature is set in this feature group.
   * 
   * @generated
   */
  public static enum Feature {
    WRITERS, EMPLOYEES, BORROWERS
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
  public static <T> List<T> createUnmodifiableValueList(List<LibraryPeopleFeatureGroup> featureGroup,
      Feature filterByFeature) {
    final List<Object> result = new ArrayList<Object>();
    for (final LibraryPeopleFeatureGroup group : featureGroup) {
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
  public static <T> T getSingleFeatureMapValue(List<LibraryPeopleFeatureGroup> featureGroup, Feature filterByFeature) {
    for (final LibraryPeopleFeatureGroup group : featureGroup) {
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
  public static void setSingleFeatureMapValue(List<LibraryPeopleFeatureGroup> featureGroup, Feature feature,
      Object value) {
    for (final LibraryPeopleFeatureGroup group : featureGroup) {
      if (group.getFeature() == feature) {
        group.setValue(feature, value);
        return;
      }
    }
    final LibraryPeopleFeatureGroup entry = new LibraryPeopleFeatureGroup();
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
  public static List<LibraryPeopleFeatureGroup> createFeatureGroupList(Feature feature, List<?> values) {
    final List<LibraryPeopleFeatureGroup> result = new ArrayList<LibraryPeopleFeatureGroup>();
    for (Object value : values) {
      final LibraryPeopleFeatureGroup group = new LibraryPeopleFeatureGroup();
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
  private Writer writers;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private Employee employees;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private Borrower borrowers;

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
   * Returns the value of '<em><b>writers</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>writers</b></em>' feature
   * @generated
   */
  public Writer getWriters() {
    return writers;
  }

  /**
   * Sets the '{@link Library#getWriters() <em>writers</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newWriters
   *          the new value of the '{@link Library#getWriters() writers}' feature.
   * @generated
   */
  public void setWriters(Writer newWriters) {
    writers = newWriters;
    setFeature(Feature.WRITERS);
  }

  /**
   * Returns the value of '<em><b>employees</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>employees</b></em>' feature
   * @generated
   */
  public Employee getEmployees() {
    return employees;
  }

  /**
   * Sets the '{@link Library#getEmployees() <em>employees</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEmployees
   *          the new value of the '{@link Library#getEmployees() employees}' feature.
   * @generated
   */
  public void setEmployees(Employee newEmployees) {
    employees = newEmployees;
    setFeature(Feature.EMPLOYEES);
  }

  /**
   * Returns the value of '<em><b>borrowers</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>borrowers</b></em>' feature
   * @generated
   */
  public Borrower getBorrowers() {
    return borrowers;
  }

  /**
   * Sets the '{@link Library#getBorrowers() <em>borrowers</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBorrowers
   *          the new value of the '{@link Library#getBorrowers() borrowers}' feature.
   * @generated
   */
  public void setBorrowers(Borrower newBorrowers) {
    borrowers = newBorrowers;
    setFeature(Feature.BORROWERS);
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
    case WRITERS:
      return getWriters();
    case EMPLOYEES:
      return getEmployees();
    case BORROWERS:
      return getBorrowers();
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
    case WRITERS:
      setWriters((Writer) value);
      break;
    case EMPLOYEES:
      setEmployees((Employee) value);
      break;
    case BORROWERS:
      setBorrowers((Borrower) value);
      break;
    default:
      throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
    }
  }
}
