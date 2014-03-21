/**
 */
package org.eclipse.emf.texo.test.emfmodel.bz403743.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.texo.test.emfmodel.bz403743.Bz403743Factory;
import org.eclipse.emf.texo.test.emfmodel.bz403743.Bz403743Package;
import org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743;
import org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743_Main;
import org.eclipse.emf.texo.test.emfmodel.identifiable.IdentifiablePackage;
import org.eclipse.emf.texo.test.emfmodel.identifiable.impl.IdentifiablePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz403743PackageImpl extends EPackageImpl implements Bz403743Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass test403743_MainEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass test403743EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.Bz403743Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz403743PackageImpl() {
		super(eNS_URI, Bz403743Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Bz403743Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz403743Package init() {
		if (isInited) return (Bz403743Package)EPackage.Registry.INSTANCE.getEPackage(Bz403743Package.eNS_URI);

		// Obtain or create and register package
		Bz403743PackageImpl theBz403743Package = (Bz403743PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz403743PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz403743PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IdentifiablePackageImpl theIdentifiablePackage = (IdentifiablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentifiablePackage.eNS_URI) instanceof IdentifiablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentifiablePackage.eNS_URI) : IdentifiablePackage.eINSTANCE);

		// Create package meta-data objects
		theBz403743Package.createPackageContents();
		theIdentifiablePackage.createPackageContents();

		// Initialize created meta-data
		theBz403743Package.initializePackageContents();
		theIdentifiablePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz403743Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz403743Package.eNS_URI, theBz403743Package);
		return theBz403743Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest403743_Main() {
		return test403743_MainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest403743_Main_Name() {
		return (EAttribute)test403743_MainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest403743_Main_Children() {
		return (EReference)test403743_MainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest403743() {
		return test403743EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest403743_Name() {
		return (EAttribute)test403743EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest403743_Children() {
		return (EReference)test403743EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz403743Factory getBz403743Factory() {
		return (Bz403743Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		test403743_MainEClass = createEClass(TEST403743_MAIN);
		createEAttribute(test403743_MainEClass, TEST403743_MAIN__NAME);
		createEReference(test403743_MainEClass, TEST403743_MAIN__CHILDREN);

		test403743EClass = createEClass(TEST403743);
		createEAttribute(test403743EClass, TEST403743__NAME);
		createEReference(test403743EClass, TEST403743__CHILDREN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IdentifiablePackage theIdentifiablePackage = (IdentifiablePackage)EPackage.Registry.INSTANCE.getEPackage(IdentifiablePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		test403743_MainEClass.getESuperTypes().add(theIdentifiablePackage.getIdentifiable());
		test403743EClass.getESuperTypes().add(theIdentifiablePackage.getIdentifiable());

		// Initialize classes and features; add operations and parameters
		initEClass(test403743_MainEClass, Test403743_Main.class, "Test403743_Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTest403743_Main_Name(), ecorePackage.getEString(), "name", null, 0, 1, Test403743_Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest403743_Main_Children(), this.getTest403743(), null, "children", null, 0, -1, Test403743_Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(test403743EClass, Test403743.class, "Test403743", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTest403743_Name(), ecorePackage.getEString(), "name", null, 0, 1, Test403743.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest403743_Children(), this.getTest403743(), null, "children", null, 0, -1, Test403743.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Bz403743PackageImpl
