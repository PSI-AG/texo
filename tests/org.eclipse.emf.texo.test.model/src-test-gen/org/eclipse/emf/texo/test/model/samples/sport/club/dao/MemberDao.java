package org.eclipse.emf.texo.test.model.samples.sport.club.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.sport.club.ClubModelPackage;
import org.eclipse.emf.texo.test.model.samples.sport.club.Member;

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
    return ClubModelPackage.INSTANCE.getMemberEClass();
  }
}
