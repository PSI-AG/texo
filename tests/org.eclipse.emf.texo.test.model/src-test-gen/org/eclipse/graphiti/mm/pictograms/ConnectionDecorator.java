package org.eclipse.graphiti.mm.pictograms;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ConnectionDecorator</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "pi_ConnectionDecorator")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ConnectionDecorator extends Shape {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private boolean locationRelative = false;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private double location = 0.0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  @JoinColumns({ @JoinColumn(nullable = true) })
  private Connection connection = null;

  /**
   * Returns the value of '<em><b>locationRelative</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>locationRelative</b></em>' feature
   * @generated
   */
  public boolean isLocationRelative() {
    return locationRelative;
  }

  /**
   * Sets the '{@link ConnectionDecorator#isLocationRelative() <em>locationRelative</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLocationRelative
   *          the new value of the '{@link ConnectionDecorator#isLocationRelative() locationRelative}' feature.
   * @generated
   */
  public void setLocationRelative(boolean newLocationRelative) {
    locationRelative = newLocationRelative;
  }

  /**
   * Returns the value of '<em><b>location</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>location</b></em>' feature
   * @generated
   */
  public double getLocation() {
    return location;
  }

  /**
   * Sets the '{@link ConnectionDecorator#getLocation() <em>location</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLocation
   *          the new value of the '{@link ConnectionDecorator#getLocation() location}' feature.
   * @generated
   */
  public void setLocation(double newLocation) {
    location = newLocation;
  }

  /**
   * Returns the value of '<em><b>connection</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>connection</b></em>' feature
   * @generated
   */
  public Connection getConnection() {
    return connection;
  }

  /**
   * Sets the '{@link ConnectionDecorator#getConnection() <em>connection</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newConnection
   *          the new value of the '{@link ConnectionDecorator#getConnection() connection}' feature.
   * @generated
   */
  public void setConnection(Connection newConnection) {
    connection = newConnection;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ConnectionDecorator " + " [locationRelative: " + isLocationRelative() + "]" + " [location: "
        + getLocation() + "]";
  }
}
