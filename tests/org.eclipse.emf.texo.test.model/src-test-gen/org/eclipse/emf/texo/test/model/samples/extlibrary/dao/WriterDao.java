package org.eclipse.emf.texo.test.model.samples.extlibrary.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.ExtlibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.extlibrary.Writer;

/**
 * The Dao implementation for the model object '<em><b>Writer</b></em>'.
 * 
 * @generated
 */
public class WriterDao extends BaseDao<Writer> {

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
    return ExtlibraryModelPackage.INSTANCE.getWriterEClass();
  }
}
