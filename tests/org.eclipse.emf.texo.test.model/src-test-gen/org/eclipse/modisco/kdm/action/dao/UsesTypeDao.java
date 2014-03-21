package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.UsesType;

/**
 * The Dao implementation for the model object '<em><b>UsesType</b></em>'.
 * 
 * @generated
 */
public class UsesTypeDao extends BaseDao<UsesType> {

  /**
   * @generated
   */
  @Override
  public Class<UsesType> getEntityClass() {
    return UsesType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getUsesTypeEClass();
  }
}
