package org.eclipse.emf.texo.test.model.samples.schemaprimerpo.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.schemaprimerpo.SchemaprimerpoModelPackage;
import org.eclipse.emf.texo.test.model.samples.schemaprimerpo.USAddress;

/**
 * The Dao implementation for the model object '<em><b>USAddress</b></em>'.
 * 
 * @generated
 */
public class USAddressDao extends BaseDao<USAddress> {

  /**
   * @generated
   */
  @Override
  public Class<USAddress> getEntityClass() {
    return USAddress.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return SchemaprimerpoModelPackage.INSTANCE.getUSAddressEClass();
  }
}
