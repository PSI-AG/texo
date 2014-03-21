package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeItem;
import org.eclipse.modisco.kdm.code.CodeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>CodeItem</b></em>'.
 * 
 * @generated
 */
public class CodeItemDao extends BaseDao<CodeItem> {

  /**
   * @generated
   */
  @Override
  public Class<CodeItem> getEntityClass() {
    return CodeItem.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getCodeItemEClass();
  }
}
