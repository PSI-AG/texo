package org.eclipse.modisco.kdm.kdm;

import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.modisco.kdm.core.CoreModelFactory;
import org.eclipse.modisco.kdm.core.ModelElement;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: kdm. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class KdmModelFactory implements ModelFactory {

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
    case KdmModelPackage.ATTRIBUTE_CLASSIFIER_ID:
      return createAttribute();
    case KdmModelPackage.ANNOTATION_CLASSIFIER_ID:
      return createAnnotation();
    case KdmModelPackage.STEREOTYPE_CLASSIFIER_ID:
      return createStereotype();
    case KdmModelPackage.AUDIT_CLASSIFIER_ID:
      return createAudit();
    case KdmModelPackage.EXTENSIONFAMILY_CLASSIFIER_ID:
      return createExtensionFamily();
    case KdmModelPackage.SEGMENT_CLASSIFIER_ID:
      return createSegment();
    case KdmModelPackage.TAGDEFINITION_CLASSIFIER_ID:
      return createTagDefinition();
    case KdmModelPackage.TAGGEDVALUE_CLASSIFIER_ID:
      return createTaggedValue();
    case KdmModelPackage.TAGGEDREF_CLASSIFIER_ID:
      return createTaggedRef();
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
    case KdmModelPackage.ATTRIBUTE_CLASSIFIER_ID:
      modelObject = new AttributeModelObject();
      break;
    case KdmModelPackage.ANNOTATION_CLASSIFIER_ID:
      modelObject = new AnnotationModelObject();
      break;
    case KdmModelPackage.STEREOTYPE_CLASSIFIER_ID:
      modelObject = new StereotypeModelObject();
      break;
    case KdmModelPackage.EXTENDEDVALUE_CLASSIFIER_ID:
      modelObject = new ExtendedValueModelObject();
      break;
    case KdmModelPackage.KDMMODEL_CLASSIFIER_ID:
      modelObject = new KDMModelModelObject();
      break;
    case KdmModelPackage.KDMFRAMEWORK_CLASSIFIER_ID:
      modelObject = new KDMFrameworkModelObject();
      break;
    case KdmModelPackage.AUDIT_CLASSIFIER_ID:
      modelObject = new AuditModelObject();
      break;
    case KdmModelPackage.EXTENSIONFAMILY_CLASSIFIER_ID:
      modelObject = new ExtensionFamilyModelObject();
      break;
    case KdmModelPackage.SEGMENT_CLASSIFIER_ID:
      modelObject = new SegmentModelObject();
      break;
    case KdmModelPackage.TAGDEFINITION_CLASSIFIER_ID:
      modelObject = new TagDefinitionModelObject();
      break;
    case KdmModelPackage.TAGGEDVALUE_CLASSIFIER_ID:
      modelObject = new TaggedValueModelObject();
      break;
    case KdmModelPackage.TAGGEDREF_CLASSIFIER_ID:
      modelObject = new TaggedRefModelObject();
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
   * @return an instance of the model object representing the EClass Attribute
   * @generated
   */
  public Attribute createAttribute() {
    return new Attribute();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Annotation
   * @generated
   */
  public Annotation createAnnotation() {
    return new Annotation();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Stereotype
   * @generated
   */
  public Stereotype createStereotype() {
    return new Stereotype();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Audit
   * @generated
   */
  public Audit createAudit() {
    return new Audit();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ExtensionFamily
   * @generated
   */
  public ExtensionFamily createExtensionFamily() {
    return new ExtensionFamily();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Segment
   * @generated
   */
  public Segment createSegment() {
    return new Segment();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TagDefinition
   * @generated
   */
  public TagDefinition createTagDefinition() {
    return new TagDefinition();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TaggedValue
   * @generated
   */
  public TaggedValue createTaggedValue() {
    return new TaggedValue();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TaggedRef
   * @generated
   */
  public TaggedRef createTaggedRef() {
    return new TaggedRef();
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
   * The adapter/wrapper for the EClass '<em><b>Attribute</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AttributeModelObject<E extends Attribute> extends CoreModelFactory.ElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return KdmModelPackage.INSTANCE.getAttributeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return KdmModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case KdmModelPackage.ATTRIBUTE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case KdmModelPackage.ATTRIBUTE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case KdmModelPackage.ATTRIBUTE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case KdmModelPackage.ATTRIBUTE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case KdmModelPackage.ATTRIBUTE_TAG_FEATURE_ID:
        return getTarget().getTag();
      case KdmModelPackage.ATTRIBUTE_VALUE_FEATURE_ID:
        return getTarget().getValue();
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
      case KdmModelPackage.ATTRIBUTE_TAG_FEATURE_ID:
        getTarget().setTag((String) value);
        return;
      case KdmModelPackage.ATTRIBUTE_VALUE_FEATURE_ID:
        getTarget().setValue((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Annotation</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AnnotationModelObject<E extends Annotation> extends CoreModelFactory.ElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return KdmModelPackage.INSTANCE.getAnnotationEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return KdmModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case KdmModelPackage.ANNOTATION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case KdmModelPackage.ANNOTATION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case KdmModelPackage.ANNOTATION_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case KdmModelPackage.ANNOTATION_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case KdmModelPackage.ANNOTATION_TEXT_FEATURE_ID:
        return getTarget().getText();
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
      case KdmModelPackage.ANNOTATION_TEXT_FEATURE_ID:
        getTarget().setText((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Stereotype</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class StereotypeModelObject<E extends Stereotype> extends CoreModelFactory.ElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return KdmModelPackage.INSTANCE.getStereotypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return KdmModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case KdmModelPackage.STEREOTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case KdmModelPackage.STEREOTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case KdmModelPackage.STEREOTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case KdmModelPackage.STEREOTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case KdmModelPackage.STEREOTYPE_TAG_FEATURE_ID:
        return getTarget().getTag();
      case KdmModelPackage.STEREOTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case KdmModelPackage.STEREOTYPE_TYPE_FEATURE_ID:
        return getTarget().getType();
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
      case KdmModelPackage.STEREOTYPE_TAG_FEATURE_ID:
        getTarget().setTag((Set<TagDefinition>) value);
        return;
      case KdmModelPackage.STEREOTYPE_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case KdmModelPackage.STEREOTYPE_TYPE_FEATURE_ID:
        getTarget().setType((String) value);
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

      case KdmModelPackage.STEREOTYPE_TAG_FEATURE_ID:
        return getTarget().addToTag((TagDefinition) value);

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

      case KdmModelPackage.STEREOTYPE_TAG_FEATURE_ID:
        return getTarget().removeFromTag((TagDefinition) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ExtendedValue</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ExtendedValueModelObject<E extends ExtendedValue> extends CoreModelFactory.ElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return KdmModelPackage.INSTANCE.getExtendedValueEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return KdmModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case KdmModelPackage.EXTENDEDVALUE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case KdmModelPackage.EXTENDEDVALUE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case KdmModelPackage.EXTENDEDVALUE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case KdmModelPackage.EXTENDEDVALUE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case KdmModelPackage.EXTENDEDVALUE_TAG_FEATURE_ID:
        return getTarget().getTag();
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
      case KdmModelPackage.EXTENDEDVALUE_TAG_FEATURE_ID:
        getTarget().setTag((TagDefinition) value);
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
   * The adapter/wrapper for the EClass '<em><b>KDMModel</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class KDMModelModelObject<E extends KDMModel> extends KDMFrameworkModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return KdmModelPackage.INSTANCE.getKDMModelEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return KdmModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case KdmModelPackage.KDMMODEL_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case KdmModelPackage.KDMMODEL_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case KdmModelPackage.KDMMODEL_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case KdmModelPackage.KDMMODEL_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case KdmModelPackage.KDMMODEL_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case KdmModelPackage.KDMMODEL_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case KdmModelPackage.KDMMODEL_AUDIT_FEATURE_ID:
        return getTarget().getAudit();
      case KdmModelPackage.KDMMODEL_EXTENSION_FEATURE_ID:
        return getTarget().getExtension();
      case KdmModelPackage.KDMMODEL_NAME_FEATURE_ID:
        return getTarget().getName();
      case KdmModelPackage.KDMMODEL_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
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
   * The adapter/wrapper for the EClass '<em><b>KDMFramework</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class KDMFrameworkModelObject<E extends KDMFramework> extends
      CoreModelFactory.ModelElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return KdmModelPackage.INSTANCE.getKDMFrameworkEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return KdmModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case KdmModelPackage.KDMFRAMEWORK_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case KdmModelPackage.KDMFRAMEWORK_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case KdmModelPackage.KDMFRAMEWORK_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case KdmModelPackage.KDMFRAMEWORK_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case KdmModelPackage.KDMFRAMEWORK_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case KdmModelPackage.KDMFRAMEWORK_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case KdmModelPackage.KDMFRAMEWORK_AUDIT_FEATURE_ID:
        return getTarget().getAudit();
      case KdmModelPackage.KDMFRAMEWORK_EXTENSION_FEATURE_ID:
        return getTarget().getExtension();
      case KdmModelPackage.KDMFRAMEWORK_NAME_FEATURE_ID:
        return getTarget().getName();
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
      case KdmModelPackage.KDMFRAMEWORK_AUDIT_FEATURE_ID:
        getTarget().setAudit((Set<Audit>) value);
        return;
      case KdmModelPackage.KDMFRAMEWORK_EXTENSION_FEATURE_ID:
        getTarget().setExtension((Set<ExtensionFamily>) value);
        return;
      case KdmModelPackage.KDMFRAMEWORK_NAME_FEATURE_ID:
        getTarget().setName((String) value);
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

      case KdmModelPackage.KDMFRAMEWORK_AUDIT_FEATURE_ID:
        return getTarget().addToAudit((Audit) value);

      case KdmModelPackage.KDMFRAMEWORK_EXTENSION_FEATURE_ID:
        return getTarget().addToExtension((ExtensionFamily) value);

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

      case KdmModelPackage.KDMFRAMEWORK_AUDIT_FEATURE_ID:
        return getTarget().removeFromAudit((Audit) value);

      case KdmModelPackage.KDMFRAMEWORK_EXTENSION_FEATURE_ID:
        return getTarget().removeFromExtension((ExtensionFamily) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Audit</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AuditModelObject<E extends Audit> extends CoreModelFactory.ElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return KdmModelPackage.INSTANCE.getAuditEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return KdmModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case KdmModelPackage.AUDIT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case KdmModelPackage.AUDIT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case KdmModelPackage.AUDIT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case KdmModelPackage.AUDIT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case KdmModelPackage.AUDIT_DESCRIPTION_FEATURE_ID:
        return getTarget().getDescription();
      case KdmModelPackage.AUDIT_AUTHOR_FEATURE_ID:
        return getTarget().getAuthor();
      case KdmModelPackage.AUDIT_DATE_FEATURE_ID:
        return getTarget().getDate();
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
      case KdmModelPackage.AUDIT_DESCRIPTION_FEATURE_ID:
        getTarget().setDescription((String) value);
        return;
      case KdmModelPackage.AUDIT_AUTHOR_FEATURE_ID:
        getTarget().setAuthor((String) value);
        return;
      case KdmModelPackage.AUDIT_DATE_FEATURE_ID:
        getTarget().setDate((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>ExtensionFamily</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ExtensionFamilyModelObject<E extends ExtensionFamily> extends
      CoreModelFactory.ElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return KdmModelPackage.INSTANCE.getExtensionFamilyEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return KdmModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case KdmModelPackage.EXTENSIONFAMILY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case KdmModelPackage.EXTENSIONFAMILY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case KdmModelPackage.EXTENSIONFAMILY_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case KdmModelPackage.EXTENSIONFAMILY_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case KdmModelPackage.EXTENSIONFAMILY_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case KdmModelPackage.EXTENSIONFAMILY_NAME_FEATURE_ID:
        return getTarget().getName();
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
      case KdmModelPackage.EXTENSIONFAMILY_STEREOTYPE_FEATURE_ID:
        getTarget().setStereotype((Set<Stereotype>) value);
        return;
      case KdmModelPackage.EXTENSIONFAMILY_NAME_FEATURE_ID:
        getTarget().setName((String) value);
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

      case KdmModelPackage.EXTENSIONFAMILY_STEREOTYPE_FEATURE_ID:
        return getTarget().addToStereotype((Stereotype) value);

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

      case KdmModelPackage.EXTENSIONFAMILY_STEREOTYPE_FEATURE_ID:
        return getTarget().removeFromStereotype((Stereotype) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Segment</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SegmentModelObject<E extends Segment> extends KDMFrameworkModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return KdmModelPackage.INSTANCE.getSegmentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return KdmModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case KdmModelPackage.SEGMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case KdmModelPackage.SEGMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case KdmModelPackage.SEGMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case KdmModelPackage.SEGMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case KdmModelPackage.SEGMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case KdmModelPackage.SEGMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case KdmModelPackage.SEGMENT_AUDIT_FEATURE_ID:
        return getTarget().getAudit();
      case KdmModelPackage.SEGMENT_EXTENSION_FEATURE_ID:
        return getTarget().getExtension();
      case KdmModelPackage.SEGMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case KdmModelPackage.SEGMENT_SEGMENT_FEATURE_ID:
        return getTarget().getSegment();
      case KdmModelPackage.SEGMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
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
      case KdmModelPackage.SEGMENT_SEGMENT_FEATURE_ID:
        getTarget().setSegment((Set<Segment>) value);
        return;
      case KdmModelPackage.SEGMENT_MODEL_FEATURE_ID:
        getTarget().setModel((Set<KDMModel>) value);
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

      case KdmModelPackage.SEGMENT_SEGMENT_FEATURE_ID:
        return getTarget().addToSegment((Segment) value);

      case KdmModelPackage.SEGMENT_MODEL_FEATURE_ID:
        return getTarget().addToModel((KDMModel) value);
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

      case KdmModelPackage.SEGMENT_SEGMENT_FEATURE_ID:
        return getTarget().removeFromSegment((Segment) value);

      case KdmModelPackage.SEGMENT_MODEL_FEATURE_ID:
        return getTarget().removeFromModel((KDMModel) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>TagDefinition</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TagDefinitionModelObject<E extends TagDefinition> extends CoreModelFactory.ElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return KdmModelPackage.INSTANCE.getTagDefinitionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return KdmModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case KdmModelPackage.TAGDEFINITION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case KdmModelPackage.TAGDEFINITION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case KdmModelPackage.TAGDEFINITION_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case KdmModelPackage.TAGDEFINITION_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case KdmModelPackage.TAGDEFINITION_TAG_FEATURE_ID:
        return getTarget().getTag();
      case KdmModelPackage.TAGDEFINITION_TYPE_FEATURE_ID:
        return getTarget().getType();
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
      case KdmModelPackage.TAGDEFINITION_TAG_FEATURE_ID:
        getTarget().setTag((String) value);
        return;
      case KdmModelPackage.TAGDEFINITION_TYPE_FEATURE_ID:
        getTarget().setType((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>TaggedValue</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TaggedValueModelObject<E extends TaggedValue> extends ExtendedValueModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return KdmModelPackage.INSTANCE.getTaggedValueEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return KdmModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case KdmModelPackage.TAGGEDVALUE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case KdmModelPackage.TAGGEDVALUE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case KdmModelPackage.TAGGEDVALUE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case KdmModelPackage.TAGGEDVALUE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case KdmModelPackage.TAGGEDVALUE_TAG_FEATURE_ID:
        return getTarget().getTag();
      case KdmModelPackage.TAGGEDVALUE_VALUE_FEATURE_ID:
        return getTarget().getValue();
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
      case KdmModelPackage.TAGGEDVALUE_VALUE_FEATURE_ID:
        getTarget().setValue((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>TaggedRef</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TaggedRefModelObject<E extends TaggedRef> extends ExtendedValueModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return KdmModelPackage.INSTANCE.getTaggedRefEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return KdmModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case KdmModelPackage.TAGGEDREF_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case KdmModelPackage.TAGGEDREF_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case KdmModelPackage.TAGGEDREF_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case KdmModelPackage.TAGGEDREF_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case KdmModelPackage.TAGGEDREF_TAG_FEATURE_ID:
        return getTarget().getTag();
      case KdmModelPackage.TAGGEDREF_REF_FEATURE_ID:
        return getTarget().getRef();
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
      case KdmModelPackage.TAGGEDREF_REF_FEATURE_ID:
        getTarget().setRef((ModelElement) value);
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