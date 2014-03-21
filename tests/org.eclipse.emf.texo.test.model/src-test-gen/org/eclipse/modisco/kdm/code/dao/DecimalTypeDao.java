package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.DecimalType;

/**
 * The Dao implementation for the model object '<em><b>DecimalType</b></em>'.
 * 
 * @generated
 */
public class DecimalTypeDao extends BaseDao<DecimalType> {

  /**
   * @generated
   */
  @Override
  public Class<DecimalType> getEntityClass() {
    return DecimalType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getDecimalTypeEClass();
  }
}
