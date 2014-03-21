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
 * A representation of the model object '<em><b>Point</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "st_Point")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Point extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int x = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int y = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int before = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int after = 0;

  /**
   * Returns the value of '<em><b>x</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>x</b></em>' feature
   * @generated
   */
  public int getX() {
    return x;
  }

  /**
   * Sets the '{@link Point#getX() <em>x</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newX
   *          the new value of the '{@link Point#getX() x}' feature.
   * @generated
   */
  public void setX(int newX) {
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
  public int getY() {
    return y;
  }

  /**
   * Sets the '{@link Point#getY() <em>y</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newY
   *          the new value of the '{@link Point#getY() y}' feature.
   * @generated
   */
  public void setY(int newY) {
    y = newY;
  }

  /**
   * Returns the value of '<em><b>before</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>before</b></em>' feature
   * @generated
   */
  public int getBefore() {
    return before;
  }

  /**
   * Sets the '{@link Point#getBefore() <em>before</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBefore
   *          the new value of the '{@link Point#getBefore() before}' feature.
   * @generated
   */
  public void setBefore(int newBefore) {
    before = newBefore;
  }

  /**
   * Returns the value of '<em><b>after</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>after</b></em>' feature
   * @generated
   */
  public int getAfter() {
    return after;
  }

  /**
   * Sets the '{@link Point#getAfter() <em>after</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAfter
   *          the new value of the '{@link Point#getAfter() after}' feature.
   * @generated
   */
  public void setAfter(int newAfter) {
    after = newAfter;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Point " + " [x: " + getX() + "]" + " [y: " + getY() + "]" + " [before: " + getBefore() + "]" + " [after: "
        + getAfter() + "]";
  }
}
