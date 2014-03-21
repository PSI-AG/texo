package org.eclipse.emf.texo.test.model.schemaconstructs.groupall.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.AddressType;
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.GroupallModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AddressType</b></em>'.
 * 
 * @generated
 */
public class AddressTypeDao extends BaseDao<AddressType> {

  /**
   * @generated
   */
  @Override
  public Class<AddressType> getEntityClass() {
    return AddressType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return GroupallModelPackage.INSTANCE.getAddressTypeEClass();
  }
}
