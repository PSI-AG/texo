package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.AbstractUIElement;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractUIElement</b></em>'.
 * 
 * @generated
 */
public class AbstractUIElementDao extends BaseDao<AbstractUIElement> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractUIElement> getEntityClass() {
    return AbstractUIElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getAbstractUIElementEClass();
  }
}
