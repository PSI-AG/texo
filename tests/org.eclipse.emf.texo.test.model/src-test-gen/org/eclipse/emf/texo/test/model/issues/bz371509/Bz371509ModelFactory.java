package org.eclipse.emf.texo.test.model.issues.bz371509;

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
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: bz371509. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Bz371509ModelFactory implements ModelFactory {

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
    case Bz371509ModelPackage.ECLASS0_CLASSIFIER_ID:
      return createEClass0();
    case Bz371509ModelPackage.ECLASS1_CLASSIFIER_ID:
      return createEClass1();
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
    case Bz371509ModelPackage.ECLASS0_CLASSIFIER_ID:
      modelObject = new EClass0ModelObject();
      break;
    case Bz371509ModelPackage.ECLASS1_CLASSIFIER_ID:
      modelObject = new EClass1ModelObject();
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
   * @return an instance of the model object representing the EClass EClass0
   * @generated
   */
  public EClass0 createEClass0() {
    return new EClass0();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass EClass1
   * @generated
   */
  public EClass1 createEClass1() {
    return new EClass1();
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
   * The adapter/wrapper for the EClass '<em><b>EClass0</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EClass0ModelObject<E extends EClass0> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Bz371509ModelPackage.INSTANCE.getEClass0EClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Bz371509ModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Bz371509ModelPackage.ECLASS0_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Bz371509ModelPackage.ECLASS0_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Bz371509ModelPackage.ECLASS0_TOCLASS1_FEATURE_ID:
        return getTarget().getToClass1();
      case Bz371509ModelPackage.ECLASS0_MANY_FEATURE_ID:
        return getTarget().getMany();
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
      case Bz371509ModelPackage.ECLASS0_TOCLASS1_FEATURE_ID:
        getTarget().setToClass1((EClass1) value);
        return;
      case Bz371509ModelPackage.ECLASS0_MANY_FEATURE_ID:
        getTarget().setMany((List<EClass1>) value);
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

      case Bz371509ModelPackage.ECLASS0_MANY_FEATURE_ID:
        return getTarget().addToMany((EClass1) value);
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

      case Bz371509ModelPackage.ECLASS0_MANY_FEATURE_ID:
        return getTarget().removeFromMany((EClass1) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>EClass1</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EClass1ModelObject<E extends EClass1> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return Bz371509ModelPackage.INSTANCE.getEClass1EClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return Bz371509ModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case Bz371509ModelPackage.ECLASS1_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case Bz371509ModelPackage.ECLASS1_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case Bz371509ModelPackage.ECLASS1_TOCLASS0_FEATURE_ID:
        return getTarget().getToClass0();
      case Bz371509ModelPackage.ECLASS1_MANY_FEATURE_ID:
        return getTarget().getMany();
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
      case Bz371509ModelPackage.ECLASS1_TOCLASS0_FEATURE_ID:
        getTarget().setToClass0((Set<EClass0>) value);
        return;
      case Bz371509ModelPackage.ECLASS1_MANY_FEATURE_ID:
        getTarget().setMany((List<EClass0>) value);
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

      case Bz371509ModelPackage.ECLASS1_TOCLASS0_FEATURE_ID:
        return getTarget().addToToClass0((EClass0) value);

      case Bz371509ModelPackage.ECLASS1_MANY_FEATURE_ID:
        return getTarget().addToMany((EClass0) value);
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

      case Bz371509ModelPackage.ECLASS1_TOCLASS0_FEATURE_ID:
        return getTarget().removeFromToClass0((EClass0) value);

      case Bz371509ModelPackage.ECLASS1_MANY_FEATURE_ID:
        return getTarget().removeFromMany((EClass0) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }
}