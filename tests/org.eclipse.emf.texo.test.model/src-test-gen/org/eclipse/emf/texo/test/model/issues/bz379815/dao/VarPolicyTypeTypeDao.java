package org.eclipse.emf.texo.test.model.issues.bz379815.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz379815.Bz379815ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz379815.VarPolicyTypeType;

/**
 * The Dao implementation for the model object '<em><b>VarPolicyTypeType</b></em>'.
 * 
 * @generated
 */
public class VarPolicyTypeTypeDao extends BaseDao<VarPolicyTypeType> {

  /**
   * @generated
   */
  @Override
  public Class<VarPolicyTypeType> getEntityClass() {
    return VarPolicyTypeType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz379815ModelPackage.INSTANCE.getVarPolicyTypeTypeEClass();
  }
}
