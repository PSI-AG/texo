/**
 * <copyright>
 * </copyright>
 *
 * $Id: ETypeElementORMAnnotation.java,v 1.7 2011/09/23 21:00:39 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations;

import org.eclipse.emf.texo.orm.annotations.model.orm.Transient;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EType Element ORM Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.ETypeElementORMAnnotation#getTransient <em>Transient</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getETypeElementORMAnnotation()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface ETypeElementORMAnnotation extends ENamedElementORMAnnotation {
  /**
   * Returns the value of the '<em><b>Transient</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transient</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transient</em>' containment reference.
   * @see #setTransient(Transient)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getETypeElementORMAnnotation_Transient()
   * @model containment="true"
   * @generated
   */
  Transient getTransient();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.ETypeElementORMAnnotation#getTransient <em>Transient</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Transient</em>' containment reference.
   * @see #getTransient()
   * @generated
   */
  void setTransient(Transient value);

} // ETypeElementORMAnnotation
