package org.eclipse.emf.texo.test.model.issues.bz325427.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz325427.Bz325427ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz325427.EClassB;

/**
 * The Dao implementation for the model object '<em><b>EClassB</b></em>'.
 * 
 * @generated
 */
public class EClassBDao extends BaseDao<EClassB> {

  /**
   * @generated
   */
  @Override
  public Class<EClassB> getEntityClass() {
    return EClassB.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz325427ModelPackage.INSTANCE.getEClassBEClass();
  }
}
