package org.eclipse.graphiti.mm.pictograms;

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
import org.eclipse.graphiti.mm.MmModelPackage;
import org.eclipse.graphiti.mm.algorithms.AlgorithmsModelPackage;
import org.eclipse.graphiti.mm.algorithms.styles.StylesModelPackage;
import org.eclipse.graphiti.mm.pictograms.dao.AdvancedAnchorDao;
import org.eclipse.graphiti.mm.pictograms.dao.AnchorContainerDao;
import org.eclipse.graphiti.mm.pictograms.dao.AnchorDao;
import org.eclipse.graphiti.mm.pictograms.dao.BoxRelativeAnchorDao;
import org.eclipse.graphiti.mm.pictograms.dao.ChopboxAnchorDao;
import org.eclipse.graphiti.mm.pictograms.dao.CompositeConnectionDao;
import org.eclipse.graphiti.mm.pictograms.dao.ConnectionDao;
import org.eclipse.graphiti.mm.pictograms.dao.ConnectionDecoratorDao;
import org.eclipse.graphiti.mm.pictograms.dao.ContainerShapeDao;
import org.eclipse.graphiti.mm.pictograms.dao.CurvedConnectionDao;
import org.eclipse.graphiti.mm.pictograms.dao.DiagramDao;
import org.eclipse.graphiti.mm.pictograms.dao.FixPointAnchorDao;
import org.eclipse.graphiti.mm.pictograms.dao.FreeFormConnectionDao;
import org.eclipse.graphiti.mm.pictograms.dao.ManhattanConnectionDao;
import org.eclipse.graphiti.mm.pictograms.dao.PictogramElementDao;
import org.eclipse.graphiti.mm.pictograms.dao.PictogramLinkDao;
import org.eclipse.graphiti.mm.pictograms.dao.ShapeDao;

