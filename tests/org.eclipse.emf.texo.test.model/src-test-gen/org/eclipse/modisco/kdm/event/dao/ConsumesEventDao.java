package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.ConsumesEvent;
import org.eclipse.modisco.kdm.event.EventModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ConsumesEvent</b></em>'.
 * 
 * @generated
 */
public class ConsumesEventDao extends BaseDao<ConsumesEvent> {

  /**
   * @generated
   */
  @Override
  public Class<ConsumesEvent> getEntityClass() {
    return ConsumesEvent.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getConsumesEventEClass();
  }
}
