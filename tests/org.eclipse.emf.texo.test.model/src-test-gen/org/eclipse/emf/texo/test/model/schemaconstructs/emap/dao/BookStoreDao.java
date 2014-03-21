package org.eclipse.emf.texo.test.model.schemaconstructs.emap.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.emap.BookStore;
import org.eclipse.emf.texo.test.model.schemaconstructs.emap.EmapModelPackage;

/**
 * The Dao implementation for the model object '<em><b>BookStore</b></em>'.
 * 
 * @generated
 */
public class BookStoreDao extends BaseDao<BookStore> {

  /**
   * @generated
   */
  @Override
  public Class<BookStore> getEntityClass() {
    return BookStore.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EmapModelPackage.INSTANCE.getBookStoreEClass();
  }
}
