package org.eclipse.emf.texo.test.model.samples.play;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.AbstractModelObject;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model:
 * org.eclipse.emf.texo.test.model.samples.play. It contains code to create
 * instances {@link ModelObject} wrappers and instances for EClasses and convert
 * objects back and forth from their String (XML) representation. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PlayModelFactory implements ModelFactory {

	/**
	 * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param eClass
	 *            creates a Object instance for this EClass
	 * @return an object representing the eClass
	 * @generated
	 */
	public Object create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PlayModelPackage.ACTTYPE_CLASSIFIER_ID:
			return createActType();
		case PlayModelPackage.SCENETYPE_CLASSIFIER_ID:
			return createSceneType();
		case PlayModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
			return createDocumentRoot();
		case PlayModelPackage.FMTYPE_CLASSIFIER_ID:
			return createFmType();
		case PlayModelPackage.PERSONAETYPE_CLASSIFIER_ID:
			return createPersonaeType();
		case PlayModelPackage.PERSONAGROUPTYPE_CLASSIFIER_ID:
			return createPersonaGroupType();
		case PlayModelPackage.PLAYTYPE_CLASSIFIER_ID:
			return createPlayType();
		case PlayModelPackage.SPEECHTYPE_CLASSIFIER_ID:
			return createSpeechType();
		}
		throw new IllegalArgumentException("The EClass '" + eClass.getName()
				+ "' is not a valid EClass for this EPackage");
	}

	/**
	 * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param eClass
	 *            the EClass of the object
	 * @param adaptee
	 *            the object being wrapped/adapted
	 * @return the wrapper {@link ModelObject}
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ModelObject createModelObject(EClass eClass, Object adaptee) {
		ModelObject<Object> modelObject = null;
		switch (eClass.getClassifierID()) {
		case PlayModelPackage.ACTTYPE_CLASSIFIER_ID:
			modelObject = new ActTypeModelObject();
			break;
		case PlayModelPackage.SCENETYPE_CLASSIFIER_ID:
			modelObject = new SceneTypeModelObject();
			break;
		case PlayModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
			modelObject = new DocumentRootModelObject();
			break;
		case PlayModelPackage.FMTYPE_CLASSIFIER_ID:
			modelObject = new FmTypeModelObject();
			break;
		case PlayModelPackage.PERSONAETYPE_CLASSIFIER_ID:
			modelObject = new PersonaeTypeModelObject();
			break;
		case PlayModelPackage.PERSONAGROUPTYPE_CLASSIFIER_ID:
			modelObject = new PersonaGroupTypeModelObject();
			break;
		case PlayModelPackage.PLAYTYPE_CLASSIFIER_ID:
			modelObject = new PlayTypeModelObject();
			break;
		case PlayModelPackage.SPEECHTYPE_CLASSIFIER_ID:
			modelObject = new SpeechTypeModelObject();
			break;
		default:
			throw new IllegalArgumentException("The EClass '" + eClass
					+ "' is not defined in this EPackage");
		}
		modelObject.setTarget(adaptee);
		return modelObject;
	}

	/**
	 * Creates a feature map entry instance for a certain EStructuralFeature.
	 * 
	 * @param eStructuralFeature
	 *            the feature map feature
	 * @return the pojo feature map entry
	 * @generated
	 */
	public Object createFeatureMapEntry(EStructuralFeature eFeature) {
		if (eFeature == PlayModelPackage.INSTANCE.getSceneType_Group()) {
			return new SceneTypeGroupFeatureGroup();
		}
		if (eFeature == PlayModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
			return new DocumentRootMixedFeatureGroup();
		}
		if (eFeature == PlayModelPackage.INSTANCE.getPersonaeType_Group()) {
			return new PersonaeTypeGroupFeatureGroup();
		}
		if (eFeature == PlayModelPackage.INSTANCE.getSpeechType_Group()) {
			return new SpeechTypeGroupFeatureGroup();
		}
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}.
	 * If the feature map entry is null then a new one is created and <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eStructuralFeature
	 *            the feature map feature of the object
	 * @param adaptee
	 *            the pojo feature map entry being wrapped/adapted
	 * @return the wrapper {@link ModelFeatureMapEntry}
	 * @generated
	 */
	public ModelFeatureMapEntry<?> createModelFeatureMapEntry(
			EStructuralFeature eFeature, Object adaptee) {
		if (eFeature == PlayModelPackage.INSTANCE.getSceneType_Group()) {
			final SceneTypeGroupFeatureGroupModelFeatureMapEntry<SceneTypeGroupFeatureGroup> entry = new SceneTypeGroupFeatureGroupModelFeatureMapEntry<SceneTypeGroupFeatureGroup>();
			entry.setTarget((SceneTypeGroupFeatureGroup) adaptee);
			return entry;
		}
		if (eFeature == PlayModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
			final DocumentRootMixedFeatureGroupModelFeatureMapEntry<DocumentRootMixedFeatureGroup> entry = new DocumentRootMixedFeatureGroupModelFeatureMapEntry<DocumentRootMixedFeatureGroup>();
			entry.setTarget((DocumentRootMixedFeatureGroup) adaptee);
			return entry;
		}
		if (eFeature == PlayModelPackage.INSTANCE.getPersonaeType_Group()) {
			final PersonaeTypeGroupFeatureGroupModelFeatureMapEntry<PersonaeTypeGroupFeatureGroup> entry = new PersonaeTypeGroupFeatureGroupModelFeatureMapEntry<PersonaeTypeGroupFeatureGroup>();
			entry.setTarget((PersonaeTypeGroupFeatureGroup) adaptee);
			return entry;
		}
		if (eFeature == PlayModelPackage.INSTANCE.getSpeechType_Group()) {
			final SpeechTypeGroupFeatureGroupModelFeatureMapEntry<SpeechTypeGroupFeatureGroup> entry = new SpeechTypeGroupFeatureGroupModelFeatureMapEntry<SpeechTypeGroupFeatureGroup>();
			entry.setTarget((SpeechTypeGroupFeatureGroup) adaptee);
			return entry;
		}
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass ActType
	 * @generated
	 */
	public ActType createActType() {
		return new ActType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass SceneType
	 * @generated
	 */
	public SceneType createSceneType() {
		return new SceneType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         DocumentRoot
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		return new DocumentRoot();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass FmType
	 * @generated
	 */
	public FmType createFmType() {
		return new FmType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         PersonaeType
	 * @generated
	 */
	public PersonaeType createPersonaeType() {
		return new PersonaeType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         PersonaGroupType
	 * @generated
	 */
	public PersonaGroupType createPersonaGroupType() {
		return new PersonaGroupType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass PlayType
	 * @generated
	 */
	public PlayType createPlayType() {
		return new PlayType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         SpeechType
	 * @generated
	 */
	public SpeechType createSpeechType() {
		return new SpeechType();
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if the value is null then null is
	 *            returned.
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String value) {
		switch (eDataType.getClassifierID()) {
		case PlayModelPackage.PINDEXTYPE_CLASSIFIER_ID:
			return createPindexTypeFromString(value);
		case PlayModelPackage.PINDEXTYPEOBJECT_CLASSIFIER_ID:
			return createPindexTypeObjectFromString(value);
		}
		throw new IllegalArgumentException("The EDatatype '" + eDataType
				+ "' is not defined in this EPackage");
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if value == null then null is returned
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object value) {
		switch (eDataType.getClassifierID()) {
		case PlayModelPackage.PINDEXTYPE_CLASSIFIER_ID:
			return convertPindexTypeToString((PindexType) value);
		case PlayModelPackage.PINDEXTYPEOBJECT_CLASSIFIER_ID:
			return convertPindexTypeObjectToString((PindexType) value);
		}
		throw new IllegalArgumentException("The EDatatype '" + eDataType
				+ "' is not defined in this EPackage.");
	}

	/**
	 * Converts the EDataType: PindexType to a String. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertPindexTypeToString(PindexType value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: PindexType from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public PindexType createPindexTypeFromString(String value) {
		if (value == null) {
			return null;
		}
		return PindexType.get(value);
	}

	/**
	 * Converts the EDataType: PindexTypeObject to a String. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertPindexTypeObjectToString(PindexType value) {
		if (value == null) {
			return null;
		}
		return convertPindexTypeToString(value);
	}

	/**
	 * Creates an instance of the EDataType: PindexTypeObject from a String.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public PindexType createPindexTypeObjectFromString(String value) {
		if (value == null) {
			return null;
		}
		return createPindexTypeFromString(value);
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>ActType</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class ActTypeModelObject<E extends ActType> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return PlayModelPackage.INSTANCE.getActTypeEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return PlayModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PlayModelPackage.ACTTYPE_SCENE_FEATURE_ID:
				return getTarget().getScene();
			case PlayModelPackage.ACTTYPE_PINDEX_FEATURE_ID:
				return getTarget().getPindex();
			case PlayModelPackage.ACTTYPE_TITLE_FEATURE_ID:
				return getTarget().getTitle();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PlayModelPackage.ACTTYPE_SCENE_FEATURE_ID:
				getTarget().setScene((List<SceneType>) value);
				return;
			case PlayModelPackage.ACTTYPE_PINDEX_FEATURE_ID:
				getTarget().setPindex((Byte) value);
				return;
			case PlayModelPackage.ACTTYPE_TITLE_FEATURE_ID:
				getTarget().setTitle((String) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PlayModelPackage.ACTTYPE_SCENE_FEATURE_ID:
				getTarget().getScene().add((SceneType) value);
				return;

			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PlayModelPackage.ACTTYPE_SCENE_FEATURE_ID:
				getTarget().getScene().remove(value);
				return;

			}
			super.eRemoveFrom(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>SceneType</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class SceneTypeModelObject<E extends SceneType> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return PlayModelPackage.INSTANCE.getSceneTypeEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return PlayModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PlayModelPackage.SCENETYPE_GROUP_FEATURE_ID:
				return getTarget().getGroup();
			case PlayModelPackage.SCENETYPE_STAGEDIRECTIONS_FEATURE_ID:
				return getTarget().getStageDirections();
			case PlayModelPackage.SCENETYPE_SPEECH_FEATURE_ID:
				return getTarget().getSpeech();
			case PlayModelPackage.SCENETYPE_PINDEX_FEATURE_ID:
				return getTarget().getPindex();
			case PlayModelPackage.SCENETYPE_TITLE_FEATURE_ID:
				return getTarget().getTitle();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PlayModelPackage.SCENETYPE_GROUP_FEATURE_ID:
				getTarget().setGroup((List<SceneTypeGroupFeatureGroup>) value);
				return;
			case PlayModelPackage.SCENETYPE_STAGEDIRECTIONS_FEATURE_ID:
				getTarget().setStageDirections((List<String>) value);
				return;
			case PlayModelPackage.SCENETYPE_SPEECH_FEATURE_ID:
				getTarget().setSpeech((List<SpeechType>) value);
				return;
			case PlayModelPackage.SCENETYPE_PINDEX_FEATURE_ID:
				getTarget().setPindex((PindexType) value);
				return;
			case PlayModelPackage.SCENETYPE_TITLE_FEATURE_ID:
				getTarget().setTitle((String) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PlayModelPackage.SCENETYPE_GROUP_FEATURE_ID:
				getTarget().getGroup().add((SceneTypeGroupFeatureGroup) value);
				return;

			case PlayModelPackage.SCENETYPE_STAGEDIRECTIONS_FEATURE_ID:
				getTarget().getStageDirections().add((String) value);
				return;

			case PlayModelPackage.SCENETYPE_SPEECH_FEATURE_ID:
				getTarget().getSpeech().add((SpeechType) value);
				return;

			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PlayModelPackage.SCENETYPE_GROUP_FEATURE_ID:
				getTarget().getGroup().remove(value);
				return;

			case PlayModelPackage.SCENETYPE_STAGEDIRECTIONS_FEATURE_ID:
				getTarget().getStageDirections().remove(value);
				return;

			case PlayModelPackage.SCENETYPE_SPEECH_FEATURE_ID:
				getTarget().getSpeech().remove(value);
				return;

			}
			super.eRemoveFrom(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>DocumentRoot</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class DocumentRootModelObject<E extends DocumentRoot> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return PlayModelPackage.INSTANCE.getDocumentRootEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return PlayModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PlayModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
				return getTarget().getMixed();
			case PlayModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
				return getTarget().getXMLNSPrefixMap();
			case PlayModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
				return getTarget().getXSISchemaLocation();
			case PlayModelPackage.DOCUMENTROOT_ACT_FEATURE_ID:
				return getTarget().getAct();
			case PlayModelPackage.DOCUMENTROOT_FM_FEATURE_ID:
				return getTarget().getFm();
			case PlayModelPackage.DOCUMENTROOT_GROUPDESCRIPTION_FEATURE_ID:
				return getTarget().getGroupDescription();
			case PlayModelPackage.DOCUMENTROOT_LINE_FEATURE_ID:
				return getTarget().getLine();
			case PlayModelPackage.DOCUMENTROOT_P_FEATURE_ID:
				return getTarget().getP();
			case PlayModelPackage.DOCUMENTROOT_PERSONA_FEATURE_ID:
				return getTarget().getPersona();
			case PlayModelPackage.DOCUMENTROOT_PERSONAE_FEATURE_ID:
				return getTarget().getPersonae();
			case PlayModelPackage.DOCUMENTROOT_PERSONAGROUP_FEATURE_ID:
				return getTarget().getPersonaGroup();
			case PlayModelPackage.DOCUMENTROOT_PLAY_FEATURE_ID:
				return getTarget().getPlay();
			case PlayModelPackage.DOCUMENTROOT_PLAYSUBTITLE_FEATURE_ID:
				return getTarget().getPlaySubTitle();
			case PlayModelPackage.DOCUMENTROOT_SCENE_FEATURE_ID:
				return getTarget().getScene();
			case PlayModelPackage.DOCUMENTROOT_SCENEDESCRIPTION_FEATURE_ID:
				return getTarget().getSceneDescription();
			case PlayModelPackage.DOCUMENTROOT_SPEAKER_FEATURE_ID:
				return getTarget().getSpeaker();
			case PlayModelPackage.DOCUMENTROOT_SPEECH_FEATURE_ID:
				return getTarget().getSpeech();
			case PlayModelPackage.DOCUMENTROOT_STAGEDIRECTIONS_FEATURE_ID:
				return getTarget().getStageDirections();
			case PlayModelPackage.DOCUMENTROOT_TITLE_FEATURE_ID:
				return getTarget().getTitle();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PlayModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
				getTarget().setMixed(
						(List<DocumentRootMixedFeatureGroup>) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
				getTarget().setXMLNSPrefixMap((Map<String, String>) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
				getTarget().setXSISchemaLocation((Map<String, String>) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_ACT_FEATURE_ID:
				getTarget().setAct((ActType) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_FM_FEATURE_ID:
				getTarget().setFm((FmType) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_GROUPDESCRIPTION_FEATURE_ID:
				getTarget().setGroupDescription((String) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_LINE_FEATURE_ID:
				getTarget().setLine((String) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_P_FEATURE_ID:
				getTarget().setP((String) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_PERSONA_FEATURE_ID:
				getTarget().setPersona((String) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_PERSONAE_FEATURE_ID:
				getTarget().setPersonae((PersonaeType) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_PERSONAGROUP_FEATURE_ID:
				getTarget().setPersonaGroup((PersonaGroupType) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_PLAY_FEATURE_ID:
				getTarget().setPlay((PlayType) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_PLAYSUBTITLE_FEATURE_ID:
				getTarget().setPlaySubTitle((String) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_SCENE_FEATURE_ID:
				getTarget().setScene((SceneType) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_SCENEDESCRIPTION_FEATURE_ID:
				getTarget().setSceneDescription((String) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_SPEAKER_FEATURE_ID:
				getTarget().setSpeaker((String) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_SPEECH_FEATURE_ID:
				getTarget().setSpeech((SpeechType) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_STAGEDIRECTIONS_FEATURE_ID:
				getTarget().setStageDirections((String) value);
				return;
			case PlayModelPackage.DOCUMENTROOT_TITLE_FEATURE_ID:
				getTarget().setTitle((String) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PlayModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
				getTarget().getMixed().add(
						(DocumentRootMixedFeatureGroup) value);
				return;

			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PlayModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
				getTarget().getMixed().remove(value);
				return;

			}
			super.eRemoveFrom(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>FmType</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class FmTypeModelObject<E extends FmType> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return PlayModelPackage.INSTANCE.getFmTypeEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return PlayModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PlayModelPackage.FMTYPE_P_FEATURE_ID:
				return getTarget().getP();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PlayModelPackage.FMTYPE_P_FEATURE_ID:
				getTarget().setP((List<String>) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PlayModelPackage.FMTYPE_P_FEATURE_ID:
				getTarget().getP().add((String) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PlayModelPackage.FMTYPE_P_FEATURE_ID:
				getTarget().getP().remove(value);
				return;
			}
			super.eRemoveFrom(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>PersonaeType</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class PersonaeTypeModelObject<E extends PersonaeType> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return PlayModelPackage.INSTANCE.getPersonaeTypeEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return PlayModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PlayModelPackage.PERSONAETYPE_GROUP_FEATURE_ID:
				return getTarget().getGroup();
			case PlayModelPackage.PERSONAETYPE_TITLE_FEATURE_ID:
				return getTarget().getTitle();
			case PlayModelPackage.PERSONAETYPE_PERSONA_FEATURE_ID:
				return getTarget().getPersona();
			case PlayModelPackage.PERSONAETYPE_PERSONAGROUP_FEATURE_ID:
				return getTarget().getPersonaGroup();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PlayModelPackage.PERSONAETYPE_GROUP_FEATURE_ID:
				getTarget().setGroup(
						(List<PersonaeTypeGroupFeatureGroup>) value);
				return;
			case PlayModelPackage.PERSONAETYPE_TITLE_FEATURE_ID:
				getTarget().setTitle((List<String>) value);
				return;
			case PlayModelPackage.PERSONAETYPE_PERSONA_FEATURE_ID:
				getTarget().setPersona((List<String>) value);
				return;
			case PlayModelPackage.PERSONAETYPE_PERSONAGROUP_FEATURE_ID:
				getTarget().setPersonaGroup((List<PersonaGroupType>) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PlayModelPackage.PERSONAETYPE_GROUP_FEATURE_ID:
				getTarget().getGroup().add(
						(PersonaeTypeGroupFeatureGroup) value);
				return;

			case PlayModelPackage.PERSONAETYPE_TITLE_FEATURE_ID:
				getTarget().getTitle().add((String) value);
				return;

			case PlayModelPackage.PERSONAETYPE_PERSONA_FEATURE_ID:
				getTarget().getPersona().add((String) value);
				return;

			case PlayModelPackage.PERSONAETYPE_PERSONAGROUP_FEATURE_ID:
				getTarget().getPersonaGroup().add((PersonaGroupType) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PlayModelPackage.PERSONAETYPE_GROUP_FEATURE_ID:
				getTarget().getGroup().remove(value);
				return;

			case PlayModelPackage.PERSONAETYPE_TITLE_FEATURE_ID:
				getTarget().getTitle().remove(value);
				return;

			case PlayModelPackage.PERSONAETYPE_PERSONA_FEATURE_ID:
				getTarget().getPersona().remove(value);
				return;

			case PlayModelPackage.PERSONAETYPE_PERSONAGROUP_FEATURE_ID:
				getTarget().getPersonaGroup().remove(value);
				return;
			}
			super.eRemoveFrom(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>PersonaGroupType</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class PersonaGroupTypeModelObject<E extends PersonaGroupType>
			extends AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return PlayModelPackage.INSTANCE.getPersonaGroupTypeEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return PlayModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PlayModelPackage.PERSONAGROUPTYPE_PERSONA_FEATURE_ID:
				return getTarget().getPersona();
			case PlayModelPackage.PERSONAGROUPTYPE_GROUPDESCRIPTION_FEATURE_ID:
				return getTarget().getGroupDescription();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PlayModelPackage.PERSONAGROUPTYPE_PERSONA_FEATURE_ID:
				getTarget().setPersona((List<String>) value);
				return;
			case PlayModelPackage.PERSONAGROUPTYPE_GROUPDESCRIPTION_FEATURE_ID:
				getTarget().setGroupDescription((String) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PlayModelPackage.PERSONAGROUPTYPE_PERSONA_FEATURE_ID:
				getTarget().getPersona().add((String) value);
				return;

			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PlayModelPackage.PERSONAGROUPTYPE_PERSONA_FEATURE_ID:
				getTarget().getPersona().remove(value);
				return;

			}
			super.eRemoveFrom(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>PlayType</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class PlayTypeModelObject<E extends PlayType> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return PlayModelPackage.INSTANCE.getPlayTypeEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return PlayModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PlayModelPackage.PLAYTYPE_TITLE_FEATURE_ID:
				return getTarget().getTitle();
			case PlayModelPackage.PLAYTYPE_FM_FEATURE_ID:
				return getTarget().getFm();
			case PlayModelPackage.PLAYTYPE_PERSONAE_FEATURE_ID:
				return getTarget().getPersonae();
			case PlayModelPackage.PLAYTYPE_SCENEDESCRIPTION_FEATURE_ID:
				return getTarget().getSceneDescription();
			case PlayModelPackage.PLAYTYPE_PLAYSUBTITLE_FEATURE_ID:
				return getTarget().getPlaySubTitle();
			case PlayModelPackage.PLAYTYPE_ACT_FEATURE_ID:
				return getTarget().getAct();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PlayModelPackage.PLAYTYPE_TITLE_FEATURE_ID:
				getTarget().setTitle((String) value);
				return;
			case PlayModelPackage.PLAYTYPE_FM_FEATURE_ID:
				getTarget().setFm((FmType) value);
				return;
			case PlayModelPackage.PLAYTYPE_PERSONAE_FEATURE_ID:
				getTarget().setPersonae((PersonaeType) value);
				return;
			case PlayModelPackage.PLAYTYPE_SCENEDESCRIPTION_FEATURE_ID:
				getTarget().setSceneDescription((String) value);
				return;
			case PlayModelPackage.PLAYTYPE_PLAYSUBTITLE_FEATURE_ID:
				getTarget().setPlaySubTitle((String) value);
				return;
			case PlayModelPackage.PLAYTYPE_ACT_FEATURE_ID:
				getTarget().setAct((List<ActType>) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PlayModelPackage.PLAYTYPE_ACT_FEATURE_ID:
				getTarget().getAct().add((ActType) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PlayModelPackage.PLAYTYPE_ACT_FEATURE_ID:
				getTarget().getAct().remove(value);
				return;
			}
			super.eRemoveFrom(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>SpeechType</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class SpeechTypeModelObject<E extends SpeechType> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return PlayModelPackage.INSTANCE.getSpeechTypeEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return PlayModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PlayModelPackage.SPEECHTYPE_GROUP_FEATURE_ID:
				return getTarget().getGroup();
			case PlayModelPackage.SPEECHTYPE_SPEAKER_FEATURE_ID:
				return getTarget().getSpeaker();
			case PlayModelPackage.SPEECHTYPE_LINE_FEATURE_ID:
				return getTarget().getLine();
			case PlayModelPackage.SPEECHTYPE_STAGEDIRECTIONS_FEATURE_ID:
				return getTarget().getStageDirections();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case PlayModelPackage.SPEECHTYPE_GROUP_FEATURE_ID:
				getTarget().setGroup((List<SpeechTypeGroupFeatureGroup>) value);
				return;
			case PlayModelPackage.SPEECHTYPE_SPEAKER_FEATURE_ID:
				getTarget().setSpeaker((List<String>) value);
				return;
			case PlayModelPackage.SPEECHTYPE_LINE_FEATURE_ID:
				getTarget().setLine((List<String>) value);
				return;
			case PlayModelPackage.SPEECHTYPE_STAGEDIRECTIONS_FEATURE_ID:
				getTarget().setStageDirections((List<String>) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PlayModelPackage.SPEECHTYPE_GROUP_FEATURE_ID:
				getTarget().getGroup().add((SpeechTypeGroupFeatureGroup) value);
				return;

			case PlayModelPackage.SPEECHTYPE_SPEAKER_FEATURE_ID:
				getTarget().getSpeaker().add((String) value);
				return;

			case PlayModelPackage.SPEECHTYPE_LINE_FEATURE_ID:
				getTarget().getLine().add((String) value);
				return;

			case PlayModelPackage.SPEECHTYPE_STAGEDIRECTIONS_FEATURE_ID:
				getTarget().getStageDirections().add((String) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case PlayModelPackage.SPEECHTYPE_GROUP_FEATURE_ID:
				getTarget().getGroup().remove(value);
				return;

			case PlayModelPackage.SPEECHTYPE_SPEAKER_FEATURE_ID:
				getTarget().getSpeaker().remove(value);
				return;

			case PlayModelPackage.SPEECHTYPE_LINE_FEATURE_ID:
				getTarget().getLine().remove(value);
				return;

			case PlayModelPackage.SPEECHTYPE_STAGEDIRECTIONS_FEATURE_ID:
				getTarget().getStageDirections().remove(value);
				return;
			}
			super.eRemoveFrom(eStructuralFeature, value);
		}
	}

	/**
	 * The wrapper/adapter for the Feature Group '
	 * <em><b>SceneType.group</b></em>'.
	 * 
	 * @generated
	 */
	public static class SceneTypeGroupFeatureGroupModelFeatureMapEntry<E extends SceneTypeGroupFeatureGroup>
			extends AbstractModelFeatureMapEntry<SceneTypeGroupFeatureGroup> {

		/**
		 * @generated
		 */
		public EStructuralFeature getEStructuralFeature() {
			switch (getTarget().getFeature()) {
			case STAGEDIRECTIONS:
				return PlayModelPackage.INSTANCE.getSceneType_StageDirections();
			case SPEECH:
				return PlayModelPackage.INSTANCE.getSceneType_Speech();
			}
			throw new IllegalArgumentException(
					"No eStructuralFeature for feature kind "
							+ getTarget().getFeature());
		}

		/**
		 * @generated
		 */
		public void setEStructuralFeature(
				final EStructuralFeature eStructuralFeature) {

			final EClass eClass = PlayModelPackage.INSTANCE
					.getSceneTypeEClass();
			switch (eClass.getFeatureID(eStructuralFeature)) {
			case PlayModelPackage.SCENETYPE_STAGEDIRECTIONS_FEATURE_ID:
				getTarget().setFeature(
						SceneTypeGroupFeatureGroup.Feature.STAGEDIRECTIONS);
				return;
			case PlayModelPackage.SCENETYPE_SPEECH_FEATURE_ID:
				getTarget().setFeature(
						SceneTypeGroupFeatureGroup.Feature.SPEECH);
				return;
			}
			throw new IllegalArgumentException("EStructuralFeature "
					+ eStructuralFeature + " not supported here");
		}

		/**
		 * @generated
		 */
		public Object getValue() {
			return getTarget().getValue();
		}

		/**
		 * @generated
		 */
		public void setValue(final Object value) {
			getTarget().setValue(getTarget().getFeature(), value);
		}
	}

	/**
	 * The wrapper/adapter for the Feature Group '
	 * <em><b>DocumentRoot.mixed</b></em>'.
	 * 
	 * @generated
	 */
	public static class DocumentRootMixedFeatureGroupModelFeatureMapEntry<E extends DocumentRootMixedFeatureGroup>
			extends AbstractModelFeatureMapEntry<DocumentRootMixedFeatureGroup> {

		/**
		 * @generated
		 */
		public EStructuralFeature getEStructuralFeature() {
			switch (getTarget().getFeature()) {
			case TEXT:
				return XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text();
			case CDATA:
				return XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA();
			case COMMENT:
				return XMLTypePackage.eINSTANCE
						.getXMLTypeDocumentRoot_Comment();
			case ACT:
				return PlayModelPackage.INSTANCE.getDocumentRoot_Act();
			case FM:
				return PlayModelPackage.INSTANCE.getDocumentRoot_Fm();
			case GROUPDESCRIPTION:
				return PlayModelPackage.INSTANCE
						.getDocumentRoot_GroupDescription();
			case LINE:
				return PlayModelPackage.INSTANCE.getDocumentRoot_Line();
			case P:
				return PlayModelPackage.INSTANCE.getDocumentRoot_P();
			case PERSONA:
				return PlayModelPackage.INSTANCE.getDocumentRoot_Persona();
			case PERSONAE:
				return PlayModelPackage.INSTANCE.getDocumentRoot_Personae();
			case PERSONAGROUP:
				return PlayModelPackage.INSTANCE.getDocumentRoot_PersonaGroup();
			case PLAY:
				return PlayModelPackage.INSTANCE.getDocumentRoot_Play();
			case PLAYSUBTITLE:
				return PlayModelPackage.INSTANCE.getDocumentRoot_PlaySubTitle();
			case SCENE:
				return PlayModelPackage.INSTANCE.getDocumentRoot_Scene();
			case SCENEDESCRIPTION:
				return PlayModelPackage.INSTANCE
						.getDocumentRoot_SceneDescription();
			case SPEAKER:
				return PlayModelPackage.INSTANCE.getDocumentRoot_Speaker();
			case SPEECH:
				return PlayModelPackage.INSTANCE.getDocumentRoot_Speech();
			case STAGEDIRECTIONS:
				return PlayModelPackage.INSTANCE
						.getDocumentRoot_StageDirections();
			case TITLE:
				return PlayModelPackage.INSTANCE.getDocumentRoot_Title();
			}
			throw new IllegalArgumentException(
					"No eStructuralFeature for feature kind "
							+ getTarget().getFeature());
		}

		/**
		 * @generated
		 */
		public void setEStructuralFeature(
				final EStructuralFeature eStructuralFeature) {
			if (eStructuralFeature == XMLTypePackage.eINSTANCE
					.getXMLTypeDocumentRoot_Text()) {
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.TEXT);
				return;
			} else if (eStructuralFeature == XMLTypePackage.eINSTANCE
					.getXMLTypeDocumentRoot_CDATA()) {
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.CDATA);
				return;
			} else if (eStructuralFeature == XMLTypePackage.eINSTANCE
					.getXMLTypeDocumentRoot_Comment()) {
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.COMMENT);
				return;
			}

			final EClass eClass = PlayModelPackage.INSTANCE
					.getDocumentRootEClass();
			switch (eClass.getFeatureID(eStructuralFeature)) {
			case PlayModelPackage.DOCUMENTROOT_ACT_FEATURE_ID:
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.ACT);
				return;
			case PlayModelPackage.DOCUMENTROOT_FM_FEATURE_ID:
				getTarget()
						.setFeature(DocumentRootMixedFeatureGroup.Feature.FM);
				return;
			case PlayModelPackage.DOCUMENTROOT_GROUPDESCRIPTION_FEATURE_ID:
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.GROUPDESCRIPTION);
				return;
			case PlayModelPackage.DOCUMENTROOT_LINE_FEATURE_ID:
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.LINE);
				return;
			case PlayModelPackage.DOCUMENTROOT_P_FEATURE_ID:
				getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.P);
				return;
			case PlayModelPackage.DOCUMENTROOT_PERSONA_FEATURE_ID:
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.PERSONA);
				return;
			case PlayModelPackage.DOCUMENTROOT_PERSONAE_FEATURE_ID:
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.PERSONAE);
				return;
			case PlayModelPackage.DOCUMENTROOT_PERSONAGROUP_FEATURE_ID:
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.PERSONAGROUP);
				return;
			case PlayModelPackage.DOCUMENTROOT_PLAY_FEATURE_ID:
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.PLAY);
				return;
			case PlayModelPackage.DOCUMENTROOT_PLAYSUBTITLE_FEATURE_ID:
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.PLAYSUBTITLE);
				return;
			case PlayModelPackage.DOCUMENTROOT_SCENE_FEATURE_ID:
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.SCENE);
				return;
			case PlayModelPackage.DOCUMENTROOT_SCENEDESCRIPTION_FEATURE_ID:
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.SCENEDESCRIPTION);
				return;
			case PlayModelPackage.DOCUMENTROOT_SPEAKER_FEATURE_ID:
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.SPEAKER);
				return;
			case PlayModelPackage.DOCUMENTROOT_SPEECH_FEATURE_ID:
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.SPEECH);
				return;
			case PlayModelPackage.DOCUMENTROOT_STAGEDIRECTIONS_FEATURE_ID:
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.STAGEDIRECTIONS);
				return;
			case PlayModelPackage.DOCUMENTROOT_TITLE_FEATURE_ID:
				getTarget().setFeature(
						DocumentRootMixedFeatureGroup.Feature.TITLE);
				return;
			}
			throw new IllegalArgumentException("EStructuralFeature "
					+ eStructuralFeature + " not supported here");
		}

		/**
		 * @generated
		 */
		public Object getValue() {
			return getTarget().getValue();
		}

		/**
		 * @generated
		 */
		public void setValue(final Object value) {
			getTarget().setValue(getTarget().getFeature(), value);
		}
	}

	/**
	 * The wrapper/adapter for the Feature Group '
	 * <em><b>PersonaeType.group</b></em>'.
	 * 
	 * @generated
	 */
	public static class PersonaeTypeGroupFeatureGroupModelFeatureMapEntry<E extends PersonaeTypeGroupFeatureGroup>
			extends AbstractModelFeatureMapEntry<PersonaeTypeGroupFeatureGroup> {

		/**
		 * @generated
		 */
		public EStructuralFeature getEStructuralFeature() {
			switch (getTarget().getFeature()) {
			case TITLE:
				return PlayModelPackage.INSTANCE.getPersonaeType_Title();
			case PERSONA:
				return PlayModelPackage.INSTANCE.getPersonaeType_Persona();
			case PERSONAGROUP:
				return PlayModelPackage.INSTANCE.getPersonaeType_PersonaGroup();
			}
			throw new IllegalArgumentException(
					"No eStructuralFeature for feature kind "
							+ getTarget().getFeature());
		}

		/**
		 * @generated
		 */
		public void setEStructuralFeature(
				final EStructuralFeature eStructuralFeature) {

			final EClass eClass = PlayModelPackage.INSTANCE
					.getPersonaeTypeEClass();
			switch (eClass.getFeatureID(eStructuralFeature)) {
			case PlayModelPackage.PERSONAETYPE_TITLE_FEATURE_ID:
				getTarget().setFeature(
						PersonaeTypeGroupFeatureGroup.Feature.TITLE);
				return;
			case PlayModelPackage.PERSONAETYPE_PERSONA_FEATURE_ID:
				getTarget().setFeature(
						PersonaeTypeGroupFeatureGroup.Feature.PERSONA);
				return;
			case PlayModelPackage.PERSONAETYPE_PERSONAGROUP_FEATURE_ID:
				getTarget().setFeature(
						PersonaeTypeGroupFeatureGroup.Feature.PERSONAGROUP);
				return;
			}
			throw new IllegalArgumentException("EStructuralFeature "
					+ eStructuralFeature + " not supported here");
		}

		/**
		 * @generated
		 */
		public Object getValue() {
			return getTarget().getValue();
		}

		/**
		 * @generated
		 */
		public void setValue(final Object value) {
			getTarget().setValue(getTarget().getFeature(), value);
		}
	}

	/**
	 * The wrapper/adapter for the Feature Group '
	 * <em><b>SpeechType.group</b></em>'.
	 * 
	 * @generated
	 */
	public static class SpeechTypeGroupFeatureGroupModelFeatureMapEntry<E extends SpeechTypeGroupFeatureGroup>
			extends AbstractModelFeatureMapEntry<SpeechTypeGroupFeatureGroup> {

		/**
		 * @generated
		 */
		public EStructuralFeature getEStructuralFeature() {
			switch (getTarget().getFeature()) {
			case SPEAKER:
				return PlayModelPackage.INSTANCE.getSpeechType_Speaker();
			case LINE:
				return PlayModelPackage.INSTANCE.getSpeechType_Line();
			case STAGEDIRECTIONS:
				return PlayModelPackage.INSTANCE
						.getSpeechType_StageDirections();
			}
			throw new IllegalArgumentException(
					"No eStructuralFeature for feature kind "
							+ getTarget().getFeature());
		}

		/**
		 * @generated
		 */
		public void setEStructuralFeature(
				final EStructuralFeature eStructuralFeature) {

			final EClass eClass = PlayModelPackage.INSTANCE
					.getSpeechTypeEClass();
			switch (eClass.getFeatureID(eStructuralFeature)) {
			case PlayModelPackage.SPEECHTYPE_SPEAKER_FEATURE_ID:
				getTarget().setFeature(
						SpeechTypeGroupFeatureGroup.Feature.SPEAKER);
				return;
			case PlayModelPackage.SPEECHTYPE_LINE_FEATURE_ID:
				getTarget()
						.setFeature(SpeechTypeGroupFeatureGroup.Feature.LINE);
				return;
			case PlayModelPackage.SPEECHTYPE_STAGEDIRECTIONS_FEATURE_ID:
				getTarget().setFeature(
						SpeechTypeGroupFeatureGroup.Feature.STAGEDIRECTIONS);
				return;
			}
			throw new IllegalArgumentException("EStructuralFeature "
					+ eStructuralFeature + " not supported here");
		}

		/**
		 * @generated
		 */
		public Object getValue() {
			return getTarget().getValue();
		}

		/**
		 * @generated
		 */
		public void setValue(final Object value) {
			getTarget().setValue(getTarget().getFeature(), value);
		}
	}

}
