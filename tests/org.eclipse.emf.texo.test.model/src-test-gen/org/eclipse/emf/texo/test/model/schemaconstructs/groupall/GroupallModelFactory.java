package org.eclipse.emf.texo.test.model.schemaconstructs.groupall;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model:
 * org.eclipse.emf.texo.test.model.schemaconstructs.groupall. It contains code to create instances {@link ModelObject}
 * wrappers and instances for EClasses and convert objects back and forth from their String (XML) representation. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class GroupallModelFactory implements ModelFactory {

  /**
   * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          creates a Object instance for this EClass
   * @return an object representing the eClass
   * @generated
   */
  public Object create(EClass eClass) {
    switch (eClass.getClassifierID()) {
    case GroupallModelPackage.ADDRESSGROUPTYPE_CLASSIFIER_ID:
      return createAddressGroupType();
    case GroupallModelPackage.ADDRESSTYPE_CLASSIFIER_ID:
      return createAddressType();
    case GroupallModelPackage.ADDRESSLIST_CLASSIFIER_ID:
      return createAddressList();
    case GroupallModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
      return createDocumentRoot();
    case GroupallModelPackage.SIMPLEALLTYPE_CLASSIFIER_ID:
      return createSimpleAllType();
    case GroupallModelPackage.SIMPLEALLMAPTYPE_CLASSIFIER_ID:
      return createSimpleAllMapType();
    default:
      throw new IllegalArgumentException("The EClass '" + eClass.getName()
          + "' is not a valid EClass for this EPackage");
    }
  }

  /**
   * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClass
   *          the EClass of the object
   * @param adaptee
   *          the object being wrapped/adapted
   * @return the wrapper {@link ModelObject}
   * @generated
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public ModelObject createModelObject(EClass eClass, Object adaptee) {
    ModelObject<Object> modelObject = null;
    switch (eClass.getClassifierID()) {
    case GroupallModelPackage.ADDRESSGROUPTYPE_CLASSIFIER_ID:
      modelObject = new AddressGroupTypeModelObject();
      break;
    case GroupallModelPackage.ADDRESSTYPE_CLASSIFIER_ID:
      modelObject = new AddressTypeModelObject();
      break;
    case GroupallModelPackage.ADDRESSLIST_CLASSIFIER_ID:
      modelObject = new AddressListModelObject();
      break;
    case GroupallModelPackage.DOCUMENTROOT_CLASSIFIER_ID:
      modelObject = new DocumentRootModelObject();
      break;
    case GroupallModelPackage.SIMPLEALLTYPE_CLASSIFIER_ID:
      modelObject = new SimpleAllTypeModelObject();
      break;
    case GroupallModelPackage.SIMPLEALLMAPTYPE_CLASSIFIER_ID:
      modelObject = new SimpleAllMapTypeModelObject();
      break;
    default:
      throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
    }
    modelObject.setTarget(adaptee);
    return modelObject;
  }

  /**
   * Creates a feature map entry instance for a certain EStructuralFeature.
   * 
   * @param eFeature
   *          the feature map feature
   * @return the pojo feature map entry
   * @generated
   */
  public Object createFeatureMapEntry(EStructuralFeature eFeature) {
    if (eFeature == GroupallModelPackage.INSTANCE.getAddressType_Group()) {
      return new AddressTypeGroupFeatureGroup();
    }
    if (eFeature == GroupallModelPackage.INSTANCE.getAddressList_Addrs()) {
      return new AddressListAddrsFeatureGroup();
    }
    if (eFeature == GroupallModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
      return new DocumentRootMixedFeatureGroup();
    }
    if (eFeature == GroupallModelPackage.INSTANCE.getSimpleAllMapType_AllMap()) {
      return new SimpleAllMapTypeAllMapFeatureGroup();
    }
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}. If the feature map entry is null then a
   * new one is created and <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eFeature
   *          the feature map feature of the object
   * @param adaptee
   *          the pojo feature map entry being wrapped/adapted
   * @return the wrapper {@link ModelFeatureMapEntry}
   * @generated
   */
  public ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature, Object adaptee) {
    if (eFeature == GroupallModelPackage.INSTANCE.getAddressType_Group()) {
      final AddressTypeGroupFeatureGroupModelFeatureMapEntry<AddressTypeGroupFeatureGroup> entry = new AddressTypeGroupFeatureGroupModelFeatureMapEntry<AddressTypeGroupFeatureGroup>();
      entry.setTarget((AddressTypeGroupFeatureGroup) adaptee);
      return entry;
    }
    if (eFeature == GroupallModelPackage.INSTANCE.getAddressList_Addrs()) {
      final AddressListAddrsFeatureGroupModelFeatureMapEntry<AddressListAddrsFeatureGroup> entry = new AddressListAddrsFeatureGroupModelFeatureMapEntry<AddressListAddrsFeatureGroup>();
      entry.setTarget((AddressListAddrsFeatureGroup) adaptee);
      return entry;
    }
    if (eFeature == GroupallModelPackage.INSTANCE.getDocumentRoot_Mixed()) {
      final DocumentRootMixedFeatureGroupModelFeatureMapEntry<DocumentRootMixedFeatureGroup> entry = new DocumentRootMixedFeatureGroupModelFeatureMapEntry<DocumentRootMixedFeatureGroup>();
      entry.setTarget((DocumentRootMixedFeatureGroup) adaptee);
      return entry;
    }
    if (eFeature == GroupallModelPackage.INSTANCE.getSimpleAllMapType_AllMap()) {
      final SimpleAllMapTypeAllMapFeatureGroupModelFeatureMapEntry<SimpleAllMapTypeAllMapFeatureGroup> entry = new SimpleAllMapTypeAllMapFeatureGroupModelFeatureMapEntry<SimpleAllMapTypeAllMapFeatureGroup>();
      entry.setTarget((SimpleAllMapTypeAllMapFeatureGroup) adaptee);
      return entry;
    }
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass AddressGroupType
   * @generated
   */
  public AddressGroupType createAddressGroupType() {
    return new AddressGroupType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass AddressType
   * @generated
   */
  public AddressType createAddressType() {
    return new AddressType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass AddressList
   * @generated
   */
  public AddressList createAddressList() {
    return new AddressList();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DocumentRoot
   * @generated
   */
  public DocumentRoot createDocumentRoot() {
    return new DocumentRoot();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SimpleAllType
   * @generated
   */
  public SimpleAllType createSimpleAllType() {
    return new SimpleAllType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SimpleAllMapType
   * @generated
   */
  public SimpleAllMapType createSimpleAllMapType() {
    return new SimpleAllMapType();
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if the value is null then null is returned.
   * @generated
   */
  public Object createFromString(EDataType eDataType, String value) {
    switch (eDataType.getClassifierID()) {
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
    }
  }

  /**
   * Converts an instance of an {@link EDataType} to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eDataType
   *          the {@link EDataType} defining the type
   * @param value
   *          the object to convert, if value == null then null is returned
   * @generated
   */
  public String convertToString(EDataType eDataType, Object value) {
    switch (eDataType.getClassifierID()) {
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AddressGroupType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AddressGroupTypeModelObject<E extends AddressGroupType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return GroupallModelPackage.INSTANCE.getAddressGroupTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return GroupallModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case GroupallModelPackage.ADDRESSGROUPTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case GroupallModelPackage.ADDRESSGROUPTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case GroupallModelPackage.ADDRESSGROUPTYPE_GROUPNAME_FEATURE_ID:
        return getTarget().getGroupName();
      case GroupallModelPackage.ADDRESSGROUPTYPE_SHIPTO_FEATURE_ID:
        return getTarget().getShipTo();
      case GroupallModelPackage.ADDRESSGROUPTYPE_BILLTO_FEATURE_ID:
        return getTarget().getBillTo();
      case GroupallModelPackage.ADDRESSGROUPTYPE_SIMPLEADDRESS_FEATURE_ID:
        return getTarget().getSimpleAddress();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case GroupallModelPackage.ADDRESSGROUPTYPE_GROUPNAME_FEATURE_ID:
        getTarget().setGroupName((String) value);
        return;
      case GroupallModelPackage.ADDRESSGROUPTYPE_SHIPTO_FEATURE_ID:
        getTarget().setShipTo((AddressType) value);
        return;
      case GroupallModelPackage.ADDRESSGROUPTYPE_BILLTO_FEATURE_ID:
        getTarget().setBillTo((AddressType) value);
        return;
      case GroupallModelPackage.ADDRESSGROUPTYPE_SIMPLEADDRESS_FEATURE_ID:
        getTarget().setSimpleAddress((String) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AddressType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AddressTypeModelObject<E extends AddressType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return GroupallModelPackage.INSTANCE.getAddressTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return GroupallModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case GroupallModelPackage.ADDRESSTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case GroupallModelPackage.ADDRESSTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case GroupallModelPackage.ADDRESSTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case GroupallModelPackage.ADDRESSTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case GroupallModelPackage.ADDRESSTYPE_LONGNAME_FEATURE_ID:
        return getTarget().getLongName();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case GroupallModelPackage.ADDRESSTYPE_GROUP_FEATURE_ID:
        getTarget().setGroup((List<AddressTypeGroupFeatureGroup>) value);
        return;
      case GroupallModelPackage.ADDRESSTYPE_NAME_FEATURE_ID:
        getTarget().setName((List<String>) value);
        return;
      case GroupallModelPackage.ADDRESSTYPE_LONGNAME_FEATURE_ID:
        getTarget().setLongName((List<String>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case GroupallModelPackage.ADDRESSTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup().add((AddressTypeGroupFeatureGroup) value);

      case GroupallModelPackage.ADDRESSTYPE_NAME_FEATURE_ID:
        return getTarget().getName().add((String) value);

      case GroupallModelPackage.ADDRESSTYPE_LONGNAME_FEATURE_ID:
        return getTarget().getLongName().add((String) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case GroupallModelPackage.ADDRESSTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup().remove(value);

      case GroupallModelPackage.ADDRESSTYPE_NAME_FEATURE_ID:
        return getTarget().getName().remove(value);

      case GroupallModelPackage.ADDRESSTYPE_LONGNAME_FEATURE_ID:
        return getTarget().getLongName().remove(value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AddressList</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AddressListModelObject<E extends AddressList> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return GroupallModelPackage.INSTANCE.getAddressListEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return GroupallModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case GroupallModelPackage.ADDRESSLIST_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case GroupallModelPackage.ADDRESSLIST_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case GroupallModelPackage.ADDRESSLIST_GROUPNAME_FEATURE_ID:
        return getTarget().getGroupName();
      case GroupallModelPackage.ADDRESSLIST_ADDRS_FEATURE_ID:
        return getTarget().getAddrs();
      case GroupallModelPackage.ADDRESSLIST_SHIPTO_FEATURE_ID:
        return getTarget().getShipTo();
      case GroupallModelPackage.ADDRESSLIST_BILLTO_FEATURE_ID:
        return getTarget().getBillTo();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case GroupallModelPackage.ADDRESSLIST_GROUPNAME_FEATURE_ID:
        getTarget().setGroupName((String) value);
        return;
      case GroupallModelPackage.ADDRESSLIST_ADDRS_FEATURE_ID:
        getTarget().setAddrs((List<AddressListAddrsFeatureGroup>) value);
        return;
      case GroupallModelPackage.ADDRESSLIST_SHIPTO_FEATURE_ID:
        getTarget().setShipTo((List<AddressType>) value);
        return;
      case GroupallModelPackage.ADDRESSLIST_BILLTO_FEATURE_ID:
        getTarget().setBillTo((List<AddressType>) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case GroupallModelPackage.ADDRESSLIST_ADDRS_FEATURE_ID:
        return getTarget().getAddrs().add((AddressListAddrsFeatureGroup) value);

      case GroupallModelPackage.ADDRESSLIST_SHIPTO_FEATURE_ID:
        return getTarget().getShipTo().add((AddressType) value);

      case GroupallModelPackage.ADDRESSLIST_BILLTO_FEATURE_ID:
        return getTarget().getBillTo().add((AddressType) value);
      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case GroupallModelPackage.ADDRESSLIST_ADDRS_FEATURE_ID:
        return getTarget().getAddrs().remove(value);

      case GroupallModelPackage.ADDRESSLIST_SHIPTO_FEATURE_ID:
        return getTarget().getShipTo().remove(value);

      case GroupallModelPackage.ADDRESSLIST_BILLTO_FEATURE_ID:
        return getTarget().getBillTo().remove(value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>DocumentRoot</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DocumentRootModelObject<E extends DocumentRoot> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return GroupallModelPackage.INSTANCE.getDocumentRootEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return GroupallModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case GroupallModelPackage.DOCUMENTROOT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case GroupallModelPackage.DOCUMENTROOT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case GroupallModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed();
      case GroupallModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
        return getTarget().getXMLNSPrefixMap();
      case GroupallModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
        return getTarget().getXSISchemaLocation();
      case GroupallModelPackage.DOCUMENTROOT_ADDRESS_FEATURE_ID:
        return getTarget().getAddress();
      case GroupallModelPackage.DOCUMENTROOT_ADDRESSGROUP_FEATURE_ID:
        return getTarget().getAddressGroup();
      case GroupallModelPackage.DOCUMENTROOT_SIMPLEALL_FEATURE_ID:
        return getTarget().getSimpleAll();
      case GroupallModelPackage.DOCUMENTROOT_SIMPLEALLMAP_FEATURE_ID:
        return getTarget().getSimpleAllMap();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case GroupallModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        getTarget().setMixed((List<DocumentRootMixedFeatureGroup>) value);
        return;
      case GroupallModelPackage.DOCUMENTROOT_XMLNSPREFIXMAP_FEATURE_ID:
        getTarget().setXMLNSPrefixMap((Map<String, String>) value);
        return;
      case GroupallModelPackage.DOCUMENTROOT_XSISCHEMALOCATION_FEATURE_ID:
        getTarget().setXSISchemaLocation((Map<String, String>) value);
        return;
      case GroupallModelPackage.DOCUMENTROOT_ADDRESS_FEATURE_ID:
        getTarget().setAddress((AddressType) value);
        return;
      case GroupallModelPackage.DOCUMENTROOT_ADDRESSGROUP_FEATURE_ID:
        getTarget().setAddressGroup((AddressGroupType) value);
        return;
      case GroupallModelPackage.DOCUMENTROOT_SIMPLEALL_FEATURE_ID:
        getTarget().setSimpleAll((SimpleAllType) value);
        return;
      case GroupallModelPackage.DOCUMENTROOT_SIMPLEALLMAP_FEATURE_ID:
        getTarget().setSimpleAllMap((SimpleAllMapType) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case GroupallModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed().add((DocumentRootMixedFeatureGroup) value);

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case GroupallModelPackage.DOCUMENTROOT_MIXED_FEATURE_ID:
        return getTarget().getMixed().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SimpleAllType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SimpleAllTypeModelObject<E extends SimpleAllType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return GroupallModelPackage.INSTANCE.getSimpleAllTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return GroupallModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case GroupallModelPackage.SIMPLEALLTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case GroupallModelPackage.SIMPLEALLTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case GroupallModelPackage.SIMPLEALLTYPE_AAA_FEATURE_ID:
        return getTarget().getAaa();
      case GroupallModelPackage.SIMPLEALLTYPE_BBB_FEATURE_ID:
        return getTarget().getBbb();
      case GroupallModelPackage.SIMPLEALLTYPE_CCC_FEATURE_ID:
        return getTarget().getCcc();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case GroupallModelPackage.SIMPLEALLTYPE_AAA_FEATURE_ID:
        getTarget().setAaa((String) value);
        return;
      case GroupallModelPackage.SIMPLEALLTYPE_BBB_FEATURE_ID:
        getTarget().setBbb((String) value);
        return;
      case GroupallModelPackage.SIMPLEALLTYPE_CCC_FEATURE_ID:
        getTarget().setCcc((String) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SimpleAllMapType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SimpleAllMapTypeModelObject<E extends SimpleAllMapType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return GroupallModelPackage.INSTANCE.getSimpleAllMapTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return GroupallModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case GroupallModelPackage.SIMPLEALLMAPTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case GroupallModelPackage.SIMPLEALLMAPTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case GroupallModelPackage.SIMPLEALLMAPTYPE_ALLMAP_FEATURE_ID:
        return getTarget().getAllMap();
      case GroupallModelPackage.SIMPLEALLMAPTYPE_AAA_FEATURE_ID:
        return getTarget().getAaa();
      case GroupallModelPackage.SIMPLEALLMAPTYPE_BBB_FEATURE_ID:
        return getTarget().getBbb();
      case GroupallModelPackage.SIMPLEALLMAPTYPE_CCC_FEATURE_ID:
        return getTarget().getCcc();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case GroupallModelPackage.SIMPLEALLMAPTYPE_ALLMAP_FEATURE_ID:
        getTarget().setAllMap((List<SimpleAllMapTypeAllMapFeatureGroup>) value);
        return;
      case GroupallModelPackage.SIMPLEALLMAPTYPE_AAA_FEATURE_ID:
        getTarget().setAaa((String) value);
        return;
      case GroupallModelPackage.SIMPLEALLMAPTYPE_BBB_FEATURE_ID:
        getTarget().setBbb((String) value);
        return;
      case GroupallModelPackage.SIMPLEALLMAPTYPE_CCC_FEATURE_ID:
        getTarget().setCcc((String) value);
        return;
      default:
        super.eSet(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case GroupallModelPackage.SIMPLEALLMAPTYPE_ALLMAP_FEATURE_ID:
        return getTarget().getAllMap().add((SimpleAllMapTypeAllMapFeatureGroup) value);

      default:
        return super.eAddTo(eStructuralFeature, value);
      }
    }

    /**
     * @generated
     */
    @Override
    public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      case GroupallModelPackage.SIMPLEALLMAPTYPE_ALLMAP_FEATURE_ID:
        return getTarget().getAllMap().remove(value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The wrapper/adapter for the Feature Group '<em><b>AddressType.group</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class AddressTypeGroupFeatureGroupModelFeatureMapEntry<E extends AddressTypeGroupFeatureGroup> extends
      AbstractModelFeatureMapEntry<AddressTypeGroupFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case NAME:
        return GroupallModelPackage.INSTANCE.getAddressType_Name();
      case LONGNAME:
        return GroupallModelPackage.INSTANCE.getAddressType_LongName();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = GroupallModelPackage.INSTANCE.getAddressTypeEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case GroupallModelPackage.ADDRESSTYPE_NAME_FEATURE_ID:
        getTarget().setFeature(AddressTypeGroupFeatureGroup.Feature.NAME);
        return;
      case GroupallModelPackage.ADDRESSTYPE_LONGNAME_FEATURE_ID:
        getTarget().setFeature(AddressTypeGroupFeatureGroup.Feature.LONGNAME);
        return;
      default:
        throw new IllegalArgumentException("EStructuralFeature " + eStructuralFeature + " not supported here");
      }
    }

    /**
     * @generated
     */
    public Object getValue() {
      return getTarget().getValue();
    }

    /**
     * @generated
     */
    public void setValue(final Object value) {
      getTarget().setValue(getTarget().getFeature(), value);
    }
  }

  /**
   * The wrapper/adapter for the Feature Group '<em><b>AddressList.addrs</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class AddressListAddrsFeatureGroupModelFeatureMapEntry<E extends AddressListAddrsFeatureGroup> extends
      AbstractModelFeatureMapEntry<AddressListAddrsFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case SHIPTO:
        return GroupallModelPackage.INSTANCE.getAddressList_ShipTo();
      case BILLTO:
        return GroupallModelPackage.INSTANCE.getAddressList_BillTo();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = GroupallModelPackage.INSTANCE.getAddressListEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case GroupallModelPackage.ADDRESSLIST_SHIPTO_FEATURE_ID:
        getTarget().setFeature(AddressListAddrsFeatureGroup.Feature.SHIPTO);
        return;
      case GroupallModelPackage.ADDRESSLIST_BILLTO_FEATURE_ID:
        getTarget().setFeature(AddressListAddrsFeatureGroup.Feature.BILLTO);
        return;
      default:
        throw new IllegalArgumentException("EStructuralFeature " + eStructuralFeature + " not supported here");
      }
    }

    /**
     * @generated
     */
    public Object getValue() {
      return getTarget().getValue();
    }

    /**
     * @generated
     */
    public void setValue(final Object value) {
      getTarget().setValue(getTarget().getFeature(), value);
    }
  }

  /**
   * The wrapper/adapter for the Feature Group '<em><b>DocumentRoot.mixed</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class DocumentRootMixedFeatureGroupModelFeatureMapEntry<E extends DocumentRootMixedFeatureGroup>
      extends AbstractModelFeatureMapEntry<DocumentRootMixedFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case TEXT:
        return XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text();
      case CDATA:
        return XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA();
      case COMMENT:
        return XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment();
      case ADDRESS:
        return GroupallModelPackage.INSTANCE.getDocumentRoot_Address();
      case ADDRESSGROUP:
        return GroupallModelPackage.INSTANCE.getDocumentRoot_AddressGroup();
      case SIMPLEALL:
        return GroupallModelPackage.INSTANCE.getDocumentRoot_SimpleAll();
      case SIMPLEALLMAP:
        return GroupallModelPackage.INSTANCE.getDocumentRoot_SimpleAllMap();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {
      if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text()) {
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.TEXT);
        return;
      } else if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_CDATA()) {
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.CDATA);
        return;
      } else if (eStructuralFeature == XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Comment()) {
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.COMMENT);
        return;
      }

      final EClass eClass = GroupallModelPackage.INSTANCE.getDocumentRootEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case GroupallModelPackage.DOCUMENTROOT_ADDRESS_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.ADDRESS);
        return;
      case GroupallModelPackage.DOCUMENTROOT_ADDRESSGROUP_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.ADDRESSGROUP);
        return;
      case GroupallModelPackage.DOCUMENTROOT_SIMPLEALL_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.SIMPLEALL);
        return;
      case GroupallModelPackage.DOCUMENTROOT_SIMPLEALLMAP_FEATURE_ID:
        getTarget().setFeature(DocumentRootMixedFeatureGroup.Feature.SIMPLEALLMAP);
        return;
      default:
        throw new IllegalArgumentException("EStructuralFeature " + eStructuralFeature + " not supported here");
      }
    }

    /**
     * @generated
     */
    public Object getValue() {
      return getTarget().getValue();
    }

    /**
     * @generated
     */
    public void setValue(final Object value) {
      getTarget().setValue(getTarget().getFeature(), value);
    }
  }

  /**
   * The wrapper/adapter for the Feature Group '<em><b>SimpleAllMapType.allMap</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class SimpleAllMapTypeAllMapFeatureGroupModelFeatureMapEntry<E extends SimpleAllMapTypeAllMapFeatureGroup>
      extends AbstractModelFeatureMapEntry<SimpleAllMapTypeAllMapFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case AAA:
        return GroupallModelPackage.INSTANCE.getSimpleAllMapType_Aaa();
      case BBB:
        return GroupallModelPackage.INSTANCE.getSimpleAllMapType_Bbb();
      case CCC:
        return GroupallModelPackage.INSTANCE.getSimpleAllMapType_Ccc();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = GroupallModelPackage.INSTANCE.getSimpleAllMapTypeEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case GroupallModelPackage.SIMPLEALLMAPTYPE_AAA_FEATURE_ID:
        getTarget().setFeature(SimpleAllMapTypeAllMapFeatureGroup.Feature.AAA);
        return;
      case GroupallModelPackage.SIMPLEALLMAPTYPE_BBB_FEATURE_ID:
        getTarget().setFeature(SimpleAllMapTypeAllMapFeatureGroup.Feature.BBB);
        return;
      case GroupallModelPackage.SIMPLEALLMAPTYPE_CCC_FEATURE_ID:
        getTarget().setFeature(SimpleAllMapTypeAllMapFeatureGroup.Feature.CCC);
        return;
      default:
        throw new IllegalArgumentException("EStructuralFeature " + eStructuralFeature + " not supported here");
      }
    }

    /**
     * @generated
     */
    public Object getValue() {
      return getTarget().getValue();
    }

    /**
     * @generated
     */
    public void setValue(final Object value) {
      getTarget().setValue(getTarget().getFeature(), value);
    }
  }
}