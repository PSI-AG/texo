package org.eclipse.modisco.kdm.data;

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
import org.eclipse.modisco.kdm.action.ActionElement;
import org.eclipse.modisco.kdm.action.ActionModelFactory;
import org.eclipse.modisco.kdm.code.CodeItem;
import org.eclipse.modisco.kdm.code.Datatype;
import org.eclipse.modisco.kdm.code.ItemUnit;
import org.eclipse.modisco.kdm.core.CoreModelFactory;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.kdm.KdmModelFactory;
import org.eclipse.modisco.kdm.source.SourceRef;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: data. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DataModelFactory implements ModelFactory {

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
    case DataModelPackage.DATAMODEL_CLASSIFIER_ID:
      return createDataModel();
    case DataModelPackage.DATARESOURCE_CLASSIFIER_ID:
      return createDataResource();
    case DataModelPackage.INDEXELEMENT_CLASSIFIER_ID:
      return createIndexElement();
    case DataModelPackage.UNIQUEKEY_CLASSIFIER_ID:
      return createUniqueKey();
    case DataModelPackage.INDEX_CLASSIFIER_ID:
      return createIndex();
    case DataModelPackage.KEYRELATION_CLASSIFIER_ID:
      return createKeyRelation();
    case DataModelPackage.REFERENCEKEY_CLASSIFIER_ID:
      return createReferenceKey();
    case DataModelPackage.DATACONTAINER_CLASSIFIER_ID:
      return createDataContainer();
    case DataModelPackage.CATALOG_CLASSIFIER_ID:
      return createCatalog();
    case DataModelPackage.RELATIONALSCHEMA_CLASSIFIER_ID:
      return createRelationalSchema();
    case DataModelPackage.COLUMNSET_CLASSIFIER_ID:
      return createColumnSet();
    case DataModelPackage.RELATIONALTABLE_CLASSIFIER_ID:
      return createRelationalTable();
    case DataModelPackage.RELATIONALVIEW_CLASSIFIER_ID:
      return createRelationalView();
    case DataModelPackage.RECORDFILE_CLASSIFIER_ID:
      return createRecordFile();
    case DataModelPackage.DATAEVENT_CLASSIFIER_ID:
      return createDataEvent();
    case DataModelPackage.XMLSCHEMA_CLASSIFIER_ID:
      return createXMLSchema();
    case DataModelPackage.COMPLEXCONTENTTYPE_CLASSIFIER_ID:
      return createComplexContentType();
    case DataModelPackage.ALLCONTENT_CLASSIFIER_ID:
      return createAllContent();
    case DataModelPackage.SEQCONTENT_CLASSIFIER_ID:
      return createSeqContent();
    case DataModelPackage.CHOICECONTENT_CLASSIFIER_ID:
      return createChoiceContent();
    case DataModelPackage.CONTENTITEM_CLASSIFIER_ID:
      return createContentItem();
    case DataModelPackage.GROUPCONTENT_CLASSIFIER_ID:
      return createGroupContent();
    case DataModelPackage.CONTENTRESTRICTION_CLASSIFIER_ID:
      return createContentRestriction();
    case DataModelPackage.SIMPLECONTENTTYPE_CLASSIFIER_ID:
      return createSimpleContentType();
    case DataModelPackage.EXTENDEDDATAELEMENT_CLASSIFIER_ID:
      return createExtendedDataElement();
    case DataModelPackage.DATARELATIONSHIP_CLASSIFIER_ID:
      return createDataRelationship();
    case DataModelPackage.MIXEDCONTENT_CLASSIFIER_ID:
      return createMixedContent();
    case DataModelPackage.CONTENTREFERENCE_CLASSIFIER_ID:
      return createContentReference();
    case DataModelPackage.DATAACTION_CLASSIFIER_ID:
      return createDataAction();
    case DataModelPackage.READSCOLUMNSET_CLASSIFIER_ID:
      return createReadsColumnSet();
    case DataModelPackage.CONTENTATTRIBUTE_CLASSIFIER_ID:
      return createContentAttribute();
    case DataModelPackage.TYPEDBY_CLASSIFIER_ID:
      return createTypedBy();
    case DataModelPackage.REFERENCETO_CLASSIFIER_ID:
      return createReferenceTo();
    case DataModelPackage.RESTRICTIONOF_CLASSIFIER_ID:
      return createRestrictionOf();
    case DataModelPackage.EXTENSIONTO_CLASSIFIER_ID:
      return createExtensionTo();
    case DataModelPackage.DATATYPEOF_CLASSIFIER_ID:
      return createDatatypeOf();
    case DataModelPackage.HASCONTENT_CLASSIFIER_ID:
      return createHasContent();
    case DataModelPackage.WRITESCOLUMNSET_CLASSIFIER_ID:
      return createWritesColumnSet();
    case DataModelPackage.PRODUCESDATAEVENT_CLASSIFIER_ID:
      return createProducesDataEvent();
    case DataModelPackage.DATASEGMENT_CLASSIFIER_ID:
      return createDataSegment();
    case DataModelPackage.CONTENTELEMENT_CLASSIFIER_ID:
      return createContentElement();
    case DataModelPackage.MANAGESDATA_CLASSIFIER_ID:
      return createManagesData();
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
    case DataModelPackage.DATAMODEL_CLASSIFIER_ID:
      modelObject = new DataModelModelObject();
      break;
    case DataModelPackage.ABSTRACTDATAELEMENT_CLASSIFIER_ID:
      modelObject = new AbstractDataElementModelObject();
      break;
    case DataModelPackage.ABSTRACTDATARELATIONSHIP_CLASSIFIER_ID:
      modelObject = new AbstractDataRelationshipModelObject();
      break;
    case DataModelPackage.DATARESOURCE_CLASSIFIER_ID:
      modelObject = new DataResourceModelObject();
      break;
    case DataModelPackage.INDEXELEMENT_CLASSIFIER_ID:
      modelObject = new IndexElementModelObject();
      break;
    case DataModelPackage.UNIQUEKEY_CLASSIFIER_ID:
      modelObject = new UniqueKeyModelObject();
      break;
    case DataModelPackage.INDEX_CLASSIFIER_ID:
      modelObject = new IndexModelObject();
      break;
    case DataModelPackage.KEYRELATION_CLASSIFIER_ID:
      modelObject = new KeyRelationModelObject();
      break;
    case DataModelPackage.REFERENCEKEY_CLASSIFIER_ID:
      modelObject = new ReferenceKeyModelObject();
      break;
    case DataModelPackage.DATACONTAINER_CLASSIFIER_ID:
      modelObject = new DataContainerModelObject();
      break;
    case DataModelPackage.CATALOG_CLASSIFIER_ID:
      modelObject = new CatalogModelObject();
      break;
    case DataModelPackage.RELATIONALSCHEMA_CLASSIFIER_ID:
      modelObject = new RelationalSchemaModelObject();
      break;
    case DataModelPackage.COLUMNSET_CLASSIFIER_ID:
      modelObject = new ColumnSetModelObject();
      break;
    case DataModelPackage.RELATIONALTABLE_CLASSIFIER_ID:
      modelObject = new RelationalTableModelObject();
      break;
    case DataModelPackage.RELATIONALVIEW_CLASSIFIER_ID:
      modelObject = new RelationalViewModelObject();
      break;
    case DataModelPackage.RECORDFILE_CLASSIFIER_ID:
      modelObject = new RecordFileModelObject();
      break;
    case DataModelPackage.DATAEVENT_CLASSIFIER_ID:
      modelObject = new DataEventModelObject();
      break;
    case DataModelPackage.XMLSCHEMA_CLASSIFIER_ID:
      modelObject = new XMLSchemaModelObject();
      break;
    case DataModelPackage.ABSTRACTCONTENTELEMENT_CLASSIFIER_ID:
      modelObject = new AbstractContentElementModelObject();
      break;
    case DataModelPackage.COMPLEXCONTENTTYPE_CLASSIFIER_ID:
      modelObject = new ComplexContentTypeModelObject();
      break;
    case DataModelPackage.ALLCONTENT_CLASSIFIER_ID:
      modelObject = new AllContentModelObject();
      break;
    case DataModelPackage.SEQCONTENT_CLASSIFIER_ID:
      modelObject = new SeqContentModelObject();
      break;
    case DataModelPackage.CHOICECONTENT_CLASSIFIER_ID:
      modelObject = new ChoiceContentModelObject();
      break;
    case DataModelPackage.CONTENTITEM_CLASSIFIER_ID:
      modelObject = new ContentItemModelObject();
      break;
    case DataModelPackage.GROUPCONTENT_CLASSIFIER_ID:
      modelObject = new GroupContentModelObject();
      break;
    case DataModelPackage.CONTENTRESTRICTION_CLASSIFIER_ID:
      modelObject = new ContentRestrictionModelObject();
      break;
    case DataModelPackage.SIMPLECONTENTTYPE_CLASSIFIER_ID:
      modelObject = new SimpleContentTypeModelObject();
      break;
    case DataModelPackage.EXTENDEDDATAELEMENT_CLASSIFIER_ID:
      modelObject = new ExtendedDataElementModelObject();
      break;
    case DataModelPackage.DATARELATIONSHIP_CLASSIFIER_ID:
      modelObject = new DataRelationshipModelObject();
      break;
    case DataModelPackage.MIXEDCONTENT_CLASSIFIER_ID:
      modelObject = new MixedContentModelObject();
      break;
    case DataModelPackage.CONTENTREFERENCE_CLASSIFIER_ID:
      modelObject = new ContentReferenceModelObject();
      break;
    case DataModelPackage.DATAACTION_CLASSIFIER_ID:
      modelObject = new DataActionModelObject();
      break;
    case DataModelPackage.READSCOLUMNSET_CLASSIFIER_ID:
      modelObject = new ReadsColumnSetModelObject();
      break;
    case DataModelPackage.CONTENTATTRIBUTE_CLASSIFIER_ID:
      modelObject = new ContentAttributeModelObject();
      break;
    case DataModelPackage.TYPEDBY_CLASSIFIER_ID:
      modelObject = new TypedByModelObject();
      break;
    case DataModelPackage.REFERENCETO_CLASSIFIER_ID:
      modelObject = new ReferenceToModelObject();
      break;
    case DataModelPackage.RESTRICTIONOF_CLASSIFIER_ID:
      modelObject = new RestrictionOfModelObject();
      break;
    case DataModelPackage.EXTENSIONTO_CLASSIFIER_ID:
      modelObject = new ExtensionToModelObject();
      break;
    case DataModelPackage.DATATYPEOF_CLASSIFIER_ID:
      modelObject = new DatatypeOfModelObject();
      break;
    case DataModelPackage.HASCONTENT_CLASSIFIER_ID:
      modelObject = new HasContentModelObject();
      break;
    case DataModelPackage.WRITESCOLUMNSET_CLASSIFIER_ID:
      modelObject = new WritesColumnSetModelObject();
      break;
    case DataModelPackage.PRODUCESDATAEVENT_CLASSIFIER_ID:
      modelObject = new ProducesDataEventModelObject();
      break;
    case DataModelPackage.DATASEGMENT_CLASSIFIER_ID:
      modelObject = new DataSegmentModelObject();
      break;
    case DataModelPackage.CONTENTELEMENT_CLASSIFIER_ID:
      modelObject = new ContentElementModelObject();
      break;
    case DataModelPackage.MANAGESDATA_CLASSIFIER_ID:
      modelObject = new ManagesDataModelObject();
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
   * @return an instance of the model object representing the EClass DataModel
   * @generated
   */
  public DataModel createDataModel() {
    return new DataModel();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DataResource
   * @generated
   */
  public DataResource createDataResource() {
    return new DataResource();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass IndexElement
   * @generated
   */
  public IndexElement createIndexElement() {
    return new IndexElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass UniqueKey
   * @generated
   */
  public UniqueKey createUniqueKey() {
    return new UniqueKey();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Index
   * @generated
   */
  public Index createIndex() {
    return new Index();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass KeyRelation
   * @generated
   */
  public KeyRelation createKeyRelation() {
    return new KeyRelation();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ReferenceKey
   * @generated
   */
  public ReferenceKey createReferenceKey() {
    return new ReferenceKey();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DataContainer
   * @generated
   */
  public DataContainer createDataContainer() {
    return new DataContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Catalog
   * @generated
   */
  public Catalog createCatalog() {
    return new Catalog();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RelationalSchema
   * @generated
   */
  public RelationalSchema createRelationalSchema() {
    return new RelationalSchema();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ColumnSet
   * @generated
   */
  public ColumnSet createColumnSet() {
    return new ColumnSet();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RelationalTable
   * @generated
   */
  public RelationalTable createRelationalTable() {
    return new RelationalTable();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RelationalView
   * @generated
   */
  public RelationalView createRelationalView() {
    return new RelationalView();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RecordFile
   * @generated
   */
  public RecordFile createRecordFile() {
    return new RecordFile();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DataEvent
   * @generated
   */
  public DataEvent createDataEvent() {
    return new DataEvent();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass XMLSchema
   * @generated
   */
  public XMLSchema createXMLSchema() {
    return new XMLSchema();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ComplexContentType
   * @generated
   */
  public ComplexContentType createComplexContentType() {
    return new ComplexContentType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass AllContent
   * @generated
   */
  public AllContent createAllContent() {
    return new AllContent();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SeqContent
   * @generated
   */
  public SeqContent createSeqContent() {
    return new SeqContent();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ChoiceContent
   * @generated
   */
  public ChoiceContent createChoiceContent() {
    return new ChoiceContent();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ContentItem
   * @generated
   */
  public ContentItem createContentItem() {
    return new ContentItem();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass GroupContent
   * @generated
   */
  public GroupContent createGroupContent() {
    return new GroupContent();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ContentRestriction
   * @generated
   */
  public ContentRestriction createContentRestriction() {
    return new ContentRestriction();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass SimpleContentType
   * @generated
   */
  public SimpleContentType createSimpleContentType() {
    return new SimpleContentType();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ExtendedDataElement
   * @generated
   */
  public ExtendedDataElement createExtendedDataElement() {
    return new ExtendedDataElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DataRelationship
   * @generated
   */
  public DataRelationship createDataRelationship() {
    return new DataRelationship();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass MixedContent
   * @generated
   */
  public MixedContent createMixedContent() {
    return new MixedContent();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ContentReference
   * @generated
   */
  public ContentReference createContentReference() {
    return new ContentReference();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DataAction
   * @generated
   */
  public DataAction createDataAction() {
    return new DataAction();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ReadsColumnSet
   * @generated
   */
  public ReadsColumnSet createReadsColumnSet() {
    return new ReadsColumnSet();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ContentAttribute
   * @generated
   */
  public ContentAttribute createContentAttribute() {
    return new ContentAttribute();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TypedBy
   * @generated
   */
  public TypedBy createTypedBy() {
    return new TypedBy();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ReferenceTo
   * @generated
   */
  public ReferenceTo createReferenceTo() {
    return new ReferenceTo();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RestrictionOf
   * @generated
   */
  public RestrictionOf createRestrictionOf() {
    return new RestrictionOf();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ExtensionTo
   * @generated
   */
  public ExtensionTo createExtensionTo() {
    return new ExtensionTo();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DatatypeOf
   * @generated
   */
  public DatatypeOf createDatatypeOf() {
    return new DatatypeOf();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass HasContent
   * @generated
   */
  public HasContent createHasContent() {
    return new HasContent();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass WritesColumnSet
   * @generated
   */
  public WritesColumnSet createWritesColumnSet() {
    return new WritesColumnSet();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ProducesDataEvent
   * @generated
   */
  public ProducesDataEvent createProducesDataEvent() {
    return new ProducesDataEvent();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass DataSegment
   * @generated
   */
  public DataSegment createDataSegment() {
    return new DataSegment();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ContentElement
   * @generated
   */
  public ContentElement createContentElement() {
    return new ContentElement();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ManagesData
   * @generated
   */
  public ManagesData createManagesData() {
    return new ManagesData();
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
   * The adapter/wrapper for the EClass '<em><b>DataModel</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DataModelModelObject<E extends DataModel> extends KdmModelFactory.KDMModelModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getDataModelEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.DATAMODEL_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.DATAMODEL_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.DATAMODEL_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.DATAMODEL_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.DATAMODEL_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.DATAMODEL_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.DATAMODEL_AUDIT_FEATURE_ID:
        return getTarget().getAudit();
      case DataModelPackage.DATAMODEL_EXTENSION_FEATURE_ID:
        return getTarget().getExtension();
      case DataModelPackage.DATAMODEL_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.DATAMODEL_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.DATAMODEL_DATAELEMENT_FEATURE_ID:
        return getTarget().getDataElement();
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
      case DataModelPackage.DATAMODEL_DATAELEMENT_FEATURE_ID:
        getTarget().setDataElement((Set<AbstractDataElement>) value);
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

      case DataModelPackage.DATAMODEL_DATAELEMENT_FEATURE_ID:
        return getTarget().addToDataElement((AbstractDataElement) value);
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

      case DataModelPackage.DATAMODEL_DATAELEMENT_FEATURE_ID:
        return getTarget().removeFromDataElement((AbstractDataElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractDataElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractDataElementModelObject<E extends AbstractDataElement> extends
      CoreModelFactory.KDMEntityModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getAbstractDataElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.ABSTRACTDATAELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.ABSTRACTDATAELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.ABSTRACTDATAELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.ABSTRACTDATAELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.ABSTRACTDATAELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.ABSTRACTDATAELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.ABSTRACTDATAELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.ABSTRACTDATAELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.ABSTRACTDATAELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.ABSTRACTDATAELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.ABSTRACTDATAELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.ABSTRACTDATAELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.ABSTRACTDATAELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.ABSTRACTDATAELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.ABSTRACTDATAELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.ABSTRACTDATAELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.ABSTRACTDATAELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.ABSTRACTDATAELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.ABSTRACTDATAELEMENT_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.ABSTRACTDATAELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
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
      case DataModelPackage.ABSTRACTDATAELEMENT_SOURCE_FEATURE_ID:
        getTarget().setSource((Set<SourceRef>) value);
        return;
      case DataModelPackage.ABSTRACTDATAELEMENT_DATARELATION_FEATURE_ID:
        getTarget().setDataRelation((Set<AbstractDataRelationship>) value);
        return;
      case DataModelPackage.ABSTRACTDATAELEMENT_ABSTRACTION_FEATURE_ID:
        getTarget().setAbstraction((List<ActionElement>) value);
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

      case DataModelPackage.ABSTRACTDATAELEMENT_SOURCE_FEATURE_ID:
        return getTarget().addToSource((SourceRef) value);

      case DataModelPackage.ABSTRACTDATAELEMENT_DATARELATION_FEATURE_ID:
        return getTarget().addToDataRelation((AbstractDataRelationship) value);

      case DataModelPackage.ABSTRACTDATAELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().addToAbstraction((ActionElement) value);
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

      case DataModelPackage.ABSTRACTDATAELEMENT_SOURCE_FEATURE_ID:
        return getTarget().removeFromSource((SourceRef) value);

      case DataModelPackage.ABSTRACTDATAELEMENT_DATARELATION_FEATURE_ID:
        return getTarget().removeFromDataRelation((AbstractDataRelationship) value);

      case DataModelPackage.ABSTRACTDATAELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().removeFromAbstraction((ActionElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractDataRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractDataRelationshipModelObject<E extends AbstractDataRelationship> extends
      CoreModelFactory.KDMRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getAbstractDataRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.ABSTRACTDATARELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.ABSTRACTDATARELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.ABSTRACTDATARELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.ABSTRACTDATARELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.ABSTRACTDATARELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.ABSTRACTDATARELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>DataResource</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DataResourceModelObject<E extends DataResource> extends AbstractDataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getDataResourceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.DATARESOURCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.DATARESOURCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.DATARESOURCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.DATARESOURCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.DATARESOURCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.DATARESOURCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.DATARESOURCE_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.DATARESOURCE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.DATARESOURCE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.DATARESOURCE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.DATARESOURCE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.DATARESOURCE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.DATARESOURCE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.DATARESOURCE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.DATARESOURCE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.DATARESOURCE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.DATARESOURCE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.DATARESOURCE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.DATARESOURCE_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.DATARESOURCE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
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
   * The adapter/wrapper for the EClass '<em><b>IndexElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class IndexElementModelObject<E extends IndexElement> extends DataResourceModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getIndexElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.INDEXELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.INDEXELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.INDEXELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.INDEXELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.INDEXELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.INDEXELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.INDEXELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.INDEXELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.INDEXELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.INDEXELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.INDEXELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.INDEXELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.INDEXELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.INDEXELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.INDEXELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.INDEXELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.INDEXELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.INDEXELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.INDEXELEMENT_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.INDEXELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.INDEXELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
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
      case DataModelPackage.INDEXELEMENT_IMPLEMENTATION_FEATURE_ID:
        getTarget().setImplementation((Set<ItemUnit>) value);
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

      case DataModelPackage.INDEXELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().addToImplementation((ItemUnit) value);
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

      case DataModelPackage.INDEXELEMENT_IMPLEMENTATION_FEATURE_ID:
        return getTarget().removeFromImplementation((ItemUnit) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>UniqueKey</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class UniqueKeyModelObject<E extends UniqueKey> extends IndexElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getUniqueKeyEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.UNIQUEKEY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.UNIQUEKEY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.UNIQUEKEY_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.UNIQUEKEY_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.UNIQUEKEY_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.UNIQUEKEY_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.UNIQUEKEY_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.UNIQUEKEY_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.UNIQUEKEY_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.UNIQUEKEY_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.UNIQUEKEY_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.UNIQUEKEY_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.UNIQUEKEY_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.UNIQUEKEY_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.UNIQUEKEY_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.UNIQUEKEY_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.UNIQUEKEY_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.UNIQUEKEY_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.UNIQUEKEY_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.UNIQUEKEY_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.UNIQUEKEY_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
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
   * The adapter/wrapper for the EClass '<em><b>Index</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class IndexModelObject<E extends Index> extends IndexElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getIndexEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.INDEX_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.INDEX_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.INDEX_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.INDEX_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.INDEX_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.INDEX_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.INDEX_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.INDEX_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.INDEX_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.INDEX_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.INDEX_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.INDEX_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.INDEX_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.INDEX_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.INDEX_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.INDEX_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.INDEX_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.INDEX_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.INDEX_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.INDEX_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.INDEX_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
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
   * The adapter/wrapper for the EClass '<em><b>KeyRelation</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class KeyRelationModelObject<E extends KeyRelation> extends AbstractDataRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getKeyRelationEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.KEYRELATION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.KEYRELATION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.KEYRELATION_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.KEYRELATION_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.KEYRELATION_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.KEYRELATION_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.KEYRELATION_TO_FEATURE_ID:
        return getTarget().getTo();
      case DataModelPackage.KEYRELATION_FROM_FEATURE_ID:
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
      case DataModelPackage.KEYRELATION_TO_FEATURE_ID:
        getTarget().setTo((UniqueKey) value);
        return;
      case DataModelPackage.KEYRELATION_FROM_FEATURE_ID:
        getTarget().setFrom((ReferenceKey) value);
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
   * The adapter/wrapper for the EClass '<em><b>ReferenceKey</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ReferenceKeyModelObject<E extends ReferenceKey> extends IndexElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getReferenceKeyEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.REFERENCEKEY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.REFERENCEKEY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.REFERENCEKEY_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.REFERENCEKEY_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.REFERENCEKEY_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.REFERENCEKEY_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.REFERENCEKEY_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.REFERENCEKEY_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.REFERENCEKEY_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.REFERENCEKEY_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.REFERENCEKEY_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.REFERENCEKEY_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.REFERENCEKEY_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.REFERENCEKEY_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.REFERENCEKEY_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.REFERENCEKEY_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.REFERENCEKEY_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.REFERENCEKEY_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.REFERENCEKEY_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.REFERENCEKEY_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.REFERENCEKEY_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
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
   * The adapter/wrapper for the EClass '<em><b>DataContainer</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DataContainerModelObject<E extends DataContainer> extends DataResourceModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getDataContainerEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.DATACONTAINER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.DATACONTAINER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.DATACONTAINER_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.DATACONTAINER_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.DATACONTAINER_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.DATACONTAINER_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.DATACONTAINER_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.DATACONTAINER_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.DATACONTAINER_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.DATACONTAINER_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.DATACONTAINER_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.DATACONTAINER_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.DATACONTAINER_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.DATACONTAINER_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.DATACONTAINER_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.DATACONTAINER_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.DATACONTAINER_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.DATACONTAINER_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.DATACONTAINER_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.DATACONTAINER_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.DATACONTAINER_DATAELEMENT_FEATURE_ID:
        return getTarget().getDataElement();
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
      case DataModelPackage.DATACONTAINER_DATAELEMENT_FEATURE_ID:
        getTarget().setDataElement((Set<DataResource>) value);
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

      case DataModelPackage.DATACONTAINER_DATAELEMENT_FEATURE_ID:
        return getTarget().addToDataElement((DataResource) value);
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

      case DataModelPackage.DATACONTAINER_DATAELEMENT_FEATURE_ID:
        return getTarget().removeFromDataElement((DataResource) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Catalog</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CatalogModelObject<E extends Catalog> extends DataContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getCatalogEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.CATALOG_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.CATALOG_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.CATALOG_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.CATALOG_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.CATALOG_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.CATALOG_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.CATALOG_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.CATALOG_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.CATALOG_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.CATALOG_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.CATALOG_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.CATALOG_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.CATALOG_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.CATALOG_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.CATALOG_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.CATALOG_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.CATALOG_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.CATALOG_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.CATALOG_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.CATALOG_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.CATALOG_DATAELEMENT_FEATURE_ID:
        return getTarget().getDataElement();
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
   * The adapter/wrapper for the EClass '<em><b>RelationalSchema</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RelationalSchemaModelObject<E extends RelationalSchema> extends DataContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getRelationalSchemaEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.RELATIONALSCHEMA_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.RELATIONALSCHEMA_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.RELATIONALSCHEMA_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.RELATIONALSCHEMA_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.RELATIONALSCHEMA_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.RELATIONALSCHEMA_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.RELATIONALSCHEMA_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.RELATIONALSCHEMA_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.RELATIONALSCHEMA_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.RELATIONALSCHEMA_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.RELATIONALSCHEMA_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.RELATIONALSCHEMA_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.RELATIONALSCHEMA_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.RELATIONALSCHEMA_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.RELATIONALSCHEMA_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.RELATIONALSCHEMA_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.RELATIONALSCHEMA_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.RELATIONALSCHEMA_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.RELATIONALSCHEMA_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.RELATIONALSCHEMA_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.RELATIONALSCHEMA_DATAELEMENT_FEATURE_ID:
        return getTarget().getDataElement();
      case DataModelPackage.RELATIONALSCHEMA_CODEELEMENT_FEATURE_ID:
        return getTarget().getCodeElement();
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
      case DataModelPackage.RELATIONALSCHEMA_CODEELEMENT_FEATURE_ID:
        getTarget().setCodeElement((Set<CodeItem>) value);
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

      case DataModelPackage.RELATIONALSCHEMA_CODEELEMENT_FEATURE_ID:
        return getTarget().addToCodeElement((CodeItem) value);
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

      case DataModelPackage.RELATIONALSCHEMA_CODEELEMENT_FEATURE_ID:
        return getTarget().removeFromCodeElement((CodeItem) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ColumnSet</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ColumnSetModelObject<E extends ColumnSet> extends DataContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getColumnSetEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.COLUMNSET_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.COLUMNSET_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.COLUMNSET_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.COLUMNSET_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.COLUMNSET_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.COLUMNSET_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.COLUMNSET_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.COLUMNSET_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.COLUMNSET_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.COLUMNSET_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.COLUMNSET_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.COLUMNSET_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.COLUMNSET_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.COLUMNSET_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.COLUMNSET_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.COLUMNSET_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.COLUMNSET_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.COLUMNSET_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.COLUMNSET_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.COLUMNSET_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.COLUMNSET_DATAELEMENT_FEATURE_ID:
        return getTarget().getDataElement();
      case DataModelPackage.COLUMNSET_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
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
      case DataModelPackage.COLUMNSET_ITEMUNIT_FEATURE_ID:
        getTarget().setItemUnit((List<ItemUnit>) value);
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

      case DataModelPackage.COLUMNSET_ITEMUNIT_FEATURE_ID:
        return getTarget().addToItemUnit((ItemUnit) value);
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

      case DataModelPackage.COLUMNSET_ITEMUNIT_FEATURE_ID:
        return getTarget().removeFromItemUnit((ItemUnit) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>RelationalTable</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RelationalTableModelObject<E extends RelationalTable> extends ColumnSetModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getRelationalTableEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.RELATIONALTABLE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.RELATIONALTABLE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.RELATIONALTABLE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.RELATIONALTABLE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.RELATIONALTABLE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.RELATIONALTABLE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.RELATIONALTABLE_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.RELATIONALTABLE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.RELATIONALTABLE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.RELATIONALTABLE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.RELATIONALTABLE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.RELATIONALTABLE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.RELATIONALTABLE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.RELATIONALTABLE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.RELATIONALTABLE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.RELATIONALTABLE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.RELATIONALTABLE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.RELATIONALTABLE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.RELATIONALTABLE_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.RELATIONALTABLE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.RELATIONALTABLE_DATAELEMENT_FEATURE_ID:
        return getTarget().getDataElement();
      case DataModelPackage.RELATIONALTABLE_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
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
   * The adapter/wrapper for the EClass '<em><b>RelationalView</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RelationalViewModelObject<E extends RelationalView> extends ColumnSetModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getRelationalViewEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.RELATIONALVIEW_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.RELATIONALVIEW_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.RELATIONALVIEW_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.RELATIONALVIEW_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.RELATIONALVIEW_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.RELATIONALVIEW_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.RELATIONALVIEW_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.RELATIONALVIEW_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.RELATIONALVIEW_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.RELATIONALVIEW_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.RELATIONALVIEW_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.RELATIONALVIEW_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.RELATIONALVIEW_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.RELATIONALVIEW_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.RELATIONALVIEW_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.RELATIONALVIEW_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.RELATIONALVIEW_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.RELATIONALVIEW_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.RELATIONALVIEW_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.RELATIONALVIEW_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.RELATIONALVIEW_DATAELEMENT_FEATURE_ID:
        return getTarget().getDataElement();
      case DataModelPackage.RELATIONALVIEW_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
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
   * The adapter/wrapper for the EClass '<em><b>RecordFile</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RecordFileModelObject<E extends RecordFile> extends ColumnSetModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getRecordFileEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.RECORDFILE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.RECORDFILE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.RECORDFILE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.RECORDFILE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.RECORDFILE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.RECORDFILE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.RECORDFILE_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.RECORDFILE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.RECORDFILE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.RECORDFILE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.RECORDFILE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.RECORDFILE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.RECORDFILE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.RECORDFILE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.RECORDFILE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.RECORDFILE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.RECORDFILE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.RECORDFILE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.RECORDFILE_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.RECORDFILE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.RECORDFILE_DATAELEMENT_FEATURE_ID:
        return getTarget().getDataElement();
      case DataModelPackage.RECORDFILE_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
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
   * The adapter/wrapper for the EClass '<em><b>DataEvent</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DataEventModelObject<E extends DataEvent> extends DataResourceModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getDataEventEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.DATAEVENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.DATAEVENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.DATAEVENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.DATAEVENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.DATAEVENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.DATAEVENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.DATAEVENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.DATAEVENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.DATAEVENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.DATAEVENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.DATAEVENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.DATAEVENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.DATAEVENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.DATAEVENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.DATAEVENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.DATAEVENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.DATAEVENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.DATAEVENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.DATAEVENT_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.DATAEVENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.DATAEVENT_KIND_FEATURE_ID:
        return getTarget().getKind();
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
      case DataModelPackage.DATAEVENT_KIND_FEATURE_ID:
        getTarget().setKind((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>XMLSchema</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class XMLSchemaModelObject<E extends XMLSchema> extends AbstractDataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getXMLSchemaEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.XMLSCHEMA_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.XMLSCHEMA_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.XMLSCHEMA_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.XMLSCHEMA_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.XMLSCHEMA_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.XMLSCHEMA_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.XMLSCHEMA_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.XMLSCHEMA_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.XMLSCHEMA_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.XMLSCHEMA_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.XMLSCHEMA_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.XMLSCHEMA_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.XMLSCHEMA_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.XMLSCHEMA_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.XMLSCHEMA_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.XMLSCHEMA_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.XMLSCHEMA_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.XMLSCHEMA_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.XMLSCHEMA_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.XMLSCHEMA_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.XMLSCHEMA_CONTENTELEMENT_FEATURE_ID:
        return getTarget().getContentElement();
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
      case DataModelPackage.XMLSCHEMA_CONTENTELEMENT_FEATURE_ID:
        getTarget().setContentElement((Set<AbstractContentElement>) value);
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

      case DataModelPackage.XMLSCHEMA_CONTENTELEMENT_FEATURE_ID:
        return getTarget().addToContentElement((AbstractContentElement) value);
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

      case DataModelPackage.XMLSCHEMA_CONTENTELEMENT_FEATURE_ID:
        return getTarget().removeFromContentElement((AbstractContentElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AbstractContentElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractContentElementModelObject<E extends AbstractContentElement> extends
      AbstractDataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getAbstractContentElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.ABSTRACTCONTENTELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.ABSTRACTCONTENTELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
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
   * The adapter/wrapper for the EClass '<em><b>ComplexContentType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ComplexContentTypeModelObject<E extends ComplexContentType> extends
      AbstractContentElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getComplexContentTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.COMPLEXCONTENTTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.COMPLEXCONTENTTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.COMPLEXCONTENTTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.COMPLEXCONTENTTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.COMPLEXCONTENTTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.COMPLEXCONTENTTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.COMPLEXCONTENTTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.COMPLEXCONTENTTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.COMPLEXCONTENTTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.COMPLEXCONTENTTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.COMPLEXCONTENTTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.COMPLEXCONTENTTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.COMPLEXCONTENTTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.COMPLEXCONTENTTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.COMPLEXCONTENTTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.COMPLEXCONTENTTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.COMPLEXCONTENTTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.COMPLEXCONTENTTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.COMPLEXCONTENTTYPE_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.COMPLEXCONTENTTYPE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.COMPLEXCONTENTTYPE_CONTENTELEMENT_FEATURE_ID:
        return getTarget().getContentElement();
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
      case DataModelPackage.COMPLEXCONTENTTYPE_CONTENTELEMENT_FEATURE_ID:
        getTarget().setContentElement((List<AbstractContentElement>) value);
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

      case DataModelPackage.COMPLEXCONTENTTYPE_CONTENTELEMENT_FEATURE_ID:
        return getTarget().addToContentElement((AbstractContentElement) value);
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

      case DataModelPackage.COMPLEXCONTENTTYPE_CONTENTELEMENT_FEATURE_ID:
        return getTarget().removeFromContentElement((AbstractContentElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>AllContent</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AllContentModelObject<E extends AllContent> extends ComplexContentTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getAllContentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.ALLCONTENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.ALLCONTENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.ALLCONTENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.ALLCONTENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.ALLCONTENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.ALLCONTENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.ALLCONTENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.ALLCONTENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.ALLCONTENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.ALLCONTENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.ALLCONTENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.ALLCONTENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.ALLCONTENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.ALLCONTENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.ALLCONTENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.ALLCONTENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.ALLCONTENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.ALLCONTENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.ALLCONTENT_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.ALLCONTENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.ALLCONTENT_CONTENTELEMENT_FEATURE_ID:
        return getTarget().getContentElement();
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
   * The adapter/wrapper for the EClass '<em><b>SeqContent</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SeqContentModelObject<E extends SeqContent> extends ComplexContentTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getSeqContentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.SEQCONTENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.SEQCONTENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.SEQCONTENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.SEQCONTENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.SEQCONTENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.SEQCONTENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.SEQCONTENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.SEQCONTENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.SEQCONTENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.SEQCONTENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.SEQCONTENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.SEQCONTENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.SEQCONTENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.SEQCONTENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.SEQCONTENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.SEQCONTENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.SEQCONTENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.SEQCONTENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.SEQCONTENT_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.SEQCONTENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.SEQCONTENT_CONTENTELEMENT_FEATURE_ID:
        return getTarget().getContentElement();
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
   * The adapter/wrapper for the EClass '<em><b>ChoiceContent</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ChoiceContentModelObject<E extends ChoiceContent> extends ComplexContentTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getChoiceContentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.CHOICECONTENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.CHOICECONTENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.CHOICECONTENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.CHOICECONTENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.CHOICECONTENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.CHOICECONTENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.CHOICECONTENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.CHOICECONTENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.CHOICECONTENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.CHOICECONTENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.CHOICECONTENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.CHOICECONTENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.CHOICECONTENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.CHOICECONTENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.CHOICECONTENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.CHOICECONTENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.CHOICECONTENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.CHOICECONTENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.CHOICECONTENT_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.CHOICECONTENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.CHOICECONTENT_CONTENTELEMENT_FEATURE_ID:
        return getTarget().getContentElement();
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
   * The adapter/wrapper for the EClass '<em><b>ContentItem</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ContentItemModelObject<E extends ContentItem> extends AbstractContentElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getContentItemEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.CONTENTITEM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.CONTENTITEM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.CONTENTITEM_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.CONTENTITEM_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.CONTENTITEM_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.CONTENTITEM_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.CONTENTITEM_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.CONTENTITEM_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.CONTENTITEM_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.CONTENTITEM_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.CONTENTITEM_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.CONTENTITEM_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.CONTENTITEM_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.CONTENTITEM_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.CONTENTITEM_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.CONTENTITEM_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.CONTENTITEM_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.CONTENTITEM_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.CONTENTITEM_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.CONTENTITEM_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.CONTENTITEM_TYPE_FEATURE_ID:
        return getTarget().getType();
      case DataModelPackage.CONTENTITEM_CONTENTELEMENT_FEATURE_ID:
        return getTarget().getContentElement();
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
      case DataModelPackage.CONTENTITEM_TYPE_FEATURE_ID:
        getTarget().setType((ComplexContentType) value);
        return;
      case DataModelPackage.CONTENTITEM_CONTENTELEMENT_FEATURE_ID:
        getTarget().setContentElement((Set<AbstractContentElement>) value);
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

      case DataModelPackage.CONTENTITEM_CONTENTELEMENT_FEATURE_ID:
        return getTarget().addToContentElement((AbstractContentElement) value);
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

      case DataModelPackage.CONTENTITEM_CONTENTELEMENT_FEATURE_ID:
        return getTarget().removeFromContentElement((AbstractContentElement) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>GroupContent</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class GroupContentModelObject<E extends GroupContent> extends ContentItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getGroupContentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.GROUPCONTENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.GROUPCONTENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.GROUPCONTENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.GROUPCONTENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.GROUPCONTENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.GROUPCONTENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.GROUPCONTENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.GROUPCONTENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.GROUPCONTENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.GROUPCONTENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.GROUPCONTENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.GROUPCONTENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.GROUPCONTENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.GROUPCONTENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.GROUPCONTENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.GROUPCONTENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.GROUPCONTENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.GROUPCONTENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.GROUPCONTENT_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.GROUPCONTENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.GROUPCONTENT_TYPE_FEATURE_ID:
        return getTarget().getType();
      case DataModelPackage.GROUPCONTENT_CONTENTELEMENT_FEATURE_ID:
        return getTarget().getContentElement();
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
   * The adapter/wrapper for the EClass '<em><b>ContentRestriction</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ContentRestrictionModelObject<E extends ContentRestriction> extends
      AbstractContentElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getContentRestrictionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.CONTENTRESTRICTION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.CONTENTRESTRICTION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.CONTENTRESTRICTION_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.CONTENTRESTRICTION_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.CONTENTRESTRICTION_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.CONTENTRESTRICTION_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.CONTENTRESTRICTION_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.CONTENTRESTRICTION_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.CONTENTRESTRICTION_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.CONTENTRESTRICTION_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.CONTENTRESTRICTION_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.CONTENTRESTRICTION_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.CONTENTRESTRICTION_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.CONTENTRESTRICTION_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.CONTENTRESTRICTION_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.CONTENTRESTRICTION_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.CONTENTRESTRICTION_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.CONTENTRESTRICTION_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.CONTENTRESTRICTION_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.CONTENTRESTRICTION_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.CONTENTRESTRICTION_KIND_FEATURE_ID:
        return getTarget().getKind();
      case DataModelPackage.CONTENTRESTRICTION_VALUE_FEATURE_ID:
        return getTarget().getValue();
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
      case DataModelPackage.CONTENTRESTRICTION_KIND_FEATURE_ID:
        getTarget().setKind((String) value);
        return;
      case DataModelPackage.CONTENTRESTRICTION_VALUE_FEATURE_ID:
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

  /**
   * The adapter/wrapper for the EClass '<em><b>SimpleContentType</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class SimpleContentTypeModelObject<E extends SimpleContentType> extends
      ComplexContentTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getSimpleContentTypeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.SIMPLECONTENTTYPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.SIMPLECONTENTTYPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.SIMPLECONTENTTYPE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.SIMPLECONTENTTYPE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.SIMPLECONTENTTYPE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.SIMPLECONTENTTYPE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.SIMPLECONTENTTYPE_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.SIMPLECONTENTTYPE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.SIMPLECONTENTTYPE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.SIMPLECONTENTTYPE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.SIMPLECONTENTTYPE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.SIMPLECONTENTTYPE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.SIMPLECONTENTTYPE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.SIMPLECONTENTTYPE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.SIMPLECONTENTTYPE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.SIMPLECONTENTTYPE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.SIMPLECONTENTTYPE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.SIMPLECONTENTTYPE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.SIMPLECONTENTTYPE_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.SIMPLECONTENTTYPE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.SIMPLECONTENTTYPE_CONTENTELEMENT_FEATURE_ID:
        return getTarget().getContentElement();
      case DataModelPackage.SIMPLECONTENTTYPE_TYPE_FEATURE_ID:
        return getTarget().getType();
      case DataModelPackage.SIMPLECONTENTTYPE_KIND_FEATURE_ID:
        return getTarget().getKind();
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
      case DataModelPackage.SIMPLECONTENTTYPE_TYPE_FEATURE_ID:
        getTarget().setType((Set<ComplexContentType>) value);
        return;
      case DataModelPackage.SIMPLECONTENTTYPE_KIND_FEATURE_ID:
        getTarget().setKind((String) value);
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

      case DataModelPackage.SIMPLECONTENTTYPE_TYPE_FEATURE_ID:
        return getTarget().addToType((ComplexContentType) value);

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

      case DataModelPackage.SIMPLECONTENTTYPE_TYPE_FEATURE_ID:
        return getTarget().removeFromType((ComplexContentType) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ExtendedDataElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ExtendedDataElementModelObject<E extends ExtendedDataElement> extends
      AbstractDataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getExtendedDataElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.EXTENDEDDATAELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.EXTENDEDDATAELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.EXTENDEDDATAELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.EXTENDEDDATAELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.EXTENDEDDATAELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.EXTENDEDDATAELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.EXTENDEDDATAELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.EXTENDEDDATAELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.EXTENDEDDATAELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.EXTENDEDDATAELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.EXTENDEDDATAELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.EXTENDEDDATAELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.EXTENDEDDATAELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.EXTENDEDDATAELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.EXTENDEDDATAELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.EXTENDEDDATAELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.EXTENDEDDATAELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.EXTENDEDDATAELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.EXTENDEDDATAELEMENT_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.EXTENDEDDATAELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
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
   * The adapter/wrapper for the EClass '<em><b>DataRelationship</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DataRelationshipModelObject<E extends DataRelationship> extends
      AbstractDataRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getDataRelationshipEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.DATARELATIONSHIP_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.DATARELATIONSHIP_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.DATARELATIONSHIP_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.DATARELATIONSHIP_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.DATARELATIONSHIP_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.DATARELATIONSHIP_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.DATARELATIONSHIP_TO_FEATURE_ID:
        return getTarget().getTo();
      case DataModelPackage.DATARELATIONSHIP_FROM_FEATURE_ID:
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
      case DataModelPackage.DATARELATIONSHIP_TO_FEATURE_ID:
        getTarget().setTo((KDMEntity) value);
        return;
      case DataModelPackage.DATARELATIONSHIP_FROM_FEATURE_ID:
        getTarget().setFrom((AbstractDataElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>MixedContent</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MixedContentModelObject<E extends MixedContent> extends ComplexContentTypeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getMixedContentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.MIXEDCONTENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.MIXEDCONTENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.MIXEDCONTENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.MIXEDCONTENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.MIXEDCONTENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.MIXEDCONTENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.MIXEDCONTENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.MIXEDCONTENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.MIXEDCONTENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.MIXEDCONTENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.MIXEDCONTENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.MIXEDCONTENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.MIXEDCONTENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.MIXEDCONTENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.MIXEDCONTENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.MIXEDCONTENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.MIXEDCONTENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.MIXEDCONTENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.MIXEDCONTENT_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.MIXEDCONTENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.MIXEDCONTENT_CONTENTELEMENT_FEATURE_ID:
        return getTarget().getContentElement();
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
   * The adapter/wrapper for the EClass '<em><b>ContentReference</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ContentReferenceModelObject<E extends ContentReference> extends ContentItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getContentReferenceEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.CONTENTREFERENCE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.CONTENTREFERENCE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.CONTENTREFERENCE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.CONTENTREFERENCE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.CONTENTREFERENCE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.CONTENTREFERENCE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.CONTENTREFERENCE_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.CONTENTREFERENCE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.CONTENTREFERENCE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.CONTENTREFERENCE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.CONTENTREFERENCE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.CONTENTREFERENCE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.CONTENTREFERENCE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.CONTENTREFERENCE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.CONTENTREFERENCE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.CONTENTREFERENCE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.CONTENTREFERENCE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.CONTENTREFERENCE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.CONTENTREFERENCE_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.CONTENTREFERENCE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.CONTENTREFERENCE_TYPE_FEATURE_ID:
        return getTarget().getType();
      case DataModelPackage.CONTENTREFERENCE_CONTENTELEMENT_FEATURE_ID:
        return getTarget().getContentElement();
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
   * The adapter/wrapper for the EClass '<em><b>DataAction</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DataActionModelObject<E extends DataAction> extends AbstractDataElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getDataActionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.DATAACTION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.DATAACTION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.DATAACTION_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.DATAACTION_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.DATAACTION_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.DATAACTION_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.DATAACTION_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.DATAACTION_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.DATAACTION_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.DATAACTION_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.DATAACTION_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.DATAACTION_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.DATAACTION_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.DATAACTION_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.DATAACTION_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.DATAACTION_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.DATAACTION_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.DATAACTION_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.DATAACTION_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.DATAACTION_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.DATAACTION_KIND_FEATURE_ID:
        return getTarget().getKind();
      case DataModelPackage.DATAACTION_IMPLEMENTATION_FEATURE_ID:
        return getTarget().getImplementation();
      case DataModelPackage.DATAACTION_DATAELEMENT_FEATURE_ID:
        return getTarget().getDataElement();
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
      case DataModelPackage.DATAACTION_KIND_FEATURE_ID:
        getTarget().setKind((String) value);
        return;
      case DataModelPackage.DATAACTION_IMPLEMENTATION_FEATURE_ID:
        getTarget().setImplementation((Set<ActionElement>) value);
        return;
      case DataModelPackage.DATAACTION_DATAELEMENT_FEATURE_ID:
        getTarget().setDataElement((Set<DataEvent>) value);
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

      case DataModelPackage.DATAACTION_IMPLEMENTATION_FEATURE_ID:
        return getTarget().addToImplementation((ActionElement) value);

      case DataModelPackage.DATAACTION_DATAELEMENT_FEATURE_ID:
        return getTarget().addToDataElement((DataEvent) value);
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

      case DataModelPackage.DATAACTION_IMPLEMENTATION_FEATURE_ID:
        return getTarget().removeFromImplementation((ActionElement) value);

      case DataModelPackage.DATAACTION_DATAELEMENT_FEATURE_ID:
        return getTarget().removeFromDataElement((DataEvent) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ReadsColumnSet</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ReadsColumnSetModelObject<E extends ReadsColumnSet> extends
      ActionModelFactory.AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getReadsColumnSetEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.READSCOLUMNSET_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.READSCOLUMNSET_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.READSCOLUMNSET_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.READSCOLUMNSET_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.READSCOLUMNSET_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.READSCOLUMNSET_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.READSCOLUMNSET_TO_FEATURE_ID:
        return getTarget().getTo();
      case DataModelPackage.READSCOLUMNSET_FROM_FEATURE_ID:
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
      case DataModelPackage.READSCOLUMNSET_TO_FEATURE_ID:
        getTarget().setTo((ColumnSet) value);
        return;
      case DataModelPackage.READSCOLUMNSET_FROM_FEATURE_ID:
        getTarget().setFrom((ActionElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>ContentAttribute</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ContentAttributeModelObject<E extends ContentAttribute> extends ContentItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getContentAttributeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.CONTENTATTRIBUTE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.CONTENTATTRIBUTE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.CONTENTATTRIBUTE_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.CONTENTATTRIBUTE_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.CONTENTATTRIBUTE_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.CONTENTATTRIBUTE_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.CONTENTATTRIBUTE_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.CONTENTATTRIBUTE_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.CONTENTATTRIBUTE_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.CONTENTATTRIBUTE_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.CONTENTATTRIBUTE_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.CONTENTATTRIBUTE_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.CONTENTATTRIBUTE_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.CONTENTATTRIBUTE_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.CONTENTATTRIBUTE_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.CONTENTATTRIBUTE_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.CONTENTATTRIBUTE_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.CONTENTATTRIBUTE_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.CONTENTATTRIBUTE_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.CONTENTATTRIBUTE_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.CONTENTATTRIBUTE_TYPE_FEATURE_ID:
        return getTarget().getType();
      case DataModelPackage.CONTENTATTRIBUTE_CONTENTELEMENT_FEATURE_ID:
        return getTarget().getContentElement();
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
   * The adapter/wrapper for the EClass '<em><b>TypedBy</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TypedByModelObject<E extends TypedBy> extends AbstractDataRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getTypedByEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.TYPEDBY_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.TYPEDBY_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.TYPEDBY_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.TYPEDBY_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.TYPEDBY_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.TYPEDBY_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.TYPEDBY_TO_FEATURE_ID:
        return getTarget().getTo();
      case DataModelPackage.TYPEDBY_FROM_FEATURE_ID:
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
      case DataModelPackage.TYPEDBY_TO_FEATURE_ID:
        getTarget().setTo((ComplexContentType) value);
        return;
      case DataModelPackage.TYPEDBY_FROM_FEATURE_ID:
        getTarget().setFrom((ContentItem) value);
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
   * The adapter/wrapper for the EClass '<em><b>ReferenceTo</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ReferenceToModelObject<E extends ReferenceTo> extends AbstractDataRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getReferenceToEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.REFERENCETO_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.REFERENCETO_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.REFERENCETO_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.REFERENCETO_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.REFERENCETO_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.REFERENCETO_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.REFERENCETO_TO_FEATURE_ID:
        return getTarget().getTo();
      case DataModelPackage.REFERENCETO_FROM_FEATURE_ID:
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
      case DataModelPackage.REFERENCETO_TO_FEATURE_ID:
        getTarget().setTo((ContentItem) value);
        return;
      case DataModelPackage.REFERENCETO_FROM_FEATURE_ID:
        getTarget().setFrom((ContentItem) value);
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
   * The adapter/wrapper for the EClass '<em><b>RestrictionOf</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RestrictionOfModelObject<E extends RestrictionOf> extends AbstractDataRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getRestrictionOfEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.RESTRICTIONOF_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.RESTRICTIONOF_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.RESTRICTIONOF_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.RESTRICTIONOF_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.RESTRICTIONOF_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.RESTRICTIONOF_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.RESTRICTIONOF_TO_FEATURE_ID:
        return getTarget().getTo();
      case DataModelPackage.RESTRICTIONOF_FROM_FEATURE_ID:
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
      case DataModelPackage.RESTRICTIONOF_TO_FEATURE_ID:
        getTarget().setTo((ComplexContentType) value);
        return;
      case DataModelPackage.RESTRICTIONOF_FROM_FEATURE_ID:
        getTarget().setFrom((ComplexContentType) value);
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
   * The adapter/wrapper for the EClass '<em><b>ExtensionTo</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ExtensionToModelObject<E extends ExtensionTo> extends AbstractDataRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getExtensionToEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.EXTENSIONTO_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.EXTENSIONTO_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.EXTENSIONTO_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.EXTENSIONTO_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.EXTENSIONTO_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.EXTENSIONTO_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.EXTENSIONTO_TO_FEATURE_ID:
        return getTarget().getTo();
      case DataModelPackage.EXTENSIONTO_FROM_FEATURE_ID:
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
      case DataModelPackage.EXTENSIONTO_TO_FEATURE_ID:
        getTarget().setTo((ComplexContentType) value);
        return;
      case DataModelPackage.EXTENSIONTO_FROM_FEATURE_ID:
        getTarget().setFrom((ComplexContentType) value);
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
   * The adapter/wrapper for the EClass '<em><b>DatatypeOf</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DatatypeOfModelObject<E extends DatatypeOf> extends AbstractDataRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getDatatypeOfEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.DATATYPEOF_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.DATATYPEOF_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.DATATYPEOF_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.DATATYPEOF_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.DATATYPEOF_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.DATATYPEOF_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.DATATYPEOF_TO_FEATURE_ID:
        return getTarget().getTo();
      case DataModelPackage.DATATYPEOF_FROM_FEATURE_ID:
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
      case DataModelPackage.DATATYPEOF_TO_FEATURE_ID:
        getTarget().setTo((Datatype) value);
        return;
      case DataModelPackage.DATATYPEOF_FROM_FEATURE_ID:
        getTarget().setFrom((ComplexContentType) value);
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
   * The adapter/wrapper for the EClass '<em><b>HasContent</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class HasContentModelObject<E extends HasContent> extends
      ActionModelFactory.AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getHasContentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.HASCONTENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.HASCONTENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.HASCONTENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.HASCONTENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.HASCONTENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.HASCONTENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.HASCONTENT_TO_FEATURE_ID:
        return getTarget().getTo();
      case DataModelPackage.HASCONTENT_FROM_FEATURE_ID:
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
      case DataModelPackage.HASCONTENT_TO_FEATURE_ID:
        getTarget().setTo((AbstractDataElement) value);
        return;
      case DataModelPackage.HASCONTENT_FROM_FEATURE_ID:
        getTarget().setFrom((ActionElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>WritesColumnSet</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class WritesColumnSetModelObject<E extends WritesColumnSet> extends
      ActionModelFactory.AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getWritesColumnSetEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.WRITESCOLUMNSET_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.WRITESCOLUMNSET_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.WRITESCOLUMNSET_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.WRITESCOLUMNSET_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.WRITESCOLUMNSET_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.WRITESCOLUMNSET_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.WRITESCOLUMNSET_TO_FEATURE_ID:
        return getTarget().getTo();
      case DataModelPackage.WRITESCOLUMNSET_FROM_FEATURE_ID:
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
      case DataModelPackage.WRITESCOLUMNSET_TO_FEATURE_ID:
        getTarget().setTo((ColumnSet) value);
        return;
      case DataModelPackage.WRITESCOLUMNSET_FROM_FEATURE_ID:
        getTarget().setFrom((ActionElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>ProducesDataEvent</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ProducesDataEventModelObject<E extends ProducesDataEvent> extends
      ActionModelFactory.AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getProducesDataEventEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.PRODUCESDATAEVENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.PRODUCESDATAEVENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.PRODUCESDATAEVENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.PRODUCESDATAEVENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.PRODUCESDATAEVENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.PRODUCESDATAEVENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.PRODUCESDATAEVENT_TO_FEATURE_ID:
        return getTarget().getTo();
      case DataModelPackage.PRODUCESDATAEVENT_FROM_FEATURE_ID:
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
      case DataModelPackage.PRODUCESDATAEVENT_TO_FEATURE_ID:
        getTarget().setTo((DataEvent) value);
        return;
      case DataModelPackage.PRODUCESDATAEVENT_FROM_FEATURE_ID:
        getTarget().setFrom((ActionElement) value);
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
   * The adapter/wrapper for the EClass '<em><b>DataSegment</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DataSegmentModelObject<E extends DataSegment> extends ColumnSetModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getDataSegmentEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.DATASEGMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.DATASEGMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.DATASEGMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.DATASEGMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.DATASEGMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.DATASEGMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.DATASEGMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.DATASEGMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.DATASEGMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.DATASEGMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.DATASEGMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.DATASEGMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.DATASEGMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.DATASEGMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.DATASEGMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.DATASEGMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.DATASEGMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.DATASEGMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.DATASEGMENT_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.DATASEGMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.DATASEGMENT_DATAELEMENT_FEATURE_ID:
        return getTarget().getDataElement();
      case DataModelPackage.DATASEGMENT_ITEMUNIT_FEATURE_ID:
        return getTarget().getItemUnit();
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
   * The adapter/wrapper for the EClass '<em><b>ContentElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ContentElementModelObject<E extends ContentElement> extends ContentItemModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getContentElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.CONTENTELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.CONTENTELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.CONTENTELEMENT_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.CONTENTELEMENT_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.CONTENTELEMENT_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.CONTENTELEMENT_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.CONTENTELEMENT_NAME_FEATURE_ID:
        return getTarget().getName();
      case DataModelPackage.CONTENTELEMENT_MODEL_FEATURE_ID:
        return getTarget().getModel();
      case DataModelPackage.CONTENTELEMENT_OWNER_FEATURE_ID:
        return getTarget().getOwner();
      case DataModelPackage.CONTENTELEMENT_OWNEDELEMENT_FEATURE_ID:
        return getTarget().getOwnedElement();
      case DataModelPackage.CONTENTELEMENT_OUTBOUND_FEATURE_ID:
        return getTarget().getOutbound();
      case DataModelPackage.CONTENTELEMENT_INBOUND_FEATURE_ID:
        return getTarget().getInbound();
      case DataModelPackage.CONTENTELEMENT_OWNEDRELATION_FEATURE_ID:
        return getTarget().getOwnedRelation();
      case DataModelPackage.CONTENTELEMENT_GROUP_FEATURE_ID:
        return getTarget().getGroup();
      case DataModelPackage.CONTENTELEMENT_GROUPEDELEMENT_FEATURE_ID:
        return getTarget().getGroupedElement();
      case DataModelPackage.CONTENTELEMENT_INAGGREGATED_FEATURE_ID:
        return getTarget().getInAggregated();
      case DataModelPackage.CONTENTELEMENT_OUTAGGREGATED_FEATURE_ID:
        return getTarget().getOutAggregated();
      case DataModelPackage.CONTENTELEMENT_SOURCE_FEATURE_ID:
        return getTarget().getSource();
      case DataModelPackage.CONTENTELEMENT_DATARELATION_FEATURE_ID:
        return getTarget().getDataRelation();
      case DataModelPackage.CONTENTELEMENT_ABSTRACTION_FEATURE_ID:
        return getTarget().getAbstraction();
      case DataModelPackage.CONTENTELEMENT_TYPE_FEATURE_ID:
        return getTarget().getType();
      case DataModelPackage.CONTENTELEMENT_CONTENTELEMENT_FEATURE_ID:
        return getTarget().getContentElement();
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
   * The adapter/wrapper for the EClass '<em><b>ManagesData</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ManagesDataModelObject<E extends ManagesData> extends
      ActionModelFactory.AbstractActionRelationshipModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return DataModelPackage.INSTANCE.getManagesDataEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return DataModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case DataModelPackage.MANAGESDATA_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case DataModelPackage.MANAGESDATA_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case DataModelPackage.MANAGESDATA_ATTRIBUTE_FEATURE_ID:
        return getTarget().getAttribute();
      case DataModelPackage.MANAGESDATA_ANNOTATION_FEATURE_ID:
        return getTarget().getAnnotation();
      case DataModelPackage.MANAGESDATA_STEREOTYPE_FEATURE_ID:
        return getTarget().getStereotype();
      case DataModelPackage.MANAGESDATA_TAGGEDVALUE_FEATURE_ID:
        return getTarget().getTaggedValue();
      case DataModelPackage.MANAGESDATA_TO_FEATURE_ID:
        return getTarget().getTo();
      case DataModelPackage.MANAGESDATA_FROM_FEATURE_ID:
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
      case DataModelPackage.MANAGESDATA_TO_FEATURE_ID:
        getTarget().setTo((AbstractDataElement) value);
        return;
      case DataModelPackage.MANAGESDATA_FROM_FEATURE_ID:
        getTarget().setFrom((ActionElement) value);
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