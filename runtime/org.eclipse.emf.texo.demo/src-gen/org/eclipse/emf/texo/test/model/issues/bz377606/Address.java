package org.eclipse.emf.texo.test.model.issues.bz377606;

/**
 * A representation of the model object '<em><b>Address</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Address {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String city = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String street = null;

	/**
	 * Returns the value of '<em><b>city</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>city</b></em>' feature
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the '{@link Address#getCity() <em>city</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Address#getCity() city}' feature.
	 * @generated
	 */
	public void setCity(String newCity) {
		city = newCity;
	}

	/**
	 * Returns the value of '<em><b>street</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>street</b></em>' feature
	 * @generated
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Sets the '{@link Address#getStreet() <em>street</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Address#getStreet() street}' feature.
	 * @generated
	 */
	public void setStreet(String newStreet) {
		street = newStreet;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Address " + " [city: " + getCity() + "]" + " [street: "
				+ getStreet() + "]";
	}
}
