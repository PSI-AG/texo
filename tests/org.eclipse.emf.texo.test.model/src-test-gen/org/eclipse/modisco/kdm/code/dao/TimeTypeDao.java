package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.TimeType;

/**
 * The Dao implementation for the model object '<em><b>TimeType</b></em>'.
 * 
 * @generated
 */
public class TimeTypeDao extends BaseDao<TimeType> {

  /**
   * @generated
   */
  @Override
  public Class<TimeType> getEntityClass() {
    return TimeType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getTimeTypeEClass();
  }
}
