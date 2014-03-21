package org.eclipse.emf.texo.test.model.samples.accounting;

import java.util.Date;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: accounting. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class AccountingModelFactory implements ModelFactory {

  /**
   * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          creates a Object instance for this EClass
   * @return an object representing the eClass
   * @generated
   */
  public Object create(EClass eClass) {
    switch (eClass.getClassifierID()) {
    case AccountingModelPackage.ACCOUNTING_CLASSIFIER_ID:
      return createAccounting();
    case AccountingModelPackage.ACCOUNTGROUP_CLASSIFIER_ID:
      return createAccountGroup();
    case AccountingModelPackage.VAT_CLASSIFIER_ID:
      return createVat();
    case AccountingModelPackage.BALANCEACCOUNT_CLASSIFIER_ID:
      return createBalanceAccount();
    case AccountingModelPackage.REPORT_CLASSIFIER_ID:
      return createReport();
    case AccountingModelPackage.JOURNALGROUP_CLASSIFIER_ID:
      return createJournalGroup();
    case AccountingModelPackage.REPORTGROUP_CLASSIFIER_ID:
      return createReportGroup();
    case AccountingModelPackage.JOURNALSTATEMENT_CLASSIFIER_ID:
      return createJournalStatement();
    case AccountingModelPackage.PLACCOUNT_CLASSIFIER_ID:
      return createPLAccount();
    default:
      throw new IllegalArgumentException("The EClass '" + eClass.getName()
          + "' is not a valid EClass for this EPackage");
    }
  }

  /**
   * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          the EClass of the object
   * @param adaptee
   *          the object being wrapped/adapted
   * @return the wrapper {@link ModelObject}
   * @generated
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public ModelObject createModelObject(EClass eClass, Object adaptee) {
    ModelObject<Object> modelObject = null;
    switch (eClass.getClassifierID()) {
    case AccountingModelPackage.ACCOUNTING_CLASSIFIER_ID:
      modelObject = new AccountingClassModelObject();
      break;
    case AccountingModelPackage.ACCOUNT_CLASSIFIER_ID:
      modelObject = new AccountModelObject();
      break;
    case AccountingModelPackage.ACCOUNTGROUP_CLASSIFIER_ID:
      modelObject = new AccountGroupModelObject();
      break;
    case AccountingModelPackage.VAT_CLASSIFIER_ID:
      modelObject = new VatModelObject();
      break;
    case AccountingModelPackage.BALANCEACCOUNT_CLASSIFIER_ID:
      modelObject = new BalanceAccountModelObject();
      break;
    case AccountingModelPackage.REPORT_CLASSIFIER_ID:
      modelObject = new ReportModelObject();
      break;
    case AccountingModelPackage.JOURNALGROUP_CLASSIFIER_ID:
      modelObject = new JournalGroupModelObject();
      break;
    case AccountingModelPackage.REPORTGROUP_CLASSIFIER_ID:
      modelObject = new ReportGroupModelObject();
      break;
    case AccountingModelPackage.JOURNALSTATEMENT_CLASSIFIER_ID:
      modelObject = new JournalStatementModelObject();
      break;
    case AccountingModelPackage.PLACCOUNT_CLASSIFIER_ID:
      modelObject = new PLAccountModelObject();
      break;
    default:
      throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
    }
    modelObject.setTarget(adaptee);
    return modelObject;
  }

  /**
   * Creates a feature map entry instance for a certain EStructuralFeature.
   * 
   * @param eFeature
   *          the feature map feature
   * @return the pojo feature map entry
   * @generated
   */
  public Object createFeatureMapEntry(EStructuralFeature eFeature) {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}. If the feature map entry is null then a
   * new one is created and <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eFeature
   *          the feature map feature of the object
   * @param adaptee
   *          the pojo feature map entry being wrapped/adapted
   * @return the wrapper {@link ModelFeatureMapEntry}
   * @generated
   */
  public ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature, Object adaptee) {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Accounting
   * @generated
   */
  public AccountingClass createAccounting() {
    return new AccountingClass();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass AccountGroup
   * @generated
   */
  public AccountGroup createAccountGroup() {
    return new AccountGroup();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Vat
   * @generated
   */
  public Vat createVat() {
    return new Vat();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BalanceAccount
   * @generated
   */
  public BalanceAccount createBalanceAccount() {
    return new BalanceAccount();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Report
   * @generated
   */
  public Report createReport() {
    return new Report();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass JournalGroup
   * @generated
   */
  public JournalGroup createJournalGroup() {
    return new JournalGroup();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ReportGroup
   * @generated
   */
  public ReportGroup createReportGroup() {
    return new ReportGroup();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass JournalStatement
   * @generated
   */
  public JournalStatement createJournalStatement() {
    return new JournalStatement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PLAccount
   * @generated
   */
  public PLAccount createPLAccount() {
    return new PLAccount();
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if the value is null then null is returned.
   * @generated
   */
  public Object createFromString(EDataType eDataType, String value) {
    switch (eDataType.getClassifierID()) {
    case AccountingModelPackage.DATE_CLASSIFIER_ID:
      return createDateFromString(value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
    }
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if value == null then null is returned
   * @generated
   */
  public String convertToString(EDataType eDataType, Object value) {
    switch (eDataType.getClassifierID()) {
    case AccountingModelPackage.DATE_CLASSIFIER_ID:
      return convertDateToString((Date) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: Date to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertDateToString(Date value) {
    if (value == null) {
      return null;
    }
    return ModelUtils.convertToXML(value);
  }

  /**
   * Creates an instance of the EDataType: Date from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public Date createDateFromString(String value) {
    if (value == null) {
      return null;
    }
    return ModelUtils.createFromXML(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Accounting</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AccountingClassModelObject<E extends AccountingClass> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AccountingModelPackage.INSTANCE.getAccountingEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AccountingModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.ACCOUNTING_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AccountingModelPackage.ACCOUNTING_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AccountingModelPackage.ACCOUNTING_NAME_FEATURE_ID:
        return getTarget().getName();
      case AccountingModelPackage.ACCOUNTING_ACCOUNTGROUP_FEATURE_ID:
        return getTarget().getAccountGroup();
      case AccountingModelPackage.ACCOUNTING_VAT_FEATURE_ID:
        return getTarget().getVat();
      case AccountingModelPackage.ACCOUNTING_VATACCOUNT_FEATURE_ID:
        return getTarget().getVatAccount();
      case AccountingModelPackage.ACCOUNTING_REPORT_FEATURE_ID:
        return getTarget().getReport();
      case AccountingModelPackage.ACCOUNTING_JOURNALGROUP_FEATURE_ID:
        return getTarget().getJournalGroup();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.ACCOUNTING_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case AccountingModelPackage.ACCOUNTING_ACCOUNTGROUP_FEATURE_ID:
        getTarget().setAccountGroup((List<AccountGroup>) value);
        return;
      case AccountingModelPackage.ACCOUNTING_VAT_FEATURE_ID:
        getTarget().setVat((List<Vat>) value);
        return;
      case AccountingModelPackage.ACCOUNTING_VATACCOUNT_FEATURE_ID:
        getTarget().setVatAccount((BalanceAccount) value);
        return;
      case AccountingModelPackage.ACCOUNTING_REPORT_FEATURE_ID:
        getTarget().setReport((Report) value);
        return;
      case AccountingModelPackage.ACCOUNTING_JOURNALGROUP_FEATURE_ID:
        getTarget().setJournalGroup((List<JournalGroup>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case AccountingModelPackage.ACCOUNTING_ACCOUNTGROUP_FEATURE_ID:
        return getTarget().addToAccountGroup((AccountGroup) value);

      case AccountingModelPackage.ACCOUNTING_VAT_FEATURE_ID:
        return getTarget().addToVat((Vat) value);

      case AccountingModelPackage.ACCOUNTING_JOURNALGROUP_FEATURE_ID:
        return getTarget().addToJournalGroup((JournalGroup) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case AccountingModelPackage.ACCOUNTING_ACCOUNTGROUP_FEATURE_ID:
        return getTarget().removeFromAccountGroup((AccountGroup) value);

      case AccountingModelPackage.ACCOUNTING_VAT_FEATURE_ID:
        return getTarget().removeFromVat((Vat) value);

      case AccountingModelPackage.ACCOUNTING_JOURNALGROUP_FEATURE_ID:
        return getTarget().removeFromJournalGroup((JournalGroup) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Account</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AccountModelObject<E extends Account> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AccountingModelPackage.INSTANCE.getAccountEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AccountingModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.ACCOUNT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AccountingModelPackage.ACCOUNT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AccountingModelPackage.ACCOUNT_NAME_FEATURE_ID:
        return getTarget().getName();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.ACCOUNT_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AccountGroup</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AccountGroupModelObject<E extends AccountGroup> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AccountingModelPackage.INSTANCE.getAccountGroupEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AccountingModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.ACCOUNTGROUP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AccountingModelPackage.ACCOUNTGROUP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AccountingModelPackage.ACCOUNTGROUP_NAME_FEATURE_ID:
        return getTarget().getName();
      case AccountingModelPackage.ACCOUNTGROUP_ACCOUNT_FEATURE_ID:
        return getTarget().getAccount();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.ACCOUNTGROUP_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case AccountingModelPackage.ACCOUNTGROUP_ACCOUNT_FEATURE_ID:
        getTarget().setAccount((List<Account>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case AccountingModelPackage.ACCOUNTGROUP_ACCOUNT_FEATURE_ID:
        return getTarget().addToAccount((Account) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case AccountingModelPackage.ACCOUNTGROUP_ACCOUNT_FEATURE_ID:
        return getTarget().removeFromAccount((Account) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Vat</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class VatModelObject<E extends Vat> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AccountingModelPackage.INSTANCE.getVatEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AccountingModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.VAT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AccountingModelPackage.VAT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AccountingModelPackage.VAT_NAME_FEATURE_ID:
        return getTarget().getName();
      case AccountingModelPackage.VAT_RATE_FEATURE_ID:
        return getTarget().getRate();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.VAT_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case AccountingModelPackage.VAT_RATE_FEATURE_ID:
        getTarget().setRate((Float) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>BalanceAccount</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BalanceAccountModelObject<E extends BalanceAccount> extends AccountModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AccountingModelPackage.INSTANCE.getBalanceAccountEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AccountingModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.BALANCEACCOUNT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AccountingModelPackage.BALANCEACCOUNT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AccountingModelPackage.BALANCEACCOUNT_NAME_FEATURE_ID:
        return getTarget().getName();
      case AccountingModelPackage.BALANCEACCOUNT_REPORT_FEATURE_ID:
        return getTarget().getReport();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.BALANCEACCOUNT_REPORT_FEATURE_ID:
        getTarget().setReport((List<ReportGroup>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case AccountingModelPackage.BALANCEACCOUNT_REPORT_FEATURE_ID:
        return getTarget().addToReport((ReportGroup) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case AccountingModelPackage.BALANCEACCOUNT_REPORT_FEATURE_ID:
        return getTarget().removeFromReport((ReportGroup) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Report</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ReportModelObject<E extends Report> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AccountingModelPackage.INSTANCE.getReportEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AccountingModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.REPORT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AccountingModelPackage.REPORT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AccountingModelPackage.REPORT_NAME_FEATURE_ID:
        return getTarget().getName();
      case AccountingModelPackage.REPORT_DEBITREPORTGROUP_FEATURE_ID:
        return getTarget().getDebitReportGroup();
      case AccountingModelPackage.REPORT_CREDITREPORTGROUP_FEATURE_ID:
        return getTarget().getCreditReportGroup();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.REPORT_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case AccountingModelPackage.REPORT_DEBITREPORTGROUP_FEATURE_ID:
        getTarget().setDebitReportGroup((ReportGroup) value);
        return;
      case AccountingModelPackage.REPORT_CREDITREPORTGROUP_FEATURE_ID:
        getTarget().setCreditReportGroup((ReportGroup) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>JournalGroup</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class JournalGroupModelObject<E extends JournalGroup> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AccountingModelPackage.INSTANCE.getJournalGroupEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AccountingModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.JOURNALGROUP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AccountingModelPackage.JOURNALGROUP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AccountingModelPackage.JOURNALGROUP_NAME_FEATURE_ID:
        return getTarget().getName();
      case AccountingModelPackage.JOURNALGROUP_JOURNALGROUPS_FEATURE_ID:
        return getTarget().getJournalGroups();
      case AccountingModelPackage.JOURNALGROUP_JOURNALSTATEMENTS_FEATURE_ID:
        return getTarget().getJournalStatements();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.JOURNALGROUP_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case AccountingModelPackage.JOURNALGROUP_JOURNALGROUPS_FEATURE_ID:
        getTarget().setJournalGroups((List<JournalGroup>) value);
        return;
      case AccountingModelPackage.JOURNALGROUP_JOURNALSTATEMENTS_FEATURE_ID:
        getTarget().setJournalStatements((List<JournalStatement>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case AccountingModelPackage.JOURNALGROUP_JOURNALGROUPS_FEATURE_ID:
        return getTarget().addToJournalGroups((JournalGroup) value);

      case AccountingModelPackage.JOURNALGROUP_JOURNALSTATEMENTS_FEATURE_ID:
        return getTarget().addToJournalStatements((JournalStatement) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case AccountingModelPackage.JOURNALGROUP_JOURNALGROUPS_FEATURE_ID:
        return getTarget().removeFromJournalGroups((JournalGroup) value);

      case AccountingModelPackage.JOURNALGROUP_JOURNALSTATEMENTS_FEATURE_ID:
        return getTarget().removeFromJournalStatements((JournalStatement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ReportGroup</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ReportGroupModelObject<E extends ReportGroup> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AccountingModelPackage.INSTANCE.getReportGroupEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AccountingModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.REPORTGROUP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AccountingModelPackage.REPORTGROUP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AccountingModelPackage.REPORTGROUP_NAME_FEATURE_ID:
        return getTarget().getName();
      case AccountingModelPackage.REPORTGROUP_REPORTGROUP_FEATURE_ID:
        return getTarget().getReportGroup();
      case AccountingModelPackage.REPORTGROUP_ACCOUNT_FEATURE_ID:
        return getTarget().getAccount();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.REPORTGROUP_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case AccountingModelPackage.REPORTGROUP_REPORTGROUP_FEATURE_ID:
        getTarget().setReportGroup((List<ReportGroup>) value);
        return;
      case AccountingModelPackage.REPORTGROUP_ACCOUNT_FEATURE_ID:
        getTarget().setAccount((List<BalanceAccount>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case AccountingModelPackage.REPORTGROUP_REPORTGROUP_FEATURE_ID:
        return getTarget().addToReportGroup((ReportGroup) value);

      case AccountingModelPackage.REPORTGROUP_ACCOUNT_FEATURE_ID:
        return getTarget().addToAccount((BalanceAccount) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case AccountingModelPackage.REPORTGROUP_REPORTGROUP_FEATURE_ID:
        return getTarget().removeFromReportGroup((ReportGroup) value);

      case AccountingModelPackage.REPORTGROUP_ACCOUNT_FEATURE_ID:
        return getTarget().removeFromAccount((BalanceAccount) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>JournalStatement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class JournalStatementModelObject<E extends JournalStatement> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AccountingModelPackage.INSTANCE.getJournalStatementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AccountingModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.JOURNALSTATEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AccountingModelPackage.JOURNALSTATEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AccountingModelPackage.JOURNALSTATEMENT_DESCRIPTION_FEATURE_ID:
        return getTarget().getDescription();
      case AccountingModelPackage.JOURNALSTATEMENT_DATE_FEATURE_ID:
        return getTarget().getDate();
      case AccountingModelPackage.JOURNALSTATEMENT_AMOUNT_FEATURE_ID:
        return getTarget().getAmount();
      case AccountingModelPackage.JOURNALSTATEMENT_DEBITACCOUNT_FEATURE_ID:
        return getTarget().getDebitAccount();
      case AccountingModelPackage.JOURNALSTATEMENT_CREDITACCOUNT_FEATURE_ID:
        return getTarget().getCreditAccount();
      case AccountingModelPackage.JOURNALSTATEMENT_VAT_FEATURE_ID:
        return getTarget().getVat();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.JOURNALSTATEMENT_DESCRIPTION_FEATURE_ID:
        getTarget().setDescription((String) value);
        return;
      case AccountingModelPackage.JOURNALSTATEMENT_DATE_FEATURE_ID:
        getTarget().setDate((Date) value);
        return;
      case AccountingModelPackage.JOURNALSTATEMENT_AMOUNT_FEATURE_ID:
        getTarget().setAmount((Float) value);
        return;
      case AccountingModelPackage.JOURNALSTATEMENT_DEBITACCOUNT_FEATURE_ID:
        getTarget().setDebitAccount((Account) value);
        return;
      case AccountingModelPackage.JOURNALSTATEMENT_CREDITACCOUNT_FEATURE_ID:
        getTarget().setCreditAccount((Account) value);
        return;
      case AccountingModelPackage.JOURNALSTATEMENT_VAT_FEATURE_ID:
        getTarget().setVat((Vat) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>PLAccount</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PLAccountModelObject<E extends PLAccount> extends AccountModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AccountingModelPackage.INSTANCE.getPLAccountEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AccountingModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AccountingModelPackage.PLACCOUNT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AccountingModelPackage.PLACCOUNT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AccountingModelPackage.PLACCOUNT_NAME_FEATURE_ID:
        return getTarget().getName();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }
}