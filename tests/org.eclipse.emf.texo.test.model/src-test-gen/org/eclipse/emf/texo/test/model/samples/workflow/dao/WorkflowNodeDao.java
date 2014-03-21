package org.eclipse.emf.texo.test.model.samples.workflow.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowNode;

/**
 * The Dao implementation for the model object '<em><b>WorkflowNode</b></em>'.
 * 
 * @generated
 */
public class WorkflowNodeDao extends BaseDao<WorkflowNode> {

  /**
   * @generated
   */
  @Override
  public Class<WorkflowNode> getEntityClass() {
    return WorkflowNode.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return WorkflowModelPackage.INSTANCE.getWorkflowNodeEClass();
  }
}
