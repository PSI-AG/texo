/**
 */
package org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.AbstractClass;
import org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.BzWrongFeatureIdFactory;
import org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.BzWrongFeatureIdPackage;
import org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.ConcreteClass;
import org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.TheInterface;

import org.eclipse.emf.texo.test.emfmodel.identifiable.IdentifiablePackage;

import org.eclipse.emf.texo.test.emfmodel.identifiable.impl.IdentifiablePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BzWrongFeatureIdPackageImpl extends EPackageImpl implements BzWrongFeatureIdPackage {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass abstractClassEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass theInterfaceEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass concreteClassEClass = null;

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
   * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.BzWrongFeatureIdPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private BzWrongFeatureIdPackageImpl() {
    super(eNS_URI, BzWrongFeatureIdFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link BzWrongFeatureIdPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static BzWrongFeatureIdPackage init() {
    if (isInited) return (BzWrongFeatureIdPackage)EPackage.Registry.INSTANCE.getEPackage(BzWrongFeatureIdPackage.eNS_URI);

    // Obtain or create and register package
    BzWrongFeatureIdPackageImpl theBzWrongFeatureIdPackage = (BzWrongFeatureIdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BzWrongFeatureIdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BzWrongFeatureIdPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    IdentifiablePackageImpl theIdentifiablePackage = (IdentifiablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentifiablePackage.eNS_URI) instanceof IdentifiablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentifiablePackage.eNS_URI) : IdentifiablePackage.eINSTANCE);

    // Create package meta-data objects
    theBzWrongFeatureIdPackage.createPackageContents();
    theIdentifiablePackage.createPackageContents();

    // Initialize created meta-data
    theBzWrongFeatureIdPackage.initializePackageContents();
    theIdentifiablePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBzWrongFeatureIdPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BzWrongFeatureIdPackage.eNS_URI, theBzWrongFeatureIdPackage);
    return theBzWrongFeatureIdPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAbstractClass() {
    return abstractClassEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAbstractClass_Name() {
    return (EAttribute)abstractClassEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getTheInterface() {
    return theInterfaceEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getTheInterface_InterfaceName() {
    return (EAttribute)theInterfaceEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getConcreteClass() {
    return concreteClassEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getConcreteClass_ConcreteName() {
    return (EAttribute)concreteClassEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BzWrongFeatureIdFactory getBzWrongFeatureIdFactory() {
    return (BzWrongFeatureIdFactory)getEFactoryInstance();
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
    abstractClassEClass = createEClass(ABSTRACT_CLASS);
    createEAttribute(abstractClassEClass, ABSTRACT_CLASS__NAME);

    theInterfaceEClass = createEClass(THE_INTERFACE);
    createEAttribute(theInterfaceEClass, THE_INTERFACE__INTERFACE_NAME);

    concreteClassEClass = createEClass(CONCRETE_CLASS);
    createEAttribute(concreteClassEClass, CONCRETE_CLASS__CONCRETE_NAME);
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
    abstractClassEClass.getESuperTypes().add(theIdentifiablePackage.getIdentifiable());
    concreteClassEClass.getESuperTypes().add(this.getTheInterface());
    concreteClassEClass.getESuperTypes().add(this.getAbstractClass());

    // Initialize classes and features; add operations and parameters
    initEClass(abstractClassEClass, AbstractClass.class, "AbstractClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(theInterfaceEClass, TheInterface.class, "TheInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTheInterface_InterfaceName(), ecorePackage.getEString(), "interfaceName", null, 0, 1, TheInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(concreteClassEClass, ConcreteClass.class, "ConcreteClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConcreteClass_ConcreteName(), ecorePackage.getEString(), "concreteName", null, 0, 1, ConcreteClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //BzWrongFeatureIdPackageImpl
