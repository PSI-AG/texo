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
 * A representation of the model object '<em><b>CompoundTask</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "workflow_CompoundTask")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class CompoundTask extends WorkflowNode {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  @JoinColumns({ @JoinColumn(name = "workflow_CompoundTask_subworkflow", nullable = true) })
  private Workflow subworkflow = null;

  /**
   * Returns the value of '<em><b>subworkflow</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>subworkflow</b></em>' feature
   * @generated
   */
  public Workflow getSubworkflow() {
    return subworkflow;
  }

  /**
   * Sets the '{@link CompoundTask#getSubworkflow() <em>subworkflow</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSubworkflow
   *          the new value of the '{@link CompoundTask#getSubworkflow() subworkflow}' feature.
   * @generated
   */
  public void setSubworkflow(Workflow newSubworkflow) {
    subworkflow = newSubworkflow;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "CompoundTask ";
  }
}
