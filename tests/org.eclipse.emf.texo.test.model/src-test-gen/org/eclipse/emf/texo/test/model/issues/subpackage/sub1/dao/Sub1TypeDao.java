package org.eclipse.emf.texo.test.model.issues.subpackage.sub1.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.subpackage.sub1.Sub1ModelPackage;
import org.eclipse.emf.texo.test.model.issues.subpackage.sub1.Sub1Type;

/**
 * The Dao implementation for the model object '<em><b>Sub1Type</b></em>'.
 * 
 * @generated
 */
public class Sub1TypeDao extends BaseDao<Sub1Type> {

  /**
   * @generated
   */
  @Override
  public Class<Sub1Type> getEntityClass() {
    return Sub1Type.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Sub1ModelPackage.INSTANCE.getSub1TypeEClass();
  }
}
