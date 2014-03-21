package org.eclipse.emf.texo.test.model.samples.interfaces.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.interfaces.DescribableConcrete;
import org.eclipse.emf.texo.test.model.samples.interfaces.InterfacesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>DescribableConcrete</b></em>'.
 * 
 * @generated
 */
public class DescribableConcreteDao extends BaseDao<DescribableConcrete> {

  /**
   * @generated
   */
  @Override
  public Class<DescribableConcrete> getEntityClass() {
    return DescribableConcrete.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return InterfacesModelPackage.INSTANCE.getDescribableConcreteEClass();
  }
}
