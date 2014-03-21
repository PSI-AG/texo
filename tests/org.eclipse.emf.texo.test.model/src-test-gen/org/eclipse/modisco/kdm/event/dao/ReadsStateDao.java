package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.EventModelPackage;
import org.eclipse.modisco.kdm.event.ReadsState;

/**
 * The Dao implementation for the model object '<em><b>ReadsState</b></em>'.
 * 
 * @generated
 */
public class ReadsStateDao extends BaseDao<ReadsState> {

  /**
   * @generated
   */
  @Override
  public Class<ReadsState> getEntityClass() {
    return ReadsState.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getReadsStateEClass();
  }
}
