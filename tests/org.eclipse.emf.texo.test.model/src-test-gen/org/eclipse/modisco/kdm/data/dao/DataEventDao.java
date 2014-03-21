package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataEvent;
import org.eclipse.modisco.kdm.data.DataModelPackage;

/**
 * The Dao implementation for the model object '<em><b>DataEvent</b></em>'.
 * 
 * @generated
 */
public class DataEventDao extends BaseDao<DataEvent> {

  /**
   * @generated
   */
  @Override
  public Class<DataEvent> getEntityClass() {
    return DataEvent.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getDataEventEClass();
  }
}
