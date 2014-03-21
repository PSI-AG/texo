/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionTable.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Collection Table</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <!-- begin-model-doc -->
 * 
 * 
 * @Target({METHOD, FIELD}) @Retention(RUNTIME) public @interface CollectionTable { String name() default ""; String
 *                  catalog() default ""; String schema() default ""; JoinColumn[] joinColumns() default {};
 *                  UniqueConstraint[] uniqueConstraints() default {}; }
 * 
 * 
 *                  <!-- end-model-doc -->
 * 
 *                  <p>
 *                  The following features are supported:
 *                  <ul>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getJoinColumn <em>Join
 *                  Column</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getUniqueConstraint <em>
 *                  Unique Constraint</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getCatalog <em>Catalog
 *                  </em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getName <em>Name</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getSchema <em>Schema</em>}
 *                  </li>
 *                  </ul>
 *                  </p>
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCollectionTable()
 * @model extendedMetaData="name='collection-table' kind='elementOnly'"
 * @generated
 */
public interface CollectionTable extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Join Column</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Column</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Column</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCollectionTable_JoinColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='join-column' namespace='##targetNamespace'"
   * @generated
   */
  EList<JoinColumn> getJoinColumn();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCollectionTable_UniqueConstraint()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCollectionTable_Catalog()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='catalog'"
   * @generated
   */
  String getCatalog();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getCatalog <em>Catalog</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCollectionTable_CreationSuffix()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='creation-suffix'"
   * @generated
   */
	String getCreationSuffix();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getCreationSuffix <em>Creation Suffix</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getCreationSuffix <em>Creation Suffix</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetCreationSuffix()
   * @see #getCreationSuffix()
   * @see #setCreationSuffix(String)
   * @generated
   */
	void unsetCreationSuffix();

		/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getCreationSuffix <em>Creation Suffix</em>}' attribute is set.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCollectionTable_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getName <em>Name</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCollectionTable_Schema()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='schema'"
   * @generated
   */
  String getSchema();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getSchema <em>Schema</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema</em>' attribute.
   * @see #getSchema()
   * @generated
   */
  void setSchema(String value);

} // CollectionTable
