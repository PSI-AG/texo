package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.Units;

/**
 * The Dao implementation for the model object '<em><b>Units</b></em>'.
 * 
 * @generated
 */
public class UnitsDao extends BaseDao<Units> {

  /**
   * @generated
   */
  @Override
  public Class<Units> getEntityClass() {
    return Units.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getUnitsEClass();
  }
}
