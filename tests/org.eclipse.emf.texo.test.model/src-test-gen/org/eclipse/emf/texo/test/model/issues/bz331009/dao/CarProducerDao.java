package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.CarProducer;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;

/**
 * The Dao implementation for the model object '<em><b>CarProducer</b></em>'.
 * 
 * @generated
 */
public class CarProducerDao extends BaseDao<CarProducer> {

  /**
   * @generated
   */
  @Override
  public Class<CarProducer> getEntityClass() {
    return CarProducer.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getCarProducerEClass();
  }
}
