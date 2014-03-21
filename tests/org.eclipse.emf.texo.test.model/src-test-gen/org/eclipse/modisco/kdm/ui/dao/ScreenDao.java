package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.Screen;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Screen</b></em>'.
 * 
 * @generated
 */
public class ScreenDao extends BaseDao<Screen> {

  /**
   * @generated
   */
  @Override
  public Class<Screen> getEntityClass() {
    return Screen.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getScreenEClass();
  }
}
