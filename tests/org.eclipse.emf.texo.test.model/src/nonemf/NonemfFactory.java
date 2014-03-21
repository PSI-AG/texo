/**
 * <copyright>
 * </copyright>
 *
 * $Id: NonemfFactory.java,v 1.4 2011/08/26 07:29:15 mtaal Exp $
 */
package nonemf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see nonemf.NonemfPackage
 * @generated
 */
public interface NonemfFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  NonemfFactory eINSTANCE = nonemf.impl.NonemfFactoryImpl.init();

  /**
   * Returns a new object of class '<em>My Serializable Class</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>My Serializable Class</em>'.
   * @generated
   */
  MySerializableClass createMySerializableClass();

  /**
   * Returns a new object of class '<em>B</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>B</em>'.
   * @generated
   */
  B createB();

  /**
   * Returns a new object of class '<em>A</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>A</em>'.
   * @generated
   */
  A createA();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  NonemfPackage getNonemfPackage();

} // NonemfFactory
