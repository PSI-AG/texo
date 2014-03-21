/**
 * <copyright>
 * </copyright>
 *
 * $Id: EClassORMAnnotation.java,v 1.8 2011/10/25 13:25:24 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.texo.annotations.AnnotationProvider;
import org.eclipse.emf.texo.annotations.annotationsmodel.EClassAnnotation;
import org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable;
import org.eclipse.emf.texo.orm.annotations.model.orm.Entity;
import org.eclipse.emf.texo.orm.annotations.model.orm.Inheritance;
import org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass;
import org.eclipse.emf.texo.orm.annotations.model.orm.Transient;
import org.eclipse.emf.texo.orm.annotator.ORMGenerator;
import org.eclipse.emf.texo.orm.annotator.ORMUtils;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EClass ORM Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getEmbeddable <em>Embeddable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getMappedSuperclass <em>Mapped Superclass</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getInheritance <em>Inheritance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEClassORMAnnotation()
 * @model kind="class"
 * @generated
 */
public class EClassORMAnnotation extends EClassAnnotation implements EClassifierORMAnnotation {
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
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected Entity entity;

  /**
   * The cached value of the '{@link #getEmbeddable() <em>Embeddable</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getEmbeddable()
   * @generated
   * @ordered
   */
  protected Embeddable embeddable;

  /**
   * The cached value of the '{@link #getMappedSuperclass() <em>Mapped Superclass</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getMappedSuperclass()
   * @generated
   * @ordered
   */
  protected MappedSuperclass mappedSuperclass;

