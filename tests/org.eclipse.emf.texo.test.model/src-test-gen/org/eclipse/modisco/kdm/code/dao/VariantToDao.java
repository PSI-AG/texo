package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.VariantTo;

/**
 * The Dao implementation for the model object '<em><b>VariantTo</b></em>'.
 * 
 * @generated
 */
public class VariantToDao extends BaseDao<VariantTo> {

  /**
   * @generated
   */
  @Override
  public Class<VariantTo> getEntityClass() {
    return VariantTo.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getVariantToEClass();
  }
}
