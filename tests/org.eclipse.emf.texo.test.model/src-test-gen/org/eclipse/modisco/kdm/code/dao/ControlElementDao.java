package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.ControlElement;

/**
 * The Dao implementation for the model object '<em><b>ControlElement</b></em>'.
 * 
 * @generated
 */
public class ControlElementDao extends BaseDao<ControlElement> {

  /**
   * @generated
   */
  @Override
  public Class<ControlElement> getEntityClass() {
    return ControlElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getControlElementEClass();
  }
}
