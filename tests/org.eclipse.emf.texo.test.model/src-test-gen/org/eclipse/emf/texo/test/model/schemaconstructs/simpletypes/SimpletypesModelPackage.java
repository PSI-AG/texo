package org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes;

import java.math.BigDecimal;
import java.util.Date;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes.dao.SimpleListDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes.dao.SimpleTypeDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.simpletypes.dao.SimpleTypeObjectDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>simpletypes</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SimpletypesModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/schemaconstructs/simpletypes";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final SimpletypesModelFactory MODELFACTORY = new SimpletypesModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BYTE_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOUBLE_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FLOAT_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INT_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LONG_CLASSIFIER_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLEENUM_CLASSIFIER_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATE_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LIMITEDSTRING_CLASSIFIER_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INTARRAY_CLASSIFIER_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOUBLEARRAY_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRINGARRAY_CLASSIFIER_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BYTEARRAY_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LIMITEDDECIMAL_CLASSIFIER_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTRALIMITEDSTRING_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLEENUMOBJECT_CLASSIFIER_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOL_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_CODE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_BOO_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_BYT_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_DOUBL_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_FLOA_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_INTE_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_LONG__FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_SHOR_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_ENU_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_DAT_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_LIMITEDSTRING_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_STRI_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_INTARRAY_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_DOUBLEARRAY_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_STRINGARRAY_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLELIST_BYTEARRAY_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPE_CODE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPE_BOO_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPE_BYT_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPE_DOUBL_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPE_FLOAT__FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPE_INTE_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPE_LON_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPE_SHOR_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPE_ENU_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPE_DAT_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPE_LIMITEDSTRING_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPE_LIMITEDDECIMAL_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPE_EXTRALIMITEDSTRING_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPEOBJECT_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPEOBJECT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPEOBJECT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPEOBJECT_CODE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPEOBJECT_BOO_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPEOBJECT_BYT_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPEOBJECT_DOUBL_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPEOBJECT_FLOAT__FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPEOBJECT_INTE_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPEOBJECT_LON_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPEOBJECT_SHOR_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPEOBJECT_ENU_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLETYPEOBJECT_DAT_FEATURE_ID = 11;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final SimpletypesModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static SimpletypesModelPackage initialize() {

    if (isInitialized) {
      return (SimpletypesModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final SimpletypesModelPackage modelPackage = new SimpletypesModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(SimpleList.class, modelPackage.getSimpleListEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SimpleType.class, modelPackage.getSimpleTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SimpleTypeObject.class,
        modelPackage.getSimpleTypeObjectEClass(), modelPackage);

    ModelResolver.getInstance().registerClassModelMapping(SimpleEnum.class, modelPackage.getSimpleEnumEEnum(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(SimpleList.class, SimpleListDao.class);
    DaoRegistry.getInstance().registerDao(SimpleType.class, SimpleTypeDao.class);
    DaoRegistry.getInstance().registerDao(SimpleTypeObject.class, SimpleTypeObjectDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link SimpletypesModelFactory} instance.
   * @generated
   */
  @Override
  public SimpletypesModelFactory getModelFactory() {
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
    return "simpletypes.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>SimpleList</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SimpleList</b></em>'
   * @generated
   */
  public EClass getSimpleListEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SIMPLELIST_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleList.code</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleList.code</b></em>'.
   * @generated
   */
  public EAttribute getSimpleList_Code() {
    return (EAttribute) getSimpleListEClass().getEAllStructuralFeatures().get(SIMPLELIST_CODE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleList.boo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleList.boo</b></em>'.
   * @generated
   */
  public EAttribute getSimpleList_Boo() {
    return (EAttribute) getSimpleListEClass().getEAllStructuralFeatures().get(SIMPLELIST_BOO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleList.byt</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleList.byt</b></em>'.
   * @generated
   */
  public EAttribute getSimpleList_Byt() {
    return (EAttribute) getSimpleListEClass().getEAllStructuralFeatures().get(SIMPLELIST_BYT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleList.doubl</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleList.doubl</b></em>'.
   * @generated
   */
  public EAttribute getSimpleList_Doubl() {
    return (EAttribute) getSimpleListEClass().getEAllStructuralFeatures().get(SIMPLELIST_DOUBL_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleList.floa</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleList.floa</b></em>'.
   * @generated
   */
  public EAttribute getSimpleList_Floa() {
    return (EAttribute) getSimpleListEClass().getEAllStructuralFeatures().get(SIMPLELIST_FLOA_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleList.inte</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleList.inte</b></em>'.
   * @generated
   */
  public EAttribute getSimpleList_Inte() {
    return (EAttribute) getSimpleListEClass().getEAllStructuralFeatures().get(SIMPLELIST_INTE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleList.long</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleList.long</b></em>'.
   * @generated
   */
  public EAttribute getSimpleList_Long_() {
    return (EAttribute) getSimpleListEClass().getEAllStructuralFeatures().get(SIMPLELIST_LONG__FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleList.shor</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleList.shor</b></em>'.
   * @generated
   */
  public EAttribute getSimpleList_Shor() {
    return (EAttribute) getSimpleListEClass().getEAllStructuralFeatures().get(SIMPLELIST_SHOR_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleList.enu</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleList.enu</b></em>'.
   * @generated
   */
  public EAttribute getSimpleList_Enu() {
    return (EAttribute) getSimpleListEClass().getEAllStructuralFeatures().get(SIMPLELIST_ENU_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleList.dat</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleList.dat</b></em>'.
   * @generated
   */
  public EAttribute getSimpleList_Dat() {
    return (EAttribute) getSimpleListEClass().getEAllStructuralFeatures().get(SIMPLELIST_DAT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleList.limitedstring</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleList.limitedstring</b></em>'.
   * @generated
   */
  public EAttribute getSimpleList_Limitedstring() {
    return (EAttribute) getSimpleListEClass().getEAllStructuralFeatures().get(SIMPLELIST_LIMITEDSTRING_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleList.stri</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleList.stri</b></em>'.
   * @generated
   */
  public EAttribute getSimpleList_Stri() {
    return (EAttribute) getSimpleListEClass().getEAllStructuralFeatures().get(SIMPLELIST_STRI_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleList.intArray</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleList.intArray</b></em>'.
   * @generated
   */
  public EAttribute getSimpleList_IntArray() {
    return (EAttribute) getSimpleListEClass().getEAllStructuralFeatures().get(SIMPLELIST_INTARRAY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleList.doubleArray</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleList.doubleArray</b></em>'.
   * @generated
   */
  public EAttribute getSimpleList_DoubleArray() {
    return (EAttribute) getSimpleListEClass().getEAllStructuralFeatures().get(SIMPLELIST_DOUBLEARRAY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleList.stringArray</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleList.stringArray</b></em>'.
   * @generated
   */
  public EAttribute getSimpleList_StringArray() {
    return (EAttribute) getSimpleListEClass().getEAllStructuralFeatures().get(SIMPLELIST_STRINGARRAY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleList.byteArray</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleList.byteArray</b></em>'.
   * @generated
   */
  public EAttribute getSimpleList_ByteArray() {
    return (EAttribute) getSimpleListEClass().getEAllStructuralFeatures().get(SIMPLELIST_BYTEARRAY_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SimpleType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SimpleType</b></em>'
   * @generated
   */
  public EClass getSimpleTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SIMPLETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleType.code</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleType.code</b></em>'.
   * @generated
   */
  public EAttribute getSimpleType_Code() {
    return (EAttribute) getSimpleTypeEClass().getEAllStructuralFeatures().get(SIMPLETYPE_CODE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleType.boo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleType.boo</b></em>'.
   * @generated
   */
  public EAttribute getSimpleType_Boo() {
    return (EAttribute) getSimpleTypeEClass().getEAllStructuralFeatures().get(SIMPLETYPE_BOO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleType.byt</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleType.byt</b></em>'.
   * @generated
   */
  public EAttribute getSimpleType_Byt() {
    return (EAttribute) getSimpleTypeEClass().getEAllStructuralFeatures().get(SIMPLETYPE_BYT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleType.doubl</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleType.doubl</b></em>'.
   * @generated
   */
  public EAttribute getSimpleType_Doubl() {
    return (EAttribute) getSimpleTypeEClass().getEAllStructuralFeatures().get(SIMPLETYPE_DOUBL_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleType.float</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleType.float</b></em>'.
   * @generated
   */
  public EAttribute getSimpleType_Float_() {
    return (EAttribute) getSimpleTypeEClass().getEAllStructuralFeatures().get(SIMPLETYPE_FLOAT__FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleType.inte</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleType.inte</b></em>'.
   * @generated
   */
  public EAttribute getSimpleType_Inte() {
    return (EAttribute) getSimpleTypeEClass().getEAllStructuralFeatures().get(SIMPLETYPE_INTE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleType.lon</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleType.lon</b></em>'.
   * @generated
   */
  public EAttribute getSimpleType_Lon() {
    return (EAttribute) getSimpleTypeEClass().getEAllStructuralFeatures().get(SIMPLETYPE_LON_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleType.shor</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleType.shor</b></em>'.
   * @generated
   */
  public EAttribute getSimpleType_Shor() {
    return (EAttribute) getSimpleTypeEClass().getEAllStructuralFeatures().get(SIMPLETYPE_SHOR_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleType.enu</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleType.enu</b></em>'.
   * @generated
   */
  public EAttribute getSimpleType_Enu() {
    return (EAttribute) getSimpleTypeEClass().getEAllStructuralFeatures().get(SIMPLETYPE_ENU_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleType.dat</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleType.dat</b></em>'.
   * @generated
   */
  public EAttribute getSimpleType_Dat() {
    return (EAttribute) getSimpleTypeEClass().getEAllStructuralFeatures().get(SIMPLETYPE_DAT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleType.limitedstring</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleType.limitedstring</b></em>'.
   * @generated
   */
  public EAttribute getSimpleType_Limitedstring() {
    return (EAttribute) getSimpleTypeEClass().getEAllStructuralFeatures().get(SIMPLETYPE_LIMITEDSTRING_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleType.limitedDecimal</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleType.limitedDecimal</b></em>'.
   * @generated
   */
  public EAttribute getSimpleType_LimitedDecimal() {
    return (EAttribute) getSimpleTypeEClass().getEAllStructuralFeatures().get(SIMPLETYPE_LIMITEDDECIMAL_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleType.extraLimitedString</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleType.extraLimitedString</b></em>'.
   * @generated
   */
  public EAttribute getSimpleType_ExtraLimitedString() {
    return (EAttribute) getSimpleTypeEClass().getEAllStructuralFeatures().get(SIMPLETYPE_EXTRALIMITEDSTRING_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SimpleTypeObject</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SimpleTypeObject</b></em>'
   * @generated
   */
  public EClass getSimpleTypeObjectEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SIMPLETYPEOBJECT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleTypeObject.code</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleTypeObject.code</b></em>'.
   * @generated
   */
  public EAttribute getSimpleTypeObject_Code() {
    return (EAttribute) getSimpleTypeObjectEClass().getEAllStructuralFeatures().get(SIMPLETYPEOBJECT_CODE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleTypeObject.boo</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleTypeObject.boo</b></em>'.
   * @generated
   */
  public EAttribute getSimpleTypeObject_Boo() {
    return (EAttribute) getSimpleTypeObjectEClass().getEAllStructuralFeatures().get(SIMPLETYPEOBJECT_BOO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleTypeObject.byt</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleTypeObject.byt</b></em>'.
   * @generated
   */
  public EAttribute getSimpleTypeObject_Byt() {
    return (EAttribute) getSimpleTypeObjectEClass().getEAllStructuralFeatures().get(SIMPLETYPEOBJECT_BYT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleTypeObject.doubl</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleTypeObject.doubl</b></em>'.
   * @generated
   */
  public EAttribute getSimpleTypeObject_Doubl() {
    return (EAttribute) getSimpleTypeObjectEClass().getEAllStructuralFeatures().get(SIMPLETYPEOBJECT_DOUBL_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleTypeObject.float</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleTypeObject.float</b></em>'.
   * @generated
   */
  public EAttribute getSimpleTypeObject_Float_() {
    return (EAttribute) getSimpleTypeObjectEClass().getEAllStructuralFeatures().get(SIMPLETYPEOBJECT_FLOAT__FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleTypeObject.inte</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleTypeObject.inte</b></em>'.
   * @generated
   */
  public EAttribute getSimpleTypeObject_Inte() {
    return (EAttribute) getSimpleTypeObjectEClass().getEAllStructuralFeatures().get(SIMPLETYPEOBJECT_INTE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleTypeObject.lon</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleTypeObject.lon</b></em>'.
   * @generated
   */
  public EAttribute getSimpleTypeObject_Lon() {
    return (EAttribute) getSimpleTypeObjectEClass().getEAllStructuralFeatures().get(SIMPLETYPEOBJECT_LON_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleTypeObject.shor</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleTypeObject.shor</b></em>'.
   * @generated
   */
  public EAttribute getSimpleTypeObject_Shor() {
    return (EAttribute) getSimpleTypeObjectEClass().getEAllStructuralFeatures().get(SIMPLETYPEOBJECT_SHOR_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleTypeObject.enu</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleTypeObject.enu</b></em>'.
   * @generated
   */
  public EAttribute getSimpleTypeObject_Enu() {
    return (EAttribute) getSimpleTypeObjectEClass().getEAllStructuralFeatures().get(SIMPLETYPEOBJECT_ENU_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleTypeObject.dat</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleTypeObject.dat</b></em>'.
   * @generated
   */
  public EAttribute getSimpleTypeObject_Dat() {
    return (EAttribute) getSimpleTypeObjectEClass().getEAllStructuralFeatures().get(SIMPLETYPEOBJECT_DAT_FEATURE_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>Byte</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>Byte</b></em>'
   * @generated
   */
  public EDataType getByteEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(BYTE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>Double</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>Double</b></em>'
   * @generated
   */
  public EDataType getDoubleEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(DOUBLE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>Float</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>Float</b></em>'
   * @generated
   */
  public EDataType getFloatEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(FLOAT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>Int</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>Int</b></em>'
   * @generated
   */
  public EDataType getIntEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(INT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>Long</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>Long</b></em>'
   * @generated
   */
  public EDataType getLongEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(LONG_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>SimpleEnum</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>SimpleEnum</b></em>'
   * @generated
   */
  public EEnum getSimpleEnumEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(SIMPLEENUM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>Date</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>Date</b></em>'
   * @generated
   */
  public EDataType getDateEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(DATE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>LimitedString</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>LimitedString</b></em>'
   * @generated
   */
  public EDataType getLimitedStringEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(LIMITEDSTRING_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>IntArray</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>IntArray</b></em>'
   * @generated
   */
  public EDataType getIntArrayEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(INTARRAY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>DoubleArray</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>DoubleArray</b></em>'
   * @generated
   */
  public EDataType getDoubleArrayEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(DOUBLEARRAY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>StringArray</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>StringArray</b></em>'
   * @generated
   */
  public EDataType getStringArrayEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(STRINGARRAY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>ByteArray</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>ByteArray</b></em>'
   * @generated
   */
  public EDataType getByteArrayEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(BYTEARRAY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>LimitedDecimal</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>LimitedDecimal</b></em>'
   * @generated
   */
  public EDataType getLimitedDecimalEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(LIMITEDDECIMAL_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>ExtraLimitedString</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>ExtraLimitedString</b></em>'
   * @generated
   */
  public EDataType getExtraLimitedStringEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(EXTRALIMITEDSTRING_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>SimpleEnumObject</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>SimpleEnumObject</b></em>'
   * @generated
   */
  public EDataType getSimpleEnumObjectEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(SIMPLEENUMOBJECT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>Bool</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>Bool</b></em>'
   * @generated
   */
  public EDataType getBoolEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(BOOL_CLASSIFIER_ID);
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
    case SIMPLELIST_CLASSIFIER_ID:
      return SimpleList.class;
    case SIMPLETYPE_CLASSIFIER_ID:
      return SimpleType.class;
    case SIMPLETYPEOBJECT_CLASSIFIER_ID:
      return SimpleTypeObject.class;
    case BYTE_CLASSIFIER_ID:
      return Byte.class;
    case DOUBLE_CLASSIFIER_ID:
      return Double.class;
    case FLOAT_CLASSIFIER_ID:
      return Float.class;
    case INT_CLASSIFIER_ID:
      return Integer.class;
    case LONG_CLASSIFIER_ID:
      return Long.class;
    case SIMPLEENUM_CLASSIFIER_ID:
      return SimpleEnum.class;
    case DATE_CLASSIFIER_ID:
      return Date.class;
    case LIMITEDSTRING_CLASSIFIER_ID:
      return String.class;
    case INTARRAY_CLASSIFIER_ID:
      return int[].class;
    case DOUBLEARRAY_CLASSIFIER_ID:
      return double[].class;
    case STRINGARRAY_CLASSIFIER_ID:
      return String[].class;
    case BYTEARRAY_CLASSIFIER_ID:
      return byte[].class;
    case LIMITEDDECIMAL_CLASSIFIER_ID:
      return BigDecimal.class;
    case EXTRALIMITEDSTRING_CLASSIFIER_ID:
      return String.class;
    case SIMPLEENUMOBJECT_CLASSIFIER_ID:
      return SimpleEnum.class;
    case BOOL_CLASSIFIER_ID:
      return Boolean.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
