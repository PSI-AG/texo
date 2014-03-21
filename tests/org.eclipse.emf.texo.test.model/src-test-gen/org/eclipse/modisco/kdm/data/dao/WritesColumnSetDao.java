package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.WritesColumnSet;

/**
 * The Dao implementation for the model object '<em><b>WritesColumnSet</b></em>'.
 * 
 * @generated
 */
public class WritesColumnSetDao extends BaseDao<WritesColumnSet> {

  /**
   * @generated
   */
  @Override
  public Class<WritesColumnSet> getEntityClass() {
    return WritesColumnSet.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getWritesColumnSetEClass();
  }
}
