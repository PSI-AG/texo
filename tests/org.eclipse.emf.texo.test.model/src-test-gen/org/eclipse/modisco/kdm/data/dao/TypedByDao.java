package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.TypedBy;

/**
 * The Dao implementation for the model object '<em><b>TypedBy</b></em>'.
 * 
 * @generated
 */
public class TypedByDao extends BaseDao<TypedBy> {

  /**
   * @generated
   */
  @Override
  public Class<TypedBy> getEntityClass() {
    return TypedBy.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getTypedByEClass();
  }
}
