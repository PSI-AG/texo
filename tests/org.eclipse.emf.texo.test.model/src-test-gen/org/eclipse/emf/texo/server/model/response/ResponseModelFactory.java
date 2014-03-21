package org.eclipse.emf.texo.server.model.response;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: org.eclipse.emf.texo.server.model.response. It contains
 * code to create instances {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth
 * from their String (XML) representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ResponseModelFactory implements ModelFactory {

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
    case ResponseModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
      return createDocumentRoot();
    case ResponseModelPackage.ERRORTYPE_CLASSIFIER_ID:
      return createErrorType();
    case ResponseModelPackage.RESPONSETYPE_CLASSIFIER_ID:
      return createResponseType();
    case ResponseModelPackage.RESULTTYPE_CLASSIFIER_ID:
      return createResultType();
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
    case ResponseModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
      modelObject = new DocumentRootModelObject();
      break;
    case ResponseModelPackage.ERRORTYPE_CLASSIFIER_ID:
      modelObject = new ErrorTypeModelObject();
      break;
    case ResponseModelPackage.RESPONSETYPE_CLASSIFIER_ID:
      modelObject = new ResponseTypeModelObject();
      break;
    case ResponseModelPackage.RESULTTYPE_CLASSIFIER_ID:
      modelObject = new ResultTypeModelObject();
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
    if (eFeature == ResponseModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
      return new DocumentRootMixedFeatureGroup();
    }
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
    if (eFeature == ResponseModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
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
   * @return an instance of the model object representing the EClass DocumentRoot
   * @generated
   */
  public DocumentRoot createDocumentRoot() {
    return new DocumentRoot();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ErrorType
   * @generated
   */
  public ErrorType createErrorType() {
    return new ErrorType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ResponseType
   * @generated
   */
  public ResponseType createResponseType() {
    return new ResponseType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ResultType
   * @generated
   */
  public ResultType createResultType() {
    return new ResultType();
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
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>DocumentRoot</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DocumentRootModelObject<E extends DocumentRoot> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ResponseModelPackage.INSTANCE.getDocumentRootEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ResponseModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ResponseModelPackage.DOCUMENTROOT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ResponseModelPackage.DOCUMENTROOT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ResponseModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed();
      case ResponseModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
        return getTarget().getXMLNSPrefixMap();
      case ResponseModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
        return getTarget().getXSISchemaLocation();
      case ResponseModelPackage.DOCUMENTROOT_ERROR_FEATURE_ID:
        return getTarget().getError();
      case ResponseModelPackage.DOCUMENTROOT_RESPONSE_FEATURE_ID:
        return getTarget().getResponse();
      case ResponseModelPackage.DOCUMENTROOT_RESULT_FEATURE_ID:
        return getTarget().getResult();
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
      case ResponseModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        getTarget().setMixed((List<DocumentRootMixedFeatureGroup>) value);
        return;
      case ResponseModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
        getTarget().setXMLNSPrefixMap((Map<String, String>) value);
        return;
      case ResponseModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
        getTarget().setXSISchemaLocation((Map<String, String>) value);
        return;
      case ResponseModelPackage.DOCUMENTROOT_ERROR_FEATURE_ID:
        getTarget().setError((ErrorType) value);
        return;
      case ResponseModelPackage.DOCUMENTROOT_RESPONSE_FEATURE_ID:
        getTarget().setResponse((ResponseType) value);
        return;
      case ResponseModelPackage.DOCUMENTROOT_RESULT_FEATURE_ID:
        getTarget().setResult((ResultType) value);
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

      case ResponseModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed().add((DocumentRootMixedFeatureGroup) value);

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

      case ResponseModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ErrorType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ErrorTypeModelObject<E extends ErrorType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ResponseModelPackage.INSTANCE.getErrorTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ResponseModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ResponseModelPackage.ERRORTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ResponseModelPackage.ERRORTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ResponseModelPackage.ERRORTYPE_ERRORCLASS_FEATURE_ID:
        return getTarget().getErrorClass();
      case ResponseModelPackage.ERRORTYPE_MESSAGE_FEATURE_ID:
        return getTarget().getMessage();
      case ResponseModelPackage.ERRORTYPE_STACKTRACE_FEATURE_ID:
        return getTarget().getStackTrace();
      case ResponseModelPackage.ERRORTYPE_CAUSE_FEATURE_ID:
        return getTarget().getCause();
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
      case ResponseModelPackage.ERRORTYPE_ERRORCLASS_FEATURE_ID:
        getTarget().setErrorClass((String) value);
        return;
      case ResponseModelPackage.ERRORTYPE_MESSAGE_FEATURE_ID:
        getTarget().setMessage((String) value);
        return;
      case ResponseModelPackage.ERRORTYPE_STACKTRACE_FEATURE_ID:
        getTarget().setStackTrace((String) value);
        return;
      case ResponseModelPackage.ERRORTYPE_CAUSE_FEATURE_ID:
        getTarget().setCause((ErrorType) value);
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
   * The adapter/wrapper for the EClass '<em><b>ResponseType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ResponseTypeModelObject<E extends ResponseType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ResponseModelPackage.INSTANCE.getResponseTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ResponseModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ResponseModelPackage.RESPONSETYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ResponseModelPackage.RESPONSETYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ResponseModelPackage.RESPONSETYPE_STATUS_FEATURE_ID:
        return getTarget().getStatus();
      case ResponseModelPackage.RESPONSETYPE_STARTROW_FEATURE_ID:
        return getTarget().getStartRow();
      case ResponseModelPackage.RESPONSETYPE_ENDROW_FEATURE_ID:
        return getTarget().getEndRow();
      case ResponseModelPackage.RESPONSETYPE_TOTALROWS_FEATURE_ID:
        return getTarget().getTotalRows();
      case ResponseModelPackage.RESPONSETYPE_DATA_FEATURE_ID:
        return getTarget().getData();
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
      case ResponseModelPackage.RESPONSETYPE_STATUS_FEATURE_ID:
        getTarget().setStatus((String) value);
        return;
      case ResponseModelPackage.RESPONSETYPE_STARTROW_FEATURE_ID:
        getTarget().setStartRow((Long) value);
        return;
      case ResponseModelPackage.RESPONSETYPE_ENDROW_FEATURE_ID:
        getTarget().setEndRow((Long) value);
        return;
      case ResponseModelPackage.RESPONSETYPE_TOTALROWS_FEATURE_ID:
        getTarget().setTotalRows((Long) value);
        return;
      case ResponseModelPackage.RESPONSETYPE_DATA_FEATURE_ID:
        getTarget().setData((List<Object>) value);
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

      case ResponseModelPackage.RESPONSETYPE_DATA_FEATURE_ID:
        return getTarget().addToData(value);
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

      case ResponseModelPackage.RESPONSETYPE_DATA_FEATURE_ID:
        return getTarget().removeFromData((Object) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ResultType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ResultTypeModelObject<E extends ResultType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ResponseModelPackage.INSTANCE.getResultTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ResponseModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ResponseModelPackage.RESULTTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ResponseModelPackage.RESULTTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ResponseModelPackage.RESULTTYPE_UPDATED_FEATURE_ID:
        return getTarget().getUpdated();
      case ResponseModelPackage.RESULTTYPE_INSERTED_FEATURE_ID:
        return getTarget().getInserted();
      case ResponseModelPackage.RESULTTYPE_DELETED_FEATURE_ID:
        return getTarget().getDeleted();
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
      case ResponseModelPackage.RESULTTYPE_UPDATED_FEATURE_ID:
        getTarget().setUpdated((List<Object>) value);
        return;
      case ResponseModelPackage.RESULTTYPE_INSERTED_FEATURE_ID:
        getTarget().setInserted((List<Object>) value);
        return;
      case ResponseModelPackage.RESULTTYPE_DELETED_FEATURE_ID:
        getTarget().setDeleted((List<Object>) value);
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

      case ResponseModelPackage.RESULTTYPE_UPDATED_FEATURE_ID:
        return getTarget().addToUpdated(value);

      case ResponseModelPackage.RESULTTYPE_INSERTED_FEATURE_ID:
        return getTarget().addToInserted(value);

      case ResponseModelPackage.RESULTTYPE_DELETED_FEATURE_ID:
        return getTarget().addToDeleted(value);
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

      case ResponseModelPackage.RESULTTYPE_UPDATED_FEATURE_ID:
        return getTarget().removeFromUpdated((Object) value);

      case ResponseModelPackage.RESULTTYPE_INSERTED_FEATURE_ID:
        return getTarget().removeFromInserted((Object) value);

      case ResponseModelPackage.RESULTTYPE_DELETED_FEATURE_ID:
        return getTarget().removeFromDeleted((Object) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The wrapper/adapter for the Feature Group '<em><b>DocumentRoot.mixed</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
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
      case ERROR:
        return ResponseModelPackage.INSTANCE.getDocumentRoot_Error();
      case RESPONSE:
        return ResponseModelPackage.INSTANCE.getDocumentRoot_Response();
      case RESULT:
        return ResponseModelPackage.INSTANCE.getDocumentRoot_Result();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
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

      final EClass eClass = ResponseModelPackage.INSTANCE.getDocumentRootEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case ResponseModelPackage.DOCUMENTROOT_ERROR_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.ERROR);
        return;
      case ResponseModelPackage.DOCUMENTROOT_RESPONSE_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.RESPONSE);
        return;
      case ResponseModelPackage.DOCUMENTROOT_RESULT_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.RESULT);
        return;
      default:
        throw new IllegalArgumentException("EStructuralFeature " + eStructuralFeature + " not supported here");
      }
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