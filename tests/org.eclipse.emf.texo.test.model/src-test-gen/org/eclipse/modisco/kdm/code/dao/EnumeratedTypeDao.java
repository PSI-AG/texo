package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.EnumeratedType;

/**
 * The Dao implementation for the model object '<em><b>EnumeratedType</b></em>'.
 * 
 * @generated
 */
public class EnumeratedTypeDao extends BaseDao<EnumeratedType> {

  /**
   * @generated
   */
  @Override
  public Class<EnumeratedType> getEntityClass() {
    return EnumeratedType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getEnumeratedTypeEClass();
  }
}
