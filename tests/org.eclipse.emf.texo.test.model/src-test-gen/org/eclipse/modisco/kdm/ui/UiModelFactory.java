package org.eclipse.modisco.kdm.ui;

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
import org.eclipse.modisco.kdm.source.Image;
import org.eclipse.modisco.kdm.source.SourceRef;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: ui. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class UiModelFactory implements ModelFactory {

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
    case UiModelPackage.UIRESOURCE_CLASSIFIER_ID:
      return createUIResource();
    case UiModelPackage.UIDISPLAY_CLASSIFIER_ID:
      return createUIDisplay();
    case UiModelPackage.SCREEN_CLASSIFIER_ID:
      return createScreen();
    case UiModelPackage.REPORT_CLASSIFIER_ID:
      return createReport();
    case UiModelPackage.UIMODEL_CLASSIFIER_ID:
      return createUIModel();
    case UiModelPackage.UILAYOUT_CLASSIFIER_ID:
      return createUILayout();
    case UiModelPackage.UIFIELD_CLASSIFIER_ID:
      return createUIField();
    case UiModelPackage.DISPLAYSIMAGE_CLASSIFIER_ID:
      return createDisplaysImage();
    case UiModelPackage.DISPLAYS_CLASSIFIER_ID:
      return createDisplays();
    case UiModelPackage.UIFLOW_CLASSIFIER_ID:
      return createUIFlow();
    case UiModelPackage.UIELEMENT_CLASSIFIER_ID:
      return createUIElement();
    case UiModelPackage.UIRELATIONSHIP_CLASSIFIER_ID:
      return createUIRelationship();
    case UiModelPackage.UIACTION_CLASSIFIER_ID:
      return createUIAction();
    case UiModelPackage.UIEVENT_CLASSIFIER_ID:
      return createUIEvent();
    case UiModelPackage.READSUI_CLASSIFIER_ID:
      return createReadsUI();
    case UiModelPackage.WRITESUI_CLASSIFIER_ID:
      return createWritesUI();
    case UiModelPackage.MANAGESUI_CLASSIFIER_ID:
      return createManagesUI();
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
    case UiModelPackage.ABSTRACTUIELEMENT_CLASSIFIER_ID:
      modelObject = new AbstractUIElementModelObject();
      break;
    case UiModelPackage.ABSTRACTUIRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new AbstractUIRelationshipModelObject();
      break;
    case UiModelPackage.UIRESOURCE_CLASSIFIER_ID:
      modelObject = new UIResourceModelObject();
      break;
    case UiModelPackage.UIDISPLAY_CLASSIFIER_ID:
      modelObject = new UIDisplayModelObject();
      break;
    case UiModelPackage.SCREEN_CLASSIFIER_ID:
      modelObject = new ScreenModelObject();
      break;
    case UiModelPackage.REPORT_CLASSIFIER_ID:
      modelObject = new ReportModelObject();
      break;
    case UiModelPackage.UIMODEL_CLASSIFIER_ID:
      modelObject = new UIModelModelObject();
      break;
    case UiModelPackage.UILAYOUT_CLASSIFIER_ID:
      modelObject = new UILayoutModelObject();
      break;
    case UiModelPackage.UIFIELD_CLASSIFIER_ID:
      modelObject = new UIFieldModelObject();
      break;
    case UiModelPackage.DISPLAYSIMAGE_CLASSIFIER_ID:
      modelObject = new DisplaysImageModelObject();
      break;
    case UiModelPackage.DISPLAYS_CLASSIFIER_ID:
      modelObject = new DisplaysModelObject();
      break;
    case UiModelPackage.UIFLOW_CLASSIFIER_ID:
      modelObject = new UIFlowModelObject();
      break;
    case UiModelPackage.UIELEMENT_CLASSIFIER_ID:
      modelObject = new UIElementModelObject();
      break;
    case UiModelPackage.UIRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new UIRelationshipModelObject();
      break;
    case UiModelPackage.UIACTION_CLASSIFIER_ID:
      modelObject = new UIActionModelObject();
      break;
    case UiModelPackage.UIEVENT_CLASSIFIER_ID:
      modelObject = new UIEventModelObject();
      break;
    case UiModelPackage.READSUI_CLASSIFIER_ID:
      modelObject = new ReadsUIModelObject();
      break;
    case UiModelPackage.WRITESUI_CLASSIFIER_ID:
      modelObject = new WritesUIModelObject();
      break;
    case UiModelPackage.MANAGESUI_CLASSIFIER_ID:
      modelObject = new ManagesUIModelObject();
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
   * @return an instance of the model object representing the EClass UIResource
   * @generated
   */
  public UIResource createUIResource() {
    return new UIResource();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass UIDisplay
   * @generated
   */
  public UIDisplay createUIDisplay() {
    return new UIDisplay();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Screen
   * @generated
   */
  public Screen createScreen() {
    return new Screen();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Report
   * @generated
   */
  public Report createReport() {
    return new Report();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass UIModel
   * @generated
   */
  public UIModel createUIModel() {
    return new UIModel();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass UILayout
   * @generated
   */
  public UILayout createUILayout() {
    return new UILayout();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass UIField
   * @generated
   */
  public UIField createUIField() {
    return new UIField();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DisplaysImage
   * @generated
   */
  public DisplaysImage createDisplaysImage() {
    return new DisplaysImage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Displays
   * @generated
   */
  public Displays createDisplays() {
    return new Displays();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass UIFlow
   * @generated
   */
  public UIFlow createUIFlow() {
    return new UIFlow();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass UIElement
   * @generated
   */
  public UIElement createUIElement() {
    return new UIElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass UIRelationship
   * @generated
   */
  public UIRelationship createUIRelationship() {
    return new UIRelationship();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass UIAction
   * @generated
   */
  public UIAction createUIAction() {
    return new UIAction();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass UIEvent
   * @generated
   */
  public UIEvent createUIEvent() {
    return new UIEvent();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ReadsUI
   * @generated
   */
  public ReadsUI createReadsUI() {
    return new ReadsUI();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass WritesUI
   * @generated
   */
  public WritesUI createWritesUI() {
    return new WritesUI();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ManagesUI
   * @generated
   */
  public ManagesUI createManagesUI() {
    return new ManagesUI();
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
   * The adapter/wrapper for the EClass '<em><b>AbstractUIElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractUIElementModelObject<E extends AbstractUIElement> extends
      CoreModelFactory.KDMEntityModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getAbstractUIElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.ABSTRACTUIELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.ABSTRACTUIELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.ABSTRACTUIELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.ABSTRACTUIELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.ABSTRACTUIELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.ABSTRACTUIELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.ABSTRACTUIELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case UiModelPackage.ABSTRACTUIELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case UiModelPackage.ABSTRACTUIELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case UiModelPackage.ABSTRACTUIELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case UiModelPackage.ABSTRACTUIELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case UiModelPackage.ABSTRACTUIELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case UiModelPackage.ABSTRACTUIELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case UiModelPackage.ABSTRACTUIELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case UiModelPackage.ABSTRACTUIELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case UiModelPackage.ABSTRACTUIELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case UiModelPackage.ABSTRACTUIELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case UiModelPackage.ABSTRACTUIELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case UiModelPackage.ABSTRACTUIELEMENT_UIRELATION_FEATURE_ID:
        return getTarget().getUIRelation();
      case UiModelPackage.ABSTRACTUIELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case UiModelPackage.ABSTRACTUIELEMENT_ABSTRACTION_FEATURE_ID:
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
      case UiModelPackage.ABSTRACTUIELEMENT_SOURCE_FEATURE_ID:
        getTarget().setSource((Set<SourceRef>) value);
        return;
      case UiModelPackage.ABSTRACTUIELEMENT_UIRELATION_FEATURE_ID:
        getTarget().setUIRelation((Set<AbstractUIRelationship>) value);
        return;
      case UiModelPackage.ABSTRACTUIELEMENT_IMPLEMENTATION_FEATURE_ID:
        getTarget().setImplementation((Set<AbstractCodeElement>) value);
        return;
      case UiModelPackage.ABSTRACTUIELEMENT_ABSTRACTION_FEATURE_ID:
        getTarget().setAbstraction((List<ActionElement>) value);
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

      case UiModelPackage.ABSTRACTUIELEMENT_SOURCE_FEATURE_ID:
        return getTarget().addToSource((SourceRef) value);

      case UiModelPackage.ABSTRACTUIELEMENT_UIRELATION_FEATURE_ID:
        return getTarget().addToUIRelation((AbstractUIRelationship) value);

      case UiModelPackage.ABSTRACTUIELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().addToImplementation((AbstractCodeElement) value);

      case UiModelPackage.ABSTRACTUIELEMENT_ABSTRACTION_FEATURE_ID:
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

      case UiModelPackage.ABSTRACTUIELEMENT_SOURCE_FEATURE_ID:
        return getTarget().removeFromSource((SourceRef) value);

      case UiModelPackage.ABSTRACTUIELEMENT_UIRELATION_FEATURE_ID:
        return getTarget().removeFromUIRelation((AbstractUIRelationship) value);

      case UiModelPackage.ABSTRACTUIELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().removeFromImplementation((AbstractCodeElement) value);

      case UiModelPackage.ABSTRACTUIELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().removeFromAbstraction((ActionElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractUIRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractUIRelationshipModelObject<E extends AbstractUIRelationship> extends
      CoreModelFactory.KDMRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getAbstractUIRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.ABSTRACTUIRELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.ABSTRACTUIRELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.ABSTRACTUIRELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.ABSTRACTUIRELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.ABSTRACTUIRELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.ABSTRACTUIRELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>UIResource</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class UIResourceModelObject<E extends UIResource> extends AbstractUIElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getUIResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.UIRESOURCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.UIRESOURCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.UIRESOURCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.UIRESOURCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.UIRESOURCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.UIRESOURCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.UIRESOURCE_NAME_FEATURE_ID:
        return getTarget().getName();
      case UiModelPackage.UIRESOURCE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case UiModelPackage.UIRESOURCE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case UiModelPackage.UIRESOURCE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case UiModelPackage.UIRESOURCE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case UiModelPackage.UIRESOURCE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case UiModelPackage.UIRESOURCE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case UiModelPackage.UIRESOURCE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case UiModelPackage.UIRESOURCE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case UiModelPackage.UIRESOURCE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case UiModelPackage.UIRESOURCE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case UiModelPackage.UIRESOURCE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case UiModelPackage.UIRESOURCE_UIRELATION_FEATURE_ID:
        return getTarget().getUIRelation();
      case UiModelPackage.UIRESOURCE_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case UiModelPackage.UIRESOURCE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case UiModelPackage.UIRESOURCE_UIELEMENT_FEATURE_ID:
        return getTarget().getUIElement();
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
      case UiModelPackage.UIRESOURCE_UIELEMENT_FEATURE_ID:
        getTarget().setUIElement((Set<AbstractUIElement>) value);
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

      case UiModelPackage.UIRESOURCE_UIELEMENT_FEATURE_ID:
        return getTarget().addToUIElement((AbstractUIElement) value);
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

      case UiModelPackage.UIRESOURCE_UIELEMENT_FEATURE_ID:
        return getTarget().removeFromUIElement((AbstractUIElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>UIDisplay</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class UIDisplayModelObject<E extends UIDisplay> extends UIResourceModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getUIDisplayEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.UIDISPLAY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.UIDISPLAY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.UIDISPLAY_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.UIDISPLAY_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.UIDISPLAY_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.UIDISPLAY_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.UIDISPLAY_NAME_FEATURE_ID:
        return getTarget().getName();
      case UiModelPackage.UIDISPLAY_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case UiModelPackage.UIDISPLAY_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case UiModelPackage.UIDISPLAY_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case UiModelPackage.UIDISPLAY_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case UiModelPackage.UIDISPLAY_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case UiModelPackage.UIDISPLAY_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case UiModelPackage.UIDISPLAY_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case UiModelPackage.UIDISPLAY_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case UiModelPackage.UIDISPLAY_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case UiModelPackage.UIDISPLAY_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case UiModelPackage.UIDISPLAY_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case UiModelPackage.UIDISPLAY_UIRELATION_FEATURE_ID:
        return getTarget().getUIRelation();
      case UiModelPackage.UIDISPLAY_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case UiModelPackage.UIDISPLAY_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case UiModelPackage.UIDISPLAY_UIELEMENT_FEATURE_ID:
        return getTarget().getUIElement();
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
   * The adapter/wrapper for the EClass '<em><b>Screen</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ScreenModelObject<E extends Screen> extends UIDisplayModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getScreenEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.SCREEN_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.SCREEN_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.SCREEN_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.SCREEN_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.SCREEN_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.SCREEN_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.SCREEN_NAME_FEATURE_ID:
        return getTarget().getName();
      case UiModelPackage.SCREEN_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case UiModelPackage.SCREEN_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case UiModelPackage.SCREEN_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case UiModelPackage.SCREEN_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case UiModelPackage.SCREEN_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case UiModelPackage.SCREEN_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case UiModelPackage.SCREEN_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case UiModelPackage.SCREEN_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case UiModelPackage.SCREEN_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case UiModelPackage.SCREEN_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case UiModelPackage.SCREEN_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case UiModelPackage.SCREEN_UIRELATION_FEATURE_ID:
        return getTarget().getUIRelation();
      case UiModelPackage.SCREEN_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case UiModelPackage.SCREEN_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case UiModelPackage.SCREEN_UIELEMENT_FEATURE_ID:
        return getTarget().getUIElement();
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
   * The adapter/wrapper for the EClass '<em><b>Report</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ReportModelObject<E extends Report> extends UIDisplayModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getReportEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.REPORT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.REPORT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.REPORT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.REPORT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.REPORT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.REPORT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.REPORT_NAME_FEATURE_ID:
        return getTarget().getName();
      case UiModelPackage.REPORT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case UiModelPackage.REPORT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case UiModelPackage.REPORT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case UiModelPackage.REPORT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case UiModelPackage.REPORT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case UiModelPackage.REPORT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case UiModelPackage.REPORT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case UiModelPackage.REPORT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case UiModelPackage.REPORT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case UiModelPackage.REPORT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case UiModelPackage.REPORT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case UiModelPackage.REPORT_UIRELATION_FEATURE_ID:
        return getTarget().getUIRelation();
      case UiModelPackage.REPORT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case UiModelPackage.REPORT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case UiModelPackage.REPORT_UIELEMENT_FEATURE_ID:
        return getTarget().getUIElement();
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
   * The adapter/wrapper for the EClass '<em><b>UIModel</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class UIModelModelObject<E extends UIModel> extends KdmModelFactory.KDMModelModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getUIModelEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.UIMODEL_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.UIMODEL_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.UIMODEL_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.UIMODEL_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.UIMODEL_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.UIMODEL_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.UIMODEL_AUDIT_FEATURE_ID:
        return getTarget().getAudit();
      case UiModelPackage.UIMODEL_EXTENSION_FEATURE_ID:
        return getTarget().getExtension();
      case UiModelPackage.UIMODEL_NAME_FEATURE_ID:
        return getTarget().getName();
      case UiModelPackage.UIMODEL_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case UiModelPackage.UIMODEL_UIELEMENT_FEATURE_ID:
        return getTarget().getUIElement();
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
      case UiModelPackage.UIMODEL_UIELEMENT_FEATURE_ID:
        getTarget().setUIElement((Set<AbstractUIElement>) value);
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

      case UiModelPackage.UIMODEL_UIELEMENT_FEATURE_ID:
        return getTarget().addToUIElement((AbstractUIElement) value);
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

      case UiModelPackage.UIMODEL_UIELEMENT_FEATURE_ID:
        return getTarget().removeFromUIElement((AbstractUIElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>UILayout</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class UILayoutModelObject<E extends UILayout> extends AbstractUIRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getUILayoutEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.UILAYOUT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.UILAYOUT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.UILAYOUT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.UILAYOUT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.UILAYOUT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.UILAYOUT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.UILAYOUT_TO_FEATURE_ID:
        return getTarget().getTo();
      case UiModelPackage.UILAYOUT_FROM_FEATURE_ID:
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
      case UiModelPackage.UILAYOUT_TO_FEATURE_ID:
        getTarget().setTo((UIResource) value);
        return;
      case UiModelPackage.UILAYOUT_FROM_FEATURE_ID:
        getTarget().setFrom((UIResource) value);
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
   * The adapter/wrapper for the EClass '<em><b>UIField</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class UIFieldModelObject<E extends UIField> extends UIResourceModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getUIFieldEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.UIFIELD_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.UIFIELD_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.UIFIELD_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.UIFIELD_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.UIFIELD_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.UIFIELD_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.UIFIELD_NAME_FEATURE_ID:
        return getTarget().getName();
      case UiModelPackage.UIFIELD_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case UiModelPackage.UIFIELD_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case UiModelPackage.UIFIELD_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case UiModelPackage.UIFIELD_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case UiModelPackage.UIFIELD_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case UiModelPackage.UIFIELD_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case UiModelPackage.UIFIELD_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case UiModelPackage.UIFIELD_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case UiModelPackage.UIFIELD_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case UiModelPackage.UIFIELD_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case UiModelPackage.UIFIELD_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case UiModelPackage.UIFIELD_UIRELATION_FEATURE_ID:
        return getTarget().getUIRelation();
      case UiModelPackage.UIFIELD_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case UiModelPackage.UIFIELD_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case UiModelPackage.UIFIELD_UIELEMENT_FEATURE_ID:
        return getTarget().getUIElement();
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
   * The adapter/wrapper for the EClass '<em><b>DisplaysImage</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DisplaysImageModelObject<E extends DisplaysImage> extends AbstractUIRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getDisplaysImageEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.DISPLAYSIMAGE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.DISPLAYSIMAGE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.DISPLAYSIMAGE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.DISPLAYSIMAGE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.DISPLAYSIMAGE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.DISPLAYSIMAGE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.DISPLAYSIMAGE_TO_FEATURE_ID:
        return getTarget().getTo();
      case UiModelPackage.DISPLAYSIMAGE_FROM_FEATURE_ID:
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
      case UiModelPackage.DISPLAYSIMAGE_TO_FEATURE_ID:
        getTarget().setTo((Image) value);
        return;
      case UiModelPackage.DISPLAYSIMAGE_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>Displays</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DisplaysModelObject<E extends Displays> extends AbstractUIRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getDisplaysEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.DISPLAYS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.DISPLAYS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.DISPLAYS_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.DISPLAYS_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.DISPLAYS_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.DISPLAYS_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.DISPLAYS_TO_FEATURE_ID:
        return getTarget().getTo();
      case UiModelPackage.DISPLAYS_FROM_FEATURE_ID:
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
      case UiModelPackage.DISPLAYS_TO_FEATURE_ID:
        getTarget().setTo((UIResource) value);
        return;
      case UiModelPackage.DISPLAYS_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>UIFlow</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class UIFlowModelObject<E extends UIFlow> extends AbstractUIRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getUIFlowEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.UIFLOW_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.UIFLOW_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.UIFLOW_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.UIFLOW_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.UIFLOW_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.UIFLOW_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.UIFLOW_TO_FEATURE_ID:
        return getTarget().getTo();
      case UiModelPackage.UIFLOW_FROM_FEATURE_ID:
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
      case UiModelPackage.UIFLOW_TO_FEATURE_ID:
        getTarget().setTo((AbstractUIElement) value);
        return;
      case UiModelPackage.UIFLOW_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractUIElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>UIElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class UIElementModelObject<E extends UIElement> extends AbstractUIElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getUIElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.UIELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.UIELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.UIELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.UIELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.UIELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.UIELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.UIELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case UiModelPackage.UIELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case UiModelPackage.UIELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case UiModelPackage.UIELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case UiModelPackage.UIELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case UiModelPackage.UIELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case UiModelPackage.UIELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case UiModelPackage.UIELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case UiModelPackage.UIELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case UiModelPackage.UIELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case UiModelPackage.UIELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case UiModelPackage.UIELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case UiModelPackage.UIELEMENT_UIRELATION_FEATURE_ID:
        return getTarget().getUIRelation();
      case UiModelPackage.UIELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case UiModelPackage.UIELEMENT_ABSTRACTION_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>UIRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class UIRelationshipModelObject<E extends UIRelationship> extends AbstractUIRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getUIRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.UIRELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.UIRELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.UIRELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.UIRELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.UIRELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.UIRELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.UIRELATIONSHIP_TO_FEATURE_ID:
        return getTarget().getTo();
      case UiModelPackage.UIRELATIONSHIP_FROM_FEATURE_ID:
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
      case UiModelPackage.UIRELATIONSHIP_TO_FEATURE_ID:
        getTarget().setTo((KDMEntity) value);
        return;
      case UiModelPackage.UIRELATIONSHIP_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractUIElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>UIAction</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class UIActionModelObject<E extends UIAction> extends AbstractUIElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getUIActionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.UIACTION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.UIACTION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.UIACTION_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.UIACTION_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.UIACTION_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.UIACTION_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.UIACTION_NAME_FEATURE_ID:
        return getTarget().getName();
      case UiModelPackage.UIACTION_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case UiModelPackage.UIACTION_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case UiModelPackage.UIACTION_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case UiModelPackage.UIACTION_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case UiModelPackage.UIACTION_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case UiModelPackage.UIACTION_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case UiModelPackage.UIACTION_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case UiModelPackage.UIACTION_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case UiModelPackage.UIACTION_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case UiModelPackage.UIACTION_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case UiModelPackage.UIACTION_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case UiModelPackage.UIACTION_UIRELATION_FEATURE_ID:
        return getTarget().getUIRelation();
      case UiModelPackage.UIACTION_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case UiModelPackage.UIACTION_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case UiModelPackage.UIACTION_KIND_FEATURE_ID:
        return getTarget().getKind();
      case UiModelPackage.UIACTION_UIELEMENT_FEATURE_ID:
        return getTarget().getUIElement();
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
      case UiModelPackage.UIACTION_KIND_FEATURE_ID:
        getTarget().setKind((String) value);
        return;
      case UiModelPackage.UIACTION_UIELEMENT_FEATURE_ID:
        getTarget().setUIElement((Set<UIEvent>) value);
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

      case UiModelPackage.UIACTION_UIELEMENT_FEATURE_ID:
        return getTarget().addToUIElement((UIEvent) value);
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

      case UiModelPackage.UIACTION_UIELEMENT_FEATURE_ID:
        return getTarget().removeFromUIElement((UIEvent) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>UIEvent</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class UIEventModelObject<E extends UIEvent> extends AbstractUIElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getUIEventEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.UIEVENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.UIEVENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.UIEVENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.UIEVENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.UIEVENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.UIEVENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.UIEVENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case UiModelPackage.UIEVENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case UiModelPackage.UIEVENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case UiModelPackage.UIEVENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case UiModelPackage.UIEVENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case UiModelPackage.UIEVENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case UiModelPackage.UIEVENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case UiModelPackage.UIEVENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case UiModelPackage.UIEVENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case UiModelPackage.UIEVENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case UiModelPackage.UIEVENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case UiModelPackage.UIEVENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case UiModelPackage.UIEVENT_UIRELATION_FEATURE_ID:
        return getTarget().getUIRelation();
      case UiModelPackage.UIEVENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case UiModelPackage.UIEVENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case UiModelPackage.UIEVENT_KIND_FEATURE_ID:
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
      case UiModelPackage.UIEVENT_KIND_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>ReadsUI</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ReadsUIModelObject<E extends ReadsUI> extends
      ActionModelFactory.AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getReadsUIEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.READSUI_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.READSUI_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.READSUI_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.READSUI_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.READSUI_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.READSUI_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.READSUI_TO_FEATURE_ID:
        return getTarget().getTo();
      case UiModelPackage.READSUI_FROM_FEATURE_ID:
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
      case UiModelPackage.READSUI_TO_FEATURE_ID:
        getTarget().setTo((UIResource) value);
        return;
      case UiModelPackage.READSUI_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>WritesUI</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class WritesUIModelObject<E extends WritesUI> extends
      ActionModelFactory.AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getWritesUIEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.WRITESUI_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.WRITESUI_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.WRITESUI_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.WRITESUI_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.WRITESUI_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.WRITESUI_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.WRITESUI_TO_FEATURE_ID:
        return getTarget().getTo();
      case UiModelPackage.WRITESUI_FROM_FEATURE_ID:
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
      case UiModelPackage.WRITESUI_TO_FEATURE_ID:
        getTarget().setTo((UIResource) value);
        return;
      case UiModelPackage.WRITESUI_FROM_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>ManagesUI</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ManagesUIModelObject<E extends ManagesUI> extends
      ActionModelFactory.AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return UiModelPackage.INSTANCE.getManagesUIEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return UiModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case UiModelPackage.MANAGESUI_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case UiModelPackage.MANAGESUI_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case UiModelPackage.MANAGESUI_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case UiModelPackage.MANAGESUI_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case UiModelPackage.MANAGESUI_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case UiModelPackage.MANAGESUI_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case UiModelPackage.MANAGESUI_TO_FEATURE_ID:
        return getTarget().getTo();
      case UiModelPackage.MANAGESUI_FROM_FEATURE_ID:
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
      case UiModelPackage.MANAGESUI_TO_FEATURE_ID:
        getTarget().setTo((UIResource) value);
        return;
      case UiModelPackage.MANAGESUI_FROM_FEATURE_ID:
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