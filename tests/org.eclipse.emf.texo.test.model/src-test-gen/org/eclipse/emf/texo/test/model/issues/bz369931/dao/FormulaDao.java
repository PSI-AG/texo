package org.eclipse.emf.texo.test.model.issues.bz369931.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz369931.Bz369931ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz369931.Formula;

/**
 * The Dao implementation for the model object '<em><b>Formula</b></em>'.
 * 
 * @generated
 */
public class FormulaDao extends BaseDao<Formula> {

  /**
   * @generated
   */
  @Override
  public Class<Formula> getEntityClass() {
    return Formula.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz369931ModelPackage.INSTANCE.getFormulaEClass();
  }
}
