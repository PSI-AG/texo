package org.eclipse.emf.texo.test.model.samples.forum.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.forum.ForumModelPackage;
import org.eclipse.emf.texo.test.model.samples.forum.Post;

/**
 * The Dao implementation for the model object '<em><b>Post</b></em>'.
 * 
 * @generated
 */
public class PostDao extends BaseDao<Post> {

  /**
   * @generated
   */
  @Override
  public Class<Post> getEntityClass() {
    return Post.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ForumModelPackage.INSTANCE.getPostEClass();
  }
}
