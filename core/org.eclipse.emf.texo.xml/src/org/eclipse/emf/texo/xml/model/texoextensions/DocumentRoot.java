package org.eclipse.emf.texo.xml.model.texoextensions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/** 
 * A representation of the model object '<em><b>DocumentRoot</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class DocumentRoot {

  /** 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated 
   */
  private List<DocumentRootMixedFeatureGroup> mixed = new ArrayList<DocumentRootMixedFeatureGroup>();

  /** 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated 
   */
  private Map<String, String> xMLNSPrefixMap = new LinkedHashMap<String, String>();

  /** 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated 
   */
  private Map<String, String> xSISchemaLocation = new LinkedHashMap<String, String>();

  /** 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated 
   */
  private String id = null;

  /** 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated 
   */
  private String title = null;

  /** 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated 
   */
  private String type = null;

  /**
   * Returns the value of '<em><b>mixed</b></em>' feature.
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of '<em><b>mixed</b></em>' feature
   * @generated
   */
  public List<DocumentRootMixedFeatureGroup> getMixed() {
    return mixed;
  }

  /**
   * Sets the '{@link DocumentRoot#getMixed() <em>mixed</em>}' feature.
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getMixed() mixed}' feature.
   * @generated
   */
  public void setMixed(List<DocumentRootMixedFeatureGroup> newMixed) {
    mixed = newMixed;
  }

  /**
   * Returns the value of '<em><b>xMLNSPrefixMap</b></em>' feature.
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of '<em><b>xMLNSPrefixMap</b></em>' feature
   * @generated
   */
  public Map<String, String> getXMLNSPrefixMap() {
    return xMLNSPrefixMap;
  }

  /**
   * Sets the '{@link DocumentRoot#getXMLNSPrefixMap() <em>xMLNSPrefixMap</em>}' feature.
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getXMLNSPrefixMap() xMLNSPrefixMap}' feature.
   * @generated
   */
  public void setXMLNSPrefixMap(Map<String, String> newXMLNSPrefixMap) {
    xMLNSPrefixMap = newXMLNSPrefixMap;
  }

  /**
   * Returns the value of '<em><b>xSISchemaLocation</b></em>' feature.
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of '<em><b>xSISchemaLocation</b></em>' feature
   * @generated
   */
  public Map<String, String> getXSISchemaLocation() {
    return xSISchemaLocation;
  }

  /**
   * Sets the '{@link DocumentRoot#getXSISchemaLocation() <em>xSISchemaLocation</em>}' feature.
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getXSISchemaLocation() xSISchemaLocation}' feature.
   * @generated
   */
  public void setXSISchemaLocation(Map<String, String> newXSISchemaLocation) {
    xSISchemaLocation = newXSISchemaLocation;
  }

  /**
   * Returns the value of '<em><b>id</b></em>' feature.
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of '<em><b>id</b></em>' feature
   * @generated
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the '{@link DocumentRoot#getId() <em>id</em>}' feature.
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getId() id}' feature.
   * @generated
   */
  public void setId(String newId) {
    id = newId;
  }

  /**
   * Returns the value of '<em><b>title</b></em>' feature.
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of '<em><b>title</b></em>' feature
   * @generated
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the '{@link DocumentRoot#getTitle() <em>title</em>}' feature.
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getTitle() title}' feature.
   * @generated
   */
  public void setTitle(String newTitle) {
    title = newTitle;
  }

  /**
   * Returns the value of '<em><b>type</b></em>' feature.
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of '<em><b>type</b></em>' feature
   * @generated
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the '{@link DocumentRoot#getType() <em>type</em>}' feature.
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getType() type}' feature.
   * @generated
   */
  public void setType(String newType) {
    type = newType;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "DocumentRoot " + " [id: " + getId() + "]" + " [title: " + getTitle() + "]" + " [type: " + getType() + "]";
  }
}
