package org.eclipse.graphiti.mm.pictograms;

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
import org.eclipse.graphiti.mm.MmModelFactory;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.algorithms.styles.PrecisionPoint;
import org.eclipse.graphiti.mm.algorithms.styles.Style;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: pictograms. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PictogramsModelFactory implements ModelFactory {

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
    case PictogramsModelPackage.SHAPE_CLASSIFIER_ID:
      return createShape();
    case PictogramsModelPackage.CONTAINERSHAPE_CLASSIFIER_ID:
      return createContainerShape();
    case PictogramsModelPackage.DIAGRAM_CLASSIFIER_ID:
      return createDiagram();
    case PictogramsModelPackage.CONNECTION_CLASSIFIER_ID:
      return createConnection();
    case PictogramsModelPackage.PICTOGRAMLINK_CLASSIFIER_ID:
      return createPictogramLink();
    case PictogramsModelPackage.CONNECTIONDECORATOR_CLASSIFIER_ID:
      return createConnectionDecorator();
    case PictogramsModelPackage.FIXPOINTANCHOR_CLASSIFIER_ID:
      return createFixPointAnchor();
    case PictogramsModelPackage.BOXRELATIVEANCHOR_CLASSIFIER_ID:
      return createBoxRelativeAnchor();
    case PictogramsModelPackage.CHOPBOXANCHOR_CLASSIFIER_ID:
      return createChopboxAnchor();
    case PictogramsModelPackage.FREEFORMCONNECTION_CLASSIFIER_ID:
      return createFreeFormConnection();
    case PictogramsModelPackage.MANHATTANCONNECTION_CLASSIFIER_ID:
      return createManhattanConnection();
    case PictogramsModelPackage.CURVEDCONNECTION_CLASSIFIER_ID:
      return createCurvedConnection();
    case PictogramsModelPackage.COMPOSITECONNECTION_CLASSIFIER_ID:
      return createCompositeConnection();
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
    case PictogramsModelPackage.SHAPE_CLASSIFIER_ID:
      modelObject = new ShapeModelObject();
      break;
    case PictogramsModelPackage.PICTOGRAMELEMENT_CLASSIFIER_ID:
      modelObject = new PictogramElementModelObject();
      break;
    case PictogramsModelPackage.ANCHORCONTAINER_CLASSIFIER_ID:
      modelObject = new AnchorContainerModelObject();
      break;
    case PictogramsModelPackage.CONTAINERSHAPE_CLASSIFIER_ID:
      modelObject = new ContainerShapeModelObject();
      break;
    case PictogramsModelPackage.DIAGRAM_CLASSIFIER_ID:
      modelObject = new DiagramModelObject();
      break;
    case PictogramsModelPackage.CONNECTION_CLASSIFIER_ID:
      modelObject = new ConnectionModelObject();
      break;
    case PictogramsModelPackage.PICTOGRAMLINK_CLASSIFIER_ID:
      modelObject = new PictogramLinkModelObject();
      break;
    case PictogramsModelPackage.ANCHOR_CLASSIFIER_ID:
      modelObject = new AnchorModelObject();
      break;
    case PictogramsModelPackage.CONNECTIONDECORATOR_CLASSIFIER_ID:
      modelObject = new ConnectionDecoratorModelObject();
      break;
    case PictogramsModelPackage.FIXPOINTANCHOR_CLASSIFIER_ID:
      modelObject = new FixPointAnchorModelObject();
      break;
    case PictogramsModelPackage.ADVANCEDANCHOR_CLASSIFIER_ID:
      modelObject = new AdvancedAnchorModelObject();
      break;
    case PictogramsModelPackage.BOXRELATIVEANCHOR_CLASSIFIER_ID:
      modelObject = new BoxRelativeAnchorModelObject();
      break;
    case PictogramsModelPackage.CHOPBOXANCHOR_CLASSIFIER_ID:
      modelObject = new ChopboxAnchorModelObject();
      break;
    case PictogramsModelPackage.FREEFORMCONNECTION_CLASSIFIER_ID:
      modelObject = new FreeFormConnectionModelObject();
      break;
    case PictogramsModelPackage.MANHATTANCONNECTION_CLASSIFIER_ID:
      modelObject = new ManhattanConnectionModelObject();
      break;
    case PictogramsModelPackage.CURVEDCONNECTION_CLASSIFIER_ID:
      modelObject = new CurvedConnectionModelObject();
      break;
    case PictogramsModelPackage.COMPOSITECONNECTION_CLASSIFIER_ID:
      modelObject = new CompositeConnectionModelObject();
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
   * @return an instance of the model object representing the EClass Shape
   * @generated
   */
  public Shape createShape() {
    return new Shape();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ContainerShape
   * @generated
   */
  public ContainerShape createContainerShape() {
    return new ContainerShape();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Diagram
   * @generated
   */
  public Diagram createDiagram() {
    return new Diagram();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Connection
   * @generated
   */
  public Connection createConnection() {
    return new Connection();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PictogramLink
   * @generated
   */
  public PictogramLink createPictogramLink() {
    return new PictogramLink();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ConnectionDecorator
   * @generated
   */
  public ConnectionDecorator createConnectionDecorator() {
    return new ConnectionDecorator();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass FixPointAnchor
   * @generated
   */
  public FixPointAnchor createFixPointAnchor() {
    return new FixPointAnchor();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass BoxRelativeAnchor
   * @generated
   */
  public BoxRelativeAnchor createBoxRelativeAnchor() {
    return new BoxRelativeAnchor();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ChopboxAnchor
   * @generated
   */
  public ChopboxAnchor createChopboxAnchor() {
    return new ChopboxAnchor();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass FreeFormConnection
   * @generated
   */
  public FreeFormConnection createFreeFormConnection() {
    return new FreeFormConnection();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass ManhattanConnection
   * @generated
   */
  public ManhattanConnection createManhattanConnection() {
    return new ManhattanConnection();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CurvedConnection
   * @generated
   */
  public CurvedConnection createCurvedConnection() {
    return new CurvedConnection();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass CompositeConnection
   * @generated
   */
  public CompositeConnection createCompositeConnection() {
    return new CompositeConnection();
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
   * The adapter/wrapper for the EClass '<em><b>Shape</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ShapeModelObject<E extends Shape> extends AnchorContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getShapeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.SHAPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.SHAPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.SHAPE_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.SHAPE_VISIBLE_FEATURE_ID:
        return getTarget().isVisible();
      case PictogramsModelPackage.SHAPE_GRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getGraphicsAlgorithm();
      case PictogramsModelPackage.SHAPE_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case PictogramsModelPackage.SHAPE_LINK_FEATURE_ID:
        return getTarget().getLink();
      case PictogramsModelPackage.SHAPE_ANCHORS_FEATURE_ID:
        return getTarget().getAnchors();
      case PictogramsModelPackage.SHAPE_CONTAINER_FEATURE_ID:
        return getTarget().getContainer();
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
      case PictogramsModelPackage.SHAPE_CONTAINER_FEATURE_ID:
        getTarget().setContainer((ContainerShape) value);
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
   * The adapter/wrapper for the EClass '<em><b>PictogramElement</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PictogramElementModelObject<E extends PictogramElement> extends
      MmModelFactory.GraphicsAlgorithmContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getPictogramElementEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.PICTOGRAMELEMENT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.PICTOGRAMELEMENT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.PICTOGRAMELEMENT_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.PICTOGRAMELEMENT_VISIBLE_FEATURE_ID:
        return getTarget().isVisible();
      case PictogramsModelPackage.PICTOGRAMELEMENT_GRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getGraphicsAlgorithm();
      case PictogramsModelPackage.PICTOGRAMELEMENT_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case PictogramsModelPackage.PICTOGRAMELEMENT_LINK_FEATURE_ID:
        return getTarget().getLink();
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
      case PictogramsModelPackage.PICTOGRAMELEMENT_VISIBLE_FEATURE_ID:
        getTarget().setVisible((Boolean) value);
        return;
      case PictogramsModelPackage.PICTOGRAMELEMENT_GRAPHICSALGORITHM_FEATURE_ID:
        getTarget().setGraphicsAlgorithm((GraphicsAlgorithm) value);
        return;
      case PictogramsModelPackage.PICTOGRAMELEMENT_ACTIVE_FEATURE_ID:
        getTarget().setActive((Boolean) value);
        return;
      case PictogramsModelPackage.PICTOGRAMELEMENT_LINK_FEATURE_ID:
        getTarget().setLink((PictogramLink) value);
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
   * The adapter/wrapper for the EClass '<em><b>AnchorContainer</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AnchorContainerModelObject<E extends AnchorContainer> extends PictogramElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getAnchorContainerEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.ANCHORCONTAINER_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.ANCHORCONTAINER_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.ANCHORCONTAINER_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.ANCHORCONTAINER_VISIBLE_FEATURE_ID:
        return getTarget().isVisible();
      case PictogramsModelPackage.ANCHORCONTAINER_GRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getGraphicsAlgorithm();
      case PictogramsModelPackage.ANCHORCONTAINER_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case PictogramsModelPackage.ANCHORCONTAINER_LINK_FEATURE_ID:
        return getTarget().getLink();
      case PictogramsModelPackage.ANCHORCONTAINER_ANCHORS_FEATURE_ID:
        return getTarget().getAnchors();
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
      case PictogramsModelPackage.ANCHORCONTAINER_ANCHORS_FEATURE_ID:
        getTarget().setAnchors((Set<Anchor>) value);
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

      case PictogramsModelPackage.ANCHORCONTAINER_ANCHORS_FEATURE_ID:
        return getTarget().addToAnchors((Anchor) value);
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

      case PictogramsModelPackage.ANCHORCONTAINER_ANCHORS_FEATURE_ID:
        return getTarget().removeFromAnchors((Anchor) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ContainerShape</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ContainerShapeModelObject<E extends ContainerShape> extends ShapeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getContainerShapeEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.CONTAINERSHAPE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.CONTAINERSHAPE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.CONTAINERSHAPE_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.CONTAINERSHAPE_VISIBLE_FEATURE_ID:
        return getTarget().isVisible();
      case PictogramsModelPackage.CONTAINERSHAPE_GRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getGraphicsAlgorithm();
      case PictogramsModelPackage.CONTAINERSHAPE_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case PictogramsModelPackage.CONTAINERSHAPE_LINK_FEATURE_ID:
        return getTarget().getLink();
      case PictogramsModelPackage.CONTAINERSHAPE_ANCHORS_FEATURE_ID:
        return getTarget().getAnchors();
      case PictogramsModelPackage.CONTAINERSHAPE_CONTAINER_FEATURE_ID:
        return getTarget().getContainer();
      case PictogramsModelPackage.CONTAINERSHAPE_CHILDREN_FEATURE_ID:
        return getTarget().getChildren();
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
      case PictogramsModelPackage.CONTAINERSHAPE_CHILDREN_FEATURE_ID:
        getTarget().setChildren((List<Shape>) value);
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

      case PictogramsModelPackage.CONTAINERSHAPE_CHILDREN_FEATURE_ID:
        return getTarget().addToChildren((Shape) value);
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

      case PictogramsModelPackage.CONTAINERSHAPE_CHILDREN_FEATURE_ID:
        return getTarget().removeFromChildren((Shape) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Diagram</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class DiagramModelObject<E extends Diagram> extends ContainerShapeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getDiagramEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.DIAGRAM_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.DIAGRAM_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.DIAGRAM_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.DIAGRAM_VISIBLE_FEATURE_ID:
        return getTarget().isVisible();
      case PictogramsModelPackage.DIAGRAM_GRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getGraphicsAlgorithm();
      case PictogramsModelPackage.DIAGRAM_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case PictogramsModelPackage.DIAGRAM_LINK_FEATURE_ID:
        return getTarget().getLink();
      case PictogramsModelPackage.DIAGRAM_ANCHORS_FEATURE_ID:
        return getTarget().getAnchors();
      case PictogramsModelPackage.DIAGRAM_CONTAINER_FEATURE_ID:
        return getTarget().getContainer();
      case PictogramsModelPackage.DIAGRAM_CHILDREN_FEATURE_ID:
        return getTarget().getChildren();
      case PictogramsModelPackage.DIAGRAM_GRIDUNIT_FEATURE_ID:
        return getTarget().getGridUnit();
      case PictogramsModelPackage.DIAGRAM_DIAGRAMTYPEID_FEATURE_ID:
        return getTarget().getDiagramTypeId();
      case PictogramsModelPackage.DIAGRAM_CONNECTIONS_FEATURE_ID:
        return getTarget().getConnections();
      case PictogramsModelPackage.DIAGRAM_NAME_FEATURE_ID:
        return getTarget().getName();
      case PictogramsModelPackage.DIAGRAM_SNAPTOGRID_FEATURE_ID:
        return getTarget().isSnapToGrid();
      case PictogramsModelPackage.DIAGRAM_SHOWGUIDES_FEATURE_ID:
        return getTarget().isShowGuides();
      case PictogramsModelPackage.DIAGRAM_COLORS_FEATURE_ID:
        return getTarget().getColors();
      case PictogramsModelPackage.DIAGRAM_FONTS_FEATURE_ID:
        return getTarget().getFonts();
      case PictogramsModelPackage.DIAGRAM_PICTOGRAMLINKS_FEATURE_ID:
        return getTarget().getPictogramLinks();
      case PictogramsModelPackage.DIAGRAM_VERTICALGRIDUNIT_FEATURE_ID:
        return getTarget().getVerticalGridUnit();
      case PictogramsModelPackage.DIAGRAM_VERSION_FEATURE_ID:
        return getTarget().getVersion();
      case PictogramsModelPackage.DIAGRAM_STYLES_FEATURE_ID:
        return getTarget().getStyles();
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
      case PictogramsModelPackage.DIAGRAM_GRIDUNIT_FEATURE_ID:
        getTarget().setGridUnit((Integer) value);
        return;
      case PictogramsModelPackage.DIAGRAM_DIAGRAMTYPEID_FEATURE_ID:
        getTarget().setDiagramTypeId((String) value);
        return;
      case PictogramsModelPackage.DIAGRAM_CONNECTIONS_FEATURE_ID:
        getTarget().setConnections((Set<Connection>) value);
        return;
      case PictogramsModelPackage.DIAGRAM_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case PictogramsModelPackage.DIAGRAM_SNAPTOGRID_FEATURE_ID:
        getTarget().setSnapToGrid((Boolean) value);
        return;
      case PictogramsModelPackage.DIAGRAM_SHOWGUIDES_FEATURE_ID:
        getTarget().setShowGuides((Boolean) value);
        return;
      case PictogramsModelPackage.DIAGRAM_COLORS_FEATURE_ID:
        getTarget().setColors((Set<Color>) value);
        return;
      case PictogramsModelPackage.DIAGRAM_FONTS_FEATURE_ID:
        getTarget().setFonts((Set<Font>) value);
        return;
      case PictogramsModelPackage.DIAGRAM_PICTOGRAMLINKS_FEATURE_ID:
        getTarget().setPictogramLinks((Set<PictogramLink>) value);
        return;
      case PictogramsModelPackage.DIAGRAM_VERTICALGRIDUNIT_FEATURE_ID:
        getTarget().setVerticalGridUnit((Integer) value);
        return;
      case PictogramsModelPackage.DIAGRAM_VERSION_FEATURE_ID:
        getTarget().setVersion((String) value);
        return;
      case PictogramsModelPackage.DIAGRAM_STYLES_FEATURE_ID:
        getTarget().setStyles((Set<Style>) value);
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

      case PictogramsModelPackage.DIAGRAM_CONNECTIONS_FEATURE_ID:
        return getTarget().addToConnections((Connection) value);

      case PictogramsModelPackage.DIAGRAM_COLORS_FEATURE_ID:
        return getTarget().addToColors((Color) value);

      case PictogramsModelPackage.DIAGRAM_FONTS_FEATURE_ID:
        return getTarget().addToFonts((Font) value);

      case PictogramsModelPackage.DIAGRAM_PICTOGRAMLINKS_FEATURE_ID:
        return getTarget().addToPictogramLinks((PictogramLink) value);

      case PictogramsModelPackage.DIAGRAM_STYLES_FEATURE_ID:
        return getTarget().addToStyles((Style) value);
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

      case PictogramsModelPackage.DIAGRAM_CONNECTIONS_FEATURE_ID:
        return getTarget().removeFromConnections((Connection) value);

      case PictogramsModelPackage.DIAGRAM_COLORS_FEATURE_ID:
        return getTarget().removeFromColors((Color) value);

      case PictogramsModelPackage.DIAGRAM_FONTS_FEATURE_ID:
        return getTarget().removeFromFonts((Font) value);

      case PictogramsModelPackage.DIAGRAM_PICTOGRAMLINKS_FEATURE_ID:
        return getTarget().removeFromPictogramLinks((PictogramLink) value);

      case PictogramsModelPackage.DIAGRAM_STYLES_FEATURE_ID:
        return getTarget().removeFromStyles((Style) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Connection</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConnectionModelObject<E extends Connection> extends AnchorContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getConnectionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.CONNECTION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.CONNECTION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.CONNECTION_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.CONNECTION_VISIBLE_FEATURE_ID:
        return getTarget().isVisible();
      case PictogramsModelPackage.CONNECTION_GRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getGraphicsAlgorithm();
      case PictogramsModelPackage.CONNECTION_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case PictogramsModelPackage.CONNECTION_LINK_FEATURE_ID:
        return getTarget().getLink();
      case PictogramsModelPackage.CONNECTION_ANCHORS_FEATURE_ID:
        return getTarget().getAnchors();
      case PictogramsModelPackage.CONNECTION_START_FEATURE_ID:
        return getTarget().getStart();
      case PictogramsModelPackage.CONNECTION_END_FEATURE_ID:
        return getTarget().getEnd();
      case PictogramsModelPackage.CONNECTION_PARENT_FEATURE_ID:
        return getTarget().getParent();
      case PictogramsModelPackage.CONNECTION_CONNECTIONDECORATORS_FEATURE_ID:
        return getTarget().getConnectionDecorators();
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
      case PictogramsModelPackage.CONNECTION_START_FEATURE_ID:
        getTarget().setStart((Anchor) value);
        return;
      case PictogramsModelPackage.CONNECTION_END_FEATURE_ID:
        getTarget().setEnd((Anchor) value);
        return;
      case PictogramsModelPackage.CONNECTION_PARENT_FEATURE_ID:
        getTarget().setParent((Diagram) value);
        return;
      case PictogramsModelPackage.CONNECTION_CONNECTIONDECORATORS_FEATURE_ID:
        getTarget().setConnectionDecorators((List<ConnectionDecorator>) value);
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

      case PictogramsModelPackage.CONNECTION_CONNECTIONDECORATORS_FEATURE_ID:
        return getTarget().addToConnectionDecorators((ConnectionDecorator) value);
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

      case PictogramsModelPackage.CONNECTION_CONNECTIONDECORATORS_FEATURE_ID:
        return getTarget().removeFromConnectionDecorators((ConnectionDecorator) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>PictogramLink</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PictogramLinkModelObject<E extends PictogramLink> extends
      MmModelFactory.PropertyContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getPictogramLinkEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.PICTOGRAMLINK_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.PICTOGRAMLINK_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.PICTOGRAMLINK_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.PICTOGRAMLINK_PICTOGRAMELEMENT_FEATURE_ID:
        return getTarget().getPictogramElement();
      case PictogramsModelPackage.PICTOGRAMLINK_BUSINESSOBJECTS_FEATURE_ID:
        return getTarget().getBusinessObjects();
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
      case PictogramsModelPackage.PICTOGRAMLINK_PICTOGRAMELEMENT_FEATURE_ID:
        getTarget().setPictogramElement((PictogramElement) value);
        return;
      case PictogramsModelPackage.PICTOGRAMLINK_BUSINESSOBJECTS_FEATURE_ID:
        getTarget().setBusinessObjects((List<Object>) value);
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

      case PictogramsModelPackage.PICTOGRAMLINK_BUSINESSOBJECTS_FEATURE_ID:
        return getTarget().addToBusinessObjects(value);
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

      case PictogramsModelPackage.PICTOGRAMLINK_BUSINESSOBJECTS_FEATURE_ID:
        return getTarget().removeFromBusinessObjects((Object) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Anchor</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AnchorModelObject<E extends Anchor> extends PictogramElementModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getAnchorEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.ANCHOR_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.ANCHOR_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.ANCHOR_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.ANCHOR_VISIBLE_FEATURE_ID:
        return getTarget().isVisible();
      case PictogramsModelPackage.ANCHOR_GRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getGraphicsAlgorithm();
      case PictogramsModelPackage.ANCHOR_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case PictogramsModelPackage.ANCHOR_LINK_FEATURE_ID:
        return getTarget().getLink();
      case PictogramsModelPackage.ANCHOR_PARENT_FEATURE_ID:
        return getTarget().getParent();
      case PictogramsModelPackage.ANCHOR_OUTGOINGCONNECTIONS_FEATURE_ID:
        return getTarget().getOutgoingConnections();
      case PictogramsModelPackage.ANCHOR_INCOMINGCONNECTIONS_FEATURE_ID:
        return getTarget().getIncomingConnections();
      case PictogramsModelPackage.ANCHOR_REFERENCEDGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getReferencedGraphicsAlgorithm();
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
      case PictogramsModelPackage.ANCHOR_PARENT_FEATURE_ID:
        getTarget().setParent((AnchorContainer) value);
        return;
      case PictogramsModelPackage.ANCHOR_OUTGOINGCONNECTIONS_FEATURE_ID:
        getTarget().setOutgoingConnections((Set<Connection>) value);
        return;
      case PictogramsModelPackage.ANCHOR_INCOMINGCONNECTIONS_FEATURE_ID:
        getTarget().setIncomingConnections((Set<Connection>) value);
        return;
      case PictogramsModelPackage.ANCHOR_REFERENCEDGRAPHICSALGORITHM_FEATURE_ID:
        getTarget().setReferencedGraphicsAlgorithm((GraphicsAlgorithm) value);
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

      case PictogramsModelPackage.ANCHOR_OUTGOINGCONNECTIONS_FEATURE_ID:
        return getTarget().addToOutgoingConnections((Connection) value);

      case PictogramsModelPackage.ANCHOR_INCOMINGCONNECTIONS_FEATURE_ID:
        return getTarget().addToIncomingConnections((Connection) value);

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

      case PictogramsModelPackage.ANCHOR_OUTGOINGCONNECTIONS_FEATURE_ID:
        return getTarget().removeFromOutgoingConnections((Connection) value);

      case PictogramsModelPackage.ANCHOR_INCOMINGCONNECTIONS_FEATURE_ID:
        return getTarget().removeFromIncomingConnections((Connection) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ConnectionDecorator</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ConnectionDecoratorModelObject<E extends ConnectionDecorator> extends ShapeModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getConnectionDecoratorEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.CONNECTIONDECORATOR_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.CONNECTIONDECORATOR_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.CONNECTIONDECORATOR_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.CONNECTIONDECORATOR_VISIBLE_FEATURE_ID:
        return getTarget().isVisible();
      case PictogramsModelPackage.CONNECTIONDECORATOR_GRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getGraphicsAlgorithm();
      case PictogramsModelPackage.CONNECTIONDECORATOR_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case PictogramsModelPackage.CONNECTIONDECORATOR_LINK_FEATURE_ID:
        return getTarget().getLink();
      case PictogramsModelPackage.CONNECTIONDECORATOR_ANCHORS_FEATURE_ID:
        return getTarget().getAnchors();
      case PictogramsModelPackage.CONNECTIONDECORATOR_CONTAINER_FEATURE_ID:
        return getTarget().getContainer();
      case PictogramsModelPackage.CONNECTIONDECORATOR_LOCATIONRELATIVE_FEATURE_ID:
        return getTarget().isLocationRelative();
      case PictogramsModelPackage.CONNECTIONDECORATOR_LOCATION_FEATURE_ID:
        return getTarget().getLocation();
      case PictogramsModelPackage.CONNECTIONDECORATOR_CONNECTION_FEATURE_ID:
        return getTarget().getConnection();
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
      case PictogramsModelPackage.CONNECTIONDECORATOR_LOCATIONRELATIVE_FEATURE_ID:
        getTarget().setLocationRelative((Boolean) value);
        return;
      case PictogramsModelPackage.CONNECTIONDECORATOR_LOCATION_FEATURE_ID:
        getTarget().setLocation((Double) value);
        return;
      case PictogramsModelPackage.CONNECTIONDECORATOR_CONNECTION_FEATURE_ID:
        getTarget().setConnection((Connection) value);
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
   * The adapter/wrapper for the EClass '<em><b>FixPointAnchor</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class FixPointAnchorModelObject<E extends FixPointAnchor> extends AdvancedAnchorModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getFixPointAnchorEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.FIXPOINTANCHOR_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.FIXPOINTANCHOR_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.FIXPOINTANCHOR_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.FIXPOINTANCHOR_VISIBLE_FEATURE_ID:
        return getTarget().isVisible();
      case PictogramsModelPackage.FIXPOINTANCHOR_GRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getGraphicsAlgorithm();
      case PictogramsModelPackage.FIXPOINTANCHOR_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case PictogramsModelPackage.FIXPOINTANCHOR_LINK_FEATURE_ID:
        return getTarget().getLink();
      case PictogramsModelPackage.FIXPOINTANCHOR_PARENT_FEATURE_ID:
        return getTarget().getParent();
      case PictogramsModelPackage.FIXPOINTANCHOR_OUTGOINGCONNECTIONS_FEATURE_ID:
        return getTarget().getOutgoingConnections();
      case PictogramsModelPackage.FIXPOINTANCHOR_INCOMINGCONNECTIONS_FEATURE_ID:
        return getTarget().getIncomingConnections();
      case PictogramsModelPackage.FIXPOINTANCHOR_REFERENCEDGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getReferencedGraphicsAlgorithm();
      case PictogramsModelPackage.FIXPOINTANCHOR_USEANCHORLOCATIONASCONNECTIONENDPOINT_FEATURE_ID:
        return getTarget().isUseAnchorLocationAsConnectionEndpoint();
      case PictogramsModelPackage.FIXPOINTANCHOR_LOCATION_FEATURE_ID:
        return getTarget().getLocation();
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
      case PictogramsModelPackage.FIXPOINTANCHOR_LOCATION_FEATURE_ID:
        getTarget().setLocation((Point) value);
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
   * The adapter/wrapper for the EClass '<em><b>AdvancedAnchor</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AdvancedAnchorModelObject<E extends AdvancedAnchor> extends AnchorModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getAdvancedAnchorEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.ADVANCEDANCHOR_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.ADVANCEDANCHOR_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.ADVANCEDANCHOR_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.ADVANCEDANCHOR_VISIBLE_FEATURE_ID:
        return getTarget().isVisible();
      case PictogramsModelPackage.ADVANCEDANCHOR_GRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getGraphicsAlgorithm();
      case PictogramsModelPackage.ADVANCEDANCHOR_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case PictogramsModelPackage.ADVANCEDANCHOR_LINK_FEATURE_ID:
        return getTarget().getLink();
      case PictogramsModelPackage.ADVANCEDANCHOR_PARENT_FEATURE_ID:
        return getTarget().getParent();
      case PictogramsModelPackage.ADVANCEDANCHOR_OUTGOINGCONNECTIONS_FEATURE_ID:
        return getTarget().getOutgoingConnections();
      case PictogramsModelPackage.ADVANCEDANCHOR_INCOMINGCONNECTIONS_FEATURE_ID:
        return getTarget().getIncomingConnections();
      case PictogramsModelPackage.ADVANCEDANCHOR_REFERENCEDGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getReferencedGraphicsAlgorithm();
      case PictogramsModelPackage.ADVANCEDANCHOR_USEANCHORLOCATIONASCONNECTIONENDPOINT_FEATURE_ID:
        return getTarget().isUseAnchorLocationAsConnectionEndpoint();
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
      case PictogramsModelPackage.ADVANCEDANCHOR_USEANCHORLOCATIONASCONNECTIONENDPOINT_FEATURE_ID:
        getTarget().setUseAnchorLocationAsConnectionEndpoint((Boolean) value);
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
   * The adapter/wrapper for the EClass '<em><b>BoxRelativeAnchor</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class BoxRelativeAnchorModelObject<E extends BoxRelativeAnchor> extends AdvancedAnchorModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getBoxRelativeAnchorEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.BOXRELATIVEANCHOR_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.BOXRELATIVEANCHOR_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.BOXRELATIVEANCHOR_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.BOXRELATIVEANCHOR_VISIBLE_FEATURE_ID:
        return getTarget().isVisible();
      case PictogramsModelPackage.BOXRELATIVEANCHOR_GRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getGraphicsAlgorithm();
      case PictogramsModelPackage.BOXRELATIVEANCHOR_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case PictogramsModelPackage.BOXRELATIVEANCHOR_LINK_FEATURE_ID:
        return getTarget().getLink();
      case PictogramsModelPackage.BOXRELATIVEANCHOR_PARENT_FEATURE_ID:
        return getTarget().getParent();
      case PictogramsModelPackage.BOXRELATIVEANCHOR_OUTGOINGCONNECTIONS_FEATURE_ID:
        return getTarget().getOutgoingConnections();
      case PictogramsModelPackage.BOXRELATIVEANCHOR_INCOMINGCONNECTIONS_FEATURE_ID:
        return getTarget().getIncomingConnections();
      case PictogramsModelPackage.BOXRELATIVEANCHOR_REFERENCEDGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getReferencedGraphicsAlgorithm();
      case PictogramsModelPackage.BOXRELATIVEANCHOR_USEANCHORLOCATIONASCONNECTIONENDPOINT_FEATURE_ID:
        return getTarget().isUseAnchorLocationAsConnectionEndpoint();
      case PictogramsModelPackage.BOXRELATIVEANCHOR_RELATIVEWIDTH_FEATURE_ID:
        return getTarget().getRelativeWidth();
      case PictogramsModelPackage.BOXRELATIVEANCHOR_RELATIVEHEIGHT_FEATURE_ID:
        return getTarget().getRelativeHeight();
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
      case PictogramsModelPackage.BOXRELATIVEANCHOR_RELATIVEWIDTH_FEATURE_ID:
        getTarget().setRelativeWidth((Double) value);
        return;
      case PictogramsModelPackage.BOXRELATIVEANCHOR_RELATIVEHEIGHT_FEATURE_ID:
        getTarget().setRelativeHeight((Double) value);
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
   * The adapter/wrapper for the EClass '<em><b>ChopboxAnchor</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ChopboxAnchorModelObject<E extends ChopboxAnchor> extends AnchorModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getChopboxAnchorEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.CHOPBOXANCHOR_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.CHOPBOXANCHOR_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.CHOPBOXANCHOR_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.CHOPBOXANCHOR_VISIBLE_FEATURE_ID:
        return getTarget().isVisible();
      case PictogramsModelPackage.CHOPBOXANCHOR_GRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getGraphicsAlgorithm();
      case PictogramsModelPackage.CHOPBOXANCHOR_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case PictogramsModelPackage.CHOPBOXANCHOR_LINK_FEATURE_ID:
        return getTarget().getLink();
      case PictogramsModelPackage.CHOPBOXANCHOR_PARENT_FEATURE_ID:
        return getTarget().getParent();
      case PictogramsModelPackage.CHOPBOXANCHOR_OUTGOINGCONNECTIONS_FEATURE_ID:
        return getTarget().getOutgoingConnections();
      case PictogramsModelPackage.CHOPBOXANCHOR_INCOMINGCONNECTIONS_FEATURE_ID:
        return getTarget().getIncomingConnections();
      case PictogramsModelPackage.CHOPBOXANCHOR_REFERENCEDGRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getReferencedGraphicsAlgorithm();
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
   * The adapter/wrapper for the EClass '<em><b>FreeFormConnection</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class FreeFormConnectionModelObject<E extends FreeFormConnection> extends ConnectionModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getFreeFormConnectionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.FREEFORMCONNECTION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.FREEFORMCONNECTION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.FREEFORMCONNECTION_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.FREEFORMCONNECTION_VISIBLE_FEATURE_ID:
        return getTarget().isVisible();
      case PictogramsModelPackage.FREEFORMCONNECTION_GRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getGraphicsAlgorithm();
      case PictogramsModelPackage.FREEFORMCONNECTION_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case PictogramsModelPackage.FREEFORMCONNECTION_LINK_FEATURE_ID:
        return getTarget().getLink();
      case PictogramsModelPackage.FREEFORMCONNECTION_ANCHORS_FEATURE_ID:
        return getTarget().getAnchors();
      case PictogramsModelPackage.FREEFORMCONNECTION_START_FEATURE_ID:
        return getTarget().getStart();
      case PictogramsModelPackage.FREEFORMCONNECTION_END_FEATURE_ID:
        return getTarget().getEnd();
      case PictogramsModelPackage.FREEFORMCONNECTION_PARENT_FEATURE_ID:
        return getTarget().getParent();
      case PictogramsModelPackage.FREEFORMCONNECTION_CONNECTIONDECORATORS_FEATURE_ID:
        return getTarget().getConnectionDecorators();
      case PictogramsModelPackage.FREEFORMCONNECTION_BENDPOINTS_FEATURE_ID:
        return getTarget().getBendpoints();
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
      case PictogramsModelPackage.FREEFORMCONNECTION_BENDPOINTS_FEATURE_ID:
        getTarget().setBendpoints((List<Point>) value);
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

      case PictogramsModelPackage.FREEFORMCONNECTION_BENDPOINTS_FEATURE_ID:
        return getTarget().addToBendpoints((Point) value);
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

      case PictogramsModelPackage.FREEFORMCONNECTION_BENDPOINTS_FEATURE_ID:
        return getTarget().removeFromBendpoints((Point) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>ManhattanConnection</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ManhattanConnectionModelObject<E extends ManhattanConnection> extends ConnectionModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getManhattanConnectionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.MANHATTANCONNECTION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.MANHATTANCONNECTION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.MANHATTANCONNECTION_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.MANHATTANCONNECTION_VISIBLE_FEATURE_ID:
        return getTarget().isVisible();
      case PictogramsModelPackage.MANHATTANCONNECTION_GRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getGraphicsAlgorithm();
      case PictogramsModelPackage.MANHATTANCONNECTION_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case PictogramsModelPackage.MANHATTANCONNECTION_LINK_FEATURE_ID:
        return getTarget().getLink();
      case PictogramsModelPackage.MANHATTANCONNECTION_ANCHORS_FEATURE_ID:
        return getTarget().getAnchors();
      case PictogramsModelPackage.MANHATTANCONNECTION_START_FEATURE_ID:
        return getTarget().getStart();
      case PictogramsModelPackage.MANHATTANCONNECTION_END_FEATURE_ID:
        return getTarget().getEnd();
      case PictogramsModelPackage.MANHATTANCONNECTION_PARENT_FEATURE_ID:
        return getTarget().getParent();
      case PictogramsModelPackage.MANHATTANCONNECTION_CONNECTIONDECORATORS_FEATURE_ID:
        return getTarget().getConnectionDecorators();
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
   * The adapter/wrapper for the EClass '<em><b>CurvedConnection</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CurvedConnectionModelObject<E extends CurvedConnection> extends ConnectionModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getCurvedConnectionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.CURVEDCONNECTION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.CURVEDCONNECTION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.CURVEDCONNECTION_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.CURVEDCONNECTION_VISIBLE_FEATURE_ID:
        return getTarget().isVisible();
      case PictogramsModelPackage.CURVEDCONNECTION_GRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getGraphicsAlgorithm();
      case PictogramsModelPackage.CURVEDCONNECTION_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case PictogramsModelPackage.CURVEDCONNECTION_LINK_FEATURE_ID:
        return getTarget().getLink();
      case PictogramsModelPackage.CURVEDCONNECTION_ANCHORS_FEATURE_ID:
        return getTarget().getAnchors();
      case PictogramsModelPackage.CURVEDCONNECTION_START_FEATURE_ID:
        return getTarget().getStart();
      case PictogramsModelPackage.CURVEDCONNECTION_END_FEATURE_ID:
        return getTarget().getEnd();
      case PictogramsModelPackage.CURVEDCONNECTION_PARENT_FEATURE_ID:
        return getTarget().getParent();
      case PictogramsModelPackage.CURVEDCONNECTION_CONNECTIONDECORATORS_FEATURE_ID:
        return getTarget().getConnectionDecorators();
      case PictogramsModelPackage.CURVEDCONNECTION_CONTROLPOINTS_FEATURE_ID:
        return getTarget().getControlPoints();
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
      case PictogramsModelPackage.CURVEDCONNECTION_CONTROLPOINTS_FEATURE_ID:
        getTarget().setControlPoints((List<PrecisionPoint>) value);
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

      case PictogramsModelPackage.CURVEDCONNECTION_CONTROLPOINTS_FEATURE_ID:
        return getTarget().addToControlPoints((PrecisionPoint) value);
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

      case PictogramsModelPackage.CURVEDCONNECTION_CONTROLPOINTS_FEATURE_ID:
        return getTarget().removeFromControlPoints((PrecisionPoint) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>CompositeConnection</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class CompositeConnectionModelObject<E extends CompositeConnection> extends ConnectionModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return PictogramsModelPackage.INSTANCE.getCompositeConnectionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return PictogramsModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case PictogramsModelPackage.COMPOSITECONNECTION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case PictogramsModelPackage.COMPOSITECONNECTION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case PictogramsModelPackage.COMPOSITECONNECTION_PROPERTIES_FEATURE_ID:
        return getTarget().getProperties();
      case PictogramsModelPackage.COMPOSITECONNECTION_VISIBLE_FEATURE_ID:
        return getTarget().isVisible();
      case PictogramsModelPackage.COMPOSITECONNECTION_GRAPHICSALGORITHM_FEATURE_ID:
        return getTarget().getGraphicsAlgorithm();
      case PictogramsModelPackage.COMPOSITECONNECTION_ACTIVE_FEATURE_ID:
        return getTarget().isActive();
      case PictogramsModelPackage.COMPOSITECONNECTION_LINK_FEATURE_ID:
        return getTarget().getLink();
      case PictogramsModelPackage.COMPOSITECONNECTION_ANCHORS_FEATURE_ID:
        return getTarget().getAnchors();
      case PictogramsModelPackage.COMPOSITECONNECTION_START_FEATURE_ID:
        return getTarget().getStart();
      case PictogramsModelPackage.COMPOSITECONNECTION_END_FEATURE_ID:
        return getTarget().getEnd();
      case PictogramsModelPackage.COMPOSITECONNECTION_PARENT_FEATURE_ID:
        return getTarget().getParent();
      case PictogramsModelPackage.COMPOSITECONNECTION_CONNECTIONDECORATORS_FEATURE_ID:
        return getTarget().getConnectionDecorators();
      case PictogramsModelPackage.COMPOSITECONNECTION_CHILDREN_FEATURE_ID:
        return getTarget().getChildren();
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
      case PictogramsModelPackage.COMPOSITECONNECTION_CHILDREN_FEATURE_ID:
        getTarget().setChildren((List<CurvedConnection>) value);
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

      case PictogramsModelPackage.COMPOSITECONNECTION_CHILDREN_FEATURE_ID:
        return getTarget().addToChildren((CurvedConnection) value);
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

      case PictogramsModelPackage.COMPOSITECONNECTION_CHILDREN_FEATURE_ID:
        return getTarget().removeFromChildren((CurvedConnection) value);
      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }
}