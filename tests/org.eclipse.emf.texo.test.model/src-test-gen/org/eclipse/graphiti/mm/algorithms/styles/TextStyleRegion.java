package org.eclipse.graphiti.mm.algorithms.styles;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>TextStyleRegion</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "st_TextStyleRegion")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class TextStyleRegion extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private int start = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private int end = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL })
  private TextStyle style = null;

  /**
   * Returns the value of '<em><b>start</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>start</b></em>' feature
   * @generated
   */
  public int getStart() {
    return start;
  }

  /**
   * Sets the '{@link TextStyleRegion#getStart() <em>start</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStart
   *          the new value of the '{@link TextStyleRegion#getStart() start}' feature.
   * @generated
   */
  public void setStart(int newStart) {
    start = newStart;
  }

  /**
   * Returns the value of '<em><b>end</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>end</b></em>' feature
   * @generated
   */
  public int getEnd() {
    return end;
  }

  /**
   * Sets the '{@link TextStyleRegion#getEnd() <em>end</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEnd
   *          the new value of the '{@link TextStyleRegion#getEnd() end}' feature.
   * @generated
   */
  public void setEnd(int newEnd) {
    end = newEnd;
  }

  /**
   * Returns the value of '<em><b>style</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>style</b></em>' feature
   * @generated
   */
  public TextStyle getStyle() {
    return style;
  }

  /**
   * Sets the '{@link TextStyleRegion#getStyle() <em>style</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStyle
   *          the new value of the '{@link TextStyleRegion#getStyle() style}' feature.
   * @generated
   */
  public void setStyle(TextStyle newStyle) {
    style = newStyle;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "TextStyleRegion " + " [start: " + getStart() + "]" + " [end: " + getEnd() + "]";
  }
}