/**
 * The <b>Package</b> for the model '<em><b>pictograms</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PictogramsModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://eclipse.org/graphiti/mm/pictograms";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final PictogramsModelFactory MODELFACTORY = new PictogramsModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SHAPE_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SHAPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SHAPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SHAPE_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SHAPE_VISIBLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SHAPE_GRAPHICSALGORITHM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SHAPE_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SHAPE_LINK_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SHAPE_ANCHORS_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int SHAPE_CONTAINER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PICTOGRAMELEMENT_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PICTOGRAMELEMENT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PICTOGRAMELEMENT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PICTOGRAMELEMENT_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PICTOGRAMELEMENT_VISIBLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PICTOGRAMELEMENT_GRAPHICSALGORITHM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PICTOGRAMELEMENT_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PICTOGRAMELEMENT_LINK_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHORCONTAINER_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHORCONTAINER_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHORCONTAINER_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHORCONTAINER_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHORCONTAINER_VISIBLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHORCONTAINER_GRAPHICSALGORITHM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHORCONTAINER_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHORCONTAINER_LINK_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHORCONTAINER_ANCHORS_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTAINERSHAPE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTAINERSHAPE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTAINERSHAPE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTAINERSHAPE_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTAINERSHAPE_VISIBLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTAINERSHAPE_GRAPHICSALGORITHM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTAINERSHAPE_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTAINERSHAPE_LINK_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTAINERSHAPE_ANCHORS_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTAINERSHAPE_CONTAINER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONTAINERSHAPE_CHILDREN_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_VISIBLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_GRAPHICSALGORITHM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_LINK_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_ANCHORS_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_CONTAINER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_CHILDREN_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_GRIDUNIT_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_DIAGRAMTYPEID_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_CONNECTIONS_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_NAME_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_SNAPTOGRID_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_SHOWGUIDES_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_COLORS_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_FONTS_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_PICTOGRAMLINKS_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_VERTICALGRIDUNIT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_VERSION_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int DIAGRAM_STYLES_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTION_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTION_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTION_VISIBLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTION_GRAPHICSALGORITHM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTION_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTION_LINK_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTION_ANCHORS_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTION_START_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTION_END_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTION_PARENT_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTION_CONNECTIONDECORATORS_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PICTOGRAMLINK_CLASSIFIER_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PICTOGRAMLINK_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PICTOGRAMLINK_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PICTOGRAMLINK_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PICTOGRAMLINK_PICTOGRAMELEMENT_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PICTOGRAMLINK_BUSINESSOBJECTS_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHOR_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHOR_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHOR_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHOR_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHOR_VISIBLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHOR_GRAPHICSALGORITHM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHOR_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHOR_LINK_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHOR_PARENT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHOR_OUTGOINGCONNECTIONS_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHOR_INCOMINGCONNECTIONS_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ANCHOR_REFERENCEDGRAPHICSALGORITHM_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTIONDECORATOR_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTIONDECORATOR_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTIONDECORATOR_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTIONDECORATOR_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTIONDECORATOR_VISIBLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTIONDECORATOR_GRAPHICSALGORITHM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTIONDECORATOR_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTIONDECORATOR_LINK_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTIONDECORATOR_ANCHORS_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTIONDECORATOR_CONTAINER_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTIONDECORATOR_LOCATIONRELATIVE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTIONDECORATOR_LOCATION_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CONNECTIONDECORATOR_CONNECTION_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FIXPOINTANCHOR_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FIXPOINTANCHOR_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FIXPOINTANCHOR_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FIXPOINTANCHOR_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FIXPOINTANCHOR_VISIBLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FIXPOINTANCHOR_GRAPHICSALGORITHM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FIXPOINTANCHOR_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FIXPOINTANCHOR_LINK_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FIXPOINTANCHOR_PARENT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FIXPOINTANCHOR_OUTGOINGCONNECTIONS_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FIXPOINTANCHOR_INCOMINGCONNECTIONS_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FIXPOINTANCHOR_REFERENCEDGRAPHICSALGORITHM_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FIXPOINTANCHOR_USEANCHORLOCATIONASCONNECTIONENDPOINT_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FIXPOINTANCHOR_LOCATION_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADVANCEDANCHOR_CLASSIFIER_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADVANCEDANCHOR_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADVANCEDANCHOR_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADVANCEDANCHOR_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADVANCEDANCHOR_VISIBLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADVANCEDANCHOR_GRAPHICSALGORITHM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADVANCEDANCHOR_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADVANCEDANCHOR_LINK_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADVANCEDANCHOR_PARENT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADVANCEDANCHOR_OUTGOINGCONNECTIONS_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADVANCEDANCHOR_INCOMINGCONNECTIONS_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADVANCEDANCHOR_REFERENCEDGRAPHICSALGORITHM_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ADVANCEDANCHOR_USEANCHORLOCATIONASCONNECTIONENDPOINT_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOXRELATIVEANCHOR_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOXRELATIVEANCHOR_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOXRELATIVEANCHOR_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOXRELATIVEANCHOR_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOXRELATIVEANCHOR_VISIBLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOXRELATIVEANCHOR_GRAPHICSALGORITHM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOXRELATIVEANCHOR_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOXRELATIVEANCHOR_LINK_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOXRELATIVEANCHOR_PARENT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOXRELATIVEANCHOR_OUTGOINGCONNECTIONS_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOXRELATIVEANCHOR_INCOMINGCONNECTIONS_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOXRELATIVEANCHOR_REFERENCEDGRAPHICSALGORITHM_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOXRELATIVEANCHOR_USEANCHORLOCATIONASCONNECTIONENDPOINT_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOXRELATIVEANCHOR_RELATIVEWIDTH_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int BOXRELATIVEANCHOR_RELATIVEHEIGHT_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOPBOXANCHOR_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOPBOXANCHOR_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOPBOXANCHOR_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOPBOXANCHOR_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOPBOXANCHOR_VISIBLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOPBOXANCHOR_GRAPHICSALGORITHM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOPBOXANCHOR_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOPBOXANCHOR_LINK_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOPBOXANCHOR_PARENT_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOPBOXANCHOR_OUTGOINGCONNECTIONS_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOPBOXANCHOR_INCOMINGCONNECTIONS_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CHOPBOXANCHOR_REFERENCEDGRAPHICSALGORITHM_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FREEFORMCONNECTION_CLASSIFIER_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FREEFORMCONNECTION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FREEFORMCONNECTION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FREEFORMCONNECTION_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FREEFORMCONNECTION_VISIBLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FREEFORMCONNECTION_GRAPHICSALGORITHM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FREEFORMCONNECTION_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FREEFORMCONNECTION_LINK_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FREEFORMCONNECTION_ANCHORS_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FREEFORMCONNECTION_START_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FREEFORMCONNECTION_END_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FREEFORMCONNECTION_PARENT_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FREEFORMCONNECTION_CONNECTIONDECORATORS_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int FREEFORMCONNECTION_BENDPOINTS_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANHATTANCONNECTION_CLASSIFIER_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANHATTANCONNECTION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANHATTANCONNECTION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANHATTANCONNECTION_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANHATTANCONNECTION_VISIBLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANHATTANCONNECTION_GRAPHICSALGORITHM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANHATTANCONNECTION_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANHATTANCONNECTION_LINK_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANHATTANCONNECTION_ANCHORS_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANHATTANCONNECTION_START_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANHATTANCONNECTION_END_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANHATTANCONNECTION_PARENT_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MANHATTANCONNECTION_CONNECTIONDECORATORS_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CURVEDCONNECTION_CLASSIFIER_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CURVEDCONNECTION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CURVEDCONNECTION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CURVEDCONNECTION_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CURVEDCONNECTION_VISIBLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CURVEDCONNECTION_GRAPHICSALGORITHM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CURVEDCONNECTION_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CURVEDCONNECTION_LINK_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CURVEDCONNECTION_ANCHORS_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CURVEDCONNECTION_START_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CURVEDCONNECTION_END_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CURVEDCONNECTION_PARENT_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CURVEDCONNECTION_CONNECTIONDECORATORS_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int CURVEDCONNECTION_CONTROLPOINTS_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOSITECONNECTION_CLASSIFIER_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOSITECONNECTION_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOSITECONNECTION_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOSITECONNECTION_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOSITECONNECTION_VISIBLE_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOSITECONNECTION_GRAPHICSALGORITHM_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOSITECONNECTION_ACTIVE_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOSITECONNECTION_LINK_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOSITECONNECTION_ANCHORS_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOSITECONNECTION_START_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOSITECONNECTION_END_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOSITECONNECTION_PARENT_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOSITECONNECTION_CONNECTIONDECORATORS_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int COMPOSITECONNECTION_CHILDREN_FEATURE_ID = 12;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final PictogramsModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static PictogramsModelPackage initialize() {

    if (isInitialized) {
      return (PictogramsModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final PictogramsModelPackage modelPackage = new PictogramsModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    isInitialized = true;

    MmModelPackage.initialize();
    StylesModelPackage.initialize();
    AlgorithmsModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(Shape.class, modelPackage.getShapeEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PictogramElement.class,
        modelPackage.getPictogramElementEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AnchorContainer.class,
        modelPackage.getAnchorContainerEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ContainerShape.class, modelPackage.getContainerShapeEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Diagram.class, modelPackage.getDiagramEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Connection.class, modelPackage.getConnectionEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PictogramLink.class, modelPackage.getPictogramLinkEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Anchor.class, modelPackage.getAnchorEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ConnectionDecorator.class,
        modelPackage.getConnectionDecoratorEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(FixPointAnchor.class, modelPackage.getFixPointAnchorEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AdvancedAnchor.class, modelPackage.getAdvancedAnchorEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(BoxRelativeAnchor.class,
        modelPackage.getBoxRelativeAnchorEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ChopboxAnchor.class, modelPackage.getChopboxAnchorEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(FreeFormConnection.class,
        modelPackage.getFreeFormConnectionEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(ManhattanConnection.class,
        modelPackage.getManhattanConnectionEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CurvedConnection.class,
        modelPackage.getCurvedConnectionEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(CompositeConnection.class,
        modelPackage.getCompositeConnectionEClass(), modelPackage);

    DaoRegistry.getInstance().registerDao(Shape.class, ShapeDao.class);
    DaoRegistry.getInstance().registerDao(PictogramElement.class, PictogramElementDao.class);
    DaoRegistry.getInstance().registerDao(AnchorContainer.class, AnchorContainerDao.class);
    DaoRegistry.getInstance().registerDao(ContainerShape.class, ContainerShapeDao.class);
    DaoRegistry.getInstance().registerDao(Diagram.class, DiagramDao.class);
    DaoRegistry.getInstance().registerDao(Connection.class, ConnectionDao.class);
    DaoRegistry.getInstance().registerDao(PictogramLink.class, PictogramLinkDao.class);
    DaoRegistry.getInstance().registerDao(Anchor.class, AnchorDao.class);
    DaoRegistry.getInstance().registerDao(ConnectionDecorator.class, ConnectionDecoratorDao.class);
    DaoRegistry.getInstance().registerDao(FixPointAnchor.class, FixPointAnchorDao.class);
    DaoRegistry.getInstance().registerDao(AdvancedAnchor.class, AdvancedAnchorDao.class);
    DaoRegistry.getInstance().registerDao(BoxRelativeAnchor.class, BoxRelativeAnchorDao.class);
    DaoRegistry.getInstance().registerDao(ChopboxAnchor.class, ChopboxAnchorDao.class);
    DaoRegistry.getInstance().registerDao(FreeFormConnection.class, FreeFormConnectionDao.class);
    DaoRegistry.getInstance().registerDao(ManhattanConnection.class, ManhattanConnectionDao.class);
    DaoRegistry.getInstance().registerDao(CurvedConnection.class, CurvedConnectionDao.class);
    DaoRegistry.getInstance().registerDao(CompositeConnection.class, CompositeConnectionDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link PictogramsModelFactory} instance.
   * @generated
   */
  @Override
  public PictogramsModelFactory getModelFactory() {
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
    return "pictograms.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>Shape</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Shape</b></em>'
   * @generated
   */
  public EClass getShapeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(SHAPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Shape.container</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Shape.container</b></em>'.
   * @generated
   */
  public EReference getShape_Container() {
    return (EReference) getShapeEClass().getEAllStructuralFeatures().get(SHAPE_CONTAINER_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PictogramElement</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PictogramElement</b></em>'
   * @generated
   */
  public EClass getPictogramElementEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PICTOGRAMELEMENT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PictogramElement.visible</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PictogramElement.visible</b></em>'.
   * @generated
   */
  public EAttribute getPictogramElement_Visible() {
    return (EAttribute) getPictogramElementEClass().getEAllStructuralFeatures()
        .get(PICTOGRAMELEMENT_VISIBLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PictogramElement.graphicsAlgorithm</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PictogramElement.graphicsAlgorithm</b></em>'.
   * @generated
   */
  public EReference getPictogramElement_GraphicsAlgorithm() {
    return (EReference) getPictogramElementEClass().getEAllStructuralFeatures().get(
        PICTOGRAMELEMENT_GRAPHICSALGORITHM_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PictogramElement.active</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PictogramElement.active</b></em>'.
   * @generated
   */
  public EAttribute getPictogramElement_Active() {
    return (EAttribute) getPictogramElementEClass().getEAllStructuralFeatures().get(PICTOGRAMELEMENT_ACTIVE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PictogramElement.link</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PictogramElement.link</b></em>'.
   * @generated
   */
  public EReference getPictogramElement_Link() {
    return (EReference) getPictogramElementEClass().getEAllStructuralFeatures().get(PICTOGRAMELEMENT_LINK_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AnchorContainer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AnchorContainer</b></em>'
   * @generated
   */
  public EClass getAnchorContainerEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ANCHORCONTAINER_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AnchorContainer.anchors</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AnchorContainer.anchors</b></em>'.
   * @generated
   */
  public EReference getAnchorContainer_Anchors() {
    return (EReference) getAnchorContainerEClass().getEAllStructuralFeatures().get(ANCHORCONTAINER_ANCHORS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ContainerShape</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ContainerShape</b></em>'
   * @generated
   */
  public EClass getContainerShapeEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONTAINERSHAPE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ContainerShape.children</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ContainerShape.children</b></em>'.
   * @generated
   */
  public EReference getContainerShape_Children() {
    return (EReference) getContainerShapeEClass().getEAllStructuralFeatures().get(CONTAINERSHAPE_CHILDREN_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Diagram</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Diagram</b></em>'
   * @generated
   */
  public EClass getDiagramEClass() {
    return (EClass) getEPackage().getEClassifiers().get(DIAGRAM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Diagram.gridUnit</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Diagram.gridUnit</b></em>'.
   * @generated
   */
  public EAttribute getDiagram_GridUnit() {
    return (EAttribute) getDiagramEClass().getEAllStructuralFeatures().get(DIAGRAM_GRIDUNIT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Diagram.diagramTypeId</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Diagram.diagramTypeId</b></em>'.
   * @generated
   */
  public EAttribute getDiagram_DiagramTypeId() {
    return (EAttribute) getDiagramEClass().getEAllStructuralFeatures().get(DIAGRAM_DIAGRAMTYPEID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Diagram.connections</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Diagram.connections</b></em>'.
   * @generated
   */
  public EReference getDiagram_Connections() {
    return (EReference) getDiagramEClass().getEAllStructuralFeatures().get(DIAGRAM_CONNECTIONS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Diagram.name</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Diagram.name</b></em>'.
   * @generated
   */
  public EAttribute getDiagram_Name() {
    return (EAttribute) getDiagramEClass().getEAllStructuralFeatures().get(DIAGRAM_NAME_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Diagram.snapToGrid</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Diagram.snapToGrid</b></em>'.
   * @generated
   */
  public EAttribute getDiagram_SnapToGrid() {
    return (EAttribute) getDiagramEClass().getEAllStructuralFeatures().get(DIAGRAM_SNAPTOGRID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Diagram.showGuides</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Diagram.showGuides</b></em>'.
   * @generated
   */
  public EAttribute getDiagram_ShowGuides() {
    return (EAttribute) getDiagramEClass().getEAllStructuralFeatures().get(DIAGRAM_SHOWGUIDES_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Diagram.colors</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Diagram.colors</b></em>'.
   * @generated
   */
  public EReference getDiagram_Colors() {
    return (EReference) getDiagramEClass().getEAllStructuralFeatures().get(DIAGRAM_COLORS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Diagram.fonts</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Diagram.fonts</b></em>'.
   * @generated
   */
  public EReference getDiagram_Fonts() {
    return (EReference) getDiagramEClass().getEAllStructuralFeatures().get(DIAGRAM_FONTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Diagram.pictogramLinks</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Diagram.pictogramLinks</b></em>'.
   * @generated
   */
  public EReference getDiagram_PictogramLinks() {
    return (EReference) getDiagramEClass().getEAllStructuralFeatures().get(DIAGRAM_PICTOGRAMLINKS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Diagram.verticalGridUnit</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Diagram.verticalGridUnit</b></em>'.
   * @generated
   */
  public EAttribute getDiagram_VerticalGridUnit() {
    return (EAttribute) getDiagramEClass().getEAllStructuralFeatures().get(DIAGRAM_VERTICALGRIDUNIT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Diagram.version</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Diagram.version</b></em>'.
   * @generated
   */
  public EAttribute getDiagram_Version() {
    return (EAttribute) getDiagramEClass().getEAllStructuralFeatures().get(DIAGRAM_VERSION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Diagram.styles</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Diagram.styles</b></em>'.
   * @generated
   */
  public EReference getDiagram_Styles() {
    return (EReference) getDiagramEClass().getEAllStructuralFeatures().get(DIAGRAM_STYLES_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Connection</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Connection</b></em>'
   * @generated
   */
  public EClass getConnectionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONNECTION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Connection.start</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Connection.start</b></em>'.
   * @generated
   */
  public EReference getConnection_Start() {
    return (EReference) getConnectionEClass().getEAllStructuralFeatures().get(CONNECTION_START_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Connection.end</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Connection.end</b></em>'.
   * @generated
   */
  public EReference getConnection_End() {
    return (EReference) getConnectionEClass().getEAllStructuralFeatures().get(CONNECTION_END_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Connection.parent</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Connection.parent</b></em>'.
   * @generated
   */
  public EReference getConnection_Parent() {
    return (EReference) getConnectionEClass().getEAllStructuralFeatures().get(CONNECTION_PARENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Connection.connectionDecorators</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Connection.connectionDecorators</b></em>'.
   * @generated
   */
  public EReference getConnection_ConnectionDecorators() {
    return (EReference) getConnectionEClass().getEAllStructuralFeatures().get(
        CONNECTION_CONNECTIONDECORATORS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PictogramLink</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PictogramLink</b></em>'
   * @generated
   */
  public EClass getPictogramLinkEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PICTOGRAMLINK_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PictogramLink.pictogramElement</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PictogramLink.pictogramElement</b></em>'.
   * @generated
   */
  public EReference getPictogramLink_PictogramElement() {
    return (EReference) getPictogramLinkEClass().getEAllStructuralFeatures().get(
        PICTOGRAMLINK_PICTOGRAMELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PictogramLink.businessObjects</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PictogramLink.businessObjects</b></em>'.
   * @generated
   */
  public EReference getPictogramLink_BusinessObjects() {
    return (EReference) getPictogramLinkEClass().getEAllStructuralFeatures().get(
        PICTOGRAMLINK_BUSINESSOBJECTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Anchor</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Anchor</b></em>'
   * @generated
   */
  public EClass getAnchorEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ANCHOR_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Anchor.parent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Anchor.parent</b></em>'.
   * @generated
   */
  public EReference getAnchor_Parent() {
    return (EReference) getAnchorEClass().getEAllStructuralFeatures().get(ANCHOR_PARENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Anchor.outgoingConnections</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Anchor.outgoingConnections</b></em>'.
   * @generated
   */
  public EReference getAnchor_OutgoingConnections() {
    return (EReference) getAnchorEClass().getEAllStructuralFeatures().get(ANCHOR_OUTGOINGCONNECTIONS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Anchor.incomingConnections</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Anchor.incomingConnections</b></em>'.
   * @generated
   */
  public EReference getAnchor_IncomingConnections() {
    return (EReference) getAnchorEClass().getEAllStructuralFeatures().get(ANCHOR_INCOMINGCONNECTIONS_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Anchor.referencedGraphicsAlgorithm</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Anchor.referencedGraphicsAlgorithm</b></em>'.
   * @generated
   */
  public EReference getAnchor_ReferencedGraphicsAlgorithm() {
    return (EReference) getAnchorEClass().getEAllStructuralFeatures()
        .get(ANCHOR_REFERENCEDGRAPHICSALGORITHM_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ConnectionDecorator</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ConnectionDecorator</b></em>'
   * @generated
   */
  public EClass getConnectionDecoratorEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CONNECTIONDECORATOR_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ConnectionDecorator.locationRelative</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ConnectionDecorator.locationRelative</b></em>'.
   * @generated
   */
  public EAttribute getConnectionDecorator_LocationRelative() {
    return (EAttribute) getConnectionDecoratorEClass().getEAllStructuralFeatures().get(
        CONNECTIONDECORATOR_LOCATIONRELATIVE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ConnectionDecorator.location</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ConnectionDecorator.location</b></em>'.
   * @generated
   */
  public EAttribute getConnectionDecorator_Location() {
    return (EAttribute) getConnectionDecoratorEClass().getEAllStructuralFeatures().get(
        CONNECTIONDECORATOR_LOCATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>ConnectionDecorator.connection</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>ConnectionDecorator.connection</b></em>'.
   * @generated
   */
  public EReference getConnectionDecorator_Connection() {
    return (EReference) getConnectionDecoratorEClass().getEAllStructuralFeatures().get(
        CONNECTIONDECORATOR_CONNECTION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>FixPointAnchor</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>FixPointAnchor</b></em>'
   * @generated
   */
  public EClass getFixPointAnchorEClass() {
    return (EClass) getEPackage().getEClassifiers().get(FIXPOINTANCHOR_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>FixPointAnchor.location</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>FixPointAnchor.location</b></em>'.
   * @generated
   */
  public EReference getFixPointAnchor_Location() {
    return (EReference) getFixPointAnchorEClass().getEAllStructuralFeatures().get(FIXPOINTANCHOR_LOCATION_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AdvancedAnchor</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AdvancedAnchor</b></em>'
   * @generated
   */
  public EClass getAdvancedAnchorEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ADVANCEDANCHOR_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AdvancedAnchor.useAnchorLocationAsConnectionEndpoint</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '
   *         <em><b>AdvancedAnchor.useAnchorLocationAsConnectionEndpoint</b></em>'.
   * @generated
   */
  public EAttribute getAdvancedAnchor_UseAnchorLocationAsConnectionEndpoint() {
    return (EAttribute) getAdvancedAnchorEClass().getEAllStructuralFeatures().get(
        ADVANCEDANCHOR_USEANCHORLOCATIONASCONNECTIONENDPOINT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>BoxRelativeAnchor</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>BoxRelativeAnchor</b></em>'
   * @generated
   */
  public EClass getBoxRelativeAnchorEClass() {
    return (EClass) getEPackage().getEClassifiers().get(BOXRELATIVEANCHOR_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BoxRelativeAnchor.relativeWidth</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BoxRelativeAnchor.relativeWidth</b></em>'.
   * @generated
   */
  public EAttribute getBoxRelativeAnchor_RelativeWidth() {
    return (EAttribute) getBoxRelativeAnchorEClass().getEAllStructuralFeatures().get(
        BOXRELATIVEANCHOR_RELATIVEWIDTH_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>BoxRelativeAnchor.relativeHeight</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>BoxRelativeAnchor.relativeHeight</b></em>'.
   * @generated
   */
  public EAttribute getBoxRelativeAnchor_RelativeHeight() {
    return (EAttribute) getBoxRelativeAnchorEClass().getEAllStructuralFeatures().get(
        BOXRELATIVEANCHOR_RELATIVEHEIGHT_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ChopboxAnchor</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ChopboxAnchor</b></em>'
   * @generated
   */
  public EClass getChopboxAnchorEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CHOPBOXANCHOR_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>FreeFormConnection</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>FreeFormConnection</b></em>'
   * @generated
   */
  public EClass getFreeFormConnectionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(FREEFORMCONNECTION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>FreeFormConnection.bendpoints</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>FreeFormConnection.bendpoints</b></em>'.
   * @generated
   */
  public EReference getFreeFormConnection_Bendpoints() {
    return (EReference) getFreeFormConnectionEClass().getEAllStructuralFeatures().get(
        FREEFORMCONNECTION_BENDPOINTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>ManhattanConnection</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>ManhattanConnection</b></em>'
   * @generated
   */
  public EClass getManhattanConnectionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MANHATTANCONNECTION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CurvedConnection</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CurvedConnection</b></em>'
   * @generated
   */
  public EClass getCurvedConnectionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(CURVEDCONNECTION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CurvedConnection.controlPoints</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CurvedConnection.controlPoints</b></em>'.
   * @generated
   */
  public EReference getCurvedConnection_ControlPoints() {
    return (EReference) getCurvedConnectionEClass().getEAllStructuralFeatures().get(
        CURVEDCONNECTION_CONTROLPOINTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>CompositeConnection</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>CompositeConnection</b></em>'
   * @generated
   */
  public EClass getCompositeConnectionEClass() {
    return (EClass) getEPackage().getEClassifiers().get(COMPOSITECONNECTION_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>CompositeConnection.children</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>CompositeConnection.children</b></em>'.
   * @generated
   */
  public EReference getCompositeConnection_Children() {
    return (EReference) getCompositeConnectionEClass().getEAllStructuralFeatures().get(
        COMPOSITECONNECTION_CHILDREN_FEATURE_ID);
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
    case SHAPE_CLASSIFIER_ID:
      return Shape.class;
    case PICTOGRAMELEMENT_CLASSIFIER_ID:
      return PictogramElement.class;
    case ANCHORCONTAINER_CLASSIFIER_ID:
      return AnchorContainer.class;
    case CONTAINERSHAPE_CLASSIFIER_ID:
      return ContainerShape.class;
    case DIAGRAM_CLASSIFIER_ID:
      return Diagram.class;
    case CONNECTION_CLASSIFIER_ID:
      return Connection.class;
    case PICTOGRAMLINK_CLASSIFIER_ID:
      return PictogramLink.class;
    case ANCHOR_CLASSIFIER_ID:
      return Anchor.class;
    case CONNECTIONDECORATOR_CLASSIFIER_ID:
      return ConnectionDecorator.class;
    case FIXPOINTANCHOR_CLASSIFIER_ID:
      return FixPointAnchor.class;
    case ADVANCEDANCHOR_CLASSIFIER_ID:
      return AdvancedAnchor.class;
    case BOXRELATIVEANCHOR_CLASSIFIER_ID:
      return BoxRelativeAnchor.class;
    case CHOPBOXANCHOR_CLASSIFIER_ID:
      return ChopboxAnchor.class;
    case FREEFORMCONNECTION_CLASSIFIER_ID:
      return FreeFormConnection.class;
    case MANHATTANCONNECTION_CLASSIFIER_ID:
      return ManhattanConnection.class;
    case CURVEDCONNECTION_CLASSIFIER_ID:
      return CurvedConnection.class;
    case COMPOSITECONNECTION_CLASSIFIER_ID:
      return CompositeConnection.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
