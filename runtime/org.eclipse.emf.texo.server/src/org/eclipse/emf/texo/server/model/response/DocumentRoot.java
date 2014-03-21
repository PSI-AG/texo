package org.eclipse.emf.texo.server.model.response;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * A representation of the model object '<em><b>DocumentRoot</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DocumentRoot {

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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private ErrorType error = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private ResponseType response = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private ResultType result = null;

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
   * @param the
   *          new value of the '{@link DocumentRoot#getMixed() mixed}' feature.
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
   * @param the
   *          new value of the '{@link DocumentRoot#getXMLNSPrefixMap() xMLNSPrefixMap}' feature.
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
   * @param the
   *          new value of the '{@link DocumentRoot#getXSISchemaLocation() xSISchemaLocation}' feature.
   * @generated
   */
  public void setXSISchemaLocation(Map<String, String> newXSISchemaLocation) {
    xSISchemaLocation = newXSISchemaLocation;
  }

  /**
   * Returns the value of '<em><b>error</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>error</b></em>' feature
   * @generated
   */
  public ErrorType getError() {
    return error;
  }

  /**
   * Sets the '{@link DocumentRoot#getError() <em>error</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link DocumentRoot#getError() error}' feature.
   * @generated
   */
  public void setError(ErrorType newError) {
    error = newError;
  }

  /**
   * Returns the value of '<em><b>response</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>response</b></em>' feature
   * @generated
   */
  public ResponseType getResponse() {
    return response;
  }

  /**
   * Sets the '{@link DocumentRoot#getResponse() <em>response</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link DocumentRoot#getResponse() response}' feature.
   * @generated
   */
  public void setResponse(ResponseType newResponse) {
    response = newResponse;
  }

  /**
   * Returns the value of '<em><b>result</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>result</b></em>' feature
   * @generated
   */
  public ResultType getResult() {
    return result;
  }

  /**
   * Sets the '{@link DocumentRoot#getResult() <em>result</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link DocumentRoot#getResult() result}' feature.
   * @generated
   */
  public void setResult(ResultType newResult) {
    result = newResult;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "DocumentRoot ";
  }
}
