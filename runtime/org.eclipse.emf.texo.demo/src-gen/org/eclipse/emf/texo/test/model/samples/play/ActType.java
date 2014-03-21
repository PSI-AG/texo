package org.eclipse.emf.texo.test.model.samples.play;

import java.util.ArrayList;
import java.util.List;

/**
 * A representation of the model object '<em><b>ActType</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ActType {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<SceneType> scene = new ArrayList<SceneType>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private byte pindex = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String title = null;

	/**
	 * Returns the value of '<em><b>scene</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>scene</b></em>' feature
	 * @generated
	 */
	public List<SceneType> getScene() {
		return scene;
	}

	/**
	 * Adds to the <em>scene</em> feature.
	 * 
	 * @generated
	 */
	public void addToScene(SceneType sceneValue) {
		if (!scene.contains(sceneValue)) {
			scene.add(sceneValue);
		}
	}

	/**
	 * Removes from the <em>scene</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromScene(SceneType sceneValue) {
		if (scene.contains(sceneValue)) {
			scene.remove(sceneValue);
		}
	}

	/**
	 * Clears the <em>scene</em> feature.
	 * 
	 * @generated
	 */
	public void clearScene() {
		while (!scene.isEmpty()) {
			removeFromScene(scene.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ActType#getScene() <em>scene</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link ActType#getScene() scene}' feature.
	 * @generated
	 */
	public void setScene(List<SceneType> newScene) {
		scene = newScene;
	}

	/**
	 * Returns the value of '<em><b>pindex</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>pindex</b></em>' feature
	 * @generated
	 */
	public byte getPindex() {
		return pindex;
	}

	/**
	 * Sets the '{@link ActType#getPindex() <em>pindex</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link ActType#getPindex() pindex}' feature.
	 * @generated
	 */
	public void setPindex(byte newPindex) {
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
	 * Sets the '{@link ActType#getTitle() <em>title</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link ActType#getTitle() title}' feature.
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
		return "ActType " + " [pindex: " + getPindex() + "]" + " [title: "
				+ getTitle() + "]";
	}
}
