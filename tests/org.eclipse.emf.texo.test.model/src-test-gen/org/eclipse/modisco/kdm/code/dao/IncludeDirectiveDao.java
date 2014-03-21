package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.IncludeDirective;

/**
 * The Dao implementation for the model object '<em><b>IncludeDirective</b></em>'.
 * 
 * @generated
 */
public class IncludeDirectiveDao extends BaseDao<IncludeDirective> {

  /**
   * @generated
   */
  @Override
  public Class<IncludeDirective> getEntityClass() {
    return IncludeDirective.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getIncludeDirectiveEClass();
  }
}
