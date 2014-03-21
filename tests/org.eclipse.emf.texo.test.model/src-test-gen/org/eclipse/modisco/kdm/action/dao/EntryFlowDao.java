package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.EntryFlow;

/**
 * The Dao implementation for the model object '<em><b>EntryFlow</b></em>'.
 * 
 * @generated
 */
public class EntryFlowDao extends BaseDao<EntryFlow> {

  /**
   * @generated
   */
  @Override
  public Class<EntryFlow> getEntityClass() {
    return EntryFlow.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getEntryFlowEClass();
  }
}
