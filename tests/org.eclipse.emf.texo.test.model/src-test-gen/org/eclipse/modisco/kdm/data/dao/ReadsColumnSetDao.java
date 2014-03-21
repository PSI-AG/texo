package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.ReadsColumnSet;

/**
 * The Dao implementation for the model object '<em><b>ReadsColumnSet</b></em>'.
 * 
 * @generated
 */
public class ReadsColumnSetDao extends BaseDao<ReadsColumnSet> {

  /**
   * @generated
   */
  @Override
  public Class<ReadsColumnSet> getEntityClass() {
    return ReadsColumnSet.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getReadsColumnSetEClass();
  }
}
