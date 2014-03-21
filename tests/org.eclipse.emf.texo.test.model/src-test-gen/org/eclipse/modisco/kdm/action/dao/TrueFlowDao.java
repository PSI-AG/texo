package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.TrueFlow;

/**
 * The Dao implementation for the model object '<em><b>TrueFlow</b></em>'.
 * 
 * @generated
 */
public class TrueFlowDao extends BaseDao<TrueFlow> {

  /**
   * @generated
   */
  @Override
  public Class<TrueFlow> getEntityClass() {
    return TrueFlow.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getTrueFlowEClass();
  }
}
