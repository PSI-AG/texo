/**
 * <copyright>
 * </copyright>
 *
 * $Id: Inheritance.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Inheritance</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({TYPE}) @Retention(RUNTIME)
 * 				public @interface Inheritance {
 * 				InheritanceType strategy() default SINGLE_TABLE;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Inheritance#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getInheritance()
 * @model extendedMetaData="name='inheritance' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Inheritance extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Strategy</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.InheritanceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strategy</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategy</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.InheritanceType
   * @see #isSetStrategy()
   * @see #unsetStrategy()
   * @see #setStrategy(InheritanceType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getInheritance_Strategy()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='strategy'"
   * @generated
   */
  InheritanceType getStrategy();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Inheritance#getStrategy <em>Strategy</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Strategy</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.InheritanceType
   * @see #isSetStrategy()
   * @see #unsetStrategy()
   * @see #getStrategy()
   * @generated
   */
  void setStrategy(InheritanceType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Inheritance#getStrategy <em>Strategy</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetStrategy()
   * @see #getStrategy()
   * @see #setStrategy(InheritanceType)
   * @generated
   */
  void unsetStrategy();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Inheritance#getStrategy <em>Strategy</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Strategy</em>' attribute is set.
   * @see #unsetStrategy()
   * @see #getStrategy()
   * @see #setStrategy(InheritanceType)
   * @generated
   */
  boolean isSetStrategy();

} // Inheritance
