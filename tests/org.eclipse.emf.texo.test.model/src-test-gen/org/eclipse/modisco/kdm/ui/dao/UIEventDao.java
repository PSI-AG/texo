package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.UIEvent;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>UIEvent</b></em>'.
 * 
 * @generated
 */
public class UIEventDao extends BaseDao<UIEvent> {

  /**
   * @generated
   */
  @Override
  public Class<UIEvent> getEntityClass() {
    return UIEvent.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getUIEventEClass();
  }
}
