/**
 */
package org.eclipse.emf.texo.test.emfmodel.bz399086;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.texo.test.emfmodel.identifiable.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>The Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.test.emfmodel.bz399086.TheMap#getRefContent <em>Ref Content</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.test.emfmodel.bz399086.TheMap#getValueContent <em>Value Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.Bz399086Package#getTheMap()
 * @model extendedMetaData="name='TheMap' kind='elementOnly'"
 * @generated
 */
public interface TheMap extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Ref Content</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipse.emf.texo.test.emfmodel.bz399086.MapElement},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Content</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Content</em>' map.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.Bz399086Package#getTheMap_RefContent()
	 * @model mapType="org.eclipse.emf.texo.test.emfmodel.bz399086.MapRefEntry<org.eclipse.emf.ecore.xml.type.String, org.eclipse.emf.texo.test.emfmodel.bz399086.MapElement>"
	 *        extendedMetaData="kind='element' name='refContent'"
	 * @generated
	 */
	EMap<String, MapElement> getRefContent();

	/**
	 * Returns the value of the '<em><b>Value Content</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Content</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Content</em>' map.
	 * @see org.eclipse.emf.texo.test.emfmodel.bz399086.Bz399086Package#getTheMap_ValueContent()
	 * @model mapType="org.eclipse.emf.texo.test.emfmodel.bz399086.MapValueEntry<org.eclipse.emf.ecore.xml.type.String, org.eclipse.emf.ecore.xml.type.String>"
	 *        extendedMetaData="kind='element' name='valueContent'"
	 * @generated
	 */
	EMap<String, String> getValueContent();

} // TheMap
