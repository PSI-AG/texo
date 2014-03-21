/**
 * <copyright>
 * </copyright>
 *
 * $Id: Transformation.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Transformation</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				/**
 * 				* Transformation is an optional annotation for
 * 				* org.eclipse.persistence.mappings.TransformationMapping.
 * 				* TransformationMapping allows to map an attribute to one or more
 * 				* database columns.
 * 				*
 * 				* Transformation annotation is an optional part of
 * 				* TransformationMapping definition. Unless the TransformationMapping
 * 				is
 * 				* write-only, it should have a ReadTransformer, it defines
 * 				* transformation of database column(s) value(s)into attribute value.
 * 				* Also unless it's a read-only mapping, either WriteTransformer
 * 				* annotation or WriteTransformers annotation should be specified.
 * 				Each
 * 				* WriteTransformer defines transformation of the attribute value to a
 * 				* single database column value (column is specified in the
 * 				* WriteTransformer).
 * 				**
 * 				@Target({METHOD, FIELD})
 * 				@Retention(RUNTIME)
 * 				public @interface Transformation {
 * 				/**
 * 				* (Optional) Defines whether the value of the field or property
 * 				* should be lazily loaded or must be eagerly fetched. The EAGER
 * 				* strategy is a requirement on the persistence provider runtime
 * 				* that the value must be eagerly fetched. The LAZY strategy is a
 * 				* hint to the persistence provider runtime. If not specified,
 * 				* defaults to EAGER.
 * 				**
 * 				FetchType fetch() default EAGER;
 * 
 * 				/**
 * 				* (Optional) The optional element is a hint as to whether the value
 * 				* of the field or property may be null. It is disregarded
 * 				* for primitive types, which are considered non-optional.
 * 				**
 * 				boolean optional() default true;
 * 				}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getReadTransformer <em>Read Transformer</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getWriteTransformer <em>Write Transformer</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#isMutable <em>Mutable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTransformation()
 * @model extendedMetaData="name='transformation' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Transformation extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Read Transformer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read Transformer</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read Transformer</em>' containment reference.
   * @see #setReadTransformer(ReadTransformer)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTransformation_ReadTransformer()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='read-transformer' namespace='##targetNamespace'"
   * @generated
   */
  ReadTransformer getReadTransformer();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getReadTransformer <em>Read Transformer</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Read Transformer</em>' containment reference.
   * @see #getReadTransformer()
   * @generated
   */
  void setReadTransformer(ReadTransformer value);

  /**
   * Returns the value of the '<em><b>Write Transformer</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.WriteTransformer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Write Transformer</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Write Transformer</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTransformation_WriteTransformer()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='write-transformer' namespace='##targetNamespace'"
   * @generated
   */
  EList<WriteTransformer> getWriteTransformer();

  /**
   * Returns the value of the '<em><b>Access</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.AccessType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessType
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #setAccess(AccessType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTransformation_Access()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='access'"
   * @generated
   */
  AccessType getAccess();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessType
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #getAccess()
   * @generated
   */
  void setAccess(AccessType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getAccess <em>Access</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Access</em>' attribute is set.
   * @see #unsetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  boolean isSetAccess();

  /**
   * Returns the value of the '<em><b>Attribute Type</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Type</em>' attribute.
   * @see #setAttributeType(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTransformation_AttributeType()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='attribute-type'"
   * @generated
   */
	String getAttributeType();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getAttributeType <em>Attribute Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Type</em>' attribute.
   * @see #getAttributeType()
   * @generated
   */
	void setAttributeType(String value);

		/**
   * Returns the value of the '<em><b>Property</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTransformation_Property()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
   * @generated
   */
  EList<Property> getProperty();

  /**
   * Returns the value of the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access Methods</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access Methods</em>' containment reference.
   * @see #setAccessMethods(AccessMethods)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTransformation_AccessMethods()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='access-methods' namespace='##targetNamespace'"
   * @generated
   */
  AccessMethods getAccessMethods();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getAccessMethods <em>Access Methods</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Access Methods</em>' containment reference.
   * @see #getAccessMethods()
   * @generated
   */
  void setAccessMethods(AccessMethods value);

  /**
   * Returns the value of the '<em><b>Fetch</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fetch</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FetchType
   * @see #isSetFetch()
   * @see #unsetFetch()
   * @see #setFetch(FetchType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTransformation_Fetch()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='fetch'"
   * @generated
   */
  FetchType getFetch();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getFetch <em>Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FetchType
   * @see #isSetFetch()
   * @see #unsetFetch()
   * @see #getFetch()
   * @generated
   */
  void setFetch(FetchType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getFetch <em>Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetFetch()
   * @see #getFetch()
   * @see #setFetch(FetchType)
   * @generated
   */
  void unsetFetch();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getFetch <em>Fetch</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Fetch</em>' attribute is set.
   * @see #unsetFetch()
   * @see #getFetch()
   * @see #setFetch(FetchType)
   * @generated
   */
  boolean isSetFetch();

  /**
   * Returns the value of the '<em><b>Mutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mutable</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mutable</em>' attribute.
   * @see #isSetMutable()
   * @see #unsetMutable()
   * @see #setMutable(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTransformation_Mutable()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='mutable'"
   * @generated
   */
  boolean isMutable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#isMutable <em>Mutable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Mutable</em>' attribute.
   * @see #isSetMutable()
   * @see #unsetMutable()
   * @see #isMutable()
   * @generated
   */
  void setMutable(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#isMutable <em>Mutable</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetMutable()
   * @see #isMutable()
   * @see #setMutable(boolean)
   * @generated
   */
  void unsetMutable();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#isMutable <em>Mutable</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Mutable</em>' attribute is set.
   * @see #unsetMutable()
   * @see #isMutable()
   * @see #setMutable(boolean)
   * @generated
   */
  boolean isSetMutable();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTransformation_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #isSetOptional()
   * @see #unsetOptional()
   * @see #setOptional(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTransformation_Optional()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='optional'"
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isSetOptional()
   * @see #unsetOptional()
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOptional()
   * @see #isOptional()
   * @see #setOptional(boolean)
   * @generated
   */
  void unsetOptional();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#isOptional <em>Optional</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Optional</em>' attribute is set.
   * @see #unsetOptional()
   * @see #isOptional()
   * @see #setOptional(boolean)
   * @generated
   */
  boolean isSetOptional();

} // Transformation
