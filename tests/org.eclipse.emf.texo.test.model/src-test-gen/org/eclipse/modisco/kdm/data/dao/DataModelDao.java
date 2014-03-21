package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModel;
import org.eclipse.modisco.kdm.data.DataModelPackage;

/**
 * The Dao implementation for the model object '<em><b>DataModel</b></em>'.
 * 
 * @generated
 */
public class DataModelDao extends BaseDao<DataModel> {

  /**
   * @generated
   */
  @Override
  public Class<DataModel> getEntityClass() {
    return DataModel.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getDataModelEClass();
  }
}
