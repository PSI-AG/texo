package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.ImplementationOf;

/**
 * The Dao implementation for the model object '<em><b>ImplementationOf</b></em>'.
 * 
 * @generated
 */
public class ImplementationOfDao extends BaseDao<ImplementationOf> {

  /**
   * @generated
   */
  @Override
  public Class<ImplementationOf> getEntityClass() {
    return ImplementationOf.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getImplementationOfEClass();
  }
}
