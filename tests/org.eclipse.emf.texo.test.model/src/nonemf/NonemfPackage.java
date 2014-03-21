/**
 * <copyright>
 * </copyright>
 *
 * $Id: NonemfPackage.java,v 1.4 2011/08/26 07:29:15 mtaal Exp $
 */
package nonemf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nonemf.NonemfFactory
 * @model kind="package"
 * @generated
 */
public interface NonemfPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "nonemf";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.nonemf.com/2010";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "test";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  NonemfPackage eINSTANCE = nonemf.impl.NonemfPackageImpl.init();

  /**
   * The meta object id for the '{@link java.io.Serializable <em>Serializable</em>}' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see java.io.Serializable
   * @see nonemf.impl.NonemfPackageImpl#getSerializable()
   * @generated
   */
  int SERIALIZABLE = 0;

  /**
   * The number of structural features of the '<em>Serializable</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int SERIALIZABLE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nonemf.impl.MySerializableClassImpl <em>My Serializable Class</em>}' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see nonemf.impl.MySerializableClassImpl
   * @see nonemf.impl.NonemfPackageImpl#getMySerializableClass()
   * @generated
   */
  int MY_SERIALIZABLE_CLASS = 1;

  /**
   * The feature id for the '<em><b>Something Interesting</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int MY_SERIALIZABLE_CLASS__SOMETHING_INTERESTING = SERIALIZABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>My Serializable Class</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_SERIALIZABLE_CLASS_FEATURE_COUNT = SERIALIZABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nonemf.impl.BImpl <em>B</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nonemf.impl.BImpl
   * @see nonemf.impl.NonemfPackageImpl#getB()
   * @generated
   */
  int B = 2;

  /**
   * The number of structural features of the '<em>B</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int B_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nonemf.impl.AImpl <em>A</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nonemf.impl.AImpl
   * @see nonemf.impl.NonemfPackageImpl#getA()
   * @generated
   */
  int A = 3;

  /**
   * The number of structural features of the '<em>A</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int A_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nonemf.TestB <em>Test B</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nonemf.TestB
   * @see nonemf.impl.NonemfPackageImpl#getTestB()
   * @generated
   */
  int TEST_B = 4;

  /**
   * The meta object id for the '{@link nonemf.TestA <em>Test A</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nonemf.TestA
   * @see nonemf.impl.NonemfPackageImpl#getTestA()
   * @generated
   */
  int TEST_A = 5;

  /**
   * Returns the meta object for class '{@link java.io.Serializable <em>Serializable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Serializable</em>'.
   * @see java.io.Serializable
   * @model instanceClass="java.io.Serializable"
   * @generated
   */
  EClass getSerializable();

  /**
   * Returns the meta object for class '{@link nonemf.MySerializableClass <em>My Serializable Class</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>My Serializable Class</em>'.
   * @see nonemf.MySerializableClass
   * @generated
   */
  EClass getMySerializableClass();

  /**
   * Returns the meta object for the attribute '{@link nonemf.MySerializableClass#getSomethingInteresting <em>Something Interesting</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Something Interesting</em>'.
   * @see nonemf.MySerializableClass#getSomethingInteresting()
   * @see #getMySerializableClass()
   * @generated
   */
  EAttribute getMySerializableClass_SomethingInteresting();

  /**
   * Returns the meta object for class '{@link nonemf.B <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>B</em>'.
   * @see nonemf.B
   * @generated
   */
  EClass getB();

  /**
   * Returns the meta object for class '{@link nonemf.A <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>A</em>'.
   * @see nonemf.A
   * @generated
   */
  EClass getA();

  /**
   * Returns the meta object for enum '{@link nonemf.TestB <em>Test B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Test B</em>'.
   * @see nonemf.TestB
   * @generated
   */
  EEnum getTestB();

  /**
   * Returns the meta object for enum '{@link nonemf.TestA <em>Test A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Test A</em>'.
   * @see nonemf.TestA
   * @generated
   */
  EEnum getTestA();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  NonemfFactory getNonemfFactory();

  /**
   * <!-- begin-user-doc --> Defines literals for the meta objects that represent
   * <ul>
   * <li>each class,</li>
   * <li>each feature of each class,</li>
   * <li>each enum,</li>
   * <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link java.io.Serializable <em>Serializable</em>}' class.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see java.io.Serializable
     * @see nonemf.impl.NonemfPackageImpl#getSerializable()
     * @generated
     */
    EClass SERIALIZABLE = eINSTANCE.getSerializable();

    /**
     * The meta object literal for the '{@link nonemf.impl.MySerializableClassImpl <em>My Serializable Class</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see nonemf.impl.MySerializableClassImpl
     * @see nonemf.impl.NonemfPackageImpl#getMySerializableClass()
     * @generated
     */
    EClass MY_SERIALIZABLE_CLASS = eINSTANCE.getMySerializableClass();

    /**
     * The meta object literal for the '<em><b>Something Interesting</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_SERIALIZABLE_CLASS__SOMETHING_INTERESTING = eINSTANCE.getMySerializableClass_SomethingInteresting();

    /**
     * The meta object literal for the '{@link nonemf.impl.BImpl <em>B</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nonemf.impl.BImpl
     * @see nonemf.impl.NonemfPackageImpl#getB()
     * @generated
     */
    EClass B = eINSTANCE.getB();

    /**
     * The meta object literal for the '{@link nonemf.impl.AImpl <em>A</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nonemf.impl.AImpl
     * @see nonemf.impl.NonemfPackageImpl#getA()
     * @generated
     */
    EClass A = eINSTANCE.getA();

    /**
     * The meta object literal for the '{@link nonemf.TestB <em>Test B</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nonemf.TestB
     * @see nonemf.impl.NonemfPackageImpl#getTestB()
     * @generated
     */
    EEnum TEST_B = eINSTANCE.getTestB();

    /**
     * The meta object literal for the '{@link nonemf.TestA <em>Test A</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nonemf.TestA
     * @see nonemf.impl.NonemfPackageImpl#getTestA()
     * @generated
     */
    EEnum TEST_A = eINSTANCE.getTestA();

  }

} // NonemfPackage
