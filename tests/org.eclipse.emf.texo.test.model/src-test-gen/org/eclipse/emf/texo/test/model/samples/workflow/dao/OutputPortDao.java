package org.eclipse.emf.texo.test.model.samples.workflow.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.workflow.OutputPort;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;

/**
 * The Dao implementation for the model object '<em><b>OutputPort</b></em>'.
 * 
 * @generated
 */
public class OutputPortDao extends BaseDao<OutputPort> {

  /**
   * @generated
   */
  @Override
  public Class<OutputPort> getEntityClass() {
    return OutputPort.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return WorkflowModelPackage.INSTANCE.getOutputPortEClass();
  }
}
