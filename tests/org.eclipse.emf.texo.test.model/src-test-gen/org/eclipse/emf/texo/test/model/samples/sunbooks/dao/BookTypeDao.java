package org.eclipse.emf.texo.test.model.samples.sunbooks.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.sunbooks.BookType;
import org.eclipse.emf.texo.test.model.samples.sunbooks.SunBooksModelPackage;

/**
 * The Dao implementation for the model object '<em><b>BookType</b></em>'.
 * 
 * @generated
 */
public class BookTypeDao extends BaseDao<BookType> {

  /**
   * @generated
   */
  @Override
  public Class<BookType> getEntityClass() {
    return BookType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SunBooksModelPackage.INSTANCE.getBookTypeEClass();
  }
}
