package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.CommentUnit;

/**
 * The Dao implementation for the model object '<em><b>CommentUnit</b></em>'.
 * 
 * @generated
 */
public class CommentUnitDao extends BaseDao<CommentUnit> {

  /**
   * @generated
   */
  @Override
  public Class<CommentUnit> getEntityClass() {
    return CommentUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getCommentUnitEClass();
  }
}
