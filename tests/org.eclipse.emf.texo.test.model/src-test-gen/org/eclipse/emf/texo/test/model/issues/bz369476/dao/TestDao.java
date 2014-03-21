package org.eclipse.emf.texo.test.model.issues.bz369476.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz369476.Bz369476ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz369476.Test;

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
    return Bz369476ModelPackage.INSTANCE.getTestEClass();
  }
}
