package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.EventModelPackage;
import org.eclipse.modisco.kdm.event.EventResource;

/**
 * The Dao implementation for the model object '<em><b>EventResource</b></em>'.
 * 
 * @generated
 */
public class EventResourceDao extends BaseDao<EventResource> {

  /**
   * @generated
   */
  @Override
  public Class<EventResource> getEntityClass() {
    return EventResource.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getEventResourceEClass();
  }
}
