/**
 * <copyright>
 * </copyright>
 *
 * $Id: InstantiationCopyPolicy.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Instantiation Copy Policy</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 				/**
 * 				* An InstantiationCopyPolicy is used to set an
 * 				* org.eclipse.persistence.descriptors.copying.InstantiationCopyPolicy
 * 				* on an Entity. InstantiationCopyPolicy is the default CopyPolicy in
 * 				* EclipseLink and therefore this configuration option is only used
 * 				to
 * 				* override other types of copy policies
 * 				*
 * 				* An InstantiationCopyPolicy should be specified on an Entity,
 * 				* MappedSuperclass or Embeddable.
 * 				*
 * 				* Example:
 * 				* @Entity
 * 				* @InstantiationCopyPolicy
 * 				**
 * 				public @interface InstantiationCopyPolicy {
 * 				}
 * 			
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getInstantiationCopyPolicy()
 * @model extendedMetaData="name='instantiation-copy-policy' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface InstantiationCopyPolicy extends BaseOrmAnnotation {
} // InstantiationCopyPolicy
