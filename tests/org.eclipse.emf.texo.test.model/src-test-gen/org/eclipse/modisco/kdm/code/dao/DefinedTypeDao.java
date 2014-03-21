package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.DefinedType;

/**
 * The Dao implementation for the model object '<em><b>DefinedType</b></em>'.
 * 
 * @generated
 */
public class DefinedTypeDao extends BaseDao<DefinedType> {

  /**
   * @generated
   */
  @Override
  public Class<DefinedType> getEntityClass() {
    return DefinedType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getDefinedTypeEClass();
  }
}
