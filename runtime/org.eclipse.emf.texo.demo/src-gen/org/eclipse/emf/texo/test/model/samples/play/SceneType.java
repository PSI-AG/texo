package org.eclipse.emf.texo.test.model.samples.play;

import java.util.ArrayList;
import java.util.List;

/**
 * A representation of the model object '<em><b>SceneType</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SceneType {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<SceneTypeGroupFeatureGroup> group = new ArrayList<SceneTypeGroupFeatureGroup>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private PindexType pindex = PindexType._1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String title = null;

	/**
	 * Returns the value of '<em><b>group</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>group</b></em>' feature
	 * @generated
	 */
	public List<SceneTypeGroupFeatureGroup> getGroup() {
		return group;
	}

	/**
	 * Sets the '{@link SceneType#getGroup() <em>group</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link SceneType#getGroup() group}' feature.
	 * @generated
	 */
	public void setGroup(List<SceneTypeGroupFeatureGroup> newGroup) {
		group = newGroup;
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
		return SceneTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), SceneTypeGroupFeatureGroup.Feature.STAGEDIRECTIONS);
	}

	/**
	 * Sets the '{@link SceneType#getStageDirections() <em>stageDirections</em>}
	 * ' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link SceneType#getStageDirections()
	 *            stageDirections}' feature.
	 * @generated
	 */
	public void setStageDirections(List<String> newStageDirections) {
		setGroup(SceneTypeGroupFeatureGroup.createFeatureGroupList(
				SceneTypeGroupFeatureGroup.Feature.STAGEDIRECTIONS,
				newStageDirections));
	}

	/**
	 * Returns the value of '<em><b>speech</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>speech</b></em>' feature
	 * @generated
	 */
	public List<SpeechType> getSpeech() {
		return SceneTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), SceneTypeGroupFeatureGroup.Feature.SPEECH);
	}

	/**
	 * Sets the '{@link SceneType#getSpeech() <em>speech</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link SceneType#getSpeech() speech}'
	 *            feature.
	 * @generated
	 */
	public void setSpeech(List<SpeechType> newSpeech) {
		setGroup(SceneTypeGroupFeatureGroup.createFeatureGroupList(
				SceneTypeGroupFeatureGroup.Feature.SPEECH, newSpeech));
	}

	/**
	 * Returns the value of '<em><b>pindex</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>pindex</b></em>' feature
	 * @generated
	 */
	public PindexType getPindex() {
		return pindex;
	}

	/**
	 * Sets the '{@link SceneType#getPindex() <em>pindex</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link SceneType#getPindex() pindex}'
	 *            feature.
	 * @generated
	 */
	public void setPindex(PindexType newPindex) {
		pindex = newPindex;
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
	 * Sets the '{@link SceneType#getTitle() <em>title</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link SceneType#getTitle() title}' feature.
	 * @generated
	 */
	public void setTitle(String newTitle) {
		title = newTitle;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "SceneType " + " [pindex: " + getPindex() + "]" + " [title: "
				+ getTitle() + "]";
	}
}
