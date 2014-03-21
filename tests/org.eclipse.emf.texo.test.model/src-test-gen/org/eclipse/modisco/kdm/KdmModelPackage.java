package org.eclipse.modisco.kdm;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.build.BuildModelPackage;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.conceptual.ConceptualModelPackage;
import org.eclipse.modisco.kdm.core.CoreModelPackage;
import org.eclipse.modisco.kdm.data.DataModelPackage;
import org.eclipse.modisco.kdm.event.EventModelPackage;
import org.eclipse.modisco.kdm.platform.PlatformModelPackage;
import org.eclipse.modisco.kdm.source.SourceModelPackage;
import org.eclipse.modisco.kdm.structure.StructureModelPackage;
import org.eclipse.modisco.kdm.ui.UiModelPackage;

/**
 * The <b>Package</b> for the model '<em><b>kdm</b></em>'. It contains initialization code and access to the Factory to
 * instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class KdmModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/MoDisco/kdm";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final KdmModelFactory MODELFACTORY = new KdmModelFactory();

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final KdmModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static KdmModelPackage initialize() {

    if (isInitialized) {
      return (KdmModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final KdmModelPackage modelPackage = new KdmModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    CoreModelPackage.initialize();
    org.eclipse.modisco.kdm.kdm.KdmModelPackage.initialize();
    SourceModelPackage.initialize();
    CodeModelPackage.initialize();
    ActionModelPackage.initialize();
    PlatformModelPackage.initialize();
    BuildModelPackage.initialize();
    ConceptualModelPackage.initialize();
    DataModelPackage.initialize();
    EventModelPackage.initialize();
    StructureModelPackage.initialize();
    UiModelPackage.initialize();

    // register the relation between a Class and its EClassifier

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link KdmModelFactory} instance.
   * @generated
   */
  @Override
  public KdmModelFactory getModelFactory() {
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
    return "kdm.ecore";
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
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
