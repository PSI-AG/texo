/**
 * <copyright>
 * </copyright>
 *
 * $Id: EReferenceORMAnnotation.java,v 1.10 2011/10/25 22:27:57 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.annotations.AnnotationProvider;
import org.eclipse.emf.texo.annotations.annotationsmodel.EReferenceAnnotation;
import org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.Basic;
import org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection;
import org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap;
import org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection;
import org.eclipse.emf.texo.orm.annotations.model.orm.Embedded;
import org.eclipse.emf.texo.orm.annotations.model.orm.EmbeddedId;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany;
import org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne;
import org.eclipse.emf.texo.orm.annotations.model.orm.MapKey;
import org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyClass;
import org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany;
import org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKeyJoinColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.Transient;
import org.eclipse.emf.texo.orm.annotator.ORMGenerator;
import org.eclipse.emf.texo.orm.annotator.ORMUtils;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EReference ORM Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getEmbedded <em>Embedded</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getEmbeddedId <em>Embedded Id</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getJoinColumn <em>Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getJoinTable <em>Join Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getManyToMany <em>Many To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getOneToMany <em>One To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getOneToOne <em>One To One</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getMapKey <em>Map Key</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getMapKeyClass <em>Map Key Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getMapKeyColumn <em>Map Key Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getMapKeyJoinColumn <em>Map Key Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getOrderColumn <em>Order Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getBasicCollection <em>Basic Collection</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getBasicMap <em>Basic Map</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getAssociationOverride <em>Association Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getAttributeOverride <em>Attribute Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getBasic <em>Basic</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation()
 * @model kind="class"
 * @generated
 */
public class EReferenceORMAnnotation extends EReferenceAnnotation implements EStructuralFeatureORMAnnotation {
  /**
   * The cached value of the '{@link #getTransient() <em>Transient</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransient()
   * @generated
   * @ordered
   */
  protected Transient transient_;

  /**
   * The cached value of the '{@link #getCollectionTable() <em>Collection Table</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCollectionTable()
   * @generated
   * @ordered
   */
  protected CollectionTable collectionTable;

  /**
   * The cached value of the '{@link #getElementCollection() <em>Element Collection</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getElementCollection()
   * @generated
   * @ordered
   */
  protected ElementCollection elementCollection;

  /**
   * The cached value of the '{@link #getEmbedded() <em>Embedded</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmbedded()
   * @generated
   * @ordered
   */
  protected Embedded embedded;

  /**
   * The cached value of the '{@link #getEmbeddedId() <em>Embedded Id</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getEmbeddedId()
   * @generated
   * @ordered
   */
  protected EmbeddedId embeddedId;

  /**
   * The cached value of the '{@link #getJoinColumn() <em>Join Column</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getJoinColumn()
   * @generated
   * @ordered
   */
  protected EList<JoinColumn> joinColumn;

  /**
   * The cached value of the '{@link #getJoinTable() <em>Join Table</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getJoinTable()
   * @generated
   * @ordered
   */
  protected JoinTable joinTable;

  /**
   * The cached value of the '{@link #getManyToMany() <em>Many To Many</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getManyToMany()
   * @generated
   * @ordered
   */
  protected ManyToMany manyToMany;

  /**
   * The cached value of the '{@link #getManyToOne() <em>Many To One</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getManyToOne()
   * @generated
   * @ordered
   */
  protected ManyToOne manyToOne;

  /**
   * The cached value of the '{@link #getOneToMany() <em>One To Many</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getOneToMany()
   * @generated
   * @ordered
   */
  protected OneToMany oneToMany;

  /**
   * The cached value of the '{@link #getOneToOne() <em>One To One</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOneToOne()
   * @generated
   * @ordered
   */
  protected OneToOne oneToOne;

  /**
   * The cached value of the '{@link #getMapKey() <em>Map Key</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getMapKey()
   * @generated
   * @ordered
   */
  protected MapKey mapKey;

  /**
   * The cached value of the '{@link #getMapKeyClass() <em>Map Key Class</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getMapKeyClass()
   * @generated
   * @ordered
   */
  protected MapKeyClass mapKeyClass;

  /**
   * The cached value of the '{@link #getMapKeyColumn() <em>Map Key Column</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getMapKeyColumn()
   * @generated
   * @ordered
   */
  protected MapKeyColumn mapKeyColumn;

  /**
   * The cached value of the '{@link #getMapKeyJoinColumn() <em>Map Key Join Column</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getMapKeyJoinColumn()
   * @generated
   * @ordered
   */
  protected EList<MapKeyJoinColumn> mapKeyJoinColumn;

  /**
   * The default value of the '{@link #getOrderBy() <em>Order By</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOrderBy()
   * @generated
   * @ordered
   */
  protected static final String ORDER_BY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrderBy() <em>Order By</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getOrderBy()
   * @generated
   * @ordered
   */
  protected String orderBy = ORDER_BY_EDEFAULT;

  /**
   * The cached value of the '{@link #getOrderColumn() <em>Order Column</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOrderColumn()
   * @generated
   * @ordered
   */
  protected OrderColumn orderColumn;

