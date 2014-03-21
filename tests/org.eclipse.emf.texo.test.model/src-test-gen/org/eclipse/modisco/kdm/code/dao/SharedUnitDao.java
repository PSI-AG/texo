package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.SharedUnit;

/**
 * The Dao implementation for the model object '<em><b>SharedUnit</b></em>'.
 * 
 * @generated
 */
public class SharedUnitDao extends BaseDao<SharedUnit> {

  /**
   * @generated
   */
  @Override
  public Class<SharedUnit> getEntityClass() {
    return SharedUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getSharedUnitEClass();
  }
}
