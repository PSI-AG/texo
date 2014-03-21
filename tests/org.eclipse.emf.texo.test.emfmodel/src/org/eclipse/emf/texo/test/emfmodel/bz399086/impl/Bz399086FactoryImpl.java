/**
 */
package org.eclipse.emf.texo.test.emfmodel.bz399086.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.texo.test.emfmodel.bz399086.Bz399086Factory;
import org.eclipse.emf.texo.test.emfmodel.bz399086.Bz399086Package;
import org.eclipse.emf.texo.test.emfmodel.bz399086.MapElement;
import org.eclipse.emf.texo.test.emfmodel.bz399086.TheMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz399086FactoryImpl extends EFactoryImpl implements Bz399086Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bz399086Factory init() {
		try {
			Bz399086Factory theBz399086Factory = (Bz399086Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/texo/test/model/issues/bz399086"); 
			if (theBz399086Factory != null) {
				return theBz399086Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bz399086FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz399086FactoryImpl() {
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
			case Bz399086Package.MAP_ELEMENT: return createMapElement();
			case Bz399086Package.MAP_REF_ENTRY: return (EObject)createMapRefEntry();
			case Bz399086Package.MAP_VALUE_ENTRY: return (EObject)createMapValueEntry();
			case Bz399086Package.THE_MAP: return createTheMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapElement createMapElement() {
		MapElementImpl mapElement = new MapElementImpl();
		return mapElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, MapElement> createMapRefEntry() {
		MapRefEntryImpl mapRefEntry = new MapRefEntryImpl();
		return mapRefEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createMapValueEntry() {
		MapValueEntryImpl mapValueEntry = new MapValueEntryImpl();
		return mapValueEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheMap createTheMap() {
		TheMapImpl theMap = new TheMapImpl();
		return theMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz399086Package getBz399086Package() {
		return (Bz399086Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bz399086Package getPackage() {
		return Bz399086Package.eINSTANCE;
	}

} //Bz399086FactoryImpl
