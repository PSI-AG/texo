package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.EventModelPackage;
import org.eclipse.modisco.kdm.event.HasState;

/**
 * The Dao implementation for the model object '<em><b>HasState</b></em>'.
 * 
 * @generated
 */
public class HasStateDao extends BaseDao<HasState> {

  /**
   * @generated
   */
  @Override
  public Class<HasState> getEntityClass() {
    return HasState.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getHasStateEClass();
  }
}
