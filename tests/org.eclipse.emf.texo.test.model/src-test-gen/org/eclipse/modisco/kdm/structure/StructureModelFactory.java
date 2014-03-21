package org.eclipse.modisco.kdm.structure;

import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.modisco.kdm.core.AggregatedRelationship;
import org.eclipse.modisco.kdm.core.CoreModelFactory;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.kdm.KdmModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: structure. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class StructureModelFactory implements ModelFactory {

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
    case StructureModelPackage.SUBSYSTEM_CLASSIFIER_ID:
      return createSubsystem();
    case StructureModelPackage.LAYER_CLASSIFIER_ID:
      return createLayer();
    case StructureModelPackage.STRUCTUREMODEL_CLASSIFIER_ID:
      return createStructureModel();
    case StructureModelPackage.COMPONENT_CLASSIFIER_ID:
      return createComponent();
    case StructureModelPackage.SOFTWARESYSTEM_CLASSIFIER_ID:
      return createSoftwareSystem();
    case StructureModelPackage.STRUCTURERELATIONSHIP_CLASSIFIER_ID:
      return createStructureRelationship();
    case StructureModelPackage.ARCHITECTUREVIEW_CLASSIFIER_ID:
      return createArchitectureView();
    case StructureModelPackage.STRUCTUREELEMENT_CLASSIFIER_ID:
      return createStructureElement();
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
    case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_CLASSIFIER_ID:
      modelObject = new AbstractStructureElementModelObject();
      break;
    case StructureModelPackage.ABSTRACTSTRUCTURERELATIONSHIP_CLASSIFIER_ID:
      modelObject = new AbstractStructureRelationshipModelObject();
      break;
    case StructureModelPackage.SUBSYSTEM_CLASSIFIER_ID:
      modelObject = new SubsystemModelObject();
      break;
    case StructureModelPackage.LAYER_CLASSIFIER_ID:
      modelObject = new LayerModelObject();
      break;
    case StructureModelPackage.STRUCTUREMODEL_CLASSIFIER_ID:
      modelObject = new StructureModelModelObject();
      break;
    case StructureModelPackage.COMPONENT_CLASSIFIER_ID:
      modelObject = new ComponentModelObject();
      break;
    case StructureModelPackage.SOFTWARESYSTEM_CLASSIFIER_ID:
      modelObject = new SoftwareSystemModelObject();
      break;
    case StructureModelPackage.STRUCTURERELATIONSHIP_CLASSIFIER_ID:
      modelObject = new StructureRelationshipModelObject();
      break;
    case StructureModelPackage.ARCHITECTUREVIEW_CLASSIFIER_ID:
      modelObject = new ArchitectureViewModelObject();
      break;
    case StructureModelPackage.STRUCTUREELEMENT_CLASSIFIER_ID:
      modelObject = new StructureElementModelObject();
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
   * @return an instance of the model object representing the EClass Subsystem
   * @generated
   */
  public Subsystem createSubsystem() {
    return new Subsystem();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Layer
   * @generated
   */
  public Layer createLayer() {
    return new Layer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass StructureModel
   * @generated
   */
  public StructureModel createStructureModel() {
    return new StructureModel();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Component
   * @generated
   */
  public Component createComponent() {
    return new Component();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SoftwareSystem
   * @generated
   */
  public SoftwareSystem createSoftwareSystem() {
    return new SoftwareSystem();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass StructureRelationship
   * @generated
   */
  public StructureRelationship createStructureRelationship() {
    return new StructureRelationship();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ArchitectureView
   * @generated
   */
  public ArchitectureView createArchitectureView() {
    return new ArchitectureView();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass StructureElement
   * @generated
   */
  public StructureElement createStructureElement() {
    return new StructureElement();
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
   * The adapter/wrapper for the EClass '<em><b>AbstractStructureElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractStructureElementModelObject<E extends AbstractStructureElement> extends
      CoreModelFactory.KDMEntityModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StructureModelPackage.INSTANCE.getAbstractStructureElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StructureModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_AGGREGATED_FEATURE_ID:
        return getTarget().getAggregated();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_STRUCTUREELEMENT_FEATURE_ID:
        return getTarget().getStructureElement();
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_STRUCTURERELATIONSHIP_FEATURE_ID:
        return getTarget().getStructureRelationship();
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
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_AGGREGATED_FEATURE_ID:
        getTarget().setAggregated((Set<AggregatedRelationship>) value);
        return;
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_IMPLEMENTATION_FEATURE_ID:
        getTarget().setImplementation((Set<KDMEntity>) value);
        return;
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_STRUCTUREELEMENT_FEATURE_ID:
        getTarget().setStructureElement((Set<AbstractStructureElement>) value);
        return;
      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_STRUCTURERELATIONSHIP_FEATURE_ID:
        getTarget().setStructureRelationship((Set<AbstractStructureRelationship>) value);
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

      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_AGGREGATED_FEATURE_ID:
        return getTarget().addToAggregated((AggregatedRelationship) value);

      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().addToImplementation((KDMEntity) value);

      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_STRUCTUREELEMENT_FEATURE_ID:
        return getTarget().addToStructureElement((AbstractStructureElement) value);

      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_STRUCTURERELATIONSHIP_FEATURE_ID:
        return getTarget().addToStructureRelationship((AbstractStructureRelationship) value);
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

      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_AGGREGATED_FEATURE_ID:
        return getTarget().removeFromAggregated((AggregatedRelationship) value);

      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().removeFromImplementation((KDMEntity) value);

      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_STRUCTUREELEMENT_FEATURE_ID:
        return getTarget().removeFromStructureElement((AbstractStructureElement) value);

      case StructureModelPackage.ABSTRACTSTRUCTUREELEMENT_STRUCTURERELATIONSHIP_FEATURE_ID:
        return getTarget().removeFromStructureRelationship((AbstractStructureRelationship) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractStructureRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractStructureRelationshipModelObject<E extends AbstractStructureRelationship> extends
      CoreModelFactory.KDMRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StructureModelPackage.INSTANCE.getAbstractStructureRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StructureModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StructureModelPackage.ABSTRACTSTRUCTURERELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StructureModelPackage.ABSTRACTSTRUCTURERELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StructureModelPackage.ABSTRACTSTRUCTURERELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case StructureModelPackage.ABSTRACTSTRUCTURERELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case StructureModelPackage.ABSTRACTSTRUCTURERELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case StructureModelPackage.ABSTRACTSTRUCTURERELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>Subsystem</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SubsystemModelObject<E extends Subsystem> extends AbstractStructureElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StructureModelPackage.INSTANCE.getSubsystemEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StructureModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StructureModelPackage.SUBSYSTEM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StructureModelPackage.SUBSYSTEM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StructureModelPackage.SUBSYSTEM_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case StructureModelPackage.SUBSYSTEM_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case StructureModelPackage.SUBSYSTEM_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case StructureModelPackage.SUBSYSTEM_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case StructureModelPackage.SUBSYSTEM_NAME_FEATURE_ID:
        return getTarget().getName();
      case StructureModelPackage.SUBSYSTEM_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case StructureModelPackage.SUBSYSTEM_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case StructureModelPackage.SUBSYSTEM_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case StructureModelPackage.SUBSYSTEM_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case StructureModelPackage.SUBSYSTEM_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case StructureModelPackage.SUBSYSTEM_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case StructureModelPackage.SUBSYSTEM_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case StructureModelPackage.SUBSYSTEM_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case StructureModelPackage.SUBSYSTEM_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case StructureModelPackage.SUBSYSTEM_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case StructureModelPackage.SUBSYSTEM_AGGREGATED_FEATURE_ID:
        return getTarget().getAggregated();
      case StructureModelPackage.SUBSYSTEM_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case StructureModelPackage.SUBSYSTEM_STRUCTUREELEMENT_FEATURE_ID:
        return getTarget().getStructureElement();
      case StructureModelPackage.SUBSYSTEM_STRUCTURERELATIONSHIP_FEATURE_ID:
        return getTarget().getStructureRelationship();
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
   * The adapter/wrapper for the EClass '<em><b>Layer</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class LayerModelObject<E extends Layer> extends AbstractStructureElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StructureModelPackage.INSTANCE.getLayerEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StructureModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StructureModelPackage.LAYER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StructureModelPackage.LAYER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StructureModelPackage.LAYER_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case StructureModelPackage.LAYER_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case StructureModelPackage.LAYER_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case StructureModelPackage.LAYER_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case StructureModelPackage.LAYER_NAME_FEATURE_ID:
        return getTarget().getName();
      case StructureModelPackage.LAYER_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case StructureModelPackage.LAYER_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case StructureModelPackage.LAYER_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case StructureModelPackage.LAYER_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case StructureModelPackage.LAYER_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case StructureModelPackage.LAYER_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case StructureModelPackage.LAYER_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case StructureModelPackage.LAYER_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case StructureModelPackage.LAYER_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case StructureModelPackage.LAYER_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case StructureModelPackage.LAYER_AGGREGATED_FEATURE_ID:
        return getTarget().getAggregated();
      case StructureModelPackage.LAYER_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case StructureModelPackage.LAYER_STRUCTUREELEMENT_FEATURE_ID:
        return getTarget().getStructureElement();
      case StructureModelPackage.LAYER_STRUCTURERELATIONSHIP_FEATURE_ID:
        return getTarget().getStructureRelationship();
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
   * The adapter/wrapper for the EClass '<em><b>StructureModel</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class StructureModelModelObject<E extends StructureModel> extends
      KdmModelFactory.KDMModelModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StructureModelPackage.INSTANCE.getStructureModelEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StructureModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StructureModelPackage.STRUCTUREMODEL_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StructureModelPackage.STRUCTUREMODEL_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StructureModelPackage.STRUCTUREMODEL_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case StructureModelPackage.STRUCTUREMODEL_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case StructureModelPackage.STRUCTUREMODEL_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case StructureModelPackage.STRUCTUREMODEL_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case StructureModelPackage.STRUCTUREMODEL_AUDIT_FEATURE_ID:
        return getTarget().getAudit();
      case StructureModelPackage.STRUCTUREMODEL_EXTENSION_FEATURE_ID:
        return getTarget().getExtension();
      case StructureModelPackage.STRUCTUREMODEL_NAME_FEATURE_ID:
        return getTarget().getName();
      case StructureModelPackage.STRUCTUREMODEL_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case StructureModelPackage.STRUCTUREMODEL_STRUCTUREELEMENT_FEATURE_ID:
        return getTarget().getStructureElement();
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
      case StructureModelPackage.STRUCTUREMODEL_STRUCTUREELEMENT_FEATURE_ID:
        getTarget().setStructureElement((Set<AbstractStructureElement>) value);
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

      case StructureModelPackage.STRUCTUREMODEL_STRUCTUREELEMENT_FEATURE_ID:
        return getTarget().addToStructureElement((AbstractStructureElement) value);
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

      case StructureModelPackage.STRUCTUREMODEL_STRUCTUREELEMENT_FEATURE_ID:
        return getTarget().removeFromStructureElement((AbstractStructureElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Component</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ComponentModelObject<E extends Component> extends AbstractStructureElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StructureModelPackage.INSTANCE.getComponentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StructureModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StructureModelPackage.COMPONENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StructureModelPackage.COMPONENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StructureModelPackage.COMPONENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case StructureModelPackage.COMPONENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case StructureModelPackage.COMPONENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case StructureModelPackage.COMPONENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case StructureModelPackage.COMPONENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case StructureModelPackage.COMPONENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case StructureModelPackage.COMPONENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case StructureModelPackage.COMPONENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case StructureModelPackage.COMPONENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case StructureModelPackage.COMPONENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case StructureModelPackage.COMPONENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case StructureModelPackage.COMPONENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case StructureModelPackage.COMPONENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case StructureModelPackage.COMPONENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case StructureModelPackage.COMPONENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case StructureModelPackage.COMPONENT_AGGREGATED_FEATURE_ID:
        return getTarget().getAggregated();
      case StructureModelPackage.COMPONENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case StructureModelPackage.COMPONENT_STRUCTUREELEMENT_FEATURE_ID:
        return getTarget().getStructureElement();
      case StructureModelPackage.COMPONENT_STRUCTURERELATIONSHIP_FEATURE_ID:
        return getTarget().getStructureRelationship();
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
   * The adapter/wrapper for the EClass '<em><b>SoftwareSystem</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SoftwareSystemModelObject<E extends SoftwareSystem> extends
      AbstractStructureElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StructureModelPackage.INSTANCE.getSoftwareSystemEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StructureModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StructureModelPackage.SOFTWARESYSTEM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StructureModelPackage.SOFTWARESYSTEM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StructureModelPackage.SOFTWARESYSTEM_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case StructureModelPackage.SOFTWARESYSTEM_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case StructureModelPackage.SOFTWARESYSTEM_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case StructureModelPackage.SOFTWARESYSTEM_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case StructureModelPackage.SOFTWARESYSTEM_NAME_FEATURE_ID:
        return getTarget().getName();
      case StructureModelPackage.SOFTWARESYSTEM_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case StructureModelPackage.SOFTWARESYSTEM_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case StructureModelPackage.SOFTWARESYSTEM_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case StructureModelPackage.SOFTWARESYSTEM_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case StructureModelPackage.SOFTWARESYSTEM_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case StructureModelPackage.SOFTWARESYSTEM_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case StructureModelPackage.SOFTWARESYSTEM_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case StructureModelPackage.SOFTWARESYSTEM_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case StructureModelPackage.SOFTWARESYSTEM_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case StructureModelPackage.SOFTWARESYSTEM_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case StructureModelPackage.SOFTWARESYSTEM_AGGREGATED_FEATURE_ID:
        return getTarget().getAggregated();
      case StructureModelPackage.SOFTWARESYSTEM_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case StructureModelPackage.SOFTWARESYSTEM_STRUCTUREELEMENT_FEATURE_ID:
        return getTarget().getStructureElement();
      case StructureModelPackage.SOFTWARESYSTEM_STRUCTURERELATIONSHIP_FEATURE_ID:
        return getTarget().getStructureRelationship();
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
   * The adapter/wrapper for the EClass '<em><b>StructureRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class StructureRelationshipModelObject<E extends StructureRelationship> extends
      AbstractStructureRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StructureModelPackage.INSTANCE.getStructureRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StructureModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StructureModelPackage.STRUCTURERELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StructureModelPackage.STRUCTURERELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StructureModelPackage.STRUCTURERELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case StructureModelPackage.STRUCTURERELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case StructureModelPackage.STRUCTURERELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case StructureModelPackage.STRUCTURERELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case StructureModelPackage.STRUCTURERELATIONSHIP_TO_FEATURE_ID:
        return getTarget().getTo();
      case StructureModelPackage.STRUCTURERELATIONSHIP_FROM_FEATURE_ID:
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
      case StructureModelPackage.STRUCTURERELATIONSHIP_TO_FEATURE_ID:
        getTarget().setTo((KDMEntity) value);
        return;
      case StructureModelPackage.STRUCTURERELATIONSHIP_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractStructureElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>ArchitectureView</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ArchitectureViewModelObject<E extends ArchitectureView> extends
      AbstractStructureElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StructureModelPackage.INSTANCE.getArchitectureViewEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StructureModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StructureModelPackage.ARCHITECTUREVIEW_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StructureModelPackage.ARCHITECTUREVIEW_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StructureModelPackage.ARCHITECTUREVIEW_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case StructureModelPackage.ARCHITECTUREVIEW_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case StructureModelPackage.ARCHITECTUREVIEW_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case StructureModelPackage.ARCHITECTUREVIEW_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case StructureModelPackage.ARCHITECTUREVIEW_NAME_FEATURE_ID:
        return getTarget().getName();
      case StructureModelPackage.ARCHITECTUREVIEW_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case StructureModelPackage.ARCHITECTUREVIEW_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case StructureModelPackage.ARCHITECTUREVIEW_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case StructureModelPackage.ARCHITECTUREVIEW_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case StructureModelPackage.ARCHITECTUREVIEW_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case StructureModelPackage.ARCHITECTUREVIEW_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case StructureModelPackage.ARCHITECTUREVIEW_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case StructureModelPackage.ARCHITECTUREVIEW_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case StructureModelPackage.ARCHITECTUREVIEW_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case StructureModelPackage.ARCHITECTUREVIEW_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case StructureModelPackage.ARCHITECTUREVIEW_AGGREGATED_FEATURE_ID:
        return getTarget().getAggregated();
      case StructureModelPackage.ARCHITECTUREVIEW_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case StructureModelPackage.ARCHITECTUREVIEW_STRUCTUREELEMENT_FEATURE_ID:
        return getTarget().getStructureElement();
      case StructureModelPackage.ARCHITECTUREVIEW_STRUCTURERELATIONSHIP_FEATURE_ID:
        return getTarget().getStructureRelationship();
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
   * The adapter/wrapper for the EClass '<em><b>StructureElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class StructureElementModelObject<E extends StructureElement> extends
      AbstractStructureElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StructureModelPackage.INSTANCE.getStructureElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StructureModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StructureModelPackage.STRUCTUREELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StructureModelPackage.STRUCTUREELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StructureModelPackage.STRUCTUREELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case StructureModelPackage.STRUCTUREELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case StructureModelPackage.STRUCTUREELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case StructureModelPackage.STRUCTUREELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case StructureModelPackage.STRUCTUREELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case StructureModelPackage.STRUCTUREELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case StructureModelPackage.STRUCTUREELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case StructureModelPackage.STRUCTUREELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case StructureModelPackage.STRUCTUREELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case StructureModelPackage.STRUCTUREELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case StructureModelPackage.STRUCTUREELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case StructureModelPackage.STRUCTUREELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case StructureModelPackage.STRUCTUREELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case StructureModelPackage.STRUCTUREELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case StructureModelPackage.STRUCTUREELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case StructureModelPackage.STRUCTUREELEMENT_AGGREGATED_FEATURE_ID:
        return getTarget().getAggregated();
      case StructureModelPackage.STRUCTUREELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case StructureModelPackage.STRUCTUREELEMENT_STRUCTUREELEMENT_FEATURE_ID:
        return getTarget().getStructureElement();
      case StructureModelPackage.STRUCTUREELEMENT_STRUCTURERELATIONSHIP_FEATURE_ID:
        return getTarget().getStructureRelationship();
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