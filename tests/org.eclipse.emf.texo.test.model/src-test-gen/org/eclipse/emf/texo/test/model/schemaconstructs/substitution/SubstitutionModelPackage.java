package org.eclipse.emf.texo.test.model.schemaconstructs.substitution;

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
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.dao.ComplexNumberDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.dao.DocumentRootDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.dao.EvenComplexNumberTypeDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.dao.MultiNumberTypeDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.dao.NumberTypeDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.substitution.dao.OddComplexNumberTypeDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>substitution</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SubstitutionModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/schemaconstructs/substitution";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final SubstitutionModelFactory MODELFACTORY = new SubstitutionModelFactory();

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
  public static final int SIMPLENUMBER_CLASSIFIER_ID = 10;

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
  public static final int COMPLEXNUMBER_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXNUMBER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXNUMBER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXNUMBER_VALUE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXNUMBER_UNIT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_CLASSIFIER_ID = 1;

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
  public static final int DOCUMENTROOT_EVEN_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_MYSIMPLEABSTRACT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_EVENCOMPLEXNUMBER_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_MYCOMPLEXABSTRACT_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_MULTINUMBER_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_NUMBER_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_ODD_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DOCUMENTROOT_ODDCOMPLEXNUMBER_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EVENCOMPLEXNUMBERTYPE_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EVENCOMPLEXNUMBERTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EVENCOMPLEXNUMBERTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EVENCOMPLEXNUMBERTYPE_VALUE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EVENCOMPLEXNUMBERTYPE_UNIT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTINUMBERTYPE_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTINUMBERTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTINUMBERTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTINUMBERTYPE_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTINUMBERTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTINUMBERTYPE_MYCOMPLEXABSTRACT_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NUMBERTYPE_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NUMBERTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NUMBERTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NUMBERTYPE_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NUMBERTYPE_MYSIMPLEABSTRACTGROUP_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NUMBERTYPE_MYSIMPLEABSTRACT_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NUMBERTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NUMBERTYPE_MYCOMPLEXABSTRACT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ODDCOMPLEXNUMBERTYPE_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ODDCOMPLEXNUMBERTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ODDCOMPLEXNUMBERTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ODDCOMPLEXNUMBERTYPE_VALUE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ODDCOMPLEXNUMBERTYPE_UNIT_FEATURE_ID = 3;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final SubstitutionModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static SubstitutionModelPackage initialize() {

    if (isInitialized) {
      return (SubstitutionModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final SubstitutionModelPackage modelPackage = new SubstitutionModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(ComplexNumber.class, modelPackage.getComplexNumberEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DocumentRoot.class, modelPackage.getDocumentRootEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(EvenComplexNumberType.class,
        modelPackage.getEvenComplexNumberTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(MultiNumberType.class,
        modelPackage.getMultiNumberTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(NumberType.class, modelPackage.getNumberTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(OddComplexNumberType.class,
        modelPackage.getOddComplexNumberTypeEClass(), modelPackage);

    ModelResolver.getInstance()
        .registerClassModelMapping(EvenType.class, modelPackage.getEvenTypeEEnum(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(OddType.class, modelPackage.getOddTypeEEnum(), modelPackage);

    DaoRegistry.getInstance().registerDao(ComplexNumber.class, ComplexNumberDao.class);
    DaoRegistry.getInstance().registerDao(DocumentRoot.class, DocumentRootDao.class);
    DaoRegistry.getInstance().registerDao(EvenComplexNumberType.class, EvenComplexNumberTypeDao.class);
    DaoRegistry.getInstance().registerDao(MultiNumberType.class, MultiNumberTypeDao.class);
    DaoRegistry.getInstance().registerDao(NumberType.class, NumberTypeDao.class);
    DaoRegistry.getInstance().registerDao(OddComplexNumberType.class, OddComplexNumberTypeDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link SubstitutionModelFactory} instance.
   * @generated
   */
  @Override
  public SubstitutionModelFactory getModelFactory() {
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
    return "substitution.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>ComplexNumber</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ComplexNumber</b></em>'
   * @generated
   */
  public EClass getComplexNumberEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMPLEXNUMBER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ComplexNumber.value</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ComplexNumber.value</b></em>'.
   * @generated
   */
  public EAttribute getComplexNumber_Value() {
    return (EAttribute) getComplexNumberEClass().getEAllStructuralFeatures().get(COMPLEXNUMBER_VALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ComplexNumber.unit</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ComplexNumber.unit</b></em>'.
   * @generated
   */
  public EAttribute getComplexNumber_Unit() {
    return (EAttribute) getComplexNumberEClass().getEAllStructuralFeatures().get(COMPLEXNUMBER_UNIT_FEATURE_ID);
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
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.mySimpleAbstract</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.mySimpleAbstract</b></em>'.
   * @generated
   */
  public EAttribute getDocumentRoot_MySimpleAbstract() {
    return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures().get(
        DOCUMENTROOT_MYSIMPLEABSTRACT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.evenComplexNumber</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.evenComplexNumber</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_EvenComplexNumber() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(
        DOCUMENTROOT_EVENCOMPLEXNUMBER_FEATURE_ID);
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
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.multiNumber</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.multiNumber</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_MultiNumber() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_MULTINUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.number</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.number</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_Number() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(DOCUMENTROOT_NUMBER_FEATURE_ID);
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
   * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.oddComplexNumber</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DocumentRoot.oddComplexNumber</b></em>'.
   * @generated
   */
  public EReference getDocumentRoot_OddComplexNumber() {
    return (EReference) getDocumentRootEClass().getEAllStructuralFeatures().get(
        DOCUMENTROOT_ODDCOMPLEXNUMBER_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>EvenComplexNumberType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>EvenComplexNumberType</b></em>'
   * @generated
   */
  public EClass getEvenComplexNumberTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EVENCOMPLEXNUMBERTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>MultiNumberType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>MultiNumberType</b></em>'
   * @generated
   */
  public EClass getMultiNumberTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MULTINUMBERTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>MultiNumberType.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>MultiNumberType.name</b></em>'.
   * @generated
   */
  public EAttribute getMultiNumberType_Name() {
    return (EAttribute) getMultiNumberTypeEClass().getEAllStructuralFeatures().get(MULTINUMBERTYPE_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>MultiNumberType.myComplexAbstractGroup</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>MultiNumberType.myComplexAbstractGroup</b></em>'.
   * @generated
   */
  public EAttribute getMultiNumberType_MyComplexAbstractGroup() {
    return (EAttribute) getMultiNumberTypeEClass().getEAllStructuralFeatures().get(
        MULTINUMBERTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>MultiNumberType.myComplexAbstract</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>MultiNumberType.myComplexAbstract</b></em>'.
   * @generated
   */
  public EReference getMultiNumberType_MyComplexAbstract() {
    return (EReference) getMultiNumberTypeEClass().getEAllStructuralFeatures().get(
        MULTINUMBERTYPE_MYCOMPLEXABSTRACT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>NumberType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>NumberType</b></em>'
   * @generated
   */
  public EClass getNumberTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(NUMBERTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>NumberType.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>NumberType.name</b></em>'.
   * @generated
   */
  public EAttribute getNumberType_Name() {
    return (EAttribute) getNumberTypeEClass().getEAllStructuralFeatures().get(NUMBERTYPE_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>NumberType.mySimpleAbstractGroup</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>NumberType.mySimpleAbstractGroup</b></em>'.
   * @generated
   */
  public EAttribute getNumberType_MySimpleAbstractGroup() {
    return (EAttribute) getNumberTypeEClass().getEAllStructuralFeatures().get(
        NUMBERTYPE_MYSIMPLEABSTRACTGROUP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>NumberType.mySimpleAbstract</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>NumberType.mySimpleAbstract</b></em>'.
   * @generated
   */
  public EAttribute getNumberType_MySimpleAbstract() {
    return (EAttribute) getNumberTypeEClass().getEAllStructuralFeatures().get(NUMBERTYPE_MYSIMPLEABSTRACT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>NumberType.myComplexAbstractGroup</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>NumberType.myComplexAbstractGroup</b></em>'.
   * @generated
   */
  public EAttribute getNumberType_MyComplexAbstractGroup() {
    return (EAttribute) getNumberTypeEClass().getEAllStructuralFeatures().get(
        NUMBERTYPE_MYCOMPLEXABSTRACTGROUP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>NumberType.myComplexAbstract</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>NumberType.myComplexAbstract</b></em>'.
   * @generated
   */
  public EReference getNumberType_MyComplexAbstract() {
    return (EReference) getNumberTypeEClass().getEAllStructuralFeatures().get(NUMBERTYPE_MYCOMPLEXABSTRACT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>OddComplexNumberType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>OddComplexNumberType</b></em>'
   * @generated
   */
  public EClass getOddComplexNumberTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ODDCOMPLEXNUMBERTYPE_CLASSIFIER_ID);
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
   * Returns the {@link EDataType} '<em><b>SimpleNumber</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>SimpleNumber</b></em>'
   * @generated
   */
  public EDataType getSimpleNumberEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(SIMPLENUMBER_CLASSIFIER_ID);
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
    case COMPLEXNUMBER_CLASSIFIER_ID:
      return ComplexNumber.class;
    case DOCUMENTROOT_CLASSIFIER_ID:
      return DocumentRoot.class;
    case EVENCOMPLEXNUMBERTYPE_CLASSIFIER_ID:
      return EvenComplexNumberType.class;
    case MULTINUMBERTYPE_CLASSIFIER_ID:
      return MultiNumberType.class;
    case NUMBERTYPE_CLASSIFIER_ID:
      return NumberType.class;
    case ODDCOMPLEXNUMBERTYPE_CLASSIFIER_ID:
      return OddComplexNumberType.class;
    case EVENTYPE_CLASSIFIER_ID:
      return EvenType.class;
    case SIMPLENUMBER_CLASSIFIER_ID:
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
