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
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* Allow a database INDEX to be define when generating DDL.
 * 				* The @Index can be defined on a Entity class, or on an attribute.
 * 				* The column is defaulted when defined on a attribute.
 * 				*
 * 				* @author James Sutherland
 * 				* @since EclipseLink 2.2
 * 				**
 * 				@Target({METHOD, FIELD, TYPE})
 * 				@Retention(RUNTIME)
 * 				public @interface Index {
 * 				/** The name of the INDEX, defaults to INDEX_(table-name) **
 * 				String name() default "";
 * 
 * 				/** The schema of the INDEX **
 * 				String schema() default "";
 * 
 * 				/** The catalog of the INDEX **
 * 				String catalog() default "";
 * 
 * 				/** The table to define the index on, defaults to entities primary
 * 				table. **
 * 				String table() default "";
 * 
 * 				boolean unique() default false;
 * 
 * 				/**
 * 				* Specify the set of columns to define the index on.
 * 				* Not required when annotated on a field/method.
 * 				**
 * 				String[] columnNames() default {};
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Index#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Index#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Index#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Index#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Index#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Index#isUnique <em>Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getIndex()
 * @model extendedMetaData="name='index' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Index extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Column Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Column Name</em>' attribute list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getIndex_ColumnName()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='column-name' namespace='##targetNamespace'"
   * @generated
   */
	EList<String> getColumnName();

	/**
   * Returns the value of the '<em><b>Catalog</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Catalog</em>' attribute.
   * @see #setCatalog(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getIndex_Catalog()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='catalog'"
   * @generated
   */
	String getCatalog();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Index#getCatalog <em>Catalog</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Catalog</em>' attribute.
   * @see #getCatalog()
   * @generated
   */
	void setCatalog(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getIndex_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Index#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Schema</em>' attribute.
   * @see #setSchema(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getIndex_Schema()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='schema'"
   * @generated
   */
	String getSchema();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Index#getSchema <em>Schema</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema</em>' attribute.
   * @see #getSchema()
   * @generated
   */
	void setSchema(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getIndex_Table()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='table'"
   * @generated
   */
	String getTable();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Index#getTable <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' attribute.
   * @see #getTable()
   * @generated
   */
	void setTable(String value);

	/**
   * Returns the value of the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Unique</em>' attribute.
   * @see #isSetUnique()
   * @see #unsetUnique()
   * @see #setUnique(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getIndex_Unique()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='unique'"
   * @generated
   */
	boolean isUnique();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Index#isUnique <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique</em>' attribute.
   * @see #isSetUnique()
   * @see #unsetUnique()
   * @see #isUnique()
   * @generated
   */
	void setUnique(boolean value);

	/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Index#isUnique <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetUnique()
   * @see #isUnique()
   * @see #setUnique(boolean)
   * @generated
   */
	void unsetUnique();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Index#isUnique <em>Unique</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Unique</em>' attribute is set.
   * @see #unsetUnique()
   * @see #isUnique()
   * @see #setUnique(boolean)
   * @generated
   */
	boolean isSetUnique();

} // Index
