package org.eclipse.emf.texo.test.model.samples.catalog;

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
 * The <b>{@link ModelFactory}</b> for the types of this model: org.eclipse.emf.texo.test.model.samples.catalog. It
 * contains code to create instances {@link ModelObject} wrappers and instances for EClasses and convert objects back
 * and forth from their String (XML) representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CatalogModelFactory implements ModelFactory {

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
    case CatalogModelPackage.CATALOGTYPE_CLASSIFIER_ID:
      return createCatalogType();
    case CatalogModelPackage.PRODUCTTYPE_CLASSIFIER_ID:
      return createProductType();
    case CatalogModelPackage.PRICETYPE_CLASSIFIER_ID:
      return createPriceType();
    case CatalogModelPackage.SUPPLIERTYPE_CLASSIFIER_ID:
      return createSupplierType();
    case CatalogModelPackage.STRINGTYPE_CLASSIFIER_ID:
      return createStringType();
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
    case CatalogModelPackage.CATALOGTYPE_CLASSIFIER_ID:
      modelObject = new CatalogTypeModelObject();
      break;
    case CatalogModelPackage.PRODUCTTYPE_CLASSIFIER_ID:
      modelObject = new ProductTypeModelObject();
      break;
    case CatalogModelPackage.PRICETYPE_CLASSIFIER_ID:
      modelObject = new PriceTypeModelObject();
      break;
    case CatalogModelPackage.SUPPLIERTYPE_CLASSIFIER_ID:
      modelObject = new SupplierTypeModelObject();
      break;
    case CatalogModelPackage.STRINGTYPE_CLASSIFIER_ID:
      modelObject = new StringTypeModelObject();
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
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CatalogType
   * @generated
   */
  public CatalogType createCatalogType() {
    return new CatalogType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ProductType
   * @generated
   */
  public ProductType createProductType() {
    return new ProductType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PriceType
   * @generated
   */
  public PriceType createPriceType() {
    return new PriceType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SupplierType
   * @generated
   */
  public SupplierType createSupplierType() {
    return new SupplierType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass StringType
   * @generated
   */
  public StringType createStringType() {
    return new StringType();
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
   * The adapter/wrapper for the EClass '<em><b>CatalogType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CatalogTypeModelObject<E extends CatalogType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CatalogModelPackage.INSTANCE.getCatalogTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CatalogModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CatalogModelPackage.CATALOGTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CatalogModelPackage.CATALOGTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CatalogModelPackage.CATALOGTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CatalogModelPackage.CATALOGTYPE_DESCRIPTION_FEATURE_ID:
        return getTarget().getDescription();
      case CatalogModelPackage.CATALOGTYPE_SUBCATALOG_FEATURE_ID:
        return getTarget().getSubCatalog();
      case CatalogModelPackage.CATALOGTYPE_PRODUCT_FEATURE_ID:
        return getTarget().getProduct();
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
      case CatalogModelPackage.CATALOGTYPE_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case CatalogModelPackage.CATALOGTYPE_DESCRIPTION_FEATURE_ID:
        getTarget().setDescription((String) value);
        return;
      case CatalogModelPackage.CATALOGTYPE_SUBCATALOG_FEATURE_ID:
        getTarget().setSubCatalog((List<CatalogType>) value);
        return;
      case CatalogModelPackage.CATALOGTYPE_PRODUCT_FEATURE_ID:
        getTarget().setProduct((List<ProductType>) value);
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

      case CatalogModelPackage.CATALOGTYPE_SUBCATALOG_FEATURE_ID:
        return getTarget().addToSubCatalog((CatalogType) value);

      case CatalogModelPackage.CATALOGTYPE_PRODUCT_FEATURE_ID:
        return getTarget().addToProduct((ProductType) value);
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

      case CatalogModelPackage.CATALOGTYPE_SUBCATALOG_FEATURE_ID:
        return getTarget().removeFromSubCatalog((CatalogType) value);

      case CatalogModelPackage.CATALOGTYPE_PRODUCT_FEATURE_ID:
        return getTarget().removeFromProduct((ProductType) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ProductType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ProductTypeModelObject<E extends ProductType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CatalogModelPackage.INSTANCE.getProductTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CatalogModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CatalogModelPackage.PRODUCTTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CatalogModelPackage.PRODUCTTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CatalogModelPackage.PRODUCTTYPE_CODE_FEATURE_ID:
        return getTarget().getCode();
      case CatalogModelPackage.PRODUCTTYPE_DESCRIPTION_FEATURE_ID:
        return getTarget().getDescription();
      case CatalogModelPackage.PRODUCTTYPE_REMARK_FEATURE_ID:
        return getTarget().getRemark();
      case CatalogModelPackage.PRODUCTTYPE_PRICE_FEATURE_ID:
        return getTarget().getPrice();
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
      case CatalogModelPackage.PRODUCTTYPE_CODE_FEATURE_ID:
        getTarget().setCode((String) value);
        return;
      case CatalogModelPackage.PRODUCTTYPE_DESCRIPTION_FEATURE_ID:
        getTarget().setDescription((String) value);
        return;
      case CatalogModelPackage.PRODUCTTYPE_REMARK_FEATURE_ID:
        getTarget().setRemark((List<StringType>) value);
        return;
      case CatalogModelPackage.PRODUCTTYPE_PRICE_FEATURE_ID:
        getTarget().setPrice((PriceType) value);
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

      case CatalogModelPackage.PRODUCTTYPE_REMARK_FEATURE_ID:
        return getTarget().addToRemark((StringType) value);

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

      case CatalogModelPackage.PRODUCTTYPE_REMARK_FEATURE_ID:
        return getTarget().removeFromRemark((StringType) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>PriceType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PriceTypeModelObject<E extends PriceType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CatalogModelPackage.INSTANCE.getPriceTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CatalogModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CatalogModelPackage.PRICETYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CatalogModelPackage.PRICETYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CatalogModelPackage.PRICETYPE_PRICE_FEATURE_ID:
        return getTarget().getPrice();
      case CatalogModelPackage.PRICETYPE_QUANTITYTO_FEATURE_ID:
        return getTarget().getQuantityTo();
      case CatalogModelPackage.PRICETYPE_SUPPLIER_FEATURE_ID:
        return getTarget().getSupplier();
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
      case CatalogModelPackage.PRICETYPE_PRICE_FEATURE_ID:
        getTarget().setPrice((Double) value);
        return;
      case CatalogModelPackage.PRICETYPE_QUANTITYTO_FEATURE_ID:
        getTarget().setQuantityTo((Double) value);
        return;
      case CatalogModelPackage.PRICETYPE_SUPPLIER_FEATURE_ID:
        getTarget().setSupplier((SupplierType) value);
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
   * The adapter/wrapper for the EClass '<em><b>SupplierType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SupplierTypeModelObject<E extends SupplierType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CatalogModelPackage.INSTANCE.getSupplierTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CatalogModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CatalogModelPackage.SUPPLIERTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CatalogModelPackage.SUPPLIERTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CatalogModelPackage.SUPPLIERTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case CatalogModelPackage.SUPPLIERTYPE_NOOFEMPLOYEES_FEATURE_ID:
        return getTarget().getNoOfEmployees();
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
      case CatalogModelPackage.SUPPLIERTYPE_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case CatalogModelPackage.SUPPLIERTYPE_NOOFEMPLOYEES_FEATURE_ID:
        getTarget().setNoOfEmployees((Integer) value);
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
   * The adapter/wrapper for the EClass '<em><b>StringType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class StringTypeModelObject<E extends StringType> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return CatalogModelPackage.INSTANCE.getStringTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return CatalogModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case CatalogModelPackage.STRINGTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case CatalogModelPackage.STRINGTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case CatalogModelPackage.STRINGTYPE_VALUE_FEATURE_ID:
        return getTarget().getValue();
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
      case CatalogModelPackage.STRINGTYPE_VALUE_FEATURE_ID:
        getTarget().setValue((String) value);
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
}