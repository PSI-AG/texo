package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.MethodUnit;

/**
 * The Dao implementation for the model object '<em><b>MethodUnit</b></em>'.
 * 
 * @generated
 */
public class MethodUnitDao extends BaseDao<MethodUnit> {

  /**
   * @generated
   */
  @Override
  public Class<MethodUnit> getEntityClass() {
    return MethodUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getMethodUnitEClass();
  }
}
