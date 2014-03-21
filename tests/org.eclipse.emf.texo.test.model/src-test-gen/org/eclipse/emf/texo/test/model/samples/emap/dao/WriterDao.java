package org.eclipse.emf.texo.test.model.samples.emap.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.emap.EmapsampleModelPackage;
import org.eclipse.emf.texo.test.model.samples.emap.Writer;

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
    return EmapsampleModelPackage.INSTANCE.getWriterEClass();
  }
}
