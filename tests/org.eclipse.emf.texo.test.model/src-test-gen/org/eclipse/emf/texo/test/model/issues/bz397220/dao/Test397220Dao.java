package org.eclipse.emf.texo.test.model.issues.bz397220.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz397220.Bz397220ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz397220.Test397220;

/**
 * The Dao implementation for the model object '<em><b>Test397220</b></em>'.
 * 
 * @generated
 */
public class Test397220Dao extends BaseDao<Test397220> {

  /**
   * @generated
   */
  @Override
  public Class<Test397220> getEntityClass() {
    return Test397220.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz397220ModelPackage.INSTANCE.getTest397220EClass();
  }
}
