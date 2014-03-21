package org.eclipse.emf.texo.test.model.samples.accounting;

import java.io.Serializable;
import java.util.Date;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>accounting</b></em>'. It contains
 * initialization code and access to the Factory to instantiate types of this
 * package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class AccountingModelPackage extends ModelPackage {

	/**
	 * Is set when the package has been initialized.
	 * 
	 * @generated
	 */
	private static boolean isInitialized = false;

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/accounting";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final AccountingModelFactory MODELFACTORY = new AccountingModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DATE_CLASSIFIER_ID = 11;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACCOUNTING_CLASSIFIER_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACCOUNTING_NAME_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACCOUNTING_ACCOUNTGROUP_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACCOUNTING_VAT_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACCOUNTING_VATACCOUNT_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACCOUNTING_REPORT_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACCOUNTING_JOURNALGROUP_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SERIALIZABLE_CLASSIFIER_ID = 10;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACCOUNT_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACCOUNT_NAME_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACCOUNTGROUP_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACCOUNTGROUP_NAME_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACCOUNTGROUP_ACCOUNT_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VAT_CLASSIFIER_ID = 9;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VAT_NAME_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VAT_RATE_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BALANCEACCOUNT_CLASSIFIER_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BALANCEACCOUNT_REPORT_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int REPORT_CLASSIFIER_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int REPORT_NAME_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int REPORT_DEBITREPORTGROUP_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int REPORT_CREDITREPORTGROUP_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int JOURNALGROUP_CLASSIFIER_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int JOURNALGROUP_NAME_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int JOURNALGROUP_JOURNALGROUPS_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int JOURNALGROUP_JOURNALSTATEMENTS_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int REPORTGROUP_CLASSIFIER_ID = 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int REPORTGROUP_NAME_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int REPORTGROUP_REPORTGROUP_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int REPORTGROUP_ACCOUNT_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int JOURNALSTATEMENT_CLASSIFIER_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int JOURNALSTATEMENT_DESCRIPTION_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int JOURNALSTATEMENT_DATE_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int JOURNALSTATEMENT_AMOUNT_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int JOURNALSTATEMENT_DEBITACCOUNT_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int JOURNALSTATEMENT_CREDITACCOUNT_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int JOURNALSTATEMENT_VAT_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLACCOUNT_CLASSIFIER_ID = 6;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final AccountingModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static AccountingModelPackage initialize() {

		if (isInitialized) {
			return (AccountingModelPackage) ModelResolver.getInstance()
					.getModelPackage(NS_URI);
		}

		final AccountingModelPackage modelPackage = new AccountingModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		isInitialized = true;

		// force the initialization of the EFactory proxy
		modelPackage.getEPackage();

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(
				AccountingClass.class, modelPackage.getAccountingEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				Serializable.class, modelPackage.getSerializableEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Account.class,
				modelPackage.getAccountEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				AccountGroup.class, modelPackage.getAccountGroupEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Vat.class,
				modelPackage.getVatEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				BalanceAccount.class, modelPackage.getBalanceAccountEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Report.class,
				modelPackage.getReportEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				JournalGroup.class, modelPackage.getJournalGroupEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				ReportGroup.class, modelPackage.getReportGroupEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				JournalStatement.class,
				modelPackage.getJournalStatementEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(PLAccount.class,
				modelPackage.getPLAccountEClass(), modelPackage);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the {@link AccountingModelFactory} instance.
	 * @generated
	 */
	@Override
	public AccountingModelFactory getModelFactory() {
		return MODELFACTORY;
	}

	/**
	 * Returns the nsUri of the {@link EPackage} managed by this Package
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the nsUri of the EPackage
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return NS_URI;
	}

	/**
	 * Returns the name of the ecore file containing the ecore model of the
	 * {@link EPackage} managed here. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the name of the ecore file
	 * @generated
	 */
	@Override
	public String getEcoreFileName() {
		return "accounting.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>Accounting</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Accounting</b></em>'
	 * @generated
	 */
	public EClass getAccountingEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ACCOUNTING_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Accounting.name</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Accounting.name</b></em>'.
	 * @generated
	 */
	public EAttribute getAccounting_Name() {
		return (EAttribute) getAccountingEClass().getEAllStructuralFeatures()
				.get(ACCOUNTING_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Accounting.accountGroup</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Accounting.accountGroup</b></em>'.
	 * @generated
	 */
	public EReference getAccounting_AccountGroup() {
		return (EReference) getAccountingEClass().getEAllStructuralFeatures()
				.get(ACCOUNTING_ACCOUNTGROUP_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Accounting.vat</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Accounting.vat</b></em>'.
	 * @generated
	 */
	public EReference getAccounting_Vat() {
		return (EReference) getAccountingEClass().getEAllStructuralFeatures()
				.get(ACCOUNTING_VAT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Accounting.vatAccount</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Accounting.vatAccount</b></em>'.
	 * @generated
	 */
	public EReference getAccounting_VatAccount() {
		return (EReference) getAccountingEClass().getEAllStructuralFeatures()
				.get(ACCOUNTING_VATACCOUNT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Accounting.report</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Accounting.report</b></em>'.
	 * @generated
	 */
	public EReference getAccounting_Report() {
		return (EReference) getAccountingEClass().getEAllStructuralFeatures()
				.get(ACCOUNTING_REPORT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Accounting.journalGroup</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Accounting.journalGroup</b></em>'.
	 * @generated
	 */
	public EReference getAccounting_JournalGroup() {
		return (EReference) getAccountingEClass().getEAllStructuralFeatures()
				.get(ACCOUNTING_JOURNALGROUP_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Serializable</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Serializable</b></em>'
	 * @generated
	 */
	public EClass getSerializableEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				SERIALIZABLE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Account</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Account</b></em>'
	 * @generated
	 */
	public EClass getAccountEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ACCOUNT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Account.name</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Account.name</b></em>'.
	 * @generated
	 */
	public EAttribute getAccount_Name() {
		return (EAttribute) getAccountEClass().getEAllStructuralFeatures().get(
				ACCOUNT_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>AccountGroup</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>AccountGroup</b></em>'
	 * @generated
	 */
	public EClass getAccountGroupEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ACCOUNTGROUP_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>AccountGroup.name</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>AccountGroup.name</b></em>'.
	 * @generated
	 */
	public EAttribute getAccountGroup_Name() {
		return (EAttribute) getAccountGroupEClass().getEAllStructuralFeatures()
				.get(ACCOUNTGROUP_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>AccountGroup.account</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>AccountGroup.account</b></em>'.
	 * @generated
	 */
	public EReference getAccountGroup_Account() {
		return (EReference) getAccountGroupEClass().getEAllStructuralFeatures()
				.get(ACCOUNTGROUP_ACCOUNT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Vat</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Vat</b></em>'
	 * @generated
	 */
	public EClass getVatEClass() {
		return (EClass) getEPackage().getEClassifiers().get(VAT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Vat.name</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Vat.name</b></em>'.
	 * @generated
	 */
	public EAttribute getVat_Name() {
		return (EAttribute) getVatEClass().getEAllStructuralFeatures().get(
				VAT_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Vat.rate</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Vat.rate</b></em>'.
	 * @generated
	 */
	public EAttribute getVat_Rate() {
		return (EAttribute) getVatEClass().getEAllStructuralFeatures().get(
				VAT_RATE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>BalanceAccount</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>BalanceAccount</b></em>
	 *         '
	 * @generated
	 */
	public EClass getBalanceAccountEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				BALANCEACCOUNT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>BalanceAccount.report</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>BalanceAccount.report</b></em>'.
	 * @generated
	 */
	public EReference getBalanceAccount_Report() {
		return (EReference) getBalanceAccountEClass()
				.getEAllStructuralFeatures().get(
						BALANCEACCOUNT_REPORT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Report</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Report</b></em>'
	 * @generated
	 */
	public EClass getReportEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				REPORT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Report.name</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Report.name</b></em>'.
	 * @generated
	 */
	public EAttribute getReport_Name() {
		return (EAttribute) getReportEClass().getEAllStructuralFeatures().get(
				REPORT_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Report.debitReportGroup</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Report.debitReportGroup</b></em>'.
	 * @generated
	 */
	public EReference getReport_DebitReportGroup() {
		return (EReference) getReportEClass().getEAllStructuralFeatures().get(
				REPORT_DEBITREPORTGROUP_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Report.creditReportGroup</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Report.creditReportGroup</b></em>'.
	 * @generated
	 */
	public EReference getReport_CreditReportGroup() {
		return (EReference) getReportEClass().getEAllStructuralFeatures().get(
				REPORT_CREDITREPORTGROUP_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>JournalGroup</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>JournalGroup</b></em>'
	 * @generated
	 */
	public EClass getJournalGroupEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				JOURNALGROUP_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>JournalGroup.name</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>JournalGroup.name</b></em>'.
	 * @generated
	 */
	public EAttribute getJournalGroup_Name() {
		return (EAttribute) getJournalGroupEClass().getEAllStructuralFeatures()
				.get(JOURNALGROUP_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>JournalGroup.journalGroups</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>JournalGroup.journalGroups</b></em>'.
	 * @generated
	 */
	public EReference getJournalGroup_JournalGroups() {
		return (EReference) getJournalGroupEClass().getEAllStructuralFeatures()
				.get(JOURNALGROUP_JOURNALGROUPS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>JournalGroup.journalStatements</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>JournalGroup.journalStatements</b></em>'.
	 * @generated
	 */
	public EReference getJournalGroup_JournalStatements() {
		return (EReference) getJournalGroupEClass().getEAllStructuralFeatures()
				.get(JOURNALGROUP_JOURNALSTATEMENTS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>ReportGroup</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>ReportGroup</b></em>'
	 * @generated
	 */
	public EClass getReportGroupEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				REPORTGROUP_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>ReportGroup.name</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ReportGroup.name</b></em>'.
	 * @generated
	 */
	public EAttribute getReportGroup_Name() {
		return (EAttribute) getReportGroupEClass().getEAllStructuralFeatures()
				.get(REPORTGROUP_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ReportGroup.reportGroup</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ReportGroup.reportGroup</b></em>'.
	 * @generated
	 */
	public EReference getReportGroup_ReportGroup() {
		return (EReference) getReportGroupEClass().getEAllStructuralFeatures()
				.get(REPORTGROUP_REPORTGROUP_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ReportGroup.account</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ReportGroup.account</b></em>'.
	 * @generated
	 */
	public EReference getReportGroup_Account() {
		return (EReference) getReportGroupEClass().getEAllStructuralFeatures()
				.get(REPORTGROUP_ACCOUNT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>JournalStatement</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>JournalStatement</b></em>'
	 * @generated
	 */
	public EClass getJournalStatementEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				JOURNALSTATEMENT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>JournalStatement.description</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>JournalStatement.description</b></em>'.
	 * @generated
	 */
	public EAttribute getJournalStatement_Description() {
		return (EAttribute) getJournalStatementEClass()
				.getEAllStructuralFeatures().get(
						JOURNALSTATEMENT_DESCRIPTION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>JournalStatement.date</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>JournalStatement.date</b></em>'.
	 * @generated
	 */
	public EAttribute getJournalStatement_Date() {
		return (EAttribute) getJournalStatementEClass()
				.getEAllStructuralFeatures().get(
						JOURNALSTATEMENT_DATE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>JournalStatement.amount</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>JournalStatement.amount</b></em>'.
	 * @generated
	 */
	public EAttribute getJournalStatement_Amount() {
		return (EAttribute) getJournalStatementEClass()
				.getEAllStructuralFeatures().get(
						JOURNALSTATEMENT_AMOUNT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>JournalStatement.debitAccount</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>JournalStatement.debitAccount</b></em>'.
	 * @generated
	 */
	public EReference getJournalStatement_DebitAccount() {
		return (EReference) getJournalStatementEClass()
				.getEAllStructuralFeatures().get(
						JOURNALSTATEMENT_DEBITACCOUNT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>JournalStatement.creditAccount</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>JournalStatement.creditAccount</b></em>'.
	 * @generated
	 */
	public EReference getJournalStatement_CreditAccount() {
		return (EReference) getJournalStatementEClass()
				.getEAllStructuralFeatures().get(
						JOURNALSTATEMENT_CREDITACCOUNT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>JournalStatement.vat</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>JournalStatement.vat</b></em>'.
	 * @generated
	 */
	public EReference getJournalStatement_Vat() {
		return (EReference) getJournalStatementEClass()
				.getEAllStructuralFeatures().get(
						JOURNALSTATEMENT_VAT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>PLAccount</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>PLAccount</b></em>'
	 * @generated
	 */
	public EClass getPLAccountEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				PLACCOUNT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EDataType} '<em><b>Date</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EDataType} representing '
	 *         <em><b>Date</b></em>'
	 * @generated
	 */
	public EDataType getDateEDataType() {
		return (EDataType) getEPackage().getEClassifiers().get(
				DATE_CLASSIFIER_ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eClassifier
	 *            the {@link EClassifier}
	 * @return the class implementing a specific {@link EClass}.
	 * @generated
	 */
	@Override
	public Class<?> getEClassifierClass(EClassifier eClassifier) {
		switch (eClassifier.getClassifierID()) {
		case ACCOUNTING_CLASSIFIER_ID:
			return AccountingClass.class;
		case SERIALIZABLE_CLASSIFIER_ID:
			return Serializable.class;
		case ACCOUNT_CLASSIFIER_ID:
			return Account.class;
		case ACCOUNTGROUP_CLASSIFIER_ID:
			return AccountGroup.class;
		case VAT_CLASSIFIER_ID:
			return Vat.class;
		case BALANCEACCOUNT_CLASSIFIER_ID:
			return BalanceAccount.class;
		case REPORT_CLASSIFIER_ID:
			return Report.class;
		case JOURNALGROUP_CLASSIFIER_ID:
			return JournalGroup.class;
		case REPORTGROUP_CLASSIFIER_ID:
			return ReportGroup.class;
		case JOURNALSTATEMENT_CLASSIFIER_ID:
			return JournalStatement.class;
		case PLACCOUNT_CLASSIFIER_ID:
			return PLAccount.class;
		case DATE_CLASSIFIER_ID:
			return Date.class;
		}
		throw new IllegalArgumentException("The EClassifier '" + eClassifier
				+ "' is not defined in this EPackage");
	}
}
