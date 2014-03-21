package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.ValueList;

/**
 * The Dao implementation for the model object '<em><b>ValueList</b></em>'.
 * 
 * @generated
 */
public class ValueListDao extends BaseDao<ValueList> {

  /**
   * @generated
   */
  @Override
  public Class<ValueList> getEntityClass() {
    return ValueList.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getValueListEClass();
  }
}
