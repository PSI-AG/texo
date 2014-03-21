package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.TemplateUnit;

/**
 * The Dao implementation for the model object '<em><b>TemplateUnit</b></em>'.
 * 
 * @generated
 */
public class TemplateUnitDao extends BaseDao<TemplateUnit> {

  /**
   * @generated
   */
  @Override
  public Class<TemplateUnit> getEntityClass() {
    return TemplateUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getTemplateUnitEClass();
  }
}
