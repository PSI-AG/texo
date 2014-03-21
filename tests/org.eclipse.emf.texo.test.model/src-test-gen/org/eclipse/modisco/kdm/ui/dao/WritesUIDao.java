package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.UiModelPackage;
import org.eclipse.modisco.kdm.ui.WritesUI;

/**
 * The Dao implementation for the model object '<em><b>WritesUI</b></em>'.
 * 
 * @generated
 */
public class WritesUIDao extends BaseDao<WritesUI> {

  /**
   * @generated
   */
  @Override
  public Class<WritesUI> getEntityClass() {
    return WritesUI.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getWritesUIEClass();
  }
}
