package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.AbstractEventElement;
import org.eclipse.modisco.kdm.event.EventModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractEventElement</b></em>'.
 * 
 * @generated
 */
public class AbstractEventElementDao extends BaseDao<AbstractEventElement> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractEventElement> getEntityClass() {
    return AbstractEventElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getAbstractEventElementEClass();
  }
}
