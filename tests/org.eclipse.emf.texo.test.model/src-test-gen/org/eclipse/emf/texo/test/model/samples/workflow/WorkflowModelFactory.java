package org.eclipse.emf.texo.test.model.samples.workflow;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: workflow. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class WorkflowModelFactory implements ModelFactory {

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
    case WorkflowModelPackage.CONDITIONALOUTPUTPORT_CLASSIFIER_ID:
      return createConditionalOutputPort();
    case WorkflowModelPackage.WORKFLOW_CLASSIFIER_ID:
      return createWorkflow();
    case WorkflowModelPackage.EDGE_CLASSIFIER_ID:
      return createEdge();
    case WorkflowModelPackage.COMMENT_CLASSIFIER_ID:
      return createComment();
    case WorkflowModelPackage.OUTPUTPORT_CLASSIFIER_ID:
      return createOutputPort();
    case WorkflowModelPackage.INPUTPORT_CLASSIFIER_ID:
      return createInputPort();
    case WorkflowModelPackage.FAULT_CLASSIFIER_ID:
      return createFault();
    case WorkflowModelPackage.COMPOUNDTASK_CLASSIFIER_ID:
      return createCompoundTask();
    case WorkflowModelPackage.TRANSFORMATIONTASK_CLASSIFIER_ID:
      return createTransformationTask();
    case WorkflowModelPackage.CONDITIONALTASK_CLASSIFIER_ID:
      return createConditionalTask();
    case WorkflowModelPackage.LOOPTASK_CLASSIFIER_ID:
      return createLoopTask();
    case WorkflowModelPackage.TASK_CLASSIFIER_ID:
      return createTask();
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
    case WorkflowModelPackage.CONDITIONALOUTPUTPORT_CLASSIFIER_ID:
      modelObject = new ConditionalOutputPortModelObject();
      break;
    case WorkflowModelPackage.WORKFLOW_CLASSIFIER_ID:
      modelObject = new WorkflowModelObject();
      break;
    case WorkflowModelPackage.WORKFLOWELEMENT_CLASSIFIER_ID:
      modelObject = new WorkflowElementModelObject();
      break;
    case WorkflowModelPackage.WORKFLOWNODE_CLASSIFIER_ID:
      modelObject = new WorkflowNodeModelObject();
      break;
    case WorkflowModelPackage.EDGE_CLASSIFIER_ID:
      modelObject = new EdgeModelObject();
      break;
    case WorkflowModelPackage.COMMENT_CLASSIFIER_ID:
      modelObject = new CommentModelObject();
      break;
    case WorkflowModelPackage.OUTPUTPORT_CLASSIFIER_ID:
      modelObject = new OutputPortModelObject();
      break;
    case WorkflowModelPackage.PORT_CLASSIFIER_ID:
      modelObject = new PortModelObject();
      break;
    case WorkflowModelPackage.INPUTPORT_CLASSIFIER_ID:
      modelObject = new InputPortModelObject();
      break;
    case WorkflowModelPackage.FAULT_CLASSIFIER_ID:
      modelObject = new FaultModelObject();
      break;
    case WorkflowModelPackage.COMPOUNDTASK_CLASSIFIER_ID:
      modelObject = new CompoundTaskModelObject();
      break;
    case WorkflowModelPackage.TRANSFORMATIONTASK_CLASSIFIER_ID:
      modelObject = new TransformationTaskModelObject();
      break;
    case WorkflowModelPackage.CONDITIONALTASK_CLASSIFIER_ID:
      modelObject = new ConditionalTaskModelObject();
      break;
    case WorkflowModelPackage.LOOPTASK_CLASSIFIER_ID:
      modelObject = new LoopTaskModelObject();
      break;
    case WorkflowModelPackage.TASK_CLASSIFIER_ID:
      modelObject = new TaskModelObject();
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
   * @return an instance of the model object representing the EClass ConditionalOutputPort
   * @generated
   */
  public ConditionalOutputPort createConditionalOutputPort() {
    return new ConditionalOutputPort();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Workflow
   * @generated
   */
  public Workflow createWorkflow() {
    return new Workflow();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Edge
   * @generated
   */
  public Edge createEdge() {
    return new Edge();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Comment
   * @generated
   */
  public Comment createComment() {
    return new Comment();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass OutputPort
   * @generated
   */
  public OutputPort createOutputPort() {
    return new OutputPort();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass InputPort
   * @generated
   */
  public InputPort createInputPort() {
    return new InputPort();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Fault
   * @generated
   */
  public Fault createFault() {
    return new Fault();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CompoundTask
   * @generated
   */
  public CompoundTask createCompoundTask() {
    return new CompoundTask();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TransformationTask
   * @generated
   */
  public TransformationTask createTransformationTask() {
    return new TransformationTask();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ConditionalTask
   * @generated
   */
  public ConditionalTask createConditionalTask() {
    return new ConditionalTask();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass LoopTask
   * @generated
   */
  public LoopTask createLoopTask() {
    return new LoopTask();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Task
   * @generated
   */
  public Task createTask() {
    return new Task();
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
   * The adapter/wrapper for the EClass '<em><b>ConditionalOutputPort</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConditionalOutputPortModelObject<E extends ConditionalOutputPort> extends
      OutputPortModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getConditionalOutputPortEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.CONDITIONALOUTPUTPORT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case WorkflowModelPackage.CONDITIONALOUTPUTPORT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case WorkflowModelPackage.CONDITIONALOUTPUTPORT_NAME_FEATURE_ID:
        return getTarget().getName();
      case WorkflowModelPackage.CONDITIONALOUTPUTPORT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case WorkflowModelPackage.CONDITIONALOUTPUTPORT_X_FEATURE_ID:
        return getTarget().getX();
      case WorkflowModelPackage.CONDITIONALOUTPUTPORT_Y_FEATURE_ID:
        return getTarget().getY();
      case WorkflowModelPackage.CONDITIONALOUTPUTPORT_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case WorkflowModelPackage.CONDITIONALOUTPUTPORT_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case WorkflowModelPackage.CONDITIONALOUTPUTPORT_WORKFLOWELEMENTID_FEATURE_ID:
        return getTarget().getWorkFlowElementId();
      case WorkflowModelPackage.CONDITIONALOUTPUTPORT_NODE_FEATURE_ID:
        return getTarget().getNode();
      case WorkflowModelPackage.CONDITIONALOUTPUTPORT_EDGES_FEATURE_ID:
        return getTarget().getEdges();
      case WorkflowModelPackage.CONDITIONALOUTPUTPORT_CONDITION_FEATURE_ID:
        return getTarget().getCondition();
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
      case WorkflowModelPackage.CONDITIONALOUTPUTPORT_CONDITION_FEATURE_ID:
        getTarget().setCondition((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Workflow</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class WorkflowModelObject<E extends Workflow> extends WorkflowElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getWorkflowEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.WORKFLOW_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case WorkflowModelPackage.WORKFLOW_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case WorkflowModelPackage.WORKFLOW_NAME_FEATURE_ID:
        return getTarget().getName();
      case WorkflowModelPackage.WORKFLOW_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case WorkflowModelPackage.WORKFLOW_X_FEATURE_ID:
        return getTarget().getX();
      case WorkflowModelPackage.WORKFLOW_Y_FEATURE_ID:
        return getTarget().getY();
      case WorkflowModelPackage.WORKFLOW_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case WorkflowModelPackage.WORKFLOW_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case WorkflowModelPackage.WORKFLOW_WORKFLOWELEMENTID_FEATURE_ID:
        return getTarget().getWorkFlowElementId();
      case WorkflowModelPackage.WORKFLOW_NODES_FEATURE_ID:
        return getTarget().getNodes();
      case WorkflowModelPackage.WORKFLOW_EDGES_FEATURE_ID:
        return getTarget().getEdges();
      case WorkflowModelPackage.WORKFLOW_COMMENTS_FEATURE_ID:
        return getTarget().getComments();
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
      case WorkflowModelPackage.WORKFLOW_NODES_FEATURE_ID:
        getTarget().setNodes((List<WorkflowNode>) value);
        return;
      case WorkflowModelPackage.WORKFLOW_EDGES_FEATURE_ID:
        getTarget().setEdges((List<Edge>) value);
        return;
      case WorkflowModelPackage.WORKFLOW_COMMENTS_FEATURE_ID:
        getTarget().setComments((List<Comment>) value);
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

      case WorkflowModelPackage.WORKFLOW_NODES_FEATURE_ID:
        return getTarget().addToNodes((WorkflowNode) value);

      case WorkflowModelPackage.WORKFLOW_EDGES_FEATURE_ID:
        return getTarget().addToEdges((Edge) value);

      case WorkflowModelPackage.WORKFLOW_COMMENTS_FEATURE_ID:
        return getTarget().addToComments((Comment) value);
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

      case WorkflowModelPackage.WORKFLOW_NODES_FEATURE_ID:
        return getTarget().removeFromNodes((WorkflowNode) value);

      case WorkflowModelPackage.WORKFLOW_EDGES_FEATURE_ID:
        return getTarget().removeFromEdges((Edge) value);

      case WorkflowModelPackage.WORKFLOW_COMMENTS_FEATURE_ID:
        return getTarget().removeFromComments((Comment) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>WorkflowElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class WorkflowElementModelObject<E extends WorkflowElement> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getWorkflowElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.WORKFLOWELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case WorkflowModelPackage.WORKFLOWELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case WorkflowModelPackage.WORKFLOWELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case WorkflowModelPackage.WORKFLOWELEMENT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case WorkflowModelPackage.WORKFLOWELEMENT_X_FEATURE_ID:
        return getTarget().getX();
      case WorkflowModelPackage.WORKFLOWELEMENT_Y_FEATURE_ID:
        return getTarget().getY();
      case WorkflowModelPackage.WORKFLOWELEMENT_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case WorkflowModelPackage.WORKFLOWELEMENT_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case WorkflowModelPackage.WORKFLOWELEMENT_WORKFLOWELEMENTID_FEATURE_ID:
        return getTarget().getWorkFlowElementId();
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
      case WorkflowModelPackage.WORKFLOWELEMENT_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case WorkflowModelPackage.WORKFLOWELEMENT_COMMENT_FEATURE_ID:
        getTarget().setComment((String) value);
        return;
      case WorkflowModelPackage.WORKFLOWELEMENT_X_FEATURE_ID:
        getTarget().setX((Integer) value);
        return;
      case WorkflowModelPackage.WORKFLOWELEMENT_Y_FEATURE_ID:
        getTarget().setY((Integer) value);
        return;
      case WorkflowModelPackage.WORKFLOWELEMENT_WIDTH_FEATURE_ID:
        getTarget().setWidth((Integer) value);
        return;
      case WorkflowModelPackage.WORKFLOWELEMENT_HEIGHT_FEATURE_ID:
        getTarget().setHeight((Integer) value);
        return;
      case WorkflowModelPackage.WORKFLOWELEMENT_WORKFLOWELEMENTID_FEATURE_ID:
        getTarget().setWorkFlowElementId((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>WorkflowNode</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class WorkflowNodeModelObject<E extends WorkflowNode> extends WorkflowElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getWorkflowNodeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.WORKFLOWNODE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case WorkflowModelPackage.WORKFLOWNODE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case WorkflowModelPackage.WORKFLOWNODE_NAME_FEATURE_ID:
        return getTarget().getName();
      case WorkflowModelPackage.WORKFLOWNODE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case WorkflowModelPackage.WORKFLOWNODE_X_FEATURE_ID:
        return getTarget().getX();
      case WorkflowModelPackage.WORKFLOWNODE_Y_FEATURE_ID:
        return getTarget().getY();
      case WorkflowModelPackage.WORKFLOWNODE_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case WorkflowModelPackage.WORKFLOWNODE_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case WorkflowModelPackage.WORKFLOWNODE_WORKFLOWELEMENTID_FEATURE_ID:
        return getTarget().getWorkFlowElementId();
      case WorkflowModelPackage.WORKFLOWNODE_WORKFLOW_FEATURE_ID:
        return getTarget().getWorkflow();
      case WorkflowModelPackage.WORKFLOWNODE_OUTPUTS_FEATURE_ID:
        return getTarget().getOutputs();
      case WorkflowModelPackage.WORKFLOWNODE_INPUTS_FEATURE_ID:
        return getTarget().getInputs();
      case WorkflowModelPackage.WORKFLOWNODE_ISSTART_FEATURE_ID:
        return getTarget().isIsStart();
      case WorkflowModelPackage.WORKFLOWNODE_ISFINISH_FEATURE_ID:
        return getTarget().isIsFinish();
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
      case WorkflowModelPackage.WORKFLOWNODE_WORKFLOW_FEATURE_ID:
        getTarget().setWorkflow((Workflow) value);
        return;
      case WorkflowModelPackage.WORKFLOWNODE_OUTPUTS_FEATURE_ID:
        getTarget().setOutputs((List<OutputPort>) value);
        return;
      case WorkflowModelPackage.WORKFLOWNODE_INPUTS_FEATURE_ID:
        getTarget().setInputs((List<InputPort>) value);
        return;
      case WorkflowModelPackage.WORKFLOWNODE_ISSTART_FEATURE_ID:
        getTarget().setIsStart((Boolean) value);
        return;
      case WorkflowModelPackage.WORKFLOWNODE_ISFINISH_FEATURE_ID:
        getTarget().setIsFinish((Boolean) value);
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

      case WorkflowModelPackage.WORKFLOWNODE_OUTPUTS_FEATURE_ID:
        return getTarget().addToOutputs((OutputPort) value);

      case WorkflowModelPackage.WORKFLOWNODE_INPUTS_FEATURE_ID:
        return getTarget().addToInputs((InputPort) value);

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

      case WorkflowModelPackage.WORKFLOWNODE_OUTPUTS_FEATURE_ID:
        return getTarget().removeFromOutputs((OutputPort) value);

      case WorkflowModelPackage.WORKFLOWNODE_INPUTS_FEATURE_ID:
        return getTarget().removeFromInputs((InputPort) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Edge</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EdgeModelObject<E extends Edge> extends WorkflowElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getEdgeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.EDGE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case WorkflowModelPackage.EDGE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case WorkflowModelPackage.EDGE_NAME_FEATURE_ID:
        return getTarget().getName();
      case WorkflowModelPackage.EDGE_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case WorkflowModelPackage.EDGE_X_FEATURE_ID:
        return getTarget().getX();
      case WorkflowModelPackage.EDGE_Y_FEATURE_ID:
        return getTarget().getY();
      case WorkflowModelPackage.EDGE_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case WorkflowModelPackage.EDGE_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case WorkflowModelPackage.EDGE_WORKFLOWELEMENTID_FEATURE_ID:
        return getTarget().getWorkFlowElementId();
      case WorkflowModelPackage.EDGE_WORKFLOW_FEATURE_ID:
        return getTarget().getWorkflow();
      case WorkflowModelPackage.EDGE_TARGET_FEATURE_ID:
        return getTarget().getTarget();
      case WorkflowModelPackage.EDGE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
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
      case WorkflowModelPackage.EDGE_WORKFLOW_FEATURE_ID:
        getTarget().setWorkflow((Workflow) value);
        return;
      case WorkflowModelPackage.EDGE_TARGET_FEATURE_ID:
        getTarget().setTarget((InputPort) value);
        return;
      case WorkflowModelPackage.EDGE_SOURCE_FEATURE_ID:
        getTarget().setSource((OutputPort) value);
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
   * The adapter/wrapper for the EClass '<em><b>Comment</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CommentModelObject<E extends Comment> extends WorkflowElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getCommentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.COMMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case WorkflowModelPackage.COMMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case WorkflowModelPackage.COMMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case WorkflowModelPackage.COMMENT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case WorkflowModelPackage.COMMENT_X_FEATURE_ID:
        return getTarget().getX();
      case WorkflowModelPackage.COMMENT_Y_FEATURE_ID:
        return getTarget().getY();
      case WorkflowModelPackage.COMMENT_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case WorkflowModelPackage.COMMENT_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case WorkflowModelPackage.COMMENT_WORKFLOWELEMENTID_FEATURE_ID:
        return getTarget().getWorkFlowElementId();
      case WorkflowModelPackage.COMMENT_WORKFLOW_FEATURE_ID:
        return getTarget().getWorkflow();
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
      case WorkflowModelPackage.COMMENT_WORKFLOW_FEATURE_ID:
        getTarget().setWorkflow((Workflow) value);
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
   * The adapter/wrapper for the EClass '<em><b>OutputPort</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class OutputPortModelObject<E extends OutputPort> extends PortModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getOutputPortEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.OUTPUTPORT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case WorkflowModelPackage.OUTPUTPORT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case WorkflowModelPackage.OUTPUTPORT_NAME_FEATURE_ID:
        return getTarget().getName();
      case WorkflowModelPackage.OUTPUTPORT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case WorkflowModelPackage.OUTPUTPORT_X_FEATURE_ID:
        return getTarget().getX();
      case WorkflowModelPackage.OUTPUTPORT_Y_FEATURE_ID:
        return getTarget().getY();
      case WorkflowModelPackage.OUTPUTPORT_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case WorkflowModelPackage.OUTPUTPORT_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case WorkflowModelPackage.OUTPUTPORT_WORKFLOWELEMENTID_FEATURE_ID:
        return getTarget().getWorkFlowElementId();
      case WorkflowModelPackage.OUTPUTPORT_NODE_FEATURE_ID:
        return getTarget().getNode();
      case WorkflowModelPackage.OUTPUTPORT_EDGES_FEATURE_ID:
        return getTarget().getEdges();
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
      case WorkflowModelPackage.OUTPUTPORT_NODE_FEATURE_ID:
        getTarget().setNode((WorkflowNode) value);
        return;
      case WorkflowModelPackage.OUTPUTPORT_EDGES_FEATURE_ID:
        getTarget().setEdges((List<Edge>) value);
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

      case WorkflowModelPackage.OUTPUTPORT_EDGES_FEATURE_ID:
        return getTarget().addToEdges((Edge) value);
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

      case WorkflowModelPackage.OUTPUTPORT_EDGES_FEATURE_ID:
        return getTarget().removeFromEdges((Edge) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Port</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PortModelObject<E extends Port> extends WorkflowElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getPortEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.PORT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case WorkflowModelPackage.PORT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case WorkflowModelPackage.PORT_NAME_FEATURE_ID:
        return getTarget().getName();
      case WorkflowModelPackage.PORT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case WorkflowModelPackage.PORT_X_FEATURE_ID:
        return getTarget().getX();
      case WorkflowModelPackage.PORT_Y_FEATURE_ID:
        return getTarget().getY();
      case WorkflowModelPackage.PORT_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case WorkflowModelPackage.PORT_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case WorkflowModelPackage.PORT_WORKFLOWELEMENTID_FEATURE_ID:
        return getTarget().getWorkFlowElementId();
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
   * The adapter/wrapper for the EClass '<em><b>InputPort</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InputPortModelObject<E extends InputPort> extends PortModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getInputPortEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.INPUTPORT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case WorkflowModelPackage.INPUTPORT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case WorkflowModelPackage.INPUTPORT_NAME_FEATURE_ID:
        return getTarget().getName();
      case WorkflowModelPackage.INPUTPORT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case WorkflowModelPackage.INPUTPORT_X_FEATURE_ID:
        return getTarget().getX();
      case WorkflowModelPackage.INPUTPORT_Y_FEATURE_ID:
        return getTarget().getY();
      case WorkflowModelPackage.INPUTPORT_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case WorkflowModelPackage.INPUTPORT_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case WorkflowModelPackage.INPUTPORT_WORKFLOWELEMENTID_FEATURE_ID:
        return getTarget().getWorkFlowElementId();
      case WorkflowModelPackage.INPUTPORT_NODE_FEATURE_ID:
        return getTarget().getNode();
      case WorkflowModelPackage.INPUTPORT_EDGES_FEATURE_ID:
        return getTarget().getEdges();
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
      case WorkflowModelPackage.INPUTPORT_NODE_FEATURE_ID:
        getTarget().setNode((WorkflowNode) value);
        return;
      case WorkflowModelPackage.INPUTPORT_EDGES_FEATURE_ID:
        getTarget().setEdges((List<Edge>) value);
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

      case WorkflowModelPackage.INPUTPORT_EDGES_FEATURE_ID:
        return getTarget().addToEdges((Edge) value);
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

      case WorkflowModelPackage.INPUTPORT_EDGES_FEATURE_ID:
        return getTarget().removeFromEdges((Edge) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Fault</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class FaultModelObject<E extends Fault> extends OutputPortModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getFaultEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.FAULT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case WorkflowModelPackage.FAULT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case WorkflowModelPackage.FAULT_NAME_FEATURE_ID:
        return getTarget().getName();
      case WorkflowModelPackage.FAULT_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case WorkflowModelPackage.FAULT_X_FEATURE_ID:
        return getTarget().getX();
      case WorkflowModelPackage.FAULT_Y_FEATURE_ID:
        return getTarget().getY();
      case WorkflowModelPackage.FAULT_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case WorkflowModelPackage.FAULT_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case WorkflowModelPackage.FAULT_WORKFLOWELEMENTID_FEATURE_ID:
        return getTarget().getWorkFlowElementId();
      case WorkflowModelPackage.FAULT_NODE_FEATURE_ID:
        return getTarget().getNode();
      case WorkflowModelPackage.FAULT_EDGES_FEATURE_ID:
        return getTarget().getEdges();
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
   * The adapter/wrapper for the EClass '<em><b>CompoundTask</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CompoundTaskModelObject<E extends CompoundTask> extends WorkflowNodeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getCompoundTaskEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.COMPOUNDTASK_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case WorkflowModelPackage.COMPOUNDTASK_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case WorkflowModelPackage.COMPOUNDTASK_NAME_FEATURE_ID:
        return getTarget().getName();
      case WorkflowModelPackage.COMPOUNDTASK_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case WorkflowModelPackage.COMPOUNDTASK_X_FEATURE_ID:
        return getTarget().getX();
      case WorkflowModelPackage.COMPOUNDTASK_Y_FEATURE_ID:
        return getTarget().getY();
      case WorkflowModelPackage.COMPOUNDTASK_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case WorkflowModelPackage.COMPOUNDTASK_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case WorkflowModelPackage.COMPOUNDTASK_WORKFLOWELEMENTID_FEATURE_ID:
        return getTarget().getWorkFlowElementId();
      case WorkflowModelPackage.COMPOUNDTASK_WORKFLOW_FEATURE_ID:
        return getTarget().getWorkflow();
      case WorkflowModelPackage.COMPOUNDTASK_OUTPUTS_FEATURE_ID:
        return getTarget().getOutputs();
      case WorkflowModelPackage.COMPOUNDTASK_INPUTS_FEATURE_ID:
        return getTarget().getInputs();
      case WorkflowModelPackage.COMPOUNDTASK_ISSTART_FEATURE_ID:
        return getTarget().isIsStart();
      case WorkflowModelPackage.COMPOUNDTASK_ISFINISH_FEATURE_ID:
        return getTarget().isIsFinish();
      case WorkflowModelPackage.COMPOUNDTASK_SUBWORKFLOW_FEATURE_ID:
        return getTarget().getSubworkflow();
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
      case WorkflowModelPackage.COMPOUNDTASK_SUBWORKFLOW_FEATURE_ID:
        getTarget().setSubworkflow((Workflow) value);
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
   * The adapter/wrapper for the EClass '<em><b>TransformationTask</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TransformationTaskModelObject<E extends TransformationTask> extends WorkflowNodeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getTransformationTaskEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.TRANSFORMATIONTASK_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case WorkflowModelPackage.TRANSFORMATIONTASK_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case WorkflowModelPackage.TRANSFORMATIONTASK_NAME_FEATURE_ID:
        return getTarget().getName();
      case WorkflowModelPackage.TRANSFORMATIONTASK_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case WorkflowModelPackage.TRANSFORMATIONTASK_X_FEATURE_ID:
        return getTarget().getX();
      case WorkflowModelPackage.TRANSFORMATIONTASK_Y_FEATURE_ID:
        return getTarget().getY();
      case WorkflowModelPackage.TRANSFORMATIONTASK_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case WorkflowModelPackage.TRANSFORMATIONTASK_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case WorkflowModelPackage.TRANSFORMATIONTASK_WORKFLOWELEMENTID_FEATURE_ID:
        return getTarget().getWorkFlowElementId();
      case WorkflowModelPackage.TRANSFORMATIONTASK_WORKFLOW_FEATURE_ID:
        return getTarget().getWorkflow();
      case WorkflowModelPackage.TRANSFORMATIONTASK_OUTPUTS_FEATURE_ID:
        return getTarget().getOutputs();
      case WorkflowModelPackage.TRANSFORMATIONTASK_INPUTS_FEATURE_ID:
        return getTarget().getInputs();
      case WorkflowModelPackage.TRANSFORMATIONTASK_ISSTART_FEATURE_ID:
        return getTarget().isIsStart();
      case WorkflowModelPackage.TRANSFORMATIONTASK_ISFINISH_FEATURE_ID:
        return getTarget().isIsFinish();
      case WorkflowModelPackage.TRANSFORMATIONTASK_TRANSFORMEXPRESSION_FEATURE_ID:
        return getTarget().getTransformExpression();
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
      case WorkflowModelPackage.TRANSFORMATIONTASK_TRANSFORMEXPRESSION_FEATURE_ID:
        getTarget().setTransformExpression((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>ConditionalTask</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConditionalTaskModelObject<E extends ConditionalTask> extends WorkflowNodeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getConditionalTaskEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.CONDITIONALTASK_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case WorkflowModelPackage.CONDITIONALTASK_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case WorkflowModelPackage.CONDITIONALTASK_NAME_FEATURE_ID:
        return getTarget().getName();
      case WorkflowModelPackage.CONDITIONALTASK_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case WorkflowModelPackage.CONDITIONALTASK_X_FEATURE_ID:
        return getTarget().getX();
      case WorkflowModelPackage.CONDITIONALTASK_Y_FEATURE_ID:
        return getTarget().getY();
      case WorkflowModelPackage.CONDITIONALTASK_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case WorkflowModelPackage.CONDITIONALTASK_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case WorkflowModelPackage.CONDITIONALTASK_WORKFLOWELEMENTID_FEATURE_ID:
        return getTarget().getWorkFlowElementId();
      case WorkflowModelPackage.CONDITIONALTASK_WORKFLOW_FEATURE_ID:
        return getTarget().getWorkflow();
      case WorkflowModelPackage.CONDITIONALTASK_OUTPUTS_FEATURE_ID:
        return getTarget().getOutputs();
      case WorkflowModelPackage.CONDITIONALTASK_INPUTS_FEATURE_ID:
        return getTarget().getInputs();
      case WorkflowModelPackage.CONDITIONALTASK_ISSTART_FEATURE_ID:
        return getTarget().isIsStart();
      case WorkflowModelPackage.CONDITIONALTASK_ISFINISH_FEATURE_ID:
        return getTarget().isIsFinish();
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
   * The adapter/wrapper for the EClass '<em><b>LoopTask</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class LoopTaskModelObject<E extends LoopTask> extends CompoundTaskModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getLoopTaskEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.LOOPTASK_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case WorkflowModelPackage.LOOPTASK_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case WorkflowModelPackage.LOOPTASK_NAME_FEATURE_ID:
        return getTarget().getName();
      case WorkflowModelPackage.LOOPTASK_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case WorkflowModelPackage.LOOPTASK_X_FEATURE_ID:
        return getTarget().getX();
      case WorkflowModelPackage.LOOPTASK_Y_FEATURE_ID:
        return getTarget().getY();
      case WorkflowModelPackage.LOOPTASK_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case WorkflowModelPackage.LOOPTASK_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case WorkflowModelPackage.LOOPTASK_WORKFLOWELEMENTID_FEATURE_ID:
        return getTarget().getWorkFlowElementId();
      case WorkflowModelPackage.LOOPTASK_WORKFLOW_FEATURE_ID:
        return getTarget().getWorkflow();
      case WorkflowModelPackage.LOOPTASK_OUTPUTS_FEATURE_ID:
        return getTarget().getOutputs();
      case WorkflowModelPackage.LOOPTASK_INPUTS_FEATURE_ID:
        return getTarget().getInputs();
      case WorkflowModelPackage.LOOPTASK_ISSTART_FEATURE_ID:
        return getTarget().isIsStart();
      case WorkflowModelPackage.LOOPTASK_ISFINISH_FEATURE_ID:
        return getTarget().isIsFinish();
      case WorkflowModelPackage.LOOPTASK_SUBWORKFLOW_FEATURE_ID:
        return getTarget().getSubworkflow();
      case WorkflowModelPackage.LOOPTASK_WHILECONDITION_FEATURE_ID:
        return getTarget().getWhileCondition();
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
      case WorkflowModelPackage.LOOPTASK_WHILECONDITION_FEATURE_ID:
        getTarget().setWhileCondition((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Task</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TaskModelObject<E extends Task> extends WorkflowNodeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return WorkflowModelPackage.INSTANCE.getTaskEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return WorkflowModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case WorkflowModelPackage.TASK_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case WorkflowModelPackage.TASK_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case WorkflowModelPackage.TASK_NAME_FEATURE_ID:
        return getTarget().getName();
      case WorkflowModelPackage.TASK_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case WorkflowModelPackage.TASK_X_FEATURE_ID:
        return getTarget().getX();
      case WorkflowModelPackage.TASK_Y_FEATURE_ID:
        return getTarget().getY();
      case WorkflowModelPackage.TASK_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case WorkflowModelPackage.TASK_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case WorkflowModelPackage.TASK_WORKFLOWELEMENTID_FEATURE_ID:
        return getTarget().getWorkFlowElementId();
      case WorkflowModelPackage.TASK_WORKFLOW_FEATURE_ID:
        return getTarget().getWorkflow();
      case WorkflowModelPackage.TASK_OUTPUTS_FEATURE_ID:
        return getTarget().getOutputs();
      case WorkflowModelPackage.TASK_INPUTS_FEATURE_ID:
        return getTarget().getInputs();
      case WorkflowModelPackage.TASK_ISSTART_FEATURE_ID:
        return getTarget().isIsStart();
      case WorkflowModelPackage.TASK_ISFINISH_FEATURE_ID:
        return getTarget().isIsFinish();
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
}