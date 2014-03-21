package org.eclipse.emf.texo.test.model.samples.interfaces.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.interfaces.IdentifiableConcrete;
import org.eclipse.emf.texo.test.model.samples.interfaces.InterfacesModelPackage;

/**
 * The Dao implementation for the model object '<em><b>IdentifiableConcrete</b></em>'.
 * 
 * @generated
 */
public class IdentifiableConcreteDao extends BaseDao<IdentifiableConcrete> {

  /**
   * @generated
   */
  @Override
  public Class<IdentifiableConcrete> getEntityClass() {
    return IdentifiableConcrete.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return InterfacesModelPackage.INSTANCE.getIdentifiableConcreteEClass();
  }
}
