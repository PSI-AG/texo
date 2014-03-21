package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.DateType;

/**
 * The Dao implementation for the model object '<em><b>DateType</b></em>'.
 * 
 * @generated
 */
public class DateTypeDao extends BaseDao<DateType> {

  /**
   * @generated
   */
  @Override
  public Class<DateType> getEntityClass() {
    return DateType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getDateTypeEClass();
  }
}
