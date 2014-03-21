package org.eclipse.graphiti.mm.pictograms;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>FreeFormConnection</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "pi_FreeFormConnection")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class FreeFormConnection extends Connection {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<Point> bendpoints = new ArrayList<Point>();

  /**
   * Returns the value of '<em><b>bendpoints</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>bendpoints</b></em>' feature
   * @generated
   */
  public List<Point> getBendpoints() {
    return bendpoints;
  }

  /**
   * Adds to the <em>bendpoints</em> feature.
   * 
   * @param bendpointsValue
   *          the value to add
   * @return true if the value is added to the collection (it was not yet present in the collection), false otherwise
   * @generated
   */
  public boolean addToBendpoints(Point bendpointsValue) {
    if (!bendpoints.contains(bendpointsValue)) {
      boolean result = bendpoints.add(bendpointsValue);
      return result;
    }
    return false;
  }

  /**
   * Removes from the <em>bendpoints</em> feature.
   * 
   * @param bendpointsValue
   *          the value to remove
   * @return true if the value is removed from the collection (it existed in the collection before removing), false
   *         otherwise
   * 
   * @generated
   */
  public boolean removeFromBendpoints(Point bendpointsValue) {
    if (bendpoints.contains(bendpointsValue)) {
      boolean result = bendpoints.remove(bendpointsValue);
      return result;
    }
    return false;
  }

  /**
   * Clears the <em>bendpoints</em> feature.
   * 
   * @generated
   */
  public void clearBendpoints() {
    while (!bendpoints.isEmpty()) {
      removeFromBendpoints(bendpoints.iterator().next());
    }
  }

  /**
   * Sets the '{@link FreeFormConnection#getBendpoints() <em>bendpoints</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newBendpoints
   *          the new value of the '{@link FreeFormConnection#getBendpoints() bendpoints}' feature.
   * @generated
   */
  public void setBendpoints(List<Point> newBendpoints) {
    bendpoints = newBendpoints;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "FreeFormConnection ";
  }
}
