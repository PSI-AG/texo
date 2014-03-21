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
 * A representation of the model object '<em><b>Named Plsql Stored Function Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* A NamedPLSQLStoredFunctionQuery annotation allows the definition of
 * 				queries that
 * 				* call PLSQL stored functions as named queries.
 * 				* The PLSQL support adds support for complex PLSQL types such as
 * 				RECORD and TABLE types,
 * 				* that are not accessible from JDBC.
 * 				*
 * 				* A NamedPLSQLStoredFunctionQuery annotation may be defined on an
 * 				Entity or
 * 				* MappedSuperclass.
 * 				*
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.3
 * 				**
 * 				@Target({TYPE})
 * 				@Retention(RUNTIME)
 * 				public @interface NamedPLSQLStoredFunctionQuery {
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
 * 				* (Optional) The name of the SQLResultMapping.
 * 				**
 * 				String resultSetMapping() default "";
 * 
 * 				/**
 * 				* (Required) The name of the stored procedure.
 * 				**
 * 				String functionName();
 * 
 * 				/**
 * 				* (Optional) Defines the parameters to the stored procedure.
 * 				**
 * 				PLSQLParameter[] parameters() default {};
 * 
 * 				/**
 * 				* (Required) Defines the return value of the stored function.
 * 				**
 * 				PLSQLParameter returnParameter();
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredFunctionQuery#getHint <em>Hint</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredFunctionQuery#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredFunctionQuery#getReturnParameter <em>Return Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredFunctionQuery#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredFunctionQuery#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredFunctionQuery#getResultSetMapping <em>Result Set Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedPlsqlStoredFunctionQuery()
 * @model extendedMetaData="name='named-plsql-stored-function-query' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface NamedPlsqlStoredFunctionQuery extends BaseOrmAnnotation {
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedPlsqlStoredFunctionQuery_Hint()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedPlsqlStoredFunctionQuery_Parameter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
   * @generated
   */
	EList<PlsqlParameter> getParameter();

	/**
   * Returns the value of the '<em><b>Return Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Return Parameter</em>' containment reference.
   * @see #setReturnParameter(PlsqlParameter)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedPlsqlStoredFunctionQuery_ReturnParameter()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='return-parameter' namespace='##targetNamespace'"
   * @generated
   */
	PlsqlParameter getReturnParameter();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredFunctionQuery#getReturnParameter <em>Return Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Parameter</em>' containment reference.
   * @see #getReturnParameter()
   * @generated
   */
	void setReturnParameter(PlsqlParameter value);

	/**
   * Returns the value of the '<em><b>Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Function Name</em>' attribute.
   * @see #setFunctionName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedPlsqlStoredFunctionQuery_FunctionName()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='function-name'"
   * @generated
   */
	String getFunctionName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredFunctionQuery#getFunctionName <em>Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Name</em>' attribute.
   * @see #getFunctionName()
   * @generated
   */
	void setFunctionName(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedPlsqlStoredFunctionQuery_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredFunctionQuery#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedPlsqlStoredFunctionQuery_ResultSetMapping()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='result-set-mapping'"
   * @generated
   */
	String getResultSetMapping();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredFunctionQuery#getResultSetMapping <em>Result Set Mapping</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result Set Mapping</em>' attribute.
   * @see #getResultSetMapping()
   * @generated
   */
	void setResultSetMapping(String value);

} // NamedPlsqlStoredFunctionQuery
