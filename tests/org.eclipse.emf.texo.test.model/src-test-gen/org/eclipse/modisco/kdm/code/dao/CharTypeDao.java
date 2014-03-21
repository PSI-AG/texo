package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CharType;
import org.eclipse.modisco.kdm.code.CodeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>CharType</b></em>'.
 * 
 * @generated
 */
public class CharTypeDao extends BaseDao<CharType> {

  /**
   * @generated
   */
  @Override
  public Class<CharType> getEntityClass() {
    return CharType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getCharTypeEClass();
  }
}
