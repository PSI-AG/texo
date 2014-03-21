package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.Flow;

/**
 * The Dao implementation for the model object '<em><b>Flow</b></em>'.
 * 
 * @generated
 */
public class FlowDao extends BaseDao<Flow> {

  /**
   * @generated
   */
  @Override
  public Class<Flow> getEntityClass() {
    return Flow.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getFlowEClass();
  }
}
