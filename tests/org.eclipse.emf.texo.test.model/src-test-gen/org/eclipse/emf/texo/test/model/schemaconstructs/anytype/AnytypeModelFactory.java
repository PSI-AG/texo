package org.eclipse.emf.texo.test.model.schemaconstructs.anytype;

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
 * org.eclipse.emf.texo.test.model.schemaconstructs.anytype. It contains code to create instances {@link ModelObject}
 * wrappers and instances for EClasses and convert objects back and forth from their String (XML) representation. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class AnytypeModelFactory implements ModelFactory {

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
    case AnytypeModelPackage.A_CLASSIFIER_ID:
      return createA();
    case AnytypeModelPackage.B_CLASSIFIER_ID:
      return createB();
    case AnytypeModelPackage.C_CLASSIFIER_ID:
      return createC();
    case AnytypeModelPackage.TESTANY_CLASSIFIER_ID:
      return createTestAny();
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
    case AnytypeModelPackage.A_CLASSIFIER_ID:
      modelObject = new AModelObject();
      break;
    case AnytypeModelPackage.B_CLASSIFIER_ID:
      modelObject = new BModelObject();
      break;
    case AnytypeModelPackage.C_CLASSIFIER_ID:
      modelObject = new CModelObject();
      break;
    case AnytypeModelPackage.TESTANY_CLASSIFIER_ID:
      modelObject = new TestAnyModelObject();
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
    if (eFeature == AnytypeModelPackage.INSTANCE.getTestAny_MyAny()) {
      return new TestAnyMyAnyFeatureGroup();
    }
    if (eFeature == AnytypeModelPackage.INSTANCE.getTestAny_Any()) {
      return new TestAnyAnyFeatureGroup();
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
    if (eFeature == AnytypeModelPackage.INSTANCE.getTestAny_MyAny()) {
      final TestAnyMyAnyFeatureGroupModelFeatureMapEntry<TestAnyMyAnyFeatureGroup> entry = new TestAnyMyAnyFeatureGroupModelFeatureMapEntry<TestAnyMyAnyFeatureGroup>();
      entry.setTarget((TestAnyMyAnyFeatureGroup) adaptee);
      return entry;
    }
    if (eFeature == AnytypeModelPackage.INSTANCE.getTestAny_Any()) {
      final TestAnyAnyFeatureGroupModelFeatureMapEntry<TestAnyAnyFeatureGroup> entry = new TestAnyAnyFeatureGroupModelFeatureMapEntry<TestAnyAnyFeatureGroup>();
      entry.setTarget((TestAnyAnyFeatureGroup) adaptee);
      return entry;
    }
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass A
   * @generated
   */
  public A createA() {
    return new A();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass B
   * @generated
   */
  public B createB() {
    return new B();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass C
   * @generated
   */
  public C createC() {
    return new C();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TestAny
   * @generated
   */
  public TestAny createTestAny() {
    return new TestAny();
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
   * The adapter/wrapper for the EClass '<em><b>A</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AModelObject<E extends A> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AnytypeModelPackage.INSTANCE.getAEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AnytypeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AnytypeModelPackage.A_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AnytypeModelPackage.A_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AnytypeModelPackage.A_NAME_FEATURE_ID:
        return getTarget().getName();
      case AnytypeModelPackage.A_DOUB_FEATURE_ID:
        return getTarget().getDoub();
      case AnytypeModelPackage.A_LON_FEATURE_ID:
        return getTarget().getLon();
      case AnytypeModelPackage.A_MYB_FEATURE_ID:
        return getTarget().getMyB();
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
      case AnytypeModelPackage.A_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case AnytypeModelPackage.A_DOUB_FEATURE_ID:
        getTarget().setDoub((Double) value);
        return;
      case AnytypeModelPackage.A_LON_FEATURE_ID:
        getTarget().setLon((Long) value);
        return;
      case AnytypeModelPackage.A_MYB_FEATURE_ID:
        getTarget().setMyB((B) value);
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
   * The adapter/wrapper for the EClass '<em><b>B</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BModelObject<E extends B> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AnytypeModelPackage.INSTANCE.getBEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AnytypeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AnytypeModelPackage.B_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AnytypeModelPackage.B_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AnytypeModelPackage.B_NAME_FEATURE_ID:
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
      case AnytypeModelPackage.B_NAME_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>C</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CModelObject<E extends C> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AnytypeModelPackage.INSTANCE.getCEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AnytypeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AnytypeModelPackage.C_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AnytypeModelPackage.C_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
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
   * The adapter/wrapper for the EClass '<em><b>TestAny</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TestAnyModelObject<E extends TestAny> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AnytypeModelPackage.INSTANCE.getTestAnyEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AnytypeModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AnytypeModelPackage.TESTANY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AnytypeModelPackage.TESTANY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AnytypeModelPackage.TESTANY_NAME_FEATURE_ID:
        return getTarget().getName();
      case AnytypeModelPackage.TESTANY_SINGLEANYTYPE_FEATURE_ID:
        return getTarget().getSingleAnyType();
      case AnytypeModelPackage.TESTANY_MULTIANYTYPE_FEATURE_ID:
        return getTarget().getMultiAnyType();
      case AnytypeModelPackage.TESTANY_A_FEATURE_ID:
        return getTarget().getA();
      case AnytypeModelPackage.TESTANY_MYANY_FEATURE_ID:
        return getTarget().getMyAny();
      case AnytypeModelPackage.TESTANY_ANY_FEATURE_ID:
        return getTarget().getAny();
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
      case AnytypeModelPackage.TESTANY_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case AnytypeModelPackage.TESTANY_SINGLEANYTYPE_FEATURE_ID:
        getTarget().setSingleAnyType(value);
        return;
      case AnytypeModelPackage.TESTANY_MULTIANYTYPE_FEATURE_ID:
        getTarget().setMultiAnyType((List<Object>) value);
        return;
      case AnytypeModelPackage.TESTANY_A_FEATURE_ID:
        getTarget().setA((String) value);
        return;
      case AnytypeModelPackage.TESTANY_MYANY_FEATURE_ID:
        getTarget().setMyAny((List<TestAnyMyAnyFeatureGroup>) value);
        return;
      case AnytypeModelPackage.TESTANY_ANY_FEATURE_ID:
        getTarget().setAny((List<TestAnyAnyFeatureGroup>) value);
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

      case AnytypeModelPackage.TESTANY_MULTIANYTYPE_FEATURE_ID:
        return getTarget().addToMultiAnyType(value);

      case AnytypeModelPackage.TESTANY_MYANY_FEATURE_ID:
        return getTarget().getMyAny().add((TestAnyMyAnyFeatureGroup) value);

      case AnytypeModelPackage.TESTANY_ANY_FEATURE_ID:
        return getTarget().getAny().add((TestAnyAnyFeatureGroup) value);
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

      case AnytypeModelPackage.TESTANY_MULTIANYTYPE_FEATURE_ID:
        return getTarget().removeFromMultiAnyType((Object) value);

      case AnytypeModelPackage.TESTANY_MYANY_FEATURE_ID:
        return getTarget().getMyAny().remove(value);

      case AnytypeModelPackage.TESTANY_ANY_FEATURE_ID:
        return getTarget().getAny().remove(value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The wrapper/adapter for the Feature Group '<em><b>TestAny.myAny</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class TestAnyMyAnyFeatureGroupModelFeatureMapEntry<E extends TestAnyMyAnyFeatureGroup> extends
      AbstractModelFeatureMapEntry<TestAnyMyAnyFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = AnytypeModelPackage.INSTANCE.getTestAnyEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
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

  /**
   * The wrapper/adapter for the Feature Group '<em><b>TestAny.any</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class TestAnyAnyFeatureGroupModelFeatureMapEntry<E extends TestAnyAnyFeatureGroup> extends
      AbstractModelFeatureMapEntry<TestAnyAnyFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = AnytypeModelPackage.INSTANCE.getTestAnyEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
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