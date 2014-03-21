package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.UIAction;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>UIAction</b></em>'.
 * 
 * @generated
 */
public class UIActionDao extends BaseDao<UIAction> {

  /**
   * @generated
   */
  @Override
  public Class<UIAction> getEntityClass() {
    return UIAction.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getUIActionEClass();
  }
}
