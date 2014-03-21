/**
 */
package org.eclipse.emf.texo.test.emfmodel.bz403743.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.texo.test.emfmodel.bz403743.Bz403743Factory;
import org.eclipse.emf.texo.test.emfmodel.bz403743.Bz403743Package;
import org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743;
import org.eclipse.emf.texo.test.emfmodel.bz403743.Test403743_Main;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz403743FactoryImpl extends EFactoryImpl implements Bz403743Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bz403743Factory init() {
		try {
			Bz403743Factory theBz403743Factory = (Bz403743Factory)EPackage.Registry.INSTANCE.getEFactory(Bz403743Package.eNS_URI);
			if (theBz403743Factory != null) {
				return theBz403743Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bz403743FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz403743FactoryImpl() {
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
			case Bz403743Package.TEST403743_MAIN: return createTest403743_Main();
			case Bz403743Package.TEST403743: return createTest403743();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test403743_Main createTest403743_Main() {
		Test403743_MainImpl test403743_Main = new Test403743_MainImpl();
		return test403743_Main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test403743 createTest403743() {
		Test403743Impl test403743 = new Test403743Impl();
		return test403743;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz403743Package getBz403743Package() {
		return (Bz403743Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bz403743Package getPackage() {
		return Bz403743Package.eINSTANCE;
	}

} //Bz403743FactoryImpl
