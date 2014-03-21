package org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon;

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
   * Returns the value of '<em><b>complexEven</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>complexEven</b></em>' feature
   * @generated
   */
  public ComplexEvenType getComplexEven() {
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.COMPLEXEVEN);
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
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.COMPLEXEVEN, newComplexEven);
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
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.MYCOMPLEXABSTRACT);
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
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.COMPLEXODD);
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
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.COMPLEXODD, newComplexOdd);
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
   * Returns the value of '<em><b>myAbstract</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>myAbstract</b></em>' feature
   * @generated
   */
  public BigInteger getMyAbstract() {
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.MYABSTRACT);
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
   * Returns the value of '<em><b>root</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>root</b></em>' feature
   * @generated
   */
  public RootType getRoot() {
    return DocumentRootMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        DocumentRootMixedFeatureGroup.Feature.ROOT);
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
    DocumentRootMixedFeatureGroup.setSingleFeatureMapValue(getMixed(), DocumentRootMixedFeatureGroup.Feature.ROOT,
        newRoot);
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "DocumentRoot " + " [even: " + getEven() + "]" + " [myAbstract: " + getMyAbstract() + "]" + " [odd: "
        + getOdd() + "]";
  }
}
