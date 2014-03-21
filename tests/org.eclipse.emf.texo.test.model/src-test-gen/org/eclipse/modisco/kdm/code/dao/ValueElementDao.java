package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.ValueElement;

/**
 * The Dao implementation for the model object '<em><b>ValueElement</b></em>'.
 * 
 * @generated
 */
public class ValueElementDao extends BaseDao<ValueElement> {

  /**
   * @generated
   */
  @Override
  public Class<ValueElement> getEntityClass() {
    return ValueElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getValueElementEClass();
  }
}
