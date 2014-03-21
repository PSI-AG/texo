/**
 * <copyright>
 * </copyright>
 *
 * $Id: WriteTransformer.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Write Transformer</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <!-- begin-model-doc -->
 * 
 * 
 * * * Annotation for org.eclipse.persistence.mappings.TransformationMapping. * WriteTransformer defines transformation
 * of the attribute value to a * single database column value (column is specified in the * WriteTransformer). * * A
 * single WriteTransformer may be specified directly on the method or * attribute. Multiple WriteTransformers should be
 * wrapped into * WriteTransformers annotation. No WriteTransformers specified for * read-only mapping. Unless the
 * TransformationMapping is write-only, it * should have a ReadTransformer, it defines transformation of database *
 * column(s) value(s)into attribute value. *
 * 
 * @Target({METHOD, FIELD})
 * @Retention(RUNTIME) public @interface WriteTransformer { * * User-defined class that must implement the *
 *                     org.eclipse.persistence.mappings.transformers.FieldTransformer * interface. The class will be
 *                     instantiated, its buildFieldValue * will be used to create the value to be written into the
 *                     database * column. Note that for ddl generation and returning to be * supported the method
 *                     buildFieldValue in the class should be * defined to return the relevant Java type, not just
 *                     Object as * defined in the interface, for instance: * public Time buildFieldValue(Object
 *                     instance, String fieldName, Session session). * Either transformerClass or method must be
 *                     specified, but not both. * Class transformerClass() default void.class;
 * 
 *                     * * The mapped class must have a method with this name which returns * a value to be written into
 *                     the database column. * Note that for ddl generation and returning to be supported the * method
 *                     should be defined to return a particular type, not just * Object, for instance: * public Time
 *                     getStartTime(). * The method may require a Transient annotation to avoid being * mapped as Basic
 *                     by default. * Either transformerClass or method must be specified, but not both. * String
 *                     method() default "";
 * 
 *                     * * Specify here the column into which the value should be written. * The only case when this
 *                     could be skipped is if a single * WriteTransformer annotates an attribute - the attribute's name
 *                     * will be used as a column name. * Column column() default @Column; }
 * 
 * 
 *                     <!-- end-model-doc -->
 * 
 *                     <p>
 *                     The following features are supported:
 *                     <ul>
 *                     <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.WriteTransformer#getColumn <em>Column
 *                     </em>}</li>
 *                     <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.WriteTransformer#getMethod <em>Method
 *                     </em>}</li>
 *                     <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.WriteTransformer#getTransformerClass
 *                     <em>Transformer Class</em>}</li>
 *                     </ul>
 *                     </p>
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getWriteTransformer()
 * @model extendedMetaData="name='write-transformer' kind='elementOnly'"
 * @generated
 */
public interface WriteTransformer extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' containment reference.
   * @see #setColumn(Column)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getWriteTransformer_Column()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
   * @generated
   */
  Column getColumn();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.WriteTransformer#getColumn <em>Column</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' containment reference.
   * @see #getColumn()
   * @generated
   */
  void setColumn(Column value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see #setMethod(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getWriteTransformer_Method()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='method'"
   * @generated
   */
  String getMethod();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.WriteTransformer#getMethod <em>Method</em>}' attribute.
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getWriteTransformer_TransformerClass()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='transformer-class'"
   * @generated
   */
  String getTransformerClass();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.WriteTransformer#getTransformerClass <em>Transformer Class</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Transformer Class</em>' attribute.
   * @see #getTransformerClass()
   * @generated
   */
  void setTransformerClass(String value);

} // WriteTransformer
