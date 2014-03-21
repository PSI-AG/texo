package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.AllContent;
import org.eclipse.modisco.kdm.data.DataModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AllContent</b></em>'.
 * 
 * @generated
 */
public class AllContentDao extends BaseDao<AllContent> {

  /**
   * @generated
   */
  @Override
  public Class<AllContent> getEntityClass() {
    return AllContent.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getAllContentEClass();
  }
}
