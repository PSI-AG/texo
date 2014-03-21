package org.eclipse.emf.texo.test.model.samples.workflow.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.workflow.InputPort;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;

/**
 * The Dao implementation for the model object '<em><b>InputPort</b></em>'.
 * 
 * @generated
 */
public class InputPortDao extends BaseDao<InputPort> {

  /**
   * @generated
   */
  @Override
  public Class<InputPort> getEntityClass() {
    return InputPort.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return WorkflowModelPackage.INSTANCE.getInputPortEClass();
  }
}
