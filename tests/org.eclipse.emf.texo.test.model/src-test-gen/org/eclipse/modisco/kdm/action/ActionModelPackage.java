package org.eclipse.modisco.kdm.action;

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
import org.eclipse.modisco.kdm.action.dao.AbstractActionRelationshipDao;
import org.eclipse.modisco.kdm.action.dao.ActionElementDao;
import org.eclipse.modisco.kdm.action.dao.ActionRelationshipDao;
import org.eclipse.modisco.kdm.action.dao.AddressesDao;
import org.eclipse.modisco.kdm.action.dao.BlockUnitDao;
import org.eclipse.modisco.kdm.action.dao.CallsDao;
import org.eclipse.modisco.kdm.action.dao.CatchUnitDao;
import org.eclipse.modisco.kdm.action.dao.CompliesToDao;
import org.eclipse.modisco.kdm.action.dao.ControlFlowDao;
import org.eclipse.modisco.kdm.action.dao.CreatesDao;
import org.eclipse.modisco.kdm.action.dao.DispatchesDao;
import org.eclipse.modisco.kdm.action.dao.EntryFlowDao;
import org.eclipse.modisco.kdm.action.dao.ExceptionFlowDao;
import org.eclipse.modisco.kdm.action.dao.ExceptionUnitDao;
import org.eclipse.modisco.kdm.action.dao.ExitFlowDao;
import org.eclipse.modisco.kdm.action.dao.FalseFlowDao;
import org.eclipse.modisco.kdm.action.dao.FinallyUnitDao;
import org.eclipse.modisco.kdm.action.dao.FlowDao;
import org.eclipse.modisco.kdm.action.dao.GuardedFlowDao;
import org.eclipse.modisco.kdm.action.dao.ReadsDao;
import org.eclipse.modisco.kdm.action.dao.ThrowsDao;
import org.eclipse.modisco.kdm.action.dao.TrueFlowDao;
import org.eclipse.modisco.kdm.action.dao.TryUnitDao;
import org.eclipse.modisco.kdm.action.dao.UsesTypeDao;
import org.eclipse.modisco.kdm.action.dao.WritesDao;
import org.eclipse.modisco.kdm.code.CodeModelPackage;
import org.eclipse.modisco.kdm.core.CoreModelPackage;

