package org.eclipse.emf.texo.test.model.schemaconstructs.groupall.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.AddressGroupType;
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.GroupallModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AddressGroupType</b></em>'.
 * 
 * @generated
 */
public class AddressGroupTypeDao extends BaseDao<AddressGroupType> {

  /**
   * @generated
   */
  @Override
  public Class<AddressGroupType> getEntityClass() {
    return AddressGroupType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return GroupallModelPackage.INSTANCE.getAddressGroupTypeEClass();
  }
}
