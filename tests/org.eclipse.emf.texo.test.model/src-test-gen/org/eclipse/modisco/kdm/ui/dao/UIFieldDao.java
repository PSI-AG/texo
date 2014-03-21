package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.UIField;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>UIField</b></em>'.
 * 
 * @generated
 */
public class UIFieldDao extends BaseDao<UIField> {

  /**
   * @generated
   */
  @Override
  public Class<UIField> getEntityClass() {
    return UIField.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getUIFieldEClass();
  }
}
