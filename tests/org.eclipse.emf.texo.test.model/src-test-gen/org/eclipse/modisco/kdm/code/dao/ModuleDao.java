package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.Module;

/**
 * The Dao implementation for the model object '<em><b>Module</b></em>'.
 * 
 * @generated
 */
public class ModuleDao extends BaseDao<Module> {

  /**
   * @generated
   */
  @Override
  public Class<Module> getEntityClass() {
    return Module.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getModuleEClass();
  }
}
