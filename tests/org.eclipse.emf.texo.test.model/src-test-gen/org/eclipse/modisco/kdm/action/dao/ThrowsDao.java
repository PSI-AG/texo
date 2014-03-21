package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.Throws;

/**
 * The Dao implementation for the model object '<em><b>Throws</b></em>'.
 * 
 * @generated
 */
public class ThrowsDao extends BaseDao<Throws> {

  /**
   * @generated
   */
  @Override
  public Class<Throws> getEntityClass() {
    return Throws.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getThrowsEClass();
  }
}
