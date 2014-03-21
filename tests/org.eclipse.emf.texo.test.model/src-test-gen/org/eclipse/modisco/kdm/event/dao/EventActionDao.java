package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.EventAction;
import org.eclipse.modisco.kdm.event.EventModelPackage;

/**
 * The Dao implementation for the model object '<em><b>EventAction</b></em>'.
 * 
 * @generated
 */
public class EventActionDao extends BaseDao<EventAction> {

  /**
   * @generated
   */
  @Override
  public Class<EventAction> getEntityClass() {
    return EventAction.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getEventActionEClass();
  }
}
