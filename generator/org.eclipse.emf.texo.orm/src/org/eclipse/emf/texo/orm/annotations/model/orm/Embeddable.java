/**
 * <copyright>
 * </copyright>
 *
 * $Id: Embeddable.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Embeddable</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				Defines the settings and mappings for embeddable objects. Is
 * 				allowed to be sparsely populated and used in conjunction with
 * 				the annotations. Alternatively, the metadata-complete attribute
 * 				can be used to indicate that no annotations are to be processed
 * 				in the class. If this is the case then the defaulting rules will
 * 				be recursively applied.
 * 
 * 				@Target({TYPE}) @Retention(RUNTIME)
 * 				public @interface Embeddable {}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getCustomizer <em>Customizer</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getChangeTracking <em>Change Tracking</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getStruct <em>Struct</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getCopyPolicy <em>Copy Policy</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getInstantiationCopyPolicy <em>Instantiation Copy Policy</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getCloneCopyPolicy <em>Clone Copy Policy</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getPlsqlRecord <em>Plsql Record</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getPlsqlTable <em>Plsql Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getAttributeOverride <em>Attribute Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getAssociationOverride <em>Association Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#isExcludeDefaultMappings <em>Exclude Default Mappings</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#isMetadataComplete <em>Metadata Complete</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getParentClass <em>Parent Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable()
 * @model extendedMetaData="name='embeddable' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Embeddable extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_Description()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Methods</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Access Methods</em>' containment reference.
   * @see #setAccessMethods(AccessMethods)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_AccessMethods()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='access-methods' namespace='##targetNamespace'"
   * @generated
   */
	AccessMethods getAccessMethods();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getAccessMethods <em>Access Methods</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access Methods</em>' containment reference.
   * @see #getAccessMethods()
   * @generated
   */
	void setAccessMethods(AccessMethods value);

		/**
   * Returns the value of the '<em><b>Customizer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Customizer</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Customizer</em>' containment reference.
   * @see #setCustomizer(Customizer)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_Customizer()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='customizer' namespace='##targetNamespace'"
   * @generated
   */
  Customizer getCustomizer();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getCustomizer <em>Customizer</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Customizer</em>' containment reference.
   * @see #getCustomizer()
   * @generated
   */
  void setCustomizer(Customizer value);

  /**
   * Returns the value of the '<em><b>Change Tracking</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Change Tracking</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Change Tracking</em>' containment reference.
   * @see #setChangeTracking(ChangeTracking)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_ChangeTracking()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='change-tracking' namespace='##targetNamespace'"
   * @generated
   */
  ChangeTracking getChangeTracking();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getChangeTracking <em>Change Tracking</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Change Tracking</em>' containment reference.
   * @see #getChangeTracking()
   * @generated
   */
  void setChangeTracking(ChangeTracking value);

  /**
   * Returns the value of the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Struct</em>' containment reference.
   * @see #setStruct(Struct)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_Struct()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='struct' namespace='##targetNamespace'"
   * @generated
   */
	Struct getStruct();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getStruct <em>Struct</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct</em>' containment reference.
   * @see #getStruct()
   * @generated
   */
	void setStruct(Struct value);

		/**
   * Returns the value of the '<em><b>Converter</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Converter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Converter</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Converter</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_Converter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='converter' namespace='##targetNamespace'"
   * @generated
   */
  EList<Converter> getConverter();

  /**
   * Returns the value of the '<em><b>Type Converter</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Converter</em>' containment reference list isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Converter</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_TypeConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='type-converter' namespace='##targetNamespace'"
   * @generated
   */
  EList<TypeConverter> getTypeConverter();

  /**
   * Returns the value of the '<em><b>Object Type Converter</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Type Converter</em>' containment reference list isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Type Converter</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_ObjectTypeConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='object-type-converter' namespace='##targetNamespace'"
   * @generated
   */
  EList<ObjectTypeConverter> getObjectTypeConverter();

  /**
   * Returns the value of the '<em><b>Struct Converter</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct Converter</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct Converter</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_StructConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='struct-converter' namespace='##targetNamespace'"
   * @generated
   */
  EList<StructConverter> getStructConverter();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_Property()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
   * @generated
   */
  EList<Property> getProperty();

  /**
   * Returns the value of the '<em><b>Attribute Override</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Override</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Override</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_AttributeOverride()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='attribute-override' namespace='##targetNamespace'"
   * @generated
   */
	EList<AttributeOverride> getAttributeOverride();

		/**
   * Returns the value of the '<em><b>Association Override</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Override</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Association Override</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_AssociationOverride()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='association-override' namespace='##targetNamespace'"
   * @generated
   */
	EList<AssociationOverride> getAssociationOverride();

		/**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference.
   * @see #setAttributes(Attributes)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_Attributes()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='attributes' namespace='##targetNamespace'"
   * @generated
   */
  Attributes getAttributes();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getAttributes <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributes</em>' containment reference.
   * @see #getAttributes()
   * @generated
   */
  void setAttributes(Attributes value);

  /**
   * Returns the value of the '<em><b>Copy Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Copy Policy</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Copy Policy</em>' containment reference.
   * @see #setCopyPolicy(CopyPolicy)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_CopyPolicy()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='copy-policy' namespace='##targetNamespace'"
   * @generated
   */
  CopyPolicy getCopyPolicy();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getCopyPolicy <em>Copy Policy</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Copy Policy</em>' containment reference.
   * @see #getCopyPolicy()
   * @generated
   */
  void setCopyPolicy(CopyPolicy value);

  /**
   * Returns the value of the '<em><b>Instantiation Copy Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instantiation Copy Policy</em>' containment reference isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instantiation Copy Policy</em>' containment reference.
   * @see #setInstantiationCopyPolicy(InstantiationCopyPolicy)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_InstantiationCopyPolicy()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instantiation-copy-policy' namespace='##targetNamespace'"
   * @generated
   */
  InstantiationCopyPolicy getInstantiationCopyPolicy();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getInstantiationCopyPolicy <em>Instantiation Copy Policy</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Instantiation Copy Policy</em>' containment reference.
   * @see #getInstantiationCopyPolicy()
   * @generated
   */
  void setInstantiationCopyPolicy(InstantiationCopyPolicy value);

  /**
   * Returns the value of the '<em><b>Clone Copy Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clone Copy Policy</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clone Copy Policy</em>' containment reference.
   * @see #setCloneCopyPolicy(CloneCopyPolicy)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_CloneCopyPolicy()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='clone-copy-policy' namespace='##targetNamespace'"
   * @generated
   */
  CloneCopyPolicy getCloneCopyPolicy();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getCloneCopyPolicy <em>Clone Copy Policy</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Clone Copy Policy</em>' containment reference.
   * @see #getCloneCopyPolicy()
   * @generated
   */
  void setCloneCopyPolicy(CloneCopyPolicy value);

  /**
   * Returns the value of the '<em><b>Plsql Record</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlRecord}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plsql Record</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Plsql Record</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_PlsqlRecord()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='plsql-record' namespace='##targetNamespace'"
   * @generated
   */
	EList<PlsqlRecord> getPlsqlRecord();

		/**
   * Returns the value of the '<em><b>Plsql Table</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlTable}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plsql Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Plsql Table</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_PlsqlTable()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='plsql-table' namespace='##targetNamespace'"
   * @generated
   */
	EList<PlsqlTable> getPlsqlTable();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_Access()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='access'"
   * @generated
   */
  AccessType getAccess();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getAccess <em>Access</em>}' attribute.
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getAccess <em>Access</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Access</em>' attribute is set.
   * @see #unsetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  boolean isSetAccess();

  /**
   * Returns the value of the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute.
   * @see #setClass(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_Class()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='class'"
   * @generated
   */
  String getClass_();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #getClass_()
   * @generated
   */
  void setClass(String value);

  /**
   * Returns the value of the '<em><b>Exclude Default Mappings</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude Default Mappings</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude Default Mappings</em>' attribute.
   * @see #isSetExcludeDefaultMappings()
   * @see #unsetExcludeDefaultMappings()
   * @see #setExcludeDefaultMappings(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_ExcludeDefaultMappings()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='exclude-default-mappings'"
   * @generated
   */
  boolean isExcludeDefaultMappings();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#isExcludeDefaultMappings <em>Exclude Default Mappings</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude Default Mappings</em>' attribute.
   * @see #isSetExcludeDefaultMappings()
   * @see #unsetExcludeDefaultMappings()
   * @see #isExcludeDefaultMappings()
   * @generated
   */
  void setExcludeDefaultMappings(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#isExcludeDefaultMappings <em>Exclude Default Mappings</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetExcludeDefaultMappings()
   * @see #isExcludeDefaultMappings()
   * @see #setExcludeDefaultMappings(boolean)
   * @generated
   */
  void unsetExcludeDefaultMappings();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#isExcludeDefaultMappings <em>Exclude Default Mappings</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Exclude Default Mappings</em>' attribute is set.
   * @see #unsetExcludeDefaultMappings()
   * @see #isExcludeDefaultMappings()
   * @see #setExcludeDefaultMappings(boolean)
   * @generated
   */
  boolean isSetExcludeDefaultMappings();

  /**
   * Returns the value of the '<em><b>Metadata Complete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metadata Complete</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metadata Complete</em>' attribute.
   * @see #isSetMetadataComplete()
   * @see #unsetMetadataComplete()
   * @see #setMetadataComplete(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_MetadataComplete()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='metadata-complete'"
   * @generated
   */
  boolean isMetadataComplete();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#isMetadataComplete <em>Metadata Complete</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Metadata Complete</em>' attribute.
   * @see #isSetMetadataComplete()
   * @see #unsetMetadataComplete()
   * @see #isMetadataComplete()
   * @generated
   */
  void setMetadataComplete(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#isMetadataComplete <em>Metadata Complete</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetMetadataComplete()
   * @see #isMetadataComplete()
   * @see #setMetadataComplete(boolean)
   * @generated
   */
  void unsetMetadataComplete();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#isMetadataComplete <em>Metadata Complete</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Metadata Complete</em>' attribute is set.
   * @see #unsetMetadataComplete()
   * @see #isMetadataComplete()
   * @see #setMetadataComplete(boolean)
   * @generated
   */
  boolean isSetMetadataComplete();

		/**
   * Returns the value of the '<em><b>Parent Class</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Class</em>' attribute.
   * @see #setParentClass(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getEmbeddable_ParentClass()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='parent-class'"
   * @generated
   */
	String getParentClass();

		/**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getParentClass <em>Parent Class</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Class</em>' attribute.
   * @see #getParentClass()
   * @generated
   */
	void setParentClass(String value);

} // Embeddable
