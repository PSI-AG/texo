package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.EventModelPackage;
import org.eclipse.modisco.kdm.event.State;

/**
 * The Dao implementation for the model object '<em><b>State</b></em>'.
 * 
 * @generated
 */
public class StateDao extends BaseDao<State> {

  /**
   * @generated
   */
  @Override
  public Class<State> getEntityClass() {
    return State.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getStateEClass();
  }
}
