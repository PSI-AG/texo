package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.TypeUnit;

/**
 * The Dao implementation for the model object '<em><b>TypeUnit</b></em>'.
 * 
 * @generated
 */
public class TypeUnitDao extends BaseDao<TypeUnit> {

  /**
   * @generated
   */
  @Override
  public Class<TypeUnit> getEntityClass() {
    return TypeUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getTypeUnitEClass();
  }
}
