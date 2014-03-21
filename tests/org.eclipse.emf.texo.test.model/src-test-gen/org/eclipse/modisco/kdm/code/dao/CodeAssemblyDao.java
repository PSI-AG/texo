package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeAssembly;
import org.eclipse.modisco.kdm.code.CodeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>CodeAssembly</b></em>'.
 * 
 * @generated
 */
public class CodeAssemblyDao extends BaseDao<CodeAssembly> {

  /**
   * @generated
   */
  @Override
  public Class<CodeAssembly> getEntityClass() {
    return CodeAssembly.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getCodeAssemblyEClass();
  }
}
