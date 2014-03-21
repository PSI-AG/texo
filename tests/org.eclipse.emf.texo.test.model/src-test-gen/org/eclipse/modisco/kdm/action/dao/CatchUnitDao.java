package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.CatchUnit;

/**
 * The Dao implementation for the model object '<em><b>CatchUnit</b></em>'.
 * 
 * @generated
 */
public class CatchUnitDao extends BaseDao<CatchUnit> {

  /**
   * @generated
   */
  @Override
  public Class<CatchUnit> getEntityClass() {
    return CatchUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getCatchUnitEClass();
  }
}
