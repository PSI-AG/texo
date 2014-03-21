package org.eclipse.emf.texo.test.model.issues.bz378087.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz378087.Bz378087ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz378087.Test;

/**
 * The Dao implementation for the model object '<em><b>Test</b></em>'.
 * 
 * @generated
 */
public class TestDao extends BaseDao<Test> {

  /**
   * @generated
   */
  @Override
  public Class<Test> getEntityClass() {
    return Test.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz378087ModelPackage.INSTANCE.getTestEClass();
  }
}
