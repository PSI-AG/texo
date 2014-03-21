package org.eclipse.emf.texo.test.model.samples.workflow.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.workflow.LoopTask;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;

/**
 * The Dao implementation for the model object '<em><b>LoopTask</b></em>'.
 * 
 * @generated
 */
public class LoopTaskDao extends BaseDao<LoopTask> {

  /**
   * @generated
   */
  @Override
  public Class<LoopTask> getEntityClass() {
    return LoopTask.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return WorkflowModelPackage.INSTANCE.getLoopTaskEClass();
  }
}
