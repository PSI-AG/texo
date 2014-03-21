package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.EventModelPackage;
import org.eclipse.modisco.kdm.event.OnExit;

/**
 * The Dao implementation for the model object '<em><b>OnExit</b></em>'.
 * 
 * @generated
 */
public class OnExitDao extends BaseDao<OnExit> {

  /**
   * @generated
   */
  @Override
  public Class<OnExit> getEntityClass() {
    return OnExit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getOnExitEClass();
  }
}
