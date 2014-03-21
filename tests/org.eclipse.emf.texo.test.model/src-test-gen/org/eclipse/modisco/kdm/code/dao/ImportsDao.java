package org.eclipse.modisco.kdm.code.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.code.Imports;

/**
 * The Dao implementation for the model object '<em><b>Imports</b></em>'.
 * 
 * @generated
 */
public class ImportsDao extends BaseDao<Imports> {

  /**
   * @generated
   */
  @Override
  public Class<Imports> getEntityClass() {
    return Imports.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CodeModelPackage.INSTANCE.getImportsEClass();
  }
}
