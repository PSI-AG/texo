package org.eclipse.emf.texo.test.model.samples.play;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * A representation for the Feature Group '<em><b>SpeechType.group</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SpeechTypeGroupFeatureGroup {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> Is used to identify which
	 * feature is set in this feature group.
	 * 
	 * @generated
	 */
	public static enum Feature {
		SPEAKER, LINE, STAGEDIRECTIONS
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
			List<SpeechTypeGroupFeatureGroup> featureGroup,
			Feature filterByFeature) {
		final List<Object> result = new ArrayList<Object>();
		for (final SpeechTypeGroupFeatureGroup group : featureGroup) {
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
			List<SpeechTypeGroupFeatureGroup> featureGroup,
			Feature filterByFeature) {
		for (final SpeechTypeGroupFeatureGroup group : featureGroup) {
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
			List<SpeechTypeGroupFeatureGroup> featureGroup, Feature feature,
			Object value) {
		for (final SpeechTypeGroupFeatureGroup group : featureGroup) {
			if (group.getFeature() == feature) {
				group.setValue(feature, value);
				return;
			}
		}
		final SpeechTypeGroupFeatureGroup entry = new SpeechTypeGroupFeatureGroup();
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
	public static List<SpeechTypeGroupFeatureGroup> createFeatureGroupList(
			Feature feature, List<?> values) {
		final List<SpeechTypeGroupFeatureGroup> result = new ArrayList<SpeechTypeGroupFeatureGroup>();
		for (Object value : values) {
			final SpeechTypeGroupFeatureGroup group = new SpeechTypeGroupFeatureGroup();
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
	private String speaker;

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
	private String stageDirections;

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
	 * Sets the '{@link SpeechType#getSpeaker() <em>speaker</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link SpeechType#getSpeaker() speaker}'
	 *            feature.
	 * @generated
	 */
	public void setSpeaker(String newSpeaker) {
		speaker = newSpeaker;
		setFeature(Feature.SPEAKER);
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
	 * Sets the '{@link SpeechType#getLine() <em>line</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link SpeechType#getLine() line}' feature.
	 * @generated
	 */
	public void setLine(String newLine) {
		line = newLine;
		setFeature(Feature.LINE);
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
	 * Sets the '{@link SpeechType#getStageDirections()
	 * <em>stageDirections</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link SpeechType#getStageDirections()
	 *            stageDirections}' feature.
	 * @generated
	 */
	public void setStageDirections(String newStageDirections) {
		stageDirections = newStageDirections;
		setFeature(Feature.STAGEDIRECTIONS);
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
		case SPEAKER:
			return getSpeaker();
		case LINE:
			return getLine();
		case STAGEDIRECTIONS:
			return getStageDirections();
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
		case SPEAKER:
			setSpeaker((String) value);
			break;
		case LINE:
			setLine((String) value);
			break;
		case STAGEDIRECTIONS:
			setStageDirections((String) value);
			break;
		default:
			throw new IllegalStateException("Feature kind " + getFeature()
					+ " is not supported for this object " + this);
		}
	}
}
