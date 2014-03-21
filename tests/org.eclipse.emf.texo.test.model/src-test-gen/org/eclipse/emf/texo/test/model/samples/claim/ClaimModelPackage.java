package org.eclipse.emf.texo.test.model.samples.claim;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.samples.claim.dao.ClaimCompositeKeyDao;
import org.eclipse.emf.texo.test.model.samples.claim.dao.ClaimDao;
import org.eclipse.emf.texo.test.model.samples.claim.dao.ClaimLineCompositeKeyDao;
import org.eclipse.emf.texo.test.model.samples.claim.dao.ClaimLineDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>claim</b></em>'. It contains initialization code and access to the Factory
 * to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ClaimModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/claim";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final ClaimModelFactory MODELFACTORY = new ClaimModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIM_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIM_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIM_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIM_CLAIMCOMPOSITEKEY_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIM_BILLINGNAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIM_CLAIMGROUPVSPID_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIM_CLAIMSTATUS_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIM_CLAIMLINE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMCOMPOSITEKEY_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMCOMPOSITEKEY_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMCOMPOSITEKEY_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMCOMPOSITEKEY_CLAIMNUMBER_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMCOMPOSITEKEY_CLAIMEXTENSIONNUMBER_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMLINE_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMLINE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMLINE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMLINE_CLAIM_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMLINE_CLAIMLINECOMPOSITEKEY_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMLINE_CLAIMLINEBILLEDAMOUNT_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMLINE_SERVICECODE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMLINE_CLAIMLINESTATUS_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMLINECOMPOSITEKEY_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMLINECOMPOSITEKEY_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMLINECOMPOSITEKEY_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMLINECOMPOSITEKEY_CLAIM_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CLAIMLINECOMPOSITEKEY_CLAIMLINENUMBER_FEATURE_ID = 3;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final ClaimModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static ClaimModelPackage initialize() {

    if (isInitialized) {
      return (ClaimModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final ClaimModelPackage modelPackage = new ClaimModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Claim.class, modelPackage.getClaimEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ClaimCompositeKey.class,
        modelPackage.getClaimCompositeKeyEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ClaimLine.class, modelPackage.getClaimLineEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ClaimLineCompositeKey.class,
        modelPackage.getClaimLineCompositeKeyEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(Claim.class, ClaimDao.class);
    DaoRegistry.getInstance().registerDao(ClaimCompositeKey.class, ClaimCompositeKeyDao.class);
    DaoRegistry.getInstance().registerDao(ClaimLine.class, ClaimLineDao.class);
    DaoRegistry.getInstance().registerDao(ClaimLineCompositeKey.class, ClaimLineCompositeKeyDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link ClaimModelFactory} instance.
   * @generated
   */
  @Override
  public ClaimModelFactory getModelFactory() {
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
    return "claim.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>Claim</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Claim</b></em>'
   * @generated
   */
  public EClass getClaimEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CLAIM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Claim.claimCompositeKey</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Claim.claimCompositeKey</b></em>'.
   * @generated
   */
  public EReference getClaim_ClaimCompositeKey() {
    return (EReference) getClaimEClass().getEAllStructuralFeatures().get(CLAIM_CLAIMCOMPOSITEKEY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Claim.billingName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Claim.billingName</b></em>'.
   * @generated
   */
  public EAttribute getClaim_BillingName() {
    return (EAttribute) getClaimEClass().getEAllStructuralFeatures().get(CLAIM_BILLINGNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Claim.claimGroupVSPId</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Claim.claimGroupVSPId</b></em>'.
   * @generated
   */
  public EAttribute getClaim_ClaimGroupVSPId() {
    return (EAttribute) getClaimEClass().getEAllStructuralFeatures().get(CLAIM_CLAIMGROUPVSPID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Claim.claimStatus</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Claim.claimStatus</b></em>'.
   * @generated
   */
  public EAttribute getClaim_ClaimStatus() {
    return (EAttribute) getClaimEClass().getEAllStructuralFeatures().get(CLAIM_CLAIMSTATUS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Claim.claimLine</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Claim.claimLine</b></em>'.
   * @generated
   */
  public EReference getClaim_ClaimLine() {
    return (EReference) getClaimEClass().getEAllStructuralFeatures().get(CLAIM_CLAIMLINE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ClaimCompositeKey</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ClaimCompositeKey</b></em>'
   * @generated
   */
  public EClass getClaimCompositeKeyEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CLAIMCOMPOSITEKEY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ClaimCompositeKey.claimNumber</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ClaimCompositeKey.claimNumber</b></em>'.
   * @generated
   */
  public EAttribute getClaimCompositeKey_ClaimNumber() {
    return (EAttribute) getClaimCompositeKeyEClass().getEAllStructuralFeatures().get(
        CLAIMCOMPOSITEKEY_CLAIMNUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ClaimCompositeKey.claimExtensionNumber</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ClaimCompositeKey.claimExtensionNumber</b></em>'.
   * @generated
   */
  public EAttribute getClaimCompositeKey_ClaimExtensionNumber() {
    return (EAttribute) getClaimCompositeKeyEClass().getEAllStructuralFeatures().get(
        CLAIMCOMPOSITEKEY_CLAIMEXTENSIONNUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ClaimLine</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ClaimLine</b></em>'
   * @generated
   */
  public EClass getClaimLineEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CLAIMLINE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ClaimLine.claim</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ClaimLine.claim</b></em>'.
   * @generated
   */
  public EReference getClaimLine_Claim() {
    return (EReference) getClaimLineEClass().getEAllStructuralFeatures().get(CLAIMLINE_CLAIM_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ClaimLine.claimLineCompositeKey</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ClaimLine.claimLineCompositeKey</b></em>'.
   * @generated
   */
  public EReference getClaimLine_ClaimLineCompositeKey() {
    return (EReference) getClaimLineEClass().getEAllStructuralFeatures()
        .get(CLAIMLINE_CLAIMLINECOMPOSITEKEY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ClaimLine.claimLineBilledAmount</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ClaimLine.claimLineBilledAmount</b></em>'.
   * @generated
   */
  public EAttribute getClaimLine_ClaimLineBilledAmount() {
    return (EAttribute) getClaimLineEClass().getEAllStructuralFeatures()
        .get(CLAIMLINE_CLAIMLINEBILLEDAMOUNT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ClaimLine.serviceCode</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ClaimLine.serviceCode</b></em>'.
   * @generated
   */
  public EAttribute getClaimLine_ServiceCode() {
    return (EAttribute) getClaimLineEClass().getEAllStructuralFeatures().get(CLAIMLINE_SERVICECODE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ClaimLine.claimLineStatus</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ClaimLine.claimLineStatus</b></em>'.
   * @generated
   */
  public EAttribute getClaimLine_ClaimLineStatus() {
    return (EAttribute) getClaimLineEClass().getEAllStructuralFeatures().get(CLAIMLINE_CLAIMLINESTATUS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ClaimLineCompositeKey</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ClaimLineCompositeKey</b></em>'
   * @generated
   */
  public EClass getClaimLineCompositeKeyEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CLAIMLINECOMPOSITEKEY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ClaimLineCompositeKey.claim</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ClaimLineCompositeKey.claim</b></em>'.
   * @generated
   */
  public EReference getClaimLineCompositeKey_Claim() {
    return (EReference) getClaimLineCompositeKeyEClass().getEAllStructuralFeatures().get(
        CLAIMLINECOMPOSITEKEY_CLAIM_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ClaimLineCompositeKey.claimLineNumber</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ClaimLineCompositeKey.claimLineNumber</b></em>'.
   * @generated
   */
  public EAttribute getClaimLineCompositeKey_ClaimLineNumber() {
    return (EAttribute) getClaimLineCompositeKeyEClass().getEAllStructuralFeatures().get(
        CLAIMLINECOMPOSITEKEY_CLAIMLINENUMBER_FEATURE_ID);
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
    case CLAIM_CLASSIFIER_ID:
      return Claim.class;
    case CLAIMCOMPOSITEKEY_CLASSIFIER_ID:
      return ClaimCompositeKey.class;
    case CLAIMLINE_CLASSIFIER_ID:
      return ClaimLine.class;
    case CLAIMLINECOMPOSITEKEY_CLASSIFIER_ID:
      return ClaimLineCompositeKey.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
