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
 * A representation of the model object '<em><b>GradientColoredArea</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "st_GradientColoredArea")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class GradientColoredArea extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL })
  private GradientColoredLocation start = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL })
  private GradientColoredLocation end = null;

  /**
   * Returns the value of '<em><b>start</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>start</b></em>' feature
   * @generated
   */
  public GradientColoredLocation getStart() {
    return start;
  }

  /**
   * Sets the '{@link GradientColoredArea#getStart() <em>start</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newStart
   *          the new value of the '{@link GradientColoredArea#getStart() start}' feature.
   * @generated
   */
  public void setStart(GradientColoredLocation newStart) {
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
  public GradientColoredLocation getEnd() {
    return end;
  }

  /**
   * Sets the '{@link GradientColoredArea#getEnd() <em>end</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newEnd
   *          the new value of the '{@link GradientColoredArea#getEnd() end}' feature.
   * @generated
   */
  public void setEnd(GradientColoredLocation newEnd) {
    end = newEnd;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "GradientColoredArea ";
  }
}