/**
 * The <b>Package</b> for the model '<em><b>action</b></em>'. It contains initialization code and access to the Factory
 * to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ActionModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/MoDisco/kdm/action";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final ActionModelFactory MODELFACTORY = new ActionModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ENTRYFLOW_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ENTRYFLOW_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ENTRYFLOW_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ENTRYFLOW_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ENTRYFLOW_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ENTRYFLOW_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ENTRYFLOW_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ENTRYFLOW_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ENTRYFLOW_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTACTIONRELATIONSHIP_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTACTIONRELATIONSHIP_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTACTIONRELATIONSHIP_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTACTIONRELATIONSHIP_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTACTIONRELATIONSHIP_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTACTIONRELATIONSHIP_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTACTIONRELATIONSHIP_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_COMMENT_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_CODERELATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_ENTRYFLOW_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_KIND_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_CODEELEMENT_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONELEMENT_ACTIONRELATION_FEATURE_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_COMMENT_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_CODERELATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_ENTRYFLOW_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_KIND_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_CODEELEMENT_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BLOCKUNIT_ACTIONRELATION_FEATURE_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTROLFLOW_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTROLFLOW_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTROLFLOW_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTROLFLOW_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTROLFLOW_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTROLFLOW_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTROLFLOW_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTROLFLOW_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTROLFLOW_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FLOW_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FLOW_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FLOW_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FLOW_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FLOW_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FLOW_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FLOW_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FLOW_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FLOW_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRUEFLOW_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRUEFLOW_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRUEFLOW_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRUEFLOW_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRUEFLOW_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRUEFLOW_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRUEFLOW_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRUEFLOW_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRUEFLOW_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FALSEFLOW_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FALSEFLOW_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FALSEFLOW_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FALSEFLOW_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FALSEFLOW_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FALSEFLOW_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FALSEFLOW_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FALSEFLOW_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FALSEFLOW_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GUARDEDFLOW_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GUARDEDFLOW_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GUARDEDFLOW_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GUARDEDFLOW_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GUARDEDFLOW_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GUARDEDFLOW_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GUARDEDFLOW_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GUARDEDFLOW_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GUARDEDFLOW_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CALLS_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CALLS_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CALLS_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CALLS_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CALLS_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CALLS_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CALLS_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CALLS_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CALLS_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPATCHES_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPATCHES_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPATCHES_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPATCHES_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPATCHES_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPATCHES_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPATCHES_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPATCHES_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DISPATCHES_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READS_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READS_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READS_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READS_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READS_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READS_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READS_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READS_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int READS_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITES_CLASSIFIER_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITES_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITES_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITES_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITES_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITES_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITES_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITES_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WRITES_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSES_CLASSIFIER_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSES_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSES_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSES_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSES_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSES_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSES_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSES_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADDRESSES_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CREATES_CLASSIFIER_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CREATES_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CREATES_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CREATES_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CREATES_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CREATES_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CREATES_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CREATES_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CREATES_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_CLASSIFIER_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_COMMENT_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_CODERELATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_ENTRYFLOW_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_KIND_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_CODEELEMENT_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONUNIT_ACTIONRELATION_FEATURE_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_CLASSIFIER_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_COMMENT_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_CODERELATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_ENTRYFLOW_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_KIND_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_CODEELEMENT_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRYUNIT_ACTIONRELATION_FEATURE_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_CLASSIFIER_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_COMMENT_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_CODERELATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_ENTRYFLOW_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_KIND_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_CODEELEMENT_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CATCHUNIT_ACTIONRELATION_FEATURE_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_CLASSIFIER_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_NAME_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_MODEL_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_OWNER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_OWNEDELEMENT_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_OUTBOUND_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_INBOUND_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_OWNEDRELATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_GROUP_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_GROUPEDELEMENT_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_INAGGREGATED_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_OUTAGGREGATED_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_SOURCE_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_COMMENT_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_CODERELATION_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_ENTRYFLOW_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_KIND_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_CODEELEMENT_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FINALLYUNIT_ACTIONRELATION_FEATURE_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXITFLOW_CLASSIFIER_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXITFLOW_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXITFLOW_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXITFLOW_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXITFLOW_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXITFLOW_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXITFLOW_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXITFLOW_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXITFLOW_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONFLOW_CLASSIFIER_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONFLOW_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONFLOW_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONFLOW_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONFLOW_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONFLOW_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONFLOW_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONFLOW_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EXCEPTIONFLOW_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int THROWS_CLASSIFIER_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int THROWS_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int THROWS_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int THROWS_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int THROWS_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int THROWS_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int THROWS_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int THROWS_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int THROWS_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLIESTO_CLASSIFIER_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLIESTO_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLIESTO_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLIESTO_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLIESTO_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLIESTO_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLIESTO_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLIESTO_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPLIESTO_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USESTYPE_CLASSIFIER_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USESTYPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USESTYPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USESTYPE_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USESTYPE_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USESTYPE_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USESTYPE_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USESTYPE_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int USESTYPE_FROM_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONRELATIONSHIP_CLASSIFIER_ID = 24;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONRELATIONSHIP_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONRELATIONSHIP_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONRELATIONSHIP_ATTRIBUTE_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONRELATIONSHIP_ANNOTATION_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONRELATIONSHIP_STEREOTYPE_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONRELATIONSHIP_TAGGEDVALUE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONRELATIONSHIP_TO_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ACTIONRELATIONSHIP_FROM_FEATURE_ID = 7;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final ActionModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static ActionModelPackage initialize() {

    if (isInitialized) {
      return (ActionModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final ActionModelPackage modelPackage = new ActionModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    isInitialized = true;

    KdmModelPackage.initialize();
    CodeModelPackage.initialize();
    CoreModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(EntryFlow.class, modelPackage.getEntryFlowEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractActionRelationship.class,
        modelPackage.getAbstractActionRelationshipEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ActionElement.class, modelPackage.getActionElementEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BlockUnit.class, modelPackage.getBlockUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ControlFlow.class, modelPackage.getControlFlowEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Flow.class, modelPackage.getFlowEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TrueFlow.class, modelPackage.getTrueFlowEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(FalseFlow.class, modelPackage.getFalseFlowEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(GuardedFlow.class, modelPackage.getGuardedFlowEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Calls.class, modelPackage.getCallsEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Dispatches.class, modelPackage.getDispatchesEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Reads.class, modelPackage.getReadsEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Writes.class, modelPackage.getWritesEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Addresses.class, modelPackage.getAddressesEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Creates.class, modelPackage.getCreatesEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ExceptionUnit.class, modelPackage.getExceptionUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TryUnit.class, modelPackage.getTryUnitEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CatchUnit.class, modelPackage.getCatchUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(FinallyUnit.class, modelPackage.getFinallyUnitEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ExitFlow.class, modelPackage.getExitFlowEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ExceptionFlow.class, modelPackage.getExceptionFlowEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Throws.class, modelPackage.getThrowsEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CompliesTo.class, modelPackage.getCompliesToEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(UsesType.class, modelPackage.getUsesTypeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ActionRelationship.class,
        modelPackage.getActionRelationshipEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(EntryFlow.class, EntryFlowDao.class);
    DaoRegistry.getInstance().registerDao(AbstractActionRelationship.class, AbstractActionRelationshipDao.class);
    DaoRegistry.getInstance().registerDao(ActionElement.class, ActionElementDao.class);
    DaoRegistry.getInstance().registerDao(BlockUnit.class, BlockUnitDao.class);
    DaoRegistry.getInstance().registerDao(ControlFlow.class, ControlFlowDao.class);
    DaoRegistry.getInstance().registerDao(Flow.class, FlowDao.class);
    DaoRegistry.getInstance().registerDao(TrueFlow.class, TrueFlowDao.class);
    DaoRegistry.getInstance().registerDao(FalseFlow.class, FalseFlowDao.class);
    DaoRegistry.getInstance().registerDao(GuardedFlow.class, GuardedFlowDao.class);
    DaoRegistry.getInstance().registerDao(Calls.class, CallsDao.class);
    DaoRegistry.getInstance().registerDao(Dispatches.class, DispatchesDao.class);
    DaoRegistry.getInstance().registerDao(Reads.class, ReadsDao.class);
    DaoRegistry.getInstance().registerDao(Writes.class, WritesDao.class);
    DaoRegistry.getInstance().registerDao(Addresses.class, AddressesDao.class);
    DaoRegistry.getInstance().registerDao(Creates.class, CreatesDao.class);
    DaoRegistry.getInstance().registerDao(ExceptionUnit.class, ExceptionUnitDao.class);
    DaoRegistry.getInstance().registerDao(TryUnit.class, TryUnitDao.class);
    DaoRegistry.getInstance().registerDao(CatchUnit.class, CatchUnitDao.class);
    DaoRegistry.getInstance().registerDao(FinallyUnit.class, FinallyUnitDao.class);
    DaoRegistry.getInstance().registerDao(ExitFlow.class, ExitFlowDao.class);
    DaoRegistry.getInstance().registerDao(ExceptionFlow.class, ExceptionFlowDao.class);
    DaoRegistry.getInstance().registerDao(Throws.class, ThrowsDao.class);
    DaoRegistry.getInstance().registerDao(CompliesTo.class, CompliesToDao.class);
    DaoRegistry.getInstance().registerDao(UsesType.class, UsesTypeDao.class);
    DaoRegistry.getInstance().registerDao(ActionRelationship.class, ActionRelationshipDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link ActionModelFactory} instance.
   * @generated
   */
  @Override
  public ActionModelFactory getModelFactory() {
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
    return "action.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>EntryFlow</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>EntryFlow</b></em>'
   * @generated
   */
  public EClass getEntryFlowEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ENTRYFLOW_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>EntryFlow.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>EntryFlow.to</b></em>'.
   * @generated
   */
  public EReference getEntryFlow_To() {
    return (EReference) getEntryFlowEClass().getEAllStructuralFeatures().get(ENTRYFLOW_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>EntryFlow.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>EntryFlow.from</b></em>'.
   * @generated
   */
  public EReference getEntryFlow_From() {
    return (EReference) getEntryFlowEClass().getEAllStructuralFeatures().get(ENTRYFLOW_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractActionRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractActionRelationship</b></em>'
   * @generated
   */
  public EClass getAbstractActionRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTACTIONRELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ActionElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ActionElement</b></em>'
   * @generated
   */
  public EClass getActionElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ACTIONELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ActionElement.kind</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ActionElement.kind</b></em>'.
   * @generated
   */
  public EAttribute getActionElement_Kind() {
    return (EAttribute) getActionElementEClass().getEAllStructuralFeatures().get(ACTIONELEMENT_KIND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ActionElement.codeElement</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ActionElement.codeElement</b></em>'.
   * @generated
   */
  public EReference getActionElement_CodeElement() {
    return (EReference) getActionElementEClass().getEAllStructuralFeatures().get(ACTIONELEMENT_CODEELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ActionElement.actionRelation</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ActionElement.actionRelation</b></em>'.
   * @generated
   */
  public EReference getActionElement_ActionRelation() {
    return (EReference) getActionElementEClass().getEAllStructuralFeatures().get(
        ACTIONELEMENT_ACTIONRELATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BlockUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BlockUnit</b></em>'
   * @generated
   */
  public EClass getBlockUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BLOCKUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ControlFlow</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ControlFlow</b></em>'
   * @generated
   */
  public EClass getControlFlowEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONTROLFLOW_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ControlFlow.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ControlFlow.to</b></em>'.
   * @generated
   */
  public EReference getControlFlow_To() {
    return (EReference) getControlFlowEClass().getEAllStructuralFeatures().get(CONTROLFLOW_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ControlFlow.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ControlFlow.from</b></em>'.
   * @generated
   */
  public EReference getControlFlow_From() {
    return (EReference) getControlFlowEClass().getEAllStructuralFeatures().get(CONTROLFLOW_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Flow</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Flow</b></em>'
   * @generated
   */
  public EClass getFlowEClass() {
    return (EClass) getEPackage().getEClassifiers().get(FLOW_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TrueFlow</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TrueFlow</b></em>'
   * @generated
   */
  public EClass getTrueFlowEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TRUEFLOW_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>FalseFlow</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>FalseFlow</b></em>'
   * @generated
   */
  public EClass getFalseFlowEClass() {
    return (EClass) getEPackage().getEClassifiers().get(FALSEFLOW_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>GuardedFlow</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>GuardedFlow</b></em>'
   * @generated
   */
  public EClass getGuardedFlowEClass() {
    return (EClass) getEPackage().getEClassifiers().get(GUARDEDFLOW_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Calls</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Calls</b></em>'
   * @generated
   */
  public EClass getCallsEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CALLS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Calls.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Calls.to</b></em>'.
   * @generated
   */
  public EReference getCalls_To() {
    return (EReference) getCallsEClass().getEAllStructuralFeatures().get(CALLS_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Calls.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Calls.from</b></em>'.
   * @generated
   */
  public EReference getCalls_From() {
    return (EReference) getCallsEClass().getEAllStructuralFeatures().get(CALLS_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Dispatches</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Dispatches</b></em>'
   * @generated
   */
  public EClass getDispatchesEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DISPATCHES_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Dispatches.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Dispatches.to</b></em>'.
   * @generated
   */
  public EReference getDispatches_To() {
    return (EReference) getDispatchesEClass().getEAllStructuralFeatures().get(DISPATCHES_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Dispatches.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Dispatches.from</b></em>'.
   * @generated
   */
  public EReference getDispatches_From() {
    return (EReference) getDispatchesEClass().getEAllStructuralFeatures().get(DISPATCHES_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Reads</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Reads</b></em>'
   * @generated
   */
  public EClass getReadsEClass() {
    return (EClass) getEPackage().getEClassifiers().get(READS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Reads.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Reads.to</b></em>'.
   * @generated
   */
  public EReference getReads_To() {
    return (EReference) getReadsEClass().getEAllStructuralFeatures().get(READS_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Reads.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Reads.from</b></em>'.
   * @generated
   */
  public EReference getReads_From() {
    return (EReference) getReadsEClass().getEAllStructuralFeatures().get(READS_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Writes</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Writes</b></em>'
   * @generated
   */
  public EClass getWritesEClass() {
    return (EClass) getEPackage().getEClassifiers().get(WRITES_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Writes.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Writes.to</b></em>'.
   * @generated
   */
  public EReference getWrites_To() {
    return (EReference) getWritesEClass().getEAllStructuralFeatures().get(WRITES_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Writes.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Writes.from</b></em>'.
   * @generated
   */
  public EReference getWrites_From() {
    return (EReference) getWritesEClass().getEAllStructuralFeatures().get(WRITES_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Addresses</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Addresses</b></em>'
   * @generated
   */
  public EClass getAddressesEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ADDRESSES_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Addresses.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Addresses.to</b></em>'.
   * @generated
   */
  public EReference getAddresses_To() {
    return (EReference) getAddressesEClass().getEAllStructuralFeatures().get(ADDRESSES_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Addresses.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Addresses.from</b></em>'.
   * @generated
   */
  public EReference getAddresses_From() {
    return (EReference) getAddressesEClass().getEAllStructuralFeatures().get(ADDRESSES_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Creates</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Creates</b></em>'
   * @generated
   */
  public EClass getCreatesEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CREATES_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Creates.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Creates.to</b></em>'.
   * @generated
   */
  public EReference getCreates_To() {
    return (EReference) getCreatesEClass().getEAllStructuralFeatures().get(CREATES_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Creates.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Creates.from</b></em>'.
   * @generated
   */
  public EReference getCreates_From() {
    return (EReference) getCreatesEClass().getEAllStructuralFeatures().get(CREATES_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ExceptionUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ExceptionUnit</b></em>'
   * @generated
   */
  public EClass getExceptionUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EXCEPTIONUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TryUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TryUnit</b></em>'
   * @generated
   */
  public EClass getTryUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TRYUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CatchUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CatchUnit</b></em>'
   * @generated
   */
  public EClass getCatchUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CATCHUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>FinallyUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>FinallyUnit</b></em>'
   * @generated
   */
  public EClass getFinallyUnitEClass() {
    return (EClass) getEPackage().getEClassifiers().get(FINALLYUNIT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ExitFlow</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ExitFlow</b></em>'
   * @generated
   */
  public EClass getExitFlowEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EXITFLOW_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ExitFlow.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ExitFlow.to</b></em>'.
   * @generated
   */
  public EReference getExitFlow_To() {
    return (EReference) getExitFlowEClass().getEAllStructuralFeatures().get(EXITFLOW_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ExitFlow.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ExitFlow.from</b></em>'.
   * @generated
   */
  public EReference getExitFlow_From() {
    return (EReference) getExitFlowEClass().getEAllStructuralFeatures().get(EXITFLOW_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ExceptionFlow</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ExceptionFlow</b></em>'
   * @generated
   */
  public EClass getExceptionFlowEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EXCEPTIONFLOW_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ExceptionFlow.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ExceptionFlow.to</b></em>'.
   * @generated
   */
  public EReference getExceptionFlow_To() {
    return (EReference) getExceptionFlowEClass().getEAllStructuralFeatures().get(EXCEPTIONFLOW_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ExceptionFlow.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ExceptionFlow.from</b></em>'.
   * @generated
   */
  public EReference getExceptionFlow_From() {
    return (EReference) getExceptionFlowEClass().getEAllStructuralFeatures().get(EXCEPTIONFLOW_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Throws</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Throws</b></em>'
   * @generated
   */
  public EClass getThrowsEClass() {
    return (EClass) getEPackage().getEClassifiers().get(THROWS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Throws.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Throws.to</b></em>'.
   * @generated
   */
  public EReference getThrows_To() {
    return (EReference) getThrowsEClass().getEAllStructuralFeatures().get(THROWS_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Throws.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Throws.from</b></em>'.
   * @generated
   */
  public EReference getThrows_From() {
    return (EReference) getThrowsEClass().getEAllStructuralFeatures().get(THROWS_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CompliesTo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CompliesTo</b></em>'
   * @generated
   */
  public EClass getCompliesToEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMPLIESTO_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CompliesTo.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CompliesTo.to</b></em>'.
   * @generated
   */
  public EReference getCompliesTo_To() {
    return (EReference) getCompliesToEClass().getEAllStructuralFeatures().get(COMPLIESTO_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CompliesTo.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CompliesTo.from</b></em>'.
   * @generated
   */
  public EReference getCompliesTo_From() {
    return (EReference) getCompliesToEClass().getEAllStructuralFeatures().get(COMPLIESTO_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>UsesType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>UsesType</b></em>'
   * @generated
   */
  public EClass getUsesTypeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(USESTYPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UsesType.to</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UsesType.to</b></em>'.
   * @generated
   */
  public EReference getUsesType_To() {
    return (EReference) getUsesTypeEClass().getEAllStructuralFeatures().get(USESTYPE_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>UsesType.from</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>UsesType.from</b></em>'.
   * @generated
   */
  public EReference getUsesType_From() {
    return (EReference) getUsesTypeEClass().getEAllStructuralFeatures().get(USESTYPE_FROM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ActionRelationship</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ActionRelationship</b></em>'
   * @generated
   */
  public EClass getActionRelationshipEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ACTIONRELATIONSHIP_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ActionRelationship.to</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ActionRelationship.to</b></em>'.
   * @generated
   */
  public EReference getActionRelationship_To() {
    return (EReference) getActionRelationshipEClass().getEAllStructuralFeatures().get(ACTIONRELATIONSHIP_TO_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ActionRelationship.from</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ActionRelationship.from</b></em>'.
   * @generated
   */
  public EReference getActionRelationship_From() {
    return (EReference) getActionRelationshipEClass().getEAllStructuralFeatures().get(
        ACTIONRELATIONSHIP_FROM_FEATURE_ID);
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
    case ENTRYFLOW_CLASSIFIER_ID:
      return EntryFlow.class;
    case ABSTRACTACTIONRELATIONSHIP_CLASSIFIER_ID:
      return AbstractActionRelationship.class;
    case ACTIONELEMENT_CLASSIFIER_ID:
      return ActionElement.class;
    case BLOCKUNIT_CLASSIFIER_ID:
      return BlockUnit.class;
    case CONTROLFLOW_CLASSIFIER_ID:
      return ControlFlow.class;
    case FLOW_CLASSIFIER_ID:
      return Flow.class;
    case TRUEFLOW_CLASSIFIER_ID:
      return TrueFlow.class;
    case FALSEFLOW_CLASSIFIER_ID:
      return FalseFlow.class;
    case GUARDEDFLOW_CLASSIFIER_ID:
      return GuardedFlow.class;
    case CALLS_CLASSIFIER_ID:
      return Calls.class;
    case DISPATCHES_CLASSIFIER_ID:
      return Dispatches.class;
    case READS_CLASSIFIER_ID:
      return Reads.class;
    case WRITES_CLASSIFIER_ID:
      return Writes.class;
    case ADDRESSES_CLASSIFIER_ID:
      return Addresses.class;
    case CREATES_CLASSIFIER_ID:
      return Creates.class;
    case EXCEPTIONUNIT_CLASSIFIER_ID:
      return ExceptionUnit.class;
    case TRYUNIT_CLASSIFIER_ID:
      return TryUnit.class;
    case CATCHUNIT_CLASSIFIER_ID:
      return CatchUnit.class;
    case FINALLYUNIT_CLASSIFIER_ID:
      return FinallyUnit.class;
    case EXITFLOW_CLASSIFIER_ID:
      return ExitFlow.class;
    case EXCEPTIONFLOW_CLASSIFIER_ID:
      return ExceptionFlow.class;
    case THROWS_CLASSIFIER_ID:
      return Throws.class;
    case COMPLIESTO_CLASSIFIER_ID:
      return CompliesTo.class;
    case USESTYPE_CLASSIFIER_ID:
      return UsesType.class;
    case ACTIONRELATIONSHIP_CLASSIFIER_ID:
      return ActionRelationship.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
