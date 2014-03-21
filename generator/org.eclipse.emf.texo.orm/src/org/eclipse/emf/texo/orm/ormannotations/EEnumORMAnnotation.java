/**
 * <copyright>
 * </copyright>
 *
 * $Id: EEnumORMAnnotation.java,v 1.10 2011/09/23 21:00:40 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.ormannotations;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.EDataTypeAnnotation;
import org.eclipse.emf.texo.annotations.annotationsmodel.EEnumAnnotation;
import org.eclipse.emf.texo.orm.annotations.model.orm.Basic;
import org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection;
import org.eclipse.emf.texo.orm.annotations.model.orm.EnumType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Transient;
import org.eclipse.emf.texo.orm.annotations.model.orm.Version;
import org.eclipse.emf.texo.orm.annotator.ORMUtils;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>EEnum ORM Annotation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getEnumerated <em>Enumerated</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getElementCollection <em>Element Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEEnumORMAnnotation()
 * @model kind="class"
 * @generated
 */
public class EEnumORMAnnotation extends EEnumAnnotation implements EDataTypeORMAnnotationDefinition {
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
   * The default value of the '{@link #getEnumerated() <em>Enumerated</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getEnumerated()
   * @generated
   * @ordered
   */
  protected static final EnumType ENUMERATED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnumerated() <em>Enumerated</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getEnumerated()
   * @generated
   * @ordered
   */
  protected EnumType enumerated = ENUMERATED_EDEFAULT;

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
   * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
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
  protected EEnumORMAnnotation() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmannotationsPackage.Literals.EENUM_ORM_ANNOTATION;
  }

  /**
   * Returns the value of the '<em><b>Annotated EData Type</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType#getEDataTypeAnnotations <em>EData Type Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotated EData Type</em>' container reference isn't clear, there really should be more
   * of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotated EData Type</em>' container reference.
   * @see #setAnnotatedEDataType(AnnotatedEDataType)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEDataTypeAnnotation_AnnotatedEDataType()
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedEDataType#getEDataTypeAnnotations
   * @model opposite="eDataTypeAnnotations" transient="false"
   * @generated
   */
  public AnnotatedEDataType getAnnotatedEDataType() {
    if (eContainerFeatureID() != OrmannotationsPackage.EENUM_ORM_ANNOTATION__ANNOTATED_EDATA_TYPE) return null;
    return (AnnotatedEDataType)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotatedEDataType(AnnotatedEDataType newAnnotatedEDataType, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newAnnotatedEDataType, OrmannotationsPackage.EENUM_ORM_ANNOTATION__ANNOTATED_EDATA_TYPE, msgs);
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getAnnotatedEDataType <em>Annotated EData Type</em>}' container reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotated EData Type</em>' container reference.
   * @see #getAnnotatedEDataType()
   * @generated
   */
  public void setAnnotatedEDataType(AnnotatedEDataType newAnnotatedEDataType) {
    if (newAnnotatedEDataType != eInternalContainer() || (eContainerFeatureID() != OrmannotationsPackage.EENUM_ORM_ANNOTATION__ANNOTATED_EDATA_TYPE && newAnnotatedEDataType != null)) {
      if (EcoreUtil.isAncestor(this, newAnnotatedEDataType))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newAnnotatedEDataType != null)
        msgs = ((InternalEObject)newAnnotatedEDataType).eInverseAdd(this, AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS, AnnotatedEDataType.class, msgs);
      msgs = basicSetAnnotatedEDataType(newAnnotatedEDataType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EENUM_ORM_ANNOTATION__ANNOTATED_EDATA_TYPE, newAnnotatedEDataType, newAnnotatedEDataType));
  }

  /**
   * Returns the value of the '<em><b>EData Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EData Type</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EData Type</em>' reference.
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEDataTypeAnnotation_EDataType()
   * @model required="true" transient="true" changeable="false" volatile="true"
   * @generated
   */
  public EDataType getEDataType() {
    EDataType eDataType = basicGetEDataType();
    return eDataType != null && eDataType.eIsProxy() ? (EDataType)eResolveProxy((InternalEObject)eDataType) : eDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  public EDataType basicGetEDataType() {
    return getEEnum();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EENUM_ORM_ANNOTATION__TRANSIENT, oldTransient, newTransient);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getTransient <em>Transient</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Transient</em>' containment reference.
   * @see #getTransient()
   * @generated
   */
  public void setTransient(Transient newTransient) {
    if (newTransient != transient_) {
      NotificationChain msgs = null;
      if (transient_ != null)
        msgs = ((InternalEObject)transient_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EENUM_ORM_ANNOTATION__TRANSIENT, null, msgs);
      if (newTransient != null)
        msgs = ((InternalEObject)newTransient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EENUM_ORM_ANNOTATION__TRANSIENT, null, msgs);
      msgs = basicSetTransient(newTransient, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EENUM_ORM_ANNOTATION__TRANSIENT, newTransient, newTransient));
  }

  /**
   * Returns the value of the '<em><b>Enumerated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumerated</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumerated</em>' attribute.
   * @see #setEnumerated(EnumType)
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEEnumORMAnnotation_Enumerated()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated"
   * @generated
   */
  public EnumType getEnumerated() {
    return enumerated;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getEnumerated <em>Enumerated</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumerated</em>' attribute.
   * @see #getEnumerated()
   * @generated
   */
  public void setEnumerated(EnumType newEnumerated) {
    EnumType oldEnumerated = enumerated;
    enumerated = newEnumerated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EENUM_ORM_ANNOTATION__ENUMERATED, oldEnumerated, enumerated));
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
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEEnumORMAnnotation_Basic()
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EENUM_ORM_ANNOTATION__BASIC, oldBasic, newBasic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getBasic <em>Basic</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic</em>' containment reference.
   * @see #getBasic()
   * @generated
   */
  public void setBasic(Basic newBasic) {
    if (newBasic != basic) {
      NotificationChain msgs = null;
      if (basic != null)
        msgs = ((InternalEObject)basic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EENUM_ORM_ANNOTATION__BASIC, null, msgs);
      if (newBasic != null)
        msgs = ((InternalEObject)newBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EENUM_ORM_ANNOTATION__BASIC, null, msgs);
      msgs = basicSetBasic(newBasic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EENUM_ORM_ANNOTATION__BASIC, newBasic, newBasic));
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
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEEnumORMAnnotation_Version()
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EENUM_ORM_ANNOTATION__VERSION, oldVersion, newVersion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getVersion <em>Version</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' containment reference.
   * @see #getVersion()
   * @generated
   */
  public void setVersion(Version newVersion) {
    if (newVersion != version) {
      NotificationChain msgs = null;
      if (version != null)
        msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EENUM_ORM_ANNOTATION__VERSION, null, msgs);
      if (newVersion != null)
        msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EENUM_ORM_ANNOTATION__VERSION, null, msgs);
      msgs = basicSetVersion(newVersion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EENUM_ORM_ANNOTATION__VERSION, newVersion, newVersion));
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
   * @see org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage#getEEnumORMAnnotation_ElementCollection()
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EENUM_ORM_ANNOTATION__ELEMENT_COLLECTION, oldElementCollection, newElementCollection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation#getElementCollection <em>Element Collection</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Collection</em>' containment reference.
   * @see #getElementCollection()
   * @generated
   */
  public void setElementCollection(ElementCollection newElementCollection) {
    if (newElementCollection != elementCollection) {
      NotificationChain msgs = null;
      if (elementCollection != null)
        msgs = ((InternalEObject)elementCollection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EENUM_ORM_ANNOTATION__ELEMENT_COLLECTION, null, msgs);
      if (newElementCollection != null)
        msgs = ((InternalEObject)newElementCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmannotationsPackage.EENUM_ORM_ANNOTATION__ELEMENT_COLLECTION, null, msgs);
      msgs = basicSetElementCollection(newElementCollection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmannotationsPackage.EENUM_ORM_ANNOTATION__ELEMENT_COLLECTION, newElementCollection, newElementCollection));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ANNOTATED_EDATA_TYPE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetAnnotatedEDataType((AnnotatedEDataType)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ANNOTATED_EDATA_TYPE:
        return basicSetAnnotatedEDataType(null, msgs);
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__TRANSIENT:
        return basicSetTransient(null, msgs);
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__BASIC:
        return basicSetBasic(null, msgs);
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__VERSION:
        return basicSetVersion(null, msgs);
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ELEMENT_COLLECTION:
        return basicSetElementCollection(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ANNOTATED_EDATA_TYPE:
        return eInternalContainer().eInverseRemove(this, AnnotationsmodelPackage.ANNOTATED_EDATA_TYPE__EDATA_TYPE_ANNOTATIONS, AnnotatedEDataType.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ANNOTATED_EDATA_TYPE:
        return getAnnotatedEDataType();
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__EDATA_TYPE:
        if (resolve) return getEDataType();
        return basicGetEDataType();
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__TRANSIENT:
        return getTransient();
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ENUMERATED:
        return getEnumerated();
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__BASIC:
        return getBasic();
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__VERSION:
        return getVersion();
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ELEMENT_COLLECTION:
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
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ANNOTATED_EDATA_TYPE:
        setAnnotatedEDataType((AnnotatedEDataType)newValue);
        return;
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__TRANSIENT:
        setTransient((Transient)newValue);
        return;
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ENUMERATED:
        setEnumerated((EnumType)newValue);
        return;
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__BASIC:
        setBasic((Basic)newValue);
        return;
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__VERSION:
        setVersion((Version)newValue);
        return;
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ELEMENT_COLLECTION:
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
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ANNOTATED_EDATA_TYPE:
        setAnnotatedEDataType((AnnotatedEDataType)null);
        return;
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__TRANSIENT:
        setTransient((Transient)null);
        return;
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ENUMERATED:
        setEnumerated(ENUMERATED_EDEFAULT);
        return;
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__BASIC:
        setBasic((Basic)null);
        return;
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__VERSION:
        setVersion((Version)null);
        return;
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ELEMENT_COLLECTION:
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
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ANNOTATED_EDATA_TYPE:
        return getAnnotatedEDataType() != null;
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__EDATA_TYPE:
        return basicGetEDataType() != null;
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__TRANSIENT:
        return transient_ != null;
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ENUMERATED:
        return ENUMERATED_EDEFAULT == null ? enumerated != null : !ENUMERATED_EDEFAULT.equals(enumerated);
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__BASIC:
        return basic != null;
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__VERSION:
        return version != null;
      case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ELEMENT_COLLECTION:
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
    if (baseClass == EDataTypeAnnotation.class) {
      switch (derivedFeatureID) {
        case OrmannotationsPackage.EENUM_ORM_ANNOTATION__ANNOTATED_EDATA_TYPE: return AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE;
        case OrmannotationsPackage.EENUM_ORM_ANNOTATION__EDATA_TYPE: return AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__EDATA_TYPE;
        default: return -1;
      }
    }
    if (baseClass == ENamedElementORMAnnotation.class) {
      switch (derivedFeatureID) {
        default: return -1;
      }
    }
    if (baseClass == ETypeElementORMAnnotation.class) {
      switch (derivedFeatureID) {
        case OrmannotationsPackage.EENUM_ORM_ANNOTATION__TRANSIENT: return OrmannotationsPackage.ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT;
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
    if (baseClass == EDataTypeAnnotation.class) {
      switch (baseFeatureID) {
        case AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__ANNOTATED_EDATA_TYPE: return OrmannotationsPackage.EENUM_ORM_ANNOTATION__ANNOTATED_EDATA_TYPE;
        case AnnotationsmodelPackage.EDATA_TYPE_ANNOTATION__EDATA_TYPE: return OrmannotationsPackage.EENUM_ORM_ANNOTATION__EDATA_TYPE;
        default: return -1;
      }
    }
    if (baseClass == ENamedElementORMAnnotation.class) {
      switch (baseFeatureID) {
        default: return -1;
      }
    }
    if (baseClass == ETypeElementORMAnnotation.class) {
      switch (baseFeatureID) {
        case OrmannotationsPackage.ETYPE_ELEMENT_ORM_ANNOTATION__TRANSIENT: return OrmannotationsPackage.EENUM_ORM_ANNOTATION__TRANSIENT;
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

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (enumerated: "); //$NON-NLS-1$
    result.append(enumerated);
    result.append(')');
    return result.toString();
  }

  @Override
  public boolean isValidForContext(ENamedElement eNamedElement) {
    return ORMUtils.isValidForContext(eNamedElement);
  }

} // EEnumORMAnnotation
