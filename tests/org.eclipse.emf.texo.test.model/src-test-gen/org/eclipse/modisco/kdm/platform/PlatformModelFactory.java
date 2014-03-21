package org.eclipse.modisco.kdm.platform;

import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.modisco.kdm.action.ActionElement;
import org.eclipse.modisco.kdm.action.ActionModelFactory;
import org.eclipse.modisco.kdm.code.AbstractCodeElement;
import org.eclipse.modisco.kdm.code.CodeItem;
import org.eclipse.modisco.kdm.code.Module;
import org.eclipse.modisco.kdm.core.CoreModelFactory;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.kdm.KdmModelFactory;
import org.eclipse.modisco.kdm.source.SourceRef;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: platform. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PlatformModelFactory implements ModelFactory {

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
    case PlatformModelPackage.PLATFORMMODEL_CLASSIFIER_ID:
      return createPlatformModel();
    case PlatformModelPackage.RESOURCETYPE_CLASSIFIER_ID:
      return createResourceType();
    case PlatformModelPackage.NAMINGRESOURCE_CLASSIFIER_ID:
      return createNamingResource();
    case PlatformModelPackage.MARSHALLEDRESOURCE_CLASSIFIER_ID:
      return createMarshalledResource();
    case PlatformModelPackage.MESSAGINGRESOURCE_CLASSIFIER_ID:
      return createMessagingResource();
    case PlatformModelPackage.FILERESOURCE_CLASSIFIER_ID:
      return createFileResource();
    case PlatformModelPackage.EXECUTIONRESOURCE_CLASSIFIER_ID:
      return createExecutionResource();
    case PlatformModelPackage.LOCKRESOURCE_CLASSIFIER_ID:
      return createLockResource();
    case PlatformModelPackage.STREAMRESOURCE_CLASSIFIER_ID:
      return createStreamResource();
    case PlatformModelPackage.DATAMANAGER_CLASSIFIER_ID:
      return createDataManager();
    case PlatformModelPackage.PLATFORMEVENT_CLASSIFIER_ID:
      return createPlatformEvent();
    case PlatformModelPackage.PLATFORMACTION_CLASSIFIER_ID:
      return createPlatformAction();
    case PlatformModelPackage.EXTERNALACTOR_CLASSIFIER_ID:
      return createExternalActor();
    case PlatformModelPackage.BINDSTO_CLASSIFIER_ID:
      return createBindsTo();
    case PlatformModelPackage.REQUIRES_CLASSIFIER_ID:
      return createRequires();
    case PlatformModelPackage.DEPLOYEDCOMPONENT_CLASSIFIER_ID:
      return createDeployedComponent();
    case PlatformModelPackage.MANAGESRESOURCE_CLASSIFIER_ID:
      return createManagesResource();
    case PlatformModelPackage.READSRESOURCE_CLASSIFIER_ID:
      return createReadsResource();
    case PlatformModelPackage.WRITESRESOURCE_CLASSIFIER_ID:
      return createWritesResource();
    case PlatformModelPackage.DEFINEDBY_CLASSIFIER_ID:
      return createDefinedBy();
    case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_CLASSIFIER_ID:
      return createDeployedSoftwareSystem();
    case PlatformModelPackage.MACHINE_CLASSIFIER_ID:
      return createMachine();
    case PlatformModelPackage.DEPLOYEDRESOURCE_CLASSIFIER_ID:
      return createDeployedResource();
    case PlatformModelPackage.RUNTIMERESOURCE_CLASSIFIER_ID:
      return createRuntimeResource();
    case PlatformModelPackage.PROCESS_CLASSIFIER_ID:
      return createProcess();
    case PlatformModelPackage.THREAD_CLASSIFIER_ID:
      return createThread();
    case PlatformModelPackage.LOADS_CLASSIFIER_ID:
      return createLoads();
    case PlatformModelPackage.SPAWNS_CLASSIFIER_ID:
      return createSpawns();
    case PlatformModelPackage.PLATFORMELEMENT_CLASSIFIER_ID:
      return createPlatformElement();
    case PlatformModelPackage.PLATFORMRELATIONSHIP_CLASSIFIER_ID:
      return createPlatformRelationship();
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
    case PlatformModelPackage.PLATFORMMODEL_CLASSIFIER_ID:
      modelObject = new PlatformModelModelObject();
      break;
    case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_CLASSIFIER_ID:
      modelObject = new AbstractPlatformElementModelObject();
      break;
    case PlatformModelPackage.ABSTRACTPLATFORMRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new AbstractPlatformRelationshipModelObject();
      break;
    case PlatformModelPackage.RESOURCETYPE_CLASSIFIER_ID:
      modelObject = new ResourceTypeModelObject();
      break;
    case PlatformModelPackage.NAMINGRESOURCE_CLASSIFIER_ID:
      modelObject = new NamingResourceModelObject();
      break;
    case PlatformModelPackage.MARSHALLEDRESOURCE_CLASSIFIER_ID:
      modelObject = new MarshalledResourceModelObject();
      break;
    case PlatformModelPackage.MESSAGINGRESOURCE_CLASSIFIER_ID:
      modelObject = new MessagingResourceModelObject();
      break;
    case PlatformModelPackage.FILERESOURCE_CLASSIFIER_ID:
      modelObject = new FileResourceModelObject();
      break;
    case PlatformModelPackage.EXECUTIONRESOURCE_CLASSIFIER_ID:
      modelObject = new ExecutionResourceModelObject();
      break;
    case PlatformModelPackage.LOCKRESOURCE_CLASSIFIER_ID:
      modelObject = new LockResourceModelObject();
      break;
    case PlatformModelPackage.STREAMRESOURCE_CLASSIFIER_ID:
      modelObject = new StreamResourceModelObject();
      break;
    case PlatformModelPackage.DATAMANAGER_CLASSIFIER_ID:
      modelObject = new DataManagerModelObject();
      break;
    case PlatformModelPackage.PLATFORMEVENT_CLASSIFIER_ID:
      modelObject = new PlatformEventModelObject();
      break;
    case PlatformModelPackage.PLATFORMACTION_CLASSIFIER_ID:
      modelObject = new PlatformActionModelObject();
      break;
    case PlatformModelPackage.EXTERNALACTOR_CLASSIFIER_ID:
      modelObject = new ExternalActorModelObject();
      break;
    case PlatformModelPackage.BINDSTO_CLASSIFIER_ID:
      modelObject = new BindsToModelObject();
      break;
    case PlatformModelPackage.REQUIRES_CLASSIFIER_ID:
      modelObject = new RequiresModelObject();
      break;
    case PlatformModelPackage.DEPLOYEDCOMPONENT_CLASSIFIER_ID:
      modelObject = new DeployedComponentModelObject();
      break;
    case PlatformModelPackage.MANAGESRESOURCE_CLASSIFIER_ID:
      modelObject = new ManagesResourceModelObject();
      break;
    case PlatformModelPackage.READSRESOURCE_CLASSIFIER_ID:
      modelObject = new ReadsResourceModelObject();
      break;
    case PlatformModelPackage.WRITESRESOURCE_CLASSIFIER_ID:
      modelObject = new WritesResourceModelObject();
      break;
    case PlatformModelPackage.DEFINEDBY_CLASSIFIER_ID:
      modelObject = new DefinedByModelObject();
      break;
    case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_CLASSIFIER_ID:
      modelObject = new DeployedSoftwareSystemModelObject();
      break;
    case PlatformModelPackage.MACHINE_CLASSIFIER_ID:
      modelObject = new MachineModelObject();
      break;
    case PlatformModelPackage.DEPLOYEDRESOURCE_CLASSIFIER_ID:
      modelObject = new DeployedResourceModelObject();
      break;
    case PlatformModelPackage.RUNTIMERESOURCE_CLASSIFIER_ID:
      modelObject = new RuntimeResourceModelObject();
      break;
    case PlatformModelPackage.PROCESS_CLASSIFIER_ID:
      modelObject = new ProcessModelObject();
      break;
    case PlatformModelPackage.THREAD_CLASSIFIER_ID:
      modelObject = new ThreadModelObject();
      break;
    case PlatformModelPackage.LOADS_CLASSIFIER_ID:
      modelObject = new LoadsModelObject();
      break;
    case PlatformModelPackage.SPAWNS_CLASSIFIER_ID:
      modelObject = new SpawnsModelObject();
      break;
    case PlatformModelPackage.PLATFORMELEMENT_CLASSIFIER_ID:
      modelObject = new PlatformElementModelObject();
      break;
    case PlatformModelPackage.PLATFORMRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new PlatformRelationshipModelObject();
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
   * @return an instance of the model object representing the EClass PlatformModel
   * @generated
   */
  public PlatformModel createPlatformModel() {
    return new PlatformModel();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ResourceType
   * @generated
   */
  public ResourceType createResourceType() {
    return new ResourceType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass NamingResource
   * @generated
   */
  public NamingResource createNamingResource() {
    return new NamingResource();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass MarshalledResource
   * @generated
   */
  public MarshalledResource createMarshalledResource() {
    return new MarshalledResource();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass MessagingResource
   * @generated
   */
  public MessagingResource createMessagingResource() {
    return new MessagingResource();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass FileResource
   * @generated
   */
  public FileResource createFileResource() {
    return new FileResource();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ExecutionResource
   * @generated
   */
  public ExecutionResource createExecutionResource() {
    return new ExecutionResource();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass LockResource
   * @generated
   */
  public LockResource createLockResource() {
    return new LockResource();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass StreamResource
   * @generated
   */
  public StreamResource createStreamResource() {
    return new StreamResource();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DataManager
   * @generated
   */
  public DataManager createDataManager() {
    return new DataManager();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PlatformEvent
   * @generated
   */
  public PlatformEvent createPlatformEvent() {
    return new PlatformEvent();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PlatformAction
   * @generated
   */
  public PlatformAction createPlatformAction() {
    return new PlatformAction();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ExternalActor
   * @generated
   */
  public ExternalActor createExternalActor() {
    return new ExternalActor();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BindsTo
   * @generated
   */
  public BindsTo createBindsTo() {
    return new BindsTo();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Requires
   * @generated
   */
  public Requires createRequires() {
    return new Requires();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DeployedComponent
   * @generated
   */
  public DeployedComponent createDeployedComponent() {
    return new DeployedComponent();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ManagesResource
   * @generated
   */
  public ManagesResource createManagesResource() {
    return new ManagesResource();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ReadsResource
   * @generated
   */
  public ReadsResource createReadsResource() {
    return new ReadsResource();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass WritesResource
   * @generated
   */
  public WritesResource createWritesResource() {
    return new WritesResource();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DefinedBy
   * @generated
   */
  public DefinedBy createDefinedBy() {
    return new DefinedBy();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DeployedSoftwareSystem
   * @generated
   */
  public DeployedSoftwareSystem createDeployedSoftwareSystem() {
    return new DeployedSoftwareSystem();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Machine
   * @generated
   */
  public Machine createMachine() {
    return new Machine();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DeployedResource
   * @generated
   */
  public DeployedResource createDeployedResource() {
    return new DeployedResource();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RuntimeResource
   * @generated
   */
  public RuntimeResource createRuntimeResource() {
    return new RuntimeResource();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Process
   * @generated
   */
  public Process createProcess() {
    return new Process();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Thread
   * @generated
   */
  public Thread createThread() {
    return new Thread();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Loads
   * @generated
   */
  public Loads createLoads() {
    return new Loads();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Spawns
   * @generated
   */
  public Spawns createSpawns() {
    return new Spawns();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PlatformElement
   * @generated
   */
  public PlatformElement createPlatformElement() {
    return new PlatformElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PlatformRelationship
   * @generated
   */
  public PlatformRelationship createPlatformRelationship() {
    return new PlatformRelationship();
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
   * The adapter/wrapper for the EClass '<em><b>PlatformModel</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PlatformModelModelObject<E extends PlatformModel> extends KdmModelFactory.KDMModelModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getPlatformModelEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.PLATFORMMODEL_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.PLATFORMMODEL_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.PLATFORMMODEL_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.PLATFORMMODEL_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.PLATFORMMODEL_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.PLATFORMMODEL_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.PLATFORMMODEL_AUDIT_FEATURE_ID:
        return getTarget().getAudit();
      case PlatformModelPackage.PLATFORMMODEL_EXTENSION_FEATURE_ID:
        return getTarget().getExtension();
      case PlatformModelPackage.PLATFORMMODEL_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.PLATFORMMODEL_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.PLATFORMMODEL_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
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
      case PlatformModelPackage.PLATFORMMODEL_PLATFORMELEMENT_FEATURE_ID:
        getTarget().setPlatformElement((Set<AbstractPlatformElement>) value);
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

      case PlatformModelPackage.PLATFORMMODEL_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().addToPlatformElement((AbstractPlatformElement) value);
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

      case PlatformModelPackage.PLATFORMMODEL_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().removeFromPlatformElement((AbstractPlatformElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractPlatformElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractPlatformElementModelObject<E extends AbstractPlatformElement> extends
      CoreModelFactory.KDMEntityModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getAbstractPlatformElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
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
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_SOURCE_FEATURE_ID:
        getTarget().setSource((Set<SourceRef>) value);
        return;
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_PLATFORMRELATION_FEATURE_ID:
        getTarget().setPlatformRelation((Set<AbstractPlatformRelationship>) value);
        return;
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_ABSTRACTION_FEATURE_ID:
        getTarget().setAbstraction((List<ActionElement>) value);
        return;
      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_IMPLEMENTATION_FEATURE_ID:
        getTarget().setImplementation((Set<AbstractCodeElement>) value);
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

      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_SOURCE_FEATURE_ID:
        return getTarget().addToSource((SourceRef) value);

      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_PLATFORMRELATION_FEATURE_ID:
        return getTarget().addToPlatformRelation((AbstractPlatformRelationship) value);

      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().addToAbstraction((ActionElement) value);

      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().addToImplementation((AbstractCodeElement) value);
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

      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_SOURCE_FEATURE_ID:
        return getTarget().removeFromSource((SourceRef) value);

      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_PLATFORMRELATION_FEATURE_ID:
        return getTarget().removeFromPlatformRelation((AbstractPlatformRelationship) value);

      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().removeFromAbstraction((ActionElement) value);

      case PlatformModelPackage.ABSTRACTPLATFORMELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().removeFromImplementation((AbstractCodeElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractPlatformRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractPlatformRelationshipModelObject<E extends AbstractPlatformRelationship> extends
      CoreModelFactory.KDMRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getAbstractPlatformRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.ABSTRACTPLATFORMRELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.ABSTRACTPLATFORMRELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.ABSTRACTPLATFORMRELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.ABSTRACTPLATFORMRELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.ABSTRACTPLATFORMRELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.ABSTRACTPLATFORMRELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
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
   * The adapter/wrapper for the EClass '<em><b>ResourceType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ResourceTypeModelObject<E extends ResourceType> extends AbstractPlatformElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getResourceTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.RESOURCETYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.RESOURCETYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.RESOURCETYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.RESOURCETYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.RESOURCETYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.RESOURCETYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.RESOURCETYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.RESOURCETYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.RESOURCETYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.RESOURCETYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.RESOURCETYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.RESOURCETYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.RESOURCETYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.RESOURCETYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.RESOURCETYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.RESOURCETYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.RESOURCETYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.RESOURCETYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.RESOURCETYPE_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.RESOURCETYPE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.RESOURCETYPE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.RESOURCETYPE_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
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
      case PlatformModelPackage.RESOURCETYPE_PLATFORMELEMENT_FEATURE_ID:
        getTarget().setPlatformElement((Set<AbstractPlatformElement>) value);
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

      case PlatformModelPackage.RESOURCETYPE_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().addToPlatformElement((AbstractPlatformElement) value);
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

      case PlatformModelPackage.RESOURCETYPE_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().removeFromPlatformElement((AbstractPlatformElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>NamingResource</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class NamingResourceModelObject<E extends NamingResource> extends ResourceTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getNamingResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.NAMINGRESOURCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.NAMINGRESOURCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.NAMINGRESOURCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.NAMINGRESOURCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.NAMINGRESOURCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.NAMINGRESOURCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.NAMINGRESOURCE_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.NAMINGRESOURCE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.NAMINGRESOURCE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.NAMINGRESOURCE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.NAMINGRESOURCE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.NAMINGRESOURCE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.NAMINGRESOURCE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.NAMINGRESOURCE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.NAMINGRESOURCE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.NAMINGRESOURCE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.NAMINGRESOURCE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.NAMINGRESOURCE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.NAMINGRESOURCE_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.NAMINGRESOURCE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.NAMINGRESOURCE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.NAMINGRESOURCE_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
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
   * The adapter/wrapper for the EClass '<em><b>MarshalledResource</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MarshalledResourceModelObject<E extends MarshalledResource> extends ResourceTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getMarshalledResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.MARSHALLEDRESOURCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.MARSHALLEDRESOURCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.MARSHALLEDRESOURCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.MARSHALLEDRESOURCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.MARSHALLEDRESOURCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.MARSHALLEDRESOURCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.MARSHALLEDRESOURCE_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.MARSHALLEDRESOURCE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.MARSHALLEDRESOURCE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.MARSHALLEDRESOURCE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.MARSHALLEDRESOURCE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.MARSHALLEDRESOURCE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.MARSHALLEDRESOURCE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.MARSHALLEDRESOURCE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.MARSHALLEDRESOURCE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.MARSHALLEDRESOURCE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.MARSHALLEDRESOURCE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.MARSHALLEDRESOURCE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.MARSHALLEDRESOURCE_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.MARSHALLEDRESOURCE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.MARSHALLEDRESOURCE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.MARSHALLEDRESOURCE_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
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
   * The adapter/wrapper for the EClass '<em><b>MessagingResource</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MessagingResourceModelObject<E extends MessagingResource> extends ResourceTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getMessagingResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.MESSAGINGRESOURCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.MESSAGINGRESOURCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.MESSAGINGRESOURCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.MESSAGINGRESOURCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.MESSAGINGRESOURCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.MESSAGINGRESOURCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.MESSAGINGRESOURCE_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.MESSAGINGRESOURCE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.MESSAGINGRESOURCE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.MESSAGINGRESOURCE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.MESSAGINGRESOURCE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.MESSAGINGRESOURCE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.MESSAGINGRESOURCE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.MESSAGINGRESOURCE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.MESSAGINGRESOURCE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.MESSAGINGRESOURCE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.MESSAGINGRESOURCE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.MESSAGINGRESOURCE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.MESSAGINGRESOURCE_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.MESSAGINGRESOURCE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.MESSAGINGRESOURCE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.MESSAGINGRESOURCE_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
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
   * The adapter/wrapper for the EClass '<em><b>FileResource</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class FileResourceModelObject<E extends FileResource> extends ResourceTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getFileResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.FILERESOURCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.FILERESOURCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.FILERESOURCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.FILERESOURCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.FILERESOURCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.FILERESOURCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.FILERESOURCE_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.FILERESOURCE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.FILERESOURCE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.FILERESOURCE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.FILERESOURCE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.FILERESOURCE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.FILERESOURCE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.FILERESOURCE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.FILERESOURCE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.FILERESOURCE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.FILERESOURCE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.FILERESOURCE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.FILERESOURCE_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.FILERESOURCE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.FILERESOURCE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.FILERESOURCE_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
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
   * The adapter/wrapper for the EClass '<em><b>ExecutionResource</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ExecutionResourceModelObject<E extends ExecutionResource> extends ResourceTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getExecutionResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.EXECUTIONRESOURCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.EXECUTIONRESOURCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.EXECUTIONRESOURCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.EXECUTIONRESOURCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.EXECUTIONRESOURCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.EXECUTIONRESOURCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.EXECUTIONRESOURCE_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.EXECUTIONRESOURCE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.EXECUTIONRESOURCE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.EXECUTIONRESOURCE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.EXECUTIONRESOURCE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.EXECUTIONRESOURCE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.EXECUTIONRESOURCE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.EXECUTIONRESOURCE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.EXECUTIONRESOURCE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.EXECUTIONRESOURCE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.EXECUTIONRESOURCE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.EXECUTIONRESOURCE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.EXECUTIONRESOURCE_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.EXECUTIONRESOURCE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.EXECUTIONRESOURCE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.EXECUTIONRESOURCE_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
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
   * The adapter/wrapper for the EClass '<em><b>LockResource</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class LockResourceModelObject<E extends LockResource> extends ResourceTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getLockResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.LOCKRESOURCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.LOCKRESOURCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.LOCKRESOURCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.LOCKRESOURCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.LOCKRESOURCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.LOCKRESOURCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.LOCKRESOURCE_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.LOCKRESOURCE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.LOCKRESOURCE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.LOCKRESOURCE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.LOCKRESOURCE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.LOCKRESOURCE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.LOCKRESOURCE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.LOCKRESOURCE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.LOCKRESOURCE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.LOCKRESOURCE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.LOCKRESOURCE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.LOCKRESOURCE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.LOCKRESOURCE_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.LOCKRESOURCE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.LOCKRESOURCE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.LOCKRESOURCE_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
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
   * The adapter/wrapper for the EClass '<em><b>StreamResource</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class StreamResourceModelObject<E extends StreamResource> extends ResourceTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getStreamResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.STREAMRESOURCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.STREAMRESOURCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.STREAMRESOURCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.STREAMRESOURCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.STREAMRESOURCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.STREAMRESOURCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.STREAMRESOURCE_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.STREAMRESOURCE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.STREAMRESOURCE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.STREAMRESOURCE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.STREAMRESOURCE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.STREAMRESOURCE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.STREAMRESOURCE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.STREAMRESOURCE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.STREAMRESOURCE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.STREAMRESOURCE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.STREAMRESOURCE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.STREAMRESOURCE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.STREAMRESOURCE_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.STREAMRESOURCE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.STREAMRESOURCE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.STREAMRESOURCE_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
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
   * The adapter/wrapper for the EClass '<em><b>DataManager</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DataManagerModelObject<E extends DataManager> extends ResourceTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getDataManagerEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.DATAMANAGER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.DATAMANAGER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.DATAMANAGER_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.DATAMANAGER_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.DATAMANAGER_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.DATAMANAGER_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.DATAMANAGER_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.DATAMANAGER_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.DATAMANAGER_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.DATAMANAGER_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.DATAMANAGER_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.DATAMANAGER_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.DATAMANAGER_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.DATAMANAGER_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.DATAMANAGER_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.DATAMANAGER_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.DATAMANAGER_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.DATAMANAGER_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.DATAMANAGER_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.DATAMANAGER_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.DATAMANAGER_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.DATAMANAGER_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
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
   * The adapter/wrapper for the EClass '<em><b>PlatformEvent</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PlatformEventModelObject<E extends PlatformEvent> extends ResourceTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getPlatformEventEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.PLATFORMEVENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.PLATFORMEVENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.PLATFORMEVENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.PLATFORMEVENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.PLATFORMEVENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.PLATFORMEVENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.PLATFORMEVENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.PLATFORMEVENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.PLATFORMEVENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.PLATFORMEVENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.PLATFORMEVENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.PLATFORMEVENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.PLATFORMEVENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.PLATFORMEVENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.PLATFORMEVENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.PLATFORMEVENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.PLATFORMEVENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.PLATFORMEVENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.PLATFORMEVENT_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.PLATFORMEVENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.PLATFORMEVENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.PLATFORMEVENT_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
      case PlatformModelPackage.PLATFORMEVENT_KIND_FEATURE_ID:
        return getTarget().getKind();
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
      case PlatformModelPackage.PLATFORMEVENT_KIND_FEATURE_ID:
        getTarget().setKind((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>PlatformAction</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PlatformActionModelObject<E extends PlatformAction> extends AbstractPlatformElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getPlatformActionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.PLATFORMACTION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.PLATFORMACTION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.PLATFORMACTION_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.PLATFORMACTION_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.PLATFORMACTION_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.PLATFORMACTION_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.PLATFORMACTION_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.PLATFORMACTION_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.PLATFORMACTION_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.PLATFORMACTION_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.PLATFORMACTION_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.PLATFORMACTION_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.PLATFORMACTION_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.PLATFORMACTION_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.PLATFORMACTION_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.PLATFORMACTION_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.PLATFORMACTION_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.PLATFORMACTION_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.PLATFORMACTION_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.PLATFORMACTION_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.PLATFORMACTION_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.PLATFORMACTION_KIND_FEATURE_ID:
        return getTarget().getKind();
      case PlatformModelPackage.PLATFORMACTION_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
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
      case PlatformModelPackage.PLATFORMACTION_KIND_FEATURE_ID:
        getTarget().setKind((String) value);
        return;
      case PlatformModelPackage.PLATFORMACTION_PLATFORMELEMENT_FEATURE_ID:
        getTarget().setPlatformElement((Set<PlatformEvent>) value);
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

      case PlatformModelPackage.PLATFORMACTION_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().addToPlatformElement((PlatformEvent) value);
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

      case PlatformModelPackage.PLATFORMACTION_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().removeFromPlatformElement((PlatformEvent) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ExternalActor</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ExternalActorModelObject<E extends ExternalActor> extends PlatformActionModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getExternalActorEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.EXTERNALACTOR_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.EXTERNALACTOR_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.EXTERNALACTOR_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.EXTERNALACTOR_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.EXTERNALACTOR_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.EXTERNALACTOR_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.EXTERNALACTOR_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.EXTERNALACTOR_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.EXTERNALACTOR_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.EXTERNALACTOR_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.EXTERNALACTOR_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.EXTERNALACTOR_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.EXTERNALACTOR_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.EXTERNALACTOR_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.EXTERNALACTOR_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.EXTERNALACTOR_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.EXTERNALACTOR_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.EXTERNALACTOR_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.EXTERNALACTOR_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.EXTERNALACTOR_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.EXTERNALACTOR_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.EXTERNALACTOR_KIND_FEATURE_ID:
        return getTarget().getKind();
      case PlatformModelPackage.EXTERNALACTOR_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
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
   * The adapter/wrapper for the EClass '<em><b>BindsTo</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BindsToModelObject<E extends BindsTo> extends AbstractPlatformRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getBindsToEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.BINDSTO_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.BINDSTO_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.BINDSTO_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.BINDSTO_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.BINDSTO_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.BINDSTO_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.BINDSTO_TO_FEATURE_ID:
        return getTarget().getTo();
      case PlatformModelPackage.BINDSTO_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case PlatformModelPackage.BINDSTO_TO_FEATURE_ID:
        getTarget().setTo((ResourceType) value);
        return;
      case PlatformModelPackage.BINDSTO_FROM_FEATURE_ID:
        getTarget().setFrom((ResourceType) value);
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
   * The adapter/wrapper for the EClass '<em><b>Requires</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RequiresModelObject<E extends Requires> extends AbstractPlatformRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getRequiresEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.REQUIRES_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.REQUIRES_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.REQUIRES_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.REQUIRES_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.REQUIRES_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.REQUIRES_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.REQUIRES_TO_FEATURE_ID:
        return getTarget().getTo();
      case PlatformModelPackage.REQUIRES_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case PlatformModelPackage.REQUIRES_TO_FEATURE_ID:
        getTarget().setTo((AbstractPlatformElement) value);
        return;
      case PlatformModelPackage.REQUIRES_FROM_FEATURE_ID:
        getTarget().setFrom((DeployedComponent) value);
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
   * The adapter/wrapper for the EClass '<em><b>DeployedComponent</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DeployedComponentModelObject<E extends DeployedComponent> extends
      AbstractPlatformElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getDeployedComponentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.DEPLOYEDCOMPONENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.DEPLOYEDCOMPONENT_GROUPEDCODE_FEATURE_ID:
        return getTarget().getGroupedCode();
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
      case PlatformModelPackage.DEPLOYEDCOMPONENT_GROUPEDCODE_FEATURE_ID:
        getTarget().setGroupedCode((Set<Module>) value);
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

      case PlatformModelPackage.DEPLOYEDCOMPONENT_GROUPEDCODE_FEATURE_ID:
        return getTarget().addToGroupedCode((Module) value);
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

      case PlatformModelPackage.DEPLOYEDCOMPONENT_GROUPEDCODE_FEATURE_ID:
        return getTarget().removeFromGroupedCode((Module) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ManagesResource</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ManagesResourceModelObject<E extends ManagesResource> extends
      ActionModelFactory.AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getManagesResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.MANAGESRESOURCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.MANAGESRESOURCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.MANAGESRESOURCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.MANAGESRESOURCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.MANAGESRESOURCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.MANAGESRESOURCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.MANAGESRESOURCE_TO_FEATURE_ID:
        return getTarget().getTo();
      case PlatformModelPackage.MANAGESRESOURCE_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case PlatformModelPackage.MANAGESRESOURCE_TO_FEATURE_ID:
        getTarget().setTo((ResourceType) value);
        return;
      case PlatformModelPackage.MANAGESRESOURCE_FROM_FEATURE_ID:
        getTarget().setFrom((ActionElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>ReadsResource</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ReadsResourceModelObject<E extends ReadsResource> extends
      ActionModelFactory.AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getReadsResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.READSRESOURCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.READSRESOURCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.READSRESOURCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.READSRESOURCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.READSRESOURCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.READSRESOURCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.READSRESOURCE_TO_FEATURE_ID:
        return getTarget().getTo();
      case PlatformModelPackage.READSRESOURCE_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case PlatformModelPackage.READSRESOURCE_TO_FEATURE_ID:
        getTarget().setTo((ResourceType) value);
        return;
      case PlatformModelPackage.READSRESOURCE_FROM_FEATURE_ID:
        getTarget().setFrom((ActionElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>WritesResource</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class WritesResourceModelObject<E extends WritesResource> extends
      ActionModelFactory.AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getWritesResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.WRITESRESOURCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.WRITESRESOURCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.WRITESRESOURCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.WRITESRESOURCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.WRITESRESOURCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.WRITESRESOURCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.WRITESRESOURCE_TO_FEATURE_ID:
        return getTarget().getTo();
      case PlatformModelPackage.WRITESRESOURCE_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case PlatformModelPackage.WRITESRESOURCE_TO_FEATURE_ID:
        getTarget().setTo((ResourceType) value);
        return;
      case PlatformModelPackage.WRITESRESOURCE_FROM_FEATURE_ID:
        getTarget().setFrom((ActionElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>DefinedBy</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DefinedByModelObject<E extends DefinedBy> extends
      ActionModelFactory.AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getDefinedByEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.DEFINEDBY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.DEFINEDBY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.DEFINEDBY_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.DEFINEDBY_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.DEFINEDBY_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.DEFINEDBY_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.DEFINEDBY_TO_FEATURE_ID:
        return getTarget().getTo();
      case PlatformModelPackage.DEFINEDBY_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case PlatformModelPackage.DEFINEDBY_TO_FEATURE_ID:
        getTarget().setTo((CodeItem) value);
        return;
      case PlatformModelPackage.DEFINEDBY_FROM_FEATURE_ID:
        getTarget().setFrom((ActionElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>DeployedSoftwareSystem</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DeployedSoftwareSystemModelObject<E extends DeployedSoftwareSystem> extends
      AbstractPlatformElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getDeployedSoftwareSystemEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_GROUPEDCOMPONENT_FEATURE_ID:
        return getTarget().getGroupedComponent();
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
      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_GROUPEDCOMPONENT_FEATURE_ID:
        getTarget().setGroupedComponent((Set<DeployedComponent>) value);
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

      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_GROUPEDCOMPONENT_FEATURE_ID:
        return getTarget().addToGroupedComponent((DeployedComponent) value);
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

      case PlatformModelPackage.DEPLOYEDSOFTWARESYSTEM_GROUPEDCOMPONENT_FEATURE_ID:
        return getTarget().removeFromGroupedComponent((DeployedComponent) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Machine</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MachineModelObject<E extends Machine> extends AbstractPlatformElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getMachineEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.MACHINE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.MACHINE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.MACHINE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.MACHINE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.MACHINE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.MACHINE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.MACHINE_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.MACHINE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.MACHINE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.MACHINE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.MACHINE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.MACHINE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.MACHINE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.MACHINE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.MACHINE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.MACHINE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.MACHINE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.MACHINE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.MACHINE_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.MACHINE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.MACHINE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.MACHINE_DEPLOYEDCOMPONENT_FEATURE_ID:
        return getTarget().getDeployedComponent();
      case PlatformModelPackage.MACHINE_DEPLOYEDRESOURCE_FEATURE_ID:
        return getTarget().getDeployedResource();
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
      case PlatformModelPackage.MACHINE_DEPLOYEDCOMPONENT_FEATURE_ID:
        getTarget().setDeployedComponent((Set<DeployedComponent>) value);
        return;
      case PlatformModelPackage.MACHINE_DEPLOYEDRESOURCE_FEATURE_ID:
        getTarget().setDeployedResource((Set<DeployedResource>) value);
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

      case PlatformModelPackage.MACHINE_DEPLOYEDCOMPONENT_FEATURE_ID:
        return getTarget().addToDeployedComponent((DeployedComponent) value);

      case PlatformModelPackage.MACHINE_DEPLOYEDRESOURCE_FEATURE_ID:
        return getTarget().addToDeployedResource((DeployedResource) value);
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

      case PlatformModelPackage.MACHINE_DEPLOYEDCOMPONENT_FEATURE_ID:
        return getTarget().removeFromDeployedComponent((DeployedComponent) value);

      case PlatformModelPackage.MACHINE_DEPLOYEDRESOURCE_FEATURE_ID:
        return getTarget().removeFromDeployedResource((DeployedResource) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>DeployedResource</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DeployedResourceModelObject<E extends DeployedResource> extends
      AbstractPlatformElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getDeployedResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.DEPLOYEDRESOURCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.DEPLOYEDRESOURCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.DEPLOYEDRESOURCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.DEPLOYEDRESOURCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.DEPLOYEDRESOURCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.DEPLOYEDRESOURCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.DEPLOYEDRESOURCE_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.DEPLOYEDRESOURCE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.DEPLOYEDRESOURCE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.DEPLOYEDRESOURCE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.DEPLOYEDRESOURCE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.DEPLOYEDRESOURCE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.DEPLOYEDRESOURCE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.DEPLOYEDRESOURCE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.DEPLOYEDRESOURCE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.DEPLOYEDRESOURCE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.DEPLOYEDRESOURCE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.DEPLOYEDRESOURCE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.DEPLOYEDRESOURCE_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.DEPLOYEDRESOURCE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.DEPLOYEDRESOURCE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.DEPLOYEDRESOURCE_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
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
      case PlatformModelPackage.DEPLOYEDRESOURCE_PLATFORMELEMENT_FEATURE_ID:
        getTarget().setPlatformElement((Set<ResourceType>) value);
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

      case PlatformModelPackage.DEPLOYEDRESOURCE_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().addToPlatformElement((ResourceType) value);
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

      case PlatformModelPackage.DEPLOYEDRESOURCE_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().removeFromPlatformElement((ResourceType) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>RuntimeResource</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RuntimeResourceModelObject<E extends RuntimeResource> extends ResourceTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getRuntimeResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.RUNTIMERESOURCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.RUNTIMERESOURCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.RUNTIMERESOURCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.RUNTIMERESOURCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.RUNTIMERESOURCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.RUNTIMERESOURCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.RUNTIMERESOURCE_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.RUNTIMERESOURCE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.RUNTIMERESOURCE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.RUNTIMERESOURCE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.RUNTIMERESOURCE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.RUNTIMERESOURCE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.RUNTIMERESOURCE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.RUNTIMERESOURCE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.RUNTIMERESOURCE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.RUNTIMERESOURCE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.RUNTIMERESOURCE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.RUNTIMERESOURCE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.RUNTIMERESOURCE_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.RUNTIMERESOURCE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.RUNTIMERESOURCE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.RUNTIMERESOURCE_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
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
   * The adapter/wrapper for the EClass '<em><b>Process</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ProcessModelObject<E extends Process> extends RuntimeResourceModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getProcessEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.PROCESS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.PROCESS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.PROCESS_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.PROCESS_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.PROCESS_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.PROCESS_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.PROCESS_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.PROCESS_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.PROCESS_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.PROCESS_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.PROCESS_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.PROCESS_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.PROCESS_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.PROCESS_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.PROCESS_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.PROCESS_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.PROCESS_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.PROCESS_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.PROCESS_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.PROCESS_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.PROCESS_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.PROCESS_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
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
   * The adapter/wrapper for the EClass '<em><b>Thread</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ThreadModelObject<E extends Thread> extends RuntimeResourceModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getThreadEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.THREAD_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.THREAD_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.THREAD_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.THREAD_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.THREAD_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.THREAD_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.THREAD_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.THREAD_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.THREAD_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.THREAD_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.THREAD_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.THREAD_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.THREAD_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.THREAD_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.THREAD_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.THREAD_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.THREAD_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.THREAD_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.THREAD_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.THREAD_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.THREAD_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case PlatformModelPackage.THREAD_PLATFORMELEMENT_FEATURE_ID:
        return getTarget().getPlatformElement();
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
   * The adapter/wrapper for the EClass '<em><b>Loads</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class LoadsModelObject<E extends Loads> extends AbstractPlatformRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getLoadsEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.LOADS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.LOADS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.LOADS_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.LOADS_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.LOADS_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.LOADS_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.LOADS_TO_FEATURE_ID:
        return getTarget().getTo();
      case PlatformModelPackage.LOADS_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case PlatformModelPackage.LOADS_TO_FEATURE_ID:
        getTarget().setTo((DeployedComponent) value);
        return;
      case PlatformModelPackage.LOADS_FROM_FEATURE_ID:
        getTarget().setFrom((ActionElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>Spawns</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SpawnsModelObject<E extends Spawns> extends AbstractPlatformRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getSpawnsEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.SPAWNS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.SPAWNS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.SPAWNS_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.SPAWNS_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.SPAWNS_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.SPAWNS_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.SPAWNS_TO_FEATURE_ID:
        return getTarget().getTo();
      case PlatformModelPackage.SPAWNS_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case PlatformModelPackage.SPAWNS_TO_FEATURE_ID:
        getTarget().setTo((RuntimeResource) value);
        return;
      case PlatformModelPackage.SPAWNS_FROM_FEATURE_ID:
        getTarget().setFrom((ActionElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>PlatformElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PlatformElementModelObject<E extends PlatformElement> extends
      AbstractPlatformElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getPlatformElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.PLATFORMELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.PLATFORMELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.PLATFORMELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.PLATFORMELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.PLATFORMELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.PLATFORMELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.PLATFORMELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case PlatformModelPackage.PLATFORMELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case PlatformModelPackage.PLATFORMELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case PlatformModelPackage.PLATFORMELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case PlatformModelPackage.PLATFORMELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case PlatformModelPackage.PLATFORMELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case PlatformModelPackage.PLATFORMELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case PlatformModelPackage.PLATFORMELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case PlatformModelPackage.PLATFORMELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case PlatformModelPackage.PLATFORMELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case PlatformModelPackage.PLATFORMELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case PlatformModelPackage.PLATFORMELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case PlatformModelPackage.PLATFORMELEMENT_PLATFORMRELATION_FEATURE_ID:
        return getTarget().getPlatformRelation();
      case PlatformModelPackage.PLATFORMELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case PlatformModelPackage.PLATFORMELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
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
   * The adapter/wrapper for the EClass '<em><b>PlatformRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PlatformRelationshipModelObject<E extends PlatformRelationship> extends
      AbstractPlatformRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PlatformModelPackage.INSTANCE.getPlatformRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PlatformModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PlatformModelPackage.PLATFORMRELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PlatformModelPackage.PLATFORMRELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PlatformModelPackage.PLATFORMRELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case PlatformModelPackage.PLATFORMRELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case PlatformModelPackage.PLATFORMRELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case PlatformModelPackage.PLATFORMRELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case PlatformModelPackage.PLATFORMRELATIONSHIP_TO_FEATURE_ID:
        return getTarget().getTo();
      case PlatformModelPackage.PLATFORMRELATIONSHIP_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case PlatformModelPackage.PLATFORMRELATIONSHIP_TO_FEATURE_ID:
        getTarget().setTo((KDMEntity) value);
        return;
      case PlatformModelPackage.PLATFORMRELATIONSHIP_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractPlatformElement) value);
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
}