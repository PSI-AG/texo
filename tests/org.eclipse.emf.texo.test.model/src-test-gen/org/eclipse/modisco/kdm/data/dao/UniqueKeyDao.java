package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.UniqueKey;

/**
 * The Dao implementation for the model object '<em><b>UniqueKey</b></em>'.
 * 
 * @generated
 */
public class UniqueKeyDao extends BaseDao<UniqueKey> {

  /**
   * @generated
   */
  @Override
  public Class<UniqueKey> getEntityClass() {
    return UniqueKey.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getUniqueKeyEClass();
  }
}
