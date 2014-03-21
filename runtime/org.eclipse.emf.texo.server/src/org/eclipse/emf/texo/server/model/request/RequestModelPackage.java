package org.eclipse.emf.texo.server.model.request;

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
 * The <b>Package</b> for the model '<em><b>request</b></em>'. It contains initialization code and access to the Factory
 * to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class RequestModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/server/model/request";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final RequestModelFactory MODELFACTORY = new RequestModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONTYPE_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONTYPE_UPDATE_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONTYPE_INSERT_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONTYPE_DELETE_FEATURE_ID = 2;

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
  public static final int DOCUMENTROOT_ACTION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_QUERY_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_QUERYREFERINGOBJECTS_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int QUERYTYPE_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int QUERYTYPE_QUERY_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int QUERYTYPE_NAMEDQUERY_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int QUERYTYPE_PARAMETERS_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int QUERYTYPE_FIRSTRESULT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int QUERYTYPE_MAXRESULTS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int QUERYTYPE_DOCOUNT_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int QUERYTYPE_COUNTOPERATION_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int QUERYREFERINGOBJECTSTYPE_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int QUERYREFERINGOBJECTSTYPE_TARGETURI_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int QUERYREFERINGOBJECTSTYPE_INCLUDECONTAINERREFERENCES_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int QUERYREFERINGOBJECTSTYPE_MAXRESULTS_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PARAMETER_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PARAMETER_NAME_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PARAMETER_VALUE_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PARAMETER_TYPE_FEATURE_ID = 2;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final RequestModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static RequestModelPackage initialize() {

    if (isInitialized) {
      return (RequestModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final RequestModelPackage modelPackage = new RequestModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(ActionType.class, modelPackage.getActionTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DocumentRoot.class, modelPackage.getDocumentRootEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(QueryType.class, modelPackage.getQueryTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(QueryReferingObjectsType.class,
        modelPackage.getQueryReferingObjectsTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Parameter.class, modelPackage.getParameterEClass(),
        modelPackage);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link RequestModelFactory} instance.
   * @generated
   */
  @Override
  public RequestModelFactory getModelFactory() {
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
    return "request.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>ActionType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ActionType</b></em>'
   * @generated
   */
  public EClass getActionTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ACTIONTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ActionType.update</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ActionType.update</b></em>'.
   * @generated
   */
  public EReference getActionType_Update() {
    return (EReference) getActionTypeEClass().getEAllStructuralFeatures().get(ACTIONTYPE_UPDATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ActionType.insert</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ActionType.insert</b></em>'.
   * @generated
   */
  public EReference getActionType_Insert() {
    return (EReference) getActionTypeEClass().getEAllStructuralFeatures().get(ACTIONTYPE_INSERT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ActionType.delete</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ActionType.delete</b></em>'.
   * @generated
   */
  public EReference getActionType_Delete() {
    return (EReference) getActionTypeEClass().getEAllStructuralFeatures().get(ACTIONTYPE_DELETE_FEATURE_ID);
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
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.action</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.action</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_Action() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_ACTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.query</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.query</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_Query() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_QUERY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.queryReferingObjects</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.queryReferingObjects</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_QueryReferingObjects() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(
        DOCUMENTROOT_QUERYREFERINGOBJECTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>QueryType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>QueryType</b></em>'
   * @generated
   */
  public EClass getQueryTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(QUERYTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>QueryType.query</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>QueryType.query</b></em>'.
   * @generated
   */
  public EAttribute getQueryType_Query() {
    return (EAttribute) getQueryTypeEClass().getEAllStructuralFeatures().get(QUERYTYPE_QUERY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>QueryType.namedQuery</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>QueryType.namedQuery</b></em>'.
   * @generated
   */
  public EAttribute getQueryType_NamedQuery() {
    return (EAttribute) getQueryTypeEClass().getEAllStructuralFeatures().get(QUERYTYPE_NAMEDQUERY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>QueryType.parameters</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>QueryType.parameters</b></em>'.
   * @generated
   */
  public EReference getQueryType_Parameters() {
    return (EReference) getQueryTypeEClass().getEAllStructuralFeatures().get(QUERYTYPE_PARAMETERS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>QueryType.firstResult</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>QueryType.firstResult</b></em>'.
   * @generated
   */
  public EAttribute getQueryType_FirstResult() {
    return (EAttribute) getQueryTypeEClass().getEAllStructuralFeatures().get(QUERYTYPE_FIRSTRESULT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>QueryType.maxResults</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>QueryType.maxResults</b></em>'.
   * @generated
   */
  public EAttribute getQueryType_MaxResults() {
    return (EAttribute) getQueryTypeEClass().getEAllStructuralFeatures().get(QUERYTYPE_MAXRESULTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>QueryType.doCount</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>QueryType.doCount</b></em>'.
   * @generated
   */
  public EAttribute getQueryType_DoCount() {
    return (EAttribute) getQueryTypeEClass().getEAllStructuralFeatures().get(QUERYTYPE_DOCOUNT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>QueryType.countOperation</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>QueryType.countOperation</b></em>'.
   * @generated
   */
  public EAttribute getQueryType_CountOperation() {
    return (EAttribute) getQueryTypeEClass().getEAllStructuralFeatures().get(QUERYTYPE_COUNTOPERATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>QueryReferingObjectsType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EClass} '<em><b>QueryReferingObjectsType</b></em>'
   * @generated
   */
  public EClass getQueryReferingObjectsTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(QUERYREFERINGOBJECTSTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>QueryReferingObjectsType.targetUri</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>QueryReferingObjectsType.targetUri</b></em>'.
   * @generated
   */
  public EAttribute getQueryReferingObjectsType_TargetUri() {
    return (EAttribute) getQueryReferingObjectsTypeEClass().getEAllStructuralFeatures().get(
        QUERYREFERINGOBJECTSTYPE_TARGETURI_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>QueryReferingObjectsType.includeContainerReferences</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '
   *         <em><b>QueryReferingObjectsType.includeContainerReferences</b></em>'.
   * @generated
   */
  public EAttribute getQueryReferingObjectsType_IncludeContainerReferences() {
    return (EAttribute) getQueryReferingObjectsTypeEClass().getEAllStructuralFeatures().get(
        QUERYREFERINGOBJECTSTYPE_INCLUDECONTAINERREFERENCES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>QueryReferingObjectsType.maxResults</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>QueryReferingObjectsType.maxResults</b></em>'.
   * @generated
   */
  public EAttribute getQueryReferingObjectsType_MaxResults() {
    return (EAttribute) getQueryReferingObjectsTypeEClass().getEAllStructuralFeatures().get(
        QUERYREFERINGOBJECTSTYPE_MAXRESULTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Parameter</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Parameter</b></em>'
   * @generated
   */
  public EClass getParameterEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PARAMETER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Parameter.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Parameter.name</b></em>'.
   * @generated
   */
  public EAttribute getParameter_Name() {
    return (EAttribute) getParameterEClass().getEAllStructuralFeatures().get(PARAMETER_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Parameter.value</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Parameter.value</b></em>'.
   * @generated
   */
  public EAttribute getParameter_Value() {
    return (EAttribute) getParameterEClass().getEAllStructuralFeatures().get(PARAMETER_VALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Parameter.type</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Parameter.type</b></em>'.
   * @generated
   */
  public EAttribute getParameter_Type() {
    return (EAttribute) getParameterEClass().getEAllStructuralFeatures().get(PARAMETER_TYPE_FEATURE_ID);
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
    case ACTIONTYPE_CLASSIFIER_ID:
      return ActionType.class;
    case DOCUMENTROOT_CLASSIFIER_ID:
      return DocumentRoot.class;
    case QUERYTYPE_CLASSIFIER_ID:
      return QueryType.class;
    case QUERYREFERINGOBJECTSTYPE_CLASSIFIER_ID:
      return QueryReferingObjectsType.class;
    case PARAMETER_CLASSIFIER_ID:
      return Parameter.class;
    }
    throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
  }
}
