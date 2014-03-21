package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.UIElement;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>UIElement</b></em>'.
 * 
 * @generated
 */
public class UIElementDao extends BaseDao<UIElement> {

  /**
   * @generated
   */
  @Override
  public Class<UIElement> getEntityClass() {
    return UIElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getUIElementEClass();
  }
}
