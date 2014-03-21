package org.eclipse.modisco.kdm.kdm;

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
import org.eclipse.modisco.kdm.core.CoreModelPackage;
import org.eclipse.modisco.kdm.kdm.dao.AnnotationDao;
import org.eclipse.modisco.kdm.kdm.dao.AttributeDao;
import org.eclipse.modisco.kdm.kdm.dao.AuditDao;
import org.eclipse.modisco.kdm.kdm.dao.ExtendedValueDao;
import org.eclipse.modisco.kdm.kdm.dao.ExtensionFamilyDao;
import org.eclipse.modisco.kdm.kdm.dao.KDMFrameworkDao;
import org.eclipse.modisco.kdm.kdm.dao.KDMModelDao;
import org.eclipse.modisco.kdm.kdm.dao.SegmentDao;
import org.eclipse.modisco.kdm.kdm.dao.StereotypeDao;
import org.eclipse.modisco.kdm.kdm.dao.TagDefinitionDao;
import org.eclipse.modisco.kdm.kdm.dao.TaggedRefDao;
import org.eclipse.modisco.kdm.kdm.dao.TaggedValueDao;

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
  public static final String NS_URI = "http://www.eclipse.org/MoDisco/kdm/kdm";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final KdmModelFactory MODELFACTORY = new KdmModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ATTRIBUTE_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ATTRIBUTE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ATTRIBUTE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ATTRIBUTE_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ATTRIBUTE_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ATTRIBUTE_TAG_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ATTRIBUTE_VALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANNOTATION_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANNOTATION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANNOTATION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANNOTATION_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANNOTATION_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANNOTATION_TEXT_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STEREOTYPE_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STEREOTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STEREOTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STEREOTYPE_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STEREOTYPE_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STEREOTYPE_TAG_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STEREOTYPE_NAME_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STEREOTYPE_TYPE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDVALUE_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDVALUE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDVALUE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDVALUE_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDVALUE_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDVALUE_TAG_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMMODEL_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMMODEL_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMMODEL_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMMODEL_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMMODEL_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMMODEL_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMMODEL_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMMODEL_AUDIT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMMODEL_EXTENSION_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMMODEL_NAME_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMMODEL_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMFRAMEWORK_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMFRAMEWORK_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMFRAMEWORK_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMFRAMEWORK_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMFRAMEWORK_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMFRAMEWORK_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMFRAMEWORK_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMFRAMEWORK_AUDIT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMFRAMEWORK_EXTENSION_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMFRAMEWORK_NAME_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIT_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIT_DESCRIPTION_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIT_AUTHOR_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AUDIT_DATE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONFAMILY_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONFAMILY_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONFAMILY_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONFAMILY_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONFAMILY_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONFAMILY_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONFAMILY_NAME_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEGMENT_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEGMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEGMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEGMENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEGMENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEGMENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEGMENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEGMENT_AUDIT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEGMENT_EXTENSION_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEGMENT_NAME_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEGMENT_SEGMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEGMENT_MODEL_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGDEFINITION_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGDEFINITION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGDEFINITION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGDEFINITION_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGDEFINITION_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGDEFINITION_TAG_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGDEFINITION_TYPE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGGEDVALUE_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGGEDVALUE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGGEDVALUE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGGEDVALUE_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGGEDVALUE_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGGEDVALUE_TAG_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGGEDVALUE_VALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGGEDREF_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGGEDREF_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGGEDREF_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGGEDREF_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGGEDREF_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGGEDREF_TAG_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TAGGEDREF_REF_FEATURE_ID = 5;

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

    isInitialized = true;

    org.eclipse.modisco.kdm.KdmModelPackage.initialize();
    CoreModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Attribute.class, modelPackage.getAttributeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Annotation.class, modelPackage.getAnnotationEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Stereotype.class, modelPackage.getStereotypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ExtendedValue.class, modelPackage.getExtendedValueEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(KDMModel.class, modelPackage.getKDMModelEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(KDMFramework.class, modelPackage.getKDMFrameworkEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Audit.class, modelPackage.getAuditEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ExtensionFamily.class,
        modelPackage.getExtensionFamilyEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Segment.class, modelPackage.getSegmentEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TagDefinition.class, modelPackage.getTagDefinitionEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TaggedValue.class, modelPackage.getTaggedValueEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TaggedRef.class, modelPackage.getTaggedRefEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(Attribute.class, AttributeDao.class);
    DaoRegistry.getInstance().registerDao(Annotation.class, AnnotationDao.class);
    DaoRegistry.getInstance().registerDao(Stereotype.class, StereotypeDao.class);
    DaoRegistry.getInstance().registerDao(ExtendedValue.class, ExtendedValueDao.class);
    DaoRegistry.getInstance().registerDao(KDMModel.class, KDMModelDao.class);
    DaoRegistry.getInstance().registerDao(KDMFramework.class, KDMFrameworkDao.class);
    DaoRegistry.getInstance().registerDao(Audit.class, AuditDao.class);
    DaoRegistry.getInstance().registerDao(ExtensionFamily.class, ExtensionFamilyDao.class);
    DaoRegistry.getInstance().registerDao(Segment.class, SegmentDao.class);
    DaoRegistry.getInstance().registerDao(TagDefinition.class, TagDefinitionDao.class);
    DaoRegistry.getInstance().registerDao(TaggedValue.class, TaggedValueDao.class);
    DaoRegistry.getInstance().registerDao(TaggedRef.class, TaggedRefDao.class);

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
   * Returns the {@link EClass} '<em><b>Attribute</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Attribute</b></em>'
   * @generated
   */
  public EClass getAttributeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ATTRIBUTE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Attribute.tag</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Attribute.tag</b></em>'.
   * @generated
   */
  public EAttribute getAttribute_Tag() {
    return (EAttribute) getAttributeEClass().getEAllStructuralFeatures().get(ATTRIBUTE_TAG_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Attribute.value</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Attribute.value</b></em>'.
   * @generated
   */
  public EAttribute getAttribute_Value() {
    return (EAttribute) getAttributeEClass().getEAllStructuralFeatures().get(ATTRIBUTE_VALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Annotation</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Annotation</b></em>'
   * @generated
   */
  public EClass getAnnotationEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ANNOTATION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Annotation.text</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Annotation.text</b></em>'.
   * @generated
   */
  public EAttribute getAnnotation_Text() {
    return (EAttribute) getAnnotationEClass().getEAllStructuralFeatures().get(ANNOTATION_TEXT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Stereotype</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Stereotype</b></em>'
   * @generated
   */
  public EClass getStereotypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(STEREOTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Stereotype.tag</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Stereotype.tag</b></em>'.
   * @generated
   */
  public EReference getStereotype_Tag() {
    return (EReference) getStereotypeEClass().getEAllStructuralFeatures().get(STEREOTYPE_TAG_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Stereotype.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Stereotype.name</b></em>'.
   * @generated
   */
  public EAttribute getStereotype_Name() {
    return (EAttribute) getStereotypeEClass().getEAllStructuralFeatures().get(STEREOTYPE_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Stereotype.type</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Stereotype.type</b></em>'.
   * @generated
   */
  public EAttribute getStereotype_Type() {
    return (EAttribute) getStereotypeEClass().getEAllStructuralFeatures().get(STEREOTYPE_TYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ExtendedValue</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ExtendedValue</b></em>'
   * @generated
   */
  public EClass getExtendedValueEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EXTENDEDVALUE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ExtendedValue.tag</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ExtendedValue.tag</b></em>'.
   * @generated
   */
  public EReference getExtendedValue_Tag() {
    return (EReference) getExtendedValueEClass().getEAllStructuralFeatures().get(EXTENDEDVALUE_TAG_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>KDMModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>KDMModel</b></em>'
   * @generated
   */
  public EClass getKDMModelEClass() {
    return (EClass) getEPackage().getEClassifiers().get(KDMMODEL_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KDMModel.ownedElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KDMModel.ownedElement</b></em>'.
   * @generated
   */
  public EReference getKDMModel_OwnedElement() {
    return (EReference) getKDMModelEClass().getEAllStructuralFeatures().get(KDMMODEL_OWNEDELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>KDMFramework</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>KDMFramework</b></em>'
   * @generated
   */
  public EClass getKDMFrameworkEClass() {
    return (EClass) getEPackage().getEClassifiers().get(KDMFRAMEWORK_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KDMFramework.audit</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KDMFramework.audit</b></em>'.
   * @generated
   */
  public EReference getKDMFramework_Audit() {
    return (EReference) getKDMFrameworkEClass().getEAllStructuralFeatures().get(KDMFRAMEWORK_AUDIT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KDMFramework.extension</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KDMFramework.extension</b></em>'.
   * @generated
   */
  public EReference getKDMFramework_Extension() {
    return (EReference) getKDMFrameworkEClass().getEAllStructuralFeatures().get(KDMFRAMEWORK_EXTENSION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KDMFramework.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KDMFramework.name</b></em>'.
   * @generated
   */
  public EAttribute getKDMFramework_Name() {
    return (EAttribute) getKDMFrameworkEClass().getEAllStructuralFeatures().get(KDMFRAMEWORK_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Audit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Audit</b></em>'
   * @generated
   */
  public EClass getAuditEClass() {
    return (EClass) getEPackage().getEClassifiers().get(AUDIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Audit.description</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Audit.description</b></em>'.
   * @generated
   */
  public EAttribute getAudit_Description() {
    return (EAttribute) getAuditEClass().getEAllStructuralFeatures().get(AUDIT_DESCRIPTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Audit.author</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Audit.author</b></em>'.
   * @generated
   */
  public EAttribute getAudit_Author() {
    return (EAttribute) getAuditEClass().getEAllStructuralFeatures().get(AUDIT_AUTHOR_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Audit.date</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Audit.date</b></em>'.
   * @generated
   */
  public EAttribute getAudit_Date() {
    return (EAttribute) getAuditEClass().getEAllStructuralFeatures().get(AUDIT_DATE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ExtensionFamily</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ExtensionFamily</b></em>'
   * @generated
   */
  public EClass getExtensionFamilyEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EXTENSIONFAMILY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ExtensionFamily.stereotype</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ExtensionFamily.stereotype</b></em>'.
   * @generated
   */
  public EReference getExtensionFamily_Stereotype() {
    return (EReference) getExtensionFamilyEClass().getEAllStructuralFeatures().get(
        EXTENSIONFAMILY_STEREOTYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ExtensionFamily.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ExtensionFamily.name</b></em>'.
   * @generated
   */
  public EAttribute getExtensionFamily_Name() {
    return (EAttribute) getExtensionFamilyEClass().getEAllStructuralFeatures().get(EXTENSIONFAMILY_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Segment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Segment</b></em>'
   * @generated
   */
  public EClass getSegmentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SEGMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Segment.segment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Segment.segment</b></em>'.
   * @generated
   */
  public EReference getSegment_Segment() {
    return (EReference) getSegmentEClass().getEAllStructuralFeatures().get(SEGMENT_SEGMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Segment.model</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Segment.model</b></em>'.
   * @generated
   */
  public EReference getSegment_Model() {
    return (EReference) getSegmentEClass().getEAllStructuralFeatures().get(SEGMENT_MODEL_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TagDefinition</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TagDefinition</b></em>'
   * @generated
   */
  public EClass getTagDefinitionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TAGDEFINITION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TagDefinition.tag</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TagDefinition.tag</b></em>'.
   * @generated
   */
  public EAttribute getTagDefinition_Tag() {
    return (EAttribute) getTagDefinitionEClass().getEAllStructuralFeatures().get(TAGDEFINITION_TAG_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TagDefinition.type</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TagDefinition.type</b></em>'.
   * @generated
   */
  public EAttribute getTagDefinition_Type() {
    return (EAttribute) getTagDefinitionEClass().getEAllStructuralFeatures().get(TAGDEFINITION_TYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TaggedValue</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TaggedValue</b></em>'
   * @generated
   */
  public EClass getTaggedValueEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TAGGEDVALUE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TaggedValue.value</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TaggedValue.value</b></em>'.
   * @generated
   */
  public EAttribute getTaggedValue_Value() {
    return (EAttribute) getTaggedValueEClass().getEAllStructuralFeatures().get(TAGGEDVALUE_VALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TaggedRef</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TaggedRef</b></em>'
   * @generated
   */
  public EClass getTaggedRefEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TAGGEDREF_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TaggedRef.ref</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TaggedRef.ref</b></em>'.
   * @generated
   */
  public EReference getTaggedRef_Ref() {
    return (EReference) getTaggedRefEClass().getEAllStructuralFeatures().get(TAGGEDREF_REF_FEATURE_ID);
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
    case ATTRIBUTE_CLASSIFIER_ID:
      return Attribute.class;
    case ANNOTATION_CLASSIFIER_ID:
      return Annotation.class;
    case STEREOTYPE_CLASSIFIER_ID:
      return Stereotype.class;
    case EXTENDEDVALUE_CLASSIFIER_ID:
      return ExtendedValue.class;
    case KDMMODEL_CLASSIFIER_ID:
      return KDMModel.class;
    case KDMFRAMEWORK_CLASSIFIER_ID:
      return KDMFramework.class;
    case AUDIT_CLASSIFIER_ID:
      return Audit.class;
    case EXTENSIONFAMILY_CLASSIFIER_ID:
      return ExtensionFamily.class;
    case SEGMENT_CLASSIFIER_ID:
      return Segment.class;
    case TAGDEFINITION_CLASSIFIER_ID:
      return TagDefinition.class;
    case TAGGEDVALUE_CLASSIFIER_ID:
      return TaggedValue.class;
    case TAGGEDREF_CLASSIFIER_ID:
      return TaggedRef.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
