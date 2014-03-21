package org.eclipse.modisco.kdm.ui;

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
import org.eclipse.modisco.kdm.source.SourceModelPackage;
import org.eclipse.modisco.kdm.ui.dao.AbstractUIElementDao;
import org.eclipse.modisco.kdm.ui.dao.AbstractUIRelationshipDao;
import org.eclipse.modisco.kdm.ui.dao.DisplaysDao;
import org.eclipse.modisco.kdm.ui.dao.DisplaysImageDao;
import org.eclipse.modisco.kdm.ui.dao.ManagesUIDao;
import org.eclipse.modisco.kdm.ui.dao.ReadsUIDao;
import org.eclipse.modisco.kdm.ui.dao.ReportDao;
import org.eclipse.modisco.kdm.ui.dao.ScreenDao;
import org.eclipse.modisco.kdm.ui.dao.UIActionDao;
import org.eclipse.modisco.kdm.ui.dao.UIDisplayDao;
import org.eclipse.modisco.kdm.ui.dao.UIElementDao;
import org.eclipse.modisco.kdm.ui.dao.UIEventDao;
import org.eclipse.modisco.kdm.ui.dao.UIFieldDao;
import org.eclipse.modisco.kdm.ui.dao.UIFlowDao;
import org.eclipse.modisco.kdm.ui.dao.UILayoutDao;
import org.eclipse.modisco.kdm.ui.dao.UIModelDao;
import org.eclipse.modisco.kdm.ui.dao.UIRelationshipDao;
import org.eclipse.modisco.kdm.ui.dao.UIResourceDao;
import org.eclipse.modisco.kdm.ui.dao.WritesUIDao;

