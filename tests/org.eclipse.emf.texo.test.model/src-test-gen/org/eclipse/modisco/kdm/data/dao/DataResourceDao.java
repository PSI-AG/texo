package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.DataResource;

/**
 * The Dao implementation for the model object '<em><b>DataResource</b></em>'.
 * 
 * @generated
 */
public class DataResourceDao extends BaseDao<DataResource> {

  /**
   * @generated
   */
  @Override
  public Class<DataResource> getEntityClass() {
    return DataResource.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getDataResourceEClass();
  }
}
