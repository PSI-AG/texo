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
 * A representation of the model object '<em><b>Named Plsql Stored Procedure Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* A PLSQLNamedStoredProcedureQuery annotation allows the definition
 * 				of queries that
 * 				* call PLSQL stored procedures as named queries.
 * 				* The PLSQL support adds support for complex PLSQL types such as
 * 				RECORD and TABLE types,
 * 				* that are not accessible from JDBC.
 * 				*
 * 				* A PLSQLNamedStoredProcedureQuery annotation may be defined on an
 * 				Entity or
 * 				* MappedSuperclass.
 * 				*
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.3
 * 				**
 * 				@Target({TYPE})
 * 				@Retention(RUNTIME)
 * 				public @interface NamedPLSQLStoredProcedureQuery {
 * 				/**
 * 				* (Required) Unique name that references this stored procedure query.
 * 				**
 * 				String name();
 * 
 * 				/**
 * 				* (Optional) Query hints.
 * 				**
 * 				QueryHint[] hints() default {};
 * 
 * 				/**
 * 				* (Optional) Refers to the class of the result.
 * 				**
 * 				Class resultClass() default void.class;
 * 
 * 				/**
 * 				* (Optional) The name of the SQLResultMapping.
 * 				**
 * 				String resultSetMapping() default "";
 * 
 * 				/**
 * 				* (Required) The name of the stored procedure.
 * 				**
 * 				String procedureName();
 * 
 * 				/**
 * 				* (Optional) Defines the parameters to the stored procedure.
 * 				**
 * 				PLSQLParameter[] parameters() default {};
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredProcedureQuery#getHint <em>Hint</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredProcedureQuery#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredProcedureQuery#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredProcedureQuery#getProcedureName <em>Procedure Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredProcedureQuery#getResultClass <em>Result Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredProcedureQuery#getResultSetMapping <em>Result Set Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedPlsqlStoredProcedureQuery()
 * @model extendedMetaData="name='named-plsql-stored-procedure-query' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface NamedPlsqlStoredProcedureQuery extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Hint</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryHint}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Hint</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedPlsqlStoredProcedureQuery_Hint()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='hint' namespace='##targetNamespace'"
   * @generated
   */
	EList<QueryHint> getHint();

	/**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedPlsqlStoredProcedureQuery_Parameter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
   * @generated
   */
	EList<PlsqlParameter> getParameter();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedPlsqlStoredProcedureQuery_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredProcedureQuery#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Procedure Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure Name</em>' attribute.
   * @see #setProcedureName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedPlsqlStoredProcedureQuery_ProcedureName()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='procedure-name'"
   * @generated
   */
	String getProcedureName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredProcedureQuery#getProcedureName <em>Procedure Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Procedure Name</em>' attribute.
   * @see #getProcedureName()
   * @generated
   */
	void setProcedureName(String value);

	/**
   * Returns the value of the '<em><b>Result Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Result Class</em>' attribute.
   * @see #setResultClass(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedPlsqlStoredProcedureQuery_ResultClass()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='result-class'"
   * @generated
   */
	String getResultClass();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredProcedureQuery#getResultClass <em>Result Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result Class</em>' attribute.
   * @see #getResultClass()
   * @generated
   */
	void setResultClass(String value);

	/**
   * Returns the value of the '<em><b>Result Set Mapping</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Set Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Result Set Mapping</em>' attribute.
   * @see #setResultSetMapping(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedPlsqlStoredProcedureQuery_ResultSetMapping()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='result-set-mapping'"
   * @generated
   */
	String getResultSetMapping();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredProcedureQuery#getResultSetMapping <em>Result Set Mapping</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result Set Mapping</em>' attribute.
   * @see #getResultSetMapping()
   * @generated
   */
	void setResultSetMapping(String value);

} // NamedPlsqlStoredProcedureQuery
