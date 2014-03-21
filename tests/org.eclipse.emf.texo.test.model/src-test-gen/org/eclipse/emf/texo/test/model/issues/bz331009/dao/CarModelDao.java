package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.CarModel;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;

/**
 * The Dao implementation for the model object '<em><b>CarModel</b></em>'.
 * 
 * @generated
 */
public class CarModelDao extends BaseDao<CarModel> {

  /**
   * @generated
   */
  @Override
  public Class<CarModel> getEntityClass() {
    return CarModel.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getCarModelEClass();
  }
}
