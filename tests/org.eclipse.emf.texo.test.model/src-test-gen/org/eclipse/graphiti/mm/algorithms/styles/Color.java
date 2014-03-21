package org.eclipse.graphiti.mm.algorithms.styles;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Color</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "st_Color")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Color extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int red = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int green = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int blue = 0;

  /**
   * Returns the value of '<em><b>red</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>red</b></em>' feature
   * @generated
   */
  public int getRed() {
    return red;
  }

  /**
   * Sets the '{@link Color#getRed() <em>red</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newRed
   *          the new value of the '{@link Color#getRed() red}' feature.
   * @generated
   */
  public void setRed(int newRed) {
    red = newRed;
  }

  /**
   * Returns the value of '<em><b>green</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>green</b></em>' feature
   * @generated
   */
  public int getGreen() {
    return green;
  }

  /**
   * Sets the '{@link Color#getGreen() <em>green</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGreen
   *          the new value of the '{@link Color#getGreen() green}' feature.
   * @generated
   */
  public void setGreen(int newGreen) {
    green = newGreen;
  }

  /**
   * Returns the value of '<em><b>blue</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>blue</b></em>' feature
   * @generated
   */
  public int getBlue() {
    return blue;
  }

  /**
   * Sets the '{@link Color#getBlue() <em>blue</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBlue
   *          the new value of the '{@link Color#getBlue() blue}' feature.
   * @generated
   */
  public void setBlue(int newBlue) {
    blue = newBlue;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Color " + " [red: " + getRed() + "]" + " [green: " + getGreen() + "]" + " [blue: " + getBlue() + "]";
  }
}
