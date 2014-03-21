package org.eclipse.emf.texo.test.model.issues.bz403743.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz403743.Bz403743ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz403743.Test403743;

/**
 * The Dao implementation for the model object '<em><b>Test403743</b></em>'.
 * 
 * @generated
 */
public class Test403743Dao extends BaseDao<Test403743> {

  /**
   * @generated
   */
  @Override
  public Class<Test403743> getEntityClass() {
    return Test403743.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz403743ModelPackage.INSTANCE.getTest403743EClass();
  }
}
