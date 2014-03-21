package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.GuardedFlow;

/**
 * The Dao implementation for the model object '<em><b>GuardedFlow</b></em>'.
 * 
 * @generated
 */
public class GuardedFlowDao extends BaseDao<GuardedFlow> {

  /**
   * @generated
   */
  @Override
  public Class<GuardedFlow> getEntityClass() {
    return GuardedFlow.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getGuardedFlowEClass();
  }
}
