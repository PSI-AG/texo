package org.eclipse.emf.texo.test.model.samples.workflow.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowElement;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;

/**
 * The Dao implementation for the model object '<em><b>WorkflowElement</b></em>'.
 * 
 * @generated
 */
public class WorkflowElementDao extends BaseDao<WorkflowElement> {

  /**
   * @generated
   */
  @Override
  public Class<WorkflowElement> getEntityClass() {
    return WorkflowElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return WorkflowModelPackage.INSTANCE.getWorkflowElementEClass();
  }
}
