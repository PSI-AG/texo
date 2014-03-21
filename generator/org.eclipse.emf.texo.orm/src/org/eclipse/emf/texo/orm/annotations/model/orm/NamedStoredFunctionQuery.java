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
 * A representation of the model object '<em><b>Named Stored Function Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* A NamedStoredFunctionQuery annotation allows the definition of
 * 				* queries that call stored function as named queries.
 * 				* A NamedStoredFunctionQuery annotation may be defined on an Entity
 * 				or
 * 				* MappedSuperclass.
 * 				**
 * 				@Target({TYPE})
 * 				@Retention(RUNTIME)
 * 				public @interface NamedStoredFunctionQuery {
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
 * 				* (Optional) Defines if the stored procedure should be called by
 * 				index or by name.
 * 				* By index requires that the StoredProcedureParameter are defined in
 * 				the same order as the procedure on the database.
 * 				* By name requires the database platform support naming procedure
 * 				parameters.
 * 				**
 * 				boolean callByIndex() default false;
 * 
 * 				/**
 * 				* (Optional) Defines arguments to the stored procedure.
 * 				**
 * 				StoredProcedureParameter[] parameters() default {};
 * 
 * 				/**
 * 				* (Required) Defines return of the stored function.
 * 				**
 * 				StoredProcedureParameter[] returnParameter();
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery#getHint <em>Hint</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery#getReturnParameter <em>Return Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery#isCallByIndex <em>Call By Index</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery#getResultSetMapping <em>Result Set Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredFunctionQuery()
 * @model extendedMetaData="name='named-stored-function-query' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface NamedStoredFunctionQuery extends BaseOrmAnnotation {
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredFunctionQuery_Hint()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='hint' namespace='##targetNamespace'"
   * @generated
   */
	EList<QueryHint> getHint();

	/**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredFunctionQuery_Parameter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
   * @generated
   */
	EList<StoredProcedureParameter> getParameter();

	/**
   * Returns the value of the '<em><b>Return Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Return Parameter</em>' containment reference.
   * @see #setReturnParameter(StoredProcedureParameter)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredFunctionQuery_ReturnParameter()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='return-parameter' namespace='##targetNamespace'"
   * @generated
   */
	StoredProcedureParameter getReturnParameter();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery#getReturnParameter <em>Return Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Parameter</em>' containment reference.
   * @see #getReturnParameter()
   * @generated
   */
	void setReturnParameter(StoredProcedureParameter value);

	/**
   * Returns the value of the '<em><b>Call By Index</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call By Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Call By Index</em>' attribute.
   * @see #isSetCallByIndex()
   * @see #unsetCallByIndex()
   * @see #setCallByIndex(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredFunctionQuery_CallByIndex()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='call-by-index'"
   * @generated
   */
	boolean isCallByIndex();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery#isCallByIndex <em>Call By Index</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call By Index</em>' attribute.
   * @see #isSetCallByIndex()
   * @see #unsetCallByIndex()
   * @see #isCallByIndex()
   * @generated
   */
	void setCallByIndex(boolean value);

	/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery#isCallByIndex <em>Call By Index</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetCallByIndex()
   * @see #isCallByIndex()
   * @see #setCallByIndex(boolean)
   * @generated
   */
	void unsetCallByIndex();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery#isCallByIndex <em>Call By Index</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Call By Index</em>' attribute is set.
   * @see #unsetCallByIndex()
   * @see #isCallByIndex()
   * @see #setCallByIndex(boolean)
   * @generated
   */
	boolean isSetCallByIndex();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredFunctionQuery_FunctionName()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='function-name'"
   * @generated
   */
	String getFunctionName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery#getFunctionName <em>Function Name</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredFunctionQuery_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery#getName <em>Name</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredFunctionQuery_ResultSetMapping()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='result-set-mapping'"
   * @generated
   */
	String getResultSetMapping();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery#getResultSetMapping <em>Result Set Mapping</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result Set Mapping</em>' attribute.
   * @see #getResultSetMapping()
   * @generated
   */
	void setResultSetMapping(String value);

} // NamedStoredFunctionQuery
