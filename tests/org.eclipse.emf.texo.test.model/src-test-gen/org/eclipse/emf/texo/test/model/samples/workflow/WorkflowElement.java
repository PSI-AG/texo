package org.eclipse.emf.texo.test.model.samples.workflow;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>WorkflowElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "workflow_WorkflowElement")
@Table(name = "workflow_WorkflowElement")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class WorkflowElement extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "name")
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "T_comment")
  private String comment = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "x")
  private int x = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "y")
  private int y = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "width")
  private int width = -1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "height")
  private int height = -1;

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link WorkflowElement#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newName
   *          the new value of the '{@link WorkflowElement#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>comment</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>comment</b></em>' feature
   * @generated
   */
  public String getComment() {
    return comment;
  }

  /**
   * Sets the '{@link WorkflowElement#getComment() <em>comment</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newComment
   *          the new value of the '{@link WorkflowElement#getComment() comment}' feature.
   * @generated
   */
  public void setComment(String newComment) {
    comment = newComment;
  }

  /**
   * Returns the value of '<em><b>x</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>x</b></em>' feature
   * @generated
   */
  public int getX() {
    return x;
  }

  /**
   * Sets the '{@link WorkflowElement#getX() <em>x</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newX
   *          the new value of the '{@link WorkflowElement#getX() x}' feature.
   * @generated
   */
  public void setX(int newX) {
    x = newX;
  }

  /**
   * Returns the value of '<em><b>y</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>y</b></em>' feature
   * @generated
   */
  public int getY() {
    return y;
  }

  /**
   * Sets the '{@link WorkflowElement#getY() <em>y</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newY
   *          the new value of the '{@link WorkflowElement#getY() y}' feature.
   * @generated
   */
  public void setY(int newY) {
    y = newY;
  }

  /**
   * Returns the value of '<em><b>width</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>width</b></em>' feature
   * @generated
   */
  public int getWidth() {
    return width;
  }

  /**
   * Sets the '{@link WorkflowElement#getWidth() <em>width</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newWidth
   *          the new value of the '{@link WorkflowElement#getWidth() width}' feature.
   * @generated
   */
  public void setWidth(int newWidth) {
    width = newWidth;
  }

  /**
   * Returns the value of '<em><b>height</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>height</b></em>' feature
   * @generated
   */
  public int getHeight() {
    return height;
  }

  /**
   * Sets the '{@link WorkflowElement#getHeight() <em>height</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newHeight
   *          the new value of the '{@link WorkflowElement#getHeight() height}' feature.
   * @generated
   */
  public void setHeight(int newHeight) {
    height = newHeight;
  }

  /**
   * Returns the value of '<em><b>workFlowElementId</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>workFlowElementId</b></em>' feature
   * @generated
   */
  public String getWorkFlowElementId() {
    // Volatile feature
    // TODO: implement this method to return the 'workFlowElementId'
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * Sets the '{@link WorkflowElement#getWorkFlowElementId() <em>workFlowElementId</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newWorkFlowElementId
   *          the new value of the '{@link WorkflowElement#getWorkFlowElementId() workFlowElementId}' feature.
   * @generated
   */
  public void setWorkFlowElementId(String newWorkFlowElementId) {
    // Volatile feature
    // TODO: implement this method to set the 'workFlowElementId'
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "WorkflowElement " + " [name: " + getName() + "]" + " [comment: " + getComment() + "]" + " [x: " + getX()
        + "]" + " [y: " + getY() + "]" + " [width: " + getWidth() + "]" + " [height: " + getHeight() + "]"
        + " [workFlowElementId: " + getWorkFlowElementId() + "]";
  }
}
