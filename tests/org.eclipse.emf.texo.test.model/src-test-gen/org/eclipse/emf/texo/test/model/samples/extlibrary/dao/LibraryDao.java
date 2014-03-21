package org.eclipse.emf.texo.test.model.samples.extlibrary.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.ExtlibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.extlibrary.Library;

/**
 * The Dao implementation for the model object '<em><b>Library</b></em>'.
 * 
 * @generated
 */
public class LibraryDao extends BaseDao<Library> {

  /**
   * @generated
   */
  @Override
  public Class<Library> getEntityClass() {
    return Library.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ExtlibraryModelPackage.INSTANCE.getLibraryEClass();
  }
}
