package org.eclipse.emf.texo.test.model.samples.library.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.test.model.samples.library.Book;
import org.eclipse.emf.texo.test.model.samples.library.GenericLibraryDao;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Book</b></em>'.
 * 
 * @generated
 */
public class BookDao extends GenericLibraryDao<Book> {

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
    return LibraryModelPackage.INSTANCE.getBookEClass();
  }
}
