package org.eclipse.emf.texo.test.model.issues.bz379796;

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
 * The <b>{@link ModelFactory}</b> for the types of this model: org.eclipse.emf.texo.test.model.issues.bz379796. It
 * contains code to create instances {@link ModelObject} wrappers and instances for EClasses and convert objects back
 * and forth from their String (XML) representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Bz379796ModelFactory implements ModelFactory {

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
    case Bz379796ModelPackage.PRICETYPE_CLASSIFIER_ID:
      return createPriceType();
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
    case Bz379796ModelPackage.PRICETYPE_CLASSIFIER_ID:
      modelObject = new PriceTypeModelObject();
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
   * @return an instance of the model object representing the EClass PriceType
   * @generated
   */
  public PriceType createPriceType() {
    return new PriceType();
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
    case Bz379796ModelPackage.COMPARISONTYPE_CLASSIFIER_ID:
      return createComparisonTypeFromString(value);
    case Bz379796ModelPackage.COMPARISONTYPEOBJECT_CLASSIFIER_ID:
      return createComparisonTypeObjectFromString(value);
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
    case Bz379796ModelPackage.COMPARISONTYPE_CLASSIFIER_ID:
      return convertComparisonTypeToString((ComparisonType) value);
    case Bz379796ModelPackage.COMPARISONTYPEOBJECT_CLASSIFIER_ID:
      return convertComparisonTypeObjectToString((ComparisonType) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: ComparisonType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertComparisonTypeToString(ComparisonType value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: ComparisonType from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public ComparisonType createComparisonTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return ComparisonType.get(value);
  }

  /**
   * Converts the EDataType: ComparisonTypeObject to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertComparisonTypeObjectToString(ComparisonType value) {
    if (value == null) {
      return null;
    }
    return convertComparisonTypeToString(value);
  }

  /**
   * Creates an instance of the EDataType: ComparisonTypeObject from a String. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public ComparisonType createComparisonTypeObjectFromString(String value) {
    if (value == null) {
      return null;
    }
    return createComparisonTypeFromString(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>PriceType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PriceTypeModelObject<E extends PriceType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Bz379796ModelPackage.INSTANCE.getPriceTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Bz379796ModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Bz379796ModelPackage.PRICETYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Bz379796ModelPackage.PRICETYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Bz379796ModelPackage.PRICETYPE_VALUEELEMENT_FEATURE_ID:
        return getTarget().getValueElement();
      case Bz379796ModelPackage.PRICETYPE_NILLABLEVALUEELEMENT_FEATURE_ID:
        return getTarget().getNillableValueElement();
      case Bz379796ModelPackage.PRICETYPE_REQUIREDVALUEELEMENT_FEATURE_ID:
        return getTarget().getRequiredValueElement();
      case Bz379796ModelPackage.PRICETYPE_COMPARISONELEMENT_FEATURE_ID:
        return getTarget().getComparisonElement();
      case Bz379796ModelPackage.PRICETYPE_REQUIREDCOMPARISONELEMENT_FEATURE_ID:
        return getTarget().getRequiredComparisonElement();
      case Bz379796ModelPackage.PRICETYPE_COMPARISON_FEATURE_ID:
        return getTarget().getComparison();
      case Bz379796ModelPackage.PRICETYPE_REQUIREDCOMPARISON_FEATURE_ID:
        return getTarget().getRequiredComparison();
      case Bz379796ModelPackage.PRICETYPE_REQUIREDVALUE_FEATURE_ID:
        return getTarget().getRequiredValue();
      case Bz379796ModelPackage.PRICETYPE_VALUE_FEATURE_ID:
        return getTarget().getValue();
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
      case Bz379796ModelPackage.PRICETYPE_VALUEELEMENT_FEATURE_ID:
        getTarget().setValueElement((Integer) value);
        return;
      case Bz379796ModelPackage.PRICETYPE_NILLABLEVALUEELEMENT_FEATURE_ID:
        getTarget().setNillableValueElement((Integer) value);
        return;
      case Bz379796ModelPackage.PRICETYPE_REQUIREDVALUEELEMENT_FEATURE_ID:
        getTarget().setRequiredValueElement((Integer) value);
        return;
      case Bz379796ModelPackage.PRICETYPE_COMPARISONELEMENT_FEATURE_ID:
        getTarget().setComparisonElement((ComparisonType) value);
        return;
      case Bz379796ModelPackage.PRICETYPE_REQUIREDCOMPARISONELEMENT_FEATURE_ID:
        getTarget().setRequiredComparisonElement((ComparisonType) value);
        return;
      case Bz379796ModelPackage.PRICETYPE_COMPARISON_FEATURE_ID:
        getTarget().setComparison((ComparisonType) value);
        return;
      case Bz379796ModelPackage.PRICETYPE_REQUIREDCOMPARISON_FEATURE_ID:
        getTarget().setRequiredComparison((ComparisonType) value);
        return;
      case Bz379796ModelPackage.PRICETYPE_REQUIREDVALUE_FEATURE_ID:
        getTarget().setRequiredValue((String) value);
        return;
      case Bz379796ModelPackage.PRICETYPE_VALUE_FEATURE_ID:
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
}