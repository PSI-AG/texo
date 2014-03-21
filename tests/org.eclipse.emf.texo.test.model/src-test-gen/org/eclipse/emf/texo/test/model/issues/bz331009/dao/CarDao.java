package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.Car;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Car</b></em>'.
 * 
 * @generated
 */
public class CarDao extends BaseDao<Car> {

  /**
   * @generated
   */
  @Override
  public Class<Car> getEntityClass() {
    return Car.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getCarEClass();
  }
}
