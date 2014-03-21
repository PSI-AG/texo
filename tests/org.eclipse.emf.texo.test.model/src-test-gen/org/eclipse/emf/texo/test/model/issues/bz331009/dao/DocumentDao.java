package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.Document;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Document</b></em>'.
 * 
 * @generated
 */
public class DocumentDao extends BaseDao<Document> {

  /**
   * @generated
   */
  @Override
  public Class<Document> getEntityClass() {
    return Document.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getDocumentEClass();
  }
}
