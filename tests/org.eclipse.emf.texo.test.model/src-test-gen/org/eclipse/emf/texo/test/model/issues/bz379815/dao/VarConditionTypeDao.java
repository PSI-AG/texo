package org.eclipse.emf.texo.test.model.issues.bz379815.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz379815.Bz379815ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz379815.VarConditionType;

/**
 * The Dao implementation for the model object '<em><b>VarConditionType</b></em>'.
 * 
 * @generated
 */
public class VarConditionTypeDao extends BaseDao<VarConditionType> {

  /**
   * @generated
   */
  @Override
  public Class<VarConditionType> getEntityClass() {
    return VarConditionType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz379815ModelPackage.INSTANCE.getVarConditionTypeEClass();
  }
}
