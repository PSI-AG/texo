package org.eclipse.modisco.kdm.core.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.core.CoreModelPackage;
import org.eclipse.modisco.kdm.core.ModelElement;

/**
 * The Dao implementation for the model object '<em><b>ModelElement</b></em>'.
 * 
 * @generated
 */
public class ModelElementDao extends BaseDao<ModelElement> {

  /**
   * @generated
   */
  @Override
  public Class<ModelElement> getEntityClass() {
    return ModelElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CoreModelPackage.INSTANCE.getModelElementEClass();
  }
}
