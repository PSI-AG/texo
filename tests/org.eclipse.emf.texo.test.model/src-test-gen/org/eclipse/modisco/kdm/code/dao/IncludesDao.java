package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.Includes;

/**
 * The Dao implementation for the model object '<em><b>Includes</b></em>'.
 * 
 * @generated
 */
public class IncludesDao extends BaseDao<Includes> {

  /**
   * @generated
   */
  @Override
  public Class<Includes> getEntityClass() {
    return Includes.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getIncludesEClass();
  }
}
