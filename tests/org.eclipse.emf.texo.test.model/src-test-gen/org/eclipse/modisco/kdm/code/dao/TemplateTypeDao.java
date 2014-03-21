package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.TemplateType;

/**
 * The Dao implementation for the model object '<em><b>TemplateType</b></em>'.
 * 
 * @generated
 */
public class TemplateTypeDao extends BaseDao<TemplateType> {

  /**
   * @generated
   */
  @Override
  public Class<TemplateType> getEntityClass() {
    return TemplateType.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getTemplateTypeEClass();
  }
}
