package org.eclipse.emf.texo.test.model.samples.catalog;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.samples.catalog.dao.CatalogTypeDao;
import org.eclipse.emf.texo.test.model.samples.catalog.dao.PriceTypeDao;
import org.eclipse.emf.texo.test.model.samples.catalog.dao.ProductTypeDao;
import org.eclipse.emf.texo.test.model.samples.catalog.dao.StringTypeDao;
import org.eclipse.emf.texo.test.model.samples.catalog.dao.SupplierTypeDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>catalog</b></em>'. It contains initialization code and access to the Factory
 * to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CatalogModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/catalog";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final CatalogModelFactory MODELFACTORY = new CatalogModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOGTYPE_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOGTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOGTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOGTYPE_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOGTYPE_DESCRIPTION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOGTYPE_SUBCATALOG_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOGTYPE_PRODUCT_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCTTYPE_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCTTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCTTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCTTYPE_CODE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCTTYPE_DESCRIPTION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCTTYPE_REMARK_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCTTYPE_PRICE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICETYPE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICETYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICETYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICETYPE_PRICE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICETYPE_QUANTITYTO_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICETYPE_SUPPLIER_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIERTYPE_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIERTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIERTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIERTYPE_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIERTYPE_NOOFEMPLOYEES_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRINGTYPE_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRINGTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRINGTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRINGTYPE_VALUE_FEATURE_ID = 2;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final CatalogModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static CatalogModelPackage initialize() {

    if (isInitialized) {
      return (CatalogModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final CatalogModelPackage modelPackage = new CatalogModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(CatalogType.class, modelPackage.getCatalogTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ProductType.class, modelPackage.getProductTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PriceType.class, modelPackage.getPriceTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SupplierType.class, modelPackage.getSupplierTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(StringType.class, modelPackage.getStringTypeEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(CatalogType.class, CatalogTypeDao.class);
    DaoRegistry.getInstance().registerDao(ProductType.class, ProductTypeDao.class);
    DaoRegistry.getInstance().registerDao(PriceType.class, PriceTypeDao.class);
    DaoRegistry.getInstance().registerDao(SupplierType.class, SupplierTypeDao.class);
    DaoRegistry.getInstance().registerDao(StringType.class, StringTypeDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link CatalogModelFactory} instance.
   * @generated
   */
  @Override
  public CatalogModelFactory getModelFactory() {
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
    return "catalog.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>CatalogType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CatalogType</b></em>'
   * @generated
   */
  public EClass getCatalogTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CATALOGTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CatalogType.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CatalogType.name</b></em>'.
   * @generated
   */
  public EAttribute getCatalogType_Name() {
    return (EAttribute) getCatalogTypeEClass().getEAllStructuralFeatures().get(CATALOGTYPE_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CatalogType.description</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CatalogType.description</b></em>'.
   * @generated
   */
  public EAttribute getCatalogType_Description() {
    return (EAttribute) getCatalogTypeEClass().getEAllStructuralFeatures().get(CATALOGTYPE_DESCRIPTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CatalogType.subCatalog</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CatalogType.subCatalog</b></em>'.
   * @generated
   */
  public EReference getCatalogType_SubCatalog() {
    return (EReference) getCatalogTypeEClass().getEAllStructuralFeatures().get(CATALOGTYPE_SUBCATALOG_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CatalogType.product</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CatalogType.product</b></em>'.
   * @generated
   */
  public EReference getCatalogType_Product() {
    return (EReference) getCatalogTypeEClass().getEAllStructuralFeatures().get(CATALOGTYPE_PRODUCT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ProductType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ProductType</b></em>'
   * @generated
   */
  public EClass getProductTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PRODUCTTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ProductType.code</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ProductType.code</b></em>'.
   * @generated
   */
  public EAttribute getProductType_Code() {
    return (EAttribute) getProductTypeEClass().getEAllStructuralFeatures().get(PRODUCTTYPE_CODE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ProductType.description</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ProductType.description</b></em>'.
   * @generated
   */
  public EAttribute getProductType_Description() {
    return (EAttribute) getProductTypeEClass().getEAllStructuralFeatures().get(PRODUCTTYPE_DESCRIPTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ProductType.remark</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ProductType.remark</b></em>'.
   * @generated
   */
  public EReference getProductType_Remark() {
    return (EReference) getProductTypeEClass().getEAllStructuralFeatures().get(PRODUCTTYPE_REMARK_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ProductType.price</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ProductType.price</b></em>'.
   * @generated
   */
  public EReference getProductType_Price() {
    return (EReference) getProductTypeEClass().getEAllStructuralFeatures().get(PRODUCTTYPE_PRICE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PriceType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PriceType</b></em>'
   * @generated
   */
  public EClass getPriceTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PRICETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PriceType.price</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PriceType.price</b></em>'.
   * @generated
   */
  public EAttribute getPriceType_Price() {
    return (EAttribute) getPriceTypeEClass().getEAllStructuralFeatures().get(PRICETYPE_PRICE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PriceType.quantityTo</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PriceType.quantityTo</b></em>'.
   * @generated
   */
  public EAttribute getPriceType_QuantityTo() {
    return (EAttribute) getPriceTypeEClass().getEAllStructuralFeatures().get(PRICETYPE_QUANTITYTO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PriceType.supplier</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PriceType.supplier</b></em>'.
   * @generated
   */
  public EReference getPriceType_Supplier() {
    return (EReference) getPriceTypeEClass().getEAllStructuralFeatures().get(PRICETYPE_SUPPLIER_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SupplierType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SupplierType</b></em>'
   * @generated
   */
  public EClass getSupplierTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SUPPLIERTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SupplierType.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SupplierType.name</b></em>'.
   * @generated
   */
  public EAttribute getSupplierType_Name() {
    return (EAttribute) getSupplierTypeEClass().getEAllStructuralFeatures().get(SUPPLIERTYPE_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SupplierType.noOfEmployees</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SupplierType.noOfEmployees</b></em>'.
   * @generated
   */
  public EAttribute getSupplierType_NoOfEmployees() {
    return (EAttribute) getSupplierTypeEClass().getEAllStructuralFeatures().get(SUPPLIERTYPE_NOOFEMPLOYEES_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>StringType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>StringType</b></em>'
   * @generated
   */
  public EClass getStringTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(STRINGTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>StringType.value</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>StringType.value</b></em>'.
   * @generated
   */
  public EAttribute getStringType_Value() {
    return (EAttribute) getStringTypeEClass().getEAllStructuralFeatures().get(STRINGTYPE_VALUE_FEATURE_ID);
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
    case CATALOGTYPE_CLASSIFIER_ID:
      return CatalogType.class;
    case PRODUCTTYPE_CLASSIFIER_ID:
      return ProductType.class;
    case PRICETYPE_CLASSIFIER_ID:
      return PriceType.class;
    case SUPPLIERTYPE_CLASSIFIER_ID:
      return SupplierType.class;
    case STRINGTYPE_CLASSIFIER_ID:
      return StringType.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
