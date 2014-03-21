package org.eclipse.graphiti.mm.pictograms;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>BoxRelativeAnchor</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "pi_BoxRelativeAnchor")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class BoxRelativeAnchor extends AdvancedAnchor {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private double relativeWidth = 0.0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private double relativeHeight = 0.0;

  /**
   * Returns the value of '<em><b>relativeWidth</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>relativeWidth</b></em>' feature
   * @generated
   */
  public double getRelativeWidth() {
    return relativeWidth;
  }

  /**
   * Sets the '{@link BoxRelativeAnchor#getRelativeWidth() <em>relativeWidth</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newRelativeWidth
   *          the new value of the '{@link BoxRelativeAnchor#getRelativeWidth() relativeWidth}' feature.
   * @generated
   */
  public void setRelativeWidth(double newRelativeWidth) {
    relativeWidth = newRelativeWidth;
  }

  /**
   * Returns the value of '<em><b>relativeHeight</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>relativeHeight</b></em>' feature
   * @generated
   */
  public double getRelativeHeight() {
    return relativeHeight;
  }

  /**
   * Sets the '{@link BoxRelativeAnchor#getRelativeHeight() <em>relativeHeight</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newRelativeHeight
   *          the new value of the '{@link BoxRelativeAnchor#getRelativeHeight() relativeHeight}' feature.
   * @generated
   */
  public void setRelativeHeight(double newRelativeHeight) {
    relativeHeight = newRelativeHeight;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "BoxRelativeAnchor " + " [relativeWidth: " + getRelativeWidth() + "]" + " [relativeHeight: "
        + getRelativeHeight() + "]";
  }
}
