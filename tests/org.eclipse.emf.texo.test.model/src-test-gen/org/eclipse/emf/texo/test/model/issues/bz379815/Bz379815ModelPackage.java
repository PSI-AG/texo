package org.eclipse.emf.texo.test.model.issues.bz379815;

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
import org.eclipse.emf.texo.test.model.issues.bz379815.dao.VarConditionTypeDao;
import org.eclipse.emf.texo.test.model.issues.bz379815.dao.VarInputTypeDao;
import org.eclipse.emf.texo.test.model.issues.bz379815.dao.VarPolicyTypeTypeDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>bz379815</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Bz379815ModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz379815";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz379815ModelFactory MODELFACTORY = new Bz379815ModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TYPETYPE_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TYPETYPEOBJECT_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VARINPUTTYPE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VARINPUTTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VARINPUTTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VARINPUTTYPE_CONDITION_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VARINPUTTYPE_MEASURE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VARCONDITIONTYPE_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VARCONDITIONTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VARCONDITIONTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VARCONDITIONTYPE_POLICYTYPE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VARPOLICYTYPETYPE_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VARPOLICYTYPETYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VARPOLICYTYPETYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int VARPOLICYTYPETYPE_TYPE_FEATURE_ID = 2;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final Bz379815ModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static Bz379815ModelPackage initialize() {

    if (isInitialized) {
      return (Bz379815ModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final Bz379815ModelPackage modelPackage = new Bz379815ModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(VarInputType.class, modelPackage.getVarInputTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(VarConditionType.class,
        modelPackage.getVarConditionTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(VarPolicyTypeType.class,
        modelPackage.getVarPolicyTypeTypeEClass(), modelPackage);

    ModelResolver.getInstance()
        .registerClassModelMapping(TypeType.class, modelPackage.getTypeTypeEEnum(), modelPackage);

    DaoRegistry.getInstance().registerDao(VarInputType.class, VarInputTypeDao.class);
    DaoRegistry.getInstance().registerDao(VarConditionType.class, VarConditionTypeDao.class);
    DaoRegistry.getInstance().registerDao(VarPolicyTypeType.class, VarPolicyTypeTypeDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link Bz379815ModelFactory} instance.
   * @generated
   */
  @Override
  public Bz379815ModelFactory getModelFactory() {
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
    return "bz379815.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>VarInputType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>VarInputType</b></em>'
   * @generated
   */
  public EClass getVarInputTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(VARINPUTTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>VarInputType.condition</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>VarInputType.condition</b></em>'.
   * @generated
   */
  public EReference getVarInputType_Condition() {
    return (EReference) getVarInputTypeEClass().getEAllStructuralFeatures().get(VARINPUTTYPE_CONDITION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>VarInputType.measure</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>VarInputType.measure</b></em>'.
   * @generated
   */
  public EAttribute getVarInputType_Measure() {
    return (EAttribute) getVarInputTypeEClass().getEAllStructuralFeatures().get(VARINPUTTYPE_MEASURE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>VarConditionType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>VarConditionType</b></em>'
   * @generated
   */
  public EClass getVarConditionTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(VARCONDITIONTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>VarConditionType.policyType</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>VarConditionType.policyType</b></em>'.
   * @generated
   */
  public EReference getVarConditionType_PolicyType() {
    return (EReference) getVarConditionTypeEClass().getEAllStructuralFeatures().get(
        VARCONDITIONTYPE_POLICYTYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>VarPolicyTypeType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>VarPolicyTypeType</b></em>'
   * @generated
   */
  public EClass getVarPolicyTypeTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(VARPOLICYTYPETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>VarPolicyTypeType.type</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>VarPolicyTypeType.type</b></em>'.
   * @generated
   */
  public EAttribute getVarPolicyTypeType_Type() {
    return (EAttribute) getVarPolicyTypeTypeEClass().getEAllStructuralFeatures().get(VARPOLICYTYPETYPE_TYPE_FEATURE_ID);
  }

  /**
   * Returns the EEnum '<em><b>TypeType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>TypeType</b></em>'
   * @generated
   */
  public EEnum getTypeTypeEEnum() {
    return (EEnum) getEPackage().getEClassifiers().get(TYPETYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>TypeTypeObject</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>TypeTypeObject</b></em>'
   * @generated
   */
  public EDataType getTypeTypeObjectEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(TYPETYPEOBJECT_CLASSIFIER_ID);
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
    case VARINPUTTYPE_CLASSIFIER_ID:
      return VarInputType.class;
    case VARCONDITIONTYPE_CLASSIFIER_ID:
      return VarConditionType.class;
    case VARPOLICYTYPETYPE_CLASSIFIER_ID:
      return VarPolicyTypeType.class;
    case TYPETYPE_CLASSIFIER_ID:
      return TypeType.class;
    case TYPETYPEOBJECT_CLASSIFIER_ID:
      return TypeType.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
