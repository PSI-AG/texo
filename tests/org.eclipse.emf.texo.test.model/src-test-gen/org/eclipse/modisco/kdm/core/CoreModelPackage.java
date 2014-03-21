package org.eclipse.modisco.kdm.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.modisco.kdm.KdmModelPackage;
import org.eclipse.modisco.kdm.core.dao.AggregatedRelationshipDao;
import org.eclipse.modisco.kdm.core.dao.ElementDao;
import org.eclipse.modisco.kdm.core.dao.KDMEntityDao;
import org.eclipse.modisco.kdm.core.dao.KDMRelationshipDao;
import org.eclipse.modisco.kdm.core.dao.ModelElementDao;

/**
 * The <b>Package</b> for the model '<em><b>core</b></em>'. It contains initialization code and access to the Factory to
 * instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The Core package provides basic constructs for
 * creating and describing meta-model classes in all specific KDM packages. Classes of the Core package determine the
 * structure of KDM models, define fundamental modeling constraints, and determine the reflective API to KDM instances.
 * <!-- end-model-doc -->
 * 
 * @generated
 */
public class CoreModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/MoDisco/kdm/core";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final CoreModelFactory MODELFACTORY = new CoreModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int STRING_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INTEGER_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOOLEAN_CLASSIFIER_ID = 7;

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
  public static final int ELEMENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELEMENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MODELELEMENT_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MODELELEMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MODELELEMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MODELELEMENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MODELELEMENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MODELELEMENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MODELELEMENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMENTITY_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMRELATIONSHIP_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMRELATIONSHIP_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMRELATIONSHIP_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMRELATIONSHIP_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMRELATIONSHIP_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMRELATIONSHIP_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KDMRELATIONSHIP_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AGGREGATEDRELATIONSHIP_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AGGREGATEDRELATIONSHIP_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AGGREGATEDRELATIONSHIP_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AGGREGATEDRELATIONSHIP_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AGGREGATEDRELATIONSHIP_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AGGREGATEDRELATIONSHIP_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AGGREGATEDRELATIONSHIP_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AGGREGATEDRELATIONSHIP_FROM_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AGGREGATEDRELATIONSHIP_TO_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AGGREGATEDRELATIONSHIP_RELATION_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int AGGREGATEDRELATIONSHIP_DENSITY_FEATURE_ID = 9;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final CoreModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static CoreModelPackage initialize() {

    if (isInitialized) {
      return (CoreModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final CoreModelPackage modelPackage = new CoreModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    isInitialized = true;

    KdmModelPackage.initialize();
    IdentifiableModelPackage.initialize();
    org.eclipse.modisco.kdm.kdm.KdmModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Element.class, modelPackage.getElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ModelElement.class, modelPackage.getModelElementEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(KDMEntity.class, modelPackage.getKDMEntityEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(KDMRelationship.class,
        modelPackage.getKDMRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AggregatedRelationship.class,
        modelPackage.getAggregatedRelationshipEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(Element.class, ElementDao.class);
    DaoRegistry.getInstance().registerDao(ModelElement.class, ModelElementDao.class);
    DaoRegistry.getInstance().registerDao(KDMEntity.class, KDMEntityDao.class);
    DaoRegistry.getInstance().registerDao(KDMRelationship.class, KDMRelationshipDao.class);
    DaoRegistry.getInstance().registerDao(AggregatedRelationship.class, AggregatedRelationshipDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link CoreModelFactory} instance.
   * @generated
   */
  @Override
  public CoreModelFactory getModelFactory() {
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
    return "core.ecore";
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
   * Returns the {@link EStructuralFeature} '<em><b>Element.attribute</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Element.attribute</b></em>'.
   * @generated
   */
  public EReference getElement_Attribute() {
    return (EReference) getElementEClass().getEAllStructuralFeatures().get(ELEMENT_ATTRIBUTE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Element.annotation</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Element.annotation</b></em>'.
   * @generated
   */
  public EReference getElement_Annotation() {
    return (EReference) getElementEClass().getEAllStructuralFeatures().get(ELEMENT_ANNOTATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ModelElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ModelElement</b></em>'
   * @generated
   */
  public EClass getModelElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MODELELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ModelElement.stereotype</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ModelElement.stereotype</b></em>'.
   * @generated
   */
  public EReference getModelElement_Stereotype() {
    return (EReference) getModelElementEClass().getEAllStructuralFeatures().get(MODELELEMENT_STEREOTYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ModelElement.taggedValue</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ModelElement.taggedValue</b></em>'.
   * @generated
   */
  public EReference getModelElement_TaggedValue() {
    return (EReference) getModelElementEClass().getEAllStructuralFeatures().get(MODELELEMENT_TAGGEDVALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>KDMEntity</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>KDMEntity</b></em>'
   * @generated
   */
  public EClass getKDMEntityEClass() {
    return (EClass) getEPackage().getEClassifiers().get(KDMENTITY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KDMEntity.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KDMEntity.name</b></em>'.
   * @generated
   */
  public EAttribute getKDMEntity_Name() {
    return (EAttribute) getKDMEntityEClass().getEAllStructuralFeatures().get(KDMENTITY_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KDMEntity.model</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KDMEntity.model</b></em>'.
   * @generated
   */
  public EReference getKDMEntity_Model() {
    return (EReference) getKDMEntityEClass().getEAllStructuralFeatures().get(KDMENTITY_MODEL_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KDMEntity.owner</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KDMEntity.owner</b></em>'.
   * @generated
   */
  public EReference getKDMEntity_Owner() {
    return (EReference) getKDMEntityEClass().getEAllStructuralFeatures().get(KDMENTITY_OWNER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KDMEntity.ownedElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KDMEntity.ownedElement</b></em>'.
   * @generated
   */
  public EReference getKDMEntity_OwnedElement() {
    return (EReference) getKDMEntityEClass().getEAllStructuralFeatures().get(KDMENTITY_OWNEDELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KDMEntity.outbound</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KDMEntity.outbound</b></em>'.
   * @generated
   */
  public EReference getKDMEntity_Outbound() {
    return (EReference) getKDMEntityEClass().getEAllStructuralFeatures().get(KDMENTITY_OUTBOUND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KDMEntity.inbound</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KDMEntity.inbound</b></em>'.
   * @generated
   */
  public EReference getKDMEntity_Inbound() {
    return (EReference) getKDMEntityEClass().getEAllStructuralFeatures().get(KDMENTITY_INBOUND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KDMEntity.ownedRelation</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KDMEntity.ownedRelation</b></em>'.
   * @generated
   */
  public EReference getKDMEntity_OwnedRelation() {
    return (EReference) getKDMEntityEClass().getEAllStructuralFeatures().get(KDMENTITY_OWNEDRELATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KDMEntity.group</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KDMEntity.group</b></em>'.
   * @generated
   */
  public EReference getKDMEntity_Group() {
    return (EReference) getKDMEntityEClass().getEAllStructuralFeatures().get(KDMENTITY_GROUP_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KDMEntity.groupedElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KDMEntity.groupedElement</b></em>'.
   * @generated
   */
  public EReference getKDMEntity_GroupedElement() {
    return (EReference) getKDMEntityEClass().getEAllStructuralFeatures().get(KDMENTITY_GROUPEDELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KDMEntity.inAggregated</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KDMEntity.inAggregated</b></em>'.
   * @generated
   */
  public EReference getKDMEntity_InAggregated() {
    return (EReference) getKDMEntityEClass().getEAllStructuralFeatures().get(KDMENTITY_INAGGREGATED_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KDMEntity.outAggregated</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KDMEntity.outAggregated</b></em>'.
   * @generated
   */
  public EReference getKDMEntity_OutAggregated() {
    return (EReference) getKDMEntityEClass().getEAllStructuralFeatures().get(KDMENTITY_OUTAGGREGATED_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>KDMRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>KDMRelationship</b></em>'
   * @generated
   */
  public EClass getKDMRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(KDMRELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AggregatedRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AggregatedRelationship</b></em>'
   * @generated
   */
  public EClass getAggregatedRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(AGGREGATEDRELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AggregatedRelationship.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AggregatedRelationship.from</b></em>'.
   * @generated
   */
  public EReference getAggregatedRelationship_From() {
    return (EReference) getAggregatedRelationshipEClass().getEAllStructuralFeatures().get(
        AGGREGATEDRELATIONSHIP_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AggregatedRelationship.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AggregatedRelationship.to</b></em>'.
   * @generated
   */
  public EReference getAggregatedRelationship_To() {
    return (EReference) getAggregatedRelationshipEClass().getEAllStructuralFeatures().get(
        AGGREGATEDRELATIONSHIP_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AggregatedRelationship.relation</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AggregatedRelationship.relation</b></em>'.
   * @generated
   */
  public EReference getAggregatedRelationship_Relation() {
    return (EReference) getAggregatedRelationshipEClass().getEAllStructuralFeatures().get(
        AGGREGATEDRELATIONSHIP_RELATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AggregatedRelationship.density</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AggregatedRelationship.density</b></em>'.
   * @generated
   */
  public EAttribute getAggregatedRelationship_Density() {
    return (EAttribute) getAggregatedRelationshipEClass().getEAllStructuralFeatures().get(
        AGGREGATEDRELATIONSHIP_DENSITY_FEATURE_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>String</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>String</b></em>'
   * @generated
   */
  public EDataType getStringEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(STRING_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>Integer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>Integer</b></em>'
   * @generated
   */
  public EDataType getIntegerEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(INTEGER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>Boolean</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>Boolean</b></em>'
   * @generated
   */
  public EDataType getBooleanEDataType() {
    return (EDataType) getEPackage().getEClassifiers().get(BOOLEAN_CLASSIFIER_ID);
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
    case MODELELEMENT_CLASSIFIER_ID:
      return ModelElement.class;
    case KDMENTITY_CLASSIFIER_ID:
      return KDMEntity.class;
    case KDMRELATIONSHIP_CLASSIFIER_ID:
      return KDMRelationship.class;
    case AGGREGATEDRELATIONSHIP_CLASSIFIER_ID:
      return AggregatedRelationship.class;
    case STRING_CLASSIFIER_ID:
      return String.class;
    case INTEGER_CLASSIFIER_ID:
      return Integer.class;
    case BOOLEAN_CLASSIFIER_ID:
      return Boolean.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
