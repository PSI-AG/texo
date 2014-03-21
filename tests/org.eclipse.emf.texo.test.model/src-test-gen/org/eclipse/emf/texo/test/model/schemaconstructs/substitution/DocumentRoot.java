package org.eclipse.emf.texo.test.model.schemaconstructs.substitution;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>DocumentRoot</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DocumentRoot extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private List<DocumentRootMixedFeatureGroup> mixed = new ArrayList<DocumentRootMixedFeatureGroup>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private Map<String, String> xMLNSPrefixMap = new LinkedHashMap<String, String>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private Map<String, String> xSISchemaLocation = new LinkedHashMap<String, String>();

  /**
   * Returns the value of '<em><b>mixed</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>mixed</b></em>' feature
   * @generated
   */
  public List<DocumentRootMixedFeatureGroup> getMixed() {
    return mixed;
  }

  /**
   * Sets the '{@link DocumentRoot#getMixed() <em>mixed</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newMixed
   *          the new value of the '{@link DocumentRoot#getMixed() mixed}' feature.
   * @generated
   */
  public void setMixed(List<DocumentRootMixedFeatureGroup> newMixed) {
    mixed = newMixed;
  }

  /**
   * Returns the value of '<em><b>xMLNSPrefixMap</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>xMLNSPrefixMap</b></em>' feature
   * @generated
   */
  public Map<String, String> getXMLNSPrefixMap() {
    return xMLNSPrefixMap;
  }

  /**
   * Sets the '{@link DocumentRoot#getXMLNSPrefixMap() <em>xMLNSPrefixMap</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newXMLNSPrefixMap
   *          the new value of the '{@link DocumentRoot#getXMLNSPrefixMap() xMLNSPrefixMap}' feature.
   * @generated
   */
  public void setXMLNSPrefixMap(Map<String, String> newXMLNSPrefixMap) {
    xMLNSPrefixMap = newXMLNSPrefixMap;
  }

  /**
   * Returns the value of '<em><b>xSISchemaLocation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>xSISchemaLocation</b></em>' feature
   * @generated
   */
  public Map<String, String> getXSISchemaLocation() {
    return xSISchemaLocation;
  }

  /**
   * Sets the '{@link DocumentRoot#getXSISchemaLocation() <em>xSISchemaLocation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newXSISchemaLocation
   *          the new value of the '{@link DocumentRoot#getXSISchemaLocation() xSISchemaLocation}' feature.
   * @generated
   */
  public void setXSISchemaLocation(Map<String, String> newXSISchemaLocation) {
    xSISchemaLocation = newXSISchemaLocation;
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
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.EVEN);
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
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.EVEN,
        newEven);
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
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.MYSIMPLEABSTRACT);
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
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.EVENCOMPLEXNUMBER);
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
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.EVENCOMPLEXNUMBER, newEvenComplexNumber);
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
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.MYCOMPLEXABSTRACT);
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
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.MULTINUMBER);
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
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.MULTINUMBER, newMultiNumber);
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
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.NUMBER);
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
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.NUMBER,
        newNumber);
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
    return DocumentRootMixedFeatureGroup
        .getSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.ODD);
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
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.ODD,
        newOdd);
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
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.ODDCOMPLEXNUMBER);
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
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.ODDCOMPLEXNUMBER, newOddComplexNumber);
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "DocumentRoot " + " [even: " + getEven() + "]" + " [mySimpleAbstract: " + getMySimpleAbstract() + "]"
        + " [odd: " + getOdd() + "]";
  }
}
