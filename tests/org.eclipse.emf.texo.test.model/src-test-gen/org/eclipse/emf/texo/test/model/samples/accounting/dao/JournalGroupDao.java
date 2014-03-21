package org.eclipse.emf.texo.test.model.samples.accounting.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;
import org.eclipse.emf.texo.test.model.samples.accounting.JournalGroup;

/**
 * The Dao implementation for the model object '<em><b>JournalGroup</b></em>'.
 * 
 * @generated
 */
public class JournalGroupDao extends BaseDao<JournalGroup> {

  /**
   * @generated
   */
  @Override
  public Class<JournalGroup> getEntityClass() {
    return JournalGroup.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AccountingModelPackage.INSTANCE.getJournalGroupEClass();
  }
}
