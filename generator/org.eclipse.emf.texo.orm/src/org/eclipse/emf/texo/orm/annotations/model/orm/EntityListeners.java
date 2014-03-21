/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityListeners.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Entity Listeners</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <!-- begin-model-doc -->
 * 
 * 
 * @Target({TYPE ) @Retention(RUNTIME) public @interface EntityListeners { Class[] value(); }
 * 
 * 
 *               <!-- end-model-doc -->
 * 
 *               <p>
 *               The following features are supported:
 *               <ul>
 *               <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityListeners#getEntityListener <em>Entity
 *               Listener</em>}</li>
 *               </ul>
 *               </p>
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityListeners()
 * @model extendedMetaData="name='entity-listeners' kind='elementOnly'"
 * @generated
 */
public interface EntityListeners extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Entity Listener</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Listener</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Listener</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEntityListeners_EntityListener()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='entity-listener' namespace='##targetNamespace'"
   * @generated
   */
  EList<EntityListener> getEntityListener();

} // EntityListeners
