/**
 * <copyright>
 * </copyright>
 *
 * $Id: NonemfPackageImpl.java,v 1.4 2011/08/26 07:29:14 mtaal Exp $
 */
package nonemf.impl;

import java.io.Serializable;

import nonemf.MySerializableClass;
import nonemf.NonemfFactory;
import nonemf.NonemfPackage;
import nonemf.TestA;
import nonemf.TestB;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class NonemfPackageImpl extends EPackageImpl implements NonemfPackage {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass serializableEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass mySerializableClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum testBEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum testAEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see nonemf.NonemfPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private NonemfPackageImpl() {
    super(eNS_URI, NonemfFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link NonemfPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static NonemfPackage init() {
    if (isInited) return (NonemfPackage)EPackage.Registry.INSTANCE.getEPackage(NonemfPackage.eNS_URI);

    // Obtain or create and register package
    NonemfPackageImpl theNonemfPackage = (NonemfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NonemfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NonemfPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theNonemfPackage.createPackageContents();

    // Initialize created meta-data
    theNonemfPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theNonemfPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(NonemfPackage.eNS_URI, theNonemfPackage);
    return theNonemfPackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getSerializable() {
    return serializableEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EClass getMySerializableClass() {
    return mySerializableClassEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMySerializableClass_SomethingInteresting() {
    return (EAttribute)mySerializableClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getB() {
    return bEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getA() {
    return aEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTestB() {
    return testBEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTestA() {
    return testAEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NonemfFactory getNonemfFactory() {
    return (NonemfFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    serializableEClass = createEClass(SERIALIZABLE);

    mySerializableClassEClass = createEClass(MY_SERIALIZABLE_CLASS);
    createEAttribute(mySerializableClassEClass, MY_SERIALIZABLE_CLASS__SOMETHING_INTERESTING);

    bEClass = createEClass(B);

    aEClass = createEClass(A);

    // Create enums
    testBEEnum = createEEnum(TEST_B);
    testAEEnum = createEEnum(TEST_A);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    mySerializableClassEClass.getESuperTypes().add(this.getSerializable());

    // Initialize classes and features; add operations and parameters
    initEClass(serializableEClass, Serializable.class, "Serializable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

    initEClass(mySerializableClassEClass, MySerializableClass.class, "MySerializableClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMySerializableClass_SomethingInteresting(), ecorePackage.getEString(), "somethingInteresting", null, 0, 1, MySerializableClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bEClass, nonemf.B.class, "B", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(aEClass, nonemf.A.class, "A", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(testBEEnum, TestB.class, "TestB");

    initEEnum(testAEEnum, TestA.class, "TestA");

    // Create resource
    createResource(eNS_URI);
  }

} // NonemfPackageImpl
