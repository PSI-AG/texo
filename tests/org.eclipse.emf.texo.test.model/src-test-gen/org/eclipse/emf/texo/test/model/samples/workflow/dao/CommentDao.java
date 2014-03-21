package org.eclipse.emf.texo.test.model.samples.workflow.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.workflow.Comment;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Comment</b></em>'.
 * 
 * @generated
 */
public class CommentDao extends BaseDao<Comment> {

  /**
   * @generated
   */
  @Override
  public Class<Comment> getEntityClass() {
    return Comment.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return WorkflowModelPackage.INSTANCE.getCommentEClass();
  }
}
