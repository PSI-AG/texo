package org.eclipse.emf.texo.test.model.schemaconstructs.simplefeaturemap;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model:
 * org.eclipse.emf.texo.test.model.schemaconstructs.simplefeaturemap. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SimplefeaturemapModelFactory implements ModelFactory {

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
    case SimplefeaturemapModelPackage.PURCHASEORDER_CLASSIFIER_ID:
      return createPurchaseOrder();
    case SimplefeaturemapModelPackage.SUPPLIER_CLASSIFIER_ID:
      return createSupplier();
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
    case SimplefeaturemapModelPackage.PURCHASEORDER_CLASSIFIER_ID:
      modelObject = new PurchaseOrderModelObject();
      break;
    case SimplefeaturemapModelPackage.SUPPLIER_CLASSIFIER_ID:
      modelObject = new SupplierModelObject();
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
    if (eFeature == SimplefeaturemapModelPackage.INSTANCE.getSupplier_Orders()) {
      return new SupplierOrdersFeatureGroup();
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
    if (eFeature == SimplefeaturemapModelPackage.INSTANCE.getSupplier_Orders()) {
      final SupplierOrdersFeatureGroupModelFeatureMapEntry<SupplierOrdersFeatureGroup> entry = new SupplierOrdersFeatureGroupModelFeatureMapEntry<SupplierOrdersFeatureGroup>();
      entry.setTarget((SupplierOrdersFeatureGroup) adaptee);
      return entry;
    }
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PurchaseOrder
   * @generated
   */
  public PurchaseOrder createPurchaseOrder() {
    return new PurchaseOrder();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Supplier
   * @generated
   */
  public Supplier createSupplier() {
    return new Supplier();
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
   * The adapter/wrapper for the EClass '<em><b>PurchaseOrder</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PurchaseOrderModelObject<E extends PurchaseOrder> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SimplefeaturemapModelPackage.INSTANCE.getPurchaseOrderEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SimplefeaturemapModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SimplefeaturemapModelPackage.PURCHASEORDER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SimplefeaturemapModelPackage.PURCHASEORDER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SimplefeaturemapModelPackage.PURCHASEORDER_NAME_FEATURE_ID:
        return getTarget().getName();
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
      case SimplefeaturemapModelPackage.PURCHASEORDER_NAME_FEATURE_ID:
        getTarget().setName((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Supplier</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SupplierModelObject<E extends Supplier> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SimplefeaturemapModelPackage.INSTANCE.getSupplierEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SimplefeaturemapModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SimplefeaturemapModelPackage.SUPPLIER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SimplefeaturemapModelPackage.SUPPLIER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SimplefeaturemapModelPackage.SUPPLIER_NAME_FEATURE_ID:
        return getTarget().getName();
      case SimplefeaturemapModelPackage.SUPPLIER_ORDERS_FEATURE_ID:
        return getTarget().getOrders();
      case SimplefeaturemapModelPackage.SUPPLIER_PREFERREDORDERS_FEATURE_ID:
        return getTarget().getPreferredOrders();
      case SimplefeaturemapModelPackage.SUPPLIER_STANDARDORDERS_FEATURE_ID:
        return getTarget().getStandardOrders();
      case SimplefeaturemapModelPackage.SUPPLIER_HARDCOPYORDERREFERENCE_FEATURE_ID:
        return getTarget().getHardCopyOrderReference();
      case SimplefeaturemapModelPackage.SUPPLIER_HARDCOPYORDERNUMBER_FEATURE_ID:
        return getTarget().getHardCopyOrderNumber();
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
      case SimplefeaturemapModelPackage.SUPPLIER_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case SimplefeaturemapModelPackage.SUPPLIER_ORDERS_FEATURE_ID:
        getTarget().setOrders((List<SupplierOrdersFeatureGroup>) value);
        return;
      case SimplefeaturemapModelPackage.SUPPLIER_PREFERREDORDERS_FEATURE_ID:
        getTarget().setPreferredOrders((List<PurchaseOrder>) value);
        return;
      case SimplefeaturemapModelPackage.SUPPLIER_STANDARDORDERS_FEATURE_ID:
        getTarget().setStandardOrders((List<PurchaseOrder>) value);
        return;
      case SimplefeaturemapModelPackage.SUPPLIER_HARDCOPYORDERREFERENCE_FEATURE_ID:
        getTarget().setHardCopyOrderReference((List<String>) value);
        return;
      case SimplefeaturemapModelPackage.SUPPLIER_HARDCOPYORDERNUMBER_FEATURE_ID:
        getTarget().setHardCopyOrderNumber((List<Long>) value);
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

      case SimplefeaturemapModelPackage.SUPPLIER_ORDERS_FEATURE_ID:
        return getTarget().getOrders().add((SupplierOrdersFeatureGroup) value);

      case SimplefeaturemapModelPackage.SUPPLIER_PREFERREDORDERS_FEATURE_ID:
        return getTarget().getPreferredOrders().add((PurchaseOrder) value);

      case SimplefeaturemapModelPackage.SUPPLIER_STANDARDORDERS_FEATURE_ID:
        return getTarget().getStandardOrders().add((PurchaseOrder) value);

      case SimplefeaturemapModelPackage.SUPPLIER_HARDCOPYORDERREFERENCE_FEATURE_ID:
        return getTarget().getHardCopyOrderReference().add((String) value);

      case SimplefeaturemapModelPackage.SUPPLIER_HARDCOPYORDERNUMBER_FEATURE_ID:
        return getTarget().getHardCopyOrderNumber().add((Long) value);
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

      case SimplefeaturemapModelPackage.SUPPLIER_ORDERS_FEATURE_ID:
        return getTarget().getOrders().remove(value);

      case SimplefeaturemapModelPackage.SUPPLIER_PREFERREDORDERS_FEATURE_ID:
        return getTarget().getPreferredOrders().remove(value);

      case SimplefeaturemapModelPackage.SUPPLIER_STANDARDORDERS_FEATURE_ID:
        return getTarget().getStandardOrders().remove(value);

      case SimplefeaturemapModelPackage.SUPPLIER_HARDCOPYORDERREFERENCE_FEATURE_ID:
        return getTarget().getHardCopyOrderReference().remove(value);

      case SimplefeaturemapModelPackage.SUPPLIER_HARDCOPYORDERNUMBER_FEATURE_ID:
        return getTarget().getHardCopyOrderNumber().remove(value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The wrapper/adapter for the Feature Group '<em><b>Supplier.orders</b></em>'.
   * 
   * @param <E>
   *          the Feature Group class
   * @generated
   */
  public static class SupplierOrdersFeatureGroupModelFeatureMapEntry<E extends SupplierOrdersFeatureGroup> extends
      AbstractModelFeatureMapEntry<SupplierOrdersFeatureGroup> {

    /**
     * @generated
     */
    public EStructuralFeature getEStructuralFeature() {
      switch (getTarget().getFeature()) {
      case PREFERREDORDERS:
        return SimplefeaturemapModelPackage.INSTANCE.getSupplier_PreferredOrders();
      case STANDARDORDERS:
        return SimplefeaturemapModelPackage.INSTANCE.getSupplier_StandardOrders();
      case HARDCOPYORDERREFERENCE:
        return SimplefeaturemapModelPackage.INSTANCE.getSupplier_HardCopyOrderReference();
      case HARDCOPYORDERNUMBER:
        return SimplefeaturemapModelPackage.INSTANCE.getSupplier_HardCopyOrderNumber();
      default:
        throw new IllegalArgumentException("No eStructuralFeature for feature kind " + getTarget().getFeature());
      }
    }

    /**
     * @generated
     */
    public void setEStructuralFeature(final EStructuralFeature eStructuralFeature) {

      final EClass eClass = SimplefeaturemapModelPackage.INSTANCE.getSupplierEClass();
      switch (eClass.getFeatureID(eStructuralFeature)) {
      case SimplefeaturemapModelPackage.SUPPLIER_PREFERREDORDERS_FEATURE_ID:
        getTarget().setFeature(SupplierOrdersFeatureGroup.Feature.PREFERREDORDERS);
        return;
      case SimplefeaturemapModelPackage.SUPPLIER_STANDARDORDERS_FEATURE_ID:
        getTarget().setFeature(SupplierOrdersFeatureGroup.Feature.STANDARDORDERS);
        return;
      case SimplefeaturemapModelPackage.SUPPLIER_HARDCOPYORDERREFERENCE_FEATURE_ID:
        getTarget().setFeature(SupplierOrdersFeatureGroup.Feature.HARDCOPYORDERREFERENCE);
        return;
      case SimplefeaturemapModelPackage.SUPPLIER_HARDCOPYORDERNUMBER_FEATURE_ID:
        getTarget().setFeature(SupplierOrdersFeatureGroup.Feature.HARDCOPYORDERNUMBER);
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