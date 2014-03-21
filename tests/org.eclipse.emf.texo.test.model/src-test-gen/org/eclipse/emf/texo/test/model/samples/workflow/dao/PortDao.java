package org.eclipse.emf.texo.test.model.samples.workflow.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.workflow.Port;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Port</b></em>'.
 * 
 * @generated
 */
public class PortDao extends BaseDao<Port> {

  /**
   * @generated
   */
  @Override
  public Class<Port> getEntityClass() {
    return Port.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return WorkflowModelPackage.INSTANCE.getPortEClass();
  }
}
