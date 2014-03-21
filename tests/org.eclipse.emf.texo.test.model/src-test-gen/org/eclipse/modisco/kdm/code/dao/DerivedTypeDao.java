package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.DerivedType;

/**
 * The Dao implementation for the model object '<em><b>DerivedType</b></em>'.
 * 
 * @generated
 */
public class DerivedTypeDao extends BaseDao<DerivedType> {

  /**
   * @generated
   */
  @Override
  public Class<DerivedType> getEntityClass() {
    return DerivedType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getDerivedTypeEClass();
  }
}
