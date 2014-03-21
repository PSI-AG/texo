package org.eclipse.emf.texo.test.model.samples.play;

import java.util.ArrayList;
import java.util.List;

/**
 * A representation of the model object '<em><b>SpeechType</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SpeechType {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<SpeechTypeGroupFeatureGroup> group = new ArrayList<SpeechTypeGroupFeatureGroup>();

	/**
	 * Returns the value of '<em><b>group</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>group</b></em>' feature
	 * @generated
	 */
	public List<SpeechTypeGroupFeatureGroup> getGroup() {
		return group;
	}

	/**
	 * Sets the '{@link SpeechType#getGroup() <em>group</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link SpeechType#getGroup() group}'
	 *            feature.
	 * @generated
	 */
	public void setGroup(List<SpeechTypeGroupFeatureGroup> newGroup) {
		group = newGroup;
	}

	/**
	 * Returns the value of '<em><b>speaker</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>speaker</b></em>' feature
	 * @generated
	 */
	public List<String> getSpeaker() {
		return SpeechTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), SpeechTypeGroupFeatureGroup.Feature.SPEAKER);
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
	public void setSpeaker(List<String> newSpeaker) {
		setGroup(SpeechTypeGroupFeatureGroup.createFeatureGroupList(
				SpeechTypeGroupFeatureGroup.Feature.SPEAKER, newSpeaker));
	}

	/**
	 * Returns the value of '<em><b>line</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>line</b></em>' feature
	 * @generated
	 */
	public List<String> getLine() {
		return SpeechTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), SpeechTypeGroupFeatureGroup.Feature.LINE);
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
	public void setLine(List<String> newLine) {
		setGroup(SpeechTypeGroupFeatureGroup.createFeatureGroupList(
				SpeechTypeGroupFeatureGroup.Feature.LINE, newLine));
	}

	/**
	 * Returns the value of '<em><b>stageDirections</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>stageDirections</b></em>' feature
	 * @generated
	 */
	public List<String> getStageDirections() {
		return SpeechTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						SpeechTypeGroupFeatureGroup.Feature.STAGEDIRECTIONS);
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
	public void setStageDirections(List<String> newStageDirections) {
		setGroup(SpeechTypeGroupFeatureGroup.createFeatureGroupList(
				SpeechTypeGroupFeatureGroup.Feature.STAGEDIRECTIONS,
				newStageDirections));
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "SpeechType ";
	}
}
