package org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon;

import java.math.BigInteger;
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
    TEXT, CDATA, COMMENT, COMPLEXEVEN, MYCOMPLEXABSTRACT, COMPLEXODD, EVEN, MYABSTRACT, ODD, ROOT
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
  private ComplexEvenType complexEven;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private ComplexAAA myComplexAbstract;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private ComplexOddType complexOdd;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EvenType even;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private BigInteger myAbstract;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private OddType odd;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private RootType root;

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
   * Returns the value of '<em><b>complexEven</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>complexEven</b></em>' feature
   * @generated
   */
  public ComplexEvenType getComplexEven() {
    return complexEven;
  }

  /**
   * Sets the '{@link DocumentRoot#getComplexEven() <em>complexEven</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newComplexEven
   *          the new value of the '{@link DocumentRoot#getComplexEven() complexEven}' feature.
   * @generated
   */
  public void setComplexEven(ComplexEvenType newComplexEven) {
    complexEven = newComplexEven;
    setFeature(Feature.COMPLEXEVEN);
  }

  /**
   * Returns the value of '<em><b>myComplexAbstract</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>myComplexAbstract</b></em>' feature
   * @generated
   */
  public ComplexAAA getMyComplexAbstract() {
    return myComplexAbstract;
  }

  /**
   * Sets the '{@link DocumentRoot#getMyComplexAbstract() <em>myComplexAbstract</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMyComplexAbstract
   *          the new value of the '{@link DocumentRoot#getMyComplexAbstract() myComplexAbstract}' feature.
   * @generated
   */
  public void setMyComplexAbstract(ComplexAAA newMyComplexAbstract) {
    myComplexAbstract = newMyComplexAbstract;
    setFeature(Feature.MYCOMPLEXABSTRACT);
  }

  /**
   * Returns the value of '<em><b>complexOdd</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>complexOdd</b></em>' feature
   * @generated
   */
  public ComplexOddType getComplexOdd() {
    return complexOdd;
  }

  /**
   * Sets the '{@link DocumentRoot#getComplexOdd() <em>complexOdd</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newComplexOdd
   *          the new value of the '{@link DocumentRoot#getComplexOdd() complexOdd}' feature.
   * @generated
   */
  public void setComplexOdd(ComplexOddType newComplexOdd) {
    complexOdd = newComplexOdd;
    setFeature(Feature.COMPLEXODD);
  }

  /**
   * Returns the value of '<em><b>even</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>even</b></em>' feature
   * @generated
   */
  public EvenType getEven() {
    return even;
  }

  /**
   * Sets the '{@link DocumentRoot#getEven() <em>even</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEven
   *          the new value of the '{@link DocumentRoot#getEven() even}' feature.
   * @generated
   */
  public void setEven(EvenType newEven) {
    even = newEven;
    setFeature(Feature.EVEN);
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
   * Sets the '{@link DocumentRoot#getMyAbstract() <em>myAbstract</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMyAbstract
   *          the new value of the '{@link DocumentRoot#getMyAbstract() myAbstract}' feature.
   * @generated
   */
  public void setMyAbstract(BigInteger newMyAbstract) {
    myAbstract = newMyAbstract;
    setFeature(Feature.MYABSTRACT);
  }

  /**
   * Returns the value of '<em><b>odd</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>odd</b></em>' feature
   * @generated
   */
  public OddType getOdd() {
    return odd;
  }

  /**
   * Sets the '{@link DocumentRoot#getOdd() <em>odd</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newOdd
   *          the new value of the '{@link DocumentRoot#getOdd() odd}' feature.
   * @generated
   */
  public void setOdd(OddType newOdd) {
    odd = newOdd;
    setFeature(Feature.ODD);
  }

  /**
   * Returns the value of '<em><b>root</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>root</b></em>' feature
   * @generated
   */
  public RootType getRoot() {
    return root;
  }

  /**
   * Sets the '{@link DocumentRoot#getRoot() <em>root</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newRoot
   *          the new value of the '{@link DocumentRoot#getRoot() root}' feature.
   * @generated
   */
  public void setRoot(RootType newRoot) {
    root = newRoot;
    setFeature(Feature.ROOT);
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
    case COMPLEXEVEN:
      return getComplexEven();
    case MYCOMPLEXABSTRACT:
      return getMyComplexAbstract();
    case COMPLEXODD:
      return getComplexOdd();
    case EVEN:
      return getEven();
    case MYABSTRACT:
      return getMyAbstract();
    case ODD:
      return getOdd();
    case ROOT:
      return getRoot();
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
    case COMPLEXEVEN:
      setComplexEven((ComplexEvenType) value);
      break;
    case MYCOMPLEXABSTRACT:
      setMyComplexAbstract((ComplexAAA) value);
      break;
    case COMPLEXODD:
      setComplexOdd((ComplexOddType) value);
      break;
    case EVEN:
      setEven((EvenType) value);
      break;
    case MYABSTRACT:
      setMyAbstract((BigInteger) value);
      break;
    case ODD:
      setOdd((OddType) value);
      break;
    case ROOT:
      setRoot((RootType) value);
      break;
    default:
      throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
    }
  }
}
