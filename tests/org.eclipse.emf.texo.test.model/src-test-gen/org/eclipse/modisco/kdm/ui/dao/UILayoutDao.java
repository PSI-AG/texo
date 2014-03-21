package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.UILayout;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>UILayout</b></em>'.
 * 
 * @generated
 */
public class UILayoutDao extends BaseDao<UILayout> {

  /**
   * @generated
   */
  @Override
  public Class<UILayout> getEntityClass() {
    return UILayout.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getUILayoutEClass();
  }
}
