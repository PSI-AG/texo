package org.eclipse.emf.texo.test.model.samples.workflow.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.workflow.ConditionalTask;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ConditionalTask</b></em>'.
 * 
 * @generated
 */
public class ConditionalTaskDao extends BaseDao<ConditionalTask> {

  /**
   * @generated
   */
  @Override
  public Class<ConditionalTask> getEntityClass() {
    return ConditionalTask.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return WorkflowModelPackage.INSTANCE.getConditionalTaskEClass();
  }
}
