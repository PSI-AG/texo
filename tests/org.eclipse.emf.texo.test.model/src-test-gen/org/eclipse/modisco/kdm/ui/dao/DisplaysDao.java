package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.Displays;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Displays</b></em>'.
 * 
 * @generated
 */
public class DisplaysDao extends BaseDao<Displays> {

  /**
   * @generated
   */
  @Override
  public Class<Displays> getEntityClass() {
    return Displays.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getDisplaysEClass();
  }
}
