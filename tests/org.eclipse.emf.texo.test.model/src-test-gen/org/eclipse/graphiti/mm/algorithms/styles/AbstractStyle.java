package org.eclipse.graphiti.mm.algorithms.styles;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AbstractStyle</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "st_AbstractStyle")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class AbstractStyle extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Color background = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Color foreground = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer lineWidth = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Enumerated(EnumType.STRING)
  private LineStyle lineStyle = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Boolean filled = Boolean.TRUE;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Boolean lineVisible = Boolean.TRUE;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL })
  private RenderingStyle renderingStyle = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Double transparency = null;

  /**
   * Returns the value of '<em><b>background</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>background</b></em>' feature
   * @generated
   */
  public Color getBackground() {
    return background;
  }

  /**
   * Sets the '{@link AbstractStyle#getBackground() <em>background</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBackground
   *          the new value of the '{@link AbstractStyle#getBackground() background}' feature.
   * @generated
   */
  public void setBackground(Color newBackground) {
    background = newBackground;
  }

  /**
   * Returns the value of '<em><b>foreground</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>foreground</b></em>' feature
   * @generated
   */
  public Color getForeground() {
    return foreground;
  }

  /**
   * Sets the '{@link AbstractStyle#getForeground() <em>foreground</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newForeground
   *          the new value of the '{@link AbstractStyle#getForeground() foreground}' feature.
   * @generated
   */
  public void setForeground(Color newForeground) {
    foreground = newForeground;
  }

  /**
   * Returns the value of '<em><b>lineWidth</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>lineWidth</b></em>' feature
   * @generated
   */
  public Integer getLineWidth() {
    return lineWidth;
  }

  /**
   * Sets the '{@link AbstractStyle#getLineWidth() <em>lineWidth</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLineWidth
   *          the new value of the '{@link AbstractStyle#getLineWidth() lineWidth}' feature.
   * @generated
   */
  public void setLineWidth(Integer newLineWidth) {
    lineWidth = newLineWidth;
  }

  /**
   * Returns the value of '<em><b>lineStyle</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>lineStyle</b></em>' feature
   * @generated
   */
  public LineStyle getLineStyle() {
    return lineStyle;
  }

  /**
   * Sets the '{@link AbstractStyle#getLineStyle() <em>lineStyle</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLineStyle
   *          the new value of the '{@link AbstractStyle#getLineStyle() lineStyle}' feature.
   * @generated
   */
  public void setLineStyle(LineStyle newLineStyle) {
    lineStyle = newLineStyle;
  }

  /**
   * Returns the value of '<em><b>filled</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>filled</b></em>' feature
   * @generated
   */
  public Boolean getFilled() {
    return filled;
  }

  /**
   * Sets the '{@link AbstractStyle#getFilled() <em>filled</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFilled
   *          the new value of the '{@link AbstractStyle#getFilled() filled}' feature.
   * @generated
   */
  public void setFilled(Boolean newFilled) {
    filled = newFilled;
  }

  /**
   * Returns the value of '<em><b>lineVisible</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>lineVisible</b></em>' feature
   * @generated
   */
  public Boolean getLineVisible() {
    return lineVisible;
  }

  /**
   * Sets the '{@link AbstractStyle#getLineVisible() <em>lineVisible</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLineVisible
   *          the new value of the '{@link AbstractStyle#getLineVisible() lineVisible}' feature.
   * @generated
   */
  public void setLineVisible(Boolean newLineVisible) {
    lineVisible = newLineVisible;
  }

  /**
   * Returns the value of '<em><b>renderingStyle</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>renderingStyle</b></em>' feature
   * @generated
   */
  public RenderingStyle getRenderingStyle() {
    return renderingStyle;
  }

  /**
   * Sets the '{@link AbstractStyle#getRenderingStyle() <em>renderingStyle</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newRenderingStyle
   *          the new value of the '{@link AbstractStyle#getRenderingStyle() renderingStyle}' feature.
   * @generated
   */
  public void setRenderingStyle(RenderingStyle newRenderingStyle) {
    renderingStyle = newRenderingStyle;
  }

  /**
   * Returns the value of '<em><b>transparency</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>transparency</b></em>' feature
   * @generated
   */
  public Double getTransparency() {
    return transparency;
  }

  /**
   * Sets the '{@link AbstractStyle#getTransparency() <em>transparency</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTransparency
   *          the new value of the '{@link AbstractStyle#getTransparency() transparency}' feature.
   * @generated
   */
  public void setTransparency(Double newTransparency) {
    transparency = newTransparency;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractStyle " + " [lineWidth: " + getLineWidth() + "]" + " [lineStyle: " + getLineStyle() + "]"
        + " [filled: " + getFilled() + "]" + " [lineVisible: " + getLineVisible() + "]" + " [transparency: "
        + getTransparency() + "]";
  }
}
