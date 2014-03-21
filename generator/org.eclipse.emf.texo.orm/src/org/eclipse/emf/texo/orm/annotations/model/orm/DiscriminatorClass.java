/**
 * <copyright>
 * </copyright>
 *
 * $Id: DiscriminatorClass.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Discriminator Class</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <!-- begin-model-doc -->
 * 
 * 
 * * * A DiscriminatorClass is used within a VariableOneToOne annotation. *
 * 
 * @Target({ )
 * @Retention(RUNTIME) public @interface DiscriminatorClass { * * (Required) The discriminator to be stored on the
 *                     database. * String discriminator();
 * 
 *                     * * (Required) The class to the instantiated with the given * discriminator. * Class value(); }
 * 
 * 
 *                     <!-- end-model-doc -->
 * 
 *                     <p>
 *                     The following features are supported:
 *                     <ul>
 *                     <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorClass#getDiscriminator
 *                     <em>Discriminator</em>}</li>
 *                     <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorClass#getValue <em>Value
 *                     </em>}</li>
 *                     </ul>
 *                     </p>
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getDiscriminatorClass()
 * @model extendedMetaData="name='discriminator-class' kind='empty'"
 * @generated
 */
public interface DiscriminatorClass extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Discriminator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discriminator</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discriminator</em>' attribute.
   * @see #setDiscriminator(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getDiscriminatorClass_Discriminator()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='discriminator'"
   * @generated
   */
  String getDiscriminator();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorClass#getDiscriminator <em>Discriminator</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Discriminator</em>' attribute.
   * @see #getDiscriminator()
   * @generated
   */
  void setDiscriminator(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getDiscriminatorClass_Value()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='value'"
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorClass#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // DiscriminatorClass
