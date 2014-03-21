package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.PreprocessorDirective;

/**
 * The Dao implementation for the model object '<em><b>PreprocessorDirective</b></em>'.
 * 
 * @generated
 */
public class PreprocessorDirectiveDao extends BaseDao<PreprocessorDirective> {

  /**
   * @generated
   */
  @Override
  public Class<PreprocessorDirective> getEntityClass() {
    return PreprocessorDirective.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getPreprocessorDirectiveEClass();
  }
}
