/**
 */
package org.eclipse.emf.texo.test.emfmodel.bz399086.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.test.emfmodel.bz399086.Bz399086Factory;
import org.eclipse.emf.texo.test.emfmodel.bz399086.Bz399086Package;
import org.eclipse.emf.texo.test.emfmodel.bz399086.MapElement;
import org.eclipse.emf.texo.test.emfmodel.bz399086.TheMap;
import org.eclipse.emf.texo.test.emfmodel.identifiable.IdentifiablePackage;
import org.eclipse.emf.texo.test.emfmodel.identifiable.impl.IdentifiablePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz399086PackageImpl extends EPackageImpl implements Bz399086Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapRefEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapValueEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass theMapEClass = null;

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
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.Bz399086Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz399086PackageImpl() {
		super(eNS_URI, Bz399086Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz399086Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz399086Package init() {
		if (isInited) return (Bz399086Package)EPackage.Registry.INSTANCE.getEPackage(Bz399086Package.eNS_URI);

		// Obtain or create and register package
		Bz399086PackageImpl theBz399086Package = (Bz399086PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz399086PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz399086PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		IdentifiablePackageImpl theIdentifiablePackage = (IdentifiablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentifiablePackage.eNS_URI) instanceof IdentifiablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentifiablePackage.eNS_URI) : IdentifiablePackage.eINSTANCE);

		// Create package meta-data objects
		theBz399086Package.createPackageContents();
		theIdentifiablePackage.createPackageContents();

		// Initialize created meta-data
		theBz399086Package.initializePackageContents();
		theIdentifiablePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz399086Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz399086Package.eNS_URI, theBz399086Package);
		return theBz399086Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapElement() {
		return mapElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapElement_Name() {
		return (EAttribute)mapElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapRefEntry() {
		return mapRefEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapRefEntry_Key() {
		return (EAttribute)mapRefEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapRefEntry_Value() {
		return (EReference)mapRefEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapValueEntry() {
		return mapValueEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapValueEntry_Key() {
		return (EAttribute)mapValueEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapValueEntry_Value() {
		return (EAttribute)mapValueEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTheMap() {
		return theMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheMap_RefContent() {
		return (EReference)theMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheMap_ValueContent() {
		return (EReference)theMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz399086Factory getBz399086Factory() {
		return (Bz399086Factory)getEFactoryInstance();
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
		mapElementEClass = createEClass(MAP_ELEMENT);
		createEAttribute(mapElementEClass, MAP_ELEMENT__NAME);

		mapRefEntryEClass = createEClass(MAP_REF_ENTRY);
		createEAttribute(mapRefEntryEClass, MAP_REF_ENTRY__KEY);
		createEReference(mapRefEntryEClass, MAP_REF_ENTRY__VALUE);

		mapValueEntryEClass = createEClass(MAP_VALUE_ENTRY);
		createEAttribute(mapValueEntryEClass, MAP_VALUE_ENTRY__KEY);
		createEAttribute(mapValueEntryEClass, MAP_VALUE_ENTRY__VALUE);

		theMapEClass = createEClass(THE_MAP);
		createEReference(theMapEClass, THE_MAP__REF_CONTENT);
		createEReference(theMapEClass, THE_MAP__VALUE_CONTENT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mapElementEClass.getESuperTypes().add(theIdentifiablePackage.getIdentifiable());
		theMapEClass.getESuperTypes().add(theIdentifiablePackage.getIdentifiable());

		// Initialize classes and features; add operations and parameters
		initEClass(mapElementEClass, MapElement.class, "MapElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapElement_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, MapElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapRefEntryEClass, Map.Entry.class, "MapRefEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapRefEntry_Key(), theXMLTypePackage.getString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapRefEntry_Value(), this.getMapElement(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapValueEntryEClass, Map.Entry.class, "MapValueEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapValueEntry_Key(), theXMLTypePackage.getString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapValueEntry_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(theMapEClass, TheMap.class, "TheMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTheMap_RefContent(), this.getMapRefEntry(), null, "refContent", null, 0, -1, TheMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTheMap_ValueContent(), this.getMapValueEntry(), null, "valueContent", null, 0, -1, TheMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (mapElementEClass, 
		   source, 
		   new String[] {
			 "name", "MapElement",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMapElement_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (mapRefEntryEClass, 
		   source, 
		   new String[] {
			 "name", "MapRefEntry",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMapRefEntry_Key(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "key"
		   });		
		addAnnotation
		  (getMapRefEntry_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value"
		   });		
		addAnnotation
		  (mapValueEntryEClass, 
		   source, 
		   new String[] {
			 "name", "MapValueEntry",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMapValueEntry_Key(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "key"
		   });		
		addAnnotation
		  (getMapValueEntry_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value"
		   });		
		addAnnotation
		  (theMapEClass, 
		   source, 
		   new String[] {
			 "name", "TheMap",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTheMap_RefContent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refContent"
		   });		
		addAnnotation
		  (getTheMap_ValueContent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "valueContent"
		   });
	}

} //Bz399086PackageImpl
