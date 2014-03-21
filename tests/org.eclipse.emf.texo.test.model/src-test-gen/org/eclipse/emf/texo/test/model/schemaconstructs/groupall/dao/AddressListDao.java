package org.eclipse.emf.texo.test.model.schemaconstructs.groupall.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.AddressList;
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.GroupallModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AddressList</b></em>'.
 * 
 * @generated
 */
public class AddressListDao extends BaseDao<AddressList> {

  /**
   * @generated
   */
  @Override
  public Class<AddressList> getEntityClass() {
    return AddressList.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return GroupallModelPackage.INSTANCE.getAddressListEClass();
  }
}
