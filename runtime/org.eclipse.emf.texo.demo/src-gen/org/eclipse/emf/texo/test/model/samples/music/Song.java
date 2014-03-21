package org.eclipse.emf.texo.test.model.samples.music;

/**
 * A representation of the model object '<em><b>Song</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Song {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private long id = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Long version = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private int track = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String name = null;

	/**
	 * Returns the value of '<em><b>id</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>id</b></em>' feature
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the '{@link Song#getId() <em>id</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Song#getId() id}' feature.
	 * @generated
	 */
	public void setId(long newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>version</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>version</b></em>' feature
	 * @generated
	 */
	public Long getVersion() {
		return version;
	}

	/**
	 * Sets the '{@link Song#getVersion() <em>version</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Song#getVersion() version}' feature.
	 * @generated
	 */
	public void setVersion(Long newVersion) {
		version = newVersion;
	}

	/**
	 * Returns the value of '<em><b>track</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>track</b></em>' feature
	 * @generated
	 */
	public int getTrack() {
		return track;
	}

	/**
	 * Sets the '{@link Song#getTrack() <em>track</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Song#getTrack() track}' feature.
	 * @generated
	 */
	public void setTrack(int newTrack) {
		track = newTrack;
	}

	/**
	 * Returns the value of '<em><b>name</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>name</b></em>' feature
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the '{@link Song#getName() <em>name</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Song#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Song " + " [id: " + getId() + "]" + " [version: "
				+ getVersion() + "]" + " [track: " + getTrack() + "]"
				+ " [name: " + getName() + "]";
	}
}
