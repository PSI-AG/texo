package org.eclipse.emf.texo.test.model.issues.bz393240.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz393240.Bz393240ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz393240.DocumentRoot;

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
    return Bz393240ModelPackage.INSTANCE.getDocumentRootEClass();
  }
}
