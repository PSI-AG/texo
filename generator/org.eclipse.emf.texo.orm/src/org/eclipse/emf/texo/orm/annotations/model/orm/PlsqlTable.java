/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plsql Table</b></em>'.
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
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlTable#getCompatibleType <em>Compatible Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlTable#getJavaType <em>Java Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlTable#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlTable#getNestedType <em>Nested Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlTable()
 * @model extendedMetaData="name='plsql-table' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface PlsqlTable extends BaseOrmAnnotation {
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlTable_CompatibleType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='compatible-type'"
   * @generated
   */
	String getCompatibleType();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlTable#getCompatibleType <em>Compatible Type</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlTable_JavaType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='java-type'"
   * @generated
   */
	String getJavaType();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlTable#getJavaType <em>Java Type</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlTable_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlTable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Nested Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Nested Type</em>' attribute.
   * @see #setNestedType(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlTable_NestedType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='nested-type'"
   * @generated
   */
	String getNestedType();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlTable#getNestedType <em>Nested Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nested Type</em>' attribute.
   * @see #getNestedType()
   * @generated
   */
	void setNestedType(String value);

} // PlsqlTable
