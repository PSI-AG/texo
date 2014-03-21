package org.eclipse.emf.texo.test.model.samples.interfaces;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.samples.interfaces.dao.DescribableConcreteDao;
import org.eclipse.emf.texo.test.model.samples.interfaces.dao.DescribableDao;
import org.eclipse.emf.texo.test.model.samples.interfaces.dao.DescribableIdentifiableConcreteDao;
import org.eclipse.emf.texo.test.model.samples.interfaces.dao.IdentifiableConcreteDao;
import org.eclipse.emf.texo.test.model.samples.interfaces.dao.IdentifiedTypeDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>interfaces</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class InterfacesModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/interfaces";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final InterfacesModelFactory MODELFACTORY = new InterfacesModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DESCRIBABLEIDENTIFIABLECONCRETE_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DESCRIBABLEIDENTIFIABLECONCRETE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DESCRIBABLEIDENTIFIABLECONCRETE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DESCRIBABLEIDENTIFIABLECONCRETE_NAME_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DESCRIBABLEIDENTIFIABLECONCRETE_DESCRIPTION_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DESCRIBABLEIDENTIFIABLECONCRETE_IDENTIFIER_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DESCRIBABLE_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DESCRIBABLE_DESCRIPTION_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IDENTIFIEDTYPE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IDENTIFIEDTYPE_IDENTIFIER_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DESCRIBABLECONCRETE_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DESCRIBABLECONCRETE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DESCRIBABLECONCRETE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DESCRIBABLECONCRETE_NAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DESCRIBABLECONCRETE_DESCRIPTION_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IDENTIFIABLECONCRETE_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IDENTIFIABLECONCRETE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IDENTIFIABLECONCRETE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IDENTIFIABLECONCRETE_NAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IDENTIFIABLECONCRETE_IDENTIFIER_FEATURE_ID = 2;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final InterfacesModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static InterfacesModelPackage initialize() {

    if (isInitialized) {
      return (InterfacesModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final InterfacesModelPackage modelPackage = new InterfacesModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(DescribableIdentifiableConcrete.class,
        modelPackage.getDescribableIdentifiableConcreteEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Describable.class, modelPackage.getDescribableEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(IdentifiedType.class, modelPackage.getIdentifiedTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DescribableConcrete.class,
        modelPackage.getDescribableConcreteEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(IdentifiableConcrete.class,
        modelPackage.getIdentifiableConcreteEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(DescribableIdentifiableConcrete.class,
        DescribableIdentifiableConcreteDao.class);
    DaoRegistry.getInstance().registerDao(Describable.class, DescribableDao.class);
    DaoRegistry.getInstance().registerDao(IdentifiedType.class, IdentifiedTypeDao.class);
    DaoRegistry.getInstance().registerDao(DescribableConcrete.class, DescribableConcreteDao.class);
    DaoRegistry.getInstance().registerDao(IdentifiableConcrete.class, IdentifiableConcreteDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link InterfacesModelFactory} instance.
   * @generated
   */
  @Override
  public InterfacesModelFactory getModelFactory() {
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
    return "interfaces.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>DescribableIdentifiableConcrete</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DescribableIdentifiableConcrete</b></em>'
   * @generated
   */
  public EClass getDescribableIdentifiableConcreteEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DESCRIBABLEIDENTIFIABLECONCRETE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DescribableIdentifiableConcrete.name</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DescribableIdentifiableConcrete.name</b></em>'.
   * @generated
   */
  public EAttribute getDescribableIdentifiableConcrete_Name() {
    return (EAttribute) getDescribableIdentifiableConcreteEClass().getEAllStructuralFeatures().get(
        DESCRIBABLEIDENTIFIABLECONCRETE_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DescribableIdentifiableConcrete.description</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DescribableIdentifiableConcrete.description</b></em>
   *         '.
   * @generated
   */
  public EAttribute getDescribableIdentifiableConcrete_Description() {
    return (EAttribute) getDescribableIdentifiableConcreteEClass().getEAllStructuralFeatures().get(
        DESCRIBABLEIDENTIFIABLECONCRETE_DESCRIPTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DescribableIdentifiableConcrete.identifier</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DescribableIdentifiableConcrete.identifier</b></em>
   *         '.
   * @generated
   */
  public EAttribute getDescribableIdentifiableConcrete_Identifier() {
    return (EAttribute) getDescribableIdentifiableConcreteEClass().getEAllStructuralFeatures().get(
        DESCRIBABLEIDENTIFIABLECONCRETE_IDENTIFIER_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Describable</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Describable</b></em>'
   * @generated
   */
  public EClass getDescribableEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DESCRIBABLE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Describable.description</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Describable.description</b></em>'.
   * @generated
   */
  public EAttribute getDescribable_Description() {
    return (EAttribute) getDescribableEClass().getEAllStructuralFeatures().get(DESCRIBABLE_DESCRIPTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>IdentifiedType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>IdentifiedType</b></em>'
   * @generated
   */
  public EClass getIdentifiedTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(IDENTIFIEDTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>IdentifiedType.identifier</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>IdentifiedType.identifier</b></em>'.
   * @generated
   */
  public EAttribute getIdentifiedType_Identifier() {
    return (EAttribute) getIdentifiedTypeEClass().getEAllStructuralFeatures().get(IDENTIFIEDTYPE_IDENTIFIER_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DescribableConcrete</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DescribableConcrete</b></em>'
   * @generated
   */
  public EClass getDescribableConcreteEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DESCRIBABLECONCRETE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DescribableConcrete.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DescribableConcrete.name</b></em>'.
   * @generated
   */
  public EAttribute getDescribableConcrete_Name() {
    return (EAttribute) getDescribableConcreteEClass().getEAllStructuralFeatures().get(
        DESCRIBABLECONCRETE_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DescribableConcrete.description</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DescribableConcrete.description</b></em>'.
   * @generated
   */
  public EAttribute getDescribableConcrete_Description() {
    return (EAttribute) getDescribableConcreteEClass().getEAllStructuralFeatures().get(
        DESCRIBABLECONCRETE_DESCRIPTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>IdentifiableConcrete</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>IdentifiableConcrete</b></em>'
   * @generated
   */
  public EClass getIdentifiableConcreteEClass() {
    return (EClass) getEPackage().getEClassifiers().get(IDENTIFIABLECONCRETE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>IdentifiableConcrete.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>IdentifiableConcrete.name</b></em>'.
   * @generated
   */
  public EAttribute getIdentifiableConcrete_Name() {
    return (EAttribute) getIdentifiableConcreteEClass().getEAllStructuralFeatures().get(
        IDENTIFIABLECONCRETE_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>IdentifiableConcrete.identifier</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>IdentifiableConcrete.identifier</b></em>'.
   * @generated
   */
  public EAttribute getIdentifiableConcrete_Identifier() {
    return (EAttribute) getIdentifiableConcreteEClass().getEAllStructuralFeatures().get(
        IDENTIFIABLECONCRETE_IDENTIFIER_FEATURE_ID);
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
    case DESCRIBABLEIDENTIFIABLECONCRETE_CLASSIFIER_ID:
      return DescribableIdentifiableConcrete.class;
    case DESCRIBABLE_CLASSIFIER_ID:
      return Describable.class;
    case IDENTIFIEDTYPE_CLASSIFIER_ID:
      return IdentifiedType.class;
    case DESCRIBABLECONCRETE_CLASSIFIER_ID:
      return DescribableConcrete.class;
    case IDENTIFIABLECONCRETE_CLASSIFIER_ID:
      return IdentifiableConcrete.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
