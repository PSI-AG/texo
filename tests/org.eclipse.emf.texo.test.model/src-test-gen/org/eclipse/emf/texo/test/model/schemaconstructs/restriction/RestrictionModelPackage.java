package org.eclipse.emf.texo.test.model.schemaconstructs.restriction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.restriction.dao.MemberDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.restriction.dao.XMLDeviantDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>restriction</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class RestrictionModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/schemaconstructs/restriction";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final RestrictionModelFactory MODELFACTORY = new RestrictionModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MEMBER_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MEMBER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MEMBER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MEMBER_NUMPOSTS_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MEMBER_SIGNATURE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MEMBER_EMAIL_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MEMBER_FIRSTSUBSCRIBED_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MEMBER_MAILREADER_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLDEVIANT_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLDEVIANT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLDEVIANT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLDEVIANT_NUMPOSTS_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLDEVIANT_SIGNATURE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLDEVIANT_EMAIL_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLDEVIANT_FIRSTSUBSCRIBED_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLDEVIANT_MAILREADER_FEATURE_ID = 6;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final RestrictionModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static RestrictionModelPackage initialize() {

    if (isInitialized) {
      return (RestrictionModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final RestrictionModelPackage modelPackage = new RestrictionModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Member.class, modelPackage.getMemberEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(XMLDeviant.class, modelPackage.getXMLDeviantEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(Member.class, MemberDao.class);
    DaoRegistry.getInstance().registerDao(XMLDeviant.class, XMLDeviantDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link RestrictionModelFactory} instance.
   * @generated
   */
  @Override
  public RestrictionModelFactory getModelFactory() {
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
    return "restriction.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>Member</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Member</b></em>'
   * @generated
   */
  public EClass getMemberEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MEMBER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>XMLDeviant</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>XMLDeviant</b></em>'
   * @generated
   */
  public EClass getXMLDeviantEClass() {
    return (EClass) getEPackage().getEClassifiers().get(XMLDEVIANT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>XMLDeviant.numPosts</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>XMLDeviant.numPosts</b></em>'.
   * @generated
   */
  public EAttribute getXMLDeviant_NumPosts() {
    return (EAttribute) getXMLDeviantEClass().getEAllStructuralFeatures().get(XMLDEVIANT_NUMPOSTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>XMLDeviant.signature</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>XMLDeviant.signature</b></em>'.
   * @generated
   */
  public EAttribute getXMLDeviant_Signature() {
    return (EAttribute) getXMLDeviantEClass().getEAllStructuralFeatures().get(XMLDEVIANT_SIGNATURE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>XMLDeviant.email</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>XMLDeviant.email</b></em>'.
   * @generated
   */
  public EAttribute getXMLDeviant_Email() {
    return (EAttribute) getXMLDeviantEClass().getEAllStructuralFeatures().get(XMLDEVIANT_EMAIL_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>XMLDeviant.firstSubscribed</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>XMLDeviant.firstSubscribed</b></em>'.
   * @generated
   */
  public EAttribute getXMLDeviant_FirstSubscribed() {
    return (EAttribute) getXMLDeviantEClass().getEAllStructuralFeatures().get(XMLDEVIANT_FIRSTSUBSCRIBED_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>XMLDeviant.mailReader</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>XMLDeviant.mailReader</b></em>'.
   * @generated
   */
  public EAttribute getXMLDeviant_MailReader() {
    return (EAttribute) getXMLDeviantEClass().getEAllStructuralFeatures().get(XMLDEVIANT_MAILREADER_FEATURE_ID);
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
    case MEMBER_CLASSIFIER_ID:
      return Member.class;
    case XMLDEVIANT_CLASSIFIER_ID:
      return XMLDeviant.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