/**
 * The <b>Package</b> for the model '<em><b>ui</b></em>'. It contains initialization code and access to the Factory to
 * instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class UiModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/MoDisco/kdm/ui";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final UiModelFactory MODELFACTORY = new UiModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_UIRELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_IMPLEMENTATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIELEMENT_ABSTRACTION_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIRELATIONSHIP_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIRELATIONSHIP_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIRELATIONSHIP_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIRELATIONSHIP_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIRELATIONSHIP_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIRELATIONSHIP_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTUIRELATIONSHIP_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_UIRELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_IMPLEMENTATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_ABSTRACTION_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRESOURCE_UIELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_UIRELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_IMPLEMENTATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_ABSTRACTION_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIDISPLAY_UIELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_UIRELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_IMPLEMENTATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_ABSTRACTION_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SCREEN_UIELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_UIRELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_IMPLEMENTATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_ABSTRACTION_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int REPORT_UIELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIMODEL_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIMODEL_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIMODEL_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIMODEL_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIMODEL_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIMODEL_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIMODEL_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIMODEL_AUDIT_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIMODEL_EXTENSION_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIMODEL_NAME_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIMODEL_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIMODEL_UIELEMENT_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UILAYOUT_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UILAYOUT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UILAYOUT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UILAYOUT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UILAYOUT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UILAYOUT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UILAYOUT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UILAYOUT_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UILAYOUT_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_UIRELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_IMPLEMENTATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_ABSTRACTION_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFIELD_UIELEMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYSIMAGE_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYSIMAGE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYSIMAGE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYSIMAGE_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYSIMAGE_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYSIMAGE_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYSIMAGE_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYSIMAGE_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYSIMAGE_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYS_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYS_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYS_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYS_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYS_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYS_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYS_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYS_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPLAYS_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFLOW_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFLOW_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFLOW_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFLOW_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFLOW_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFLOW_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFLOW_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFLOW_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIFLOW_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_CLASSIFIER_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_UIRELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_IMPLEMENTATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIELEMENT_ABSTRACTION_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRELATIONSHIP_CLASSIFIER_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRELATIONSHIP_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRELATIONSHIP_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRELATIONSHIP_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRELATIONSHIP_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRELATIONSHIP_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRELATIONSHIP_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRELATIONSHIP_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIRELATIONSHIP_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_CLASSIFIER_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_UIRELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_IMPLEMENTATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_ABSTRACTION_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_KIND_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIACTION_UIELEMENT_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_CLASSIFIER_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_UIRELATION_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_IMPLEMENTATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_ABSTRACTION_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int UIEVENT_KIND_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSUI_CLASSIFIER_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSUI_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSUI_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSUI_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSUI_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSUI_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSUI_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSUI_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READSUI_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESUI_CLASSIFIER_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESUI_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESUI_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESUI_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESUI_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESUI_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESUI_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESUI_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITESUI_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESUI_CLASSIFIER_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESUI_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESUI_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESUI_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESUI_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESUI_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESUI_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESUI_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANAGESUI_FROM_FEATURE_ID = 7;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final UiModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static UiModelPackage initialize() {

    if (isInitialized) {
      return (UiModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final UiModelPackage modelPackage = new UiModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    isInitialized = true;

    KdmModelPackage.initialize();
    CoreModelPackage.initialize();
    SourceModelPackage.initialize();
    CodeModelPackage.initialize();
    ActionModelPackage.initialize();
    org.eclipse.modisco.kdm.kdm.KdmModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(AbstractUIElement.class,
        modelPackage.getAbstractUIElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractUIRelationship.class,
        modelPackage.getAbstractUIRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIResource.class, modelPackage.getUIResourceEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIDisplay.class, modelPackage.getUIDisplayEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Screen.class, modelPackage.getScreenEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Report.class, modelPackage.getReportEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIModel.class, modelPackage.getUIModelEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UILayout.class, modelPackage.getUILayoutEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIField.class, modelPackage.getUIFieldEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(DisplaysImage.class, modelPackage.getDisplaysImageEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Displays.class, modelPackage.getDisplaysEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIFlow.class, modelPackage.getUIFlowEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIElement.class, modelPackage.getUIElementEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIRelationship.class, modelPackage.getUIRelationshipEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIAction.class, modelPackage.getUIActionEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UIEvent.class, modelPackage.getUIEventEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ReadsUI.class, modelPackage.getReadsUIEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(WritesUI.class, modelPackage.getWritesUIEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ManagesUI.class, modelPackage.getManagesUIEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(AbstractUIElement.class, AbstractUIElementDao.class);
    DaoRegistry.getInstance().registerDao(AbstractUIRelationship.class, AbstractUIRelationshipDao.class);
    DaoRegistry.getInstance().registerDao(UIResource.class, UIResourceDao.class);
    DaoRegistry.getInstance().registerDao(UIDisplay.class, UIDisplayDao.class);
    DaoRegistry.getInstance().registerDao(Screen.class, ScreenDao.class);
    DaoRegistry.getInstance().registerDao(Report.class, ReportDao.class);
    DaoRegistry.getInstance().registerDao(UIModel.class, UIModelDao.class);
    DaoRegistry.getInstance().registerDao(UILayout.class, UILayoutDao.class);
    DaoRegistry.getInstance().registerDao(UIField.class, UIFieldDao.class);
    DaoRegistry.getInstance().registerDao(DisplaysImage.class, DisplaysImageDao.class);
    DaoRegistry.getInstance().registerDao(Displays.class, DisplaysDao.class);
    DaoRegistry.getInstance().registerDao(UIFlow.class, UIFlowDao.class);
    DaoRegistry.getInstance().registerDao(UIElement.class, UIElementDao.class);
    DaoRegistry.getInstance().registerDao(UIRelationship.class, UIRelationshipDao.class);
    DaoRegistry.getInstance().registerDao(UIAction.class, UIActionDao.class);
    DaoRegistry.getInstance().registerDao(UIEvent.class, UIEventDao.class);
    DaoRegistry.getInstance().registerDao(ReadsUI.class, ReadsUIDao.class);
    DaoRegistry.getInstance().registerDao(WritesUI.class, WritesUIDao.class);
    DaoRegistry.getInstance().registerDao(ManagesUI.class, ManagesUIDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link UiModelFactory} instance.
   * @generated
   */
  @Override
  public UiModelFactory getModelFactory() {
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
    return "ui.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractUIElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractUIElement</b></em>'
   * @generated
   */
  public EClass getAbstractUIElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTUIELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractUIElement.source</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractUIElement.source</b></em>'.
   * @generated
   */
  public EReference getAbstractUIElement_Source() {
    return (EReference) getAbstractUIElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTUIELEMENT_SOURCE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractUIElement.UIRelation</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractUIElement.UIRelation</b></em>'.
   * @generated
   */
  public EReference getAbstractUIElement_UIRelation() {
    return (EReference) getAbstractUIElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTUIELEMENT_UIRELATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractUIElement.implementation</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractUIElement.implementation</b></em>'.
   * @generated
   */
  public EReference getAbstractUIElement_Implementation() {
    return (EReference) getAbstractUIElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTUIELEMENT_IMPLEMENTATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractUIElement.abstraction</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractUIElement.abstraction</b></em>'.
   * @generated
   */
  public EReference getAbstractUIElement_Abstraction() {
    return (EReference) getAbstractUIElementEClass().getEAllStructuralFeatures().get(
        ABSTRACTUIELEMENT_ABSTRACTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractUIRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractUIRelationship</b></em>'
   * @generated
   */
  public EClass getAbstractUIRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTUIRELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>UIResource</b></em>'
   * @generated
   */
  public EClass getUIResourceEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIRESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIResource.UIElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIResource.UIElement</b></em>'.
   * @generated
   */
  public EReference getUIResource_UIElement() {
    return (EReference) getUIResourceEClass().getEAllStructuralFeatures().get(UIRESOURCE_UIELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIDisplay</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>UIDisplay</b></em>'
   * @generated
   */
  public EClass getUIDisplayEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIDISPLAY_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Screen</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Screen</b></em>'
   * @generated
   */
  public EClass getScreenEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SCREEN_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Report</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Report</b></em>'
   * @generated
   */
  public EClass getReportEClass() {
    return (EClass) getEPackage().getEClassifiers().get(REPORT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>UIModel</b></em>'
   * @generated
   */
  public EClass getUIModelEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIMODEL_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIModel.UIElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIModel.UIElement</b></em>'.
   * @generated
   */
  public EReference getUIModel_UIElement() {
    return (EReference) getUIModelEClass().getEAllStructuralFeatures().get(UIMODEL_UIELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UILayout</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>UILayout</b></em>'
   * @generated
   */
  public EClass getUILayoutEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UILAYOUT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UILayout.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UILayout.to</b></em>'.
   * @generated
   */
  public EReference getUILayout_To() {
    return (EReference) getUILayoutEClass().getEAllStructuralFeatures().get(UILAYOUT_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UILayout.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UILayout.from</b></em>'.
   * @generated
   */
  public EReference getUILayout_From() {
    return (EReference) getUILayoutEClass().getEAllStructuralFeatures().get(UILAYOUT_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIField</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>UIField</b></em>'
   * @generated
   */
  public EClass getUIFieldEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIFIELD_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>DisplaysImage</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>DisplaysImage</b></em>'
   * @generated
   */
  public EClass getDisplaysImageEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DISPLAYSIMAGE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DisplaysImage.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DisplaysImage.to</b></em>'.
   * @generated
   */
  public EReference getDisplaysImage_To() {
    return (EReference) getDisplaysImageEClass().getEAllStructuralFeatures().get(DISPLAYSIMAGE_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>DisplaysImage.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>DisplaysImage.from</b></em>'.
   * @generated
   */
  public EReference getDisplaysImage_From() {
    return (EReference) getDisplaysImageEClass().getEAllStructuralFeatures().get(DISPLAYSIMAGE_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Displays</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Displays</b></em>'
   * @generated
   */
  public EClass getDisplaysEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DISPLAYS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Displays.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Displays.to</b></em>'.
   * @generated
   */
  public EReference getDisplays_To() {
    return (EReference) getDisplaysEClass().getEAllStructuralFeatures().get(DISPLAYS_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Displays.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Displays.from</b></em>'.
   * @generated
   */
  public EReference getDisplays_From() {
    return (EReference) getDisplaysEClass().getEAllStructuralFeatures().get(DISPLAYS_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIFlow</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>UIFlow</b></em>'
   * @generated
   */
  public EClass getUIFlowEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIFLOW_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIFlow.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIFlow.to</b></em>'.
   * @generated
   */
  public EReference getUIFlow_To() {
    return (EReference) getUIFlowEClass().getEAllStructuralFeatures().get(UIFLOW_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIFlow.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIFlow.from</b></em>'.
   * @generated
   */
  public EReference getUIFlow_From() {
    return (EReference) getUIFlowEClass().getEAllStructuralFeatures().get(UIFLOW_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>UIElement</b></em>'
   * @generated
   */
  public EClass getUIElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>UIRelationship</b></em>'
   * @generated
   */
  public EClass getUIRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIRELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIRelationship.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIRelationship.to</b></em>'.
   * @generated
   */
  public EReference getUIRelationship_To() {
    return (EReference) getUIRelationshipEClass().getEAllStructuralFeatures().get(UIRELATIONSHIP_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIRelationship.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIRelationship.from</b></em>'.
   * @generated
   */
  public EReference getUIRelationship_From() {
    return (EReference) getUIRelationshipEClass().getEAllStructuralFeatures().get(UIRELATIONSHIP_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIAction</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>UIAction</b></em>'
   * @generated
   */
  public EClass getUIActionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIACTION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIAction.kind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIAction.kind</b></em>'.
   * @generated
   */
  public EAttribute getUIAction_Kind() {
    return (EAttribute) getUIActionEClass().getEAllStructuralFeatures().get(UIACTION_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIAction.UIElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIAction.UIElement</b></em>'.
   * @generated
   */
  public EReference getUIAction_UIElement() {
    return (EReference) getUIActionEClass().getEAllStructuralFeatures().get(UIACTION_UIELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UIEvent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>UIEvent</b></em>'
   * @generated
   */
  public EClass getUIEventEClass() {
    return (EClass) getEPackage().getEClassifiers().get(UIEVENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UIEvent.kind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UIEvent.kind</b></em>'.
   * @generated
   */
  public EAttribute getUIEvent_Kind() {
    return (EAttribute) getUIEventEClass().getEAllStructuralFeatures().get(UIEVENT_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ReadsUI</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ReadsUI</b></em>'
   * @generated
   */
  public EClass getReadsUIEClass() {
    return (EClass) getEPackage().getEClassifiers().get(READSUI_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ReadsUI.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ReadsUI.to</b></em>'.
   * @generated
   */
  public EReference getReadsUI_To() {
    return (EReference) getReadsUIEClass().getEAllStructuralFeatures().get(READSUI_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ReadsUI.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ReadsUI.from</b></em>'.
   * @generated
   */
  public EReference getReadsUI_From() {
    return (EReference) getReadsUIEClass().getEAllStructuralFeatures().get(READSUI_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>WritesUI</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>WritesUI</b></em>'
   * @generated
   */
  public EClass getWritesUIEClass() {
    return (EClass) getEPackage().getEClassifiers().get(WRITESUI_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WritesUI.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WritesUI.to</b></em>'.
   * @generated
   */
  public EReference getWritesUI_To() {
    return (EReference) getWritesUIEClass().getEAllStructuralFeatures().get(WRITESUI_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WritesUI.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WritesUI.from</b></em>'.
   * @generated
   */
  public EReference getWritesUI_From() {
    return (EReference) getWritesUIEClass().getEAllStructuralFeatures().get(WRITESUI_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ManagesUI</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ManagesUI</b></em>'
   * @generated
   */
  public EClass getManagesUIEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MANAGESUI_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManagesUI.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManagesUI.to</b></em>'.
   * @generated
   */
  public EReference getManagesUI_To() {
    return (EReference) getManagesUIEClass().getEAllStructuralFeatures().get(MANAGESUI_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ManagesUI.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ManagesUI.from</b></em>'.
   * @generated
   */
  public EReference getManagesUI_From() {
    return (EReference) getManagesUIEClass().getEAllStructuralFeatures().get(MANAGESUI_FROM_FEATURE_ID);
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
    case ABSTRACTUIELEMENT_CLASSIFIER_ID:
      return AbstractUIElement.class;
    case ABSTRACTUIRELATIONSHIP_CLASSIFIER_ID:
      return AbstractUIRelationship.class;
    case UIRESOURCE_CLASSIFIER_ID:
      return UIResource.class;
    case UIDISPLAY_CLASSIFIER_ID:
      return UIDisplay.class;
    case SCREEN_CLASSIFIER_ID:
      return Screen.class;
    case REPORT_CLASSIFIER_ID:
      return Report.class;
    case UIMODEL_CLASSIFIER_ID:
      return UIModel.class;
    case UILAYOUT_CLASSIFIER_ID:
      return UILayout.class;
    case UIFIELD_CLASSIFIER_ID:
      return UIField.class;
    case DISPLAYSIMAGE_CLASSIFIER_ID:
      return DisplaysImage.class;
    case DISPLAYS_CLASSIFIER_ID:
      return Displays.class;
    case UIFLOW_CLASSIFIER_ID:
      return UIFlow.class;
    case UIELEMENT_CLASSIFIER_ID:
      return UIElement.class;
    case UIRELATIONSHIP_CLASSIFIER_ID:
      return UIRelationship.class;
    case UIACTION_CLASSIFIER_ID:
      return UIAction.class;
    case UIEVENT_CLASSIFIER_ID:
      return UIEvent.class;
    case READSUI_CLASSIFIER_ID:
      return ReadsUI.class;
    case WRITESUI_CLASSIFIER_ID:
      return WritesUI.class;
    case MANAGESUI_CLASSIFIER_ID:
      return ManagesUI.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
