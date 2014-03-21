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
 * A representation of the model object '<em><b>Class Extractor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* A ClassExtractor allows for a user defined class indicator in place
 * 				of
 * 				* providing a discriminator column. The class has the following
 * 				restrictions:
 * 
 * 				* - It must extend the
 * 				org.eclipse.persistence.descriptors.ClassExtractor
 * 				* class and implement the extractClassFromRow(Record, Session)
 * 				method.
 * 				* - That method must take a database row (a Record/Map) as an
 * 				argument and
 * 				* must return the class to use for that row.
 * 				*
 * 				* This method will be used to decide which class to instantiate when
 * 				reading
 * 				* from the database. It is the application's responsibility to
 * 				populate any
 * 				* typing information in the database required to determine the class
 * 				from the
 * 				* row.
 * 				*
 * 				* The ClassExtractor must only be set on the root of an entity class
 * 				or
 * 				* sub-hierarchy in which a different inheritance strategy is applied.
 * 				The
 * 				* ClassExtractor can only be used with the SINGLE_TABLE and JOINED
 * 				inheritance
 * 				* strategies.
 * 				*
 * 				* If a ClassExtractor is used then a DiscriminatorColumn cannot be
 * 				used. A
 * 				* ClassExtractor also cannot be used on either the root or its
 * 				subclasses.
 * 				*
 * 				* In addition, for more complex configurations using a ClassExtractor
 * 				and a
 * 				* SINGLE_TABLE strategy, the descriptor's withAllSubclasses and
 * 				onlyInstances
 * 				* expressions should be set through the ClassExtractor's initialize
 * 				method.
 * 				*
 * 				* @see
 * 				org.eclipse.persistence.descriptors.InheritancePolicy.setWithAllSubclassesExpression(Expression)
 * 				* @see
 * 				org.eclipse.persistence.descriptors.InheritancePolicy.setOnlyInstancesExpression(Expression)
 * 				*
 * 				* @author Guy Pelletier
 * 				* @since EclipseLink 2.1
 * 				**
 * 				@Target({TYPE})
 * 				@Retention(RUNTIME)
 * 				public @interface ClassExtractor {
 * 				/**
 * 				* (Required) Defines the name of the class extractor that should be
 * 				* applied to this entity's descriptor.
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
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ClassExtractor#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getClassExtractor()
 * @model extendedMetaData="name='class-extractor' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface ClassExtractor extends BaseOrmAnnotation {
	/**
   * Returns the value of the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute.
   * @see #setClass(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getClassExtractor_Class()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='class'"
   * @generated
   */
	String getClass_();

	/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ClassExtractor#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #getClass_()
   * @generated
   */
	void setClass(String value);

} // ClassExtractor
