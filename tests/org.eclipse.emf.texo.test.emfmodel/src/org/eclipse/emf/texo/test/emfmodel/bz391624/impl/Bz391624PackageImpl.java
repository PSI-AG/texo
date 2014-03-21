/**
 */
package org.eclipse.emf.texo.test.emfmodel.bz391624.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.texo.test.emfmodel.bz391624.Author;
import org.eclipse.emf.texo.test.emfmodel.bz391624.Book;
import org.eclipse.emf.texo.test.emfmodel.bz391624.Bz391624Factory;
import org.eclipse.emf.texo.test.emfmodel.bz391624.Bz391624Package;
import org.eclipse.emf.texo.test.emfmodel.identifiable.IdentifiablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz391624PackageImpl extends EPackageImpl implements Bz391624Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorEClass = null;

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
	 * @see org.eclipse.emf.texo.test.emfmodel.bz391624.Bz391624Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz391624PackageImpl() {
		super(eNS_URI, Bz391624Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz391624Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz391624Package init() {
		if (isInited) return (Bz391624Package)EPackage.Registry.INSTANCE.getEPackage(Bz391624Package.eNS_URI);

		// Obtain or create and register package
		Bz391624PackageImpl theBz391624Package = (Bz391624PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz391624PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz391624PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		IdentifiablePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBz391624Package.createPackageContents();

		// Initialize created meta-data
		theBz391624Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz391624Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz391624Package.eNS_URI, theBz391624Package);
		return theBz391624Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBook() {
		return bookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBook_Authors() {
		return (EReference)bookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthor() {
		return authorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthor_Name() {
		return (EAttribute)authorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz391624Factory getBz391624Factory() {
		return (Bz391624Factory)getEFactoryInstance();
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
		bookEClass = createEClass(BOOK);
		createEReference(bookEClass, BOOK__AUTHORS);

		authorEClass = createEClass(AUTHOR);
		createEAttribute(authorEClass, AUTHOR__NAME);
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
		bookEClass.getESuperTypes().add(theIdentifiablePackage.getIdentifiable());
		authorEClass.getESuperTypes().add(theIdentifiablePackage.getNotIdentifiable());

		// Initialize classes and features; add operations and parameters
		initEClass(bookEClass, Book.class, "Book", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBook_Authors(), this.getAuthor(), null, "authors", null, 0, -1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorEClass, Author.class, "Author", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Bz391624PackageImpl
