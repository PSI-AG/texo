package org.eclipse.emf.texo.test.model.schemaconstructs.substitution.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.DocumentRoot;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.SubstitutionModelPackage;

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
    return SubstitutionModelPackage.INSTANCE.getDocumentRootEClass();
  }
}
