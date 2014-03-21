package org.eclipse.emf.texo.test.model.samples.inventory.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.inventory.InvModelPackage;
import org.eclipse.emf.texo.test.model.samples.inventory.PDeclaration;

/**
 * The Dao implementation for the model object '<em><b>PDeclaration</b></em>'.
 * 
 * @generated
 */
public class PDeclarationDao extends BaseDao<PDeclaration> {

  /**
   * @generated
   */
  @Override
  public Class<PDeclaration> getEntityClass() {
    return PDeclaration.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return InvModelPackage.INSTANCE.getPDeclarationEClass();
  }
}
