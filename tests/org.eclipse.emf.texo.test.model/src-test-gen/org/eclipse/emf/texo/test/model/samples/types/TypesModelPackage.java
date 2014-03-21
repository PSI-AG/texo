package org.eclipse.emf.texo.test.model.samples.types;

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
import org.eclipse.emf.texo.test.model.samples.types.dao.ManyTypesDao;
import org.eclipse.emf.texo.test.model.samples.types.dao.SingleTypesDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>types</b></em>'. It contains initialization code and access to the Factory
 * to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TypesModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/types";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final TypesModelFactory MODELFACTORY = new TypesModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTENUM_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRINGARRAY_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LONGARRAY_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTNEXTENUM_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANYTYPES_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANYTYPES_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANYTYPES_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANYTYPES_STRING_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANYTYPES_INTEGEROBJECT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANYTYPES_LONG__FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANYTYPES_DOUBLEOBJECT_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANYTYPES_FLOATOBJECT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANYTYPES_CLAZZ_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANYTYPES_CHAROBJECT_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANYTYPES_BYTEOBJECT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANYTYPES_BYTEARRAY_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANYTYPES_BIGDECIMAL_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANYTYPES_BIGINTEGER_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANYTYPES_ENUM__FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANYTYPES_DATE_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_STRING_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_INTEGER_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_INTEGEROBJECT_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_LONG__FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_LONGOBJECT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_DOUBLE__FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_DOUBLEOBJECT_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_FLOAT__FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_FLOATOBJECT_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_CLAZZ_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_CHAR__FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_CHAROBJECT_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_BYTE__FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_BYTEOBJECT_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_BYTEARRAY_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_BIGDECIMAL_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_BIGINTEGER_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_ENUM__FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_DATE_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_STRINGARRAY_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_LONGARRAY_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SINGLETYPES_NEXTENUM_FEATURE_ID = 23;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final TypesModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static TypesModelPackage initialize() {

    if (isInitialized) {
      return (TypesModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final TypesModelPackage modelPackage = new TypesModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(ManyTypes.class, modelPackage.getManyTypesEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SingleTypes.class, modelPackage.getSingleTypesEClass(),
        modelPackage);

    ModelResolver.getInstance()
        .registerClassModelMapping(TestEnum.class, modelPackage.getTestEnumEEnum(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TestNextEnum.class, modelPackage.getTestNextEnumEEnum(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(ManyTypes.class, ManyTypesDao.class);
    DaoRegistry.getInstance().registerDao(SingleTypes.class, SingleTypesDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link TypesModelFactory} instance.
   * @generated
   */
  @Override
  public TypesModelFactory getModelFactory() {
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
    return "types.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>ManyTypes</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ManyTypes</b></em>'
   * @generated
   */
  public EClass getManyTypesEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MANYTYPES_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManyTypes.string</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManyTypes.string</b></em>'.
   * @generated
   */
  public EAttribute getManyTypes_String() {
    return (EAttribute) getManyTypesEClass().getEAllStructuralFeatures().get(MANYTYPES_STRING_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManyTypes.integerObject</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManyTypes.integerObject</b></em>'.
   * @generated
   */
  public EAttribute getManyTypes_IntegerObject() {
    return (EAttribute) getManyTypesEClass().getEAllStructuralFeatures().get(MANYTYPES_INTEGEROBJECT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManyTypes.long</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManyTypes.long</b></em>'.
   * @generated
   */
  public EAttribute getManyTypes_Long_() {
    return (EAttribute) getManyTypesEClass().getEAllStructuralFeatures().get(MANYTYPES_LONG__FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManyTypes.doubleObject</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManyTypes.doubleObject</b></em>'.
   * @generated
   */
  public EAttribute getManyTypes_DoubleObject() {
    return (EAttribute) getManyTypesEClass().getEAllStructuralFeatures().get(MANYTYPES_DOUBLEOBJECT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManyTypes.floatObject</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManyTypes.floatObject</b></em>'.
   * @generated
   */
  public EAttribute getManyTypes_FloatObject() {
    return (EAttribute) getManyTypesEClass().getEAllStructuralFeatures().get(MANYTYPES_FLOATOBJECT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManyTypes.clazz</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManyTypes.clazz</b></em>'.
   * @generated
   */
  public EAttribute getManyTypes_Clazz() {
    return (EAttribute) getManyTypesEClass().getEAllStructuralFeatures().get(MANYTYPES_CLAZZ_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManyTypes.charObject</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManyTypes.charObject</b></em>'.
   * @generated
   */
  public EAttribute getManyTypes_CharObject() {
    return (EAttribute) getManyTypesEClass().getEAllStructuralFeatures().get(MANYTYPES_CHAROBJECT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManyTypes.byteObject</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManyTypes.byteObject</b></em>'.
   * @generated
   */
  public EAttribute getManyTypes_ByteObject() {
    return (EAttribute) getManyTypesEClass().getEAllStructuralFeatures().get(MANYTYPES_BYTEOBJECT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManyTypes.byteArray</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManyTypes.byteArray</b></em>'.
   * @generated
   */
  public EAttribute getManyTypes_ByteArray() {
    return (EAttribute) getManyTypesEClass().getEAllStructuralFeatures().get(MANYTYPES_BYTEARRAY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManyTypes.bigDecimal</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManyTypes.bigDecimal</b></em>'.
   * @generated
   */
  public EAttribute getManyTypes_BigDecimal() {
    return (EAttribute) getManyTypesEClass().getEAllStructuralFeatures().get(MANYTYPES_BIGDECIMAL_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManyTypes.bigInteger</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManyTypes.bigInteger</b></em>'.
   * @generated
   */
  public EAttribute getManyTypes_BigInteger() {
    return (EAttribute) getManyTypesEClass().getEAllStructuralFeatures().get(MANYTYPES_BIGINTEGER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManyTypes.enum</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManyTypes.enum</b></em>'.
   * @generated
   */
  public EAttribute getManyTypes_Enum_() {
    return (EAttribute) getManyTypesEClass().getEAllStructuralFeatures().get(MANYTYPES_ENUM__FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManyTypes.date</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManyTypes.date</b></em>'.
   * @generated
   */
  public EAttribute getManyTypes_Date() {
    return (EAttribute) getManyTypesEClass().getEAllStructuralFeatures().get(MANYTYPES_DATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SingleTypes</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SingleTypes</b></em>'
   * @generated
   */
  public EClass getSingleTypesEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SINGLETYPES_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.string</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.string</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_String() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_STRING_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.integer</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.integer</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_Integer() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_INTEGER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.integerObject</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.integerObject</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_IntegerObject() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_INTEGEROBJECT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.long</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.long</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_Long_() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_LONG__FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.longObject</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.longObject</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_LongObject() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_LONGOBJECT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.double</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.double</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_Double_() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_DOUBLE__FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.doubleObject</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.doubleObject</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_DoubleObject() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_DOUBLEOBJECT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.float</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.float</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_Float_() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_FLOAT__FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.floatObject</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.floatObject</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_FloatObject() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_FLOATOBJECT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.clazz</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.clazz</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_Clazz() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_CLAZZ_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.char</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.char</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_Char_() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_CHAR__FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.charObject</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.charObject</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_CharObject() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_CHAROBJECT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.byte</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.byte</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_Byte_() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_BYTE__FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.byteObject</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.byteObject</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_ByteObject() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_BYTEOBJECT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.byteArray</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.byteArray</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_ByteArray() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_BYTEARRAY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.bigDecimal</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.bigDecimal</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_BigDecimal() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_BIGDECIMAL_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.bigInteger</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.bigInteger</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_BigInteger() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_BIGINTEGER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.enum</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.enum</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_Enum_() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_ENUM__FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.date</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.date</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_Date() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_DATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.stringArray</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.stringArray</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_StringArray() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_STRINGARRAY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.longArray</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.longArray</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_LongArray() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_LONGARRAY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SingleTypes.nextEnum</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SingleTypes.nextEnum</b></em>'.
   * @generated
   */
  public EAttribute getSingleTypes_NextEnum() {
    return (EAttribute) getSingleTypesEClass().getEAllStructuralFeatures().get(SINGLETYPES_NEXTENUM_FEATURE_ID);
  }

  /**
   * Returns the EEnum '<em><b>TestEnum</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>TestEnum</b></em>'
   * @generated
   */
  public EEnum getTestEnumEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(TESTENUM_CLASSIFIER_ID);
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
   * Returns the {@link EDataType} '<em><b>LongArray</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>LongArray</b></em>'
   * @generated
   */
  public EDataType getLongArrayEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(LONGARRAY_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>TestNextEnum</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>TestNextEnum</b></em>'
   * @generated
   */
  public EEnum getTestNextEnumEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(TESTNEXTENUM_CLASSIFIER_ID);
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
    case MANYTYPES_CLASSIFIER_ID:
      return ManyTypes.class;
    case SINGLETYPES_CLASSIFIER_ID:
      return SingleTypes.class;
    case TESTENUM_CLASSIFIER_ID:
      return TestEnum.class;
    case STRINGARRAY_CLASSIFIER_ID:
      return String[].class;
    case LONGARRAY_CLASSIFIER_ID:
      return long[].class;
    case TESTNEXTENUM_CLASSIFIER_ID:
      return TestNextEnum.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
