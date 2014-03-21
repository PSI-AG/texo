/**
 * <copyright>
 * </copyright>
 *
 * $Id: NonemfFactoryImpl.java,v 1.4 2011/08/26 07:29:14 mtaal Exp $
 */
package nonemf.impl;

import nonemf.A;
import nonemf.B;
import nonemf.MySerializableClass;
import nonemf.NonemfFactory;
import nonemf.NonemfPackage;
import nonemf.TestA;
import nonemf.TestB;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class NonemfFactoryImpl extends EFactoryImpl implements NonemfFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static NonemfFactory init() {
    try {
      NonemfFactory theNonemfFactory = (NonemfFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.nonemf.com/2010"); 
      if (theNonemfFactory != null) {
        return theNonemfFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new NonemfFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NonemfFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case NonemfPackage.MY_SERIALIZABLE_CLASS: return createMySerializableClass();
      case NonemfPackage.B: return createB();
      case NonemfPackage.A: return createA();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case NonemfPackage.TEST_B:
        return createTestBFromString(eDataType, initialValue);
      case NonemfPackage.TEST_A:
        return createTestAFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case NonemfPackage.TEST_B:
        return convertTestBToString(eDataType, instanceValue);
      case NonemfPackage.TEST_A:
        return convertTestAToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MySerializableClass createMySerializableClass() {
    MySerializableClassImpl mySerializableClass = new MySerializableClassImpl();
    return mySerializableClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public B createB() {
    BImpl b = new BImpl();
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public A createA() {
    AImpl a = new AImpl();
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestB createTestBFromString(EDataType eDataType, String initialValue) {
    TestB result = TestB.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTestBToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestA createTestAFromString(EDataType eDataType, String initialValue) {
    TestA result = TestA.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTestAToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NonemfPackage getNonemfPackage() {
    return (NonemfPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static NonemfPackage getPackage() {
    return NonemfPackage.eINSTANCE;
  }

} // NonemfFactoryImpl
