package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Coordinates</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> Координаты <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_Coordinates")
@Table(name = "m_Coordinates")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Coordinates extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> X <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "x", precision = 15, scale = 7)
  private BigDecimal x = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Y <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "y", precision = 15, scale = 7)
  private BigDecimal y = null;

  /**
   * Returns the value of '<em><b>x</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> X <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>x</b></em>' feature
   * @generated
   */
  public BigDecimal getX() {
    return x;
  }

  /**
   * Sets the '{@link Coordinates#getX() <em>x</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> X <!-- end-model-doc -->
   * 
   * @param newX
   *          the new value of the '{@link Coordinates#getX() x}' feature.
   * @generated
   */
  public void setX(BigDecimal newX) {
    x = newX;
  }

  /**
   * Returns the value of '<em><b>y</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Y <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>y</b></em>' feature
   * @generated
   */
  public BigDecimal getY() {
    return y;
  }

  /**
   * Sets the '{@link Coordinates#getY() <em>y</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Y <!-- end-model-doc -->
   * 
   * @param newY
   *          the new value of the '{@link Coordinates#getY() y}' feature.
   * @generated
   */
  public void setY(BigDecimal newY) {
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
    return "Coordinates " + " [x: " + getX() + "]" + " [y: " + getY() + "]";
  }
}
