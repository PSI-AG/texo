package org.eclipse.graphiti.mm.algorithms;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.TextStyleRegion;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AbstractText</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "al_AbstractText")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class AbstractText extends GraphicsAlgorithm {

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
  private Orientation horizontalAlignment = Orientation.ALIGNMENT_LEFT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Enumerated(EnumType.STRING)
  private Orientation verticalAlignment = Orientation.ALIGNMENT_CENTER;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer angle = new Integer(0);

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String value = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<TextStyleRegion> styleRegions = new ArrayList<TextStyleRegion>();

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
   * Sets the '{@link AbstractText#getFont() <em>font</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newFont
   *          the new value of the '{@link AbstractText#getFont() font}' feature.
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
   * Sets the '{@link AbstractText#getHorizontalAlignment() <em>horizontalAlignment</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newHorizontalAlignment
   *          the new value of the '{@link AbstractText#getHorizontalAlignment() horizontalAlignment}' feature.
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
   * Sets the '{@link AbstractText#getVerticalAlignment() <em>verticalAlignment</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newVerticalAlignment
   *          the new value of the '{@link AbstractText#getVerticalAlignment() verticalAlignment}' feature.
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
   * Sets the '{@link AbstractText#getAngle() <em>angle</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAngle
   *          the new value of the '{@link AbstractText#getAngle() angle}' feature.
   * @generated
   */
  public void setAngle(Integer newAngle) {
    angle = newAngle;
  }

  /**
   * Returns the value of '<em><b>value</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>value</b></em>' feature
   * @generated
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets the '{@link AbstractText#getValue() <em>value</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newValue
   *          the new value of the '{@link AbstractText#getValue() value}' feature.
   * @generated
   */
  public void setValue(String newValue) {
    value = newValue;
  }

  /**
   * Returns the value of '<em><b>styleRegions</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>styleRegions</b></em>' feature
   * @generated
   */
  public List<TextStyleRegion> getStyleRegions() {
    return styleRegions;
  }

  /**
   * Adds to the <em>styleRegions</em> feature.
   * 
   * @param styleRegionsValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToStyleRegions(TextStyleRegion styleRegionsValue) {
    if (!styleRegions.contains(styleRegionsValue)) {
      boolean result = styleRegions.add(styleRegionsValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>styleRegions</em> feature.
   * 
   * @param styleRegionsValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromStyleRegions(TextStyleRegion styleRegionsValue) {
    if (styleRegions.contains(styleRegionsValue)) {
      boolean result = styleRegions.remove(styleRegionsValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>styleRegions</em> feature.
   * 
   * @generated
   */
  public void clearStyleRegions() {
    while (!styleRegions.isEmpty()) {
      removeFromStyleRegions(styleRegions.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractText#getStyleRegions() <em>styleRegions</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStyleRegions
   *          the new value of the '{@link AbstractText#getStyleRegions() styleRegions}' feature.
   * @generated
   */
  public void setStyleRegions(List<TextStyleRegion> newStyleRegions) {
    styleRegions = newStyleRegions;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractText " + " [horizontalAlignment: " + getHorizontalAlignment() + "]" + " [verticalAlignment: "
        + getVerticalAlignment() + "]" + " [angle: " + getAngle() + "]" + " [value: " + getValue() + "]";
  }
}