  /**
   * The cached value of the '{@link #getBasicCollection() <em>Basic Collection</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getBasicCollection()
   * @generated
   * @ordered
   */
  protected BasicCollection basicCollection;

  /**
   * The cached value of the '{@link #getBasicMap() <em>Basic Map</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasicMap()
   * @generated
   * @ordered
   */
  protected BasicMap basicMap;

  /**
   * The cached value of the '{@link #getAssociationOverride() <em>Association Override</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getAssociationOverride()
   * @generated
   * @ordered
   */
  protected EList<AssociationOverride> associationOverride;

  /**
   * The cached value of the '{@link #getAttributeOverride() <em>Attribute Override</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getAttributeOverride()
   * @generated
   * @ordered
   */
  protected EList<AttributeOverride> attributeOverride;

  /**
   * The cached value of the '{@link #getPrimaryKeyJoinColumn() <em>Primary Key Join Column</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getPrimaryKeyJoinColumn()
   * @generated
   * @ordered
   */
  protected EList<PrimaryKeyJoinColumn> primaryKeyJoinColumn;

  /**
   * The cached value of the '{@link #getBasic() <em>Basic</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getBasic()
   * @generated
   * @ordered
   */
  protected Basic basic;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected EReferenceORMAnnotation() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmannotationsPackage.Literals.EREFERENCE_ORM_ANNOTATION;
  }

  /**
   * Returns the value of the '<em><b>Association Override</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Association Override</em>' containment reference list isn't clear, there really should
   * be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Association Override</em>' containment reference list.
   * @see #isSetAssociationOverride()
   * @see #unsetAssociationOverride()
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_AssociationOverride()
   * @model containment="true" unsettable="true"
   * @generated
   */
  public EList<AssociationOverride> getAssociationOverride() {
    if (associationOverride == null) {
      associationOverride = new EObjectContainmentEList.Unsettable<AssociationOverride>(AssociationOverride.class, this, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ASSOCIATION_OVERRIDE);
    }
    return associationOverride;
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getAssociationOverride <em>Association Override</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAssociationOverride()
   * @see #getAssociationOverride()
   * @generated
   */
  public void unsetAssociationOverride() {
    if (associationOverride != null) ((InternalEList.Unsettable<?>)associationOverride).unset();
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getAssociationOverride <em>Association Override</em>}' containment reference list is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Association Override</em>' containment reference list is set.
   * @see #unsetAssociationOverride()
   * @see #getAssociationOverride()
   * @generated
   */
  public boolean isSetAssociationOverride() {
    return associationOverride != null && ((InternalEList.Unsettable<?>)associationOverride).isSet();
  }

  /**
   * Returns the value of the '<em><b>Attribute Override</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Override</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Override</em>' containment reference list.
   * @see #isSetAttributeOverride()
   * @see #unsetAttributeOverride()
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_AttributeOverride()
   * @model containment="true" unsettable="true"
   * @generated
   */
  public EList<AttributeOverride> getAttributeOverride() {
    if (attributeOverride == null) {
      attributeOverride = new EObjectContainmentEList.Unsettable<AttributeOverride>(AttributeOverride.class, this, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ATTRIBUTE_OVERRIDE);
    }
    return attributeOverride;
  }

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getAttributeOverride <em>Attribute Override</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAttributeOverride()
   * @see #getAttributeOverride()
   * @generated
   */
  public void unsetAttributeOverride() {
    if (attributeOverride != null) ((InternalEList.Unsettable<?>)attributeOverride).unset();
  }

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getAttributeOverride <em>Attribute Override</em>}' containment reference list is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Attribute Override</em>' containment reference list is set.
   * @see #unsetAttributeOverride()
   * @see #getAttributeOverride()
   * @generated
   */
  public boolean isSetAttributeOverride() {
    return attributeOverride != null && ((InternalEList.Unsettable<?>)attributeOverride).isSet();
  }

  /**
   * Returns the value of the '<em><b>Primary Key Join Column</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKeyJoinColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Key Join Column</em>' containment reference list isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Key Join Column</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_PrimaryKeyJoinColumn()
   * @model containment="true"
   * @generated
   */
  public EList<PrimaryKeyJoinColumn> getPrimaryKeyJoinColumn() {
    if (primaryKeyJoinColumn == null) {
      primaryKeyJoinColumn = new EObjectContainmentEList<PrimaryKeyJoinColumn>(PrimaryKeyJoinColumn.class, this, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__PRIMARY_KEY_JOIN_COLUMN);
    }
    return primaryKeyJoinColumn;
  }

  /**
   * Returns the value of the '<em><b>Basic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic</em>' containment reference.
   * @see #setBasic(Basic)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_Basic()
   * @model containment="true"
   * @generated
   */
  public Basic getBasic() {
    return basic;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasic(Basic newBasic, NotificationChain msgs) {
    Basic oldBasic = basic;
    basic = newBasic;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC, oldBasic, newBasic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getBasic <em>Basic</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic</em>' containment reference.
   * @see #getBasic()
   * @generated
   */
  public void setBasic(Basic newBasic) {
    if (newBasic != basic) {
      NotificationChain msgs = null;
      if (basic != null)
        msgs = ((InternalEObject)basic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC, null, msgs);
      if (newBasic != null)
        msgs = ((InternalEObject)newBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC, null, msgs);
      msgs = basicSetBasic(newBasic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC, newBasic, newBasic));
  }

  /**
   * Returns the value of the '<em><b>Transient</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transient</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transient</em>' containment reference.
   * @see #setTransient(Transient)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getETypeElementORMAnnotation_Transient()
   * @model containment="true"
   * @generated
   */
  public Transient getTransient() {
    return transient_;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransient(Transient newTransient, NotificationChain msgs) {
    Transient oldTransient = transient_;
    transient_ = newTransient;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__TRANSIENT, oldTransient, newTransient);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getTransient <em>Transient</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Transient</em>' containment reference.
   * @see #getTransient()
   * @generated
   */
  public void setTransient(Transient newTransient) {
    if (newTransient != transient_) {
      NotificationChain msgs = null;
      if (transient_ != null)
        msgs = ((InternalEObject)transient_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__TRANSIENT, null, msgs);
      if (newTransient != null)
        msgs = ((InternalEObject)newTransient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__TRANSIENT, null, msgs);
      msgs = basicSetTransient(newTransient, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__TRANSIENT, newTransient, newTransient));
  }

  /**
   * Returns the value of the '<em><b>Collection Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection Table</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection Table</em>' containment reference.
   * @see #setCollectionTable(CollectionTable)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEStructuralFeatureORMAnnotation_CollectionTable()
   * @model containment="true"
   * @generated
   */
  public CollectionTable getCollectionTable() {
    return collectionTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCollectionTable(CollectionTable newCollectionTable, NotificationChain msgs) {
    CollectionTable oldCollectionTable = collectionTable;
    collectionTable = newCollectionTable;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__COLLECTION_TABLE, oldCollectionTable, newCollectionTable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getCollectionTable <em>Collection Table</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection Table</em>' containment reference.
   * @see #getCollectionTable()
   * @generated
   */
  public void setCollectionTable(CollectionTable newCollectionTable) {
    if (newCollectionTable != collectionTable) {
      NotificationChain msgs = null;
      if (collectionTable != null)
        msgs = ((InternalEObject)collectionTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__COLLECTION_TABLE, null, msgs);
      if (newCollectionTable != null)
        msgs = ((InternalEObject)newCollectionTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__COLLECTION_TABLE, null, msgs);
      msgs = basicSetCollectionTable(newCollectionTable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__COLLECTION_TABLE, newCollectionTable, newCollectionTable));
  }

  /**
   * Returns the value of the '<em><b>Element Collection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Collection</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Collection</em>' containment reference.
   * @see #setElementCollection(ElementCollection)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEStructuralFeatureORMAnnotation_ElementCollection()
   * @model containment="true"
   * @generated
   */
  public ElementCollection getElementCollection() {
    return elementCollection;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementCollection(ElementCollection newElementCollection, NotificationChain msgs) {
    ElementCollection oldElementCollection = elementCollection;
    elementCollection = newElementCollection;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ELEMENT_COLLECTION, oldElementCollection, newElementCollection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getElementCollection <em>Element Collection</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Collection</em>' containment reference.
   * @see #getElementCollection()
   * @generated
   */
  public void setElementCollection(ElementCollection newElementCollection) {
    if (newElementCollection != elementCollection) {
      NotificationChain msgs = null;
      if (elementCollection != null)
        msgs = ((InternalEObject)elementCollection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ELEMENT_COLLECTION, null, msgs);
      if (newElementCollection != null)
        msgs = ((InternalEObject)newElementCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ELEMENT_COLLECTION, null, msgs);
      msgs = basicSetElementCollection(newElementCollection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ELEMENT_COLLECTION, newElementCollection, newElementCollection));
  }

  /**
   * Returns the value of the '<em><b>Embedded</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Embedded</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Embedded</em>' containment reference.
   * @see #setEmbedded(Embedded)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_Embedded()
   * @model containment="true"
   * @generated
   */
  public Embedded getEmbedded() {
    return embedded;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmbedded(Embedded newEmbedded, NotificationChain msgs) {
    Embedded oldEmbedded = embedded;
    embedded = newEmbedded;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED, oldEmbedded, newEmbedded);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getEmbedded <em>Embedded</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Embedded</em>' containment reference.
   * @see #getEmbedded()
   * @generated
   */
  public void setEmbedded(Embedded newEmbedded) {
    if (newEmbedded != embedded) {
      NotificationChain msgs = null;
      if (embedded != null)
        msgs = ((InternalEObject)embedded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED, null, msgs);
      if (newEmbedded != null)
        msgs = ((InternalEObject)newEmbedded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED, null, msgs);
      msgs = basicSetEmbedded(newEmbedded, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED, newEmbedded, newEmbedded));
  }

  /**
   * Returns the value of the '<em><b>Embedded Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Embedded Id</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Embedded Id</em>' containment reference.
   * @see #setEmbeddedId(EmbeddedId)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_EmbeddedId()
   * @model containment="true"
   * @generated
   */
  public EmbeddedId getEmbeddedId() {
    return embeddedId;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmbeddedId(EmbeddedId newEmbeddedId, NotificationChain msgs) {
    EmbeddedId oldEmbeddedId = embeddedId;
    embeddedId = newEmbeddedId;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED_ID, oldEmbeddedId, newEmbeddedId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getEmbeddedId <em>Embedded Id</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Embedded Id</em>' containment reference.
   * @see #getEmbeddedId()
   * @generated
   */
  public void setEmbeddedId(EmbeddedId newEmbeddedId) {
    if (newEmbeddedId != embeddedId) {
      NotificationChain msgs = null;
      if (embeddedId != null)
        msgs = ((InternalEObject)embeddedId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED_ID, null, msgs);
      if (newEmbeddedId != null)
        msgs = ((InternalEObject)newEmbeddedId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED_ID, null, msgs);
      msgs = basicSetEmbeddedId(newEmbeddedId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED_ID, newEmbeddedId, newEmbeddedId));
  }

  /**
   * Returns the value of the '<em><b>Join Column</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Column</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Column</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_JoinColumn()
   * @model containment="true"
   * @generated
   */
  public EList<JoinColumn> getJoinColumn() {
    if (joinColumn == null) {
      joinColumn = new EObjectContainmentEList<JoinColumn>(JoinColumn.class, this, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_COLUMN);
    }
    return joinColumn;
  }

  /**
   * Returns the value of the '<em><b>Join Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Table</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Table</em>' containment reference.
   * @see #setJoinTable(JoinTable)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_JoinTable()
   * @model containment="true"
   * @generated
   */
  public JoinTable getJoinTable() {
    return joinTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJoinTable(JoinTable newJoinTable, NotificationChain msgs) {
    JoinTable oldJoinTable = joinTable;
    joinTable = newJoinTable;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_TABLE, oldJoinTable, newJoinTable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getJoinTable <em>Join Table</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Join Table</em>' containment reference.
   * @see #getJoinTable()
   * @generated
   */
  public void setJoinTable(JoinTable newJoinTable) {
    if (newJoinTable != joinTable) {
      NotificationChain msgs = null;
      if (joinTable != null)
        msgs = ((InternalEObject)joinTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_TABLE, null, msgs);
      if (newJoinTable != null)
        msgs = ((InternalEObject)newJoinTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_TABLE, null, msgs);
      msgs = basicSetJoinTable(newJoinTable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_TABLE, newJoinTable, newJoinTable));
  }

  /**
   * Returns the value of the '<em><b>Many To Many</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many To Many</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many To Many</em>' containment reference.
   * @see #setManyToMany(ManyToMany)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_ManyToMany()
   * @model containment="true"
   * @generated
   */
  public ManyToMany getManyToMany() {
    return manyToMany;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetManyToMany(ManyToMany newManyToMany, NotificationChain msgs) {
    ManyToMany oldManyToMany = manyToMany;
    manyToMany = newManyToMany;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_MANY, oldManyToMany, newManyToMany);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getManyToMany <em>Many To Many</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Many To Many</em>' containment reference.
   * @see #getManyToMany()
   * @generated
   */
  public void setManyToMany(ManyToMany newManyToMany) {
    if (newManyToMany != manyToMany) {
      NotificationChain msgs = null;
      if (manyToMany != null)
        msgs = ((InternalEObject)manyToMany).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_MANY, null, msgs);
      if (newManyToMany != null)
        msgs = ((InternalEObject)newManyToMany).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_MANY, null, msgs);
      msgs = basicSetManyToMany(newManyToMany, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_MANY, newManyToMany, newManyToMany));
  }

  /**
   * Returns the value of the '<em><b>Many To One</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many To One</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many To One</em>' containment reference.
   * @see #setManyToOne(ManyToOne)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_ManyToOne()
   * @model containment="true"
   * @generated
   */
  public ManyToOne getManyToOne() {
    return manyToOne;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetManyToOne(ManyToOne newManyToOne, NotificationChain msgs) {
    ManyToOne oldManyToOne = manyToOne;
    manyToOne = newManyToOne;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_ONE, oldManyToOne, newManyToOne);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getManyToOne <em>Many To One</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Many To One</em>' containment reference.
   * @see #getManyToOne()
   * @generated
   */
  public void setManyToOne(ManyToOne newManyToOne) {
    if (newManyToOne != manyToOne) {
      NotificationChain msgs = null;
      if (manyToOne != null)
        msgs = ((InternalEObject)manyToOne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_ONE, null, msgs);
      if (newManyToOne != null)
        msgs = ((InternalEObject)newManyToOne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_ONE, null, msgs);
      msgs = basicSetManyToOne(newManyToOne, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_ONE, newManyToOne, newManyToOne));
  }

  /**
   * Returns the value of the '<em><b>One To Many</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>One To Many</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>One To Many</em>' containment reference.
   * @see #setOneToMany(OneToMany)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_OneToMany()
   * @model containment="true"
   * @generated
   */
  public OneToMany getOneToMany() {
    return oneToMany;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOneToMany(OneToMany newOneToMany, NotificationChain msgs) {
    OneToMany oldOneToMany = oneToMany;
    oneToMany = newOneToMany;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_MANY, oldOneToMany, newOneToMany);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getOneToMany <em>One To Many</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>One To Many</em>' containment reference.
   * @see #getOneToMany()
   * @generated
   */
  public void setOneToMany(OneToMany newOneToMany) {
    if (newOneToMany != oneToMany) {
      NotificationChain msgs = null;
      if (oneToMany != null)
        msgs = ((InternalEObject)oneToMany).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_MANY, null, msgs);
      if (newOneToMany != null)
        msgs = ((InternalEObject)newOneToMany).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_MANY, null, msgs);
      msgs = basicSetOneToMany(newOneToMany, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_MANY, newOneToMany, newOneToMany));
  }

  /**
   * Returns the value of the '<em><b>One To One</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>One To One</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>One To One</em>' containment reference.
   * @see #setOneToOne(OneToOne)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_OneToOne()
   * @model containment="true"
   * @generated
   */
  public OneToOne getOneToOne() {
    return oneToOne;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOneToOne(OneToOne newOneToOne, NotificationChain msgs) {
    OneToOne oldOneToOne = oneToOne;
    oneToOne = newOneToOne;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_ONE, oldOneToOne, newOneToOne);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getOneToOne <em>One To One</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>One To One</em>' containment reference.
   * @see #getOneToOne()
   * @generated
   */
  public void setOneToOne(OneToOne newOneToOne) {
    if (newOneToOne != oneToOne) {
      NotificationChain msgs = null;
      if (oneToOne != null)
        msgs = ((InternalEObject)oneToOne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_ONE, null, msgs);
      if (newOneToOne != null)
        msgs = ((InternalEObject)newOneToOne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_ONE, null, msgs);
      msgs = basicSetOneToOne(newOneToOne, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_ONE, newOneToOne, newOneToOne));
  }

  /**
   * Returns the value of the '<em><b>Map Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Key</em>' containment reference.
   * @see #setMapKey(MapKey)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_MapKey()
   * @model containment="true"
   * @generated
   */
  public MapKey getMapKey() {
    return mapKey;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapKey(MapKey newMapKey, NotificationChain msgs) {
    MapKey oldMapKey = mapKey;
    mapKey = newMapKey;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY, oldMapKey, newMapKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getMapKey <em>Map Key</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Key</em>' containment reference.
   * @see #getMapKey()
   * @generated
   */
  public void setMapKey(MapKey newMapKey) {
    if (newMapKey != mapKey) {
      NotificationChain msgs = null;
      if (mapKey != null)
        msgs = ((InternalEObject)mapKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY, null, msgs);
      if (newMapKey != null)
        msgs = ((InternalEObject)newMapKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY, null, msgs);
      msgs = basicSetMapKey(newMapKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY, newMapKey, newMapKey));
  }

  /**
   * Returns the value of the '<em><b>Map Key Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Class</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Key Class</em>' containment reference.
   * @see #setMapKeyClass(MapKeyClass)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_MapKeyClass()
   * @model containment="true"
   * @generated
   */
  public MapKeyClass getMapKeyClass() {
    return mapKeyClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapKeyClass(MapKeyClass newMapKeyClass, NotificationChain msgs) {
    MapKeyClass oldMapKeyClass = mapKeyClass;
    mapKeyClass = newMapKeyClass;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_CLASS, oldMapKeyClass, newMapKeyClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getMapKeyClass <em>Map Key Class</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Key Class</em>' containment reference.
   * @see #getMapKeyClass()
   * @generated
   */
  public void setMapKeyClass(MapKeyClass newMapKeyClass) {
    if (newMapKeyClass != mapKeyClass) {
      NotificationChain msgs = null;
      if (mapKeyClass != null)
        msgs = ((InternalEObject)mapKeyClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_CLASS, null, msgs);
      if (newMapKeyClass != null)
        msgs = ((InternalEObject)newMapKeyClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_CLASS, null, msgs);
      msgs = basicSetMapKeyClass(newMapKeyClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_CLASS, newMapKeyClass, newMapKeyClass));
  }

  /**
   * Returns the value of the '<em><b>Map Key Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Column</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Key Column</em>' containment reference.
   * @see #setMapKeyColumn(MapKeyColumn)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_MapKeyColumn()
   * @model containment="true"
   * @generated
   */
  public MapKeyColumn getMapKeyColumn() {
    return mapKeyColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapKeyColumn(MapKeyColumn newMapKeyColumn, NotificationChain msgs) {
    MapKeyColumn oldMapKeyColumn = mapKeyColumn;
    mapKeyColumn = newMapKeyColumn;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_COLUMN, oldMapKeyColumn, newMapKeyColumn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getMapKeyColumn <em>Map Key Column</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Key Column</em>' containment reference.
   * @see #getMapKeyColumn()
   * @generated
   */
  public void setMapKeyColumn(MapKeyColumn newMapKeyColumn) {
    if (newMapKeyColumn != mapKeyColumn) {
      NotificationChain msgs = null;
      if (mapKeyColumn != null)
        msgs = ((InternalEObject)mapKeyColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_COLUMN, null, msgs);
      if (newMapKeyColumn != null)
        msgs = ((InternalEObject)newMapKeyColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_COLUMN, null, msgs);
      msgs = basicSetMapKeyColumn(newMapKeyColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_COLUMN, newMapKeyColumn, newMapKeyColumn));
  }

  /**
   * Returns the value of the '<em><b>Map Key Join Column</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Join Column</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Key Join Column</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_MapKeyJoinColumn()
   * @model containment="true"
   * @generated
   */
  public EList<MapKeyJoinColumn> getMapKeyJoinColumn() {
    if (mapKeyJoinColumn == null) {
      mapKeyJoinColumn = new EObjectContainmentEList<MapKeyJoinColumn>(MapKeyJoinColumn.class, this, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_JOIN_COLUMN);
    }
    return mapKeyJoinColumn;
  }

  /**
   * Returns the value of the '<em><b>Order By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order By</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order By</em>' attribute.
   * @see #setOrderBy(String)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_OrderBy()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.OrderBy"
   * @generated
   */
  public String getOrderBy() {
    return orderBy;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getOrderBy <em>Order By</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Order By</em>' attribute.
   * @see #getOrderBy()
   * @generated
   */
  public void setOrderBy(String newOrderBy) {
    String oldOrderBy = orderBy;
    orderBy = newOrderBy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ORDER_BY, oldOrderBy, orderBy));
  }

  /**
   * Returns the value of the '<em><b>Order Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order Column</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order Column</em>' containment reference.
   * @see #setOrderColumn(OrderColumn)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_OrderColumn()
   * @model containment="true"
   * @generated
   */
  public OrderColumn getOrderColumn() {
    return orderColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrderColumn(OrderColumn newOrderColumn, NotificationChain msgs) {
    OrderColumn oldOrderColumn = orderColumn;
    orderColumn = newOrderColumn;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ORDER_COLUMN, oldOrderColumn, newOrderColumn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getOrderColumn <em>Order Column</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Order Column</em>' containment reference.
   * @see #getOrderColumn()
   * @generated
   */
  public void setOrderColumn(OrderColumn newOrderColumn) {
    if (newOrderColumn != orderColumn) {
      NotificationChain msgs = null;
      if (orderColumn != null)
        msgs = ((InternalEObject)orderColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ORDER_COLUMN, null, msgs);
      if (newOrderColumn != null)
        msgs = ((InternalEObject)newOrderColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ORDER_COLUMN, null, msgs);
      msgs = basicSetOrderColumn(newOrderColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ORDER_COLUMN, newOrderColumn, newOrderColumn));
  }

  /**
   * Returns the value of the '<em><b>Basic Collection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic Collection</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic Collection</em>' containment reference.
   * @see #setBasicCollection(BasicCollection)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_BasicCollection()
   * @model containment="true"
   * @generated
   */
  public BasicCollection getBasicCollection() {
    return basicCollection;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasicCollection(BasicCollection newBasicCollection, NotificationChain msgs) {
    BasicCollection oldBasicCollection = basicCollection;
    basicCollection = newBasicCollection;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_COLLECTION, oldBasicCollection, newBasicCollection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getBasicCollection <em>Basic Collection</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic Collection</em>' containment reference.
   * @see #getBasicCollection()
   * @generated
   */
  public void setBasicCollection(BasicCollection newBasicCollection) {
    if (newBasicCollection != basicCollection) {
      NotificationChain msgs = null;
      if (basicCollection != null)
        msgs = ((InternalEObject)basicCollection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_COLLECTION, null, msgs);
      if (newBasicCollection != null)
        msgs = ((InternalEObject)newBasicCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_COLLECTION, null, msgs);
      msgs = basicSetBasicCollection(newBasicCollection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_COLLECTION, newBasicCollection, newBasicCollection));
  }

  /**
   * Returns the value of the '<em><b>Basic Map</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic Map</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic Map</em>' containment reference.
   * @see #setBasicMap(BasicMap)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEReferenceORMAnnotation_BasicMap()
   * @model containment="true"
   * @generated
   */
  public BasicMap getBasicMap() {
    return basicMap;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasicMap(BasicMap newBasicMap, NotificationChain msgs) {
    BasicMap oldBasicMap = basicMap;
    basicMap = newBasicMap;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_MAP, oldBasicMap, newBasicMap);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EReferenceORMAnnotation#getBasicMap <em>Basic Map</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic Map</em>' containment reference.
   * @see #getBasicMap()
   * @generated
   */
  public void setBasicMap(BasicMap newBasicMap) {
    if (newBasicMap != basicMap) {
      NotificationChain msgs = null;
      if (basicMap != null)
        msgs = ((InternalEObject)basicMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_MAP, null, msgs);
      if (newBasicMap != null)
        msgs = ((InternalEObject)newBasicMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_MAP, null, msgs);
      msgs = basicSetBasicMap(newBasicMap, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_MAP, newBasicMap, newBasicMap));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__TRANSIENT:
        return basicSetTransient(null, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__COLLECTION_TABLE:
        return basicSetCollectionTable(null, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ELEMENT_COLLECTION:
        return basicSetElementCollection(null, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED:
        return basicSetEmbedded(null, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED_ID:
        return basicSetEmbeddedId(null, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_COLUMN:
        return ((InternalEList<?>)getJoinColumn()).basicRemove(otherEnd, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_TABLE:
        return basicSetJoinTable(null, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_MANY:
        return basicSetManyToMany(null, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_ONE:
        return basicSetManyToOne(null, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_MANY:
        return basicSetOneToMany(null, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_ONE:
        return basicSetOneToOne(null, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY:
        return basicSetMapKey(null, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_CLASS:
        return basicSetMapKeyClass(null, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_COLUMN:
        return basicSetMapKeyColumn(null, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_JOIN_COLUMN:
        return ((InternalEList<?>)getMapKeyJoinColumn()).basicRemove(otherEnd, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ORDER_COLUMN:
        return basicSetOrderColumn(null, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_COLLECTION:
        return basicSetBasicCollection(null, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_MAP:
        return basicSetBasicMap(null, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ASSOCIATION_OVERRIDE:
        return ((InternalEList<?>)getAssociationOverride()).basicRemove(otherEnd, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ATTRIBUTE_OVERRIDE:
        return ((InternalEList<?>)getAttributeOverride()).basicRemove(otherEnd, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__PRIMARY_KEY_JOIN_COLUMN:
        return ((InternalEList<?>)getPrimaryKeyJoinColumn()).basicRemove(otherEnd, msgs);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC:
        return basicSetBasic(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__TRANSIENT:
        return getTransient();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__COLLECTION_TABLE:
        return getCollectionTable();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ELEMENT_COLLECTION:
        return getElementCollection();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED:
        return getEmbedded();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED_ID:
        return getEmbeddedId();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_COLUMN:
        return getJoinColumn();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_TABLE:
        return getJoinTable();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_MANY:
        return getManyToMany();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_ONE:
        return getManyToOne();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_MANY:
        return getOneToMany();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_ONE:
        return getOneToOne();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY:
        return getMapKey();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_CLASS:
        return getMapKeyClass();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_COLUMN:
        return getMapKeyColumn();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_JOIN_COLUMN:
        return getMapKeyJoinColumn();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ORDER_BY:
        return getOrderBy();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ORDER_COLUMN:
        return getOrderColumn();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_COLLECTION:
        return getBasicCollection();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_MAP:
        return getBasicMap();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ASSOCIATION_OVERRIDE:
        return getAssociationOverride();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ATTRIBUTE_OVERRIDE:
        return getAttributeOverride();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__PRIMARY_KEY_JOIN_COLUMN:
        return getPrimaryKeyJoinColumn();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC:
        return getBasic();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__TRANSIENT:
        setTransient((Transient)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__COLLECTION_TABLE:
        setCollectionTable((CollectionTable)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ELEMENT_COLLECTION:
        setElementCollection((ElementCollection)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED:
        setEmbedded((Embedded)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED_ID:
        setEmbeddedId((EmbeddedId)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_COLUMN:
        getJoinColumn().clear();
        getJoinColumn().addAll((Collection<? extends JoinColumn>)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_TABLE:
        setJoinTable((JoinTable)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_MANY:
        setManyToMany((ManyToMany)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_ONE:
        setManyToOne((ManyToOne)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_MANY:
        setOneToMany((OneToMany)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_ONE:
        setOneToOne((OneToOne)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY:
        setMapKey((MapKey)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_CLASS:
        setMapKeyClass((MapKeyClass)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_COLUMN:
        setMapKeyColumn((MapKeyColumn)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_JOIN_COLUMN:
        getMapKeyJoinColumn().clear();
        getMapKeyJoinColumn().addAll((Collection<? extends MapKeyJoinColumn>)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ORDER_BY:
        setOrderBy((String)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ORDER_COLUMN:
        setOrderColumn((OrderColumn)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_COLLECTION:
        setBasicCollection((BasicCollection)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_MAP:
        setBasicMap((BasicMap)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ASSOCIATION_OVERRIDE:
        getAssociationOverride().clear();
        getAssociationOverride().addAll((Collection<? extends AssociationOverride>)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ATTRIBUTE_OVERRIDE:
        getAttributeOverride().clear();
        getAttributeOverride().addAll((Collection<? extends AttributeOverride>)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__PRIMARY_KEY_JOIN_COLUMN:
        getPrimaryKeyJoinColumn().clear();
        getPrimaryKeyJoinColumn().addAll((Collection<? extends PrimaryKeyJoinColumn>)newValue);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC:
        setBasic((Basic)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__TRANSIENT:
        setTransient((Transient)null);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__COLLECTION_TABLE:
        setCollectionTable((CollectionTable)null);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ELEMENT_COLLECTION:
        setElementCollection((ElementCollection)null);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED:
        setEmbedded((Embedded)null);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED_ID:
        setEmbeddedId((EmbeddedId)null);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_COLUMN:
        getJoinColumn().clear();
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_TABLE:
        setJoinTable((JoinTable)null);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_MANY:
        setManyToMany((ManyToMany)null);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_ONE:
        setManyToOne((ManyToOne)null);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_MANY:
        setOneToMany((OneToMany)null);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_ONE:
        setOneToOne((OneToOne)null);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY:
        setMapKey((MapKey)null);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_CLASS:
        setMapKeyClass((MapKeyClass)null);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_COLUMN:
        setMapKeyColumn((MapKeyColumn)null);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_JOIN_COLUMN:
        getMapKeyJoinColumn().clear();
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ORDER_BY:
        setOrderBy(ORDER_BY_EDEFAULT);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ORDER_COLUMN:
        setOrderColumn((OrderColumn)null);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_COLLECTION:
        setBasicCollection((BasicCollection)null);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_MAP:
        setBasicMap((BasicMap)null);
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ASSOCIATION_OVERRIDE:
        unsetAssociationOverride();
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ATTRIBUTE_OVERRIDE:
        unsetAttributeOverride();
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__PRIMARY_KEY_JOIN_COLUMN:
        getPrimaryKeyJoinColumn().clear();
        return;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC:
        setBasic((Basic)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__TRANSIENT:
        return transient_ != null;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__COLLECTION_TABLE:
        return collectionTable != null;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ELEMENT_COLLECTION:
        return elementCollection != null;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED:
        return embedded != null;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__EMBEDDED_ID:
        return embeddedId != null;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_COLUMN:
        return joinColumn != null && !joinColumn.isEmpty();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__JOIN_TABLE:
        return joinTable != null;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_MANY:
        return manyToMany != null;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MANY_TO_ONE:
        return manyToOne != null;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_MANY:
        return oneToMany != null;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ONE_TO_ONE:
        return oneToOne != null;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY:
        return mapKey != null;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_CLASS:
        return mapKeyClass != null;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_COLUMN:
        return mapKeyColumn != null;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__MAP_KEY_JOIN_COLUMN:
        return mapKeyJoinColumn != null && !mapKeyJoinColumn.isEmpty();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ORDER_BY:
        return ORDER_BY_EDEFAULT == null ? orderBy != null : !ORDER_BY_EDEFAULT.equals(orderBy);
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ORDER_COLUMN:
        return orderColumn != null;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_COLLECTION:
        return basicCollection != null;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC_MAP:
        return basicMap != null;
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ASSOCIATION_OVERRIDE:
        return isSetAssociationOverride();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ATTRIBUTE_OVERRIDE:
        return isSetAttributeOverride();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__PRIMARY_KEY_JOIN_COLUMN:
        return primaryKeyJoinColumn != null && !primaryKeyJoinColumn.isEmpty();
      case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__BASIC:
        return basic != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == ENamedElementORMAnnotation.class) {
      switch (derivedFeatureID) {
        default: return -1;
      }
    }
    if (baseClass == ETypeElementORMAnnotation.class) {
      switch (derivedFeatureID) {
        case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__TRANSIENT: return OrmannotationsPackage.ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT;
        default: return -1;
      }
    }
    if (baseClass == EStructuralFeatureORMAnnotation.class) {
      switch (derivedFeatureID) {
        case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__COLLECTION_TABLE: return OrmannotationsPackage.ESTRUCTURAL_FEATURE_ORM_ANNOTATION__COLLECTION_TABLE;
        case OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ELEMENT_COLLECTION: return OrmannotationsPackage.ESTRUCTURAL_FEATURE_ORM_ANNOTATION__ELEMENT_COLLECTION;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == ENamedElementORMAnnotation.class) {
      switch (baseFeatureID) {
        default: return -1;
      }
    }
    if (baseClass == ETypeElementORMAnnotation.class) {
      switch (baseFeatureID) {
        case OrmannotationsPackage.ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT: return OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__TRANSIENT;
        default: return -1;
      }
    }
    if (baseClass == EStructuralFeatureORMAnnotation.class) {
      switch (baseFeatureID) {
        case OrmannotationsPackage.ESTRUCTURAL_FEATURE_ORM_ANNOTATION__COLLECTION_TABLE: return OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__COLLECTION_TABLE;
        case OrmannotationsPackage.ESTRUCTURAL_FEATURE_ORM_ANNOTATION__ELEMENT_COLLECTION: return OrmannotationsPackage.EREFERENCE_ORM_ANNOTATION__ELEMENT_COLLECTION;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (orderBy: "); //$NON-NLS-1$
    result.append(orderBy);
    result.append(')');
    return result.toString();
  }

  @Override
  public String getJavaAnnotation(AnnotationProvider annotationProvider, String identifier) {

    if (FeatureMapUtil.isFeatureMap(getEStructuralFeature())) {
      return ""; //$NON-NLS-1$
    }

    final EPackageORMAnnotation ePackageORMAnnotation = (EPackageORMAnnotation) annotationProvider.getAnnotation(
        getEStructuralFeature().getEContainingClass().getEPackage(), OrmannotationsPackage.eNS_URI);
    if (!ePackageORMAnnotation.isGenerateJavaAnnotations()) {
      return ""; //$NON-NLS-1$
    }
    return ORMGenerator.generateJavaAnnotations(this, null, null, identifier);
  }

  @Override
  public boolean isValidForContext(ENamedElement eNamedElement) {
    return ORMUtils.isValidForContext(eNamedElement);
  }

} // EReferenceORMAnnotation
