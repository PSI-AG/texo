/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReadTransformer.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Read Transformer</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <!-- begin-model-doc -->
 * 
 * 
 * * * Annotation for org.eclipse.persistence.mappings.TransformationMapping. * Unless the TransformationMapping is
 * write-only, it should have a * ReadTransformer, it defines transformation of database column(s) * value(s)into
 * attribute value. * * Also unless it's a read-only mapping, either WriteTransformer * annotation or WriteTransformers
 * annotation should be specified. Each * WriteTransformer defines transformation of the attribute value to a * single
 * database column value (column is specified in the * WriteTransformer). *
 * 
 * @Target({METHOD, FIELD})
 * @Retention(RUNTIME) public @interface ReadTransformer { * * User-defined class that must implement the *
 *                     org.eclipse.persistence.mappings.transformers.AttributeTransformer * interface. The class will be
 *                     instantiated, its * buildAttributeValue will be used to create the value to be * assigned to the
 *                     attribute. * Either transformerClass or method must be specified, but not both. * Class
 *                     transformerClass() default void.class;
 * 
 *                     * * The mapped class must have a method with this name which returns * a value to be assigned to
 *                     the attribute (not assigns the value to * the attribute). Either transformerClass or method must
 *                     be * specified, but not both. * String method() default ""; }
 * 
 * 
 *                     <!-- end-model-doc -->
 * 
 *                     <p>
 *                     The following features are supported:
 *                     <ul>
 *                     <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ReadTransformer#getMethod <em>Method
 *                     </em>}</li>
 *                     <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ReadTransformer#getTransformerClass
 *                     <em>Transformer Class</em>}</li>
 *                     </ul>
 *                     </p>
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getReadTransformer()
 * @model extendedMetaData="name='read-transformer' kind='empty'"
 * @generated
 */
public interface ReadTransformer extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see #setMethod(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getReadTransformer_Method()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='method'"
   * @generated
   */
  String getMethod();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ReadTransformer#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see #getMethod()
   * @generated
   */
  void setMethod(String value);

  /**
   * Returns the value of the '<em><b>Transformer Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transformer Class</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transformer Class</em>' attribute.
   * @see #setTransformerClass(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getReadTransformer_TransformerClass()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='transformer-class'"
   * @generated
   */
  String getTransformerClass();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ReadTransformer#getTransformerClass <em>Transformer Class</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Transformer Class</em>' attribute.
   * @see #getTransformerClass()
   * @generated
   */
  void setTransformerClass(String value);

} // ReadTransformer
