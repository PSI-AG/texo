package org.eclipse.emf.texo.test.model.samples.play;

import java.util.ArrayList;
import java.util.List;

/**
 * A representation of the model object '<em><b>PlayType</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PlayType {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String title = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private FmType fm = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private PersonaeType personae = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String sceneDescription = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String playSubTitle = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<ActType> act = new ArrayList<ActType>();

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
	 * Sets the '{@link PlayType#getTitle() <em>title</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link PlayType#getTitle() title}' feature.
	 * @generated
	 */
	public void setTitle(String newTitle) {
		title = newTitle;
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
	 * Sets the '{@link PlayType#getFm() <em>fm</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link PlayType#getFm() fm}' feature.
	 * @generated
	 */
	public void setFm(FmType newFm) {
		fm = newFm;
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
	 * Sets the '{@link PlayType#getPersonae() <em>personae</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link PlayType#getPersonae() personae}'
	 *            feature.
	 * @generated
	 */
	public void setPersonae(PersonaeType newPersonae) {
		personae = newPersonae;
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
	 * Sets the '{@link PlayType#getSceneDescription()
	 * <em>sceneDescription</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link PlayType#getSceneDescription()
	 *            sceneDescription}' feature.
	 * @generated
	 */
	public void setSceneDescription(String newSceneDescription) {
		sceneDescription = newSceneDescription;
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
	 * Sets the '{@link PlayType#getPlaySubTitle() <em>playSubTitle</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link PlayType#getPlaySubTitle()
	 *            playSubTitle}' feature.
	 * @generated
	 */
	public void setPlaySubTitle(String newPlaySubTitle) {
		playSubTitle = newPlaySubTitle;
	}

	/**
	 * Returns the value of '<em><b>act</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>act</b></em>' feature
	 * @generated
	 */
	public List<ActType> getAct() {
		return act;
	}

	/**
	 * Adds to the <em>act</em> feature.
	 * 
	 * @generated
	 */
	public void addToAct(ActType actValue) {
		if (!act.contains(actValue)) {
			act.add(actValue);
		}
	}

	/**
	 * Removes from the <em>act</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromAct(ActType actValue) {
		if (act.contains(actValue)) {
			act.remove(actValue);
		}
	}

	/**
	 * Clears the <em>act</em> feature.
	 * 
	 * @generated
	 */
	public void clearAct() {
		while (!act.isEmpty()) {
			removeFromAct(act.iterator().next());
		}
	}

	/**
	 * Sets the '{@link PlayType#getAct() <em>act</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link PlayType#getAct() act}' feature.
	 * @generated
	 */
	public void setAct(List<ActType> newAct) {
		act = newAct;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "PlayType " + " [title: " + getTitle() + "]"
				+ " [sceneDescription: " + getSceneDescription() + "]"
				+ " [playSubTitle: " + getPlaySubTitle() + "]";
	}
}
