package org.eclipse.emf.texo.test.model.issues.bz391624.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz391624.Author;
import org.eclipse.emf.texo.test.model.issues.bz391624.Bz391624ModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Author</b></em>'.
 * 
 * @generated
 */
public class AuthorDao extends BaseDao<Author> {

  /**
   * @generated
   */
  @Override
  public Class<Author> getEntityClass() {
    return Author.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz391624ModelPackage.INSTANCE.getAuthorEClass();
  }
}
