package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.DatatypeOf;

/**
 * The Dao implementation for the model object '<em><b>DatatypeOf</b></em>'.
 * 
 * @generated
 */
public class DatatypeOfDao extends BaseDao<DatatypeOf> {

  /**
   * @generated
   */
  @Override
  public Class<DatatypeOf> getEntityClass() {
    return DatatypeOf.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getDatatypeOfEClass();
  }
}
