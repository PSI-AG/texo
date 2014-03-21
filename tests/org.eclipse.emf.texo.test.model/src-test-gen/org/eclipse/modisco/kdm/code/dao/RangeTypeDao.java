package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.RangeType;

/**
 * The Dao implementation for the model object '<em><b>RangeType</b></em>'.
 * 
 * @generated
 */
public class RangeTypeDao extends BaseDao<RangeType> {

  /**
   * @generated
   */
  @Override
  public Class<RangeType> getEntityClass() {
    return RangeType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getRangeTypeEClass();
  }
}
