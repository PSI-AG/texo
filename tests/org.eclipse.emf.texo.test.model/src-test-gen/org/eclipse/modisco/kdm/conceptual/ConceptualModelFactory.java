package org.eclipse.modisco.kdm.conceptual;

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
import org.eclipse.modisco.kdm.core.CoreModelFactory;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.kdm.KdmModelFactory;
import org.eclipse.modisco.kdm.source.SourceRef;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: conceptual. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ConceptualModelFactory implements ModelFactory {

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
    case ConceptualModelPackage.CONCEPTUALMODEL_CLASSIFIER_ID:
      return createConceptualModel();
    case ConceptualModelPackage.TERMUNIT_CLASSIFIER_ID:
      return createTermUnit();
    case ConceptualModelPackage.CONCEPTUALCONTAINER_CLASSIFIER_ID:
      return createConceptualContainer();
    case ConceptualModelPackage.FACTUNIT_CLASSIFIER_ID:
      return createFactUnit();
    case ConceptualModelPackage.CONCEPTUALRELATIONSHIP_CLASSIFIER_ID:
      return createConceptualRelationship();
    case ConceptualModelPackage.BEHAVIORUNIT_CLASSIFIER_ID:
      return createBehaviorUnit();
    case ConceptualModelPackage.RULEUNIT_CLASSIFIER_ID:
      return createRuleUnit();
    case ConceptualModelPackage.SCENARIOUNIT_CLASSIFIER_ID:
      return createScenarioUnit();
    case ConceptualModelPackage.CONCEPTUALFLOW_CLASSIFIER_ID:
      return createConceptualFlow();
    case ConceptualModelPackage.CONCEPTUALELEMENT_CLASSIFIER_ID:
      return createConceptualElement();
    case ConceptualModelPackage.CONCEPTUALROLE_CLASSIFIER_ID:
      return createConceptualRole();
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
    case ConceptualModelPackage.CONCEPTUALMODEL_CLASSIFIER_ID:
      modelObject = new ConceptualModelModelObject();
      break;
    case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_CLASSIFIER_ID:
      modelObject = new AbstractConceptualElementModelObject();
      break;
    case ConceptualModelPackage.ABSTRACTCONCEPTUALRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new AbstractConceptualRelationshipModelObject();
      break;
    case ConceptualModelPackage.TERMUNIT_CLASSIFIER_ID:
      modelObject = new TermUnitModelObject();
      break;
    case ConceptualModelPackage.CONCEPTUALCONTAINER_CLASSIFIER_ID:
      modelObject = new ConceptualContainerModelObject();
      break;
    case ConceptualModelPackage.FACTUNIT_CLASSIFIER_ID:
      modelObject = new FactUnitModelObject();
      break;
    case ConceptualModelPackage.CONCEPTUALRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new ConceptualRelationshipModelObject();
      break;
    case ConceptualModelPackage.BEHAVIORUNIT_CLASSIFIER_ID:
      modelObject = new BehaviorUnitModelObject();
      break;
    case ConceptualModelPackage.RULEUNIT_CLASSIFIER_ID:
      modelObject = new RuleUnitModelObject();
      break;
    case ConceptualModelPackage.SCENARIOUNIT_CLASSIFIER_ID:
      modelObject = new ScenarioUnitModelObject();
      break;
    case ConceptualModelPackage.CONCEPTUALFLOW_CLASSIFIER_ID:
      modelObject = new ConceptualFlowModelObject();
      break;
    case ConceptualModelPackage.CONCEPTUALELEMENT_CLASSIFIER_ID:
      modelObject = new ConceptualElementModelObject();
      break;
    case ConceptualModelPackage.CONCEPTUALROLE_CLASSIFIER_ID:
      modelObject = new ConceptualRoleModelObject();
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
   * @return an instance of the model object representing the EClass ConceptualModel
   * @generated
   */
  public ConceptualModel createConceptualModel() {
    return new ConceptualModel();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TermUnit
   * @generated
   */
  public TermUnit createTermUnit() {
    return new TermUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ConceptualContainer
   * @generated
   */
  public ConceptualContainer createConceptualContainer() {
    return new ConceptualContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass FactUnit
   * @generated
   */
  public FactUnit createFactUnit() {
    return new FactUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ConceptualRelationship
   * @generated
   */
  public ConceptualRelationship createConceptualRelationship() {
    return new ConceptualRelationship();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BehaviorUnit
   * @generated
   */
  public BehaviorUnit createBehaviorUnit() {
    return new BehaviorUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RuleUnit
   * @generated
   */
  public RuleUnit createRuleUnit() {
    return new RuleUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ScenarioUnit
   * @generated
   */
  public ScenarioUnit createScenarioUnit() {
    return new ScenarioUnit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ConceptualFlow
   * @generated
   */
  public ConceptualFlow createConceptualFlow() {
    return new ConceptualFlow();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ConceptualElement
   * @generated
   */
  public ConceptualElement createConceptualElement() {
    return new ConceptualElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ConceptualRole
   * @generated
   */
  public ConceptualRole createConceptualRole() {
    return new ConceptualRole();
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
   * The adapter/wrapper for the EClass '<em><b>ConceptualModel</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConceptualModelModelObject<E extends ConceptualModel> extends
      KdmModelFactory.KDMModelModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ConceptualModelPackage.INSTANCE.getConceptualModelEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ConceptualModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ConceptualModelPackage.CONCEPTUALMODEL_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ConceptualModelPackage.CONCEPTUALMODEL_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ConceptualModelPackage.CONCEPTUALMODEL_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ConceptualModelPackage.CONCEPTUALMODEL_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ConceptualModelPackage.CONCEPTUALMODEL_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ConceptualModelPackage.CONCEPTUALMODEL_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ConceptualModelPackage.CONCEPTUALMODEL_AUDIT_FEATURE_ID:
        return getTarget().getAudit();
      case ConceptualModelPackage.CONCEPTUALMODEL_EXTENSION_FEATURE_ID:
        return getTarget().getExtension();
      case ConceptualModelPackage.CONCEPTUALMODEL_NAME_FEATURE_ID:
        return getTarget().getName();
      case ConceptualModelPackage.CONCEPTUALMODEL_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case ConceptualModelPackage.CONCEPTUALMODEL_CONCEPTUALELEMENT_FEATURE_ID:
        return getTarget().getConceptualElement();
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
      case ConceptualModelPackage.CONCEPTUALMODEL_CONCEPTUALELEMENT_FEATURE_ID:
        getTarget().setConceptualElement((Set<AbstractConceptualElement>) value);
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

      case ConceptualModelPackage.CONCEPTUALMODEL_CONCEPTUALELEMENT_FEATURE_ID:
        return getTarget().addToConceptualElement((AbstractConceptualElement) value);
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

      case ConceptualModelPackage.CONCEPTUALMODEL_CONCEPTUALELEMENT_FEATURE_ID:
        return getTarget().removeFromConceptualElement((AbstractConceptualElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractConceptualElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractConceptualElementModelObject<E extends AbstractConceptualElement> extends
      CoreModelFactory.KDMEntityModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ConceptualModelPackage.INSTANCE.getAbstractConceptualElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ConceptualModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_CONCEPTUALRELATION_FEATURE_ID:
        return getTarget().getConceptualRelation();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
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
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_SOURCE_FEATURE_ID:
        getTarget().setSource((Set<SourceRef>) value);
        return;
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_IMPLEMENTATION_FEATURE_ID:
        getTarget().setImplementation((Set<KDMEntity>) value);
        return;
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_CONCEPTUALRELATION_FEATURE_ID:
        getTarget().setConceptualRelation((Set<AbstractConceptualRelationship>) value);
        return;
      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_ABSTRACTION_FEATURE_ID:
        getTarget().setAbstraction((Set<ActionElement>) value);
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

      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_SOURCE_FEATURE_ID:
        return getTarget().addToSource((SourceRef) value);

      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().addToImplementation((KDMEntity) value);

      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_CONCEPTUALRELATION_FEATURE_ID:
        return getTarget().addToConceptualRelation((AbstractConceptualRelationship) value);

      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().addToAbstraction((ActionElement) value);
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

      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_SOURCE_FEATURE_ID:
        return getTarget().removeFromSource((SourceRef) value);

      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().removeFromImplementation((KDMEntity) value);

      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_CONCEPTUALRELATION_FEATURE_ID:
        return getTarget().removeFromConceptualRelation((AbstractConceptualRelationship) value);

      case ConceptualModelPackage.ABSTRACTCONCEPTUALELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().removeFromAbstraction((ActionElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractConceptualRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractConceptualRelationshipModelObject<E extends AbstractConceptualRelationship> extends
      CoreModelFactory.KDMRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ConceptualModelPackage.INSTANCE.getAbstractConceptualRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ConceptualModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ConceptualModelPackage.ABSTRACTCONCEPTUALRELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALRELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALRELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALRELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALRELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ConceptualModelPackage.ABSTRACTCONCEPTUALRELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>TermUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TermUnitModelObject<E extends TermUnit> extends AbstractConceptualElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ConceptualModelPackage.INSTANCE.getTermUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ConceptualModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ConceptualModelPackage.TERMUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ConceptualModelPackage.TERMUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ConceptualModelPackage.TERMUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ConceptualModelPackage.TERMUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ConceptualModelPackage.TERMUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ConceptualModelPackage.TERMUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ConceptualModelPackage.TERMUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case ConceptualModelPackage.TERMUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case ConceptualModelPackage.TERMUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case ConceptualModelPackage.TERMUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case ConceptualModelPackage.TERMUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case ConceptualModelPackage.TERMUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case ConceptualModelPackage.TERMUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case ConceptualModelPackage.TERMUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case ConceptualModelPackage.TERMUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case ConceptualModelPackage.TERMUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case ConceptualModelPackage.TERMUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case ConceptualModelPackage.TERMUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case ConceptualModelPackage.TERMUNIT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case ConceptualModelPackage.TERMUNIT_CONCEPTUALRELATION_FEATURE_ID:
        return getTarget().getConceptualRelation();
      case ConceptualModelPackage.TERMUNIT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
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
   * The adapter/wrapper for the EClass '<em><b>ConceptualContainer</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConceptualContainerModelObject<E extends ConceptualContainer> extends
      AbstractConceptualElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ConceptualModelPackage.INSTANCE.getConceptualContainerEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ConceptualModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ConceptualModelPackage.CONCEPTUALCONTAINER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_NAME_FEATURE_ID:
        return getTarget().getName();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_CONCEPTUALRELATION_FEATURE_ID:
        return getTarget().getConceptualRelation();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case ConceptualModelPackage.CONCEPTUALCONTAINER_CONCEPTUALELEMENT_FEATURE_ID:
        return getTarget().getConceptualElement();
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
      case ConceptualModelPackage.CONCEPTUALCONTAINER_CONCEPTUALELEMENT_FEATURE_ID:
        getTarget().setConceptualElement((Set<AbstractConceptualElement>) value);
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

      case ConceptualModelPackage.CONCEPTUALCONTAINER_CONCEPTUALELEMENT_FEATURE_ID:
        return getTarget().addToConceptualElement((AbstractConceptualElement) value);
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

      case ConceptualModelPackage.CONCEPTUALCONTAINER_CONCEPTUALELEMENT_FEATURE_ID:
        return getTarget().removeFromConceptualElement((AbstractConceptualElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>FactUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class FactUnitModelObject<E extends FactUnit> extends ConceptualContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ConceptualModelPackage.INSTANCE.getFactUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ConceptualModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ConceptualModelPackage.FACTUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ConceptualModelPackage.FACTUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ConceptualModelPackage.FACTUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ConceptualModelPackage.FACTUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ConceptualModelPackage.FACTUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ConceptualModelPackage.FACTUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ConceptualModelPackage.FACTUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case ConceptualModelPackage.FACTUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case ConceptualModelPackage.FACTUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case ConceptualModelPackage.FACTUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case ConceptualModelPackage.FACTUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case ConceptualModelPackage.FACTUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case ConceptualModelPackage.FACTUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case ConceptualModelPackage.FACTUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case ConceptualModelPackage.FACTUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case ConceptualModelPackage.FACTUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case ConceptualModelPackage.FACTUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case ConceptualModelPackage.FACTUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case ConceptualModelPackage.FACTUNIT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case ConceptualModelPackage.FACTUNIT_CONCEPTUALRELATION_FEATURE_ID:
        return getTarget().getConceptualRelation();
      case ConceptualModelPackage.FACTUNIT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case ConceptualModelPackage.FACTUNIT_CONCEPTUALELEMENT_FEATURE_ID:
        return getTarget().getConceptualElement();
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
   * The adapter/wrapper for the EClass '<em><b>ConceptualRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConceptualRelationshipModelObject<E extends ConceptualRelationship> extends
      AbstractConceptualRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ConceptualModelPackage.INSTANCE.getConceptualRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ConceptualModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ConceptualModelPackage.CONCEPTUALRELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ConceptualModelPackage.CONCEPTUALRELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ConceptualModelPackage.CONCEPTUALRELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ConceptualModelPackage.CONCEPTUALRELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ConceptualModelPackage.CONCEPTUALRELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ConceptualModelPackage.CONCEPTUALRELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ConceptualModelPackage.CONCEPTUALRELATIONSHIP_TO_FEATURE_ID:
        return getTarget().getTo();
      case ConceptualModelPackage.CONCEPTUALRELATIONSHIP_FROM_FEATURE_ID:
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
      case ConceptualModelPackage.CONCEPTUALRELATIONSHIP_TO_FEATURE_ID:
        getTarget().setTo((KDMEntity) value);
        return;
      case ConceptualModelPackage.CONCEPTUALRELATIONSHIP_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractConceptualElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>BehaviorUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BehaviorUnitModelObject<E extends BehaviorUnit> extends ConceptualContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ConceptualModelPackage.INSTANCE.getBehaviorUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ConceptualModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ConceptualModelPackage.BEHAVIORUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ConceptualModelPackage.BEHAVIORUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ConceptualModelPackage.BEHAVIORUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ConceptualModelPackage.BEHAVIORUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ConceptualModelPackage.BEHAVIORUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ConceptualModelPackage.BEHAVIORUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ConceptualModelPackage.BEHAVIORUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case ConceptualModelPackage.BEHAVIORUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case ConceptualModelPackage.BEHAVIORUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case ConceptualModelPackage.BEHAVIORUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case ConceptualModelPackage.BEHAVIORUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case ConceptualModelPackage.BEHAVIORUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case ConceptualModelPackage.BEHAVIORUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case ConceptualModelPackage.BEHAVIORUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case ConceptualModelPackage.BEHAVIORUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case ConceptualModelPackage.BEHAVIORUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case ConceptualModelPackage.BEHAVIORUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case ConceptualModelPackage.BEHAVIORUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case ConceptualModelPackage.BEHAVIORUNIT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case ConceptualModelPackage.BEHAVIORUNIT_CONCEPTUALRELATION_FEATURE_ID:
        return getTarget().getConceptualRelation();
      case ConceptualModelPackage.BEHAVIORUNIT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case ConceptualModelPackage.BEHAVIORUNIT_CONCEPTUALELEMENT_FEATURE_ID:
        return getTarget().getConceptualElement();
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
   * The adapter/wrapper for the EClass '<em><b>RuleUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RuleUnitModelObject<E extends RuleUnit> extends ConceptualContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ConceptualModelPackage.INSTANCE.getRuleUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ConceptualModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ConceptualModelPackage.RULEUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ConceptualModelPackage.RULEUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ConceptualModelPackage.RULEUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ConceptualModelPackage.RULEUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ConceptualModelPackage.RULEUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ConceptualModelPackage.RULEUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ConceptualModelPackage.RULEUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case ConceptualModelPackage.RULEUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case ConceptualModelPackage.RULEUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case ConceptualModelPackage.RULEUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case ConceptualModelPackage.RULEUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case ConceptualModelPackage.RULEUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case ConceptualModelPackage.RULEUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case ConceptualModelPackage.RULEUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case ConceptualModelPackage.RULEUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case ConceptualModelPackage.RULEUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case ConceptualModelPackage.RULEUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case ConceptualModelPackage.RULEUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case ConceptualModelPackage.RULEUNIT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case ConceptualModelPackage.RULEUNIT_CONCEPTUALRELATION_FEATURE_ID:
        return getTarget().getConceptualRelation();
      case ConceptualModelPackage.RULEUNIT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case ConceptualModelPackage.RULEUNIT_CONCEPTUALELEMENT_FEATURE_ID:
        return getTarget().getConceptualElement();
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
   * The adapter/wrapper for the EClass '<em><b>ScenarioUnit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ScenarioUnitModelObject<E extends ScenarioUnit> extends ConceptualContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ConceptualModelPackage.INSTANCE.getScenarioUnitEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ConceptualModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ConceptualModelPackage.SCENARIOUNIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ConceptualModelPackage.SCENARIOUNIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ConceptualModelPackage.SCENARIOUNIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ConceptualModelPackage.SCENARIOUNIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ConceptualModelPackage.SCENARIOUNIT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ConceptualModelPackage.SCENARIOUNIT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ConceptualModelPackage.SCENARIOUNIT_NAME_FEATURE_ID:
        return getTarget().getName();
      case ConceptualModelPackage.SCENARIOUNIT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case ConceptualModelPackage.SCENARIOUNIT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case ConceptualModelPackage.SCENARIOUNIT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case ConceptualModelPackage.SCENARIOUNIT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case ConceptualModelPackage.SCENARIOUNIT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case ConceptualModelPackage.SCENARIOUNIT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case ConceptualModelPackage.SCENARIOUNIT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case ConceptualModelPackage.SCENARIOUNIT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case ConceptualModelPackage.SCENARIOUNIT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case ConceptualModelPackage.SCENARIOUNIT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case ConceptualModelPackage.SCENARIOUNIT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case ConceptualModelPackage.SCENARIOUNIT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case ConceptualModelPackage.SCENARIOUNIT_CONCEPTUALRELATION_FEATURE_ID:
        return getTarget().getConceptualRelation();
      case ConceptualModelPackage.SCENARIOUNIT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case ConceptualModelPackage.SCENARIOUNIT_CONCEPTUALELEMENT_FEATURE_ID:
        return getTarget().getConceptualElement();
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
   * The adapter/wrapper for the EClass '<em><b>ConceptualFlow</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConceptualFlowModelObject<E extends ConceptualFlow> extends
      AbstractConceptualRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ConceptualModelPackage.INSTANCE.getConceptualFlowEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ConceptualModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ConceptualModelPackage.CONCEPTUALFLOW_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ConceptualModelPackage.CONCEPTUALFLOW_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ConceptualModelPackage.CONCEPTUALFLOW_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ConceptualModelPackage.CONCEPTUALFLOW_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ConceptualModelPackage.CONCEPTUALFLOW_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ConceptualModelPackage.CONCEPTUALFLOW_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ConceptualModelPackage.CONCEPTUALFLOW_TO_FEATURE_ID:
        return getTarget().getTo();
      case ConceptualModelPackage.CONCEPTUALFLOW_FROM_FEATURE_ID:
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
      case ConceptualModelPackage.CONCEPTUALFLOW_TO_FEATURE_ID:
        getTarget().setTo((ConceptualContainer) value);
        return;
      case ConceptualModelPackage.CONCEPTUALFLOW_FROM_FEATURE_ID:
        getTarget().setFrom((ConceptualContainer) value);
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
   * The adapter/wrapper for the EClass '<em><b>ConceptualElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConceptualElementModelObject<E extends ConceptualElement> extends
      AbstractConceptualElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ConceptualModelPackage.INSTANCE.getConceptualElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ConceptualModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ConceptualModelPackage.CONCEPTUALELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ConceptualModelPackage.CONCEPTUALELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ConceptualModelPackage.CONCEPTUALELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ConceptualModelPackage.CONCEPTUALELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ConceptualModelPackage.CONCEPTUALELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ConceptualModelPackage.CONCEPTUALELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ConceptualModelPackage.CONCEPTUALELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case ConceptualModelPackage.CONCEPTUALELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case ConceptualModelPackage.CONCEPTUALELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case ConceptualModelPackage.CONCEPTUALELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case ConceptualModelPackage.CONCEPTUALELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case ConceptualModelPackage.CONCEPTUALELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case ConceptualModelPackage.CONCEPTUALELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case ConceptualModelPackage.CONCEPTUALELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case ConceptualModelPackage.CONCEPTUALELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case ConceptualModelPackage.CONCEPTUALELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case ConceptualModelPackage.CONCEPTUALELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case ConceptualModelPackage.CONCEPTUALELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case ConceptualModelPackage.CONCEPTUALELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case ConceptualModelPackage.CONCEPTUALELEMENT_CONCEPTUALRELATION_FEATURE_ID:
        return getTarget().getConceptualRelation();
      case ConceptualModelPackage.CONCEPTUALELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
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
   * The adapter/wrapper for the EClass '<em><b>ConceptualRole</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConceptualRoleModelObject<E extends ConceptualRole> extends
      AbstractConceptualElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return ConceptualModelPackage.INSTANCE.getConceptualRoleEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return ConceptualModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case ConceptualModelPackage.CONCEPTUALROLE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case ConceptualModelPackage.CONCEPTUALROLE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case ConceptualModelPackage.CONCEPTUALROLE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case ConceptualModelPackage.CONCEPTUALROLE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case ConceptualModelPackage.CONCEPTUALROLE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case ConceptualModelPackage.CONCEPTUALROLE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case ConceptualModelPackage.CONCEPTUALROLE_NAME_FEATURE_ID:
        return getTarget().getName();
      case ConceptualModelPackage.CONCEPTUALROLE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case ConceptualModelPackage.CONCEPTUALROLE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case ConceptualModelPackage.CONCEPTUALROLE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case ConceptualModelPackage.CONCEPTUALROLE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case ConceptualModelPackage.CONCEPTUALROLE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case ConceptualModelPackage.CONCEPTUALROLE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case ConceptualModelPackage.CONCEPTUALROLE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case ConceptualModelPackage.CONCEPTUALROLE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case ConceptualModelPackage.CONCEPTUALROLE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case ConceptualModelPackage.CONCEPTUALROLE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case ConceptualModelPackage.CONCEPTUALROLE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case ConceptualModelPackage.CONCEPTUALROLE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case ConceptualModelPackage.CONCEPTUALROLE_CONCEPTUALRELATION_FEATURE_ID:
        return getTarget().getConceptualRelation();
      case ConceptualModelPackage.CONCEPTUALROLE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case ConceptualModelPackage.CONCEPTUALROLE_CONCEPTUALELEMENT_FEATURE_ID:
        return getTarget().getConceptualElement();
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
      case ConceptualModelPackage.CONCEPTUALROLE_CONCEPTUALELEMENT_FEATURE_ID:
        getTarget().setConceptualElement((AbstractConceptualElement) value);
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