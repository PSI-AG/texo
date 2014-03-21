package org.eclipse.emf.texo.test.model.samples.forum.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.forum.ForumModelPackage;
import org.eclipse.emf.texo.test.model.samples.forum.Topic;

/**
 * The Dao implementation for the model object '<em><b>Topic</b></em>'.
 * 
 * @generated
 */
public class TopicDao extends BaseDao<Topic> {

  /**
   * @generated
   */
  @Override
  public Class<Topic> getEntityClass() {
    return Topic.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ForumModelPackage.INSTANCE.getTopicEClass();
  }
}
