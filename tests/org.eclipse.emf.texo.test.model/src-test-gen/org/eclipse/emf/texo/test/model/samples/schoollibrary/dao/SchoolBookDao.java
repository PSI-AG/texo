package org.eclipse.emf.texo.test.model.samples.schoollibrary.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.schoollibrary.SchoolBook;
import org.eclipse.emf.texo.test.model.samples.schoollibrary.SchoollibraryModelPackage;

/**
 * The Dao implementation for the model object '<em><b>SchoolBook</b></em>'.
 * 
 * @generated
 */
public class SchoolBookDao extends BaseDao<SchoolBook> {

  /**
   * @generated
   */
  @Override
  public Class<SchoolBook> getEntityClass() {
    return SchoolBook.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SchoollibraryModelPackage.INSTANCE.getSchoolBookEClass();
  }
}
