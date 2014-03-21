package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.GroupContent;

/**
 * The Dao implementation for the model object '<em><b>GroupContent</b></em>'.
 * 
 * @generated
 */
public class GroupContentDao extends BaseDao<GroupContent> {

  /**
   * @generated
   */
  @Override
  public Class<GroupContent> getEntityClass() {
    return GroupContent.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getGroupContentEClass();
  }
}
