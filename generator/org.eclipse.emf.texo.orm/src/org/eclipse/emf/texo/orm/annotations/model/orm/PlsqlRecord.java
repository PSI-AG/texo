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
 * A representation of the model object '<em><b>Plsql Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* A PLSQLRecord annotation is used to define a database PLSQL RECORD
 * 				type.
 * 				* This type can be used within PLSQL procedure calls.
 * 				*
 * 				* @see NamedPLSQLStoredProcedureQuery
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.3
 * 				**
 * 				@Target({TYPE})
 * 				@Retention(RUNTIME)
 * 				public @interface PLSQLRecord {
 * 
 * 				/**
 * 				* (Required) The name of the record type in the database.
 * 				**
 * 				String name();
 * 
 * 				/**
 * 				* (Required) The name of the database OBJECT TYPE that mirrors the
 * 				record's structure.
 * 				* The record will be converted to/from this type so it can be passed
 * 				through JDBC.
 * 				**
 * 				String compatibleType();
 * 
 * 				/**
 * 				* (Optional) The Java class to map the object-type to.
 * 				* This class must be mapped using a @Struct annotation.
 * 				**
 * 				Class javaType() default void.class;
 * 
 * 				/**
 * 				* (Required) Defines the fields in the record type.
 * 				**
 * 				PLSQLParameter[] fields();
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlRecord#getField <em>Field</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlRecord#getCompatibleType <em>Compatible Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlRecord#getJavaType <em>Java Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlRecord#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlRecord()
 * @model extendedMetaData="name='plsql-record' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface PlsqlRecord extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Field</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlRecord_Field()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='field' namespace='##targetNamespace'"
   * @generated
   */
	EList<PlsqlParameter> getField();

	/**
   * Returns the value of the '<em><b>Compatible Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Compatible Type</em>' attribute.
   * @see #setCompatibleType(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlRecord_CompatibleType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='compatible-type'"
   * @generated
   */
	String getCompatibleType();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlRecord#getCompatibleType <em>Compatible Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compatible Type</em>' attribute.
   * @see #getCompatibleType()
   * @generated
   */
	void setCompatibleType(String value);

	/**
   * Returns the value of the '<em><b>Java Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Java Type</em>' attribute.
   * @see #setJavaType(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlRecord_JavaType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='java-type'"
   * @generated
   */
	String getJavaType();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlRecord#getJavaType <em>Java Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Type</em>' attribute.
   * @see #getJavaType()
   * @generated
   */
	void setJavaType(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlRecord_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlRecord#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

} // PlsqlRecord
