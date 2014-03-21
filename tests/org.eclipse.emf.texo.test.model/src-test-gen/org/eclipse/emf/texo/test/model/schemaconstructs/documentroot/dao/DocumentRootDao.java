package org.eclipse.emf.texo.test.model.schemaconstructs.documentroot.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.documentroot.DocumentRoot;
import org.eclipse.emf.texo.test.model.schemaconstructs.documentroot.DocumentrootModelPackage;

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
    return DocumentrootModelPackage.INSTANCE.getDocumentRootEClass();
  }
}
