package org.eclipse.emf.texo.test.model.samples.accounting.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;
import org.eclipse.emf.texo.test.model.samples.accounting.Vat;

/**
 * The Dao implementation for the model object '<em><b>Vat</b></em>'.
 * 
 * @generated
 */
public class VatDao extends BaseDao<Vat> {

  /**
   * @generated
   */
  @Override
  public Class<Vat> getEntityClass() {
    return Vat.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AccountingModelPackage.INSTANCE.getVatEClass();
  }
}
