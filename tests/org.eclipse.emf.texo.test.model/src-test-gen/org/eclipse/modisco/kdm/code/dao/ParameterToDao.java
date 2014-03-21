package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.ParameterTo;

/**
 * The Dao implementation for the model object '<em><b>ParameterTo</b></em>'.
 * 
 * @generated
 */
public class ParameterToDao extends BaseDao<ParameterTo> {

  /**
   * @generated
   */
  @Override
  public Class<ParameterTo> getEntityClass() {
    return ParameterTo.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getParameterToEClass();
  }
}
