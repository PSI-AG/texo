package org.eclipse.emf.texo.test.model.schemaconstructs.groupall;

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
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.dao.AddressGroupTypeDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.dao.AddressListDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.dao.AddressTypeDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.dao.DocumentRootDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.dao.SimpleAllMapTypeDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.groupall.dao.SimpleAllTypeDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>groupall</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class GroupallModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/schemaconstructs/groupall";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final GroupallModelFactory MODELFACTORY = new GroupallModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSGROUPTYPE_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSGROUPTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSGROUPTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSGROUPTYPE_GROUPNAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSGROUPTYPE_SHIPTO_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSGROUPTYPE_BILLTO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSGROUPTYPE_SIMPLEADDRESS_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSTYPE_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSTYPE_GROUP_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSTYPE_NAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSTYPE_LONGNAME_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSLIST_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSLIST_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSLIST_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSLIST_GROUPNAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSLIST_ADDRS_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSLIST_SHIPTO_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSLIST_BILLTO_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_CLASSIFIER_ID = 3;

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
  public static final int DOCUMENTROOT_ADDRESS_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_ADDRESSGROUP_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_SIMPLEALL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_SIMPLEALLMAP_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLEALLTYPE_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLEALLTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLEALLTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLEALLTYPE_AAA_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLEALLTYPE_BBB_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLEALLTYPE_CCC_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLEALLMAPTYPE_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLEALLMAPTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLEALLMAPTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLEALLMAPTYPE_ALLMAP_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLEALLMAPTYPE_AAA_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLEALLMAPTYPE_BBB_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLEALLMAPTYPE_CCC_FEATURE_ID = 5;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final GroupallModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static GroupallModelPackage initialize() {

    if (isInitialized) {
      return (GroupallModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final GroupallModelPackage modelPackage = new GroupallModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(AddressGroupType.class,
        modelPackage.getAddressGroupTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AddressType.class, modelPackage.getAddressTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AddressList.class, modelPackage.getAddressListEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DocumentRoot.class, modelPackage.getDocumentRootEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SimpleAllType.class, modelPackage.getSimpleAllTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SimpleAllMapType.class,
        modelPackage.getSimpleAllMapTypeEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(AddressGroupType.class, AddressGroupTypeDao.class);
    DaoRegistry.getInstance().registerDao(AddressType.class, AddressTypeDao.class);
    DaoRegistry.getInstance().registerDao(AddressList.class, AddressListDao.class);
    DaoRegistry.getInstance().registerDao(DocumentRoot.class, DocumentRootDao.class);
    DaoRegistry.getInstance().registerDao(SimpleAllType.class, SimpleAllTypeDao.class);
    DaoRegistry.getInstance().registerDao(SimpleAllMapType.class, SimpleAllMapTypeDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link GroupallModelFactory} instance.
   * @generated
   */
  @Override
  public GroupallModelFactory getModelFactory() {
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
    return "groupall.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>AddressGroupType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AddressGroupType</b></em>'
   * @generated
   */
  public EClass getAddressGroupTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ADDRESSGROUPTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AddressGroupType.groupName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AddressGroupType.groupName</b></em>'.
   * @generated
   */
  public EAttribute getAddressGroupType_GroupName() {
    return (EAttribute) getAddressGroupTypeEClass().getEAllStructuralFeatures().get(
        ADDRESSGROUPTYPE_GROUPNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AddressGroupType.shipTo</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AddressGroupType.shipTo</b></em>'.
   * @generated
   */
  public EReference getAddressGroupType_ShipTo() {
    return (EReference) getAddressGroupTypeEClass().getEAllStructuralFeatures().get(ADDRESSGROUPTYPE_SHIPTO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AddressGroupType.billTo</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AddressGroupType.billTo</b></em>'.
   * @generated
   */
  public EReference getAddressGroupType_BillTo() {
    return (EReference) getAddressGroupTypeEClass().getEAllStructuralFeatures().get(ADDRESSGROUPTYPE_BILLTO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AddressGroupType.simpleAddress</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AddressGroupType.simpleAddress</b></em>'.
   * @generated
   */
  public EAttribute getAddressGroupType_SimpleAddress() {
    return (EAttribute) getAddressGroupTypeEClass().getEAllStructuralFeatures().get(
        ADDRESSGROUPTYPE_SIMPLEADDRESS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AddressType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AddressType</b></em>'
   * @generated
   */
  public EClass getAddressTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ADDRESSTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AddressType.group</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AddressType.group</b></em>'.
   * @generated
   */
  public EAttribute getAddressType_Group() {
    return (EAttribute) getAddressTypeEClass().getEAllStructuralFeatures().get(ADDRESSTYPE_GROUP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AddressType.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AddressType.name</b></em>'.
   * @generated
   */
  public EAttribute getAddressType_Name() {
    return (EAttribute) getAddressTypeEClass().getEAllStructuralFeatures().get(ADDRESSTYPE_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AddressType.longName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AddressType.longName</b></em>'.
   * @generated
   */
  public EAttribute getAddressType_LongName() {
    return (EAttribute) getAddressTypeEClass().getEAllStructuralFeatures().get(ADDRESSTYPE_LONGNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AddressList</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AddressList</b></em>'
   * @generated
   */
  public EClass getAddressListEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ADDRESSLIST_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AddressList.groupName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AddressList.groupName</b></em>'.
   * @generated
   */
  public EAttribute getAddressList_GroupName() {
    return (EAttribute) getAddressListEClass().getEAllStructuralFeatures().get(ADDRESSLIST_GROUPNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AddressList.addrs</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AddressList.addrs</b></em>'.
   * @generated
   */
  public EAttribute getAddressList_Addrs() {
    return (EAttribute) getAddressListEClass().getEAllStructuralFeatures().get(ADDRESSLIST_ADDRS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AddressList.shipTo</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AddressList.shipTo</b></em>'.
   * @generated
   */
  public EReference getAddressList_ShipTo() {
    return (EReference) getAddressListEClass().getEAllStructuralFeatures().get(ADDRESSLIST_SHIPTO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AddressList.billTo</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AddressList.billTo</b></em>'.
   * @generated
   */
  public EReference getAddressList_BillTo() {
    return (EReference) getAddressListEClass().getEAllStructuralFeatures().get(ADDRESSLIST_BILLTO_FEATURE_ID);
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
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.address</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.address</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_Address() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_ADDRESS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.addressGroup</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.addressGroup</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_AddressGroup() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_ADDRESSGROUP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.simpleAll</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.simpleAll</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_SimpleAll() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_SIMPLEALL_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.simpleAllMap</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.simpleAllMap</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_SimpleAllMap() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_SIMPLEALLMAP_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SimpleAllType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SimpleAllType</b></em>'
   * @generated
   */
  public EClass getSimpleAllTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SIMPLEALLTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleAllType.aaa</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleAllType.aaa</b></em>'.
   * @generated
   */
  public EAttribute getSimpleAllType_Aaa() {
    return (EAttribute) getSimpleAllTypeEClass().getEAllStructuralFeatures().get(SIMPLEALLTYPE_AAA_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleAllType.bbb</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleAllType.bbb</b></em>'.
   * @generated
   */
  public EAttribute getSimpleAllType_Bbb() {
    return (EAttribute) getSimpleAllTypeEClass().getEAllStructuralFeatures().get(SIMPLEALLTYPE_BBB_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleAllType.ccc</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleAllType.ccc</b></em>'.
   * @generated
   */
  public EAttribute getSimpleAllType_Ccc() {
    return (EAttribute) getSimpleAllTypeEClass().getEAllStructuralFeatures().get(SIMPLEALLTYPE_CCC_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SimpleAllMapType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SimpleAllMapType</b></em>'
   * @generated
   */
  public EClass getSimpleAllMapTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SIMPLEALLMAPTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleAllMapType.allMap</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleAllMapType.allMap</b></em>'.
   * @generated
   */
  public EAttribute getSimpleAllMapType_AllMap() {
    return (EAttribute) getSimpleAllMapTypeEClass().getEAllStructuralFeatures().get(SIMPLEALLMAPTYPE_ALLMAP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleAllMapType.aaa</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleAllMapType.aaa</b></em>'.
   * @generated
   */
  public EAttribute getSimpleAllMapType_Aaa() {
    return (EAttribute) getSimpleAllMapTypeEClass().getEAllStructuralFeatures().get(SIMPLEALLMAPTYPE_AAA_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleAllMapType.bbb</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleAllMapType.bbb</b></em>'.
   * @generated
   */
  public EAttribute getSimpleAllMapType_Bbb() {
    return (EAttribute) getSimpleAllMapTypeEClass().getEAllStructuralFeatures().get(SIMPLEALLMAPTYPE_BBB_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleAllMapType.ccc</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleAllMapType.ccc</b></em>'.
   * @generated
   */
  public EAttribute getSimpleAllMapType_Ccc() {
    return (EAttribute) getSimpleAllMapTypeEClass().getEAllStructuralFeatures().get(SIMPLEALLMAPTYPE_CCC_FEATURE_ID);
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
    case ADDRESSGROUPTYPE_CLASSIFIER_ID:
      return AddressGroupType.class;
    case ADDRESSTYPE_CLASSIFIER_ID:
      return AddressType.class;
    case ADDRESSLIST_CLASSIFIER_ID:
      return AddressList.class;
    case DOCUMENTROOT_CLASSIFIER_ID:
      return DocumentRoot.class;
    case SIMPLEALLTYPE_CLASSIFIER_ID:
      return SimpleAllType.class;
    case SIMPLEALLMAPTYPE_CLASSIFIER_ID:
      return SimpleAllMapType.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
