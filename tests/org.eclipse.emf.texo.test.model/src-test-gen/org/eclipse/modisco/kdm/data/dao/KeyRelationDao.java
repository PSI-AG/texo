package org.eclipse.modisco.kdm.data.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.data.KeyRelation;

/**
 * The Dao implementation for the model object '<em><b>KeyRelation</b></em>'.
 * 
 * @generated
 */
public class KeyRelationDao extends BaseDao<KeyRelation> {

  /**
   * @generated
   */
  @Override
  public Class<KeyRelation> getEntityClass() {
    return KeyRelation.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return DataModelPackage.INSTANCE.getKeyRelationEClass();
  }
}
