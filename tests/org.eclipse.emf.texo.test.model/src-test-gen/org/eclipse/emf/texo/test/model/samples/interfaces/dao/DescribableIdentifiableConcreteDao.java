package org.eclipse.emf.texo.test.model.samples.interfaces.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.interfaces.DescribableIdentifiableConcrete;
import org.eclipse.emf.texo.test.model.samples.interfaces.InterfacesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>DescribableIdentifiableConcrete</b></em>'.
 * 
 * @generated
 */
public class DescribableIdentifiableConcreteDao extends BaseDao<DescribableIdentifiableConcrete> {

  /**
   * @generated
   */
  @Override
  public Class<DescribableIdentifiableConcrete> getEntityClass() {
    return DescribableIdentifiableConcrete.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return InterfacesModelPackage.INSTANCE.getDescribableIdentifiableConcreteEClass();
  }
}
