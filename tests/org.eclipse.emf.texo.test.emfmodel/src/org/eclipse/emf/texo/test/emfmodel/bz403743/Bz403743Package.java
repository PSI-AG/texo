/**
 */
package org.eclipse.emf.texo.test.emfmodel.bz403743;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.Bz403743Factory
 * @model kind="package"
 * @generated
 */
public interface Bz403743Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz403743";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz403743";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz403743";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz403743Package eINSTANCE = org.eclipse.emf.texo.test.emfmodel.bz403743.impl.Bz403743PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.test.emfmodel.bz403743.impl.Test403743_MainImpl <em>Test403743 Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.impl.Test403743_MainImpl
	 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.impl.Bz403743PackageImpl#getTest403743_Main()
	 * @generated
	 */
	int TEST403743_MAIN = 0;

	/**
	 * The feature id for the '<em><b>Db Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST403743_MAIN__DB_ID = IdentifiablePackage.IDENTIFIABLE__DB_ID;

	/**
	 * The feature id for the '<em><b>Db version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST403743_MAIN__DB_VERSION = IdentifiablePackage.IDENTIFIABLE__DB_VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST403743_MAIN__NAME = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST403743_MAIN__CHILDREN = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test403743 Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST403743_MAIN_FEATURE_COUNT = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.test.emfmodel.bz403743.impl.Test403743Impl <em>Test403743</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.impl.Test403743Impl
	 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.impl.Bz403743PackageImpl#getTest403743()
	 * @generated
	 */
	int TEST403743 = 1;

	/**
	 * The feature id for the '<em><b>Db Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST403743__DB_ID = IdentifiablePackage.IDENTIFIABLE__DB_ID;

	/**
	 * The feature id for the '<em><b>Db version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST403743__DB_VERSION = IdentifiablePackage.IDENTIFIABLE__DB_VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST403743__NAME = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST403743__CHILDREN = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test403743</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST403743_FEATURE_COUNT = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743_Main <em>Test403743 Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test403743 Main</em>'.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743_Main
	 * @generated
	 */
	EClass getTest403743_Main();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743_Main#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743_Main#getName()
	 * @see #getTest403743_Main()
	 * @generated
	 */
	EAttribute getTest403743_Main_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743_Main#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743_Main#getChildren()
	 * @see #getTest403743_Main()
	 * @generated
	 */
	EReference getTest403743_Main_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743 <em>Test403743</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test403743</em>'.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743
	 * @generated
	 */
	EClass getTest403743();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743#getName()
	 * @see #getTest403743()
	 * @generated
	 */
	EAttribute getTest403743_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743#getChildren()
	 * @see #getTest403743()
	 * @generated
	 */
	EReference getTest403743_Children();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz403743Factory getBz403743Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.texo.test.emfmodel.bz403743.impl.Test403743_MainImpl <em>Test403743 Main</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.impl.Test403743_MainImpl
		 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.impl.Bz403743PackageImpl#getTest403743_Main()
		 * @generated
		 */
		EClass TEST403743_MAIN = eINSTANCE.getTest403743_Main();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST403743_MAIN__NAME = eINSTANCE.getTest403743_Main_Name();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST403743_MAIN__CHILDREN = eINSTANCE.getTest403743_Main_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.test.emfmodel.bz403743.impl.Test403743Impl <em>Test403743</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.impl.Test403743Impl
		 * @see org.eclipse.emf.texo.test.emfmodel.bz403743.impl.Bz403743PackageImpl#getTest403743()
		 * @generated
		 */
		EClass TEST403743 = eINSTANCE.getTest403743();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST403743__NAME = eINSTANCE.getTest403743_Name();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST403743__CHILDREN = eINSTANCE.getTest403743_Children();

	}

} //Bz403743Package
