package org.eclipse.emf.texo.test.model.issues.bz379815.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz379815.Bz379815ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz379815.VarInputType;

/**
 * The Dao implementation for the model object '<em><b>VarInputType</b></em>'.
 * 
 * @generated
 */
public class VarInputTypeDao extends BaseDao<VarInputType> {

  /**
   * @generated
   */
  @Override
  public Class<VarInputType> getEntityClass() {
    return VarInputType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz379815ModelPackage.INSTANCE.getVarInputTypeEClass();
  }
}
