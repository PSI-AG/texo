package org.eclipse.emf.texo.test.model.schemaconstructs.list;

import java.util.List;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.schemaconstructs.list.dao.StatesByCountryDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>list</b></em>'. It contains initialization code and access to the Factory to
 * instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ListModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/schemaconstructs/list";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final ListModelFactory MODELFACTORY = new ListModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STATELIST_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STATE_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIXSTATESLIST_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRINGLIST_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ZIPCODE_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STATESBYCOUNTRY_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STATESBYCOUNTRY_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STATESBYCOUNTRY_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STATESBYCOUNTRY_COUNTRY_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STATESBYCOUNTRY_INDEX_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STATESBYCOUNTRY_ALLSTATES_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STATESBYCOUNTRY_SIXIMPORTANTSTATES_FEATURE_ID = 5;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final ListModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static ListModelPackage initialize() {

    if (isInitialized) {
      return (ListModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final ListModelPackage modelPackage = new ListModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(StatesByCountry.class,
        modelPackage.getStatesByCountryEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(StatesByCountry.class, StatesByCountryDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link ListModelFactory} instance.
   * @generated
   */
  @Override
  public ListModelFactory getModelFactory() {
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
    return "list.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>statesByCountry</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>statesByCountry</b></em>'
   * @generated
   */
  public EClass getStatesByCountryEClass() {
    return (EClass) getEPackage().getEClassifiers().get(STATESBYCOUNTRY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>statesByCountry.country</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>statesByCountry.country</b></em>'.
   * @generated
   */
  public EAttribute getStatesByCountry_Country() {
    return (EAttribute) getStatesByCountryEClass().getEAllStructuralFeatures().get(STATESBYCOUNTRY_COUNTRY_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>statesByCountry.index</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>statesByCountry.index</b></em>'.
   * @generated
   */
  public EAttribute getStatesByCountry_Index() {
    return (EAttribute) getStatesByCountryEClass().getEAllStructuralFeatures().get(STATESBYCOUNTRY_INDEX_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>statesByCountry.allStates</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>statesByCountry.allStates</b></em>'.
   * @generated
   */
  public EAttribute getStatesByCountry_AllStates() {
    return (EAttribute) getStatesByCountryEClass().getEAllStructuralFeatures()
        .get(STATESBYCOUNTRY_ALLSTATES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>statesByCountry.sixImportantStates</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>statesByCountry.sixImportantStates</b></em>'.
   * @generated
   */
  public EAttribute getStatesByCountry_SixImportantStates() {
    return (EAttribute) getStatesByCountryEClass().getEAllStructuralFeatures().get(
        STATESBYCOUNTRY_SIXIMPORTANTSTATES_FEATURE_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>StateList</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>StateList</b></em>'
   * @generated
   */
  public EDataType getStateListEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(STATELIST_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>State</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>State</b></em>'
   * @generated
   */
  public EDataType getStateEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(STATE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>SixStatesList</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>SixStatesList</b></em>'
   * @generated
   */
  public EDataType getSixStatesListEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(SIXSTATESLIST_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>StringList</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>StringList</b></em>'
   * @generated
   */
  public EDataType getStringListEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(STRINGLIST_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>ZipCode</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>ZipCode</b></em>'
   * @generated
   */
  public EDataType getZipCodeEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(ZIPCODE_CLASSIFIER_ID);
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
    case STATESBYCOUNTRY_CLASSIFIER_ID:
      return StatesByCountry.class;
    case STATELIST_CLASSIFIER_ID:
      return List.class;
    case STATE_CLASSIFIER_ID:
      return String.class;
    case SIXSTATESLIST_CLASSIFIER_ID:
      return List.class;
    case STRINGLIST_CLASSIFIER_ID:
      return List.class;
    case ZIPCODE_CLASSIFIER_ID:
      return String.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
