package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.Dispatches;

/**
 * The Dao implementation for the model object '<em><b>Dispatches</b></em>'.
 * 
 * @generated
 */
public class DispatchesDao extends BaseDao<Dispatches> {

  /**
   * @generated
   */
  @Override
  public Class<Dispatches> getEntityClass() {
    return Dispatches.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getDispatchesEClass();
  }
}
