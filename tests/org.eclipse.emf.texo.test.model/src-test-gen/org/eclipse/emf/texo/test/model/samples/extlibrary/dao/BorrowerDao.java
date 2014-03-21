package org.eclipse.emf.texo.test.model.samples.extlibrary.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extlibrary.Borrower;
import org.eclipse.emf.texo.test.model.samples.extlibrary.ExtlibraryModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Borrower</b></em>'.
 * 
 * @generated
 */
public class BorrowerDao extends BaseDao<Borrower> {

  /**
   * @generated
   */
  @Override
  public Class<Borrower> getEntityClass() {
    return Borrower.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ExtlibraryModelPackage.INSTANCE.getBorrowerEClass();
  }
}
