package org.eclipse.modisco.kdm.data;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.modisco.kdm.KdmModelPackage;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.core.CoreModelPackage;
import org.eclipse.modisco.kdm.data.dao.AbstractContentElementDao;
import org.eclipse.modisco.kdm.data.dao.AbstractDataElementDao;
import org.eclipse.modisco.kdm.data.dao.AbstractDataRelationshipDao;
import org.eclipse.modisco.kdm.data.dao.AllContentDao;
import org.eclipse.modisco.kdm.data.dao.CatalogDao;
import org.eclipse.modisco.kdm.data.dao.ChoiceContentDao;
import org.eclipse.modisco.kdm.data.dao.ColumnSetDao;
import org.eclipse.modisco.kdm.data.dao.ComplexContentTypeDao;
import org.eclipse.modisco.kdm.data.dao.ContentAttributeDao;
import org.eclipse.modisco.kdm.data.dao.ContentElementDao;
import org.eclipse.modisco.kdm.data.dao.ContentItemDao;
import org.eclipse.modisco.kdm.data.dao.ContentReferenceDao;
import org.eclipse.modisco.kdm.data.dao.ContentRestrictionDao;
import org.eclipse.modisco.kdm.data.dao.DataActionDao;
import org.eclipse.modisco.kdm.data.dao.DataContainerDao;
import org.eclipse.modisco.kdm.data.dao.DataEventDao;
import org.eclipse.modisco.kdm.data.dao.DataModelDao;
import org.eclipse.modisco.kdm.data.dao.DataRelationshipDao;
import org.eclipse.modisco.kdm.data.dao.DataResourceDao;
import org.eclipse.modisco.kdm.data.dao.DataSegmentDao;
import org.eclipse.modisco.kdm.data.dao.DatatypeOfDao;
import org.eclipse.modisco.kdm.data.dao.ExtendedDataElementDao;
import org.eclipse.modisco.kdm.data.dao.ExtensionToDao;
import org.eclipse.modisco.kdm.data.dao.GroupContentDao;
import org.eclipse.modisco.kdm.data.dao.HasContentDao;
import org.eclipse.modisco.kdm.data.dao.IndexDao;
import org.eclipse.modisco.kdm.data.dao.IndexElementDao;
import org.eclipse.modisco.kdm.data.dao.KeyRelationDao;
import org.eclipse.modisco.kdm.data.dao.ManagesDataDao;
import org.eclipse.modisco.kdm.data.dao.MixedContentDao;
import org.eclipse.modisco.kdm.data.dao.ProducesDataEventDao;
import org.eclipse.modisco.kdm.data.dao.ReadsColumnSetDao;
import org.eclipse.modisco.kdm.data.dao.RecordFileDao;
import org.eclipse.modisco.kdm.data.dao.ReferenceKeyDao;
import org.eclipse.modisco.kdm.data.dao.ReferenceToDao;
import org.eclipse.modisco.kdm.data.dao.RelationalSchemaDao;
import org.eclipse.modisco.kdm.data.dao.RelationalTableDao;
import org.eclipse.modisco.kdm.data.dao.RelationalViewDao;
import org.eclipse.modisco.kdm.data.dao.RestrictionOfDao;
import org.eclipse.modisco.kdm.data.dao.SeqContentDao;
import org.eclipse.modisco.kdm.data.dao.SimpleContentTypeDao;
import org.eclipse.modisco.kdm.data.dao.TypedByDao;
import org.eclipse.modisco.kdm.data.dao.UniqueKeyDao;
import org.eclipse.modisco.kdm.data.dao.WritesColumnSetDao;
import org.eclipse.modisco.kdm.data.dao.XMLSchemaDao;
import org.eclipse.modisco.kdm.source.SourceModelPackage;

