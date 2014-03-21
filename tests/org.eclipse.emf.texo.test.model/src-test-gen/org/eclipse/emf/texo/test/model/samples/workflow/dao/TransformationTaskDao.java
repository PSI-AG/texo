package org.eclipse.emf.texo.test.model.samples.workflow.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.workflow.TransformationTask;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;

/**
 * The Dao implementation for the model object '<em><b>TransformationTask</b></em>'.
 * 
 * @generated
 */
public class TransformationTaskDao extends BaseDao<TransformationTask> {

  /**
   * @generated
   */
  @Override
  public Class<TransformationTask> getEntityClass() {
    return TransformationTask.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return WorkflowModelPackage.INSTANCE.getTransformationTaskEClass();
  }
}
