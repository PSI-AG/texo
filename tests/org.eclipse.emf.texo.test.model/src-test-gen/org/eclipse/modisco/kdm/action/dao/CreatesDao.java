package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.Creates;

/**
 * The Dao implementation for the model object '<em><b>Creates</b></em>'.
 * 
 * @generated
 */
public class CreatesDao extends BaseDao<Creates> {

  /**
   * @generated
   */
  @Override
  public Class<Creates> getEntityClass() {
    return Creates.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getCreatesEClass();
  }
}
