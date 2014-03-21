package org.eclipse.graphiti.mm.algorithms;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Image</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "al_Image")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Image extends GraphicsAlgorithm {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String id = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Boolean stretchH = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Boolean stretchV = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Boolean proportional = null;

  /**
   * Returns the value of '<em><b>id</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>id</b></em>' feature
   * @generated
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the '{@link Image#getId() <em>id</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newId
   *          the new value of the '{@link Image#getId() id}' feature.
   * @generated
   */
  public void setId(String newId) {
    id = newId;
  }

  /**
   * Returns the value of '<em><b>stretchH</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>stretchH</b></em>' feature
   * @generated
   */
  public Boolean getStretchH() {
    return stretchH;
  }

  /**
   * Sets the '{@link Image#getStretchH() <em>stretchH</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStretchH
   *          the new value of the '{@link Image#getStretchH() stretchH}' feature.
   * @generated
   */
  public void setStretchH(Boolean newStretchH) {
    stretchH = newStretchH;
  }

  /**
   * Returns the value of '<em><b>stretchV</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>stretchV</b></em>' feature
   * @generated
   */
  public Boolean getStretchV() {
    return stretchV;
  }

  /**
   * Sets the '{@link Image#getStretchV() <em>stretchV</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStretchV
   *          the new value of the '{@link Image#getStretchV() stretchV}' feature.
   * @generated
   */
  public void setStretchV(Boolean newStretchV) {
    stretchV = newStretchV;
  }

  /**
   * Returns the value of '<em><b>proportional</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>proportional</b></em>' feature
   * @generated
   */
  public Boolean getProportional() {
    return proportional;
  }

  /**
   * Sets the '{@link Image#getProportional() <em>proportional</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newProportional
   *          the new value of the '{@link Image#getProportional() proportional}' feature.
   * @generated
   */
  public void setProportional(Boolean newProportional) {
    proportional = newProportional;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Image " + " [id: " + getId() + "]" + " [stretchH: " + getStretchH() + "]" + " [stretchV: " + getStretchV()
        + "]" + " [proportional: " + getProportional() + "]";
  }
}
