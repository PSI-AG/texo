package org.eclipse.emf.texo.test.model.issues.bz380279.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz380279.BZ380279;
import org.eclipse.emf.texo.test.model.issues.bz380279.Bz380279ModelPackage;

/**
 * The Dao implementation for the model object '<em><b>BZ380279</b></em>'.
 * 
 * @generated
 */
public class BZ380279Dao extends BaseDao<BZ380279> {

  /**
   * @generated
   */
  @Override
  public Class<BZ380279> getEntityClass() {
    return BZ380279.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz380279ModelPackage.INSTANCE.getBZ380279EClass();
  }
}
