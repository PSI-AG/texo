/**
 * <copyright>
 * </copyright>
 *
 * $Id: EclipselinkCollectionTable.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Eclipselink Collection Table</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface CollectionTable {
 * 				/**
 * 				* (Optional) The name of the collection table. If it is not
 * 				* specified, it is defaulted to the concatenation of the following:
 * 				* the name of the source entity; "_" ; the name of the relationship
 * 				* property or field of the source entity.
 * 				**
 * 				String name() default "";
 * 
 * 				/**
 * 				* (Optional) The catalog of the table. It defaults to the persistence
 * 				* unit default catalog.
 * 				**
 * 				String catalog() default "";
 * 
 * 				/**
 * 				* (Optional) The schema of the table. It defaults to the persistence
 * 				* unit default schema.
 * 				**
 * 				String schema() default "";
 * 
 * 				/**
 * 				* (Optional) Used to specify a primary key column that is used as a
 * 				* foreign key to join to another table. If the source entity uses a
 * 				* composite primary key, a primary key join column must be specified
 * 				* for each field of the composite primary key. In a single primary
 * 				* key case, a primary key join column may optionally be specified.
 * 				* Defaulting will apply otherwise as follows:
 * 				* name, the same name as the primary key column of the primary table
 * 				* of the source entity. referencedColumnName, the same name of
 * 				* primary key column of the primary table of the source entity.
 * 				**
 * 				PrimaryKeyJoinColumn[] primaryKeyJoinColumns() default {};
 * 
 * 				/**
 * 				* (Optional) Unique constraints that are to be placed on the table.
 * 				* These are only used if table generation is in effect.
 * 				**
 * 				UniqueConstraint[] uniqueConstraints() default {};
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getUniqueConstraint <em>Unique Constraint</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getCreationSuffix <em>Creation Suffix</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEclipselinkCollectionTable()
 * @model extendedMetaData="name='eclipselink-collection-table' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface EclipselinkCollectionTable extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Primary Key Join Column</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKeyJoinColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Key Join Column</em>' containment reference list isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Key Join Column</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEclipselinkCollectionTable_PrimaryKeyJoinColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='primary-key-join-column' namespace='##targetNamespace'"
   * @generated
   */
  EList<PrimaryKeyJoinColumn> getPrimaryKeyJoinColumn();

  /**
   * Returns the value of the '<em><b>Unique Constraint</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.UniqueConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unique Constraint</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique Constraint</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEclipselinkCollectionTable_UniqueConstraint()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='unique-constraint' namespace='##targetNamespace'"
   * @generated
   */
  EList<UniqueConstraint> getUniqueConstraint();

  /**
   * Returns the value of the '<em><b>Catalog</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Catalog</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Catalog</em>' attribute.
   * @see #setCatalog(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEclipselinkCollectionTable_Catalog()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='catalog'"
   * @generated
   */
  String getCatalog();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getCatalog <em>Catalog</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Catalog</em>' attribute.
   * @see #getCatalog()
   * @generated
   */
  void setCatalog(String value);

  /**
   * Returns the value of the '<em><b>Creation Suffix</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Creation Suffix</em>' attribute.
   * @see #isSetCreationSuffix()
   * @see #unsetCreationSuffix()
   * @see #setCreationSuffix(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEclipselinkCollectionTable_CreationSuffix()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='creation-suffix'"
   * @generated
   */
	String getCreationSuffix();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getCreationSuffix <em>Creation Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Creation Suffix</em>' attribute.
   * @see #isSetCreationSuffix()
   * @see #unsetCreationSuffix()
   * @see #getCreationSuffix()
   * @generated
   */
	void setCreationSuffix(String value);

		/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getCreationSuffix <em>Creation Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetCreationSuffix()
   * @see #getCreationSuffix()
   * @see #setCreationSuffix(String)
   * @generated
   */
	void unsetCreationSuffix();

		/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getCreationSuffix <em>Creation Suffix</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Creation Suffix</em>' attribute is set.
   * @see #unsetCreationSuffix()
   * @see #getCreationSuffix()
   * @see #setCreationSuffix(String)
   * @generated
   */
	boolean isSetCreationSuffix();

		/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEclipselinkCollectionTable_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema</em>' attribute.
   * @see #setSchema(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEclipselinkCollectionTable_Schema()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='schema'"
   * @generated
   */
  String getSchema();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getSchema <em>Schema</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema</em>' attribute.
   * @see #getSchema()
   * @generated
   */
  void setSchema(String value);

} // EclipselinkCollectionTable
