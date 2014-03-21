package org.eclipse.emf.texo.test.model.schemaconstructs.documentroot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation for the Feature Group '<em><b>DocumentRoot.mixed</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class DocumentRootMixedFeatureGroup extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Is used to identify which feature is set in this feature group.
   * 
   * @generated
   */
  public static enum Feature {
    TEXT, CDATA, COMMENT, OTHERTEST, TEST
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
  public static <T> List<T> createUnmodifiableValueList(List<DocumentRootMixedFeatureGroup> featureGroup,
      Feature filterByFeature) {
    final List<Object> result = new ArrayList<Object>();
    for (final DocumentRootMixedFeatureGroup group : featureGroup) {
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
  public static <T> T getSingleFeatureMapValue(List<DocumentRootMixedFeatureGroup> featureGroup, Feature filterByFeature) {
    for (final DocumentRootMixedFeatureGroup group : featureGroup) {
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
  public static void setSingleFeatureMapValue(List<DocumentRootMixedFeatureGroup> featureGroup, Feature feature,
      Object value) {
    for (final DocumentRootMixedFeatureGroup group : featureGroup) {
      if (group.getFeature() == feature) {
        group.setValue(feature, value);
        return;
      }
    }
    final DocumentRootMixedFeatureGroup entry = new DocumentRootMixedFeatureGroup();
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
  public static List<DocumentRootMixedFeatureGroup> createFeatureGroupList(Feature feature, List<?> values) {
    final List<DocumentRootMixedFeatureGroup> result = new ArrayList<DocumentRootMixedFeatureGroup>();
    for (Object value : values) {
      final DocumentRootMixedFeatureGroup group = new DocumentRootMixedFeatureGroup();
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
  @Basic(optional = true)
  @Lob
  private String text;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  @Lob
  private String cDATA;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  @Lob
  private String comment;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private String otherTest;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private String test;

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
   * Returns the value of '<em><b>text</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>text</b></em>' feature
   * @generated
   */
  public String getText() {
    return text;
  }

  /**
   * Sets the <em>text</em> feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newText
   *          the new value of the '<em><b>text</b></em>' feature.
   * @generated
   */
  public void setText(String newText) {
    text = newText;
    setFeature(Feature.TEXT);
  }

  /**
   * Returns the value of '<em><b>CDATA</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>CDATA</b></em>' feature
   * @generated
   */
  public String getCDATA() {
    return cDATA;
  }

  /**
   * Sets the <em>cDATA</em> feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCDATA
   *          the new value of the '<em><b>CDATA</b></em>' feature.
   * @generated
   */
  public void setCDATA(String newCDATA) {
    cDATA = newCDATA;
    setFeature(Feature.CDATA);
  }

  /**
   * Returns the value of '<em><b>comment</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>comment</b></em>' feature
   * @generated
   */
  public String getComment() {
    return comment;
  }

  /**
   * Sets the <em>comment</em> feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newComment
   *          the new value of the '<em><b>comment</b></em>' feature.
   * @generated
   */
  public void setComment(String newComment) {
    comment = newComment;
    setFeature(Feature.COMMENT);
  }

  /**
   * Returns the value of '<em><b>otherTest</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>otherTest</b></em>' feature
   * @generated
   */
  public String getOtherTest() {
    return otherTest;
  }

  /**
   * Sets the '{@link DocumentRoot#getOtherTest() <em>otherTest</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newOtherTest
   *          the new value of the '{@link DocumentRoot#getOtherTest() otherTest}' feature.
   * @generated
   */
  public void setOtherTest(String newOtherTest) {
    otherTest = newOtherTest;
    setFeature(Feature.OTHERTEST);
  }

  /**
   * Returns the value of '<em><b>test</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>test</b></em>' feature
   * @generated
   */
  public String getTest() {
    return test;
  }

  /**
   * Sets the '{@link DocumentRoot#getTest() <em>test</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTest
   *          the new value of the '{@link DocumentRoot#getTest() test}' feature.
   * @generated
   */
  public void setTest(String newTest) {
    test = newTest;
    setFeature(Feature.TEST);
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
    case TEXT:
      return getText();
    case CDATA:
      return getCDATA();
    case COMMENT:
      return getComment();
    case OTHERTEST:
      return getOtherTest();
    case TEST:
      return getTest();
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
    case TEXT:
      setText((String) value);
      break;
    case CDATA:
      setCDATA((String) value);
      break;
    case COMMENT:
      setComment((String) value);
      break;
    case OTHERTEST:
      setOtherTest((String) value);
      break;
    case TEST:
      setTest((String) value);
      break;
    default:
      throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
    }
  }
}
