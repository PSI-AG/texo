package org.eclipse.emf.texo.test.model.schemaconstructs.substitution;

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
    TEXT, CDATA, COMMENT, EVEN, MYSIMPLEABSTRACT, EVENCOMPLEXNUMBER, MYCOMPLEXABSTRACT, MULTINUMBER, NUMBER, ODD, ODDCOMPLEXNUMBER
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
  private EvenType even;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private BigInteger mySimpleAbstract;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EvenComplexNumberType evenComplexNumber;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private ComplexNumber myComplexAbstract;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private MultiNumberType multiNumber;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private NumberType number;

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
  private OddComplexNumberType oddComplexNumber;

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
   * Returns the value of '<em><b>mySimpleAbstract</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>mySimpleAbstract</b></em>' feature
   * @generated
   */
  public BigInteger getMySimpleAbstract() {
    return mySimpleAbstract;
  }

  /**
   * Sets the '{@link DocumentRoot#getMySimpleAbstract() <em>mySimpleAbstract</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMySimpleAbstract
   *          the new value of the '{@link DocumentRoot#getMySimpleAbstract() mySimpleAbstract}' feature.
   * @generated
   */
  public void setMySimpleAbstract(BigInteger newMySimpleAbstract) {
    mySimpleAbstract = newMySimpleAbstract;
    setFeature(Feature.MYSIMPLEABSTRACT);
  }

  /**
   * Returns the value of '<em><b>evenComplexNumber</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>evenComplexNumber</b></em>' feature
   * @generated
   */
  public EvenComplexNumberType getEvenComplexNumber() {
    return evenComplexNumber;
  }

  /**
   * Sets the '{@link DocumentRoot#getEvenComplexNumber() <em>evenComplexNumber</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEvenComplexNumber
   *          the new value of the '{@link DocumentRoot#getEvenComplexNumber() evenComplexNumber}' feature.
   * @generated
   */
  public void setEvenComplexNumber(EvenComplexNumberType newEvenComplexNumber) {
    evenComplexNumber = newEvenComplexNumber;
    setFeature(Feature.EVENCOMPLEXNUMBER);
  }

  /**
   * Returns the value of '<em><b>myComplexAbstract</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>myComplexAbstract</b></em>' feature
   * @generated
   */
  public ComplexNumber getMyComplexAbstract() {
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
  public void setMyComplexAbstract(ComplexNumber newMyComplexAbstract) {
    myComplexAbstract = newMyComplexAbstract;
    setFeature(Feature.MYCOMPLEXABSTRACT);
  }

  /**
   * Returns the value of '<em><b>multiNumber</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>multiNumber</b></em>' feature
   * @generated
   */
  public MultiNumberType getMultiNumber() {
    return multiNumber;
  }

  /**
   * Sets the '{@link DocumentRoot#getMultiNumber() <em>multiNumber</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMultiNumber
   *          the new value of the '{@link DocumentRoot#getMultiNumber() multiNumber}' feature.
   * @generated
   */
  public void setMultiNumber(MultiNumberType newMultiNumber) {
    multiNumber = newMultiNumber;
    setFeature(Feature.MULTINUMBER);
  }

  /**
   * Returns the value of '<em><b>number</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>number</b></em>' feature
   * @generated
   */
  public NumberType getNumber() {
    return number;
  }

  /**
   * Sets the '{@link DocumentRoot#getNumber() <em>number</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newNumber
   *          the new value of the '{@link DocumentRoot#getNumber() number}' feature.
   * @generated
   */
  public void setNumber(NumberType newNumber) {
    number = newNumber;
    setFeature(Feature.NUMBER);
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
   * Returns the value of '<em><b>oddComplexNumber</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>oddComplexNumber</b></em>' feature
   * @generated
   */
  public OddComplexNumberType getOddComplexNumber() {
    return oddComplexNumber;
  }

  /**
   * Sets the '{@link DocumentRoot#getOddComplexNumber() <em>oddComplexNumber</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newOddComplexNumber
   *          the new value of the '{@link DocumentRoot#getOddComplexNumber() oddComplexNumber}' feature.
   * @generated
   */
  public void setOddComplexNumber(OddComplexNumberType newOddComplexNumber) {
    oddComplexNumber = newOddComplexNumber;
    setFeature(Feature.ODDCOMPLEXNUMBER);
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
    case EVEN:
      return getEven();
    case MYSIMPLEABSTRACT:
      return getMySimpleAbstract();
    case EVENCOMPLEXNUMBER:
      return getEvenComplexNumber();
    case MYCOMPLEXABSTRACT:
      return getMyComplexAbstract();
    case MULTINUMBER:
      return getMultiNumber();
    case NUMBER:
      return getNumber();
    case ODD:
      return getOdd();
    case ODDCOMPLEXNUMBER:
      return getOddComplexNumber();
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
    case EVEN:
      setEven((EvenType) value);
      break;
    case MYSIMPLEABSTRACT:
      setMySimpleAbstract((BigInteger) value);
      break;
    case EVENCOMPLEXNUMBER:
      setEvenComplexNumber((EvenComplexNumberType) value);
      break;
    case MYCOMPLEXABSTRACT:
      setMyComplexAbstract((ComplexNumber) value);
      break;
    case MULTINUMBER:
      setMultiNumber((MultiNumberType) value);
      break;
    case NUMBER:
      setNumber((NumberType) value);
      break;
    case ODD:
      setOdd((OddType) value);
      break;
    case ODDCOMPLEXNUMBER:
      setOddComplexNumber((OddComplexNumberType) value);
      break;
    default:
      throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
    }
  }
}
