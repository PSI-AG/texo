package org.eclipse.modisco.kdm.event.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.event.EventModelPackage;
import org.eclipse.modisco.kdm.event.Transition;

/**
 * The Dao implementation for the model object '<em><b>Transition</b></em>'.
 * 
 * @generated
 */
public class TransitionDao extends BaseDao<Transition> {

  /**
   * @generated
   */
  @Override
  public Class<Transition> getEntityClass() {
    return Transition.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EventModelPackage.INSTANCE.getTransitionEClass();
  }
}
