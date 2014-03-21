package org.eclipse.emf.texo.test.model.samples.sunbooks.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.sunbooks.BooksType;
import org.eclipse.emf.texo.test.model.samples.sunbooks.SunBooksModelPackage;

/**
 * The Dao implementation for the model object '<em><b>BooksType</b></em>'.
 * 
 * @generated
 */
public class BooksTypeDao extends BaseDao<BooksType> {

  /**
   * @generated
   */
  @Override
  public Class<BooksType> getEntityClass() {
    return BooksType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SunBooksModelPackage.INSTANCE.getBooksTypeEClass();
  }
}
