package org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
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
 * org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SubstitutionzvonModelFactory implements ModelFactory {

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
    case SubstitutionzvonModelPackage.COMPLEXAAA_CLASSIFIER_ID:
      return createComplexAAA();
    case SubstitutionzvonModelPackage.COMPLEXEVENTYPE_CLASSIFIER_ID:
      return createComplexEvenType();
    case SubstitutionzvonModelPackage.COMPLEXODDTYPE_CLASSIFIER_ID:
      return createComplexOddType();
    case SubstitutionzvonModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
      return createDocumentRoot();
    case SubstitutionzvonModelPackage.ROOTTYPE_CLASSIFIER_ID:
      return createRootType();
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
    case SubstitutionzvonModelPackage.COMPLEXAAA_CLASSIFIER_ID:
      modelObject = new ComplexAAAModelObject();
      break;
    case SubstitutionzvonModelPackage.COMPLEXEVENTYPE_CLASSIFIER_ID:
      modelObject = new ComplexEvenTypeModelObject();
      break;
    case SubstitutionzvonModelPackage.COMPLEXODDTYPE_CLASSIFIER_ID:
      modelObject = new ComplexOddTypeModelObject();
      break;
    case SubstitutionzvonModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
      modelObject = new DocumentRootModelObject();
      break;
    case SubstitutionzvonModelPackage.ROOTTYPE_CLASSIFIER_ID:
      modelObject = new RootTypeModelObject();
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
    if (eFeature == SubstitutionzvonModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
      return new DocumentRootMixedFeatureGroup();
    }
    if (eFeature == SubstitutionzvonModelPackage.INSTANCE.getRootType_MyAbstractGroup()) {
      return new RootTypeMyAbstractGroupFeatureGroup();
    }
    if (eFeature == SubstitutionzvonModelPackage.INSTANCE.getRootType_MyComplexAbstractGroup()) {
      return new RootTypeMyComplexAbstractGroupFeatureGroup();
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
    if (eFeature == SubstitutionzvonModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
      final DocumentRootMixedFeatureGroupModelFeatureMapEntry<DocumentRootMixedFeatureGroup> entry = new DocumentRootMixedFeatureGroupModelFeatureMapEntry<DocumentRootMixedFeatureGroup>();
      entry.setTarget((DocumentRootMixedFeatureGroup) adaptee);
      return entry;
    }
    if (eFeature == SubstitutionzvonModelPackage.INSTANCE.getRootType_MyAbstractGroup()) {
      final RootTypeMyAbstractGroupFeatureGroupModelFeatureMapEntry<RootTypeMyAbstractGroupFeatureGroup> entry = new RootTypeMyAbstractGroupFeatureGroupModelFeatureMapEntry<RootTypeMyAbstractGroupFeatureGroup>();
      entry.setTarget((RootTypeMyAbstractGroupFeatureGroup) adaptee);
      return entry;
    }
    if (eFeature == SubstitutionzvonModelPackage.INSTANCE.getRootType_MyComplexAbstractGroup()) {
      final RootTypeMyComplexAbstractGroupFeatureGroupModelFeatureMapEntry<RootTypeMyComplexAbstractGroupFeatureGroup> entry = new RootTypeMyComplexAbstractGroupFeatureGroupModelFeatureMapEntry<RootTypeMyComplexAbstractGroupFeatureGroup>();
      entry.setTarget((RootTypeMyComplexAbstractGroupFeatureGroup) adaptee);
      return entry;
    }
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ComplexAAA
   * @generated
   */
  public ComplexAAA createComplexAAA() {
    return new ComplexAAA();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ComplexEvenType
   * @generated
   */
  public ComplexEvenType createComplexEvenType() {
    return new ComplexEvenType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ComplexOddType
   * @generated
   */
  public ComplexOddType createComplexOddType() {
    return new ComplexOddType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DocumentRoot
   * @generated
   */
  public DocumentRoot createDocumentRoot() {
    return new DocumentRoot();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RootType
   * @generated
   */
  public RootType createRootType() {
    return new RootType();
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
    case SubstitutionzvonModelPackage.EVENTYPE_CLASSIFIER_ID:
      return createEvenTypeFromString(value);
    case SubstitutionzvonModelPackage.AAA_CLASSIFIER_ID:
      return createAAAFromString(value);
    case SubstitutionzvonModelPackage.ODDTYPE_CLASSIFIER_ID:
      return createOddTypeFromString(value);
    case SubstitutionzvonModelPackage.EVENTYPEOBJECT_CLASSIFIER_ID:
      return createEvenTypeObjectFromString(value);
    case SubstitutionzvonModelPackage.ODDTYPEOBJECT_CLASSIFIER_ID:
      return createOddTypeObjectFromString(value);
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
    case SubstitutionzvonModelPackage.EVENTYPE_CLASSIFIER_ID:
      return convertEvenTypeToString((EvenType) value);
    case SubstitutionzvonModelPackage.AAA_CLASSIFIER_ID:
      return convertAAAToString((BigInteger) value);
    case SubstitutionzvonModelPackage.ODDTYPE_CLASSIFIER_ID:
      return convertOddTypeToString((OddType) value);
    case SubstitutionzvonModelPackage.EVENTYPEOBJECT_CLASSIFIER_ID:
      return convertEvenTypeObjectToString((EvenType) value);
    case SubstitutionzvonModelPackage.ODDTYPEOBJECT_CLASSIFIER_ID:
      return convertOddTypeObjectToString((OddType) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: EvenType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertEvenTypeToString(EvenType value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: EvenType from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public EvenType createEvenTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return EvenType.get(value);
  }

  /**
   * Converts the EDataType: AAA to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertAAAToString(BigInteger value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: AAA from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public BigInteger createAAAFromString(String value) {
    if (value == null) {
      return null;
    }
    return new BigInteger(value);
  }

  /**
   * Converts the EDataType: OddType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertOddTypeToString(OddType value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: OddType from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public OddType createOddTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return OddType.get(value);
  }

  /**
   * Converts the EDataType: EvenTypeObject to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertEvenTypeObjectToString(EvenType value) {
    if (value == null) {
      return null;
    }
    return convertEvenTypeToString(value);
  }

  /**
   * Creates an instance of the EDataType: EvenTypeObject from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public EvenType createEvenTypeObjectFromString(String value) {
    if (value == null) {
      return null;
    }
    return createEvenTypeFromString(value);
  }

  /**
   * Converts the EDataType: OddTypeObject to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertOddTypeObjectToString(OddType value) {
    if (value == null) {
      return null;
    }
    return convertOddTypeToString(value);
  }

  /**
   * Creates an instance of the EDataType: OddTypeObject from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public OddType createOddTypeObjectFromString(String value) {
    if (value == null) {
      return null;
    }
    return createOddTypeFromString(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ComplexAAA</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ComplexAAAModelObject<E extends ComplexAAA> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SubstitutionzvonModelPackage.INSTANCE.getComplexAAAEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SubstitutionzvonModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SubstitutionzvonModelPackage.COMPLEXAAA_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SubstitutionzvonModelPackage.COMPLEXAAA_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SubstitutionzvonModelPackage.COMPLEXAAA_VALUE_FEATURE_ID:
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
      case SubstitutionzvonModelPackage.COMPLEXAAA_VALUE_FEATURE_ID:
        getTarget().setValue((Long) value);
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
   * The adapter/wrapper for the EClass '<em><b>ComplexEvenType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ComplexEvenTypeModelObject<E extends ComplexEvenType> extends ComplexAAAModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SubstitutionzvonModelPackage.INSTANCE.getComplexEvenTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SubstitutionzvonModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SubstitutionzvonModelPackage.COMPLEXEVENTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SubstitutionzvonModelPackage.COMPLEXEVENTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SubstitutionzvonModelPackage.COMPLEXEVENTYPE_VALUE_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>ComplexOddType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ComplexOddTypeModelObject<E extends ComplexOddType> extends ComplexAAAModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SubstitutionzvonModelPackage.INSTANCE.getComplexOddTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SubstitutionzvonModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SubstitutionzvonModelPackage.COMPLEXODDTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SubstitutionzvonModelPackage.COMPLEXODDTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SubstitutionzvonModelPackage.COMPLEXODDTYPE_VALUE_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>DocumentRoot</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DocumentRootModelObject<E extends DocumentRoot> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SubstitutionzvonModelPackage.INSTANCE.getDocumentRootEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SubstitutionzvonModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SubstitutionzvonModelPackage.DOCUMENTROOT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SubstitutionzvonModelPackage.DOCUMENTROOT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SubstitutionzvonModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed();
      case SubstitutionzvonModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
        return getTarget().getXMLNSPrefixMap();
      case SubstitutionzvonModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
        return getTarget().getXSISchemaLocation();
      case SubstitutionzvonModelPackage.DOCUMENTROOT_COMPLEXEVEN_FEATURE_ID:
        return getTarget().getComplexEven();
      case SubstitutionzvonModelPackage.DOCUMENTROOT_MYCOMPLEXABSTRACT_FEATURE_ID:
        return getTarget().getMyComplexAbstract();
      case SubstitutionzvonModelPackage.DOCUMENTROOT_COMPLEXODD_FEATURE_ID:
        return getTarget().getComplexOdd();
      case SubstitutionzvonModelPackage.DOCUMENTROOT_EVEN_FEATURE_ID:
        return getTarget().getEven();
      case SubstitutionzvonModelPackage.DOCUMENTROOT_MYABSTRACT_FEATURE_ID:
        return getTarget().getMyAbstract();
      case SubstitutionzvonModelPackage.DOCUMENTROOT_ODD_FEATURE_ID:
        return getTarget().getOdd();
      case SubstitutionzvonModelPackage.DOCUMENTROOT_ROOT_FEATURE_ID:
        return getTarget().getRoot();
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
      case SubstitutionzvonModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        getTarget().setMixed((List<DocumentRootMixedFeatureGroup>) value);
        return;
      case SubstitutionzvonModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
        getTarget().setXMLNSPrefixMap((Map<String, String>) value);
        return;
      case SubstitutionzvonModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
        getTarget().setXSISchemaLocation((Map<String, String>) value);
        return;
      case SubstitutionzvonModelPackage.DOCUMENTROOT_COMPLEXEVEN_FEATURE_ID:
        getTarget().setComplexEven((ComplexEvenType) value);
        return;
      case SubstitutionzvonModelPackage.DOCUMENTROOT_COMPLEXODD_FEATURE_ID:
        getTarget().setComplexOdd((ComplexOddType) value);
        return;
      case SubstitutionzvonModelPackage.DOCUMENTROOT_EVEN_FEATURE_ID:
        getTarget().setEven((EvenType) value);
        return;
      case SubstitutionzvonModelPackage.DOCUMENTROOT_ODD_FEATURE_ID:
        getTarget().setOdd((OddType) value);
        return;
      case SubstitutionzvonModelPackage.DOCUMENTROOT_ROOT_FEATURE_ID:
        getTarget().setRoot((RootType) value);
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

      case SubstitutionzvonModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed().add((DocumentRootMixedFeatureGroup) value);

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

      case SubstitutionzvonModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>RootType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RootTypeModelObject<E extends RootType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SubstitutionzvonModelPackage.INSTANCE.getRootTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SubstitutionzvonModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SubstitutionzvonModelPackage.ROOTTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SubstitutionzvonModelPackage.ROOTTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SubstitutionzvonModelPackage.ROOTTYPE_MYABSTRACTGROUP_FEATURE_ID:
        return getTarget().getMyAbstractGroup();
      case SubstitutionzvonModelPackage.ROOTTYPE_MYABSTRACT_FEATURE_ID:
        return getTarget().getMyAbstract();
      case SubstitutionzvonModelPackage.ROOTTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID:
        return getTarget().getMyComplexAbstractGroup();
      case SubstitutionzvonModelPackage.ROOTTYPE_MYCOMPLEXABSTRACT_FEATURE_ID:
        return getTarget().getMyComplexAbstract();
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
      case SubstitutionzvonModelPackage.ROOTTYPE_MYABSTRACTGROUP_FEATURE_ID:
        getTarget().setMyAbstractGroup((List<RootTypeMyAbstractGroupFeatureGroup>) value);
        return;
      case SubstitutionzvonModelPackage.ROOTTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID:
        getTarget().setMyComplexAbstractGroup((List<RootTypeMyComplexAbstractGroupFeatureGroup>) value);
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

      case SubstitutionzvonModelPackage.ROOTTYPE_MYABSTRACTGROUP_FEATURE_ID:
        return getTarget().getMyAbstractGroup().add((RootTypeMyAbstractGroupFeatureGroup) value);

      case SubstitutionzvonModelPackage.ROOTTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID:
        return getTarget().getMyComplexAbstractGroup().add((RootTypeMyComplexAbstractGroupFeatureGroup) value);

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

      case SubstitutionzvonModelPackage.ROOTTYPE_MYABSTRACTGROUP_FEATURE_ID:
        return getTarget().getMyAbstractGroup().remove(value);

      case SubstitutionzvonModelPackage.ROOTTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID:
        return getTarget().getMyComplexAbstractGroup().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The wrapper/adapter for the Feature Group '<em><b>DocumentRoot.mixed</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class DocumentRootMixedFeatureGroupModelFeatureMapEntry<E extends DocumentRootMixedFeatureGroup>
      extends AbstractModelFeatureMapEntry<DocumentRootMixedFeatureGroup> {

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
      case COMPLEXEVEN:
        return SubstitutionzvonModelPackage.INSTANCE.getDocumentRoot_ComplexEven();
      case MYCOMPLEXABSTRACT:
        return SubstitutionzvonModelPackage.INSTANCE.getDocumentRoot_MyComplexAbstract();
      case COMPLEXODD:
        return SubstitutionzvonModelPackage.INSTANCE.getDocumentRoot_ComplexOdd();
      case EVEN:
        return SubstitutionzvonModelPackage.INSTANCE.getDocumentRoot_Even();
      case MYABSTRACT:
        return SubstitutionzvonModelPackage.INSTANCE.getDocumentRoot_MyAbstract();
      case ODD:
        return SubstitutionzvonModelPackage.INSTANCE.getDocumentRoot_Odd();
      case ROOT:
        return SubstitutionzvonModelPackage.INSTANCE.getDocumentRoot_Root();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {
      if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text()) {
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.TEXT);
        return;
      } else if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA()) {
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.CDATA);
        return;
      } else if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment()) {
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.COMMENT);
        return;
      }

      final EClass eClass = SubstitutionzvonModelPackage.INSTANCE.getDocumentRootEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case SubstitutionzvonModelPackage.DOCUMENTROOT_COMPLEXEVEN_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.COMPLEXEVEN);
        return;
      case SubstitutionzvonModelPackage.DOCUMENTROOT_MYCOMPLEXABSTRACT_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.MYCOMPLEXABSTRACT);
        return;
      case SubstitutionzvonModelPackage.DOCUMENTROOT_COMPLEXODD_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.COMPLEXODD);
        return;
      case SubstitutionzvonModelPackage.DOCUMENTROOT_EVEN_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.EVEN);
        return;
      case SubstitutionzvonModelPackage.DOCUMENTROOT_MYABSTRACT_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.MYABSTRACT);
        return;
      case SubstitutionzvonModelPackage.DOCUMENTROOT_ODD_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.ODD);
        return;
      case SubstitutionzvonModelPackage.DOCUMENTROOT_ROOT_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.ROOT);
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
   * The wrapper/adapter for the Feature Group '<em><b>RootType.myAbstractGroup</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class RootTypeMyAbstractGroupFeatureGroupModelFeatureMapEntry<E extends RootTypeMyAbstractGroupFeatureGroup>
      extends AbstractModelFeatureMapEntry<RootTypeMyAbstractGroupFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case MYABSTRACT:
        return SubstitutionzvonModelPackage.INSTANCE.getRootType_MyAbstract();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = SubstitutionzvonModelPackage.INSTANCE.getRootTypeEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case SubstitutionzvonModelPackage.ROOTTYPE_MYABSTRACT_FEATURE_ID:
        getTarget().setFeature(RootTypeMyAbstractGroupFeatureGroup.Feature.MYABSTRACT);
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
   * The wrapper/adapter for the Feature Group '<em><b>RootType.myComplexAbstractGroup</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class RootTypeMyComplexAbstractGroupFeatureGroupModelFeatureMapEntry<E extends RootTypeMyComplexAbstractGroupFeatureGroup>
      extends AbstractModelFeatureMapEntry<RootTypeMyComplexAbstractGroupFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case MYCOMPLEXABSTRACT:
        return SubstitutionzvonModelPackage.INSTANCE.getRootType_MyComplexAbstract();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = SubstitutionzvonModelPackage.INSTANCE.getRootTypeEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case SubstitutionzvonModelPackage.ROOTTYPE_MYCOMPLEXABSTRACT_FEATURE_ID:
        getTarget().setFeature(RootTypeMyComplexAbstractGroupFeatureGroup.Feature.MYCOMPLEXABSTRACT);
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