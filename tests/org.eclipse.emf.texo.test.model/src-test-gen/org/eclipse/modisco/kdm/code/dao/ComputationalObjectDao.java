package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.ComputationalObject;

/**
 * The Dao implementation for the model object '<em><b>ComputationalObject</b></em>'.
 * 
 * @generated
 */
public class ComputationalObjectDao extends BaseDao<ComputationalObject> {

  /**
   * @generated
   */
  @Override
  public Class<ComputationalObject> getEntityClass() {
    return ComputationalObject.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getComputationalObjectEClass();
  }
}
