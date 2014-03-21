package org.eclipse.emf.texo.test.model.samples.workflow;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>TransformationTask</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "workflow_TransformationTask")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class TransformationTask extends WorkflowNode {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "transformExpression", nullable = true)
  private String transformExpression = null;

  /**
   * Returns the value of '<em><b>transformExpression</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>transformExpression</b></em>' feature
   * @generated
   */
  public String getTransformExpression() {
    return transformExpression;
  }

  /**
   * Sets the '{@link TransformationTask#getTransformExpression() <em>transformExpression</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newTransformExpression
   *          the new value of the '{@link TransformationTask#getTransformExpression() transformExpression}' feature.
   * @generated
   */
  public void setTransformExpression(String newTransformExpression) {
    transformExpression = newTransformExpression;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "TransformationTask " + " [transformExpression: " + getTransformExpression() + "]";
  }
}
