package org.eclipse.emf.texo.test.model.samples.play;

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
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>play</b></em>'. It contains
 * initialization code and access to the Factory to instantiate types of this
 * package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PlayModelPackage extends ModelPackage {

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
	public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/play";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final PlayModelFactory MODELFACTORY = new PlayModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PINDEXTYPE_CLASSIFIER_ID = 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PINDEXTYPEOBJECT_CLASSIFIER_ID = 9;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACTTYPE_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACTTYPE_SCENE_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACTTYPE_PINDEX_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ACTTYPE_TITLE_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCENETYPE_CLASSIFIER_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCENETYPE_GROUP_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCENETYPE_STAGEDIRECTIONS_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCENETYPE_SPEECH_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCENETYPE_PINDEX_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCENETYPE_TITLE_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_MIXED_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_ACT_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_FM_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_GROUPDESCRIPTION_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_LINE_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_P_FEATURE_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_PERSONA_FEATURE_ID = 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_PERSONAE_FEATURE_ID = 9;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_PERSONAGROUP_FEATURE_ID = 10;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_PLAY_FEATURE_ID = 11;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_PLAYSUBTITLE_FEATURE_ID = 12;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_SCENE_FEATURE_ID = 13;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_SCENEDESCRIPTION_FEATURE_ID = 14;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_SPEAKER_FEATURE_ID = 15;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_SPEECH_FEATURE_ID = 16;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_STAGEDIRECTIONS_FEATURE_ID = 17;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENTROOT_TITLE_FEATURE_ID = 18;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int FMTYPE_CLASSIFIER_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int FMTYPE_P_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PERSONAETYPE_CLASSIFIER_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PERSONAETYPE_GROUP_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PERSONAETYPE_TITLE_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PERSONAETYPE_PERSONA_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PERSONAETYPE_PERSONAGROUP_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PERSONAGROUPTYPE_CLASSIFIER_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PERSONAGROUPTYPE_PERSONA_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PERSONAGROUPTYPE_GROUPDESCRIPTION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLAYTYPE_CLASSIFIER_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLAYTYPE_TITLE_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLAYTYPE_FM_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLAYTYPE_PERSONAE_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLAYTYPE_SCENEDESCRIPTION_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLAYTYPE_PLAYSUBTITLE_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLAYTYPE_ACT_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SPEECHTYPE_CLASSIFIER_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SPEECHTYPE_GROUP_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SPEECHTYPE_SPEAKER_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SPEECHTYPE_LINE_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SPEECHTYPE_STAGEDIRECTIONS_FEATURE_ID = 3;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final PlayModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static PlayModelPackage initialize() {

		if (isInitialized) {
			return (PlayModelPackage) ModelResolver.getInstance()
					.getModelPackage(NS_URI);
		}

		final PlayModelPackage modelPackage = new PlayModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		isInitialized = true;

		// force the initialization of the EFactory proxy
		modelPackage.getEPackage();

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(ActType.class,
				modelPackage.getActTypeEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(SceneType.class,
				modelPackage.getSceneTypeEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				DocumentRoot.class, modelPackage.getDocumentRootEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(FmType.class,
				modelPackage.getFmTypeEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				PersonaeType.class, modelPackage.getPersonaeTypeEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				PersonaGroupType.class,
				modelPackage.getPersonaGroupTypeEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(PlayType.class,
				modelPackage.getPlayTypeEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(SpeechType.class,
				modelPackage.getSpeechTypeEClass(), modelPackage);

		ModelResolver.getInstance().registerClassModelMapping(PindexType.class,
				modelPackage.getPindexTypeEEnum(), modelPackage);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the {@link PlayModelFactory} instance.
	 * @generated
	 */
	@Override
	public PlayModelFactory getModelFactory() {
		return MODELFACTORY;
	}

	/**
	 * Returns the nsUri of the {@link EPackage} managed by this Package
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the nsUri of the EPackage
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return NS_URI;
	}

	/**
	 * Returns the name of the ecore file containing the ecore model of the
	 * {@link EPackage} managed here. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the name of the ecore file
	 * @generated
	 */
	@Override
	public String getEcoreFileName() {
		return "play.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>ActType</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>ActType</b></em>'
	 * @generated
	 */
	public EClass getActTypeEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ACTTYPE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>ActType.scene</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ActType.scene</b></em>'.
	 * @generated
	 */
	public EReference getActType_Scene() {
		return (EReference) getActTypeEClass().getEAllStructuralFeatures().get(
				ACTTYPE_SCENE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>ActType.pindex</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ActType.pindex</b></em>'.
	 * @generated
	 */
	public EAttribute getActType_Pindex() {
		return (EAttribute) getActTypeEClass().getEAllStructuralFeatures().get(
				ACTTYPE_PINDEX_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>ActType.title</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ActType.title</b></em>'.
	 * @generated
	 */
	public EAttribute getActType_Title() {
		return (EAttribute) getActTypeEClass().getEAllStructuralFeatures().get(
				ACTTYPE_TITLE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>SceneType</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>SceneType</b></em>'
	 * @generated
	 */
	public EClass getSceneTypeEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				SCENETYPE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>SceneType.group</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>SceneType.group</b></em>'.
	 * @generated
	 */
	public EAttribute getSceneType_Group() {
		return (EAttribute) getSceneTypeEClass().getEAllStructuralFeatures()
				.get(SCENETYPE_GROUP_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>SceneType.stageDirections</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>SceneType.stageDirections</b></em>'.
	 * @generated
	 */
	public EAttribute getSceneType_StageDirections() {
		return (EAttribute) getSceneTypeEClass().getEAllStructuralFeatures()
				.get(SCENETYPE_STAGEDIRECTIONS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>SceneType.speech</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>SceneType.speech</b></em>'.
	 * @generated
	 */
	public EReference getSceneType_Speech() {
		return (EReference) getSceneTypeEClass().getEAllStructuralFeatures()
				.get(SCENETYPE_SPEECH_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>SceneType.pindex</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>SceneType.pindex</b></em>'.
	 * @generated
	 */
	public EAttribute getSceneType_Pindex() {
		return (EAttribute) getSceneTypeEClass().getEAllStructuralFeatures()
				.get(SCENETYPE_PINDEX_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>SceneType.title</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>SceneType.title</b></em>'.
	 * @generated
	 */
	public EAttribute getSceneType_Title() {
		return (EAttribute) getSceneTypeEClass().getEAllStructuralFeatures()
				.get(SCENETYPE_TITLE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>DocumentRoot</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>DocumentRoot</b></em>'
	 * @generated
	 */
	public EClass getDocumentRootEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				DOCUMENTROOT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>DocumentRoot.mixed</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.mixed</b></em>'.
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_MIXED_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>DocumentRoot.xMLNSPrefixMap</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.xMLNSPrefixMap</b></em>'.
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>DocumentRoot.xSISchemaLocation</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.xSISchemaLocation</b></em>'.
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.act</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.act</b></em>'.
	 * @generated
	 */
	public EReference getDocumentRoot_Act() {
		return (EReference) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_ACT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.fm</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.fm</b></em>'.
	 * @generated
	 */
	public EReference getDocumentRoot_Fm() {
		return (EReference) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_FM_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>DocumentRoot.groupDescription</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.groupDescription</b></em>'.
	 * @generated
	 */
	public EAttribute getDocumentRoot_GroupDescription() {
		return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_GROUPDESCRIPTION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.line</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.line</b></em>'.
	 * @generated
	 */
	public EAttribute getDocumentRoot_Line() {
		return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_LINE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.p</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.p</b></em>'.
	 * @generated
	 */
	public EAttribute getDocumentRoot_P() {
		return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_P_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>DocumentRoot.persona</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.persona</b></em>'.
	 * @generated
	 */
	public EAttribute getDocumentRoot_Persona() {
		return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_PERSONA_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>DocumentRoot.personae</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.personae</b></em>'.
	 * @generated
	 */
	public EReference getDocumentRoot_Personae() {
		return (EReference) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_PERSONAE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>DocumentRoot.personaGroup</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.personaGroup</b></em>'.
	 * @generated
	 */
	public EReference getDocumentRoot_PersonaGroup() {
		return (EReference) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_PERSONAGROUP_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>DocumentRoot.play</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.play</b></em>'.
	 * @generated
	 */
	public EReference getDocumentRoot_Play() {
		return (EReference) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_PLAY_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>DocumentRoot.playSubTitle</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.playSubTitle</b></em>'.
	 * @generated
	 */
	public EAttribute getDocumentRoot_PlaySubTitle() {
		return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_PLAYSUBTITLE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>DocumentRoot.scene</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.scene</b></em>'.
	 * @generated
	 */
	public EReference getDocumentRoot_Scene() {
		return (EReference) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_SCENE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>DocumentRoot.sceneDescription</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.sceneDescription</b></em>'.
	 * @generated
	 */
	public EAttribute getDocumentRoot_SceneDescription() {
		return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_SCENEDESCRIPTION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>DocumentRoot.speaker</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.speaker</b></em>'.
	 * @generated
	 */
	public EAttribute getDocumentRoot_Speaker() {
		return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_SPEAKER_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>DocumentRoot.speech</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.speech</b></em>'.
	 * @generated
	 */
	public EReference getDocumentRoot_Speech() {
		return (EReference) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_SPEECH_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>DocumentRoot.stageDirections</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.stageDirections</b></em>'.
	 * @generated
	 */
	public EAttribute getDocumentRoot_StageDirections() {
		return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_STAGEDIRECTIONS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>DocumentRoot.title</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>DocumentRoot.title</b></em>'.
	 * @generated
	 */
	public EAttribute getDocumentRoot_Title() {
		return (EAttribute) getDocumentRootEClass().getEAllStructuralFeatures()
				.get(DOCUMENTROOT_TITLE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>FmType</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>FmType</b></em>'
	 * @generated
	 */
	public EClass getFmTypeEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				FMTYPE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>FmType.p</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>FmType.p</b></em>'.
	 * @generated
	 */
	public EAttribute getFmType_P() {
		return (EAttribute) getFmTypeEClass().getEAllStructuralFeatures().get(
				FMTYPE_P_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>PersonaeType</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>PersonaeType</b></em>'
	 * @generated
	 */
	public EClass getPersonaeTypeEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				PERSONAETYPE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>PersonaeType.group</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>PersonaeType.group</b></em>'.
	 * @generated
	 */
	public EAttribute getPersonaeType_Group() {
		return (EAttribute) getPersonaeTypeEClass().getEAllStructuralFeatures()
				.get(PERSONAETYPE_GROUP_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>PersonaeType.title</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>PersonaeType.title</b></em>'.
	 * @generated
	 */
	public EAttribute getPersonaeType_Title() {
		return (EAttribute) getPersonaeTypeEClass().getEAllStructuralFeatures()
				.get(PERSONAETYPE_TITLE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>PersonaeType.persona</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>PersonaeType.persona</b></em>'.
	 * @generated
	 */
	public EAttribute getPersonaeType_Persona() {
		return (EAttribute) getPersonaeTypeEClass().getEAllStructuralFeatures()
				.get(PERSONAETYPE_PERSONA_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>PersonaeType.personaGroup</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>PersonaeType.personaGroup</b></em>'.
	 * @generated
	 */
	public EReference getPersonaeType_PersonaGroup() {
		return (EReference) getPersonaeTypeEClass().getEAllStructuralFeatures()
				.get(PERSONAETYPE_PERSONAGROUP_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>PersonaGroupType</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>PersonaGroupType</b></em>'
	 * @generated
	 */
	public EClass getPersonaGroupTypeEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				PERSONAGROUPTYPE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>PersonaGroupType.persona</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>PersonaGroupType.persona</b></em>'.
	 * @generated
	 */
	public EAttribute getPersonaGroupType_Persona() {
		return (EAttribute) getPersonaGroupTypeEClass()
				.getEAllStructuralFeatures().get(
						PERSONAGROUPTYPE_PERSONA_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>PersonaGroupType.groupDescription</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>PersonaGroupType.groupDescription</b></em>'.
	 * @generated
	 */
	public EAttribute getPersonaGroupType_GroupDescription() {
		return (EAttribute) getPersonaGroupTypeEClass()
				.getEAllStructuralFeatures().get(
						PERSONAGROUPTYPE_GROUPDESCRIPTION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>PlayType</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>PlayType</b></em>'
	 * @generated
	 */
	public EClass getPlayTypeEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				PLAYTYPE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>PlayType.title</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>PlayType.title</b></em>'.
	 * @generated
	 */
	public EAttribute getPlayType_Title() {
		return (EAttribute) getPlayTypeEClass().getEAllStructuralFeatures()
				.get(PLAYTYPE_TITLE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>PlayType.fm</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>PlayType.fm</b></em>'.
	 * @generated
	 */
	public EReference getPlayType_Fm() {
		return (EReference) getPlayTypeEClass().getEAllStructuralFeatures()
				.get(PLAYTYPE_FM_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>PlayType.personae</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>PlayType.personae</b></em>'.
	 * @generated
	 */
	public EReference getPlayType_Personae() {
		return (EReference) getPlayTypeEClass().getEAllStructuralFeatures()
				.get(PLAYTYPE_PERSONAE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>PlayType.sceneDescription</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>PlayType.sceneDescription</b></em>'.
	 * @generated
	 */
	public EAttribute getPlayType_SceneDescription() {
		return (EAttribute) getPlayTypeEClass().getEAllStructuralFeatures()
				.get(PLAYTYPE_SCENEDESCRIPTION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>PlayType.playSubTitle</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>PlayType.playSubTitle</b></em>'.
	 * @generated
	 */
	public EAttribute getPlayType_PlaySubTitle() {
		return (EAttribute) getPlayTypeEClass().getEAllStructuralFeatures()
				.get(PLAYTYPE_PLAYSUBTITLE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>PlayType.act</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>PlayType.act</b></em>'.
	 * @generated
	 */
	public EReference getPlayType_Act() {
		return (EReference) getPlayTypeEClass().getEAllStructuralFeatures()
				.get(PLAYTYPE_ACT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>SpeechType</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>SpeechType</b></em>'
	 * @generated
	 */
	public EClass getSpeechTypeEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				SPEECHTYPE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>SpeechType.group</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>SpeechType.group</b></em>'.
	 * @generated
	 */
	public EAttribute getSpeechType_Group() {
		return (EAttribute) getSpeechTypeEClass().getEAllStructuralFeatures()
				.get(SPEECHTYPE_GROUP_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>SpeechType.speaker</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>SpeechType.speaker</b></em>'.
	 * @generated
	 */
	public EAttribute getSpeechType_Speaker() {
		return (EAttribute) getSpeechTypeEClass().getEAllStructuralFeatures()
				.get(SPEECHTYPE_SPEAKER_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>SpeechType.line</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>SpeechType.line</b></em>'.
	 * @generated
	 */
	public EAttribute getSpeechType_Line() {
		return (EAttribute) getSpeechTypeEClass().getEAllStructuralFeatures()
				.get(SPEECHTYPE_LINE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>SpeechType.stageDirections</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>SpeechType.stageDirections</b></em>'.
	 * @generated
	 */
	public EAttribute getSpeechType_StageDirections() {
		return (EAttribute) getSpeechTypeEClass().getEAllStructuralFeatures()
				.get(SPEECHTYPE_STAGEDIRECTIONS_FEATURE_ID);
	}

	/**
	 * Returns the EEnum '<em><b>PindexType</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '<em><b>PindexType</b></em>
	 *         '
	 * @generated
	 */
	public EEnum getPindexTypeEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				PINDEXTYPE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EDataType} '<em><b>PindexTypeObject</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EDataType} representing '
	 *         <em><b>PindexTypeObject</b></em>'
	 * @generated
	 */
	public EDataType getPindexTypeObjectEDataType() {
		return (EDataType) getEPackage().getEClassifiers().get(
				PINDEXTYPEOBJECT_CLASSIFIER_ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eClassifier
	 *            the {@link EClassifier}
	 * @return the class implementing a specific {@link EClass}.
	 * @generated
	 */
	@Override
	public Class<?> getEClassifierClass(EClassifier eClassifier) {
		switch (eClassifier.getClassifierID()) {
		case ACTTYPE_CLASSIFIER_ID:
			return ActType.class;
		case SCENETYPE_CLASSIFIER_ID:
			return SceneType.class;
		case DOCUMENTROOT_CLASSIFIER_ID:
			return DocumentRoot.class;
		case FMTYPE_CLASSIFIER_ID:
			return FmType.class;
		case PERSONAETYPE_CLASSIFIER_ID:
			return PersonaeType.class;
		case PERSONAGROUPTYPE_CLASSIFIER_ID:
			return PersonaGroupType.class;
		case PLAYTYPE_CLASSIFIER_ID:
			return PlayType.class;
		case SPEECHTYPE_CLASSIFIER_ID:
			return SpeechType.class;
		case PINDEXTYPE_CLASSIFIER_ID:
			return PindexType.class;
		case PINDEXTYPEOBJECT_CLASSIFIER_ID:
			return PindexType.class;
		}
		throw new IllegalArgumentException("The EClassifier '" + eClassifier
				+ "' is not defined in this EPackage");
	}
}
