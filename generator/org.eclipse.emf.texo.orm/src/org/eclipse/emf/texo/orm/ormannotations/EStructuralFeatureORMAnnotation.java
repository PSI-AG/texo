/**
 * <copyright>
 * </copyright>
 *
 * $Id: EStructuralFeatureORMAnnotation.java,v 1.6 2011/10/25 13:25:24 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations;

import org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EStructural Feature ORM Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation#getCollectionTable <em>Collection Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation#getElementCollection <em>Element Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEStructuralFeatureORMAnnotation()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface EStructuralFeatureORMAnnotation extends ETypeElementORMAnnotation {
  /**
   * Returns the value of the '<em><b>Collection Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection Table</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection Table</em>' containment reference.
   * @see #setCollectionTable(CollectionTable)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEStructuralFeatureORMAnnotation_CollectionTable()
   * @model containment="true"
   * @generated
   */
  CollectionTable getCollectionTable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation#getCollectionTable <em>Collection Table</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection Table</em>' containment reference.
   * @see #getCollectionTable()
   * @generated
   */
  void setCollectionTable(CollectionTable value);

  /**
   * Returns the value of the '<em><b>Element Collection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Collection</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Collection</em>' containment reference.
   * @see #setElementCollection(ElementCollection)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEStructuralFeatureORMAnnotation_ElementCollection()
   * @model containment="true"
   * @generated
   */
  ElementCollection getElementCollection();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EStructuralFeatureORMAnnotation#getElementCollection <em>Element Collection</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Collection</em>' containment reference.
   * @see #getElementCollection()
   * @generated
   */
  void setElementCollection(ElementCollection value);

} // EStructuralFeatureORMAnnotation
