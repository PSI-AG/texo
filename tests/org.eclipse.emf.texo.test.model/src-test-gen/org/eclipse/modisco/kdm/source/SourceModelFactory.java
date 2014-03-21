package org.eclipse.modisco.kdm.source;

import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.modisco.kdm.core.CoreModelFactory;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.kdm.KdmModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: source. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SourceModelFactory implements ModelFactory {

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
    case SourceModelPackage.INVENTORYMODEL_CLASSIFIER_ID:
      return createInventoryModel();
    case SourceModelPackage.INVENTORYITEM_CLASSIFIER_ID:
      return createInventoryItem();
    case SourceModelPackage.SOURCEFILE_CLASSIFIER_ID:
      return createSourceFile();
    case SourceModelPackage.IMAGE_CLASSIFIER_ID:
      return createImage();
    case SourceModelPackage.CONFIGURATION_CLASSIFIER_ID:
      return createConfiguration();
    case SourceModelPackage.RESOURCEDESCRIPTION_CLASSIFIER_ID:
      return createResourceDescription();
    case SourceModelPackage.BINARYFILE_CLASSIFIER_ID:
      return createBinaryFile();
    case SourceModelPackage.EXECUTABLEFILE_CLASSIFIER_ID:
      return createExecutableFile();
    case SourceModelPackage.INVENTORYCONTAINER_CLASSIFIER_ID:
      return createInventoryContainer();
    case SourceModelPackage.DIRECTORY_CLASSIFIER_ID:
      return createDirectory();
    case SourceModelPackage.PROJECT_CLASSIFIER_ID:
      return createProject();
    case SourceModelPackage.DEPENDSON_CLASSIFIER_ID:
      return createDependsOn();
    case SourceModelPackage.SOURCEREF_CLASSIFIER_ID:
      return createSourceRef();
    case SourceModelPackage.SOURCEREGION_CLASSIFIER_ID:
      return createSourceRegion();
    case SourceModelPackage.INVENTORYELEMENT_CLASSIFIER_ID:
      return createInventoryElement();
    case SourceModelPackage.INVENTORYRELATIONSHIP_CLASSIFIER_ID:
      return createInventoryRelationship();
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
    case SourceModelPackage.INVENTORYMODEL_CLASSIFIER_ID:
      modelObject = new InventoryModelModelObject();
      break;
    case SourceModelPackage.ABSTRACTINVENTORYELEMENT_CLASSIFIER_ID:
      modelObject = new AbstractInventoryElementModelObject();
      break;
    case SourceModelPackage.ABSTRACTINVENTORYRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new AbstractInventoryRelationshipModelObject();
      break;
    case SourceModelPackage.INVENTORYITEM_CLASSIFIER_ID:
      modelObject = new InventoryItemModelObject();
      break;
    case SourceModelPackage.SOURCEFILE_CLASSIFIER_ID:
      modelObject = new SourceFileModelObject();
      break;
    case SourceModelPackage.IMAGE_CLASSIFIER_ID:
      modelObject = new ImageModelObject();
      break;
    case SourceModelPackage.CONFIGURATION_CLASSIFIER_ID:
      modelObject = new ConfigurationModelObject();
      break;
    case SourceModelPackage.RESOURCEDESCRIPTION_CLASSIFIER_ID:
      modelObject = new ResourceDescriptionModelObject();
      break;
    case SourceModelPackage.BINARYFILE_CLASSIFIER_ID:
      modelObject = new BinaryFileModelObject();
      break;
    case SourceModelPackage.EXECUTABLEFILE_CLASSIFIER_ID:
      modelObject = new ExecutableFileModelObject();
      break;
    case SourceModelPackage.INVENTORYCONTAINER_CLASSIFIER_ID:
      modelObject = new InventoryContainerModelObject();
      break;
    case SourceModelPackage.DIRECTORY_CLASSIFIER_ID:
      modelObject = new DirectoryModelObject();
      break;
    case SourceModelPackage.PROJECT_CLASSIFIER_ID:
      modelObject = new ProjectModelObject();
      break;
    case SourceModelPackage.DEPENDSON_CLASSIFIER_ID:
      modelObject = new DependsOnModelObject();
      break;
    case SourceModelPackage.SOURCEREF_CLASSIFIER_ID:
      modelObject = new SourceRefModelObject();
      break;
    case SourceModelPackage.SOURCEREGION_CLASSIFIER_ID:
      modelObject = new SourceRegionModelObject();
      break;
    case SourceModelPackage.INVENTORYELEMENT_CLASSIFIER_ID:
      modelObject = new InventoryElementModelObject();
      break;
    case SourceModelPackage.INVENTORYRELATIONSHIP_CLASSIFIER_ID:
      modelObject = new InventoryRelationshipModelObject();
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
   * @return an instance of the model object representing the EClass InventoryModel
   * @generated
   */
  public InventoryModel createInventoryModel() {
    return new InventoryModel();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass InventoryItem
   * @generated
   */
  public InventoryItem createInventoryItem() {
    return new InventoryItem();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SourceFile
   * @generated
   */
  public SourceFile createSourceFile() {
    return new SourceFile();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Image
   * @generated
   */
  public Image createImage() {
    return new Image();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Configuration
   * @generated
   */
  public Configuration createConfiguration() {
    return new Configuration();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ResourceDescription
   * @generated
   */
  public ResourceDescription createResourceDescription() {
    return new ResourceDescription();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BinaryFile
   * @generated
   */
  public BinaryFile createBinaryFile() {
    return new BinaryFile();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ExecutableFile
   * @generated
   */
  public ExecutableFile createExecutableFile() {
    return new ExecutableFile();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass InventoryContainer
   * @generated
   */
  public InventoryContainer createInventoryContainer() {
    return new InventoryContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Directory
   * @generated
   */
  public Directory createDirectory() {
    return new Directory();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Project
   * @generated
   */
  public Project createProject() {
    return new Project();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DependsOn
   * @generated
   */
  public DependsOn createDependsOn() {
    return new DependsOn();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SourceRef
   * @generated
   */
  public SourceRef createSourceRef() {
    return new SourceRef();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SourceRegion
   * @generated
   */
  public SourceRegion createSourceRegion() {
    return new SourceRegion();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass InventoryElement
   * @generated
   */
  public InventoryElement createInventoryElement() {
    return new InventoryElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass InventoryRelationship
   * @generated
   */
  public InventoryRelationship createInventoryRelationship() {
    return new InventoryRelationship();
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
   * The adapter/wrapper for the EClass '<em><b>InventoryModel</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InventoryModelModelObject<E extends InventoryModel> extends
      KdmModelFactory.KDMModelModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getInventoryModelEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.INVENTORYMODEL_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.INVENTORYMODEL_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.INVENTORYMODEL_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.INVENTORYMODEL_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.INVENTORYMODEL_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case SourceModelPackage.INVENTORYMODEL_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case SourceModelPackage.INVENTORYMODEL_AUDIT_FEATURE_ID:
        return getTarget().getAudit();
      case SourceModelPackage.INVENTORYMODEL_EXTENSION_FEATURE_ID:
        return getTarget().getExtension();
      case SourceModelPackage.INVENTORYMODEL_NAME_FEATURE_ID:
        return getTarget().getName();
      case SourceModelPackage.INVENTORYMODEL_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case SourceModelPackage.INVENTORYMODEL_INVENTORYELEMENT_FEATURE_ID:
        return getTarget().getInventoryElement();
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
      case SourceModelPackage.INVENTORYMODEL_INVENTORYELEMENT_FEATURE_ID:
        getTarget().setInventoryElement((Set<AbstractInventoryElement>) value);
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

      case SourceModelPackage.INVENTORYMODEL_INVENTORYELEMENT_FEATURE_ID:
        return getTarget().addToInventoryElement((AbstractInventoryElement) value);
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

      case SourceModelPackage.INVENTORYMODEL_INVENTORYELEMENT_FEATURE_ID:
        return getTarget().removeFromInventoryElement((AbstractInventoryElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractInventoryElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractInventoryElementModelObject<E extends AbstractInventoryElement> extends
      CoreModelFactory.KDMEntityModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getAbstractInventoryElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().getInventoryRelationship();
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
      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_INVENTORYRELATIONSHIP_FEATURE_ID:
        getTarget().setInventoryRelationship((Set<AbstractInventoryRelationship>) value);
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

      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().addToInventoryRelationship((AbstractInventoryRelationship) value);
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

      case SourceModelPackage.ABSTRACTINVENTORYELEMENT_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().removeFromInventoryRelationship((AbstractInventoryRelationship) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractInventoryRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractInventoryRelationshipModelObject<E extends AbstractInventoryRelationship> extends
      CoreModelFactory.KDMRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getAbstractInventoryRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.ABSTRACTINVENTORYRELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.ABSTRACTINVENTORYRELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.ABSTRACTINVENTORYRELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.ABSTRACTINVENTORYRELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.ABSTRACTINVENTORYRELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case SourceModelPackage.ABSTRACTINVENTORYRELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
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
   * The adapter/wrapper for the EClass '<em><b>InventoryItem</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InventoryItemModelObject<E extends InventoryItem> extends AbstractInventoryElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getInventoryItemEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.INVENTORYITEM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.INVENTORYITEM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.INVENTORYITEM_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.INVENTORYITEM_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.INVENTORYITEM_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case SourceModelPackage.INVENTORYITEM_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case SourceModelPackage.INVENTORYITEM_NAME_FEATURE_ID:
        return getTarget().getName();
      case SourceModelPackage.INVENTORYITEM_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case SourceModelPackage.INVENTORYITEM_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case SourceModelPackage.INVENTORYITEM_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case SourceModelPackage.INVENTORYITEM_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case SourceModelPackage.INVENTORYITEM_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case SourceModelPackage.INVENTORYITEM_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case SourceModelPackage.INVENTORYITEM_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case SourceModelPackage.INVENTORYITEM_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case SourceModelPackage.INVENTORYITEM_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case SourceModelPackage.INVENTORYITEM_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case SourceModelPackage.INVENTORYITEM_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().getInventoryRelationship();
      case SourceModelPackage.INVENTORYITEM_VERSION_FEATURE_ID:
        return getTarget().getVersion();
      case SourceModelPackage.INVENTORYITEM_PATH_FEATURE_ID:
        return getTarget().getPath();
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
      case SourceModelPackage.INVENTORYITEM_VERSION_FEATURE_ID:
        getTarget().setVersion((String) value);
        return;
      case SourceModelPackage.INVENTORYITEM_PATH_FEATURE_ID:
        getTarget().setPath((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>SourceFile</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SourceFileModelObject<E extends SourceFile> extends InventoryItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getSourceFileEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.SOURCEFILE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.SOURCEFILE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.SOURCEFILE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.SOURCEFILE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.SOURCEFILE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case SourceModelPackage.SOURCEFILE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case SourceModelPackage.SOURCEFILE_NAME_FEATURE_ID:
        return getTarget().getName();
      case SourceModelPackage.SOURCEFILE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case SourceModelPackage.SOURCEFILE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case SourceModelPackage.SOURCEFILE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case SourceModelPackage.SOURCEFILE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case SourceModelPackage.SOURCEFILE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case SourceModelPackage.SOURCEFILE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case SourceModelPackage.SOURCEFILE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case SourceModelPackage.SOURCEFILE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case SourceModelPackage.SOURCEFILE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case SourceModelPackage.SOURCEFILE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case SourceModelPackage.SOURCEFILE_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().getInventoryRelationship();
      case SourceModelPackage.SOURCEFILE_VERSION_FEATURE_ID:
        return getTarget().getVersion();
      case SourceModelPackage.SOURCEFILE_PATH_FEATURE_ID:
        return getTarget().getPath();
      case SourceModelPackage.SOURCEFILE_LANGUAGE_FEATURE_ID:
        return getTarget().getLanguage();
      case SourceModelPackage.SOURCEFILE_ENCODING_FEATURE_ID:
        return getTarget().getEncoding();
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
      case SourceModelPackage.SOURCEFILE_LANGUAGE_FEATURE_ID:
        getTarget().setLanguage((String) value);
        return;
      case SourceModelPackage.SOURCEFILE_ENCODING_FEATURE_ID:
        getTarget().setEncoding((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Image</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ImageModelObject<E extends Image> extends InventoryItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getImageEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.IMAGE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.IMAGE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.IMAGE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.IMAGE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.IMAGE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case SourceModelPackage.IMAGE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case SourceModelPackage.IMAGE_NAME_FEATURE_ID:
        return getTarget().getName();
      case SourceModelPackage.IMAGE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case SourceModelPackage.IMAGE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case SourceModelPackage.IMAGE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case SourceModelPackage.IMAGE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case SourceModelPackage.IMAGE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case SourceModelPackage.IMAGE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case SourceModelPackage.IMAGE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case SourceModelPackage.IMAGE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case SourceModelPackage.IMAGE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case SourceModelPackage.IMAGE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case SourceModelPackage.IMAGE_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().getInventoryRelationship();
      case SourceModelPackage.IMAGE_VERSION_FEATURE_ID:
        return getTarget().getVersion();
      case SourceModelPackage.IMAGE_PATH_FEATURE_ID:
        return getTarget().getPath();
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
   * The adapter/wrapper for the EClass '<em><b>Configuration</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConfigurationModelObject<E extends Configuration> extends InventoryItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getConfigurationEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.CONFIGURATION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.CONFIGURATION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.CONFIGURATION_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.CONFIGURATION_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.CONFIGURATION_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case SourceModelPackage.CONFIGURATION_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case SourceModelPackage.CONFIGURATION_NAME_FEATURE_ID:
        return getTarget().getName();
      case SourceModelPackage.CONFIGURATION_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case SourceModelPackage.CONFIGURATION_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case SourceModelPackage.CONFIGURATION_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case SourceModelPackage.CONFIGURATION_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case SourceModelPackage.CONFIGURATION_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case SourceModelPackage.CONFIGURATION_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case SourceModelPackage.CONFIGURATION_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case SourceModelPackage.CONFIGURATION_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case SourceModelPackage.CONFIGURATION_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case SourceModelPackage.CONFIGURATION_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case SourceModelPackage.CONFIGURATION_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().getInventoryRelationship();
      case SourceModelPackage.CONFIGURATION_VERSION_FEATURE_ID:
        return getTarget().getVersion();
      case SourceModelPackage.CONFIGURATION_PATH_FEATURE_ID:
        return getTarget().getPath();
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
   * The adapter/wrapper for the EClass '<em><b>ResourceDescription</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ResourceDescriptionModelObject<E extends ResourceDescription> extends InventoryItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getResourceDescriptionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.RESOURCEDESCRIPTION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.RESOURCEDESCRIPTION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.RESOURCEDESCRIPTION_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.RESOURCEDESCRIPTION_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.RESOURCEDESCRIPTION_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case SourceModelPackage.RESOURCEDESCRIPTION_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case SourceModelPackage.RESOURCEDESCRIPTION_NAME_FEATURE_ID:
        return getTarget().getName();
      case SourceModelPackage.RESOURCEDESCRIPTION_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case SourceModelPackage.RESOURCEDESCRIPTION_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case SourceModelPackage.RESOURCEDESCRIPTION_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case SourceModelPackage.RESOURCEDESCRIPTION_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case SourceModelPackage.RESOURCEDESCRIPTION_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case SourceModelPackage.RESOURCEDESCRIPTION_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case SourceModelPackage.RESOURCEDESCRIPTION_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case SourceModelPackage.RESOURCEDESCRIPTION_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case SourceModelPackage.RESOURCEDESCRIPTION_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case SourceModelPackage.RESOURCEDESCRIPTION_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case SourceModelPackage.RESOURCEDESCRIPTION_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().getInventoryRelationship();
      case SourceModelPackage.RESOURCEDESCRIPTION_VERSION_FEATURE_ID:
        return getTarget().getVersion();
      case SourceModelPackage.RESOURCEDESCRIPTION_PATH_FEATURE_ID:
        return getTarget().getPath();
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
   * The adapter/wrapper for the EClass '<em><b>BinaryFile</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BinaryFileModelObject<E extends BinaryFile> extends InventoryItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getBinaryFileEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.BINARYFILE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.BINARYFILE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.BINARYFILE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.BINARYFILE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.BINARYFILE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case SourceModelPackage.BINARYFILE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case SourceModelPackage.BINARYFILE_NAME_FEATURE_ID:
        return getTarget().getName();
      case SourceModelPackage.BINARYFILE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case SourceModelPackage.BINARYFILE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case SourceModelPackage.BINARYFILE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case SourceModelPackage.BINARYFILE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case SourceModelPackage.BINARYFILE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case SourceModelPackage.BINARYFILE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case SourceModelPackage.BINARYFILE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case SourceModelPackage.BINARYFILE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case SourceModelPackage.BINARYFILE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case SourceModelPackage.BINARYFILE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case SourceModelPackage.BINARYFILE_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().getInventoryRelationship();
      case SourceModelPackage.BINARYFILE_VERSION_FEATURE_ID:
        return getTarget().getVersion();
      case SourceModelPackage.BINARYFILE_PATH_FEATURE_ID:
        return getTarget().getPath();
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
   * The adapter/wrapper for the EClass '<em><b>ExecutableFile</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ExecutableFileModelObject<E extends ExecutableFile> extends InventoryItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getExecutableFileEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.EXECUTABLEFILE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.EXECUTABLEFILE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.EXECUTABLEFILE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.EXECUTABLEFILE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.EXECUTABLEFILE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case SourceModelPackage.EXECUTABLEFILE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case SourceModelPackage.EXECUTABLEFILE_NAME_FEATURE_ID:
        return getTarget().getName();
      case SourceModelPackage.EXECUTABLEFILE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case SourceModelPackage.EXECUTABLEFILE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case SourceModelPackage.EXECUTABLEFILE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case SourceModelPackage.EXECUTABLEFILE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case SourceModelPackage.EXECUTABLEFILE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case SourceModelPackage.EXECUTABLEFILE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case SourceModelPackage.EXECUTABLEFILE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case SourceModelPackage.EXECUTABLEFILE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case SourceModelPackage.EXECUTABLEFILE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case SourceModelPackage.EXECUTABLEFILE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case SourceModelPackage.EXECUTABLEFILE_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().getInventoryRelationship();
      case SourceModelPackage.EXECUTABLEFILE_VERSION_FEATURE_ID:
        return getTarget().getVersion();
      case SourceModelPackage.EXECUTABLEFILE_PATH_FEATURE_ID:
        return getTarget().getPath();
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
   * The adapter/wrapper for the EClass '<em><b>InventoryContainer</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InventoryContainerModelObject<E extends InventoryContainer> extends
      AbstractInventoryElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getInventoryContainerEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.INVENTORYCONTAINER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.INVENTORYCONTAINER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.INVENTORYCONTAINER_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.INVENTORYCONTAINER_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.INVENTORYCONTAINER_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case SourceModelPackage.INVENTORYCONTAINER_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case SourceModelPackage.INVENTORYCONTAINER_NAME_FEATURE_ID:
        return getTarget().getName();
      case SourceModelPackage.INVENTORYCONTAINER_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case SourceModelPackage.INVENTORYCONTAINER_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case SourceModelPackage.INVENTORYCONTAINER_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case SourceModelPackage.INVENTORYCONTAINER_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case SourceModelPackage.INVENTORYCONTAINER_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case SourceModelPackage.INVENTORYCONTAINER_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case SourceModelPackage.INVENTORYCONTAINER_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case SourceModelPackage.INVENTORYCONTAINER_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case SourceModelPackage.INVENTORYCONTAINER_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case SourceModelPackage.INVENTORYCONTAINER_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case SourceModelPackage.INVENTORYCONTAINER_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().getInventoryRelationship();
      case SourceModelPackage.INVENTORYCONTAINER_INVENTORYELEMENT_FEATURE_ID:
        return getTarget().getInventoryElement();
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
      case SourceModelPackage.INVENTORYCONTAINER_INVENTORYELEMENT_FEATURE_ID:
        getTarget().setInventoryElement((Set<AbstractInventoryElement>) value);
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

      case SourceModelPackage.INVENTORYCONTAINER_INVENTORYELEMENT_FEATURE_ID:
        return getTarget().addToInventoryElement((AbstractInventoryElement) value);
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

      case SourceModelPackage.INVENTORYCONTAINER_INVENTORYELEMENT_FEATURE_ID:
        return getTarget().removeFromInventoryElement((AbstractInventoryElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Directory</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DirectoryModelObject<E extends Directory> extends InventoryContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getDirectoryEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.DIRECTORY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.DIRECTORY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.DIRECTORY_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.DIRECTORY_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.DIRECTORY_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case SourceModelPackage.DIRECTORY_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case SourceModelPackage.DIRECTORY_NAME_FEATURE_ID:
        return getTarget().getName();
      case SourceModelPackage.DIRECTORY_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case SourceModelPackage.DIRECTORY_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case SourceModelPackage.DIRECTORY_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case SourceModelPackage.DIRECTORY_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case SourceModelPackage.DIRECTORY_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case SourceModelPackage.DIRECTORY_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case SourceModelPackage.DIRECTORY_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case SourceModelPackage.DIRECTORY_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case SourceModelPackage.DIRECTORY_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case SourceModelPackage.DIRECTORY_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case SourceModelPackage.DIRECTORY_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().getInventoryRelationship();
      case SourceModelPackage.DIRECTORY_INVENTORYELEMENT_FEATURE_ID:
        return getTarget().getInventoryElement();
      case SourceModelPackage.DIRECTORY_PATH_FEATURE_ID:
        return getTarget().getPath();
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
      case SourceModelPackage.DIRECTORY_PATH_FEATURE_ID:
        getTarget().setPath((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>Project</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ProjectModelObject<E extends Project> extends InventoryContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getProjectEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.PROJECT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.PROJECT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.PROJECT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.PROJECT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.PROJECT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case SourceModelPackage.PROJECT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case SourceModelPackage.PROJECT_NAME_FEATURE_ID:
        return getTarget().getName();
      case SourceModelPackage.PROJECT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case SourceModelPackage.PROJECT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case SourceModelPackage.PROJECT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case SourceModelPackage.PROJECT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case SourceModelPackage.PROJECT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case SourceModelPackage.PROJECT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case SourceModelPackage.PROJECT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case SourceModelPackage.PROJECT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case SourceModelPackage.PROJECT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case SourceModelPackage.PROJECT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case SourceModelPackage.PROJECT_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().getInventoryRelationship();
      case SourceModelPackage.PROJECT_INVENTORYELEMENT_FEATURE_ID:
        return getTarget().getInventoryElement();
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
   * The adapter/wrapper for the EClass '<em><b>DependsOn</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DependsOnModelObject<E extends DependsOn> extends AbstractInventoryRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getDependsOnEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.DEPENDSON_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.DEPENDSON_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.DEPENDSON_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.DEPENDSON_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.DEPENDSON_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case SourceModelPackage.DEPENDSON_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case SourceModelPackage.DEPENDSON_TO_FEATURE_ID:
        return getTarget().getTo();
      case SourceModelPackage.DEPENDSON_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case SourceModelPackage.DEPENDSON_TO_FEATURE_ID:
        getTarget().setTo((AbstractInventoryElement) value);
        return;
      case SourceModelPackage.DEPENDSON_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractInventoryElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>SourceRef</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SourceRefModelObject<E extends SourceRef> extends CoreModelFactory.ElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getSourceRefEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.SOURCEREF_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.SOURCEREF_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.SOURCEREF_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.SOURCEREF_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.SOURCEREF_REGION_FEATURE_ID:
        return getTarget().getRegion();
      case SourceModelPackage.SOURCEREF_LANGUAGE_FEATURE_ID:
        return getTarget().getLanguage();
      case SourceModelPackage.SOURCEREF_SNIPPET_FEATURE_ID:
        return getTarget().getSnippet();
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
      case SourceModelPackage.SOURCEREF_REGION_FEATURE_ID:
        getTarget().setRegion((List<SourceRegion>) value);
        return;
      case SourceModelPackage.SOURCEREF_LANGUAGE_FEATURE_ID:
        getTarget().setLanguage((String) value);
        return;
      case SourceModelPackage.SOURCEREF_SNIPPET_FEATURE_ID:
        getTarget().setSnippet((String) value);
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

      case SourceModelPackage.SOURCEREF_REGION_FEATURE_ID:
        return getTarget().addToRegion((SourceRegion) value);

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

      case SourceModelPackage.SOURCEREF_REGION_FEATURE_ID:
        return getTarget().removeFromRegion((SourceRegion) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>SourceRegion</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SourceRegionModelObject<E extends SourceRegion> extends CoreModelFactory.ElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getSourceRegionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.SOURCEREGION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.SOURCEREGION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.SOURCEREGION_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.SOURCEREGION_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.SOURCEREGION_FILE_FEATURE_ID:
        return getTarget().getFile();
      case SourceModelPackage.SOURCEREGION_STARTLINE_FEATURE_ID:
        return getTarget().getStartLine();
      case SourceModelPackage.SOURCEREGION_STARTPOSITION_FEATURE_ID:
        return getTarget().getStartPosition();
      case SourceModelPackage.SOURCEREGION_ENDLINE_FEATURE_ID:
        return getTarget().getEndLine();
      case SourceModelPackage.SOURCEREGION_ENDPOSITION_FEATURE_ID:
        return getTarget().getEndPosition();
      case SourceModelPackage.SOURCEREGION_LANGUAGE_FEATURE_ID:
        return getTarget().getLanguage();
      case SourceModelPackage.SOURCEREGION_PATH_FEATURE_ID:
        return getTarget().getPath();
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
      case SourceModelPackage.SOURCEREGION_FILE_FEATURE_ID:
        getTarget().setFile((SourceFile) value);
        return;
      case SourceModelPackage.SOURCEREGION_STARTLINE_FEATURE_ID:
        getTarget().setStartLine((Integer) value);
        return;
      case SourceModelPackage.SOURCEREGION_STARTPOSITION_FEATURE_ID:
        getTarget().setStartPosition((Integer) value);
        return;
      case SourceModelPackage.SOURCEREGION_ENDLINE_FEATURE_ID:
        getTarget().setEndLine((Integer) value);
        return;
      case SourceModelPackage.SOURCEREGION_ENDPOSITION_FEATURE_ID:
        getTarget().setEndPosition((Integer) value);
        return;
      case SourceModelPackage.SOURCEREGION_LANGUAGE_FEATURE_ID:
        getTarget().setLanguage((String) value);
        return;
      case SourceModelPackage.SOURCEREGION_PATH_FEATURE_ID:
        getTarget().setPath((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>InventoryElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InventoryElementModelObject<E extends InventoryElement> extends
      AbstractInventoryElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getInventoryElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.INVENTORYELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.INVENTORYELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.INVENTORYELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.INVENTORYELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.INVENTORYELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case SourceModelPackage.INVENTORYELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case SourceModelPackage.INVENTORYELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case SourceModelPackage.INVENTORYELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case SourceModelPackage.INVENTORYELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case SourceModelPackage.INVENTORYELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case SourceModelPackage.INVENTORYELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case SourceModelPackage.INVENTORYELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case SourceModelPackage.INVENTORYELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case SourceModelPackage.INVENTORYELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case SourceModelPackage.INVENTORYELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case SourceModelPackage.INVENTORYELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case SourceModelPackage.INVENTORYELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case SourceModelPackage.INVENTORYELEMENT_INVENTORYRELATIONSHIP_FEATURE_ID:
        return getTarget().getInventoryRelationship();
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
   * The adapter/wrapper for the EClass '<em><b>InventoryRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class InventoryRelationshipModelObject<E extends InventoryRelationship> extends
      AbstractInventoryRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return SourceModelPackage.INSTANCE.getInventoryRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return SourceModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case SourceModelPackage.INVENTORYRELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case SourceModelPackage.INVENTORYRELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case SourceModelPackage.INVENTORYRELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case SourceModelPackage.INVENTORYRELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case SourceModelPackage.INVENTORYRELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case SourceModelPackage.INVENTORYRELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case SourceModelPackage.INVENTORYRELATIONSHIP_TO_FEATURE_ID:
        return getTarget().getTo();
      case SourceModelPackage.INVENTORYRELATIONSHIP_FROM_FEATURE_ID:
        return getTarget().getFrom();
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
      case SourceModelPackage.INVENTORYRELATIONSHIP_TO_FEATURE_ID:
        getTarget().setTo((KDMEntity) value);
        return;
      case SourceModelPackage.INVENTORYRELATIONSHIP_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractInventoryElement) value);
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