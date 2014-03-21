package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeElement;
import org.eclipse.modisco.kdm.code.CodeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>CodeElement</b></em>'.
 * 
 * @generated
 */
public class CodeElementDao extends BaseDao<CodeElement> {

  /**
   * @generated
   */
  @Override
  public Class<CodeElement> getEntityClass() {
    return CodeElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getCodeElementEClass();
  }
}
