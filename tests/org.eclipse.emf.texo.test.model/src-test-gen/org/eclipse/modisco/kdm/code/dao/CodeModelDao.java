package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModel;
import org.eclipse.modisco.kdm.code.CodeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>CodeModel</b></em>'.
 * 
 * @generated
 */
public class CodeModelDao extends BaseDao<CodeModel> {

  /**
   * @generated
   */
  @Override
  public Class<CodeModel> getEntityClass() {
    return CodeModel.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getCodeModelEClass();
  }
}
