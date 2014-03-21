package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.Namespace;

/**
 * The Dao implementation for the model object '<em><b>Namespace</b></em>'.
 * 
 * @generated
 */
public class NamespaceDao extends BaseDao<Namespace> {

  /**
   * @generated
   */
  @Override
  public Class<Namespace> getEntityClass() {
    return Namespace.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getNamespaceEClass();
  }
}
