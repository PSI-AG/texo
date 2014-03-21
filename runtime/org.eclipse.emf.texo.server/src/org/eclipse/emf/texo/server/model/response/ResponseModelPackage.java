package org.eclipse.emf.texo.server.model.response;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>response</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResponseModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/server/model/response";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final ResponseModelFactory MODELFACTORY = new ResponseModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_MIXED_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_ERROR_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_RESPONSE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_RESULT_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ERRORTYPE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ERRORTYPE_ERRORCLASS_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ERRORTYPE_MESSAGE_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ERRORTYPE_STACKTRACE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ERRORTYPE_CAUSE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESPONSETYPE_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESPONSETYPE_STATUS_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESPONSETYPE_STARTROW_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESPONSETYPE_ENDROW_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESPONSETYPE_TOTALROWS_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESPONSETYPE_DATA_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESULTTYPE_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESULTTYPE_UPDATED_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESULTTYPE_INSERTED_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESULTTYPE_DELETED_FEATURE_ID = 2;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final ResponseModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static ResponseModelPackage initialize() {

    if (isInitialized) {
      return (ResponseModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final ResponseModelPackage modelPackage = new ResponseModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(DocumentRoot.class, modelPackage.getDocumentRootEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ErrorType.class, modelPackage.getErrorTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ResponseType.class, modelPackage.getResponseTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ResultType.class, modelPackage.getResultTypeEClass(),
        modelPackage);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link ResponseModelFactory} instance.
   * @generated
   */
  @Override
  public ResponseModelFactory getModelFactory() {
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
    return "response.ecore";
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
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.error</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.error</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_Error() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_ERROR_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.response</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.response</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_Response() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_RESPONSE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.result</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.result</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_Result() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_RESULT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ErrorType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ErrorType</b></em>'
   * @generated
   */
  public EClass getErrorTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ERRORTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ErrorType.errorClass</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ErrorType.errorClass</b></em>'.
   * @generated
   */
  public EAttribute getErrorType_ErrorClass() {
    return (EAttribute) getErrorTypeEClass().getEAllStructuralFeatures().get(ERRORTYPE_ERRORCLASS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ErrorType.message</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ErrorType.message</b></em>'.
   * @generated
   */
  public EAttribute getErrorType_Message() {
    return (EAttribute) getErrorTypeEClass().getEAllStructuralFeatures().get(ERRORTYPE_MESSAGE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ErrorType.stackTrace</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ErrorType.stackTrace</b></em>'.
   * @generated
   */
  public EAttribute getErrorType_StackTrace() {
    return (EAttribute) getErrorTypeEClass().getEAllStructuralFeatures().get(ERRORTYPE_STACKTRACE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ErrorType.cause</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ErrorType.cause</b></em>'.
   * @generated
   */
  public EReference getErrorType_Cause() {
    return (EReference) getErrorTypeEClass().getEAllStructuralFeatures().get(ERRORTYPE_CAUSE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ResponseType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ResponseType</b></em>'
   * @generated
   */
  public EClass getResponseTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RESPONSETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ResponseType.status</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ResponseType.status</b></em>'.
   * @generated
   */
  public EAttribute getResponseType_Status() {
    return (EAttribute) getResponseTypeEClass().getEAllStructuralFeatures().get(RESPONSETYPE_STATUS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ResponseType.startRow</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ResponseType.startRow</b></em>'.
   * @generated
   */
  public EAttribute getResponseType_StartRow() {
    return (EAttribute) getResponseTypeEClass().getEAllStructuralFeatures().get(RESPONSETYPE_STARTROW_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ResponseType.endRow</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ResponseType.endRow</b></em>'.
   * @generated
   */
  public EAttribute getResponseType_EndRow() {
    return (EAttribute) getResponseTypeEClass().getEAllStructuralFeatures().get(RESPONSETYPE_ENDROW_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ResponseType.totalRows</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ResponseType.totalRows</b></em>'.
   * @generated
   */
  public EAttribute getResponseType_TotalRows() {
    return (EAttribute) getResponseTypeEClass().getEAllStructuralFeatures().get(RESPONSETYPE_TOTALROWS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ResponseType.data</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ResponseType.data</b></em>'.
   * @generated
   */
  public EReference getResponseType_Data() {
    return (EReference) getResponseTypeEClass().getEAllStructuralFeatures().get(RESPONSETYPE_DATA_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ResultType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ResultType</b></em>'
   * @generated
   */
  public EClass getResultTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RESULTTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ResultType.updated</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ResultType.updated</b></em>'.
   * @generated
   */
  public EReference getResultType_Updated() {
    return (EReference) getResultTypeEClass().getEAllStructuralFeatures().get(RESULTTYPE_UPDATED_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ResultType.inserted</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ResultType.inserted</b></em>'.
   * @generated
   */
  public EReference getResultType_Inserted() {
    return (EReference) getResultTypeEClass().getEAllStructuralFeatures().get(RESULTTYPE_INSERTED_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ResultType.deleted</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ResultType.deleted</b></em>'.
   * @generated
   */
  public EReference getResultType_Deleted() {
    return (EReference) getResultTypeEClass().getEAllStructuralFeatures().get(RESULTTYPE_DELETED_FEATURE_ID);
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
    case DOCUMENTROOT_CLASSIFIER_ID:
      return DocumentRoot.class;
    case ERRORTYPE_CLASSIFIER_ID:
      return ErrorType.class;
    case RESPONSETYPE_CLASSIFIER_ID:
      return ResponseType.class;
    case RESULTTYPE_CLASSIFIER_ID:
      return ResultType.class;
    }
    throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
  }
}
