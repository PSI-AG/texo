package org.eclipse.emf.texo.test.model.issues.instanceclassset.dao;

import java.io.Serializable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.instanceclassset.Bz306546ModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Serializable</b></em>'.
 * 
 * @generated
 */
public class SerializableDao extends BaseDao<Serializable> {

  /**
   * @generated
   */
  @Override
  public Class<Serializable> getEntityClass() {
    return Serializable.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Bz306546ModelPackage.INSTANCE.getSerializableEClass();
  }
}
