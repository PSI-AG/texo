package org.eclipse.modisco.kdm.core;

import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;
import org.eclipse.modisco.kdm.kdm.Annotation;
import org.eclipse.modisco.kdm.kdm.Attribute;
import org.eclipse.modisco.kdm.kdm.ExtendedValue;
import org.eclipse.modisco.kdm.kdm.Stereotype;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: core. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The Core package provides
 * basic constructs for creating and describing meta-model classes in all specific KDM packages. Classes of the Core
 * package determine the structure of KDM models, define fundamental modeling constraints, and determine the reflective
 * API to KDM instances. <!-- end-model-doc -->
 * 
 * @generated
 */
public class CoreModelFactory implements ModelFactory {

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
    case CoreModelPackage.AGGREGATEDRELATIONSHIP_CLASSIFIER_ID:
      return createAggregatedRelationship();
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
    case CoreModelPackage.ELEMENT_CLASSIFIER_ID:
      modelObject = new ElementModelObject();
      break;
    case CoreModelPackage.MODELELEMENT_CLASSIFIER_ID:
      modelObject = new ModelElementModelObject();
      break;
    case CoreModelPackage.KDMENTITY_CLASSIFIER_ID:
      modelObject = new KDMEntityModelObject();
      break;
    case CoreModelPackage.KDMRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new KDMRelationshipModelObject();
      break;
    case CoreModelPackage.AGGREGATEDRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new AggregatedRelationshipModelObject();
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
   * @return an instance of the model object representing the EClass AggregatedRelationship
   * @generated
   */
  public AggregatedRelationship createAggregatedRelationship() {
    return new AggregatedRelationship();
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
    case CoreModelPackage.STRING_CLASSIFIER_ID:
      return createStringFromString(value);
    case CoreModelPackage.INTEGER_CLASSIFIER_ID:
      return createIntegerFromString(value);
    case CoreModelPackage.BOOLEAN_CLASSIFIER_ID:
      return createBooleanFromString(value);
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
    case CoreModelPackage.STRING_CLASSIFIER_ID:
      return convertStringToString((String) value);
    case CoreModelPackage.INTEGER_CLASSIFIER_ID:
      return convertIntegerToString((Integer) value);
    case CoreModelPackage.BOOLEAN_CLASSIFIER_ID:
      return convertBooleanToString((Boolean) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: String to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertStringToString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Creates an instance of the EDataType: String from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public String createStringFromString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Converts the EDataType: Integer to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertIntegerToString(Integer value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: Integer from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public Integer createIntegerFromString(String value) {
    if (value == null) {
      return null;
    }
    return new Integer(value);
  }

  /**
   * Converts the EDataType: Boolean to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertBooleanToString(Boolean value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: Boolean from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public Boolean createBooleanFromString(String value) {
    if (value == null) {
      return null;
    }
    return new Boolean(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Element</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ElementModelObject<E extends Element> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CoreModelPackage.INSTANCE.getElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CoreModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CoreModelPackage.ELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CoreModelPackage.ELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CoreModelPackage.ELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CoreModelPackage.ELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
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
      case CoreModelPackage.ELEMENT_ATTRIBUTE_FEATURE_ID:
        getTarget().setAttribute((Set<Attribute>) value);
        return;
      case CoreModelPackage.ELEMENT_ANNOTATION_FEATURE_ID:
        getTarget().setAnnotation((Set<Annotation>) value);
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

      case CoreModelPackage.ELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().addToAttribute((Attribute) value);

      case CoreModelPackage.ELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().addToAnnotation((Annotation) value);
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

      case CoreModelPackage.ELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().removeFromAttribute((Attribute) value);

      case CoreModelPackage.ELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().removeFromAnnotation((Annotation) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ModelElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ModelElementModelObject<E extends ModelElement> extends ElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CoreModelPackage.INSTANCE.getModelElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CoreModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CoreModelPackage.MODELELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CoreModelPackage.MODELELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CoreModelPackage.MODELELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CoreModelPackage.MODELELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CoreModelPackage.MODELELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CoreModelPackage.MODELELEMENT_TAGGEDVALUE_FEATURE_ID:
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
      case CoreModelPackage.MODELELEMENT_STEREOTYPE_FEATURE_ID:
        getTarget().setStereotype((Set<Stereotype>) value);
        return;
      case CoreModelPackage.MODELELEMENT_TAGGEDVALUE_FEATURE_ID:
        getTarget().setTaggedValue((Set<ExtendedValue>) value);
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

      case CoreModelPackage.MODELELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().addToStereotype((Stereotype) value);

      case CoreModelPackage.MODELELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().addToTaggedValue((ExtendedValue) value);
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

      case CoreModelPackage.MODELELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().removeFromStereotype((Stereotype) value);

      case CoreModelPackage.MODELELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().removeFromTaggedValue((ExtendedValue) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>KDMEntity</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class KDMEntityModelObject<E extends KDMEntity> extends ModelElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CoreModelPackage.INSTANCE.getKDMEntityEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CoreModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CoreModelPackage.KDMENTITY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CoreModelPackage.KDMENTITY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CoreModelPackage.KDMENTITY_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CoreModelPackage.KDMENTITY_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CoreModelPackage.KDMENTITY_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CoreModelPackage.KDMENTITY_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CoreModelPackage.KDMENTITY_NAME_FEATURE_ID:
        return getTarget().getName();
      case CoreModelPackage.KDMENTITY_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case CoreModelPackage.KDMENTITY_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case CoreModelPackage.KDMENTITY_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case CoreModelPackage.KDMENTITY_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case CoreModelPackage.KDMENTITY_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case CoreModelPackage.KDMENTITY_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case CoreModelPackage.KDMENTITY_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case CoreModelPackage.KDMENTITY_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case CoreModelPackage.KDMENTITY_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case CoreModelPackage.KDMENTITY_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
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
      case CoreModelPackage.KDMENTITY_NAME_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>KDMRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class KDMRelationshipModelObject<E extends KDMRelationship> extends ModelElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CoreModelPackage.INSTANCE.getKDMRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CoreModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CoreModelPackage.KDMRELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CoreModelPackage.KDMRELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CoreModelPackage.KDMRELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CoreModelPackage.KDMRELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CoreModelPackage.KDMRELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CoreModelPackage.KDMRELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>AggregatedRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AggregatedRelationshipModelObject<E extends AggregatedRelationship> extends
      ModelElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CoreModelPackage.INSTANCE.getAggregatedRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CoreModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CoreModelPackage.AGGREGATEDRELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CoreModelPackage.AGGREGATEDRELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CoreModelPackage.AGGREGATEDRELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case CoreModelPackage.AGGREGATEDRELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case CoreModelPackage.AGGREGATEDRELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case CoreModelPackage.AGGREGATEDRELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case CoreModelPackage.AGGREGATEDRELATIONSHIP_FROM_FEATURE_ID:
        return getTarget().getFrom();
      case CoreModelPackage.AGGREGATEDRELATIONSHIP_TO_FEATURE_ID:
        return getTarget().getTo();
      case CoreModelPackage.AGGREGATEDRELATIONSHIP_RELATION_FEATURE_ID:
        return getTarget().getRelation();
      case CoreModelPackage.AGGREGATEDRELATIONSHIP_DENSITY_FEATURE_ID:
        return getTarget().getDensity();
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
      case CoreModelPackage.AGGREGATEDRELATIONSHIP_FROM_FEATURE_ID:
        getTarget().setFrom((KDMEntity) value);
        return;
      case CoreModelPackage.AGGREGATEDRELATIONSHIP_TO_FEATURE_ID:
        getTarget().setTo((KDMEntity) value);
        return;
      case CoreModelPackage.AGGREGATEDRELATIONSHIP_RELATION_FEATURE_ID:
        getTarget().setRelation((Set<KDMRelationship>) value);
        return;
      case CoreModelPackage.AGGREGATEDRELATIONSHIP_DENSITY_FEATURE_ID:
        getTarget().setDensity((Integer) value);
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

      case CoreModelPackage.AGGREGATEDRELATIONSHIP_RELATION_FEATURE_ID:
        return getTarget().addToRelation((KDMRelationship) value);

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

      case CoreModelPackage.AGGREGATEDRELATIONSHIP_RELATION_FEATURE_ID:
        return getTarget().removeFromRelation((KDMRelationship) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }
}