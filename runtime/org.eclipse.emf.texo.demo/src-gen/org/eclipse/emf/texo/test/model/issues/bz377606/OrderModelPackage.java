package org.eclipse.emf.texo.test.model.issues.bz377606;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>Order</b></em>'. It contains
 * initialization code and access to the Factory to instantiate types of this
 * package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class OrderModelPackage extends ModelPackage {

	/**
	 * Is set when the package has been initialized.
	 * 
	 * @generated
	 */
	private static boolean isInitialized = false;

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz377606";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final OrderModelFactory MODELFACTORY = new OrderModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CUSTOMER_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CUSTOMER_FIRSTNAME_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CUSTOMER_LASTNAME_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CUSTOMER_ADDRESS_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CUSTOMER_ID_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ADDRESS_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ADDRESS_CITY_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ADDRESS_STREET_FEATURE_ID = 1;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final OrderModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static OrderModelPackage initialize() {

		if (isInitialized) {
			return (OrderModelPackage) ModelResolver.getInstance()
					.getModelPackage(NS_URI);
		}

		final OrderModelPackage modelPackage = new OrderModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		isInitialized = true;

		// force the initialization of the EFactory proxy
		modelPackage.getEPackage();

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(Customer.class,
				modelPackage.getCustomerEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Address.class,
				modelPackage.getAddressEClass(), modelPackage);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the {@link OrderModelFactory} instance.
	 * @generated
	 */
	@Override
	public OrderModelFactory getModelFactory() {
		return MODELFACTORY;
	}

	/**
	 * Returns the nsUri of the {@link EPackage} managed by this Package
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the nsUri of the EPackage
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return NS_URI;
	}

	/**
	 * Returns the name of the ecore file containing the ecore model of the
	 * {@link EPackage} managed here. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the name of the ecore file
	 * @generated
	 */
	@Override
	public String getEcoreFileName() {
		return "Order.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>Customer</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Customer</b></em>'
	 * @generated
	 */
	public EClass getCustomerEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				CUSTOMER_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Customer.firstName</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Customer.firstName</b></em>'.
	 * @generated
	 */
	public EAttribute getCustomer_FirstName() {
		return (EAttribute) getCustomerEClass().getEAllStructuralFeatures()
				.get(CUSTOMER_FIRSTNAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Customer.lastName</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Customer.lastName</b></em>'.
	 * @generated
	 */
	public EAttribute getCustomer_LastName() {
		return (EAttribute) getCustomerEClass().getEAllStructuralFeatures()
				.get(CUSTOMER_LASTNAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Customer.address</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Customer.address</b></em>'.
	 * @generated
	 */
	public EReference getCustomer_Address() {
		return (EReference) getCustomerEClass().getEAllStructuralFeatures()
				.get(CUSTOMER_ADDRESS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Customer.id</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Customer.id</b></em>'.
	 * @generated
	 */
	public EAttribute getCustomer_Id() {
		return (EAttribute) getCustomerEClass().getEAllStructuralFeatures()
				.get(CUSTOMER_ID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Address</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Address</b></em>'
	 * @generated
	 */
	public EClass getAddressEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ADDRESS_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Address.city</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Address.city</b></em>'.
	 * @generated
	 */
	public EAttribute getAddress_City() {
		return (EAttribute) getAddressEClass().getEAllStructuralFeatures().get(
				ADDRESS_CITY_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Address.street</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Address.street</b></em>'.
	 * @generated
	 */
	public EAttribute getAddress_Street() {
		return (EAttribute) getAddressEClass().getEAllStructuralFeatures().get(
				ADDRESS_STREET_FEATURE_ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eClassifier
	 *            the {@link EClassifier}
	 * @return the class implementing a specific {@link EClass}.
	 * @generated
	 */
	@Override
	public Class<?> getEClassifierClass(EClassifier eClassifier) {
		switch (eClassifier.getClassifierID()) {
		case CUSTOMER_CLASSIFIER_ID:
			return Customer.class;
		case ADDRESS_CLASSIFIER_ID:
			return Address.class;
		}
		throw new IllegalArgumentException("The EClassifier '" + eClassifier
				+ "' is not defined in this EPackage");
	}
}
