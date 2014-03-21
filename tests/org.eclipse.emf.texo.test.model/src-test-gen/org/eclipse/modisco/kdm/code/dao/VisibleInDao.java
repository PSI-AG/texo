package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.VisibleIn;

/**
 * The Dao implementation for the model object '<em><b>VisibleIn</b></em>'.
 * 
 * @generated
 */
public class VisibleInDao extends BaseDao<VisibleIn> {

  /**
   * @generated
   */
  @Override
  public Class<VisibleIn> getEntityClass() {
    return VisibleIn.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getVisibleInEClass();
  }
}
