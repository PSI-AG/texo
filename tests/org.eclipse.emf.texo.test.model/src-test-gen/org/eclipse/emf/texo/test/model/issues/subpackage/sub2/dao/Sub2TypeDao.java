package org.eclipse.emf.texo.test.model.issues.subpackage.sub2.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.subpackage.sub2.Sub2ModelPackage;
import org.eclipse.emf.texo.test.model.issues.subpackage.sub2.Sub2Type;

/**
 * The Dao implementation for the model object '<em><b>Sub2Type</b></em>'.
 * 
 * @generated
 */
public class Sub2TypeDao extends BaseDao<Sub2Type> {

  /**
   * @generated
   */
  @Override
  public Class<Sub2Type> getEntityClass() {
    return Sub2Type.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Sub2ModelPackage.INSTANCE.getSub2TypeEClass();
  }
}
