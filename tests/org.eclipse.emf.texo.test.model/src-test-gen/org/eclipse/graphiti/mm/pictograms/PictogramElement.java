package org.eclipse.graphiti.mm.pictograms;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>PictogramElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "pi_PictogramElement")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class PictogramElement extends GraphicsAlgorithmContainer {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private boolean visible = false;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToOne(cascade = { CascadeType.ALL })
  private GraphicsAlgorithm graphicsAlgorithm = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private boolean active = false;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToOne(cascade = { CascadeType.ALL })
  private PictogramLink link = null;

  /**
   * Returns the value of '<em><b>visible</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>visible</b></em>' feature
   * @generated
   */
  public boolean isVisible() {
    return visible;
  }

  /**
   * Sets the '{@link PictogramElement#isVisible() <em>visible</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newVisible
   *          the new value of the '{@link PictogramElement#isVisible() visible}' feature.
   * @generated
   */
  public void setVisible(boolean newVisible) {
    visible = newVisible;
  }

  /**
   * Returns the value of '<em><b>graphicsAlgorithm</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>graphicsAlgorithm</b></em>' feature
   * @generated
   */
  public GraphicsAlgorithm getGraphicsAlgorithm() {
    return graphicsAlgorithm;
  }

  /**
   * Sets the '{@link PictogramElement#getGraphicsAlgorithm() <em>graphicsAlgorithm</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newGraphicsAlgorithm
   *          the new value of the '{@link PictogramElement#getGraphicsAlgorithm() graphicsAlgorithm}' feature.
   * @generated
   */
  public void setGraphicsAlgorithm(GraphicsAlgorithm newGraphicsAlgorithm) {
    graphicsAlgorithm = newGraphicsAlgorithm;
  }

  /**
   * Returns the value of '<em><b>active</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>active</b></em>' feature
   * @generated
   */
  public boolean isActive() {
    return active;
  }

  /**
   * Sets the '{@link PictogramElement#isActive() <em>active</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newActive
   *          the new value of the '{@link PictogramElement#isActive() active}' feature.
   * @generated
   */
  public void setActive(boolean newActive) {
    active = newActive;
  }

  /**
   * Returns the value of '<em><b>link</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>link</b></em>' feature
   * @generated
   */
  public PictogramLink getLink() {
    return link;
  }

  /**
   * Sets the '{@link PictogramElement#getLink() <em>link</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newLink
   *          the new value of the '{@link PictogramElement#getLink() link}' feature.
   * @generated
   */
  public void setLink(PictogramLink newLink) {
    link = newLink;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PictogramElement " + " [visible: " + isVisible() + "]" + " [active: " + isActive() + "]";
  }
}
