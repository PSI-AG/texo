package org.eclipse.emf.texo.test.model.issues.bz379796;

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
import org.eclipse.emf.texo.test.model.issues.bz379796.dao.PriceTypeDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>bz379796</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Bz379796ModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz379796";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz379796ModelFactory MODELFACTORY = new Bz379796ModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPARISONTYPE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPARISONTYPEOBJECT_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICETYPE_CLASSIFIER_ID = 0;

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
  public static final int PRICETYPE_VALUEELEMENT_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICETYPE_NILLABLEVALUEELEMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICETYPE_REQUIREDVALUEELEMENT_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICETYPE_COMPARISONELEMENT_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICETYPE_REQUIREDCOMPARISONELEMENT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICETYPE_COMPARISON_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICETYPE_REQUIREDCOMPARISON_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICETYPE_REQUIREDVALUE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRICETYPE_VALUE_FEATURE_ID = 10;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz379796ModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static Bz379796ModelPackage initialize() {

    if (isInitialized) {
      return (Bz379796ModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final Bz379796ModelPackage modelPackage = new Bz379796ModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(PriceType.class, modelPackage.getPriceTypeEClass(),
        modelPackage);

    ModelResolver.getInstance().registerClassModelMapping(ComparisonType.class, modelPackage.getComparisonTypeEEnum(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(PriceType.class, PriceTypeDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link Bz379796ModelFactory} instance.
   * @generated
   */
  @Override
  public Bz379796ModelFactory getModelFactory() {
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
    return "bz379796.ecore";
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
   * Returns the {@link EStructuralFeature} '<em><b>PriceType.valueElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PriceType.valueElement</b></em>'.
   * @generated
   */
  public EAttribute getPriceType_ValueElement() {
    return (EAttribute) getPriceTypeEClass().getEAllStructuralFeatures().get(PRICETYPE_VALUEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PriceType.nillableValueElement</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PriceType.nillableValueElement</b></em>'.
   * @generated
   */
  public EAttribute getPriceType_NillableValueElement() {
    return (EAttribute) getPriceTypeEClass().getEAllStructuralFeatures().get(PRICETYPE_NILLABLEVALUEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PriceType.requiredValueElement</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PriceType.requiredValueElement</b></em>'.
   * @generated
   */
  public EAttribute getPriceType_RequiredValueElement() {
    return (EAttribute) getPriceTypeEClass().getEAllStructuralFeatures().get(PRICETYPE_REQUIREDVALUEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PriceType.comparisonElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PriceType.comparisonElement</b></em>'.
   * @generated
   */
  public EAttribute getPriceType_ComparisonElement() {
    return (EAttribute) getPriceTypeEClass().getEAllStructuralFeatures().get(PRICETYPE_COMPARISONELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PriceType.requiredComparisonElement</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PriceType.requiredComparisonElement</b></em>'.
   * @generated
   */
  public EAttribute getPriceType_RequiredComparisonElement() {
    return (EAttribute) getPriceTypeEClass().getEAllStructuralFeatures().get(
        PRICETYPE_REQUIREDCOMPARISONELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PriceType.comparison</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PriceType.comparison</b></em>'.
   * @generated
   */
  public EAttribute getPriceType_Comparison() {
    return (EAttribute) getPriceTypeEClass().getEAllStructuralFeatures().get(PRICETYPE_COMPARISON_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PriceType.requiredComparison</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PriceType.requiredComparison</b></em>'.
   * @generated
   */
  public EAttribute getPriceType_RequiredComparison() {
    return (EAttribute) getPriceTypeEClass().getEAllStructuralFeatures().get(PRICETYPE_REQUIREDCOMPARISON_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PriceType.requiredValue</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PriceType.requiredValue</b></em>'.
   * @generated
   */
  public EAttribute getPriceType_RequiredValue() {
    return (EAttribute) getPriceTypeEClass().getEAllStructuralFeatures().get(PRICETYPE_REQUIREDVALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PriceType.value</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PriceType.value</b></em>'.
   * @generated
   */
  public EAttribute getPriceType_Value() {
    return (EAttribute) getPriceTypeEClass().getEAllStructuralFeatures().get(PRICETYPE_VALUE_FEATURE_ID);
  }

  /**
   * Returns the EEnum '<em><b>ComparisonType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>ComparisonType</b></em>'
   * @generated
   */
  public EEnum getComparisonTypeEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(COMPARISONTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>ComparisonTypeObject</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>ComparisonTypeObject</b></em>'
   * @generated
   */
  public EDataType getComparisonTypeObjectEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(COMPARISONTYPEOBJECT_CLASSIFIER_ID);
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
    case PRICETYPE_CLASSIFIER_ID:
      return PriceType.class;
    case COMPARISONTYPE_CLASSIFIER_ID:
      return ComparisonType.class;
    case COMPARISONTYPEOBJECT_CLASSIFIER_ID:
      return ComparisonType.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
