package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.FinallyUnit;

/**
 * The Dao implementation for the model object '<em><b>FinallyUnit</b></em>'.
 * 
 * @generated
 */
public class FinallyUnitDao extends BaseDao<FinallyUnit> {

  /**
   * @generated
   */
  @Override
  public Class<FinallyUnit> getEntityClass() {
    return FinallyUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getFinallyUnitEClass();
  }
}
