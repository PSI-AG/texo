package org.eclipse.emf.texo.test.model.samples.workflow.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.workflow.Fault;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Fault</b></em>'.
 * 
 * @generated
 */
public class FaultDao extends BaseDao<Fault> {

  /**
   * @generated
   */
  @Override
  public Class<Fault> getEntityClass() {
    return Fault.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return WorkflowModelPackage.INSTANCE.getFaultEClass();
  }
}
