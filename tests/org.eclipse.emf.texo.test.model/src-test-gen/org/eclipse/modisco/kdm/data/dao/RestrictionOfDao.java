package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.RestrictionOf;

/**
 * The Dao implementation for the model object '<em><b>RestrictionOf</b></em>'.
 * 
 * @generated
 */
public class RestrictionOfDao extends BaseDao<RestrictionOf> {

  /**
   * @generated
   */
  @Override
  public Class<RestrictionOf> getEntityClass() {
    return RestrictionOf.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getRestrictionOfEClass();
  }
}
