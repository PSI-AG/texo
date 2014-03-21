/**
 * <copyright>
 * </copyright>
 *
 * $Id: AttributesImpl.java,v 1.5 2011/10/25 13:25:23 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.Array;
import org.eclipse.emf.texo.orm.annotations.model.orm.Attributes;
import org.eclipse.emf.texo.orm.annotations.model.orm.Basic;
import org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection;
import org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap;
import org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection;
import org.eclipse.emf.texo.orm.annotations.model.orm.Embedded;
import org.eclipse.emf.texo.orm.annotations.model.orm.EmbeddedId;
import org.eclipse.emf.texo.orm.annotations.model.orm.Id;
import org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany;
import org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne;
import org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany;
import org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.Structure;
import org.eclipse.emf.texo.orm.annotations.model.orm.Transformation;
import org.eclipse.emf.texo.orm.annotations.model.orm.Transient;
import org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne;
import org.eclipse.emf.texo.orm.annotations.model.orm.Version;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Attributes</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getEmbeddedId <em>Embedded Id</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getBasicCollection <em>Basic Collection</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getBasicMap <em>Basic Map</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getOneToMany <em>One To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getOneToOne <em>One To One</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getVariableOneToOne <em>Variable One To One</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getManyToMany <em>Many To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getElementCollection <em>Element Collection</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getEmbedded <em>Embedded</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getTransient <em>Transient</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributesImpl extends BaseOrmAnnotationImpl implements Attributes {
  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected EList<Id> id;

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
   * The cached value of the '{@link #getBasic() <em>Basic</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasic()
   * @generated
   * @ordered
   */
  protected EList<Basic> basic;

  /**
   * The cached value of the '{@link #getBasicCollection() <em>Basic Collection</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getBasicCollection()
   * @generated
   * @ordered
   */
  protected EList<BasicCollection> basicCollection;

  /**
   * The cached value of the '{@link #getBasicMap() <em>Basic Map</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getBasicMap()
   * @generated
   * @ordered
   */
  protected EList<BasicMap> basicMap;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected EList<Version> version;

  /**
   * The cached value of the '{@link #getManyToOne() <em>Many To One</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getManyToOne()
   * @generated
   * @ordered
   */
  protected EList<ManyToOne> manyToOne;

  /**
   * The cached value of the '{@link #getOneToMany() <em>One To Many</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOneToMany()
   * @generated
   * @ordered
   */
  protected EList<OneToMany> oneToMany;

  /**
   * The cached value of the '{@link #getOneToOne() <em>One To One</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOneToOne()
   * @generated
   * @ordered
   */
  protected EList<OneToOne> oneToOne;

  /**
   * The cached value of the '{@link #getVariableOneToOne() <em>Variable One To One</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getVariableOneToOne()
   * @generated
   * @ordered
   */
  protected EList<VariableOneToOne> variableOneToOne;

  /**
   * The cached value of the '{@link #getManyToMany() <em>Many To Many</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getManyToMany()
   * @generated
   * @ordered
   */
  protected EList<ManyToMany> manyToMany;

  /**
   * The cached value of the '{@link #getElementCollection() <em>Element Collection</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getElementCollection()
   * @generated
   * @ordered
   */
  protected EList<ElementCollection> elementCollection;

  /**
   * The cached value of the '{@link #getEmbedded() <em>Embedded</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getEmbedded()
   * @generated
   * @ordered
   */
  protected EList<Embedded> embedded;

  /**
   * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTransformation()
   * @generated
   * @ordered
   */
  protected EList<Transformation> transformation;

  /**
   * The cached value of the '{@link #getTransient() <em>Transient</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTransient()
   * @generated
   * @ordered
   */
  protected EList<Transient> transient_;

  /**
   * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStructure()
   * @generated
   * @ordered
   */
	protected EList<Structure> structure;

		/**
   * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
	protected EList<Array> array;

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected AttributesImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getAttributes();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription) {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ATTRIBUTES__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Id> getId() {
    if (id == null) {
      id = new EObjectContainmentEList<Id>(Id.class, this, OrmPackage.ATTRIBUTES__ID);
    }
    return id;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ATTRIBUTES__EMBEDDED_ID, oldEmbeddedId, newEmbeddedId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setEmbeddedId(EmbeddedId newEmbeddedId) {
    if (newEmbeddedId != embeddedId) {
      NotificationChain msgs = null;
      if (embeddedId != null)
        msgs = ((InternalEObject)embeddedId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ATTRIBUTES__EMBEDDED_ID, null, msgs);
      if (newEmbeddedId != null)
        msgs = ((InternalEObject)newEmbeddedId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ATTRIBUTES__EMBEDDED_ID, null, msgs);
      msgs = basicSetEmbeddedId(newEmbeddedId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ATTRIBUTES__EMBEDDED_ID, newEmbeddedId, newEmbeddedId));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Basic> getBasic() {
    if (basic == null) {
      basic = new EObjectContainmentEList<Basic>(Basic.class, this, OrmPackage.ATTRIBUTES__BASIC);
    }
    return basic;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<BasicCollection> getBasicCollection() {
    if (basicCollection == null) {
      basicCollection = new EObjectContainmentEList<BasicCollection>(BasicCollection.class, this, OrmPackage.ATTRIBUTES__BASIC_COLLECTION);
    }
    return basicCollection;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<BasicMap> getBasicMap() {
    if (basicMap == null) {
      basicMap = new EObjectContainmentEList<BasicMap>(BasicMap.class, this, OrmPackage.ATTRIBUTES__BASIC_MAP);
    }
    return basicMap;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Version> getVersion() {
    if (version == null) {
      version = new EObjectContainmentEList<Version>(Version.class, this, OrmPackage.ATTRIBUTES__VERSION);
    }
    return version;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ManyToOne> getManyToOne() {
    if (manyToOne == null) {
      manyToOne = new EObjectContainmentEList<ManyToOne>(ManyToOne.class, this, OrmPackage.ATTRIBUTES__MANY_TO_ONE);
    }
    return manyToOne;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<OneToMany> getOneToMany() {
    if (oneToMany == null) {
      oneToMany = new EObjectContainmentEList<OneToMany>(OneToMany.class, this, OrmPackage.ATTRIBUTES__ONE_TO_MANY);
    }
    return oneToMany;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<OneToOne> getOneToOne() {
    if (oneToOne == null) {
      oneToOne = new EObjectContainmentEList<OneToOne>(OneToOne.class, this, OrmPackage.ATTRIBUTES__ONE_TO_ONE);
    }
    return oneToOne;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableOneToOne> getVariableOneToOne() {
    if (variableOneToOne == null) {
      variableOneToOne = new EObjectContainmentEList<VariableOneToOne>(VariableOneToOne.class, this, OrmPackage.ATTRIBUTES__VARIABLE_ONE_TO_ONE);
    }
    return variableOneToOne;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ManyToMany> getManyToMany() {
    if (manyToMany == null) {
      manyToMany = new EObjectContainmentEList<ManyToMany>(ManyToMany.class, this, OrmPackage.ATTRIBUTES__MANY_TO_MANY);
    }
    return manyToMany;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementCollection> getElementCollection() {
    if (elementCollection == null) {
      elementCollection = new EObjectContainmentEList<ElementCollection>(ElementCollection.class, this, OrmPackage.ATTRIBUTES__ELEMENT_COLLECTION);
    }
    return elementCollection;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Embedded> getEmbedded() {
    if (embedded == null) {
      embedded = new EObjectContainmentEList<Embedded>(Embedded.class, this, OrmPackage.ATTRIBUTES__EMBEDDED);
    }
    return embedded;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Transformation> getTransformation() {
    if (transformation == null) {
      transformation = new EObjectContainmentEList<Transformation>(Transformation.class, this, OrmPackage.ATTRIBUTES__TRANSFORMATION);
    }
    return transformation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Transient> getTransient() {
    if (transient_ == null) {
      transient_ = new EObjectContainmentEList<Transient>(Transient.class, this, OrmPackage.ATTRIBUTES__TRANSIENT);
    }
    return transient_;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Structure> getStructure() {
    if (structure == null) {
      structure = new EObjectContainmentEList<Structure>(Structure.class, this, OrmPackage.ATTRIBUTES__STRUCTURE);
    }
    return structure;
  }

		/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Array> getArray() {
    if (array == null) {
      array = new EObjectContainmentEList<Array>(Array.class, this, OrmPackage.ATTRIBUTES__ARRAY);
    }
    return array;
  }

		/**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.ATTRIBUTES__ID:
        return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
      case OrmPackage.ATTRIBUTES__EMBEDDED_ID:
        return basicSetEmbeddedId(null, msgs);
      case OrmPackage.ATTRIBUTES__BASIC:
        return ((InternalEList<?>)getBasic()).basicRemove(otherEnd, msgs);
      case OrmPackage.ATTRIBUTES__BASIC_COLLECTION:
        return ((InternalEList<?>)getBasicCollection()).basicRemove(otherEnd, msgs);
      case OrmPackage.ATTRIBUTES__BASIC_MAP:
        return ((InternalEList<?>)getBasicMap()).basicRemove(otherEnd, msgs);
      case OrmPackage.ATTRIBUTES__VERSION:
        return ((InternalEList<?>)getVersion()).basicRemove(otherEnd, msgs);
      case OrmPackage.ATTRIBUTES__MANY_TO_ONE:
        return ((InternalEList<?>)getManyToOne()).basicRemove(otherEnd, msgs);
      case OrmPackage.ATTRIBUTES__ONE_TO_MANY:
        return ((InternalEList<?>)getOneToMany()).basicRemove(otherEnd, msgs);
      case OrmPackage.ATTRIBUTES__ONE_TO_ONE:
        return ((InternalEList<?>)getOneToOne()).basicRemove(otherEnd, msgs);
      case OrmPackage.ATTRIBUTES__VARIABLE_ONE_TO_ONE:
        return ((InternalEList<?>)getVariableOneToOne()).basicRemove(otherEnd, msgs);
      case OrmPackage.ATTRIBUTES__MANY_TO_MANY:
        return ((InternalEList<?>)getManyToMany()).basicRemove(otherEnd, msgs);
      case OrmPackage.ATTRIBUTES__ELEMENT_COLLECTION:
        return ((InternalEList<?>)getElementCollection()).basicRemove(otherEnd, msgs);
      case OrmPackage.ATTRIBUTES__EMBEDDED:
        return ((InternalEList<?>)getEmbedded()).basicRemove(otherEnd, msgs);
      case OrmPackage.ATTRIBUTES__TRANSFORMATION:
        return ((InternalEList<?>)getTransformation()).basicRemove(otherEnd, msgs);
      case OrmPackage.ATTRIBUTES__TRANSIENT:
        return ((InternalEList<?>)getTransient()).basicRemove(otherEnd, msgs);
      case OrmPackage.ATTRIBUTES__STRUCTURE:
        return ((InternalEList<?>)getStructure()).basicRemove(otherEnd, msgs);
      case OrmPackage.ATTRIBUTES__ARRAY:
        return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
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
      case OrmPackage.ATTRIBUTES__DESCRIPTION:
        return getDescription();
      case OrmPackage.ATTRIBUTES__ID:
        return getId();
      case OrmPackage.ATTRIBUTES__EMBEDDED_ID:
        return getEmbeddedId();
      case OrmPackage.ATTRIBUTES__BASIC:
        return getBasic();
      case OrmPackage.ATTRIBUTES__BASIC_COLLECTION:
        return getBasicCollection();
      case OrmPackage.ATTRIBUTES__BASIC_MAP:
        return getBasicMap();
      case OrmPackage.ATTRIBUTES__VERSION:
        return getVersion();
      case OrmPackage.ATTRIBUTES__MANY_TO_ONE:
        return getManyToOne();
      case OrmPackage.ATTRIBUTES__ONE_TO_MANY:
        return getOneToMany();
      case OrmPackage.ATTRIBUTES__ONE_TO_ONE:
        return getOneToOne();
      case OrmPackage.ATTRIBUTES__VARIABLE_ONE_TO_ONE:
        return getVariableOneToOne();
      case OrmPackage.ATTRIBUTES__MANY_TO_MANY:
        return getManyToMany();
      case OrmPackage.ATTRIBUTES__ELEMENT_COLLECTION:
        return getElementCollection();
      case OrmPackage.ATTRIBUTES__EMBEDDED:
        return getEmbedded();
      case OrmPackage.ATTRIBUTES__TRANSFORMATION:
        return getTransformation();
      case OrmPackage.ATTRIBUTES__TRANSIENT:
        return getTransient();
      case OrmPackage.ATTRIBUTES__STRUCTURE:
        return getStructure();
      case OrmPackage.ATTRIBUTES__ARRAY:
        return getArray();
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
      case OrmPackage.ATTRIBUTES__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case OrmPackage.ATTRIBUTES__ID:
        getId().clear();
        getId().addAll((Collection<? extends Id>)newValue);
        return;
      case OrmPackage.ATTRIBUTES__EMBEDDED_ID:
        setEmbeddedId((EmbeddedId)newValue);
        return;
      case OrmPackage.ATTRIBUTES__BASIC:
        getBasic().clear();
        getBasic().addAll((Collection<? extends Basic>)newValue);
        return;
      case OrmPackage.ATTRIBUTES__BASIC_COLLECTION:
        getBasicCollection().clear();
        getBasicCollection().addAll((Collection<? extends BasicCollection>)newValue);
        return;
      case OrmPackage.ATTRIBUTES__BASIC_MAP:
        getBasicMap().clear();
        getBasicMap().addAll((Collection<? extends BasicMap>)newValue);
        return;
      case OrmPackage.ATTRIBUTES__VERSION:
        getVersion().clear();
        getVersion().addAll((Collection<? extends Version>)newValue);
        return;
      case OrmPackage.ATTRIBUTES__MANY_TO_ONE:
        getManyToOne().clear();
        getManyToOne().addAll((Collection<? extends ManyToOne>)newValue);
        return;
      case OrmPackage.ATTRIBUTES__ONE_TO_MANY:
        getOneToMany().clear();
        getOneToMany().addAll((Collection<? extends OneToMany>)newValue);
        return;
      case OrmPackage.ATTRIBUTES__ONE_TO_ONE:
        getOneToOne().clear();
        getOneToOne().addAll((Collection<? extends OneToOne>)newValue);
        return;
      case OrmPackage.ATTRIBUTES__VARIABLE_ONE_TO_ONE:
        getVariableOneToOne().clear();
        getVariableOneToOne().addAll((Collection<? extends VariableOneToOne>)newValue);
        return;
      case OrmPackage.ATTRIBUTES__MANY_TO_MANY:
        getManyToMany().clear();
        getManyToMany().addAll((Collection<? extends ManyToMany>)newValue);
        return;
      case OrmPackage.ATTRIBUTES__ELEMENT_COLLECTION:
        getElementCollection().clear();
        getElementCollection().addAll((Collection<? extends ElementCollection>)newValue);
        return;
      case OrmPackage.ATTRIBUTES__EMBEDDED:
        getEmbedded().clear();
        getEmbedded().addAll((Collection<? extends Embedded>)newValue);
        return;
      case OrmPackage.ATTRIBUTES__TRANSFORMATION:
        getTransformation().clear();
        getTransformation().addAll((Collection<? extends Transformation>)newValue);
        return;
      case OrmPackage.ATTRIBUTES__TRANSIENT:
        getTransient().clear();
        getTransient().addAll((Collection<? extends Transient>)newValue);
        return;
      case OrmPackage.ATTRIBUTES__STRUCTURE:
        getStructure().clear();
        getStructure().addAll((Collection<? extends Structure>)newValue);
        return;
      case OrmPackage.ATTRIBUTES__ARRAY:
        getArray().clear();
        getArray().addAll((Collection<? extends Array>)newValue);
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
      case OrmPackage.ATTRIBUTES__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case OrmPackage.ATTRIBUTES__ID:
        getId().clear();
        return;
      case OrmPackage.ATTRIBUTES__EMBEDDED_ID:
        setEmbeddedId((EmbeddedId)null);
        return;
      case OrmPackage.ATTRIBUTES__BASIC:
        getBasic().clear();
        return;
      case OrmPackage.ATTRIBUTES__BASIC_COLLECTION:
        getBasicCollection().clear();
        return;
      case OrmPackage.ATTRIBUTES__BASIC_MAP:
        getBasicMap().clear();
        return;
      case OrmPackage.ATTRIBUTES__VERSION:
        getVersion().clear();
        return;
      case OrmPackage.ATTRIBUTES__MANY_TO_ONE:
        getManyToOne().clear();
        return;
      case OrmPackage.ATTRIBUTES__ONE_TO_MANY:
        getOneToMany().clear();
        return;
      case OrmPackage.ATTRIBUTES__ONE_TO_ONE:
        getOneToOne().clear();
        return;
      case OrmPackage.ATTRIBUTES__VARIABLE_ONE_TO_ONE:
        getVariableOneToOne().clear();
        return;
      case OrmPackage.ATTRIBUTES__MANY_TO_MANY:
        getManyToMany().clear();
        return;
      case OrmPackage.ATTRIBUTES__ELEMENT_COLLECTION:
        getElementCollection().clear();
        return;
      case OrmPackage.ATTRIBUTES__EMBEDDED:
        getEmbedded().clear();
        return;
      case OrmPackage.ATTRIBUTES__TRANSFORMATION:
        getTransformation().clear();
        return;
      case OrmPackage.ATTRIBUTES__TRANSIENT:
        getTransient().clear();
        return;
      case OrmPackage.ATTRIBUTES__STRUCTURE:
        getStructure().clear();
        return;
      case OrmPackage.ATTRIBUTES__ARRAY:
        getArray().clear();
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
      case OrmPackage.ATTRIBUTES__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case OrmPackage.ATTRIBUTES__ID:
        return id != null && !id.isEmpty();
      case OrmPackage.ATTRIBUTES__EMBEDDED_ID:
        return embeddedId != null;
      case OrmPackage.ATTRIBUTES__BASIC:
        return basic != null && !basic.isEmpty();
      case OrmPackage.ATTRIBUTES__BASIC_COLLECTION:
        return basicCollection != null && !basicCollection.isEmpty();
      case OrmPackage.ATTRIBUTES__BASIC_MAP:
        return basicMap != null && !basicMap.isEmpty();
      case OrmPackage.ATTRIBUTES__VERSION:
        return version != null && !version.isEmpty();
      case OrmPackage.ATTRIBUTES__MANY_TO_ONE:
        return manyToOne != null && !manyToOne.isEmpty();
      case OrmPackage.ATTRIBUTES__ONE_TO_MANY:
        return oneToMany != null && !oneToMany.isEmpty();
      case OrmPackage.ATTRIBUTES__ONE_TO_ONE:
        return oneToOne != null && !oneToOne.isEmpty();
      case OrmPackage.ATTRIBUTES__VARIABLE_ONE_TO_ONE:
        return variableOneToOne != null && !variableOneToOne.isEmpty();
      case OrmPackage.ATTRIBUTES__MANY_TO_MANY:
        return manyToMany != null && !manyToMany.isEmpty();
      case OrmPackage.ATTRIBUTES__ELEMENT_COLLECTION:
        return elementCollection != null && !elementCollection.isEmpty();
      case OrmPackage.ATTRIBUTES__EMBEDDED:
        return embedded != null && !embedded.isEmpty();
      case OrmPackage.ATTRIBUTES__TRANSFORMATION:
        return transformation != null && !transformation.isEmpty();
      case OrmPackage.ATTRIBUTES__TRANSIENT:
        return transient_ != null && !transient_.isEmpty();
      case OrmPackage.ATTRIBUTES__STRUCTURE:
        return structure != null && !structure.isEmpty();
      case OrmPackage.ATTRIBUTES__ARRAY:
        return array != null && !array.isEmpty();
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
    result.append(" (description: "); //$NON-NLS-1$
    result.append(description);
    result.append(')');
    return result.toString();
  }

} // AttributesImpl
