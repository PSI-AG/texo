package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.AbstractUIRelationship;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractUIRelationship</b></em>'.
 * 
 * @generated
 */
public class AbstractUIRelationshipDao extends BaseDao<AbstractUIRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractUIRelationship> getEntityClass() {
    return AbstractUIRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getAbstractUIRelationshipEClass();
  }
}
