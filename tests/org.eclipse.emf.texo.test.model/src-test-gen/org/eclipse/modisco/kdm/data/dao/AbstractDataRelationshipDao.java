package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.AbstractDataRelationship;
import org.eclipse.modisco.kdm.data.DataModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractDataRelationship</b></em>'.
 * 
 * @generated
 */
public class AbstractDataRelationshipDao extends BaseDao<AbstractDataRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractDataRelationship> getEntityClass() {
    return AbstractDataRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getAbstractDataRelationshipEClass();
  }
}
