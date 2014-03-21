package org.eclipse.emf.texo.test.model.samples.workflow.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.workflow.ConditionalOutputPort;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ConditionalOutputPort</b></em>'.
 * 
 * @generated
 */
public class ConditionalOutputPortDao extends BaseDao<ConditionalOutputPort> {

  /**
   * @generated
   */
  @Override
  public Class<ConditionalOutputPort> getEntityClass() {
    return ConditionalOutputPort.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return WorkflowModelPackage.INSTANCE.getConditionalOutputPortEClass();
  }
}
