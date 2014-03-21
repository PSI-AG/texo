/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmbeddedImpl.java,v 1.8 2011/10/26 05:48:11 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessType;
import org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.Embedded;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.Property;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;
import org.eclipse.emf.texo.orm.annotator.ORMJavaAnnotationGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Embedded</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddedImpl#getAttributeOverride <em>Attribute Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddedImpl#getAssociationOverride <em>Association Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddedImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddedImpl#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddedImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddedImpl#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddedImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmbeddedImpl extends BaseOrmAnnotationImpl implements Embedded {
  /**
   * The cached value of the '{@link #getAttributeOverride() <em>Attribute Override</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getAttributeOverride()
   * @generated
   * @ordered
   */
  protected EList<AttributeOverride> attributeOverride;

  /**
   * The cached value of the '{@link #getAssociationOverride() <em>Association Override</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getAssociationOverride()
   * @generated
   * @ordered
   */
  protected EList<AssociationOverride> associationOverride;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected EList<Property> property;

  /**
   * The cached value of the '{@link #getAccessMethods() <em>Access Methods</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getAccessMethods()
   * @generated
   * @ordered
   */
  protected AccessMethods accessMethods;

  /**
   * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected static final AccessType ACCESS_EDEFAULT = AccessType.PROPERTY;

  /**
   * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected AccessType access = ACCESS_EDEFAULT;

  /**
   * This is true if the Access attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean accessESet;

  /**
   * The default value of the '{@link #getAttributeType() <em>Attribute Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAttributeType()
   * @generated
   * @ordered
   */
	protected static final String ATTRIBUTE_TYPE_EDEFAULT = null;

		/**
   * The cached value of the '{@link #getAttributeType() <em>Attribute Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAttributeType()
   * @generated
   * @ordered
   */
	protected String attributeType = ATTRIBUTE_TYPE_EDEFAULT;

		/**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected EmbeddedImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getEmbedded();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeOverride> getAttributeOverride() {
    if (attributeOverride == null) {
      attributeOverride = new EObjectContainmentEList<AttributeOverride>(AttributeOverride.class, this, OrmPackage.EMBEDDED__ATTRIBUTE_OVERRIDE);
    }
    return attributeOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<AssociationOverride> getAssociationOverride() {
    if (associationOverride == null) {
      associationOverride = new EObjectContainmentEList<AssociationOverride>(AssociationOverride.class, this, OrmPackage.EMBEDDED__ASSOCIATION_OVERRIDE);
    }
    return associationOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperty() {
    if (property == null) {
      property = new EObjectContainmentEList<Property>(Property.class, this, OrmPackage.EMBEDDED__PROPERTY);
    }
    return property;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AccessMethods getAccessMethods() {
    return accessMethods;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccessMethods(AccessMethods newAccessMethods, NotificationChain msgs) {
    AccessMethods oldAccessMethods = accessMethods;
    accessMethods = newAccessMethods;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDED__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAccessMethods(AccessMethods newAccessMethods) {
    if (newAccessMethods != accessMethods) {
      NotificationChain msgs = null;
      if (accessMethods != null)
        msgs = ((InternalEObject)accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDED__ACCESS_METHODS, null, msgs);
      if (newAccessMethods != null)
        msgs = ((InternalEObject)newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.EMBEDDED__ACCESS_METHODS, null, msgs);
      msgs = basicSetAccessMethods(newAccessMethods, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDED__ACCESS_METHODS, newAccessMethods, newAccessMethods));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public AccessType getAccess() {
    return access;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setAccess(AccessType newAccess) {
    AccessType oldAccess = access;
    access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
    boolean oldAccessESet = accessESet;
    accessESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDED__ACCESS, oldAccess, access, !oldAccessESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetAccess() {
    AccessType oldAccess = access;
    boolean oldAccessESet = accessESet;
    access = ACCESS_EDEFAULT;
    accessESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.EMBEDDED__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAccess() {
    return accessESet;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getAttributeType() {
    return attributeType;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAttributeType(String newAttributeType) {
    String oldAttributeType = attributeType;
    attributeType = newAttributeType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDED__ATTRIBUTE_TYPE, oldAttributeType, attributeType));
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.EMBEDDED__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.EMBEDDED__ATTRIBUTE_OVERRIDE:
        return ((InternalEList<?>)getAttributeOverride()).basicRemove(otherEnd, msgs);
      case OrmPackage.EMBEDDED__ASSOCIATION_OVERRIDE:
        return ((InternalEList<?>)getAssociationOverride()).basicRemove(otherEnd, msgs);
      case OrmPackage.EMBEDDED__PROPERTY:
        return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
      case OrmPackage.EMBEDDED__ACCESS_METHODS:
        return basicSetAccessMethods(null, msgs);
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
      case OrmPackage.EMBEDDED__ATTRIBUTE_OVERRIDE:
        return getAttributeOverride();
      case OrmPackage.EMBEDDED__ASSOCIATION_OVERRIDE:
        return getAssociationOverride();
      case OrmPackage.EMBEDDED__PROPERTY:
        return getProperty();
      case OrmPackage.EMBEDDED__ACCESS_METHODS:
        return getAccessMethods();
      case OrmPackage.EMBEDDED__ACCESS:
        return getAccess();
      case OrmPackage.EMBEDDED__ATTRIBUTE_TYPE:
        return getAttributeType();
      case OrmPackage.EMBEDDED__NAME:
        return getName();
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
      case OrmPackage.EMBEDDED__ATTRIBUTE_OVERRIDE:
        getAttributeOverride().clear();
        getAttributeOverride().addAll((Collection<? extends AttributeOverride>)newValue);
        return;
      case OrmPackage.EMBEDDED__ASSOCIATION_OVERRIDE:
        getAssociationOverride().clear();
        getAssociationOverride().addAll((Collection<? extends AssociationOverride>)newValue);
        return;
      case OrmPackage.EMBEDDED__PROPERTY:
        getProperty().clear();
        getProperty().addAll((Collection<? extends Property>)newValue);
        return;
      case OrmPackage.EMBEDDED__ACCESS_METHODS:
        setAccessMethods((AccessMethods)newValue);
        return;
      case OrmPackage.EMBEDDED__ACCESS:
        setAccess((AccessType)newValue);
        return;
      case OrmPackage.EMBEDDED__ATTRIBUTE_TYPE:
        setAttributeType((String)newValue);
        return;
      case OrmPackage.EMBEDDED__NAME:
        setName((String)newValue);
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
      case OrmPackage.EMBEDDED__ATTRIBUTE_OVERRIDE:
        getAttributeOverride().clear();
        return;
      case OrmPackage.EMBEDDED__ASSOCIATION_OVERRIDE:
        getAssociationOverride().clear();
        return;
      case OrmPackage.EMBEDDED__PROPERTY:
        getProperty().clear();
        return;
      case OrmPackage.EMBEDDED__ACCESS_METHODS:
        setAccessMethods((AccessMethods)null);
        return;
      case OrmPackage.EMBEDDED__ACCESS:
        unsetAccess();
        return;
      case OrmPackage.EMBEDDED__ATTRIBUTE_TYPE:
        setAttributeType(ATTRIBUTE_TYPE_EDEFAULT);
        return;
      case OrmPackage.EMBEDDED__NAME:
        setName(NAME_EDEFAULT);
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
      case OrmPackage.EMBEDDED__ATTRIBUTE_OVERRIDE:
        return attributeOverride != null && !attributeOverride.isEmpty();
      case OrmPackage.EMBEDDED__ASSOCIATION_OVERRIDE:
        return associationOverride != null && !associationOverride.isEmpty();
      case OrmPackage.EMBEDDED__PROPERTY:
        return property != null && !property.isEmpty();
      case OrmPackage.EMBEDDED__ACCESS_METHODS:
        return accessMethods != null;
      case OrmPackage.EMBEDDED__ACCESS:
        return isSetAccess();
      case OrmPackage.EMBEDDED__ATTRIBUTE_TYPE:
        return ATTRIBUTE_TYPE_EDEFAULT == null ? attributeType != null : !ATTRIBUTE_TYPE_EDEFAULT.equals(attributeType);
      case OrmPackage.EMBEDDED__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (access: "); //$NON-NLS-1$
    if (accessESet) result.append(access); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", attributeType: "); //$NON-NLS-1$
    result.append(attributeType);
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(')');
    return result.toString();
  }

  @Override
  public String getJavaAnnotation(String identifier) {
    final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    // add any other feature to hide non-jpa features
    features.add(OrmPackage.eINSTANCE.getElementCollection_Fetch());

    return ORMJavaAnnotationGenerator.getInstance().generateJavaAnnotation(this, features, true, identifier);
  }
} // EmbeddedImpl
