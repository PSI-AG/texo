package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.EventModelPackage;
import org.eclipse.modisco.kdm.event.NextState;

/**
 * The Dao implementation for the model object '<em><b>NextState</b></em>'.
 * 
 * @generated
 */
public class NextStateDao extends BaseDao<NextState> {

  /**
   * @generated
   */
  @Override
  public Class<NextState> getEntityClass() {
    return NextState.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getNextStateEClass();
  }
}
