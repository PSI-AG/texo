package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.LanguageUnit;

/**
 * The Dao implementation for the model object '<em><b>LanguageUnit</b></em>'.
 * 
 * @generated
 */
public class LanguageUnitDao extends BaseDao<LanguageUnit> {

  /**
   * @generated
   */
  @Override
  public Class<LanguageUnit> getEntityClass() {
    return LanguageUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getLanguageUnitEClass();
  }
}
