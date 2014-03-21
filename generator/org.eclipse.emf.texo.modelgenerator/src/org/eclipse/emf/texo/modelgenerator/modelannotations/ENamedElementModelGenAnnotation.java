/**
 * <copyright>
 * </copyright>
 *
 * $Id: ENamedElementModelGenAnnotation.java,v 1.9 2011/08/28 12:35:09 mtaal Exp $
 */
package org.eclipse.emf.texo.modelgenerator.modelannotations;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>ENamed Element Model Gen Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getENamedElementModelGenAnnotation()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface ENamedElementModelGenAnnotation extends EObject {
  /**
   * Returns the value of the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documentation</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' attribute.
   * @see #setDocumentation(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getENamedElementModelGenAnnotation_Documentation()
   * @model unique="false"
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage#getENamedElementModelGenAnnotation_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.modelgenerator.modelannotations.ENamedElementModelGenAnnotation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  // note can be defined in the model because it gives clashes in subtypes
  ENamedElement getENamedElement();

} // ENamedElementModelGenAnnotation
