/**
 */
package org.eclipse.emf.texo.test.emfmodel.bz391624;

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
 * @see org.eclipse.emf.texo.test.emfmodel.bz391624.Bz391624Factory
 * @model kind="package"
 * @generated
 */
public interface Bz391624Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz391624";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz391624";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz391624";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz391624Package eINSTANCE = org.eclipse.emf.texo.test.emfmodel.bz391624.impl.Bz391624PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.test.emfmodel.bz391624.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.test.emfmodel.bz391624.impl.BookImpl
	 * @see org.eclipse.emf.texo.test.emfmodel.bz391624.impl.Bz391624PackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 0;

	/**
	 * The feature id for the '<em><b>Db Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__DB_ID = IdentifiablePackage.IDENTIFIABLE__DB_ID;

	/**
	 * The feature id for the '<em><b>Db version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__DB_VERSION = IdentifiablePackage.IDENTIFIABLE__DB_VERSION;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__AUTHORS = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.test.emfmodel.bz391624.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.test.emfmodel.bz391624.impl.AuthorImpl
	 * @see org.eclipse.emf.texo.test.emfmodel.bz391624.impl.Bz391624PackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NAME = IdentifiablePackage.NOT_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = IdentifiablePackage.NOT_IDENTIFIABLE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.test.emfmodel.bz391624.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz391624.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.test.emfmodel.bz391624.Book#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authors</em>'.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz391624.Book#getAuthors()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Authors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.test.emfmodel.bz391624.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz391624.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.test.emfmodel.bz391624.Author#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz391624.Author#getName()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz391624Factory getBz391624Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.texo.test.emfmodel.bz391624.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.test.emfmodel.bz391624.impl.BookImpl
		 * @see org.eclipse.emf.texo.test.emfmodel.bz391624.impl.Bz391624PackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__AUTHORS = eINSTANCE.getBook_Authors();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.test.emfmodel.bz391624.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.test.emfmodel.bz391624.impl.AuthorImpl
		 * @see org.eclipse.emf.texo.test.emfmodel.bz391624.impl.Bz391624PackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__NAME = eINSTANCE.getAuthor_Name();

	}

} //Bz391624Package
