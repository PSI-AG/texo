package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.CompositeType;

/**
 * The Dao implementation for the model object '<em><b>CompositeType</b></em>'.
 * 
 * @generated
 */
public class CompositeTypeDao extends BaseDao<CompositeType> {

  /**
   * @generated
   */
  @Override
  public Class<CompositeType> getEntityClass() {
    return CompositeType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getCompositeTypeEClass();
  }
}
