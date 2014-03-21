/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssociationOverride.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Association Override</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({TYPE, METHOD, FIELD}) @Retention(RUNTIME)
 * 				public @interface AssociationOverride {
 * 				String name();
 * 				JoinColumn[] joinColumns() default{};
 * 				JoinTable joinTable() default @JoinTable;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride#getJoinColumn <em>Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride#getJoinTable <em>Join Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAssociationOverride()
 * @model extendedMetaData="name='association-override' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface AssociationOverride extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAssociationOverride_Description()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAssociationOverride_JoinColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='join-column' namespace='##targetNamespace'"
   * @generated
   */
  EList<JoinColumn> getJoinColumn();

  /**
   * Returns the value of the '<em><b>Join Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Table</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Table</em>' containment reference.
   * @see #setJoinTable(JoinTable)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAssociationOverride_JoinTable()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='join-table' namespace='##targetNamespace'"
   * @generated
   */
  JoinTable getJoinTable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride#getJoinTable <em>Join Table</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Join Table</em>' containment reference.
   * @see #getJoinTable()
   * @generated
   */
  void setJoinTable(JoinTable value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAssociationOverride_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // AssociationOverride
