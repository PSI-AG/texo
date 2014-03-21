package org.eclipse.emf.texo.test.model.samples.sunbooks.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.sunbooks.AuthorsType;
import org.eclipse.emf.texo.test.model.samples.sunbooks.SunBooksModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AuthorsType</b></em>'.
 * 
 * @generated
 */
public class AuthorsTypeDao extends BaseDao<AuthorsType> {

  /**
   * @generated
   */
  @Override
  public Class<AuthorsType> getEntityClass() {
    return AuthorsType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SunBooksModelPackage.INSTANCE.getAuthorsTypeEClass();
  }
}
