package org.eclipse.emf.texo.server.model.request;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.AbstractModelObject;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: org.eclipse.emf.texo.server.model.request. It contains
 * code to create instances {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth
 * from their String (XML) representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class RequestModelFactory implements ModelFactory {

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
    case RequestModelPackage.ACTIONTYPE_CLASSIFIER_ID:
      return createActionType();
    case RequestModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
      return createDocumentRoot();
    case RequestModelPackage.QUERYTYPE_CLASSIFIER_ID:
      return createQueryType();
    case RequestModelPackage.QUERYREFERINGOBJECTSTYPE_CLASSIFIER_ID:
      return createQueryReferingObjectsType();
    case RequestModelPackage.PARAMETER_CLASSIFIER_ID:
      return createParameter();
    }
    throw new IllegalArgumentException("The EClass '" + eClass.getName() + "' is not a valid EClass for this EPackage");
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
    case RequestModelPackage.ACTIONTYPE_CLASSIFIER_ID:
      modelObject = new ActionTypeModelObject();
      break;
    case RequestModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
      modelObject = new DocumentRootModelObject();
      break;
    case RequestModelPackage.QUERYTYPE_CLASSIFIER_ID:
      modelObject = new QueryTypeModelObject();
      break;
    case RequestModelPackage.QUERYREFERINGOBJECTSTYPE_CLASSIFIER_ID:
      modelObject = new QueryReferingObjectsTypeModelObject();
      break;
    case RequestModelPackage.PARAMETER_CLASSIFIER_ID:
      modelObject = new ParameterModelObject();
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
   * @param eStructuralFeature
   *          the feature map feature
   * @return the pojo feature map entry
   * @generated
   */
  public Object createFeatureMapEntry(EStructuralFeature eFeature) {
    if (eFeature == RequestModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
      return new DocumentRootMixedFeatureGroup();
    }
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}. If the feature map entry is null then a
   * new one is created and <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eStructuralFeature
   *          the feature map feature of the object
   * @param adaptee
   *          the pojo feature map entry being wrapped/adapted
   * @return the wrapper {@link ModelFeatureMapEntry}
   * @generated
   */
  public ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature, Object adaptee) {
    if (eFeature == RequestModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
      final DocumentRootMixedFeatureGroupModelFeatureMapEntry<DocumentRootMixedFeatureGroup> entry = new DocumentRootMixedFeatureGroupModelFeatureMapEntry<DocumentRootMixedFeatureGroup>();
      entry.setTarget((DocumentRootMixedFeatureGroup) adaptee);
      return entry;
    }
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ActionType
   * @generated
   */
  public ActionType createActionType() {
    return new ActionType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DocumentRoot
   * @generated
   */
  public DocumentRoot createDocumentRoot() {
    return new DocumentRoot();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass QueryType
   * @generated
   */
  public QueryType createQueryType() {
    return new QueryType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass QueryReferingObjectsType
   * @generated
   */
  public QueryReferingObjectsType createQueryReferingObjectsType() {
    return new QueryReferingObjectsType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Parameter
   * @generated
   */
  public Parameter createParameter() {
    return new Parameter();
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
    }
    throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
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
    }
    throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ActionType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static class ActionTypeModelObject<E extends ActionType> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return RequestModelPackage.INSTANCE.getActionTypeEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return RequestModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RequestModelPackage.ACTIONTYPE_UPDATE_FEATURE_ID:
        return getTarget().getUpdate();
      case RequestModelPackage.ACTIONTYPE_INSERT_FEATURE_ID:
        return getTarget().getInsert();
      case RequestModelPackage.ACTIONTYPE_DELETE_FEATURE_ID:
        return getTarget().getDelete();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RequestModelPackage.ACTIONTYPE_UPDATE_FEATURE_ID:
        getTarget().setUpdate((List<Object>) value);
        return;
      case RequestModelPackage.ACTIONTYPE_INSERT_FEATURE_ID:
        getTarget().setInsert((List<Object>) value);
        return;
      case RequestModelPackage.ACTIONTYPE_DELETE_FEATURE_ID:
        getTarget().setDelete((List<Object>) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case RequestModelPackage.ACTIONTYPE_UPDATE_FEATURE_ID:
        return getTarget().getUpdate().add(value);

      case RequestModelPackage.ACTIONTYPE_INSERT_FEATURE_ID:
        return getTarget().getInsert().add(value);

      case RequestModelPackage.ACTIONTYPE_DELETE_FEATURE_ID:
        return getTarget().getDelete().add(value);
      }
      return super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case RequestModelPackage.ACTIONTYPE_UPDATE_FEATURE_ID:
        return getTarget().getUpdate().remove(value);

      case RequestModelPackage.ACTIONTYPE_INSERT_FEATURE_ID:
        return getTarget().getInsert().remove(value);

      case RequestModelPackage.ACTIONTYPE_DELETE_FEATURE_ID:
        return getTarget().getDelete().remove(value);
      }
      return super.eRemoveFrom(eStructuralFeature, value);
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>DocumentRoot</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static class DocumentRootModelObject<E extends DocumentRoot> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return RequestModelPackage.INSTANCE.getDocumentRootEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return RequestModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RequestModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed();
      case RequestModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
        return getTarget().getXMLNSPrefixMap();
      case RequestModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
        return getTarget().getXSISchemaLocation();
      case RequestModelPackage.DOCUMENTROOT_ACTION_FEATURE_ID:
        return getTarget().getAction();
      case RequestModelPackage.DOCUMENTROOT_QUERY_FEATURE_ID:
        return getTarget().getQuery();
      case RequestModelPackage.DOCUMENTROOT_QUERYREFERINGOBJECTS_FEATURE_ID:
        return getTarget().getQueryReferingObjects();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RequestModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        getTarget().setMixed((List<DocumentRootMixedFeatureGroup>) value);
        return;
      case RequestModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
        getTarget().setXMLNSPrefixMap((Map<String, String>) value);
        return;
      case RequestModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
        getTarget().setXSISchemaLocation((Map<String, String>) value);
        return;
      case RequestModelPackage.DOCUMENTROOT_ACTION_FEATURE_ID:
        getTarget().setAction((ActionType) value);
        return;
      case RequestModelPackage.DOCUMENTROOT_QUERY_FEATURE_ID:
        getTarget().setQuery((QueryType) value);
        return;
      case RequestModelPackage.DOCUMENTROOT_QUERYREFERINGOBJECTS_FEATURE_ID:
        getTarget().setQueryReferingObjects((QueryReferingObjectsType) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case RequestModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed().add((DocumentRootMixedFeatureGroup) value);

      }
      return super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case RequestModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed().remove(value);

      }
      return super.eRemoveFrom(eStructuralFeature, value);
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>QueryType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static class QueryTypeModelObject<E extends QueryType> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return RequestModelPackage.INSTANCE.getQueryTypeEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return RequestModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RequestModelPackage.QUERYTYPE_NAMEDQUERY_FEATURE_ID:
        return getTarget().getNamedQuery();
      case RequestModelPackage.QUERYTYPE_QUERY_FEATURE_ID:
        return getTarget().getQuery();
      case RequestModelPackage.QUERYTYPE_PARAMETERS_FEATURE_ID:
        return getTarget().getParameters();
      case RequestModelPackage.QUERYTYPE_FIRSTRESULT_FEATURE_ID:
        return getTarget().getFirstResult();
      case RequestModelPackage.QUERYTYPE_MAXRESULTS_FEATURE_ID:
        return getTarget().getMaxResults();
      case RequestModelPackage.QUERYTYPE_DOCOUNT_FEATURE_ID:
        return getTarget().isDoCount();
      case RequestModelPackage.QUERYTYPE_COUNTOPERATION_FEATURE_ID:
        return getTarget().isCountOperation();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RequestModelPackage.QUERYTYPE_NAMEDQUERY_FEATURE_ID:
        getTarget().setNamedQuery((String) value);
        return;
      case RequestModelPackage.QUERYTYPE_QUERY_FEATURE_ID:
        getTarget().setQuery((String) value);
        return;
      case RequestModelPackage.QUERYTYPE_PARAMETERS_FEATURE_ID:
        getTarget().setParameters((List<Parameter>) value);
        return;
      case RequestModelPackage.QUERYTYPE_FIRSTRESULT_FEATURE_ID:
        getTarget().setFirstResult((Integer) value);
        return;
      case RequestModelPackage.QUERYTYPE_MAXRESULTS_FEATURE_ID:
        getTarget().setMaxResults((Integer) value);
        return;
      case RequestModelPackage.QUERYTYPE_DOCOUNT_FEATURE_ID:
        getTarget().setDoCount((Boolean) value);
        return;
      case RequestModelPackage.QUERYTYPE_COUNTOPERATION_FEATURE_ID:
        getTarget().setCountOperation((Boolean) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case RequestModelPackage.QUERYTYPE_PARAMETERS_FEATURE_ID:
        return getTarget().getParameters().add((Parameter) value);

      }
      return super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case RequestModelPackage.QUERYTYPE_PARAMETERS_FEATURE_ID:
        return getTarget().getParameters().remove(value);

      }
      return super.eRemoveFrom(eStructuralFeature, value);
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>QueryReferingObjectsType</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static class QueryReferingObjectsTypeModelObject<E extends QueryReferingObjectsType> extends
      AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return RequestModelPackage.INSTANCE.getQueryReferingObjectsTypeEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return RequestModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RequestModelPackage.QUERYREFERINGOBJECTSTYPE_TARGETURI_FEATURE_ID:
        return getTarget().getTargetUri();
      case RequestModelPackage.QUERYREFERINGOBJECTSTYPE_INCLUDECONTAINERREFERENCES_FEATURE_ID:
        return getTarget().getIncludeContainerReferences();
      case RequestModelPackage.QUERYREFERINGOBJECTSTYPE_MAXRESULTS_FEATURE_ID:
        return getTarget().getMaxResults();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RequestModelPackage.QUERYREFERINGOBJECTSTYPE_TARGETURI_FEATURE_ID:
        getTarget().setTargetUri((String) value);
        return;
      case RequestModelPackage.QUERYREFERINGOBJECTSTYPE_INCLUDECONTAINERREFERENCES_FEATURE_ID:
        getTarget().setIncludeContainerReferences((Boolean) value);
        return;
      case RequestModelPackage.QUERYREFERINGOBJECTSTYPE_MAXRESULTS_FEATURE_ID:
        getTarget().setMaxResults((Integer) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      return super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      return super.eRemoveFrom(eStructuralFeature, value);
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Parameter</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static class ParameterModelObject<E extends Parameter> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return RequestModelPackage.INSTANCE.getParameterEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return RequestModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RequestModelPackage.PARAMETER_NAME_FEATURE_ID:
        return getTarget().getName();
      case RequestModelPackage.PARAMETER_VALUE_FEATURE_ID:
        return getTarget().getValue();
      case RequestModelPackage.PARAMETER_TYPE_FEATURE_ID:
        return getTarget().getType();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case RequestModelPackage.PARAMETER_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case RequestModelPackage.PARAMETER_VALUE_FEATURE_ID:
        getTarget().setValue(value);
        return;
      case RequestModelPackage.PARAMETER_TYPE_FEATURE_ID:
        getTarget().setType((String) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      return super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      return super.eRemoveFrom(eStructuralFeature, value);
    }
  }

  /**
   * The wrapper/adapter for the Feature Group '<em><b>DocumentRoot.mixed</b></em>'.
   * 
   * @generated
   */
  public static class DocumentRootMixedFeatureGroupModelFeatureMapEntry<E extends DocumentRootMixedFeatureGroup>
      extends AbstractModelFeatureMapEntry<DocumentRootMixedFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case TEXT:
        return XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text();
      case CDATA:
        return XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA();
      case COMMENT:
        return XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment();
      case ACTION:
        return RequestModelPackage.INSTANCE.getDocumentRoot_Action();
      case QUERY:
        return RequestModelPackage.INSTANCE.getDocumentRoot_Query();
      case QUERYREFERINGOBJECTS:
        return RequestModelPackage.INSTANCE.getDocumentRoot_QueryReferingObjects();
      }
      throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {
      if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text()) {
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.TEXT);
        return;
      } else if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA()) {
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.CDATA);
        return;
      } else if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment()) {
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.COMMENT);
        return;
      }

      final EClass eClass = RequestModelPackage.INSTANCE.getDocumentRootEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case RequestModelPackage.DOCUMENTROOT_ACTION_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.ACTION);
        return;
      case RequestModelPackage.DOCUMENTROOT_QUERY_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.QUERY);
        return;
      case RequestModelPackage.DOCUMENTROOT_QUERYREFERINGOBJECTS_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.QUERYREFERINGOBJECTS);
        return;
      }
      throw new IllegalArgumentException("EStructuralFeature " + eStructuralFeature + " not supported here");
    }

    /**
     * @generated
     */
    public Object getValue() {
      return getTarget().getValue();
    }

    /**
     * @generated
     */
    public void setValue(final Object value) {
      getTarget().setValue(getTarget().getFeature(), value);
    }
  }

}
