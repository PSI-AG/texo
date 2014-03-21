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
 * A representation of the model object '<em><b>Return Insert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface ReturnInsert {
 * 				/**
 * 				* A ReturnInsert annotation allows for INSERT operations to return
 * 				* values back into the object being written. This allows for table
 * 				* default values, trigger or stored procedures computed values to
 * 				* be set back into the object.
 * 				**
 * 				boolean returnOnly() default false;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ReturnInsert#isReturnOnly <em>Return Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getReturnInsert()
 * @model extendedMetaData="name='return-insert' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface ReturnInsert extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Return Only</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Return Only</em>' attribute.
   * @see #isSetReturnOnly()
   * @see #unsetReturnOnly()
   * @see #setReturnOnly(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getReturnInsert_ReturnOnly()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='return-only'"
   * @generated
   */
	boolean isReturnOnly();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ReturnInsert#isReturnOnly <em>Return Only</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Only</em>' attribute.
   * @see #isSetReturnOnly()
   * @see #unsetReturnOnly()
   * @see #isReturnOnly()
   * @generated
   */
	void setReturnOnly(boolean value);

	/**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ReturnInsert#isReturnOnly <em>Return Only</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetReturnOnly()
   * @see #isReturnOnly()
   * @see #setReturnOnly(boolean)
   * @generated
   */
	void unsetReturnOnly();

	/**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ReturnInsert#isReturnOnly <em>Return Only</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Return Only</em>' attribute is set.
   * @see #unsetReturnOnly()
   * @see #isReturnOnly()
   * @see #setReturnOnly(boolean)
   * @generated
   */
	boolean isSetReturnOnly();

} // ReturnInsert
