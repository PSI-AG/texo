package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.Addresses;

/**
 * The Dao implementation for the model object '<em><b>Addresses</b></em>'.
 * 
 * @generated
 */
public class AddressesDao extends BaseDao<Addresses> {

  /**
   * @generated
   */
  @Override
  public Class<Addresses> getEntityClass() {
    return Addresses.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getAddressesEClass();
  }
}
