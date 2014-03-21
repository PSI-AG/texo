package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.ReferenceKey;

/**
 * The Dao implementation for the model object '<em><b>ReferenceKey</b></em>'.
 * 
 * @generated
 */
public class ReferenceKeyDao extends BaseDao<ReferenceKey> {

  /**
   * @generated
   */
  @Override
  public Class<ReferenceKey> getEntityClass() {
    return ReferenceKey.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getReferenceKeyEClass();
  }
}
