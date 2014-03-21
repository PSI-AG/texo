package org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid;

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
import org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid.dao.AbstractClassDao;
import org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid.dao.ConcreteClassDao;
import org.eclipse.emf.texo.test.model.issues.bzwrongfeatureid.dao.TheInterfaceDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>bzWrongFeatureId</b></em>'. It contains initialization code and access to
 * the Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class BzWrongFeatureIdModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bzWrongFeatureId";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final BzWrongFeatureIdModelFactory MODELFACTORY = new BzWrongFeatureIdModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCLASS_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCLASS_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCLASS_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCLASS_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int THEINTERFACE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int THEINTERFACE_INTERFACENAME_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCRETECLASS_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCRETECLASS_DB_ID_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCRETECLASS_DB_VERSION_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCRETECLASS_NAME_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCRETECLASS_CONCRETENAME_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONCRETECLASS_INTERFACENAME_FEATURE_ID = 0;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final BzWrongFeatureIdModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static BzWrongFeatureIdModelPackage initialize() {

    if (isInitialized) {
      return (BzWrongFeatureIdModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final BzWrongFeatureIdModelPackage modelPackage = new BzWrongFeatureIdModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(AbstractClass.class, modelPackage.getAbstractClassEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TheInterface.class, modelPackage.getTheInterfaceEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ConcreteClass.class, modelPackage.getConcreteClassEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(AbstractClass.class, AbstractClassDao.class);
    DaoRegistry.getInstance().registerDao(TheInterface.class, TheInterfaceDao.class);
    DaoRegistry.getInstance().registerDao(ConcreteClass.class, ConcreteClassDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link BzWrongFeatureIdModelFactory} instance.
   * @generated
   */
  @Override
  public BzWrongFeatureIdModelFactory getModelFactory() {
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
    return "bzWrongFeatureId.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractClass</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractClass</b></em>'
   * @generated
   */
  public EClass getAbstractClassEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTCLASS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractClass.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractClass.name</b></em>'.
   * @generated
   */
  public EAttribute getAbstractClass_Name() {
    return (EAttribute) getAbstractClassEClass().getEAllStructuralFeatures().get(ABSTRACTCLASS_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TheInterface</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TheInterface</b></em>'
   * @generated
   */
  public EClass getTheInterfaceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(THEINTERFACE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TheInterface.interfaceName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TheInterface.interfaceName</b></em>'.
   * @generated
   */
  public EAttribute getTheInterface_InterfaceName() {
    return (EAttribute) getTheInterfaceEClass().getEAllStructuralFeatures().get(THEINTERFACE_INTERFACENAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ConcreteClass</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ConcreteClass</b></em>'
   * @generated
   */
  public EClass getConcreteClassEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONCRETECLASS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ConcreteClass.concreteName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ConcreteClass.concreteName</b></em>'.
   * @generated
   */
  public EAttribute getConcreteClass_ConcreteName() {
    return (EAttribute) getConcreteClassEClass().getEAllStructuralFeatures().get(CONCRETECLASS_CONCRETENAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ConcreteClass.interfaceName</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ConcreteClass.interfaceName</b></em>'.
   * @generated
   */
  public EAttribute getConcreteClass_InterfaceName() {
    return (EAttribute) getConcreteClassEClass().getEAllStructuralFeatures()
        .get(CONCRETECLASS_INTERFACENAME_FEATURE_ID);
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
    case ABSTRACTCLASS_CLASSIFIER_ID:
      return AbstractClass.class;
    case THEINTERFACE_CLASSIFIER_ID:
      return TheInterface.class;
    case CONCRETECLASS_CLASSIFIER_ID:
      return ConcreteClass.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
