/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.emf.model.samples.library.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.texo.emf.model.base.identifiable.IdentifiablePackage;
import org.eclipse.emf.texo.emf.model.base.identifiable.impl.IdentifiablePackageImpl;
import org.eclipse.emf.texo.emf.model.samples.library.Book;
import org.eclipse.emf.texo.emf.model.samples.library.BookCategory;
import org.eclipse.emf.texo.emf.model.samples.library.Library;
import org.eclipse.emf.texo.emf.model.samples.library.LibraryFactory;
import org.eclipse.emf.texo.emf.model.samples.library.LibraryPackage;
import org.eclipse.emf.texo.emf.model.samples.library.Writer;
import org.eclipse.emf.texo.emf.model.samples.schoollibrary.SchoollibraryPackage;
import org.eclipse.emf.texo.emf.model.samples.schoollibrary.impl.SchoollibraryPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryPackageImpl extends EPackageImpl implements LibraryPackage {
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
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bookCategoryEEnum = null;

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
	 * @see org.eclipse.emf.texo.emf.model.samples.library.LibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LibraryPackageImpl() {
		super(eNS_URI, LibraryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LibraryPackage init() {
		if (isInited) return (LibraryPackage)EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI);

		// Obtain or create and register package
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LibraryPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SchoollibraryPackageImpl theSchoollibraryPackage = (SchoollibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchoollibraryPackage.eNS_URI) instanceof SchoollibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchoollibraryPackage.eNS_URI) : SchoollibraryPackage.eINSTANCE);
		IdentifiablePackageImpl theIdentifiablePackage = (IdentifiablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentifiablePackage.eNS_URI) instanceof IdentifiablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentifiablePackage.eNS_URI) : IdentifiablePackage.eINSTANCE);

		// Create package meta-data objects
		theLibraryPackage.createPackageContents();
		theSchoollibraryPackage.createPackageContents();
		theIdentifiablePackage.createPackageContents();

		// Initialize created meta-data
		theLibraryPackage.initializePackageContents();
		theSchoollibraryPackage.initializePackageContents();
		theIdentifiablePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLibraryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LibraryPackage.eNS_URI, theLibraryPackage);
		return theLibraryPackage;
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
	public EAttribute getBook_Title() {
		return (EAttribute)bookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBook_Pages() {
		return (EAttribute)bookEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBook_Category() {
		return (EAttribute)bookEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBook_Author() {
		return (EReference)bookEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibrary_Name() {
		return (EAttribute)libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Writers() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Books() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriter() {
		return writerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriter_Name() {
		return (EAttribute)writerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriter_Books() {
		return (EReference)writerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBookCategory() {
		return bookCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryFactory getLibraryFactory() {
		return (LibraryFactory)getEFactoryInstance();
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
		createEAttribute(bookEClass, BOOK__TITLE);
		createEAttribute(bookEClass, BOOK__PAGES);
		createEAttribute(bookEClass, BOOK__CATEGORY);
		createEReference(bookEClass, BOOK__AUTHOR);

		libraryEClass = createEClass(LIBRARY);
		createEAttribute(libraryEClass, LIBRARY__NAME);
		createEReference(libraryEClass, LIBRARY__WRITERS);
		createEReference(libraryEClass, LIBRARY__BOOKS);

		writerEClass = createEClass(WRITER);
		createEAttribute(writerEClass, WRITER__NAME);
		createEReference(writerEClass, WRITER__BOOKS);

		// Create enums
		bookCategoryEEnum = createEEnum(BOOK_CATEGORY);
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
		libraryEClass.getESuperTypes().add(theIdentifiablePackage.getIdentifiable());
		writerEClass.getESuperTypes().add(theIdentifiablePackage.getIdentifiable());

		// Initialize classes and features; add operations and parameters
		initEClass(bookEClass, Book.class, "Book", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBook_Title(), ecorePackage.getEString(), "title", null, 0, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBook_Pages(), ecorePackage.getEInt(), "pages", "100", 0, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBook_Category(), this.getBookCategory(), "category", "ScienceFiction", 0, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBook_Author(), this.getWriter(), this.getWriter_Books(), "author", null, 1, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLibrary_Name(), ecorePackage.getEString(), "name", null, 0, 1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_Writers(), this.getWriter(), null, "writers", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_Books(), this.getBook(), null, "books", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writerEClass, Writer.class, "Writer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWriter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Writer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWriter_Books(), this.getBook(), this.getBook_Author(), "books", null, 0, -1, Writer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bookCategoryEEnum, BookCategory.class, "BookCategory");
		addEEnumLiteral(bookCategoryEEnum, BookCategory.MYSTERY);
		addEEnumLiteral(bookCategoryEEnum, BookCategory.SCIENCE_FICTION);
		addEEnumLiteral(bookCategoryEEnum, BookCategory.BIOGRAPHY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// texo.java.annotation
		createTexoAnnotations();
		// org.eclipse.emf.texo
		createOrgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>texo.java.annotation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTexoAnnotations() {
		String source = "texo.java.annotation";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "type", "@org.eclipse.emf.texo.test.models.annotations.TestAnnotationOne(\"type\")"
		   });		
		addAnnotation
		  (bookEClass, 
		   source, 
		   new String[] {
			 "value", "@org.eclipse.emf.texo.test.models.annotations.TestAnnotationOne(\"test\")"
		   });			
		addAnnotation
		  (getBook_Title(), 
		   source, 
		   new String[] {
			 "field", "@org.eclipse.emf.texo.test.models.annotations.TestAnnotationOne(\"field\")\n@org.eclipse.emf.texo.test.models.annotations.TestAnnotationTwo(\"field\")"
		   });			
		addAnnotation
		  (getBook_Pages(), 
		   source, 
		   new String[] {
			 "getter", "@org.eclipse.emf.texo.test.models.annotations.TestAnnotationOne(\"getter\")"
		   });		
		addAnnotation
		  (getBook_Author(), 
		   source, 
		   new String[] {
			 "setter", "@org.eclipse.emf.texo.test.models.annotations.TestAnnotationOne(\"setter\")"
		   });		
		addAnnotation
		  (libraryEClass, 
		   source, 
		   new String[] {
			 "type", "@orgeclipseemftexo.OneDotAnnotation(\"test\")"
		   });			
		addAnnotation
		  (bookCategoryEEnum, 
		   source, 
		   new String[] {
			 "type", "@org.eclipse.emf.texo.test.models.annotations.TestAnnotationOne(\"enum\")"
		   });
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.emf.texo</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.eclipse.emf.texo";				
		addAnnotation
		  (bookEClass, 
		   source, 
		   new String[] {
			 "title", "${title} (${pages}) - ${category}"
		   });			
		addAnnotation
		  (getBook_Title(), 
		   source, 
		   new String[] {
			 "id", "true"
		   });					
		addAnnotation
		  (getWriter_Name(), 
		   source, 
		   new String[] {
			 "title", "true",
			 "id", "true"
		   });	
	}

} //LibraryPackageImpl
