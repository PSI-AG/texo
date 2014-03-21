package org.eclipse.graphiti.mm.algorithms;

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
import org.eclipse.graphiti.mm.algorithms.dao.AbstractTextDao;
import org.eclipse.graphiti.mm.algorithms.dao.EllipseDao;
import org.eclipse.graphiti.mm.algorithms.dao.GraphicsAlgorithmDao;
import org.eclipse.graphiti.mm.algorithms.dao.ImageDao;
import org.eclipse.graphiti.mm.algorithms.dao.MultiTextDao;
import org.eclipse.graphiti.mm.algorithms.dao.PlatformGraphicsAlgorithmDao;
import org.eclipse.graphiti.mm.algorithms.dao.PolygonDao;
import org.eclipse.graphiti.mm.algorithms.dao.PolylineDao;
import org.eclipse.graphiti.mm.algorithms.dao.RectangleDao;
import org.eclipse.graphiti.mm.algorithms.dao.RoundedRectangleDao;
import org.eclipse.graphiti.mm.algorithms.dao.TextDao;
import org.eclipse.graphiti.mm.algorithms.styles.StylesModelPackage;
import org.eclipse.graphiti.mm.pictograms.PictogramsModelPackage;

/**
 * The <b>Package</b> for the model '<em><b>algorithms</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class AlgorithmsModelPackage extends ModelPackage {

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
  public static final String NS_URI = "http://eclipse.org/graphiti/mm/algorithms";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final AlgorithmsModelFactory MODELFACTORY = new AlgorithmsModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_CLASSIFIER_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_GRAPHICSALGORITHMCHILDREN_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_PARENTGRAPHICSALGORITHM_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_PICTOGRAMELEMENT_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_WIDTH_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_HEIGHT_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_X_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_Y_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_STYLE_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_BACKGROUND_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_FOREGROUND_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_LINEWIDTH_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_LINESTYLE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_FILLED_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_LINEVISIBLE_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_RENDERINGSTYLE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int GRAPHICSALGORITHM_TRANSPARENCY_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_CLASSIFIER_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_GRAPHICSALGORITHMCHILDREN_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_PARENTGRAPHICSALGORITHM_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_PICTOGRAMELEMENT_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_WIDTH_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_HEIGHT_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_X_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_Y_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_STYLE_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_BACKGROUND_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_FOREGROUND_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_LINEWIDTH_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_LINESTYLE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_FILLED_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_LINEVISIBLE_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_RENDERINGSTYLE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_TRANSPARENCY_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYLINE_POINTS_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_CLASSIFIER_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_GRAPHICSALGORITHMCHILDREN_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_PARENTGRAPHICSALGORITHM_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_PICTOGRAMELEMENT_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_WIDTH_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_HEIGHT_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_X_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_Y_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_STYLE_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_BACKGROUND_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_FOREGROUND_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_LINEWIDTH_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_LINESTYLE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_FILLED_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_LINEVISIBLE_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_RENDERINGSTYLE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ELLIPSE_TRANSPARENCY_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_CLASSIFIER_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_GRAPHICSALGORITHMCHILDREN_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_PARENTGRAPHICSALGORITHM_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_PICTOGRAMELEMENT_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_WIDTH_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_HEIGHT_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_X_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_Y_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_STYLE_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_BACKGROUND_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_FOREGROUND_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_LINEWIDTH_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_LINESTYLE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_FILLED_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_LINEVISIBLE_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_RENDERINGSTYLE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_TRANSPARENCY_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_FONT_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_HORIZONTALALIGNMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_VERTICALALIGNMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_ANGLE_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_VALUE_FEATURE_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int TEXT_STYLEREGIONS_FEATURE_ID = 24;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_CLASSIFIER_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_GRAPHICSALGORITHMCHILDREN_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_PARENTGRAPHICSALGORITHM_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_PICTOGRAMELEMENT_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_WIDTH_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_HEIGHT_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_X_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_Y_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_STYLE_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_BACKGROUND_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_FOREGROUND_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_LINEWIDTH_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_LINESTYLE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_FILLED_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_LINEVISIBLE_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_RENDERINGSTYLE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_TRANSPARENCY_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_FONT_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_HORIZONTALALIGNMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_VERTICALALIGNMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_ANGLE_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_VALUE_FEATURE_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ABSTRACTTEXT_STYLEREGIONS_FEATURE_ID = 24;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_CLASSIFIER_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_GRAPHICSALGORITHMCHILDREN_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_PARENTGRAPHICSALGORITHM_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_PICTOGRAMELEMENT_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_WIDTH_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_HEIGHT_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_X_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_Y_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_STYLE_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_BACKGROUND_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_FOREGROUND_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_LINEWIDTH_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_LINESTYLE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_FILLED_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_LINEVISIBLE_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_RENDERINGSTYLE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_TRANSPARENCY_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int POLYGON_POINTS_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_CLASSIFIER_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_GRAPHICSALGORITHMCHILDREN_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_PARENTGRAPHICSALGORITHM_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_PICTOGRAMELEMENT_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_WIDTH_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_HEIGHT_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_X_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_Y_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_STYLE_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_BACKGROUND_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_FOREGROUND_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_LINEWIDTH_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_LINESTYLE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_FILLED_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_LINEVISIBLE_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_RENDERINGSTYLE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int RECTANGLE_TRANSPARENCY_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_CLASSIFIER_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_GRAPHICSALGORITHMCHILDREN_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_PARENTGRAPHICSALGORITHM_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_PICTOGRAMELEMENT_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_WIDTH_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_HEIGHT_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_X_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_Y_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_STYLE_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_BACKGROUND_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_FOREGROUND_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_LINEWIDTH_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_LINESTYLE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_FILLED_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_LINEVISIBLE_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_RENDERINGSTYLE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_TRANSPARENCY_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_CORNERHEIGHT_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int ROUNDEDRECTANGLE_CORNERWIDTH_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_CLASSIFIER_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_GRAPHICSALGORITHMCHILDREN_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_PARENTGRAPHICSALGORITHM_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_PICTOGRAMELEMENT_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_WIDTH_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_HEIGHT_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_X_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_Y_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_STYLE_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_BACKGROUND_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_FOREGROUND_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_LINEWIDTH_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_LINESTYLE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_FILLED_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_LINEVISIBLE_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_RENDERINGSTYLE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_TRANSPARENCY_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_ID_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_STRETCHH_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_STRETCHV_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int IMAGE_PROPORTIONAL_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_CLASSIFIER_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_GRAPHICSALGORITHMCHILDREN_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_PARENTGRAPHICSALGORITHM_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_PICTOGRAMELEMENT_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_WIDTH_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_HEIGHT_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_X_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_Y_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_STYLE_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_BACKGROUND_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_FOREGROUND_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_LINEWIDTH_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_LINESTYLE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_FILLED_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_LINEVISIBLE_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_RENDERINGSTYLE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_TRANSPARENCY_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int PLATFORMGRAPHICSALGORITHM_ID_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_CLASSIFIER_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_DB_ID_FEATURE_ID = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_DB_VERSION_FEATURE_ID = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_PROPERTIES_FEATURE_ID = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_GRAPHICSALGORITHMCHILDREN_FEATURE_ID = 11;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_PARENTGRAPHICSALGORITHM_FEATURE_ID = 12;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_PICTOGRAMELEMENT_FEATURE_ID = 13;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_WIDTH_FEATURE_ID = 14;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_HEIGHT_FEATURE_ID = 15;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_X_FEATURE_ID = 16;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_Y_FEATURE_ID = 17;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_STYLE_FEATURE_ID = 18;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_BACKGROUND_FEATURE_ID = 3;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_FOREGROUND_FEATURE_ID = 4;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_LINEWIDTH_FEATURE_ID = 5;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_LINESTYLE_FEATURE_ID = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_FILLED_FEATURE_ID = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_LINEVISIBLE_FEATURE_ID = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_RENDERINGSTYLE_FEATURE_ID = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_TRANSPARENCY_FEATURE_ID = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_FONT_FEATURE_ID = 19;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_HORIZONTALALIGNMENT_FEATURE_ID = 20;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_VERTICALALIGNMENT_FEATURE_ID = 21;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_ANGLE_FEATURE_ID = 22;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_VALUE_FEATURE_ID = 23;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int MULTITEXT_STYLEREGIONS_FEATURE_ID = 24;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final AlgorithmsModelPackage INSTANCE = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an initialized instance of this class
   * 
   * @generated
   */
  public static AlgorithmsModelPackage initialize() {

    if (isInitialized) {
      return (AlgorithmsModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
    }

    final AlgorithmsModelPackage modelPackage = new AlgorithmsModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    isInitialized = true;

    MmModelPackage.initialize();
    StylesModelPackage.initialize();
    PictogramsModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    StylesModelPackage.initialize();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(GraphicsAlgorithm.class,
        modelPackage.getGraphicsAlgorithmEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Polyline.class, modelPackage.getPolylineEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Ellipse.class, modelPackage.getEllipseEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Text.class, modelPackage.getTextEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(AbstractText.class, modelPackage.getAbstractTextEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Polygon.class, modelPackage.getPolygonEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Rectangle.class, modelPackage.getRectangleEClass(),
        modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(RoundedRectangle.class,
        modelPackage.getRoundedRectangleEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(Image.class, modelPackage.getImageEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(PlatformGraphicsAlgorithm.class,
        modelPackage.getPlatformGraphicsAlgorithmEClass(), modelPackage);
    ModelResolver.getInstance().registerClassModelMapping(MultiText.class, modelPackage.getMultiTextEClass(),
        modelPackage);

    DaoRegistry.getInstance().registerDao(GraphicsAlgorithm.class, GraphicsAlgorithmDao.class);
    DaoRegistry.getInstance().registerDao(Polyline.class, PolylineDao.class);
    DaoRegistry.getInstance().registerDao(Ellipse.class, EllipseDao.class);
    DaoRegistry.getInstance().registerDao(Text.class, TextDao.class);
    DaoRegistry.getInstance().registerDao(AbstractText.class, AbstractTextDao.class);
    DaoRegistry.getInstance().registerDao(Polygon.class, PolygonDao.class);
    DaoRegistry.getInstance().registerDao(Rectangle.class, RectangleDao.class);
    DaoRegistry.getInstance().registerDao(RoundedRectangle.class, RoundedRectangleDao.class);
    DaoRegistry.getInstance().registerDao(Image.class, ImageDao.class);
    DaoRegistry.getInstance().registerDao(PlatformGraphicsAlgorithm.class, PlatformGraphicsAlgorithmDao.class);
    DaoRegistry.getInstance().registerDao(MultiText.class, MultiTextDao.class);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link AlgorithmsModelFactory} instance.
   * @generated
   */
  @Override
  public AlgorithmsModelFactory getModelFactory() {
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
    return "algorithms.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>GraphicsAlgorithm</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>GraphicsAlgorithm</b></em>'
   * @generated
   */
  public EClass getGraphicsAlgorithmEClass() {
    return (EClass) getEPackage().getEClassifiers().get(GRAPHICSALGORITHM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GraphicsAlgorithm.graphicsAlgorithmChildren</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GraphicsAlgorithm.graphicsAlgorithmChildren</b></em>
   *         '.
   * @generated
   */
  public EReference getGraphicsAlgorithm_GraphicsAlgorithmChildren() {
    return (EReference) getGraphicsAlgorithmEClass().getEAllStructuralFeatures().get(
        GRAPHICSALGORITHM_GRAPHICSALGORITHMCHILDREN_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GraphicsAlgorithm.parentGraphicsAlgorithm</b></em>'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GraphicsAlgorithm.parentGraphicsAlgorithm</b></em>'.
   * @generated
   */
  public EReference getGraphicsAlgorithm_ParentGraphicsAlgorithm() {
    return (EReference) getGraphicsAlgorithmEClass().getEAllStructuralFeatures().get(
        GRAPHICSALGORITHM_PARENTGRAPHICSALGORITHM_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GraphicsAlgorithm.pictogramElement</b></em>'. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GraphicsAlgorithm.pictogramElement</b></em>'.
   * @generated
   */
  public EReference getGraphicsAlgorithm_PictogramElement() {
    return (EReference) getGraphicsAlgorithmEClass().getEAllStructuralFeatures().get(
        GRAPHICSALGORITHM_PICTOGRAMELEMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GraphicsAlgorithm.width</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GraphicsAlgorithm.width</b></em>'.
   * @generated
   */
  public EAttribute getGraphicsAlgorithm_Width() {
    return (EAttribute) getGraphicsAlgorithmEClass().getEAllStructuralFeatures()
        .get(GRAPHICSALGORITHM_WIDTH_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GraphicsAlgorithm.height</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GraphicsAlgorithm.height</b></em>'.
   * @generated
   */
  public EAttribute getGraphicsAlgorithm_Height() {
    return (EAttribute) getGraphicsAlgorithmEClass().getEAllStructuralFeatures().get(
        GRAPHICSALGORITHM_HEIGHT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GraphicsAlgorithm.x</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GraphicsAlgorithm.x</b></em>'.
   * @generated
   */
  public EAttribute getGraphicsAlgorithm_X() {
    return (EAttribute) getGraphicsAlgorithmEClass().getEAllStructuralFeatures().get(GRAPHICSALGORITHM_X_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GraphicsAlgorithm.y</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GraphicsAlgorithm.y</b></em>'.
   * @generated
   */
  public EAttribute getGraphicsAlgorithm_Y() {
    return (EAttribute) getGraphicsAlgorithmEClass().getEAllStructuralFeatures().get(GRAPHICSALGORITHM_Y_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GraphicsAlgorithm.style</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GraphicsAlgorithm.style</b></em>'.
   * @generated
   */
  public EReference getGraphicsAlgorithm_Style() {
    return (EReference) getGraphicsAlgorithmEClass().getEAllStructuralFeatures()
        .get(GRAPHICSALGORITHM_STYLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GraphicsAlgorithm.background</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GraphicsAlgorithm.background</b></em>'.
   * @generated
   */
  public EReference getGraphicsAlgorithm_Background() {
    return (EReference) getGraphicsAlgorithmEClass().getEAllStructuralFeatures().get(
        GRAPHICSALGORITHM_BACKGROUND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GraphicsAlgorithm.foreground</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GraphicsAlgorithm.foreground</b></em>'.
   * @generated
   */
  public EReference getGraphicsAlgorithm_Foreground() {
    return (EReference) getGraphicsAlgorithmEClass().getEAllStructuralFeatures().get(
        GRAPHICSALGORITHM_FOREGROUND_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GraphicsAlgorithm.lineWidth</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GraphicsAlgorithm.lineWidth</b></em>'.
   * @generated
   */
  public EAttribute getGraphicsAlgorithm_LineWidth() {
    return (EAttribute) getGraphicsAlgorithmEClass().getEAllStructuralFeatures().get(
        GRAPHICSALGORITHM_LINEWIDTH_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GraphicsAlgorithm.lineStyle</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GraphicsAlgorithm.lineStyle</b></em>'.
   * @generated
   */
  public EAttribute getGraphicsAlgorithm_LineStyle() {
    return (EAttribute) getGraphicsAlgorithmEClass().getEAllStructuralFeatures().get(
        GRAPHICSALGORITHM_LINESTYLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GraphicsAlgorithm.filled</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GraphicsAlgorithm.filled</b></em>'.
   * @generated
   */
  public EAttribute getGraphicsAlgorithm_Filled() {
    return (EAttribute) getGraphicsAlgorithmEClass().getEAllStructuralFeatures().get(
        GRAPHICSALGORITHM_FILLED_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GraphicsAlgorithm.lineVisible</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GraphicsAlgorithm.lineVisible</b></em>'.
   * @generated
   */
  public EAttribute getGraphicsAlgorithm_LineVisible() {
    return (EAttribute) getGraphicsAlgorithmEClass().getEAllStructuralFeatures().get(
        GRAPHICSALGORITHM_LINEVISIBLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GraphicsAlgorithm.renderingStyle</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GraphicsAlgorithm.renderingStyle</b></em>'.
   * @generated
   */
  public EReference getGraphicsAlgorithm_RenderingStyle() {
    return (EReference) getGraphicsAlgorithmEClass().getEAllStructuralFeatures().get(
        GRAPHICSALGORITHM_RENDERINGSTYLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>GraphicsAlgorithm.transparency</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>GraphicsAlgorithm.transparency</b></em>'.
   * @generated
   */
  public EAttribute getGraphicsAlgorithm_Transparency() {
    return (EAttribute) getGraphicsAlgorithmEClass().getEAllStructuralFeatures().get(
        GRAPHICSALGORITHM_TRANSPARENCY_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Polyline</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Polyline</b></em>'
   * @generated
   */
  public EClass getPolylineEClass() {
    return (EClass) getEPackage().getEClassifiers().get(POLYLINE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Polyline.points</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Polyline.points</b></em>'.
   * @generated
   */
  public EReference getPolyline_Points() {
    return (EReference) getPolylineEClass().getEAllStructuralFeatures().get(POLYLINE_POINTS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Ellipse</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Ellipse</b></em>'
   * @generated
   */
  public EClass getEllipseEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ELLIPSE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Text</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Text</b></em>'
   * @generated
   */
  public EClass getTextEClass() {
    return (EClass) getEPackage().getEClassifiers().get(TEXT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>AbstractText</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>AbstractText</b></em>'
   * @generated
   */
  public EClass getAbstractTextEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ABSTRACTTEXT_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractText.font</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractText.font</b></em>'.
   * @generated
   */
  public EReference getAbstractText_Font() {
    return (EReference) getAbstractTextEClass().getEAllStructuralFeatures().get(ABSTRACTTEXT_FONT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractText.horizontalAlignment</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractText.horizontalAlignment</b></em>'.
   * @generated
   */
  public EAttribute getAbstractText_HorizontalAlignment() {
    return (EAttribute) getAbstractTextEClass().getEAllStructuralFeatures().get(
        ABSTRACTTEXT_HORIZONTALALIGNMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractText.verticalAlignment</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractText.verticalAlignment</b></em>'.
   * @generated
   */
  public EAttribute getAbstractText_VerticalAlignment() {
    return (EAttribute) getAbstractTextEClass().getEAllStructuralFeatures().get(
        ABSTRACTTEXT_VERTICALALIGNMENT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractText.angle</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractText.angle</b></em>'.
   * @generated
   */
  public EAttribute getAbstractText_Angle() {
    return (EAttribute) getAbstractTextEClass().getEAllStructuralFeatures().get(ABSTRACTTEXT_ANGLE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractText.value</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractText.value</b></em>'.
   * @generated
   */
  public EAttribute getAbstractText_Value() {
    return (EAttribute) getAbstractTextEClass().getEAllStructuralFeatures().get(ABSTRACTTEXT_VALUE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>AbstractText.styleRegions</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>AbstractText.styleRegions</b></em>'.
   * @generated
   */
  public EReference getAbstractText_StyleRegions() {
    return (EReference) getAbstractTextEClass().getEAllStructuralFeatures().get(ABSTRACTTEXT_STYLEREGIONS_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Polygon</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Polygon</b></em>'
   * @generated
   */
  public EClass getPolygonEClass() {
    return (EClass) getEPackage().getEClassifiers().get(POLYGON_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Rectangle</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Rectangle</b></em>'
   * @generated
   */
  public EClass getRectangleEClass() {
    return (EClass) getEPackage().getEClassifiers().get(RECTANGLE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>RoundedRectangle</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>RoundedRectangle</b></em>'
   * @generated
   */
  public EClass getRoundedRectangleEClass() {
    return (EClass) getEPackage().getEClassifiers().get(ROUNDEDRECTANGLE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RoundedRectangle.cornerHeight</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RoundedRectangle.cornerHeight</b></em>'.
   * @generated
   */
  public EAttribute getRoundedRectangle_CornerHeight() {
    return (EAttribute) getRoundedRectangleEClass().getEAllStructuralFeatures().get(
        ROUNDEDRECTANGLE_CORNERHEIGHT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>RoundedRectangle.cornerWidth</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>RoundedRectangle.cornerWidth</b></em>'.
   * @generated
   */
  public EAttribute getRoundedRectangle_CornerWidth() {
    return (EAttribute) getRoundedRectangleEClass().getEAllStructuralFeatures().get(
        ROUNDEDRECTANGLE_CORNERWIDTH_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>Image</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>Image</b></em>'
   * @generated
   */
  public EClass getImageEClass() {
    return (EClass) getEPackage().getEClassifiers().get(IMAGE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Image.id</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Image.id</b></em>'.
   * @generated
   */
  public EAttribute getImage_Id() {
    return (EAttribute) getImageEClass().getEAllStructuralFeatures().get(IMAGE_ID_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Image.stretchH</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Image.stretchH</b></em>'.
   * @generated
   */
  public EAttribute getImage_StretchH() {
    return (EAttribute) getImageEClass().getEAllStructuralFeatures().get(IMAGE_STRETCHH_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Image.stretchV</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Image.stretchV</b></em>'.
   * @generated
   */
  public EAttribute getImage_StretchV() {
    return (EAttribute) getImageEClass().getEAllStructuralFeatures().get(IMAGE_STRETCHV_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>Image.proportional</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>Image.proportional</b></em>'.
   * @generated
   */
  public EAttribute getImage_Proportional() {
    return (EAttribute) getImageEClass().getEAllStructuralFeatures().get(IMAGE_PROPORTIONAL_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>PlatformGraphicsAlgorithm</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @return an instance of the {@link EClass} '<em><b>PlatformGraphicsAlgorithm</b></em>'
   * @generated
   */
  public EClass getPlatformGraphicsAlgorithmEClass() {
    return (EClass) getEPackage().getEClassifiers().get(PLATFORMGRAPHICSALGORITHM_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>PlatformGraphicsAlgorithm.id</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>PlatformGraphicsAlgorithm.id</b></em>'.
   * @generated
   */
  public EAttribute getPlatformGraphicsAlgorithm_Id() {
    return (EAttribute) getPlatformGraphicsAlgorithmEClass().getEAllStructuralFeatures().get(
        PLATFORMGRAPHICSALGORITHM_ID_FEATURE_ID);
  }

  /**
   * Returns the {@link EClass} '<em><b>MultiText</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>MultiText</b></em>'
   * @generated
   */
  public EClass getMultiTextEClass() {
    return (EClass) getEPackage().getEClassifiers().get(MULTITEXT_CLASSIFIER_ID);
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
    case GRAPHICSALGORITHM_CLASSIFIER_ID:
      return GraphicsAlgorithm.class;
    case POLYLINE_CLASSIFIER_ID:
      return Polyline.class;
    case ELLIPSE_CLASSIFIER_ID:
      return Ellipse.class;
    case TEXT_CLASSIFIER_ID:
      return Text.class;
    case ABSTRACTTEXT_CLASSIFIER_ID:
      return AbstractText.class;
    case POLYGON_CLASSIFIER_ID:
      return Polygon.class;
    case RECTANGLE_CLASSIFIER_ID:
      return Rectangle.class;
    case ROUNDEDRECTANGLE_CLASSIFIER_ID:
      return RoundedRectangle.class;
    case IMAGE_CLASSIFIER_ID:
      return Image.class;
    case PLATFORMGRAPHICSALGORITHM_CLASSIFIER_ID:
      return PlatformGraphicsAlgorithm.class;
    case MULTITEXT_CLASSIFIER_ID:
      return MultiText.class;
    default:
      throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
    }
  }
}
