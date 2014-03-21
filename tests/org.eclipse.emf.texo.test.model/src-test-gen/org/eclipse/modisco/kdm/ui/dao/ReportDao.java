package org.eclipse.modisco.kdm.ui.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.ui.Report;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Report</b></em>'.
 * 
 * @generated
 */
public class ReportDao extends BaseDao<Report> {

  /**
   * @generated
   */
  @Override
  public Class<Report> getEntityClass() {
    return Report.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return UiModelPackage.INSTANCE.getReportEClass();
  }
}
