/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAttributeORMAnnotation.java,v 1.12 2011/10/25 22:27:57 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.texo.annotations.AnnotationProvider;
import org.eclipse.emf.texo.annotations.annotationsmodel.EAttributeAnnotation;
import org.eclipse.emf.texo.generator.GeneratorConstants;
import org.eclipse.emf.texo.orm.annotations.model.orm.Basic;
import org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection;
import org.eclipse.emf.texo.orm.annotations.model.orm.Entity;
import org.eclipse.emf.texo.orm.annotations.model.orm.Id;
import org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne;
import org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany;
import org.eclipse.emf.texo.orm.annotations.model.orm.Transient;
import org.eclipse.emf.texo.orm.annotations.model.orm.Version;
import org.eclipse.emf.texo.orm.annotator.ORMGenerator;
import org.eclipse.emf.texo.orm.annotator.ORMUtils;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EAttribute ORM Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getOneToMany <em>One To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getFeatureMapEntity <em>Feature Map Entity</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getManyToOne <em>Many To One</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEAttributeORMAnnotation()
 * @model kind="class"
 * @generated
 */
public class EAttributeORMAnnotation extends EAttributeAnnotation implements EStructuralFeatureORMAnnotation {
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
   * The cached value of the '{@link #getBasic() <em>Basic</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getBasic()
   * @generated
   * @ordered
   */
  protected Basic basic;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected Id id;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected Version version;

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
   * The cached value of the '{@link #getFeatureMapEntity() <em>Feature Map Entity</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getFeatureMapEntity()
   * @generated
   * @ordered
   */
  protected Entity featureMapEntity;

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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected EAttributeORMAnnotation() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmannotationsPackage.Literals.EATTRIBUTE_ORM_ANNOTATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__TRANSIENT, oldTransient, newTransient);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getTransient <em>Transient</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Transient</em>' containment reference.
   * @see #getTransient()
   * @generated
   */
  public void setTransient(Transient newTransient) {
    if (newTransient != transient_) {
      NotificationChain msgs = null;
      if (transient_ != null)
        msgs = ((InternalEObject)transient_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__TRANSIENT, null, msgs);
      if (newTransient != null)
        msgs = ((InternalEObject)newTransient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__TRANSIENT, null, msgs);
      msgs = basicSetTransient(newTransient, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__TRANSIENT, newTransient, newTransient));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__COLLECTION_TABLE, oldCollectionTable, newCollectionTable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getCollectionTable <em>Collection Table</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection Table</em>' containment reference.
   * @see #getCollectionTable()
   * @generated
   */
  public void setCollectionTable(CollectionTable newCollectionTable) {
    if (newCollectionTable != collectionTable) {
      NotificationChain msgs = null;
      if (collectionTable != null)
        msgs = ((InternalEObject)collectionTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__COLLECTION_TABLE, null, msgs);
      if (newCollectionTable != null)
        msgs = ((InternalEObject)newCollectionTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__COLLECTION_TABLE, null, msgs);
      msgs = basicSetCollectionTable(newCollectionTable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__COLLECTION_TABLE, newCollectionTable, newCollectionTable));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ELEMENT_COLLECTION, oldElementCollection, newElementCollection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getElementCollection <em>Element Collection</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Collection</em>' containment reference.
   * @see #getElementCollection()
   * @generated
   */
  public void setElementCollection(ElementCollection newElementCollection) {
    if (newElementCollection != elementCollection) {
      NotificationChain msgs = null;
      if (elementCollection != null)
        msgs = ((InternalEObject)elementCollection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ELEMENT_COLLECTION, null, msgs);
      if (newElementCollection != null)
        msgs = ((InternalEObject)newElementCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ELEMENT_COLLECTION, null, msgs);
      msgs = basicSetElementCollection(newElementCollection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ELEMENT_COLLECTION, newElementCollection, newElementCollection));
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
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEAttributeORMAnnotation_Basic()
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__BASIC, oldBasic, newBasic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getBasic <em>Basic</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic</em>' containment reference.
   * @see #getBasic()
   * @generated
   */
  public void setBasic(Basic newBasic) {
    if (newBasic != basic) {
      NotificationChain msgs = null;
      if (basic != null)
        msgs = ((InternalEObject)basic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__BASIC, null, msgs);
      if (newBasic != null)
        msgs = ((InternalEObject)newBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__BASIC, null, msgs);
      msgs = basicSetBasic(newBasic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__BASIC, newBasic, newBasic));
  }

  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(Id)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEAttributeORMAnnotation_Id()
   * @model containment="true"
   * @generated
   */
  public Id getId() {
    return id;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetId(Id newId, NotificationChain msgs) {
    Id oldId = id;
    id = newId;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ID, oldId, newId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  public void setId(Id newId) {
    if (newId != id) {
      NotificationChain msgs = null;
      if (id != null)
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ID, newId, newId));
  }

  /**
   * Returns the value of the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' containment reference.
   * @see #setVersion(Version)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEAttributeORMAnnotation_Version()
   * @model containment="true"
   * @generated
   */
  public Version getVersion() {
    return version;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVersion(Version newVersion, NotificationChain msgs) {
    Version oldVersion = version;
    version = newVersion;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__VERSION, oldVersion, newVersion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getVersion <em>Version</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' containment reference.
   * @see #getVersion()
   * @generated
   */
  public void setVersion(Version newVersion) {
    if (newVersion != version) {
      NotificationChain msgs = null;
      if (version != null)
        msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__VERSION, null, msgs);
      if (newVersion != null)
        msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__VERSION, null, msgs);
      msgs = basicSetVersion(newVersion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__VERSION, newVersion, newVersion));
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
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEAttributeORMAnnotation_OneToMany()
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ONE_TO_MANY, oldOneToMany, newOneToMany);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getOneToMany <em>One To Many</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>One To Many</em>' containment reference.
   * @see #getOneToMany()
   * @generated
   */
  public void setOneToMany(OneToMany newOneToMany) {
    if (newOneToMany != oneToMany) {
      NotificationChain msgs = null;
      if (oneToMany != null)
        msgs = ((InternalEObject)oneToMany).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ONE_TO_MANY, null, msgs);
      if (newOneToMany != null)
        msgs = ((InternalEObject)newOneToMany).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ONE_TO_MANY, null, msgs);
      msgs = basicSetOneToMany(newOneToMany, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ONE_TO_MANY, newOneToMany, newOneToMany));
  }

  /**
   * Returns the value of the '<em><b>Feature Map Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Map Entity</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Map Entity</em>' containment reference.
   * @see #setFeatureMapEntity(Entity)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEAttributeORMAnnotation_FeatureMapEntity()
   * @model containment="true"
   * @generated
   */
  public Entity getFeatureMapEntity() {
    return featureMapEntity;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeatureMapEntity(Entity newFeatureMapEntity, NotificationChain msgs) {
    Entity oldFeatureMapEntity = featureMapEntity;
    featureMapEntity = newFeatureMapEntity;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__FEATURE_MAP_ENTITY, oldFeatureMapEntity, newFeatureMapEntity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getFeatureMapEntity <em>Feature Map Entity</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Map Entity</em>' containment reference.
   * @see #getFeatureMapEntity()
   * @generated
   */
  public void setFeatureMapEntity(Entity newFeatureMapEntity) {
    if (newFeatureMapEntity != featureMapEntity) {
      NotificationChain msgs = null;
      if (featureMapEntity != null)
        msgs = ((InternalEObject)featureMapEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__FEATURE_MAP_ENTITY, null, msgs);
      if (newFeatureMapEntity != null)
        msgs = ((InternalEObject)newFeatureMapEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__FEATURE_MAP_ENTITY, null, msgs);
      msgs = basicSetFeatureMapEntity(newFeatureMapEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__FEATURE_MAP_ENTITY, newFeatureMapEntity, newFeatureMapEntity));
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
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEAttributeORMAnnotation_ManyToOne()
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__MANY_TO_ONE, oldManyToOne, newManyToOne);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation#getManyToOne <em>Many To One</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Many To One</em>' containment reference.
   * @see #getManyToOne()
   * @generated
   */
  public void setManyToOne(ManyToOne newManyToOne) {
    if (newManyToOne != manyToOne) {
      NotificationChain msgs = null;
      if (manyToOne != null)
        msgs = ((InternalEObject)manyToOne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__MANY_TO_ONE, null, msgs);
      if (newManyToOne != null)
        msgs = ((InternalEObject)newManyToOne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__MANY_TO_ONE, null, msgs);
      msgs = basicSetManyToOne(newManyToOne, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__MANY_TO_ONE, newManyToOne, newManyToOne));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__TRANSIENT:
        return basicSetTransient(null, msgs);
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__COLLECTION_TABLE:
        return basicSetCollectionTable(null, msgs);
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ELEMENT_COLLECTION:
        return basicSetElementCollection(null, msgs);
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__BASIC:
        return basicSetBasic(null, msgs);
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ID:
        return basicSetId(null, msgs);
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__VERSION:
        return basicSetVersion(null, msgs);
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ONE_TO_MANY:
        return basicSetOneToMany(null, msgs);
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__FEATURE_MAP_ENTITY:
        return basicSetFeatureMapEntity(null, msgs);
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__MANY_TO_ONE:
        return basicSetManyToOne(null, msgs);
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
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__TRANSIENT:
        return getTransient();
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__COLLECTION_TABLE:
        return getCollectionTable();
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ELEMENT_COLLECTION:
        return getElementCollection();
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__BASIC:
        return getBasic();
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ID:
        return getId();
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__VERSION:
        return getVersion();
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ONE_TO_MANY:
        return getOneToMany();
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__FEATURE_MAP_ENTITY:
        return getFeatureMapEntity();
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__MANY_TO_ONE:
        return getManyToOne();
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
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__TRANSIENT:
        setTransient((Transient)newValue);
        return;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__COLLECTION_TABLE:
        setCollectionTable((CollectionTable)newValue);
        return;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ELEMENT_COLLECTION:
        setElementCollection((ElementCollection)newValue);
        return;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__BASIC:
        setBasic((Basic)newValue);
        return;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ID:
        setId((Id)newValue);
        return;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__VERSION:
        setVersion((Version)newValue);
        return;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ONE_TO_MANY:
        setOneToMany((OneToMany)newValue);
        return;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__FEATURE_MAP_ENTITY:
        setFeatureMapEntity((Entity)newValue);
        return;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__MANY_TO_ONE:
        setManyToOne((ManyToOne)newValue);
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
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__TRANSIENT:
        setTransient((Transient)null);
        return;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__COLLECTION_TABLE:
        setCollectionTable((CollectionTable)null);
        return;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ELEMENT_COLLECTION:
        setElementCollection((ElementCollection)null);
        return;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__BASIC:
        setBasic((Basic)null);
        return;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ID:
        setId((Id)null);
        return;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__VERSION:
        setVersion((Version)null);
        return;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ONE_TO_MANY:
        setOneToMany((OneToMany)null);
        return;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__FEATURE_MAP_ENTITY:
        setFeatureMapEntity((Entity)null);
        return;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__MANY_TO_ONE:
        setManyToOne((ManyToOne)null);
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
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__TRANSIENT:
        return transient_ != null;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__COLLECTION_TABLE:
        return collectionTable != null;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ELEMENT_COLLECTION:
        return elementCollection != null;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__BASIC:
        return basic != null;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ID:
        return id != null;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__VERSION:
        return version != null;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ONE_TO_MANY:
        return oneToMany != null;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__FEATURE_MAP_ENTITY:
        return featureMapEntity != null;
      case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__MANY_TO_ONE:
        return manyToOne != null;
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
        case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__TRANSIENT: return OrmannotationsPackage.ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT;
        default: return -1;
      }
    }
    if (baseClass == EStructuralFeatureORMAnnotation.class) {
      switch (derivedFeatureID) {
        case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__COLLECTION_TABLE: return OrmannotationsPackage.ESTRUCTURAL_FEATURE_ORM_ANNOTATION__COLLECTION_TABLE;
        case OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ELEMENT_COLLECTION: return OrmannotationsPackage.ESTRUCTURAL_FEATURE_ORM_ANNOTATION__ELEMENT_COLLECTION;
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
        case OrmannotationsPackage.ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT: return OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__TRANSIENT;
        default: return -1;
      }
    }
    if (baseClass == EStructuralFeatureORMAnnotation.class) {
      switch (baseFeatureID) {
        case OrmannotationsPackage.ESTRUCTURAL_FEATURE_ORM_ANNOTATION__COLLECTION_TABLE: return OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__COLLECTION_TABLE;
        case OrmannotationsPackage.ESTRUCTURAL_FEATURE_ORM_ANNOTATION__ELEMENT_COLLECTION: return OrmannotationsPackage.EATTRIBUTE_ORM_ANNOTATION__ELEMENT_COLLECTION;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  @Override
  public String getJavaAnnotation(AnnotationProvider annotationProvider, String identifier) {
    final List<EReference> typeAnnotation = new ArrayList<EReference>();

    if (FeatureMapUtil.isFeatureMap(getEStructuralFeature())) {
      if (identifier.equals("featureMap.feature")) {
        return "@javax.persistence.Basic @javax.persistence.Enumerated(javax.persistence.EnumType.STRING)";
      }
      if (identifier.equals("featureMap.cdata") || identifier.equals("featureMap.text")
          || identifier.equals("featureMap.comment")) {
        return "@javax.persistence.Basic(optional=true) @javax.persistence.Lob";
      }
    }

    // never set on setters
    if (identifier.equals(GeneratorConstants.SETTER) || identifier.equals(GeneratorConstants.FEATUREMAP_SETTER)) {
      return "";
    }

    final EStructuralFeature eFeature = getEStructuralFeature();

    // if (FeatureMapUtil.isFeatureMap(getEStructuralFeature())) {
    //      return ""; //$NON-NLS-1$
    // }
    // only annotate fields
    //    if (!identifier.equals("field")) { //$NON-NLS-1$
    //      return ""; //$NON-NLS-1$
    // }
    final EPackageORMAnnotation ePackageORMAnnotation = (EPackageORMAnnotation) annotationProvider.getAnnotation(
        getEStructuralFeature().getEContainingClass().getEPackage(), OrmannotationsPackage.eNS_URI);
    if (!ePackageORMAnnotation.isGenerateJavaAnnotations()) {
      return ""; //$NON-NLS-1$
    }

    typeAnnotation.add(OrmannotationsPackage.eINSTANCE.getEAttributeORMAnnotation_FeatureMapEntity());

    if (identifier.equals(GeneratorConstants.FEATUREMAP_TYPE)) {
      // only export the entity one
      return ORMGenerator.generateJavaAnnotations(this, typeAnnotation, null, identifier);
    }

    return ORMGenerator.generateJavaAnnotations(this, null, typeAnnotation, identifier);
  }

  @Override
  public boolean isValidForContext(ENamedElement eNamedElement) {
    return ORMUtils.isValidForContext(eNamedElement);
  }

} // EAttributeORMAnnotation
