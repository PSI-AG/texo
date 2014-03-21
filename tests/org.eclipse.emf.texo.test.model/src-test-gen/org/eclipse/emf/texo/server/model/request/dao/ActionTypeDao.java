package org.eclipse.emf.texo.server.model.request.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.model.request.ActionType;
import org.eclipse.emf.texo.server.model.request.RequestModelPackage;
import org.eclipse.emf.texo.server.store.BaseDao;

/**
 * The Dao implementation for the model object '<em><b>ActionType</b></em>'.
 * 
 * @generated
 */
public class ActionTypeDao extends BaseDao<ActionType> {

  /**
   * @generated
   */
  @Override
  public Class<ActionType> getEntityClass() {
    return ActionType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return RequestModelPackage.INSTANCE.getActionTypeEClass();
  }
}
