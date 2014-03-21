package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.UIFlow;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>UIFlow</b></em>'.
 * 
 * @generated
 */
public class UIFlowDao extends BaseDao<UIFlow> {

  /**
   * @generated
   */
  @Override
  public Class<UIFlow> getEntityClass() {
    return UIFlow.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getUIFlowEClass();
  }
}
