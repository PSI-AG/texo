package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.CarRegInfo;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;

/**
 * The Dao implementation for the model object '<em><b>CarRegInfo</b></em>'.
 * 
 * @generated
 */
public class CarRegInfoDao extends BaseDao<CarRegInfo> {

  /**
   * @generated
   */
  @Override
  public Class<CarRegInfo> getEntityClass() {
    return CarRegInfo.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getCarRegInfoEClass();
  }
}
