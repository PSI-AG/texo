package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.ManagesData;

/**
 * The Dao implementation for the model object '<em><b>ManagesData</b></em>'.
 * 
 * @generated
 */
public class ManagesDataDao extends BaseDao<ManagesData> {

  /**
   * @generated
   */
  @Override
  public Class<ManagesData> getEntityClass() {
    return ManagesData.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getManagesDataEClass();
  }
}
