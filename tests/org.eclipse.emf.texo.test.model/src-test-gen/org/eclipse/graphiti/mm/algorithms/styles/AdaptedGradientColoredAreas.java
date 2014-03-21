package org.eclipse.graphiti.mm.algorithms.styles;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AdaptedGradientColoredAreas</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "st_AdaptedGradientColoredAreas")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class AdaptedGradientColoredAreas extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String definedStyleId = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<GradientColoredAreas> adaptedGradientColoredAreas = new ArrayList<GradientColoredAreas>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer gradientType = null;

  /**
   * Returns the value of '<em><b>definedStyleId</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>definedStyleId</b></em>' feature
   * @generated
   */
  public String getDefinedStyleId() {
    return definedStyleId;
  }

  /**
   * Sets the '{@link AdaptedGradientColoredAreas#getDefinedStyleId() <em>definedStyleId</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newDefinedStyleId
   *          the new value of the '{@link AdaptedGradientColoredAreas#getDefinedStyleId() definedStyleId}' feature.
   * @generated
   */
  public void setDefinedStyleId(String newDefinedStyleId) {
    definedStyleId = newDefinedStyleId;
  }

  /**
   * Returns the value of '<em><b>adaptedGradientColoredAreas</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>adaptedGradientColoredAreas</b></em>' feature
   * @generated
   */
  public List<GradientColoredAreas> getAdaptedGradientColoredAreas() {
    return adaptedGradientColoredAreas;
  }

  /**
   * Adds to the <em>adaptedGradientColoredAreas</em> feature.
   * 
   * @param adaptedGradientColoredAreasValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToAdaptedGradientColoredAreas(GradientColoredAreas adaptedGradientColoredAreasValue) {
    if (!adaptedGradientColoredAreas.contains(adaptedGradientColoredAreasValue)) {
      boolean result = adaptedGradientColoredAreas.add(adaptedGradientColoredAreasValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>adaptedGradientColoredAreas</em> feature.
   * 
   * @param adaptedGradientColoredAreasValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromAdaptedGradientColoredAreas(GradientColoredAreas adaptedGradientColoredAreasValue) {
    if (adaptedGradientColoredAreas.contains(adaptedGradientColoredAreasValue)) {
      boolean result = adaptedGradientColoredAreas.remove(adaptedGradientColoredAreasValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>adaptedGradientColoredAreas</em> feature.
   * 
   * @generated
   */
  public void clearAdaptedGradientColoredAreas() {
    while (!adaptedGradientColoredAreas.isEmpty()) {
      removeFromAdaptedGradientColoredAreas(adaptedGradientColoredAreas.iterator().next());
    }
  }

  /**
   * Sets the '{@link AdaptedGradientColoredAreas#getAdaptedGradientColoredAreas() <em>adaptedGradientColoredAreas</em>}
   * ' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAdaptedGradientColoredAreas
   *          the new value of the '{@link AdaptedGradientColoredAreas#getAdaptedGradientColoredAreas()
   *          adaptedGradientColoredAreas}' feature.
   * @generated
   */
  public void setAdaptedGradientColoredAreas(List<GradientColoredAreas> newAdaptedGradientColoredAreas) {
    adaptedGradientColoredAreas = newAdaptedGradientColoredAreas;
  }

  /**
   * Returns the value of '<em><b>gradientType</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>gradientType</b></em>' feature
   * @generated
   */
  public Integer getGradientType() {
    return gradientType;
  }

  /**
   * Sets the '{@link AdaptedGradientColoredAreas#getGradientType() <em>gradientType</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGradientType
   *          the new value of the '{@link AdaptedGradientColoredAreas#getGradientType() gradientType}' feature.
   * @generated
   */
  public void setGradientType(Integer newGradientType) {
    gradientType = newGradientType;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AdaptedGradientColoredAreas " + " [definedStyleId: " + getDefinedStyleId() + "]" + " [gradientType: "
        + getGradientType() + "]";
  }
}
