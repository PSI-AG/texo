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
 * A representation of the model object '<em><b>GradientColoredLocation</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "st_GradientColoredLocation")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class GradientColoredLocation extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Enumerated(EnumType.STRING)
  private LocationType locationType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private Integer locationValue = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private Color color = null;

  /**
   * Returns the value of '<em><b>locationType</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>locationType</b></em>' feature
   * @generated
   */
  public LocationType getLocationType() {
    return locationType;
  }

  /**
   * Sets the '{@link GradientColoredLocation#getLocationType() <em>locationType</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLocationType
   *          the new value of the '{@link GradientColoredLocation#getLocationType() locationType}' feature.
   * @generated
   */
  public void setLocationType(LocationType newLocationType) {
    locationType = newLocationType;
  }

  /**
   * Returns the value of '<em><b>locationValue</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>locationValue</b></em>' feature
   * @generated
   */
  public Integer getLocationValue() {
    return locationValue;
  }

  /**
   * Sets the '{@link GradientColoredLocation#getLocationValue() <em>locationValue</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLocationValue
   *          the new value of the '{@link GradientColoredLocation#getLocationValue() locationValue}' feature.
   * @generated
   */
  public void setLocationValue(Integer newLocationValue) {
    locationValue = newLocationValue;
  }

  /**
   * Returns the value of '<em><b>color</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>color</b></em>' feature
   * @generated
   */
  public Color getColor() {
    return color;
  }

  /**
   * Sets the '{@link GradientColoredLocation#getColor() <em>color</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newColor
   *          the new value of the '{@link GradientColoredLocation#getColor() color}' feature.
   * @generated
   */
  public void setColor(Color newColor) {
    color = newColor;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "GradientColoredLocation " + " [locationType: " + getLocationType() + "]" + " [locationValue: "
        + getLocationValue() + "]";
  }
}
