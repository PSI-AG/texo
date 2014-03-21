package org.eclipse.emf.texo.test.model.samples.music;

/**
 * A representation of the model object '<em><b>Country</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Country {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String code = null;

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
	private String name = null;

	/**
	 * Returns the value of '<em><b>code</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>code</b></em>' feature
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the '{@link Country#getCode() <em>code</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Country#getCode() code}' feature.
	 * @generated
	 */
	public void setCode(String newCode) {
		code = newCode;
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
	 * Sets the '{@link Country#getVersion() <em>version</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Country#getVersion() version}'
	 *            feature.
	 * @generated
	 */
	public void setVersion(Long newVersion) {
		version = newVersion;
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
	 * Sets the '{@link Country#getName() <em>name</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Country#getName() name}' feature.
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
		return "Country " + " [code: " + getCode() + "]" + " [version: "
				+ getVersion() + "]" + " [name: " + getName() + "]";
	}
}
