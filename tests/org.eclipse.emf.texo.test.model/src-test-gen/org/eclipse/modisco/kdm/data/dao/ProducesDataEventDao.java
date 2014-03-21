package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.ProducesDataEvent;

/**
 * The Dao implementation for the model object '<em><b>ProducesDataEvent</b></em>'.
 * 
 * @generated
 */
public class ProducesDataEventDao extends BaseDao<ProducesDataEvent> {

  /**
   * @generated
   */
  @Override
  public Class<ProducesDataEvent> getEntityClass() {
    return ProducesDataEvent.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getProducesDataEventEClass();
  }
}
