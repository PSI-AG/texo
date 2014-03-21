package org.eclipse.graphiti.mm.algorithms;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.graphiti.mm.MmModelFactory;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.algorithms.styles.RenderingStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.algorithms.styles.TextStyleRegion;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: algorithms. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class AlgorithmsModelFactory implements ModelFactory {

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
    case AlgorithmsModelPackage.POLYLINE_CLASSIFIER_ID:
      return createPolyline();
    case AlgorithmsModelPackage.ELLIPSE_CLASSIFIER_ID:
      return createEllipse();
    case AlgorithmsModelPackage.TEXT_CLASSIFIER_ID:
      return createText();
    case AlgorithmsModelPackage.POLYGON_CLASSIFIER_ID:
      return createPolygon();
    case AlgorithmsModelPackage.RECTANGLE_CLASSIFIER_ID:
      return createRectangle();
    case AlgorithmsModelPackage.ROUNDEDRECTANGLE_CLASSIFIER_ID:
      return createRoundedRectangle();
    case AlgorithmsModelPackage.IMAGE_CLASSIFIER_ID:
      return createImage();
    case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_CLASSIFIER_ID:
      return createPlatformGraphicsAlgorithm();
    case AlgorithmsModelPackage.MULTITEXT_CLASSIFIER_ID:
      return createMultiText();
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
    case AlgorithmsModelPackage.GRAPHICSALGORITHM_CLASSIFIER_ID:
      modelObject = new GraphicsAlgorithmModelObject();
      break;
    case AlgorithmsModelPackage.POLYLINE_CLASSIFIER_ID:
      modelObject = new PolylineModelObject();
      break;
    case AlgorithmsModelPackage.ELLIPSE_CLASSIFIER_ID:
      modelObject = new EllipseModelObject();
      break;
    case AlgorithmsModelPackage.TEXT_CLASSIFIER_ID:
      modelObject = new TextModelObject();
      break;
    case AlgorithmsModelPackage.ABSTRACTTEXT_CLASSIFIER_ID:
      modelObject = new AbstractTextModelObject();
      break;
    case AlgorithmsModelPackage.POLYGON_CLASSIFIER_ID:
      modelObject = new PolygonModelObject();
      break;
    case AlgorithmsModelPackage.RECTANGLE_CLASSIFIER_ID:
      modelObject = new RectangleModelObject();
      break;
    case AlgorithmsModelPackage.ROUNDEDRECTANGLE_CLASSIFIER_ID:
      modelObject = new RoundedRectangleModelObject();
      break;
    case AlgorithmsModelPackage.IMAGE_CLASSIFIER_ID:
      modelObject = new ImageModelObject();
      break;
    case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_CLASSIFIER_ID:
      modelObject = new PlatformGraphicsAlgorithmModelObject();
      break;
    case AlgorithmsModelPackage.MULTITEXT_CLASSIFIER_ID:
      modelObject = new MultiTextModelObject();
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
   * @return an instance of the model object representing the EClass Polyline
   * @generated
   */
  public Polyline createPolyline() {
    return new Polyline();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Ellipse
   * @generated
   */
  public Ellipse createEllipse() {
    return new Ellipse();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Text
   * @generated
   */
  public Text createText() {
    return new Text();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Polygon
   * @generated
   */
  public Polygon createPolygon() {
    return new Polygon();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Rectangle
   * @generated
   */
  public Rectangle createRectangle() {
    return new Rectangle();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RoundedRectangle
   * @generated
   */
  public RoundedRectangle createRoundedRectangle() {
    return new RoundedRectangle();
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
   * @return an instance of the model object representing the EClass PlatformGraphicsAlgorithm
   * @generated
   */
  public PlatformGraphicsAlgorithm createPlatformGraphicsAlgorithm() {
    return new PlatformGraphicsAlgorithm();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass MultiText
   * @generated
   */
  public MultiText createMultiText() {
    return new MultiText();
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
   * The adapter/wrapper for the EClass '<em><b>GraphicsAlgorithm</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class GraphicsAlgorithmModelObject<E extends GraphicsAlgorithm> extends
      MmModelFactory.GraphicsAlgorithmContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getGraphicsAlgorithmEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        return getTarget().getGraphicsAlgorithmChildren();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_PARENTGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getParentGraphicsAlgorithm();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_PICTOGRAMELEMENT_FEATURE_ID:
        return getTarget().getPictogramElement();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_X_FEATURE_ID:
        return getTarget().getX();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_Y_FEATURE_ID:
        return getTarget().getY();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_STYLE_FEATURE_ID:
        return getTarget().getStyle();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_BACKGROUND_FEATURE_ID:
        return getTarget().getBackground();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_FOREGROUND_FEATURE_ID:
        return getTarget().getForeground();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_LINEWIDTH_FEATURE_ID:
        return getTarget().getLineWidth();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_LINESTYLE_FEATURE_ID:
        return getTarget().getLineStyle();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_FILLED_FEATURE_ID:
        return getTarget().getFilled();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_LINEVISIBLE_FEATURE_ID:
        return getTarget().getLineVisible();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_RENDERINGSTYLE_FEATURE_ID:
        return getTarget().getRenderingStyle();
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_TRANSPARENCY_FEATURE_ID:
        return getTarget().getTransparency();
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
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        getTarget().setGraphicsAlgorithmChildren((List<GraphicsAlgorithm>) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_PARENTGRAPHICSALGORITHM_FEATURE_ID:
        getTarget().setParentGraphicsAlgorithm((GraphicsAlgorithm) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_PICTOGRAMELEMENT_FEATURE_ID:
        getTarget().setPictogramElement((PictogramElement) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_WIDTH_FEATURE_ID:
        getTarget().setWidth((Integer) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_HEIGHT_FEATURE_ID:
        getTarget().setHeight((Integer) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_X_FEATURE_ID:
        getTarget().setX((Integer) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_Y_FEATURE_ID:
        getTarget().setY((Integer) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_STYLE_FEATURE_ID:
        getTarget().setStyle((Style) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_BACKGROUND_FEATURE_ID:
        getTarget().setBackground((Color) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_FOREGROUND_FEATURE_ID:
        getTarget().setForeground((Color) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_LINEWIDTH_FEATURE_ID:
        getTarget().setLineWidth((Integer) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_LINESTYLE_FEATURE_ID:
        getTarget().setLineStyle((LineStyle) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_FILLED_FEATURE_ID:
        getTarget().setFilled((Boolean) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_LINEVISIBLE_FEATURE_ID:
        getTarget().setLineVisible((Boolean) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_RENDERINGSTYLE_FEATURE_ID:
        getTarget().setRenderingStyle((RenderingStyle) value);
        return;
      case AlgorithmsModelPackage.GRAPHICSALGORITHM_TRANSPARENCY_FEATURE_ID:
        getTarget().setTransparency((Double) value);
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

      case AlgorithmsModelPackage.GRAPHICSALGORITHM_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        return getTarget().addToGraphicsAlgorithmChildren((GraphicsAlgorithm) value);

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

      case AlgorithmsModelPackage.GRAPHICSALGORITHM_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        return getTarget().removeFromGraphicsAlgorithmChildren((GraphicsAlgorithm) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Polyline</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PolylineModelObject<E extends Polyline> extends GraphicsAlgorithmModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getPolylineEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.POLYLINE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AlgorithmsModelPackage.POLYLINE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AlgorithmsModelPackage.POLYLINE_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case AlgorithmsModelPackage.POLYLINE_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        return getTarget().getGraphicsAlgorithmChildren();
      case AlgorithmsModelPackage.POLYLINE_PARENTGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getParentGraphicsAlgorithm();
      case AlgorithmsModelPackage.POLYLINE_PICTOGRAMELEMENT_FEATURE_ID:
        return getTarget().getPictogramElement();
      case AlgorithmsModelPackage.POLYLINE_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case AlgorithmsModelPackage.POLYLINE_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case AlgorithmsModelPackage.POLYLINE_X_FEATURE_ID:
        return getTarget().getX();
      case AlgorithmsModelPackage.POLYLINE_Y_FEATURE_ID:
        return getTarget().getY();
      case AlgorithmsModelPackage.POLYLINE_STYLE_FEATURE_ID:
        return getTarget().getStyle();
      case AlgorithmsModelPackage.POLYLINE_BACKGROUND_FEATURE_ID:
        return getTarget().getBackground();
      case AlgorithmsModelPackage.POLYLINE_FOREGROUND_FEATURE_ID:
        return getTarget().getForeground();
      case AlgorithmsModelPackage.POLYLINE_LINEWIDTH_FEATURE_ID:
        return getTarget().getLineWidth();
      case AlgorithmsModelPackage.POLYLINE_LINESTYLE_FEATURE_ID:
        return getTarget().getLineStyle();
      case AlgorithmsModelPackage.POLYLINE_FILLED_FEATURE_ID:
        return getTarget().getFilled();
      case AlgorithmsModelPackage.POLYLINE_LINEVISIBLE_FEATURE_ID:
        return getTarget().getLineVisible();
      case AlgorithmsModelPackage.POLYLINE_RENDERINGSTYLE_FEATURE_ID:
        return getTarget().getRenderingStyle();
      case AlgorithmsModelPackage.POLYLINE_TRANSPARENCY_FEATURE_ID:
        return getTarget().getTransparency();
      case AlgorithmsModelPackage.POLYLINE_POINTS_FEATURE_ID:
        return getTarget().getPoints();
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
      case AlgorithmsModelPackage.POLYLINE_POINTS_FEATURE_ID:
        getTarget().setPoints((List<Point>) value);
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

      case AlgorithmsModelPackage.POLYLINE_POINTS_FEATURE_ID:
        return getTarget().addToPoints((Point) value);
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

      case AlgorithmsModelPackage.POLYLINE_POINTS_FEATURE_ID:
        return getTarget().removeFromPoints((Point) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Ellipse</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class EllipseModelObject<E extends Ellipse> extends GraphicsAlgorithmModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getEllipseEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.ELLIPSE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AlgorithmsModelPackage.ELLIPSE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AlgorithmsModelPackage.ELLIPSE_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case AlgorithmsModelPackage.ELLIPSE_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        return getTarget().getGraphicsAlgorithmChildren();
      case AlgorithmsModelPackage.ELLIPSE_PARENTGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getParentGraphicsAlgorithm();
      case AlgorithmsModelPackage.ELLIPSE_PICTOGRAMELEMENT_FEATURE_ID:
        return getTarget().getPictogramElement();
      case AlgorithmsModelPackage.ELLIPSE_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case AlgorithmsModelPackage.ELLIPSE_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case AlgorithmsModelPackage.ELLIPSE_X_FEATURE_ID:
        return getTarget().getX();
      case AlgorithmsModelPackage.ELLIPSE_Y_FEATURE_ID:
        return getTarget().getY();
      case AlgorithmsModelPackage.ELLIPSE_STYLE_FEATURE_ID:
        return getTarget().getStyle();
      case AlgorithmsModelPackage.ELLIPSE_BACKGROUND_FEATURE_ID:
        return getTarget().getBackground();
      case AlgorithmsModelPackage.ELLIPSE_FOREGROUND_FEATURE_ID:
        return getTarget().getForeground();
      case AlgorithmsModelPackage.ELLIPSE_LINEWIDTH_FEATURE_ID:
        return getTarget().getLineWidth();
      case AlgorithmsModelPackage.ELLIPSE_LINESTYLE_FEATURE_ID:
        return getTarget().getLineStyle();
      case AlgorithmsModelPackage.ELLIPSE_FILLED_FEATURE_ID:
        return getTarget().getFilled();
      case AlgorithmsModelPackage.ELLIPSE_LINEVISIBLE_FEATURE_ID:
        return getTarget().getLineVisible();
      case AlgorithmsModelPackage.ELLIPSE_RENDERINGSTYLE_FEATURE_ID:
        return getTarget().getRenderingStyle();
      case AlgorithmsModelPackage.ELLIPSE_TRANSPARENCY_FEATURE_ID:
        return getTarget().getTransparency();
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
   * The adapter/wrapper for the EClass '<em><b>Text</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TextModelObject<E extends Text> extends AbstractTextModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getTextEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.TEXT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AlgorithmsModelPackage.TEXT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AlgorithmsModelPackage.TEXT_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case AlgorithmsModelPackage.TEXT_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        return getTarget().getGraphicsAlgorithmChildren();
      case AlgorithmsModelPackage.TEXT_PARENTGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getParentGraphicsAlgorithm();
      case AlgorithmsModelPackage.TEXT_PICTOGRAMELEMENT_FEATURE_ID:
        return getTarget().getPictogramElement();
      case AlgorithmsModelPackage.TEXT_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case AlgorithmsModelPackage.TEXT_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case AlgorithmsModelPackage.TEXT_X_FEATURE_ID:
        return getTarget().getX();
      case AlgorithmsModelPackage.TEXT_Y_FEATURE_ID:
        return getTarget().getY();
      case AlgorithmsModelPackage.TEXT_STYLE_FEATURE_ID:
        return getTarget().getStyle();
      case AlgorithmsModelPackage.TEXT_BACKGROUND_FEATURE_ID:
        return getTarget().getBackground();
      case AlgorithmsModelPackage.TEXT_FOREGROUND_FEATURE_ID:
        return getTarget().getForeground();
      case AlgorithmsModelPackage.TEXT_LINEWIDTH_FEATURE_ID:
        return getTarget().getLineWidth();
      case AlgorithmsModelPackage.TEXT_LINESTYLE_FEATURE_ID:
        return getTarget().getLineStyle();
      case AlgorithmsModelPackage.TEXT_FILLED_FEATURE_ID:
        return getTarget().getFilled();
      case AlgorithmsModelPackage.TEXT_LINEVISIBLE_FEATURE_ID:
        return getTarget().getLineVisible();
      case AlgorithmsModelPackage.TEXT_RENDERINGSTYLE_FEATURE_ID:
        return getTarget().getRenderingStyle();
      case AlgorithmsModelPackage.TEXT_TRANSPARENCY_FEATURE_ID:
        return getTarget().getTransparency();
      case AlgorithmsModelPackage.TEXT_FONT_FEATURE_ID:
        return getTarget().getFont();
      case AlgorithmsModelPackage.TEXT_HORIZONTALALIGNMENT_FEATURE_ID:
        return getTarget().getHorizontalAlignment();
      case AlgorithmsModelPackage.TEXT_VERTICALALIGNMENT_FEATURE_ID:
        return getTarget().getVerticalAlignment();
      case AlgorithmsModelPackage.TEXT_ANGLE_FEATURE_ID:
        return getTarget().getAngle();
      case AlgorithmsModelPackage.TEXT_VALUE_FEATURE_ID:
        return getTarget().getValue();
      case AlgorithmsModelPackage.TEXT_STYLEREGIONS_FEATURE_ID:
        return getTarget().getStyleRegions();
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
   * The adapter/wrapper for the EClass '<em><b>AbstractText</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractTextModelObject<E extends AbstractText> extends GraphicsAlgorithmModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getAbstractTextEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.ABSTRACTTEXT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AlgorithmsModelPackage.ABSTRACTTEXT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AlgorithmsModelPackage.ABSTRACTTEXT_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case AlgorithmsModelPackage.ABSTRACTTEXT_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        return getTarget().getGraphicsAlgorithmChildren();
      case AlgorithmsModelPackage.ABSTRACTTEXT_PARENTGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getParentGraphicsAlgorithm();
      case AlgorithmsModelPackage.ABSTRACTTEXT_PICTOGRAMELEMENT_FEATURE_ID:
        return getTarget().getPictogramElement();
      case AlgorithmsModelPackage.ABSTRACTTEXT_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case AlgorithmsModelPackage.ABSTRACTTEXT_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case AlgorithmsModelPackage.ABSTRACTTEXT_X_FEATURE_ID:
        return getTarget().getX();
      case AlgorithmsModelPackage.ABSTRACTTEXT_Y_FEATURE_ID:
        return getTarget().getY();
      case AlgorithmsModelPackage.ABSTRACTTEXT_STYLE_FEATURE_ID:
        return getTarget().getStyle();
      case AlgorithmsModelPackage.ABSTRACTTEXT_BACKGROUND_FEATURE_ID:
        return getTarget().getBackground();
      case AlgorithmsModelPackage.ABSTRACTTEXT_FOREGROUND_FEATURE_ID:
        return getTarget().getForeground();
      case AlgorithmsModelPackage.ABSTRACTTEXT_LINEWIDTH_FEATURE_ID:
        return getTarget().getLineWidth();
      case AlgorithmsModelPackage.ABSTRACTTEXT_LINESTYLE_FEATURE_ID:
        return getTarget().getLineStyle();
      case AlgorithmsModelPackage.ABSTRACTTEXT_FILLED_FEATURE_ID:
        return getTarget().getFilled();
      case AlgorithmsModelPackage.ABSTRACTTEXT_LINEVISIBLE_FEATURE_ID:
        return getTarget().getLineVisible();
      case AlgorithmsModelPackage.ABSTRACTTEXT_RENDERINGSTYLE_FEATURE_ID:
        return getTarget().getRenderingStyle();
      case AlgorithmsModelPackage.ABSTRACTTEXT_TRANSPARENCY_FEATURE_ID:
        return getTarget().getTransparency();
      case AlgorithmsModelPackage.ABSTRACTTEXT_FONT_FEATURE_ID:
        return getTarget().getFont();
      case AlgorithmsModelPackage.ABSTRACTTEXT_HORIZONTALALIGNMENT_FEATURE_ID:
        return getTarget().getHorizontalAlignment();
      case AlgorithmsModelPackage.ABSTRACTTEXT_VERTICALALIGNMENT_FEATURE_ID:
        return getTarget().getVerticalAlignment();
      case AlgorithmsModelPackage.ABSTRACTTEXT_ANGLE_FEATURE_ID:
        return getTarget().getAngle();
      case AlgorithmsModelPackage.ABSTRACTTEXT_VALUE_FEATURE_ID:
        return getTarget().getValue();
      case AlgorithmsModelPackage.ABSTRACTTEXT_STYLEREGIONS_FEATURE_ID:
        return getTarget().getStyleRegions();
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
      case AlgorithmsModelPackage.ABSTRACTTEXT_FONT_FEATURE_ID:
        getTarget().setFont((Font) value);
        return;
      case AlgorithmsModelPackage.ABSTRACTTEXT_HORIZONTALALIGNMENT_FEATURE_ID:
        getTarget().setHorizontalAlignment((Orientation) value);
        return;
      case AlgorithmsModelPackage.ABSTRACTTEXT_VERTICALALIGNMENT_FEATURE_ID:
        getTarget().setVerticalAlignment((Orientation) value);
        return;
      case AlgorithmsModelPackage.ABSTRACTTEXT_ANGLE_FEATURE_ID:
        getTarget().setAngle((Integer) value);
        return;
      case AlgorithmsModelPackage.ABSTRACTTEXT_VALUE_FEATURE_ID:
        getTarget().setValue((String) value);
        return;
      case AlgorithmsModelPackage.ABSTRACTTEXT_STYLEREGIONS_FEATURE_ID:
        getTarget().setStyleRegions((List<TextStyleRegion>) value);
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

      case AlgorithmsModelPackage.ABSTRACTTEXT_STYLEREGIONS_FEATURE_ID:
        return getTarget().addToStyleRegions((TextStyleRegion) value);
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

      case AlgorithmsModelPackage.ABSTRACTTEXT_STYLEREGIONS_FEATURE_ID:
        return getTarget().removeFromStyleRegions((TextStyleRegion) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Polygon</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PolygonModelObject<E extends Polygon> extends PolylineModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getPolygonEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.POLYGON_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AlgorithmsModelPackage.POLYGON_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AlgorithmsModelPackage.POLYGON_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case AlgorithmsModelPackage.POLYGON_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        return getTarget().getGraphicsAlgorithmChildren();
      case AlgorithmsModelPackage.POLYGON_PARENTGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getParentGraphicsAlgorithm();
      case AlgorithmsModelPackage.POLYGON_PICTOGRAMELEMENT_FEATURE_ID:
        return getTarget().getPictogramElement();
      case AlgorithmsModelPackage.POLYGON_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case AlgorithmsModelPackage.POLYGON_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case AlgorithmsModelPackage.POLYGON_X_FEATURE_ID:
        return getTarget().getX();
      case AlgorithmsModelPackage.POLYGON_Y_FEATURE_ID:
        return getTarget().getY();
      case AlgorithmsModelPackage.POLYGON_STYLE_FEATURE_ID:
        return getTarget().getStyle();
      case AlgorithmsModelPackage.POLYGON_BACKGROUND_FEATURE_ID:
        return getTarget().getBackground();
      case AlgorithmsModelPackage.POLYGON_FOREGROUND_FEATURE_ID:
        return getTarget().getForeground();
      case AlgorithmsModelPackage.POLYGON_LINEWIDTH_FEATURE_ID:
        return getTarget().getLineWidth();
      case AlgorithmsModelPackage.POLYGON_LINESTYLE_FEATURE_ID:
        return getTarget().getLineStyle();
      case AlgorithmsModelPackage.POLYGON_FILLED_FEATURE_ID:
        return getTarget().getFilled();
      case AlgorithmsModelPackage.POLYGON_LINEVISIBLE_FEATURE_ID:
        return getTarget().getLineVisible();
      case AlgorithmsModelPackage.POLYGON_RENDERINGSTYLE_FEATURE_ID:
        return getTarget().getRenderingStyle();
      case AlgorithmsModelPackage.POLYGON_TRANSPARENCY_FEATURE_ID:
        return getTarget().getTransparency();
      case AlgorithmsModelPackage.POLYGON_POINTS_FEATURE_ID:
        return getTarget().getPoints();
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
   * The adapter/wrapper for the EClass '<em><b>Rectangle</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RectangleModelObject<E extends Rectangle> extends GraphicsAlgorithmModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getRectangleEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.RECTANGLE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AlgorithmsModelPackage.RECTANGLE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AlgorithmsModelPackage.RECTANGLE_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case AlgorithmsModelPackage.RECTANGLE_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        return getTarget().getGraphicsAlgorithmChildren();
      case AlgorithmsModelPackage.RECTANGLE_PARENTGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getParentGraphicsAlgorithm();
      case AlgorithmsModelPackage.RECTANGLE_PICTOGRAMELEMENT_FEATURE_ID:
        return getTarget().getPictogramElement();
      case AlgorithmsModelPackage.RECTANGLE_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case AlgorithmsModelPackage.RECTANGLE_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case AlgorithmsModelPackage.RECTANGLE_X_FEATURE_ID:
        return getTarget().getX();
      case AlgorithmsModelPackage.RECTANGLE_Y_FEATURE_ID:
        return getTarget().getY();
      case AlgorithmsModelPackage.RECTANGLE_STYLE_FEATURE_ID:
        return getTarget().getStyle();
      case AlgorithmsModelPackage.RECTANGLE_BACKGROUND_FEATURE_ID:
        return getTarget().getBackground();
      case AlgorithmsModelPackage.RECTANGLE_FOREGROUND_FEATURE_ID:
        return getTarget().getForeground();
      case AlgorithmsModelPackage.RECTANGLE_LINEWIDTH_FEATURE_ID:
        return getTarget().getLineWidth();
      case AlgorithmsModelPackage.RECTANGLE_LINESTYLE_FEATURE_ID:
        return getTarget().getLineStyle();
      case AlgorithmsModelPackage.RECTANGLE_FILLED_FEATURE_ID:
        return getTarget().getFilled();
      case AlgorithmsModelPackage.RECTANGLE_LINEVISIBLE_FEATURE_ID:
        return getTarget().getLineVisible();
      case AlgorithmsModelPackage.RECTANGLE_RENDERINGSTYLE_FEATURE_ID:
        return getTarget().getRenderingStyle();
      case AlgorithmsModelPackage.RECTANGLE_TRANSPARENCY_FEATURE_ID:
        return getTarget().getTransparency();
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
   * The adapter/wrapper for the EClass '<em><b>RoundedRectangle</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RoundedRectangleModelObject<E extends RoundedRectangle> extends GraphicsAlgorithmModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getRoundedRectangleEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        return getTarget().getGraphicsAlgorithmChildren();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_PARENTGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getParentGraphicsAlgorithm();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_PICTOGRAMELEMENT_FEATURE_ID:
        return getTarget().getPictogramElement();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_X_FEATURE_ID:
        return getTarget().getX();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_Y_FEATURE_ID:
        return getTarget().getY();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_STYLE_FEATURE_ID:
        return getTarget().getStyle();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_BACKGROUND_FEATURE_ID:
        return getTarget().getBackground();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_FOREGROUND_FEATURE_ID:
        return getTarget().getForeground();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_LINEWIDTH_FEATURE_ID:
        return getTarget().getLineWidth();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_LINESTYLE_FEATURE_ID:
        return getTarget().getLineStyle();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_FILLED_FEATURE_ID:
        return getTarget().getFilled();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_LINEVISIBLE_FEATURE_ID:
        return getTarget().getLineVisible();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_RENDERINGSTYLE_FEATURE_ID:
        return getTarget().getRenderingStyle();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_TRANSPARENCY_FEATURE_ID:
        return getTarget().getTransparency();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_CORNERHEIGHT_FEATURE_ID:
        return getTarget().getCornerHeight();
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_CORNERWIDTH_FEATURE_ID:
        return getTarget().getCornerWidth();
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
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_CORNERHEIGHT_FEATURE_ID:
        getTarget().setCornerHeight((Integer) value);
        return;
      case AlgorithmsModelPackage.ROUNDEDRECTANGLE_CORNERWIDTH_FEATURE_ID:
        getTarget().setCornerWidth((Integer) value);
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
  public static class ImageModelObject<E extends Image> extends GraphicsAlgorithmModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getImageEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.IMAGE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AlgorithmsModelPackage.IMAGE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AlgorithmsModelPackage.IMAGE_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case AlgorithmsModelPackage.IMAGE_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        return getTarget().getGraphicsAlgorithmChildren();
      case AlgorithmsModelPackage.IMAGE_PARENTGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getParentGraphicsAlgorithm();
      case AlgorithmsModelPackage.IMAGE_PICTOGRAMELEMENT_FEATURE_ID:
        return getTarget().getPictogramElement();
      case AlgorithmsModelPackage.IMAGE_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case AlgorithmsModelPackage.IMAGE_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case AlgorithmsModelPackage.IMAGE_X_FEATURE_ID:
        return getTarget().getX();
      case AlgorithmsModelPackage.IMAGE_Y_FEATURE_ID:
        return getTarget().getY();
      case AlgorithmsModelPackage.IMAGE_STYLE_FEATURE_ID:
        return getTarget().getStyle();
      case AlgorithmsModelPackage.IMAGE_BACKGROUND_FEATURE_ID:
        return getTarget().getBackground();
      case AlgorithmsModelPackage.IMAGE_FOREGROUND_FEATURE_ID:
        return getTarget().getForeground();
      case AlgorithmsModelPackage.IMAGE_LINEWIDTH_FEATURE_ID:
        return getTarget().getLineWidth();
      case AlgorithmsModelPackage.IMAGE_LINESTYLE_FEATURE_ID:
        return getTarget().getLineStyle();
      case AlgorithmsModelPackage.IMAGE_FILLED_FEATURE_ID:
        return getTarget().getFilled();
      case AlgorithmsModelPackage.IMAGE_LINEVISIBLE_FEATURE_ID:
        return getTarget().getLineVisible();
      case AlgorithmsModelPackage.IMAGE_RENDERINGSTYLE_FEATURE_ID:
        return getTarget().getRenderingStyle();
      case AlgorithmsModelPackage.IMAGE_TRANSPARENCY_FEATURE_ID:
        return getTarget().getTransparency();
      case AlgorithmsModelPackage.IMAGE_ID_FEATURE_ID:
        return getTarget().getId();
      case AlgorithmsModelPackage.IMAGE_STRETCHH_FEATURE_ID:
        return getTarget().getStretchH();
      case AlgorithmsModelPackage.IMAGE_STRETCHV_FEATURE_ID:
        return getTarget().getStretchV();
      case AlgorithmsModelPackage.IMAGE_PROPORTIONAL_FEATURE_ID:
        return getTarget().getProportional();
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
      case AlgorithmsModelPackage.IMAGE_ID_FEATURE_ID:
        getTarget().setId((String) value);
        return;
      case AlgorithmsModelPackage.IMAGE_STRETCHH_FEATURE_ID:
        getTarget().setStretchH((Boolean) value);
        return;
      case AlgorithmsModelPackage.IMAGE_STRETCHV_FEATURE_ID:
        getTarget().setStretchV((Boolean) value);
        return;
      case AlgorithmsModelPackage.IMAGE_PROPORTIONAL_FEATURE_ID:
        getTarget().setProportional((Boolean) value);
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
   * The adapter/wrapper for the EClass '<em><b>PlatformGraphicsAlgorithm</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PlatformGraphicsAlgorithmModelObject<E extends PlatformGraphicsAlgorithm> extends
      GraphicsAlgorithmModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getPlatformGraphicsAlgorithmEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        return getTarget().getGraphicsAlgorithmChildren();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_PARENTGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getParentGraphicsAlgorithm();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_PICTOGRAMELEMENT_FEATURE_ID:
        return getTarget().getPictogramElement();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_X_FEATURE_ID:
        return getTarget().getX();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_Y_FEATURE_ID:
        return getTarget().getY();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_STYLE_FEATURE_ID:
        return getTarget().getStyle();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_BACKGROUND_FEATURE_ID:
        return getTarget().getBackground();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_FOREGROUND_FEATURE_ID:
        return getTarget().getForeground();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_LINEWIDTH_FEATURE_ID:
        return getTarget().getLineWidth();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_LINESTYLE_FEATURE_ID:
        return getTarget().getLineStyle();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_FILLED_FEATURE_ID:
        return getTarget().getFilled();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_LINEVISIBLE_FEATURE_ID:
        return getTarget().getLineVisible();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_RENDERINGSTYLE_FEATURE_ID:
        return getTarget().getRenderingStyle();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_TRANSPARENCY_FEATURE_ID:
        return getTarget().getTransparency();
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_ID_FEATURE_ID:
        return getTarget().getId();
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
      case AlgorithmsModelPackage.PLATFORMGRAPHICSALGORITHM_ID_FEATURE_ID:
        getTarget().setId((String) value);
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
   * The adapter/wrapper for the EClass '<em><b>MultiText</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class MultiTextModelObject<E extends MultiText> extends AbstractTextModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return AlgorithmsModelPackage.INSTANCE.getMultiTextEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return AlgorithmsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case AlgorithmsModelPackage.MULTITEXT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case AlgorithmsModelPackage.MULTITEXT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case AlgorithmsModelPackage.MULTITEXT_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case AlgorithmsModelPackage.MULTITEXT_GRAPHICSALGORITHMCHILDREN_FEATURE_ID:
        return getTarget().getGraphicsAlgorithmChildren();
      case AlgorithmsModelPackage.MULTITEXT_PARENTGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getParentGraphicsAlgorithm();
      case AlgorithmsModelPackage.MULTITEXT_PICTOGRAMELEMENT_FEATURE_ID:
        return getTarget().getPictogramElement();
      case AlgorithmsModelPackage.MULTITEXT_WIDTH_FEATURE_ID:
        return getTarget().getWidth();
      case AlgorithmsModelPackage.MULTITEXT_HEIGHT_FEATURE_ID:
        return getTarget().getHeight();
      case AlgorithmsModelPackage.MULTITEXT_X_FEATURE_ID:
        return getTarget().getX();
      case AlgorithmsModelPackage.MULTITEXT_Y_FEATURE_ID:
        return getTarget().getY();
      case AlgorithmsModelPackage.MULTITEXT_STYLE_FEATURE_ID:
        return getTarget().getStyle();
      case AlgorithmsModelPackage.MULTITEXT_BACKGROUND_FEATURE_ID:
        return getTarget().getBackground();
      case AlgorithmsModelPackage.MULTITEXT_FOREGROUND_FEATURE_ID:
        return getTarget().getForeground();
      case AlgorithmsModelPackage.MULTITEXT_LINEWIDTH_FEATURE_ID:
        return getTarget().getLineWidth();
      case AlgorithmsModelPackage.MULTITEXT_LINESTYLE_FEATURE_ID:
        return getTarget().getLineStyle();
      case AlgorithmsModelPackage.MULTITEXT_FILLED_FEATURE_ID:
        return getTarget().getFilled();
      case AlgorithmsModelPackage.MULTITEXT_LINEVISIBLE_FEATURE_ID:
        return getTarget().getLineVisible();
      case AlgorithmsModelPackage.MULTITEXT_RENDERINGSTYLE_FEATURE_ID:
        return getTarget().getRenderingStyle();
      case AlgorithmsModelPackage.MULTITEXT_TRANSPARENCY_FEATURE_ID:
        return getTarget().getTransparency();
      case AlgorithmsModelPackage.MULTITEXT_FONT_FEATURE_ID:
        return getTarget().getFont();
      case AlgorithmsModelPackage.MULTITEXT_HORIZONTALALIGNMENT_FEATURE_ID:
        return getTarget().getHorizontalAlignment();
      case AlgorithmsModelPackage.MULTITEXT_VERTICALALIGNMENT_FEATURE_ID:
        return getTarget().getVerticalAlignment();
      case AlgorithmsModelPackage.MULTITEXT_ANGLE_FEATURE_ID:
        return getTarget().getAngle();
      case AlgorithmsModelPackage.MULTITEXT_VALUE_FEATURE_ID:
        return getTarget().getValue();
      case AlgorithmsModelPackage.MULTITEXT_STYLEREGIONS_FEATURE_ID:
        return getTarget().getStyleRegions();
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
}