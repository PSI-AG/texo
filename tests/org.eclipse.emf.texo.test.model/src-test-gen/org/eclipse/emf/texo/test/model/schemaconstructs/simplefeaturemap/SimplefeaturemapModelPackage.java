package org.eclipse.emf.texo.test.model.schemaconstructs.simplefeaturemap;

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
import org.eclipse.emf.texo.test.model.schemaconstructs.simplefeaturemap.dao.PurchaseOrderDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.simplefeaturemap.dao.SupplierDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>simplefeaturemap</b></em>'. It contains initialization code and access to
 * the Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SimplefeaturemapModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/schemaconstructs/simplefeaturemap";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final SimplefeaturemapModelFactory MODELFACTORY = new SimplefeaturemapModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PURCHASEORDER_CLASSIFIER_ID = 0;

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
  public static final int PURCHASEORDER_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_ORDERS_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_PREFERREDORDERS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_STANDARDORDERS_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_HARDCOPYORDERREFERENCE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SUPPLIER_HARDCOPYORDERNUMBER_FEATURE_ID = 7;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final SimplefeaturemapModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static SimplefeaturemapModelPackage initialize() {

    if (isInitialized) {
      return (SimplefeaturemapModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final SimplefeaturemapModelPackage modelPackage = new SimplefeaturemapModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(PurchaseOrder.class, modelPackage.getPurchaseOrderEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Supplier.class, modelPackage.getSupplierEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(PurchaseOrder.class, PurchaseOrderDao.class);
    DaoRegistry.getInstance().registerDao(Supplier.class, SupplierDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link SimplefeaturemapModelFactory} instance.
   * @generated
   */
  @Override
  public SimplefeaturemapModelFactory getModelFactory() {
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
    return "simplefeaturemap.ecore";
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
   * Returns the {@link EStructuralFeature} '<em><b>PurchaseOrder.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PurchaseOrder.name</b></em>'.
   * @generated
   */
  public EAttribute getPurchaseOrder_Name() {
    return (EAttribute) getPurchaseOrderEClass().getEAllStructuralFeatures().get(PURCHASEORDER_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Supplier</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Supplier</b></em>'
   * @generated
   */
  public EClass getSupplierEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SUPPLIER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Supplier.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Supplier.name</b></em>'.
   * @generated
   */
  public EAttribute getSupplier_Name() {
    return (EAttribute) getSupplierEClass().getEAllStructuralFeatures().get(SUPPLIER_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Supplier.orders</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Supplier.orders</b></em>'.
   * @generated
   */
  public EAttribute getSupplier_Orders() {
    return (EAttribute) getSupplierEClass().getEAllStructuralFeatures().get(SUPPLIER_ORDERS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Supplier.preferredOrders</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Supplier.preferredOrders</b></em>'.
   * @generated
   */
  public EReference getSupplier_PreferredOrders() {
    return (EReference) getSupplierEClass().getEAllStructuralFeatures().get(SUPPLIER_PREFERREDORDERS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Supplier.standardOrders</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Supplier.standardOrders</b></em>'.
   * @generated
   */
  public EReference getSupplier_StandardOrders() {
    return (EReference) getSupplierEClass().getEAllStructuralFeatures().get(SUPPLIER_STANDARDORDERS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Supplier.hardCopyOrderReference</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Supplier.hardCopyOrderReference</b></em>'.
   * @generated
   */
  public EAttribute getSupplier_HardCopyOrderReference() {
    return (EAttribute) getSupplierEClass().getEAllStructuralFeatures().get(SUPPLIER_HARDCOPYORDERREFERENCE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Supplier.hardCopyOrderNumber</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Supplier.hardCopyOrderNumber</b></em>'.
   * @generated
   */
  public EAttribute getSupplier_HardCopyOrderNumber() {
    return (EAttribute) getSupplierEClass().getEAllStructuralFeatures().get(SUPPLIER_HARDCOPYORDERNUMBER_FEATURE_ID);
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
    case PURCHASEORDER_CLASSIFIER_ID:
      return PurchaseOrder.class;
    case SUPPLIER_CLASSIFIER_ID:
      return Supplier.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
