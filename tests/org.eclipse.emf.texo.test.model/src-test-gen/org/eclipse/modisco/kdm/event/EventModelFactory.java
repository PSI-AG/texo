package org.eclipse.modisco.kdm.event;

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
import org.eclipse.modisco.kdm.core.CoreModelFactory;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.kdm.KdmModelFactory;
import org.eclipse.modisco.kdm.source.SourceRef;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: event. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EventModelFactory implements ModelFactory {

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
    case EventModelPackage.EVENTMODEL_CLASSIFIER_ID:
      return createEventModel();
    case EventModelPackage.EVENT_CLASSIFIER_ID:
      return createEvent();
    case EventModelPackage.EVENTRELATIONSHIP_CLASSIFIER_ID:
      return createEventRelationship();
    case EventModelPackage.EVENTRESOURCE_CLASSIFIER_ID:
      return createEventResource();
    case EventModelPackage.STATE_CLASSIFIER_ID:
      return createState();
    case EventModelPackage.TRANSITION_CLASSIFIER_ID:
      return createTransition();
    case EventModelPackage.ONENTRY_CLASSIFIER_ID:
      return createOnEntry();
    case EventModelPackage.ONEXIT_CLASSIFIER_ID:
      return createOnExit();
    case EventModelPackage.EVENTACTION_CLASSIFIER_ID:
      return createEventAction();
    case EventModelPackage.READSSTATE_CLASSIFIER_ID:
      return createReadsState();
    case EventModelPackage.PRODUCESEVENT_CLASSIFIER_ID:
      return createProducesEvent();
    case EventModelPackage.CONSUMESEVENT_CLASSIFIER_ID:
      return createConsumesEvent();
    case EventModelPackage.NEXTSTATE_CLASSIFIER_ID:
      return createNextState();
    case EventModelPackage.INITIALSTATE_CLASSIFIER_ID:
      return createInitialState();
    case EventModelPackage.EVENTELEMENT_CLASSIFIER_ID:
      return createEventElement();
    case EventModelPackage.HASSTATE_CLASSIFIER_ID:
      return createHasState();
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
    case EventModelPackage.EVENTMODEL_CLASSIFIER_ID:
      modelObject = new EventModelModelObject();
      break;
    case EventModelPackage.ABSTRACTEVENTELEMENT_CLASSIFIER_ID:
      modelObject = new AbstractEventElementModelObject();
      break;
    case EventModelPackage.ABSTRACTEVENTRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new AbstractEventRelationshipModelObject();
      break;
    case EventModelPackage.EVENT_CLASSIFIER_ID:
      modelObject = new EventModelObject();
      break;
    case EventModelPackage.EVENTRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new EventRelationshipModelObject();
      break;
    case EventModelPackage.EVENTRESOURCE_CLASSIFIER_ID:
      modelObject = new EventResourceModelObject();
      break;
    case EventModelPackage.STATE_CLASSIFIER_ID:
      modelObject = new StateModelObject();
      break;
    case EventModelPackage.TRANSITION_CLASSIFIER_ID:
      modelObject = new TransitionModelObject();
      break;
    case EventModelPackage.ONENTRY_CLASSIFIER_ID:
      modelObject = new OnEntryModelObject();
      break;
    case EventModelPackage.ONEXIT_CLASSIFIER_ID:
      modelObject = new OnExitModelObject();
      break;
    case EventModelPackage.EVENTACTION_CLASSIFIER_ID:
      modelObject = new EventActionModelObject();
      break;
    case EventModelPackage.READSSTATE_CLASSIFIER_ID:
      modelObject = new ReadsStateModelObject();
      break;
    case EventModelPackage.PRODUCESEVENT_CLASSIFIER_ID:
      modelObject = new ProducesEventModelObject();
      break;
    case EventModelPackage.CONSUMESEVENT_CLASSIFIER_ID:
      modelObject = new ConsumesEventModelObject();
      break;
    case EventModelPackage.NEXTSTATE_CLASSIFIER_ID:
      modelObject = new NextStateModelObject();
      break;
    case EventModelPackage.INITIALSTATE_CLASSIFIER_ID:
      modelObject = new InitialStateModelObject();
      break;
    case EventModelPackage.EVENTELEMENT_CLASSIFIER_ID:
      modelObject = new EventElementModelObject();
      break;
    case EventModelPackage.HASSTATE_CLASSIFIER_ID:
      modelObject = new HasStateModelObject();
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
   * @return an instance of the model object representing the EClass EventModel
   * @generated
   */
  public EventModel createEventModel() {
    return new EventModel();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Event
   * @generated
   */
  public Event createEvent() {
    return new Event();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass EventRelationship
   * @generated
   */
  public EventRelationship createEventRelationship() {
    return new EventRelationship();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass EventResource
   * @generated
   */
  public EventResource createEventResource() {
    return new EventResource();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass State
   * @generated
   */
  public State createState() {
    return new State();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Transition
   * @generated
   */
  public Transition createTransition() {
    return new Transition();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass OnEntry
   * @generated
   */
  public OnEntry createOnEntry() {
    return new OnEntry();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass OnExit
   * @generated
   */
  public OnExit createOnExit() {
    return new OnExit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass EventAction
   * @generated
   */
  public EventAction createEventAction() {
    return new EventAction();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ReadsState
   * @generated
   */
  public ReadsState createReadsState() {
    return new ReadsState();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ProducesEvent
   * @generated
   */
  public ProducesEvent createProducesEvent() {
    return new ProducesEvent();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ConsumesEvent
   * @generated
   */
  public ConsumesEvent createConsumesEvent() {
    return new ConsumesEvent();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass NextState
   * @generated
   */
  public NextState createNextState() {
    return new NextState();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass InitialState
   * @generated
   */
  public InitialState createInitialState() {
    return new InitialState();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass EventElement
   * @generated
   */
  public EventElement createEventElement() {
    return new EventElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass HasState
   * @generated
   */
  public HasState createHasState() {
    return new HasState();
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
   * The adapter/wrapper for the EClass '<em><b>EventModel</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EventModelModelObject<E extends EventModel> extends KdmModelFactory.KDMModelModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getEventModelEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.EVENTMODEL_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.EVENTMODEL_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.EVENTMODEL_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.EVENTMODEL_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.EVENTMODEL_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.EVENTMODEL_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.EVENTMODEL_AUDIT_FEATURE_ID:
        return getTarget().getAudit();
      case EventModelPackage.EVENTMODEL_EXTENSION_FEATURE_ID:
        return getTarget().getExtension();
      case EventModelPackage.EVENTMODEL_NAME_FEATURE_ID:
        return getTarget().getName();
      case EventModelPackage.EVENTMODEL_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case EventModelPackage.EVENTMODEL_EVENTELEMENT_FEATURE_ID:
        return getTarget().getEventElement();
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
      case EventModelPackage.EVENTMODEL_EVENTELEMENT_FEATURE_ID:
        getTarget().setEventElement((Set<AbstractEventElement>) value);
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

      case EventModelPackage.EVENTMODEL_EVENTELEMENT_FEATURE_ID:
        return getTarget().addToEventElement((AbstractEventElement) value);
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

      case EventModelPackage.EVENTMODEL_EVENTELEMENT_FEATURE_ID:
        return getTarget().removeFromEventElement((AbstractEventElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractEventElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractEventElementModelObject<E extends AbstractEventElement> extends
      CoreModelFactory.KDMEntityModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getAbstractEventElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.ABSTRACTEVENTELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.ABSTRACTEVENTELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.ABSTRACTEVENTELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.ABSTRACTEVENTELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.ABSTRACTEVENTELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.ABSTRACTEVENTELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.ABSTRACTEVENTELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case EventModelPackage.ABSTRACTEVENTELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case EventModelPackage.ABSTRACTEVENTELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case EventModelPackage.ABSTRACTEVENTELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case EventModelPackage.ABSTRACTEVENTELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case EventModelPackage.ABSTRACTEVENTELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case EventModelPackage.ABSTRACTEVENTELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case EventModelPackage.ABSTRACTEVENTELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case EventModelPackage.ABSTRACTEVENTELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case EventModelPackage.ABSTRACTEVENTELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case EventModelPackage.ABSTRACTEVENTELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case EventModelPackage.ABSTRACTEVENTELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case EventModelPackage.ABSTRACTEVENTELEMENT_EVENTRELATION_FEATURE_ID:
        return getTarget().getEventRelation();
      case EventModelPackage.ABSTRACTEVENTELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case EventModelPackage.ABSTRACTEVENTELEMENT_IMPLEMENTATION_FEATURE_ID:
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
      case EventModelPackage.ABSTRACTEVENTELEMENT_SOURCE_FEATURE_ID:
        getTarget().setSource((Set<SourceRef>) value);
        return;
      case EventModelPackage.ABSTRACTEVENTELEMENT_EVENTRELATION_FEATURE_ID:
        getTarget().setEventRelation((Set<AbstractEventRelationship>) value);
        return;
      case EventModelPackage.ABSTRACTEVENTELEMENT_ABSTRACTION_FEATURE_ID:
        getTarget().setAbstraction((List<ActionElement>) value);
        return;
      case EventModelPackage.ABSTRACTEVENTELEMENT_IMPLEMENTATION_FEATURE_ID:
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

      case EventModelPackage.ABSTRACTEVENTELEMENT_SOURCE_FEATURE_ID:
        return getTarget().addToSource((SourceRef) value);

      case EventModelPackage.ABSTRACTEVENTELEMENT_EVENTRELATION_FEATURE_ID:
        return getTarget().addToEventRelation((AbstractEventRelationship) value);

      case EventModelPackage.ABSTRACTEVENTELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().addToAbstraction((ActionElement) value);

      case EventModelPackage.ABSTRACTEVENTELEMENT_IMPLEMENTATION_FEATURE_ID:
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

      case EventModelPackage.ABSTRACTEVENTELEMENT_SOURCE_FEATURE_ID:
        return getTarget().removeFromSource((SourceRef) value);

      case EventModelPackage.ABSTRACTEVENTELEMENT_EVENTRELATION_FEATURE_ID:
        return getTarget().removeFromEventRelation((AbstractEventRelationship) value);

      case EventModelPackage.ABSTRACTEVENTELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().removeFromAbstraction((ActionElement) value);

      case EventModelPackage.ABSTRACTEVENTELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().removeFromImplementation((AbstractCodeElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractEventRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractEventRelationshipModelObject<E extends AbstractEventRelationship> extends
      CoreModelFactory.KDMRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getAbstractEventRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.ABSTRACTEVENTRELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.ABSTRACTEVENTRELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.ABSTRACTEVENTRELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.ABSTRACTEVENTRELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.ABSTRACTEVENTRELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.ABSTRACTEVENTRELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>Event</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EventModelObject<E extends Event> extends AbstractEventElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getEventEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.EVENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.EVENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.EVENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.EVENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.EVENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.EVENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.EVENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case EventModelPackage.EVENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case EventModelPackage.EVENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case EventModelPackage.EVENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case EventModelPackage.EVENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case EventModelPackage.EVENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case EventModelPackage.EVENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case EventModelPackage.EVENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case EventModelPackage.EVENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case EventModelPackage.EVENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case EventModelPackage.EVENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case EventModelPackage.EVENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case EventModelPackage.EVENT_EVENTRELATION_FEATURE_ID:
        return getTarget().getEventRelation();
      case EventModelPackage.EVENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case EventModelPackage.EVENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case EventModelPackage.EVENT_KIND_FEATURE_ID:
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
      case EventModelPackage.EVENT_KIND_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>EventRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EventRelationshipModelObject<E extends EventRelationship> extends
      AbstractEventRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getEventRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.EVENTRELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.EVENTRELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.EVENTRELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.EVENTRELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.EVENTRELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.EVENTRELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.EVENTRELATIONSHIP_TO_FEATURE_ID:
        return getTarget().getTo();
      case EventModelPackage.EVENTRELATIONSHIP_FROM_FEATURE_ID:
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
      case EventModelPackage.EVENTRELATIONSHIP_TO_FEATURE_ID:
        getTarget().setTo((KDMEntity) value);
        return;
      case EventModelPackage.EVENTRELATIONSHIP_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractEventElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>EventResource</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EventResourceModelObject<E extends EventResource> extends AbstractEventElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getEventResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.EVENTRESOURCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.EVENTRESOURCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.EVENTRESOURCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.EVENTRESOURCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.EVENTRESOURCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.EVENTRESOURCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.EVENTRESOURCE_NAME_FEATURE_ID:
        return getTarget().getName();
      case EventModelPackage.EVENTRESOURCE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case EventModelPackage.EVENTRESOURCE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case EventModelPackage.EVENTRESOURCE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case EventModelPackage.EVENTRESOURCE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case EventModelPackage.EVENTRESOURCE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case EventModelPackage.EVENTRESOURCE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case EventModelPackage.EVENTRESOURCE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case EventModelPackage.EVENTRESOURCE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case EventModelPackage.EVENTRESOURCE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case EventModelPackage.EVENTRESOURCE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case EventModelPackage.EVENTRESOURCE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case EventModelPackage.EVENTRESOURCE_EVENTRELATION_FEATURE_ID:
        return getTarget().getEventRelation();
      case EventModelPackage.EVENTRESOURCE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case EventModelPackage.EVENTRESOURCE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case EventModelPackage.EVENTRESOURCE_EVENTELEMENT_FEATURE_ID:
        return getTarget().getEventElement();
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
      case EventModelPackage.EVENTRESOURCE_EVENTELEMENT_FEATURE_ID:
        getTarget().setEventElement((Set<AbstractEventElement>) value);
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

      case EventModelPackage.EVENTRESOURCE_EVENTELEMENT_FEATURE_ID:
        return getTarget().addToEventElement((AbstractEventElement) value);
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

      case EventModelPackage.EVENTRESOURCE_EVENTELEMENT_FEATURE_ID:
        return getTarget().removeFromEventElement((AbstractEventElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>State</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class StateModelObject<E extends State> extends EventResourceModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getStateEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.STATE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.STATE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.STATE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.STATE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.STATE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.STATE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.STATE_NAME_FEATURE_ID:
        return getTarget().getName();
      case EventModelPackage.STATE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case EventModelPackage.STATE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case EventModelPackage.STATE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case EventModelPackage.STATE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case EventModelPackage.STATE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case EventModelPackage.STATE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case EventModelPackage.STATE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case EventModelPackage.STATE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case EventModelPackage.STATE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case EventModelPackage.STATE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case EventModelPackage.STATE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case EventModelPackage.STATE_EVENTRELATION_FEATURE_ID:
        return getTarget().getEventRelation();
      case EventModelPackage.STATE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case EventModelPackage.STATE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case EventModelPackage.STATE_EVENTELEMENT_FEATURE_ID:
        return getTarget().getEventElement();
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
   * The adapter/wrapper for the EClass '<em><b>Transition</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TransitionModelObject<E extends Transition> extends EventResourceModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getTransitionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.TRANSITION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.TRANSITION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.TRANSITION_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.TRANSITION_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.TRANSITION_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.TRANSITION_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.TRANSITION_NAME_FEATURE_ID:
        return getTarget().getName();
      case EventModelPackage.TRANSITION_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case EventModelPackage.TRANSITION_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case EventModelPackage.TRANSITION_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case EventModelPackage.TRANSITION_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case EventModelPackage.TRANSITION_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case EventModelPackage.TRANSITION_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case EventModelPackage.TRANSITION_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case EventModelPackage.TRANSITION_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case EventModelPackage.TRANSITION_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case EventModelPackage.TRANSITION_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case EventModelPackage.TRANSITION_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case EventModelPackage.TRANSITION_EVENTRELATION_FEATURE_ID:
        return getTarget().getEventRelation();
      case EventModelPackage.TRANSITION_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case EventModelPackage.TRANSITION_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case EventModelPackage.TRANSITION_EVENTELEMENT_FEATURE_ID:
        return getTarget().getEventElement();
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
   * The adapter/wrapper for the EClass '<em><b>OnEntry</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class OnEntryModelObject<E extends OnEntry> extends TransitionModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getOnEntryEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.ONENTRY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.ONENTRY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.ONENTRY_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.ONENTRY_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.ONENTRY_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.ONENTRY_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.ONENTRY_NAME_FEATURE_ID:
        return getTarget().getName();
      case EventModelPackage.ONENTRY_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case EventModelPackage.ONENTRY_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case EventModelPackage.ONENTRY_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case EventModelPackage.ONENTRY_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case EventModelPackage.ONENTRY_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case EventModelPackage.ONENTRY_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case EventModelPackage.ONENTRY_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case EventModelPackage.ONENTRY_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case EventModelPackage.ONENTRY_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case EventModelPackage.ONENTRY_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case EventModelPackage.ONENTRY_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case EventModelPackage.ONENTRY_EVENTRELATION_FEATURE_ID:
        return getTarget().getEventRelation();
      case EventModelPackage.ONENTRY_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case EventModelPackage.ONENTRY_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case EventModelPackage.ONENTRY_EVENTELEMENT_FEATURE_ID:
        return getTarget().getEventElement();
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
   * The adapter/wrapper for the EClass '<em><b>OnExit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class OnExitModelObject<E extends OnExit> extends TransitionModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getOnExitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.ONEXIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.ONEXIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.ONEXIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.ONEXIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.ONEXIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.ONEXIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.ONEXIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case EventModelPackage.ONEXIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case EventModelPackage.ONEXIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case EventModelPackage.ONEXIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case EventModelPackage.ONEXIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case EventModelPackage.ONEXIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case EventModelPackage.ONEXIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case EventModelPackage.ONEXIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case EventModelPackage.ONEXIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case EventModelPackage.ONEXIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case EventModelPackage.ONEXIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case EventModelPackage.ONEXIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case EventModelPackage.ONEXIT_EVENTRELATION_FEATURE_ID:
        return getTarget().getEventRelation();
      case EventModelPackage.ONEXIT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case EventModelPackage.ONEXIT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case EventModelPackage.ONEXIT_EVENTELEMENT_FEATURE_ID:
        return getTarget().getEventElement();
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
   * The adapter/wrapper for the EClass '<em><b>EventAction</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EventActionModelObject<E extends EventAction> extends AbstractEventElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getEventActionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.EVENTACTION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.EVENTACTION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.EVENTACTION_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.EVENTACTION_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.EVENTACTION_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.EVENTACTION_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.EVENTACTION_NAME_FEATURE_ID:
        return getTarget().getName();
      case EventModelPackage.EVENTACTION_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case EventModelPackage.EVENTACTION_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case EventModelPackage.EVENTACTION_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case EventModelPackage.EVENTACTION_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case EventModelPackage.EVENTACTION_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case EventModelPackage.EVENTACTION_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case EventModelPackage.EVENTACTION_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case EventModelPackage.EVENTACTION_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case EventModelPackage.EVENTACTION_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case EventModelPackage.EVENTACTION_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case EventModelPackage.EVENTACTION_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case EventModelPackage.EVENTACTION_EVENTRELATION_FEATURE_ID:
        return getTarget().getEventRelation();
      case EventModelPackage.EVENTACTION_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case EventModelPackage.EVENTACTION_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case EventModelPackage.EVENTACTION_KIND_FEATURE_ID:
        return getTarget().getKind();
      case EventModelPackage.EVENTACTION_EVENTELEMENT_FEATURE_ID:
        return getTarget().getEventElement();
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
      case EventModelPackage.EVENTACTION_KIND_FEATURE_ID:
        getTarget().setKind((String) value);
        return;
      case EventModelPackage.EVENTACTION_EVENTELEMENT_FEATURE_ID:
        getTarget().setEventElement((Set<Event>) value);
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

      case EventModelPackage.EVENTACTION_EVENTELEMENT_FEATURE_ID:
        return getTarget().addToEventElement((Event) value);
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

      case EventModelPackage.EVENTACTION_EVENTELEMENT_FEATURE_ID:
        return getTarget().removeFromEventElement((Event) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ReadsState</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ReadsStateModelObject<E extends ReadsState> extends
      ActionModelFactory.AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getReadsStateEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.READSSTATE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.READSSTATE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.READSSTATE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.READSSTATE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.READSSTATE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.READSSTATE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.READSSTATE_TO_FEATURE_ID:
        return getTarget().getTo();
      case EventModelPackage.READSSTATE_FROM_FEATURE_ID:
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
      case EventModelPackage.READSSTATE_TO_FEATURE_ID:
        getTarget().setTo((State) value);
        return;
      case EventModelPackage.READSSTATE_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>ProducesEvent</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ProducesEventModelObject<E extends ProducesEvent> extends
      ActionModelFactory.AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getProducesEventEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.PRODUCESEVENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.PRODUCESEVENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.PRODUCESEVENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.PRODUCESEVENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.PRODUCESEVENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.PRODUCESEVENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.PRODUCESEVENT_TO_FEATURE_ID:
        return getTarget().getTo();
      case EventModelPackage.PRODUCESEVENT_FROM_FEATURE_ID:
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
      case EventModelPackage.PRODUCESEVENT_TO_FEATURE_ID:
        getTarget().setTo((Event) value);
        return;
      case EventModelPackage.PRODUCESEVENT_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>ConsumesEvent</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConsumesEventModelObject<E extends ConsumesEvent> extends AbstractEventRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getConsumesEventEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.CONSUMESEVENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.CONSUMESEVENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.CONSUMESEVENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.CONSUMESEVENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.CONSUMESEVENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.CONSUMESEVENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.CONSUMESEVENT_TO_FEATURE_ID:
        return getTarget().getTo();
      case EventModelPackage.CONSUMESEVENT_FROM_FEATURE_ID:
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
      case EventModelPackage.CONSUMESEVENT_TO_FEATURE_ID:
        getTarget().setTo((Event) value);
        return;
      case EventModelPackage.CONSUMESEVENT_FROM_FEATURE_ID:
        getTarget().setFrom((Transition) value);
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
   * The adapter/wrapper for the EClass '<em><b>NextState</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class NextStateModelObject<E extends NextState> extends AbstractEventRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getNextStateEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.NEXTSTATE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.NEXTSTATE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.NEXTSTATE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.NEXTSTATE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.NEXTSTATE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.NEXTSTATE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.NEXTSTATE_TO_FEATURE_ID:
        return getTarget().getTo();
      case EventModelPackage.NEXTSTATE_FROM_FEATURE_ID:
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
      case EventModelPackage.NEXTSTATE_TO_FEATURE_ID:
        getTarget().setTo((State) value);
        return;
      case EventModelPackage.NEXTSTATE_FROM_FEATURE_ID:
        getTarget().setFrom((Transition) value);
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
   * The adapter/wrapper for the EClass '<em><b>InitialState</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InitialStateModelObject<E extends InitialState> extends StateModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getInitialStateEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.INITIALSTATE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.INITIALSTATE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.INITIALSTATE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.INITIALSTATE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.INITIALSTATE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.INITIALSTATE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.INITIALSTATE_NAME_FEATURE_ID:
        return getTarget().getName();
      case EventModelPackage.INITIALSTATE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case EventModelPackage.INITIALSTATE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case EventModelPackage.INITIALSTATE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case EventModelPackage.INITIALSTATE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case EventModelPackage.INITIALSTATE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case EventModelPackage.INITIALSTATE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case EventModelPackage.INITIALSTATE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case EventModelPackage.INITIALSTATE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case EventModelPackage.INITIALSTATE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case EventModelPackage.INITIALSTATE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case EventModelPackage.INITIALSTATE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case EventModelPackage.INITIALSTATE_EVENTRELATION_FEATURE_ID:
        return getTarget().getEventRelation();
      case EventModelPackage.INITIALSTATE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case EventModelPackage.INITIALSTATE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case EventModelPackage.INITIALSTATE_EVENTELEMENT_FEATURE_ID:
        return getTarget().getEventElement();
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
   * The adapter/wrapper for the EClass '<em><b>EventElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EventElementModelObject<E extends EventElement> extends AbstractEventElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getEventElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.EVENTELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.EVENTELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.EVENTELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.EVENTELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.EVENTELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.EVENTELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.EVENTELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case EventModelPackage.EVENTELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case EventModelPackage.EVENTELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case EventModelPackage.EVENTELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case EventModelPackage.EVENTELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case EventModelPackage.EVENTELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case EventModelPackage.EVENTELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case EventModelPackage.EVENTELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case EventModelPackage.EVENTELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case EventModelPackage.EVENTELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case EventModelPackage.EVENTELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case EventModelPackage.EVENTELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case EventModelPackage.EVENTELEMENT_EVENTRELATION_FEATURE_ID:
        return getTarget().getEventRelation();
      case EventModelPackage.EVENTELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case EventModelPackage.EVENTELEMENT_IMPLEMENTATION_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>HasState</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class HasStateModelObject<E extends HasState> extends
      ActionModelFactory.AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EventModelPackage.INSTANCE.getHasStateEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EventModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EventModelPackage.HASSTATE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EventModelPackage.HASSTATE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EventModelPackage.HASSTATE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case EventModelPackage.HASSTATE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case EventModelPackage.HASSTATE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case EventModelPackage.HASSTATE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case EventModelPackage.HASSTATE_TO_FEATURE_ID:
        return getTarget().getTo();
      case EventModelPackage.HASSTATE_FROM_FEATURE_ID:
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
      case EventModelPackage.HASSTATE_TO_FEATURE_ID:
        getTarget().setTo((AbstractEventElement) value);
        return;
      case EventModelPackage.HASSTATE_FROM_FEATURE_ID:
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
}