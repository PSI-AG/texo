package org.eclipse.emf.texo.test.model.issues.bz393240;

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
    TEXT, CDATA, COMMENT, APPLICATIONREQUEST, APPLICATIONRESPONSE
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
  private Application applicationRequest;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private Application applicationResponse;

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
   * Returns the value of '<em><b>applicationRequest</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>applicationRequest</b></em>' feature
   * @generated
   */
  public Application getApplicationRequest() {
    return applicationRequest;
  }

  /**
   * Sets the '{@link DocumentRoot#getApplicationRequest() <em>applicationRequest</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newApplicationRequest
   *          the new value of the '{@link DocumentRoot#getApplicationRequest() applicationRequest}' feature.
   * @generated
   */
  public void setApplicationRequest(Application newApplicationRequest) {
    applicationRequest = newApplicationRequest;
    setFeature(Feature.APPLICATIONREQUEST);
  }

  /**
   * Returns the value of '<em><b>applicationResponse</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>applicationResponse</b></em>' feature
   * @generated
   */
  public Application getApplicationResponse() {
    return applicationResponse;
  }

  /**
   * Sets the '{@link DocumentRoot#getApplicationResponse() <em>applicationResponse</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newApplicationResponse
   *          the new value of the '{@link DocumentRoot#getApplicationResponse() applicationResponse}' feature.
   * @generated
   */
  public void setApplicationResponse(Application newApplicationResponse) {
    applicationResponse = newApplicationResponse;
    setFeature(Feature.APPLICATIONRESPONSE);
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
    case APPLICATIONREQUEST:
      return getApplicationRequest();
    case APPLICATIONRESPONSE:
      return getApplicationResponse();
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
    case APPLICATIONREQUEST:
      setApplicationRequest((Application) value);
      break;
    case APPLICATIONRESPONSE:
      setApplicationResponse((Application) value);
      break;
    default:
      throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
    }
  }
}
