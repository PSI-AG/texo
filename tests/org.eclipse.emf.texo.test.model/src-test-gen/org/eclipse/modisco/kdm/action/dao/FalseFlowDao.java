package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.FalseFlow;

/**
 * The Dao implementation for the model object '<em><b>FalseFlow</b></em>'.
 * 
 * @generated
 */
public class FalseFlowDao extends BaseDao<FalseFlow> {

  /**
   * @generated
   */
  @Override
  public Class<FalseFlow> getEntityClass() {
    return FalseFlow.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getFalseFlowEClass();
  }
}
