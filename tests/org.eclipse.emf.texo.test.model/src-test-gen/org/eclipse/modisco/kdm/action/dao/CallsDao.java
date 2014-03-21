package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.Calls;

/**
 * The Dao implementation for the model object '<em><b>Calls</b></em>'.
 * 
 * @generated
 */
public class CallsDao extends BaseDao<Calls> {

  /**
   * @generated
   */
  @Override
  public Class<Calls> getEntityClass() {
    return Calls.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getCallsEClass();
  }
}
