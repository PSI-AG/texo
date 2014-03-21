package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.UIModel;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>UIModel</b></em>'.
 * 
 * @generated
 */
public class UIModelDao extends BaseDao<UIModel> {

  /**
   * @generated
   */
  @Override
  public Class<UIModel> getEntityClass() {
    return UIModel.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getUIModelEClass();
  }
}
