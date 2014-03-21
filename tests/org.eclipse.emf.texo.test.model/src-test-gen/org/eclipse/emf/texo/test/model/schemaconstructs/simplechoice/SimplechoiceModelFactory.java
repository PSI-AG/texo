package org.eclipse.emf.texo.test.model.schemaconstructs.simplechoice;

import java.util.List;
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
 * The <b>{@link ModelFactory}</b> for the types of this model:
 * org.eclipse.emf.texo.test.model.schemaconstructs.simplechoice. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SimplechoiceModelFactory implements ModelFactory {

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
    case SimplechoiceModelPackage.PERSON_CLASSIFIER_ID:
      return createPerson();
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
    case SimplechoiceModelPackage.PERSON_CLASSIFIER_ID:
      modelObject = new PersonModelObject();
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
    if (eFeature == SimplechoiceModelPackage.INSTANCE.getPerson_Group()) {
      return new PersonGroupFeatureGroup();
    }
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
    if (eFeature == SimplechoiceModelPackage.INSTANCE.getPerson_Group()) {
      final PersonGroupFeatureGroupModelFeatureMapEntry<PersonGroupFeatureGroup> entry = new PersonGroupFeatureGroupModelFeatureMapEntry<PersonGroupFeatureGroup>();
      entry.setTarget((PersonGroupFeatureGroup) adaptee);
      return entry;
    }
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Person
   * @generated
   */
  public Person createPerson() {
    return new Person();
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
   * The adapter/wrapper for the EClass '<em><b>Person</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PersonModelObject<E extends Person> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SimplechoiceModelPackage.INSTANCE.getPersonEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SimplechoiceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SimplechoiceModelPackage.PERSON_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SimplechoiceModelPackage.PERSON_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SimplechoiceModelPackage.PERSON_NAME_FEATURE_ID:
        return getTarget().getName();
      case SimplechoiceModelPackage.PERSON_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case SimplechoiceModelPackage.PERSON_AGE_FEATURE_ID:
        return getTarget().getAge();
      case SimplechoiceModelPackage.PERSON_LENGTH_FEATURE_ID:
        return getTarget().getLength();
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
      case SimplechoiceModelPackage.PERSON_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case SimplechoiceModelPackage.PERSON_GROUP_FEATURE_ID:
        getTarget().setGroup((List<PersonGroupFeatureGroup>) value);
        return;
      case SimplechoiceModelPackage.PERSON_AGE_FEATURE_ID:
        getTarget().setAge((List<Integer>) value);
        return;
      case SimplechoiceModelPackage.PERSON_LENGTH_FEATURE_ID:
        getTarget().setLength((List<Integer>) value);
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

      case SimplechoiceModelPackage.PERSON_GROUP_FEATURE_ID:
        return getTarget().getGroup().add((PersonGroupFeatureGroup) value);

      case SimplechoiceModelPackage.PERSON_AGE_FEATURE_ID:
        return getTarget().getAge().add((Integer) value);

      case SimplechoiceModelPackage.PERSON_LENGTH_FEATURE_ID:
        return getTarget().getLength().add((Integer) value);
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

      case SimplechoiceModelPackage.PERSON_GROUP_FEATURE_ID:
        return getTarget().getGroup().remove(value);

      case SimplechoiceModelPackage.PERSON_AGE_FEATURE_ID:
        return getTarget().getAge().remove(value);

      case SimplechoiceModelPackage.PERSON_LENGTH_FEATURE_ID:
        return getTarget().getLength().remove(value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The wrapper/adapter for the Feature Group '<em><b>Person.group</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class PersonGroupFeatureGroupModelFeatureMapEntry<E extends PersonGroupFeatureGroup> extends
      AbstractModelFeatureMapEntry<PersonGroupFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case AGE:
        return SimplechoiceModelPackage.INSTANCE.getPerson_Age();
      case LENGTH:
        return SimplechoiceModelPackage.INSTANCE.getPerson_Length();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = SimplechoiceModelPackage.INSTANCE.getPersonEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case SimplechoiceModelPackage.PERSON_AGE_FEATURE_ID:
        getTarget().setFeature(PersonGroupFeatureGroup.Feature.AGE);
        return;
      case SimplechoiceModelPackage.PERSON_LENGTH_FEATURE_ID:
        getTarget().setFeature(PersonGroupFeatureGroup.Feature.LENGTH);
        return;
      default:
        throw new IllegalArgumentException("EStructuralFeature " + eStructuralFeature + " not supported here");
      }
    }

    /**
     * @generated
     */
    public Object getValue() {
      return getTarget().getValue();
    }

    /**
     * @generated
     */
    public void setValue(final Object value) {
      getTarget().setValue(getTarget().getFeature(), value);
    }
  }
}