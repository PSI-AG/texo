package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.MemberUnit;

/**
 * The Dao implementation for the model object '<em><b>MemberUnit</b></em>'.
 * 
 * @generated
 */
public class MemberUnitDao extends BaseDao<MemberUnit> {

  /**
   * @generated
   */
  @Override
  public Class<MemberUnit> getEntityClass() {
    return MemberUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getMemberUnitEClass();
  }
}
