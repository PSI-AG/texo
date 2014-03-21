package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.ExceptionFlow;

/**
 * The Dao implementation for the model object '<em><b>ExceptionFlow</b></em>'.
 * 
 * @generated
 */
public class ExceptionFlowDao extends BaseDao<ExceptionFlow> {

  /**
   * @generated
   */
  @Override
  public Class<ExceptionFlow> getEntityClass() {
    return ExceptionFlow.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getExceptionFlowEClass();
  }
}
