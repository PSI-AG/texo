package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.EventModelPackage;
import org.eclipse.modisco.kdm.event.OnEntry;

/**
 * The Dao implementation for the model object '<em><b>OnEntry</b></em>'.
 * 
 * @generated
 */
public class OnEntryDao extends BaseDao<OnEntry> {

  /**
   * @generated
   */
  @Override
  public Class<OnEntry> getEntityClass() {
    return OnEntry.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getOnEntryEClass();
  }
}
