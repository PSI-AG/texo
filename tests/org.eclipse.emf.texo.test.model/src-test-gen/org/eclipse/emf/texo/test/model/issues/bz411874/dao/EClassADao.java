package org.eclipse.emf.texo.test.model.issues.bz411874.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz411874.Bz411874ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz411874.EClassA;

/**
 * The Dao implementation for the model object '<em><b>EClassA</b></em>'.
 * 
 * @generated
 */
public class EClassADao extends BaseDao<EClassA> {

  /**
   * @generated
   */
  @Override
  public Class<EClassA> getEntityClass() {
    return EClassA.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz411874ModelPackage.INSTANCE.getEClassAEClass();
  }
}
