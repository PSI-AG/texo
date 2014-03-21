package org.eclipse.emf.texo.test.model.schemaconstructs.anytype;

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
import org.eclipse.emf.texo.test.model.schemaconstructs.anytype.dao.ADao;
import org.eclipse.emf.texo.test.model.schemaconstructs.anytype.dao.BDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.anytype.dao.CDao;
import org.eclipse.emf.texo.test.model.schemaconstructs.anytype.dao.TestAnyDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>anytype</b></em>'. It contains initialization code and access to the Factory
 * to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class AnytypeModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/schemaconstructs/anytype";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final AnytypeModelFactory MODELFACTORY = new AnytypeModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int A_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int A_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int A_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int A_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int A_DOUB_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int A_LON_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int A_MYB_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int B_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int B_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int B_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int B_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int C_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int C_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int C_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTANY_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTANY_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTANY_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTANY_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTANY_SINGLEANYTYPE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTANY_MULTIANYTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTANY_A_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTANY_MYANY_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TESTANY_ANY_FEATURE_ID = 7;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final AnytypeModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static AnytypeModelPackage initialize() {

    if (isInitialized) {
      return (AnytypeModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final AnytypeModelPackage modelPackage = new AnytypeModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(A.class, modelPackage.getAEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(B.class, modelPackage.getBEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(C.class, modelPackage.getCEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TestAny.class, modelPackage.getTestAnyEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(A.class, ADao.class);
    DaoRegistry.getInstance().registerDao(B.class, BDao.class);
    DaoRegistry.getInstance().registerDao(C.class, CDao.class);
    DaoRegistry.getInstance().registerDao(TestAny.class, TestAnyDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link AnytypeModelFactory} instance.
   * @generated
   */
  @Override
  public AnytypeModelFactory getModelFactory() {
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
    return "anytype.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>A</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>A</b></em>'
   * @generated
   */
  public EClass getAEClass() {
    return (EClass) getEPackage().getEClassifiers().get(A_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>A.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>A.name</b></em>'.
   * @generated
   */
  public EAttribute getA_Name() {
    return (EAttribute) getAEClass().getEAllStructuralFeatures().get(A_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>A.doub</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>A.doub</b></em>'.
   * @generated
   */
  public EAttribute getA_Doub() {
    return (EAttribute) getAEClass().getEAllStructuralFeatures().get(A_DOUB_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>A.lon</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>A.lon</b></em>'.
   * @generated
   */
  public EAttribute getA_Lon() {
    return (EAttribute) getAEClass().getEAllStructuralFeatures().get(A_LON_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>A.myB</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>A.myB</b></em>'.
   * @generated
   */
  public EReference getA_MyB() {
    return (EReference) getAEClass().getEAllStructuralFeatures().get(A_MYB_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>B</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>B</b></em>'
   * @generated
   */
  public EClass getBEClass() {
    return (EClass) getEPackage().getEClassifiers().get(B_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>B.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>B.name</b></em>'.
   * @generated
   */
  public EAttribute getB_Name() {
    return (EAttribute) getBEClass().getEAllStructuralFeatures().get(B_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>C</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>C</b></em>'
   * @generated
   */
  public EClass getCEClass() {
    return (EClass) getEPackage().getEClassifiers().get(C_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TestAny</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TestAny</b></em>'
   * @generated
   */
  public EClass getTestAnyEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TESTANY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TestAny.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TestAny.name</b></em>'.
   * @generated
   */
  public EAttribute getTestAny_Name() {
    return (EAttribute) getTestAnyEClass().getEAllStructuralFeatures().get(TESTANY_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TestAny.singleAnyType</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TestAny.singleAnyType</b></em>'.
   * @generated
   */
  public EReference getTestAny_SingleAnyType() {
    return (EReference) getTestAnyEClass().getEAllStructuralFeatures().get(TESTANY_SINGLEANYTYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TestAny.multiAnyType</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TestAny.multiAnyType</b></em>'.
   * @generated
   */
  public EReference getTestAny_MultiAnyType() {
    return (EReference) getTestAnyEClass().getEAllStructuralFeatures().get(TESTANY_MULTIANYTYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TestAny.a</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TestAny.a</b></em>'.
   * @generated
   */
  public EAttribute getTestAny_A() {
    return (EAttribute) getTestAnyEClass().getEAllStructuralFeatures().get(TESTANY_A_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TestAny.myAny</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TestAny.myAny</b></em>'.
   * @generated
   */
  public EAttribute getTestAny_MyAny() {
    return (EAttribute) getTestAnyEClass().getEAllStructuralFeatures().get(TESTANY_MYANY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TestAny.any</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TestAny.any</b></em>'.
   * @generated
   */
  public EAttribute getTestAny_Any() {
    return (EAttribute) getTestAnyEClass().getEAllStructuralFeatures().get(TESTANY_ANY_FEATURE_ID);
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
    case A_CLASSIFIER_ID:
      return A.class;
    case B_CLASSIFIER_ID:
      return B.class;
    case C_CLASSIFIER_ID:
      return C.class;
    case TESTANY_CLASSIFIER_ID:
      return TestAny.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
