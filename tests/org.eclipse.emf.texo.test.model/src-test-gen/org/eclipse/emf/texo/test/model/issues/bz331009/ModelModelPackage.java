package org.eclipse.emf.texo.test.model.issues.bz331009;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.AddressDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.CarDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.CarModelDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.CarPassportDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.CarProducerDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.CarRegInfoDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.ClientTariffDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.ContractDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.ContractPackageDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.CoordinatesDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.DocumentDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.DrivingLicenseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.EventDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.MessageDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.OneTimePaymentDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.PassportDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.PaymentInfoDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.PaymentItemDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.PeriodicalPaymentDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.PersonDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.PhoneDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.PriceDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.SecretQuestionDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.ServiceDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.SimCardDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.SimCardXSimContractDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.SimContractDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.SimTariffDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.TariffDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.UnitsDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.UserDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.UserGroupDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.dao.VolumePaymentDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>model</b></em>'. It contains initialization code and access to the Factory
 * to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ModelModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz331009";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final ModelModelFactory MODELFACTORY = new ModelModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CURRENCY_CLASSIFIER_ID = 34;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PAYMENTTYPE_CLASSIFIER_ID = 33;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERIODICITY_CLASSIFIER_ID = 35;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SECRETQUESTIONTYPE_CLASSIFIER_ID = 37;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MESSAGETYPE_CLASSIFIER_ID = 39;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EVENTTYPE_CLASSIFIER_ID = 40;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PHONETYPE_CLASSIFIER_ID = 36;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MESSAGEIOTYPES_CLASSIFIER_ID = 38;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCARD_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCARD_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCARD_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCARD_PHONENUMBER_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCARD_NUMBER_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCONTRACT_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCONTRACT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCONTRACT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCONTRACT_CONTRACTNUMBER_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCONTRACT_NAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCONTRACT_DESCRITPION_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCONTRACT_PAYMENTINFO_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PAYMENTINFO_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PAYMENTINFO_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PAYMENTINFO_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PAYMENTINFO_TARIFF_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PAYMENTINFO_FACTPAYMENTS_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCARDXSIMCONTRACT_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCARDXSIMCONTRACT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCARDXSIMCONTRACT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCARDXSIMCONTRACT_SIMCARD_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMCARDXSIMCONTRACT_SIMCONTRACT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMTARIFF_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMTARIFF_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMTARIFF_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMTARIFF_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMTARIFF_ACTIVE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMTARIFF_VOLUMEPAYMENTS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMTARIFF_PERIODICALPAYMENTS_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMTARIFF_INITIALPAYMENT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMTARIFF_SERVICES_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TARIFF_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TARIFF_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TARIFF_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TARIFF_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TARIFF_ACTIVE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TARIFF_VOLUMEPAYMENTS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TARIFF_PERIODICALPAYMENTS_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TARIFF_INITIALPAYMENT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TARIFF_SERVICES_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PAYMENTITEM_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PAYMENTITEM_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PAYMENTITEM_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PAYMENTITEM_SUM_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PAYMENTITEM_CURRENCY_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PAYMENTITEM_DATE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PAYMENTITEM_DESCRIPTION_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PAYMENTITEM_PAYMENTTYPE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VOLUMEPAYMENT_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VOLUMEPAYMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VOLUMEPAYMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VOLUMEPAYMENT_SUM_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VOLUMEPAYMENT_CURRENCY_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VOLUMEPAYMENT_DATE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VOLUMEPAYMENT_DESCRIPTION_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VOLUMEPAYMENT_PAYMENTTYPE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VOLUMEPAYMENT_VOLUME_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VOLUMEPAYMENT_UNIT_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VOLUMEPAYMENT_PRICE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERIODICALPAYMENT_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERIODICALPAYMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERIODICALPAYMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERIODICALPAYMENT_SUM_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERIODICALPAYMENT_CURRENCY_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERIODICALPAYMENT_DATE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERIODICALPAYMENT_DESCRIPTION_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERIODICALPAYMENT_PAYMENTTYPE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERIODICALPAYMENT_PERIODICITY_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ONETIMEPAYMENT_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ONETIMEPAYMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ONETIMEPAYMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ONETIMEPAYMENT_SUM_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ONETIMEPAYMENT_CURRENCY_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ONETIMEPAYMENT_DATE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ONETIMEPAYMENT_DESCRIPTION_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ONETIMEPAYMENT_PAYMENTTYPE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SERVICE_CLASSIFIER_ID = 24;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SERVICE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SERVICE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SERVICE_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SERVICE_ACTIVE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SERVICE_INITIALPAYMENT_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SERVICE_PERIODICALPAYMENT_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SERVICE_VOLUMEPAYMENT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNITS_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNITS_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNITS_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNITS_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICE_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARPRODUCER_CLASSIFIER_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARPRODUCER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARPRODUCER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARPRODUCER_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARMODEL_CLASSIFIER_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARMODEL_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARMODEL_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARMODEL_PRODUCER_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARMODEL_NAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARREGINFO_CLASSIFIER_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARREGINFO_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARREGINFO_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARREGINFO_OWNER_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARREGINFO_REGNUMBER_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARREGINFO_VIN_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARREGINFO_RELEASEYEAR_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARREGINFO_ENGINENUMBER_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARREGINFO_CHASSISNUMBER_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARREGINFO_BODYNUMBER_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARREGINFO_COLOR_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARREGINFO_SERIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARREGINFO_NUMBER_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARREGINFO_ISSUEDATE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARREGINFO_ISSUED_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENT_CLASSIFIER_ID = 27;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENT_SERIES_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENT_NUMBER_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENT_ISSUEDATE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENT_ISSUED_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_CLASSIFIER_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_SURNAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_NAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_PATRONIMIC_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_BIRTHDAY_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_REGISTRATIONADDRESS_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_FACTADDRESS_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_PASSPORT_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_DRIVINGLICENSE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PERSON_PHONES_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CAR_CLASSIFIER_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CAR_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CAR_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CAR_MODEL_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CAR_REGINFO_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CAR_CARPASSPORT_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARPASSPORT_CLASSIFIER_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARPASSPORT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARPASSPORT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARPASSPORT_SERIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARPASSPORT_NUMBER_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARPASSPORT_ISSUEDATE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CARPASSPORT_ISSUED_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PHONE_CLASSIFIER_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PHONE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PHONE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PHONE_NUMBER_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PHONE_DESCRIPTION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_CLASSIFIER_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_ZIPCODE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_COUNTRY_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_REGION_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_CITY_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_STREET_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_BUILDING_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESS_FLAT_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PASSPORT_CLASSIFIER_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PASSPORT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PASSPORT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PASSPORT_SERIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PASSPORT_NUMBER_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PASSPORT_ISSUEDATE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PASSPORT_ISSUED_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DRIVINGLICENSE_CLASSIFIER_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DRIVINGLICENSE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DRIVINGLICENSE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DRIVINGLICENSE_SERIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DRIVINGLICENSE_NUMBER_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DRIVINGLICENSE_ISSUEDATE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DRIVINGLICENSE_ISSUED_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTRACT_CLASSIFIER_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTRACT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTRACT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTRACT_SIGNDATE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTRACT_SIMCARD_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTRACT_PAYMENTINFO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTRACT_CAR_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTRACT_SECRETQUESTIONS_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTRACT_NUMBER_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SECRETQUESTION_CLASSIFIER_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SECRETQUESTION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SECRETQUESTION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SECRETQUESTION_QUESTION_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SECRETQUESTION_CORRECTANSWER_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SECRETQUESTION_ALARMANSWER_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SECRETQUESTION_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SECRETQUESTION_TYPE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLIENTTARIFF_CLASSIFIER_ID = 25;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLIENTTARIFF_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLIENTTARIFF_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLIENTTARIFF_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLIENTTARIFF_ACTIVE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLIENTTARIFF_VOLUMEPAYMENTS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLIENTTARIFF_PERIODICALPAYMENTS_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLIENTTARIFF_INITIALPAYMENT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLIENTTARIFF_SERVICES_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTRACTPACKAGE_CLASSIFIER_ID = 26;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTRACTPACKAGE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTRACTPACKAGE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTRACTPACKAGE_CLIENT_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTRACTPACKAGE_USER_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTRACTPACKAGE_CONTRACTS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USER_CLASSIFIER_ID = 28;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USER_LOGIN_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USER_PASSWORD_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USER_GROUP_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USERGROUP_CLASSIFIER_ID = 29;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USERGROUP_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USERGROUP_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MESSAGE_CLASSIFIER_ID = 30;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MESSAGE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MESSAGE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MESSAGE_TEXT_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MESSAGE_TYPE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MESSAGE_FROM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MESSAGE_TO_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MESSAGE_DATETIME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EVENT_CLASSIFIER_ID = 31;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EVENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EVENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EVENT_EVENTTYPE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EVENT_MESSAGE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EVENT_COORDINATES_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COORDINATES_CLASSIFIER_ID = 32;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COORDINATES_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COORDINATES_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COORDINATES_X_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COORDINATES_Y_FEATURE_ID = 3;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final ModelModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static ModelModelPackage initialize() {

    if (isInitialized) {
      return (ModelModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final ModelModelPackage modelPackage = new ModelModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(SimCard.class, modelPackage.getSimCardEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SimContract.class, modelPackage.getSimContractEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PaymentInfo.class, modelPackage.getPaymentInfoEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SimCardXSimContract.class,
        modelPackage.getSimCardXSimContractEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SimTariff.class, modelPackage.getSimTariffEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Tariff.class, modelPackage.getTariffEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PaymentItem.class, modelPackage.getPaymentItemEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(VolumePayment.class, modelPackage.getVolumePaymentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PeriodicalPayment.class,
        modelPackage.getPeriodicalPaymentEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(OneTimePayment.class, modelPackage.getOneTimePaymentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Service.class, modelPackage.getServiceEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Units.class, modelPackage.getUnitsEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Price.class, modelPackage.getPriceEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CarProducer.class, modelPackage.getCarProducerEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CarModel.class, modelPackage.getCarModelEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CarRegInfo.class, modelPackage.getCarRegInfoEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Document.class, modelPackage.getDocumentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Person.class, modelPackage.getPersonEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Car.class, modelPackage.getCarEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CarPassport.class, modelPackage.getCarPassportEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Phone.class, modelPackage.getPhoneEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Address.class, modelPackage.getAddressEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Passport.class, modelPackage.getPassportEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DrivingLicense.class, modelPackage.getDrivingLicenseEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Contract.class, modelPackage.getContractEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SecretQuestion.class, modelPackage.getSecretQuestionEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ClientTariff.class, modelPackage.getClientTariffEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ContractPackage.class,
        modelPackage.getContractPackageEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(User.class, modelPackage.getUserEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UserGroup.class, modelPackage.getUserGroupEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Message.class, modelPackage.getMessageEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Event.class, modelPackage.getEventEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Coordinates.class, modelPackage.getCoordinatesEClass(),
        modelPackage);

    ModelResolver.getInstance()
        .registerClassModelMapping(Currency.class, modelPackage.getCurrencyEEnum(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PaymentType.class, modelPackage.getPaymentTypeEEnum(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Periodicity.class, modelPackage.getPeriodicityEEnum(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SecretQuestionType.class,
        modelPackage.getSecretQuestionTypeEEnum(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(MessageType.class, modelPackage.getMessageTypeEEnum(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(EventType.class, modelPackage.getEventTypeEEnum(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PhoneType.class, modelPackage.getPhoneTypeEEnum(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(MessageIOTypes.class, modelPackage.getMessageIOTypesEEnum(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(SimCard.class, SimCardDao.class);
    DaoRegistry.getInstance().registerDao(SimContract.class, SimContractDao.class);
    DaoRegistry.getInstance().registerDao(PaymentInfo.class, PaymentInfoDao.class);
    DaoRegistry.getInstance().registerDao(SimCardXSimContract.class, SimCardXSimContractDao.class);
    DaoRegistry.getInstance().registerDao(SimTariff.class, SimTariffDao.class);
    DaoRegistry.getInstance().registerDao(Tariff.class, TariffDao.class);
    DaoRegistry.getInstance().registerDao(PaymentItem.class, PaymentItemDao.class);
    DaoRegistry.getInstance().registerDao(VolumePayment.class, VolumePaymentDao.class);
    DaoRegistry.getInstance().registerDao(PeriodicalPayment.class, PeriodicalPaymentDao.class);
    DaoRegistry.getInstance().registerDao(OneTimePayment.class, OneTimePaymentDao.class);
    DaoRegistry.getInstance().registerDao(Service.class, ServiceDao.class);
    DaoRegistry.getInstance().registerDao(Units.class, UnitsDao.class);
    DaoRegistry.getInstance().registerDao(Price.class, PriceDao.class);
    DaoRegistry.getInstance().registerDao(CarProducer.class, CarProducerDao.class);
    DaoRegistry.getInstance().registerDao(CarModel.class, CarModelDao.class);
    DaoRegistry.getInstance().registerDao(CarRegInfo.class, CarRegInfoDao.class);
    DaoRegistry.getInstance().registerDao(Document.class, DocumentDao.class);
    DaoRegistry.getInstance().registerDao(Person.class, PersonDao.class);
    DaoRegistry.getInstance().registerDao(Car.class, CarDao.class);
    DaoRegistry.getInstance().registerDao(CarPassport.class, CarPassportDao.class);
    DaoRegistry.getInstance().registerDao(Phone.class, PhoneDao.class);
    DaoRegistry.getInstance().registerDao(Address.class, AddressDao.class);
    DaoRegistry.getInstance().registerDao(Passport.class, PassportDao.class);
    DaoRegistry.getInstance().registerDao(DrivingLicense.class, DrivingLicenseDao.class);
    DaoRegistry.getInstance().registerDao(Contract.class, ContractDao.class);
    DaoRegistry.getInstance().registerDao(SecretQuestion.class, SecretQuestionDao.class);
    DaoRegistry.getInstance().registerDao(ClientTariff.class, ClientTariffDao.class);
    DaoRegistry.getInstance().registerDao(ContractPackage.class, ContractPackageDao.class);
    DaoRegistry.getInstance().registerDao(User.class, UserDao.class);
    DaoRegistry.getInstance().registerDao(UserGroup.class, UserGroupDao.class);
    DaoRegistry.getInstance().registerDao(Message.class, MessageDao.class);
    DaoRegistry.getInstance().registerDao(Event.class, EventDao.class);
    DaoRegistry.getInstance().registerDao(Coordinates.class, CoordinatesDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link ModelModelFactory} instance.
   * @generated
   */
  @Override
  public ModelModelFactory getModelFactory() {
    return MODELFACTORY;
  }

  /**
   * Returns the nsUri of the {@link EPackage} managed by this Package instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return the nsUri of the EPackage
   * @generated
   */
  @Override
  public String getNsURI() {
    return NS_URI;
  }

  /**
   * Returns the name of the ecore file containing the ecore model of the {@link EPackage} managed here. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the name of the ecore file
   * @generated
   */
  @Override
  public String getEcoreFileName() {
    return "model.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>SimCard</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SimCard</b></em>'
   * @generated
   */
  public EClass getSimCardEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SIMCARD_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimCard.phoneNumber</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimCard.phoneNumber</b></em>'.
   * @generated
   */
  public EAttribute getSimCard_PhoneNumber() {
    return (EAttribute) getSimCardEClass().getEAllStructuralFeatures().get(SIMCARD_PHONENUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimCard.number</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimCard.number</b></em>'.
   * @generated
   */
  public EAttribute getSimCard_Number() {
    return (EAttribute) getSimCardEClass().getEAllStructuralFeatures().get(SIMCARD_NUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SimContract</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SimContract</b></em>'
   * @generated
   */
  public EClass getSimContractEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SIMCONTRACT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimContract.contractNumber</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimContract.contractNumber</b></em>'.
   * @generated
   */
  public EAttribute getSimContract_ContractNumber() {
    return (EAttribute) getSimContractEClass().getEAllStructuralFeatures().get(SIMCONTRACT_CONTRACTNUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimContract.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimContract.name</b></em>'.
   * @generated
   */
  public EAttribute getSimContract_Name() {
    return (EAttribute) getSimContractEClass().getEAllStructuralFeatures().get(SIMCONTRACT_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimContract.descritpion</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimContract.descritpion</b></em>'.
   * @generated
   */
  public EAttribute getSimContract_Descritpion() {
    return (EAttribute) getSimContractEClass().getEAllStructuralFeatures().get(SIMCONTRACT_DESCRITPION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimContract.paymentInfo</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimContract.paymentInfo</b></em>'.
   * @generated
   */
  public EReference getSimContract_PaymentInfo() {
    return (EReference) getSimContractEClass().getEAllStructuralFeatures().get(SIMCONTRACT_PAYMENTINFO_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PaymentInfo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PaymentInfo</b></em>'
   * @generated
   */
  public EClass getPaymentInfoEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PAYMENTINFO_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PaymentInfo.tariff</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PaymentInfo.tariff</b></em>'.
   * @generated
   */
  public EReference getPaymentInfo_Tariff() {
    return (EReference) getPaymentInfoEClass().getEAllStructuralFeatures().get(PAYMENTINFO_TARIFF_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PaymentInfo.factPayments</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PaymentInfo.factPayments</b></em>'.
   * @generated
   */
  public EReference getPaymentInfo_FactPayments() {
    return (EReference) getPaymentInfoEClass().getEAllStructuralFeatures().get(PAYMENTINFO_FACTPAYMENTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SimCardXSimContract</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SimCardXSimContract</b></em>'
   * @generated
   */
  public EClass getSimCardXSimContractEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SIMCARDXSIMCONTRACT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimCardXSimContract.simCard</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimCardXSimContract.simCard</b></em>'.
   * @generated
   */
  public EReference getSimCardXSimContract_SimCard() {
    return (EReference) getSimCardXSimContractEClass().getEAllStructuralFeatures().get(
        SIMCARDXSIMCONTRACT_SIMCARD_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimCardXSimContract.simContract</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimCardXSimContract.simContract</b></em>'.
   * @generated
   */
  public EReference getSimCardXSimContract_SimContract() {
    return (EReference) getSimCardXSimContractEClass().getEAllStructuralFeatures().get(
        SIMCARDXSIMCONTRACT_SIMCONTRACT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SimTariff</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SimTariff</b></em>'
   * @generated
   */
  public EClass getSimTariffEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SIMTARIFF_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Tariff</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Tariff</b></em>'
   * @generated
   */
  public EClass getTariffEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TARIFF_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Tariff.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Tariff.name</b></em>'.
   * @generated
   */
  public EAttribute getTariff_Name() {
    return (EAttribute) getTariffEClass().getEAllStructuralFeatures().get(TARIFF_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Tariff.active</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Tariff.active</b></em>'.
   * @generated
   */
  public EAttribute getTariff_Active() {
    return (EAttribute) getTariffEClass().getEAllStructuralFeatures().get(TARIFF_ACTIVE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Tariff.volumePayments</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Tariff.volumePayments</b></em>'.
   * @generated
   */
  public EReference getTariff_VolumePayments() {
    return (EReference) getTariffEClass().getEAllStructuralFeatures().get(TARIFF_VOLUMEPAYMENTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Tariff.periodicalPayments</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Tariff.periodicalPayments</b></em>'.
   * @generated
   */
  public EReference getTariff_PeriodicalPayments() {
    return (EReference) getTariffEClass().getEAllStructuralFeatures().get(TARIFF_PERIODICALPAYMENTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Tariff.initialPayment</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Tariff.initialPayment</b></em>'.
   * @generated
   */
  public EReference getTariff_InitialPayment() {
    return (EReference) getTariffEClass().getEAllStructuralFeatures().get(TARIFF_INITIALPAYMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Tariff.services</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Tariff.services</b></em>'.
   * @generated
   */
  public EReference getTariff_Services() {
    return (EReference) getTariffEClass().getEAllStructuralFeatures().get(TARIFF_SERVICES_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PaymentItem</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PaymentItem</b></em>'
   * @generated
   */
  public EClass getPaymentItemEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PAYMENTITEM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PaymentItem.sum</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PaymentItem.sum</b></em>'.
   * @generated
   */
  public EAttribute getPaymentItem_Sum() {
    return (EAttribute) getPaymentItemEClass().getEAllStructuralFeatures().get(PAYMENTITEM_SUM_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PaymentItem.currency</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PaymentItem.currency</b></em>'.
   * @generated
   */
  public EAttribute getPaymentItem_Currency() {
    return (EAttribute) getPaymentItemEClass().getEAllStructuralFeatures().get(PAYMENTITEM_CURRENCY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PaymentItem.date</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PaymentItem.date</b></em>'.
   * @generated
   */
  public EAttribute getPaymentItem_Date() {
    return (EAttribute) getPaymentItemEClass().getEAllStructuralFeatures().get(PAYMENTITEM_DATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PaymentItem.description</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PaymentItem.description</b></em>'.
   * @generated
   */
  public EAttribute getPaymentItem_Description() {
    return (EAttribute) getPaymentItemEClass().getEAllStructuralFeatures().get(PAYMENTITEM_DESCRIPTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PaymentItem.paymentType</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PaymentItem.paymentType</b></em>'.
   * @generated
   */
  public EAttribute getPaymentItem_PaymentType() {
    return (EAttribute) getPaymentItemEClass().getEAllStructuralFeatures().get(PAYMENTITEM_PAYMENTTYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>VolumePayment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>VolumePayment</b></em>'
   * @generated
   */
  public EClass getVolumePaymentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(VOLUMEPAYMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>VolumePayment.volume</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>VolumePayment.volume</b></em>'.
   * @generated
   */
  public EAttribute getVolumePayment_Volume() {
    return (EAttribute) getVolumePaymentEClass().getEAllStructuralFeatures().get(VOLUMEPAYMENT_VOLUME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>VolumePayment.unit</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>VolumePayment.unit</b></em>'.
   * @generated
   */
  public EReference getVolumePayment_Unit() {
    return (EReference) getVolumePaymentEClass().getEAllStructuralFeatures().get(VOLUMEPAYMENT_UNIT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>VolumePayment.price</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>VolumePayment.price</b></em>'.
   * @generated
   */
  public EAttribute getVolumePayment_Price() {
    return (EAttribute) getVolumePaymentEClass().getEAllStructuralFeatures().get(VOLUMEPAYMENT_PRICE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PeriodicalPayment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PeriodicalPayment</b></em>'
   * @generated
   */
  public EClass getPeriodicalPaymentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PERIODICALPAYMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PeriodicalPayment.periodicity</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PeriodicalPayment.periodicity</b></em>'.
   * @generated
   */
  public EAttribute getPeriodicalPayment_Periodicity() {
    return (EAttribute) getPeriodicalPaymentEClass().getEAllStructuralFeatures().get(
        PERIODICALPAYMENT_PERIODICITY_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>OneTimePayment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>OneTimePayment</b></em>'
   * @generated
   */
  public EClass getOneTimePaymentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ONETIMEPAYMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Service</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Service</b></em>'
   * @generated
   */
  public EClass getServiceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SERVICE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Service.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Service.name</b></em>'.
   * @generated
   */
  public EAttribute getService_Name() {
    return (EAttribute) getServiceEClass().getEAllStructuralFeatures().get(SERVICE_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Service.active</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Service.active</b></em>'.
   * @generated
   */
  public EAttribute getService_Active() {
    return (EAttribute) getServiceEClass().getEAllStructuralFeatures().get(SERVICE_ACTIVE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Service.initialPayment</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Service.initialPayment</b></em>'.
   * @generated
   */
  public EReference getService_InitialPayment() {
    return (EReference) getServiceEClass().getEAllStructuralFeatures().get(SERVICE_INITIALPAYMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Service.periodicalPayment</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Service.periodicalPayment</b></em>'.
   * @generated
   */
  public EReference getService_PeriodicalPayment() {
    return (EReference) getServiceEClass().getEAllStructuralFeatures().get(SERVICE_PERIODICALPAYMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Service.volumePayment</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Service.volumePayment</b></em>'.
   * @generated
   */
  public EReference getService_VolumePayment() {
    return (EReference) getServiceEClass().getEAllStructuralFeatures().get(SERVICE_VOLUMEPAYMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Units</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Units</b></em>'
   * @generated
   */
  public EClass getUnitsEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UNITS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Units.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Units.name</b></em>'.
   * @generated
   */
  public EAttribute getUnits_Name() {
    return (EAttribute) getUnitsEClass().getEAllStructuralFeatures().get(UNITS_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Price</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Price</b></em>'
   * @generated
   */
  public EClass getPriceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PRICE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CarProducer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CarProducer</b></em>'
   * @generated
   */
  public EClass getCarProducerEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CARPRODUCER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarProducer.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarProducer.name</b></em>'.
   * @generated
   */
  public EAttribute getCarProducer_Name() {
    return (EAttribute) getCarProducerEClass().getEAllStructuralFeatures().get(CARPRODUCER_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CarModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CarModel</b></em>'
   * @generated
   */
  public EClass getCarModelEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CARMODEL_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarModel.producer</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarModel.producer</b></em>'.
   * @generated
   */
  public EReference getCarModel_Producer() {
    return (EReference) getCarModelEClass().getEAllStructuralFeatures().get(CARMODEL_PRODUCER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarModel.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarModel.name</b></em>'.
   * @generated
   */
  public EAttribute getCarModel_Name() {
    return (EAttribute) getCarModelEClass().getEAllStructuralFeatures().get(CARMODEL_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CarRegInfo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CarRegInfo</b></em>'
   * @generated
   */
  public EClass getCarRegInfoEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CARREGINFO_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarRegInfo.owner</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarRegInfo.owner</b></em>'.
   * @generated
   */
  public EReference getCarRegInfo_Owner() {
    return (EReference) getCarRegInfoEClass().getEAllStructuralFeatures().get(CARREGINFO_OWNER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarRegInfo.regNumber</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarRegInfo.regNumber</b></em>'.
   * @generated
   */
  public EAttribute getCarRegInfo_RegNumber() {
    return (EAttribute) getCarRegInfoEClass().getEAllStructuralFeatures().get(CARREGINFO_REGNUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarRegInfo.vin</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarRegInfo.vin</b></em>'.
   * @generated
   */
  public EAttribute getCarRegInfo_Vin() {
    return (EAttribute) getCarRegInfoEClass().getEAllStructuralFeatures().get(CARREGINFO_VIN_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarRegInfo.releaseYear</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarRegInfo.releaseYear</b></em>'.
   * @generated
   */
  public EAttribute getCarRegInfo_ReleaseYear() {
    return (EAttribute) getCarRegInfoEClass().getEAllStructuralFeatures().get(CARREGINFO_RELEASEYEAR_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarRegInfo.engineNumber</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarRegInfo.engineNumber</b></em>'.
   * @generated
   */
  public EAttribute getCarRegInfo_EngineNumber() {
    return (EAttribute) getCarRegInfoEClass().getEAllStructuralFeatures().get(CARREGINFO_ENGINENUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarRegInfo.chassisNumber</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarRegInfo.chassisNumber</b></em>'.
   * @generated
   */
  public EAttribute getCarRegInfo_ChassisNumber() {
    return (EAttribute) getCarRegInfoEClass().getEAllStructuralFeatures().get(CARREGINFO_CHASSISNUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarRegInfo.bodyNumber</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarRegInfo.bodyNumber</b></em>'.
   * @generated
   */
  public EAttribute getCarRegInfo_BodyNumber() {
    return (EAttribute) getCarRegInfoEClass().getEAllStructuralFeatures().get(CARREGINFO_BODYNUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarRegInfo.color</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarRegInfo.color</b></em>'.
   * @generated
   */
  public EAttribute getCarRegInfo_Color() {
    return (EAttribute) getCarRegInfoEClass().getEAllStructuralFeatures().get(CARREGINFO_COLOR_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarRegInfo.series</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarRegInfo.series</b></em>'.
   * @generated
   */
  public EAttribute getCarRegInfo_Series() {
    return (EAttribute) getCarRegInfoEClass().getEAllStructuralFeatures().get(CARREGINFO_SERIES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarRegInfo.number</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarRegInfo.number</b></em>'.
   * @generated
   */
  public EAttribute getCarRegInfo_Number() {
    return (EAttribute) getCarRegInfoEClass().getEAllStructuralFeatures().get(CARREGINFO_NUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarRegInfo.issueDate</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarRegInfo.issueDate</b></em>'.
   * @generated
   */
  public EAttribute getCarRegInfo_IssueDate() {
    return (EAttribute) getCarRegInfoEClass().getEAllStructuralFeatures().get(CARREGINFO_ISSUEDATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarRegInfo.issued</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarRegInfo.issued</b></em>'.
   * @generated
   */
  public EAttribute getCarRegInfo_Issued() {
    return (EAttribute) getCarRegInfoEClass().getEAllStructuralFeatures().get(CARREGINFO_ISSUED_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Document</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Document</b></em>'
   * @generated
   */
  public EClass getDocumentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DOCUMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Document.series</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Document.series</b></em>'.
   * @generated
   */
  public EAttribute getDocument_Series() {
    return (EAttribute) getDocumentEClass().getEAllStructuralFeatures().get(DOCUMENT_SERIES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Document.number</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Document.number</b></em>'.
   * @generated
   */
  public EAttribute getDocument_Number() {
    return (EAttribute) getDocumentEClass().getEAllStructuralFeatures().get(DOCUMENT_NUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Document.issueDate</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Document.issueDate</b></em>'.
   * @generated
   */
  public EAttribute getDocument_IssueDate() {
    return (EAttribute) getDocumentEClass().getEAllStructuralFeatures().get(DOCUMENT_ISSUEDATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Document.issued</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Document.issued</b></em>'.
   * @generated
   */
  public EAttribute getDocument_Issued() {
    return (EAttribute) getDocumentEClass().getEAllStructuralFeatures().get(DOCUMENT_ISSUED_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Person</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Person</b></em>'
   * @generated
   */
  public EClass getPersonEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PERSON_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Person.surname</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Person.surname</b></em>'.
   * @generated
   */
  public EAttribute getPerson_Surname() {
    return (EAttribute) getPersonEClass().getEAllStructuralFeatures().get(PERSON_SURNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Person.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Person.name</b></em>'.
   * @generated
   */
  public EAttribute getPerson_Name() {
    return (EAttribute) getPersonEClass().getEAllStructuralFeatures().get(PERSON_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Person.patronimic</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Person.patronimic</b></em>'.
   * @generated
   */
  public EAttribute getPerson_Patronimic() {
    return (EAttribute) getPersonEClass().getEAllStructuralFeatures().get(PERSON_PATRONIMIC_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Person.birthday</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Person.birthday</b></em>'.
   * @generated
   */
  public EAttribute getPerson_Birthday() {
    return (EAttribute) getPersonEClass().getEAllStructuralFeatures().get(PERSON_BIRTHDAY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Person.registrationAddress</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Person.registrationAddress</b></em>'.
   * @generated
   */
  public EReference getPerson_RegistrationAddress() {
    return (EReference) getPersonEClass().getEAllStructuralFeatures().get(PERSON_REGISTRATIONADDRESS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Person.factAddress</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Person.factAddress</b></em>'.
   * @generated
   */
  public EReference getPerson_FactAddress() {
    return (EReference) getPersonEClass().getEAllStructuralFeatures().get(PERSON_FACTADDRESS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Person.passport</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Person.passport</b></em>'.
   * @generated
   */
  public EReference getPerson_Passport() {
    return (EReference) getPersonEClass().getEAllStructuralFeatures().get(PERSON_PASSPORT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Person.drivingLicense</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Person.drivingLicense</b></em>'.
   * @generated
   */
  public EReference getPerson_DrivingLicense() {
    return (EReference) getPersonEClass().getEAllStructuralFeatures().get(PERSON_DRIVINGLICENSE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Person.phones</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Person.phones</b></em>'.
   * @generated
   */
  public EReference getPerson_Phones() {
    return (EReference) getPersonEClass().getEAllStructuralFeatures().get(PERSON_PHONES_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Car</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Car</b></em>'
   * @generated
   */
  public EClass getCarEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CAR_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Car.model</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Car.model</b></em>'.
   * @generated
   */
  public EReference getCar_Model() {
    return (EReference) getCarEClass().getEAllStructuralFeatures().get(CAR_MODEL_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Car.regInfo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Car.regInfo</b></em>'.
   * @generated
   */
  public EReference getCar_RegInfo() {
    return (EReference) getCarEClass().getEAllStructuralFeatures().get(CAR_REGINFO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Car.carPassport</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Car.carPassport</b></em>'.
   * @generated
   */
  public EReference getCar_CarPassport() {
    return (EReference) getCarEClass().getEAllStructuralFeatures().get(CAR_CARPASSPORT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CarPassport</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CarPassport</b></em>'
   * @generated
   */
  public EClass getCarPassportEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CARPASSPORT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarPassport.series</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarPassport.series</b></em>'.
   * @generated
   */
  public EAttribute getCarPassport_Series() {
    return (EAttribute) getCarPassportEClass().getEAllStructuralFeatures().get(CARPASSPORT_SERIES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarPassport.number</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarPassport.number</b></em>'.
   * @generated
   */
  public EAttribute getCarPassport_Number() {
    return (EAttribute) getCarPassportEClass().getEAllStructuralFeatures().get(CARPASSPORT_NUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarPassport.issueDate</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarPassport.issueDate</b></em>'.
   * @generated
   */
  public EAttribute getCarPassport_IssueDate() {
    return (EAttribute) getCarPassportEClass().getEAllStructuralFeatures().get(CARPASSPORT_ISSUEDATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CarPassport.issued</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CarPassport.issued</b></em>'.
   * @generated
   */
  public EAttribute getCarPassport_Issued() {
    return (EAttribute) getCarPassportEClass().getEAllStructuralFeatures().get(CARPASSPORT_ISSUED_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Phone</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Phone</b></em>'
   * @generated
   */
  public EClass getPhoneEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PHONE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Phone.number</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Phone.number</b></em>'.
   * @generated
   */
  public EAttribute getPhone_Number() {
    return (EAttribute) getPhoneEClass().getEAllStructuralFeatures().get(PHONE_NUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Phone.description</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Phone.description</b></em>'.
   * @generated
   */
  public EAttribute getPhone_Description() {
    return (EAttribute) getPhoneEClass().getEAllStructuralFeatures().get(PHONE_DESCRIPTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Address</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Address</b></em>'
   * @generated
   */
  public EClass getAddressEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ADDRESS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Address.zipCode</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Address.zipCode</b></em>'.
   * @generated
   */
  public EAttribute getAddress_ZipCode() {
    return (EAttribute) getAddressEClass().getEAllStructuralFeatures().get(ADDRESS_ZIPCODE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Address.country</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Address.country</b></em>'.
   * @generated
   */
  public EAttribute getAddress_Country() {
    return (EAttribute) getAddressEClass().getEAllStructuralFeatures().get(ADDRESS_COUNTRY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Address.region</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Address.region</b></em>'.
   * @generated
   */
  public EAttribute getAddress_Region() {
    return (EAttribute) getAddressEClass().getEAllStructuralFeatures().get(ADDRESS_REGION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Address.city</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Address.city</b></em>'.
   * @generated
   */
  public EAttribute getAddress_City() {
    return (EAttribute) getAddressEClass().getEAllStructuralFeatures().get(ADDRESS_CITY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Address.street</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Address.street</b></em>'.
   * @generated
   */
  public EAttribute getAddress_Street() {
    return (EAttribute) getAddressEClass().getEAllStructuralFeatures().get(ADDRESS_STREET_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Address.building</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Address.building</b></em>'.
   * @generated
   */
  public EAttribute getAddress_Building() {
    return (EAttribute) getAddressEClass().getEAllStructuralFeatures().get(ADDRESS_BUILDING_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Address.flat</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Address.flat</b></em>'.
   * @generated
   */
  public EAttribute getAddress_Flat() {
    return (EAttribute) getAddressEClass().getEAllStructuralFeatures().get(ADDRESS_FLAT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Passport</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Passport</b></em>'
   * @generated
   */
  public EClass getPassportEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PASSPORT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Passport.series</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Passport.series</b></em>'.
   * @generated
   */
  public EAttribute getPassport_Series() {
    return (EAttribute) getPassportEClass().getEAllStructuralFeatures().get(PASSPORT_SERIES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Passport.number</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Passport.number</b></em>'.
   * @generated
   */
  public EAttribute getPassport_Number() {
    return (EAttribute) getPassportEClass().getEAllStructuralFeatures().get(PASSPORT_NUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Passport.issueDate</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Passport.issueDate</b></em>'.
   * @generated
   */
  public EAttribute getPassport_IssueDate() {
    return (EAttribute) getPassportEClass().getEAllStructuralFeatures().get(PASSPORT_ISSUEDATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Passport.issued</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Passport.issued</b></em>'.
   * @generated
   */
  public EAttribute getPassport_Issued() {
    return (EAttribute) getPassportEClass().getEAllStructuralFeatures().get(PASSPORT_ISSUED_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DrivingLicense</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DrivingLicense</b></em>'
   * @generated
   */
  public EClass getDrivingLicenseEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DRIVINGLICENSE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DrivingLicense.series</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DrivingLicense.series</b></em>'.
   * @generated
   */
  public EAttribute getDrivingLicense_Series() {
    return (EAttribute) getDrivingLicenseEClass().getEAllStructuralFeatures().get(DRIVINGLICENSE_SERIES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DrivingLicense.number</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DrivingLicense.number</b></em>'.
   * @generated
   */
  public EAttribute getDrivingLicense_Number() {
    return (EAttribute) getDrivingLicenseEClass().getEAllStructuralFeatures().get(DRIVINGLICENSE_NUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DrivingLicense.issueDate</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DrivingLicense.issueDate</b></em>'.
   * @generated
   */
  public EAttribute getDrivingLicense_IssueDate() {
    return (EAttribute) getDrivingLicenseEClass().getEAllStructuralFeatures().get(DRIVINGLICENSE_ISSUEDATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DrivingLicense.issued</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DrivingLicense.issued</b></em>'.
   * @generated
   */
  public EAttribute getDrivingLicense_Issued() {
    return (EAttribute) getDrivingLicenseEClass().getEAllStructuralFeatures().get(DRIVINGLICENSE_ISSUED_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Contract</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Contract</b></em>'
   * @generated
   */
  public EClass getContractEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONTRACT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Contract.signDate</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Contract.signDate</b></em>'.
   * @generated
   */
  public EAttribute getContract_SignDate() {
    return (EAttribute) getContractEClass().getEAllStructuralFeatures().get(CONTRACT_SIGNDATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Contract.simCard</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Contract.simCard</b></em>'.
   * @generated
   */
  public EReference getContract_SimCard() {
    return (EReference) getContractEClass().getEAllStructuralFeatures().get(CONTRACT_SIMCARD_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Contract.paymentInfo</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Contract.paymentInfo</b></em>'.
   * @generated
   */
  public EReference getContract_PaymentInfo() {
    return (EReference) getContractEClass().getEAllStructuralFeatures().get(CONTRACT_PAYMENTINFO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Contract.car</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Contract.car</b></em>'.
   * @generated
   */
  public EReference getContract_Car() {
    return (EReference) getContractEClass().getEAllStructuralFeatures().get(CONTRACT_CAR_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Contract.secretQuestions</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Contract.secretQuestions</b></em>'.
   * @generated
   */
  public EReference getContract_SecretQuestions() {
    return (EReference) getContractEClass().getEAllStructuralFeatures().get(CONTRACT_SECRETQUESTIONS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Contract.number</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Contract.number</b></em>'.
   * @generated
   */
  public EAttribute getContract_Number() {
    return (EAttribute) getContractEClass().getEAllStructuralFeatures().get(CONTRACT_NUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SecretQuestion</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SecretQuestion</b></em>'
   * @generated
   */
  public EClass getSecretQuestionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SECRETQUESTION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SecretQuestion.question</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SecretQuestion.question</b></em>'.
   * @generated
   */
  public EAttribute getSecretQuestion_Question() {
    return (EAttribute) getSecretQuestionEClass().getEAllStructuralFeatures().get(SECRETQUESTION_QUESTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SecretQuestion.correctAnswer</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SecretQuestion.correctAnswer</b></em>'.
   * @generated
   */
  public EAttribute getSecretQuestion_CorrectAnswer() {
    return (EAttribute) getSecretQuestionEClass().getEAllStructuralFeatures().get(
        SECRETQUESTION_CORRECTANSWER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SecretQuestion.alarmAnswer</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SecretQuestion.alarmAnswer</b></em>'.
   * @generated
   */
  public EAttribute getSecretQuestion_AlarmAnswer() {
    return (EAttribute) getSecretQuestionEClass().getEAllStructuralFeatures()
        .get(SECRETQUESTION_ALARMANSWER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SecretQuestion.active</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SecretQuestion.active</b></em>'.
   * @generated
   */
  public EAttribute getSecretQuestion_Active() {
    return (EAttribute) getSecretQuestionEClass().getEAllStructuralFeatures().get(SECRETQUESTION_ACTIVE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SecretQuestion.type</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SecretQuestion.type</b></em>'.
   * @generated
   */
  public EAttribute getSecretQuestion_Type() {
    return (EAttribute) getSecretQuestionEClass().getEAllStructuralFeatures().get(SECRETQUESTION_TYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ClientTariff</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ClientTariff</b></em>'
   * @generated
   */
  public EClass getClientTariffEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CLIENTTARIFF_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ContractPackage</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ContractPackage</b></em>'
   * @generated
   */
  public EClass getContractPackageEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONTRACTPACKAGE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ContractPackage.client</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ContractPackage.client</b></em>'.
   * @generated
   */
  public EReference getContractPackage_Client() {
    return (EReference) getContractPackageEClass().getEAllStructuralFeatures().get(CONTRACTPACKAGE_CLIENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ContractPackage.user</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ContractPackage.user</b></em>'.
   * @generated
   */
  public EReference getContractPackage_User() {
    return (EReference) getContractPackageEClass().getEAllStructuralFeatures().get(CONTRACTPACKAGE_USER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ContractPackage.contracts</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ContractPackage.contracts</b></em>'.
   * @generated
   */
  public EReference getContractPackage_Contracts() {
    return (EReference) getContractPackageEClass().getEAllStructuralFeatures()
        .get(CONTRACTPACKAGE_CONTRACTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>User</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>User</b></em>'
   * @generated
   */
  public EClass getUserEClass() {
    return (EClass) getEPackage().getEClassifiers().get(USER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>User.login</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>User.login</b></em>'.
   * @generated
   */
  public EAttribute getUser_Login() {
    return (EAttribute) getUserEClass().getEAllStructuralFeatures().get(USER_LOGIN_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>User.password</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>User.password</b></em>'.
   * @generated
   */
  public EAttribute getUser_Password() {
    return (EAttribute) getUserEClass().getEAllStructuralFeatures().get(USER_PASSWORD_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>User.group</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>User.group</b></em>'.
   * @generated
   */
  public EReference getUser_Group() {
    return (EReference) getUserEClass().getEAllStructuralFeatures().get(USER_GROUP_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UserGroup</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>UserGroup</b></em>'
   * @generated
   */
  public EClass getUserGroupEClass() {
    return (EClass) getEPackage().getEClassifiers().get(USERGROUP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Message</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Message</b></em>'
   * @generated
   */
  public EClass getMessageEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MESSAGE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Message.text</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Message.text</b></em>'.
   * @generated
   */
  public EAttribute getMessage_Text() {
    return (EAttribute) getMessageEClass().getEAllStructuralFeatures().get(MESSAGE_TEXT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Message.type</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Message.type</b></em>'.
   * @generated
   */
  public EAttribute getMessage_Type() {
    return (EAttribute) getMessageEClass().getEAllStructuralFeatures().get(MESSAGE_TYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Message.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Message.from</b></em>'.
   * @generated
   */
  public EReference getMessage_From() {
    return (EReference) getMessageEClass().getEAllStructuralFeatures().get(MESSAGE_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Message.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Message.to</b></em>'.
   * @generated
   */
  public EReference getMessage_To() {
    return (EReference) getMessageEClass().getEAllStructuralFeatures().get(MESSAGE_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Message.dateTime</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Message.dateTime</b></em>'.
   * @generated
   */
  public EAttribute getMessage_DateTime() {
    return (EAttribute) getMessageEClass().getEAllStructuralFeatures().get(MESSAGE_DATETIME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Event</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Event</b></em>'
   * @generated
   */
  public EClass getEventEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EVENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Event.eventType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Event.eventType</b></em>'.
   * @generated
   */
  public EAttribute getEvent_EventType() {
    return (EAttribute) getEventEClass().getEAllStructuralFeatures().get(EVENT_EVENTTYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Event.message</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Event.message</b></em>'.
   * @generated
   */
  public EReference getEvent_Message() {
    return (EReference) getEventEClass().getEAllStructuralFeatures().get(EVENT_MESSAGE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Event.coordinates</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Event.coordinates</b></em>'.
   * @generated
   */
  public EReference getEvent_Coordinates() {
    return (EReference) getEventEClass().getEAllStructuralFeatures().get(EVENT_COORDINATES_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Coordinates</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Coordinates</b></em>'
   * @generated
   */
  public EClass getCoordinatesEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COORDINATES_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Coordinates.x</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Coordinates.x</b></em>'.
   * @generated
   */
  public EAttribute getCoordinates_X() {
    return (EAttribute) getCoordinatesEClass().getEAllStructuralFeatures().get(COORDINATES_X_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Coordinates.y</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Coordinates.y</b></em>'.
   * @generated
   */
  public EAttribute getCoordinates_Y() {
    return (EAttribute) getCoordinatesEClass().getEAllStructuralFeatures().get(COORDINATES_Y_FEATURE_ID);
  }

  /**
   * Returns the EEnum '<em><b>Currency</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>Currency</b></em>'
   * @generated
   */
  public EEnum getCurrencyEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(CURRENCY_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>PaymentType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>PaymentType</b></em>'
   * @generated
   */
  public EEnum getPaymentTypeEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(PAYMENTTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>Periodicity</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>Periodicity</b></em>'
   * @generated
   */
  public EEnum getPeriodicityEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(PERIODICITY_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>SecretQuestionType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>SecretQuestionType</b></em>'
   * @generated
   */
  public EEnum getSecretQuestionTypeEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(SECRETQUESTIONTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>MessageType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>MessageType</b></em>'
   * @generated
   */
  public EEnum getMessageTypeEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(MESSAGETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>EventType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>EventType</b></em>'
   * @generated
   */
  public EEnum getEventTypeEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(EVENTTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>PhoneType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>PhoneType</b></em>'
   * @generated
   */
  public EEnum getPhoneTypeEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(PHONETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>MessageIOTypes</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>MessageIOTypes</b></em>'
   * @generated
   */
  public EEnum getMessageIOTypesEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(MESSAGEIOTYPES_CLASSIFIER_ID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClassifier
   *          the {@link EClassifier}
   * @return the class implementing a specific {@link EClass}.
   * @generated
   */
  @Override
  public Class<?> getEClassifierClass(EClassifier eClassifier) {
    switch (eClassifier.getClassifierID()) {
    case SIMCARD_CLASSIFIER_ID:
      return SimCard.class;
    case SIMCONTRACT_CLASSIFIER_ID:
      return SimContract.class;
    case PAYMENTINFO_CLASSIFIER_ID:
      return PaymentInfo.class;
    case SIMCARDXSIMCONTRACT_CLASSIFIER_ID:
      return SimCardXSimContract.class;
    case SIMTARIFF_CLASSIFIER_ID:
      return SimTariff.class;
    case TARIFF_CLASSIFIER_ID:
      return Tariff.class;
    case PAYMENTITEM_CLASSIFIER_ID:
      return PaymentItem.class;
    case VOLUMEPAYMENT_CLASSIFIER_ID:
      return VolumePayment.class;
    case PERIODICALPAYMENT_CLASSIFIER_ID:
      return PeriodicalPayment.class;
    case ONETIMEPAYMENT_CLASSIFIER_ID:
      return OneTimePayment.class;
    case SERVICE_CLASSIFIER_ID:
      return Service.class;
    case UNITS_CLASSIFIER_ID:
      return Units.class;
    case PRICE_CLASSIFIER_ID:
      return Price.class;
    case CARPRODUCER_CLASSIFIER_ID:
      return CarProducer.class;
    case CARMODEL_CLASSIFIER_ID:
      return CarModel.class;
    case CARREGINFO_CLASSIFIER_ID:
      return CarRegInfo.class;
    case DOCUMENT_CLASSIFIER_ID:
      return Document.class;
    case PERSON_CLASSIFIER_ID:
      return Person.class;
    case CAR_CLASSIFIER_ID:
      return Car.class;
    case CARPASSPORT_CLASSIFIER_ID:
      return CarPassport.class;
    case PHONE_CLASSIFIER_ID:
      return Phone.class;
    case ADDRESS_CLASSIFIER_ID:
      return Address.class;
    case PASSPORT_CLASSIFIER_ID:
      return Passport.class;
    case DRIVINGLICENSE_CLASSIFIER_ID:
      return DrivingLicense.class;
    case CONTRACT_CLASSIFIER_ID:
      return Contract.class;
    case SECRETQUESTION_CLASSIFIER_ID:
      return SecretQuestion.class;
    case CLIENTTARIFF_CLASSIFIER_ID:
      return ClientTariff.class;
    case CONTRACTPACKAGE_CLASSIFIER_ID:
      return ContractPackage.class;
    case USER_CLASSIFIER_ID:
      return User.class;
    case USERGROUP_CLASSIFIER_ID:
      return UserGroup.class;
    case MESSAGE_CLASSIFIER_ID:
      return Message.class;
    case EVENT_CLASSIFIER_ID:
      return Event.class;
    case COORDINATES_CLASSIFIER_ID:
      return Coordinates.class;
    case CURRENCY_CLASSIFIER_ID:
      return Currency.class;
    case PAYMENTTYPE_CLASSIFIER_ID:
      return PaymentType.class;
    case PERIODICITY_CLASSIFIER_ID:
      return Periodicity.class;
    case SECRETQUESTIONTYPE_CLASSIFIER_ID:
      return SecretQuestionType.class;
    case MESSAGETYPE_CLASSIFIER_ID:
      return MessageType.class;
    case EVENTTYPE_CLASSIFIER_ID:
      return EventType.class;
    case PHONETYPE_CLASSIFIER_ID:
      return PhoneType.class;
    case MESSAGEIOTYPES_CLASSIFIER_ID:
      return MessageIOTypes.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
