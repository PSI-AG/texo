package org.eclipse.emf.texo.test.model.samples.accounting.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;
import org.eclipse.emf.texo.test.model.samples.accounting.JournalStatement;

/**
 * The Dao implementation for the model object '<em><b>JournalStatement</b></em>'.
 * 
 * @generated
 */
public class JournalStatementDao extends BaseDao<JournalStatement> {

  /**
   * @generated
   */
  @Override
  public Class<JournalStatement> getEntityClass() {
    return JournalStatement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AccountingModelPackage.INSTANCE.getJournalStatementEClass();
  }
}
