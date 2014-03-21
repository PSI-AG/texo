package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.ControlFlow;

/**
 * The Dao implementation for the model object '<em><b>ControlFlow</b></em>'.
 * 
 * @generated
 */
public class ControlFlowDao extends BaseDao<ControlFlow> {

  /**
   * @generated
   */
  @Override
  public Class<ControlFlow> getEntityClass() {
    return ControlFlow.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getControlFlowEClass();
  }
}
