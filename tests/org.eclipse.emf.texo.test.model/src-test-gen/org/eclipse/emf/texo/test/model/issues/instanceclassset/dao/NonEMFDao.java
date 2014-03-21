package org.eclipse.emf.texo.test.model.issues.instanceclassset.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.instanceclassset.NonEMF;
import org.eclipse.emf.texo.test.model.issues.instanceclassset.Bz306546ModelPackage;

/**
 * The Dao implementation for the model object '<em><b>NonEMF</b></em>'.
 * 
 * @generated
 */
public class NonEMFDao extends BaseDao<NonEMF> {

  /**
   * @generated
   */
  @Override
  public Class<NonEMF> getEntityClass() {
    return NonEMF.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz306546ModelPackage.INSTANCE.getNonEMFEClass();
  }
}
