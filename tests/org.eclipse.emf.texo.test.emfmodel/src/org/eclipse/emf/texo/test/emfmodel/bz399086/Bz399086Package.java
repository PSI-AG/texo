/**
 */
package org.eclipse.emf.texo.test.emfmodel.bz399086;

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
 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.Bz399086Factory
 * @model kind="package"
 * @generated
 */
public interface Bz399086Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz399086";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz399086";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz399086";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz399086Package eINSTANCE = org.eclipse.emf.texo.test.emfmodel.bz399086.impl.Bz399086PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.test.emfmodel.bz399086.impl.MapElementImpl <em>Map Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.impl.MapElementImpl
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.impl.Bz399086PackageImpl#getMapElement()
	 * @generated
	 */
	int MAP_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Db Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__DB_ID = IdentifiablePackage.IDENTIFIABLE__DB_ID;

	/**
	 * The feature id for the '<em><b>Db version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__DB_VERSION = IdentifiablePackage.IDENTIFIABLE__DB_VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__NAME = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT_FEATURE_COUNT = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.test.emfmodel.bz399086.impl.MapRefEntryImpl <em>Map Ref Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.impl.MapRefEntryImpl
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.impl.Bz399086PackageImpl#getMapRefEntry()
	 * @generated
	 */
	int MAP_REF_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_REF_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_REF_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Map Ref Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_REF_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.test.emfmodel.bz399086.impl.MapValueEntryImpl <em>Map Value Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.impl.MapValueEntryImpl
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.impl.Bz399086PackageImpl#getMapValueEntry()
	 * @generated
	 */
	int MAP_VALUE_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VALUE_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VALUE_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Map Value Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VALUE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.test.emfmodel.bz399086.impl.TheMapImpl <em>The Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.impl.TheMapImpl
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.impl.Bz399086PackageImpl#getTheMap()
	 * @generated
	 */
	int THE_MAP = 3;

	/**
	 * The feature id for the '<em><b>Db Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_MAP__DB_ID = IdentifiablePackage.IDENTIFIABLE__DB_ID;

	/**
	 * The feature id for the '<em><b>Db version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_MAP__DB_VERSION = IdentifiablePackage.IDENTIFIABLE__DB_VERSION;

	/**
	 * The feature id for the '<em><b>Ref Content</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_MAP__REF_CONTENT = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Content</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_MAP__VALUE_CONTENT = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>The Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THE_MAP_FEATURE_COUNT = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.test.emfmodel.bz399086.MapElement <em>Map Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Element</em>'.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.MapElement
	 * @generated
	 */
	EClass getMapElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.test.emfmodel.bz399086.MapElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.MapElement#getName()
	 * @see #getMapElement()
	 * @generated
	 */
	EAttribute getMapElement_Name();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Map Ref Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Ref Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.xml.type.String" keyRequired="true"
	 *        keyExtendedMetaData="kind='element' name='key'"
	 *        valueType="org.eclipse.emf.texo.test.emfmodel.bz399086.MapElement" valueResolveProxies="false" valueRequired="true"
	 *        valueExtendedMetaData="kind='element' name='value'"
	 *        extendedMetaData="name='MapRefEntry' kind='elementOnly'"
	 * @generated
	 */
	EClass getMapRefEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMapRefEntry()
	 * @generated
	 */
	EAttribute getMapRefEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMapRefEntry()
	 * @generated
	 */
	EReference getMapRefEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Map Value Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Value Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.xml.type.String" keyRequired="true"
	 *        keyExtendedMetaData="kind='element' name='key'"
	 *        valueDataType="org.eclipse.emf.ecore.xml.type.String" valueRequired="true"
	 *        valueExtendedMetaData="kind='element' name='value'"
	 *        extendedMetaData="name='MapValueEntry' kind='elementOnly'"
	 * @generated
	 */
	EClass getMapValueEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMapValueEntry()
	 * @generated
	 */
	EAttribute getMapValueEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMapValueEntry()
	 * @generated
	 */
	EAttribute getMapValueEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.test.emfmodel.bz399086.TheMap <em>The Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>The Map</em>'.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.TheMap
	 * @generated
	 */
	EClass getTheMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.texo.test.emfmodel.bz399086.TheMap#getRefContent <em>Ref Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Ref Content</em>'.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.TheMap#getRefContent()
	 * @see #getTheMap()
	 * @generated
	 */
	EReference getTheMap_RefContent();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.texo.test.emfmodel.bz399086.TheMap#getValueContent <em>Value Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Value Content</em>'.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.TheMap#getValueContent()
	 * @see #getTheMap()
	 * @generated
	 */
	EReference getTheMap_ValueContent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz399086Factory getBz399086Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.texo.test.emfmodel.bz399086.impl.MapElementImpl <em>Map Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.impl.MapElementImpl
		 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.impl.Bz399086PackageImpl#getMapElement()
		 * @generated
		 */
		EClass MAP_ELEMENT = eINSTANCE.getMapElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_ELEMENT__NAME = eINSTANCE.getMapElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.test.emfmodel.bz399086.impl.MapRefEntryImpl <em>Map Ref Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.impl.MapRefEntryImpl
		 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.impl.Bz399086PackageImpl#getMapRefEntry()
		 * @generated
		 */
		EClass MAP_REF_ENTRY = eINSTANCE.getMapRefEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_REF_ENTRY__KEY = eINSTANCE.getMapRefEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_REF_ENTRY__VALUE = eINSTANCE.getMapRefEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.test.emfmodel.bz399086.impl.MapValueEntryImpl <em>Map Value Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.impl.MapValueEntryImpl
		 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.impl.Bz399086PackageImpl#getMapValueEntry()
		 * @generated
		 */
		EClass MAP_VALUE_ENTRY = eINSTANCE.getMapValueEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VALUE_ENTRY__KEY = eINSTANCE.getMapValueEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VALUE_ENTRY__VALUE = eINSTANCE.getMapValueEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.test.emfmodel.bz399086.impl.TheMapImpl <em>The Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.impl.TheMapImpl
		 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.impl.Bz399086PackageImpl#getTheMap()
		 * @generated
		 */
		EClass THE_MAP = eINSTANCE.getTheMap();

		/**
		 * The meta object literal for the '<em><b>Ref Content</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THE_MAP__REF_CONTENT = eINSTANCE.getTheMap_RefContent();

		/**
		 * The meta object literal for the '<em><b>Value Content</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THE_MAP__VALUE_CONTENT = eINSTANCE.getTheMap_ValueContent();

	}

} //Bz399086Package
