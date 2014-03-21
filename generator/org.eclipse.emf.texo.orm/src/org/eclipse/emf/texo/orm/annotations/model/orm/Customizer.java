/**
 * <copyright>
 * </copyright>
 *
 * $Id: Customizer.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Customizer</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* The Customizer annotation is used to specify a class that
 * 				implements
 * 				* the org.eclipse.persistence.config.DescriptorCustomizer
 * 				* interface and is to run against an enetity's class descriptor after
 * 				all
 * 				* metadata processing has been completed.
 * 				*
 * 				* The Customizer annotation may be defined on an Entity,
 * 				MappedSuperclass
 * 				* or Embeddable class. In the case of inheritance, a Customizer is
 * 				not
 * 				* inherited from its parent classes.
 * 				**
 * 				@Target({TYPE})
 * 				@Retention(RUNTIME)
 * 				public @interface Customizer {
 * 				/**
 * 				* (Required) Defines the name of the descriptor customizer class that
 * 				* should be applied for the related entity or embeddable class.
 * 				**
 * 				Class value();
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Customizer#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCustomizer()
 * @model extendedMetaData="name='customizer' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Customizer extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute.
   * @see #setClass(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCustomizer_Class()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='class'"
   * @generated
   */
  String getClass_();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Customizer#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #getClass_()
   * @generated
   */
  void setClass(String value);

} // Customizer
