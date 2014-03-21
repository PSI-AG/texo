package org.eclipse.emf.texo.test.model.samples.schemaprimerpo;

import java.math.BigInteger;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.samples.schemaprimerpo.dao.DocumentRootDao;
import org.eclipse.emf.texo.test.model.samples.schemaprimerpo.dao.ItemDao;
import org.eclipse.emf.texo.test.model.samples.schemaprimerpo.dao.PurchaseOrderDao;
import org.eclipse.emf.texo.test.model.samples.schemaprimerpo.dao.USAddressDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>schemaprimerpo</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SchemaprimerpoModelPackage extends ModelPackage {

  /**
   * Is set when the package has been initialized.
   * 
   * @generated
   */
  private static boolean isInitialized = false;

  /**
   * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/schemaprimerpo";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final SchemaprimerpoModelFactory MODELFACTORY = new SchemaprimerpoModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int QUANTITYTYPE_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SKU_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_MIXED_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_COMMENT__FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_ORDER_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_SHIPTO_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_BILLTO_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_COMMENT_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_ITEMS_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_ORDERDATE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_PRODUCTNAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_QUANTITY_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_USPRICE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_COMMENT_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_SHIPDATE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ITEM_PARTNUM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_STREET_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_CITY_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_STATE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_ZIP_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USADDRESS_COUNTRY_FEATURE_ID = 7;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final SchemaprimerpoModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static SchemaprimerpoModelPackage initialize() {

    if (isInitialized) {
      return (SchemaprimerpoModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final SchemaprimerpoModelPackage modelPackage = new SchemaprimerpoModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(DocumentRoot.class, modelPackage.getDocumentRootEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PurchaseOrder.class, modelPackage.getPurchaseOrderEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Item.class, modelPackage.getItemEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(USAddress.class, modelPackage.getUSAddressEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(DocumentRoot.class, DocumentRootDao.class);
    DaoRegistry.getInstance().registerDao(PurchaseOrder.class, PurchaseOrderDao.class);
    DaoRegistry.getInstance().registerDao(Item.class, ItemDao.class);
    DaoRegistry.getInstance().registerDao(USAddress.class, USAddressDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link SchemaprimerpoModelFactory} instance.
   * @generated
   */
  @Override
  public SchemaprimerpoModelFactory getModelFactory() {
    return MODELFACTORY;
  }

  /**
   * Returns the nsUri of the {@link EPackage} managed by this Package instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return the nsUri of the EPackage
   * @generated
   */
  @Override
  public String getNsURI() {
    return NS_URI;
  }

  /**
   * Returns the name of the ecore file containing the ecore model of the {@link EPackage} managed here. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the name of the ecore file
   * @generated
   */
  @Override
  public String getEcoreFileName() {
    return "schemaprimerpo.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>DocumentRoot</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DocumentRoot</b></em>'
   * @generated
   */
  public EClass getDocumentRootEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DOCUMENTROOT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.mixed</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.mixed</b></em>'.
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed() {
    return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_MIXED_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.xMLNSPrefixMap</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.xMLNSPrefixMap</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.xSISchemaLocation</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.xSISchemaLocation</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(
        DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.comment</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.comment</b></em>'.
   * @generated
   */
  public EAttribute getDocumentRoot_Comment_() {
    return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_COMMENT__FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.order</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.order</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_Order() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_ORDER_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PurchaseOrder</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PurchaseOrder</b></em>'
   * @generated
   */
  public EClass getPurchaseOrderEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PURCHASEORDER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PurchaseOrder.shipTo</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PurchaseOrder.shipTo</b></em>'.
   * @generated
   */
  public EReference getPurchaseOrder_ShipTo() {
    return (EReference) getPurchaseOrderEClass().getEAllStructuralFeatures().get(PURCHASEORDER_SHIPTO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PurchaseOrder.billTo</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PurchaseOrder.billTo</b></em>'.
   * @generated
   */
  public EReference getPurchaseOrder_BillTo() {
    return (EReference) getPurchaseOrderEClass().getEAllStructuralFeatures().get(PURCHASEORDER_BILLTO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PurchaseOrder.comment</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PurchaseOrder.comment</b></em>'.
   * @generated
   */
  public EAttribute getPurchaseOrder_Comment() {
    return (EAttribute) getPurchaseOrderEClass().getEAllStructuralFeatures().get(PURCHASEORDER_COMMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PurchaseOrder.items</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PurchaseOrder.items</b></em>'.
   * @generated
   */
  public EReference getPurchaseOrder_Items() {
    return (EReference) getPurchaseOrderEClass().getEAllStructuralFeatures().get(PURCHASEORDER_ITEMS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PurchaseOrder.orderDate</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PurchaseOrder.orderDate</b></em>'.
   * @generated
   */
  public EAttribute getPurchaseOrder_OrderDate() {
    return (EAttribute) getPurchaseOrderEClass().getEAllStructuralFeatures().get(PURCHASEORDER_ORDERDATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Item</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Item</b></em>'
   * @generated
   */
  public EClass getItemEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ITEM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Item.productName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Item.productName</b></em>'.
   * @generated
   */
  public EAttribute getItem_ProductName() {
    return (EAttribute) getItemEClass().getEAllStructuralFeatures().get(ITEM_PRODUCTNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Item.quantity</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Item.quantity</b></em>'.
   * @generated
   */
  public EAttribute getItem_Quantity() {
    return (EAttribute) getItemEClass().getEAllStructuralFeatures().get(ITEM_QUANTITY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Item.uSPrice</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Item.uSPrice</b></em>'.
   * @generated
   */
  public EAttribute getItem_USPrice() {
    return (EAttribute) getItemEClass().getEAllStructuralFeatures().get(ITEM_USPRICE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Item.comment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Item.comment</b></em>'.
   * @generated
   */
  public EAttribute getItem_Comment() {
    return (EAttribute) getItemEClass().getEAllStructuralFeatures().get(ITEM_COMMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Item.shipDate</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Item.shipDate</b></em>'.
   * @generated
   */
  public EAttribute getItem_ShipDate() {
    return (EAttribute) getItemEClass().getEAllStructuralFeatures().get(ITEM_SHIPDATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Item.partNum</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Item.partNum</b></em>'.
   * @generated
   */
  public EAttribute getItem_PartNum() {
    return (EAttribute) getItemEClass().getEAllStructuralFeatures().get(ITEM_PARTNUM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>USAddress</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>USAddress</b></em>'
   * @generated
   */
  public EClass getUSAddressEClass() {
    return (EClass) getEPackage().getEClassifiers().get(USADDRESS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>USAddress.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>USAddress.name</b></em>'.
   * @generated
   */
  public EAttribute getUSAddress_Name() {
    return (EAttribute) getUSAddressEClass().getEAllStructuralFeatures().get(USADDRESS_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>USAddress.street</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>USAddress.street</b></em>'.
   * @generated
   */
  public EAttribute getUSAddress_Street() {
    return (EAttribute) getUSAddressEClass().getEAllStructuralFeatures().get(USADDRESS_STREET_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>USAddress.city</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>USAddress.city</b></em>'.
   * @generated
   */
  public EAttribute getUSAddress_City() {
    return (EAttribute) getUSAddressEClass().getEAllStructuralFeatures().get(USADDRESS_CITY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>USAddress.state</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>USAddress.state</b></em>'.
   * @generated
   */
  public EAttribute getUSAddress_State() {
    return (EAttribute) getUSAddressEClass().getEAllStructuralFeatures().get(USADDRESS_STATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>USAddress.zip</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>USAddress.zip</b></em>'.
   * @generated
   */
  public EAttribute getUSAddress_Zip() {
    return (EAttribute) getUSAddressEClass().getEAllStructuralFeatures().get(USADDRESS_ZIP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>USAddress.country</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>USAddress.country</b></em>'.
   * @generated
   */
  public EAttribute getUSAddress_Country() {
    return (EAttribute) getUSAddressEClass().getEAllStructuralFeatures().get(USADDRESS_COUNTRY_FEATURE_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>QuantityType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>QuantityType</b></em>'
   * @generated
   */
  public EDataType getQuantityTypeEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(QUANTITYTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>SKU</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>SKU</b></em>'
   * @generated
   */
  public EDataType getSKUEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(SKU_CLASSIFIER_ID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClassifier
   *          the {@link EClassifier}
   * @return the class implementing a specific {@link EClass}.
   * @generated
   */
  @Override
  public Class<?> getEClassifierClass(EClassifier eClassifier) {
    switch (eClassifier.getClassifierID()) {
    case DOCUMENTROOT_CLASSIFIER_ID:
      return DocumentRoot.class;
    case PURCHASEORDER_CLASSIFIER_ID:
      return PurchaseOrder.class;
    case ITEM_CLASSIFIER_ID:
      return Item.class;
    case USADDRESS_CLASSIFIER_ID:
      return USAddress.class;
    case QUANTITYTYPE_CLASSIFIER_ID:
      return BigInteger.class;
    case SKU_CLASSIFIER_ID:
      return String.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
