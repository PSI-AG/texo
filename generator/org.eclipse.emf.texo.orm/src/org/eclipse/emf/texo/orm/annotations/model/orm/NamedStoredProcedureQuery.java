/**
 * <copyright>
 * </copyright>
 *
 * $Id: NamedStoredProcedureQuery.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Named Stored Procedure Query</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* A NamedStoredProcedureQuery annotation allows the definition of
 * 				* queries that call stored procedures as named queries.
 * 				* A NamedStoredProcedureQuery annotation may be defined on an Entity
 * 				or
 * 				* MappedSuperclass.
 * 				**
 * 				@Target({TYPE})
 * 				@Retention(RUNTIME)
 * 				public @interface NamedStoredProcedureQuery {
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
 * 				* (Optional) Whether the query should return a result set.
 * 				**
 * 				boolean returnsResultSet() default true;
 * 
 * 				/**
 * 				* (Optional) Defines if the stored procedure returns multiple result
 * 				sets.
 * 				* This is only relevant on databases that support multiple result
 * 				sets from stored procedures.
 * 				**
 * 				boolean multipleResultSets() default false;
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
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getHint <em>Hint</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#isCallByIndex <em>Call By Index</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#isMultipleResultSets <em>Multiple Result Sets</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getProcedureName <em>Procedure Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getResultClass <em>Result Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getResultSetMapping <em>Result Set Mapping</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#isReturnsResultSet <em>Returns Result Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredProcedureQuery()
 * @model extendedMetaData="name='named-stored-procedure-query' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface NamedStoredProcedureQuery extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Hint</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryHint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hint</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hint</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredProcedureQuery_Hint()
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
   * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredProcedureQuery_Parameter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
   * @generated
   */
  EList<StoredProcedureParameter> getParameter();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredProcedureQuery_CallByIndex()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='call-by-index'"
   * @generated
   */
	boolean isCallByIndex();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#isCallByIndex <em>Call By Index</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#isCallByIndex <em>Call By Index</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetCallByIndex()
   * @see #isCallByIndex()
   * @see #setCallByIndex(boolean)
   * @generated
   */
	void unsetCallByIndex();

		/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#isCallByIndex <em>Call By Index</em>}' attribute is set.
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
   * Returns the value of the '<em><b>Multiple Result Sets</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Result Sets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Multiple Result Sets</em>' attribute.
   * @see #isSetMultipleResultSets()
   * @see #unsetMultipleResultSets()
   * @see #setMultipleResultSets(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredProcedureQuery_MultipleResultSets()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='multiple-result-sets'"
   * @generated
   */
	boolean isMultipleResultSets();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#isMultipleResultSets <em>Multiple Result Sets</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiple Result Sets</em>' attribute.
   * @see #isSetMultipleResultSets()
   * @see #unsetMultipleResultSets()
   * @see #isMultipleResultSets()
   * @generated
   */
	void setMultipleResultSets(boolean value);

		/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#isMultipleResultSets <em>Multiple Result Sets</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetMultipleResultSets()
   * @see #isMultipleResultSets()
   * @see #setMultipleResultSets(boolean)
   * @generated
   */
	void unsetMultipleResultSets();

		/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#isMultipleResultSets <em>Multiple Result Sets</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Multiple Result Sets</em>' attribute is set.
   * @see #unsetMultipleResultSets()
   * @see #isMultipleResultSets()
   * @see #setMultipleResultSets(boolean)
   * @generated
   */
	boolean isSetMultipleResultSets();

		/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredProcedureQuery_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Procedure Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure Name</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure Name</em>' attribute.
   * @see #setProcedureName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredProcedureQuery_ProcedureName()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='procedure-name'"
   * @generated
   */
  String getProcedureName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getProcedureName <em>Procedure Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Procedure Name</em>' attribute.
   * @see #getProcedureName()
   * @generated
   */
  void setProcedureName(String value);

  /**
   * Returns the value of the '<em><b>Result Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result Class</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result Class</em>' attribute.
   * @see #setResultClass(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredProcedureQuery_ResultClass()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='result-class'"
   * @generated
   */
  String getResultClass();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getResultClass <em>Result Class</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Result Class</em>' attribute.
   * @see #getResultClass()
   * @generated
   */
  void setResultClass(String value);

  /**
   * Returns the value of the '<em><b>Result Set Mapping</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result Set Mapping</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result Set Mapping</em>' attribute.
   * @see #setResultSetMapping(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredProcedureQuery_ResultSetMapping()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='result-set-mapping'"
   * @generated
   */
  String getResultSetMapping();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getResultSetMapping <em>Result Set Mapping</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Result Set Mapping</em>' attribute.
   * @see #getResultSetMapping()
   * @generated
   */
  void setResultSetMapping(String value);

  /**
   * Returns the value of the '<em><b>Returns Result Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Returns Result Set</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Returns Result Set</em>' attribute.
   * @see #isSetReturnsResultSet()
   * @see #unsetReturnsResultSet()
   * @see #setReturnsResultSet(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getNamedStoredProcedureQuery_ReturnsResultSet()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='returns-result-set'"
   * @generated
   */
  boolean isReturnsResultSet();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#isReturnsResultSet <em>Returns Result Set</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Returns Result Set</em>' attribute.
   * @see #isSetReturnsResultSet()
   * @see #unsetReturnsResultSet()
   * @see #isReturnsResultSet()
   * @generated
   */
  void setReturnsResultSet(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#isReturnsResultSet <em>Returns Result Set</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetReturnsResultSet()
   * @see #isReturnsResultSet()
   * @see #setReturnsResultSet(boolean)
   * @generated
   */
  void unsetReturnsResultSet();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#isReturnsResultSet <em>Returns Result Set</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Returns Result Set</em>' attribute is set.
   * @see #unsetReturnsResultSet()
   * @see #isReturnsResultSet()
   * @see #setReturnsResultSet(boolean)
   * @generated
   */
  boolean isSetReturnsResultSet();

} // NamedStoredProcedureQuery
