/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.emf.model.samples.schoollibrary.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.texo.emf.model.base.identifiable.IdentifiablePackage;

import org.eclipse.emf.texo.emf.model.base.identifiable.impl.IdentifiablePackageImpl;

import org.eclipse.emf.texo.emf.model.samples.library.LibraryPackage;

import org.eclipse.emf.texo.emf.model.samples.library.impl.LibraryPackageImpl;

import org.eclipse.emf.texo.emf.model.samples.schoollibrary.Asset;
import org.eclipse.emf.texo.emf.model.samples.schoollibrary.SchoolBook;
import org.eclipse.emf.texo.emf.model.samples.schoollibrary.SchoolLibrary;
import org.eclipse.emf.texo.emf.model.samples.schoollibrary.SchoollibraryFactory;
import org.eclipse.emf.texo.emf.model.samples.schoollibrary.SchoollibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchoollibraryPackageImpl extends EPackageImpl implements SchoollibraryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schoolBookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schoolLibraryEClass = null;

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
	 * @see org.eclipse.emf.texo.emf.model.samples.schoollibrary.SchoollibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchoollibraryPackageImpl() {
		super(eNS_URI, SchoollibraryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SchoollibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchoollibraryPackage init() {
		if (isInited) return (SchoollibraryPackage)EPackage.Registry.INSTANCE.getEPackage(SchoollibraryPackage.eNS_URI);

		// Obtain or create and register package
		SchoollibraryPackageImpl theSchoollibraryPackage = (SchoollibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SchoollibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SchoollibraryPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) instanceof LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) : LibraryPackage.eINSTANCE);
		IdentifiablePackageImpl theIdentifiablePackage = (IdentifiablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentifiablePackage.eNS_URI) instanceof IdentifiablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentifiablePackage.eNS_URI) : IdentifiablePackage.eINSTANCE);

		// Create package meta-data objects
		theSchoollibraryPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theIdentifiablePackage.createPackageContents();

		// Initialize created meta-data
		theSchoollibraryPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theIdentifiablePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSchoollibraryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchoollibraryPackage.eNS_URI, theSchoollibraryPackage);
		return theSchoollibraryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_Value() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchoolBook() {
		return schoolBookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchoolLibrary() {
		return schoolLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchoolLibrary_Location() {
		return (EAttribute)schoolLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoollibraryFactory getSchoollibraryFactory() {
		return (SchoollibraryFactory)getEFactoryInstance();
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
		assetEClass = createEClass(ASSET);
		createEAttribute(assetEClass, ASSET__VALUE);

		schoolBookEClass = createEClass(SCHOOL_BOOK);

		schoolLibraryEClass = createEClass(SCHOOL_LIBRARY);
		createEAttribute(schoolLibraryEClass, SCHOOL_LIBRARY__LOCATION);
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
		LibraryPackage theLibraryPackage = (LibraryPackage)EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		schoolBookEClass.getESuperTypes().add(theLibraryPackage.getBook());
		schoolBookEClass.getESuperTypes().add(this.getAsset());
		schoolLibraryEClass.getESuperTypes().add(theLibraryPackage.getLibrary());

		// Initialize classes and features; add operations and parameters
		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schoolBookEClass, SchoolBook.class, "SchoolBook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schoolLibraryEClass, SchoolLibrary.class, "SchoolLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchoolLibrary_Location(), ecorePackage.getEString(), "location", null, 0, 1, SchoolLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SchoollibraryPackageImpl
