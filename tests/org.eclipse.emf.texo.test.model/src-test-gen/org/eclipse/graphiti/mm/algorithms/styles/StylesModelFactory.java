package org.eclipse.graphiti.mm.algorithms.styles;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;
import org.eclipse.graphiti.mm.MmModelFactory;
import org.eclipse.graphiti.mm.StyleContainer;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: styles. It contains code to create instances
 * {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class StylesModelFactory implements ModelFactory {

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
    case StylesModelPackage.STYLE_CLASSIFIER_ID:
      return createStyle();
    case StylesModelPackage.COLOR_CLASSIFIER_ID:
      return createColor();
    case StylesModelPackage.FONT_CLASSIFIER_ID:
      return createFont();
    case StylesModelPackage.POINT_CLASSIFIER_ID:
      return createPoint();
    case StylesModelPackage.PRECISIONPOINT_CLASSIFIER_ID:
      return createPrecisionPoint();
    case StylesModelPackage.TEXTSTYLEREGION_CLASSIFIER_ID:
      return createTextStyleRegion();
    case StylesModelPackage.RENDERINGSTYLE_CLASSIFIER_ID:
      return createRenderingStyle();
    case StylesModelPackage.ADAPTEDGRADIENTCOLOREDAREAS_CLASSIFIER_ID:
      return createAdaptedGradientColoredAreas();
    case StylesModelPackage.GRADIENTCOLOREDLOCATION_CLASSIFIER_ID:
      return createGradientColoredLocation();
    case StylesModelPackage.GRADIENTCOLOREDAREA_CLASSIFIER_ID:
      return createGradientColoredArea();
    case StylesModelPackage.GRADIENTCOLOREDAREAS_CLASSIFIER_ID:
      return createGradientColoredAreas();
    case StylesModelPackage.TEXTSTYLE_CLASSIFIER_ID:
      return createTextStyle();
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
    case StylesModelPackage.STYLE_CLASSIFIER_ID:
      modelObject = new StyleModelObject();
      break;
    case StylesModelPackage.ABSTRACTSTYLE_CLASSIFIER_ID:
      modelObject = new AbstractStyleModelObject();
      break;
    case StylesModelPackage.COLOR_CLASSIFIER_ID:
      modelObject = new ColorModelObject();
      break;
    case StylesModelPackage.FONT_CLASSIFIER_ID:
      modelObject = new FontModelObject();
      break;
    case StylesModelPackage.POINT_CLASSIFIER_ID:
      modelObject = new PointModelObject();
      break;
    case StylesModelPackage.PRECISIONPOINT_CLASSIFIER_ID:
      modelObject = new PrecisionPointModelObject();
      break;
    case StylesModelPackage.TEXTSTYLEREGION_CLASSIFIER_ID:
      modelObject = new TextStyleRegionModelObject();
      break;
    case StylesModelPackage.RENDERINGSTYLE_CLASSIFIER_ID:
      modelObject = new RenderingStyleModelObject();
      break;
    case StylesModelPackage.ADAPTEDGRADIENTCOLOREDAREAS_CLASSIFIER_ID:
      modelObject = new AdaptedGradientColoredAreasModelObject();
      break;
    case StylesModelPackage.GRADIENTCOLOREDLOCATION_CLASSIFIER_ID:
      modelObject = new GradientColoredLocationModelObject();
      break;
    case StylesModelPackage.GRADIENTCOLOREDAREA_CLASSIFIER_ID:
      modelObject = new GradientColoredAreaModelObject();
      break;
    case StylesModelPackage.GRADIENTCOLOREDAREAS_CLASSIFIER_ID:
      modelObject = new GradientColoredAreasModelObject();
      break;
    case StylesModelPackage.TEXTSTYLE_CLASSIFIER_ID:
      modelObject = new TextStyleModelObject();
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
   * @return an instance of the model object representing the EClass Style
   * @generated
   */
  public Style createStyle() {
    return new Style();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Color
   * @generated
   */
  public Color createColor() {
    return new Color();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Font
   * @generated
   */
  public Font createFont() {
    return new Font();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass Point
   * @generated
   */
  public Point createPoint() {
    return new Point();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass PrecisionPoint
   * @generated
   */
  public PrecisionPoint createPrecisionPoint() {
    return new PrecisionPoint();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TextStyleRegion
   * @generated
   */
  public TextStyleRegion createTextStyleRegion() {
    return new TextStyleRegion();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass RenderingStyle
   * @generated
   */
  public RenderingStyle createRenderingStyle() {
    return new RenderingStyle();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass AdaptedGradientColoredAreas
   * @generated
   */
  public AdaptedGradientColoredAreas createAdaptedGradientColoredAreas() {
    return new AdaptedGradientColoredAreas();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass GradientColoredLocation
   * @generated
   */
  public GradientColoredLocation createGradientColoredLocation() {
    return new GradientColoredLocation();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass GradientColoredArea
   * @generated
   */
  public GradientColoredArea createGradientColoredArea() {
    return new GradientColoredArea();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass GradientColoredAreas
   * @generated
   */
  public GradientColoredAreas createGradientColoredAreas() {
    return new GradientColoredAreas();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the model object representing the EClass TextStyle
   * @generated
   */
  public TextStyle createTextStyle() {
    return new TextStyle();
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
    case StylesModelPackage.ORIENTATION_CLASSIFIER_ID:
      return createOrientationFromString(value);
    case StylesModelPackage.LINESTYLE_CLASSIFIER_ID:
      return createLineStyleFromString(value);
    case StylesModelPackage.LOCATIONTYPE_CLASSIFIER_ID:
      return createLocationTypeFromString(value);
    case StylesModelPackage.UNDERLINESTYLE_CLASSIFIER_ID:
      return createUnderlineStyleFromString(value);
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
    case StylesModelPackage.ORIENTATION_CLASSIFIER_ID:
      return convertOrientationToString((Orientation) value);
    case StylesModelPackage.LINESTYLE_CLASSIFIER_ID:
      return convertLineStyleToString((LineStyle) value);
    case StylesModelPackage.LOCATIONTYPE_CLASSIFIER_ID:
      return convertLocationTypeToString((LocationType) value);
    case StylesModelPackage.UNDERLINESTYLE_CLASSIFIER_ID:
      return convertUnderlineStyleToString((UnderlineStyle) value);
    default:
      throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
    }
  }

  /**
   * Converts the EDataType: Orientation to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertOrientationToString(Orientation value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: Orientation from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public Orientation createOrientationFromString(String value) {
    if (value == null) {
      return null;
    }
    return Orientation.get(value);
  }

  /**
   * Converts the EDataType: LineStyle to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertLineStyleToString(LineStyle value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: LineStyle from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public LineStyle createLineStyleFromString(String value) {
    if (value == null) {
      return null;
    }
    return LineStyle.get(value);
  }

  /**
   * Converts the EDataType: LocationType to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertLocationTypeToString(LocationType value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: LocationType from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public LocationType createLocationTypeFromString(String value) {
    if (value == null) {
      return null;
    }
    return LocationType.get(value);
  }

  /**
   * Converts the EDataType: UnderlineStyle to a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the object to convert
   * @return the String representing the value, if value == null then null is returned
   * @generated
   */
  public String convertUnderlineStyleToString(UnderlineStyle value) {
    if (value == null) {
      return null;
    }
    return value.toString();
  }

  /**
   * Creates an instance of the EDataType: UnderlineStyle from a String. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the string value to convert to an object
   * @return the instance of the data type, if value == null then null is returned
   * @generated
   */
  public UnderlineStyle createUnderlineStyleFromString(String value) {
    if (value == null) {
      return null;
    }
    return UnderlineStyle.get(value);
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>Style</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class StyleModelObject<E extends Style> extends MmModelFactory.StyleContainerModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StylesModelPackage.INSTANCE.getStyleEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StylesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.STYLE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StylesModelPackage.STYLE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StylesModelPackage.STYLE_STYLES_FEATURE_ID:
        return getTarget().getStyles();
      case StylesModelPackage.STYLE_ID_FEATURE_ID:
        return getTarget().getId();
      case StylesModelPackage.STYLE_DESCRIPTION_FEATURE_ID:
        return getTarget().getDescription();
      case StylesModelPackage.STYLE_FONT_FEATURE_ID:
        return getTarget().getFont();
      case StylesModelPackage.STYLE_HORIZONTALALIGNMENT_FEATURE_ID:
        return getTarget().getHorizontalAlignment();
      case StylesModelPackage.STYLE_VERTICALALIGNMENT_FEATURE_ID:
        return getTarget().getVerticalAlignment();
      case StylesModelPackage.STYLE_ANGLE_FEATURE_ID:
        return getTarget().getAngle();
      case StylesModelPackage.STYLE_STRETCHH_FEATURE_ID:
        return getTarget().getStretchH();
      case StylesModelPackage.STYLE_STRETCHV_FEATURE_ID:
        return getTarget().getStretchV();
      case StylesModelPackage.STYLE_PROPORTIONAL_FEATURE_ID:
        return getTarget().getProportional();
      case StylesModelPackage.STYLE_STYLECONTAINER_FEATURE_ID:
        return getTarget().getStyleContainer();
      case StylesModelPackage.STYLE_BACKGROUND_FEATURE_ID:
        return getTarget().getBackground();
      case StylesModelPackage.STYLE_FOREGROUND_FEATURE_ID:
        return getTarget().getForeground();
      case StylesModelPackage.STYLE_LINEWIDTH_FEATURE_ID:
        return getTarget().getLineWidth();
      case StylesModelPackage.STYLE_LINESTYLE_FEATURE_ID:
        return getTarget().getLineStyle();
      case StylesModelPackage.STYLE_FILLED_FEATURE_ID:
        return getTarget().getFilled();
      case StylesModelPackage.STYLE_LINEVISIBLE_FEATURE_ID:
        return getTarget().getLineVisible();
      case StylesModelPackage.STYLE_RENDERINGSTYLE_FEATURE_ID:
        return getTarget().getRenderingStyle();
      case StylesModelPackage.STYLE_TRANSPARENCY_FEATURE_ID:
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
      case StylesModelPackage.STYLE_ID_FEATURE_ID:
        getTarget().setId((String) value);
        return;
      case StylesModelPackage.STYLE_DESCRIPTION_FEATURE_ID:
        getTarget().setDescription((String) value);
        return;
      case StylesModelPackage.STYLE_FONT_FEATURE_ID:
        getTarget().setFont((Font) value);
        return;
      case StylesModelPackage.STYLE_HORIZONTALALIGNMENT_FEATURE_ID:
        getTarget().setHorizontalAlignment((Orientation) value);
        return;
      case StylesModelPackage.STYLE_VERTICALALIGNMENT_FEATURE_ID:
        getTarget().setVerticalAlignment((Orientation) value);
        return;
      case StylesModelPackage.STYLE_ANGLE_FEATURE_ID:
        getTarget().setAngle((Integer) value);
        return;
      case StylesModelPackage.STYLE_STRETCHH_FEATURE_ID:
        getTarget().setStretchH((Boolean) value);
        return;
      case StylesModelPackage.STYLE_STRETCHV_FEATURE_ID:
        getTarget().setStretchV((Boolean) value);
        return;
      case StylesModelPackage.STYLE_PROPORTIONAL_FEATURE_ID:
        getTarget().setProportional((Boolean) value);
        return;
      case StylesModelPackage.STYLE_STYLECONTAINER_FEATURE_ID:
        getTarget().setStyleContainer((StyleContainer) value);
        return;
      case StylesModelPackage.STYLE_BACKGROUND_FEATURE_ID:
        getTarget().setBackground((Color) value);
        return;
      case StylesModelPackage.STYLE_FOREGROUND_FEATURE_ID:
        getTarget().setForeground((Color) value);
        return;
      case StylesModelPackage.STYLE_LINEWIDTH_FEATURE_ID:
        getTarget().setLineWidth((Integer) value);
        return;
      case StylesModelPackage.STYLE_LINESTYLE_FEATURE_ID:
        getTarget().setLineStyle((LineStyle) value);
        return;
      case StylesModelPackage.STYLE_FILLED_FEATURE_ID:
        getTarget().setFilled((Boolean) value);
        return;
      case StylesModelPackage.STYLE_LINEVISIBLE_FEATURE_ID:
        getTarget().setLineVisible((Boolean) value);
        return;
      case StylesModelPackage.STYLE_RENDERINGSTYLE_FEATURE_ID:
        getTarget().setRenderingStyle((RenderingStyle) value);
        return;
      case StylesModelPackage.STYLE_TRANSPARENCY_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>AbstractStyle</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AbstractStyleModelObject<E extends AbstractStyle> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StylesModelPackage.INSTANCE.getAbstractStyleEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StylesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.ABSTRACTSTYLE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StylesModelPackage.ABSTRACTSTYLE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StylesModelPackage.ABSTRACTSTYLE_BACKGROUND_FEATURE_ID:
        return getTarget().getBackground();
      case StylesModelPackage.ABSTRACTSTYLE_FOREGROUND_FEATURE_ID:
        return getTarget().getForeground();
      case StylesModelPackage.ABSTRACTSTYLE_LINEWIDTH_FEATURE_ID:
        return getTarget().getLineWidth();
      case StylesModelPackage.ABSTRACTSTYLE_LINESTYLE_FEATURE_ID:
        return getTarget().getLineStyle();
      case StylesModelPackage.ABSTRACTSTYLE_FILLED_FEATURE_ID:
        return getTarget().getFilled();
      case StylesModelPackage.ABSTRACTSTYLE_LINEVISIBLE_FEATURE_ID:
        return getTarget().getLineVisible();
      case StylesModelPackage.ABSTRACTSTYLE_RENDERINGSTYLE_FEATURE_ID:
        return getTarget().getRenderingStyle();
      case StylesModelPackage.ABSTRACTSTYLE_TRANSPARENCY_FEATURE_ID:
        return getTarget().getTransparency();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.ABSTRACTSTYLE_BACKGROUND_FEATURE_ID:
        getTarget().setBackground((Color) value);
        return;
      case StylesModelPackage.ABSTRACTSTYLE_FOREGROUND_FEATURE_ID:
        getTarget().setForeground((Color) value);
        return;
      case StylesModelPackage.ABSTRACTSTYLE_LINEWIDTH_FEATURE_ID:
        getTarget().setLineWidth((Integer) value);
        return;
      case StylesModelPackage.ABSTRACTSTYLE_LINESTYLE_FEATURE_ID:
        getTarget().setLineStyle((LineStyle) value);
        return;
      case StylesModelPackage.ABSTRACTSTYLE_FILLED_FEATURE_ID:
        getTarget().setFilled((Boolean) value);
        return;
      case StylesModelPackage.ABSTRACTSTYLE_LINEVISIBLE_FEATURE_ID:
        getTarget().setLineVisible((Boolean) value);
        return;
      case StylesModelPackage.ABSTRACTSTYLE_RENDERINGSTYLE_FEATURE_ID:
        getTarget().setRenderingStyle((RenderingStyle) value);
        return;
      case StylesModelPackage.ABSTRACTSTYLE_TRANSPARENCY_FEATURE_ID:
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
   * The adapter/wrapper for the EClass '<em><b>Color</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class ColorModelObject<E extends Color> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StylesModelPackage.INSTANCE.getColorEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StylesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.COLOR_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StylesModelPackage.COLOR_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StylesModelPackage.COLOR_RED_FEATURE_ID:
        return getTarget().getRed();
      case StylesModelPackage.COLOR_GREEN_FEATURE_ID:
        return getTarget().getGreen();
      case StylesModelPackage.COLOR_BLUE_FEATURE_ID:
        return getTarget().getBlue();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.COLOR_RED_FEATURE_ID:
        getTarget().setRed((Integer) value);
        return;
      case StylesModelPackage.COLOR_GREEN_FEATURE_ID:
        getTarget().setGreen((Integer) value);
        return;
      case StylesModelPackage.COLOR_BLUE_FEATURE_ID:
        getTarget().setBlue((Integer) value);
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
   * The adapter/wrapper for the EClass '<em><b>Font</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class FontModelObject<E extends Font> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StylesModelPackage.INSTANCE.getFontEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StylesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.FONT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StylesModelPackage.FONT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StylesModelPackage.FONT_NAME_FEATURE_ID:
        return getTarget().getName();
      case StylesModelPackage.FONT_SIZE_FEATURE_ID:
        return getTarget().getSize();
      case StylesModelPackage.FONT_ITALIC_FEATURE_ID:
        return getTarget().isItalic();
      case StylesModelPackage.FONT_BOLD_FEATURE_ID:
        return getTarget().isBold();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.FONT_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case StylesModelPackage.FONT_SIZE_FEATURE_ID:
        getTarget().setSize((Integer) value);
        return;
      case StylesModelPackage.FONT_ITALIC_FEATURE_ID:
        getTarget().setItalic((Boolean) value);
        return;
      case StylesModelPackage.FONT_BOLD_FEATURE_ID:
        getTarget().setBold((Boolean) value);
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
   * The adapter/wrapper for the EClass '<em><b>Point</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PointModelObject<E extends Point> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StylesModelPackage.INSTANCE.getPointEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StylesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.POINT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StylesModelPackage.POINT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StylesModelPackage.POINT_X_FEATURE_ID:
        return getTarget().getX();
      case StylesModelPackage.POINT_Y_FEATURE_ID:
        return getTarget().getY();
      case StylesModelPackage.POINT_BEFORE_FEATURE_ID:
        return getTarget().getBefore();
      case StylesModelPackage.POINT_AFTER_FEATURE_ID:
        return getTarget().getAfter();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.POINT_X_FEATURE_ID:
        getTarget().setX((Integer) value);
        return;
      case StylesModelPackage.POINT_Y_FEATURE_ID:
        getTarget().setY((Integer) value);
        return;
      case StylesModelPackage.POINT_BEFORE_FEATURE_ID:
        getTarget().setBefore((Integer) value);
        return;
      case StylesModelPackage.POINT_AFTER_FEATURE_ID:
        getTarget().setAfter((Integer) value);
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
   * The adapter/wrapper for the EClass '<em><b>PrecisionPoint</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class PrecisionPointModelObject<E extends PrecisionPoint> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StylesModelPackage.INSTANCE.getPrecisionPointEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StylesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.PRECISIONPOINT_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StylesModelPackage.PRECISIONPOINT_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StylesModelPackage.PRECISIONPOINT_X_FEATURE_ID:
        return getTarget().getX();
      case StylesModelPackage.PRECISIONPOINT_Y_FEATURE_ID:
        return getTarget().getY();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.PRECISIONPOINT_X_FEATURE_ID:
        getTarget().setX((Double) value);
        return;
      case StylesModelPackage.PRECISIONPOINT_Y_FEATURE_ID:
        getTarget().setY((Double) value);
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
   * The adapter/wrapper for the EClass '<em><b>TextStyleRegion</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TextStyleRegionModelObject<E extends TextStyleRegion> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StylesModelPackage.INSTANCE.getTextStyleRegionEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StylesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.TEXTSTYLEREGION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StylesModelPackage.TEXTSTYLEREGION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StylesModelPackage.TEXTSTYLEREGION_START_FEATURE_ID:
        return getTarget().getStart();
      case StylesModelPackage.TEXTSTYLEREGION_END_FEATURE_ID:
        return getTarget().getEnd();
      case StylesModelPackage.TEXTSTYLEREGION_STYLE_FEATURE_ID:
        return getTarget().getStyle();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.TEXTSTYLEREGION_START_FEATURE_ID:
        getTarget().setStart((Integer) value);
        return;
      case StylesModelPackage.TEXTSTYLEREGION_END_FEATURE_ID:
        getTarget().setEnd((Integer) value);
        return;
      case StylesModelPackage.TEXTSTYLEREGION_STYLE_FEATURE_ID:
        getTarget().setStyle((TextStyle) value);
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
   * The adapter/wrapper for the EClass '<em><b>RenderingStyle</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class RenderingStyleModelObject<E extends RenderingStyle> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StylesModelPackage.INSTANCE.getRenderingStyleEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StylesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.RENDERINGSTYLE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StylesModelPackage.RENDERINGSTYLE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StylesModelPackage.RENDERINGSTYLE_ADAPTEDGRADIENTCOLOREDAREAS_FEATURE_ID:
        return getTarget().getAdaptedGradientColoredAreas();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.RENDERINGSTYLE_ADAPTEDGRADIENTCOLOREDAREAS_FEATURE_ID:
        getTarget().setAdaptedGradientColoredAreas((AdaptedGradientColoredAreas) value);
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
   * The adapter/wrapper for the EClass '<em><b>AdaptedGradientColoredAreas</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class AdaptedGradientColoredAreasModelObject<E extends AdaptedGradientColoredAreas> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StylesModelPackage.INSTANCE.getAdaptedGradientColoredAreasEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StylesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.ADAPTEDGRADIENTCOLOREDAREAS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StylesModelPackage.ADAPTEDGRADIENTCOLOREDAREAS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StylesModelPackage.ADAPTEDGRADIENTCOLOREDAREAS_DEFINEDSTYLEID_FEATURE_ID:
        return getTarget().getDefinedStyleId();
      case StylesModelPackage.ADAPTEDGRADIENTCOLOREDAREAS_ADAPTEDGRADIENTCOLOREDAREAS_FEATURE_ID:
        return getTarget().getAdaptedGradientColoredAreas();
      case StylesModelPackage.ADAPTEDGRADIENTCOLOREDAREAS_GRADIENTTYPE_FEATURE_ID:
        return getTarget().getGradientType();
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
      case StylesModelPackage.ADAPTEDGRADIENTCOLOREDAREAS_DEFINEDSTYLEID_FEATURE_ID:
        getTarget().setDefinedStyleId((String) value);
        return;
      case StylesModelPackage.ADAPTEDGRADIENTCOLOREDAREAS_ADAPTEDGRADIENTCOLOREDAREAS_FEATURE_ID:
        getTarget().setAdaptedGradientColoredAreas((List<GradientColoredAreas>) value);
        return;
      case StylesModelPackage.ADAPTEDGRADIENTCOLOREDAREAS_GRADIENTTYPE_FEATURE_ID:
        getTarget().setGradientType((Integer) value);
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

      case StylesModelPackage.ADAPTEDGRADIENTCOLOREDAREAS_ADAPTEDGRADIENTCOLOREDAREAS_FEATURE_ID:
        return getTarget().addToAdaptedGradientColoredAreas((GradientColoredAreas) value);

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

      case StylesModelPackage.ADAPTEDGRADIENTCOLOREDAREAS_ADAPTEDGRADIENTCOLOREDAREAS_FEATURE_ID:
        return getTarget().removeFromAdaptedGradientColoredAreas((GradientColoredAreas) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>GradientColoredLocation</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class GradientColoredLocationModelObject<E extends GradientColoredLocation> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StylesModelPackage.INSTANCE.getGradientColoredLocationEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StylesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.GRADIENTCOLOREDLOCATION_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StylesModelPackage.GRADIENTCOLOREDLOCATION_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StylesModelPackage.GRADIENTCOLOREDLOCATION_LOCATIONTYPE_FEATURE_ID:
        return getTarget().getLocationType();
      case StylesModelPackage.GRADIENTCOLOREDLOCATION_LOCATIONVALUE_FEATURE_ID:
        return getTarget().getLocationValue();
      case StylesModelPackage.GRADIENTCOLOREDLOCATION_COLOR_FEATURE_ID:
        return getTarget().getColor();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.GRADIENTCOLOREDLOCATION_LOCATIONTYPE_FEATURE_ID:
        getTarget().setLocationType((LocationType) value);
        return;
      case StylesModelPackage.GRADIENTCOLOREDLOCATION_LOCATIONVALUE_FEATURE_ID:
        getTarget().setLocationValue((Integer) value);
        return;
      case StylesModelPackage.GRADIENTCOLOREDLOCATION_COLOR_FEATURE_ID:
        getTarget().setColor((Color) value);
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
   * The adapter/wrapper for the EClass '<em><b>GradientColoredArea</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class GradientColoredAreaModelObject<E extends GradientColoredArea> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StylesModelPackage.INSTANCE.getGradientColoredAreaEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StylesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.GRADIENTCOLOREDAREA_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StylesModelPackage.GRADIENTCOLOREDAREA_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StylesModelPackage.GRADIENTCOLOREDAREA_START_FEATURE_ID:
        return getTarget().getStart();
      case StylesModelPackage.GRADIENTCOLOREDAREA_END_FEATURE_ID:
        return getTarget().getEnd();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.GRADIENTCOLOREDAREA_START_FEATURE_ID:
        getTarget().setStart((GradientColoredLocation) value);
        return;
      case StylesModelPackage.GRADIENTCOLOREDAREA_END_FEATURE_ID:
        getTarget().setEnd((GradientColoredLocation) value);
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
   * The adapter/wrapper for the EClass '<em><b>GradientColoredAreas</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class GradientColoredAreasModelObject<E extends GradientColoredAreas> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StylesModelPackage.INSTANCE.getGradientColoredAreasEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StylesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.GRADIENTCOLOREDAREAS_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StylesModelPackage.GRADIENTCOLOREDAREAS_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StylesModelPackage.GRADIENTCOLOREDAREAS_GRADIENTCOLOR_FEATURE_ID:
        return getTarget().getGradientColor();
      case StylesModelPackage.GRADIENTCOLOREDAREAS_STYLEADAPTION_FEATURE_ID:
        return getTarget().getStyleAdaption();
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
      case StylesModelPackage.GRADIENTCOLOREDAREAS_GRADIENTCOLOR_FEATURE_ID:
        getTarget().setGradientColor((List<GradientColoredArea>) value);
        return;
      case StylesModelPackage.GRADIENTCOLOREDAREAS_STYLEADAPTION_FEATURE_ID:
        getTarget().setStyleAdaption((Integer) value);
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

      case StylesModelPackage.GRADIENTCOLOREDAREAS_GRADIENTCOLOR_FEATURE_ID:
        return getTarget().addToGradientColor((GradientColoredArea) value);

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

      case StylesModelPackage.GRADIENTCOLOREDAREAS_GRADIENTCOLOR_FEATURE_ID:
        return getTarget().removeFromGradientColor((GradientColoredArea) value);

      default:
        return super.eRemoveFrom(eStructuralFeature, value);
      }
    }
  }

  /**
   * The adapter/wrapper for the EClass '<em><b>TextStyle</b></em>'.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param <E>
   *          the domain model java class
   * 
   * @generated
   */
  public static class TextStyleModelObject<E extends TextStyle> extends
      IdentifiableModelFactory.IdentifiableModelObject<E> {
    /**
     * @generated
     */
    @Override
    public EClass eClass() {
      return StylesModelPackage.INSTANCE.getTextStyleEClass();
    }

    /**
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
      return StylesModelPackage.INSTANCE;
    }

    /**
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.TEXTSTYLE_DB_ID_FEATURE_ID:
        return getTarget().getDb_Id();
      case StylesModelPackage.TEXTSTYLE_DB_VERSION_FEATURE_ID:
        return getTarget().getDb_version();
      case StylesModelPackage.TEXTSTYLE_UNDERLINE_FEATURE_ID:
        return getTarget().isUnderline();
      case StylesModelPackage.TEXTSTYLE_UNDERLINESTYLE_FEATURE_ID:
        return getTarget().getUnderlineStyle();
      case StylesModelPackage.TEXTSTYLE_STRIKEOUT_FEATURE_ID:
        return getTarget().isStrikeout();
      case StylesModelPackage.TEXTSTYLE_FONT_FEATURE_ID:
        return getTarget().getFont();
      case StylesModelPackage.TEXTSTYLE_FOREGROUND_FEATURE_ID:
        return getTarget().getForeground();
      case StylesModelPackage.TEXTSTYLE_BACKGROUND_FEATURE_ID:
        return getTarget().getBackground();
      case StylesModelPackage.TEXTSTYLE_UNDERLINECOLOR_FEATURE_ID:
        return getTarget().getUnderlineColor();
      case StylesModelPackage.TEXTSTYLE_STRIKEOUTCOLOR_FEATURE_ID:
        return getTarget().getStrikeoutColor();
      default:
        return super.eGet(eStructuralFeature);
      }
    }

    /**
     * @generated
     */
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case StylesModelPackage.TEXTSTYLE_UNDERLINE_FEATURE_ID:
        getTarget().setUnderline((Boolean) value);
        return;
      case StylesModelPackage.TEXTSTYLE_UNDERLINESTYLE_FEATURE_ID:
        getTarget().setUnderlineStyle((UnderlineStyle) value);
        return;
      case StylesModelPackage.TEXTSTYLE_STRIKEOUT_FEATURE_ID:
        getTarget().setStrikeout((Boolean) value);
        return;
      case StylesModelPackage.TEXTSTYLE_FONT_FEATURE_ID:
        getTarget().setFont((Font) value);
        return;
      case StylesModelPackage.TEXTSTYLE_FOREGROUND_FEATURE_ID:
        getTarget().setForeground((Color) value);
        return;
      case StylesModelPackage.TEXTSTYLE_BACKGROUND_FEATURE_ID:
        getTarget().setBackground((Color) value);
        return;
      case StylesModelPackage.TEXTSTYLE_UNDERLINECOLOR_FEATURE_ID:
        getTarget().setUnderlineColor((Color) value);
        return;
      case StylesModelPackage.TEXTSTYLE_STRIKEOUTCOLOR_FEATURE_ID:
        getTarget().setStrikeoutColor((Color) value);
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