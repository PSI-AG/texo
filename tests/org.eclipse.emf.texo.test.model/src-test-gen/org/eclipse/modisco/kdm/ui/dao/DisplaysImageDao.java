package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.DisplaysImage;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>DisplaysImage</b></em>'.
 * 
 * @generated
 */
public class DisplaysImageDao extends BaseDao<DisplaysImage> {

  /**
   * @generated
   */
  @Override
  public Class<DisplaysImage> getEntityClass() {
    return DisplaysImage.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getDisplaysImageEClass();
  }
}
