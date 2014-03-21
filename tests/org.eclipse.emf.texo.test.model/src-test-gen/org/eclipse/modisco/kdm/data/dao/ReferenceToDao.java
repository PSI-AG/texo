package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.ReferenceTo;

/**
 * The Dao implementation for the model object '<em><b>ReferenceTo</b></em>'.
 * 
 * @generated
 */
public class ReferenceToDao extends BaseDao<ReferenceTo> {

  /**
   * @generated
   */
  @Override
  public Class<ReferenceTo> getEntityClass() {
    return ReferenceTo.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getReferenceToEClass();
  }
}
