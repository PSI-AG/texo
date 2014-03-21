package org.eclipse.emf.texo.test.model.issues.bz393240;

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
import org.eclipse.emf.texo.test.model.issues.bz393240.dao.ApplicationDao;
import org.eclipse.emf.texo.test.model.issues.bz393240.dao.DocumentRootDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>bz393240</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Bz393240ModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz393240";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz393240ModelFactory MODELFACTORY = new Bz393240ModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int APPLICATION_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int APPLICATION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int APPLICATION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int APPLICATION_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_MIXED_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_APPLICATIONREQUEST_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_APPLICATIONRESPONSE_FEATURE_ID = 6;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz393240ModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static Bz393240ModelPackage initialize() {

    if (isInitialized) {
      return (Bz393240ModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final Bz393240ModelPackage modelPackage = new Bz393240ModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Application.class, modelPackage.getApplicationEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DocumentRoot.class, modelPackage.getDocumentRootEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(Application.class, ApplicationDao.class);
    DaoRegistry.getInstance().registerDao(DocumentRoot.class, DocumentRootDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link Bz393240ModelFactory} instance.
   * @generated
   */
  @Override
  public Bz393240ModelFactory getModelFactory() {
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
    return "bz393240.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>Application</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Application</b></em>'
   * @generated
   */
  public EClass getApplicationEClass() {
    return (EClass) getEPackage().getEClassifiers().get(APPLICATION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Application.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Application.name</b></em>'.
   * @generated
   */
  public EAttribute getApplication_Name() {
    return (EAttribute) getApplicationEClass().getEAllStructuralFeatures().get(APPLICATION_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DocumentRoot</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DocumentRoot</b></em>'
   * @generated
   */
  public EClass getDocumentRootEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DOCUMENTROOT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.mixed</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.mixed</b></em>'.
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed() {
    return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_MIXED_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.xMLNSPrefixMap</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.xMLNSPrefixMap</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.xSISchemaLocation</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.xSISchemaLocation</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(
        DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.applicationRequest</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.applicationRequest</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_ApplicationRequest() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(
        DOCUMENTROOT_APPLICATIONREQUEST_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.applicationResponse</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.applicationResponse</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_ApplicationResponse() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(
        DOCUMENTROOT_APPLICATIONRESPONSE_FEATURE_ID);
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
    case APPLICATION_CLASSIFIER_ID:
      return Application.class;
    case DOCUMENTROOT_CLASSIFIER_ID:
      return DocumentRoot.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
