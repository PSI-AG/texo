package org.eclipse.emf.texo.test.model.issues.bz390942.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz390942.BZ390942;
import org.eclipse.emf.texo.test.model.issues.bz390942.Bz390942ModelPackage;

/**
 * The Dao implementation for the model object '<em><b>BZ390942</b></em>'.
 * 
 * @generated
 */
public class BZ390942Dao extends BaseDao<BZ390942> {

  /**
   * @generated
   */
  @Override
  public Class<BZ390942> getEntityClass() {
    return BZ390942.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz390942ModelPackage.INSTANCE.getBZ390942EClass();
  }
}
