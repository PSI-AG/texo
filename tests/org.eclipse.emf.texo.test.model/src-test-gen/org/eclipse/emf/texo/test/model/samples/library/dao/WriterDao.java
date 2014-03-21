package org.eclipse.emf.texo.test.model.samples.library.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.test.model.samples.library.GenericLibraryDao;
import org.eclipse.emf.texo.test.model.samples.library.Writer;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Writer</b></em>'.
 * 
 * @generated
 */
public class WriterDao extends GenericLibraryDao<Writer> {

  /**
   * @generated
   */
  @Override
  public Class<Writer> getEntityClass() {
    return Writer.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return LibraryModelPackage.INSTANCE.getWriterEClass();
  }
}
