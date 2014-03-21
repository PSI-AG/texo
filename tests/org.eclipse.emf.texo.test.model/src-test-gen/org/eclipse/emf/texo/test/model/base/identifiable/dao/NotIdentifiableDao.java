package org.eclipse.emf.texo.test.model.base.identifiable.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.NotIdentifiable;

/**
 * The Dao implementation for the model object '<em><b>NotIdentifiable</b></em>'.
 * 
 * @generated
 */
public class NotIdentifiableDao extends BaseDao<NotIdentifiable> {

  /**
   * @generated
   */
  @Override
  public Class<NotIdentifiable> getEntityClass() {
    return NotIdentifiable.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return IdentifiableModelPackage.INSTANCE.getNotIdentifiableEClass();
  }
}
