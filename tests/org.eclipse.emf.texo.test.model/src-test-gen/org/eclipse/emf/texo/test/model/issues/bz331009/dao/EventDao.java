package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.Event;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;

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
    return ModelModelPackage.INSTANCE.getEventEClass();
  }
}
