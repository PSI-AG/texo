package org.eclipse.emf.texo.test.model.samples.workflow.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.workflow.Workflow;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Workflow</b></em>'.
 * 
 * @generated
 */
public class WorkflowDao extends BaseDao<Workflow> {

  /**
   * @generated
   */
  @Override
  public Class<Workflow> getEntityClass() {
    return Workflow.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return WorkflowModelPackage.INSTANCE.getWorkflowEClass();
  }
}
