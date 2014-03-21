package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.EventModelPackage;
import org.eclipse.modisco.kdm.event.InitialState;

/**
 * The Dao implementation for the model object '<em><b>InitialState</b></em>'.
 * 
 * @generated
 */
public class InitialStateDao extends BaseDao<InitialState> {

  /**
   * @generated
   */
  @Override
  public Class<InitialState> getEntityClass() {
    return InitialState.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getInitialStateEClass();
  }
}
