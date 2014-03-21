package org.eclipse.emf.texo.test.model.samples.rental;

import java.util.Date;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.samples.rental.dao.RentalBicycleDao;
import org.eclipse.emf.texo.test.model.samples.rental.dao.RentalBusinessDao;
import org.eclipse.emf.texo.test.model.samples.rental.dao.RentalCarDao;
import org.eclipse.emf.texo.test.model.samples.rental.dao.RentalCarDriverDao;
import org.eclipse.emf.texo.test.model.samples.rental.dao.RentalContractDao;
import org.eclipse.emf.texo.test.model.samples.rental.dao.RentalContractLineDao;
import org.eclipse.emf.texo.test.model.samples.rental.dao.RentalUnitDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>rental</b></em>'. It contains initialization code and access to the Factory
 * to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class RentalModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/rental";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final RentalModelFactory MODELFACTORY = new RentalModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALBICYCLETYPE_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCARSIZE_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATE_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALBICYCLETYPEOBJECT_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCARSIZEOBJECT_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALBICYCLE_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALBICYCLE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALBICYCLE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALBICYCLE_DESCRIPTION_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALBICYCLE_TYPE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALBICYCLE_RENTALCAR_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALUNIT_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALUNIT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALUNIT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALUNIT_DESCRIPTION_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCAR_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCAR_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCAR_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCAR_DESCRIPTION_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCAR_SIZE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCAR_CURRENTDRIVER_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALBUSINESS_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALBUSINESS_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALBUSINESS_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALBUSINESS_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCARDRIVER_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCARDRIVER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCARDRIVER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCARDRIVER_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCARDRIVER_CURRENTRENTALCAR_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCONTRACT_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCONTRACT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCONTRACT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCONTRACT_RENTTOBUSINESSPARTNER_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCONTRACT_STARTDATE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCONTRACT_ENDDATE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCONTRACT_COST_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCONTRACT_RENTALCONTRACTLINES_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCONTRACTLINE_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCONTRACTLINE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCONTRACTLINE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCONTRACTLINE_RENTALCONTRACT_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCONTRACTLINE_NUMBER_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RENTALCONTRACTLINE_RENTALUNIT_FEATURE_ID = 4;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final RentalModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static RentalModelPackage initialize() {

    if (isInitialized) {
      return (RentalModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final RentalModelPackage modelPackage = new RentalModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(RentalBicycle.class, modelPackage.getRentalBicycleEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RentalUnit.class, modelPackage.getRentalUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RentalCar.class, modelPackage.getRentalCarEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RentalBusiness.class, modelPackage.getRentalBusinessEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RentalCarDriver.class,
        modelPackage.getRentalCarDriverEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RentalContract.class, modelPackage.getRentalContractEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RentalContractLine.class,
        modelPackage.getRentalContractLineEClass(), modelPackage);

    ModelResolver.getInstance().registerClassModelMapping(RentalBicycleType.class,
        modelPackage.getRentalBicycleTypeEEnum(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RentalCarSize.class, modelPackage.getRentalCarSizeEEnum(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(RentalBicycle.class, RentalBicycleDao.class);
    DaoRegistry.getInstance().registerDao(RentalUnit.class, RentalUnitDao.class);
    DaoRegistry.getInstance().registerDao(RentalCar.class, RentalCarDao.class);
    DaoRegistry.getInstance().registerDao(RentalBusiness.class, RentalBusinessDao.class);
    DaoRegistry.getInstance().registerDao(RentalCarDriver.class, RentalCarDriverDao.class);
    DaoRegistry.getInstance().registerDao(RentalContract.class, RentalContractDao.class);
    DaoRegistry.getInstance().registerDao(RentalContractLine.class, RentalContractLineDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link RentalModelFactory} instance.
   * @generated
   */
  @Override
  public RentalModelFactory getModelFactory() {
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
    return "rental.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>RentalBicycle</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RentalBicycle</b></em>'
   * @generated
   */
  public EClass getRentalBicycleEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RENTALBICYCLE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RentalBicycle.type</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RentalBicycle.type</b></em>'.
   * @generated
   */
  public EAttribute getRentalBicycle_Type() {
    return (EAttribute) getRentalBicycleEClass().getEAllStructuralFeatures().get(RENTALBICYCLE_TYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RentalBicycle.rentalCar</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RentalBicycle.rentalCar</b></em>'.
   * @generated
   */
  public EReference getRentalBicycle_RentalCar() {
    return (EReference) getRentalBicycleEClass().getEAllStructuralFeatures().get(RENTALBICYCLE_RENTALCAR_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RentalUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RentalUnit</b></em>'
   * @generated
   */
  public EClass getRentalUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RENTALUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RentalUnit.description</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RentalUnit.description</b></em>'.
   * @generated
   */
  public EAttribute getRentalUnit_Description() {
    return (EAttribute) getRentalUnitEClass().getEAllStructuralFeatures().get(RENTALUNIT_DESCRIPTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RentalCar</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RentalCar</b></em>'
   * @generated
   */
  public EClass getRentalCarEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RENTALCAR_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RentalCar.size</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RentalCar.size</b></em>'.
   * @generated
   */
  public EAttribute getRentalCar_Size() {
    return (EAttribute) getRentalCarEClass().getEAllStructuralFeatures().get(RENTALCAR_SIZE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RentalCar.currentDriver</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RentalCar.currentDriver</b></em>'.
   * @generated
   */
  public EReference getRentalCar_CurrentDriver() {
    return (EReference) getRentalCarEClass().getEAllStructuralFeatures().get(RENTALCAR_CURRENTDRIVER_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RentalBusiness</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RentalBusiness</b></em>'
   * @generated
   */
  public EClass getRentalBusinessEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RENTALBUSINESS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RentalBusiness.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RentalBusiness.name</b></em>'.
   * @generated
   */
  public EAttribute getRentalBusiness_Name() {
    return (EAttribute) getRentalBusinessEClass().getEAllStructuralFeatures().get(RENTALBUSINESS_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RentalCarDriver</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RentalCarDriver</b></em>'
   * @generated
   */
  public EClass getRentalCarDriverEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RENTALCARDRIVER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RentalCarDriver.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RentalCarDriver.name</b></em>'.
   * @generated
   */
  public EAttribute getRentalCarDriver_Name() {
    return (EAttribute) getRentalCarDriverEClass().getEAllStructuralFeatures().get(RENTALCARDRIVER_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RentalCarDriver.currentRentalCar</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RentalCarDriver.currentRentalCar</b></em>'.
   * @generated
   */
  public EReference getRentalCarDriver_CurrentRentalCar() {
    return (EReference) getRentalCarDriverEClass().getEAllStructuralFeatures().get(
        RENTALCARDRIVER_CURRENTRENTALCAR_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RentalContract</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RentalContract</b></em>'
   * @generated
   */
  public EClass getRentalContractEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RENTALCONTRACT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RentalContract.rentToBusinessPartner</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RentalContract.rentToBusinessPartner</b></em>'.
   * @generated
   */
  public EAttribute getRentalContract_RentToBusinessPartner() {
    return (EAttribute) getRentalContractEClass().getEAllStructuralFeatures().get(
        RENTALCONTRACT_RENTTOBUSINESSPARTNER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RentalContract.startDate</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RentalContract.startDate</b></em>'.
   * @generated
   */
  public EAttribute getRentalContract_StartDate() {
    return (EAttribute) getRentalContractEClass().getEAllStructuralFeatures().get(RENTALCONTRACT_STARTDATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RentalContract.endDate</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RentalContract.endDate</b></em>'.
   * @generated
   */
  public EAttribute getRentalContract_EndDate() {
    return (EAttribute) getRentalContractEClass().getEAllStructuralFeatures().get(RENTALCONTRACT_ENDDATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RentalContract.cost</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RentalContract.cost</b></em>'.
   * @generated
   */
  public EAttribute getRentalContract_Cost() {
    return (EAttribute) getRentalContractEClass().getEAllStructuralFeatures().get(RENTALCONTRACT_COST_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RentalContract.rentalContractLines</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RentalContract.rentalContractLines</b></em>'.
   * @generated
   */
  public EReference getRentalContract_RentalContractLines() {
    return (EReference) getRentalContractEClass().getEAllStructuralFeatures().get(
        RENTALCONTRACT_RENTALCONTRACTLINES_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RentalContractLine</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RentalContractLine</b></em>'
   * @generated
   */
  public EClass getRentalContractLineEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RENTALCONTRACTLINE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RentalContractLine.rentalContract</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RentalContractLine.rentalContract</b></em>'.
   * @generated
   */
  public EReference getRentalContractLine_RentalContract() {
    return (EReference) getRentalContractLineEClass().getEAllStructuralFeatures().get(
        RENTALCONTRACTLINE_RENTALCONTRACT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RentalContractLine.number</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RentalContractLine.number</b></em>'.
   * @generated
   */
  public EAttribute getRentalContractLine_Number() {
    return (EAttribute) getRentalContractLineEClass().getEAllStructuralFeatures().get(
        RENTALCONTRACTLINE_NUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RentalContractLine.rentalUnit</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RentalContractLine.rentalUnit</b></em>'.
   * @generated
   */
  public EReference getRentalContractLine_RentalUnit() {
    return (EReference) getRentalContractLineEClass().getEAllStructuralFeatures().get(
        RENTALCONTRACTLINE_RENTALUNIT_FEATURE_ID);
  }

  /**
   * Returns the EEnum '<em><b>RentalBicycleType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>RentalBicycleType</b></em>'
   * @generated
   */
  public EEnum getRentalBicycleTypeEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(RENTALBICYCLETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>RentalCarSize</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>RentalCarSize</b></em>'
   * @generated
   */
  public EEnum getRentalCarSizeEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(RENTALCARSIZE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>Date</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>Date</b></em>'
   * @generated
   */
  public EDataType getDateEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(DATE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>RentalBicycleTypeObject</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>RentalBicycleTypeObject</b></em>'
   * @generated
   */
  public EDataType getRentalBicycleTypeObjectEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(RENTALBICYCLETYPEOBJECT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>RentalCarSizeObject</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>RentalCarSizeObject</b></em>'
   * @generated
   */
  public EDataType getRentalCarSizeObjectEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(RENTALCARSIZEOBJECT_CLASSIFIER_ID);
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
    case RENTALBICYCLE_CLASSIFIER_ID:
      return RentalBicycle.class;
    case RENTALUNIT_CLASSIFIER_ID:
      return RentalUnit.class;
    case RENTALCAR_CLASSIFIER_ID:
      return RentalCar.class;
    case RENTALBUSINESS_CLASSIFIER_ID:
      return RentalBusiness.class;
    case RENTALCARDRIVER_CLASSIFIER_ID:
      return RentalCarDriver.class;
    case RENTALCONTRACT_CLASSIFIER_ID:
      return RentalContract.class;
    case RENTALCONTRACTLINE_CLASSIFIER_ID:
      return RentalContractLine.class;
    case RENTALBICYCLETYPE_CLASSIFIER_ID:
      return RentalBicycleType.class;
    case RENTALCARSIZE_CLASSIFIER_ID:
      return RentalCarSize.class;
    case DATE_CLASSIFIER_ID:
      return Date.class;
    case RENTALBICYCLETYPEOBJECT_CLASSIFIER_ID:
      return RentalBicycleType.class;
    case RENTALCARSIZEOBJECT_CLASSIFIER_ID:
      return RentalCarSize.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
