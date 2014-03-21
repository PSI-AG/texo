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
 * A representation of the model object '<em><b>Tenant Discriminator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({})
 * 				@Retention(RUNTIME)
 * 				public @interface TenantDiscriminator {
 * 				/**
 * 				* (Optional) The name of column to be used for the discriminator.
 * 				**
 * 				String name() default "eclipselink.tenant-id";
 * 
 * 				/**
 * 				* (Optional) The name of the context property to apply to the
 * 				* tenant discriminator column.
 * 				**
 * 				String contextProperty() default "TENANT_ID";
 * 
 * 				/**
 * 				* (Optional) The type of object/column to use as a class
 * 				discriminator.
 * 				* Defaults to {@link DiscriminatorType#STRING
 * 				DiscriminatorType.STRING}.
 * 				**
 * 				DiscriminatorType discriminatorType() default DiscriminatorType.STRING;
 * 
 * 				/**
 * 				* (Optional) The SQL fragment that is used when generating the DDL
 * 				* for the discriminator column.
 * 				* Defaults to the provider-generated SQL to create a column
 * 				* of the specified discriminator type.
 * 				**
 * 				String columnDefinition() default "";
 * 
 * 				/**
 * 				* (Optional) The column length for String-based discriminator types.
 * 				* Ignored for other discriminator types.
 * 				**
 * 				int length() default 31;
 * 
 * 				/**
 * 				* (Optional) The name of the table that contains the column.
 * 				* If absent the column is assumed to be in the primary table.
 * 				**
 * 				String table() default "";
 * 
 * 				/**
 * 				* Specifies that the tenant discriminator column is part of the
 * 				primary
 * 				* key of the tables.
 * 				**
 * 				boolean primaryKey() default false;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#getColumnDefinition <em>Column Definition</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#getDiscriminatorType <em>Discriminator Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#isPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTenantDiscriminator()
 * @model extendedMetaData="name='tenant-discriminator' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface TenantDiscriminator extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Column Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Column Definition</em>' attribute.
   * @see #setColumnDefinition(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTenantDiscriminator_ColumnDefinition()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='column-definition'"
   * @generated
   */
	String getColumnDefinition();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#getColumnDefinition <em>Column Definition</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Definition</em>' attribute.
   * @see #getColumnDefinition()
   * @generated
   */
	void setColumnDefinition(String value);

	/**
   * Returns the value of the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Column Name</em>' attribute.
   * @see #setColumnName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTenantDiscriminator_ColumnName()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='column-name'"
   * @generated
   */
	String getColumnName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#getColumnName <em>Column Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Name</em>' attribute.
   * @see #getColumnName()
   * @generated
   */
	void setColumnName(String value);

	/**
   * Returns the value of the '<em><b>Discriminator Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorType}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Discriminator Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorType
   * @see #isSetDiscriminatorType()
   * @see #unsetDiscriminatorType()
   * @see #setDiscriminatorType(DiscriminatorType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTenantDiscriminator_DiscriminatorType()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='discriminator-type'"
   * @generated
   */
	DiscriminatorType getDiscriminatorType();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#getDiscriminatorType <em>Discriminator Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Discriminator Type</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorType
   * @see #isSetDiscriminatorType()
   * @see #unsetDiscriminatorType()
   * @see #getDiscriminatorType()
   * @generated
   */
	void setDiscriminatorType(DiscriminatorType value);

	/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#getDiscriminatorType <em>Discriminator Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetDiscriminatorType()
   * @see #getDiscriminatorType()
   * @see #setDiscriminatorType(DiscriminatorType)
   * @generated
   */
	void unsetDiscriminatorType();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#getDiscriminatorType <em>Discriminator Type</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Discriminator Type</em>' attribute is set.
   * @see #unsetDiscriminatorType()
   * @see #getDiscriminatorType()
   * @see #setDiscriminatorType(DiscriminatorType)
   * @generated
   */
	boolean isSetDiscriminatorType();

	/**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #isSetLength()
   * @see #unsetLength()
   * @see #setLength(int)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTenantDiscriminator_Length()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
   *        extendedMetaData="kind='attribute' name='length'"
   * @generated
   */
	int getLength();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #isSetLength()
   * @see #unsetLength()
   * @see #getLength()
   * @generated
   */
	void setLength(int value);

	/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetLength()
   * @see #getLength()
   * @see #setLength(int)
   * @generated
   */
	void unsetLength();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#getLength <em>Length</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Length</em>' attribute is set.
   * @see #unsetLength()
   * @see #getLength()
   * @see #setLength(int)
   * @generated
   */
	boolean isSetLength();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTenantDiscriminator_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Primary Key</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Key</em>' attribute.
   * @see #isSetPrimaryKey()
   * @see #unsetPrimaryKey()
   * @see #setPrimaryKey(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTenantDiscriminator_PrimaryKey()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='primary-key'"
   * @generated
   */
	boolean isPrimaryKey();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#isPrimaryKey <em>Primary Key</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Key</em>' attribute.
   * @see #isSetPrimaryKey()
   * @see #unsetPrimaryKey()
   * @see #isPrimaryKey()
   * @generated
   */
	void setPrimaryKey(boolean value);

	/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#isPrimaryKey <em>Primary Key</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetPrimaryKey()
   * @see #isPrimaryKey()
   * @see #setPrimaryKey(boolean)
   * @generated
   */
	void unsetPrimaryKey();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#isPrimaryKey <em>Primary Key</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Primary Key</em>' attribute is set.
   * @see #unsetPrimaryKey()
   * @see #isPrimaryKey()
   * @see #setPrimaryKey(boolean)
   * @generated
   */
	boolean isSetPrimaryKey();

	/**
   * Returns the value of the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' attribute.
   * @see #setTable(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTenantDiscriminator_Table()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='table'"
   * @generated
   */
	String getTable();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TenantDiscriminator#getTable <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' attribute.
   * @see #getTable()
   * @generated
   */
	void setTable(String value);

} // TenantDiscriminator
