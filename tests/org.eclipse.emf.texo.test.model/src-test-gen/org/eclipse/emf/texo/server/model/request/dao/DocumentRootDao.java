package org.eclipse.emf.texo.server.model.request.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.model.request.DocumentRoot;
import org.eclipse.emf.texo.server.model.request.RequestModelPackage;
import org.eclipse.emf.texo.server.store.BaseDao;

/**
 * The Dao implementation for the model object '<em><b>DocumentRoot</b></em>'.
 * 
 * @generated
 */
public class DocumentRootDao extends BaseDao<DocumentRoot> {

  /**
   * @generated
   */
  @Override
  public Class<DocumentRoot> getEntityClass() {
    return DocumentRoot.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return RequestModelPackage.INSTANCE.getDocumentRootEClass();
  }
}
