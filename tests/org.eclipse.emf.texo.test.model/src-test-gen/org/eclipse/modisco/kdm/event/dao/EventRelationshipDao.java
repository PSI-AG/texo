package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.EventModelPackage;
import org.eclipse.modisco.kdm.event.EventRelationship;

/**
 * The Dao implementation for the model object '<em><b>EventRelationship</b></em>'.
 * 
 * @generated
 */
public class EventRelationshipDao extends BaseDao<EventRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<EventRelationship> getEntityClass() {
    return EventRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getEventRelationshipEClass();
  }
}
