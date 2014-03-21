package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataContainer;
import org.eclipse.modisco.kdm.data.DataModelPackage;

/**
 * The Dao implementation for the model object '<em><b>DataContainer</b></em>'.
 * 
 * @generated
 */
public class DataContainerDao extends BaseDao<DataContainer> {

  /**
   * @generated
   */
  @Override
  public Class<DataContainer> getEntityClass() {
    return DataContainer.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getDataContainerEClass();
  }
}
