/**
 * <copyright>
 * </copyright>
 *
 * $Id: StoredProcedureParameter.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import java.math.BigInteger;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Stored Procedure Parameter</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* A StoredProcedureParameter annotation is used within a
 * 				* NamedStoredProcedureQuery annotation.
 * 				**
 * 				@Target({})
 * 				@Retention(RUNTIME)
 * 				public @interface StoredProcedureParameter {
 * 				/**
 * 				* (Optional) The direction of the stored procedure parameter.
 * 				**
 * 				Direction direction() default IN;
 * 
 * 				/**
 * 				* (Optional) Stored procedure parameter name.
 * 				**
 * 				String name() default "";
 * 
 * 				/**
 * 				* (Required) The query parameter name.
 * 				**
 * 				String queryParameter();
 * 
 * 				/**
 * 				* (Optional) Define if the parameter is required, or optional and
 * 				defaulted by the procedure.
 * 				**
 * 				boolean optional() default false;
 * 
 * 				/**
 * 				* (Optional) The type of Java class desired back from the procedure,
 * 				* this is dependent on the type returned from the procedure.
 * 				**
 * 				Class type() default void.class;
 * 
 * 				/**
 * 				* (Optional) The JDBC type code, this dependent on the type returned
 * 				* from the procedure.
 * 				**
 * 				int jdbcType() default -1;
 * 
 * 				/**
 * 				* (Optional) The JDBC type name, this may be required for ARRAY or
 * 				* STRUCT types.
 * 				**
 * 				String jdbcTypeName() default "";
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getJdbcType <em>Jdbc Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getJdbcTypeName <em>Jdbc Type Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getQueryParameter <em>Query Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStoredProcedureParameter()
 * @model extendedMetaData="name='stored-procedure-parameter' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface StoredProcedureParameter extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.DirectionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DirectionType
   * @see #isSetDirection()
   * @see #unsetDirection()
   * @see #setDirection(DirectionType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStoredProcedureParameter_Direction()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='direction'"
   * @generated
   */
  DirectionType getDirection();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DirectionType
   * @see #isSetDirection()
   * @see #unsetDirection()
   * @see #getDirection()
   * @generated
   */
  void setDirection(DirectionType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetDirection()
   * @see #getDirection()
   * @see #setDirection(DirectionType)
   * @generated
   */
  void unsetDirection();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getDirection <em>Direction</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Direction</em>' attribute is set.
   * @see #unsetDirection()
   * @see #getDirection()
   * @see #setDirection(DirectionType)
   * @generated
   */
  boolean isSetDirection();

  /**
   * Returns the value of the '<em><b>Jdbc Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jdbc Type</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jdbc Type</em>' attribute.
   * @see #setJdbcType(BigInteger)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStoredProcedureParameter_JdbcType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='jdbc-type'"
   * @generated
   */
  BigInteger getJdbcType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getJdbcType <em>Jdbc Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Jdbc Type</em>' attribute.
   * @see #getJdbcType()
   * @generated
   */
  void setJdbcType(BigInteger value);

  /**
   * Returns the value of the '<em><b>Jdbc Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jdbc Type Name</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jdbc Type Name</em>' attribute.
   * @see #setJdbcTypeName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStoredProcedureParameter_JdbcTypeName()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='jdbc-type-name'"
   * @generated
   */
  String getJdbcTypeName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getJdbcTypeName <em>Jdbc Type Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Jdbc Type Name</em>' attribute.
   * @see #getJdbcTypeName()
   * @generated
   */
  void setJdbcTypeName(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStoredProcedureParameter_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #isSetOptional()
   * @see #unsetOptional()
   * @see #setOptional(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStoredProcedureParameter_Optional()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='optional'"
   * @generated
   */
	boolean isOptional();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isSetOptional()
   * @see #unsetOptional()
   * @see #isOptional()
   * @generated
   */
	void setOptional(boolean value);

		/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetOptional()
   * @see #isOptional()
   * @see #setOptional(boolean)
   * @generated
   */
	void unsetOptional();

		/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#isOptional <em>Optional</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Optional</em>' attribute is set.
   * @see #unsetOptional()
   * @see #isOptional()
   * @see #setOptional(boolean)
   * @generated
   */
	boolean isSetOptional();

		/**
   * Returns the value of the '<em><b>Query Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Parameter</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Parameter</em>' attribute.
   * @see #setQueryParameter(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStoredProcedureParameter_QueryParameter()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='query-parameter'"
   * @generated
   */
  String getQueryParameter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getQueryParameter <em>Query Parameter</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Query Parameter</em>' attribute.
   * @see #getQueryParameter()
   * @generated
   */
  void setQueryParameter(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getStoredProcedureParameter_Type()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='type'"
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // StoredProcedureParameter
