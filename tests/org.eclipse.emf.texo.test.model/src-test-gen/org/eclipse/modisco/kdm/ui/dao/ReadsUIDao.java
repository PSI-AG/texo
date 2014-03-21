package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.ReadsUI;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ReadsUI</b></em>'.
 * 
 * @generated
 */
public class ReadsUIDao extends BaseDao<ReadsUI> {

  /**
   * @generated
   */
  @Override
  public Class<ReadsUI> getEntityClass() {
    return ReadsUI.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getReadsUIEClass();
  }
}
