/**
 */
package org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.texo.test.emfmodel.identifiable.IdentifiablePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.BzWrongFeatureIdFactory
 * @model kind="package"
 * @generated
 */
public interface BzWrongFeatureIdPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "bzWrongFeatureId";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bzWrongFeatureId";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "bzWrongFeatureId";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	BzWrongFeatureIdPackage eINSTANCE = org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.BzWrongFeatureIdPackageImpl.init();

	/**
   * The meta object id for the '{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.AbstractClassImpl <em>Abstract Class</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.AbstractClassImpl
   * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.BzWrongFeatureIdPackageImpl#getAbstractClass()
   * @generated
   */
	int ABSTRACT_CLASS = 0;

	/**
   * The feature id for the '<em><b>Db Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABSTRACT_CLASS__DB_ID = IdentifiablePackage.IDENTIFIABLE__DB_ID;

	/**
   * The feature id for the '<em><b>Db version</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABSTRACT_CLASS__DB_VERSION = IdentifiablePackage.IDENTIFIABLE__DB_VERSION;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABSTRACT_CLASS__NAME = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Abstract Class</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABSTRACT_CLASS_FEATURE_COUNT = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.TheInterface <em>The Interface</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.TheInterface
   * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.BzWrongFeatureIdPackageImpl#getTheInterface()
   * @generated
   */
	int THE_INTERFACE = 1;

	/**
   * The feature id for the '<em><b>Interface Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THE_INTERFACE__INTERFACE_NAME = 0;

	/**
   * The number of structural features of the '<em>The Interface</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int THE_INTERFACE_FEATURE_COUNT = 1;

	/**
   * The meta object id for the '{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.ConcreteClassImpl <em>Concrete Class</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.ConcreteClassImpl
   * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.BzWrongFeatureIdPackageImpl#getConcreteClass()
   * @generated
   */
	int CONCRETE_CLASS = 2;

	/**
   * The feature id for the '<em><b>Interface Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONCRETE_CLASS__INTERFACE_NAME = THE_INTERFACE__INTERFACE_NAME;

	/**
   * The feature id for the '<em><b>Db Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONCRETE_CLASS__DB_ID = THE_INTERFACE_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Db version</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONCRETE_CLASS__DB_VERSION = THE_INTERFACE_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONCRETE_CLASS__NAME = THE_INTERFACE_FEATURE_COUNT + 2;

	/**
   * The feature id for the '<em><b>Concrete Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONCRETE_CLASS__CONCRETE_NAME = THE_INTERFACE_FEATURE_COUNT + 3;

	/**
   * The number of structural features of the '<em>Concrete Class</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONCRETE_CLASS_FEATURE_COUNT = THE_INTERFACE_FEATURE_COUNT + 4;


	/**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.AbstractClass <em>Abstract Class</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Class</em>'.
   * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.AbstractClass
   * @generated
   */
	EClass getAbstractClass();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.AbstractClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.AbstractClass#getName()
   * @see #getAbstractClass()
   * @generated
   */
	EAttribute getAbstractClass_Name();

	/**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.TheInterface <em>The Interface</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>The Interface</em>'.
   * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.TheInterface
   * @generated
   */
	EClass getTheInterface();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.TheInterface#getInterfaceName <em>Interface Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface Name</em>'.
   * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.TheInterface#getInterfaceName()
   * @see #getTheInterface()
   * @generated
   */
	EAttribute getTheInterface_InterfaceName();

	/**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.ConcreteClass <em>Concrete Class</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concrete Class</em>'.
   * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.ConcreteClass
   * @generated
   */
	EClass getConcreteClass();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.ConcreteClass#getConcreteName <em>Concrete Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Concrete Name</em>'.
   * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.ConcreteClass#getConcreteName()
   * @see #getConcreteClass()
   * @generated
   */
	EAttribute getConcreteClass_ConcreteName();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	BzWrongFeatureIdFactory getBzWrongFeatureIdFactory();

	/**
   * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
   * @generated
   */
	interface Literals {
		/**
     * The meta object literal for the '{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.AbstractClassImpl <em>Abstract Class</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.AbstractClassImpl
     * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.BzWrongFeatureIdPackageImpl#getAbstractClass()
     * @generated
     */
		EClass ABSTRACT_CLASS = eINSTANCE.getAbstractClass();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ABSTRACT_CLASS__NAME = eINSTANCE.getAbstractClass_Name();

		/**
     * The meta object literal for the '{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.TheInterface <em>The Interface</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.TheInterface
     * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.BzWrongFeatureIdPackageImpl#getTheInterface()
     * @generated
     */
		EClass THE_INTERFACE = eINSTANCE.getTheInterface();

		/**
     * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute THE_INTERFACE__INTERFACE_NAME = eINSTANCE.getTheInterface_InterfaceName();

		/**
     * The meta object literal for the '{@link org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.ConcreteClassImpl <em>Concrete Class</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.ConcreteClassImpl
     * @see org.eclipse.emf.texo.test.emfmodel.bzWrongFeatureId.impl.BzWrongFeatureIdPackageImpl#getConcreteClass()
     * @generated
     */
		EClass CONCRETE_CLASS = eINSTANCE.getConcreteClass();

		/**
     * The meta object literal for the '<em><b>Concrete Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute CONCRETE_CLASS__CONCRETE_NAME = eINSTANCE.getConcreteClass_ConcreteName();

	}

} //BzWrongFeatureIdPackage
