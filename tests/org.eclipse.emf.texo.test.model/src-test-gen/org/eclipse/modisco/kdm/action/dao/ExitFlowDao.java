package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.ExitFlow;

/**
 * The Dao implementation for the model object '<em><b>ExitFlow</b></em>'.
 * 
 * @generated
 */
public class ExitFlowDao extends BaseDao<ExitFlow> {

  /**
   * @generated
   */
  @Override
  public Class<ExitFlow> getEntityClass() {
    return ExitFlow.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getExitFlowEClass();
  }
}
