package org.eclipse.emf.texo.test.model.issues.bz379815;

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
 * The <b>{@link ModelFactory}</b> for the types of this model: bz379815. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Bz379815ModelFactory implements ModelFactory {

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
    case Bz379815ModelPackage.VARINPUTTYPE_CLASSIFIER_ID:
      return createVarInputType();
    case Bz379815ModelPackage.VARCONDITIONTYPE_CLASSIFIER_ID:
      return createVarConditionType();
    case Bz379815ModelPackage.VARPOLICYTYPETYPE_CLASSIFIER_ID:
      return createVarPolicyTypeType();
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
    case Bz379815ModelPackage.VARINPUTTYPE_CLASSIFIER_ID:
      modelObject = new VarInputTypeModelObject();
      break;
    case Bz379815ModelPackage.VARCONDITIONTYPE_CLASSIFIER_ID:
      modelObject = new VarConditionTypeModelObject();
      break;
    case Bz379815ModelPackage.VARPOLICYTYPETYPE_CLASSIFIER_ID:
      modelObject = new VarPolicyTypeTypeModelObject();
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
   * @return an instance of the model object representing the EClass VarInputType
   * @generated
   */
  public VarInputType createVarInputType() {
    return new VarInputType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass VarConditionType
   * @generated
   */
  public VarConditionType createVarConditionType() {
    return new VarConditionType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass VarPolicyTypeType
   * @generated
   */
  public VarPolicyTypeType createVarPolicyTypeType() {
    return new VarPolicyTypeType();
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
    case Bz379815ModelPackage.TYPETYPE_CLASSIFIER_ID:
      return createTypeTypeFromString(value);
    case Bz379815ModelPackage.TYPETYPEOBJECT_CLASSIFIER_ID:
      return createTypeTypeObjectFromString(value);
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
    case Bz379815ModelPackage.TYPETYPE_CLASSIFIER_ID:
      return convertTypeTypeToString((TypeType) value);
    case Bz379815ModelPackage.TYPETYPEOBJECT_CLASSIFIER_ID:
      return convertTypeTypeObjectToString((TypeType) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: TypeType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertTypeTypeToString(TypeType value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: TypeType from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public TypeType createTypeTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return TypeType.get(value);
  }

  /**
   * Converts the EDataType: TypeTypeObject to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertTypeTypeObjectToString(TypeType value) {
    if (value == null) {
      return null;
    }
    return convertTypeTypeToString(value);
  }

  /**
   * Creates an instance of the EDataType: TypeTypeObject from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public TypeType createTypeTypeObjectFromString(String value) {
    if (value == null) {
      return null;
    }
    return createTypeTypeFromString(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>VarInputType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class VarInputTypeModelObject<E extends VarInputType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Bz379815ModelPackage.INSTANCE.getVarInputTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Bz379815ModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Bz379815ModelPackage.VARINPUTTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Bz379815ModelPackage.VARINPUTTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Bz379815ModelPackage.VARINPUTTYPE_CONDITION_FEATURE_ID:
        return getTarget().getCondition();
      case Bz379815ModelPackage.VARINPUTTYPE_MEASURE_FEATURE_ID:
        return getTarget().getMeasure();
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
      case Bz379815ModelPackage.VARINPUTTYPE_CONDITION_FEATURE_ID:
        getTarget().setCondition((VarConditionType) value);
        return;
      case Bz379815ModelPackage.VARINPUTTYPE_MEASURE_FEATURE_ID:
        getTarget().setMeasure((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>VarConditionType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class VarConditionTypeModelObject<E extends VarConditionType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Bz379815ModelPackage.INSTANCE.getVarConditionTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Bz379815ModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Bz379815ModelPackage.VARCONDITIONTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Bz379815ModelPackage.VARCONDITIONTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Bz379815ModelPackage.VARCONDITIONTYPE_POLICYTYPE_FEATURE_ID:
        return getTarget().getPolicyType();
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
      case Bz379815ModelPackage.VARCONDITIONTYPE_POLICYTYPE_FEATURE_ID:
        getTarget().setPolicyType((VarPolicyTypeType) value);
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
   * The adapter/wrapper for the EClass '<em><b>VarPolicyTypeType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class VarPolicyTypeTypeModelObject<E extends VarPolicyTypeType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Bz379815ModelPackage.INSTANCE.getVarPolicyTypeTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Bz379815ModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Bz379815ModelPackage.VARPOLICYTYPETYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Bz379815ModelPackage.VARPOLICYTYPETYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Bz379815ModelPackage.VARPOLICYTYPETYPE_TYPE_FEATURE_ID:
        return getTarget().getType();
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
      case Bz379815ModelPackage.VARPOLICYTYPETYPE_TYPE_FEATURE_ID:
        getTarget().setType((TypeType) value);
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