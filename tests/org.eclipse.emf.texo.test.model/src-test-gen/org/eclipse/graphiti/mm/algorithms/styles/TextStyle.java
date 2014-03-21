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
 * A representation of the model object '<em><b>TextStyle</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "st_TextStyle")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class TextStyle extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private boolean underline = false;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Enumerated(EnumType.STRING)
  private UnderlineStyle underlineStyle = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private boolean strikeout = false;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Font font = null;

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
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Color background = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Color underlineColor = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Color strikeoutColor = null;

  /**
   * Returns the value of '<em><b>underline</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>underline</b></em>' feature
   * @generated
   */
  public boolean isUnderline() {
    return underline;
  }

  /**
   * Sets the '{@link TextStyle#isUnderline() <em>underline</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newUnderline
   *          the new value of the '{@link TextStyle#isUnderline() underline}' feature.
   * @generated
   */
  public void setUnderline(boolean newUnderline) {
    underline = newUnderline;
  }

  /**
   * Returns the value of '<em><b>underlineStyle</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>underlineStyle</b></em>' feature
   * @generated
   */
  public UnderlineStyle getUnderlineStyle() {
    return underlineStyle;
  }

  /**
   * Sets the '{@link TextStyle#getUnderlineStyle() <em>underlineStyle</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newUnderlineStyle
   *          the new value of the '{@link TextStyle#getUnderlineStyle() underlineStyle}' feature.
   * @generated
   */
  public void setUnderlineStyle(UnderlineStyle newUnderlineStyle) {
    underlineStyle = newUnderlineStyle;
  }

  /**
   * Returns the value of '<em><b>strikeout</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>strikeout</b></em>' feature
   * @generated
   */
  public boolean isStrikeout() {
    return strikeout;
  }

  /**
   * Sets the '{@link TextStyle#isStrikeout() <em>strikeout</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStrikeout
   *          the new value of the '{@link TextStyle#isStrikeout() strikeout}' feature.
   * @generated
   */
  public void setStrikeout(boolean newStrikeout) {
    strikeout = newStrikeout;
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
   * Sets the '{@link TextStyle#getFont() <em>font</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFont
   *          the new value of the '{@link TextStyle#getFont() font}' feature.
   * @generated
   */
  public void setFont(Font newFont) {
    font = newFont;
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
   * Sets the '{@link TextStyle#getForeground() <em>foreground</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newForeground
   *          the new value of the '{@link TextStyle#getForeground() foreground}' feature.
   * @generated
   */
  public void setForeground(Color newForeground) {
    foreground = newForeground;
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
   * Sets the '{@link TextStyle#getBackground() <em>background</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBackground
   *          the new value of the '{@link TextStyle#getBackground() background}' feature.
   * @generated
   */
  public void setBackground(Color newBackground) {
    background = newBackground;
  }

  /**
   * Returns the value of '<em><b>underlineColor</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>underlineColor</b></em>' feature
   * @generated
   */
  public Color getUnderlineColor() {
    return underlineColor;
  }

  /**
   * Sets the '{@link TextStyle#getUnderlineColor() <em>underlineColor</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newUnderlineColor
   *          the new value of the '{@link TextStyle#getUnderlineColor() underlineColor}' feature.
   * @generated
   */
  public void setUnderlineColor(Color newUnderlineColor) {
    underlineColor = newUnderlineColor;
  }

  /**
   * Returns the value of '<em><b>strikeoutColor</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>strikeoutColor</b></em>' feature
   * @generated
   */
  public Color getStrikeoutColor() {
    return strikeoutColor;
  }

  /**
   * Sets the '{@link TextStyle#getStrikeoutColor() <em>strikeoutColor</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStrikeoutColor
   *          the new value of the '{@link TextStyle#getStrikeoutColor() strikeoutColor}' feature.
   * @generated
   */
  public void setStrikeoutColor(Color newStrikeoutColor) {
    strikeoutColor = newStrikeoutColor;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "TextStyle " + " [underline: " + isUnderline() + "]" + " [underlineStyle: " + getUnderlineStyle() + "]"
        + " [strikeout: " + isStrikeout() + "]";
  }
}
