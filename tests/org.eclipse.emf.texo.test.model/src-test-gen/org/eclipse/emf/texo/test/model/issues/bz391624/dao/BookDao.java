package org.eclipse.emf.texo.test.model.issues.bz391624.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz391624.Book;
import org.eclipse.emf.texo.test.model.issues.bz391624.Bz391624ModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Book</b></em>'.
 * 
 * @generated
 */
public class BookDao extends BaseDao<Book> {

  /**
   * @generated
   */
  @Override
  public Class<Book> getEntityClass() {
    return Book.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz391624ModelPackage.INSTANCE.getBookEClass();
  }
}
