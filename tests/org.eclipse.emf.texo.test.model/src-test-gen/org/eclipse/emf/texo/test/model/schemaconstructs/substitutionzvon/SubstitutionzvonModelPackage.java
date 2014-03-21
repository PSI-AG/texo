package org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon;

import java.math.BigInteger;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.dao.ComplexAAADao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.dao.ComplexEvenTypeDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.dao.ComplexOddTypeDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.dao.DocumentRootDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitutionzvon.dao.RootTypeDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>substitutionzvon</b></em>'. It contains initialization code and access to
 * the Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SubstitutionzvonModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/schemaconstructs/substitutionzvon";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final SubstitutionzvonModelFactory MODELFACTORY = new SubstitutionzvonModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EVENTYPE_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AAA_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ODDTYPE_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EVENTYPEOBJECT_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ODDTYPEOBJECT_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXAAA_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXAAA_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXAAA_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXAAA_VALUE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXEVENTYPE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXEVENTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXEVENTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXEVENTYPE_VALUE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXODDTYPE_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXODDTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXODDTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXODDTYPE_VALUE_FEATURE_ID = 2;

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
  public static final int DOCUMENTROOT_COMPLEXEVEN_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_MYCOMPLEXABSTRACT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_COMPLEXODD_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_EVEN_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_MYABSTRACT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_ODD_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_ROOT_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROOTTYPE_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROOTTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROOTTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROOTTYPE_MYABSTRACTGROUP_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROOTTYPE_MYABSTRACT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROOTTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROOTTYPE_MYCOMPLEXABSTRACT_FEATURE_ID = 5;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final SubstitutionzvonModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static SubstitutionzvonModelPackage initialize() {

    if (isInitialized) {
      return (SubstitutionzvonModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final SubstitutionzvonModelPackage modelPackage = new SubstitutionzvonModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(ComplexAAA.class, modelPackage.getComplexAAAEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ComplexEvenType.class,
        modelPackage.getComplexEvenTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ComplexOddType.class, modelPackage.getComplexOddTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DocumentRoot.class, modelPackage.getDocumentRootEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RootType.class, modelPackage.getRootTypeEClass(),
        modelPackage);

    ModelResolver.getInstance()
        .registerClassModelMapping(EvenType.class, modelPackage.getEvenTypeEEnum(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(OddType.class, modelPackage.getOddTypeEEnum(), modelPackage);

    DaoRegistry.getInstance().registerDao(ComplexAAA.class, ComplexAAADao.class);
    DaoRegistry.getInstance().registerDao(ComplexEvenType.class, ComplexEvenTypeDao.class);
    DaoRegistry.getInstance().registerDao(ComplexOddType.class, ComplexOddTypeDao.class);
    DaoRegistry.getInstance().registerDao(DocumentRoot.class, DocumentRootDao.class);
    DaoRegistry.getInstance().registerDao(RootType.class, RootTypeDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link SubstitutionzvonModelFactory} instance.
   * @generated
   */
  @Override
  public SubstitutionzvonModelFactory getModelFactory() {
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
    return "substitutionzvon.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>ComplexAAA</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ComplexAAA</b></em>'
   * @generated
   */
  public EClass getComplexAAAEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMPLEXAAA_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ComplexAAA.value</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ComplexAAA.value</b></em>'.
   * @generated
   */
  public EAttribute getComplexAAA_Value() {
    return (EAttribute) getComplexAAAEClass().getEAllStructuralFeatures().get(COMPLEXAAA_VALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ComplexEvenType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ComplexEvenType</b></em>'
   * @generated
   */
  public EClass getComplexEvenTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMPLEXEVENTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ComplexOddType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ComplexOddType</b></em>'
   * @generated
   */
  public EClass getComplexOddTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMPLEXODDTYPE_CLASSIFIER_ID);
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
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.complexEven</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.complexEven</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_ComplexEven() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_COMPLEXEVEN_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.myComplexAbstract</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.myComplexAbstract</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_MyComplexAbstract() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(
        DOCUMENTROOT_MYCOMPLEXABSTRACT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.complexOdd</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.complexOdd</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_ComplexOdd() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_COMPLEXODD_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.even</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.even</b></em>'.
   * @generated
   */
  public EAttribute getDocumentRoot_Even() {
    return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_EVEN_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.myAbstract</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.myAbstract</b></em>'.
   * @generated
   */
  public EAttribute getDocumentRoot_MyAbstract() {
    return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_MYABSTRACT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.odd</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.odd</b></em>'.
   * @generated
   */
  public EAttribute getDocumentRoot_Odd() {
    return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_ODD_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.root</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.root</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_Root() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_ROOT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RootType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RootType</b></em>'
   * @generated
   */
  public EClass getRootTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ROOTTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RootType.myAbstractGroup</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RootType.myAbstractGroup</b></em>'.
   * @generated
   */
  public EAttribute getRootType_MyAbstractGroup() {
    return (EAttribute) getRootTypeEClass().getEAllStructuralFeatures().get(ROOTTYPE_MYABSTRACTGROUP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RootType.myAbstract</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RootType.myAbstract</b></em>'.
   * @generated
   */
  public EAttribute getRootType_MyAbstract() {
    return (EAttribute) getRootTypeEClass().getEAllStructuralFeatures().get(ROOTTYPE_MYABSTRACT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RootType.myComplexAbstractGroup</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RootType.myComplexAbstractGroup</b></em>'.
   * @generated
   */
  public EAttribute getRootType_MyComplexAbstractGroup() {
    return (EAttribute) getRootTypeEClass().getEAllStructuralFeatures().get(ROOTTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RootType.myComplexAbstract</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RootType.myComplexAbstract</b></em>'.
   * @generated
   */
  public EReference getRootType_MyComplexAbstract() {
    return (EReference) getRootTypeEClass().getEAllStructuralFeatures().get(ROOTTYPE_MYCOMPLEXABSTRACT_FEATURE_ID);
  }

  /**
   * Returns the EEnum '<em><b>EvenType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>EvenType</b></em>'
   * @generated
   */
  public EEnum getEvenTypeEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(EVENTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>AAA</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>AAA</b></em>'
   * @generated
   */
  public EDataType getAAAEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(AAA_CLASSIFIER_ID);
  }

  /**
   * Returns the EEnum '<em><b>OddType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>OddType</b></em>'
   * @generated
   */
  public EEnum getOddTypeEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(ODDTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>EvenTypeObject</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>EvenTypeObject</b></em>'
   * @generated
   */
  public EDataType getEvenTypeObjectEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(EVENTYPEOBJECT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>OddTypeObject</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>OddTypeObject</b></em>'
   * @generated
   */
  public EDataType getOddTypeObjectEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(ODDTYPEOBJECT_CLASSIFIER_ID);
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
    case COMPLEXAAA_CLASSIFIER_ID:
      return ComplexAAA.class;
    case COMPLEXEVENTYPE_CLASSIFIER_ID:
      return ComplexEvenType.class;
    case COMPLEXODDTYPE_CLASSIFIER_ID:
      return ComplexOddType.class;
    case DOCUMENTROOT_CLASSIFIER_ID:
      return DocumentRoot.class;
    case ROOTTYPE_CLASSIFIER_ID:
      return RootType.class;
    case EVENTYPE_CLASSIFIER_ID:
      return EvenType.class;
    case AAA_CLASSIFIER_ID:
      return BigInteger.class;
    case ODDTYPE_CLASSIFIER_ID:
      return OddType.class;
    case EVENTYPEOBJECT_CLASSIFIER_ID:
      return EvenType.class;
    case ODDTYPEOBJECT_CLASSIFIER_ID:
      return OddType.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
