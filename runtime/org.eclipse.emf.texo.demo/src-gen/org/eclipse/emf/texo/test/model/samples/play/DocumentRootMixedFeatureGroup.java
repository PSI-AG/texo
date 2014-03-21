package org.eclipse.emf.texo.test.model.samples.play;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;

/**
 * A representation for the Feature Group '<em><b>DocumentRoot.mixed</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DocumentRootMixedFeatureGroup {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Is used to identify which
	 * feature is set in this feature group.
	 * 
	 * @generated
	 */
	public static enum Feature {
		TEXT, CDATA, COMMENT, ACT, FM, GROUPDESCRIPTION, LINE, P, PERSONA, PERSONAE, PERSONAGROUP, PLAY, PLAYSUBTITLE, SCENE, SCENEDESCRIPTION, SPEAKER, SPEECH, STAGEDIRECTIONS, TITLE
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Returns only the values
	 * from the feature group which have the feature equal to the parameter.
	 * 
	 * @param featureGroup
	 *            the featureGroup List to filter
	 * @param filterByFeature
	 *            filters by this enum
	 * @return a list with instances corresponding to the feature kind
	 * @see Collections#unmodifiableList(List)
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> createUnmodifiableValueList(
			List<DocumentRootMixedFeatureGroup> featureGroup,
			Feature filterByFeature) {
		final List<Object> result = new ArrayList<Object>();
		for (final DocumentRootMixedFeatureGroup group : featureGroup) {
			if (group.getFeature() == filterByFeature) {
				result.add(group.getValue());
			}
		}
		return (List<T>) Collections.unmodifiableList(result);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Returns a single value from
	 * the feature group which has the feature equal to the parameter. The first
	 * found value is returned. If no value can be found then null is returned.
	 * 
	 * @param featureGroup
	 *            the featureGroup List to filter
	 * @param filterByFeature
	 *            filters by this enum
	 * @return an instance corresponding to the feature kind or null if not
	 *         found.
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getSingleFeatureMapValue(
			List<DocumentRootMixedFeatureGroup> featureGroup,
			Feature filterByFeature) {
		for (final DocumentRootMixedFeatureGroup group : featureGroup) {
			if (group.getFeature() == filterByFeature) {
				return (T) group.getValue();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Sets a single value in a
	 * feature group, if there is already a value set in the feature for the
	 * feature in question then it is replaced by the new value.
	 * 
	 * @param featureGroup
	 *            the featureGroup List to find the value
	 * @param feature
	 *            sets this feature
	 * @param value
	 *            the value to set
	 * @generated
	 */
	public static void setSingleFeatureMapValue(
			List<DocumentRootMixedFeatureGroup> featureGroup, Feature feature,
			Object value) {
		for (final DocumentRootMixedFeatureGroup group : featureGroup) {
			if (group.getFeature() == feature) {
				group.setValue(feature, value);
				return;
			}
		}
		final DocumentRootMixedFeatureGroup entry = new DocumentRootMixedFeatureGroup();
		entry.setValue(feature, value);
		featureGroup.add(entry);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Creates a list of group
	 * instances set with the passed feature and values.
	 * 
	 * @param feature
	 *            the feature to set
	 * @param values
	 *            the values to set as value of each group instance in the
	 *            result.
	 * @return a list with instances of this class, set with the Feature and
	 *         values
	 * @generated
	 */
	public static List<DocumentRootMixedFeatureGroup> createFeatureGroupList(
			Feature feature, List<?> values) {
		final List<DocumentRootMixedFeatureGroup> result = new ArrayList<DocumentRootMixedFeatureGroup>();
		for (Object value : values) {
			final DocumentRootMixedFeatureGroup group = new DocumentRootMixedFeatureGroup();
			group.setValue(feature, value);
			result.add(group);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic
	@Enumerated(EnumType.STRING)
	private Feature feature = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = true)
	@Lob
	private String text;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = true)
	@Lob
	private String cDATA;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = true)
	@Lob
	private String comment;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private ActType act;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private FmType fm;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String groupDescription;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String line;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String p;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String persona;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private PersonaeType personae;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private PersonaGroupType personaGroup;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private PlayType play;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String playSubTitle;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private SceneType scene;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String sceneDescription;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String speaker;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private SpeechType speech;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String stageDirections;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String title;

	/**
	 * @generated
	 */
	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	/**
	 * @generated
	 */
	public Feature getFeature() {
		return feature;
	}

	/**
	 * Returns the value of '<em><b>text</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>text</b></em>' feature
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the '{@link LetterBodyType#getText() <em>text</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link LetterBodyType#getText() text}'
	 *            feature.
	 * @generated
	 */
	public void setText(String newText) {
		text = newText;
		setFeature(Feature.TEXT);
	}

	/**
	 * Returns the value of '<em><b>cDATA</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>cDATA</b></em>' feature
	 * @generated
	 */
	public String getCDATA() {
		return cDATA;
	}

	/**
	 * Sets the '{@link LetterBodyType#getCDATA() <em>cDATA</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link LetterBodyType#getCDATA() cDATA}'
	 *            feature.
	 * @generated
	 */
	public void setCDATA(String newCDATA) {
		cDATA = newCDATA;
		setFeature(Feature.CDATA);
	}

	/**
	 * Returns the value of '<em><b>comment</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>comment</b></em>' feature
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Sets the '{@link LetterBodyType#getComment() <em>comment</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link LetterBodyType#getComment() comment}'
	 *            feature.
	 * @generated
	 */
	public void setComment(String newComment) {
		comment = newComment;
		setFeature(Feature.COMMENT);
	}

	/**
	 * Returns the value of '<em><b>act</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>act</b></em>' feature
	 * @generated
	 */
	public ActType getAct() {
		return act;
	}

	/**
	 * Sets the '{@link DocumentRoot#getAct() <em>act</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link DocumentRoot#getAct() act}' feature.
	 * @generated
	 */
	public void setAct(ActType newAct) {
		act = newAct;
		setFeature(Feature.ACT);
	}

	/**
	 * Returns the value of '<em><b>fm</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>fm</b></em>' feature
	 * @generated
	 */
	public FmType getFm() {
		return fm;
	}

	/**
	 * Sets the '{@link DocumentRoot#getFm() <em>fm</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link DocumentRoot#getFm() fm}' feature.
	 * @generated
	 */
	public void setFm(FmType newFm) {
		fm = newFm;
		setFeature(Feature.FM);
	}

	/**
	 * Returns the value of '<em><b>groupDescription</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>groupDescription</b></em>' feature
	 * @generated
	 */
	public String getGroupDescription() {
		return groupDescription;
	}

	/**
	 * Sets the '{@link DocumentRoot#getGroupDescription()
	 * <em>groupDescription</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link DocumentRoot#getGroupDescription()
	 *            groupDescription}' feature.
	 * @generated
	 */
	public void setGroupDescription(String newGroupDescription) {
		groupDescription = newGroupDescription;
		setFeature(Feature.GROUPDESCRIPTION);
	}

	/**
	 * Returns the value of '<em><b>line</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>line</b></em>' feature
	 * @generated
	 */
	public String getLine() {
		return line;
	}

	/**
	 * Sets the '{@link DocumentRoot#getLine() <em>line</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link DocumentRoot#getLine() line}'
	 *            feature.
	 * @generated
	 */
	public void setLine(String newLine) {
		line = newLine;
		setFeature(Feature.LINE);
	}

	/**
	 * Returns the value of '<em><b>p</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>p</b></em>' feature
	 * @generated
	 */
	public String getP() {
		return p;
	}

	/**
	 * Sets the '{@link DocumentRoot#getP() <em>p</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link DocumentRoot#getP() p}' feature.
	 * @generated
	 */
	public void setP(String newP) {
		p = newP;
		setFeature(Feature.P);
	}

	/**
	 * Returns the value of '<em><b>persona</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>persona</b></em>' feature
	 * @generated
	 */
	public String getPersona() {
		return persona;
	}

	/**
	 * Sets the '{@link DocumentRoot#getPersona() <em>persona</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link DocumentRoot#getPersona() persona}'
	 *            feature.
	 * @generated
	 */
	public void setPersona(String newPersona) {
		persona = newPersona;
		setFeature(Feature.PERSONA);
	}

	/**
	 * Returns the value of '<em><b>personae</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>personae</b></em>' feature
	 * @generated
	 */
	public PersonaeType getPersonae() {
		return personae;
	}

	/**
	 * Sets the '{@link DocumentRoot#getPersonae() <em>personae</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link DocumentRoot#getPersonae() personae}'
	 *            feature.
	 * @generated
	 */
	public void setPersonae(PersonaeType newPersonae) {
		personae = newPersonae;
		setFeature(Feature.PERSONAE);
	}

	/**
	 * Returns the value of '<em><b>personaGroup</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>personaGroup</b></em>' feature
	 * @generated
	 */
	public PersonaGroupType getPersonaGroup() {
		return personaGroup;
	}

	/**
	 * Sets the '{@link DocumentRoot#getPersonaGroup() <em>personaGroup</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link DocumentRoot#getPersonaGroup()
	 *            personaGroup}' feature.
	 * @generated
	 */
	public void setPersonaGroup(PersonaGroupType newPersonaGroup) {
		personaGroup = newPersonaGroup;
		setFeature(Feature.PERSONAGROUP);
	}

	/**
	 * Returns the value of '<em><b>play</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>play</b></em>' feature
	 * @generated
	 */
	public PlayType getPlay() {
		return play;
	}

	/**
	 * Sets the '{@link DocumentRoot#getPlay() <em>play</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link DocumentRoot#getPlay() play}'
	 *            feature.
	 * @generated
	 */
	public void setPlay(PlayType newPlay) {
		play = newPlay;
		setFeature(Feature.PLAY);
	}

	/**
	 * Returns the value of '<em><b>playSubTitle</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>playSubTitle</b></em>' feature
	 * @generated
	 */
	public String getPlaySubTitle() {
		return playSubTitle;
	}

	/**
	 * Sets the '{@link DocumentRoot#getPlaySubTitle() <em>playSubTitle</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link DocumentRoot#getPlaySubTitle()
	 *            playSubTitle}' feature.
	 * @generated
	 */
	public void setPlaySubTitle(String newPlaySubTitle) {
		playSubTitle = newPlaySubTitle;
		setFeature(Feature.PLAYSUBTITLE);
	}

	/**
	 * Returns the value of '<em><b>scene</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>scene</b></em>' feature
	 * @generated
	 */
	public SceneType getScene() {
		return scene;
	}

	/**
	 * Sets the '{@link DocumentRoot#getScene() <em>scene</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link DocumentRoot#getScene() scene}'
	 *            feature.
	 * @generated
	 */
	public void setScene(SceneType newScene) {
		scene = newScene;
		setFeature(Feature.SCENE);
	}

	/**
	 * Returns the value of '<em><b>sceneDescription</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>sceneDescription</b></em>' feature
	 * @generated
	 */
	public String getSceneDescription() {
		return sceneDescription;
	}

	/**
	 * Sets the '{@link DocumentRoot#getSceneDescription()
	 * <em>sceneDescription</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link DocumentRoot#getSceneDescription()
	 *            sceneDescription}' feature.
	 * @generated
	 */
	public void setSceneDescription(String newSceneDescription) {
		sceneDescription = newSceneDescription;
		setFeature(Feature.SCENEDESCRIPTION);
	}

	/**
	 * Returns the value of '<em><b>speaker</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>speaker</b></em>' feature
	 * @generated
	 */
	public String getSpeaker() {
		return speaker;
	}

	/**
	 * Sets the '{@link DocumentRoot#getSpeaker() <em>speaker</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link DocumentRoot#getSpeaker() speaker}'
	 *            feature.
	 * @generated
	 */
	public void setSpeaker(String newSpeaker) {
		speaker = newSpeaker;
		setFeature(Feature.SPEAKER);
	}

	/**
	 * Returns the value of '<em><b>speech</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>speech</b></em>' feature
	 * @generated
	 */
	public SpeechType getSpeech() {
		return speech;
	}

	/**
	 * Sets the '{@link DocumentRoot#getSpeech() <em>speech</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link DocumentRoot#getSpeech() speech}'
	 *            feature.
	 * @generated
	 */
	public void setSpeech(SpeechType newSpeech) {
		speech = newSpeech;
		setFeature(Feature.SPEECH);
	}

	/**
	 * Returns the value of '<em><b>stageDirections</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>stageDirections</b></em>' feature
	 * @generated
	 */
	public String getStageDirections() {
		return stageDirections;
	}

	/**
	 * Sets the '{@link DocumentRoot#getStageDirections()
	 * <em>stageDirections</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link DocumentRoot#getStageDirections()
	 *            stageDirections}' feature.
	 * @generated
	 */
	public void setStageDirections(String newStageDirections) {
		stageDirections = newStageDirections;
		setFeature(Feature.STAGEDIRECTIONS);
	}

	/**
	 * Returns the value of '<em><b>title</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>title</b></em>' feature
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the '{@link DocumentRoot#getTitle() <em>title</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link DocumentRoot#getTitle() title}'
	 *            feature.
	 * @generated
	 */
	public void setTitle(String newTitle) {
		title = newTitle;
		setFeature(Feature.TITLE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of this feature map entry. The type of the returned
	 *         value is based on the feature.
	 * @see #getFeature()
	 * @generated
	 */
	public Object getValue() {
		switch (getFeature()) {
		case TEXT:
			return getText();
		case CDATA:
			return getCDATA();
		case COMMENT:
			return getComment();
		case ACT:
			return getAct();
		case FM:
			return getFm();
		case GROUPDESCRIPTION:
			return getGroupDescription();
		case LINE:
			return getLine();
		case P:
			return getP();
		case PERSONA:
			return getPersona();
		case PERSONAE:
			return getPersonae();
		case PERSONAGROUP:
			return getPersonaGroup();
		case PLAY:
			return getPlay();
		case PLAYSUBTITLE:
			return getPlaySubTitle();
		case SCENE:
			return getScene();
		case SCENEDESCRIPTION:
			return getSceneDescription();
		case SPEAKER:
			return getSpeaker();
		case SPEECH:
			return getSpeech();
		case STAGEDIRECTIONS:
			return getStageDirections();
		case TITLE:
			return getTitle();
		default:
			throw new IllegalStateException("Feature kind " + getFeature()
					+ " is not supported for this object " + this);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param feature
	 *            the feature to set
	 * @param the
	 *            value to set in this instance
	 * @see #getFeature()
	 * @generated
	 */
	public void setValue(Feature feature, Object value) {
		switch (feature) {
		case TEXT:
			setText((String) value);
			break;
		case CDATA:
			setCDATA((String) value);
			break;
		case COMMENT:
			setComment((String) value);
			break;
		case ACT:
			setAct((ActType) value);
			break;
		case FM:
			setFm((FmType) value);
			break;
		case GROUPDESCRIPTION:
			setGroupDescription((String) value);
			break;
		case LINE:
			setLine((String) value);
			break;
		case P:
			setP((String) value);
			break;
		case PERSONA:
			setPersona((String) value);
			break;
		case PERSONAE:
			setPersonae((PersonaeType) value);
			break;
		case PERSONAGROUP:
			setPersonaGroup((PersonaGroupType) value);
			break;
		case PLAY:
			setPlay((PlayType) value);
			break;
		case PLAYSUBTITLE:
			setPlaySubTitle((String) value);
			break;
		case SCENE:
			setScene((SceneType) value);
			break;
		case SCENEDESCRIPTION:
			setSceneDescription((String) value);
			break;
		case SPEAKER:
			setSpeaker((String) value);
			break;
		case SPEECH:
			setSpeech((SpeechType) value);
			break;
		case STAGEDIRECTIONS:
			setStageDirections((String) value);
			break;
		case TITLE:
			setTitle((String) value);
			break;
		default:
			throw new IllegalStateException("Feature kind " + getFeature()
					+ " is not supported for this object " + this);
		}
	}
}
