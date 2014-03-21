package org.eclipse.emf.texo.test.model.issues.bz403743.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz403743.Bz403743ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz403743.Test403743_Main;

/**
 * The Dao implementation for the model object '<em><b>Test403743_Main</b></em>'.
 * 
 * @generated
 */
public class Test403743_MainDao extends BaseDao<Test403743_Main> {

  /**
   * @generated
   */
  @Override
  public Class<Test403743_Main> getEntityClass() {
    return Test403743_Main.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz403743ModelPackage.INSTANCE.getTest403743_MainEClass();
  }
}
