package org.eclipse.emf.texo.test.model.issues.bz404132.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz404132.Bz404132ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz404132.Test404132;

/**
 * The Dao implementation for the model object '<em><b>Test404132</b></em>'.
 * 
 * @generated
 */
public class Test404132Dao extends BaseDao<Test404132> {

  /**
   * @generated
   */
  @Override
  public Class<Test404132> getEntityClass() {
    return Test404132.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz404132ModelPackage.INSTANCE.getTest404132EClass();
  }
}
