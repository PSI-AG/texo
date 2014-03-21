/**
 * <copyright>
 * </copyright>
 *
 * $Id: EDataTypeORMAnnotation.java,v 1.8 2011/09/23 21:00:40 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation;
import org.eclipse.emf.texo.orm.annotations.model.orm.Basic;
import org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection;
import org.eclipse.emf.texo.orm.annotations.model.orm.Id;
import org.eclipse.emf.texo.orm.annotations.model.orm.Transient;
import org.eclipse.emf.texo.orm.annotations.model.orm.Version;
import org.eclipse.emf.texo.orm.annotator.ORMUtils;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EData Type ORM Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getElementCollection <em>Element Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEDataTypeORMAnnotation()
 * @model kind="class"
 * @generated
 */
public class EDataTypeORMAnnotation extends EDataTypeAnnotation implements EDataTypeORMAnnotationDefinition {
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
   * The cached value of the '{@link #getVersion() <em>Version</em>}' reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected Version version;
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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected EDataTypeORMAnnotation() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmannotationsPackage.Literals.EDATA_TYPE_ORM_ANNOTATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__TRANSIENT, oldTransient, newTransient);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getTransient <em>Transient</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Transient</em>' containment reference.
   * @see #getTransient()
   * @generated
   */
  public void setTransient(Transient newTransient) {
    if (newTransient != transient_) {
      NotificationChain msgs = null;
      if (transient_ != null)
        msgs = ((InternalEObject)transient_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__TRANSIENT, null, msgs);
      if (newTransient != null)
        msgs = ((InternalEObject)newTransient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__TRANSIENT, null, msgs);
      msgs = basicSetTransient(newTransient, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__TRANSIENT, newTransient, newTransient));
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
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEDataTypeORMAnnotation_Basic()
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__BASIC, oldBasic, newBasic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getBasic <em>Basic</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic</em>' containment reference.
   * @see #getBasic()
   * @generated
   */
  public void setBasic(Basic newBasic) {
    if (newBasic != basic) {
      NotificationChain msgs = null;
      if (basic != null)
        msgs = ((InternalEObject)basic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__BASIC, null, msgs);
      if (newBasic != null)
        msgs = ((InternalEObject)newBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__BASIC, null, msgs);
      msgs = basicSetBasic(newBasic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__BASIC, newBasic, newBasic));
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
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEDataTypeORMAnnotation_Id()
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ID, oldId, newId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  public void setId(Id newId) {
    if (newId != id) {
      NotificationChain msgs = null;
      if (id != null)
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ID, newId, newId));
  }

  /**
   * Returns the value of the '<em><b>Version</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' reference.
   * @see #setVersion(Version)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEDataTypeORMAnnotation_Version()
   * @model
   * @generated
   */
  public Version getVersion() {
    if (version != null && ((EObject)version).eIsProxy()) {
      InternalEObject oldVersion = (InternalEObject)version;
      version = (Version)eResolveProxy(oldVersion);
      if (version != oldVersion) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__VERSION, oldVersion, version));
      }
    }
    return version;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Version basicGetVersion() {
    return version;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getVersion <em>Version</em>}' reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' reference.
   * @see #getVersion()
   * @generated
   */
  public void setVersion(Version newVersion) {
    Version oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__VERSION, oldVersion, version));
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
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEDataTypeORMAnnotation_ElementCollection()
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ELEMENT_COLLECTION, oldElementCollection, newElementCollection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation#getElementCollection <em>Element Collection</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Collection</em>' containment reference.
   * @see #getElementCollection()
   * @generated
   */
  public void setElementCollection(ElementCollection newElementCollection) {
    if (newElementCollection != elementCollection) {
      NotificationChain msgs = null;
      if (elementCollection != null)
        msgs = ((InternalEObject)elementCollection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ELEMENT_COLLECTION, null, msgs);
      if (newElementCollection != null)
        msgs = ((InternalEObject)newElementCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ELEMENT_COLLECTION, null, msgs);
      msgs = basicSetElementCollection(newElementCollection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ELEMENT_COLLECTION, newElementCollection, newElementCollection));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__TRANSIENT:
        return basicSetTransient(null, msgs);
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__BASIC:
        return basicSetBasic(null, msgs);
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ID:
        return basicSetId(null, msgs);
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ELEMENT_COLLECTION:
        return basicSetElementCollection(null, msgs);
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
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__TRANSIENT:
        return getTransient();
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__BASIC:
        return getBasic();
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ID:
        return getId();
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__VERSION:
        if (resolve) return getVersion();
        return basicGetVersion();
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ELEMENT_COLLECTION:
        return getElementCollection();
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
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__TRANSIENT:
        setTransient((Transient)newValue);
        return;
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__BASIC:
        setBasic((Basic)newValue);
        return;
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ID:
        setId((Id)newValue);
        return;
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__VERSION:
        setVersion((Version)newValue);
        return;
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ELEMENT_COLLECTION:
        setElementCollection((ElementCollection)newValue);
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
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__TRANSIENT:
        setTransient((Transient)null);
        return;
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__BASIC:
        setBasic((Basic)null);
        return;
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ID:
        setId((Id)null);
        return;
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__VERSION:
        setVersion((Version)null);
        return;
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ELEMENT_COLLECTION:
        setElementCollection((ElementCollection)null);
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
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__TRANSIENT:
        return transient_ != null;
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__BASIC:
        return basic != null;
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ID:
        return id != null;
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__VERSION:
        return version != null;
      case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__ELEMENT_COLLECTION:
        return elementCollection != null;
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
        case OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__TRANSIENT: return OrmannotationsPackage.ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT;
        default: return -1;
      }
    }
    if (baseClass == EClassifierORMAnnotation.class) {
      switch (derivedFeatureID) {
        default: return -1;
      }
    }
    if (baseClass == EDataTypeORMAnnotationDefinition.class) {
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
        case OrmannotationsPackage.ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT: return OrmannotationsPackage.EDATA_TYPE_ORM_ANNOTATION__TRANSIENT;
        default: return -1;
      }
    }
    if (baseClass == EClassifierORMAnnotation.class) {
      switch (baseFeatureID) {
        default: return -1;
      }
    }
    if (baseClass == EDataTypeORMAnnotationDefinition.class) {
      switch (baseFeatureID) {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  @Override
  public boolean isValidForContext(ENamedElement eNamedElement) {
    return ORMUtils.isValidForContext(eNamedElement);
  }

} // EDataTypeORMAnnotation
