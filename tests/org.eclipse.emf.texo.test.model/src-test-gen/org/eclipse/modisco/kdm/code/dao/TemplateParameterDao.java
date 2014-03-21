package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.TemplateParameter;

/**
 * The Dao implementation for the model object '<em><b>TemplateParameter</b></em>'.
 * 
 * @generated
 */
public class TemplateParameterDao extends BaseDao<TemplateParameter> {

  /**
   * @generated
   */
  @Override
  public Class<TemplateParameter> getEntityClass() {
    return TemplateParameter.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getTemplateParameterEClass();
  }
}
