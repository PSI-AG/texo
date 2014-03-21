package org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs;

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
 * org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs. It contains code to create instances {@link ModelObject}
 * wrappers and instances for EClasses and convert objects back and forth from their String (XML) representation. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EcoreattrsModelFactory implements ModelFactory {

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
    case EcoreattrsModelPackage.ELEMENT_CLASSIFIER_ID:
      return createElement();
    case EcoreattrsModelPackage.NAMELIST_CLASSIFIER_ID:
      return createNameList();
    case EcoreattrsModelPackage.FEATURE_CLASSIFIER_ID:
      return createFeature();
    case EcoreattrsModelPackage.MIXED_CLASSIFIER_ID:
      return createMixed();
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
    case EcoreattrsModelPackage.ELEMENT_CLASSIFIER_ID:
      modelObject = new ElementModelObject();
      break;
    case EcoreattrsModelPackage.NAMELIST_CLASSIFIER_ID:
      modelObject = new NameListModelObject();
      break;
    case EcoreattrsModelPackage.FEATURE_CLASSIFIER_ID:
      modelObject = new FeatureModelObject();
      break;
    case EcoreattrsModelPackage.MIXED_CLASSIFIER_ID:
      modelObject = new MixedModelObject();
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
    if (eFeature == EcoreattrsModelPackage.INSTANCE.getElement_NameMap()) {
      return new ElementNameMapFeatureGroup();
    }
    if (eFeature == EcoreattrsModelPackage.INSTANCE.getFeature_AMap()) {
      return new FeatureAMapFeatureGroup();
    }
    if (eFeature == EcoreattrsModelPackage.INSTANCE.getMixed_Mixed()) {
      return new MixedMixedFeatureGroup();
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
    if (eFeature == EcoreattrsModelPackage.INSTANCE.getElement_NameMap()) {
      final ElementNameMapFeatureGroupModelFeatureMapEntry<ElementNameMapFeatureGroup> entry = new ElementNameMapFeatureGroupModelFeatureMapEntry<ElementNameMapFeatureGroup>();
      entry.setTarget((ElementNameMapFeatureGroup) adaptee);
      return entry;
    }
    if (eFeature == EcoreattrsModelPackage.INSTANCE.getFeature_AMap()) {
      final FeatureAMapFeatureGroupModelFeatureMapEntry<FeatureAMapFeatureGroup> entry = new FeatureAMapFeatureGroupModelFeatureMapEntry<FeatureAMapFeatureGroup>();
      entry.setTarget((FeatureAMapFeatureGroup) adaptee);
      return entry;
    }
    if (eFeature == EcoreattrsModelPackage.INSTANCE.getMixed_Mixed()) {
      final MixedMixedFeatureGroupModelFeatureMapEntry<MixedMixedFeatureGroup> entry = new MixedMixedFeatureGroupModelFeatureMapEntry<MixedMixedFeatureGroup>();
      entry.setTarget((MixedMixedFeatureGroup) adaptee);
      return entry;
    }
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass NameList
   * @generated
   */
  public NameList createNameList() {
    return new NameList();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Feature
   * @generated
   */
  public Feature createFeature() {
    return new Feature();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Mixed
   * @generated
   */
  public Mixed createMixed() {
    return new Mixed();
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
      return EcoreattrsModelPackage.INSTANCE.getElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EcoreattrsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EcoreattrsModelPackage.ELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EcoreattrsModelPackage.ELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EcoreattrsModelPackage.ELEMENT_NAMEMAP_FEATURE_ID:
        return getTarget().getNameMap();
      case EcoreattrsModelPackage.ELEMENT_NAMES_FEATURE_ID:
        return getTarget().getNames();
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
      case EcoreattrsModelPackage.ELEMENT_NAMEMAP_FEATURE_ID:
        getTarget().setNameMap((List<ElementNameMapFeatureGroup>) value);
        return;
      case EcoreattrsModelPackage.ELEMENT_NAMES_FEATURE_ID:
        getTarget().setNames((NameList) value);
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

      case EcoreattrsModelPackage.ELEMENT_NAMEMAP_FEATURE_ID:
        return getTarget().getNameMap().add((ElementNameMapFeatureGroup) value);

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

      case EcoreattrsModelPackage.ELEMENT_NAMEMAP_FEATURE_ID:
        return getTarget().getNameMap().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>NameList</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class NameListModelObject<E extends NameList> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EcoreattrsModelPackage.INSTANCE.getNameListEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EcoreattrsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EcoreattrsModelPackage.NAMELIST_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EcoreattrsModelPackage.NAMELIST_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EcoreattrsModelPackage.NAMELIST_FIRSTNAME_FEATURE_ID:
        return getTarget().getFirstName();
      case EcoreattrsModelPackage.NAMELIST_MIDDLENAME_FEATURE_ID:
        return getTarget().getMiddleName();
      case EcoreattrsModelPackage.NAMELIST_LASTNAME_FEATURE_ID:
        return getTarget().getLastName();
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
      case EcoreattrsModelPackage.NAMELIST_FIRSTNAME_FEATURE_ID:
        getTarget().setFirstName((String) value);
        return;
      case EcoreattrsModelPackage.NAMELIST_MIDDLENAME_FEATURE_ID:
        getTarget().setMiddleName((String) value);
        return;
      case EcoreattrsModelPackage.NAMELIST_LASTNAME_FEATURE_ID:
        getTarget().setLastName((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Feature</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class FeatureModelObject<E extends Feature> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EcoreattrsModelPackage.INSTANCE.getFeatureEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EcoreattrsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EcoreattrsModelPackage.FEATURE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EcoreattrsModelPackage.FEATURE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EcoreattrsModelPackage.FEATURE_AMAP_FEATURE_ID:
        return getTarget().getAMap();
      case EcoreattrsModelPackage.FEATURE_NAME_FEATURE_ID:
        return getTarget().getName();
      case EcoreattrsModelPackage.FEATURE_VALUE__FEATURE_ID:
        return getTarget().getValue_();
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
      case EcoreattrsModelPackage.FEATURE_AMAP_FEATURE_ID:
        getTarget().setAMap((List<FeatureAMapFeatureGroup>) value);
        return;
      case EcoreattrsModelPackage.FEATURE_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case EcoreattrsModelPackage.FEATURE_VALUE__FEATURE_ID:
        getTarget().setValue_((Double) value);
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

      case EcoreattrsModelPackage.FEATURE_AMAP_FEATURE_ID:
        return getTarget().getAMap().add((FeatureAMapFeatureGroup) value);

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

      case EcoreattrsModelPackage.FEATURE_AMAP_FEATURE_ID:
        return getTarget().getAMap().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Mixed</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MixedModelObject<E extends Mixed> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return EcoreattrsModelPackage.INSTANCE.getMixedEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return EcoreattrsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EcoreattrsModelPackage.MIXED_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case EcoreattrsModelPackage.MIXED_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case EcoreattrsModelPackage.MIXED_MIXED_FEATURE_ID:
        return getTarget().getMixed();
      case EcoreattrsModelPackage.MIXED_NAME_FEATURE_ID:
        return getTarget().getName();
      case EcoreattrsModelPackage.MIXED_VALUE__FEATURE_ID:
        return getTarget().getValue_();
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
      case EcoreattrsModelPackage.MIXED_MIXED_FEATURE_ID:
        getTarget().setMixed((List<MixedMixedFeatureGroup>) value);
        return;
      case EcoreattrsModelPackage.MIXED_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case EcoreattrsModelPackage.MIXED_VALUE__FEATURE_ID:
        getTarget().setValue_((Double) value);
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

      case EcoreattrsModelPackage.MIXED_MIXED_FEATURE_ID:
        return getTarget().getMixed().add((MixedMixedFeatureGroup) value);

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

      case EcoreattrsModelPackage.MIXED_MIXED_FEATURE_ID:
        return getTarget().getMixed().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The wrapper/adapter for the Feature Group '<em><b>Element.nameMap</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class ElementNameMapFeatureGroupModelFeatureMapEntry<E extends ElementNameMapFeatureGroup> extends
      AbstractModelFeatureMapEntry<ElementNameMapFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case NAMES:
        return EcoreattrsModelPackage.INSTANCE.getElement_Names();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = EcoreattrsModelPackage.INSTANCE.getElementEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case EcoreattrsModelPackage.ELEMENT_NAMES_FEATURE_ID:
        getTarget().setFeature(ElementNameMapFeatureGroup.Feature.NAMES);
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
   * The wrapper/adapter for the Feature Group '<em><b>Feature.aMap</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class FeatureAMapFeatureGroupModelFeatureMapEntry<E extends FeatureAMapFeatureGroup> extends
      AbstractModelFeatureMapEntry<FeatureAMapFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case NAME:
        return EcoreattrsModelPackage.INSTANCE.getFeature_Name();
      case VALUE_:
        return EcoreattrsModelPackage.INSTANCE.getFeature_Value_();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = EcoreattrsModelPackage.INSTANCE.getFeatureEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case EcoreattrsModelPackage.FEATURE_NAME_FEATURE_ID:
        getTarget().setFeature(FeatureAMapFeatureGroup.Feature.NAME);
        return;
      case EcoreattrsModelPackage.FEATURE_VALUE__FEATURE_ID:
        getTarget().setFeature(FeatureAMapFeatureGroup.Feature.VALUE_);
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
   * The wrapper/adapter for the Feature Group '<em><b>Mixed.mixed</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class MixedMixedFeatureGroupModelFeatureMapEntry<E extends MixedMixedFeatureGroup> extends
      AbstractModelFeatureMapEntry<MixedMixedFeatureGroup> {

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
        return EcoreattrsModelPackage.INSTANCE.getMixed_Name();
      case VALUE_:
        return EcoreattrsModelPackage.INSTANCE.getMixed_Value_();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {
      if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text()) {
        getTarget().setFeature(MixedMixedFeatureGroup.Feature.TEXT);
        return;
      } else if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA()) {
        getTarget().setFeature(MixedMixedFeatureGroup.Feature.CDATA);
        return;
      } else if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment()) {
        getTarget().setFeature(MixedMixedFeatureGroup.Feature.COMMENT);
        return;
      }

      final EClass eClass = EcoreattrsModelPackage.INSTANCE.getMixedEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case EcoreattrsModelPackage.MIXED_NAME_FEATURE_ID:
        getTarget().setFeature(MixedMixedFeatureGroup.Feature.NAME);
        return;
      case EcoreattrsModelPackage.MIXED_VALUE__FEATURE_ID:
        getTarget().setFeature(MixedMixedFeatureGroup.Feature.VALUE_);
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