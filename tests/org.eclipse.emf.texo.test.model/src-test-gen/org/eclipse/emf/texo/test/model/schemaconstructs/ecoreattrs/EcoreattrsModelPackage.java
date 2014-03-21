package org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs;

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
import org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.dao.ElementDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.dao.FeatureDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.dao.MixedDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs.dao.NameListDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>ecoreattrs</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EcoreattrsModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/schemaconstructs/ecoreattrs";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final EcoreattrsModelFactory MODELFACTORY = new EcoreattrsModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELEMENT_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELEMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELEMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELEMENT_NAMEMAP_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELEMENT_NAMES_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NAMELIST_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NAMELIST_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NAMELIST_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NAMELIST_FIRSTNAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NAMELIST_MIDDLENAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int NAMELIST_LASTNAME_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FEATURE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FEATURE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FEATURE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FEATURE_AMAP_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FEATURE_NAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FEATURE_VALUE__FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXED_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXED_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXED_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXED_MIXED_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXED_NAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXED_VALUE__FEATURE_ID = 4;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final EcoreattrsModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static EcoreattrsModelPackage initialize() {

    if (isInitialized) {
      return (EcoreattrsModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final EcoreattrsModelPackage modelPackage = new EcoreattrsModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Element.class, modelPackage.getElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(NameList.class, modelPackage.getNameListEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Feature.class, modelPackage.getFeatureEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Mixed.class, modelPackage.getMixedEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(Element.class, ElementDao.class);
    DaoRegistry.getInstance().registerDao(NameList.class, NameListDao.class);
    DaoRegistry.getInstance().registerDao(Feature.class, FeatureDao.class);
    DaoRegistry.getInstance().registerDao(Mixed.class, MixedDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link EcoreattrsModelFactory} instance.
   * @generated
   */
  @Override
  public EcoreattrsModelFactory getModelFactory() {
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
    return "ecoreattrs.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>Element</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Element</b></em>'
   * @generated
   */
  public EClass getElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Element.nameMap</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Element.nameMap</b></em>'.
   * @generated
   */
  public EAttribute getElement_NameMap() {
    return (EAttribute) getElementEClass().getEAllStructuralFeatures().get(ELEMENT_NAMEMAP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Element.names</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Element.names</b></em>'.
   * @generated
   */
  public EReference getElement_Names() {
    return (EReference) getElementEClass().getEAllStructuralFeatures().get(ELEMENT_NAMES_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>NameList</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>NameList</b></em>'
   * @generated
   */
  public EClass getNameListEClass() {
    return (EClass) getEPackage().getEClassifiers().get(NAMELIST_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>NameList.firstName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>NameList.firstName</b></em>'.
   * @generated
   */
  public EAttribute getNameList_FirstName() {
    return (EAttribute) getNameListEClass().getEAllStructuralFeatures().get(NAMELIST_FIRSTNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>NameList.middleName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>NameList.middleName</b></em>'.
   * @generated
   */
  public EAttribute getNameList_MiddleName() {
    return (EAttribute) getNameListEClass().getEAllStructuralFeatures().get(NAMELIST_MIDDLENAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>NameList.lastName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>NameList.lastName</b></em>'.
   * @generated
   */
  public EAttribute getNameList_LastName() {
    return (EAttribute) getNameListEClass().getEAllStructuralFeatures().get(NAMELIST_LASTNAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Feature</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Feature</b></em>'
   * @generated
   */
  public EClass getFeatureEClass() {
    return (EClass) getEPackage().getEClassifiers().get(FEATURE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Feature.aMap</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Feature.aMap</b></em>'.
   * @generated
   */
  public EAttribute getFeature_AMap() {
    return (EAttribute) getFeatureEClass().getEAllStructuralFeatures().get(FEATURE_AMAP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Feature.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Feature.name</b></em>'.
   * @generated
   */
  public EAttribute getFeature_Name() {
    return (EAttribute) getFeatureEClass().getEAllStructuralFeatures().get(FEATURE_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Feature.value</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Feature.value</b></em>'.
   * @generated
   */
  public EAttribute getFeature_Value_() {
    return (EAttribute) getFeatureEClass().getEAllStructuralFeatures().get(FEATURE_VALUE__FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Mixed</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Mixed</b></em>'
   * @generated
   */
  public EClass getMixedEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MIXED_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Mixed.mixed</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Mixed.mixed</b></em>'.
   * @generated
   */
  public EAttribute getMixed_Mixed() {
    return (EAttribute) getMixedEClass().getEAllStructuralFeatures().get(MIXED_MIXED_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Mixed.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Mixed.name</b></em>'.
   * @generated
   */
  public EAttribute getMixed_Name() {
    return (EAttribute) getMixedEClass().getEAllStructuralFeatures().get(MIXED_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Mixed.value</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Mixed.value</b></em>'.
   * @generated
   */
  public EAttribute getMixed_Value_() {
    return (EAttribute) getMixedEClass().getEAllStructuralFeatures().get(MIXED_VALUE__FEATURE_ID);
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
    case ELEMENT_CLASSIFIER_ID:
      return Element.class;
    case NAMELIST_CLASSIFIER_ID:
      return NameList.class;
    case FEATURE_CLASSIFIER_ID:
      return Feature.class;
    case MIXED_CLASSIFIER_ID:
      return Mixed.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
