package org.eclipse.graphiti.mm.pictograms;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.graphiti.mm.algorithms.styles.PrecisionPoint;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>CurvedConnection</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "pi_CurvedConnection")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class CurvedConnection extends Connection {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<PrecisionPoint> controlPoints = new ArrayList<PrecisionPoint>();

  /**
   * Returns the value of '<em><b>controlPoints</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>controlPoints</b></em>' feature
   * @generated
   */
  public List<PrecisionPoint> getControlPoints() {
    return controlPoints;
  }

  /**
   * Adds to the <em>controlPoints</em> feature.
   * 
   * @param controlPointsValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToControlPoints(PrecisionPoint controlPointsValue) {
    if (!controlPoints.contains(controlPointsValue)) {
      boolean result = controlPoints.add(controlPointsValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>controlPoints</em> feature.
   * 
   * @param controlPointsValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromControlPoints(PrecisionPoint controlPointsValue) {
    if (controlPoints.contains(controlPointsValue)) {
      boolean result = controlPoints.remove(controlPointsValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>controlPoints</em> feature.
   * 
   * @generated
   */
  public void clearControlPoints() {
    while (!controlPoints.isEmpty()) {
      removeFromControlPoints(controlPoints.iterator().next());
    }
  }

  /**
   * Sets the '{@link CurvedConnection#getControlPoints() <em>controlPoints</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newControlPoints
   *          the new value of the '{@link CurvedConnection#getControlPoints() controlPoints}' feature.
   * @generated
   */
  public void setControlPoints(List<PrecisionPoint> newControlPoints) {
    controlPoints = newControlPoints;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "CurvedConnection ";
  }
}
