package org.eclipse.emf.texo.test.model.samples.accounting.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;
import org.eclipse.emf.texo.test.model.samples.accounting.ReportGroup;

/**
 * The Dao implementation for the model object '<em><b>ReportGroup</b></em>'.
 * 
 * @generated
 */
public class ReportGroupDao extends BaseDao<ReportGroup> {

  /**
   * @generated
   */
  @Override
  public Class<ReportGroup> getEntityClass() {
    return ReportGroup.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return AccountingModelPackage.INSTANCE.getReportGroupEClass();
  }
}
