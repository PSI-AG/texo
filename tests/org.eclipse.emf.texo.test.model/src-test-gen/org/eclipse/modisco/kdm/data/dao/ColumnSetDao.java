package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.ColumnSet;
import org.eclipse.modisco.kdm.data.DataModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ColumnSet</b></em>'.
 * 
 * @generated
 */
public class ColumnSetDao extends BaseDao<ColumnSet> {

  /**
   * @generated
   */
  @Override
  public Class<ColumnSet> getEntityClass() {
    return ColumnSet.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getColumnSetEClass();
  }
}
