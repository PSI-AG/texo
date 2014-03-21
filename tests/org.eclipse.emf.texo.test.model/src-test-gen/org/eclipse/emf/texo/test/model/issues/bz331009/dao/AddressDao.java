package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.Address;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Address</b></em>'.
 * 
 * @generated
 */
public class AddressDao extends BaseDao<Address> {

  /**
   * @generated
   */
  @Override
  public Class<Address> getEntityClass() {
    return Address.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getAddressEClass();
  }
}
