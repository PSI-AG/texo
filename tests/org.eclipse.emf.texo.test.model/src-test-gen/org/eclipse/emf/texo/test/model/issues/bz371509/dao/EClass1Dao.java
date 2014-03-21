package org.eclipse.emf.texo.test.model.issues.bz371509.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz371509.Bz371509ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz371509.EClass1;

/**
 * The Dao implementation for the model object '<em><b>EClass1</b></em>'.
 * 
 * @generated
 */
public class EClass1Dao extends BaseDao<EClass1> {

  /**
   * @generated
   */
  @Override
  public Class<EClass1> getEntityClass() {
    return EClass1.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz371509ModelPackage.INSTANCE.getEClass1EClass();
  }
}
