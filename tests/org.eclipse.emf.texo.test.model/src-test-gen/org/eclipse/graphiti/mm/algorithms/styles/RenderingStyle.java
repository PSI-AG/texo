package org.eclipse.graphiti.mm.algorithms.styles;

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
 * A representation of the model object '<em><b>RenderingStyle</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "st_RenderingStyle")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class RenderingStyle extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL })
  private AdaptedGradientColoredAreas adaptedGradientColoredAreas = null;

  /**
   * Returns the value of '<em><b>adaptedGradientColoredAreas</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>adaptedGradientColoredAreas</b></em>' feature
   * @generated
   */
  public AdaptedGradientColoredAreas getAdaptedGradientColoredAreas() {
    return adaptedGradientColoredAreas;
  }

  /**
   * Sets the '{@link RenderingStyle#getAdaptedGradientColoredAreas() <em>adaptedGradientColoredAreas</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAdaptedGradientColoredAreas
   *          the new value of the '{@link RenderingStyle#getAdaptedGradientColoredAreas() adaptedGradientColoredAreas}'
   *          feature.
   * @generated
   */
  public void setAdaptedGradientColoredAreas(AdaptedGradientColoredAreas newAdaptedGradientColoredAreas) {
    adaptedGradientColoredAreas = newAdaptedGradientColoredAreas;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "RenderingStyle ";
  }
}
