package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.EventModelPackage;
import org.eclipse.modisco.kdm.event.ProducesEvent;

/**
 * The Dao implementation for the model object '<em><b>ProducesEvent</b></em>'.
 * 
 * @generated
 */
public class ProducesEventDao extends BaseDao<ProducesEvent> {

  /**
   * @generated
   */
  @Override
  public Class<ProducesEvent> getEntityClass() {
    return ProducesEvent.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getProducesEventEClass();
  }
}
