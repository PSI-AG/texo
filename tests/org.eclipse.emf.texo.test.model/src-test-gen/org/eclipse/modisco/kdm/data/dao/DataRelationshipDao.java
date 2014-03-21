package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.DataRelationship;

/**
 * The Dao implementation for the model object '<em><b>DataRelationship</b></em>'.
 * 
 * @generated
 */
public class DataRelationshipDao extends BaseDao<DataRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<DataRelationship> getEntityClass() {
    return DataRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getDataRelationshipEClass();
  }
}
