package org.eclipse.emf.texo.test.model.samples.interfaces;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.AbstractModelObject;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: interfaces. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class InterfacesModelFactory implements ModelFactory {

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
    case InterfacesModelPackage.DESCRIBABLEIDENTIFIABLECONCRETE_CLASSIFIER_ID:
      return createDescribableIdentifiableConcrete();
    case InterfacesModelPackage.DESCRIBABLECONCRETE_CLASSIFIER_ID:
      return createDescribableConcrete();
    case InterfacesModelPackage.IDENTIFIABLECONCRETE_CLASSIFIER_ID:
      return createIdentifiableConcrete();
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
    case InterfacesModelPackage.DESCRIBABLEIDENTIFIABLECONCRETE_CLASSIFIER_ID:
      modelObject = new DescribableIdentifiableConcreteModelObject();
      break;
    case InterfacesModelPackage.DESCRIBABLE_CLASSIFIER_ID:
      modelObject = new DescribableModelObject();
      break;
    case InterfacesModelPackage.IDENTIFIEDTYPE_CLASSIFIER_ID:
      modelObject = new IdentifiedTypeModelObject();
      break;
    case InterfacesModelPackage.DESCRIBABLECONCRETE_CLASSIFIER_ID:
      modelObject = new DescribableConcreteModelObject();
      break;
    case InterfacesModelPackage.IDENTIFIABLECONCRETE_CLASSIFIER_ID:
      modelObject = new IdentifiableConcreteModelObject();
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
   * @return an instance of the model object representing the EClass DescribableIdentifiableConcrete
   * @generated
   */
  public DescribableIdentifiableConcrete createDescribableIdentifiableConcrete() {
    return new DescribableIdentifiableConcrete();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DescribableConcrete
   * @generated
   */
  public DescribableConcrete createDescribableConcrete() {
    return new DescribableConcrete();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass IdentifiableConcrete
   * @generated
   */
  public IdentifiableConcrete createIdentifiableConcrete() {
    return new IdentifiableConcrete();
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
   * The adapter/wrapper for the EClass '<em><b>DescribableIdentifiableConcrete</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DescribableIdentifiableConcreteModelObject<E extends DescribableIdentifiableConcrete> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return InterfacesModelPackage.INSTANCE.getDescribableIdentifiableConcreteEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return InterfacesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case InterfacesModelPackage.DESCRIBABLEIDENTIFIABLECONCRETE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case InterfacesModelPackage.DESCRIBABLEIDENTIFIABLECONCRETE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case InterfacesModelPackage.DESCRIBABLEIDENTIFIABLECONCRETE_NAME_FEATURE_ID:
        return getTarget().getName();
      case InterfacesModelPackage.DESCRIBABLEIDENTIFIABLECONCRETE_DESCRIPTION_FEATURE_ID:
        return getTarget().getDescription();
      case InterfacesModelPackage.DESCRIBABLEIDENTIFIABLECONCRETE_IDENTIFIER_FEATURE_ID:
        return getTarget().getIdentifier();
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
      case InterfacesModelPackage.DESCRIBABLEIDENTIFIABLECONCRETE_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case InterfacesModelPackage.DESCRIBABLEIDENTIFIABLECONCRETE_DESCRIPTION_FEATURE_ID:
        getTarget().setDescription((String) value);
        return;
      case InterfacesModelPackage.DESCRIBABLEIDENTIFIABLECONCRETE_IDENTIFIER_FEATURE_ID:
        getTarget().setIdentifier((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Describable</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DescribableModelObject<E extends Describable> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return InterfacesModelPackage.INSTANCE.getDescribableEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return InterfacesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case InterfacesModelPackage.DESCRIBABLE_DESCRIPTION_FEATURE_ID:
        return getTarget().getDescription();
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
      case InterfacesModelPackage.DESCRIBABLE_DESCRIPTION_FEATURE_ID:
        getTarget().setDescription((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>IdentifiedType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class IdentifiedTypeModelObject<E extends IdentifiedType> extends AbstractModelObject<E> {
    /**
     * @generated
     */
    public EClass eClass() {
      return InterfacesModelPackage.INSTANCE.getIdentifiedTypeEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return InterfacesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case InterfacesModelPackage.IDENTIFIEDTYPE_IDENTIFIER_FEATURE_ID:
        return getTarget().getIdentifier();
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
      case InterfacesModelPackage.IDENTIFIEDTYPE_IDENTIFIER_FEATURE_ID:
        getTarget().setIdentifier((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>DescribableConcrete</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DescribableConcreteModelObject<E extends DescribableConcrete> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return InterfacesModelPackage.INSTANCE.getDescribableConcreteEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return InterfacesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case InterfacesModelPackage.DESCRIBABLECONCRETE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case InterfacesModelPackage.DESCRIBABLECONCRETE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case InterfacesModelPackage.DESCRIBABLECONCRETE_NAME_FEATURE_ID:
        return getTarget().getName();
      case InterfacesModelPackage.DESCRIBABLECONCRETE_DESCRIPTION_FEATURE_ID:
        return getTarget().getDescription();
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
      case InterfacesModelPackage.DESCRIBABLECONCRETE_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case InterfacesModelPackage.DESCRIBABLECONCRETE_DESCRIPTION_FEATURE_ID:
        getTarget().setDescription((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>IdentifiableConcrete</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class IdentifiableConcreteModelObject<E extends IdentifiableConcrete> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return InterfacesModelPackage.INSTANCE.getIdentifiableConcreteEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return InterfacesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case InterfacesModelPackage.IDENTIFIABLECONCRETE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case InterfacesModelPackage.IDENTIFIABLECONCRETE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case InterfacesModelPackage.IDENTIFIABLECONCRETE_NAME_FEATURE_ID:
        return getTarget().getName();
      case InterfacesModelPackage.IDENTIFIABLECONCRETE_IDENTIFIER_FEATURE_ID:
        return getTarget().getIdentifier();
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
      case InterfacesModelPackage.IDENTIFIABLECONCRETE_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case InterfacesModelPackage.IDENTIFIABLECONCRETE_IDENTIFIER_FEATURE_ID:
        getTarget().setIdentifier((String) value);
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