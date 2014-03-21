package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.Event;
import org.eclipse.modisco.kdm.event.EventModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Event</b></em>'.
 * 
 * @generated
 */
public class EventDao extends BaseDao<Event> {

  /**
   * @generated
   */
  @Override
  public Class<Event> getEntityClass() {
    return Event.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getEventEClass();
  }
}
