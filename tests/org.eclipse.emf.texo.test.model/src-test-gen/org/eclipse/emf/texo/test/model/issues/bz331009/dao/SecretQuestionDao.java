package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.SecretQuestion;

/**
 * The Dao implementation for the model object '<em><b>SecretQuestion</b></em>'.
 * 
 * @generated
 */
public class SecretQuestionDao extends BaseDao<SecretQuestion> {

  /**
   * @generated
   */
  @Override
  public Class<SecretQuestion> getEntityClass() {
    return SecretQuestion.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getSecretQuestionEClass();
  }
}
