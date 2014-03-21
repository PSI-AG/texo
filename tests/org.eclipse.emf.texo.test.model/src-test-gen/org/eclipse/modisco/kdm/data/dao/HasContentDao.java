package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.HasContent;

/**
 * The Dao implementation for the model object '<em><b>HasContent</b></em>'.
 * 
 * @generated
 */
public class HasContentDao extends BaseDao<HasContent> {

  /**
   * @generated
   */
  @Override
  public Class<HasContent> getEntityClass() {
    return HasContent.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getHasContentEClass();
  }
}
