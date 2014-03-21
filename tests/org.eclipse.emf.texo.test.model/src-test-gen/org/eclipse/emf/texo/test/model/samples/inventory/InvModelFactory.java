package org.eclipse.emf.texo.test.model.samples.inventory;

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
 * The <b>{@link ModelFactory}</b> for the types of this model: inv. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class InvModelFactory implements ModelFactory {

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
    case InvModelPackage.PTYPE_CLASSIFIER_ID:
      return createPType();
    case InvModelPackage.PDECLARATION_CLASSIFIER_ID:
      return createPDeclaration();
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
    case InvModelPackage.PTYPE_CLASSIFIER_ID:
      modelObject = new PTypeModelObject();
      break;
    case InvModelPackage.PDECLARATION_CLASSIFIER_ID:
      modelObject = new PDeclarationModelObject();
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
   * @return an instance of the model object representing the EClass PType
   * @generated
   */
  public PType createPType() {
    return new PType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PDeclaration
   * @generated
   */
  public PDeclaration createPDeclaration() {
    return new PDeclaration();
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
   * The adapter/wrapper for the EClass '<em><b>PType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PTypeModelObject<E extends PType> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return InvModelPackage.INSTANCE.getPTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return InvModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case InvModelPackage.PTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case InvModelPackage.PTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case InvModelPackage.PTYPE_ID_FEATURE_ID:
        return getTarget().getId();
      case InvModelPackage.PTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case InvModelPackage.PTYPE_BASE_FEATURE_ID:
        return getTarget().getBase();
      case InvModelPackage.PTYPE_SUBTYPES_FEATURE_ID:
        return getTarget().getSubTypes();
      case InvModelPackage.PTYPE_SUBNOTYPES_FEATURE_ID:
        return getTarget().getSubNOTypes();
      case InvModelPackage.PTYPE_INFOREFERENCES_FEATURE_ID:
        return getTarget().getInfoReferences();
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
      case InvModelPackage.PTYPE_ID_FEATURE_ID:
        getTarget().setId((Long) value);
        return;
      case InvModelPackage.PTYPE_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case InvModelPackage.PTYPE_BASE_FEATURE_ID:
        getTarget().setBase((PType) value);
        return;
      case InvModelPackage.PTYPE_SUBTYPES_FEATURE_ID:
        getTarget().setSubTypes((Set<PType>) value);
        return;
      case InvModelPackage.PTYPE_SUBNOTYPES_FEATURE_ID:
        getTarget().setSubNOTypes((Set<PType>) value);
        return;
      case InvModelPackage.PTYPE_INFOREFERENCES_FEATURE_ID:
        getTarget().setInfoReferences((List<PDeclaration>) value);
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

      case InvModelPackage.PTYPE_SUBTYPES_FEATURE_ID:
        return getTarget().addToSubTypes((PType) value);

      case InvModelPackage.PTYPE_SUBNOTYPES_FEATURE_ID:
        return getTarget().addToSubNOTypes((PType) value);

      case InvModelPackage.PTYPE_INFOREFERENCES_FEATURE_ID:
        return getTarget().addToInfoReferences((PDeclaration) value);
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

      case InvModelPackage.PTYPE_SUBTYPES_FEATURE_ID:
        return getTarget().removeFromSubTypes((PType) value);

      case InvModelPackage.PTYPE_SUBNOTYPES_FEATURE_ID:
        return getTarget().removeFromSubNOTypes((PType) value);

      case InvModelPackage.PTYPE_INFOREFERENCES_FEATURE_ID:
        return getTarget().removeFromInfoReferences((PDeclaration) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>PDeclaration</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PDeclarationModelObject<E extends PDeclaration> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return InvModelPackage.INSTANCE.getPDeclarationEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return InvModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case InvModelPackage.PDECLARATION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case InvModelPackage.PDECLARATION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case InvModelPackage.PDECLARATION_ID_FEATURE_ID:
        return getTarget().getId();
      case InvModelPackage.PDECLARATION_NAME_FEATURE_ID:
        return getTarget().getName();
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
      case InvModelPackage.PDECLARATION_ID_FEATURE_ID:
        getTarget().setId((Long) value);
        return;
      case InvModelPackage.PDECLARATION_NAME_FEATURE_ID:
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
}