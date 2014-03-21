package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.ContentItem;
import org.eclipse.modisco.kdm.data.DataModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ContentItem</b></em>'.
 * 
 * @generated
 */
public class ContentItemDao extends BaseDao<ContentItem> {

  /**
   * @generated
   */
  @Override
  public Class<ContentItem> getEntityClass() {
    return ContentItem.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getContentItemEClass();
  }
}
