package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.TryUnit;

/**
 * The Dao implementation for the model object '<em><b>TryUnit</b></em>'.
 * 
 * @generated
 */
public class TryUnitDao extends BaseDao<TryUnit> {

  /**
   * @generated
   */
  @Override
  public Class<TryUnit> getEntityClass() {
    return TryUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getTryUnitEClass();
  }
}
