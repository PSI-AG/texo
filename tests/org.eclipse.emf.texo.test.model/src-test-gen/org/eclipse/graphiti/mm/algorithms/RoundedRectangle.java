package org.eclipse.graphiti.mm.algorithms;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>RoundedRectangle</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "al_RoundedRectangle")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class RoundedRectangle extends GraphicsAlgorithm {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int cornerHeight = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int cornerWidth = 0;

  /**
   * Returns the value of '<em><b>cornerHeight</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>cornerHeight</b></em>' feature
   * @generated
   */
  public int getCornerHeight() {
    return cornerHeight;
  }

  /**
   * Sets the '{@link RoundedRectangle#getCornerHeight() <em>cornerHeight</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCornerHeight
   *          the new value of the '{@link RoundedRectangle#getCornerHeight() cornerHeight}' feature.
   * @generated
   */
  public void setCornerHeight(int newCornerHeight) {
    cornerHeight = newCornerHeight;
  }

  /**
   * Returns the value of '<em><b>cornerWidth</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>cornerWidth</b></em>' feature
   * @generated
   */
  public int getCornerWidth() {
    return cornerWidth;
  }

  /**
   * Sets the '{@link RoundedRectangle#getCornerWidth() <em>cornerWidth</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newCornerWidth
   *          the new value of the '{@link RoundedRectangle#getCornerWidth() cornerWidth}' feature.
   * @generated
   */
  public void setCornerWidth(int newCornerWidth) {
    cornerWidth = newCornerWidth;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "RoundedRectangle " + " [cornerHeight: " + getCornerHeight() + "]" + " [cornerWidth: " + getCornerWidth()
        + "]";
  }
}
