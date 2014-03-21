package org.eclipse.modisco.kdm.kdm.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.kdm.ExtendedValue;
import org.eclipse.modisco.kdm.kdm.KdmModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ExtendedValue</b></em>'.
 * 
 * @generated
 */
public class ExtendedValueDao extends BaseDao<ExtendedValue> {

  /**
   * @generated
   */
  @Override
  public Class<ExtendedValue> getEntityClass() {
    return ExtendedValue.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return KdmModelPackage.INSTANCE.getExtendedValueEClass();
  }
}
