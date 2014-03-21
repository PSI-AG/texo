package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.AbstractEventRelationship;
import org.eclipse.modisco.kdm.event.EventModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractEventRelationship</b></em>'.
 * 
 * @generated
 */
public class AbstractEventRelationshipDao extends BaseDao<AbstractEventRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractEventRelationship> getEntityClass() {
    return AbstractEventRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getAbstractEventRelationshipEClass();
  }
}