  /**
   * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getInheritance()
   * @generated
   * @ordered
   */
  protected Inheritance inheritance;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected EClassORMAnnotation() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmannotationsPackage.Literals.ECLASS_ORM_ANNOTATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.ECLASS_ORM_ANNOTATION__TRANSIENT, oldTransient, newTransient);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getTransient <em>Transient</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Transient</em>' containment reference.
   * @see #getTransient()
   * @generated
   */
  public void setTransient(Transient newTransient) {
    if (newTransient != transient_) {
      NotificationChain msgs = null;
      if (transient_ != null)
        msgs = ((InternalEObject)transient_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.ECLASS_ORM_ANNOTATION__TRANSIENT, null, msgs);
      if (newTransient != null)
        msgs = ((InternalEObject)newTransient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.ECLASS_ORM_ANNOTATION__TRANSIENT, null, msgs);
      msgs = basicSetTransient(newTransient, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.ECLASS_ORM_ANNOTATION__TRANSIENT, newTransient, newTransient));
  }

  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(Entity)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEClassORMAnnotation_Entity()
   * @model containment="true"
   * @generated
   */
  public Entity getEntity() {
    return entity;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
    Entity oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.ECLASS_ORM_ANNOTATION__ENTITY, oldEntity, newEntity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  public void setEntity(Entity newEntity) {
    if (newEntity != entity) {
      NotificationChain msgs = null;
      if (entity != null)
        msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.ECLASS_ORM_ANNOTATION__ENTITY, null, msgs);
      if (newEntity != null)
        msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.ECLASS_ORM_ANNOTATION__ENTITY, null, msgs);
      msgs = basicSetEntity(newEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.ECLASS_ORM_ANNOTATION__ENTITY, newEntity, newEntity));
  }

  /**
   * Returns the value of the '<em><b>Embeddable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Embeddable</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Embeddable</em>' containment reference.
   * @see #setEmbeddable(Embeddable)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEClassORMAnnotation_Embeddable()
   * @model containment="true"
   * @generated
   */
  public Embeddable getEmbeddable() {
    return embeddable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEmbeddable(Embeddable newEmbeddable, NotificationChain msgs) {
    Embeddable oldEmbeddable = embeddable;
    embeddable = newEmbeddable;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.ECLASS_ORM_ANNOTATION__EMBEDDABLE, oldEmbeddable, newEmbeddable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getEmbeddable <em>Embeddable</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Embeddable</em>' containment reference.
   * @see #getEmbeddable()
   * @generated
   */
  public void setEmbeddable(Embeddable newEmbeddable) {
    if (newEmbeddable != embeddable) {
      NotificationChain msgs = null;
      if (embeddable != null)
        msgs = ((InternalEObject)embeddable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.ECLASS_ORM_ANNOTATION__EMBEDDABLE, null, msgs);
      if (newEmbeddable != null)
        msgs = ((InternalEObject)newEmbeddable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.ECLASS_ORM_ANNOTATION__EMBEDDABLE, null, msgs);
      msgs = basicSetEmbeddable(newEmbeddable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.ECLASS_ORM_ANNOTATION__EMBEDDABLE, newEmbeddable, newEmbeddable));
  }

  /**
   * Returns the value of the '<em><b>Mapped Superclass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped Superclass</em>' containment reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped Superclass</em>' containment reference.
   * @see #setMappedSuperclass(MappedSuperclass)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEClassORMAnnotation_MappedSuperclass()
   * @model containment="true"
   * @generated
   */
  public MappedSuperclass getMappedSuperclass() {
    return mappedSuperclass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMappedSuperclass(MappedSuperclass newMappedSuperclass, NotificationChain msgs) {
    MappedSuperclass oldMappedSuperclass = mappedSuperclass;
    mappedSuperclass = newMappedSuperclass;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.ECLASS_ORM_ANNOTATION__MAPPED_SUPERCLASS, oldMappedSuperclass, newMappedSuperclass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getMappedSuperclass <em>Mapped Superclass</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped Superclass</em>' containment reference.
   * @see #getMappedSuperclass()
   * @generated
   */
  public void setMappedSuperclass(MappedSuperclass newMappedSuperclass) {
    if (newMappedSuperclass != mappedSuperclass) {
      NotificationChain msgs = null;
      if (mappedSuperclass != null)
        msgs = ((InternalEObject)mappedSuperclass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.ECLASS_ORM_ANNOTATION__MAPPED_SUPERCLASS, null, msgs);
      if (newMappedSuperclass != null)
        msgs = ((InternalEObject)newMappedSuperclass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.ECLASS_ORM_ANNOTATION__MAPPED_SUPERCLASS, null, msgs);
      msgs = basicSetMappedSuperclass(newMappedSuperclass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.ECLASS_ORM_ANNOTATION__MAPPED_SUPERCLASS, newMappedSuperclass, newMappedSuperclass));
  }

  /**
   * Returns the value of the '<em><b>Inheritance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inheritance</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inheritance</em>' containment reference.
   * @see #setInheritance(Inheritance)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEClassORMAnnotation_Inheritance()
   * @model containment="true"
   * @generated
   */
  public Inheritance getInheritance() {
    return inheritance;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInheritance(Inheritance newInheritance, NotificationChain msgs) {
    Inheritance oldInheritance = inheritance;
    inheritance = newInheritance;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.ECLASS_ORM_ANNOTATION__INHERITANCE, oldInheritance, newInheritance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EClassORMAnnotation#getInheritance <em>Inheritance</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Inheritance</em>' containment reference.
   * @see #getInheritance()
   * @generated
   */
  public void setInheritance(Inheritance newInheritance) {
    if (newInheritance != inheritance) {
      NotificationChain msgs = null;
      if (inheritance != null)
        msgs = ((InternalEObject)inheritance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.ECLASS_ORM_ANNOTATION__INHERITANCE, null, msgs);
      if (newInheritance != null)
        msgs = ((InternalEObject)newInheritance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.ECLASS_ORM_ANNOTATION__INHERITANCE, null, msgs);
      msgs = basicSetInheritance(newInheritance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.ECLASS_ORM_ANNOTATION__INHERITANCE, newInheritance, newInheritance));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__TRANSIENT:
        return basicSetTransient(null, msgs);
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__ENTITY:
        return basicSetEntity(null, msgs);
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__EMBEDDABLE:
        return basicSetEmbeddable(null, msgs);
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__MAPPED_SUPERCLASS:
        return basicSetMappedSuperclass(null, msgs);
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__INHERITANCE:
        return basicSetInheritance(null, msgs);
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
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__TRANSIENT:
        return getTransient();
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__ENTITY:
        return getEntity();
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__EMBEDDABLE:
        return getEmbeddable();
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__MAPPED_SUPERCLASS:
        return getMappedSuperclass();
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__INHERITANCE:
        return getInheritance();
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
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__TRANSIENT:
        setTransient((Transient)newValue);
        return;
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__ENTITY:
        setEntity((Entity)newValue);
        return;
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__EMBEDDABLE:
        setEmbeddable((Embeddable)newValue);
        return;
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__MAPPED_SUPERCLASS:
        setMappedSuperclass((MappedSuperclass)newValue);
        return;
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__INHERITANCE:
        setInheritance((Inheritance)newValue);
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
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__TRANSIENT:
        setTransient((Transient)null);
        return;
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__ENTITY:
        setEntity((Entity)null);
        return;
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__EMBEDDABLE:
        setEmbeddable((Embeddable)null);
        return;
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__MAPPED_SUPERCLASS:
        setMappedSuperclass((MappedSuperclass)null);
        return;
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__INHERITANCE:
        setInheritance((Inheritance)null);
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
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__TRANSIENT:
        return transient_ != null;
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__ENTITY:
        return entity != null;
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__EMBEDDABLE:
        return embeddable != null;
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__MAPPED_SUPERCLASS:
        return mappedSuperclass != null;
      case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__INHERITANCE:
        return inheritance != null;
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
        case OrmannotationsPackage.ECLASS_ORM_ANNOTATION__TRANSIENT: return OrmannotationsPackage.ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT;
        default: return -1;
      }
    }
    if (baseClass == EClassifierORMAnnotation.class) {
      switch (derivedFeatureID) {
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
        case OrmannotationsPackage.ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT: return OrmannotationsPackage.ECLASS_ORM_ANNOTATION__TRANSIENT;
        default: return -1;
      }
    }
    if (baseClass == EClassifierORMAnnotation.class) {
      switch (baseFeatureID) {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  @Override
  public String getJavaAnnotation(AnnotationProvider annotationProvider, String identifier) {
    if (ExtendedMetaData.INSTANCE.isDocumentRoot(this.getEClass())) {
      return ""; //$NON-NLS-1$
    }

    final EPackageORMAnnotation ePackageORMAnnotation = (EPackageORMAnnotation) annotationProvider.getAnnotation(
        getEClass().getEPackage(), OrmannotationsPackage.eNS_URI);
    if (!ePackageORMAnnotation.isGenerateJavaAnnotations()) {
      return ""; //$NON-NLS-1$
    }
    return ORMGenerator.generateJavaAnnotations(this, null, null, identifier);
  }

  @Override
  public boolean isValidForContext(ENamedElement eNamedElement) {
    return ORMUtils.isValidForContext(eNamedElement);
  }

} // EClassORMAnnotation
