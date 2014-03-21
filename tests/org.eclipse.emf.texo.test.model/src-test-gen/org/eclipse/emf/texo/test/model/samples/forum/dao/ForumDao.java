package org.eclipse.emf.texo.test.model.samples.forum.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.forum.Forum;
import org.eclipse.emf.texo.test.model.samples.forum.ForumModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Forum</b></em>'.
 * 
 * @generated
 */
public class ForumDao extends BaseDao<Forum> {

  /**
   * @generated
   */
  @Override
  public Class<Forum> getEntityClass() {
    return Forum.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ForumModelPackage.INSTANCE.getForumEClass();
  }
}
