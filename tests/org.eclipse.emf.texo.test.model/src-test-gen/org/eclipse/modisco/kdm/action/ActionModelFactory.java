package org.eclipse.modisco.kdm.action;

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
import org.eclipse.modisco.kdm.code.AbstractCodeElement;
import org.eclipse.modisco.kdm.code.CodeItem;
import org.eclipse.modisco.kdm.code.CodeModelFactory;
import org.eclipse.modisco.kdm.code.ComputationalObject;
import org.eclipse.modisco.kdm.code.ControlElement;
import org.eclipse.modisco.kdm.code.DataElement;
import org.eclipse.modisco.kdm.code.Datatype;
import org.eclipse.modisco.kdm.core.CoreModelFactory;
import org.eclipse.modisco.kdm.core.KDMEntity;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: action. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ActionModelFactory implements ModelFactory {

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
    case ActionModelPackage.ENTRYFLOW_CLASSIFIER_ID:
      return createEntryFlow();
    case ActionModelPackage.ACTIONELEMENT_CLASSIFIER_ID:
      return createActionElement();
    case ActionModelPackage.BLOCKUNIT_CLASSIFIER_ID:
      return createBlockUnit();
    case ActionModelPackage.CONTROLFLOW_CLASSIFIER_ID:
      return createControlFlow();
    case ActionModelPackage.FLOW_CLASSIFIER_ID:
      return createFlow();
    case ActionModelPackage.TRUEFLOW_CLASSIFIER_ID:
      return createTrueFlow();
    case ActionModelPackage.FALSEFLOW_CLASSIFIER_ID:
      return createFalseFlow();
    case ActionModelPackage.GUARDEDFLOW_CLASSIFIER_ID:
      return createGuardedFlow();
    case ActionModelPackage.CALLS_CLASSIFIER_ID:
      return createCalls();
    case ActionModelPackage.DISPATCHES_CLASSIFIER_ID:
      return createDispatches();
    case ActionModelPackage.READS_CLASSIFIER_ID:
      return createReads();
    case ActionModelPackage.WRITES_CLASSIFIER_ID:
      return createWrites();
    case ActionModelPackage.ADDRESSES_CLASSIFIER_ID:
      return createAddresses();
    case ActionModelPackage.CREATES_CLASSIFIER_ID:
      return createCreates();
    case ActionModelPackage.EXCEPTIONUNIT_CLASSIFIER_ID:
      return createExceptionUnit();
    case ActionModelPackage.TRYUNIT_CLASSIFIER_ID:
      return createTryUnit();
    case ActionModelPackage.CATCHUNIT_CLASSIFIER_ID:
      return createCatchUnit();
    case ActionModelPackage.FINALLYUNIT_CLASSIFIER_ID:
      return createFinallyUnit();
    case ActionModelPackage.EXITFLOW_CLASSIFIER_ID:
      return createExitFlow();
    case ActionModelPackage.EXCEPTIONFLOW_CLASSIFIER_ID:
      return createExceptionFlow();
    case ActionModelPackage.THROWS_CLASSIFIER_ID:
      return createThrows();
    case ActionModelPackage.COMPLIESTO_CLASSIFIER_ID:
      return createCompliesTo();
    case ActionModelPackage.USESTYPE_CLASSIFIER_ID:
      return createUsesType();
    case ActionModelPackage.ACTIONRELATIONSHIP_CLASSIFIER_ID:
      return createActionRelationship();
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
    case ActionModelPackage.ENTRYFLOW_CLASSIFIER_ID:
      modelObject = new EntryFlowModelObject();
      break;
    case ActionModelPackage.ABSTRACTACTIONRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new AbstractActionRelationshipModelObject();
      break;
    case ActionModelPackage.ACTIONELEMENT_CLASSIFIER_ID:
      modelObject = new ActionElementModelObject();
      break;
    case ActionModelPackage.BLOCKUNIT_CLASSIFIER_ID:
      modelObject = new BlockUnitModelObject();
      break;
    case ActionModelPackage.CONTROLFLOW_CLASSIFIER_ID:
      modelObject = new ControlFlowModelObject();
      break;
    case ActionModelPackage.FLOW_CLASSIFIER_ID:
      modelObject = new FlowModelObject();
      break;
    case ActionModelPackage.TRUEFLOW_CLASSIFIER_ID:
      modelObject = new TrueFlowModelObject();
      break;
    case ActionModelPackage.FALSEFLOW_CLASSIFIER_ID:
      modelObject = new FalseFlowModelObject();
      break;
    case ActionModelPackage.GUARDEDFLOW_CLASSIFIER_ID:
      modelObject = new GuardedFlowModelObject();
      break;
    case ActionModelPackage.CALLS_CLASSIFIER_ID:
      modelObject = new CallsModelObject();
      break;
    case ActionModelPackage.DISPATCHES_CLASSIFIER_ID:
      modelObject = new DispatchesModelObject();
      break;
    case ActionModelPackage.READS_CLASSIFIER_ID:
      modelObject = new ReadsModelObject();
      break;
    case ActionModelPackage.WRITES_CLASSIFIER_ID:
      modelObject = new WritesModelObject();
      break;
    case ActionModelPackage.ADDRESSES_CLASSIFIER_ID:
      modelObject = new AddressesModelObject();
      break;
    case ActionModelPackage.CREATES_CLASSIFIER_ID:
      modelObject = new CreatesModelObject();
      break;
    case ActionModelPackage.EXCEPTIONUNIT_CLASSIFIER_ID:
      modelObject = new ExceptionUnitModelObject();
      break;
    case ActionModelPackage.TRYUNIT_CLASSIFIER_ID:
      modelObject = new TryUnitModelObject();
      break;
    case ActionModelPackage.CATCHUNIT_CLASSIFIER_ID:
      modelObject = new CatchUnitModelObject();
      break;
    case ActionModelPackage.FINALLYUNIT_CLASSIFIER_ID:
      modelObject = new FinallyUnitModelObject();
      break;
    case ActionModelPackage.EXITFLOW_CLASSIFIER_ID:
      modelObject = new ExitFlowModelObject();
      break;
    case ActionModelPackage.EXCEPTIONFLOW_CLASSIFIER_ID:
      modelObject = new ExceptionFlowModelObject();
      break;
    case ActionModelPackage.THROWS_CLASSIFIER_ID:
      modelObject = new ThrowsModelObject();
      break;
    case ActionModelPackage.COMPLIESTO_CLASSIFIER_ID:
      modelObject = new CompliesToModelObject();
      break;
    case ActionModelPackage.USESTYPE_CLASSIFIER_ID:
      modelObject = new UsesTypeModelObject();
      break;
    case ActionModelPackage.ACTIONRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new ActionRelationshipModelObject();
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
   * @return an instance of the model object representing the EClass EntryFlow
   * @generated
   */
  public EntryFlow createEntryFlow() {
    return new EntryFlow();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ActionElement
   * @generated
   */
  public ActionElement createActionElement() {
    return new ActionElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BlockUnit
   * @generated
   */
  public BlockUnit createBlockUnit() {
    return new BlockUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ControlFlow
   * @generated
   */
  public ControlFlow createControlFlow() {
    return new ControlFlow();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Flow
   * @generated
   */
  public Flow createFlow() {
    return new Flow();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TrueFlow
   * @generated
   */
  public TrueFlow createTrueFlow() {
    return new TrueFlow();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass FalseFlow
   * @generated
   */
  public FalseFlow createFalseFlow() {
    return new FalseFlow();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass GuardedFlow
   * @generated
   */
  public GuardedFlow createGuardedFlow() {
    return new GuardedFlow();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Calls
   * @generated
   */
  public Calls createCalls() {
    return new Calls();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Dispatches
   * @generated
   */
  public Dispatches createDispatches() {
    return new Dispatches();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Reads
   * @generated
   */
  public Reads createReads() {
    return new Reads();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Writes
   * @generated
   */
  public Writes createWrites() {
    return new Writes();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Addresses
   * @generated
   */
  public Addresses createAddresses() {
    return new Addresses();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Creates
   * @generated
   */
  public Creates createCreates() {
    return new Creates();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ExceptionUnit
   * @generated
   */
  public ExceptionUnit createExceptionUnit() {
    return new ExceptionUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TryUnit
   * @generated
   */
  public TryUnit createTryUnit() {
    return new TryUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CatchUnit
   * @generated
   */
  public CatchUnit createCatchUnit() {
    return new CatchUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass FinallyUnit
   * @generated
   */
  public FinallyUnit createFinallyUnit() {
    return new FinallyUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ExitFlow
   * @generated
   */
  public ExitFlow createExitFlow() {
    return new ExitFlow();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ExceptionFlow
   * @generated
   */
  public ExceptionFlow createExceptionFlow() {
    return new ExceptionFlow();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Throws
   * @generated
   */
  public Throws createThrows() {
    return new Throws();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CompliesTo
   * @generated
   */
  public CompliesTo createCompliesTo() {
    return new CompliesTo();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass UsesType
   * @generated
   */
  public UsesType createUsesType() {
    return new UsesType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ActionRelationship
   * @generated
   */
  public ActionRelationship createActionRelationship() {
    return new ActionRelationship();
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
   * The adapter/wrapper for the EClass '<em><b>EntryFlow</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EntryFlowModelObject<E extends EntryFlow> extends AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getEntryFlowEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.ENTRYFLOW_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.ENTRYFLOW_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.ENTRYFLOW_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.ENTRYFLOW_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.ENTRYFLOW_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.ENTRYFLOW_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.ENTRYFLOW_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.ENTRYFLOW_FROM_FEATURE_ID:
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
      case ActionModelPackage.ENTRYFLOW_TO_FEATURE_ID:
        getTarget().setTo((ActionElement) value);
        return;
      case ActionModelPackage.ENTRYFLOW_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractCodeElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>AbstractActionRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractActionRelationshipModelObject<E extends AbstractActionRelationship> extends
      CoreModelFactory.KDMRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getAbstractActionRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.ABSTRACTACTIONRELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.ABSTRACTACTIONRELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.ABSTRACTACTIONRELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.ABSTRACTACTIONRELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.ABSTRACTACTIONRELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.ABSTRACTACTIONRELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>ActionElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ActionElementModelObject<E extends ActionElement> extends
      CodeModelFactory.AbstractCodeElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getActionElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.ACTIONELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.ACTIONELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.ACTIONELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.ACTIONELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.ACTIONELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.ACTIONELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.ACTIONELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case ActionModelPackage.ACTIONELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case ActionModelPackage.ACTIONELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case ActionModelPackage.ACTIONELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case ActionModelPackage.ACTIONELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case ActionModelPackage.ACTIONELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case ActionModelPackage.ACTIONELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case ActionModelPackage.ACTIONELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case ActionModelPackage.ACTIONELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case ActionModelPackage.ACTIONELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case ActionModelPackage.ACTIONELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case ActionModelPackage.ACTIONELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case ActionModelPackage.ACTIONELEMENT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case ActionModelPackage.ACTIONELEMENT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case ActionModelPackage.ACTIONELEMENT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case ActionModelPackage.ACTIONELEMENT_KIND_FEATURE_ID:
        return getTarget().getKind();
      case ActionModelPackage.ACTIONELEMENT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      case ActionModelPackage.ACTIONELEMENT_ACTIONRELATION_FEATURE_ID:
        return getTarget().getActionRelation();
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
      case ActionModelPackage.ACTIONELEMENT_KIND_FEATURE_ID:
        getTarget().setKind((String) value);
        return;
      case ActionModelPackage.ACTIONELEMENT_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((Set<AbstractCodeElement>) value);
        return;
      case ActionModelPackage.ACTIONELEMENT_ACTIONRELATION_FEATURE_ID:
        getTarget().setActionRelation((List<AbstractActionRelationship>) value);
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

      case ActionModelPackage.ACTIONELEMENT_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((AbstractCodeElement) value);

      case ActionModelPackage.ACTIONELEMENT_ACTIONRELATION_FEATURE_ID:
        return getTarget().addToActionRelation((AbstractActionRelationship) value);
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

      case ActionModelPackage.ACTIONELEMENT_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((AbstractCodeElement) value);

      case ActionModelPackage.ACTIONELEMENT_ACTIONRELATION_FEATURE_ID:
        return getTarget().removeFromActionRelation((AbstractActionRelationship) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>BlockUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BlockUnitModelObject<E extends BlockUnit> extends ActionElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getBlockUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.BLOCKUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.BLOCKUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.BLOCKUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.BLOCKUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.BLOCKUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.BLOCKUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.BLOCKUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case ActionModelPackage.BLOCKUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case ActionModelPackage.BLOCKUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case ActionModelPackage.BLOCKUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case ActionModelPackage.BLOCKUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case ActionModelPackage.BLOCKUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case ActionModelPackage.BLOCKUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case ActionModelPackage.BLOCKUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case ActionModelPackage.BLOCKUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case ActionModelPackage.BLOCKUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case ActionModelPackage.BLOCKUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case ActionModelPackage.BLOCKUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case ActionModelPackage.BLOCKUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case ActionModelPackage.BLOCKUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case ActionModelPackage.BLOCKUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case ActionModelPackage.BLOCKUNIT_KIND_FEATURE_ID:
        return getTarget().getKind();
      case ActionModelPackage.BLOCKUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      case ActionModelPackage.BLOCKUNIT_ACTIONRELATION_FEATURE_ID:
        return getTarget().getActionRelation();
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
   * The adapter/wrapper for the EClass '<em><b>ControlFlow</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ControlFlowModelObject<E extends ControlFlow> extends AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getControlFlowEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.CONTROLFLOW_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.CONTROLFLOW_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.CONTROLFLOW_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.CONTROLFLOW_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.CONTROLFLOW_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.CONTROLFLOW_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.CONTROLFLOW_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.CONTROLFLOW_FROM_FEATURE_ID:
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
      case ActionModelPackage.CONTROLFLOW_TO_FEATURE_ID:
        getTarget().setTo((ActionElement) value);
        return;
      case ActionModelPackage.CONTROLFLOW_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>Flow</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class FlowModelObject<E extends Flow> extends ControlFlowModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getFlowEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.FLOW_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.FLOW_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.FLOW_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.FLOW_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.FLOW_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.FLOW_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.FLOW_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.FLOW_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>TrueFlow</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TrueFlowModelObject<E extends TrueFlow> extends ControlFlowModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getTrueFlowEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.TRUEFLOW_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.TRUEFLOW_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.TRUEFLOW_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.TRUEFLOW_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.TRUEFLOW_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.TRUEFLOW_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.TRUEFLOW_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.TRUEFLOW_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>FalseFlow</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class FalseFlowModelObject<E extends FalseFlow> extends ControlFlowModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getFalseFlowEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.FALSEFLOW_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.FALSEFLOW_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.FALSEFLOW_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.FALSEFLOW_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.FALSEFLOW_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.FALSEFLOW_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.FALSEFLOW_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.FALSEFLOW_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>GuardedFlow</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class GuardedFlowModelObject<E extends GuardedFlow> extends ControlFlowModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getGuardedFlowEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.GUARDEDFLOW_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.GUARDEDFLOW_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.GUARDEDFLOW_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.GUARDEDFLOW_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.GUARDEDFLOW_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.GUARDEDFLOW_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.GUARDEDFLOW_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.GUARDEDFLOW_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>Calls</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CallsModelObject<E extends Calls> extends AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getCallsEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.CALLS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.CALLS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.CALLS_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.CALLS_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.CALLS_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.CALLS_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.CALLS_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.CALLS_FROM_FEATURE_ID:
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
      case ActionModelPackage.CALLS_TO_FEATURE_ID:
        getTarget().setTo((ControlElement) value);
        return;
      case ActionModelPackage.CALLS_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>Dispatches</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DispatchesModelObject<E extends Dispatches> extends AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getDispatchesEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.DISPATCHES_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.DISPATCHES_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.DISPATCHES_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.DISPATCHES_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.DISPATCHES_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.DISPATCHES_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.DISPATCHES_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.DISPATCHES_FROM_FEATURE_ID:
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
      case ActionModelPackage.DISPATCHES_TO_FEATURE_ID:
        getTarget().setTo((DataElement) value);
        return;
      case ActionModelPackage.DISPATCHES_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>Reads</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ReadsModelObject<E extends Reads> extends AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getReadsEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.READS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.READS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.READS_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.READS_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.READS_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.READS_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.READS_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.READS_FROM_FEATURE_ID:
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
      case ActionModelPackage.READS_TO_FEATURE_ID:
        getTarget().setTo((DataElement) value);
        return;
      case ActionModelPackage.READS_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>Writes</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class WritesModelObject<E extends Writes> extends AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getWritesEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.WRITES_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.WRITES_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.WRITES_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.WRITES_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.WRITES_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.WRITES_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.WRITES_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.WRITES_FROM_FEATURE_ID:
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
      case ActionModelPackage.WRITES_TO_FEATURE_ID:
        getTarget().setTo((DataElement) value);
        return;
      case ActionModelPackage.WRITES_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>Addresses</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AddressesModelObject<E extends Addresses> extends AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getAddressesEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.ADDRESSES_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.ADDRESSES_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.ADDRESSES_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.ADDRESSES_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.ADDRESSES_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.ADDRESSES_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.ADDRESSES_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.ADDRESSES_FROM_FEATURE_ID:
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
      case ActionModelPackage.ADDRESSES_TO_FEATURE_ID:
        getTarget().setTo((ComputationalObject) value);
        return;
      case ActionModelPackage.ADDRESSES_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>Creates</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CreatesModelObject<E extends Creates> extends AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getCreatesEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.CREATES_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.CREATES_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.CREATES_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.CREATES_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.CREATES_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.CREATES_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.CREATES_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.CREATES_FROM_FEATURE_ID:
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
      case ActionModelPackage.CREATES_TO_FEATURE_ID:
        getTarget().setTo((Datatype) value);
        return;
      case ActionModelPackage.CREATES_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>ExceptionUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ExceptionUnitModelObject<E extends ExceptionUnit> extends BlockUnitModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getExceptionUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.EXCEPTIONUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.EXCEPTIONUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.EXCEPTIONUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.EXCEPTIONUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.EXCEPTIONUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.EXCEPTIONUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.EXCEPTIONUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case ActionModelPackage.EXCEPTIONUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case ActionModelPackage.EXCEPTIONUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case ActionModelPackage.EXCEPTIONUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case ActionModelPackage.EXCEPTIONUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case ActionModelPackage.EXCEPTIONUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case ActionModelPackage.EXCEPTIONUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case ActionModelPackage.EXCEPTIONUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case ActionModelPackage.EXCEPTIONUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case ActionModelPackage.EXCEPTIONUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case ActionModelPackage.EXCEPTIONUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case ActionModelPackage.EXCEPTIONUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case ActionModelPackage.EXCEPTIONUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case ActionModelPackage.EXCEPTIONUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case ActionModelPackage.EXCEPTIONUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case ActionModelPackage.EXCEPTIONUNIT_KIND_FEATURE_ID:
        return getTarget().getKind();
      case ActionModelPackage.EXCEPTIONUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      case ActionModelPackage.EXCEPTIONUNIT_ACTIONRELATION_FEATURE_ID:
        return getTarget().getActionRelation();
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
   * The adapter/wrapper for the EClass '<em><b>TryUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TryUnitModelObject<E extends TryUnit> extends ExceptionUnitModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getTryUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.TRYUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.TRYUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.TRYUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.TRYUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.TRYUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.TRYUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.TRYUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case ActionModelPackage.TRYUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case ActionModelPackage.TRYUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case ActionModelPackage.TRYUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case ActionModelPackage.TRYUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case ActionModelPackage.TRYUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case ActionModelPackage.TRYUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case ActionModelPackage.TRYUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case ActionModelPackage.TRYUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case ActionModelPackage.TRYUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case ActionModelPackage.TRYUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case ActionModelPackage.TRYUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case ActionModelPackage.TRYUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case ActionModelPackage.TRYUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case ActionModelPackage.TRYUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case ActionModelPackage.TRYUNIT_KIND_FEATURE_ID:
        return getTarget().getKind();
      case ActionModelPackage.TRYUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      case ActionModelPackage.TRYUNIT_ACTIONRELATION_FEATURE_ID:
        return getTarget().getActionRelation();
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
   * The adapter/wrapper for the EClass '<em><b>CatchUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CatchUnitModelObject<E extends CatchUnit> extends ExceptionUnitModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getCatchUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.CATCHUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.CATCHUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.CATCHUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.CATCHUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.CATCHUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.CATCHUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.CATCHUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case ActionModelPackage.CATCHUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case ActionModelPackage.CATCHUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case ActionModelPackage.CATCHUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case ActionModelPackage.CATCHUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case ActionModelPackage.CATCHUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case ActionModelPackage.CATCHUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case ActionModelPackage.CATCHUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case ActionModelPackage.CATCHUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case ActionModelPackage.CATCHUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case ActionModelPackage.CATCHUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case ActionModelPackage.CATCHUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case ActionModelPackage.CATCHUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case ActionModelPackage.CATCHUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case ActionModelPackage.CATCHUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case ActionModelPackage.CATCHUNIT_KIND_FEATURE_ID:
        return getTarget().getKind();
      case ActionModelPackage.CATCHUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      case ActionModelPackage.CATCHUNIT_ACTIONRELATION_FEATURE_ID:
        return getTarget().getActionRelation();
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
   * The adapter/wrapper for the EClass '<em><b>FinallyUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class FinallyUnitModelObject<E extends FinallyUnit> extends ExceptionUnitModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getFinallyUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.FINALLYUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.FINALLYUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.FINALLYUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.FINALLYUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.FINALLYUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.FINALLYUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.FINALLYUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case ActionModelPackage.FINALLYUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case ActionModelPackage.FINALLYUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case ActionModelPackage.FINALLYUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case ActionModelPackage.FINALLYUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case ActionModelPackage.FINALLYUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case ActionModelPackage.FINALLYUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case ActionModelPackage.FINALLYUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case ActionModelPackage.FINALLYUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case ActionModelPackage.FINALLYUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case ActionModelPackage.FINALLYUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case ActionModelPackage.FINALLYUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case ActionModelPackage.FINALLYUNIT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case ActionModelPackage.FINALLYUNIT_CODERELATION_FEATURE_ID:
        return getTarget().getCodeRelation();
      case ActionModelPackage.FINALLYUNIT_ENTRYFLOW_FEATURE_ID:
        return getTarget().getEntryFlow();
      case ActionModelPackage.FINALLYUNIT_KIND_FEATURE_ID:
        return getTarget().getKind();
      case ActionModelPackage.FINALLYUNIT_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
      case ActionModelPackage.FINALLYUNIT_ACTIONRELATION_FEATURE_ID:
        return getTarget().getActionRelation();
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
   * The adapter/wrapper for the EClass '<em><b>ExitFlow</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ExitFlowModelObject<E extends ExitFlow> extends AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getExitFlowEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.EXITFLOW_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.EXITFLOW_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.EXITFLOW_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.EXITFLOW_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.EXITFLOW_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.EXITFLOW_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.EXITFLOW_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.EXITFLOW_FROM_FEATURE_ID:
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
      case ActionModelPackage.EXITFLOW_TO_FEATURE_ID:
        getTarget().setTo((ActionElement) value);
        return;
      case ActionModelPackage.EXITFLOW_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>ExceptionFlow</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ExceptionFlowModelObject<E extends ExceptionFlow> extends
      AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getExceptionFlowEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.EXCEPTIONFLOW_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.EXCEPTIONFLOW_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.EXCEPTIONFLOW_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.EXCEPTIONFLOW_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.EXCEPTIONFLOW_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.EXCEPTIONFLOW_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.EXCEPTIONFLOW_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.EXCEPTIONFLOW_FROM_FEATURE_ID:
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
      case ActionModelPackage.EXCEPTIONFLOW_TO_FEATURE_ID:
        getTarget().setTo((ActionElement) value);
        return;
      case ActionModelPackage.EXCEPTIONFLOW_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>Throws</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ThrowsModelObject<E extends Throws> extends AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getThrowsEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.THROWS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.THROWS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.THROWS_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.THROWS_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.THROWS_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.THROWS_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.THROWS_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.THROWS_FROM_FEATURE_ID:
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
      case ActionModelPackage.THROWS_TO_FEATURE_ID:
        getTarget().setTo((DataElement) value);
        return;
      case ActionModelPackage.THROWS_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>CompliesTo</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CompliesToModelObject<E extends CompliesTo> extends AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getCompliesToEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.COMPLIESTO_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.COMPLIESTO_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.COMPLIESTO_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.COMPLIESTO_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.COMPLIESTO_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.COMPLIESTO_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.COMPLIESTO_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.COMPLIESTO_FROM_FEATURE_ID:
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
      case ActionModelPackage.COMPLIESTO_TO_FEATURE_ID:
        getTarget().setTo((CodeItem) value);
        return;
      case ActionModelPackage.COMPLIESTO_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>UsesType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class UsesTypeModelObject<E extends UsesType> extends AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getUsesTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.USESTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.USESTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.USESTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.USESTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.USESTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.USESTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.USESTYPE_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.USESTYPE_FROM_FEATURE_ID:
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
      case ActionModelPackage.USESTYPE_TO_FEATURE_ID:
        getTarget().setTo((Datatype) value);
        return;
      case ActionModelPackage.USESTYPE_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>ActionRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ActionRelationshipModelObject<E extends ActionRelationship> extends
      AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ActionModelPackage.INSTANCE.getActionRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ActionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ActionModelPackage.ACTIONRELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ActionModelPackage.ACTIONRELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ActionModelPackage.ACTIONRELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ActionModelPackage.ACTIONRELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ActionModelPackage.ACTIONRELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ActionModelPackage.ACTIONRELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ActionModelPackage.ACTIONRELATIONSHIP_TO_FEATURE_ID:
        return getTarget().getTo();
      case ActionModelPackage.ACTIONRELATIONSHIP_FROM_FEATURE_ID:
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
      case ActionModelPackage.ACTIONRELATIONSHIP_TO_FEATURE_ID:
        getTarget().setTo((KDMEntity) value);
        return;
      case ActionModelPackage.ACTIONRELATIONSHIP_FROM_FEATURE_ID:
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