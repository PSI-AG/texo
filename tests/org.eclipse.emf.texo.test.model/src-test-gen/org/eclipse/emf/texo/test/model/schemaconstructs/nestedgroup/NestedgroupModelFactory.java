package org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model:
 * org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class NestedgroupModelFactory implements ModelFactory {

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
    case NestedgroupModelPackage.A_CLASSIFIER_ID:
      return createA();
    case NestedgroupModelPackage.CTYPE_CLASSIFIER_ID:
      return createCType();
    case NestedgroupModelPackage.ELEMENT_CLASSIFIER_ID:
      return createElement();
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
    case NestedgroupModelPackage.A_CLASSIFIER_ID:
      modelObject = new AModelObject();
      break;
    case NestedgroupModelPackage.CTYPE_CLASSIFIER_ID:
      modelObject = new CTypeModelObject();
      break;
    case NestedgroupModelPackage.ELEMENT_CLASSIFIER_ID:
      modelObject = new ElementModelObject();
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
    if (eFeature == NestedgroupModelPackage.INSTANCE.getA_Group()) {
      return new AGroupFeatureGroup();
    }
    if (eFeature == NestedgroupModelPackage.INSTANCE.getElement_Mixed()) {
      return new ElementMixedFeatureGroup();
    }
    if (eFeature == NestedgroupModelPackage.INSTANCE.getElement_True_()) {
      return new ElementTrue_FeatureGroup();
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
    if (eFeature == NestedgroupModelPackage.INSTANCE.getA_Group()) {
      final AGroupFeatureGroupModelFeatureMapEntry<AGroupFeatureGroup> entry = new AGroupFeatureGroupModelFeatureMapEntry<AGroupFeatureGroup>();
      entry.setTarget((AGroupFeatureGroup) adaptee);
      return entry;
    }
    if (eFeature == NestedgroupModelPackage.INSTANCE.getElement_Mixed()) {
      final ElementMixedFeatureGroupModelFeatureMapEntry<ElementMixedFeatureGroup> entry = new ElementMixedFeatureGroupModelFeatureMapEntry<ElementMixedFeatureGroup>();
      entry.setTarget((ElementMixedFeatureGroup) adaptee);
      return entry;
    }
    if (eFeature == NestedgroupModelPackage.INSTANCE.getElement_True_()) {
      final ElementTrue_FeatureGroupModelFeatureMapEntry<ElementTrue_FeatureGroup> entry = new ElementTrue_FeatureGroupModelFeatureMapEntry<ElementTrue_FeatureGroup>();
      entry.setTarget((ElementTrue_FeatureGroup) adaptee);
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
   * @return an instance of the model object representing the EClass CType
   * @generated
   */
  public CType createCType() {
    return new CType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Element
   * @generated
   */
  public Element createElement() {
    return new Element();
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
      return NestedgroupModelPackage.INSTANCE.getAEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return NestedgroupModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case NestedgroupModelPackage.A_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case NestedgroupModelPackage.A_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case NestedgroupModelPackage.A_NAME_FEATURE_ID:
        return getTarget().getName();
      case NestedgroupModelPackage.A_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case NestedgroupModelPackage.A_B_FEATURE_ID:
        return getTarget().getB();
      case NestedgroupModelPackage.A_C_FEATURE_ID:
        return getTarget().getC();
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
      case NestedgroupModelPackage.A_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case NestedgroupModelPackage.A_GROUP_FEATURE_ID:
        getTarget().setGroup((List<AGroupFeatureGroup>) value);
        return;
      case NestedgroupModelPackage.A_B_FEATURE_ID:
        getTarget().setB((List<String>) value);
        return;
      case NestedgroupModelPackage.A_C_FEATURE_ID:
        getTarget().setC((List<CType>) value);
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

      case NestedgroupModelPackage.A_GROUP_FEATURE_ID:
        return getTarget().getGroup().add((AGroupFeatureGroup) value);

      case NestedgroupModelPackage.A_B_FEATURE_ID:
        return getTarget().getB().add((String) value);

      case NestedgroupModelPackage.A_C_FEATURE_ID:
        return getTarget().getC().add((CType) value);
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

      case NestedgroupModelPackage.A_GROUP_FEATURE_ID:
        return getTarget().getGroup().remove(value);

      case NestedgroupModelPackage.A_B_FEATURE_ID:
        return getTarget().getB().remove(value);

      case NestedgroupModelPackage.A_C_FEATURE_ID:
        return getTarget().getC().remove(value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CTypeModelObject<E extends CType> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return NestedgroupModelPackage.INSTANCE.getCTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return NestedgroupModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case NestedgroupModelPackage.CTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case NestedgroupModelPackage.CTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case NestedgroupModelPackage.CTYPE_CNAME_FEATURE_ID:
        return getTarget().getCname();
      case NestedgroupModelPackage.CTYPE_CVALUE_FEATURE_ID:
        return getTarget().getCvalue();
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
      case NestedgroupModelPackage.CTYPE_CNAME_FEATURE_ID:
        getTarget().setCname((String) value);
        return;
      case NestedgroupModelPackage.CTYPE_CVALUE_FEATURE_ID:
        getTarget().setCvalue((Double) value);
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
      return NestedgroupModelPackage.INSTANCE.getElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return NestedgroupModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case NestedgroupModelPackage.ELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case NestedgroupModelPackage.ELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case NestedgroupModelPackage.ELEMENT_MIXED_FEATURE_ID:
        return getTarget().getMixed();
      case NestedgroupModelPackage.ELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case NestedgroupModelPackage.ELEMENT_TRUE__FEATURE_ID:
        return getTarget().getTrue_();
      case NestedgroupModelPackage.ELEMENT_C_FEATURE_ID:
        return getTarget().getC();
      case NestedgroupModelPackage.ELEMENT_RECURSIVE_FEATURE_ID:
        return getTarget().getRecursive();
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
      case NestedgroupModelPackage.ELEMENT_MIXED_FEATURE_ID:
        getTarget().setMixed((List<ElementMixedFeatureGroup>) value);
        return;
      case NestedgroupModelPackage.ELEMENT_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case NestedgroupModelPackage.ELEMENT_TRUE__FEATURE_ID:
        getTarget().setTrue_((List<ElementTrue_FeatureGroup>) value);
        return;
      case NestedgroupModelPackage.ELEMENT_C_FEATURE_ID:
        getTarget().setC((List<CType>) value);
        return;
      case NestedgroupModelPackage.ELEMENT_RECURSIVE_FEATURE_ID:
        getTarget().setRecursive((Element) value);
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

      case NestedgroupModelPackage.ELEMENT_MIXED_FEATURE_ID:
        return getTarget().getMixed().add((ElementMixedFeatureGroup) value);

      case NestedgroupModelPackage.ELEMENT_TRUE__FEATURE_ID:
        return getTarget().getTrue_().add((ElementTrue_FeatureGroup) value);

      case NestedgroupModelPackage.ELEMENT_C_FEATURE_ID:
        return getTarget().getC().add((CType) value);

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

      case NestedgroupModelPackage.ELEMENT_MIXED_FEATURE_ID:
        return getTarget().getMixed().remove(value);

      case NestedgroupModelPackage.ELEMENT_TRUE__FEATURE_ID:
        return getTarget().getTrue_().remove(value);

      case NestedgroupModelPackage.ELEMENT_C_FEATURE_ID:
        return getTarget().getC().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The wrapper/adapter for the Feature Group '<em><b>A.group</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class AGroupFeatureGroupModelFeatureMapEntry<E extends AGroupFeatureGroup> extends
      AbstractModelFeatureMapEntry<AGroupFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case B:
        return NestedgroupModelPackage.INSTANCE.getA_B();
      case C:
        return NestedgroupModelPackage.INSTANCE.getA_C();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = NestedgroupModelPackage.INSTANCE.getAEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case NestedgroupModelPackage.A_B_FEATURE_ID:
        getTarget().setFeature(AGroupFeatureGroup.Feature.B);
        return;
      case NestedgroupModelPackage.A_C_FEATURE_ID:
        getTarget().setFeature(AGroupFeatureGroup.Feature.C);
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

  /**
   * The wrapper/adapter for the Feature Group '<em><b>Element.mixed</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class ElementMixedFeatureGroupModelFeatureMapEntry<E extends ElementMixedFeatureGroup> extends
      AbstractModelFeatureMapEntry<ElementMixedFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case TEXT:
        return XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text();
      case CDATA:
        return XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA();
      case COMMENT:
        return XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment();
      case NAME:
        return NestedgroupModelPackage.INSTANCE.getElement_Name();
      case TRUE_:
        return NestedgroupModelPackage.INSTANCE.getElement_True_();
      case C:
        return NestedgroupModelPackage.INSTANCE.getElement_C();
      case RECURSIVE:
        return NestedgroupModelPackage.INSTANCE.getElement_Recursive();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {
      if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text()) {
        getTarget().setFeature(ElementMixedFeatureGroup.Feature.TEXT);
        return;
      } else if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA()) {
        getTarget().setFeature(ElementMixedFeatureGroup.Feature.CDATA);
        return;
      } else if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment()) {
        getTarget().setFeature(ElementMixedFeatureGroup.Feature.COMMENT);
        return;
      }

      final EClass eClass = NestedgroupModelPackage.INSTANCE.getElementEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case NestedgroupModelPackage.ELEMENT_NAME_FEATURE_ID:
        getTarget().setFeature(ElementMixedFeatureGroup.Feature.NAME);
        return;
      case NestedgroupModelPackage.ELEMENT_TRUE__FEATURE_ID:
        getTarget().setFeature(ElementMixedFeatureGroup.Feature.TRUE_);
        return;
      case NestedgroupModelPackage.ELEMENT_C_FEATURE_ID:
        getTarget().setFeature(ElementMixedFeatureGroup.Feature.C);
        return;
      case NestedgroupModelPackage.ELEMENT_RECURSIVE_FEATURE_ID:
        getTarget().setFeature(ElementMixedFeatureGroup.Feature.RECURSIVE);
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

  /**
   * The wrapper/adapter for the Feature Group '<em><b>Element.true_</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class ElementTrue_FeatureGroupModelFeatureMapEntry<E extends ElementTrue_FeatureGroup> extends
      AbstractModelFeatureMapEntry<ElementTrue_FeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case C:
        return NestedgroupModelPackage.INSTANCE.getElement_C();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = NestedgroupModelPackage.INSTANCE.getElementEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case NestedgroupModelPackage.ELEMENT_C_FEATURE_ID:
        getTarget().setFeature(ElementTrue_FeatureGroup.Feature.C);
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