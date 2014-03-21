package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.UIRelationship;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>UIRelationship</b></em>'.
 * 
 * @generated
 */
public class UIRelationshipDao extends BaseDao<UIRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<UIRelationship> getEntityClass() {
    return UIRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getUIRelationshipEClass();
  }
}
