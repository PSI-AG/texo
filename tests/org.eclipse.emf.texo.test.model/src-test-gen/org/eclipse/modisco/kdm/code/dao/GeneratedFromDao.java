package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.GeneratedFrom;

/**
 * The Dao implementation for the model object '<em><b>GeneratedFrom</b></em>'.
 * 
 * @generated
 */
public class GeneratedFromDao extends BaseDao<GeneratedFrom> {

  /**
   * @generated
   */
  @Override
  public Class<GeneratedFrom> getEntityClass() {
    return GeneratedFrom.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getGeneratedFromEClass();
  }
}
