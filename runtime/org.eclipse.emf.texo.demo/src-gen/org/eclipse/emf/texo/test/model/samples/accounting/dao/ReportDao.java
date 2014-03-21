package org.eclipse.emf.texo.test.model.samples.accounting.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;
import org.eclipse.emf.texo.test.model.samples.accounting.Report;

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
		return AccountingModelPackage.INSTANCE.getReportEClass();
	}
}