/**
 * The <b>Package</b> for the model '<em><b>data</b></em>'. It contains initialization code and access to the Factory to
 * instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class DataModelPackage extends ModelPackage {

  /**
   * Is set when the package has been initialized.
   * 
   * @generated
   */
  private static boolean isInitialized = false;

  /**
   * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final String NS_URI = "http://www.eclipse.org/MoDisco/kdm/data";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final DataModelFactory MODELFACTORY = new DataModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAMODEL_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAMODEL_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAMODEL_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAMODEL_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAMODEL_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAMODEL_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAMODEL_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAMODEL_AUDIT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAMODEL_EXTENSION_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAMODEL_NAME_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAMODEL_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAMODEL_DATAELEMENT_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATAELEMENT_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATARELATIONSHIP_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATARELATIONSHIP_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATARELATIONSHIP_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATARELATIONSHIP_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATARELATIONSHIP_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATARELATIONSHIP_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTDATARELATIONSHIP_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARESOURCE_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEXELEMENT_IMPLEMENTATION_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UNIQUEKEY_IMPLEMENTATION_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INDEX_IMPLEMENTATION_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KEYRELATION_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KEYRELATION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KEYRELATION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KEYRELATION_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KEYRELATION_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KEYRELATION_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KEYRELATION_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KEYRELATION_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int KEYRELATION_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCEKEY_IMPLEMENTATION_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATACONTAINER_DATAELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATALOG_DATAELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_DATAELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALSCHEMA_CODEELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_CLASSIFIER_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_DATAELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COLUMNSET_ITEMUNIT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_CLASSIFIER_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_DATAELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALTABLE_ITEMUNIT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_CLASSIFIER_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_DATAELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RELATIONALVIEW_ITEMUNIT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_CLASSIFIER_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_DATAELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECORDFILE_ITEMUNIT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_CLASSIFIER_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAEVENT_KIND_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_CLASSIFIER_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int XMLSCHEMA_CONTENTELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_CLASSIFIER_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTCONTENTELEMENT_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_CLASSIFIER_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLEXCONTENTTYPE_CONTENTELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_CLASSIFIER_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ALLCONTENT_CONTENTELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_CLASSIFIER_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SEQCONTENT_CONTENTELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_CLASSIFIER_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOICECONTENT_CONTENTELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_CLASSIFIER_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_TYPE_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTITEM_CONTENTELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_CLASSIFIER_ID = 24;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_TYPE_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GROUPCONTENT_CONTENTELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_CLASSIFIER_ID = 25;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_KIND_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTRESTRICTION_VALUE_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_CLASSIFIER_ID = 26;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_CONTENTELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_TYPE_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SIMPLECONTENTTYPE_KIND_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_CLASSIFIER_ID = 27;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENDEDDATAELEMENT_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARELATIONSHIP_CLASSIFIER_ID = 28;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARELATIONSHIP_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARELATIONSHIP_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARELATIONSHIP_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARELATIONSHIP_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARELATIONSHIP_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARELATIONSHIP_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARELATIONSHIP_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATARELATIONSHIP_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_CLASSIFIER_ID = 29;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MIXEDCONTENT_CONTENTELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_CLASSIFIER_ID = 30;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_TYPE_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTREFERENCE_CONTENTELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_CLASSIFIER_ID = 31;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_KIND_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_IMPLEMENTATION_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATAACTION_DATAELEMENT_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSCOLUMNSET_CLASSIFIER_ID = 32;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSCOLUMNSET_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSCOLUMNSET_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSCOLUMNSET_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSCOLUMNSET_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSCOLUMNSET_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSCOLUMNSET_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSCOLUMNSET_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSCOLUMNSET_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_CLASSIFIER_ID = 33;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_TYPE_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTATTRIBUTE_CONTENTELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TYPEDBY_CLASSIFIER_ID = 34;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TYPEDBY_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TYPEDBY_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TYPEDBY_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TYPEDBY_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TYPEDBY_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TYPEDBY_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TYPEDBY_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TYPEDBY_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCETO_CLASSIFIER_ID = 35;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCETO_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCETO_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCETO_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCETO_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCETO_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCETO_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCETO_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REFERENCETO_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESTRICTIONOF_CLASSIFIER_ID = 36;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESTRICTIONOF_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESTRICTIONOF_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESTRICTIONOF_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESTRICTIONOF_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESTRICTIONOF_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESTRICTIONOF_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESTRICTIONOF_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RESTRICTIONOF_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONTO_CLASSIFIER_ID = 37;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONTO_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONTO_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONTO_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONTO_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONTO_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONTO_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONTO_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXTENSIONTO_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATATYPEOF_CLASSIFIER_ID = 38;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATATYPEOF_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATATYPEOF_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATATYPEOF_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATATYPEOF_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATATYPEOF_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATATYPEOF_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATATYPEOF_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATATYPEOF_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASCONTENT_CLASSIFIER_ID = 39;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASCONTENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASCONTENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASCONTENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASCONTENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASCONTENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASCONTENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASCONTENT_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int HASCONTENT_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESCOLUMNSET_CLASSIFIER_ID = 40;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESCOLUMNSET_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESCOLUMNSET_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESCOLUMNSET_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESCOLUMNSET_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESCOLUMNSET_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESCOLUMNSET_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESCOLUMNSET_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESCOLUMNSET_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCESDATAEVENT_CLASSIFIER_ID = 41;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCESDATAEVENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCESDATAEVENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCESDATAEVENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCESDATAEVENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCESDATAEVENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCESDATAEVENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCESDATAEVENT_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PRODUCESDATAEVENT_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_CLASSIFIER_ID = 42;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_DATAELEMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DATASEGMENT_ITEMUNIT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_CLASSIFIER_ID = 43;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_DATARELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_ABSTRACTION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_TYPE_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTENTELEMENT_CONTENTELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESDATA_CLASSIFIER_ID = 44;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESDATA_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESDATA_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESDATA_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESDATA_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESDATA_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESDATA_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESDATA_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESDATA_FROM_FEATURE_ID = 7;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final DataModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static DataModelPackage initialize() {

    if (isInitialized) {
      return (DataModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final DataModelPackage modelPackage = new DataModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    isInitialized = true;

    KdmModelPackage.initialize();
    org.eclipse.modisco.kdm.kdm.KdmModelPackage.initialize();
    CoreModelPackage.initialize();
    SourceModelPackage.initialize();
    ActionModelPackage.initialize();
    CodeModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(DataModel.class, modelPackage.getDataModelEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractDataElement.class,
        modelPackage.getAbstractDataElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractDataRelationship.class,
        modelPackage.getAbstractDataRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DataResource.class, modelPackage.getDataResourceEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(IndexElement.class, modelPackage.getIndexElementEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UniqueKey.class, modelPackage.getUniqueKeyEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Index.class, modelPackage.getIndexEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(KeyRelation.class, modelPackage.getKeyRelationEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ReferenceKey.class, modelPackage.getReferenceKeyEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DataContainer.class, modelPackage.getDataContainerEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Catalog.class, modelPackage.getCatalogEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RelationalSchema.class,
        modelPackage.getRelationalSchemaEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ColumnSet.class, modelPackage.getColumnSetEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RelationalTable.class,
        modelPackage.getRelationalTableEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RelationalView.class, modelPackage.getRelationalViewEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RecordFile.class, modelPackage.getRecordFileEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DataEvent.class, modelPackage.getDataEventEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(XMLSchema.class, modelPackage.getXMLSchemaEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractContentElement.class,
        modelPackage.getAbstractContentElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ComplexContentType.class,
        modelPackage.getComplexContentTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AllContent.class, modelPackage.getAllContentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SeqContent.class, modelPackage.getSeqContentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ChoiceContent.class, modelPackage.getChoiceContentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ContentItem.class, modelPackage.getContentItemEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(GroupContent.class, modelPackage.getGroupContentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ContentRestriction.class,
        modelPackage.getContentRestrictionEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(SimpleContentType.class,
        modelPackage.getSimpleContentTypeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ExtendedDataElement.class,
        modelPackage.getExtendedDataElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DataRelationship.class,
        modelPackage.getDataRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(MixedContent.class, modelPackage.getMixedContentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ContentReference.class,
        modelPackage.getContentReferenceEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DataAction.class, modelPackage.getDataActionEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ReadsColumnSet.class, modelPackage.getReadsColumnSetEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ContentAttribute.class,
        modelPackage.getContentAttributeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TypedBy.class, modelPackage.getTypedByEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ReferenceTo.class, modelPackage.getReferenceToEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RestrictionOf.class, modelPackage.getRestrictionOfEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ExtensionTo.class, modelPackage.getExtensionToEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DatatypeOf.class, modelPackage.getDatatypeOfEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(HasContent.class, modelPackage.getHasContentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(WritesColumnSet.class,
        modelPackage.getWritesColumnSetEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ProducesDataEvent.class,
        modelPackage.getProducesDataEventEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DataSegment.class, modelPackage.getDataSegmentEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ContentElement.class, modelPackage.getContentElementEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ManagesData.class, modelPackage.getManagesDataEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(DataModel.class, DataModelDao.class);
    DaoRegistry.getInstance().registerDao(AbstractDataElement.class, AbstractDataElementDao.class);
    DaoRegistry.getInstance().registerDao(AbstractDataRelationship.class, AbstractDataRelationshipDao.class);
    DaoRegistry.getInstance().registerDao(DataResource.class, DataResourceDao.class);
    DaoRegistry.getInstance().registerDao(IndexElement.class, IndexElementDao.class);
    DaoRegistry.getInstance().registerDao(UniqueKey.class, UniqueKeyDao.class);
    DaoRegistry.getInstance().registerDao(Index.class, IndexDao.class);
    DaoRegistry.getInstance().registerDao(KeyRelation.class, KeyRelationDao.class);
    DaoRegistry.getInstance().registerDao(ReferenceKey.class, ReferenceKeyDao.class);
    DaoRegistry.getInstance().registerDao(DataContainer.class, DataContainerDao.class);
    DaoRegistry.getInstance().registerDao(Catalog.class, CatalogDao.class);
    DaoRegistry.getInstance().registerDao(RelationalSchema.class, RelationalSchemaDao.class);
    DaoRegistry.getInstance().registerDao(ColumnSet.class, ColumnSetDao.class);
    DaoRegistry.getInstance().registerDao(RelationalTable.class, RelationalTableDao.class);
    DaoRegistry.getInstance().registerDao(RelationalView.class, RelationalViewDao.class);
    DaoRegistry.getInstance().registerDao(RecordFile.class, RecordFileDao.class);
    DaoRegistry.getInstance().registerDao(DataEvent.class, DataEventDao.class);
    DaoRegistry.getInstance().registerDao(XMLSchema.class, XMLSchemaDao.class);
    DaoRegistry.getInstance().registerDao(AbstractContentElement.class, AbstractContentElementDao.class);
    DaoRegistry.getInstance().registerDao(ComplexContentType.class, ComplexContentTypeDao.class);
    DaoRegistry.getInstance().registerDao(AllContent.class, AllContentDao.class);
    DaoRegistry.getInstance().registerDao(SeqContent.class, SeqContentDao.class);
    DaoRegistry.getInstance().registerDao(ChoiceContent.class, ChoiceContentDao.class);
    DaoRegistry.getInstance().registerDao(ContentItem.class, ContentItemDao.class);
    DaoRegistry.getInstance().registerDao(GroupContent.class, GroupContentDao.class);
    DaoRegistry.getInstance().registerDao(ContentRestriction.class, ContentRestrictionDao.class);
    DaoRegistry.getInstance().registerDao(SimpleContentType.class, SimpleContentTypeDao.class);
    DaoRegistry.getInstance().registerDao(ExtendedDataElement.class, ExtendedDataElementDao.class);
    DaoRegistry.getInstance().registerDao(DataRelationship.class, DataRelationshipDao.class);
    DaoRegistry.getInstance().registerDao(MixedContent.class, MixedContentDao.class);
    DaoRegistry.getInstance().registerDao(ContentReference.class, ContentReferenceDao.class);
    DaoRegistry.getInstance().registerDao(DataAction.class, DataActionDao.class);
    DaoRegistry.getInstance().registerDao(ReadsColumnSet.class, ReadsColumnSetDao.class);
    DaoRegistry.getInstance().registerDao(ContentAttribute.class, ContentAttributeDao.class);
    DaoRegistry.getInstance().registerDao(TypedBy.class, TypedByDao.class);
    DaoRegistry.getInstance().registerDao(ReferenceTo.class, ReferenceToDao.class);
    DaoRegistry.getInstance().registerDao(RestrictionOf.class, RestrictionOfDao.class);
    DaoRegistry.getInstance().registerDao(ExtensionTo.class, ExtensionToDao.class);
    DaoRegistry.getInstance().registerDao(DatatypeOf.class, DatatypeOfDao.class);
    DaoRegistry.getInstance().registerDao(HasContent.class, HasContentDao.class);
    DaoRegistry.getInstance().registerDao(WritesColumnSet.class, WritesColumnSetDao.class);
    DaoRegistry.getInstance().registerDao(ProducesDataEvent.class, ProducesDataEventDao.class);
    DaoRegistry.getInstance().registerDao(DataSegment.class, DataSegmentDao.class);
    DaoRegistry.getInstance().registerDao(ContentElement.class, ContentElementDao.class);
    DaoRegistry.getInstance().registerDao(ManagesData.class, ManagesDataDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link DataModelFactory} instance.
   * @generated
   */
  @Override
  public DataModelFactory getModelFactory() {
    return MODELFACTORY;
  }

  /**
   * Returns the nsUri of the {@link EPackage} managed by this Package instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return the nsUri of the EPackage
   * @generated
   */
  @Override
  public String getNsURI() {
    return NS_URI;
  }

  /**
   * Returns the name of the ecore file containing the ecore model of the {@link EPackage} managed here. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the name of the ecore file
   * @generated
   */
  @Override
  public String getEcoreFileName() {
    return "data.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>DataModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DataModel</b></em>'
   * @generated
   */
  public EClass getDataModelEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATAMODEL_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataModel.dataElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataModel.dataElement</b></em>'.
   * @generated
   */
  public EReference getDataModel_DataElement() {
    return (EReference) getDataModelEClass().getEAllStructuralFeatures().get(DATAMODEL_DATAELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractDataElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractDataElement</b></em>'
   * @generated
   */
  public EClass getAbstractDataElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTDATAELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractDataElement.source</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractDataElement.source</b></em>'.
   * @generated
   */
  public EReference getAbstractDataElement_Source() {
    return (EReference) getAbstractDataElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTDATAELEMENT_SOURCE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractDataElement.dataRelation</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractDataElement.dataRelation</b></em>'.
   * @generated
   */
  public EReference getAbstractDataElement_DataRelation() {
    return (EReference) getAbstractDataElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTDATAELEMENT_DATARELATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractDataElement.abstraction</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractDataElement.abstraction</b></em>'.
   * @generated
   */
  public EReference getAbstractDataElement_Abstraction() {
    return (EReference) getAbstractDataElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTDATAELEMENT_ABSTRACTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractDataRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractDataRelationship</b></em>'
   * @generated
   */
  public EClass getAbstractDataRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTDATARELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DataResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DataResource</b></em>'
   * @generated
   */
  public EClass getDataResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATARESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>IndexElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>IndexElement</b></em>'
   * @generated
   */
  public EClass getIndexElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(INDEXELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>IndexElement.implementation</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>IndexElement.implementation</b></em>'.
   * @generated
   */
  public EReference getIndexElement_Implementation() {
    return (EReference) getIndexElementEClass().getEAllStructuralFeatures().get(INDEXELEMENT_IMPLEMENTATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UniqueKey</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>UniqueKey</b></em>'
   * @generated
   */
  public EClass getUniqueKeyEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UNIQUEKEY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Index</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Index</b></em>'
   * @generated
   */
  public EClass getIndexEClass() {
    return (EClass) getEPackage().getEClassifiers().get(INDEX_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>KeyRelation</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>KeyRelation</b></em>'
   * @generated
   */
  public EClass getKeyRelationEClass() {
    return (EClass) getEPackage().getEClassifiers().get(KEYRELATION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KeyRelation.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KeyRelation.to</b></em>'.
   * @generated
   */
  public EReference getKeyRelation_To() {
    return (EReference) getKeyRelationEClass().getEAllStructuralFeatures().get(KEYRELATION_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>KeyRelation.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>KeyRelation.from</b></em>'.
   * @generated
   */
  public EReference getKeyRelation_From() {
    return (EReference) getKeyRelationEClass().getEAllStructuralFeatures().get(KEYRELATION_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ReferenceKey</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ReferenceKey</b></em>'
   * @generated
   */
  public EClass getReferenceKeyEClass() {
    return (EClass) getEPackage().getEClassifiers().get(REFERENCEKEY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DataContainer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DataContainer</b></em>'
   * @generated
   */
  public EClass getDataContainerEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATACONTAINER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataContainer.dataElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataContainer.dataElement</b></em>'.
   * @generated
   */
  public EReference getDataContainer_DataElement() {
    return (EReference) getDataContainerEClass().getEAllStructuralFeatures().get(DATACONTAINER_DATAELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Catalog</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Catalog</b></em>'
   * @generated
   */
  public EClass getCatalogEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CATALOG_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RelationalSchema</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RelationalSchema</b></em>'
   * @generated
   */
  public EClass getRelationalSchemaEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RELATIONALSCHEMA_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RelationalSchema.codeElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RelationalSchema.codeElement</b></em>'.
   * @generated
   */
  public EReference getRelationalSchema_CodeElement() {
    return (EReference) getRelationalSchemaEClass().getEAllStructuralFeatures().get(
        RELATIONALSCHEMA_CODEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ColumnSet</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ColumnSet</b></em>'
   * @generated
   */
  public EClass getColumnSetEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COLUMNSET_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ColumnSet.itemUnit</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ColumnSet.itemUnit</b></em>'.
   * @generated
   */
  public EReference getColumnSet_ItemUnit() {
    return (EReference) getColumnSetEClass().getEAllStructuralFeatures().get(COLUMNSET_ITEMUNIT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RelationalTable</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RelationalTable</b></em>'
   * @generated
   */
  public EClass getRelationalTableEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RELATIONALTABLE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RelationalView</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RelationalView</b></em>'
   * @generated
   */
  public EClass getRelationalViewEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RELATIONALVIEW_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RecordFile</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RecordFile</b></em>'
   * @generated
   */
  public EClass getRecordFileEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RECORDFILE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DataEvent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DataEvent</b></em>'
   * @generated
   */
  public EClass getDataEventEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATAEVENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataEvent.kind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataEvent.kind</b></em>'.
   * @generated
   */
  public EAttribute getDataEvent_Kind() {
    return (EAttribute) getDataEventEClass().getEAllStructuralFeatures().get(DATAEVENT_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>XMLSchema</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>XMLSchema</b></em>'
   * @generated
   */
  public EClass getXMLSchemaEClass() {
    return (EClass) getEPackage().getEClassifiers().get(XMLSCHEMA_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>XMLSchema.contentElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>XMLSchema.contentElement</b></em>'.
   * @generated
   */
  public EReference getXMLSchema_ContentElement() {
    return (EReference) getXMLSchemaEClass().getEAllStructuralFeatures().get(XMLSCHEMA_CONTENTELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractContentElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractContentElement</b></em>'
   * @generated
   */
  public EClass getAbstractContentElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTCONTENTELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ComplexContentType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ComplexContentType</b></em>'
   * @generated
   */
  public EClass getComplexContentTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMPLEXCONTENTTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ComplexContentType.contentElement</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ComplexContentType.contentElement</b></em>'.
   * @generated
   */
  public EReference getComplexContentType_ContentElement() {
    return (EReference) getComplexContentTypeEClass().getEAllStructuralFeatures().get(
        COMPLEXCONTENTTYPE_CONTENTELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AllContent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AllContent</b></em>'
   * @generated
   */
  public EClass getAllContentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ALLCONTENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SeqContent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SeqContent</b></em>'
   * @generated
   */
  public EClass getSeqContentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SEQCONTENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ChoiceContent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ChoiceContent</b></em>'
   * @generated
   */
  public EClass getChoiceContentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CHOICECONTENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ContentItem</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ContentItem</b></em>'
   * @generated
   */
  public EClass getContentItemEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONTENTITEM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ContentItem.type</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ContentItem.type</b></em>'.
   * @generated
   */
  public EReference getContentItem_Type() {
    return (EReference) getContentItemEClass().getEAllStructuralFeatures().get(CONTENTITEM_TYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ContentItem.contentElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ContentItem.contentElement</b></em>'.
   * @generated
   */
  public EReference getContentItem_ContentElement() {
    return (EReference) getContentItemEClass().getEAllStructuralFeatures().get(CONTENTITEM_CONTENTELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>GroupContent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>GroupContent</b></em>'
   * @generated
   */
  public EClass getGroupContentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(GROUPCONTENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ContentRestriction</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ContentRestriction</b></em>'
   * @generated
   */
  public EClass getContentRestrictionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONTENTRESTRICTION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ContentRestriction.kind</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ContentRestriction.kind</b></em>'.
   * @generated
   */
  public EAttribute getContentRestriction_Kind() {
    return (EAttribute) getContentRestrictionEClass().getEAllStructuralFeatures().get(
        CONTENTRESTRICTION_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ContentRestriction.value</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ContentRestriction.value</b></em>'.
   * @generated
   */
  public EAttribute getContentRestriction_Value() {
    return (EAttribute) getContentRestrictionEClass().getEAllStructuralFeatures().get(
        CONTENTRESTRICTION_VALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>SimpleContentType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SimpleContentType</b></em>'
   * @generated
   */
  public EClass getSimpleContentTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SIMPLECONTENTTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleContentType.type</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleContentType.type</b></em>'.
   * @generated
   */
  public EReference getSimpleContentType_Type() {
    return (EReference) getSimpleContentTypeEClass().getEAllStructuralFeatures().get(SIMPLECONTENTTYPE_TYPE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SimpleContentType.kind</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SimpleContentType.kind</b></em>'.
   * @generated
   */
  public EAttribute getSimpleContentType_Kind() {
    return (EAttribute) getSimpleContentTypeEClass().getEAllStructuralFeatures().get(SIMPLECONTENTTYPE_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ExtendedDataElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ExtendedDataElement</b></em>'
   * @generated
   */
  public EClass getExtendedDataElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EXTENDEDDATAELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DataRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DataRelationship</b></em>'
   * @generated
   */
  public EClass getDataRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATARELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataRelationship.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataRelationship.to</b></em>'.
   * @generated
   */
  public EReference getDataRelationship_To() {
    return (EReference) getDataRelationshipEClass().getEAllStructuralFeatures().get(DATARELATIONSHIP_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataRelationship.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataRelationship.from</b></em>'.
   * @generated
   */
  public EReference getDataRelationship_From() {
    return (EReference) getDataRelationshipEClass().getEAllStructuralFeatures().get(DATARELATIONSHIP_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>MixedContent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>MixedContent</b></em>'
   * @generated
   */
  public EClass getMixedContentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MIXEDCONTENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ContentReference</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ContentReference</b></em>'
   * @generated
   */
  public EClass getContentReferenceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONTENTREFERENCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DataAction</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DataAction</b></em>'
   * @generated
   */
  public EClass getDataActionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATAACTION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataAction.kind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataAction.kind</b></em>'.
   * @generated
   */
  public EAttribute getDataAction_Kind() {
    return (EAttribute) getDataActionEClass().getEAllStructuralFeatures().get(DATAACTION_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataAction.implementation</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataAction.implementation</b></em>'.
   * @generated
   */
  public EReference getDataAction_Implementation() {
    return (EReference) getDataActionEClass().getEAllStructuralFeatures().get(DATAACTION_IMPLEMENTATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DataAction.dataElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DataAction.dataElement</b></em>'.
   * @generated
   */
  public EReference getDataAction_DataElement() {
    return (EReference) getDataActionEClass().getEAllStructuralFeatures().get(DATAACTION_DATAELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ReadsColumnSet</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ReadsColumnSet</b></em>'
   * @generated
   */
  public EClass getReadsColumnSetEClass() {
    return (EClass) getEPackage().getEClassifiers().get(READSCOLUMNSET_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ReadsColumnSet.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ReadsColumnSet.to</b></em>'.
   * @generated
   */
  public EReference getReadsColumnSet_To() {
    return (EReference) getReadsColumnSetEClass().getEAllStructuralFeatures().get(READSCOLUMNSET_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ReadsColumnSet.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ReadsColumnSet.from</b></em>'.
   * @generated
   */
  public EReference getReadsColumnSet_From() {
    return (EReference) getReadsColumnSetEClass().getEAllStructuralFeatures().get(READSCOLUMNSET_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ContentAttribute</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ContentAttribute</b></em>'
   * @generated
   */
  public EClass getContentAttributeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONTENTATTRIBUTE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TypedBy</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TypedBy</b></em>'
   * @generated
   */
  public EClass getTypedByEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TYPEDBY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TypedBy.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TypedBy.to</b></em>'.
   * @generated
   */
  public EReference getTypedBy_To() {
    return (EReference) getTypedByEClass().getEAllStructuralFeatures().get(TYPEDBY_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TypedBy.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TypedBy.from</b></em>'.
   * @generated
   */
  public EReference getTypedBy_From() {
    return (EReference) getTypedByEClass().getEAllStructuralFeatures().get(TYPEDBY_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ReferenceTo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ReferenceTo</b></em>'
   * @generated
   */
  public EClass getReferenceToEClass() {
    return (EClass) getEPackage().getEClassifiers().get(REFERENCETO_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ReferenceTo.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ReferenceTo.to</b></em>'.
   * @generated
   */
  public EReference getReferenceTo_To() {
    return (EReference) getReferenceToEClass().getEAllStructuralFeatures().get(REFERENCETO_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ReferenceTo.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ReferenceTo.from</b></em>'.
   * @generated
   */
  public EReference getReferenceTo_From() {
    return (EReference) getReferenceToEClass().getEAllStructuralFeatures().get(REFERENCETO_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RestrictionOf</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RestrictionOf</b></em>'
   * @generated
   */
  public EClass getRestrictionOfEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RESTRICTIONOF_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RestrictionOf.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RestrictionOf.to</b></em>'.
   * @generated
   */
  public EReference getRestrictionOf_To() {
    return (EReference) getRestrictionOfEClass().getEAllStructuralFeatures().get(RESTRICTIONOF_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RestrictionOf.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RestrictionOf.from</b></em>'.
   * @generated
   */
  public EReference getRestrictionOf_From() {
    return (EReference) getRestrictionOfEClass().getEAllStructuralFeatures().get(RESTRICTIONOF_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ExtensionTo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ExtensionTo</b></em>'
   * @generated
   */
  public EClass getExtensionToEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EXTENSIONTO_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ExtensionTo.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ExtensionTo.to</b></em>'.
   * @generated
   */
  public EReference getExtensionTo_To() {
    return (EReference) getExtensionToEClass().getEAllStructuralFeatures().get(EXTENSIONTO_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ExtensionTo.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ExtensionTo.from</b></em>'.
   * @generated
   */
  public EReference getExtensionTo_From() {
    return (EReference) getExtensionToEClass().getEAllStructuralFeatures().get(EXTENSIONTO_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DatatypeOf</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DatatypeOf</b></em>'
   * @generated
   */
  public EClass getDatatypeOfEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATATYPEOF_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DatatypeOf.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DatatypeOf.to</b></em>'.
   * @generated
   */
  public EReference getDatatypeOf_To() {
    return (EReference) getDatatypeOfEClass().getEAllStructuralFeatures().get(DATATYPEOF_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DatatypeOf.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DatatypeOf.from</b></em>'.
   * @generated
   */
  public EReference getDatatypeOf_From() {
    return (EReference) getDatatypeOfEClass().getEAllStructuralFeatures().get(DATATYPEOF_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>HasContent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>HasContent</b></em>'
   * @generated
   */
  public EClass getHasContentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(HASCONTENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>HasContent.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>HasContent.to</b></em>'.
   * @generated
   */
  public EReference getHasContent_To() {
    return (EReference) getHasContentEClass().getEAllStructuralFeatures().get(HASCONTENT_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>HasContent.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>HasContent.from</b></em>'.
   * @generated
   */
  public EReference getHasContent_From() {
    return (EReference) getHasContentEClass().getEAllStructuralFeatures().get(HASCONTENT_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>WritesColumnSet</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>WritesColumnSet</b></em>'
   * @generated
   */
  public EClass getWritesColumnSetEClass() {
    return (EClass) getEPackage().getEClassifiers().get(WRITESCOLUMNSET_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WritesColumnSet.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WritesColumnSet.to</b></em>'.
   * @generated
   */
  public EReference getWritesColumnSet_To() {
    return (EReference) getWritesColumnSetEClass().getEAllStructuralFeatures().get(WRITESCOLUMNSET_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WritesColumnSet.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WritesColumnSet.from</b></em>'.
   * @generated
   */
  public EReference getWritesColumnSet_From() {
    return (EReference) getWritesColumnSetEClass().getEAllStructuralFeatures().get(WRITESCOLUMNSET_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ProducesDataEvent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ProducesDataEvent</b></em>'
   * @generated
   */
  public EClass getProducesDataEventEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PRODUCESDATAEVENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ProducesDataEvent.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ProducesDataEvent.to</b></em>'.
   * @generated
   */
  public EReference getProducesDataEvent_To() {
    return (EReference) getProducesDataEventEClass().getEAllStructuralFeatures().get(PRODUCESDATAEVENT_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ProducesDataEvent.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ProducesDataEvent.from</b></em>'.
   * @generated
   */
  public EReference getProducesDataEvent_From() {
    return (EReference) getProducesDataEventEClass().getEAllStructuralFeatures().get(PRODUCESDATAEVENT_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DataSegment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DataSegment</b></em>'
   * @generated
   */
  public EClass getDataSegmentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DATASEGMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ContentElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ContentElement</b></em>'
   * @generated
   */
  public EClass getContentElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONTENTELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ManagesData</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ManagesData</b></em>'
   * @generated
   */
  public EClass getManagesDataEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MANAGESDATA_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManagesData.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManagesData.to</b></em>'.
   * @generated
   */
  public EReference getManagesData_To() {
    return (EReference) getManagesDataEClass().getEAllStructuralFeatures().get(MANAGESDATA_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManagesData.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManagesData.from</b></em>'.
   * @generated
   */
  public EReference getManagesData_From() {
    return (EReference) getManagesDataEClass().getEAllStructuralFeatures().get(MANAGESDATA_FROM_FEATURE_ID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClassifier
   *          the {@link EClassifier}
   * @return the class implementing a specific {@link EClass}.
   * @generated
   */
  @Override
  public Class<?> getEClassifierClass(EClassifier eClassifier) {
    switch (eClassifier.getClassifierID()) {
    case DATAMODEL_CLASSIFIER_ID:
      return DataModel.class;
    case ABSTRACTDATAELEMENT_CLASSIFIER_ID:
      return AbstractDataElement.class;
    case ABSTRACTDATARELATIONSHIP_CLASSIFIER_ID:
      return AbstractDataRelationship.class;
    case DATARESOURCE_CLASSIFIER_ID:
      return DataResource.class;
    case INDEXELEMENT_CLASSIFIER_ID:
      return IndexElement.class;
    case UNIQUEKEY_CLASSIFIER_ID:
      return UniqueKey.class;
    case INDEX_CLASSIFIER_ID:
      return Index.class;
    case KEYRELATION_CLASSIFIER_ID:
      return KeyRelation.class;
    case REFERENCEKEY_CLASSIFIER_ID:
      return ReferenceKey.class;
    case DATACONTAINER_CLASSIFIER_ID:
      return DataContainer.class;
    case CATALOG_CLASSIFIER_ID:
      return Catalog.class;
    case RELATIONALSCHEMA_CLASSIFIER_ID:
      return RelationalSchema.class;
    case COLUMNSET_CLASSIFIER_ID:
      return ColumnSet.class;
    case RELATIONALTABLE_CLASSIFIER_ID:
      return RelationalTable.class;
    case RELATIONALVIEW_CLASSIFIER_ID:
      return RelationalView.class;
    case RECORDFILE_CLASSIFIER_ID:
      return RecordFile.class;
    case DATAEVENT_CLASSIFIER_ID:
      return DataEvent.class;
    case XMLSCHEMA_CLASSIFIER_ID:
      return XMLSchema.class;
    case ABSTRACTCONTENTELEMENT_CLASSIFIER_ID:
      return AbstractContentElement.class;
    case COMPLEXCONTENTTYPE_CLASSIFIER_ID:
      return ComplexContentType.class;
    case ALLCONTENT_CLASSIFIER_ID:
      return AllContent.class;
    case SEQCONTENT_CLASSIFIER_ID:
      return SeqContent.class;
    case CHOICECONTENT_CLASSIFIER_ID:
      return ChoiceContent.class;
    case CONTENTITEM_CLASSIFIER_ID:
      return ContentItem.class;
    case GROUPCONTENT_CLASSIFIER_ID:
      return GroupContent.class;
    case CONTENTRESTRICTION_CLASSIFIER_ID:
      return ContentRestriction.class;
    case SIMPLECONTENTTYPE_CLASSIFIER_ID:
      return SimpleContentType.class;
    case EXTENDEDDATAELEMENT_CLASSIFIER_ID:
      return ExtendedDataElement.class;
    case DATARELATIONSHIP_CLASSIFIER_ID:
      return DataRelationship.class;
    case MIXEDCONTENT_CLASSIFIER_ID:
      return MixedContent.class;
    case CONTENTREFERENCE_CLASSIFIER_ID:
      return ContentReference.class;
    case DATAACTION_CLASSIFIER_ID:
      return DataAction.class;
    case READSCOLUMNSET_CLASSIFIER_ID:
      return ReadsColumnSet.class;
    case CONTENTATTRIBUTE_CLASSIFIER_ID:
      return ContentAttribute.class;
    case TYPEDBY_CLASSIFIER_ID:
      return TypedBy.class;
    case REFERENCETO_CLASSIFIER_ID:
      return ReferenceTo.class;
    case RESTRICTIONOF_CLASSIFIER_ID:
      return RestrictionOf.class;
    case EXTENSIONTO_CLASSIFIER_ID:
      return ExtensionTo.class;
    case DATATYPEOF_CLASSIFIER_ID:
      return DatatypeOf.class;
    case HASCONTENT_CLASSIFIER_ID:
      return HasContent.class;
    case WRITESCOLUMNSET_CLASSIFIER_ID:
      return WritesColumnSet.class;
    case PRODUCESDATAEVENT_CLASSIFIER_ID:
      return ProducesDataEvent.class;
    case DATASEGMENT_CLASSIFIER_ID:
      return DataSegment.class;
    case CONTENTELEMENT_CLASSIFIER_ID:
      return ContentElement.class;
    case MANAGESDATA_CLASSIFIER_ID:
      return ManagesData.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
