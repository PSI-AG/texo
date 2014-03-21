/**
 */
package org.eclipse.emf.texo.test.emfmodel.bz391624.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.texo.test.emfmodel.bz391624.Author;
import org.eclipse.emf.texo.test.emfmodel.bz391624.Book;
import org.eclipse.emf.texo.test.emfmodel.bz391624.Bz391624Factory;
import org.eclipse.emf.texo.test.emfmodel.bz391624.Bz391624Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz391624FactoryImpl extends EFactoryImpl implements Bz391624Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bz391624Factory init() {
		try {
			Bz391624Factory theBz391624Factory = (Bz391624Factory)EPackage.Registry.INSTANCE.getEFactory(Bz391624Package.eNS_URI);
			if (theBz391624Factory != null) {
				return theBz391624Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bz391624FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz391624FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Bz391624Package.BOOK: return createBook();
			case Bz391624Package.AUTHOR: return createAuthor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book createBook() {
		BookImpl book = new BookImpl();
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author createAuthor() {
		AuthorImpl author = new AuthorImpl();
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz391624Package getBz391624Package() {
		return (Bz391624Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bz391624Package getPackage() {
		return Bz391624Package.eINSTANCE;
	}

} //Bz391624FactoryImpl
