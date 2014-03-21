package org.eclipse.emf.texo.test.model.samples.jpamixed;

import java.math.BigInteger;
import java.util.Date;
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
 * The <b>{@link ModelFactory}</b> for the types of this model: org.eclipse.emf.texo.test.model.samples.jpamixed. It
 * contains code to create instances {@link ModelObject} wrappers and instances for EClasses and convert objects back
 * and forth from their String (XML) representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class JpamixedModelFactory implements ModelFactory {

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
    case JpamixedModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
      return createDocumentRoot();
    case JpamixedModelPackage.LETTERBODYTYPE_CLASSIFIER_ID:
      return createLetterBodyType();
    case JpamixedModelPackage.SALUTATIONTYPE_CLASSIFIER_ID:
      return createSalutationType();
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
    case JpamixedModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
      modelObject = new DocumentRootModelObject();
      break;
    case JpamixedModelPackage.LETTERBODYTYPE_CLASSIFIER_ID:
      modelObject = new LetterBodyTypeModelObject();
      break;
    case JpamixedModelPackage.SALUTATIONTYPE_CLASSIFIER_ID:
      modelObject = new SalutationTypeModelObject();
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
    if (eFeature == JpamixedModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
      return new DocumentRootMixedFeatureGroup();
    }
    if (eFeature == JpamixedModelPackage.INSTANCE.getLetterBodyType_Mixed()) {
      return new LetterBodyTypeMixedFeatureGroup();
    }
    if (eFeature == JpamixedModelPackage.INSTANCE.getSalutationType_Mixed()) {
      return new SalutationTypeMixedFeatureGroup();
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
    if (eFeature == JpamixedModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
      final DocumentRootMixedFeatureGroupModelFeatureMapEntry<DocumentRootMixedFeatureGroup> entry = new DocumentRootMixedFeatureGroupModelFeatureMapEntry<DocumentRootMixedFeatureGroup>();
      entry.setTarget((DocumentRootMixedFeatureGroup) adaptee);
      return entry;
    }
    if (eFeature == JpamixedModelPackage.INSTANCE.getLetterBodyType_Mixed()) {
      final LetterBodyTypeMixedFeatureGroupModelFeatureMapEntry<LetterBodyTypeMixedFeatureGroup> entry = new LetterBodyTypeMixedFeatureGroupModelFeatureMapEntry<LetterBodyTypeMixedFeatureGroup>();
      entry.setTarget((LetterBodyTypeMixedFeatureGroup) adaptee);
      return entry;
    }
    if (eFeature == JpamixedModelPackage.INSTANCE.getSalutationType_Mixed()) {
      final SalutationTypeMixedFeatureGroupModelFeatureMapEntry<SalutationTypeMixedFeatureGroup> entry = new SalutationTypeMixedFeatureGroupModelFeatureMapEntry<SalutationTypeMixedFeatureGroup>();
      entry.setTarget((SalutationTypeMixedFeatureGroup) adaptee);
      return entry;
    }
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
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
   * @return an instance of the model object representing the EClass LetterBodyType
   * @generated
   */
  public LetterBodyType createLetterBodyType() {
    return new LetterBodyType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SalutationType
   * @generated
   */
  public SalutationType createSalutationType() {
    return new SalutationType();
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
      return JpamixedModelPackage.INSTANCE.getDocumentRootEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return JpamixedModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case JpamixedModelPackage.DOCUMENTROOT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case JpamixedModelPackage.DOCUMENTROOT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case JpamixedModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed();
      case JpamixedModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
        return getTarget().getXMLNSPrefixMap();
      case JpamixedModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
        return getTarget().getXSISchemaLocation();
      case JpamixedModelPackage.DOCUMENTROOT_LETTERBODY_FEATURE_ID:
        return getTarget().getLetterBody();
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
      case JpamixedModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        getTarget().setMixed((List<DocumentRootMixedFeatureGroup>) value);
        return;
      case JpamixedModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
        getTarget().setXMLNSPrefixMap((Map<String, String>) value);
        return;
      case JpamixedModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
        getTarget().setXSISchemaLocation((Map<String, String>) value);
        return;
      case JpamixedModelPackage.DOCUMENTROOT_LETTERBODY_FEATURE_ID:
        getTarget().setLetterBody((LetterBodyType) value);
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

      case JpamixedModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
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

      case JpamixedModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>LetterBodyType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class LetterBodyTypeModelObject<E extends LetterBodyType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return JpamixedModelPackage.INSTANCE.getLetterBodyTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return JpamixedModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case JpamixedModelPackage.LETTERBODYTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case JpamixedModelPackage.LETTERBODYTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case JpamixedModelPackage.LETTERBODYTYPE_MIXED_FEATURE_ID:
        return getTarget().getMixed();
      case JpamixedModelPackage.LETTERBODYTYPE_SALUTATION_FEATURE_ID:
        return getTarget().getSalutation();
      case JpamixedModelPackage.LETTERBODYTYPE_QUANTITY_FEATURE_ID:
        return getTarget().getQuantity();
      case JpamixedModelPackage.LETTERBODYTYPE_PRODUCTNAME_FEATURE_ID:
        return getTarget().getProductName();
      case JpamixedModelPackage.LETTERBODYTYPE_SHIPDATE_FEATURE_ID:
        return getTarget().getShipDate();
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
      case JpamixedModelPackage.LETTERBODYTYPE_MIXED_FEATURE_ID:
        getTarget().setMixed((List<LetterBodyTypeMixedFeatureGroup>) value);
        return;
      case JpamixedModelPackage.LETTERBODYTYPE_SALUTATION_FEATURE_ID:
        getTarget().setSalutation((SalutationType) value);
        return;
      case JpamixedModelPackage.LETTERBODYTYPE_QUANTITY_FEATURE_ID:
        getTarget().setQuantity((BigInteger) value);
        return;
      case JpamixedModelPackage.LETTERBODYTYPE_PRODUCTNAME_FEATURE_ID:
        getTarget().setProductName((String) value);
        return;
      case JpamixedModelPackage.LETTERBODYTYPE_SHIPDATE_FEATURE_ID:
        getTarget().setShipDate((Date) value);
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

      case JpamixedModelPackage.LETTERBODYTYPE_MIXED_FEATURE_ID:
        return getTarget().getMixed().add((LetterBodyTypeMixedFeatureGroup) value);

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

      case JpamixedModelPackage.LETTERBODYTYPE_MIXED_FEATURE_ID:
        return getTarget().getMixed().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SalutationType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SalutationTypeModelObject<E extends SalutationType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return JpamixedModelPackage.INSTANCE.getSalutationTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return JpamixedModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case JpamixedModelPackage.SALUTATIONTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case JpamixedModelPackage.SALUTATIONTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case JpamixedModelPackage.SALUTATIONTYPE_MIXED_FEATURE_ID:
        return getTarget().getMixed();
      case JpamixedModelPackage.SALUTATIONTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
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
      case JpamixedModelPackage.SALUTATIONTYPE_MIXED_FEATURE_ID:
        getTarget().setMixed((List<SalutationTypeMixedFeatureGroup>) value);
        return;
      case JpamixedModelPackage.SALUTATIONTYPE_NAME_FEATURE_ID:
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

      case JpamixedModelPackage.SALUTATIONTYPE_MIXED_FEATURE_ID:
        return getTarget().getMixed().add((SalutationTypeMixedFeatureGroup) value);

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

      case JpamixedModelPackage.SALUTATIONTYPE_MIXED_FEATURE_ID:
        return getTarget().getMixed().remove(value);

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
      case LETTERBODY:
        return JpamixedModelPackage.INSTANCE.getDocumentRoot_LetterBody();
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

      final EClass eClass = JpamixedModelPackage.INSTANCE.getDocumentRootEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case JpamixedModelPackage.DOCUMENTROOT_LETTERBODY_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.LETTERBODY);
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
   * The wrapper/adapter for the Feature Group '<em><b>LetterBodyType.mixed</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class LetterBodyTypeMixedFeatureGroupModelFeatureMapEntry<E extends LetterBodyTypeMixedFeatureGroup>
      extends AbstractModelFeatureMapEntry<LetterBodyTypeMixedFeatureGroup> {

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
      case SALUTATION:
        return JpamixedModelPackage.INSTANCE.getLetterBodyType_Salutation();
      case QUANTITY:
        return JpamixedModelPackage.INSTANCE.getLetterBodyType_Quantity();
      case PRODUCTNAME:
        return JpamixedModelPackage.INSTANCE.getLetterBodyType_ProductName();
      case SHIPDATE:
        return JpamixedModelPackage.INSTANCE.getLetterBodyType_ShipDate();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {
      if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text()) {
        getTarget().setFeature(LetterBodyTypeMixedFeatureGroup.Feature.TEXT);
        return;
      } else if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA()) {
        getTarget().setFeature(LetterBodyTypeMixedFeatureGroup.Feature.CDATA);
        return;
      } else if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment()) {
        getTarget().setFeature(LetterBodyTypeMixedFeatureGroup.Feature.COMMENT);
        return;
      }

      final EClass eClass = JpamixedModelPackage.INSTANCE.getLetterBodyTypeEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case JpamixedModelPackage.LETTERBODYTYPE_SALUTATION_FEATURE_ID:
        getTarget().setFeature(LetterBodyTypeMixedFeatureGroup.Feature.SALUTATION);
        return;
      case JpamixedModelPackage.LETTERBODYTYPE_QUANTITY_FEATURE_ID:
        getTarget().setFeature(LetterBodyTypeMixedFeatureGroup.Feature.QUANTITY);
        return;
      case JpamixedModelPackage.LETTERBODYTYPE_PRODUCTNAME_FEATURE_ID:
        getTarget().setFeature(LetterBodyTypeMixedFeatureGroup.Feature.PRODUCTNAME);
        return;
      case JpamixedModelPackage.LETTERBODYTYPE_SHIPDATE_FEATURE_ID:
        getTarget().setFeature(LetterBodyTypeMixedFeatureGroup.Feature.SHIPDATE);
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
   * The wrapper/adapter for the Feature Group '<em><b>SalutationType.mixed</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class SalutationTypeMixedFeatureGroupModelFeatureMapEntry<E extends SalutationTypeMixedFeatureGroup>
      extends AbstractModelFeatureMapEntry<SalutationTypeMixedFeatureGroup> {

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
        return JpamixedModelPackage.INSTANCE.getSalutationType_Name();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {
      if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text()) {
        getTarget().setFeature(SalutationTypeMixedFeatureGroup.Feature.TEXT);
        return;
      } else if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA()) {
        getTarget().setFeature(SalutationTypeMixedFeatureGroup.Feature.CDATA);
        return;
      } else if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment()) {
        getTarget().setFeature(SalutationTypeMixedFeatureGroup.Feature.COMMENT);
        return;
      }

      final EClass eClass = JpamixedModelPackage.INSTANCE.getSalutationTypeEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case JpamixedModelPackage.SALUTATIONTYPE_NAME_FEATURE_ID:
        getTarget().setFeature(SalutationTypeMixedFeatureGroup.Feature.NAME);
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