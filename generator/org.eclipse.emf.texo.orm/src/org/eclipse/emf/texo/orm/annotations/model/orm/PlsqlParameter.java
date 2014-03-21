/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import java.math.BigInteger;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plsql Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* A PLSQLParameter annotation is used within a
 * 				* NamedPLSQLStoredProcedureQuery or PLSQLRecord annotation.
 * 				*
 * 				* @see NamedPLSQLStoredProcedureQuery
 * 				* @see PLSQLRecord
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.3
 * 				**
 * 				@Target({})
 * 				@Retention(RUNTIME)
 * 				public @interface PLSQLParameter {
 * 				/**
 * 				* (Optional) The direction of the stored procedure parameter.
 * 				**
 * 				Direction direction() default IN;
 * 
 * 				/**
 * 				* (Required) Stored procedure parameter name.
 * 				**
 * 				String name() default "";
 * 
 * 				/**
 * 				* (Optional) The query parameter name.
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
 * 				* (Optional) The database data-type for the paramter.
 * 				* This either one of the type constants defined in OraclePLSQLTypes,
 * 				or JDBCTypes,
 * 				* or a custom record or table type name.
 * 				* @see PLSQLRecord
 * 				* @see OraclePLSQLTypes
 * 				* @see JDBCTypes
 * 				**
 * 				String databaseType() default "VARCHAR";
 * 
 * 				/**
 * 				* (Optional) The max length of the field value.
 * 				**
 * 				int length() default 255;
 * 
 * 				/**
 * 				* (Optional) If a numeric, the max scale value.
 * 				**
 * 				int scale() default 0;
 * 
 * 				/**
 * 				* (Optional) If a numeric, the max precision value.
 * 				**
 * 				int precision() default 0;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#getDatabaseType <em>Database Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#getQueryParameter <em>Query Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlParameter()
 * @model extendedMetaData="name='plsql-parameter' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface PlsqlParameter extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Database Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Database Type</em>' attribute.
   * @see #setDatabaseType(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlParameter_DatabaseType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='database-type'"
   * @generated
   */
	String getDatabaseType();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#getDatabaseType <em>Database Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database Type</em>' attribute.
   * @see #getDatabaseType()
   * @generated
   */
	void setDatabaseType(String value);

	/**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.DirectionType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DirectionType
   * @see #isSetDirection()
   * @see #unsetDirection()
   * @see #setDirection(DirectionType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlParameter_Direction()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='direction'"
   * @generated
   */
	DirectionType getDirection();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DirectionType
   * @see #isSetDirection()
   * @see #unsetDirection()
   * @see #getDirection()
   * @generated
   */
	void setDirection(DirectionType value);

	/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetDirection()
   * @see #getDirection()
   * @see #setDirection(DirectionType)
   * @generated
   */
	void unsetDirection();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#getDirection <em>Direction</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Direction</em>' attribute is set.
   * @see #unsetDirection()
   * @see #getDirection()
   * @see #setDirection(DirectionType)
   * @generated
   */
	boolean isSetDirection();

	/**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #setLength(BigInteger)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlParameter_Length()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='length'"
   * @generated
   */
	BigInteger getLength();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
	void setLength(BigInteger value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlParameter_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlParameter_Optional()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='optional'"
   * @generated
   */
	boolean isOptional();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#isOptional <em>Optional</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetOptional()
   * @see #isOptional()
   * @see #setOptional(boolean)
   * @generated
   */
	void unsetOptional();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#isOptional <em>Optional</em>}' attribute is set.
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
   * Returns the value of the '<em><b>Precision</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Precision</em>' attribute.
   * @see #setPrecision(BigInteger)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlParameter_Precision()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='precision'"
   * @generated
   */
	BigInteger getPrecision();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#getPrecision <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precision</em>' attribute.
   * @see #getPrecision()
   * @generated
   */
	void setPrecision(BigInteger value);

	/**
   * Returns the value of the '<em><b>Query Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Query Parameter</em>' attribute.
   * @see #setQueryParameter(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlParameter_QueryParameter()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='query-parameter'"
   * @generated
   */
	String getQueryParameter();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#getQueryParameter <em>Query Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query Parameter</em>' attribute.
   * @see #getQueryParameter()
   * @generated
   */
	void setQueryParameter(String value);

	/**
   * Returns the value of the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Scale</em>' attribute.
   * @see #setScale(BigInteger)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getPlsqlParameter_Scale()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
   *        extendedMetaData="kind='attribute' name='scale'"
   * @generated
   */
	BigInteger getScale();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlParameter#getScale <em>Scale</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scale</em>' attribute.
   * @see #getScale()
   * @generated
   */
	void setScale(BigInteger value);

} // PlsqlParameter
