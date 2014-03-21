package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.ChoiceType;
import org.eclipse.modisco.kdm.code.CodeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ChoiceType</b></em>'.
 * 
 * @generated
 */
public class ChoiceTypeDao extends BaseDao<ChoiceType> {

  /**
   * @generated
   */
  @Override
  public Class<ChoiceType> getEntityClass() {
    return ChoiceType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getChoiceTypeEClass();
  }
}
