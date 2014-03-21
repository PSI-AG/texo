package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.UIDisplay;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>UIDisplay</b></em>'.
 * 
 * @generated
 */
public class UIDisplayDao extends BaseDao<UIDisplay> {

  /**
   * @generated
   */
  @Override
  public Class<UIDisplay> getEntityClass() {
    return UIDisplay.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getUIDisplayEClass();
  }
}
