package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.ConditionalDirective;

/**
 * The Dao implementation for the model object '<em><b>ConditionalDirective</b></em>'.
 * 
 * @generated
 */
public class ConditionalDirectiveDao extends BaseDao<ConditionalDirective> {

  /**
   * @generated
   */
  @Override
  public Class<ConditionalDirective> getEntityClass() {
    return ConditionalDirective.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getConditionalDirectiveEClass();
  }
}
