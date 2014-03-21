/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fetch Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({TYPE})
 * 				@Retention(RUNTIME)
 * 				public @interface FetchGroup {
 * 				/**
 * 				* (Required) The fetch group name.
 * 				**
 * 				String name();
 * 
 * 				/**
 * 				* (Optional) Indicates whether all relationship attributes
 * 				* specified in the fetch group should be loaded.
 * 				**
 * 				boolean load() default true;
 * 
 * 				/**
 * 				* (Required) The list of attributes to fetch.
 * 				**
 * 				FetchAttribute[] attributes();
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchGroup#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchGroup#isLoad <em>Load</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchGroup#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getFetchGroup()
 * @model extendedMetaData="name='fetch-group' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface FetchGroup extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchAttribute}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getFetchGroup_Attribute()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='attribute' namespace='##targetNamespace'"
   * @generated
   */
	EList<FetchAttribute> getAttribute();

	/**
   * Returns the value of the '<em><b>Load</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Load</em>' attribute.
   * @see #isSetLoad()
   * @see #unsetLoad()
   * @see #setLoad(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getFetchGroup_Load()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='load'"
   * @generated
   */
	boolean isLoad();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchGroup#isLoad <em>Load</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Load</em>' attribute.
   * @see #isSetLoad()
   * @see #unsetLoad()
   * @see #isLoad()
   * @generated
   */
	void setLoad(boolean value);

	/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchGroup#isLoad <em>Load</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetLoad()
   * @see #isLoad()
   * @see #setLoad(boolean)
   * @generated
   */
	void unsetLoad();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchGroup#isLoad <em>Load</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Load</em>' attribute is set.
   * @see #unsetLoad()
   * @see #isLoad()
   * @see #setLoad(boolean)
   * @generated
   */
	boolean isSetLoad();

	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getFetchGroup_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchGroup#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // FetchGroup
