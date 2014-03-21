package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.ContentAttribute;
import org.eclipse.modisco.kdm.data.DataModelPackage;

/**
 * The Dao implementation for the model object '<em><b>ContentAttribute</b></em>'.
 * 
 * @generated
 */
public class ContentAttributeDao extends BaseDao<ContentAttribute> {

  /**
   * @generated
   */
  @Override
  public Class<ContentAttribute> getEntityClass() {
    return ContentAttribute.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getContentAttributeEClass();
  }
}
