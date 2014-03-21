package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CallableUnit;
import org.eclipse.modisco.kdm.code.CodeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>CallableUnit</b></em>'.
 * 
 * @generated
 */
public class CallableUnitDao extends BaseDao<CallableUnit> {

  /**
   * @generated
   */
  @Override
  public Class<CallableUnit> getEntityClass() {
    return CallableUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getCallableUnitEClass();
  }
}
