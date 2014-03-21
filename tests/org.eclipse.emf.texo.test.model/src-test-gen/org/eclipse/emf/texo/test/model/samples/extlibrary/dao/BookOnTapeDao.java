package org.eclipse.emf.texo.test.model.samples.extlibrary.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.BookOnTape;
import org.eclipse.emf.texo.test.model.samples.extlibrary.ExtlibraryModelPackage;

/**
 * The Dao implementation for the model object '<em><b>BookOnTape</b></em>'.
 * 
 * @generated
 */
public class BookOnTapeDao extends BaseDao<BookOnTape> {

  /**
   * @generated
   */
  @Override
  public Class<BookOnTape> getEntityClass() {
    return BookOnTape.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ExtlibraryModelPackage.INSTANCE.getBookOnTapeEClass();
  }
}
