package org.eclipse.emf.texo.test.model.schemaconstructs.restriction.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.restriction.Member;
import org.eclipse.emf.texo.test.model.schemaconstructs.restriction.RestrictionModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Member</b></em>'.
 * 
 * @generated
 */
public class MemberDao extends BaseDao<Member> {

  /**
   * @generated
   */
  @Override
  public Class<Member> getEntityClass() {
    return Member.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return RestrictionModelPackage.INSTANCE.getMemberEClass();
  }
}
