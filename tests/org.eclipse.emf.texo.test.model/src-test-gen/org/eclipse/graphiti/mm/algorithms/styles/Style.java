package org.eclipse.graphiti.mm.algorithms.styles;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.graphiti.mm.StyleContainer;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Style</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "st_Style")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Style extends StyleContainer {

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
  private String description = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private Font font = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Enumerated(EnumType.STRING)
  private Orientation horizontalAlignment = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Enumerated(EnumType.STRING)
  private Orientation verticalAlignment = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer angle = null;

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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private StyleContainer styleContainer = null;

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
   * Sets the '{@link Style#getId() <em>id</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newId
   *          the new value of the '{@link Style#getId() id}' feature.
   * @generated
   */
  public void setId(String newId) {
    id = newId;
  }

  /**
   * Returns the value of '<em><b>description</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>description</b></em>' feature
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the '{@link Style#getDescription() <em>description</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDescription
   *          the new value of the '{@link Style#getDescription() description}' feature.
   * @generated
   */
  public void setDescription(String newDescription) {
    description = newDescription;
  }

  /**
   * Returns the value of '<em><b>font</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>font</b></em>' feature
   * @generated
   */
  public Font getFont() {
    return font;
  }

  /**
   * Sets the '{@link Style#getFont() <em>font</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFont
   *          the new value of the '{@link Style#getFont() font}' feature.
   * @generated
   */
  public void setFont(Font newFont) {
    font = newFont;
  }

  /**
   * Returns the value of '<em><b>horizontalAlignment</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>horizontalAlignment</b></em>' feature
   * @generated
   */
  public Orientation getHorizontalAlignment() {
    return horizontalAlignment;
  }

  /**
   * Sets the '{@link Style#getHorizontalAlignment() <em>horizontalAlignment</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newHorizontalAlignment
   *          the new value of the '{@link Style#getHorizontalAlignment() horizontalAlignment}' feature.
   * @generated
   */
  public void setHorizontalAlignment(Orientation newHorizontalAlignment) {
    horizontalAlignment = newHorizontalAlignment;
  }

  /**
   * Returns the value of '<em><b>verticalAlignment</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>verticalAlignment</b></em>' feature
   * @generated
   */
  public Orientation getVerticalAlignment() {
    return verticalAlignment;
  }

  /**
   * Sets the '{@link Style#getVerticalAlignment() <em>verticalAlignment</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newVerticalAlignment
   *          the new value of the '{@link Style#getVerticalAlignment() verticalAlignment}' feature.
   * @generated
   */
  public void setVerticalAlignment(Orientation newVerticalAlignment) {
    verticalAlignment = newVerticalAlignment;
  }

  /**
   * Returns the value of '<em><b>angle</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>angle</b></em>' feature
   * @generated
   */
  public Integer getAngle() {
    return angle;
  }

  /**
   * Sets the '{@link Style#getAngle() <em>angle</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAngle
   *          the new value of the '{@link Style#getAngle() angle}' feature.
   * @generated
   */
  public void setAngle(Integer newAngle) {
    angle = newAngle;
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
   * Sets the '{@link Style#getStretchH() <em>stretchH</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStretchH
   *          the new value of the '{@link Style#getStretchH() stretchH}' feature.
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
   * Sets the '{@link Style#getStretchV() <em>stretchV</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStretchV
   *          the new value of the '{@link Style#getStretchV() stretchV}' feature.
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
   * Sets the '{@link Style#getProportional() <em>proportional</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newProportional
   *          the new value of the '{@link Style#getProportional() proportional}' feature.
   * @generated
   */
  public void setProportional(Boolean newProportional) {
    proportional = newProportional;
  }

  /**
   * Returns the value of '<em><b>styleContainer</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>styleContainer</b></em>' feature
   * @generated
   */
  public StyleContainer getStyleContainer() {
    return styleContainer;
  }

  /**
   * Sets the '{@link Style#getStyleContainer() <em>styleContainer</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStyleContainer
   *          the new value of the '{@link Style#getStyleContainer() styleContainer}' feature.
   * @generated
   */
  public void setStyleContainer(StyleContainer newStyleContainer) {
    styleContainer = newStyleContainer;
  }

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
   * Sets the '{@link Style#getBackground() <em>background</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBackground
   *          the new value of the '{@link Style#getBackground() background}' feature.
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
   * Sets the '{@link Style#getForeground() <em>foreground</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newForeground
   *          the new value of the '{@link Style#getForeground() foreground}' feature.
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
   * Sets the '{@link Style#getLineWidth() <em>lineWidth</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLineWidth
   *          the new value of the '{@link Style#getLineWidth() lineWidth}' feature.
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
   * Sets the '{@link Style#getLineStyle() <em>lineStyle</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLineStyle
   *          the new value of the '{@link Style#getLineStyle() lineStyle}' feature.
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
   * Sets the '{@link Style#getFilled() <em>filled</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFilled
   *          the new value of the '{@link Style#getFilled() filled}' feature.
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
   * Sets the '{@link Style#getLineVisible() <em>lineVisible</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLineVisible
   *          the new value of the '{@link Style#getLineVisible() lineVisible}' feature.
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
   * Sets the '{@link Style#getRenderingStyle() <em>renderingStyle</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newRenderingStyle
   *          the new value of the '{@link Style#getRenderingStyle() renderingStyle}' feature.
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
   * Sets the '{@link Style#getTransparency() <em>transparency</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTransparency
   *          the new value of the '{@link Style#getTransparency() transparency}' feature.
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
    return "Style " + " [id: " + getId() + "]" + " [description: " + getDescription() + "]" + " [horizontalAlignment: "
        + getHorizontalAlignment() + "]" + " [verticalAlignment: " + getVerticalAlignment() + "]" + " [angle: "
        + getAngle() + "]" + " [stretchH: " + getStretchH() + "]" + " [stretchV: " + getStretchV() + "]"
        + " [proportional: " + getProportional() + "]" + " [lineWidth: " + getLineWidth() + "]" + " [lineStyle: "
        + getLineStyle() + "]" + " [filled: " + getFilled() + "]" + " [lineVisible: " + getLineVisible() + "]"
        + " [transparency: " + getTransparency() + "]";
  }
}
