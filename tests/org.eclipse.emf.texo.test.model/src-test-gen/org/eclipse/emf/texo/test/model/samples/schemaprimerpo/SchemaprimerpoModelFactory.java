package org.eclipse.emf.texo.test.model.samples.schemaprimerpo;

import java.math.BigDecimal;
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
 * The <b>{@link ModelFactory}</b> for the types of this model: org.eclipse.emf.texo.test.model.samples.schemaprimerpo.
 * It contains code to create instances {@link ModelObject} wrappers and instances for EClasses and convert objects back
 * and forth from their String (XML) representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SchemaprimerpoModelFactory implements ModelFactory {

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
    case SchemaprimerpoModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
      return createDocumentRoot();
    case SchemaprimerpoModelPackage.PURCHASEORDER_CLASSIFIER_ID:
      return createPurchaseOrder();
    case SchemaprimerpoModelPackage.ITEM_CLASSIFIER_ID:
      return createItem();
    case SchemaprimerpoModelPackage.USADDRESS_CLASSIFIER_ID:
      return createUSAddress();
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
    case SchemaprimerpoModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
      modelObject = new DocumentRootModelObject();
      break;
    case SchemaprimerpoModelPackage.PURCHASEORDER_CLASSIFIER_ID:
      modelObject = new PurchaseOrderModelObject();
      break;
    case SchemaprimerpoModelPackage.ITEM_CLASSIFIER_ID:
      modelObject = new ItemModelObject();
      break;
    case SchemaprimerpoModelPackage.USADDRESS_CLASSIFIER_ID:
      modelObject = new USAddressModelObject();
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
    if (eFeature == SchemaprimerpoModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
      return new DocumentRootMixedFeatureGroup();
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
    if (eFeature == SchemaprimerpoModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
      final DocumentRootMixedFeatureGroupModelFeatureMapEntry<DocumentRootMixedFeatureGroup> entry = new DocumentRootMixedFeatureGroupModelFeatureMapEntry<DocumentRootMixedFeatureGroup>();
      entry.setTarget((DocumentRootMixedFeatureGroup) adaptee);
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
   * @return an instance of the model object representing the EClass PurchaseOrder
   * @generated
   */
  public PurchaseOrder createPurchaseOrder() {
    return new PurchaseOrder();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Item
   * @generated
   */
  public Item createItem() {
    return new Item();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass USAddress
   * @generated
   */
  public USAddress createUSAddress() {
    return new USAddress();
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
    case SchemaprimerpoModelPackage.QUANTITYTYPE_CLASSIFIER_ID:
      return createQuantityTypeFromString(value);
    case SchemaprimerpoModelPackage.SKU_CLASSIFIER_ID:
      return createSKUFromString(value);
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
    case SchemaprimerpoModelPackage.QUANTITYTYPE_CLASSIFIER_ID:
      return convertQuantityTypeToString((BigInteger) value);
    case SchemaprimerpoModelPackage.SKU_CLASSIFIER_ID:
      return convertSKUToString((String) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: QuantityType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertQuantityTypeToString(BigInteger value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: QuantityType from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public BigInteger createQuantityTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return new BigInteger(value);
  }

  /**
   * Converts the EDataType: SKU to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertSKUToString(String value) {
    if (value == null) {
      return null;
    }
    return value;
  }

  /**
   * Creates an instance of the EDataType: SKU from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public String createSKUFromString(String value) {
    if (value == null) {
      return null;
    }
    return value;
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
      return SchemaprimerpoModelPackage.INSTANCE.getDocumentRootEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SchemaprimerpoModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SchemaprimerpoModelPackage.DOCUMENTROOT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SchemaprimerpoModelPackage.DOCUMENTROOT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SchemaprimerpoModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed();
      case SchemaprimerpoModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
        return getTarget().getXMLNSPrefixMap();
      case SchemaprimerpoModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
        return getTarget().getXSISchemaLocation();
      case SchemaprimerpoModelPackage.DOCUMENTROOT_COMMENT__FEATURE_ID:
        return getTarget().getComment_();
      case SchemaprimerpoModelPackage.DOCUMENTROOT_ORDER_FEATURE_ID:
        return getTarget().getOrder();
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
      case SchemaprimerpoModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        getTarget().setMixed((List<DocumentRootMixedFeatureGroup>) value);
        return;
      case SchemaprimerpoModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
        getTarget().setXMLNSPrefixMap((Map<String, String>) value);
        return;
      case SchemaprimerpoModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
        getTarget().setXSISchemaLocation((Map<String, String>) value);
        return;
      case SchemaprimerpoModelPackage.DOCUMENTROOT_COMMENT__FEATURE_ID:
        getTarget().setComment_((String) value);
        return;
      case SchemaprimerpoModelPackage.DOCUMENTROOT_ORDER_FEATURE_ID:
        getTarget().setOrder((PurchaseOrder) value);
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

      case SchemaprimerpoModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
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

      case SchemaprimerpoModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>PurchaseOrder</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PurchaseOrderModelObject<E extends PurchaseOrder> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SchemaprimerpoModelPackage.INSTANCE.getPurchaseOrderEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SchemaprimerpoModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SchemaprimerpoModelPackage.PURCHASEORDER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SchemaprimerpoModelPackage.PURCHASEORDER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SchemaprimerpoModelPackage.PURCHASEORDER_SHIPTO_FEATURE_ID:
        return getTarget().getShipTo();
      case SchemaprimerpoModelPackage.PURCHASEORDER_BILLTO_FEATURE_ID:
        return getTarget().getBillTo();
      case SchemaprimerpoModelPackage.PURCHASEORDER_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case SchemaprimerpoModelPackage.PURCHASEORDER_ITEMS_FEATURE_ID:
        return getTarget().getItems();
      case SchemaprimerpoModelPackage.PURCHASEORDER_ORDERDATE_FEATURE_ID:
        return getTarget().getOrderDate();
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
      case SchemaprimerpoModelPackage.PURCHASEORDER_SHIPTO_FEATURE_ID:
        getTarget().setShipTo((USAddress) value);
        return;
      case SchemaprimerpoModelPackage.PURCHASEORDER_BILLTO_FEATURE_ID:
        getTarget().setBillTo((USAddress) value);
        return;
      case SchemaprimerpoModelPackage.PURCHASEORDER_COMMENT_FEATURE_ID:
        getTarget().setComment((String) value);
        return;
      case SchemaprimerpoModelPackage.PURCHASEORDER_ITEMS_FEATURE_ID:
        getTarget().setItems((List<Item>) value);
        return;
      case SchemaprimerpoModelPackage.PURCHASEORDER_ORDERDATE_FEATURE_ID:
        getTarget().setOrderDate((Date) value);
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

      case SchemaprimerpoModelPackage.PURCHASEORDER_ITEMS_FEATURE_ID:
        return getTarget().addToItems((Item) value);

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

      case SchemaprimerpoModelPackage.PURCHASEORDER_ITEMS_FEATURE_ID:
        return getTarget().removeFromItems((Item) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Item</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ItemModelObject<E extends Item> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SchemaprimerpoModelPackage.INSTANCE.getItemEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SchemaprimerpoModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SchemaprimerpoModelPackage.ITEM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SchemaprimerpoModelPackage.ITEM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SchemaprimerpoModelPackage.ITEM_PRODUCTNAME_FEATURE_ID:
        return getTarget().getProductName();
      case SchemaprimerpoModelPackage.ITEM_QUANTITY_FEATURE_ID:
        return getTarget().getQuantity();
      case SchemaprimerpoModelPackage.ITEM_USPRICE_FEATURE_ID:
        return getTarget().getUSPrice();
      case SchemaprimerpoModelPackage.ITEM_COMMENT_FEATURE_ID:
        return getTarget().getComment();
      case SchemaprimerpoModelPackage.ITEM_SHIPDATE_FEATURE_ID:
        return getTarget().getShipDate();
      case SchemaprimerpoModelPackage.ITEM_PARTNUM_FEATURE_ID:
        return getTarget().getPartNum();
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
      case SchemaprimerpoModelPackage.ITEM_PRODUCTNAME_FEATURE_ID:
        getTarget().setProductName((String) value);
        return;
      case SchemaprimerpoModelPackage.ITEM_QUANTITY_FEATURE_ID:
        getTarget().setQuantity((BigInteger) value);
        return;
      case SchemaprimerpoModelPackage.ITEM_USPRICE_FEATURE_ID:
        getTarget().setUSPrice((BigDecimal) value);
        return;
      case SchemaprimerpoModelPackage.ITEM_COMMENT_FEATURE_ID:
        getTarget().setComment((String) value);
        return;
      case SchemaprimerpoModelPackage.ITEM_SHIPDATE_FEATURE_ID:
        getTarget().setShipDate((Date) value);
        return;
      case SchemaprimerpoModelPackage.ITEM_PARTNUM_FEATURE_ID:
        getTarget().setPartNum((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>USAddress</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class USAddressModelObject<E extends USAddress> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SchemaprimerpoModelPackage.INSTANCE.getUSAddressEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SchemaprimerpoModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SchemaprimerpoModelPackage.USADDRESS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SchemaprimerpoModelPackage.USADDRESS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SchemaprimerpoModelPackage.USADDRESS_NAME_FEATURE_ID:
        return getTarget().getName();
      case SchemaprimerpoModelPackage.USADDRESS_STREET_FEATURE_ID:
        return getTarget().getStreet();
      case SchemaprimerpoModelPackage.USADDRESS_CITY_FEATURE_ID:
        return getTarget().getCity();
      case SchemaprimerpoModelPackage.USADDRESS_STATE_FEATURE_ID:
        return getTarget().getState();
      case SchemaprimerpoModelPackage.USADDRESS_ZIP_FEATURE_ID:
        return getTarget().getZip();
      case SchemaprimerpoModelPackage.USADDRESS_COUNTRY_FEATURE_ID:
        return getTarget().getCountry();
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
      case SchemaprimerpoModelPackage.USADDRESS_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case SchemaprimerpoModelPackage.USADDRESS_STREET_FEATURE_ID:
        getTarget().setStreet((String) value);
        return;
      case SchemaprimerpoModelPackage.USADDRESS_CITY_FEATURE_ID:
        getTarget().setCity((String) value);
        return;
      case SchemaprimerpoModelPackage.USADDRESS_STATE_FEATURE_ID:
        getTarget().setState((String) value);
        return;
      case SchemaprimerpoModelPackage.USADDRESS_ZIP_FEATURE_ID:
        getTarget().setZip((BigDecimal) value);
        return;
      case SchemaprimerpoModelPackage.USADDRESS_COUNTRY_FEATURE_ID:
        getTarget().setCountry((String) value);
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
      case COMMENT_:
        return SchemaprimerpoModelPackage.INSTANCE.getDocumentRoot_Comment_();
      case ORDER:
        return SchemaprimerpoModelPackage.INSTANCE.getDocumentRoot_Order();
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

      final EClass eClass = SchemaprimerpoModelPackage.INSTANCE.getDocumentRootEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case SchemaprimerpoModelPackage.DOCUMENTROOT_COMMENT__FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.COMMENT_);
        return;
      case SchemaprimerpoModelPackage.DOCUMENTROOT_ORDER_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.ORDER);
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