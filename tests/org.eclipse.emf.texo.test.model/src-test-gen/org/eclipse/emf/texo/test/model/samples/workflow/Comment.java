package org.eclipse.emf.texo.test.model.samples.workflow;

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
 * A representation of the model object '<em><b>Comment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "workflow_Comment")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class Comment extends WorkflowElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  @JoinColumns({ @JoinColumn(name = "workflow_Comment_workflow", nullable = true) })
  private Workflow workflow = null;

  /**
   * Returns the value of '<em><b>workflow</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>workflow</b></em>' feature
   * @generated
   */
  public Workflow getWorkflow() {
    return workflow;
  }

  /**
   * Sets the '{@link Comment#getWorkflow() <em>workflow</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newWorkflow
   *          the new value of the '{@link Comment#getWorkflow() workflow}' feature.
   * @generated
   */
  public void setWorkflow(Workflow newWorkflow) {
    workflow = newWorkflow;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Comment ";
  }
}
