package org.eclipse.emf.texo.test.model.issues.bz386923.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz386923.Bz386923ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz386923.Test386923;

/**
 * The Dao implementation for the model object '<em><b>Test386923</b></em>'.
 * 
 * @generated
 */
public class Test386923Dao extends BaseDao<Test386923> {

  /**
   * @generated
   */
  @Override
  public Class<Test386923> getEntityClass() {
    return Test386923.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz386923ModelPackage.INSTANCE.getTest386923EClass();
  }
}
