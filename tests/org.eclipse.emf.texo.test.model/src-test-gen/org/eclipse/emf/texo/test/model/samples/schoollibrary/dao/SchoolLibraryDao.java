package org.eclipse.emf.texo.test.model.samples.schoollibrary.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.schoollibrary.SchoolLibrary;
import org.eclipse.emf.texo.test.model.samples.schoollibrary.SchoollibraryModelPackage;

/**
 * The Dao implementation for the model object '<em><b>SchoolLibrary</b></em>'.
 * 
 * @generated
 */
public class SchoolLibraryDao extends BaseDao<SchoolLibrary> {

  /**
   * @generated
   */
  @Override
  public Class<SchoolLibrary> getEntityClass() {
    return SchoolLibrary.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SchoollibraryModelPackage.INSTANCE.getSchoolLibraryEClass();
  }
}
