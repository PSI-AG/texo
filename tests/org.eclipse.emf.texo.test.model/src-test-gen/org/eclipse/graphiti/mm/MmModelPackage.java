package org.eclipse.graphiti.mm;

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
import org.eclipse.emf.texo.utils.ModelUtils;
import org.eclipse.graphiti.mm.algorithms.AlgorithmsModelPackage;
import org.eclipse.graphiti.mm.algorithms.styles.StylesModelPackage;
import org.eclipse.graphiti.mm.dao.GraphicsAlgorithmContainerDao;
import org.eclipse.graphiti.mm.dao.PropertyContainerDao;
import org.eclipse.graphiti.mm.dao.PropertyDao;
import org.eclipse.graphiti.mm.dao.StyleContainerDao;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The <b>Package</b> for the model '<em><b>mm</b></em>'. It contains initialization code and access to the Factory to
 * instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class MmModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://eclipse.org/graphiti/mm";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final MmModelFactory MODELFACTORY = new MmModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PROPERTY_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PROPERTY_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PROPERTY_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PROPERTY_KEY_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PROPERTY_VALUE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PROPERTYCONTAINER_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PROPERTYCONTAINER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PROPERTYCONTAINER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PROPERTYCONTAINER_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHMCONTAINER_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHMCONTAINER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHMCONTAINER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHMCONTAINER_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLECONTAINER_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLECONTAINER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLECONTAINER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STYLECONTAINER_STYLES_FEATURE_ID = 2;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final MmModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static MmModelPackage initialize() {

    if (isInitialized) {
      return (MmModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final MmModelPackage modelPackage = new MmModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();
    StylesModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    PictogramsModelPackage.initialize();
    AlgorithmsModelPackage.initialize();
    StylesModelPackage.initialize();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Property.class, modelPackage.getPropertyEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PropertyContainer.class,
        modelPackage.getPropertyContainerEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(GraphicsAlgorithmContainer.class,
        modelPackage.getGraphicsAlgorithmContainerEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(StyleContainer.class, modelPackage.getStyleContainerEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(Property.class, PropertyDao.class);
    DaoRegistry.getInstance().registerDao(PropertyContainer.class, PropertyContainerDao.class);
    DaoRegistry.getInstance().registerDao(GraphicsAlgorithmContainer.class, GraphicsAlgorithmContainerDao.class);
    DaoRegistry.getInstance().registerDao(StyleContainer.class, StyleContainerDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link MmModelFactory} instance.
   * @generated
   */
  @Override
  public MmModelFactory getModelFactory() {
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
    return "mm.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>Property</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Property</b></em>'
   * @generated
   */
  public EClass getPropertyEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PROPERTY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Property.key</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Property.key</b></em>'.
   * @generated
   */
  public EAttribute getProperty_Key() {
    return (EAttribute) getPropertyEClass().getEAllStructuralFeatures().get(PROPERTY_KEY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Property.value</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Property.value</b></em>'.
   * @generated
   */
  public EAttribute getProperty_Value() {
    return (EAttribute) getPropertyEClass().getEAllStructuralFeatures().get(PROPERTY_VALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PropertyContainer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PropertyContainer</b></em>'
   * @generated
   */
  public EClass getPropertyContainerEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PROPERTYCONTAINER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PropertyContainer.properties</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PropertyContainer.properties</b></em>'.
   * @generated
   */
  public EReference getPropertyContainer_Properties() {
    return (EReference) getPropertyContainerEClass().getEAllStructuralFeatures().get(
        PROPERTYCONTAINER_PROPERTIES_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>GraphicsAlgorithmContainer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EClass} '<em><b>GraphicsAlgorithmContainer</b></em>'
   * @generated
   */
  public EClass getGraphicsAlgorithmContainerEClass() {
    return (EClass) getEPackage().getEClassifiers().get(GRAPHICSALGORITHMCONTAINER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>StyleContainer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>StyleContainer</b></em>'
   * @generated
   */
  public EClass getStyleContainerEClass() {
    return (EClass) getEPackage().getEClassifiers().get(STYLECONTAINER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>StyleContainer.styles</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>StyleContainer.styles</b></em>'.
   * @generated
   */
  public EReference getStyleContainer_Styles() {
    return (EReference) getStyleContainerEClass().getEAllStructuralFeatures().get(STYLECONTAINER_STYLES_FEATURE_ID);
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
    case PROPERTY_CLASSIFIER_ID:
      return Property.class;
    case PROPERTYCONTAINER_CLASSIFIER_ID:
      return PropertyContainer.class;
    case GRAPHICSALGORITHMCONTAINER_CLASSIFIER_ID:
      return GraphicsAlgorithmContainer.class;
    case STYLECONTAINER_CLASSIFIER_ID:
      return StyleContainer.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
