package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.EventModel;
import org.eclipse.modisco.kdm.event.EventModelPackage;

/**
 * The Dao implementation for the model object '<em><b>EventModel</b></em>'.
 * 
 * @generated
 */
public class EventModelDao extends BaseDao<EventModel> {

  /**
   * @generated
   */
  @Override
  public Class<EventModel> getEntityClass() {
    return EventModel.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getEventModelEClass();
  }
}
