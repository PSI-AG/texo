package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.CompilationUnit;

/**
 * The Dao implementation for the model object '<em><b>CompilationUnit</b></em>'.
 * 
 * @generated
 */
public class CompilationUnitDao extends BaseDao<CompilationUnit> {

  /**
   * @generated
   */
  @Override
  public Class<CompilationUnit> getEntityClass() {
    return CompilationUnit.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getCompilationUnitEClass();
  }
}
