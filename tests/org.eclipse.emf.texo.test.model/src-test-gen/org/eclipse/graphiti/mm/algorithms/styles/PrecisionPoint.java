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
 * A representation of the model object '<em><b>PrecisionPoint</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "st_PrecisionPoint")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class PrecisionPoint extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private double x = 0.0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private double y = 0.0;

  /**
   * Returns the value of '<em><b>x</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>x</b></em>' feature
   * @generated
   */
  public double getX() {
    return x;
  }

  /**
   * Sets the '{@link PrecisionPoint#getX() <em>x</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newX
   *          the new value of the '{@link PrecisionPoint#getX() x}' feature.
   * @generated
   */
  public void setX(double newX) {
    x = newX;
  }

  /**
   * Returns the value of '<em><b>y</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>y</b></em>' feature
   * @generated
   */
  public double getY() {
    return y;
  }

  /**
   * Sets the '{@link PrecisionPoint#getY() <em>y</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newY
   *          the new value of the '{@link PrecisionPoint#getY() y}' feature.
   * @generated
   */
  public void setY(double newY) {
    y = newY;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PrecisionPoint " + " [x: " + getX() + "]" + " [y: " + getY() + "]";
  }
}
