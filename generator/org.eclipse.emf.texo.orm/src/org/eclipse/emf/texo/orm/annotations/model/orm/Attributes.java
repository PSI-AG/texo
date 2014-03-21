/**
 * <copyright>
 * </copyright>
 *
 * $Id: Attributes.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Attributes</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				This element contains the entity field or property mappings.
 * 				It may be sparsely populated to include only a subset of the
 * 				fields or properties. If metadata-complete for the entity is true
 * 				then the remainder of the attributes will be defaulted according
 * 				to the default rules.
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getEmbeddedId <em>Embedded Id</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getBasicCollection <em>Basic Collection</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getBasicMap <em>Basic Map</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getOneToMany <em>One To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getOneToOne <em>One To One</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getVariableOneToOne <em>Variable One To One</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getManyToMany <em>Many To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getElementCollection <em>Element Collection</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getEmbedded <em>Embedded</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getTransient <em>Transient</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes()
 * @model extendedMetaData="name='attributes' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Attributes extends BaseOrmAnnotation {
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_Description()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Id}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_Id()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
   * @generated
   */
  EList<Id> getId();

  /**
   * Returns the value of the '<em><b>Embedded Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Embedded Id</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Embedded Id</em>' containment reference.
   * @see #setEmbeddedId(EmbeddedId)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_EmbeddedId()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='embedded-id' namespace='##targetNamespace'"
   * @generated
   */
  EmbeddedId getEmbeddedId();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getEmbeddedId <em>Embedded Id</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Embedded Id</em>' containment reference.
   * @see #getEmbeddedId()
   * @generated
   */
  void setEmbeddedId(EmbeddedId value);

  /**
   * Returns the value of the '<em><b>Basic</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_Basic()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='basic' namespace='##targetNamespace'"
   * @generated
   */
  EList<Basic> getBasic();

  /**
   * Returns the value of the '<em><b>Basic Collection</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic Collection</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic Collection</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_BasicCollection()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='basic-collection' namespace='##targetNamespace'"
   * @generated
   */
  EList<BasicCollection> getBasicCollection();

  /**
   * Returns the value of the '<em><b>Basic Map</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic Map</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic Map</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_BasicMap()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='basic-map' namespace='##targetNamespace'"
   * @generated
   */
  EList<BasicMap> getBasicMap();

  /**
   * Returns the value of the '<em><b>Version</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Version}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_Version()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
   * @generated
   */
  EList<Version> getVersion();

  /**
   * Returns the value of the '<em><b>Many To One</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many To One</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many To One</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_ManyToOne()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='many-to-one' namespace='##targetNamespace'"
   * @generated
   */
  EList<ManyToOne> getManyToOne();

  /**
   * Returns the value of the '<em><b>One To Many</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>One To Many</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>One To Many</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_OneToMany()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='one-to-many' namespace='##targetNamespace'"
   * @generated
   */
  EList<OneToMany> getOneToMany();

  /**
   * Returns the value of the '<em><b>One To One</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>One To One</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>One To One</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_OneToOne()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='one-to-one' namespace='##targetNamespace'"
   * @generated
   */
  EList<OneToOne> getOneToOne();

  /**
   * Returns the value of the '<em><b>Variable One To One</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable One To One</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable One To One</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_VariableOneToOne()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='variable-one-to-one' namespace='##targetNamespace'"
   * @generated
   */
  EList<VariableOneToOne> getVariableOneToOne();

  /**
   * Returns the value of the '<em><b>Many To Many</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many To Many</em>' containment reference list isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many To Many</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_ManyToMany()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='many-to-many' namespace='##targetNamespace'"
   * @generated
   */
  EList<ManyToMany> getManyToMany();

  /**
   * Returns the value of the '<em><b>Element Collection</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Collection</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Collection</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_ElementCollection()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='element-collection' namespace='##targetNamespace'"
   * @generated
   */
  EList<ElementCollection> getElementCollection();

  /**
   * Returns the value of the '<em><b>Embedded</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Embedded}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Embedded</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Embedded</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_Embedded()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='embedded' namespace='##targetNamespace'"
   * @generated
   */
  EList<Embedded> getEmbedded();

  /**
   * Returns the value of the '<em><b>Transformation</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transformation</em>' containment reference list isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transformation</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_Transformation()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
   * @generated
   */
  EList<Transformation> getTransformation();

  /**
   * Returns the value of the '<em><b>Transient</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Transient}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transient</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transient</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_Transient()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='transient' namespace='##targetNamespace'"
   * @generated
   */
  EList<Transient> getTransient();

		/**
   * Returns the value of the '<em><b>Structure</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Structure}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Structure</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_Structure()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='structure' namespace='##targetNamespace'"
   * @generated
   */
	EList<Structure> getStructure();

		/**
   * Returns the value of the '<em><b>Array</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Array}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getAttributes_Array()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='array' namespace='##targetNamespace'"
   * @generated
   */
	EList<Array> getArray();

} // Attributes
