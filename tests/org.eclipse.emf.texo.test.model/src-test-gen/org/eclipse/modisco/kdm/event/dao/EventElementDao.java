package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.EventElement;
import org.eclipse.modisco.kdm.event.EventModelPackage;

/**
 * The Dao implementation for the model object '<em><b>EventElement</b></em>'.
 * 
 * @generated
 */
public class EventElementDao extends BaseDao<EventElement> {

  /**
   * @generated
   */
  @Override
  public Class<EventElement> getEntityClass() {
    return EventElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getEventElementEClass();
  }
}
