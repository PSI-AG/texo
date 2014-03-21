package org.eclipse.emf.texo.test.model.samples.workflow.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.workflow.Task;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Task</b></em>'.
 * 
 * @generated
 */
public class TaskDao extends BaseDao<Task> {

  /**
   * @generated
   */
  @Override
  public Class<Task> getEntityClass() {
    return Task.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return WorkflowModelPackage.INSTANCE.getTaskEClass();
  }
}
