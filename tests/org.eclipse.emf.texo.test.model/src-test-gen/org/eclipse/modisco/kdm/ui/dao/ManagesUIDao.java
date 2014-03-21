package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.ManagesUI;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ManagesUI</b></em>'.
 * 
 * @generated
 */
public class ManagesUIDao extends BaseDao<ManagesUI> {

  /**
   * @generated
   */
  @Override
  public Class<ManagesUI> getEntityClass() {
    return ManagesUI.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getManagesUIEClass();
  }
}
