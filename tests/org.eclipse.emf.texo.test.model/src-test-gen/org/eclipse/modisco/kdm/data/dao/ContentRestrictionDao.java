package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.ContentRestriction;
import org.eclipse.modisco.kdm.data.DataModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ContentRestriction</b></em>'.
 * 
 * @generated
 */
public class ContentRestrictionDao extends BaseDao<ContentRestriction> {

  /**
   * @generated
   */
  @Override
  public Class<ContentRestriction> getEntityClass() {
    return ContentRestriction.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getContentRestrictionEClass();
  }
}
