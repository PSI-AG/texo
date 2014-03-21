package org.eclipse.emf.texo.test.model.samples.workflow;

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
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.samples.workflow.dao.CommentDao;
import org.eclipse.emf.texo.test.model.samples.workflow.dao.CompoundTaskDao;
import org.eclipse.emf.texo.test.model.samples.workflow.dao.ConditionalOutputPortDao;
import org.eclipse.emf.texo.test.model.samples.workflow.dao.ConditionalTaskDao;
import org.eclipse.emf.texo.test.model.samples.workflow.dao.EdgeDao;
import org.eclipse.emf.texo.test.model.samples.workflow.dao.FaultDao;
import org.eclipse.emf.texo.test.model.samples.workflow.dao.InputPortDao;
import org.eclipse.emf.texo.test.model.samples.workflow.dao.LoopTaskDao;
import org.eclipse.emf.texo.test.model.samples.workflow.dao.OutputPortDao;
import org.eclipse.emf.texo.test.model.samples.workflow.dao.PortDao;
import org.eclipse.emf.texo.test.model.samples.workflow.dao.TaskDao;
import org.eclipse.emf.texo.test.model.samples.workflow.dao.TransformationTaskDao;
import org.eclipse.emf.texo.test.model.samples.workflow.dao.WorkflowDao;
import org.eclipse.emf.texo.test.model.samples.workflow.dao.WorkflowElementDao;
import org.eclipse.emf.texo.test.model.samples.workflow.dao.WorkflowNodeDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>workflow</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class WorkflowModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/workflow";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final WorkflowModelFactory MODELFACTORY = new WorkflowModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALOUTPUTPORT_CLASSIFIER_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALOUTPUTPORT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALOUTPUTPORT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALOUTPUTPORT_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALOUTPUTPORT_COMMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALOUTPUTPORT_X_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALOUTPUTPORT_Y_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALOUTPUTPORT_WIDTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALOUTPUTPORT_HEIGHT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALOUTPUTPORT_WORKFLOWELEMENTID_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALOUTPUTPORT_NODE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALOUTPUTPORT_EDGES_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALOUTPUTPORT_CONDITION_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOW_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOW_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOW_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOW_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOW_COMMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOW_X_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOW_Y_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOW_WIDTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOW_HEIGHT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOW_WORKFLOWELEMENTID_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOW_NODES_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOW_EDGES_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOW_COMMENTS_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWELEMENT_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWELEMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWELEMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWELEMENT_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWELEMENT_COMMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWELEMENT_X_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWELEMENT_Y_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWELEMENT_WIDTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWELEMENT_HEIGHT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWELEMENT_WORKFLOWELEMENTID_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWNODE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWNODE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWNODE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWNODE_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWNODE_COMMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWNODE_X_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWNODE_Y_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWNODE_WIDTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWNODE_HEIGHT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWNODE_WORKFLOWELEMENTID_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWNODE_WORKFLOW_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWNODE_OUTPUTS_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWNODE_INPUTS_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWNODE_ISSTART_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int WORKFLOWNODE_ISFINISH_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EDGE_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EDGE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EDGE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EDGE_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EDGE_COMMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EDGE_X_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EDGE_Y_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EDGE_WIDTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EDGE_HEIGHT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EDGE_WORKFLOWELEMENTID_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EDGE_WORKFLOW_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EDGE_TARGET_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int EDGE_SOURCE_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_CLASSIFIER_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_COMMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_X_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_Y_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_WIDTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_HEIGHT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_WORKFLOWELEMENTID_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMMENT_WORKFLOW_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OUTPUTPORT_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OUTPUTPORT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OUTPUTPORT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OUTPUTPORT_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OUTPUTPORT_COMMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OUTPUTPORT_X_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OUTPUTPORT_Y_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OUTPUTPORT_WIDTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OUTPUTPORT_HEIGHT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OUTPUTPORT_WORKFLOWELEMENTID_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OUTPUTPORT_NODE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int OUTPUTPORT_EDGES_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PORT_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PORT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PORT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PORT_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PORT_COMMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PORT_X_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PORT_Y_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PORT_WIDTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PORT_HEIGHT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PORT_WORKFLOWELEMENTID_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INPUTPORT_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INPUTPORT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INPUTPORT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INPUTPORT_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INPUTPORT_COMMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INPUTPORT_X_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INPUTPORT_Y_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INPUTPORT_WIDTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INPUTPORT_HEIGHT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INPUTPORT_WORKFLOWELEMENTID_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INPUTPORT_NODE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int INPUTPORT_EDGES_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FAULT_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FAULT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FAULT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FAULT_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FAULT_COMMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FAULT_X_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FAULT_Y_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FAULT_WIDTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FAULT_HEIGHT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FAULT_WORKFLOWELEMENTID_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FAULT_NODE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FAULT_EDGES_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOUNDTASK_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOUNDTASK_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOUNDTASK_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOUNDTASK_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOUNDTASK_COMMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOUNDTASK_X_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOUNDTASK_Y_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOUNDTASK_WIDTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOUNDTASK_HEIGHT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOUNDTASK_WORKFLOWELEMENTID_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOUNDTASK_WORKFLOW_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOUNDTASK_OUTPUTS_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOUNDTASK_INPUTS_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOUNDTASK_ISSTART_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOUNDTASK_ISFINISH_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOUNDTASK_SUBWORKFLOW_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRANSFORMATIONTASK_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRANSFORMATIONTASK_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRANSFORMATIONTASK_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRANSFORMATIONTASK_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRANSFORMATIONTASK_COMMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRANSFORMATIONTASK_X_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRANSFORMATIONTASK_Y_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRANSFORMATIONTASK_WIDTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRANSFORMATIONTASK_HEIGHT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRANSFORMATIONTASK_WORKFLOWELEMENTID_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRANSFORMATIONTASK_WORKFLOW_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRANSFORMATIONTASK_OUTPUTS_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRANSFORMATIONTASK_INPUTS_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRANSFORMATIONTASK_ISSTART_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRANSFORMATIONTASK_ISFINISH_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TRANSFORMATIONTASK_TRANSFORMEXPRESSION_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALTASK_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALTASK_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALTASK_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALTASK_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALTASK_COMMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALTASK_X_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALTASK_Y_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALTASK_WIDTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALTASK_HEIGHT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALTASK_WORKFLOWELEMENTID_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALTASK_WORKFLOW_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALTASK_OUTPUTS_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALTASK_INPUTS_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALTASK_ISSTART_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONDITIONALTASK_ISFINISH_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_COMMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_X_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_Y_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_WIDTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_HEIGHT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_WORKFLOWELEMENTID_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_WORKFLOW_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_OUTPUTS_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_INPUTS_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_ISSTART_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_ISFINISH_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_SUBWORKFLOW_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int LOOPTASK_WHILECONDITION_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_CLASSIFIER_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_NAME_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_COMMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_X_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_Y_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_WIDTH_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_HEIGHT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_WORKFLOWELEMENTID_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_WORKFLOW_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_OUTPUTS_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_INPUTS_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_ISSTART_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TASK_ISFINISH_FEATURE_ID = 13;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final WorkflowModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static WorkflowModelPackage initialize() {

    if (isInitialized) {
      return (WorkflowModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final WorkflowModelPackage modelPackage = new WorkflowModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    IdentifiableModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(ConditionalOutputPort.class,
        modelPackage.getConditionalOutputPortEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Workflow.class, modelPackage.getWorkflowEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(WorkflowElement.class,
        modelPackage.getWorkflowElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(WorkflowNode.class, modelPackage.getWorkflowNodeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Edge.class, modelPackage.getEdgeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Comment.class, modelPackage.getCommentEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(OutputPort.class, modelPackage.getOutputPortEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Port.class, modelPackage.getPortEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(InputPort.class, modelPackage.getInputPortEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Fault.class, modelPackage.getFaultEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CompoundTask.class, modelPackage.getCompoundTaskEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(TransformationTask.class,
        modelPackage.getTransformationTaskEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ConditionalTask.class,
        modelPackage.getConditionalTaskEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(LoopTask.class, modelPackage.getLoopTaskEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Task.class, modelPackage.getTaskEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(ConditionalOutputPort.class, ConditionalOutputPortDao.class);
    DaoRegistry.getInstance().registerDao(Workflow.class, WorkflowDao.class);
    DaoRegistry.getInstance().registerDao(WorkflowElement.class, WorkflowElementDao.class);
    DaoRegistry.getInstance().registerDao(WorkflowNode.class, WorkflowNodeDao.class);
    DaoRegistry.getInstance().registerDao(Edge.class, EdgeDao.class);
    DaoRegistry.getInstance().registerDao(Comment.class, CommentDao.class);
    DaoRegistry.getInstance().registerDao(OutputPort.class, OutputPortDao.class);
    DaoRegistry.getInstance().registerDao(Port.class, PortDao.class);
    DaoRegistry.getInstance().registerDao(InputPort.class, InputPortDao.class);
    DaoRegistry.getInstance().registerDao(Fault.class, FaultDao.class);
    DaoRegistry.getInstance().registerDao(CompoundTask.class, CompoundTaskDao.class);
    DaoRegistry.getInstance().registerDao(TransformationTask.class, TransformationTaskDao.class);
    DaoRegistry.getInstance().registerDao(ConditionalTask.class, ConditionalTaskDao.class);
    DaoRegistry.getInstance().registerDao(LoopTask.class, LoopTaskDao.class);
    DaoRegistry.getInstance().registerDao(Task.class, TaskDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link WorkflowModelFactory} instance.
   * @generated
   */
  @Override
  public WorkflowModelFactory getModelFactory() {
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
    return "workflow.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>ConditionalOutputPort</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ConditionalOutputPort</b></em>'
   * @generated
   */
  public EClass getConditionalOutputPortEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONDITIONALOUTPUTPORT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ConditionalOutputPort.condition</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ConditionalOutputPort.condition</b></em>'.
   * @generated
   */
  public EAttribute getConditionalOutputPort_Condition() {
    return (EAttribute) getConditionalOutputPortEClass().getEAllStructuralFeatures().get(
        CONDITIONALOUTPUTPORT_CONDITION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Workflow</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Workflow</b></em>'
   * @generated
   */
  public EClass getWorkflowEClass() {
    return (EClass) getEPackage().getEClassifiers().get(WORKFLOW_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Workflow.nodes</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Workflow.nodes</b></em>'.
   * @generated
   */
  public EReference getWorkflow_Nodes() {
    return (EReference) getWorkflowEClass().getEAllStructuralFeatures().get(WORKFLOW_NODES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Workflow.edges</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Workflow.edges</b></em>'.
   * @generated
   */
  public EReference getWorkflow_Edges() {
    return (EReference) getWorkflowEClass().getEAllStructuralFeatures().get(WORKFLOW_EDGES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Workflow.comments</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Workflow.comments</b></em>'.
   * @generated
   */
  public EReference getWorkflow_Comments() {
    return (EReference) getWorkflowEClass().getEAllStructuralFeatures().get(WORKFLOW_COMMENTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>WorkflowElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>WorkflowElement</b></em>'
   * @generated
   */
  public EClass getWorkflowElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(WORKFLOWELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkflowElement.name</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkflowElement.name</b></em>'.
   * @generated
   */
  public EAttribute getWorkflowElement_Name() {
    return (EAttribute) getWorkflowElementEClass().getEAllStructuralFeatures().get(WORKFLOWELEMENT_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkflowElement.comment</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkflowElement.comment</b></em>'.
   * @generated
   */
  public EAttribute getWorkflowElement_Comment() {
    return (EAttribute) getWorkflowElementEClass().getEAllStructuralFeatures().get(WORKFLOWELEMENT_COMMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkflowElement.x</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkflowElement.x</b></em>'.
   * @generated
   */
  public EAttribute getWorkflowElement_X() {
    return (EAttribute) getWorkflowElementEClass().getEAllStructuralFeatures().get(WORKFLOWELEMENT_X_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkflowElement.y</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkflowElement.y</b></em>'.
   * @generated
   */
  public EAttribute getWorkflowElement_Y() {
    return (EAttribute) getWorkflowElementEClass().getEAllStructuralFeatures().get(WORKFLOWELEMENT_Y_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkflowElement.width</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkflowElement.width</b></em>'.
   * @generated
   */
  public EAttribute getWorkflowElement_Width() {
    return (EAttribute) getWorkflowElementEClass().getEAllStructuralFeatures().get(WORKFLOWELEMENT_WIDTH_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkflowElement.height</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkflowElement.height</b></em>'.
   * @generated
   */
  public EAttribute getWorkflowElement_Height() {
    return (EAttribute) getWorkflowElementEClass().getEAllStructuralFeatures().get(WORKFLOWELEMENT_HEIGHT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkflowElement.workFlowElementId</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkflowElement.workFlowElementId</b></em>'.
   * @generated
   */
  public EAttribute getWorkflowElement_WorkFlowElementId() {
    return (EAttribute) getWorkflowElementEClass().getEAllStructuralFeatures().get(
        WORKFLOWELEMENT_WORKFLOWELEMENTID_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>WorkflowNode</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>WorkflowNode</b></em>'
   * @generated
   */
  public EClass getWorkflowNodeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(WORKFLOWNODE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkflowNode.workflow</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkflowNode.workflow</b></em>'.
   * @generated
   */
  public EReference getWorkflowNode_Workflow() {
    return (EReference) getWorkflowNodeEClass().getEAllStructuralFeatures().get(WORKFLOWNODE_WORKFLOW_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkflowNode.outputs</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkflowNode.outputs</b></em>'.
   * @generated
   */
  public EReference getWorkflowNode_Outputs() {
    return (EReference) getWorkflowNodeEClass().getEAllStructuralFeatures().get(WORKFLOWNODE_OUTPUTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkflowNode.inputs</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkflowNode.inputs</b></em>'.
   * @generated
   */
  public EReference getWorkflowNode_Inputs() {
    return (EReference) getWorkflowNodeEClass().getEAllStructuralFeatures().get(WORKFLOWNODE_INPUTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkflowNode.isStart</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkflowNode.isStart</b></em>'.
   * @generated
   */
  public EAttribute getWorkflowNode_IsStart() {
    return (EAttribute) getWorkflowNodeEClass().getEAllStructuralFeatures().get(WORKFLOWNODE_ISSTART_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>WorkflowNode.isFinish</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>WorkflowNode.isFinish</b></em>'.
   * @generated
   */
  public EAttribute getWorkflowNode_IsFinish() {
    return (EAttribute) getWorkflowNodeEClass().getEAllStructuralFeatures().get(WORKFLOWNODE_ISFINISH_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Edge</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Edge</b></em>'
   * @generated
   */
  public EClass getEdgeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(EDGE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Edge.workflow</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Edge.workflow</b></em>'.
   * @generated
   */
  public EReference getEdge_Workflow() {
    return (EReference) getEdgeEClass().getEAllStructuralFeatures().get(EDGE_WORKFLOW_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Edge.target</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Edge.target</b></em>'.
   * @generated
   */
  public EReference getEdge_Target() {
    return (EReference) getEdgeEClass().getEAllStructuralFeatures().get(EDGE_TARGET_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Edge.source</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Edge.source</b></em>'.
   * @generated
   */
  public EReference getEdge_Source() {
    return (EReference) getEdgeEClass().getEAllStructuralFeatures().get(EDGE_SOURCE_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Comment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Comment</b></em>'
   * @generated
   */
  public EClass getCommentEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Comment.workflow</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Comment.workflow</b></em>'.
   * @generated
   */
  public EReference getComment_Workflow() {
    return (EReference) getCommentEClass().getEAllStructuralFeatures().get(COMMENT_WORKFLOW_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>OutputPort</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>OutputPort</b></em>'
   * @generated
   */
  public EClass getOutputPortEClass() {
    return (EClass) getEPackage().getEClassifiers().get(OUTPUTPORT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>OutputPort.node</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>OutputPort.node</b></em>'.
   * @generated
   */
  public EReference getOutputPort_Node() {
    return (EReference) getOutputPortEClass().getEAllStructuralFeatures().get(OUTPUTPORT_NODE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>OutputPort.edges</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>OutputPort.edges</b></em>'.
   * @generated
   */
  public EReference getOutputPort_Edges() {
    return (EReference) getOutputPortEClass().getEAllStructuralFeatures().get(OUTPUTPORT_EDGES_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Port</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Port</b></em>'
   * @generated
   */
  public EClass getPortEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PORT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>InputPort</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>InputPort</b></em>'
   * @generated
   */
  public EClass getInputPortEClass() {
    return (EClass) getEPackage().getEClassifiers().get(INPUTPORT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>InputPort.node</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>InputPort.node</b></em>'.
   * @generated
   */
  public EReference getInputPort_Node() {
    return (EReference) getInputPortEClass().getEAllStructuralFeatures().get(INPUTPORT_NODE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>InputPort.edges</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>InputPort.edges</b></em>'.
   * @generated
   */
  public EReference getInputPort_Edges() {
    return (EReference) getInputPortEClass().getEAllStructuralFeatures().get(INPUTPORT_EDGES_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Fault</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Fault</b></em>'
   * @generated
   */
  public EClass getFaultEClass() {
    return (EClass) getEPackage().getEClassifiers().get(FAULT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CompoundTask</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CompoundTask</b></em>'
   * @generated
   */
  public EClass getCompoundTaskEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMPOUNDTASK_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CompoundTask.subworkflow</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CompoundTask.subworkflow</b></em>'.
   * @generated
   */
  public EReference getCompoundTask_Subworkflow() {
    return (EReference) getCompoundTaskEClass().getEAllStructuralFeatures().get(COMPOUNDTASK_SUBWORKFLOW_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>TransformationTask</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>TransformationTask</b></em>'
   * @generated
   */
  public EClass getTransformationTaskEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TRANSFORMATIONTASK_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>TransformationTask.transformExpression</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>TransformationTask.transformExpression</b></em>'.
   * @generated
   */
  public EAttribute getTransformationTask_TransformExpression() {
    return (EAttribute) getTransformationTaskEClass().getEAllStructuralFeatures().get(
        TRANSFORMATIONTASK_TRANSFORMEXPRESSION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ConditionalTask</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ConditionalTask</b></em>'
   * @generated
   */
  public EClass getConditionalTaskEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONDITIONALTASK_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>LoopTask</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>LoopTask</b></em>'
   * @generated
   */
  public EClass getLoopTaskEClass() {
    return (EClass) getEPackage().getEClassifiers().get(LOOPTASK_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>LoopTask.whileCondition</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>LoopTask.whileCondition</b></em>'.
   * @generated
   */
  public EAttribute getLoopTask_WhileCondition() {
    return (EAttribute) getLoopTaskEClass().getEAllStructuralFeatures().get(LOOPTASK_WHILECONDITION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Task</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Task</b></em>'
   * @generated
   */
  public EClass getTaskEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TASK_CLASSIFIER_ID);
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
    case CONDITIONALOUTPUTPORT_CLASSIFIER_ID:
      return ConditionalOutputPort.class;
    case WORKFLOW_CLASSIFIER_ID:
      return Workflow.class;
    case WORKFLOWELEMENT_CLASSIFIER_ID:
      return WorkflowElement.class;
    case WORKFLOWNODE_CLASSIFIER_ID:
      return WorkflowNode.class;
    case EDGE_CLASSIFIER_ID:
      return Edge.class;
    case COMMENT_CLASSIFIER_ID:
      return Comment.class;
    case OUTPUTPORT_CLASSIFIER_ID:
      return OutputPort.class;
    case PORT_CLASSIFIER_ID:
      return Port.class;
    case INPUTPORT_CLASSIFIER_ID:
      return InputPort.class;
    case FAULT_CLASSIFIER_ID:
      return Fault.class;
    case COMPOUNDTASK_CLASSIFIER_ID:
      return CompoundTask.class;
    case TRANSFORMATIONTASK_CLASSIFIER_ID:
      return TransformationTask.class;
    case CONDITIONALTASK_CLASSIFIER_ID:
      return ConditionalTask.class;
    case LOOPTASK_CLASSIFIER_ID:
      return LoopTask.class;
    case TASK_CLASSIFIER_ID:
      return Task.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
