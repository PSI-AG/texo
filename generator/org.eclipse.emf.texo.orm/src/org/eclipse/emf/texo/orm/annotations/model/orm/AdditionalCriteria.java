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
 * A representation of the model object '<em><b>Additional Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* An additional criteria can be specified at the Entity or
 * 				MappedSuperclass
 * 				* level. When specified at the mapped superclass level, it applies to
 * 				all
 * 				* inheriting entities unless those entities define their own
 * 				additional
 * 				* criteria, at which point the additional criteria from the mapped
 * 				superclass
 * 				* is ignored.
 * 				*
 * 				* The additional criteria supports any valid JPQL string and must use
 * 				'this'
 * 				* as an alias to form your additional criteria. E.G.,
 * 				*
 * 				* @Entity
 * 				* @AdditionalCriteria("this.nut.size = :NUT_SIZE and this.nut.color =
 * 				:NUT_COLOR")
 * 				* public class Bolt {...}
 * 				*
 * 				* Additional criteria parameters are also accepted and are set
 * 				through
 * 				* properties on the entity manager factory, or on an entity manager.
 * 				When set
 * 				* on the entity manager, the properties must be set before any query
 * 				execution
 * 				* and should not be changed for the life span of that entity manager.
 * 				*
 * 				* Properties set on the entity manager will override those similarly
 * 				named
 * 				* properties set on the entity manager factory.
 * 				*
 * 				* Additional criteria is not supported with any native queries.
 * 				*
 * 				* @author Guy Pelletier
 * 				* @since EclipseLink 2.2
 * 				**
 * 				@Target({TYPE})
 * 				@Retention(RUNTIME)
 * 				public @interface AdditionalCriteria {
 * 				/**
 * 				* (Required) The JPQL fragment to use as the additional criteria.
 * 				**
 * 				String value();
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.AdditionalCriteria#getCriteria <em>Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAdditionalCriteria()
 * @model extendedMetaData="name='additional-criteria' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface AdditionalCriteria extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Criteria</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Criteria</em>' attribute.
   * @see #setCriteria(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAdditionalCriteria_Criteria()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='criteria' namespace='##targetNamespace'"
   * @generated
   */
	String getCriteria();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.AdditionalCriteria#getCriteria <em>Criteria</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Criteria</em>' attribute.
   * @see #getCriteria()
   * @generated
   */
	void setCriteria(String value);

} // AdditionalCriteria
