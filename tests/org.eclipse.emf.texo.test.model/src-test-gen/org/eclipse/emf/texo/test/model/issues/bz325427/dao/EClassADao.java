package org.eclipse.emf.texo.test.model.issues.bz325427.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz325427.Bz325427ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz325427.EClassA;

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
    return Bz325427ModelPackage.INSTANCE.getEClassAEClass();
  }
}
