package org.eclipse.emf.texo.test.model.samples.workflow.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.workflow.CompoundTask;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;

/**
 * The Dao implementation for the model object '<em><b>CompoundTask</b></em>'.
 * 
 * @generated
 */
public class CompoundTaskDao extends BaseDao<CompoundTask> {

  /**
   * @generated
   */
  @Override
  public Class<CompoundTask> getEntityClass() {
    return CompoundTask.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return WorkflowModelPackage.INSTANCE.getCompoundTaskEClass();
  }
}
