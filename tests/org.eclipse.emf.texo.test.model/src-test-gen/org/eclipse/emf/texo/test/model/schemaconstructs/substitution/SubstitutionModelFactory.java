package org.eclipse.emf.texo.test.model.schemaconstructs.substitution;

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
 * org.eclipse.emf.texo.test.model.schemaconstructs.substitution. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SubstitutionModelFactory implements ModelFactory {

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
    case SubstitutionModelPackage.COMPLEXNUMBER_CLASSIFIER_ID:
      return createComplexNumber();
    case SubstitutionModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
      return createDocumentRoot();
    case SubstitutionModelPackage.EVENCOMPLEXNUMBERTYPE_CLASSIFIER_ID:
      return createEvenComplexNumberType();
    case SubstitutionModelPackage.MULTINUMBERTYPE_CLASSIFIER_ID:
      return createMultiNumberType();
    case SubstitutionModelPackage.NUMBERTYPE_CLASSIFIER_ID:
      return createNumberType();
    case SubstitutionModelPackage.ODDCOMPLEXNUMBERTYPE_CLASSIFIER_ID:
      return createOddComplexNumberType();
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
    case SubstitutionModelPackage.COMPLEXNUMBER_CLASSIFIER_ID:
      modelObject = new ComplexNumberModelObject();
      break;
    case SubstitutionModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
      modelObject = new DocumentRootModelObject();
      break;
    case SubstitutionModelPackage.EVENCOMPLEXNUMBERTYPE_CLASSIFIER_ID:
      modelObject = new EvenComplexNumberTypeModelObject();
      break;
    case SubstitutionModelPackage.MULTINUMBERTYPE_CLASSIFIER_ID:
      modelObject = new MultiNumberTypeModelObject();
      break;
    case SubstitutionModelPackage.NUMBERTYPE_CLASSIFIER_ID:
      modelObject = new NumberTypeModelObject();
      break;
    case SubstitutionModelPackage.ODDCOMPLEXNUMBERTYPE_CLASSIFIER_ID:
      modelObject = new OddComplexNumberTypeModelObject();
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
    if (eFeature == SubstitutionModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
      return new DocumentRootMixedFeatureGroup();
    }
    if (eFeature == SubstitutionModelPackage.INSTANCE.getMultiNumberType_MyComplexAbstractGroup()) {
      return new MultiNumberTypeMyComplexAbstractGroupFeatureGroup();
    }
    if (eFeature == SubstitutionModelPackage.INSTANCE.getNumberType_MySimpleAbstractGroup()) {
      return new NumberTypeMySimpleAbstractGroupFeatureGroup();
    }
    if (eFeature == SubstitutionModelPackage.INSTANCE.getNumberType_MyComplexAbstractGroup()) {
      return new NumberTypeMyComplexAbstractGroupFeatureGroup();
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
    if (eFeature == SubstitutionModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
      final DocumentRootMixedFeatureGroupModelFeatureMapEntry<DocumentRootMixedFeatureGroup> entry = new DocumentRootMixedFeatureGroupModelFeatureMapEntry<DocumentRootMixedFeatureGroup>();
      entry.setTarget((DocumentRootMixedFeatureGroup) adaptee);
      return entry;
    }
    if (eFeature == SubstitutionModelPackage.INSTANCE.getMultiNumberType_MyComplexAbstractGroup()) {
      final MultiNumberTypeMyComplexAbstractGroupFeatureGroupModelFeatureMapEntry<MultiNumberTypeMyComplexAbstractGroupFeatureGroup> entry = new MultiNumberTypeMyComplexAbstractGroupFeatureGroupModelFeatureMapEntry<MultiNumberTypeMyComplexAbstractGroupFeatureGroup>();
      entry.setTarget((MultiNumberTypeMyComplexAbstractGroupFeatureGroup) adaptee);
      return entry;
    }
    if (eFeature == SubstitutionModelPackage.INSTANCE.getNumberType_MySimpleAbstractGroup()) {
      final NumberTypeMySimpleAbstractGroupFeatureGroupModelFeatureMapEntry<NumberTypeMySimpleAbstractGroupFeatureGroup> entry = new NumberTypeMySimpleAbstractGroupFeatureGroupModelFeatureMapEntry<NumberTypeMySimpleAbstractGroupFeatureGroup>();
      entry.setTarget((NumberTypeMySimpleAbstractGroupFeatureGroup) adaptee);
      return entry;
    }
    if (eFeature == SubstitutionModelPackage.INSTANCE.getNumberType_MyComplexAbstractGroup()) {
      final NumberTypeMyComplexAbstractGroupFeatureGroupModelFeatureMapEntry<NumberTypeMyComplexAbstractGroupFeatureGroup> entry = new NumberTypeMyComplexAbstractGroupFeatureGroupModelFeatureMapEntry<NumberTypeMyComplexAbstractGroupFeatureGroup>();
      entry.setTarget((NumberTypeMyComplexAbstractGroupFeatureGroup) adaptee);
      return entry;
    }
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ComplexNumber
   * @generated
   */
  public ComplexNumber createComplexNumber() {
    return new ComplexNumber();
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
   * @return an instance of the model object representing the EClass EvenComplexNumberType
   * @generated
   */
  public EvenComplexNumberType createEvenComplexNumberType() {
    return new EvenComplexNumberType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass MultiNumberType
   * @generated
   */
  public MultiNumberType createMultiNumberType() {
    return new MultiNumberType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass NumberType
   * @generated
   */
  public NumberType createNumberType() {
    return new NumberType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass OddComplexNumberType
   * @generated
   */
  public OddComplexNumberType createOddComplexNumberType() {
    return new OddComplexNumberType();
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
    case SubstitutionModelPackage.EVENTYPE_CLASSIFIER_ID:
      return createEvenTypeFromString(value);
    case SubstitutionModelPackage.SIMPLENUMBER_CLASSIFIER_ID:
      return createSimpleNumberFromString(value);
    case SubstitutionModelPackage.ODDTYPE_CLASSIFIER_ID:
      return createOddTypeFromString(value);
    case SubstitutionModelPackage.EVENTYPEOBJECT_CLASSIFIER_ID:
      return createEvenTypeObjectFromString(value);
    case SubstitutionModelPackage.ODDTYPEOBJECT_CLASSIFIER_ID:
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
    case SubstitutionModelPackage.EVENTYPE_CLASSIFIER_ID:
      return convertEvenTypeToString((EvenType) value);
    case SubstitutionModelPackage.SIMPLENUMBER_CLASSIFIER_ID:
      return convertSimpleNumberToString((BigInteger) value);
    case SubstitutionModelPackage.ODDTYPE_CLASSIFIER_ID:
      return convertOddTypeToString((OddType) value);
    case SubstitutionModelPackage.EVENTYPEOBJECT_CLASSIFIER_ID:
      return convertEvenTypeObjectToString((EvenType) value);
    case SubstitutionModelPackage.ODDTYPEOBJECT_CLASSIFIER_ID:
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
   * Converts the EDataType: SimpleNumber to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertSimpleNumberToString(BigInteger value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: SimpleNumber from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public BigInteger createSimpleNumberFromString(String value) {
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
   * The adapter/wrapper for the EClass '<em><b>ComplexNumber</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ComplexNumberModelObject<E extends ComplexNumber> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SubstitutionModelPackage.INSTANCE.getComplexNumberEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SubstitutionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SubstitutionModelPackage.COMPLEXNUMBER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SubstitutionModelPackage.COMPLEXNUMBER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SubstitutionModelPackage.COMPLEXNUMBER_VALUE_FEATURE_ID:
        return getTarget().getValue();
      case SubstitutionModelPackage.COMPLEXNUMBER_UNIT_FEATURE_ID:
        return getTarget().getUnit();
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
      case SubstitutionModelPackage.COMPLEXNUMBER_VALUE_FEATURE_ID:
        getTarget().setValue((BigInteger) value);
        return;
      case SubstitutionModelPackage.COMPLEXNUMBER_UNIT_FEATURE_ID:
        getTarget().setUnit((String) value);
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
      return SubstitutionModelPackage.INSTANCE.getDocumentRootEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SubstitutionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SubstitutionModelPackage.DOCUMENTROOT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SubstitutionModelPackage.DOCUMENTROOT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SubstitutionModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed();
      case SubstitutionModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
        return getTarget().getXMLNSPrefixMap();
      case SubstitutionModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
        return getTarget().getXSISchemaLocation();
      case SubstitutionModelPackage.DOCUMENTROOT_EVEN_FEATURE_ID:
        return getTarget().getEven();
      case SubstitutionModelPackage.DOCUMENTROOT_MYSIMPLEABSTRACT_FEATURE_ID:
        return getTarget().getMySimpleAbstract();
      case SubstitutionModelPackage.DOCUMENTROOT_EVENCOMPLEXNUMBER_FEATURE_ID:
        return getTarget().getEvenComplexNumber();
      case SubstitutionModelPackage.DOCUMENTROOT_MYCOMPLEXABSTRACT_FEATURE_ID:
        return getTarget().getMyComplexAbstract();
      case SubstitutionModelPackage.DOCUMENTROOT_MULTINUMBER_FEATURE_ID:
        return getTarget().getMultiNumber();
      case SubstitutionModelPackage.DOCUMENTROOT_NUMBER_FEATURE_ID:
        return getTarget().getNumber();
      case SubstitutionModelPackage.DOCUMENTROOT_ODD_FEATURE_ID:
        return getTarget().getOdd();
      case SubstitutionModelPackage.DOCUMENTROOT_ODDCOMPLEXNUMBER_FEATURE_ID:
        return getTarget().getOddComplexNumber();
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
      case SubstitutionModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        getTarget().setMixed((List<DocumentRootMixedFeatureGroup>) value);
        return;
      case SubstitutionModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
        getTarget().setXMLNSPrefixMap((Map<String, String>) value);
        return;
      case SubstitutionModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
        getTarget().setXSISchemaLocation((Map<String, String>) value);
        return;
      case SubstitutionModelPackage.DOCUMENTROOT_EVEN_FEATURE_ID:
        getTarget().setEven((EvenType) value);
        return;
      case SubstitutionModelPackage.DOCUMENTROOT_EVENCOMPLEXNUMBER_FEATURE_ID:
        getTarget().setEvenComplexNumber((EvenComplexNumberType) value);
        return;
      case SubstitutionModelPackage.DOCUMENTROOT_MULTINUMBER_FEATURE_ID:
        getTarget().setMultiNumber((MultiNumberType) value);
        return;
      case SubstitutionModelPackage.DOCUMENTROOT_NUMBER_FEATURE_ID:
        getTarget().setNumber((NumberType) value);
        return;
      case SubstitutionModelPackage.DOCUMENTROOT_ODD_FEATURE_ID:
        getTarget().setOdd((OddType) value);
        return;
      case SubstitutionModelPackage.DOCUMENTROOT_ODDCOMPLEXNUMBER_FEATURE_ID:
        getTarget().setOddComplexNumber((OddComplexNumberType) value);
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

      case SubstitutionModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
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

      case SubstitutionModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>EvenComplexNumberType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EvenComplexNumberTypeModelObject<E extends EvenComplexNumberType> extends
      ComplexNumberModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SubstitutionModelPackage.INSTANCE.getEvenComplexNumberTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SubstitutionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SubstitutionModelPackage.EVENCOMPLEXNUMBERTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SubstitutionModelPackage.EVENCOMPLEXNUMBERTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SubstitutionModelPackage.EVENCOMPLEXNUMBERTYPE_VALUE_FEATURE_ID:
        return getTarget().getValue();
      case SubstitutionModelPackage.EVENCOMPLEXNUMBERTYPE_UNIT_FEATURE_ID:
        return getTarget().getUnit();
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
   * The adapter/wrapper for the EClass '<em><b>MultiNumberType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MultiNumberTypeModelObject<E extends MultiNumberType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SubstitutionModelPackage.INSTANCE.getMultiNumberTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SubstitutionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SubstitutionModelPackage.MULTINUMBERTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SubstitutionModelPackage.MULTINUMBERTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SubstitutionModelPackage.MULTINUMBERTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case SubstitutionModelPackage.MULTINUMBERTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID:
        return getTarget().getMyComplexAbstractGroup();
      case SubstitutionModelPackage.MULTINUMBERTYPE_MYCOMPLEXABSTRACT_FEATURE_ID:
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
      case SubstitutionModelPackage.MULTINUMBERTYPE_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case SubstitutionModelPackage.MULTINUMBERTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID:
        getTarget().setMyComplexAbstractGroup((List<MultiNumberTypeMyComplexAbstractGroupFeatureGroup>) value);
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

      case SubstitutionModelPackage.MULTINUMBERTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID:
        return getTarget().getMyComplexAbstractGroup().add((MultiNumberTypeMyComplexAbstractGroupFeatureGroup) value);

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

      case SubstitutionModelPackage.MULTINUMBERTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID:
        return getTarget().getMyComplexAbstractGroup().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>NumberType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class NumberTypeModelObject<E extends NumberType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SubstitutionModelPackage.INSTANCE.getNumberTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SubstitutionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SubstitutionModelPackage.NUMBERTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SubstitutionModelPackage.NUMBERTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SubstitutionModelPackage.NUMBERTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case SubstitutionModelPackage.NUMBERTYPE_MYSIMPLEABSTRACTGROUP_FEATURE_ID:
        return getTarget().getMySimpleAbstractGroup();
      case SubstitutionModelPackage.NUMBERTYPE_MYSIMPLEABSTRACT_FEATURE_ID:
        return getTarget().getMySimpleAbstract();
      case SubstitutionModelPackage.NUMBERTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID:
        return getTarget().getMyComplexAbstractGroup();
      case SubstitutionModelPackage.NUMBERTYPE_MYCOMPLEXABSTRACT_FEATURE_ID:
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
      case SubstitutionModelPackage.NUMBERTYPE_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case SubstitutionModelPackage.NUMBERTYPE_MYSIMPLEABSTRACTGROUP_FEATURE_ID:
        getTarget().setMySimpleAbstractGroup((List<NumberTypeMySimpleAbstractGroupFeatureGroup>) value);
        return;
      case SubstitutionModelPackage.NUMBERTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID:
        getTarget().setMyComplexAbstractGroup((List<NumberTypeMyComplexAbstractGroupFeatureGroup>) value);
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

      case SubstitutionModelPackage.NUMBERTYPE_MYSIMPLEABSTRACTGROUP_FEATURE_ID:
        return getTarget().getMySimpleAbstractGroup().add((NumberTypeMySimpleAbstractGroupFeatureGroup) value);

      case SubstitutionModelPackage.NUMBERTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID:
        return getTarget().getMyComplexAbstractGroup().add((NumberTypeMyComplexAbstractGroupFeatureGroup) value);

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

      case SubstitutionModelPackage.NUMBERTYPE_MYSIMPLEABSTRACTGROUP_FEATURE_ID:
        return getTarget().getMySimpleAbstractGroup().remove(value);

      case SubstitutionModelPackage.NUMBERTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID:
        return getTarget().getMyComplexAbstractGroup().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>OddComplexNumberType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class OddComplexNumberTypeModelObject<E extends OddComplexNumberType> extends
      ComplexNumberModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SubstitutionModelPackage.INSTANCE.getOddComplexNumberTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SubstitutionModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SubstitutionModelPackage.ODDCOMPLEXNUMBERTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SubstitutionModelPackage.ODDCOMPLEXNUMBERTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SubstitutionModelPackage.ODDCOMPLEXNUMBERTYPE_VALUE_FEATURE_ID:
        return getTarget().getValue();
      case SubstitutionModelPackage.ODDCOMPLEXNUMBERTYPE_UNIT_FEATURE_ID:
        return getTarget().getUnit();
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
      case EVEN:
        return SubstitutionModelPackage.INSTANCE.getDocumentRoot_Even();
      case MYSIMPLEABSTRACT:
        return SubstitutionModelPackage.INSTANCE.getDocumentRoot_MySimpleAbstract();
      case EVENCOMPLEXNUMBER:
        return SubstitutionModelPackage.INSTANCE.getDocumentRoot_EvenComplexNumber();
      case MYCOMPLEXABSTRACT:
        return SubstitutionModelPackage.INSTANCE.getDocumentRoot_MyComplexAbstract();
      case MULTINUMBER:
        return SubstitutionModelPackage.INSTANCE.getDocumentRoot_MultiNumber();
      case NUMBER:
        return SubstitutionModelPackage.INSTANCE.getDocumentRoot_Number();
      case ODD:
        return SubstitutionModelPackage.INSTANCE.getDocumentRoot_Odd();
      case ODDCOMPLEXNUMBER:
        return SubstitutionModelPackage.INSTANCE.getDocumentRoot_OddComplexNumber();
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

      final EClass eClass = SubstitutionModelPackage.INSTANCE.getDocumentRootEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case SubstitutionModelPackage.DOCUMENTROOT_EVEN_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.EVEN);
        return;
      case SubstitutionModelPackage.DOCUMENTROOT_MYSIMPLEABSTRACT_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.MYSIMPLEABSTRACT);
        return;
      case SubstitutionModelPackage.DOCUMENTROOT_EVENCOMPLEXNUMBER_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.EVENCOMPLEXNUMBER);
        return;
      case SubstitutionModelPackage.DOCUMENTROOT_MYCOMPLEXABSTRACT_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.MYCOMPLEXABSTRACT);
        return;
      case SubstitutionModelPackage.DOCUMENTROOT_MULTINUMBER_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.MULTINUMBER);
        return;
      case SubstitutionModelPackage.DOCUMENTROOT_NUMBER_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.NUMBER);
        return;
      case SubstitutionModelPackage.DOCUMENTROOT_ODD_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.ODD);
        return;
      case SubstitutionModelPackage.DOCUMENTROOT_ODDCOMPLEXNUMBER_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.ODDCOMPLEXNUMBER);
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
   * The wrapper/adapter for the Feature Group '<em><b>MultiNumberType.myComplexAbstractGroup</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class MultiNumberTypeMyComplexAbstractGroupFeatureGroupModelFeatureMapEntry<E extends MultiNumberTypeMyComplexAbstractGroupFeatureGroup>
      extends AbstractModelFeatureMapEntry<MultiNumberTypeMyComplexAbstractGroupFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case MYCOMPLEXABSTRACT:
        return SubstitutionModelPackage.INSTANCE.getMultiNumberType_MyComplexAbstract();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = SubstitutionModelPackage.INSTANCE.getMultiNumberTypeEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case SubstitutionModelPackage.MULTINUMBERTYPE_MYCOMPLEXABSTRACT_FEATURE_ID:
        getTarget().setFeature(MultiNumberTypeMyComplexAbstractGroupFeatureGroup.Feature.MYCOMPLEXABSTRACT);
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
   * The wrapper/adapter for the Feature Group '<em><b>NumberType.mySimpleAbstractGroup</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class NumberTypeMySimpleAbstractGroupFeatureGroupModelFeatureMapEntry<E extends NumberTypeMySimpleAbstractGroupFeatureGroup>
      extends AbstractModelFeatureMapEntry<NumberTypeMySimpleAbstractGroupFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case MYSIMPLEABSTRACT:
        return SubstitutionModelPackage.INSTANCE.getNumberType_MySimpleAbstract();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = SubstitutionModelPackage.INSTANCE.getNumberTypeEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case SubstitutionModelPackage.NUMBERTYPE_MYSIMPLEABSTRACT_FEATURE_ID:
        getTarget().setFeature(NumberTypeMySimpleAbstractGroupFeatureGroup.Feature.MYSIMPLEABSTRACT);
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
   * The wrapper/adapter for the Feature Group '<em><b>NumberType.myComplexAbstractGroup</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class NumberTypeMyComplexAbstractGroupFeatureGroupModelFeatureMapEntry<E extends NumberTypeMyComplexAbstractGroupFeatureGroup>
      extends AbstractModelFeatureMapEntry<NumberTypeMyComplexAbstractGroupFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case MYCOMPLEXABSTRACT:
        return SubstitutionModelPackage.INSTANCE.getNumberType_MyComplexAbstract();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = SubstitutionModelPackage.INSTANCE.getNumberTypeEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case SubstitutionModelPackage.NUMBERTYPE_MYCOMPLEXABSTRACT_FEATURE_ID:
        getTarget().setFeature(NumberTypeMyComplexAbstractGroupFeatureGroup.Feature.MYCOMPLEXABSTRACT);
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